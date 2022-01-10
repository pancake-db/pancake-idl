// This file is generated by rust-protobuf 3.0.0-alpha.2. Do not edit
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

//! Generated file from `schema.proto`

/// Generated files are compatible only with the same version
/// of protobuf runtime.
const _PROTOBUF_VERSION_CHECK: () = ::protobuf::VERSION_3_0_0_ALPHA_2;

#[derive(PartialEq,Clone,Default)]
pub struct ColumnMeta {
    // message fields
    pub dtype: ::protobuf::ProtobufEnumOrUnknown<super::dtype::DataType>,
    pub nested_list_depth: u32,
    // special fields
    pub unknown_fields: ::protobuf::UnknownFields,
    pub cached_size: ::protobuf::rt::CachedSize,
}

impl<'a> ::std::default::Default for &'a ColumnMeta {
    fn default() -> &'a ColumnMeta {
        <ColumnMeta as ::protobuf::Message>::default_instance()
    }
}

impl ColumnMeta {
    pub fn new() -> ColumnMeta {
        ::std::default::Default::default()
    }

    fn generated_message_descriptor_data() -> ::protobuf::reflect::GeneratedMessageDescriptorData {
        let mut fields = ::std::vec::Vec::new();
        fields.push(::protobuf::reflect::rt::v2::make_simpler_field_accessor::<_, _>(
            "dtype",
            |m: &ColumnMeta| { &m.dtype },
            |m: &mut ColumnMeta| { &mut m.dtype },
        ));
        fields.push(::protobuf::reflect::rt::v2::make_simpler_field_accessor::<_, _>(
            "nested_list_depth",
            |m: &ColumnMeta| { &m.nested_list_depth },
            |m: &mut ColumnMeta| { &mut m.nested_list_depth },
        ));
        ::protobuf::reflect::GeneratedMessageDescriptorData::new_2::<ColumnMeta>(
            "ColumnMeta",
            0,
            fields,
        )
    }
}

impl ::protobuf::Message for ColumnMeta {
    fn is_initialized(&self) -> bool {
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    if wire_type != ::protobuf::wire_format::WireTypeVarint {
                        return ::std::result::Result::Err(::protobuf::rt::unexpected_wire_type(wire_type));
                    }
                    self.dtype = is.read_enum_or_unknown()?;
                },
                2 => {
                    if wire_type != ::protobuf::wire_format::WireTypeVarint {
                        return ::std::result::Result::Err(::protobuf::rt::unexpected_wire_type(wire_type));
                    }
                    self.nested_list_depth = is.read_uint32()?;
                },
                _ => {
                    ::protobuf::rt::read_unknown_or_skip_group(field_number, wire_type, is, self.mut_unknown_fields())?;
                },
            };
        }
        ::std::result::Result::Ok(())
    }

    // Compute sizes of nested messages
    #[allow(unused_variables)]
    fn compute_size(&self) -> u32 {
        let mut my_size = 0;
        if self.dtype != ::protobuf::ProtobufEnumOrUnknown::new(super::dtype::DataType::STRING) {
            my_size += ::protobuf::rt::enum_or_unknown_size(1, self.dtype);
        }
        if self.nested_list_depth != 0 {
            my_size += ::protobuf::rt::value_size(2, self.nested_list_depth, ::protobuf::wire_format::WireTypeVarint);
        }
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        if self.dtype != ::protobuf::ProtobufEnumOrUnknown::new(super::dtype::DataType::STRING) {
            os.write_enum(1, ::protobuf::ProtobufEnumOrUnknown::value(&self.dtype))?;
        }
        if self.nested_list_depth != 0 {
            os.write_uint32(2, self.nested_list_depth)?;
        }
        os.write_unknown_fields(self.get_unknown_fields())?;
        ::std::result::Result::Ok(())
    }

    fn get_cached_size(&self) -> u32 {
        self.cached_size.get()
    }

    fn get_unknown_fields(&self) -> &::protobuf::UnknownFields {
        &self.unknown_fields
    }

    fn mut_unknown_fields(&mut self) -> &mut ::protobuf::UnknownFields {
        &mut self.unknown_fields
    }

    fn new() -> ColumnMeta {
        ColumnMeta::new()
    }

    fn descriptor_static() -> ::protobuf::reflect::MessageDescriptor {
        ::protobuf::reflect::MessageDescriptor::new_generated_2(file_descriptor(), 0)
    }

    fn default_instance() -> &'static ColumnMeta {
        static instance: ColumnMeta = ColumnMeta {
            dtype: ::protobuf::ProtobufEnumOrUnknown::from_i32(0),
            nested_list_depth: 0,
            unknown_fields: ::protobuf::UnknownFields::new(),
            cached_size: ::protobuf::rt::CachedSize::new(),
        };
        &instance
    }
}

