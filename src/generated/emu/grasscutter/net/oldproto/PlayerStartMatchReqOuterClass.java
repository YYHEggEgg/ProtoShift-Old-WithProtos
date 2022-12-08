// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerStartMatchReq.proto

package emu.grasscutter.net.oldproto;

public final class PlayerStartMatchReqOuterClass {
  private PlayerStartMatchReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerStartMatchReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerStartMatchReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    int getMatchTypeValue();
    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The matchType.
     */
    emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType getMatchType();

    /**
     * <code>uint32 mechanicus_difficult_level = 12;</code>
     * @return The mechanicusDifficultLevel.
     */
    int getMechanicusDifficultLevel();

    /**
     * <code>repeated uint32 match_param_list = 11;</code>
     * @return A list containing the matchParamList.
     */
    java.util.List<java.lang.Integer> getMatchParamListList();
    /**
     * <code>repeated uint32 match_param_list = 11;</code>
     * @return The count of matchParamList.
     */
    int getMatchParamListCount();
    /**
     * <code>repeated uint32 match_param_list = 11;</code>
     * @param index The index of the element to return.
     * @return The matchParamList at the given index.
     */
    int getMatchParamList(int index);

    /**
     * <code>uint32 dungeon_id = 1;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 mp_play_id = 15;</code>
     * @return The mpPlayId.
     */
    int getMpPlayId();

