// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InstableSprayEnterDungeonReq.proto

package emu.grasscutter.net.newproto;

public final class InstableSprayEnterDungeonReqOuterClass {
  private InstableSprayEnterDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InstableSprayEnterDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InstableSprayEnterDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 5;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo> 
        getAvatarInfoListList();
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
     */
    emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo getAvatarInfoList(int index);
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
     */
    int getAvatarInfoListCount();
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder> 
        getAvatarInfoListOrBuilderList();
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
     */
    emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder getAvatarInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 difficulty = 1;</code>
     * @return The difficulty.
     */
    int getDifficulty();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 21889;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code InstableSprayEnterDungeonReq}
   */
  public static final class InstableSprayEnterDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InstableSprayEnterDungeonReq)
      InstableSprayEnterDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InstableSprayEnterDungeonReq.newBuilder() to construct.
    private InstableSprayEnterDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InstableSprayEnterDungeonReq() {
      avatarInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InstableSprayEnterDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.internal_static_InstableSprayEnterDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.internal_static_InstableSprayEnterDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq.class, emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 5;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 5;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int AVATAR_INFO_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo> avatarInfoList_;
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo> getAvatarInfoListList() {
      return avatarInfoList_;
    }
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder> 
        getAvatarInfoListOrBuilderList() {
      return avatarInfoList_;
    }
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
     */
    @java.lang.Override
    public int getAvatarInfoListCount() {
      return avatarInfoList_.size();
    }
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo getAvatarInfoList(int index) {
      return avatarInfoList_.get(index);
    }
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder getAvatarInfoListOrBuilder(
        int index) {
      return avatarInfoList_.get(index);
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 1;
    private int difficulty_;
    /**
     * <code>uint32 difficulty = 1;</code>
     * @return The difficulty.
     */
    @java.lang.Override
    public int getDifficulty() {
      return difficulty_;
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
      if (difficulty_ != 0) {
        output.writeUInt32(1, difficulty_);
      }
      for (int i = 0; i < avatarInfoList_.size(); i++) {
        output.writeMessage(2, avatarInfoList_.get(i));
      }
      if (stageId_ != 0) {
        output.writeUInt32(5, stageId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, difficulty_);
      }
      for (int i = 0; i < avatarInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, avatarInfoList_.get(i));
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, stageId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq other = (emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (!getAvatarInfoListList()
          .equals(other.getAvatarInfoListList())) return false;
      if (getDifficulty()
          != other.getDifficulty()) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      if (getAvatarInfoListCount() > 0) {
        hash = (37 * hash) + AVATAR_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarInfoListList().hashCode();
      }
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq prototype) {
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
     *   CMD_ID = 21889;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code InstableSprayEnterDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InstableSprayEnterDungeonReq)
        emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.internal_static_InstableSprayEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.internal_static_InstableSprayEnterDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq.class, emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        stageId_ = 0;

        if (avatarInfoListBuilder_ == null) {
          avatarInfoList_ = java.util.Collections.emptyList();
        } else {
          avatarInfoList_ = null;
          avatarInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        difficulty_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.internal_static_InstableSprayEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq build() {
        emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq buildPartial() {
        emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq result = new emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq(this);
        int from_bitField0_ = bitField0_;
        result.stageId_ = stageId_;
        if (avatarInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            avatarInfoList_ = java.util.Collections.unmodifiableList(avatarInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.avatarInfoList_ = avatarInfoList_;
        } else {
          result.avatarInfoList_ = avatarInfoListBuilder_.build();
        }
        result.difficulty_ = difficulty_;
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
        if (other instanceof emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq) {
          return mergeFrom((emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq other) {
        if (other == emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (avatarInfoListBuilder_ == null) {
          if (!other.avatarInfoList_.isEmpty()) {
            if (avatarInfoList_.isEmpty()) {
              avatarInfoList_ = other.avatarInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAvatarInfoListIsMutable();
              avatarInfoList_.addAll(other.avatarInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.avatarInfoList_.isEmpty()) {
            if (avatarInfoListBuilder_.isEmpty()) {
              avatarInfoListBuilder_.dispose();
              avatarInfoListBuilder_ = null;
              avatarInfoList_ = other.avatarInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              avatarInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAvatarInfoListFieldBuilder() : null;
            } else {
              avatarInfoListBuilder_.addAllMessages(other.avatarInfoList_);
            }
          }
        }
        if (other.getDifficulty() != 0) {
          setDifficulty(other.getDifficulty());
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
                difficulty_ = input.readUInt32();

                break;
              } // case 8
              case 18: {
                emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.parser(),
                        extensionRegistry);
                if (avatarInfoListBuilder_ == null) {
                  ensureAvatarInfoListIsMutable();
                  avatarInfoList_.add(m);
                } else {
                  avatarInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 18
              case 40: {
                stageId_ = input.readUInt32();

                break;
              } // case 40
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

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 5;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 5;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo> avatarInfoList_ =
        java.util.Collections.emptyList();
      private void ensureAvatarInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarInfoList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo>(avatarInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo, emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder, emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder> avatarInfoListBuilder_;

      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo> getAvatarInfoListList() {
        if (avatarInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(avatarInfoList_);
        } else {
          return avatarInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public int getAvatarInfoListCount() {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.size();
        } else {
          return avatarInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo getAvatarInfoList(int index) {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.get(index);
        } else {
          return avatarInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public Builder setAvatarInfoList(
          int index, emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.set(index, value);
          onChanged();
        } else {
          avatarInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public Builder setAvatarInfoList(
          int index, emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public Builder addAvatarInfoList(emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(value);
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public Builder addAvatarInfoList(
          int index, emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(index, value);
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public Builder addAvatarInfoList(
          emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public Builder addAvatarInfoList(
          int index, emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public Builder addAllAvatarInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo> values) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, avatarInfoList_);
          onChanged();
        } else {
          avatarInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public Builder clearAvatarInfoList() {
        if (avatarInfoListBuilder_ == null) {
          avatarInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          avatarInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public Builder removeAvatarInfoList(int index) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.remove(index);
          onChanged();
        } else {
          avatarInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder getAvatarInfoListBuilder(
          int index) {
        return getAvatarInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder getAvatarInfoListOrBuilder(
          int index) {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.get(index);  } else {
          return avatarInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder> 
           getAvatarInfoListOrBuilderList() {
        if (avatarInfoListBuilder_ != null) {
          return avatarInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(avatarInfoList_);
        }
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder addAvatarInfoListBuilder() {
        return getAvatarInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder addAvatarInfoListBuilder(
          int index) {
        return getAvatarInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder> 
           getAvatarInfoListBuilderList() {
        return getAvatarInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo, emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder, emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder> 
          getAvatarInfoListFieldBuilder() {
        if (avatarInfoListBuilder_ == null) {
          avatarInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo, emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder, emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder>(
                  avatarInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          avatarInfoList_ = null;
        }
        return avatarInfoListBuilder_;
      }

      private int difficulty_ ;
      /**
       * <code>uint32 difficulty = 1;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public int getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>uint32 difficulty = 1;</code>
       * @param value The difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficulty(int value) {
        
        difficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        
        difficulty_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InstableSprayEnterDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:InstableSprayEnterDungeonReq)
    private static final emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq();
    }

    public static emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InstableSprayEnterDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<InstableSprayEnterDungeonReq>() {
      @java.lang.Override
      public InstableSprayEnterDungeonReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<InstableSprayEnterDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InstableSprayEnterDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.InstableSprayEnterDungeonReqOuterClass.InstableSprayEnterDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InstableSprayEnterDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InstableSprayEnterDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"InstableSprayEnterDungeonReq.proto\032\035In" +
      "stableSprayAvatarInfo.proto\"x\n\034InstableS" +
      "prayEnterDungeonReq\022\020\n\010stage_id\030\005 \001(\r\0222\n" +
      "\020avatar_info_list\030\002 \003(\0132\030.InstableSprayA" +
      "vatarInfo\022\022\n\ndifficulty\030\001 \001(\rB\036\n\034emu.gra" +
      "sscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.getDescriptor(),
        });
    internal_static_InstableSprayEnterDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InstableSprayEnterDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InstableSprayEnterDungeonReq_descriptor,
        new java.lang.String[] { "StageId", "AvatarInfoList", "Difficulty", });
    emu.grasscutter.net.newproto.InstableSprayAvatarInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
