// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dml.proto

package com.pancakedb.idl;

public interface ReadSegmentColumnResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.dml.ReadSegmentColumnResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string codec = 1;</code>
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   * <code>string codec = 1;</code>
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString
      getCodecBytes();

  /**
   * <code>bytes compressed_data = 2;</code>
   * @return The compressedData.
   */
  com.google.protobuf.ByteString getCompressedData();

  /**
   * <code>bytes uncompressed_data = 3;</code>
   * @return The uncompressedData.
   */
  com.google.protobuf.ByteString getUncompressedData();

  /**
   * <code>string continuation_token = 4;</code>
   * @return The continuationToken.
   */
  java.lang.String getContinuationToken();
  /**
   * <code>string continuation_token = 4;</code>
   * @return The bytes for continuationToken.
   */
  com.google.protobuf.ByteString
      getContinuationTokenBytes();

  /**
   * <code>uint32 row_count = 5;</code>
   * @return The rowCount.
   */
  int getRowCount();
}
