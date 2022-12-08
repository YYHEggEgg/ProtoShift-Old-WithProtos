// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetFriendShowAvatarInfoRsp.proto

package emu.grasscutter.net.newproto;

public final class GetFriendShowAvatarInfoRspOuterClass {
  private GetFriendShowAvatarInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetFriendShowAvatarInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetFriendShowAvatarInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo> 
        getShowAvatarInfoListList();
    /**
     * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
     */
    emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo getShowAvatarInfoList(int index);
    /**
     * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
     */
    int getShowAvatarInfoListCount();
    /**
     * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder> 
        getShowAvatarInfoListOrBuilderList();
    /**
     * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
     */
    emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder getShowAvatarInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 uid = 9;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4091;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GetFriendShowAvatarInfoRsp}
   */
  public static final class GetFriendShowAvatarInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetFriendShowAvatarInfoRsp)
      GetFriendShowAvatarInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetFriendShowAvatarInfoRsp.newBuilder() to construct.
    private GetFriendShowAvatarInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetFriendShowAvatarInfoRsp() {
      showAvatarInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetFriendShowAvatarInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.internal_static_GetFriendShowAvatarInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.internal_static_GetFriendShowAvatarInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp.class, emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp.Builder.class);
    }

    public static final int SHOW_AVATAR_INFO_LIST_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo> showAvatarInfoList_;
    /**
     * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo> getShowAvatarInfoListList() {
      return showAvatarInfoList_;
    }
    /**
     * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder> 
        getShowAvatarInfoListOrBuilderList() {
      return showAvatarInfoList_;
    }
    /**
     * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
     */
    @java.lang.Override
    public int getShowAvatarInfoListCount() {
      return showAvatarInfoList_.size();
    }
    /**
     * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo getShowAvatarInfoList(int index) {
      return showAvatarInfoList_.get(index);
    }
    /**
     * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder getShowAvatarInfoListOrBuilder(
        int index) {
      return showAvatarInfoList_.get(index);
    }

    public static final int UID_FIELD_NUMBER = 9;
    private int uid_;
    /**
     * <code>uint32 uid = 9;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
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
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      for (int i = 0; i < showAvatarInfoList_.size(); i++) {
        output.writeMessage(5, showAvatarInfoList_.get(i));
      }
      if (uid_ != 0) {
        output.writeUInt32(9, uid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      for (int i = 0; i < showAvatarInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, showAvatarInfoList_.get(i));
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, uid_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp other = (emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp) obj;

      if (!getShowAvatarInfoListList()
          .equals(other.getShowAvatarInfoListList())) return false;
      if (getUid()
          != other.getUid()) return false;
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
      if (getShowAvatarInfoListCount() > 0) {
        hash = (37 * hash) + SHOW_AVATAR_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getShowAvatarInfoListList().hashCode();
      }
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp prototype) {
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
     *   CMD_ID = 4091;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GetFriendShowAvatarInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetFriendShowAvatarInfoRsp)
        emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.internal_static_GetFriendShowAvatarInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.internal_static_GetFriendShowAvatarInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp.class, emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (showAvatarInfoListBuilder_ == null) {
          showAvatarInfoList_ = java.util.Collections.emptyList();
        } else {
          showAvatarInfoList_ = null;
          showAvatarInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        uid_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.internal_static_GetFriendShowAvatarInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp build() {
        emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp buildPartial() {
        emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp result = new emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp(this);
        int from_bitField0_ = bitField0_;
        if (showAvatarInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            showAvatarInfoList_ = java.util.Collections.unmodifiableList(showAvatarInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.showAvatarInfoList_ = showAvatarInfoList_;
        } else {
          result.showAvatarInfoList_ = showAvatarInfoListBuilder_.build();
        }
        result.uid_ = uid_;
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
        if (other instanceof emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp other) {
        if (other == emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp.getDefaultInstance()) return this;
        if (showAvatarInfoListBuilder_ == null) {
          if (!other.showAvatarInfoList_.isEmpty()) {
            if (showAvatarInfoList_.isEmpty()) {
              showAvatarInfoList_ = other.showAvatarInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureShowAvatarInfoListIsMutable();
              showAvatarInfoList_.addAll(other.showAvatarInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.showAvatarInfoList_.isEmpty()) {
            if (showAvatarInfoListBuilder_.isEmpty()) {
              showAvatarInfoListBuilder_.dispose();
              showAvatarInfoListBuilder_ = null;
              showAvatarInfoList_ = other.showAvatarInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              showAvatarInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getShowAvatarInfoListFieldBuilder() : null;
            } else {
              showAvatarInfoListBuilder_.addAllMessages(other.showAvatarInfoList_);
            }
          }
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
                retcode_ = input.readInt32();

                break;
              } // case 8
              case 42: {
                emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo.parser(),
                        extensionRegistry);
                if (showAvatarInfoListBuilder_ == null) {
                  ensureShowAvatarInfoListIsMutable();
                  showAvatarInfoList_.add(m);
                } else {
                  showAvatarInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 42
              case 72: {
                uid_ = input.readUInt32();

                break;
              } // case 72
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

      private java.util.List<emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo> showAvatarInfoList_ =
        java.util.Collections.emptyList();
      private void ensureShowAvatarInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          showAvatarInfoList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo>(showAvatarInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo, emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder, emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder> showAvatarInfoListBuilder_;

      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo> getShowAvatarInfoListList() {
        if (showAvatarInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(showAvatarInfoList_);
        } else {
          return showAvatarInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public int getShowAvatarInfoListCount() {
        if (showAvatarInfoListBuilder_ == null) {
          return showAvatarInfoList_.size();
        } else {
          return showAvatarInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo getShowAvatarInfoList(int index) {
        if (showAvatarInfoListBuilder_ == null) {
          return showAvatarInfoList_.get(index);
        } else {
          return showAvatarInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public Builder setShowAvatarInfoList(
          int index, emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo value) {
        if (showAvatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureShowAvatarInfoListIsMutable();
          showAvatarInfoList_.set(index, value);
          onChanged();
        } else {
          showAvatarInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public Builder setShowAvatarInfoList(
          int index, emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder builderForValue) {
        if (showAvatarInfoListBuilder_ == null) {
          ensureShowAvatarInfoListIsMutable();
          showAvatarInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          showAvatarInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public Builder addShowAvatarInfoList(emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo value) {
        if (showAvatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureShowAvatarInfoListIsMutable();
          showAvatarInfoList_.add(value);
          onChanged();
        } else {
          showAvatarInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public Builder addShowAvatarInfoList(
          int index, emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo value) {
        if (showAvatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureShowAvatarInfoListIsMutable();
          showAvatarInfoList_.add(index, value);
          onChanged();
        } else {
          showAvatarInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public Builder addShowAvatarInfoList(
          emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder builderForValue) {
        if (showAvatarInfoListBuilder_ == null) {
          ensureShowAvatarInfoListIsMutable();
          showAvatarInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          showAvatarInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public Builder addShowAvatarInfoList(
          int index, emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder builderForValue) {
        if (showAvatarInfoListBuilder_ == null) {
          ensureShowAvatarInfoListIsMutable();
          showAvatarInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          showAvatarInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public Builder addAllShowAvatarInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo> values) {
        if (showAvatarInfoListBuilder_ == null) {
          ensureShowAvatarInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, showAvatarInfoList_);
          onChanged();
        } else {
          showAvatarInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public Builder clearShowAvatarInfoList() {
        if (showAvatarInfoListBuilder_ == null) {
          showAvatarInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          showAvatarInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public Builder removeShowAvatarInfoList(int index) {
        if (showAvatarInfoListBuilder_ == null) {
          ensureShowAvatarInfoListIsMutable();
          showAvatarInfoList_.remove(index);
          onChanged();
        } else {
          showAvatarInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder getShowAvatarInfoListBuilder(
          int index) {
        return getShowAvatarInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder getShowAvatarInfoListOrBuilder(
          int index) {
        if (showAvatarInfoListBuilder_ == null) {
          return showAvatarInfoList_.get(index);  } else {
          return showAvatarInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder> 
           getShowAvatarInfoListOrBuilderList() {
        if (showAvatarInfoListBuilder_ != null) {
          return showAvatarInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(showAvatarInfoList_);
        }
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder addShowAvatarInfoListBuilder() {
        return getShowAvatarInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder addShowAvatarInfoListBuilder(
          int index) {
        return getShowAvatarInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ShowAvatarInfo show_avatar_info_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder> 
           getShowAvatarInfoListBuilderList() {
        return getShowAvatarInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo, emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder, emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder> 
          getShowAvatarInfoListFieldBuilder() {
        if (showAvatarInfoListBuilder_ == null) {
          showAvatarInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo, emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder, emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder>(
                  showAvatarInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          showAvatarInfoList_ = null;
        }
        return showAvatarInfoListBuilder_;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 9;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 9;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
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


      // @@protoc_insertion_point(builder_scope:GetFriendShowAvatarInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetFriendShowAvatarInfoRsp)
    private static final emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp();
    }

    public static emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetFriendShowAvatarInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetFriendShowAvatarInfoRsp>() {
      @java.lang.Override
      public GetFriendShowAvatarInfoRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetFriendShowAvatarInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetFriendShowAvatarInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GetFriendShowAvatarInfoRspOuterClass.GetFriendShowAvatarInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetFriendShowAvatarInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetFriendShowAvatarInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GetFriendShowAvatarInfoRsp.proto\032\024Show" +
      "AvatarInfo.proto\"j\n\032GetFriendShowAvatarI" +
      "nfoRsp\022.\n\025show_avatar_info_list\030\005 \003(\0132\017." +
      "ShowAvatarInfo\022\013\n\003uid\030\t \001(\r\022\017\n\007retcode\030\001" +
      " \001(\005B\036\n\034emu.grasscutter.net.newprotob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.getDescriptor(),
        });
    internal_static_GetFriendShowAvatarInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetFriendShowAvatarInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetFriendShowAvatarInfoRsp_descriptor,
        new java.lang.String[] { "ShowAvatarInfoList", "Uid", "Retcode", });
    emu.grasscutter.net.newproto.ShowAvatarInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
