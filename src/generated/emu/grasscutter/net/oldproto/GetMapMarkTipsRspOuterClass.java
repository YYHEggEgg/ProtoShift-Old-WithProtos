// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetMapMarkTipsRsp.proto

package emu.grasscutter.net.oldproto;

public final class GetMapMarkTipsRspOuterClass {
  private GetMapMarkTipsRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetMapMarkTipsRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetMapMarkTipsRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo> 
        getMarkTipsListList();
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo getMarkTipsList(int index);
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    int getMarkTipsListCount();
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder> 
        getMarkTipsListOrBuilderList();
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder getMarkTipsListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 3327
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GetMapMarkTipsRsp}
   */
  public static final class GetMapMarkTipsRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetMapMarkTipsRsp)
      GetMapMarkTipsRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetMapMarkTipsRsp.newBuilder() to construct.
    private GetMapMarkTipsRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetMapMarkTipsRsp() {
      markTipsList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetMapMarkTipsRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.internal_static_GetMapMarkTipsRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.internal_static_GetMapMarkTipsRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp.class, emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int MARK_TIPS_LIST_FIELD_NUMBER = 11;
    private java.util.List<emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo> markTipsList_;
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo> getMarkTipsListList() {
      return markTipsList_;
    }
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder> 
        getMarkTipsListOrBuilderList() {
      return markTipsList_;
    }
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    @java.lang.Override
    public int getMarkTipsListCount() {
      return markTipsList_.size();
    }
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo getMarkTipsList(int index) {
      return markTipsList_.get(index);
    }
    /**
     * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder getMarkTipsListOrBuilder(
        int index) {
      return markTipsList_.get(index);
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
        output.writeInt32(7, retcode_);
      }
      for (int i = 0; i < markTipsList_.size(); i++) {
        output.writeMessage(11, markTipsList_.get(i));
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
          .computeInt32Size(7, retcode_);
      }
      for (int i = 0; i < markTipsList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, markTipsList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp other = (emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getMarkTipsListList()
          .equals(other.getMarkTipsListList())) return false;
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
      if (getMarkTipsListCount() > 0) {
        hash = (37 * hash) + MARK_TIPS_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMarkTipsListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp prototype) {
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
     * CmdId: 3327
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GetMapMarkTipsRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetMapMarkTipsRsp)
        emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.internal_static_GetMapMarkTipsRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.internal_static_GetMapMarkTipsRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp.class, emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp.newBuilder()
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

        if (markTipsListBuilder_ == null) {
          markTipsList_ = java.util.Collections.emptyList();
        } else {
          markTipsList_ = null;
          markTipsListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.internal_static_GetMapMarkTipsRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp build() {
        emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp buildPartial() {
        emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp result = new emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (markTipsListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            markTipsList_ = java.util.Collections.unmodifiableList(markTipsList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.markTipsList_ = markTipsList_;
        } else {
          result.markTipsList_ = markTipsListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp other) {
        if (other == emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (markTipsListBuilder_ == null) {
          if (!other.markTipsList_.isEmpty()) {
            if (markTipsList_.isEmpty()) {
              markTipsList_ = other.markTipsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMarkTipsListIsMutable();
              markTipsList_.addAll(other.markTipsList_);
            }
            onChanged();
          }
        } else {
          if (!other.markTipsList_.isEmpty()) {
            if (markTipsListBuilder_.isEmpty()) {
              markTipsListBuilder_.dispose();
              markTipsListBuilder_ = null;
              markTipsList_ = other.markTipsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              markTipsListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMarkTipsListFieldBuilder() : null;
            } else {
              markTipsListBuilder_.addAllMessages(other.markTipsList_);
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
              case 56: {
                retcode_ = input.readInt32();

                break;
              } // case 56
              case 90: {
                emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.parser(),
                        extensionRegistry);
                if (markTipsListBuilder_ == null) {
                  ensureMarkTipsListIsMutable();
                  markTipsList_.add(m);
                } else {
                  markTipsListBuilder_.addMessage(m);
                }
                break;
              } // case 90
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
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo> markTipsList_ =
        java.util.Collections.emptyList();
      private void ensureMarkTipsListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          markTipsList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo>(markTipsList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo, emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder, emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder> markTipsListBuilder_;

      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo> getMarkTipsListList() {
        if (markTipsListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(markTipsList_);
        } else {
          return markTipsListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public int getMarkTipsListCount() {
        if (markTipsListBuilder_ == null) {
          return markTipsList_.size();
        } else {
          return markTipsListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo getMarkTipsList(int index) {
        if (markTipsListBuilder_ == null) {
          return markTipsList_.get(index);
        } else {
          return markTipsListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder setMarkTipsList(
          int index, emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo value) {
        if (markTipsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMarkTipsListIsMutable();
          markTipsList_.set(index, value);
          onChanged();
        } else {
          markTipsListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder setMarkTipsList(
          int index, emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder builderForValue) {
        if (markTipsListBuilder_ == null) {
          ensureMarkTipsListIsMutable();
          markTipsList_.set(index, builderForValue.build());
          onChanged();
        } else {
          markTipsListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder addMarkTipsList(emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo value) {
        if (markTipsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMarkTipsListIsMutable();
          markTipsList_.add(value);
          onChanged();
        } else {
          markTipsListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder addMarkTipsList(
          int index, emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo value) {
        if (markTipsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMarkTipsListIsMutable();
          markTipsList_.add(index, value);
          onChanged();
        } else {
          markTipsListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder addMarkTipsList(
          emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder builderForValue) {
        if (markTipsListBuilder_ == null) {
          ensureMarkTipsListIsMutable();
          markTipsList_.add(builderForValue.build());
          onChanged();
        } else {
          markTipsListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder addMarkTipsList(
          int index, emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder builderForValue) {
        if (markTipsListBuilder_ == null) {
          ensureMarkTipsListIsMutable();
          markTipsList_.add(index, builderForValue.build());
          onChanged();
        } else {
          markTipsListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder addAllMarkTipsList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo> values) {
        if (markTipsListBuilder_ == null) {
          ensureMarkTipsListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, markTipsList_);
          onChanged();
        } else {
          markTipsListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder clearMarkTipsList() {
        if (markTipsListBuilder_ == null) {
          markTipsList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          markTipsListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public Builder removeMarkTipsList(int index) {
        if (markTipsListBuilder_ == null) {
          ensureMarkTipsListIsMutable();
          markTipsList_.remove(index);
          onChanged();
        } else {
          markTipsListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder getMarkTipsListBuilder(
          int index) {
        return getMarkTipsListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder getMarkTipsListOrBuilder(
          int index) {
        if (markTipsListBuilder_ == null) {
          return markTipsList_.get(index);  } else {
          return markTipsListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder> 
           getMarkTipsListOrBuilderList() {
        if (markTipsListBuilder_ != null) {
          return markTipsListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(markTipsList_);
        }
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder addMarkTipsListBuilder() {
        return getMarkTipsListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder addMarkTipsListBuilder(
          int index) {
        return getMarkTipsListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MapMarkTipsInfo mark_tips_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder> 
           getMarkTipsListBuilderList() {
        return getMarkTipsListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo, emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder, emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder> 
          getMarkTipsListFieldBuilder() {
        if (markTipsListBuilder_ == null) {
          markTipsListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo, emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder, emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder>(
                  markTipsList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          markTipsList_ = null;
        }
        return markTipsListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GetMapMarkTipsRsp)
    }

    // @@protoc_insertion_point(class_scope:GetMapMarkTipsRsp)
    private static final emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp();
    }

    public static emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetMapMarkTipsRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetMapMarkTipsRsp>() {
      @java.lang.Override
      public GetMapMarkTipsRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetMapMarkTipsRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetMapMarkTipsRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.GetMapMarkTipsRspOuterClass.GetMapMarkTipsRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetMapMarkTipsRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetMapMarkTipsRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GetMapMarkTipsRsp.proto\032\025MapMarkTipsIn" +
      "fo.proto\"N\n\021GetMapMarkTipsRsp\022\017\n\007retcode" +
      "\030\007 \001(\005\022(\n\016mark_tips_list\030\013 \003(\0132\020.MapMark" +
      "TipsInfoB\036\n\034emu.grasscutter.net.oldproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.getDescriptor(),
        });
    internal_static_GetMapMarkTipsRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetMapMarkTipsRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetMapMarkTipsRsp_descriptor,
        new java.lang.String[] { "Retcode", "MarkTipsList", });
    emu.grasscutter.net.oldproto.MapMarkTipsInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
