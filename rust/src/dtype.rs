#[derive(Clone, Copy, Debug, PartialEq, Eq, Hash, PartialOrd, Ord, ::prost::Enumeration)]
#[repr(i32)]
pub enum DataType {
    String = 0,
    Bool = 1,
    Bytes = 2,
    Int64 = 3,
    Float32 = 4,
    Float64 = 5,
    TimestampMicros = 6,
}
