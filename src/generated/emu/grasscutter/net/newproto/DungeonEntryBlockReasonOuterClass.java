// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonEntryBlockReason.proto

package emu.grasscutter.net.newproto;

public final class DungeonEntryBlockReasonOuterClass {
  private DungeonEntryBlockReasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code DungeonEntryBlockReason}
   */
  public enum DungeonEntryBlockReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DUNGEON_ENTRY_BLOCK_REASON_NONE = 0;</code>
     */
    DUNGEON_ENTRY_BLOCK_REASON_NONE(0),
    /**
     * <code>DUNGEON_ENTRY_BLOCK_REASON_LEVEL = 1;</code>
     */
    DUNGEON_ENTRY_BLOCK_REASON_LEVEL(1),
    /**
     * <code>DUNGEON_ENTRY_BLOCK_REASON_QUEST = 2;</code>
     */
    DUNGEON_ENTRY_BLOCK_REASON_QUEST(2),
    /**
     * <code>DUNGEON_ENTRY_BLOCK_REASON_MULTIPLE = 3;</code>
     */
    DUNGEON_ENTRY_BLOCK_REASON_MULTIPLE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DUNGEON_ENTRY_BLOCK_REASON_NONE = 0;</code>
     */
    public static final int DUNGEON_ENTRY_BLOCK_REASON_NONE_VALUE = 0;
    /**
     * <code>DUNGEON_ENTRY_BLOCK_REASON_LEVEL = 1;</code>
     */
    public static final int DUNGEON_ENTRY_BLOCK_REASON_LEVEL_VALUE = 1;
    /**
     * <code>DUNGEON_ENTRY_BLOCK_REASON_QUEST = 2;</code>
     */
    public static final int DUNGEON_ENTRY_BLOCK_REASON_QUEST_VALUE = 2;
    /**
     * <code>DUNGEON_ENTRY_BLOCK_REASON_MULTIPLE = 3;</code>
     */
    public static final int DUNGEON_ENTRY_BLOCK_REASON_MULTIPLE_VALUE = 3;


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
    public static DungeonEntryBlockReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DungeonEntryBlockReason forNumber(int value) {
      switch (value) {
        case 0: return DUNGEON_ENTRY_BLOCK_REASON_NONE;
        case 1: return DUNGEON_ENTRY_BLOCK_REASON_LEVEL;
        case 2: return DUNGEON_ENTRY_BLOCK_REASON_QUEST;
        case 3: return DUNGEON_ENTRY_BLOCK_REASON_MULTIPLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DungeonEntryBlockReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DungeonEntryBlockReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DungeonEntryBlockReason>() {
            public DungeonEntryBlockReason findValueByNumber(int number) {
              return DungeonEntryBlockReason.forNumber(number);
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
      return emu.grasscutter.net.newproto.DungeonEntryBlockReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final DungeonEntryBlockReason[] VALUES = values();

    public static DungeonEntryBlockReason valueOf(
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

    private DungeonEntryBlockReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:DungeonEntryBlockReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035DungeonEntryBlockReason.proto*\263\001\n\027Dung" +
      "eonEntryBlockReason\022#\n\037DUNGEON_ENTRY_BLO" +
      "CK_REASON_NONE\020\000\022$\n DUNGEON_ENTRY_BLOCK_" +
      "REASON_LEVEL\020\001\022$\n DUNGEON_ENTRY_BLOCK_RE" +
      "ASON_QUEST\020\002\022\'\n#DUNGEON_ENTRY_BLOCK_REAS" +
      "ON_MULTIPLE\020\003B\036\n\034emu.grasscutter.net.new" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
