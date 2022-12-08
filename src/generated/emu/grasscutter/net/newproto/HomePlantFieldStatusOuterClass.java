// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomePlantFieldStatus.proto

package emu.grasscutter.net.newproto;

public final class HomePlantFieldStatusOuterClass {
  private HomePlantFieldStatusOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code HomePlantFieldStatus}
   */
  public enum HomePlantFieldStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>HOME_PLANT_FIELD_STATUS_STATUE_NONE = 0;</code>
     */
    HOME_PLANT_FIELD_STATUS_STATUE_NONE(0),
    /**
     * <code>HOME_PLANT_FIELD_STATUS_STATUE_SEED = 1;</code>
     */
    HOME_PLANT_FIELD_STATUS_STATUE_SEED(1),
    /**
     * <code>HOME_PLANT_FIELD_STATUS_STATUE_SPROUT = 2;</code>
     */
    HOME_PLANT_FIELD_STATUS_STATUE_SPROUT(2),
    /**
     * <code>HOME_PLANT_FIELD_STATUS_STATUE_GATHER = 3;</code>
     */
    HOME_PLANT_FIELD_STATUS_STATUE_GATHER(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>HOME_PLANT_FIELD_STATUS_STATUE_NONE = 0;</code>
     */
    public static final int HOME_PLANT_FIELD_STATUS_STATUE_NONE_VALUE = 0;
    /**
     * <code>HOME_PLANT_FIELD_STATUS_STATUE_SEED = 1;</code>
     */
    public static final int HOME_PLANT_FIELD_STATUS_STATUE_SEED_VALUE = 1;
    /**
     * <code>HOME_PLANT_FIELD_STATUS_STATUE_SPROUT = 2;</code>
     */
    public static final int HOME_PLANT_FIELD_STATUS_STATUE_SPROUT_VALUE = 2;
    /**
     * <code>HOME_PLANT_FIELD_STATUS_STATUE_GATHER = 3;</code>
     */
    public static final int HOME_PLANT_FIELD_STATUS_STATUE_GATHER_VALUE = 3;


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
    public static HomePlantFieldStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HomePlantFieldStatus forNumber(int value) {
      switch (value) {
        case 0: return HOME_PLANT_FIELD_STATUS_STATUE_NONE;
        case 1: return HOME_PLANT_FIELD_STATUS_STATUE_SEED;
        case 2: return HOME_PLANT_FIELD_STATUS_STATUE_SPROUT;
        case 3: return HOME_PLANT_FIELD_STATUS_STATUE_GATHER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HomePlantFieldStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        HomePlantFieldStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HomePlantFieldStatus>() {
            public HomePlantFieldStatus findValueByNumber(int number) {
              return HomePlantFieldStatus.forNumber(number);
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
      return emu.grasscutter.net.newproto.HomePlantFieldStatusOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final HomePlantFieldStatus[] VALUES = values();

    public static HomePlantFieldStatus valueOf(
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

    private HomePlantFieldStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:HomePlantFieldStatus)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032HomePlantFieldStatus.proto*\276\001\n\024HomePla" +
      "ntFieldStatus\022\'\n#HOME_PLANT_FIELD_STATUS" +
      "_STATUE_NONE\020\000\022\'\n#HOME_PLANT_FIELD_STATU" +
      "S_STATUE_SEED\020\001\022)\n%HOME_PLANT_FIELD_STAT" +
      "US_STATUE_SPROUT\020\002\022)\n%HOME_PLANT_FIELD_S" +
      "TATUS_STATUE_GATHER\020\003B\036\n\034emu.grasscutter" +
      ".net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
