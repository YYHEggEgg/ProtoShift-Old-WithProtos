// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetWidgetSlotRsp.proto

package emu.grasscutter.net.newproto;

public final class GetWidgetSlotRspOuterClass {
  private GetWidgetSlotRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetWidgetSlotRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetWidgetSlotRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .WidgetSlotData slot_list = 3;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData> 
        getSlotListList();
    /**
     * <code>repeated .WidgetSlotData slot_list = 3;</code>
     */
    emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData getSlotList(int index);
    /**
     * <code>repeated .WidgetSlotData slot_list = 3;</code>
     */
    int getSlotListCount();
    /**
     * <code>repeated .WidgetSlotData slot_list = 3;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
        getSlotListOrBuilderList();
    /**
     * <code>repeated .WidgetSlotData slot_list = 3;</code>
     */
    emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4270;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GetWidgetSlotRsp}
   */
  public static final class GetWidgetSlotRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetWidgetSlotRsp)
      GetWidgetSlotRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetWidgetSlotRsp.newBuilder() to construct.
    private GetWidgetSlotRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetWidgetSlotRsp() {
      slotList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetWidgetSlotRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.internal_static_GetWidgetSlotRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.internal_static_GetWidgetSlotRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp.class, emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp.Builder.class);
    }

    public static final int SLOT_LIST_FIELD_NUMBER = 3;
    private java.util.List<emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData> slotList_;
    /**
     * <code>repeated .WidgetSlotData slot_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList() {
      return slotList_;
    }
    /**
     * <code>repeated .WidgetSlotData slot_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
        getSlotListOrBuilderList() {
      return slotList_;
    }
    /**
     * <code>repeated .WidgetSlotData slot_list = 3;</code>
     */
    @java.lang.Override
    public int getSlotListCount() {
      return slotList_.size();
    }
    /**
     * <code>repeated .WidgetSlotData slot_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData getSlotList(int index) {
      return slotList_.get(index);
    }
    /**
     * <code>repeated .WidgetSlotData slot_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(
        int index) {
      return slotList_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>int32 retcode = 10;</code>
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
      for (int i = 0; i < slotList_.size(); i++) {
        output.writeMessage(3, slotList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < slotList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, slotList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp other = (emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp) obj;

      if (!getSlotListList()
          .equals(other.getSlotListList())) return false;
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
      if (getSlotListCount() > 0) {
        hash = (37 * hash) + SLOT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSlotListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp prototype) {
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
     *   CMD_ID = 4270;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GetWidgetSlotRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetWidgetSlotRsp)
        emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.internal_static_GetWidgetSlotRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.internal_static_GetWidgetSlotRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp.class, emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (slotListBuilder_ == null) {
          slotList_ = java.util.Collections.emptyList();
        } else {
          slotList_ = null;
          slotListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.internal_static_GetWidgetSlotRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp build() {
        emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp buildPartial() {
        emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp result = new emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp(this);
        int from_bitField0_ = bitField0_;
        if (slotListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            slotList_ = java.util.Collections.unmodifiableList(slotList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.slotList_ = slotList_;
        } else {
          result.slotList_ = slotListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp other) {
        if (other == emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp.getDefaultInstance()) return this;
        if (slotListBuilder_ == null) {
          if (!other.slotList_.isEmpty()) {
            if (slotList_.isEmpty()) {
              slotList_ = other.slotList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSlotListIsMutable();
              slotList_.addAll(other.slotList_);
            }
            onChanged();
          }
        } else {
          if (!other.slotList_.isEmpty()) {
            if (slotListBuilder_.isEmpty()) {
              slotListBuilder_.dispose();
              slotListBuilder_ = null;
              slotList_ = other.slotList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              slotListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSlotListFieldBuilder() : null;
            } else {
              slotListBuilder_.addAllMessages(other.slotList_);
            }
          }
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
              case 26: {
                emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.parser(),
                        extensionRegistry);
                if (slotListBuilder_ == null) {
                  ensureSlotListIsMutable();
                  slotList_.add(m);
                } else {
                  slotListBuilder_.addMessage(m);
                }
                break;
              } // case 26
              case 80: {
                retcode_ = input.readInt32();

                break;
              } // case 80
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

      private java.util.List<emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData> slotList_ =
        java.util.Collections.emptyList();
      private void ensureSlotListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          slotList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData>(slotList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData, emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder, emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> slotListBuilder_;

      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList() {
        if (slotListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(slotList_);
        } else {
          return slotListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public int getSlotListCount() {
        if (slotListBuilder_ == null) {
          return slotList_.size();
        } else {
          return slotListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData getSlotList(int index) {
        if (slotListBuilder_ == null) {
          return slotList_.get(index);
        } else {
          return slotListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public Builder setSlotList(
          int index, emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData value) {
        if (slotListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSlotListIsMutable();
          slotList_.set(index, value);
          onChanged();
        } else {
          slotListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public Builder setSlotList(
          int index, emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          slotList_.set(index, builderForValue.build());
          onChanged();
        } else {
          slotListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public Builder addSlotList(emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData value) {
        if (slotListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSlotListIsMutable();
          slotList_.add(value);
          onChanged();
        } else {
          slotListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public Builder addSlotList(
          int index, emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData value) {
        if (slotListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSlotListIsMutable();
          slotList_.add(index, value);
          onChanged();
        } else {
          slotListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public Builder addSlotList(
          emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          slotList_.add(builderForValue.build());
          onChanged();
        } else {
          slotListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public Builder addSlotList(
          int index, emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          slotList_.add(index, builderForValue.build());
          onChanged();
        } else {
          slotListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public Builder addAllSlotList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData> values) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, slotList_);
          onChanged();
        } else {
          slotListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public Builder clearSlotList() {
        if (slotListBuilder_ == null) {
          slotList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          slotListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public Builder removeSlotList(int index) {
        if (slotListBuilder_ == null) {
          ensureSlotListIsMutable();
          slotList_.remove(index);
          onChanged();
        } else {
          slotListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder getSlotListBuilder(
          int index) {
        return getSlotListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(
          int index) {
        if (slotListBuilder_ == null) {
          return slotList_.get(index);  } else {
          return slotListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
           getSlotListOrBuilderList() {
        if (slotListBuilder_ != null) {
          return slotListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(slotList_);
        }
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder addSlotListBuilder() {
        return getSlotListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder addSlotListBuilder(
          int index) {
        return getSlotListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
      }
      /**
       * <code>repeated .WidgetSlotData slot_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder> 
           getSlotListBuilderList() {
        return getSlotListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData, emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder, emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
          getSlotListFieldBuilder() {
        if (slotListBuilder_ == null) {
          slotListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData, emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder, emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder>(
                  slotList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          slotList_ = null;
        }
        return slotListBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
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


      // @@protoc_insertion_point(builder_scope:GetWidgetSlotRsp)
    }

    // @@protoc_insertion_point(class_scope:GetWidgetSlotRsp)
    private static final emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp();
    }

    public static emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetWidgetSlotRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetWidgetSlotRsp>() {
      @java.lang.Override
      public GetWidgetSlotRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetWidgetSlotRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetWidgetSlotRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GetWidgetSlotRspOuterClass.GetWidgetSlotRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetWidgetSlotRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetWidgetSlotRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GetWidgetSlotRsp.proto\032\024WidgetSlotData" +
      ".proto\"G\n\020GetWidgetSlotRsp\022\"\n\tslot_list\030" +
      "\003 \003(\0132\017.WidgetSlotData\022\017\n\007retcode\030\n \001(\005B" +
      "\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.getDescriptor(),
        });
    internal_static_GetWidgetSlotRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetWidgetSlotRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetWidgetSlotRsp_descriptor,
        new java.lang.String[] { "SlotList", "Retcode", });
    emu.grasscutter.net.newproto.WidgetSlotDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
