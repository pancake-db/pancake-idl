// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.pancakedb.idl;

public final class SchemaOuterClass {
  private SchemaOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_schema_ColumnMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_schema_ColumnMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_schema_PartitionMeta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_schema_PartitionMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_schema_Schema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_schema_Schema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_schema_Schema_PartitioningEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_schema_Schema_PartitioningEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_schema_Schema_ColumnsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_schema_Schema_ColumnsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014schema.proto\022\rprotos.schema\032\013dtype.pro" +
      "to\032\025partition_dtype.proto\"N\n\nColumnMeta\022" +
      "%\n\005dtype\030\002 \001(\0162\026.protos.dtype.DataType\022\031" +
      "\n\021nested_list_depth\030\003 \001(\r\"I\n\rPartitionMe" +
      "ta\0228\n\005dtype\030\002 \001(\0162).protos.partition_dty" +
      "pe.PartitionDataType\"\232\002\n\006Schema\022=\n\014parti" +
      "tioning\030\001 \003(\0132\'.protos.schema.Schema.Par" +
      "titioningEntry\0223\n\007columns\030\002 \003(\0132\".protos" +
      ".schema.Schema.ColumnsEntry\032Q\n\021Partition" +
      "ingEntry\022\013\n\003key\030\001 \001(\t\022+\n\005value\030\002 \001(\0132\034.p" +
      "rotos.schema.PartitionMeta:\0028\001\032I\n\014Column" +
      "sEntry\022\013\n\003key\030\001 \001(\t\022(\n\005value\030\002 \001(\0132\031.pro" +
      "tos.schema.ColumnMeta:\0028\001B\025\n\021com.pancake" +
      "db.idlP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.pancakedb.idl.Dtype.getDescriptor(),
          com.pancakedb.idl.PartitionDtype.getDescriptor(),
        });
    internal_static_protos_schema_ColumnMeta_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_schema_ColumnMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_schema_ColumnMeta_descriptor,
        new java.lang.String[] { "Dtype", "NestedListDepth", });
    internal_static_protos_schema_PartitionMeta_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_protos_schema_PartitionMeta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_schema_PartitionMeta_descriptor,
        new java.lang.String[] { "Dtype", });
    internal_static_protos_schema_Schema_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_protos_schema_Schema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_schema_Schema_descriptor,
        new java.lang.String[] { "Partitioning", "Columns", });
    internal_static_protos_schema_Schema_PartitioningEntry_descriptor =
      internal_static_protos_schema_Schema_descriptor.getNestedTypes().get(0);
    internal_static_protos_schema_Schema_PartitioningEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_schema_Schema_PartitioningEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_protos_schema_Schema_ColumnsEntry_descriptor =
      internal_static_protos_schema_Schema_descriptor.getNestedTypes().get(1);
    internal_static_protos_schema_Schema_ColumnsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_schema_Schema_ColumnsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.pancakedb.idl.Dtype.getDescriptor();
    com.pancakedb.idl.PartitionDtype.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
