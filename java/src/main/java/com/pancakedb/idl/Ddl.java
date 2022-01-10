// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ddl.proto

package com.pancakedb.idl;

public final class Ddl {
  private Ddl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_ddl_CreateTableRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_ddl_CreateTableRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_ddl_CreateTableResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_ddl_CreateTableResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_ddl_AlterTableRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_ddl_AlterTableRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_ddl_AlterTableRequest_NewColumnsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_ddl_AlterTableRequest_NewColumnsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_ddl_AlterTableResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_ddl_AlterTableResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_ddl_DropTableRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_ddl_DropTableRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_ddl_DropTableResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_ddl_DropTableResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_ddl_GetSchemaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_ddl_GetSchemaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_ddl_GetSchemaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_ddl_GetSchemaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_ddl_TableInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_ddl_TableInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_ddl_ListTablesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_ddl_ListTablesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_ddl_ListTablesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_ddl_ListTablesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tddl.proto\022\nprotos.ddl\032\014schema.proto\"\320\001" +
      "\n\022CreateTableRequest\022\022\n\ntable_name\030\001 \001(\t" +
      "\022%\n\006schema\030\002 \001(\0132\025.protos.schema.Schema\022" +
      "7\n\004mode\030\003 \001(\0162).protos.ddl.CreateTableRe" +
      "quest.SchemaMode\"F\n\nSchemaMode\022\022\n\016FAIL_I" +
      "F_EXISTS\020\000\022\017\n\013OK_IF_EXACT\020\001\022\023\n\017ADD_NEW_C" +
      "OLUMNS\020\002\"D\n\023CreateTableResponse\022\026\n\016alrea" +
      "dy_exists\030\001 \001(\010\022\025\n\rcolumns_added\030\002 \003(\t\"\271" +
      "\001\n\021AlterTableRequest\022\022\n\ntable_name\030\001 \001(\t" +
      "\022B\n\013new_columns\030\002 \003(\0132-.protos.ddl.Alter" +
      "TableRequest.NewColumnsEntry\032L\n\017NewColum" +
      "nsEntry\022\013\n\003key\030\001 \001(\t\022(\n\005value\030\002 \001(\0132\031.pr" +
      "otos.schema.ColumnMeta:\0028\001\"\024\n\022AlterTable" +
      "Response\"&\n\020DropTableRequest\022\022\n\ntable_na" +
      "me\030\001 \001(\t\"\023\n\021DropTableResponse\"&\n\020GetSche" +
      "maRequest\022\022\n\ntable_name\030\001 \001(\t\":\n\021GetSche" +
      "maResponse\022%\n\006schema\030\001 \001(\0132\025.protos.sche" +
      "ma.Schema\"\037\n\tTableInfo\022\022\n\ntable_name\030\001 \001" +
      "(\t\"\023\n\021ListTablesRequest\";\n\022ListTablesRes" +
      "ponse\022%\n\006tables\030\001 \003(\0132\025.protos.ddl.Table" +
      "InfoB\025\n\021com.pancakedb.idlP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.pancakedb.idl.SchemaOuterClass.getDescriptor(),
        });
    internal_static_protos_ddl_CreateTableRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_ddl_CreateTableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_ddl_CreateTableRequest_descriptor,
        new java.lang.String[] { "TableName", "Schema", "Mode", });
    internal_static_protos_ddl_CreateTableResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_protos_ddl_CreateTableResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_ddl_CreateTableResponse_descriptor,
        new java.lang.String[] { "AlreadyExists", "ColumnsAdded", });
    internal_static_protos_ddl_AlterTableRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_protos_ddl_AlterTableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_ddl_AlterTableRequest_descriptor,
        new java.lang.String[] { "TableName", "NewColumns", });
    internal_static_protos_ddl_AlterTableRequest_NewColumnsEntry_descriptor =
      internal_static_protos_ddl_AlterTableRequest_descriptor.getNestedTypes().get(0);
    internal_static_protos_ddl_AlterTableRequest_NewColumnsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_ddl_AlterTableRequest_NewColumnsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_protos_ddl_AlterTableResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_protos_ddl_AlterTableResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_ddl_AlterTableResponse_descriptor,
        new java.lang.String[] { });
    internal_static_protos_ddl_DropTableRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_protos_ddl_DropTableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_ddl_DropTableRequest_descriptor,
        new java.lang.String[] { "TableName", });
    internal_static_protos_ddl_DropTableResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_protos_ddl_DropTableResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_ddl_DropTableResponse_descriptor,
        new java.lang.String[] { });
    internal_static_protos_ddl_GetSchemaRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_protos_ddl_GetSchemaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_ddl_GetSchemaRequest_descriptor,
        new java.lang.String[] { "TableName", });
    internal_static_protos_ddl_GetSchemaResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_protos_ddl_GetSchemaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_ddl_GetSchemaResponse_descriptor,
        new java.lang.String[] { "Schema", });
    internal_static_protos_ddl_TableInfo_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_protos_ddl_TableInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_ddl_TableInfo_descriptor,
        new java.lang.String[] { "TableName", });
    internal_static_protos_ddl_ListTablesRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_protos_ddl_ListTablesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_ddl_ListTablesRequest_descriptor,
        new java.lang.String[] { });
    internal_static_protos_ddl_ListTablesResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_protos_ddl_ListTablesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_ddl_ListTablesResponse_descriptor,
        new java.lang.String[] { "Tables", });
    com.pancakedb.idl.SchemaOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
