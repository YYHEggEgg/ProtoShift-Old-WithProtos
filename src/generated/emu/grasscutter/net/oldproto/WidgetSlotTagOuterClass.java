// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetSlotTag.proto

package emu.grasscutter.net.oldproto;

public final class WidgetSlotTagOuterClass {
  private WidgetSlotTagOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code WidgetSlotTag}
   */
  public enum WidgetSlotTag
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>WIDGET_SLOT_TAG_QUICK_USE = 0;</code>
     */
    WIDGET_SLOT_TAG_QUICK_USE(0),
    /**
     * <code>WIDGET_SLOT_TAG_ATTACH_AVATAR = 1;</code>
     */
    WIDGET_SLOT_TAG_ATTACH_AVATAR(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>WIDGET_SLOT_TAG_QUICK_USE = 0;</code>
     */
    public static final int WIDGET_SLOT_TAG_QUICK_USE_VALUE = 0;
    /**
     * <code>WIDGET_SLOT_TAG_ATTACH_AVATAR = 1;</code>
     */
    public static final int WIDGET_SLOT_TAG_ATTACH_AVATAR_VALUE = 1;


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
    public static WidgetSlotTag valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static WidgetSlotTag forNumber(int value) {
      switch (value) {
        case 0: return WIDGET_SLOT_TAG_QUICK_USE;
        case 1: return WIDGET_SLOT_TAG_ATTACH_AVATAR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WidgetSlotTag>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        WidgetSlotTag> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<WidgetSlotTag>() {
            public WidgetSlotTag findValueByNumber(int number) {
              return WidgetSlotTag.forNumber(number);
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
      return emu.grasscutter.net.oldproto.WidgetSlotTagOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final WidgetSlotTag[] VALUES = values();

    public static WidgetSlotTag valueOf(
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

    private WidgetSlotTag(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:WidgetSlotTag)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023WidgetSlotTag.proto*Q\n\rWidgetSlotTag\022\035" +
      "\n\031WIDGET_SLOT_TAG_QUICK_USE\020\000\022!\n\035WIDGET_" +
      "SLOT_TAG_ATTACH_AVATAR\020\001B\036\n\034emu.grasscut" +
      "ter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
