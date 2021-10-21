// This file is generated by rust-protobuf 3.0.0-pre. Do not edit
// .proto file is parsed by protoc 3.17.3
// @generated

// https://github.com/rust-lang/rust-clippy/issues/702
#![allow(unknown_lints)]
#![allow(clippy::all)]

#![allow(unused_attributes)]
#![cfg_attr(rustfmt, rustfmt::skip)]

#![allow(box_pointers)]
#![allow(dead_code)]
#![allow(missing_docs)]
#![allow(non_camel_case_types)]
#![allow(non_snake_case)]
#![allow(non_upper_case_globals)]
#![allow(trivial_casts)]
#![allow(unused_results)]
#![allow(unused_mut)]

//! Generated file from `dtype.proto`

/// Generated files are compatible only with the same version
/// of protobuf runtime.
const _PROTOBUF_VERSION_CHECK: () = ::protobuf::VERSION_3_0_0_PRE;

#[derive(Clone,Copy,PartialEq,Eq,Debug,Hash)]
pub enum DataType {
    STRING = 0,
    INT64 = 1,
    BOOL = 2,
    BYTES = 3,
    FLOAT64 = 4,
    TIMESTAMP_MICROS = 5,
}

impl ::protobuf::ProtobufEnum for DataType {
    fn value(&self) -> i32 {
        *self as i32
    }

    fn from_i32(value: i32) -> ::std::option::Option<DataType> {
        match value {
            0 => ::std::option::Option::Some(DataType::STRING),
            1 => ::std::option::Option::Some(DataType::INT64),
            2 => ::std::option::Option::Some(DataType::BOOL),
            3 => ::std::option::Option::Some(DataType::BYTES),
            4 => ::std::option::Option::Some(DataType::FLOAT64),
            5 => ::std::option::Option::Some(DataType::TIMESTAMP_MICROS),
            _ => ::std::option::Option::None
        }
    }

    fn values() -> &'static [Self] {
        static values: &'static [DataType] = &[
            DataType::STRING,
            DataType::INT64,
            DataType::BOOL,
            DataType::BYTES,
            DataType::FLOAT64,
            DataType::TIMESTAMP_MICROS,
        ];
        values
    }

    fn enum_descriptor_static() -> ::protobuf::reflect::EnumDescriptor {
        ::protobuf::reflect::EnumDescriptor::new_generated_2(file_descriptor(), 0)
    }
}

impl ::std::default::Default for DataType {
    fn default() -> Self {
        DataType::STRING
    }
}

impl ::protobuf::reflect::ProtobufValue for DataType {
    type RuntimeType = ::protobuf::reflect::runtime_types::RuntimeTypeEnum<Self>;
}

impl DataType {
    fn generated_enum_descriptor_data() -> ::protobuf::reflect::GeneratedEnumDescriptorData {
        ::protobuf::reflect::GeneratedEnumDescriptorData::new_2::<DataType>("DataType", 0)
    }
}

static file_descriptor_proto_data: &'static [u8] = b"\
    \n\x0bdtype.proto\x12\x0cprotos.dtype*Y\n\x08DataType\x12\n\n\x06STRING\
    \x10\0\x12\t\n\x05INT64\x10\x01\x12\x08\n\x04BOOL\x10\x02\x12\t\n\x05BYT\
    ES\x10\x03\x12\x0b\n\x07FLOAT64\x10\x04\x12\x14\n\x10TIMESTAMP_MICROS\
    \x10\x05B\x15\n\x11com.pancakedb.idlP\x01b\x06proto3\
";

/// `FileDescriptorProto` object which was a source for this generated file
pub fn file_descriptor_proto() -> &'static ::protobuf::descriptor::FileDescriptorProto {
    static file_descriptor_proto_lazy: ::protobuf::rt::LazyV2<::protobuf::descriptor::FileDescriptorProto> = ::protobuf::rt::LazyV2::INIT;
    file_descriptor_proto_lazy.get(|| {
        ::protobuf::Message::parse_from_bytes(file_descriptor_proto_data).unwrap()
    })
}

/// `FileDescriptor` object which allows dynamic access to files
pub fn file_descriptor() -> ::protobuf::reflect::FileDescriptor {
    static file_descriptor_lazy: ::protobuf::rt::LazyV2<::protobuf::reflect::GeneratedFileDescriptor> = ::protobuf::rt::LazyV2::INIT;
    let file_descriptor = file_descriptor_lazy.get(|| {
        let mut deps = ::std::vec::Vec::new();
        let mut messages = ::std::vec::Vec::new();
        let mut enums = ::std::vec::Vec::new();
        enums.push(DataType::generated_enum_descriptor_data());
        ::protobuf::reflect::GeneratedFileDescriptor::new_generated(
            file_descriptor_proto(),
            deps,
            messages,
            enums,
        )
    });
    ::protobuf::reflect::FileDescriptor::new_generated_2(file_descriptor)
}
