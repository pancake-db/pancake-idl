#[derive(Clone, PartialEq, ::prost::Message)]
pub struct ColumnMeta {
    #[prost(enumeration = "super::dtype::DataType", tag = "1")]
    pub dtype: i32,
    #[prost(uint32, tag = "2")]
    pub nested_list_depth: u32,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct PartitionMeta {
    #[prost(enumeration = "super::partition_dtype::PartitionDataType", tag = "1")]
    pub dtype: i32,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct Schema {
    #[prost(map = "string, message", tag = "1")]
    pub partitioning: ::std::collections::HashMap<::prost::alloc::string::String, PartitionMeta>,
    #[prost(map = "string, message", tag = "2")]
    pub columns: ::std::collections::HashMap<::prost::alloc::string::String, ColumnMeta>,
}
