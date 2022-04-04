#[derive(Clone, Copy, Debug, PartialEq, Eq, Hash, PartialOrd, Ord, ::prost::Enumeration)]
#[repr(i32)]
pub enum PartitionDataType {
    String = 0,
    Bool = 1,
    Int64 = 2,
    TimestampMinute = 3,
}
