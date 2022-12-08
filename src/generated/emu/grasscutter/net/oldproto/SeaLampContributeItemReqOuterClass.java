// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SeaLampContributeItemReq.proto

package emu.grasscutter.net.oldproto;

public final class SeaLampContributeItemReqOuterClass {
  private SeaLampContributeItemReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SeaLampContributeItemReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SeaLampContributeItemReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 activity_id = 8;</code>
     * @return The activityId.
     */
    int getActivityId();

    /**
     * <code>repeated .ItemParam item_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam> 
        getItemListList();
    /**
     * <code>repeated .ItemParam item_list = 1;</code>
     */
    emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam getItemList(int index);
    /**
     * <code>repeated .ItemParam item_list = 1;</code>
     */
    int getItemListCount();
    /**
     * <code>repeated .ItemParam item_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParamOrBuilder> 
        getItemListOrBuilderList();
    /**
     * <code>repeated .ItemParam item_list = 1;</code>
     */
    emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 2123
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code SeaLampContributeItemReq}
   */
  public static final class SeaLampContributeItemReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SeaLampContributeItemReq)
      SeaLampContributeItemReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SeaLampContributeItemReq.newBuilder() to construct.
    private SeaLampContributeItemReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SeaLampContributeItemReq() {
      itemList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SeaLampContributeItemReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.internal_static_SeaLampContributeItemReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.internal_static_SeaLampContributeItemReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq.class, emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq.Builder.class);
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 8;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 8;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
    }

    public static final int ITEM_LIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam> itemList_;
    /**
     * <code>repeated .ItemParam item_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam> getItemListList() {
      return itemList_;
    }
    /**
     * <code>repeated .ItemParam item_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParamOrBuilder> 
        getItemListOrBuilderList() {
      return itemList_;
    }
    /**
     * <code>repeated .ItemParam item_list = 1;</code>
     */
    @java.lang.Override
    public int getItemListCount() {
      return itemList_.size();
    }
    /**
     * <code>repeated .ItemParam item_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam getItemList(int index) {
      return itemList_.get(index);
    }
    /**
     * <code>repeated .ItemParam item_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
        int index) {
      return itemList_.get(index);
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
      for (int i = 0; i < itemList_.size(); i++) {
        output.writeMessage(1, itemList_.get(i));
      }
      if (activityId_ != 0) {
        output.writeUInt32(8, activityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < itemList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, itemList_.get(i));
      }
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, activityId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq other = (emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq) obj;

      if (getActivityId()
          != other.getActivityId()) return false;
      if (!getItemListList()
          .equals(other.getItemListList())) return false;
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
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      if (getItemListCount() > 0) {
        hash = (37 * hash) + ITEM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq prototype) {
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
     * CmdId: 2123
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code SeaLampContributeItemReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SeaLampContributeItemReq)
        emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.internal_static_SeaLampContributeItemReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.internal_static_SeaLampContributeItemReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq.class, emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        activityId_ = 0;

        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
        } else {
          itemList_ = null;
          itemListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.internal_static_SeaLampContributeItemReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq build() {
        emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq buildPartial() {
        emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq result = new emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq(this);
        int from_bitField0_ = bitField0_;
        result.activityId_ = activityId_;
        if (itemListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            itemList_ = java.util.Collections.unmodifiableList(itemList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.itemList_ = itemList_;
        } else {
          result.itemList_ = itemListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq other) {
        if (other == emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq.getDefaultInstance()) return this;
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
        }
        if (itemListBuilder_ == null) {
          if (!other.itemList_.isEmpty()) {
            if (itemList_.isEmpty()) {
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureItemListIsMutable();
              itemList_.addAll(other.itemList_);
            }
            onChanged();
          }
        } else {
          if (!other.itemList_.isEmpty()) {
            if (itemListBuilder_.isEmpty()) {
              itemListBuilder_.dispose();
              itemListBuilder_ = null;
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              itemListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getItemListFieldBuilder() : null;
            } else {
              itemListBuilder_.addAllMessages(other.itemList_);
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
                emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam.parser(),
                        extensionRegistry);
                if (itemListBuilder_ == null) {
                  ensureItemListIsMutable();
                  itemList_.add(m);
                } else {
                  itemListBuilder_.addMessage(m);
                }
                break;
              } // case 10
              case 64: {
                activityId_ = input.readUInt32();

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

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 8;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 8;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam> itemList_ =
        java.util.Collections.emptyList();
      private void ensureItemListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam>(itemList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParamOrBuilder> itemListBuilder_;

      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam> getItemListList() {
        if (itemListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(itemList_);
        } else {
          return itemListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public int getItemListCount() {
        if (itemListBuilder_ == null) {
          return itemList_.size();
        } else {
          return itemListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam getItemList(int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);
        } else {
          return itemListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public Builder setItemList(
          int index, emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.set(index, value);
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public Builder setItemList(
          int index, emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public Builder addItemList(emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public Builder addItemList(
          int index, emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(index, value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public Builder addItemList(
          emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public Builder addItemList(
          int index, emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public Builder addAllItemList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam> values) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, itemList_);
          onChanged();
        } else {
          itemListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public Builder clearItemList() {
        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          itemListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public Builder removeItemList(int index) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.remove(index);
          onChanged();
        } else {
          itemListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam.Builder getItemListBuilder(
          int index) {
        return getItemListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
          int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);  } else {
          return itemListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParamOrBuilder> 
           getItemListOrBuilderList() {
        if (itemListBuilder_ != null) {
          return itemListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(itemList_);
        }
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam.Builder addItemListBuilder() {
        return getItemListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam.Builder addItemListBuilder(
          int index) {
        return getItemListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam item_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam.Builder> 
           getItemListBuilderList() {
        return getItemListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParamOrBuilder> 
          getItemListFieldBuilder() {
        if (itemListBuilder_ == null) {
          itemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.oldproto.ItemParamOuterClass.ItemParamOrBuilder>(
                  itemList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          itemList_ = null;
        }
        return itemListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SeaLampContributeItemReq)
    }

    // @@protoc_insertion_point(class_scope:SeaLampContributeItemReq)
    private static final emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq();
    }

    public static emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SeaLampContributeItemReq>
        PARSER = new com.google.protobuf.AbstractParser<SeaLampContributeItemReq>() {
      @java.lang.Override
      public SeaLampContributeItemReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SeaLampContributeItemReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SeaLampContributeItemReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SeaLampContributeItemReqOuterClass.SeaLampContributeItemReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SeaLampContributeItemReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SeaLampContributeItemReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036SeaLampContributeItemReq.proto\032\017ItemPa" +
      "ram.proto\"N\n\030SeaLampContributeItemReq\022\023\n" +
      "\013activity_id\030\010 \001(\r\022\035\n\titem_list\030\001 \003(\0132\n." +
      "ItemParamB\036\n\034emu.grasscutter.net.oldprot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_SeaLampContributeItemReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SeaLampContributeItemReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SeaLampContributeItemReq_descriptor,
        new java.lang.String[] { "ActivityId", "ItemList", });
    emu.grasscutter.net.oldproto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
