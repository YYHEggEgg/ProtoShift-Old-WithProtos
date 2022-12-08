// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueDiaryAvatarDisableStatus.proto

package emu.grasscutter.net.oldproto;

public final class RogueDiaryAvatarDisableStatusOuterClass {
  private RogueDiaryAvatarDisableStatusOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code RogueDiaryAvatarDisableStatus}
   */
  public enum RogueDiaryAvatarDisableStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ROGUE_DIARY_AVATAR_DISABLE_STATUS_NONE = 0;</code>
     */
    ROGUE_DIARY_AVATAR_DISABLE_STATUS_NONE(0),
    /**
     * <code>ROGUE_DIARY_AVATAR_DISABLE_STATUS_DEATH = 1;</code>
     */
    ROGUE_DIARY_AVATAR_DISABLE_STATUS_DEATH(1),
    /**
     * <code>ROGUE_DIARY_AVATAR_DISABLE_STATUS_TIRED = 2;</code>
     */
    ROGUE_DIARY_AVATAR_DISABLE_STATUS_TIRED(2),
    /**
     * <code>ROGUE_DIARY_AVATAR_DISABLE_STATUS_DUPLICATED = 3;</code>
     */
    ROGUE_DIARY_AVATAR_DISABLE_STATUS_DUPLICATED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ROGUE_DIARY_AVATAR_DISABLE_STATUS_NONE = 0;</code>
     */
    public static final int ROGUE_DIARY_AVATAR_DISABLE_STATUS_NONE_VALUE = 0;
    /**
     * <code>ROGUE_DIARY_AVATAR_DISABLE_STATUS_DEATH = 1;</code>
     */
    public static final int ROGUE_DIARY_AVATAR_DISABLE_STATUS_DEATH_VALUE = 1;
    /**
     * <code>ROGUE_DIARY_AVATAR_DISABLE_STATUS_TIRED = 2;</code>
     */
    public static final int ROGUE_DIARY_AVATAR_DISABLE_STATUS_TIRED_VALUE = 2;
    /**
     * <code>ROGUE_DIARY_AVATAR_DISABLE_STATUS_DUPLICATED = 3;</code>
     */
    public static final int ROGUE_DIARY_AVATAR_DISABLE_STATUS_DUPLICATED_VALUE = 3;


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
    public static RogueDiaryAvatarDisableStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RogueDiaryAvatarDisableStatus forNumber(int value) {
      switch (value) {
        case 0: return ROGUE_DIARY_AVATAR_DISABLE_STATUS_NONE;
        case 1: return ROGUE_DIARY_AVATAR_DISABLE_STATUS_DEATH;
        case 2: return ROGUE_DIARY_AVATAR_DISABLE_STATUS_TIRED;
        case 3: return ROGUE_DIARY_AVATAR_DISABLE_STATUS_DUPLICATED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RogueDiaryAvatarDisableStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RogueDiaryAvatarDisableStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RogueDiaryAvatarDisableStatus>() {
            public RogueDiaryAvatarDisableStatus findValueByNumber(int number) {
              return RogueDiaryAvatarDisableStatus.forNumber(number);
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
      return emu.grasscutter.net.oldproto.RogueDiaryAvatarDisableStatusOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final RogueDiaryAvatarDisableStatus[] VALUES = values();

    public static RogueDiaryAvatarDisableStatus valueOf(
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

    private RogueDiaryAvatarDisableStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:RogueDiaryAvatarDisableStatus)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#RogueDiaryAvatarDisableStatus.proto*\327\001" +
      "\n\035RogueDiaryAvatarDisableStatus\022*\n&ROGUE" +
      "_DIARY_AVATAR_DISABLE_STATUS_NONE\020\000\022+\n\'R" +
      "OGUE_DIARY_AVATAR_DISABLE_STATUS_DEATH\020\001" +
      "\022+\n\'ROGUE_DIARY_AVATAR_DISABLE_STATUS_TI" +
      "RED\020\002\0220\n,ROGUE_DIARY_AVATAR_DISABLE_STAT" +
      "US_DUPLICATED\020\003B\036\n\034emu.grasscutter.net.o" +
      "ldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
