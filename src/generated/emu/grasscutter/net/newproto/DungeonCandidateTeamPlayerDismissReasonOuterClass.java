// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamPlayerDismissReason.proto

package emu.grasscutter.net.newproto;

public final class DungeonCandidateTeamPlayerDismissReasonOuterClass {
  private DungeonCandidateTeamPlayerDismissReasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code DungeonCandidateTeamPlayerDismissReason}
   */
  public enum DungeonCandidateTeamPlayerDismissReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_NORMAL = 0;</code>
     */
    DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_NORMAL(0),
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_DIE = 1;</code>
     */
    DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_DIE(1),
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_DISCONNECT = 2;</code>
     */
    DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_DISCONNECT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_NORMAL = 0;</code>
     */
    public static final int DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_NORMAL_VALUE = 0;
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_DIE = 1;</code>
     */
    public static final int DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_DIE_VALUE = 1;
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_DISCONNECT = 2;</code>
     */
    public static final int DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_DISCONNECT_VALUE = 2;


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
    public static DungeonCandidateTeamPlayerDismissReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DungeonCandidateTeamPlayerDismissReason forNumber(int value) {
      switch (value) {
        case 0: return DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_NORMAL;
        case 1: return DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_DIE;
        case 2: return DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_DISCONNECT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DungeonCandidateTeamPlayerDismissReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DungeonCandidateTeamPlayerDismissReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DungeonCandidateTeamPlayerDismissReason>() {
            public DungeonCandidateTeamPlayerDismissReason findValueByNumber(int number) {
              return DungeonCandidateTeamPlayerDismissReason.forNumber(number);
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
      return emu.grasscutter.net.newproto.DungeonCandidateTeamPlayerDismissReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final DungeonCandidateTeamPlayerDismissReason[] VALUES = values();

    public static DungeonCandidateTeamPlayerDismissReason valueOf(
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

    private DungeonCandidateTeamPlayerDismissReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:DungeonCandidateTeamPlayerDismissReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-DungeonCandidateTeamPlayerDismissReaso" +
      "n.proto*\344\001\n\'DungeonCandidateTeamPlayerDi" +
      "smissReason\022<\n8DUNGEON_CANDIDATE_TEAM_PL" +
      "AYER_DISMISS_REASON_TPDR_NORMAL\020\000\0229\n5DUN" +
      "GEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASO" +
      "N_TPDR_DIE\020\001\022@\n<DUNGEON_CANDIDATE_TEAM_P" +
      "LAYER_DISMISS_REASON_TPDR_DISCONNECT\020\002B\036" +
      "\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
