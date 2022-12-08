// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatHistoryNotify.proto

package emu.grasscutter.net.newproto;

public final class ChatHistoryNotifyOuterClass {
  private ChatHistoryNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChatHistoryNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChatHistoryNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 channel_id = 1;</code>
     * @return The channelId.
     */
    int getChannelId();

    /**
     * <code>repeated .ChatInfo chat_info = 9;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo> 
        getChatInfoList();
    /**
     * <code>repeated .ChatInfo chat_info = 9;</code>
     */
    emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo getChatInfo(int index);
    /**
     * <code>repeated .ChatInfo chat_info = 9;</code>
     */
    int getChatInfoCount();
    /**
     * <code>repeated .ChatInfo chat_info = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfoOrBuilder> 
        getChatInfoOrBuilderList();
    /**
     * <code>repeated .ChatInfo chat_info = 9;</code>
     */
    emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3309;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ChatHistoryNotify}
   */
  public static final class ChatHistoryNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChatHistoryNotify)
      ChatHistoryNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChatHistoryNotify.newBuilder() to construct.
    private ChatHistoryNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChatHistoryNotify() {
      chatInfo_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChatHistoryNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.internal_static_ChatHistoryNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.internal_static_ChatHistoryNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify.class, emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify.Builder.class);
    }

    public static final int CHANNEL_ID_FIELD_NUMBER = 1;
    private int channelId_;
    /**
     * <code>uint32 channel_id = 1;</code>
     * @return The channelId.
     */
    @java.lang.Override
    public int getChannelId() {
      return channelId_;
    }

    public static final int CHAT_INFO_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo> chatInfo_;
    /**
     * <code>repeated .ChatInfo chat_info = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo> getChatInfoList() {
      return chatInfo_;
    }
    /**
     * <code>repeated .ChatInfo chat_info = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfoOrBuilder> 
        getChatInfoOrBuilderList() {
      return chatInfo_;
    }
    /**
     * <code>repeated .ChatInfo chat_info = 9;</code>
     */
    @java.lang.Override
    public int getChatInfoCount() {
      return chatInfo_.size();
    }
    /**
     * <code>repeated .ChatInfo chat_info = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo getChatInfo(int index) {
      return chatInfo_.get(index);
    }
    /**
     * <code>repeated .ChatInfo chat_info = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder(
        int index) {
      return chatInfo_.get(index);
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
      if (channelId_ != 0) {
        output.writeUInt32(1, channelId_);
      }
      for (int i = 0; i < chatInfo_.size(); i++) {
        output.writeMessage(9, chatInfo_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (channelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, channelId_);
      }
      for (int i = 0; i < chatInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, chatInfo_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify other = (emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify) obj;

      if (getChannelId()
          != other.getChannelId()) return false;
      if (!getChatInfoList()
          .equals(other.getChatInfoList())) return false;
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
      hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChannelId();
      if (getChatInfoCount() > 0) {
        hash = (37 * hash) + CHAT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getChatInfoList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify prototype) {
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
     *   CMD_ID = 3309;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ChatHistoryNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChatHistoryNotify)
        emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.internal_static_ChatHistoryNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.internal_static_ChatHistoryNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify.class, emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        channelId_ = 0;

        if (chatInfoBuilder_ == null) {
          chatInfo_ = java.util.Collections.emptyList();
        } else {
          chatInfo_ = null;
          chatInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.internal_static_ChatHistoryNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify build() {
        emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify buildPartial() {
        emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify result = new emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify(this);
        int from_bitField0_ = bitField0_;
        result.channelId_ = channelId_;
        if (chatInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            chatInfo_ = java.util.Collections.unmodifiableList(chatInfo_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.chatInfo_ = chatInfo_;
        } else {
          result.chatInfo_ = chatInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify other) {
        if (other == emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify.getDefaultInstance()) return this;
        if (other.getChannelId() != 0) {
          setChannelId(other.getChannelId());
        }
        if (chatInfoBuilder_ == null) {
          if (!other.chatInfo_.isEmpty()) {
            if (chatInfo_.isEmpty()) {
              chatInfo_ = other.chatInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureChatInfoIsMutable();
              chatInfo_.addAll(other.chatInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.chatInfo_.isEmpty()) {
            if (chatInfoBuilder_.isEmpty()) {
              chatInfoBuilder_.dispose();
              chatInfoBuilder_ = null;
              chatInfo_ = other.chatInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
              chatInfoBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getChatInfoFieldBuilder() : null;
            } else {
              chatInfoBuilder_.addAllMessages(other.chatInfo_);
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
              case 8: {
                channelId_ = input.readUInt32();

                break;
              } // case 8
              case 74: {
                emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo.parser(),
                        extensionRegistry);
                if (chatInfoBuilder_ == null) {
                  ensureChatInfoIsMutable();
                  chatInfo_.add(m);
                } else {
                  chatInfoBuilder_.addMessage(m);
                }
                break;
              } // case 74
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

      private int channelId_ ;
      /**
       * <code>uint32 channel_id = 1;</code>
       * @return The channelId.
       */
      @java.lang.Override
      public int getChannelId() {
        return channelId_;
      }
      /**
       * <code>uint32 channel_id = 1;</code>
       * @param value The channelId to set.
       * @return This builder for chaining.
       */
      public Builder setChannelId(int value) {
        
        channelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 channel_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearChannelId() {
        
        channelId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo> chatInfo_ =
        java.util.Collections.emptyList();
      private void ensureChatInfoIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          chatInfo_ = new java.util.ArrayList<emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo>(chatInfo_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo, emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo.Builder, emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfoOrBuilder> chatInfoBuilder_;

      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo> getChatInfoList() {
        if (chatInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(chatInfo_);
        } else {
          return chatInfoBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public int getChatInfoCount() {
        if (chatInfoBuilder_ == null) {
          return chatInfo_.size();
        } else {
          return chatInfoBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo getChatInfo(int index) {
        if (chatInfoBuilder_ == null) {
          return chatInfo_.get(index);
        } else {
          return chatInfoBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public Builder setChatInfo(
          int index, emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo value) {
        if (chatInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChatInfoIsMutable();
          chatInfo_.set(index, value);
          onChanged();
        } else {
          chatInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public Builder setChatInfo(
          int index, emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo.Builder builderForValue) {
        if (chatInfoBuilder_ == null) {
          ensureChatInfoIsMutable();
          chatInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          chatInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public Builder addChatInfo(emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo value) {
        if (chatInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChatInfoIsMutable();
          chatInfo_.add(value);
          onChanged();
        } else {
          chatInfoBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public Builder addChatInfo(
          int index, emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo value) {
        if (chatInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChatInfoIsMutable();
          chatInfo_.add(index, value);
          onChanged();
        } else {
          chatInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public Builder addChatInfo(
          emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo.Builder builderForValue) {
        if (chatInfoBuilder_ == null) {
          ensureChatInfoIsMutable();
          chatInfo_.add(builderForValue.build());
          onChanged();
        } else {
          chatInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public Builder addChatInfo(
          int index, emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo.Builder builderForValue) {
        if (chatInfoBuilder_ == null) {
          ensureChatInfoIsMutable();
          chatInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          chatInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public Builder addAllChatInfo(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo> values) {
        if (chatInfoBuilder_ == null) {
          ensureChatInfoIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, chatInfo_);
          onChanged();
        } else {
          chatInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public Builder clearChatInfo() {
        if (chatInfoBuilder_ == null) {
          chatInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          chatInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public Builder removeChatInfo(int index) {
        if (chatInfoBuilder_ == null) {
          ensureChatInfoIsMutable();
          chatInfo_.remove(index);
          onChanged();
        } else {
          chatInfoBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo.Builder getChatInfoBuilder(
          int index) {
        return getChatInfoFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder(
          int index) {
        if (chatInfoBuilder_ == null) {
          return chatInfo_.get(index);  } else {
          return chatInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfoOrBuilder> 
           getChatInfoOrBuilderList() {
        if (chatInfoBuilder_ != null) {
          return chatInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(chatInfo_);
        }
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo.Builder addChatInfoBuilder() {
        return getChatInfoFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo.Builder addChatInfoBuilder(
          int index) {
        return getChatInfoFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ChatInfo chat_info = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo.Builder> 
           getChatInfoBuilderList() {
        return getChatInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo, emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo.Builder, emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfoOrBuilder> 
          getChatInfoFieldBuilder() {
        if (chatInfoBuilder_ == null) {
          chatInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo, emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfo.Builder, emu.grasscutter.net.newproto.ChatInfoOuterClass.ChatInfoOrBuilder>(
                  chatInfo_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          chatInfo_ = null;
        }
        return chatInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ChatHistoryNotify)
    }

    // @@protoc_insertion_point(class_scope:ChatHistoryNotify)
    private static final emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify();
    }

    public static emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChatHistoryNotify>
        PARSER = new com.google.protobuf.AbstractParser<ChatHistoryNotify>() {
      @java.lang.Override
      public ChatHistoryNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChatHistoryNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChatHistoryNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ChatHistoryNotifyOuterClass.ChatHistoryNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatHistoryNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChatHistoryNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ChatHistoryNotify.proto\032\016ChatInfo.prot" +
      "o\"E\n\021ChatHistoryNotify\022\022\n\nchannel_id\030\001 \001" +
      "(\r\022\034\n\tchat_info\030\t \003(\0132\t.ChatInfoB\036\n\034emu." +
      "grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ChatInfoOuterClass.getDescriptor(),
        });
    internal_static_ChatHistoryNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChatHistoryNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChatHistoryNotify_descriptor,
        new java.lang.String[] { "ChannelId", "ChatInfo", });
    emu.grasscutter.net.newproto.ChatInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
