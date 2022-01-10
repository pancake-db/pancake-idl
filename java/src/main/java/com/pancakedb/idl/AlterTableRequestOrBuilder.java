// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ddl.proto

package com.pancakedb.idl;

public interface AlterTableRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.ddl.AlterTableRequest)
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
   * <code>map&lt;string, .protos.schema.ColumnMeta&gt; new_columns = 2;</code>
   */
  int getNewColumnsCount();
  /**
   * <code>map&lt;string, .protos.schema.ColumnMeta&gt; new_columns = 2;</code>
   */
  boolean containsNewColumns(
      java.lang.String key);
  /**
   * Use {@link #getNewColumnsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.pancakedb.idl.ColumnMeta>
  getNewColumns();
  /**
   * <code>map&lt;string, .protos.schema.ColumnMeta&gt; new_columns = 2;</code>
   */
  java.util.Map<java.lang.String, com.pancakedb.idl.ColumnMeta>
  getNewColumnsMap();
  /**
   * <code>map&lt;string, .protos.schema.ColumnMeta&gt; new_columns = 2;</code>
   */

  com.pancakedb.idl.ColumnMeta getNewColumnsOrDefault(
      java.lang.String key,
      com.pancakedb.idl.ColumnMeta defaultValue);
  /**
   * <code>map&lt;string, .protos.schema.ColumnMeta&gt; new_columns = 2;</code>
   */

  com.pancakedb.idl.ColumnMeta getNewColumnsOrThrow(
      java.lang.String key);
}