// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MapMarkTipsType.proto

package emu.grasscutter.net.newproto;

public final class MapMarkTipsTypeOuterClass {
  private MapMarkTipsTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code MapMarkTipsType}
   */
  public enum MapMarkTipsType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MAP_MARK_TIPS_TYPE_DUNGEON_ELEMENT_TRIAL = 0;</code>
     */
    MAP_MARK_TIPS_TYPE_DUNGEON_ELEMENT_TRIAL(0),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MAP_MARK_TIPS_TYPE_DUNGEON_ELEMENT_TRIAL = 0;</code>
     */
    public static final int MAP_MARK_TIPS_TYPE_DUNGEON_ELEMENT_TRIAL_VALUE = 0;


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
    public static MapMarkTipsType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MapMarkTipsType forNumber(int value) {
      switch (value) {
        case 0: return MAP_MARK_TIPS_TYPE_DUNGEON_ELEMENT_TRIAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MapMarkTipsType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MapMarkTipsType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MapMarkTipsType>() {
            public MapMarkTipsType findValueByNumber(int number) {
              return MapMarkTipsType.forNumber(number);
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
      return emu.grasscutter.net.newproto.MapMarkTipsTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MapMarkTipsType[] VALUES = values();

    public static MapMarkTipsType valueOf(
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

    private MapMarkTipsType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MapMarkTipsType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025MapMarkTipsType.proto*?\n\017MapMarkTipsTy" +
      "pe\022,\n(MAP_MARK_TIPS_TYPE_DUNGEON_ELEMENT" +
      "_TRIAL\020\000B\036\n\034emu.grasscutter.net.newproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
