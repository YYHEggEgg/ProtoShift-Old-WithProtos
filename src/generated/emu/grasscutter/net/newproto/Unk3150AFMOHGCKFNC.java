// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_AFMOHGCKFNC.proto

package emu.grasscutter.net.newproto;

public final class Unk3150AFMOHGCKFNC {
  private Unk3150AFMOHGCKFNC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code Unk3150_AFMOHGCKFNC}
   */
  public enum Unk3150_AFMOHGCKFNC
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unk3150_AFMOHGCKFNC_Unk3150_FBJILPONICB = 0;</code>
     */
    Unk3150_AFMOHGCKFNC_Unk3150_FBJILPONICB(0),
    /**
     * <code>Unk3150_AFMOHGCKFNC_Unk3150_NEHCEHPIBDA = 1;</code>
     */
    Unk3150_AFMOHGCKFNC_Unk3150_NEHCEHPIBDA(1),
    /**
     * <code>Unk3150_AFMOHGCKFNC_Unk3150_HFGGCFBICIP = 2;</code>
     */
    Unk3150_AFMOHGCKFNC_Unk3150_HFGGCFBICIP(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>Unk3150_AFMOHGCKFNC_Unk3150_FBJILPONICB = 0;</code>
     */
    public static final int Unk3150_AFMOHGCKFNC_Unk3150_FBJILPONICB_VALUE = 0;
    /**
     * <code>Unk3150_AFMOHGCKFNC_Unk3150_NEHCEHPIBDA = 1;</code>
     */
    public static final int Unk3150_AFMOHGCKFNC_Unk3150_NEHCEHPIBDA_VALUE = 1;
    /**
     * <code>Unk3150_AFMOHGCKFNC_Unk3150_HFGGCFBICIP = 2;</code>
     */
    public static final int Unk3150_AFMOHGCKFNC_Unk3150_HFGGCFBICIP_VALUE = 2;


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
    public static Unk3150_AFMOHGCKFNC valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Unk3150_AFMOHGCKFNC forNumber(int value) {
      switch (value) {
        case 0: return Unk3150_AFMOHGCKFNC_Unk3150_FBJILPONICB;
        case 1: return Unk3150_AFMOHGCKFNC_Unk3150_NEHCEHPIBDA;
        case 2: return Unk3150_AFMOHGCKFNC_Unk3150_HFGGCFBICIP;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Unk3150_AFMOHGCKFNC>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Unk3150_AFMOHGCKFNC> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Unk3150_AFMOHGCKFNC>() {
            public Unk3150_AFMOHGCKFNC findValueByNumber(int number) {
              return Unk3150_AFMOHGCKFNC.forNumber(number);
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
      return emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.getDescriptor().getEnumTypes().get(0);
    }

    private static final Unk3150_AFMOHGCKFNC[] VALUES = values();

    public static Unk3150_AFMOHGCKFNC valueOf(
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

    private Unk3150_AFMOHGCKFNC(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Unk3150_AFMOHGCKFNC)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_AFMOHGCKFNC.proto*\234\001\n\023Unk3150_" +
      "AFMOHGCKFNC\022+\n\'Unk3150_AFMOHGCKFNC_Unk31" +
      "50_FBJILPONICB\020\000\022+\n\'Unk3150_AFMOHGCKFNC_" +
      "Unk3150_NEHCEHPIBDA\020\001\022+\n\'Unk3150_AFMOHGC" +
      "KFNC_Unk3150_HFGGCFBICIP\020\002B\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