impl ::protobuf::Clear for ColumnMeta {
    fn clear(&mut self) {
        self.dtype = ::protobuf::ProtobufEnumOrUnknown::new(super::dtype::DataType::STRING);
        self.nested_list_depth = 0;
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for ColumnMeta {
    fn fmt(&self, f: &mut ::std::fmt::Formatter<'_>) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for ColumnMeta {
    type RuntimeType = ::protobuf::reflect::runtime_types::RuntimeTypeMessage<Self>;
}

#[derive(PartialEq,Clone,Default)]
pub struct PartitionMeta {
    // message fields
    pub dtype: ::protobuf::ProtobufEnumOrUnknown<super::partition_dtype::PartitionDataType>,
    // special fields
    pub unknown_fields: ::protobuf::UnknownFields,
    pub cached_size: ::protobuf::rt::CachedSize,
}

impl<'a> ::std::default::Default for &'a PartitionMeta {
    fn default() -> &'a PartitionMeta {
        <PartitionMeta as ::protobuf::Message>::default_instance()
    }
}

impl PartitionMeta {
    pub fn new() -> PartitionMeta {
        ::std::default::Default::default()
    }

    fn generated_message_descriptor_data() -> ::protobuf::reflect::GeneratedMessageDescriptorData {
        let mut fields = ::std::vec::Vec::new();
        fields.push(::protobuf::reflect::rt::v2::make_simpler_field_accessor::<_, _>(
            "dtype",
            |m: &PartitionMeta| { &m.dtype },
            |m: &mut PartitionMeta| { &mut m.dtype },
        ));
        ::protobuf::reflect::GeneratedMessageDescriptorData::new_2::<PartitionMeta>(
            "PartitionMeta",
            1,
            fields,
        )
    }
}

impl ::protobuf::Message for PartitionMeta {
    fn is_initialized(&self) -> bool {
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    if wire_type != ::protobuf::wire_format::WireTypeVarint {
                        return ::std::result::Result::Err(::protobuf::rt::unexpected_wire_type(wire_type));
                    }
                    self.dtype = is.read_enum_or_unknown()?;
                },
                _ => {
                    ::protobuf::rt::read_unknown_or_skip_group(field_number, wire_type, is, self.mut_unknown_fields())?;
                },
            };
        }
        ::std::result::Result::Ok(())
    }

    // Compute sizes of nested messages
    #[allow(unused_variables)]
    fn compute_size(&self) -> u32 {
        let mut my_size = 0;
        if self.dtype != ::protobuf::ProtobufEnumOrUnknown::new(super::partition_dtype::PartitionDataType::STRING) {
            my_size += ::protobuf::rt::enum_or_unknown_size(1, self.dtype);
        }
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        if self.dtype != ::protobuf::ProtobufEnumOrUnknown::new(super::partition_dtype::PartitionDataType::STRING) {
            os.write_enum(1, ::protobuf::ProtobufEnumOrUnknown::value(&self.dtype))?;
        }
        os.write_unknown_fields(self.get_unknown_fields())?;
        ::std::result::Result::Ok(())
    }

    fn get_cached_size(&self) -> u32 {
        self.cached_size.get()
    }

    fn get_unknown_fields(&self) -> &::protobuf::UnknownFields {
        &self.unknown_fields
    }

    fn mut_unknown_fields(&mut self) -> &mut ::protobuf::UnknownFields {
        &mut self.unknown_fields
    }

    fn new() -> PartitionMeta {
        PartitionMeta::new()
    }

    fn descriptor_static() -> ::protobuf::reflect::MessageDescriptor {
        ::protobuf::reflect::MessageDescriptor::new_generated_2(file_descriptor(), 1)
    }

    fn default_instance() -> &'static PartitionMeta {
        static instance: PartitionMeta = PartitionMeta {
            dtype: ::protobuf::ProtobufEnumOrUnknown::from_i32(0),
            unknown_fields: ::protobuf::UnknownFields::new(),
            cached_size: ::protobuf::rt::CachedSize::new(),
        };
        &instance
    }
}

