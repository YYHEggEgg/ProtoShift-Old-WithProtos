// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChallengeFinishType.proto

package emu.grasscutter.net.oldproto;

public final class ChallengeFinishTypeOuterClass {
  private ChallengeFinishTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ChallengeFinishType}
   */
  public enum ChallengeFinishType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CHALLENGE_FINISH_TYPE_NONE = 0;</code>
     */
    CHALLENGE_FINISH_TYPE_NONE(0),
    /**
     * <code>CHALLENGE_FINISH_TYPE_FAIL = 1;</code>
     */
    CHALLENGE_FINISH_TYPE_FAIL(1),
    /**
     * <code>CHALLENGE_FINISH_TYPE_SUCC = 2;</code>
     */
    CHALLENGE_FINISH_TYPE_SUCC(2),
    /**
     * <code>CHALLENGE_FINISH_TYPE_PAUSE = 3;</code>
     */
    CHALLENGE_FINISH_TYPE_PAUSE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CHALLENGE_FINISH_TYPE_NONE = 0;</code>
     */
    public static final int CHALLENGE_FINISH_TYPE_NONE_VALUE = 0;
    /**
     * <code>CHALLENGE_FINISH_TYPE_FAIL = 1;</code>
     */
    public static final int CHALLENGE_FINISH_TYPE_FAIL_VALUE = 1;
    /**
     * <code>CHALLENGE_FINISH_TYPE_SUCC = 2;</code>
     */
    public static final int CHALLENGE_FINISH_TYPE_SUCC_VALUE = 2;
    /**
     * <code>CHALLENGE_FINISH_TYPE_PAUSE = 3;</code>
     */
    public static final int CHALLENGE_FINISH_TYPE_PAUSE_VALUE = 3;


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
    public static ChallengeFinishType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ChallengeFinishType forNumber(int value) {
      switch (value) {
        case 0: return CHALLENGE_FINISH_TYPE_NONE;
        case 1: return CHALLENGE_FINISH_TYPE_FAIL;
        case 2: return CHALLENGE_FINISH_TYPE_SUCC;
        case 3: return CHALLENGE_FINISH_TYPE_PAUSE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ChallengeFinishType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ChallengeFinishType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ChallengeFinishType>() {
            public ChallengeFinishType findValueByNumber(int number) {
              return ChallengeFinishType.forNumber(number);
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
      return emu.grasscutter.net.oldproto.ChallengeFinishTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ChallengeFinishType[] VALUES = values();

    public static ChallengeFinishType valueOf(
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

    private ChallengeFinishType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ChallengeFinishType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ChallengeFinishType.proto*\226\001\n\023Challeng" +
      "eFinishType\022\036\n\032CHALLENGE_FINISH_TYPE_NON" +
      "E\020\000\022\036\n\032CHALLENGE_FINISH_TYPE_FAIL\020\001\022\036\n\032C" +
      "HALLENGE_FINISH_TYPE_SUCC\020\002\022\037\n\033CHALLENGE" +
      "_FINISH_TYPE_PAUSE\020\003B\036\n\034emu.grasscutter." +
      "net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
