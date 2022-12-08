// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestListUpdateNotify.proto

package emu.grasscutter.net.newproto;

public final class QuestListUpdateNotifyOuterClass {
  private QuestListUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestListUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestListUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Quest quest_list = 7;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.QuestOuterClass.Quest> 
        getQuestListList();
    /**
     * <code>repeated .Quest quest_list = 7;</code>
     */
    emu.grasscutter.net.newproto.QuestOuterClass.Quest getQuestList(int index);
    /**
     * <code>repeated .Quest quest_list = 7;</code>
     */
    int getQuestListCount();
    /**
     * <code>repeated .Quest quest_list = 7;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.QuestOuterClass.QuestOrBuilder> 
        getQuestListOrBuilderList();
    /**
     * <code>repeated .Quest quest_list = 7;</code>
     */
    emu.grasscutter.net.newproto.QuestOuterClass.QuestOrBuilder getQuestListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 430;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code QuestListUpdateNotify}
   */
  public static final class QuestListUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestListUpdateNotify)
      QuestListUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestListUpdateNotify.newBuilder() to construct.
    private QuestListUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestListUpdateNotify() {
      questList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestListUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.internal_static_QuestListUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.internal_static_QuestListUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify.class, emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify.Builder.class);
    }

    public static final int QUEST_LIST_FIELD_NUMBER = 7;
    private java.util.List<emu.grasscutter.net.newproto.QuestOuterClass.Quest> questList_;
    /**
     * <code>repeated .Quest quest_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.QuestOuterClass.Quest> getQuestListList() {
      return questList_;
    }
    /**
     * <code>repeated .Quest quest_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.QuestOuterClass.QuestOrBuilder> 
        getQuestListOrBuilderList() {
      return questList_;
    }
    /**
     * <code>repeated .Quest quest_list = 7;</code>
     */
    @java.lang.Override
    public int getQuestListCount() {
      return questList_.size();
    }
    /**
     * <code>repeated .Quest quest_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.QuestOuterClass.Quest getQuestList(int index) {
      return questList_.get(index);
    }
    /**
     * <code>repeated .Quest quest_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.QuestOuterClass.QuestOrBuilder getQuestListOrBuilder(
        int index) {
      return questList_.get(index);
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
      for (int i = 0; i < questList_.size(); i++) {
        output.writeMessage(7, questList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < questList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, questList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify other = (emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify) obj;

      if (!getQuestListList()
          .equals(other.getQuestListList())) return false;
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
      if (getQuestListCount() > 0) {
        hash = (37 * hash) + QUEST_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getQuestListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify prototype) {
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
     *   CMD_ID = 430;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code QuestListUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestListUpdateNotify)
        emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.internal_static_QuestListUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.internal_static_QuestListUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify.class, emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (questListBuilder_ == null) {
          questList_ = java.util.Collections.emptyList();
        } else {
          questList_ = null;
          questListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.internal_static_QuestListUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify build() {
        emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify buildPartial() {
        emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify result = new emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify(this);
        int from_bitField0_ = bitField0_;
        if (questListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            questList_ = java.util.Collections.unmodifiableList(questList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.questList_ = questList_;
        } else {
          result.questList_ = questListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify other) {
        if (other == emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify.getDefaultInstance()) return this;
        if (questListBuilder_ == null) {
          if (!other.questList_.isEmpty()) {
            if (questList_.isEmpty()) {
              questList_ = other.questList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureQuestListIsMutable();
              questList_.addAll(other.questList_);
            }
            onChanged();
          }
        } else {
          if (!other.questList_.isEmpty()) {
            if (questListBuilder_.isEmpty()) {
              questListBuilder_.dispose();
              questListBuilder_ = null;
              questList_ = other.questList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              questListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getQuestListFieldBuilder() : null;
            } else {
              questListBuilder_.addAllMessages(other.questList_);
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
              case 58: {
                emu.grasscutter.net.newproto.QuestOuterClass.Quest m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.QuestOuterClass.Quest.parser(),
                        extensionRegistry);
                if (questListBuilder_ == null) {
                  ensureQuestListIsMutable();
                  questList_.add(m);
                } else {
                  questListBuilder_.addMessage(m);
                }
                break;
              } // case 58
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

      private java.util.List<emu.grasscutter.net.newproto.QuestOuterClass.Quest> questList_ =
        java.util.Collections.emptyList();
      private void ensureQuestListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          questList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.QuestOuterClass.Quest>(questList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.QuestOuterClass.Quest, emu.grasscutter.net.newproto.QuestOuterClass.Quest.Builder, emu.grasscutter.net.newproto.QuestOuterClass.QuestOrBuilder> questListBuilder_;

      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.QuestOuterClass.Quest> getQuestListList() {
        if (questListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(questList_);
        } else {
          return questListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public int getQuestListCount() {
        if (questListBuilder_ == null) {
          return questList_.size();
        } else {
          return questListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public emu.grasscutter.net.newproto.QuestOuterClass.Quest getQuestList(int index) {
        if (questListBuilder_ == null) {
          return questList_.get(index);
        } else {
          return questListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public Builder setQuestList(
          int index, emu.grasscutter.net.newproto.QuestOuterClass.Quest value) {
        if (questListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureQuestListIsMutable();
          questList_.set(index, value);
          onChanged();
        } else {
          questListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public Builder setQuestList(
          int index, emu.grasscutter.net.newproto.QuestOuterClass.Quest.Builder builderForValue) {
        if (questListBuilder_ == null) {
          ensureQuestListIsMutable();
          questList_.set(index, builderForValue.build());
          onChanged();
        } else {
          questListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public Builder addQuestList(emu.grasscutter.net.newproto.QuestOuterClass.Quest value) {
        if (questListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureQuestListIsMutable();
          questList_.add(value);
          onChanged();
        } else {
          questListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public Builder addQuestList(
          int index, emu.grasscutter.net.newproto.QuestOuterClass.Quest value) {
        if (questListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureQuestListIsMutable();
          questList_.add(index, value);
          onChanged();
        } else {
          questListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public Builder addQuestList(
          emu.grasscutter.net.newproto.QuestOuterClass.Quest.Builder builderForValue) {
        if (questListBuilder_ == null) {
          ensureQuestListIsMutable();
          questList_.add(builderForValue.build());
          onChanged();
        } else {
          questListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public Builder addQuestList(
          int index, emu.grasscutter.net.newproto.QuestOuterClass.Quest.Builder builderForValue) {
        if (questListBuilder_ == null) {
          ensureQuestListIsMutable();
          questList_.add(index, builderForValue.build());
          onChanged();
        } else {
          questListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public Builder addAllQuestList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.QuestOuterClass.Quest> values) {
        if (questListBuilder_ == null) {
          ensureQuestListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, questList_);
          onChanged();
        } else {
          questListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public Builder clearQuestList() {
        if (questListBuilder_ == null) {
          questList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          questListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public Builder removeQuestList(int index) {
        if (questListBuilder_ == null) {
          ensureQuestListIsMutable();
          questList_.remove(index);
          onChanged();
        } else {
          questListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public emu.grasscutter.net.newproto.QuestOuterClass.Quest.Builder getQuestListBuilder(
          int index) {
        return getQuestListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public emu.grasscutter.net.newproto.QuestOuterClass.QuestOrBuilder getQuestListOrBuilder(
          int index) {
        if (questListBuilder_ == null) {
          return questList_.get(index);  } else {
          return questListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.QuestOuterClass.QuestOrBuilder> 
           getQuestListOrBuilderList() {
        if (questListBuilder_ != null) {
          return questListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(questList_);
        }
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public emu.grasscutter.net.newproto.QuestOuterClass.Quest.Builder addQuestListBuilder() {
        return getQuestListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.QuestOuterClass.Quest.getDefaultInstance());
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public emu.grasscutter.net.newproto.QuestOuterClass.Quest.Builder addQuestListBuilder(
          int index) {
        return getQuestListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.QuestOuterClass.Quest.getDefaultInstance());
      }
      /**
       * <code>repeated .Quest quest_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.QuestOuterClass.Quest.Builder> 
           getQuestListBuilderList() {
        return getQuestListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.QuestOuterClass.Quest, emu.grasscutter.net.newproto.QuestOuterClass.Quest.Builder, emu.grasscutter.net.newproto.QuestOuterClass.QuestOrBuilder> 
          getQuestListFieldBuilder() {
        if (questListBuilder_ == null) {
          questListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.QuestOuterClass.Quest, emu.grasscutter.net.newproto.QuestOuterClass.Quest.Builder, emu.grasscutter.net.newproto.QuestOuterClass.QuestOrBuilder>(
                  questList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          questList_ = null;
        }
        return questListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:QuestListUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:QuestListUpdateNotify)
    private static final emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify();
    }

    public static emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestListUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<QuestListUpdateNotify>() {
      @java.lang.Override
      public QuestListUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<QuestListUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestListUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.QuestListUpdateNotifyOuterClass.QuestListUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestListUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestListUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033QuestListUpdateNotify.proto\032\013Quest.pro" +
      "to\"3\n\025QuestListUpdateNotify\022\032\n\nquest_lis" +
      "t\030\007 \003(\0132\006.QuestB\036\n\034emu.grasscutter.net.n" +
      "ewprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.QuestOuterClass.getDescriptor(),
        });
    internal_static_QuestListUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestListUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestListUpdateNotify_descriptor,
        new java.lang.String[] { "QuestList", });
    emu.grasscutter.net.newproto.QuestOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
