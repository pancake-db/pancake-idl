// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dtype.proto

package com.pancakedb.idl;

/**
 * Protobuf enum {@code protos.dtype.DataType}
 */
public enum DataType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STRING = 0;</code>
   */
  STRING(0),
  /**
   * <code>BOOL = 1;</code>
   */
  BOOL(1),
  /**
   * <code>BYTES = 2;</code>
   */
  BYTES(2),
  /**
   * <code>INT64 = 3;</code>
   */
  INT64(3),
  /**
   * <code>FLOAT32 = 4;</code>
   */
  FLOAT32(4),
  /**
   * <code>FLOAT64 = 5;</code>
   */
  FLOAT64(5),
  /**
   * <code>TIMESTAMP_MICROS = 6;</code>
   */
  TIMESTAMP_MICROS(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STRING = 0;</code>
   */
  public static final int STRING_VALUE = 0;
  /**
   * <code>BOOL = 1;</code>
   */
  public static final int BOOL_VALUE = 1;
  /**
   * <code>BYTES = 2;</code>
   */
  public static final int BYTES_VALUE = 2;
  /**
   * <code>INT64 = 3;</code>
   */
  public static final int INT64_VALUE = 3;
  /**
   * <code>FLOAT32 = 4;</code>
   */
  public static final int FLOAT32_VALUE = 4;
  /**
   * <code>FLOAT64 = 5;</code>
   */
  public static final int FLOAT64_VALUE = 5;
  /**
   * <code>TIMESTAMP_MICROS = 6;</code>
   */
  public static final int TIMESTAMP_MICROS_VALUE = 6;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DataType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DataType forNumber(int value) {
    switch (value) {
      case 0: return STRING;
      case 1: return BOOL;
      case 2: return BYTES;
      case 3: return INT64;
      case 4: return FLOAT32;
      case 5: return FLOAT64;
      case 6: return TIMESTAMP_MICROS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DataType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DataType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
          public DataType findValueByNumber(int number) {
            return DataType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.pancakedb.idl.Dtype.getDescriptor().getEnumTypes().get(0);
  }

  private static final DataType[] VALUES = values();

  public static DataType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DataType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:protos.dtype.DataType)
}

