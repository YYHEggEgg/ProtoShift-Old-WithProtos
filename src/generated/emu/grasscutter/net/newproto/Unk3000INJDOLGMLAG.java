// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_INJDOLGMLAG.proto

package emu.grasscutter.net.newproto;

public final class Unk3000INJDOLGMLAG {
  private Unk3000INJDOLGMLAG() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code Unk3000_INJDOLGMLAG}
   */
  public enum Unk3000_INJDOLGMLAG
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unk3000_INJDOLGMLAG_Unk3000_AHABODBKNKA = 0;</code>
     */
    Unk3000_INJDOLGMLAG_Unk3000_AHABODBKNKA(0),
    /**
     * <code>Unk3000_INJDOLGMLAG_Unk3000_IGJICIAJPFD = 1;</code>
     */
    Unk3000_INJDOLGMLAG_Unk3000_IGJICIAJPFD(1),
    /**
     * <code>Unk3000_INJDOLGMLAG_Unk3000_KEEDEFPAJJG = 2;</code>
     */
    Unk3000_INJDOLGMLAG_Unk3000_KEEDEFPAJJG(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>Unk3000_INJDOLGMLAG_Unk3000_AHABODBKNKA = 0;</code>
     */
    public static final int Unk3000_INJDOLGMLAG_Unk3000_AHABODBKNKA_VALUE = 0;
    /**
     * <code>Unk3000_INJDOLGMLAG_Unk3000_IGJICIAJPFD = 1;</code>
     */
    public static final int Unk3000_INJDOLGMLAG_Unk3000_IGJICIAJPFD_VALUE = 1;
    /**
     * <code>Unk3000_INJDOLGMLAG_Unk3000_KEEDEFPAJJG = 2;</code>
     */
    public static final int Unk3000_INJDOLGMLAG_Unk3000_KEEDEFPAJJG_VALUE = 2;


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
    public static Unk3000_INJDOLGMLAG valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Unk3000_INJDOLGMLAG forNumber(int value) {
      switch (value) {
        case 0: return Unk3000_INJDOLGMLAG_Unk3000_AHABODBKNKA;
        case 1: return Unk3000_INJDOLGMLAG_Unk3000_IGJICIAJPFD;
        case 2: return Unk3000_INJDOLGMLAG_Unk3000_KEEDEFPAJJG;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Unk3000_INJDOLGMLAG>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Unk3000_INJDOLGMLAG> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Unk3000_INJDOLGMLAG>() {
            public Unk3000_INJDOLGMLAG findValueByNumber(int number) {
              return Unk3000_INJDOLGMLAG.forNumber(number);
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
      return emu.grasscutter.net.newproto.Unk3000INJDOLGMLAG.getDescriptor().getEnumTypes().get(0);
    }

    private static final Unk3000_INJDOLGMLAG[] VALUES = values();

    public static Unk3000_INJDOLGMLAG valueOf(
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

    private Unk3000_INJDOLGMLAG(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Unk3000_INJDOLGMLAG)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_INJDOLGMLAG.proto*\234\001\n\023Unk3000_" +
      "INJDOLGMLAG\022+\n\'Unk3000_INJDOLGMLAG_Unk30" +
      "00_AHABODBKNKA\020\000\022+\n\'Unk3000_INJDOLGMLAG_" +
      "Unk3000_IGJICIAJPFD\020\001\022+\n\'Unk3000_INJDOLG" +
      "MLAG_Unk3000_KEEDEFPAJJG\020\002B\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
