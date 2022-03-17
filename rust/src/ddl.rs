#[derive(Clone, PartialEq, ::prost::Message)]
pub struct CreateTableRequest {
    #[prost(string, tag = "1")]
    pub table_name: ::prost::alloc::string::String,
    #[prost(message, optional, tag = "2")]
    pub schema: ::core::option::Option<super::schema::Schema>,
    #[prost(enumeration = "create_table_request::SchemaMode", tag = "3")]
    pub mode: i32,
}
/// Nested message and enum types in `CreateTableRequest`.
pub mod create_table_request {
    #[derive(Clone, Copy, Debug, PartialEq, Eq, Hash, PartialOrd, Ord, ::prost::Enumeration)]
    #[repr(i32)]
    pub enum SchemaMode {
        FailIfExists = 0,
        OkIfExact = 1,
        AddNewColumns = 2,
    }
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct CreateTableResponse {
    #[prost(bool, tag = "1")]
    pub already_exists: bool,
    #[prost(string, repeated, tag = "2")]
    pub columns_added: ::prost::alloc::vec::Vec<::prost::alloc::string::String>,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct AlterTableRequest {
    #[prost(string, tag = "1")]
    pub table_name: ::prost::alloc::string::String,
    #[prost(map = "string, message", tag = "2")]
    pub new_columns:
        ::std::collections::HashMap<::prost::alloc::string::String, super::schema::ColumnMeta>,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct AlterTableResponse {}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct DropTableRequest {
    #[prost(string, tag = "1")]
    pub table_name: ::prost::alloc::string::String,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct DropTableResponse {}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct GetSchemaRequest {
    #[prost(string, tag = "1")]
    pub table_name: ::prost::alloc::string::String,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct GetSchemaResponse {
    #[prost(message, optional, tag = "1")]
    pub schema: ::core::option::Option<super::schema::Schema>,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct TableInfo {
    #[prost(string, tag = "1")]
    pub table_name: ::prost::alloc::string::String,
}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct ListTablesRequest {}
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct ListTablesResponse {
    #[prost(message, repeated, tag = "1")]
    pub tables: ::prost::alloc::vec::Vec<TableInfo>,
}
