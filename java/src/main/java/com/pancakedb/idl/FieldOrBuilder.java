// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dml.proto

package com.pancakedb.idl;

public interface FieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.dml.Field)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.protos.dml.FieldValue value = 2;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.protos.dml.FieldValue value = 2;</code>
   * @return The value.
   */
  com.pancakedb.idl.FieldValue getValue();
  /**
   * <code>.protos.dml.FieldValue value = 2;</code>
   */
  com.pancakedb.idl.FieldValueOrBuilder getValueOrBuilder();
}
