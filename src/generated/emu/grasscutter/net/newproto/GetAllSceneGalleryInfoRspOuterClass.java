// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetAllSceneGalleryInfoRsp.proto

package emu.grasscutter.net.newproto;

public final class GetAllSceneGalleryInfoRspOuterClass {
  private GetAllSceneGalleryInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetAllSceneGalleryInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetAllSceneGalleryInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo> 
        getGalleryInfoListList();
    /**
     * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
     */
    emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo getGalleryInfoList(int index);
    /**
     * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
     */
    int getGalleryInfoListCount();
    /**
     * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder> 
        getGalleryInfoListOrBuilderList();
    /**
     * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
     */
    emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder getGalleryInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5547;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GetAllSceneGalleryInfoRsp}
   */
  public static final class GetAllSceneGalleryInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetAllSceneGalleryInfoRsp)
      GetAllSceneGalleryInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetAllSceneGalleryInfoRsp.newBuilder() to construct.
    private GetAllSceneGalleryInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetAllSceneGalleryInfoRsp() {
      galleryInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetAllSceneGalleryInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.internal_static_GetAllSceneGalleryInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.internal_static_GetAllSceneGalleryInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp.class, emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int GALLERY_INFO_LIST_FIELD_NUMBER = 12;
    private java.util.List<emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo> galleryInfoList_;
    /**
     * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo> getGalleryInfoListList() {
      return galleryInfoList_;
    }
    /**
     * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder> 
        getGalleryInfoListOrBuilderList() {
      return galleryInfoList_;
    }
    /**
     * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
     */
    @java.lang.Override
    public int getGalleryInfoListCount() {
      return galleryInfoList_.size();
    }
    /**
     * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo getGalleryInfoList(int index) {
      return galleryInfoList_.get(index);
    }
    /**
     * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder getGalleryInfoListOrBuilder(
        int index) {
      return galleryInfoList_.get(index);
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
        output.writeInt32(3, retcode_);
      }
      for (int i = 0; i < galleryInfoList_.size(); i++) {
        output.writeMessage(12, galleryInfoList_.get(i));
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
          .computeInt32Size(3, retcode_);
      }
      for (int i = 0; i < galleryInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, galleryInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp other = (emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getGalleryInfoListList()
          .equals(other.getGalleryInfoListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getGalleryInfoListCount() > 0) {
        hash = (37 * hash) + GALLERY_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getGalleryInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp prototype) {
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
     *   CMD_ID = 5547;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GetAllSceneGalleryInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetAllSceneGalleryInfoRsp)
        emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.internal_static_GetAllSceneGalleryInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.internal_static_GetAllSceneGalleryInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp.class, emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (galleryInfoListBuilder_ == null) {
          galleryInfoList_ = java.util.Collections.emptyList();
        } else {
          galleryInfoList_ = null;
          galleryInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.internal_static_GetAllSceneGalleryInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp build() {
        emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp buildPartial() {
        emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp result = new emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (galleryInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            galleryInfoList_ = java.util.Collections.unmodifiableList(galleryInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.galleryInfoList_ = galleryInfoList_;
        } else {
          result.galleryInfoList_ = galleryInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp other) {
        if (other == emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (galleryInfoListBuilder_ == null) {
          if (!other.galleryInfoList_.isEmpty()) {
            if (galleryInfoList_.isEmpty()) {
              galleryInfoList_ = other.galleryInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureGalleryInfoListIsMutable();
              galleryInfoList_.addAll(other.galleryInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.galleryInfoList_.isEmpty()) {
            if (galleryInfoListBuilder_.isEmpty()) {
              galleryInfoListBuilder_.dispose();
              galleryInfoListBuilder_ = null;
              galleryInfoList_ = other.galleryInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              galleryInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getGalleryInfoListFieldBuilder() : null;
            } else {
              galleryInfoListBuilder_.addAllMessages(other.galleryInfoList_);
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
              case 24: {
                retcode_ = input.readInt32();

                break;
              } // case 24
              case 98: {
                emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo.parser(),
                        extensionRegistry);
                if (galleryInfoListBuilder_ == null) {
                  ensureGalleryInfoListIsMutable();
                  galleryInfoList_.add(m);
                } else {
                  galleryInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 98
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo> galleryInfoList_ =
        java.util.Collections.emptyList();
      private void ensureGalleryInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          galleryInfoList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo>(galleryInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo, emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder, emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder> galleryInfoListBuilder_;

      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo> getGalleryInfoListList() {
        if (galleryInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(galleryInfoList_);
        } else {
          return galleryInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public int getGalleryInfoListCount() {
        if (galleryInfoListBuilder_ == null) {
          return galleryInfoList_.size();
        } else {
          return galleryInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo getGalleryInfoList(int index) {
        if (galleryInfoListBuilder_ == null) {
          return galleryInfoList_.get(index);
        } else {
          return galleryInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public Builder setGalleryInfoList(
          int index, emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo value) {
        if (galleryInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGalleryInfoListIsMutable();
          galleryInfoList_.set(index, value);
          onChanged();
        } else {
          galleryInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public Builder setGalleryInfoList(
          int index, emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder builderForValue) {
        if (galleryInfoListBuilder_ == null) {
          ensureGalleryInfoListIsMutable();
          galleryInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          galleryInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public Builder addGalleryInfoList(emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo value) {
        if (galleryInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGalleryInfoListIsMutable();
          galleryInfoList_.add(value);
          onChanged();
        } else {
          galleryInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public Builder addGalleryInfoList(
          int index, emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo value) {
        if (galleryInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGalleryInfoListIsMutable();
          galleryInfoList_.add(index, value);
          onChanged();
        } else {
          galleryInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public Builder addGalleryInfoList(
          emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder builderForValue) {
        if (galleryInfoListBuilder_ == null) {
          ensureGalleryInfoListIsMutable();
          galleryInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          galleryInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public Builder addGalleryInfoList(
          int index, emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder builderForValue) {
        if (galleryInfoListBuilder_ == null) {
          ensureGalleryInfoListIsMutable();
          galleryInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          galleryInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public Builder addAllGalleryInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo> values) {
        if (galleryInfoListBuilder_ == null) {
          ensureGalleryInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, galleryInfoList_);
          onChanged();
        } else {
          galleryInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public Builder clearGalleryInfoList() {
        if (galleryInfoListBuilder_ == null) {
          galleryInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          galleryInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public Builder removeGalleryInfoList(int index) {
        if (galleryInfoListBuilder_ == null) {
          ensureGalleryInfoListIsMutable();
          galleryInfoList_.remove(index);
          onChanged();
        } else {
          galleryInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder getGalleryInfoListBuilder(
          int index) {
        return getGalleryInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder getGalleryInfoListOrBuilder(
          int index) {
        if (galleryInfoListBuilder_ == null) {
          return galleryInfoList_.get(index);  } else {
          return galleryInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder> 
           getGalleryInfoListOrBuilderList() {
        if (galleryInfoListBuilder_ != null) {
          return galleryInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(galleryInfoList_);
        }
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder addGalleryInfoListBuilder() {
        return getGalleryInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder addGalleryInfoListBuilder(
          int index) {
        return getGalleryInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SceneGalleryInfo gallery_info_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder> 
           getGalleryInfoListBuilderList() {
        return getGalleryInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo, emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder, emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder> 
          getGalleryInfoListFieldBuilder() {
        if (galleryInfoListBuilder_ == null) {
          galleryInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo, emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfo.Builder, emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.SceneGalleryInfoOrBuilder>(
                  galleryInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          galleryInfoList_ = null;
        }
        return galleryInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GetAllSceneGalleryInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetAllSceneGalleryInfoRsp)
    private static final emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp();
    }

    public static emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetAllSceneGalleryInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetAllSceneGalleryInfoRsp>() {
      @java.lang.Override
      public GetAllSceneGalleryInfoRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetAllSceneGalleryInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetAllSceneGalleryInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GetAllSceneGalleryInfoRspOuterClass.GetAllSceneGalleryInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllSceneGalleryInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllSceneGalleryInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037GetAllSceneGalleryInfoRsp.proto\032\026Scene" +
      "GalleryInfo.proto\"Z\n\031GetAllSceneGalleryI" +
      "nfoRsp\022\017\n\007retcode\030\003 \001(\005\022,\n\021gallery_info_" +
      "list\030\014 \003(\0132\021.SceneGalleryInfoB\036\n\034emu.gra" +
      "sscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.getDescriptor(),
        });
    internal_static_GetAllSceneGalleryInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetAllSceneGalleryInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllSceneGalleryInfoRsp_descriptor,
        new java.lang.String[] { "Retcode", "GalleryInfoList", });
    emu.grasscutter.net.newproto.SceneGalleryInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}