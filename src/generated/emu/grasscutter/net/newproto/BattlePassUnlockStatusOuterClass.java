// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BattlePassUnlockStatus.proto

package emu.grasscutter.net.newproto;

public final class BattlePassUnlockStatusOuterClass {
  private BattlePassUnlockStatusOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code BattlePassUnlockStatus}
   */
  public enum BattlePassUnlockStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>BATTLE_PASS_UNLOCK_STATUS_INVALID = 0;</code>
     */
    BATTLE_PASS_UNLOCK_STATUS_INVALID(0),
    /**
     * <code>BATTLE_PASS_UNLOCK_STATUS_FREE = 1;</code>
     */
    BATTLE_PASS_UNLOCK_STATUS_FREE(1),
    /**
     * <code>BATTLE_PASS_UNLOCK_STATUS_PAID = 2;</code>
     */
    BATTLE_PASS_UNLOCK_STATUS_PAID(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>BATTLE_PASS_UNLOCK_STATUS_INVALID = 0;</code>
     */
    public static final int BATTLE_PASS_UNLOCK_STATUS_INVALID_VALUE = 0;
    /**
     * <code>BATTLE_PASS_UNLOCK_STATUS_FREE = 1;</code>
     */
    public static final int BATTLE_PASS_UNLOCK_STATUS_FREE_VALUE = 1;
    /**
     * <code>BATTLE_PASS_UNLOCK_STATUS_PAID = 2;</code>
     */
    public static final int BATTLE_PASS_UNLOCK_STATUS_PAID_VALUE = 2;


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
    public static BattlePassUnlockStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BattlePassUnlockStatus forNumber(int value) {
      switch (value) {
        case 0: return BATTLE_PASS_UNLOCK_STATUS_INVALID;
        case 1: return BATTLE_PASS_UNLOCK_STATUS_FREE;
        case 2: return BATTLE_PASS_UNLOCK_STATUS_PAID;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BattlePassUnlockStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BattlePassUnlockStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BattlePassUnlockStatus>() {
            public BattlePassUnlockStatus findValueByNumber(int number) {
              return BattlePassUnlockStatus.forNumber(number);
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
      return emu.grasscutter.net.newproto.BattlePassUnlockStatusOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final BattlePassUnlockStatus[] VALUES = values();

    public static BattlePassUnlockStatus valueOf(
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

    private BattlePassUnlockStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:BattlePassUnlockStatus)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034BattlePassUnlockStatus.proto*\207\001\n\026Battl" +
      "ePassUnlockStatus\022%\n!BATTLE_PASS_UNLOCK_" +
      "STATUS_INVALID\020\000\022\"\n\036BATTLE_PASS_UNLOCK_S" +
      "TATUS_FREE\020\001\022\"\n\036BATTLE_PASS_UNLOCK_STATU" +
      "S_PAID\020\002B\036\n\034emu.grasscutter.net.newproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
