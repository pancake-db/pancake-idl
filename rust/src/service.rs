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

//! Generated file from `service.proto`

/// Generated files are compatible only with the same version
/// of protobuf runtime.
const _PROTOBUF_VERSION_CHECK: () = ::protobuf::VERSION_3_0_0_PRE;

static file_descriptor_proto_data: &'static [u8] = b"\
    \n\rservice.proto\x12\x0eprotos.service\x1a\tddl.proto\x1a\tdml.proto2\
    \x83\x04\n\tPancakeDb\x12N\n\x0bCreateTable\x12\x1e.protos.ddl.CreateTab\
    leRequest\x1a\x1f.protos.ddl.CreateTableResponse\x12H\n\tDropTable\x12\
    \x1c.protos.ddl.DropTableRequest\x1a\x1d.protos.ddl.DropTableResponse\
    \x12H\n\tGetSchema\x12\x1c.protos.ddl.GetSchemaRequest\x1a\x1d.protos.dd\
    l.GetSchemaResponse\x12]\n\x10WriteToPartition\x12#.protos.dml.WriteToPa\
    rtitionRequest\x1a$.protos.dml.WriteToPartitionResponse\x12Q\n\x0cListSe\
    gments\x12\x1f.protos.dml.ListSegmentsRequest\x1a\x20.protos.dml.ListSeg\
    mentsResponse\x12`\n\x11ReadSegmentColumn\x12$.protos.dml.ReadSegmentCol\
    umnRequest\x1a%.protos.dml.ReadSegmentColumnResponseB\x15\n\x11com.panca\
    kedb.idlP\x01b\x06proto3\
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
        deps.push(super::ddl::file_descriptor());
        deps.push(super::dml::file_descriptor());
        let mut messages = ::std::vec::Vec::new();
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
