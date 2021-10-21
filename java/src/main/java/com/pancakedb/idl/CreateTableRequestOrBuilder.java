// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ddl.proto

package com.pancakedb.idl;

public interface CreateTableRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.ddl.CreateTableRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string table_name = 1;</code>
   * @return The tableName.
   */
  java.lang.String getTableName();
  /**
   * <code>string table_name = 1;</code>
   * @return The bytes for tableName.
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>.protos.schema.Schema schema = 2;</code>
   * @return Whether the schema field is set.
   */
  boolean hasSchema();
  /**
   * <code>.protos.schema.Schema schema = 2;</code>
   * @return The schema.
   */
  com.pancakedb.idl.Schema getSchema();
  /**
   * <code>.protos.schema.Schema schema = 2;</code>
   */
  com.pancakedb.idl.SchemaOrBuilder getSchemaOrBuilder();

  /**
   * <code>.protos.ddl.CreateTableRequest.SchemaMode mode = 3;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <code>.protos.ddl.CreateTableRequest.SchemaMode mode = 3;</code>
   * @return The mode.
   */
  com.pancakedb.idl.CreateTableRequest.SchemaMode getMode();
}
