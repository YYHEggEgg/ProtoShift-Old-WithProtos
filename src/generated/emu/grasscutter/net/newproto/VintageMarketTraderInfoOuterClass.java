// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageMarketTraderInfo.proto

package emu.grasscutter.net.newproto;

public final class VintageMarketTraderInfoOuterClass {
  private VintageMarketTraderInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageMarketTraderInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageMarketTraderInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 trader_id = 4;</code>
     * @return The traderId.
     */
    int getTraderId();

    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam> 
        getAvailableItemListList();
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam getAvailableItemList(int index);
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    int getAvailableItemListCount();
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder> 
        getAvailableItemListOrBuilderList();
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder getAvailableItemListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code VintageMarketTraderInfo}
   */
  public static final class VintageMarketTraderInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageMarketTraderInfo)
      VintageMarketTraderInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageMarketTraderInfo.newBuilder() to construct.
    private VintageMarketTraderInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageMarketTraderInfo() {
      availableItemList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageMarketTraderInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.class, emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.Builder.class);
    }

    public static final int TRADER_ID_FIELD_NUMBER = 4;
    private int traderId_;
    /**
     * <code>uint32 trader_id = 4;</code>
     * @return The traderId.
     */
    @java.lang.Override
    public int getTraderId() {
      return traderId_;
    }

    public static final int AVAILABLE_ITEM_LIST_FIELD_NUMBER = 15;
    private java.util.List<emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam> availableItemList_;
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam> getAvailableItemListList() {
      return availableItemList_;
    }
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder> 
        getAvailableItemListOrBuilderList() {
      return availableItemList_;
    }
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    @java.lang.Override
    public int getAvailableItemListCount() {
      return availableItemList_.size();
    }
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam getAvailableItemList(int index) {
      return availableItemList_.get(index);
    }
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder getAvailableItemListOrBuilder(
        int index) {
      return availableItemList_.get(index);
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
      if (traderId_ != 0) {
        output.writeUInt32(4, traderId_);
      }
      for (int i = 0; i < availableItemList_.size(); i++) {
        output.writeMessage(15, availableItemList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (traderId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, traderId_);
      }
      for (int i = 0; i < availableItemList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, availableItemList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo other = (emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo) obj;

      if (getTraderId()
          != other.getTraderId()) return false;
      if (!getAvailableItemListList()
          .equals(other.getAvailableItemListList())) return false;
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
      hash = (37 * hash) + TRADER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTraderId();
      if (getAvailableItemListCount() > 0) {
        hash = (37 * hash) + AVAILABLE_ITEM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvailableItemListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo prototype) {
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
     * Protobuf type {@code VintageMarketTraderInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageMarketTraderInfo)
        emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.class, emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        traderId_ = 0;

        if (availableItemListBuilder_ == null) {
          availableItemList_ = java.util.Collections.emptyList();
        } else {
          availableItemList_ = null;
          availableItemListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo build() {
        emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo buildPartial() {
        emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo result = new emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo(this);
        int from_bitField0_ = bitField0_;
        result.traderId_ = traderId_;
        if (availableItemListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            availableItemList_ = java.util.Collections.unmodifiableList(availableItemList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.availableItemList_ = availableItemList_;
        } else {
          result.availableItemList_ = availableItemListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo other) {
        if (other == emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.getDefaultInstance()) return this;
        if (other.getTraderId() != 0) {
          setTraderId(other.getTraderId());
        }
        if (availableItemListBuilder_ == null) {
          if (!other.availableItemList_.isEmpty()) {
            if (availableItemList_.isEmpty()) {
              availableItemList_ = other.availableItemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAvailableItemListIsMutable();
              availableItemList_.addAll(other.availableItemList_);
            }
            onChanged();
          }
        } else {
          if (!other.availableItemList_.isEmpty()) {
            if (availableItemListBuilder_.isEmpty()) {
              availableItemListBuilder_.dispose();
              availableItemListBuilder_ = null;
              availableItemList_ = other.availableItemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              availableItemListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAvailableItemListFieldBuilder() : null;
            } else {
              availableItemListBuilder_.addAllMessages(other.availableItemList_);
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
              case 32: {
                traderId_ = input.readUInt32();

                break;
              } // case 32
              case 122: {
                emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.parser(),
                        extensionRegistry);
                if (availableItemListBuilder_ == null) {
                  ensureAvailableItemListIsMutable();
                  availableItemList_.add(m);
                } else {
                  availableItemListBuilder_.addMessage(m);
                }
                break;
              } // case 122
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

      private int traderId_ ;
      /**
       * <code>uint32 trader_id = 4;</code>
       * @return The traderId.
       */
      @java.lang.Override
      public int getTraderId() {
        return traderId_;
      }
      /**
       * <code>uint32 trader_id = 4;</code>
       * @param value The traderId to set.
       * @return This builder for chaining.
       */
      public Builder setTraderId(int value) {
        
        traderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trader_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTraderId() {
        
        traderId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam> availableItemList_ =
        java.util.Collections.emptyList();
      private void ensureAvailableItemListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          availableItemList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam>(availableItemList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder> availableItemListBuilder_;

      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam> getAvailableItemListList() {
        if (availableItemListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(availableItemList_);
        } else {
          return availableItemListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public int getAvailableItemListCount() {
        if (availableItemListBuilder_ == null) {
          return availableItemList_.size();
        } else {
          return availableItemListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam getAvailableItemList(int index) {
        if (availableItemListBuilder_ == null) {
          return availableItemList_.get(index);
        } else {
          return availableItemListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder setAvailableItemList(
          int index, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam value) {
        if (availableItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvailableItemListIsMutable();
          availableItemList_.set(index, value);
          onChanged();
        } else {
          availableItemListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder setAvailableItemList(
          int index, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (availableItemListBuilder_ == null) {
          ensureAvailableItemListIsMutable();
          availableItemList_.set(index, builderForValue.build());
          onChanged();
        } else {
          availableItemListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder addAvailableItemList(emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam value) {
        if (availableItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvailableItemListIsMutable();
          availableItemList_.add(value);
          onChanged();
        } else {
          availableItemListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder addAvailableItemList(
          int index, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam value) {
        if (availableItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvailableItemListIsMutable();
          availableItemList_.add(index, value);
          onChanged();
        } else {
          availableItemListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder addAvailableItemList(
          emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (availableItemListBuilder_ == null) {
          ensureAvailableItemListIsMutable();
          availableItemList_.add(builderForValue.build());
          onChanged();
        } else {
          availableItemListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder addAvailableItemList(
          int index, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (availableItemListBuilder_ == null) {
          ensureAvailableItemListIsMutable();
          availableItemList_.add(index, builderForValue.build());
          onChanged();
        } else {
          availableItemListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder addAllAvailableItemList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam> values) {
        if (availableItemListBuilder_ == null) {
          ensureAvailableItemListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, availableItemList_);
          onChanged();
        } else {
          availableItemListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder clearAvailableItemList() {
        if (availableItemListBuilder_ == null) {
          availableItemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          availableItemListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder removeAvailableItemList(int index) {
        if (availableItemListBuilder_ == null) {
          ensureAvailableItemListIsMutable();
          availableItemList_.remove(index);
          onChanged();
        } else {
          availableItemListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder getAvailableItemListBuilder(
          int index) {
        return getAvailableItemListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder getAvailableItemListOrBuilder(
          int index) {
        if (availableItemListBuilder_ == null) {
          return availableItemList_.get(index);  } else {
          return availableItemListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder> 
           getAvailableItemListOrBuilderList() {
        if (availableItemListBuilder_ != null) {
          return availableItemListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(availableItemList_);
        }
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder addAvailableItemListBuilder() {
        return getAvailableItemListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder addAvailableItemListBuilder(
          int index) {
        return getAvailableItemListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder> 
           getAvailableItemListBuilderList() {
        return getAvailableItemListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder> 
          getAvailableItemListFieldBuilder() {
        if (availableItemListBuilder_ == null) {
          availableItemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder>(
                  availableItemList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          availableItemList_ = null;
        }
        return availableItemListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:VintageMarketTraderInfo)
    }

    // @@protoc_insertion_point(class_scope:VintageMarketTraderInfo)
    private static final emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo();
    }

    public static emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageMarketTraderInfo>
        PARSER = new com.google.protobuf.AbstractParser<VintageMarketTraderInfo>() {
      @java.lang.Override
      public VintageMarketTraderInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<VintageMarketTraderInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageMarketTraderInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageMarketTraderInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageMarketTraderInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035VintageMarketTraderInfo.proto\032\017ItemPar" +
      "am.proto\"U\n\027VintageMarketTraderInfo\022\021\n\tt" +
      "rader_id\030\004 \001(\r\022\'\n\023available_item_list\030\017 " +
      "\003(\0132\n.ItemParamB\036\n\034emu.grasscutter.net.n" +
      "ewprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_VintageMarketTraderInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageMarketTraderInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageMarketTraderInfo_descriptor,
        new java.lang.String[] { "TraderId", "AvailableItemList", });
    emu.grasscutter.net.newproto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
