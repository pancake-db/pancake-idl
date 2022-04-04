///WRITING
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct PartitionFieldValue {
    #[prost(oneof = "partition_field_value::Value", tags = "2, 3, 4, 5")]
    pub value: ::core::option::Option<partition_field_value::Value>,
}
/// Nested message and enum types in `PartitionFieldValue`.
pub mod partition_field_value {
    #[derive(Clone, PartialEq, ::prost::Oneof)]
    pub enum Value {
        #[prost(string, tag = "2")]
        StringVal(::prost::alloc::string::String),
        #[prost(bool, tag = "3")]
        BoolVal(bool),
        #[prost(int64, tag = "4")]
        Int64Val(i64),
        #[prost(message, tag = "5")]
        TimestampVal(::prost_types::Timestamp),
    }
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct RepeatedFieldValue {
    #[prost(message, repeated, tag = "1")]
    pub vals: ::prost::alloc::vec::Vec<FieldValue>,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct FieldValue {
    #[prost(oneof = "field_value::Value", tags = "1, 2, 3, 4, 5, 6, 7, 8")]
    pub value: ::core::option::Option<field_value::Value>,
}
/// Nested message and enum types in `FieldValue`.
pub mod field_value {
    #[derive(Clone, PartialEq, ::prost::Oneof)]
    pub enum Value {
        #[prost(message, tag = "1")]
        ListVal(super::RepeatedFieldValue),
        #[prost(string, tag = "2")]
        StringVal(::prost::alloc::string::String),
        #[prost(bool, tag = "3")]
        BoolVal(bool),
        #[prost(bytes, tag = "4")]
        BytesVal(::prost::alloc::vec::Vec<u8>),
        #[prost(int64, tag = "5")]
        Int64Val(i64),
        #[prost(float, tag = "6")]
        Float32Val(f32),
        #[prost(double, tag = "7")]
        Float64Val(f64),
        #[prost(message, tag = "8")]
        TimestampVal(::prost_types::Timestamp),
    }
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct Row {
    #[prost(map = "string, message", tag = "1")]
    pub fields: ::std::collections::HashMap<::prost::alloc::string::String, FieldValue>,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct WriteToPartitionRequest {
    #[prost(string, tag = "1")]
    pub table_name: ::prost::alloc::string::String,
    #[prost(map = "string, message", tag = "2")]
    pub partition: ::std::collections::HashMap<::prost::alloc::string::String, PartitionFieldValue>,
    #[prost(message, repeated, tag = "3")]
    pub rows: ::prost::alloc::vec::Vec<Row>,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct WriteToPartitionResponse {}
///LISTING SEGMENTS
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct PartitionFieldComparison {
    #[prost(string, tag = "1")]
    pub name: ::prost::alloc::string::String,
    #[prost(enumeration = "partition_field_comparison::Operator", tag = "2")]
    pub operator: i32,
    #[prost(message, optional, tag = "3")]
    pub value: ::core::option::Option<PartitionFieldValue>,
}
/// Nested message and enum types in `PartitionFieldComparison`.
pub mod partition_field_comparison {
    #[derive(Clone, Copy, Debug, PartialEq, Eq, Hash, PartialOrd, Ord, ::prost::Enumeration)]
    #[repr(i32)]
    pub enum Operator {
        EqTo = 0,
        LessOrEqTo = 1,
        Less = 2,
        GreaterOrEqTo = 3,
        Greater = 4,
    }
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct PartitionFilter {
    #[prost(oneof = "partition_filter::Value", tags = "1")]
    pub value: ::core::option::Option<partition_filter::Value>,
}
/// Nested message and enum types in `PartitionFilter`.
pub mod partition_filter {
    #[derive(Clone, PartialEq, ::prost::Oneof)]
    pub enum Value {
        #[prost(message, tag = "1")]
        Comparison(super::PartitionFieldComparison),
    }
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct ListSegmentsRequest {
    #[prost(string, tag = "1")]
    pub table_name: ::prost::alloc::string::String,
    #[prost(message, repeated, tag = "2")]
    pub partition_filter: ::prost::alloc::vec::Vec<PartitionFilter>,
    #[prost(bool, tag = "3")]
    pub include_metadata: bool,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct SegmentMetadata {
    #[prost(uint32, tag = "1")]
    pub row_count: u32,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct Segment {
    #[prost(map = "string, message", tag = "1")]
    pub partition: ::std::collections::HashMap<::prost::alloc::string::String, PartitionFieldValue>,
    #[prost(string, tag = "2")]
    pub segment_id: ::prost::alloc::string::String,
    #[prost(message, optional, tag = "3")]
    pub metadata: ::core::option::Option<SegmentMetadata>,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct ListSegmentsResponse {
    #[prost(message, repeated, tag = "1")]
    pub segments: ::prost::alloc::vec::Vec<Segment>,
}
///READING SEGMENT COLUMNS
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct ReadSegmentColumnRequest {
    #[prost(string, tag = "1")]
    pub table_name: ::prost::alloc::string::String,
    #[prost(map = "string, message", tag = "2")]
    pub partition: ::std::collections::HashMap<::prost::alloc::string::String, PartitionFieldValue>,
    #[prost(string, tag = "3")]
    pub segment_id: ::prost::alloc::string::String,
    #[prost(string, tag = "4")]
    pub column_name: ::prost::alloc::string::String,
    #[prost(string, tag = "5")]
    pub correlation_id: ::prost::alloc::string::String,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct ReadSegmentColumnResponse {
    #[prost(string, tag = "1")]
    pub codec: ::prost::alloc::string::String,
    #[prost(bytes = "vec", tag = "2")]
    pub data: ::prost::alloc::vec::Vec<u8>,
    #[prost(uint32, tag = "3")]
    pub row_count: u32,
    #[prost(uint32, tag = "4")]
    pub deletion_count: u32,
    #[prost(uint32, tag = "5")]
    pub implicit_nulls_count: u32,
}
///READING DELETIONS
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct ReadSegmentDeletionsRequest {
    #[prost(string, tag = "1")]
    pub table_name: ::prost::alloc::string::String,
    #[prost(map = "string, message", tag = "2")]
    pub partition: ::std::collections::HashMap<::prost::alloc::string::String, PartitionFieldValue>,
    #[prost(string, tag = "3")]
    pub segment_id: ::prost::alloc::string::String,
    #[prost(string, tag = "4")]
    pub correlation_id: ::prost::alloc::string::String,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct ReadSegmentDeletionsResponse {
    #[prost(bytes = "vec", tag = "1")]
    pub data: ::prost::alloc::vec::Vec<u8>,
}
///DELETING
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct DeleteFromSegmentRequest {
    #[prost(string, tag = "1")]
    pub table_name: ::prost::alloc::string::String,
    #[prost(map = "string, message", tag = "2")]
    pub partition: ::std::collections::HashMap<::prost::alloc::string::String, PartitionFieldValue>,
    #[prost(string, tag = "3")]
    pub segment_id: ::prost::alloc::string::String,
    #[prost(uint32, repeated, tag = "4")]
    pub row_ids: ::prost::alloc::vec::Vec<u32>,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct DeleteFromSegmentResponse {
    #[prost(uint32, tag = "1")]
    pub n_deleted: u32,
}
