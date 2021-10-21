// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ddl.proto

package com.pancakedb.idl;

/**
 * Protobuf type {@code protos.ddl.GetSchemaResponse}
 */
public final class GetSchemaResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.ddl.GetSchemaResponse)
    GetSchemaResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSchemaResponse.newBuilder() to construct.
  private GetSchemaResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSchemaResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetSchemaResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetSchemaResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.pancakedb.idl.Schema.Builder subBuilder = null;
            if (schema_ != null) {
              subBuilder = schema_.toBuilder();
            }
            schema_ = input.readMessage(com.pancakedb.idl.Schema.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(schema_);
              schema_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pancakedb.idl.Ddl.internal_static_protos_ddl_GetSchemaResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pancakedb.idl.Ddl.internal_static_protos_ddl_GetSchemaResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pancakedb.idl.GetSchemaResponse.class, com.pancakedb.idl.GetSchemaResponse.Builder.class);
  }

  public static final int SCHEMA_FIELD_NUMBER = 1;
  private com.pancakedb.idl.Schema schema_;
  /**
   * <code>.protos.schema.Schema schema = 1;</code>
   * @return Whether the schema field is set.
   */
  @java.lang.Override
  public boolean hasSchema() {
    return schema_ != null;
  }
  /**
   * <code>.protos.schema.Schema schema = 1;</code>
   * @return The schema.
   */
  @java.lang.Override
  public com.pancakedb.idl.Schema getSchema() {
    return schema_ == null ? com.pancakedb.idl.Schema.getDefaultInstance() : schema_;
  }
  /**
   * <code>.protos.schema.Schema schema = 1;</code>
   */
  @java.lang.Override
  public com.pancakedb.idl.SchemaOrBuilder getSchemaOrBuilder() {
    return getSchema();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (schema_ != null) {
      output.writeMessage(1, getSchema());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (schema_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSchema());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.pancakedb.idl.GetSchemaResponse)) {
      return super.equals(obj);
    }
    com.pancakedb.idl.GetSchemaResponse other = (com.pancakedb.idl.GetSchemaResponse) obj;

    if (hasSchema() != other.hasSchema()) return false;
    if (hasSchema()) {
      if (!getSchema()
          .equals(other.getSchema())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasSchema()) {
      hash = (37 * hash) + SCHEMA_FIELD_NUMBER;
      hash = (53 * hash) + getSchema().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pancakedb.idl.GetSchemaResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pancakedb.idl.GetSchemaResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pancakedb.idl.GetSchemaResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pancakedb.idl.GetSchemaResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pancakedb.idl.GetSchemaResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pancakedb.idl.GetSchemaResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pancakedb.idl.GetSchemaResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pancakedb.idl.GetSchemaResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pancakedb.idl.GetSchemaResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.pancakedb.idl.GetSchemaResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pancakedb.idl.GetSchemaResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pancakedb.idl.GetSchemaResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.pancakedb.idl.GetSchemaResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code protos.ddl.GetSchemaResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.ddl.GetSchemaResponse)
      com.pancakedb.idl.GetSchemaResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pancakedb.idl.Ddl.internal_static_protos_ddl_GetSchemaResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pancakedb.idl.Ddl.internal_static_protos_ddl_GetSchemaResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pancakedb.idl.GetSchemaResponse.class, com.pancakedb.idl.GetSchemaResponse.Builder.class);
    }

    // Construct using com.pancakedb.idl.GetSchemaResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (schemaBuilder_ == null) {
        schema_ = null;
      } else {
        schema_ = null;
        schemaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pancakedb.idl.Ddl.internal_static_protos_ddl_GetSchemaResponse_descriptor;
    }

    @java.lang.Override
    public com.pancakedb.idl.GetSchemaResponse getDefaultInstanceForType() {
      return com.pancakedb.idl.GetSchemaResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.pancakedb.idl.GetSchemaResponse build() {
      com.pancakedb.idl.GetSchemaResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.pancakedb.idl.GetSchemaResponse buildPartial() {
      com.pancakedb.idl.GetSchemaResponse result = new com.pancakedb.idl.GetSchemaResponse(this);
      if (schemaBuilder_ == null) {
        result.schema_ = schema_;
      } else {
        result.schema_ = schemaBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pancakedb.idl.GetSchemaResponse) {
        return mergeFrom((com.pancakedb.idl.GetSchemaResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pancakedb.idl.GetSchemaResponse other) {
      if (other == com.pancakedb.idl.GetSchemaResponse.getDefaultInstance()) return this;
      if (other.hasSchema()) {
        mergeSchema(other.getSchema());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pancakedb.idl.GetSchemaResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pancakedb.idl.GetSchemaResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.pancakedb.idl.Schema schema_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.pancakedb.idl.Schema, com.pancakedb.idl.Schema.Builder, com.pancakedb.idl.SchemaOrBuilder> schemaBuilder_;
    /**
     * <code>.protos.schema.Schema schema = 1;</code>
     * @return Whether the schema field is set.
     */
    public boolean hasSchema() {
      return schemaBuilder_ != null || schema_ != null;
    }
    /**
     * <code>.protos.schema.Schema schema = 1;</code>
     * @return The schema.
     */
    public com.pancakedb.idl.Schema getSchema() {
      if (schemaBuilder_ == null) {
        return schema_ == null ? com.pancakedb.idl.Schema.getDefaultInstance() : schema_;
      } else {
        return schemaBuilder_.getMessage();
      }
    }
    /**
     * <code>.protos.schema.Schema schema = 1;</code>
     */
    public Builder setSchema(com.pancakedb.idl.Schema value) {
      if (schemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        schema_ = value;
        onChanged();
      } else {
        schemaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.protos.schema.Schema schema = 1;</code>
     */
    public Builder setSchema(
        com.pancakedb.idl.Schema.Builder builderForValue) {
      if (schemaBuilder_ == null) {
        schema_ = builderForValue.build();
        onChanged();
      } else {
        schemaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protos.schema.Schema schema = 1;</code>
     */
    public Builder mergeSchema(com.pancakedb.idl.Schema value) {
      if (schemaBuilder_ == null) {
        if (schema_ != null) {
          schema_ =
            com.pancakedb.idl.Schema.newBuilder(schema_).mergeFrom(value).buildPartial();
        } else {
          schema_ = value;
        }
        onChanged();
      } else {
        schemaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.protos.schema.Schema schema = 1;</code>
     */
    public Builder clearSchema() {
      if (schemaBuilder_ == null) {
        schema_ = null;
        onChanged();
      } else {
        schema_ = null;
        schemaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.protos.schema.Schema schema = 1;</code>
     */
    public com.pancakedb.idl.Schema.Builder getSchemaBuilder() {
      
      onChanged();
      return getSchemaFieldBuilder().getBuilder();
    }
    /**
     * <code>.protos.schema.Schema schema = 1;</code>
     */
    public com.pancakedb.idl.SchemaOrBuilder getSchemaOrBuilder() {
      if (schemaBuilder_ != null) {
        return schemaBuilder_.getMessageOrBuilder();
      } else {
        return schema_ == null ?
            com.pancakedb.idl.Schema.getDefaultInstance() : schema_;
      }
    }
    /**
     * <code>.protos.schema.Schema schema = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.pancakedb.idl.Schema, com.pancakedb.idl.Schema.Builder, com.pancakedb.idl.SchemaOrBuilder> 
        getSchemaFieldBuilder() {
      if (schemaBuilder_ == null) {
        schemaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.pancakedb.idl.Schema, com.pancakedb.idl.Schema.Builder, com.pancakedb.idl.SchemaOrBuilder>(
                getSchema(),
                getParentForChildren(),
                isClean());
        schema_ = null;
      }
      return schemaBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:protos.ddl.GetSchemaResponse)
  }

  // @@protoc_insertion_point(class_scope:protos.ddl.GetSchemaResponse)
  private static final com.pancakedb.idl.GetSchemaResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pancakedb.idl.GetSchemaResponse();
  }

  public static com.pancakedb.idl.GetSchemaResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSchemaResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetSchemaResponse>() {
    @java.lang.Override
    public GetSchemaResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetSchemaResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetSchemaResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSchemaResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.pancakedb.idl.GetSchemaResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

