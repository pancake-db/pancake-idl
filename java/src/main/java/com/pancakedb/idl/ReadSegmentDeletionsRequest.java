// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dml.proto

package com.pancakedb.idl;

/**
 * <pre>
 *READING DELETIONS
 * </pre>
 *
 * Protobuf type {@code protos.dml.ReadSegmentDeletionsRequest}
 */
public final class ReadSegmentDeletionsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.dml.ReadSegmentDeletionsRequest)
    ReadSegmentDeletionsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReadSegmentDeletionsRequest.newBuilder() to construct.
  private ReadSegmentDeletionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadSegmentDeletionsRequest() {
    tableName_ = "";
    segmentId_ = "";
    correlationId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReadSegmentDeletionsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReadSegmentDeletionsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            java.lang.String s = input.readStringRequireUtf8();

            tableName_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              partition_ = com.google.protobuf.MapField.newMapField(
                  PartitionDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.pancakedb.idl.PartitionFieldValue>
            partition__ = input.readMessage(
                PartitionDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            partition_.getMutableMap().put(
                partition__.getKey(), partition__.getValue());
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            segmentId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            correlationId_ = s;
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
    return com.pancakedb.idl.Dml.internal_static_protos_dml_ReadSegmentDeletionsRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetPartition();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pancakedb.idl.Dml.internal_static_protos_dml_ReadSegmentDeletionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pancakedb.idl.ReadSegmentDeletionsRequest.class, com.pancakedb.idl.ReadSegmentDeletionsRequest.Builder.class);
  }

  public static final int TABLE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object tableName_;
  /**
   * <code>string table_name = 1;</code>
   * @return The tableName.
   */
  @java.lang.Override
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableName_ = s;
      return s;
    }
  }
  /**
   * <code>string table_name = 1;</code>
   * @return The bytes for tableName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTITION_FIELD_NUMBER = 2;
  private static final class PartitionDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.pancakedb.idl.PartitionFieldValue> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.pancakedb.idl.PartitionFieldValue>newDefaultInstance(
                com.pancakedb.idl.Dml.internal_static_protos_dml_ReadSegmentDeletionsRequest_PartitionEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.pancakedb.idl.PartitionFieldValue.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.pancakedb.idl.PartitionFieldValue> partition_;
  private com.google.protobuf.MapField<java.lang.String, com.pancakedb.idl.PartitionFieldValue>
  internalGetPartition() {
    if (partition_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          PartitionDefaultEntryHolder.defaultEntry);
    }
    return partition_;
  }

  public int getPartitionCount() {
    return internalGetPartition().getMap().size();
  }
  /**
   * <code>map&lt;string, .protos.dml.PartitionFieldValue&gt; partition = 2;</code>
   */

  @java.lang.Override
  public boolean containsPartition(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetPartition().getMap().containsKey(key);
  }
  /**
   * Use {@link #getPartitionMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.pancakedb.idl.PartitionFieldValue> getPartition() {
    return getPartitionMap();
  }
  /**
   * <code>map&lt;string, .protos.dml.PartitionFieldValue&gt; partition = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, com.pancakedb.idl.PartitionFieldValue> getPartitionMap() {
    return internalGetPartition().getMap();
  }
  /**
   * <code>map&lt;string, .protos.dml.PartitionFieldValue&gt; partition = 2;</code>
   */
  @java.lang.Override

  public com.pancakedb.idl.PartitionFieldValue getPartitionOrDefault(
      java.lang.String key,
      com.pancakedb.idl.PartitionFieldValue defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.pancakedb.idl.PartitionFieldValue> map =
        internalGetPartition().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .protos.dml.PartitionFieldValue&gt; partition = 2;</code>
   */
  @java.lang.Override

  public com.pancakedb.idl.PartitionFieldValue getPartitionOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.pancakedb.idl.PartitionFieldValue> map =
        internalGetPartition().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int SEGMENT_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object segmentId_;
  /**
   * <code>string segment_id = 3;</code>
   * @return The segmentId.
   */
  @java.lang.Override
  public java.lang.String getSegmentId() {
    java.lang.Object ref = segmentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      segmentId_ = s;
      return s;
    }
  }
  /**
   * <code>string segment_id = 3;</code>
   * @return The bytes for segmentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSegmentIdBytes() {
    java.lang.Object ref = segmentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      segmentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CORRELATION_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object correlationId_;
  /**
   * <code>string correlation_id = 4;</code>
   * @return The correlationId.
   */
  @java.lang.Override
  public java.lang.String getCorrelationId() {
    java.lang.Object ref = correlationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      correlationId_ = s;
      return s;
    }
  }
  /**
   * <code>string correlation_id = 4;</code>
   * @return The bytes for correlationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCorrelationIdBytes() {
    java.lang.Object ref = correlationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      correlationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getTableNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tableName_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetPartition(),
        PartitionDefaultEntryHolder.defaultEntry,
        2);
    if (!getSegmentIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, segmentId_);
    }
    if (!getCorrelationIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, correlationId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTableNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tableName_);
    }
    for (java.util.Map.Entry<java.lang.String, com.pancakedb.idl.PartitionFieldValue> entry
         : internalGetPartition().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.pancakedb.idl.PartitionFieldValue>
      partition__ = PartitionDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, partition__);
    }
    if (!getSegmentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, segmentId_);
    }
    if (!getCorrelationIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, correlationId_);
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
    if (!(obj instanceof com.pancakedb.idl.ReadSegmentDeletionsRequest)) {
      return super.equals(obj);
    }
    com.pancakedb.idl.ReadSegmentDeletionsRequest other = (com.pancakedb.idl.ReadSegmentDeletionsRequest) obj;

    if (!getTableName()
        .equals(other.getTableName())) return false;
    if (!internalGetPartition().equals(
        other.internalGetPartition())) return false;
    if (!getSegmentId()
        .equals(other.getSegmentId())) return false;
    if (!getCorrelationId()
        .equals(other.getCorrelationId())) return false;
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
    hash = (37 * hash) + TABLE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTableName().hashCode();
    if (!internalGetPartition().getMap().isEmpty()) {
      hash = (37 * hash) + PARTITION_FIELD_NUMBER;
      hash = (53 * hash) + internalGetPartition().hashCode();
    }
    hash = (37 * hash) + SEGMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSegmentId().hashCode();
    hash = (37 * hash) + CORRELATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCorrelationId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pancakedb.idl.ReadSegmentDeletionsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pancakedb.idl.ReadSegmentDeletionsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pancakedb.idl.ReadSegmentDeletionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pancakedb.idl.ReadSegmentDeletionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pancakedb.idl.ReadSegmentDeletionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pancakedb.idl.ReadSegmentDeletionsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pancakedb.idl.ReadSegmentDeletionsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pancakedb.idl.ReadSegmentDeletionsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pancakedb.idl.ReadSegmentDeletionsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.pancakedb.idl.ReadSegmentDeletionsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pancakedb.idl.ReadSegmentDeletionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pancakedb.idl.ReadSegmentDeletionsRequest parseFrom(
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
  public static Builder newBuilder(com.pancakedb.idl.ReadSegmentDeletionsRequest prototype) {
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
   * <pre>
   *READING DELETIONS
   * </pre>
   *
   * Protobuf type {@code protos.dml.ReadSegmentDeletionsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.dml.ReadSegmentDeletionsRequest)
      com.pancakedb.idl.ReadSegmentDeletionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pancakedb.idl.Dml.internal_static_protos_dml_ReadSegmentDeletionsRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetPartition();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutablePartition();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pancakedb.idl.Dml.internal_static_protos_dml_ReadSegmentDeletionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pancakedb.idl.ReadSegmentDeletionsRequest.class, com.pancakedb.idl.ReadSegmentDeletionsRequest.Builder.class);
    }

    // Construct using com.pancakedb.idl.ReadSegmentDeletionsRequest.newBuilder()
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
      tableName_ = "";

      internalGetMutablePartition().clear();
      segmentId_ = "";

      correlationId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pancakedb.idl.Dml.internal_static_protos_dml_ReadSegmentDeletionsRequest_descriptor;
    }

    @java.lang.Override
    public com.pancakedb.idl.ReadSegmentDeletionsRequest getDefaultInstanceForType() {
      return com.pancakedb.idl.ReadSegmentDeletionsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.pancakedb.idl.ReadSegmentDeletionsRequest build() {
      com.pancakedb.idl.ReadSegmentDeletionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.pancakedb.idl.ReadSegmentDeletionsRequest buildPartial() {
      com.pancakedb.idl.ReadSegmentDeletionsRequest result = new com.pancakedb.idl.ReadSegmentDeletionsRequest(this);
      int from_bitField0_ = bitField0_;
      result.tableName_ = tableName_;
      result.partition_ = internalGetPartition();
      result.partition_.makeImmutable();
      result.segmentId_ = segmentId_;
      result.correlationId_ = correlationId_;
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
      if (other instanceof com.pancakedb.idl.ReadSegmentDeletionsRequest) {
        return mergeFrom((com.pancakedb.idl.ReadSegmentDeletionsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pancakedb.idl.ReadSegmentDeletionsRequest other) {
      if (other == com.pancakedb.idl.ReadSegmentDeletionsRequest.getDefaultInstance()) return this;
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        onChanged();
      }
      internalGetMutablePartition().mergeFrom(
          other.internalGetPartition());
      if (!other.getSegmentId().isEmpty()) {
        segmentId_ = other.segmentId_;
        onChanged();
      }
      if (!other.getCorrelationId().isEmpty()) {
        correlationId_ = other.correlationId_;
        onChanged();
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
      com.pancakedb.idl.ReadSegmentDeletionsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pancakedb.idl.ReadSegmentDeletionsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object tableName_ = "";
    /**
     * <code>string table_name = 1;</code>
     * @return The tableName.
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string table_name = 1;</code>
     * @return The bytes for tableName.
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string table_name = 1;</code>
     * @param value The tableName to set.
     * @return This builder for chaining.
     */
    public Builder setTableName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tableName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string table_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTableName() {
      
      tableName_ = getDefaultInstance().getTableName();
      onChanged();
      return this;
    }
    /**
     * <code>string table_name = 1;</code>
     * @param value The bytes for tableName to set.
     * @return This builder for chaining.
     */
    public Builder setTableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tableName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, com.pancakedb.idl.PartitionFieldValue> partition_;
    private com.google.protobuf.MapField<java.lang.String, com.pancakedb.idl.PartitionFieldValue>
    internalGetPartition() {
      if (partition_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PartitionDefaultEntryHolder.defaultEntry);
      }
      return partition_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.pancakedb.idl.PartitionFieldValue>
    internalGetMutablePartition() {
      onChanged();;
      if (partition_ == null) {
        partition_ = com.google.protobuf.MapField.newMapField(
            PartitionDefaultEntryHolder.defaultEntry);
      }
      if (!partition_.isMutable()) {
        partition_ = partition_.copy();
      }
      return partition_;
    }

    public int getPartitionCount() {
      return internalGetPartition().getMap().size();
    }
    /**
     * <code>map&lt;string, .protos.dml.PartitionFieldValue&gt; partition = 2;</code>
     */

    @java.lang.Override
    public boolean containsPartition(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetPartition().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPartitionMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.pancakedb.idl.PartitionFieldValue> getPartition() {
      return getPartitionMap();
    }
    /**
     * <code>map&lt;string, .protos.dml.PartitionFieldValue&gt; partition = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, com.pancakedb.idl.PartitionFieldValue> getPartitionMap() {
      return internalGetPartition().getMap();
    }
    /**
     * <code>map&lt;string, .protos.dml.PartitionFieldValue&gt; partition = 2;</code>
     */
    @java.lang.Override

    public com.pancakedb.idl.PartitionFieldValue getPartitionOrDefault(
        java.lang.String key,
        com.pancakedb.idl.PartitionFieldValue defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.pancakedb.idl.PartitionFieldValue> map =
          internalGetPartition().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .protos.dml.PartitionFieldValue&gt; partition = 2;</code>
     */
    @java.lang.Override

    public com.pancakedb.idl.PartitionFieldValue getPartitionOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.pancakedb.idl.PartitionFieldValue> map =
          internalGetPartition().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearPartition() {
      internalGetMutablePartition().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .protos.dml.PartitionFieldValue&gt; partition = 2;</code>
     */

    public Builder removePartition(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutablePartition().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.pancakedb.idl.PartitionFieldValue>
    getMutablePartition() {
      return internalGetMutablePartition().getMutableMap();
    }
    /**
     * <code>map&lt;string, .protos.dml.PartitionFieldValue&gt; partition = 2;</code>
     */
    public Builder putPartition(
        java.lang.String key,
        com.pancakedb.idl.PartitionFieldValue value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutablePartition().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .protos.dml.PartitionFieldValue&gt; partition = 2;</code>
     */

    public Builder putAllPartition(
        java.util.Map<java.lang.String, com.pancakedb.idl.PartitionFieldValue> values) {
      internalGetMutablePartition().getMutableMap()
          .putAll(values);
      return this;
    }

    private java.lang.Object segmentId_ = "";
    /**
     * <code>string segment_id = 3;</code>
     * @return The segmentId.
     */
    public java.lang.String getSegmentId() {
      java.lang.Object ref = segmentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        segmentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string segment_id = 3;</code>
     * @return The bytes for segmentId.
     */
    public com.google.protobuf.ByteString
        getSegmentIdBytes() {
      java.lang.Object ref = segmentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        segmentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string segment_id = 3;</code>
     * @param value The segmentId to set.
     * @return This builder for chaining.
     */
    public Builder setSegmentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      segmentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string segment_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSegmentId() {
      
      segmentId_ = getDefaultInstance().getSegmentId();
      onChanged();
      return this;
    }
    /**
     * <code>string segment_id = 3;</code>
     * @param value The bytes for segmentId to set.
     * @return This builder for chaining.
     */
    public Builder setSegmentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      segmentId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object correlationId_ = "";
    /**
     * <code>string correlation_id = 4;</code>
     * @return The correlationId.
     */
    public java.lang.String getCorrelationId() {
      java.lang.Object ref = correlationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        correlationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string correlation_id = 4;</code>
     * @return The bytes for correlationId.
     */
    public com.google.protobuf.ByteString
        getCorrelationIdBytes() {
      java.lang.Object ref = correlationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        correlationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string correlation_id = 4;</code>
     * @param value The correlationId to set.
     * @return This builder for chaining.
     */
    public Builder setCorrelationId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      correlationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string correlation_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCorrelationId() {
      
      correlationId_ = getDefaultInstance().getCorrelationId();
      onChanged();
      return this;
    }
    /**
     * <code>string correlation_id = 4;</code>
     * @param value The bytes for correlationId to set.
     * @return This builder for chaining.
     */
    public Builder setCorrelationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      correlationId_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:protos.dml.ReadSegmentDeletionsRequest)
  }

  // @@protoc_insertion_point(class_scope:protos.dml.ReadSegmentDeletionsRequest)
  private static final com.pancakedb.idl.ReadSegmentDeletionsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pancakedb.idl.ReadSegmentDeletionsRequest();
  }

  public static com.pancakedb.idl.ReadSegmentDeletionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadSegmentDeletionsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReadSegmentDeletionsRequest>() {
    @java.lang.Override
    public ReadSegmentDeletionsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReadSegmentDeletionsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadSegmentDeletionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadSegmentDeletionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.pancakedb.idl.ReadSegmentDeletionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

