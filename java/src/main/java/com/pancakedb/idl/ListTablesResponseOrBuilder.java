// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ddl.proto

package com.pancakedb.idl;

public interface ListTablesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.ddl.ListTablesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .protos.ddl.TableInfo tables = 1;</code>
   */
  java.util.List<com.pancakedb.idl.TableInfo> 
      getTablesList();
  /**
   * <code>repeated .protos.ddl.TableInfo tables = 1;</code>
   */
  com.pancakedb.idl.TableInfo getTables(int index);
  /**
   * <code>repeated .protos.ddl.TableInfo tables = 1;</code>
   */
  int getTablesCount();
  /**
   * <code>repeated .protos.ddl.TableInfo tables = 1;</code>
   */
  java.util.List<? extends com.pancakedb.idl.TableInfoOrBuilder> 
      getTablesOrBuilderList();
  /**
   * <code>repeated .protos.ddl.TableInfo tables = 1;</code>
   */
  com.pancakedb.idl.TableInfoOrBuilder getTablesOrBuilder(
      int index);
}