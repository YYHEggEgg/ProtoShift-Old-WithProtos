// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerStartMatchRsp.proto

package emu.grasscutter.net.newproto;

public final class PlayerStartMatchRspOuterClass {
  private PlayerStartMatchRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerStartMatchRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerStartMatchRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 1;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 match_id = 12;</code>
     * @return The matchId.
     */
    int getMatchId();

    /**
     * <code>.MatchType match_type = 10;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    int getMatchTypeValue();
    /**
     * <code>.MatchType match_type = 10;</code>
     * @return The matchType.
     */
    emu.grasscutter.net.newproto.MatchTypeOuterClass.MatchType getMatchType();

    /**
     * <code>uint32 punish_end_time = 8;</code>
     * @return The punishEndTime.
     */
    int getPunishEndTime();

    /**
     * <code>uint32 mp_play_id = 11;</code>
     * @return The mpPlayId.
     */
    int getMpPlayId();

    /**
     * <code>uint32 param = 7;</code>
     * @return The param.
     */
    int getParam();

    /**
     * <code>uint32 mechanicus_difficult_level = 3;</code>
     * @return The mechanicusDifficultLevel.
     */
    int getMechanicusDifficultLevel();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4191;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerStartMatchRsp}
   */
  public static final class PlayerStartMatchRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerStartMatchRsp)
      PlayerStartMatchRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerStartMatchRsp.newBuilder() to construct.
    private PlayerStartMatchRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerStartMatchRsp() {
      matchType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerStartMatchRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.internal_static_PlayerStartMatchRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.internal_static_PlayerStartMatchRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp.class, emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 1;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 1;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int MATCH_ID_FIELD_NUMBER = 12;
    private int matchId_;
    /**
     * <code>uint32 match_id = 12;</code>
     * @return The matchId.
     */
    @java.lang.Override
    public int getMatchId() {
      return matchId_;
    }

    public static final int MATCH_TYPE_FIELD_NUMBER = 10;
    private int matchType_;
    /**
     * <code>.MatchType match_type = 10;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    @java.lang.Override public int getMatchTypeValue() {
      return matchType_;
    }
    /**
     * <code>.MatchType match_type = 10;</code>
     * @return The matchType.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.MatchTypeOuterClass.MatchType getMatchType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.MatchTypeOuterClass.MatchType result = emu.grasscutter.net.newproto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
      return result == null ? emu.grasscutter.net.newproto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
    }

    public static final int PUNISH_END_TIME_FIELD_NUMBER = 8;
    private int punishEndTime_;
    /**
     * <code>uint32 punish_end_time = 8;</code>
     * @return The punishEndTime.
     */
    @java.lang.Override
    public int getPunishEndTime() {
      return punishEndTime_;
    }

    public static final int MP_PLAY_ID_FIELD_NUMBER = 11;
    private int mpPlayId_;
    /**
     * <code>uint32 mp_play_id = 11;</code>
     * @return The mpPlayId.
     */
    @java.lang.Override
    public int getMpPlayId() {
      return mpPlayId_;
    }

    public static final int PARAM_FIELD_NUMBER = 7;
    private int param_;
    /**
     * <code>uint32 param = 7;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
    }

    public static final int MECHANICUS_DIFFICULT_LEVEL_FIELD_NUMBER = 3;
    private int mechanicusDifficultLevel_;
    /**
     * <code>uint32 mechanicus_difficult_level = 3;</code>
     * @return The mechanicusDifficultLevel.
     */
    @java.lang.Override
    public int getMechanicusDifficultLevel() {
      return mechanicusDifficultLevel_;
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (dungeonId_ != 0) {
        output.writeUInt32(1, dungeonId_);
      }
      if (mechanicusDifficultLevel_ != 0) {
        output.writeUInt32(3, mechanicusDifficultLevel_);
      }
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (param_ != 0) {
        output.writeUInt32(7, param_);
      }
      if (punishEndTime_ != 0) {
        output.writeUInt32(8, punishEndTime_);
      }
      if (matchType_ != emu.grasscutter.net.newproto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        output.writeEnum(10, matchType_);
      }
      if (mpPlayId_ != 0) {
        output.writeUInt32(11, mpPlayId_);
      }
      if (matchId_ != 0) {
        output.writeUInt32(12, matchId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, dungeonId_);
      }
      if (mechanicusDifficultLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, mechanicusDifficultLevel_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, param_);
      }
      if (punishEndTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, punishEndTime_);
      }
      if (matchType_ != emu.grasscutter.net.newproto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(10, matchType_);
      }
      if (mpPlayId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, mpPlayId_);
      }
      if (matchId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, matchId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp other = (emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getMatchId()
          != other.getMatchId()) return false;
      if (matchType_ != other.matchType_) return false;
      if (getPunishEndTime()
          != other.getPunishEndTime()) return false;
      if (getMpPlayId()
          != other.getMpPlayId()) return false;
      if (getParam()
          != other.getParam()) return false;
      if (getMechanicusDifficultLevel()
          != other.getMechanicusDifficultLevel()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + MATCH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchId();
      hash = (37 * hash) + MATCH_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + matchType_;
      hash = (37 * hash) + PUNISH_END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getPunishEndTime();
      hash = (37 * hash) + MP_PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMpPlayId();
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (37 * hash) + MECHANICUS_DIFFICULT_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getMechanicusDifficultLevel();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 4191;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerStartMatchRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerStartMatchRsp)
        emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.internal_static_PlayerStartMatchRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.internal_static_PlayerStartMatchRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp.class, emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dungeonId_ = 0;

        matchId_ = 0;

        matchType_ = 0;

        punishEndTime_ = 0;

        mpPlayId_ = 0;

        param_ = 0;

        mechanicusDifficultLevel_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.internal_static_PlayerStartMatchRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp build() {
        emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp buildPartial() {
        emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp result = new emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp(this);
        result.dungeonId_ = dungeonId_;
        result.matchId_ = matchId_;
        result.matchType_ = matchType_;
        result.punishEndTime_ = punishEndTime_;
        result.mpPlayId_ = mpPlayId_;
        result.param_ = param_;
        result.mechanicusDifficultLevel_ = mechanicusDifficultLevel_;
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp other) {
        if (other == emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getMatchId() != 0) {
          setMatchId(other.getMatchId());
        }
        if (other.matchType_ != 0) {
          setMatchTypeValue(other.getMatchTypeValue());
        }
        if (other.getPunishEndTime() != 0) {
          setPunishEndTime(other.getPunishEndTime());
        }
        if (other.getMpPlayId() != 0) {
          setMpPlayId(other.getMpPlayId());
        }
        if (other.getParam() != 0) {
          setParam(other.getParam());
        }
        if (other.getMechanicusDifficultLevel() != 0) {
          setMechanicusDifficultLevel(other.getMechanicusDifficultLevel());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                dungeonId_ = input.readUInt32();

                break;
              } // case 8
              case 24: {
                mechanicusDifficultLevel_ = input.readUInt32();

                break;
              } // case 24
              case 48: {
                retcode_ = input.readInt32();

                break;
              } // case 48
              case 56: {
                param_ = input.readUInt32();

                break;
              } // case 56
              case 64: {
                punishEndTime_ = input.readUInt32();

                break;
              } // case 64
              case 80: {
                matchType_ = input.readEnum();

                break;
              } // case 80
              case 88: {
                mpPlayId_ = input.readUInt32();

                break;
              } // case 88
              case 96: {
                matchId_ = input.readUInt32();

                break;
              } // case 96
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 1;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 1;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int matchId_ ;
      /**
       * <code>uint32 match_id = 12;</code>
       * @return The matchId.
       */
      @java.lang.Override
      public int getMatchId() {
        return matchId_;
      }
      /**
       * <code>uint32 match_id = 12;</code>
       * @param value The matchId to set.
       * @return This builder for chaining.
       */
      public Builder setMatchId(int value) {
        
        matchId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 match_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchId() {
        
        matchId_ = 0;
        onChanged();
        return this;
      }

      private int matchType_ = 0;
      /**
       * <code>.MatchType match_type = 10;</code>
       * @return The enum numeric value on the wire for matchType.
       */
      @java.lang.Override public int getMatchTypeValue() {
        return matchType_;
      }
      /**
       * <code>.MatchType match_type = 10;</code>
       * @param value The enum numeric value on the wire for matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchTypeValue(int value) {
        
        matchType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 10;</code>
       * @return The matchType.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.MatchTypeOuterClass.MatchType getMatchType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.MatchTypeOuterClass.MatchType result = emu.grasscutter.net.newproto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
        return result == null ? emu.grasscutter.net.newproto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
      }
      /**
       * <code>.MatchType match_type = 10;</code>
       * @param value The matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchType(emu.grasscutter.net.newproto.MatchTypeOuterClass.MatchType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        matchType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchType() {
        
        matchType_ = 0;
        onChanged();
        return this;
      }

      private int punishEndTime_ ;
      /**
       * <code>uint32 punish_end_time = 8;</code>
       * @return The punishEndTime.
       */
      @java.lang.Override
      public int getPunishEndTime() {
        return punishEndTime_;
      }
      /**
       * <code>uint32 punish_end_time = 8;</code>
       * @param value The punishEndTime to set.
       * @return This builder for chaining.
       */
      public Builder setPunishEndTime(int value) {
        
        punishEndTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 punish_end_time = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearPunishEndTime() {
        
        punishEndTime_ = 0;
        onChanged();
        return this;
      }

      private int mpPlayId_ ;
      /**
       * <code>uint32 mp_play_id = 11;</code>
       * @return The mpPlayId.
       */
      @java.lang.Override
      public int getMpPlayId() {
        return mpPlayId_;
      }
      /**
       * <code>uint32 mp_play_id = 11;</code>
       * @param value The mpPlayId to set.
       * @return This builder for chaining.
       */
      public Builder setMpPlayId(int value) {
        
        mpPlayId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mp_play_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearMpPlayId() {
        
        mpPlayId_ = 0;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 7;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 7;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        
        param_ = 0;
        onChanged();
        return this;
      }

      private int mechanicusDifficultLevel_ ;
      /**
       * <code>uint32 mechanicus_difficult_level = 3;</code>
       * @return The mechanicusDifficultLevel.
       */
      @java.lang.Override
      public int getMechanicusDifficultLevel() {
        return mechanicusDifficultLevel_;
      }
      /**
       * <code>uint32 mechanicus_difficult_level = 3;</code>
       * @param value The mechanicusDifficultLevel to set.
       * @return This builder for chaining.
       */
      public Builder setMechanicusDifficultLevel(int value) {
        
        mechanicusDifficultLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mechanicus_difficult_level = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMechanicusDifficultLevel() {
        
        mechanicusDifficultLevel_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PlayerStartMatchRsp)
    }

    // @@protoc_insertion_point(class_scope:PlayerStartMatchRsp)
    private static final emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp();
    }

    public static emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerStartMatchRsp>
        PARSER = new com.google.protobuf.AbstractParser<PlayerStartMatchRsp>() {
      @java.lang.Override
      public PlayerStartMatchRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<PlayerStartMatchRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerStartMatchRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PlayerStartMatchRspOuterClass.PlayerStartMatchRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerStartMatchRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerStartMatchRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031PlayerStartMatchRsp.proto\032\017MatchType.p" +
      "roto\"\314\001\n\023PlayerStartMatchRsp\022\022\n\ndungeon_" +
      "id\030\001 \001(\r\022\020\n\010match_id\030\014 \001(\r\022\036\n\nmatch_type" +
      "\030\n \001(\0162\n.MatchType\022\027\n\017punish_end_time\030\010 " +
      "\001(\r\022\022\n\nmp_play_id\030\013 \001(\r\022\r\n\005param\030\007 \001(\r\022\"" +
      "\n\032mechanicus_difficult_level\030\003 \001(\r\022\017\n\007re" +
      "tcode\030\006 \001(\005B\036\n\034emu.grasscutter.net.newpr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.MatchTypeOuterClass.getDescriptor(),
        });
    internal_static_PlayerStartMatchRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerStartMatchRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerStartMatchRsp_descriptor,
        new java.lang.String[] { "DungeonId", "MatchId", "MatchType", "PunishEndTime", "MpPlayId", "Param", "MechanicusDifficultLevel", "Retcode", });
    emu.grasscutter.net.newproto.MatchTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
