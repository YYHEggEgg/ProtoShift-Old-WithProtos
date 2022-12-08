// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlessingGetFriendPicListRsp.proto

package emu.grasscutter.net.oldproto;

public final class BlessingGetFriendPicListRspOuterClass {
  private BlessingGetFriendPicListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlessingGetFriendPicListRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlessingGetFriendPicListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData> 
        getFriendPicDataListList();
    /**
     * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
     */
    emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData getFriendPicDataList(int index);
    /**
     * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
     */
    int getFriendPicDataListCount();
    /**
     * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicDataOrBuilder> 
        getFriendPicDataListOrBuilderList();
    /**
     * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
     */
    emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicDataOrBuilder getFriendPicDataListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 2056
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code BlessingGetFriendPicListRsp}
   */
  public static final class BlessingGetFriendPicListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlessingGetFriendPicListRsp)
      BlessingGetFriendPicListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlessingGetFriendPicListRsp.newBuilder() to construct.
    private BlessingGetFriendPicListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlessingGetFriendPicListRsp() {
      friendPicDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlessingGetFriendPicListRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.internal_static_BlessingGetFriendPicListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.internal_static_BlessingGetFriendPicListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp.class, emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int FRIEND_PIC_DATA_LIST_FIELD_NUMBER = 6;
    private java.util.List<emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData> friendPicDataList_;
    /**
     * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData> getFriendPicDataListList() {
      return friendPicDataList_;
    }
    /**
     * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicDataOrBuilder> 
        getFriendPicDataListOrBuilderList() {
      return friendPicDataList_;
    }
    /**
     * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
     */
    @java.lang.Override
    public int getFriendPicDataListCount() {
      return friendPicDataList_.size();
    }
    /**
     * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData getFriendPicDataList(int index) {
      return friendPicDataList_.get(index);
    }
    /**
     * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicDataOrBuilder getFriendPicDataListOrBuilder(
        int index) {
      return friendPicDataList_.get(index);
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
        output.writeInt32(2, retcode_);
      }
      for (int i = 0; i < friendPicDataList_.size(); i++) {
        output.writeMessage(6, friendPicDataList_.get(i));
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
          .computeInt32Size(2, retcode_);
      }
      for (int i = 0; i < friendPicDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, friendPicDataList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp other = (emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getFriendPicDataListList()
          .equals(other.getFriendPicDataListList())) return false;
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
      if (getFriendPicDataListCount() > 0) {
        hash = (37 * hash) + FRIEND_PIC_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFriendPicDataListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp prototype) {
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
     * CmdId: 2056
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code BlessingGetFriendPicListRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlessingGetFriendPicListRsp)
        emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.internal_static_BlessingGetFriendPicListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.internal_static_BlessingGetFriendPicListRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp.class, emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp.newBuilder()
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

        if (friendPicDataListBuilder_ == null) {
          friendPicDataList_ = java.util.Collections.emptyList();
        } else {
          friendPicDataList_ = null;
          friendPicDataListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.internal_static_BlessingGetFriendPicListRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp build() {
        emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp buildPartial() {
        emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp result = new emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (friendPicDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            friendPicDataList_ = java.util.Collections.unmodifiableList(friendPicDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.friendPicDataList_ = friendPicDataList_;
        } else {
          result.friendPicDataList_ = friendPicDataListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp other) {
        if (other == emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (friendPicDataListBuilder_ == null) {
          if (!other.friendPicDataList_.isEmpty()) {
            if (friendPicDataList_.isEmpty()) {
              friendPicDataList_ = other.friendPicDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFriendPicDataListIsMutable();
              friendPicDataList_.addAll(other.friendPicDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.friendPicDataList_.isEmpty()) {
            if (friendPicDataListBuilder_.isEmpty()) {
              friendPicDataListBuilder_.dispose();
              friendPicDataListBuilder_ = null;
              friendPicDataList_ = other.friendPicDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              friendPicDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getFriendPicDataListFieldBuilder() : null;
            } else {
              friendPicDataListBuilder_.addAllMessages(other.friendPicDataList_);
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
              case 16: {
                retcode_ = input.readInt32();

                break;
              } // case 16
              case 50: {
                emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData.parser(),
                        extensionRegistry);
                if (friendPicDataListBuilder_ == null) {
                  ensureFriendPicDataListIsMutable();
                  friendPicDataList_.add(m);
                } else {
                  friendPicDataListBuilder_.addMessage(m);
                }
                break;
              } // case 50
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
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData> friendPicDataList_ =
        java.util.Collections.emptyList();
      private void ensureFriendPicDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          friendPicDataList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData>(friendPicDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData, emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData.Builder, emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicDataOrBuilder> friendPicDataListBuilder_;

      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData> getFriendPicDataListList() {
        if (friendPicDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(friendPicDataList_);
        } else {
          return friendPicDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public int getFriendPicDataListCount() {
        if (friendPicDataListBuilder_ == null) {
          return friendPicDataList_.size();
        } else {
          return friendPicDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData getFriendPicDataList(int index) {
        if (friendPicDataListBuilder_ == null) {
          return friendPicDataList_.get(index);
        } else {
          return friendPicDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public Builder setFriendPicDataList(
          int index, emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData value) {
        if (friendPicDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFriendPicDataListIsMutable();
          friendPicDataList_.set(index, value);
          onChanged();
        } else {
          friendPicDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public Builder setFriendPicDataList(
          int index, emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData.Builder builderForValue) {
        if (friendPicDataListBuilder_ == null) {
          ensureFriendPicDataListIsMutable();
          friendPicDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          friendPicDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public Builder addFriendPicDataList(emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData value) {
        if (friendPicDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFriendPicDataListIsMutable();
          friendPicDataList_.add(value);
          onChanged();
        } else {
          friendPicDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public Builder addFriendPicDataList(
          int index, emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData value) {
        if (friendPicDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFriendPicDataListIsMutable();
          friendPicDataList_.add(index, value);
          onChanged();
        } else {
          friendPicDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public Builder addFriendPicDataList(
          emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData.Builder builderForValue) {
        if (friendPicDataListBuilder_ == null) {
          ensureFriendPicDataListIsMutable();
          friendPicDataList_.add(builderForValue.build());
          onChanged();
        } else {
          friendPicDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public Builder addFriendPicDataList(
          int index, emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData.Builder builderForValue) {
        if (friendPicDataListBuilder_ == null) {
          ensureFriendPicDataListIsMutable();
          friendPicDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          friendPicDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public Builder addAllFriendPicDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData> values) {
        if (friendPicDataListBuilder_ == null) {
          ensureFriendPicDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, friendPicDataList_);
          onChanged();
        } else {
          friendPicDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public Builder clearFriendPicDataList() {
        if (friendPicDataListBuilder_ == null) {
          friendPicDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          friendPicDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public Builder removeFriendPicDataList(int index) {
        if (friendPicDataListBuilder_ == null) {
          ensureFriendPicDataListIsMutable();
          friendPicDataList_.remove(index);
          onChanged();
        } else {
          friendPicDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData.Builder getFriendPicDataListBuilder(
          int index) {
        return getFriendPicDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicDataOrBuilder getFriendPicDataListOrBuilder(
          int index) {
        if (friendPicDataListBuilder_ == null) {
          return friendPicDataList_.get(index);  } else {
          return friendPicDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicDataOrBuilder> 
           getFriendPicDataListOrBuilderList() {
        if (friendPicDataListBuilder_ != null) {
          return friendPicDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(friendPicDataList_);
        }
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData.Builder addFriendPicDataListBuilder() {
        return getFriendPicDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData.getDefaultInstance());
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData.Builder addFriendPicDataListBuilder(
          int index) {
        return getFriendPicDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData.getDefaultInstance());
      }
      /**
       * <code>repeated .BlessingFriendPicData friend_pic_data_list = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData.Builder> 
           getFriendPicDataListBuilderList() {
        return getFriendPicDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData, emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData.Builder, emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicDataOrBuilder> 
          getFriendPicDataListFieldBuilder() {
        if (friendPicDataListBuilder_ == null) {
          friendPicDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData, emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicData.Builder, emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.BlessingFriendPicDataOrBuilder>(
                  friendPicDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          friendPicDataList_ = null;
        }
        return friendPicDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BlessingGetFriendPicListRsp)
    }

    // @@protoc_insertion_point(class_scope:BlessingGetFriendPicListRsp)
    private static final emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp();
    }

    public static emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlessingGetFriendPicListRsp>
        PARSER = new com.google.protobuf.AbstractParser<BlessingGetFriendPicListRsp>() {
      @java.lang.Override
      public BlessingGetFriendPicListRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<BlessingGetFriendPicListRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlessingGetFriendPicListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.BlessingGetFriendPicListRspOuterClass.BlessingGetFriendPicListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlessingGetFriendPicListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlessingGetFriendPicListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!BlessingGetFriendPicListRsp.proto\032\033Ble" +
      "ssingFriendPicData.proto\"d\n\033BlessingGetF" +
      "riendPicListRsp\022\017\n\007retcode\030\002 \001(\005\0224\n\024frie" +
      "nd_pic_data_list\030\006 \003(\0132\026.BlessingFriendP" +
      "icDataB\036\n\034emu.grasscutter.net.oldprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.getDescriptor(),
        });
    internal_static_BlessingGetFriendPicListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlessingGetFriendPicListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlessingGetFriendPicListRsp_descriptor,
        new java.lang.String[] { "Retcode", "FriendPicDataList", });
    emu.grasscutter.net.oldproto.BlessingFriendPicDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
