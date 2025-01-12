// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LuaShellNotifyType.proto

package emu.grasscutter.net.newproto;

public final class LuaShellNotifyTypeOuterClass {
  private LuaShellNotifyTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code LuaShellNotifyType}
   */
  public enum LuaShellNotifyType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>LUA_SHELL_NOTIFY_TYPE_LUASHELL_NOTIFY = 0;</code>
     */
    LUA_SHELL_NOTIFY_TYPE_LUASHELL_NOTIFY(0),
    /**
     * <code>LUA_SHELL_NOTIFY_TYPE_LUASHELL_HIDE = 1;</code>
     */
    LUA_SHELL_NOTIFY_TYPE_LUASHELL_HIDE(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>LUA_SHELL_NOTIFY_TYPE_LUASHELL_NOTIFY = 0;</code>
     */
    public static final int LUA_SHELL_NOTIFY_TYPE_LUASHELL_NOTIFY_VALUE = 0;
    /**
     * <code>LUA_SHELL_NOTIFY_TYPE_LUASHELL_HIDE = 1;</code>
     */
    public static final int LUA_SHELL_NOTIFY_TYPE_LUASHELL_HIDE_VALUE = 1;


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
    public static LuaShellNotifyType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LuaShellNotifyType forNumber(int value) {
      switch (value) {
        case 0: return LUA_SHELL_NOTIFY_TYPE_LUASHELL_NOTIFY;
        case 1: return LUA_SHELL_NOTIFY_TYPE_LUASHELL_HIDE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LuaShellNotifyType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LuaShellNotifyType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LuaShellNotifyType>() {
            public LuaShellNotifyType findValueByNumber(int number) {
              return LuaShellNotifyType.forNumber(number);
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
      return emu.grasscutter.net.newproto.LuaShellNotifyTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final LuaShellNotifyType[] VALUES = values();

    public static LuaShellNotifyType valueOf(
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

    private LuaShellNotifyType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:LuaShellNotifyType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030LuaShellNotifyType.proto*h\n\022LuaShellNo" +
      "tifyType\022)\n%LUA_SHELL_NOTIFY_TYPE_LUASHE" +
      "LL_NOTIFY\020\000\022\'\n#LUA_SHELL_NOTIFY_TYPE_LUA" +
      "SHELL_HIDE\020\001B\036\n\034emu.grasscutter.net.newp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