impl ::protobuf::Clear for PartitionMeta {
    fn clear(&mut self) {
        self.dtype = ::protobuf::ProtobufEnumOrUnknown::new(super::partition_dtype::PartitionDataType::STRING);
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for PartitionMeta {
    fn fmt(&self, f: &mut ::std::fmt::Formatter<'_>) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for PartitionMeta {
    type RuntimeType = ::protobuf::reflect::runtime_types::RuntimeTypeMessage<Self>;
}

#[derive(PartialEq,Clone,Default)]
pub struct Schema {
    // message fields
    pub partitioning: ::std::collections::HashMap<::std::string::String, PartitionMeta>,
    pub columns: ::std::collections::HashMap<::std::string::String, ColumnMeta>,
    // special fields
    pub unknown_fields: ::protobuf::UnknownFields,
    pub cached_size: ::protobuf::rt::CachedSize,
}

impl<'a> ::std::default::Default for &'a Schema {
    fn default() -> &'a Schema {
        <Schema as ::protobuf::Message>::default_instance()
    }
}

impl Schema {
    pub fn new() -> Schema {
        ::std::default::Default::default()
    }

    fn generated_message_descriptor_data() -> ::protobuf::reflect::GeneratedMessageDescriptorData {
        let mut fields = ::std::vec::Vec::new();
        fields.push(::protobuf::reflect::rt::v2::make_map_simpler_accessor::<_, _, _>(
            "partitioning",
            |m: &Schema| { &m.partitioning },
            |m: &mut Schema| { &mut m.partitioning },
        ));
        fields.push(::protobuf::reflect::rt::v2::make_map_simpler_accessor::<_, _, _>(
            "columns",
            |m: &Schema| { &m.columns },
            |m: &mut Schema| { &mut m.columns },
        ));
        ::protobuf::reflect::GeneratedMessageDescriptorData::new_2::<Schema>(
            "Schema",
            2,
            fields,
        )
    }
}

impl ::protobuf::Message for Schema {
    fn is_initialized(&self) -> bool {
        true
    }

    fn merge_from(&mut self, is: &mut ::protobuf::CodedInputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        while !is.eof()? {
            let (field_number, wire_type) = is.read_tag_unpack()?;
            match field_number {
                1 => {
                    ::protobuf::rt::read_map_into::<::protobuf::reflect::types::ProtobufTypeString, ::protobuf::reflect::types::ProtobufTypeMessage<PartitionMeta>>(wire_type, is, &mut self.partitioning)?;
                },
                2 => {
                    ::protobuf::rt::read_map_into::<::protobuf::reflect::types::ProtobufTypeString, ::protobuf::reflect::types::ProtobufTypeMessage<ColumnMeta>>(wire_type, is, &mut self.columns)?;
                },
                _ => {
                    ::protobuf::rt::read_unknown_or_skip_group(field_number, wire_type, is, self.mut_unknown_fields())?;
                },
            };
        }
        ::std::result::Result::Ok(())
    }

    // Compute sizes of nested messages
    #[allow(unused_variables)]
    fn compute_size(&self) -> u32 {
        let mut my_size = 0;
        my_size += ::protobuf::rt::compute_map_size::<::protobuf::reflect::types::ProtobufTypeString, ::protobuf::reflect::types::ProtobufTypeMessage<PartitionMeta>>(1, &self.partitioning);
        my_size += ::protobuf::rt::compute_map_size::<::protobuf::reflect::types::ProtobufTypeString, ::protobuf::reflect::types::ProtobufTypeMessage<ColumnMeta>>(2, &self.columns);
        my_size += ::protobuf::rt::unknown_fields_size(self.get_unknown_fields());
        self.cached_size.set(my_size);
        my_size
    }

    fn write_to_with_cached_sizes(&self, os: &mut ::protobuf::CodedOutputStream<'_>) -> ::protobuf::ProtobufResult<()> {
        ::protobuf::rt::write_map_with_cached_sizes::<::protobuf::reflect::types::ProtobufTypeString, ::protobuf::reflect::types::ProtobufTypeMessage<PartitionMeta>>(1, &self.partitioning, os)?;
        ::protobuf::rt::write_map_with_cached_sizes::<::protobuf::reflect::types::ProtobufTypeString, ::protobuf::reflect::types::ProtobufTypeMessage<ColumnMeta>>(2, &self.columns, os)?;
        os.write_unknown_fields(self.get_unknown_fields())?;
        ::std::result::Result::Ok(())
    }

    fn get_cached_size(&self) -> u32 {
        self.cached_size.get()
    }

    fn get_unknown_fields(&self) -> &::protobuf::UnknownFields {
        &self.unknown_fields
    }

    fn mut_unknown_fields(&mut self) -> &mut ::protobuf::UnknownFields {
        &mut self.unknown_fields
    }

    fn new() -> Schema {
        Schema::new()
    }

    fn descriptor_static() -> ::protobuf::reflect::MessageDescriptor {
        ::protobuf::reflect::MessageDescriptor::new_generated_2(file_descriptor(), 2)
    }

    fn default_instance() -> &'static Schema {
        static instance: ::protobuf::rt::LazyV2<Schema> = ::protobuf::rt::LazyV2::INIT;
        instance.get(Schema::new)
    }
}

impl ::protobuf::Clear for Schema {
    fn clear(&mut self) {
        self.partitioning.clear();
        self.columns.clear();
        self.unknown_fields.clear();
    }
}

impl ::std::fmt::Debug for Schema {
    fn fmt(&self, f: &mut ::std::fmt::Formatter<'_>) -> ::std::fmt::Result {
        ::protobuf::text_format::fmt(self, f)
    }
}

impl ::protobuf::reflect::ProtobufValue for Schema {
    type RuntimeType = ::protobuf::reflect::runtime_types::RuntimeTypeMessage<Self>;
}

static file_descriptor_proto_data: &'static [u8] = b"\
    \n\x0cschema.proto\x12\rprotos.schema\x1a\x0bdtype.proto\x1a\x15partitio\
    n_dtype.proto\"f\n\nColumnMeta\x12,\n\x05dtype\x18\x01\x20\x01(\x0e2\x16\
    .protos.dtype.DataTypeR\x05dtype\x12*\n\x11nested_list_depth\x18\x02\x20\
    \x01(\rR\x0fnestedListDepth\"P\n\rPartitionMeta\x12?\n\x05dtype\x18\x01\
    \x20\x01(\x0e2).protos.partition_dtype.PartitionDataTypeR\x05dtype\"\xc9\
    \x02\n\x06Schema\x12K\n\x0cpartitioning\x18\x01\x20\x03(\x0b2'.protos.sc\
    hema.Schema.PartitioningEntryR\x0cpartitioning\x12<\n\x07columns\x18\x02\
    \x20\x03(\x0b2\".protos.schema.Schema.ColumnsEntryR\x07columns\x1a]\n\
    \x11PartitioningEntry\x12\x10\n\x03key\x18\x01\x20\x01(\tR\x03key\x122\n\
    \x05value\x18\x02\x20\x01(\x0b2\x1c.protos.schema.PartitionMetaR\x05valu\
    e:\x028\x01\x1aU\n\x0cColumnsEntry\x12\x10\n\x03key\x18\x01\x20\x01(\tR\
    \x03key\x12/\n\x05value\x18\x02\x20\x01(\x0b2\x19.protos.schema.ColumnMe\
    taR\x05value:\x028\x01B\x15\n\x11com.pancakedb.idlP\x01b\x06proto3\
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
        deps.push(super::dtype::file_descriptor());
        deps.push(super::partition_dtype::file_descriptor());
        let mut messages = ::std::vec::Vec::new();
        messages.push(ColumnMeta::generated_message_descriptor_data());
        messages.push(PartitionMeta::generated_message_descriptor_data());
        messages.push(Schema::generated_message_descriptor_data());
        let mut enums = ::std::vec::Vec::new();
        ::protobuf::reflect::GeneratedFileDescriptor::new_generated(
            file_descriptor_proto(),
            deps,
            messages,
            enums,
        )
    });
    ::protobuf::reflect::FileDescriptor::new_generated_2(file_descriptor)
}
