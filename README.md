[![Crates.io][crates-badge]][crates-url]
[![Maven Central][maven-badge]][maven-url]

[crates-badge]: https://img.shields.io/crates/v/pancake-db-idl.svg
[crates-url]: https://crates.io/crates/pancake-db-idl
[maven-badge]: https://maven-badges.herokuapp.com/maven-central/com.pancakedb/idl/badge.svg?gav=true
[maven-url]: https://search.maven.org/artifact/com.pancakedb/idl

# Using the PancakeDB API

A typical PancakeDB use case involves
* human-driven management of PancakeDB tables with `create_table`
* writing incoming events or processed data as streams
(up to 256 rows at a time) to PancakeDB with `write_to_partition`.
* reading millions (or more) rows at a time, often in a distributed manner,
from PancakeDB for batch processing (e.g. Spark or Hive),
training machine learning models, or exporting to data warehouses. This
involves calling
`list_segments` and then `read_segment_column` for each listed segment and
desired column.

Importantly, PancakeDB expects to receive **many small writes per second**
that it will respond to with reliably fast response times, and it
expects to receive a **few giant reads per second** that it will respond to
with high throughput.

<div align="center">
<img src="./res/data_architecture_before.svg" height="200px">
<img src="./res/data_architecture_after.svg" height="200px">
</div>

# HTTP+JSON API specification

PancakeDB's API is defined by the [.proto files in this repository](./protos).
For now, only HTTP+JSON is supported for communication with the server,
but HTTP2+protobuf support may be coming soon.

Example curl:

```
curl \
  -XGET \
  -H "Content-Type: application/json" \
  $IP:$PORT/rest/list_segments \
  -d '{"tableName": "'$TABLE_NAME'"}'
```

## List Tables

`GET /rest/list_tables`

request body format:
```
{}
```

response body format:
```
{
  "tables": [
    {"tableName": "..."},
    ...
  ]
}
```

This lists all tables.

## Create Table

`POST /rest/create_table`

request body format:
```
{
  "tableName": "...",
  "schema": {
    "partitioning": {
      "...": {
        "dtype": "STRING" | "INT64" | "BOOL" | "TIMESTAMP_MINUTE"
      },
      ...
    },
    "columns": {
      "...": {
        "dtype": "STRING" | "INT64" | "BOOL" | "BYTES" | "FLOAT32" | "FLOAT64" | "TIMESTAMP_MICROS",
        "nestedListDepth": int
      },
      ...
    }
  },
  "mode": "FAIL_IF_EXISTS" | "OK_IF_EXACT" | "ADD_NEW_COLUMNS"
}
```

response body format:
```
{
  "already_exists": bool,
  "columns_added": ["...", ...]
}
```

The keys in the partitioning and columns objects are column names.

This will ensure a table exists following the behavior requested by
`mode`:
* `FAIL_IF_EXISTS` works like most other databases' create table commands,
returning an error if the table already exists.
* `OK_IF_EXACT` will not give an error if the table already exists, as long as
its schema is identical.
* `ADD_NEW_COLUMNS` will not give an error if the table already exists, as long
as the existing columns are a subset of the requested ones. Any new columns in
the request will be added to the table.
This is a declarative way to create a table.

In a successful response, `already_exists` indicates whether the table already
existed prior to the request, and `columns_added` is a list of the column names
that were added by the request.

Your schema is important.
Partitioning is the only way to allow filtering your data.
For example, you may wish to partition by a timestamp truncated to the last hour
so that your users can quickly select all rows
falling into a time range.
You may partition by multiple fields, but keep in mind that each partition
should ultimately be large (>100k rows) to be efficient.

Previous data architectures typically required partitioning by a timestamp
at hourly or daily granularity to fit with the compaction schedule and make
sure each partition has a moderate amount of data.
With PancakeDB, table design is liberated from those restrictions, and the
developer can choose partitioning to match their filter query pattern instead.

There is a limit of 255 columns per table.
If you find yourself needing more than that, it's probably
time to rethink your data model.

## Alter Table

request body format:
```
{
  "tableName": "...",
  "newColumns": {
    "...": {
      "dtype": "STRING" | "INT64" | "BOOL" | "BYTES" | "FLOAT32" | "FLOAT64" | "TIMESTAMP_MICROS",
      "nestedListDepth": int
    },
    ...
  }
}
```

response body format:
```
{}
```

This will modify the schema by adding new columns.
It will fail if any of the columns already exist.

## Drop Table

`POST /rest/drop_table`

request body format:
```
{
  "tableName": "..."
}
```

response body format:
```
{}
```

Caution - dropping a table is not reversible.
It actually deletes your data on disk.

At the moment, alter table or adding columns have not yet been implemented,
so schema changes need to be done by creating a new table,
copying the data over, and dropping the old one.

## Get Schema

`GET /rest/get_schema`

request body format:
```
{
  "tableName": "..."
}
```

request response format:
```
{
  "schema": {
    "partitioning": {
      "...": {
        "dtype": "STRING" | "INT64" | "BOOL" | "TIMESTAMP_MINUTE"
      },
      ...
    },
    "columns": {
      "...": {
        "dtype": "STRING" | "INT64" | "BOOL" | "BYTES" | "FLOAT32" | "FLOAT64" | "TIMESTAMP_MICROS",
        "nestedListDepth": int
      },
      ...
    }
  },
}
```

## Write to Partition

`POST /rest/write_to_partition`

