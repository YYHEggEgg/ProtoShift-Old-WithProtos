// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AuditState.proto

package emu.grasscutter.net.oldproto;

public final class AuditStateOuterClass {
  private AuditStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code AuditState}
   */
  public enum AuditState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>AUDIT_STATE_NONE = 0;</code>
     */
    AUDIT_STATE_NONE(0),
    /**
     * <code>AUDIT_STATE_WAITING = 1;</code>
     */
    AUDIT_STATE_WAITING(1),
    /**
     * <code>AUDIT_STATE_FAILED = 2;</code>
     */
    AUDIT_STATE_FAILED(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>AUDIT_STATE_NONE = 0;</code>
     */
    public static final int AUDIT_STATE_NONE_VALUE = 0;
    /**
     * <code>AUDIT_STATE_WAITING = 1;</code>
     */
    public static final int AUDIT_STATE_WAITING_VALUE = 1;
    /**
     * <code>AUDIT_STATE_FAILED = 2;</code>
     */
    public static final int AUDIT_STATE_FAILED_VALUE = 2;


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
    public static AuditState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AuditState forNumber(int value) {
      switch (value) {
        case 0: return AUDIT_STATE_NONE;
        case 1: return AUDIT_STATE_WAITING;
        case 2: return AUDIT_STATE_FAILED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AuditState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AuditState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AuditState>() {
            public AuditState findValueByNumber(int number) {
              return AuditState.forNumber(number);
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
      return emu.grasscutter.net.oldproto.AuditStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final AuditState[] VALUES = values();

    public static AuditState valueOf(
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

    private AuditState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:AuditState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020AuditState.proto*S\n\nAuditState\022\024\n\020AUDI" +
      "T_STATE_NONE\020\000\022\027\n\023AUDIT_STATE_WAITING\020\001\022" +
      "\026\n\022AUDIT_STATE_FAILED\020\002B\036\n\034emu.grasscutt" +
      "er.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
