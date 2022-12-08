// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MatchType.proto

package emu.grasscutter.net.oldproto;

public final class MatchTypeOuterClass {
  private MatchTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code MatchType}
   */
  public enum MatchType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MATCH_TYPE_NONE = 0;</code>
     */
    MATCH_TYPE_NONE(0),
    /**
     * <code>MATCH_TYPE_DUNGEON = 1;</code>
     */
    MATCH_TYPE_DUNGEON(1),
    /**
     * <code>MATCH_TYPE_MP_PLAY = 2;</code>
     */
    MATCH_TYPE_MP_PLAY(2),
    /**
     * <code>MATCH_TYPE_MECHANICUS = 3;</code>
     */
    MATCH_TYPE_MECHANICUS(3),
    /**
     * <code>MATCH_TYPE_GENERAL = 4;</code>
     */
    MATCH_TYPE_GENERAL(4),
    /**
     * <code>MATCH_TYPE_GCG = 5;</code>
     */
    MATCH_TYPE_GCG(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MATCH_TYPE_NONE = 0;</code>
     */
    public static final int MATCH_TYPE_NONE_VALUE = 0;
    /**
     * <code>MATCH_TYPE_DUNGEON = 1;</code>
     */
    public static final int MATCH_TYPE_DUNGEON_VALUE = 1;
    /**
     * <code>MATCH_TYPE_MP_PLAY = 2;</code>
     */
    public static final int MATCH_TYPE_MP_PLAY_VALUE = 2;
    /**
     * <code>MATCH_TYPE_MECHANICUS = 3;</code>
     */
    public static final int MATCH_TYPE_MECHANICUS_VALUE = 3;
    /**
     * <code>MATCH_TYPE_GENERAL = 4;</code>
     */
    public static final int MATCH_TYPE_GENERAL_VALUE = 4;
    /**
     * <code>MATCH_TYPE_GCG = 5;</code>
     */
    public static final int MATCH_TYPE_GCG_VALUE = 5;


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
    public static MatchType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MatchType forNumber(int value) {
      switch (value) {
        case 0: return MATCH_TYPE_NONE;
        case 1: return MATCH_TYPE_DUNGEON;
        case 2: return MATCH_TYPE_MP_PLAY;
        case 3: return MATCH_TYPE_MECHANICUS;
        case 4: return MATCH_TYPE_GENERAL;
        case 5: return MATCH_TYPE_GCG;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MatchType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MatchType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MatchType>() {
            public MatchType findValueByNumber(int number) {
              return MatchType.forNumber(number);
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
      return emu.grasscutter.net.oldproto.MatchTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MatchType[] VALUES = values();

    public static MatchType valueOf(
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

    private MatchType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MatchType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017MatchType.proto*\227\001\n\tMatchType\022\023\n\017MATCH" +
      "_TYPE_NONE\020\000\022\026\n\022MATCH_TYPE_DUNGEON\020\001\022\026\n\022" +
      "MATCH_TYPE_MP_PLAY\020\002\022\031\n\025MATCH_TYPE_MECHA" +
      "NICUS\020\003\022\026\n\022MATCH_TYPE_GENERAL\020\004\022\022\n\016MATCH" +
      "_TYPE_GCG\020\005B\036\n\034emu.grasscutter.net.oldpr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