request body format:
```
{
  "tableName": "...",
  "partition": {
    "...": {
      "string_val": "..." | "int64_val": int | "bool_val": bool | "timestamp_val": "1970-01-01T00:00:00.000Z"
    },
    ...
  },
  "rows": [
    {
      "fields": {
        "...": {
          "value": {
            "listVal": {"vals": [...]} | "stringVal": "..." | "int64Val": int | "boolVal": bool | "bytes_val": [...] | "float64Val": float | "timestampVal": "1970-01-01T00:00:00.000Z"
          }
        },
        ...
      }
    },
    ...
  ]
}
```

response body format:
```
{}
```

Each write to partition request may contain up to 256 rows.
If you need to write to multiple partitions at once, you must send multiple
requests.

For most use cases, `write_to_partition_simple` is recommended instead due to
its simpler JSON request.

## Write to Partition, Simplified

`POST /rest/write_to_partition_simple`

request body format:
```
{
  "tableName": "...",
  "partition": {
    "...": <value>,
    ...
  },
  "rows": [
    {
      "...": <value>,
    },
    ...
  ]
}
```

response body format:
```
{}
```

With this route, natural JSON encoding is used.
For example, a valid row would be
```
{
  "my_int_col": 33,
  "my_nested_string_col": ["foo", "bar"],
  "my_timestamp_col": {"timestamp": "2022-01-01T00:00:00Z"}
}
```

## Delete From Segment

`POST /rest/delete_from_segment`

request body format
```
{
  "tableName": "...",
  "partition": {
    "...": {
      "stringVal": "..." | "int64Val": int | "boolVal": bool | "timestampVal": "1970-01-01T00:00:00.000Z"
    },
    ...
  ],
  "segmentId": "...",
  "rowIds": [int, ...]
}
```

response body format
```
{
  "nDeleted": int
}
```

This deletes rows from a segment, using row id.
You can determine which row ids you want to delete
by scanning the built-in `_row_id` column when you read
a segment.

Deleted rows will not immediately be removed from disk.
They will persist until the segment is next compacted, which could be up to a
day.
It is necessary to call `read_segment_deletions` whenever reading a segment
in order to get an accurate view of the data.

## List Segments

`GET /rest/list_segments`

request body format:
```
{
  "tableName": "...",
  "partitionFilter": [
    {
      "value: {
        "comparison": {
          "name": "...",
          "operator": "EQ_TO" | "LESS" | "LESS_OR_EQ_TO" | "GREATER" | "GREATER_OR_EQ_TO",
          "value": {
            "stringVal": "..." | "int64Val": int | "boolVal": bool | "timestampVal": "1970-01-01T00:00:00.000Z"
          }
        }
      }
    }
  ],
  "includeMetadata": bool
}
```

response body format:
```
{
  "segments": [
    {
      "partition": {
        "...": {
          "stringVal": "..." | "int64Val": int | "boolVal": bool | "timestampVal": "1970-01-01T00:00:00.000Z"
        },
        ...
      ],
      "segmentId": "...",
      (if includeMetadata) "metadata": {
        "rowCount": int
      }
    }
  ]
}
```

This lists all segments (large groups of rows
rows) in the table, matching all the partition filters specified.
Additional metadata about each segment will only be returned if requested,
because retrieving the metadata is a bit slower.

Right now this returns all matching segments at once.
In the future, it will likely:
* use a continuation token in case there is a very large number of segments
* allow passing in parameters for distributed listing

## Read Segment Column

`GET /rest/read_segment_column`

request body format
```
{
  "tableName": "...",
  "partition": {
    "...": {
      "stringVal": "..." | "int64Val": int | "boolVal": bool | "timestampVal": "1970-01-01T00:00:00.000Z"
    },
    ...
  ],
  "segmentId": "...",
  "columnName": "...",
  "correlationId": "...",
  "continuationToken: "..."
}
```

response body format
```
{
  "codec": "...",
  "rowCount": int,
  "implicitNullsCount: int,
  "continuationToken": "..."
}
<newline character>
<byte data>
```

If `codec` is included in the response, it means the byte data
following the JSON blob is compressed; otherwise it is uncompressed.
The data can be decoded with the
[PancakeDB core library](https://github.com/pancake-db/pancake-core/tree/main/core).

Either a correlation ID (for the first request for the segment column) or a
continuation token (for each following request) is required.
You should use the same correlation ID you are using for the segment's deletions
(see below) and other columns.

If a non-empty `continuationToken` is returned, you must make another request
with that continuation token (and so forth) until you have collected all the
compressed and uncompressed data for the segment column.

This API route is hard to use directly, so each client library
also implements some sort of "decode" functionality,
leveraging the core library, to obtain deserialized
rows.

## Read Segment Deletions

`GET /rest/read_segment_deletions`

request body format
```
{
  "tableName": "...",
  "partition": {
    "...": {
      "stringVal": "..." | "int64Val": int | "boolVal": bool | "timestampVal": "1970-01-01T00:00:00.000Z"
    },
    ...
  ],
  "segmentId": "...",
  "correlationId": "..."
}
```

response body format

```
{}
<newline character>
<byte data>
```

This returns compressed data for a list of booleans representing
`is_deleted`.
You must use the same correlation ID you are using for reading
the segment's columns.

This route is also hard to use directly, so it is better to use
a client library's "decode" functionality.

If you read a segment's columns without its deletions, you 
will have an incorrect view of the data if any recent deletions
have happened.
The deletion data is very lightweight, so this step should not be skipped.