    /**
     * <code>uint32 match_id = 6;</code>
     * @return The matchId.
     */
    int getMatchId();
  }
  /**
   * <pre>
   * CmdId: 4176
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code PlayerStartMatchReq}
   */
  public static final class PlayerStartMatchReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerStartMatchReq)
      PlayerStartMatchReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerStartMatchReq.newBuilder() to construct.
    private PlayerStartMatchReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerStartMatchReq() {
      matchType_ = 0;
      matchParamList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerStartMatchReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.internal_static_PlayerStartMatchReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.internal_static_PlayerStartMatchReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq.class, emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq.Builder.class);
    }

    public static final int MATCH_TYPE_FIELD_NUMBER = 3;
    private int matchType_;
    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    @java.lang.Override public int getMatchTypeValue() {
      return matchType_;
    }
    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The matchType.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType getMatchType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType result = emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
      return result == null ? emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
    }

    public static final int MECHANICUS_DIFFICULT_LEVEL_FIELD_NUMBER = 12;
    private int mechanicusDifficultLevel_;
    /**
     * <code>uint32 mechanicus_difficult_level = 12;</code>
     * @return The mechanicusDifficultLevel.
     */
    @java.lang.Override
    public int getMechanicusDifficultLevel() {
      return mechanicusDifficultLevel_;
    }

    public static final int MATCH_PARAM_LIST_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList matchParamList_;
    /**
     * <code>repeated uint32 match_param_list = 11;</code>
     * @return A list containing the matchParamList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMatchParamListList() {
      return matchParamList_;
    }
    /**
     * <code>repeated uint32 match_param_list = 11;</code>
     * @return The count of matchParamList.
     */
    public int getMatchParamListCount() {
      return matchParamList_.size();
    }
    /**
     * <code>repeated uint32 match_param_list = 11;</code>
     * @param index The index of the element to return.
     * @return The matchParamList at the given index.
     */
    public int getMatchParamList(int index) {
      return matchParamList_.getInt(index);
    }
    private int matchParamListMemoizedSerializedSize = -1;

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

    public static final int MP_PLAY_ID_FIELD_NUMBER = 15;
    private int mpPlayId_;
    /**
     * <code>uint32 mp_play_id = 15;</code>
     * @return The mpPlayId.
     */
    @java.lang.Override
    public int getMpPlayId() {
      return mpPlayId_;
    }

    public static final int MATCH_ID_FIELD_NUMBER = 6;
    private int matchId_;
    /**
     * <code>uint32 match_id = 6;</code>
     * @return The matchId.
     */
    @java.lang.Override
    public int getMatchId() {
      return matchId_;
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
      getSerializedSize();
      if (dungeonId_ != 0) {
        output.writeUInt32(1, dungeonId_);
      }
      if (matchType_ != emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        output.writeEnum(3, matchType_);
      }
      if (matchId_ != 0) {
        output.writeUInt32(6, matchId_);
      }
      if (getMatchParamListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(matchParamListMemoizedSerializedSize);
      }
      for (int i = 0; i < matchParamList_.size(); i++) {
        output.writeUInt32NoTag(matchParamList_.getInt(i));
      }
      if (mechanicusDifficultLevel_ != 0) {
        output.writeUInt32(12, mechanicusDifficultLevel_);
      }
      if (mpPlayId_ != 0) {
        output.writeUInt32(15, mpPlayId_);
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
      if (matchType_ != emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, matchType_);
      }
      if (matchId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, matchId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < matchParamList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(matchParamList_.getInt(i));
        }
        size += dataSize;
        if (!getMatchParamListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        matchParamListMemoizedSerializedSize = dataSize;
      }
      if (mechanicusDifficultLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, mechanicusDifficultLevel_);
      }
      if (mpPlayId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, mpPlayId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq other = (emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq) obj;

      if (matchType_ != other.matchType_) return false;
      if (getMechanicusDifficultLevel()
          != other.getMechanicusDifficultLevel()) return false;
      if (!getMatchParamListList()
          .equals(other.getMatchParamListList())) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getMpPlayId()
          != other.getMpPlayId()) return false;
      if (getMatchId()
          != other.getMatchId()) return false;
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
      hash = (37 * hash) + MATCH_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + matchType_;
      hash = (37 * hash) + MECHANICUS_DIFFICULT_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getMechanicusDifficultLevel();
      if (getMatchParamListCount() > 0) {
        hash = (37 * hash) + MATCH_PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMatchParamListList().hashCode();
      }
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + MP_PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMpPlayId();
      hash = (37 * hash) + MATCH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq prototype) {
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
     * CmdId: 4176
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code PlayerStartMatchReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerStartMatchReq)
        emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.internal_static_PlayerStartMatchReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.internal_static_PlayerStartMatchReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq.class, emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        matchType_ = 0;

        mechanicusDifficultLevel_ = 0;

        matchParamList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonId_ = 0;

        mpPlayId_ = 0;

        matchId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.internal_static_PlayerStartMatchReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq build() {
        emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq buildPartial() {
        emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq result = new emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq(this);
        int from_bitField0_ = bitField0_;
        result.matchType_ = matchType_;
        result.mechanicusDifficultLevel_ = mechanicusDifficultLevel_;
        if (((bitField0_ & 0x00000001) != 0)) {
          matchParamList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.matchParamList_ = matchParamList_;
        result.dungeonId_ = dungeonId_;
        result.mpPlayId_ = mpPlayId_;
        result.matchId_ = matchId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq other) {
        if (other == emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq.getDefaultInstance()) return this;
        if (other.matchType_ != 0) {
          setMatchTypeValue(other.getMatchTypeValue());
        }
        if (other.getMechanicusDifficultLevel() != 0) {
          setMechanicusDifficultLevel(other.getMechanicusDifficultLevel());
        }
        if (!other.matchParamList_.isEmpty()) {
          if (matchParamList_.isEmpty()) {
            matchParamList_ = other.matchParamList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMatchParamListIsMutable();
            matchParamList_.addAll(other.matchParamList_);
          }
          onChanged();
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getMpPlayId() != 0) {
          setMpPlayId(other.getMpPlayId());
        }
        if (other.getMatchId() != 0) {
          setMatchId(other.getMatchId());
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
                matchType_ = input.readEnum();

                break;
              } // case 24
              case 48: {
                matchId_ = input.readUInt32();

                break;
              } // case 48
              case 88: {
                int v = input.readUInt32();
                ensureMatchParamListIsMutable();
                matchParamList_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureMatchParamListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  matchParamList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 90
              case 96: {
                mechanicusDifficultLevel_ = input.readUInt32();

                break;
              } // case 96
              case 120: {
                mpPlayId_ = input.readUInt32();

                break;
              } // case 120
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
      private int bitField0_;

      private int matchType_ = 0;
      /**
       * <code>.MatchType match_type = 3;</code>
       * @return The enum numeric value on the wire for matchType.
       */
      @java.lang.Override public int getMatchTypeValue() {
        return matchType_;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @param value The enum numeric value on the wire for matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchTypeValue(int value) {
        
        matchType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @return The matchType.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType getMatchType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType result = emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
        return result == null ? emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @param value The matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchType(emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        matchType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchType() {
        
        matchType_ = 0;
        onChanged();
        return this;
      }

      private int mechanicusDifficultLevel_ ;
      /**
       * <code>uint32 mechanicus_difficult_level = 12;</code>
       * @return The mechanicusDifficultLevel.
       */
      @java.lang.Override
      public int getMechanicusDifficultLevel() {
        return mechanicusDifficultLevel_;
      }
      /**
       * <code>uint32 mechanicus_difficult_level = 12;</code>
       * @param value The mechanicusDifficultLevel to set.
       * @return This builder for chaining.
       */
      public Builder setMechanicusDifficultLevel(int value) {
        
        mechanicusDifficultLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mechanicus_difficult_level = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearMechanicusDifficultLevel() {
        
        mechanicusDifficultLevel_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList matchParamList_ = emptyIntList();
      private void ensureMatchParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          matchParamList_ = mutableCopy(matchParamList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 match_param_list = 11;</code>
       * @return A list containing the matchParamList.
       */
      public java.util.List<java.lang.Integer>
          getMatchParamListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(matchParamList_) : matchParamList_;
      }
      /**
       * <code>repeated uint32 match_param_list = 11;</code>
       * @return The count of matchParamList.
       */
      public int getMatchParamListCount() {
        return matchParamList_.size();
      }
      /**
       * <code>repeated uint32 match_param_list = 11;</code>
       * @param index The index of the element to return.
       * @return The matchParamList at the given index.
       */
      public int getMatchParamList(int index) {
        return matchParamList_.getInt(index);
      }
      /**
       * <code>repeated uint32 match_param_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The matchParamList to set.
       * @return This builder for chaining.
       */
      public Builder setMatchParamList(
          int index, int value) {
        ensureMatchParamListIsMutable();
        matchParamList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 match_param_list = 11;</code>
       * @param value The matchParamList to add.
       * @return This builder for chaining.
       */
      public Builder addMatchParamList(int value) {
        ensureMatchParamListIsMutable();
        matchParamList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 match_param_list = 11;</code>
       * @param values The matchParamList to add.
       * @return This builder for chaining.
       */
      public Builder addAllMatchParamList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMatchParamListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, matchParamList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 match_param_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchParamList() {
        matchParamList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
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

      private int mpPlayId_ ;
      /**
       * <code>uint32 mp_play_id = 15;</code>
       * @return The mpPlayId.
       */
      @java.lang.Override
      public int getMpPlayId() {
        return mpPlayId_;
      }
      /**
       * <code>uint32 mp_play_id = 15;</code>
       * @param value The mpPlayId to set.
       * @return This builder for chaining.
       */
      public Builder setMpPlayId(int value) {
        
        mpPlayId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mp_play_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearMpPlayId() {
        
        mpPlayId_ = 0;
        onChanged();
        return this;
      }

      private int matchId_ ;
      /**
       * <code>uint32 match_id = 6;</code>
       * @return The matchId.
       */
      @java.lang.Override
      public int getMatchId() {
        return matchId_;
      }
      /**
       * <code>uint32 match_id = 6;</code>
       * @param value The matchId to set.
       * @return This builder for chaining.
       */
      public Builder setMatchId(int value) {
        
        matchId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 match_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchId() {
        
        matchId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerStartMatchReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerStartMatchReq)
    private static final emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq();
    }

    public static emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerStartMatchReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerStartMatchReq>() {
      @java.lang.Override
      public PlayerStartMatchReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerStartMatchReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerStartMatchReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.PlayerStartMatchReqOuterClass.PlayerStartMatchReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerStartMatchReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerStartMatchReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031PlayerStartMatchReq.proto\032\017MatchType.p" +
      "roto\"\255\001\n\023PlayerStartMatchReq\022\036\n\nmatch_ty" +
      "pe\030\003 \001(\0162\n.MatchType\022\"\n\032mechanicus_diffi" +
      "cult_level\030\014 \001(\r\022\030\n\020match_param_list\030\013 \003" +
      "(\r\022\022\n\ndungeon_id\030\001 \001(\r\022\022\n\nmp_play_id\030\017 \001" +
      "(\r\022\020\n\010match_id\030\006 \001(\rB\036\n\034emu.grasscutter." +
      "net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.MatchTypeOuterClass.getDescriptor(),
        });
    internal_static_PlayerStartMatchReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerStartMatchReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerStartMatchReq_descriptor,
        new java.lang.String[] { "MatchType", "MechanicusDifficultLevel", "MatchParamList", "DungeonId", "MpPlayId", "MatchId", });
    emu.grasscutter.net.oldproto.MatchTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
