// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WorldPlayerRTTNotify.proto

package emu.grasscutter.net.oldproto;

public final class WorldPlayerRTTNotifyOuterClass {
  private WorldPlayerRTTNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorldPlayerRTTNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorldPlayerRTTNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo> 
        getPlayerRttListList();
    /**
     * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
     */
    emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo getPlayerRttList(int index);
    /**
     * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
     */
    int getPlayerRttListCount();
    /**
     * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder> 
        getPlayerRttListOrBuilderList();
    /**
     * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
     */
    emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder getPlayerRttListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 22
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code WorldPlayerRTTNotify}
   */
  public static final class WorldPlayerRTTNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WorldPlayerRTTNotify)
      WorldPlayerRTTNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WorldPlayerRTTNotify.newBuilder() to construct.
    private WorldPlayerRTTNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WorldPlayerRTTNotify() {
      playerRttList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WorldPlayerRTTNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.internal_static_WorldPlayerRTTNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.internal_static_WorldPlayerRTTNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify.class, emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify.Builder.class);
    }

    public static final int PLAYER_RTT_LIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo> playerRttList_;
    /**
     * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo> getPlayerRttListList() {
      return playerRttList_;
    }
    /**
     * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder> 
        getPlayerRttListOrBuilderList() {
      return playerRttList_;
    }
    /**
     * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
     */
    @java.lang.Override
    public int getPlayerRttListCount() {
      return playerRttList_.size();
    }
    /**
     * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo getPlayerRttList(int index) {
      return playerRttList_.get(index);
    }
    /**
     * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder getPlayerRttListOrBuilder(
        int index) {
      return playerRttList_.get(index);
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
      for (int i = 0; i < playerRttList_.size(); i++) {
        output.writeMessage(1, playerRttList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < playerRttList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, playerRttList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify other = (emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify) obj;

      if (!getPlayerRttListList()
          .equals(other.getPlayerRttListList())) return false;
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
      if (getPlayerRttListCount() > 0) {
        hash = (37 * hash) + PLAYER_RTT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerRttListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify prototype) {
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
     * CmdId: 22
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code WorldPlayerRTTNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorldPlayerRTTNotify)
        emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.internal_static_WorldPlayerRTTNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.internal_static_WorldPlayerRTTNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify.class, emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (playerRttListBuilder_ == null) {
          playerRttList_ = java.util.Collections.emptyList();
        } else {
          playerRttList_ = null;
          playerRttListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.internal_static_WorldPlayerRTTNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify build() {
        emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify buildPartial() {
        emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify result = new emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify(this);
        int from_bitField0_ = bitField0_;
        if (playerRttListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            playerRttList_ = java.util.Collections.unmodifiableList(playerRttList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.playerRttList_ = playerRttList_;
        } else {
          result.playerRttList_ = playerRttListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify other) {
        if (other == emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify.getDefaultInstance()) return this;
        if (playerRttListBuilder_ == null) {
          if (!other.playerRttList_.isEmpty()) {
            if (playerRttList_.isEmpty()) {
              playerRttList_ = other.playerRttList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePlayerRttListIsMutable();
              playerRttList_.addAll(other.playerRttList_);
            }
            onChanged();
          }
        } else {
          if (!other.playerRttList_.isEmpty()) {
            if (playerRttListBuilder_.isEmpty()) {
              playerRttListBuilder_.dispose();
              playerRttListBuilder_ = null;
              playerRttList_ = other.playerRttList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              playerRttListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlayerRttListFieldBuilder() : null;
            } else {
              playerRttListBuilder_.addAllMessages(other.playerRttList_);
            }
          }
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
              case 10: {
                emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo.parser(),
                        extensionRegistry);
                if (playerRttListBuilder_ == null) {
                  ensurePlayerRttListIsMutable();
                  playerRttList_.add(m);
                } else {
                  playerRttListBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

      private java.util.List<emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo> playerRttList_ =
        java.util.Collections.emptyList();
      private void ensurePlayerRttListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          playerRttList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo>(playerRttList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo, emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder, emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder> playerRttListBuilder_;

      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo> getPlayerRttListList() {
        if (playerRttListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(playerRttList_);
        } else {
          return playerRttListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public int getPlayerRttListCount() {
        if (playerRttListBuilder_ == null) {
          return playerRttList_.size();
        } else {
          return playerRttListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo getPlayerRttList(int index) {
        if (playerRttListBuilder_ == null) {
          return playerRttList_.get(index);
        } else {
          return playerRttListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public Builder setPlayerRttList(
          int index, emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo value) {
        if (playerRttListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerRttListIsMutable();
          playerRttList_.set(index, value);
          onChanged();
        } else {
          playerRttListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public Builder setPlayerRttList(
          int index, emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder builderForValue) {
        if (playerRttListBuilder_ == null) {
          ensurePlayerRttListIsMutable();
          playerRttList_.set(index, builderForValue.build());
          onChanged();
        } else {
          playerRttListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public Builder addPlayerRttList(emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo value) {
        if (playerRttListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerRttListIsMutable();
          playerRttList_.add(value);
          onChanged();
        } else {
          playerRttListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public Builder addPlayerRttList(
          int index, emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo value) {
        if (playerRttListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerRttListIsMutable();
          playerRttList_.add(index, value);
          onChanged();
        } else {
          playerRttListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public Builder addPlayerRttList(
          emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder builderForValue) {
        if (playerRttListBuilder_ == null) {
          ensurePlayerRttListIsMutable();
          playerRttList_.add(builderForValue.build());
          onChanged();
        } else {
          playerRttListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public Builder addPlayerRttList(
          int index, emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder builderForValue) {
        if (playerRttListBuilder_ == null) {
          ensurePlayerRttListIsMutable();
          playerRttList_.add(index, builderForValue.build());
          onChanged();
        } else {
          playerRttListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public Builder addAllPlayerRttList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo> values) {
        if (playerRttListBuilder_ == null) {
          ensurePlayerRttListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, playerRttList_);
          onChanged();
        } else {
          playerRttListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public Builder clearPlayerRttList() {
        if (playerRttListBuilder_ == null) {
          playerRttList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          playerRttListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public Builder removePlayerRttList(int index) {
        if (playerRttListBuilder_ == null) {
          ensurePlayerRttListIsMutable();
          playerRttList_.remove(index);
          onChanged();
        } else {
          playerRttListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder getPlayerRttListBuilder(
          int index) {
        return getPlayerRttListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder getPlayerRttListOrBuilder(
          int index) {
        if (playerRttListBuilder_ == null) {
          return playerRttList_.get(index);  } else {
          return playerRttListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder> 
           getPlayerRttListOrBuilderList() {
        if (playerRttListBuilder_ != null) {
          return playerRttListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(playerRttList_);
        }
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder addPlayerRttListBuilder() {
        return getPlayerRttListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder addPlayerRttListBuilder(
          int index) {
        return getPlayerRttListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayerRTTInfo player_rtt_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder> 
           getPlayerRttListBuilderList() {
        return getPlayerRttListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo, emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder, emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder> 
          getPlayerRttListFieldBuilder() {
        if (playerRttListBuilder_ == null) {
          playerRttListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo, emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfo.Builder, emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.PlayerRTTInfoOrBuilder>(
                  playerRttList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          playerRttList_ = null;
        }
        return playerRttListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:WorldPlayerRTTNotify)
    }

    // @@protoc_insertion_point(class_scope:WorldPlayerRTTNotify)
    private static final emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify();
    }

    public static emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorldPlayerRTTNotify>
        PARSER = new com.google.protobuf.AbstractParser<WorldPlayerRTTNotify>() {
      @java.lang.Override
      public WorldPlayerRTTNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<WorldPlayerRTTNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WorldPlayerRTTNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.WorldPlayerRTTNotifyOuterClass.WorldPlayerRTTNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldPlayerRTTNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldPlayerRTTNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032WorldPlayerRTTNotify.proto\032\023PlayerRTTI" +
      "nfo.proto\"?\n\024WorldPlayerRTTNotify\022\'\n\017pla" +
      "yer_rtt_list\030\001 \003(\0132\016.PlayerRTTInfoB\036\n\034em" +
      "u.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.getDescriptor(),
        });
    internal_static_WorldPlayerRTTNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorldPlayerRTTNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldPlayerRTTNotify_descriptor,
        new java.lang.String[] { "PlayerRttList", });
    emu.grasscutter.net.oldproto.PlayerRTTInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
