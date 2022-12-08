// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExpeditionStartReq.proto

package emu.grasscutter.net.oldproto;

public final class ExpeditionStartReqOuterClass {
  private ExpeditionStartReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExpeditionStartReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExpeditionStartReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 avatar_id_list = 1;</code>
     * @return A list containing the avatarIdList.
     */
    java.util.List<java.lang.Integer> getAvatarIdListList();
    /**
     * <code>repeated uint32 avatar_id_list = 1;</code>
     * @return The count of avatarIdList.
     */
    int getAvatarIdListCount();
    /**
     * <code>repeated uint32 avatar_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The avatarIdList at the given index.
     */
    int getAvatarIdList(int index);

    /**
     * <code>uint32 assist_uid = 5;</code>
     * @return The assistUid.
     */
    int getAssistUid();

    /**
     * <code>uint32 assist_avatar_id = 8;</code>
     * @return The assistAvatarId.
     */
    int getAssistAvatarId();

    /**
     * <code>uint32 path_id = 7;</code>
     * @return The pathId.
     */
    int getPathId();
  }
  /**
   * <pre>
   * CmdId: 2087
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ExpeditionStartReq}
   */
  public static final class ExpeditionStartReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExpeditionStartReq)
      ExpeditionStartReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExpeditionStartReq.newBuilder() to construct.
    private ExpeditionStartReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExpeditionStartReq() {
      avatarIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExpeditionStartReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.internal_static_ExpeditionStartReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.internal_static_ExpeditionStartReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq.class, emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq.Builder.class);
    }

    public static final int AVATAR_ID_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList avatarIdList_;
    /**
     * <code>repeated uint32 avatar_id_list = 1;</code>
     * @return A list containing the avatarIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAvatarIdListList() {
      return avatarIdList_;
    }
    /**
     * <code>repeated uint32 avatar_id_list = 1;</code>
     * @return The count of avatarIdList.
     */
    public int getAvatarIdListCount() {
      return avatarIdList_.size();
    }
    /**
     * <code>repeated uint32 avatar_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The avatarIdList at the given index.
     */
    public int getAvatarIdList(int index) {
      return avatarIdList_.getInt(index);
    }
    private int avatarIdListMemoizedSerializedSize = -1;

    public static final int ASSIST_UID_FIELD_NUMBER = 5;
    private int assistUid_;
    /**
     * <code>uint32 assist_uid = 5;</code>
     * @return The assistUid.
     */
    @java.lang.Override
    public int getAssistUid() {
      return assistUid_;
    }

    public static final int ASSIST_AVATAR_ID_FIELD_NUMBER = 8;
    private int assistAvatarId_;
    /**
     * <code>uint32 assist_avatar_id = 8;</code>
     * @return The assistAvatarId.
     */
    @java.lang.Override
    public int getAssistAvatarId() {
      return assistAvatarId_;
    }

    public static final int PATH_ID_FIELD_NUMBER = 7;
    private int pathId_;
    /**
     * <code>uint32 path_id = 7;</code>
     * @return The pathId.
     */
    @java.lang.Override
    public int getPathId() {
      return pathId_;
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
      if (getAvatarIdListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(avatarIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < avatarIdList_.size(); i++) {
        output.writeUInt32NoTag(avatarIdList_.getInt(i));
      }
      if (assistUid_ != 0) {
        output.writeUInt32(5, assistUid_);
      }
      if (pathId_ != 0) {
        output.writeUInt32(7, pathId_);
      }
      if (assistAvatarId_ != 0) {
        output.writeUInt32(8, assistAvatarId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < avatarIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(avatarIdList_.getInt(i));
        }
        size += dataSize;
        if (!getAvatarIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        avatarIdListMemoizedSerializedSize = dataSize;
      }
      if (assistUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, assistUid_);
      }
      if (pathId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, pathId_);
      }
      if (assistAvatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, assistAvatarId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq other = (emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq) obj;

      if (!getAvatarIdListList()
          .equals(other.getAvatarIdListList())) return false;
      if (getAssistUid()
          != other.getAssistUid()) return false;
      if (getAssistAvatarId()
          != other.getAssistAvatarId()) return false;
      if (getPathId()
          != other.getPathId()) return false;
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
      if (getAvatarIdListCount() > 0) {
        hash = (37 * hash) + AVATAR_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarIdListList().hashCode();
      }
      hash = (37 * hash) + ASSIST_UID_FIELD_NUMBER;
      hash = (53 * hash) + getAssistUid();
      hash = (37 * hash) + ASSIST_AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAssistAvatarId();
      hash = (37 * hash) + PATH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPathId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq prototype) {
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
     * CmdId: 2087
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ExpeditionStartReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExpeditionStartReq)
        emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.internal_static_ExpeditionStartReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.internal_static_ExpeditionStartReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq.class, emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        avatarIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        assistUid_ = 0;

        assistAvatarId_ = 0;

        pathId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.internal_static_ExpeditionStartReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq build() {
        emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq buildPartial() {
        emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq result = new emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          avatarIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.avatarIdList_ = avatarIdList_;
        result.assistUid_ = assistUid_;
        result.assistAvatarId_ = assistAvatarId_;
        result.pathId_ = pathId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq other) {
        if (other == emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq.getDefaultInstance()) return this;
        if (!other.avatarIdList_.isEmpty()) {
          if (avatarIdList_.isEmpty()) {
            avatarIdList_ = other.avatarIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAvatarIdListIsMutable();
            avatarIdList_.addAll(other.avatarIdList_);
          }
          onChanged();
        }
        if (other.getAssistUid() != 0) {
          setAssistUid(other.getAssistUid());
        }
        if (other.getAssistAvatarId() != 0) {
          setAssistAvatarId(other.getAssistAvatarId());
        }
        if (other.getPathId() != 0) {
          setPathId(other.getPathId());
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
                int v = input.readUInt32();
                ensureAvatarIdListIsMutable();
                avatarIdList_.addInt(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAvatarIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  avatarIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 10
              case 40: {
                assistUid_ = input.readUInt32();

                break;
              } // case 40
              case 56: {
                pathId_ = input.readUInt32();

                break;
              } // case 56
              case 64: {
                assistAvatarId_ = input.readUInt32();

                break;
              } // case 64
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

      private com.google.protobuf.Internal.IntList avatarIdList_ = emptyIntList();
      private void ensureAvatarIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarIdList_ = mutableCopy(avatarIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 avatar_id_list = 1;</code>
       * @return A list containing the avatarIdList.
       */
      public java.util.List<java.lang.Integer>
          getAvatarIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(avatarIdList_) : avatarIdList_;
      }
      /**
       * <code>repeated uint32 avatar_id_list = 1;</code>
       * @return The count of avatarIdList.
       */
      public int getAvatarIdListCount() {
        return avatarIdList_.size();
      }
      /**
       * <code>repeated uint32 avatar_id_list = 1;</code>
       * @param index The index of the element to return.
       * @return The avatarIdList at the given index.
       */
      public int getAvatarIdList(int index) {
        return avatarIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 avatar_id_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The avatarIdList to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarIdList(
          int index, int value) {
        ensureAvatarIdListIsMutable();
        avatarIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 avatar_id_list = 1;</code>
       * @param value The avatarIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAvatarIdList(int value) {
        ensureAvatarIdListIsMutable();
        avatarIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 avatar_id_list = 1;</code>
       * @param values The avatarIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAvatarIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAvatarIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, avatarIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 avatar_id_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarIdList() {
        avatarIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int assistUid_ ;
      /**
       * <code>uint32 assist_uid = 5;</code>
       * @return The assistUid.
       */
      @java.lang.Override
      public int getAssistUid() {
        return assistUid_;
      }
      /**
       * <code>uint32 assist_uid = 5;</code>
       * @param value The assistUid to set.
       * @return This builder for chaining.
       */
      public Builder setAssistUid(int value) {
        
        assistUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 assist_uid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAssistUid() {
        
        assistUid_ = 0;
        onChanged();
        return this;
      }

      private int assistAvatarId_ ;
      /**
       * <code>uint32 assist_avatar_id = 8;</code>
       * @return The assistAvatarId.
       */
      @java.lang.Override
      public int getAssistAvatarId() {
        return assistAvatarId_;
      }
      /**
       * <code>uint32 assist_avatar_id = 8;</code>
       * @param value The assistAvatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAssistAvatarId(int value) {
        
        assistAvatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 assist_avatar_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearAssistAvatarId() {
        
        assistAvatarId_ = 0;
        onChanged();
        return this;
      }

      private int pathId_ ;
      /**
       * <code>uint32 path_id = 7;</code>
       * @return The pathId.
       */
      @java.lang.Override
      public int getPathId() {
        return pathId_;
      }
      /**
       * <code>uint32 path_id = 7;</code>
       * @param value The pathId to set.
       * @return This builder for chaining.
       */
      public Builder setPathId(int value) {
        
        pathId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 path_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearPathId() {
        
        pathId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ExpeditionStartReq)
    }

    // @@protoc_insertion_point(class_scope:ExpeditionStartReq)
    private static final emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq();
    }

    public static emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExpeditionStartReq>
        PARSER = new com.google.protobuf.AbstractParser<ExpeditionStartReq>() {
      @java.lang.Override
      public ExpeditionStartReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ExpeditionStartReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExpeditionStartReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ExpeditionStartReqOuterClass.ExpeditionStartReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExpeditionStartReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExpeditionStartReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ExpeditionStartReq.proto\"k\n\022Expedition" +
      "StartReq\022\026\n\016avatar_id_list\030\001 \003(\r\022\022\n\nassi" +
      "st_uid\030\005 \001(\r\022\030\n\020assist_avatar_id\030\010 \001(\r\022\017" +
      "\n\007path_id\030\007 \001(\rB\036\n\034emu.grasscutter.net.o" +
      "ldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ExpeditionStartReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExpeditionStartReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExpeditionStartReq_descriptor,
        new java.lang.String[] { "AvatarIdList", "AssistUid", "AssistAvatarId", "PathId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
