// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusConfirmCardNotify.proto

package emu.grasscutter.net.newproto;

public final class InBattleMechanicusConfirmCardNotifyOuterClass {
  private InBattleMechanicusConfirmCardNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InBattleMechanicusConfirmCardNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InBattleMechanicusConfirmCardNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 group_id = 11;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 player_uid = 12;</code>
     * @return The playerUid.
     */
    int getPlayerUid();

    /**
     * <code>uint32 card_id = 8;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>uint32 play_index = 13;</code>
     * @return The playIndex.
     */
    int getPlayIndex();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5348;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code InBattleMechanicusConfirmCardNotify}
   */
  public static final class InBattleMechanicusConfirmCardNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InBattleMechanicusConfirmCardNotify)
      InBattleMechanicusConfirmCardNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleMechanicusConfirmCardNotify.newBuilder() to construct.
    private InBattleMechanicusConfirmCardNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleMechanicusConfirmCardNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleMechanicusConfirmCardNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.internal_static_InBattleMechanicusConfirmCardNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.internal_static_InBattleMechanicusConfirmCardNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify.class, emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify.Builder.class);
    }

    public static final int GROUP_ID_FIELD_NUMBER = 11;
    private int groupId_;
    /**
     * <code>uint32 group_id = 11;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int PLAYER_UID_FIELD_NUMBER = 12;
    private int playerUid_;
    /**
     * <code>uint32 player_uid = 12;</code>
     * @return The playerUid.
     */
    @java.lang.Override
    public int getPlayerUid() {
      return playerUid_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 8;
    private int cardId_;
    /**
     * <code>uint32 card_id = 8;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
    }

    public static final int PLAY_INDEX_FIELD_NUMBER = 13;
    private int playIndex_;
    /**
     * <code>uint32 play_index = 13;</code>
     * @return The playIndex.
     */
    @java.lang.Override
    public int getPlayIndex() {
      return playIndex_;
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
      if (cardId_ != 0) {
        output.writeUInt32(8, cardId_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(11, groupId_);
      }
      if (playerUid_ != 0) {
        output.writeUInt32(12, playerUid_);
      }
      if (playIndex_ != 0) {
        output.writeUInt32(13, playIndex_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, cardId_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, groupId_);
      }
      if (playerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, playerUid_);
      }
      if (playIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, playIndex_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify other = (emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify) obj;

      if (getGroupId()
          != other.getGroupId()) return false;
      if (getPlayerUid()
          != other.getPlayerUid()) return false;
      if (getCardId()
          != other.getCardId()) return false;
      if (getPlayIndex()
          != other.getPlayIndex()) return false;
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
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + PLAYER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerUid();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (37 * hash) + PLAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getPlayIndex();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify prototype) {
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
     *   CMD_ID = 5348;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code InBattleMechanicusConfirmCardNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleMechanicusConfirmCardNotify)
        emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.internal_static_InBattleMechanicusConfirmCardNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.internal_static_InBattleMechanicusConfirmCardNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify.class, emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        groupId_ = 0;

        playerUid_ = 0;

        cardId_ = 0;

        playIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.internal_static_InBattleMechanicusConfirmCardNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify build() {
        emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify buildPartial() {
        emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify result = new emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify(this);
        result.groupId_ = groupId_;
        result.playerUid_ = playerUid_;
        result.cardId_ = cardId_;
        result.playIndex_ = playIndex_;
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
        if (other instanceof emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify other) {
        if (other == emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify.getDefaultInstance()) return this;
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getPlayerUid() != 0) {
          setPlayerUid(other.getPlayerUid());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
        }
        if (other.getPlayIndex() != 0) {
          setPlayIndex(other.getPlayIndex());
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
              case 64: {
                cardId_ = input.readUInt32();

                break;
              } // case 64
              case 88: {
                groupId_ = input.readUInt32();

                break;
              } // case 88
              case 96: {
                playerUid_ = input.readUInt32();

                break;
              } // case 96
              case 104: {
                playIndex_ = input.readUInt32();

                break;
              } // case 104
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

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 11;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 11;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int playerUid_ ;
      /**
       * <code>uint32 player_uid = 12;</code>
       * @return The playerUid.
       */
      @java.lang.Override
      public int getPlayerUid() {
        return playerUid_;
      }
      /**
       * <code>uint32 player_uid = 12;</code>
       * @param value The playerUid to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerUid(int value) {
        
        playerUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 player_uid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerUid() {
        
        playerUid_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 8;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 8;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
        return this;
      }

      private int playIndex_ ;
      /**
       * <code>uint32 play_index = 13;</code>
       * @return The playIndex.
       */
      @java.lang.Override
      public int getPlayIndex() {
        return playIndex_;
      }
      /**
       * <code>uint32 play_index = 13;</code>
       * @param value The playIndex to set.
       * @return This builder for chaining.
       */
      public Builder setPlayIndex(int value) {
        
        playIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 play_index = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayIndex() {
        
        playIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InBattleMechanicusConfirmCardNotify)
    }

    // @@protoc_insertion_point(class_scope:InBattleMechanicusConfirmCardNotify)
    private static final emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify();
    }

    public static emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InBattleMechanicusConfirmCardNotify>
        PARSER = new com.google.protobuf.AbstractParser<InBattleMechanicusConfirmCardNotify>() {
      @java.lang.Override
      public InBattleMechanicusConfirmCardNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<InBattleMechanicusConfirmCardNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleMechanicusConfirmCardNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.InBattleMechanicusConfirmCardNotifyOuterClass.InBattleMechanicusConfirmCardNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleMechanicusConfirmCardNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleMechanicusConfirmCardNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)InBattleMechanicusConfirmCardNotify.pr" +
      "oto\"p\n#InBattleMechanicusConfirmCardNoti" +
      "fy\022\020\n\010group_id\030\013 \001(\r\022\022\n\nplayer_uid\030\014 \001(\r" +
      "\022\017\n\007card_id\030\010 \001(\r\022\022\n\nplay_index\030\r \001(\rB\036\n" +
      "\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InBattleMechanicusConfirmCardNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InBattleMechanicusConfirmCardNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleMechanicusConfirmCardNotify_descriptor,
        new java.lang.String[] { "GroupId", "PlayerUid", "CardId", "PlayIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
