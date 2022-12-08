// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReportReasonType.proto

package emu.grasscutter.net.oldproto;

public final class ReportReasonTypeOuterClass {
  private ReportReasonTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ReportReasonType}
   */
  public enum ReportReasonType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>REPORT_REASON_TYPE_NONE = 0;</code>
     */
    REPORT_REASON_TYPE_NONE(0),
    /**
     * <code>REPORT_REASON_TYPE_DECEPTIVE_ADS = 1;</code>
     */
    REPORT_REASON_TYPE_DECEPTIVE_ADS(1),
    /**
     * <code>REPORT_REASON_TYPE_ABUSING = 2;</code>
     */
    REPORT_REASON_TYPE_ABUSING(2),
    /**
     * <code>REPORT_REASON_TYPE_CHEAT = 3;</code>
     */
    REPORT_REASON_TYPE_CHEAT(3),
    /**
     * <code>REPORT_REASON_TYPE_POLITICAL = 4;</code>
     */
    REPORT_REASON_TYPE_POLITICAL(4),
    /**
     * <code>REPORT_REASON_TYPE_OTHER = 5;</code>
     */
    REPORT_REASON_TYPE_OTHER(5),
    /**
     * <code>REPORT_REASON_TYPE_HOME = 6;</code>
     */
    REPORT_REASON_TYPE_HOME(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>REPORT_REASON_TYPE_NONE = 0;</code>
     */
    public static final int REPORT_REASON_TYPE_NONE_VALUE = 0;
    /**
     * <code>REPORT_REASON_TYPE_DECEPTIVE_ADS = 1;</code>
     */
    public static final int REPORT_REASON_TYPE_DECEPTIVE_ADS_VALUE = 1;
    /**
     * <code>REPORT_REASON_TYPE_ABUSING = 2;</code>
     */
    public static final int REPORT_REASON_TYPE_ABUSING_VALUE = 2;
    /**
     * <code>REPORT_REASON_TYPE_CHEAT = 3;</code>
     */
    public static final int REPORT_REASON_TYPE_CHEAT_VALUE = 3;
    /**
     * <code>REPORT_REASON_TYPE_POLITICAL = 4;</code>
     */
    public static final int REPORT_REASON_TYPE_POLITICAL_VALUE = 4;
    /**
     * <code>REPORT_REASON_TYPE_OTHER = 5;</code>
     */
    public static final int REPORT_REASON_TYPE_OTHER_VALUE = 5;
    /**
     * <code>REPORT_REASON_TYPE_HOME = 6;</code>
     */
    public static final int REPORT_REASON_TYPE_HOME_VALUE = 6;


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
    public static ReportReasonType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ReportReasonType forNumber(int value) {
      switch (value) {
        case 0: return REPORT_REASON_TYPE_NONE;
        case 1: return REPORT_REASON_TYPE_DECEPTIVE_ADS;
        case 2: return REPORT_REASON_TYPE_ABUSING;
        case 3: return REPORT_REASON_TYPE_CHEAT;
        case 4: return REPORT_REASON_TYPE_POLITICAL;
        case 5: return REPORT_REASON_TYPE_OTHER;
        case 6: return REPORT_REASON_TYPE_HOME;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ReportReasonType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ReportReasonType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ReportReasonType>() {
            public ReportReasonType findValueByNumber(int number) {
              return ReportReasonType.forNumber(number);
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
      return emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ReportReasonType[] VALUES = values();

    public static ReportReasonType valueOf(
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

    private ReportReasonType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ReportReasonType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ReportReasonType.proto*\360\001\n\020ReportReaso" +
      "nType\022\033\n\027REPORT_REASON_TYPE_NONE\020\000\022$\n RE" +
      "PORT_REASON_TYPE_DECEPTIVE_ADS\020\001\022\036\n\032REPO" +
      "RT_REASON_TYPE_ABUSING\020\002\022\034\n\030REPORT_REASO" +
      "N_TYPE_CHEAT\020\003\022 \n\034REPORT_REASON_TYPE_POL" +
      "ITICAL\020\004\022\034\n\030REPORT_REASON_TYPE_OTHER\020\005\022\033" +
      "\n\027REPORT_REASON_TYPE_HOME\020\006B\036\n\034emu.grass" +
      "cutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
