// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerStoreNotify.proto

package emu.grasscutter.net.newproto;

public final class PlayerStoreNotifyOuterClass {
  private PlayerStoreNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerStoreNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerStoreNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.StoreType store_type = 1;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    int getStoreTypeValue();
    /**
     * <code>.StoreType store_type = 1;</code>
     * @return The storeType.
     */
    emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType getStoreType();

    /**
     * <code>uint32 weight_limit = 14;</code>
     * @return The weightLimit.
     */
    int getWeightLimit();

    /**
     * <code>repeated .Item item_list = 10;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.ItemOuterClass.Item> 
        getItemListList();
    /**
     * <code>repeated .Item item_list = 10;</code>
     */
    emu.grasscutter.net.newproto.ItemOuterClass.Item getItemList(int index);
    /**
     * <code>repeated .Item item_list = 10;</code>
     */
    int getItemListCount();
    /**
     * <code>repeated .Item item_list = 10;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.ItemOuterClass.ItemOrBuilder> 
        getItemListOrBuilderList();
    /**
     * <code>repeated .Item item_list = 10;</code>
     */
    emu.grasscutter.net.newproto.ItemOuterClass.ItemOrBuilder getItemListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 679;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerStoreNotify}
   */
  public static final class PlayerStoreNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerStoreNotify)
      PlayerStoreNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerStoreNotify.newBuilder() to construct.
    private PlayerStoreNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerStoreNotify() {
      storeType_ = 0;
      itemList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerStoreNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.internal_static_PlayerStoreNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.internal_static_PlayerStoreNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify.class, emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify.Builder.class);
    }

    public static final int STORE_TYPE_FIELD_NUMBER = 1;
    private int storeType_;
    /**
     * <code>.StoreType store_type = 1;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    @java.lang.Override public int getStoreTypeValue() {
      return storeType_;
    }
    /**
     * <code>.StoreType store_type = 1;</code>
     * @return The storeType.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType getStoreType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType result = emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType.valueOf(storeType_);
      return result == null ? emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
    }

    public static final int WEIGHT_LIMIT_FIELD_NUMBER = 14;
    private int weightLimit_;
    /**
     * <code>uint32 weight_limit = 14;</code>
     * @return The weightLimit.
     */
    @java.lang.Override
    public int getWeightLimit() {
      return weightLimit_;
    }

    public static final int ITEM_LIST_FIELD_NUMBER = 10;
    private java.util.List<emu.grasscutter.net.newproto.ItemOuterClass.Item> itemList_;
    /**
     * <code>repeated .Item item_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.ItemOuterClass.Item> getItemListList() {
      return itemList_;
    }
    /**
     * <code>repeated .Item item_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.ItemOuterClass.ItemOrBuilder> 
        getItemListOrBuilderList() {
      return itemList_;
    }
    /**
     * <code>repeated .Item item_list = 10;</code>
     */
    @java.lang.Override
    public int getItemListCount() {
      return itemList_.size();
    }
    /**
     * <code>repeated .Item item_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ItemOuterClass.Item getItemList(int index) {
      return itemList_.get(index);
    }
    /**
     * <code>repeated .Item item_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ItemOuterClass.ItemOrBuilder getItemListOrBuilder(
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
      if (storeType_ != emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
        output.writeEnum(1, storeType_);
      }
      for (int i = 0; i < itemList_.size(); i++) {
        output.writeMessage(10, itemList_.get(i));
      }
      if (weightLimit_ != 0) {
        output.writeUInt32(14, weightLimit_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (storeType_ != emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, storeType_);
      }
      for (int i = 0; i < itemList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, itemList_.get(i));
      }
      if (weightLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, weightLimit_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify other = (emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify) obj;

      if (storeType_ != other.storeType_) return false;
      if (getWeightLimit()
          != other.getWeightLimit()) return false;
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
      hash = (37 * hash) + STORE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + storeType_;
      hash = (37 * hash) + WEIGHT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getWeightLimit();
      if (getItemListCount() > 0) {
        hash = (37 * hash) + ITEM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify prototype) {
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
     *   CMD_ID = 679;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerStoreNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerStoreNotify)
        emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.internal_static_PlayerStoreNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.internal_static_PlayerStoreNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify.class, emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        storeType_ = 0;

        weightLimit_ = 0;

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
        return emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.internal_static_PlayerStoreNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify build() {
        emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify buildPartial() {
        emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify result = new emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify(this);
        int from_bitField0_ = bitField0_;
        result.storeType_ = storeType_;
        result.weightLimit_ = weightLimit_;
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
        if (other instanceof emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify other) {
        if (other == emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify.getDefaultInstance()) return this;
        if (other.storeType_ != 0) {
          setStoreTypeValue(other.getStoreTypeValue());
        }
        if (other.getWeightLimit() != 0) {
          setWeightLimit(other.getWeightLimit());
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
              case 8: {
                storeType_ = input.readEnum();

                break;
              } // case 8
              case 82: {
                emu.grasscutter.net.newproto.ItemOuterClass.Item m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.ItemOuterClass.Item.parser(),
                        extensionRegistry);
                if (itemListBuilder_ == null) {
                  ensureItemListIsMutable();
                  itemList_.add(m);
                } else {
                  itemListBuilder_.addMessage(m);
                }
                break;
              } // case 82
              case 112: {
                weightLimit_ = input.readUInt32();

                break;
              } // case 112
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

      private int storeType_ = 0;
      /**
       * <code>.StoreType store_type = 1;</code>
       * @return The enum numeric value on the wire for storeType.
       */
      @java.lang.Override public int getStoreTypeValue() {
        return storeType_;
      }
      /**
       * <code>.StoreType store_type = 1;</code>
       * @param value The enum numeric value on the wire for storeType to set.
       * @return This builder for chaining.
       */
      public Builder setStoreTypeValue(int value) {
        
        storeType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.StoreType store_type = 1;</code>
       * @return The storeType.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType getStoreType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType result = emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType.valueOf(storeType_);
        return result == null ? emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
      }
      /**
       * <code>.StoreType store_type = 1;</code>
       * @param value The storeType to set.
       * @return This builder for chaining.
       */
      public Builder setStoreType(emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        storeType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.StoreType store_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreType() {
        
        storeType_ = 0;
        onChanged();
        return this;
      }

      private int weightLimit_ ;
      /**
       * <code>uint32 weight_limit = 14;</code>
       * @return The weightLimit.
       */
      @java.lang.Override
      public int getWeightLimit() {
        return weightLimit_;
      }
      /**
       * <code>uint32 weight_limit = 14;</code>
       * @param value The weightLimit to set.
       * @return This builder for chaining.
       */
      public Builder setWeightLimit(int value) {
        
        weightLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weight_limit = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeightLimit() {
        
        weightLimit_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.newproto.ItemOuterClass.Item> itemList_ =
        java.util.Collections.emptyList();
      private void ensureItemListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.ItemOuterClass.Item>(itemList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.ItemOuterClass.Item, emu.grasscutter.net.newproto.ItemOuterClass.Item.Builder, emu.grasscutter.net.newproto.ItemOuterClass.ItemOrBuilder> itemListBuilder_;

      /**
       * <code>repeated .Item item_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.ItemOuterClass.Item> getItemListList() {
        if (itemListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(itemList_);
        } else {
          return itemListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Item item_list = 10;</code>
       */
      public int getItemListCount() {
        if (itemListBuilder_ == null) {
          return itemList_.size();
        } else {
          return itemListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Item item_list = 10;</code>
       */
      public emu.grasscutter.net.newproto.ItemOuterClass.Item getItemList(int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);
        } else {
          return itemListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Item item_list = 10;</code>
       */
      public Builder setItemList(
          int index, emu.grasscutter.net.newproto.ItemOuterClass.Item value) {
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
       * <code>repeated .Item item_list = 10;</code>
       */
      public Builder setItemList(
          int index, emu.grasscutter.net.newproto.ItemOuterClass.Item.Builder builderForValue) {
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
       * <code>repeated .Item item_list = 10;</code>
       */
      public Builder addItemList(emu.grasscutter.net.newproto.ItemOuterClass.Item value) {
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
       * <code>repeated .Item item_list = 10;</code>
       */
      public Builder addItemList(
          int index, emu.grasscutter.net.newproto.ItemOuterClass.Item value) {
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
       * <code>repeated .Item item_list = 10;</code>
       */
      public Builder addItemList(
          emu.grasscutter.net.newproto.ItemOuterClass.Item.Builder builderForValue) {
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
       * <code>repeated .Item item_list = 10;</code>
       */
      public Builder addItemList(
          int index, emu.grasscutter.net.newproto.ItemOuterClass.Item.Builder builderForValue) {
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
       * <code>repeated .Item item_list = 10;</code>
       */
      public Builder addAllItemList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.ItemOuterClass.Item> values) {
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
       * <code>repeated .Item item_list = 10;</code>
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
       * <code>repeated .Item item_list = 10;</code>
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
       * <code>repeated .Item item_list = 10;</code>
       */
      public emu.grasscutter.net.newproto.ItemOuterClass.Item.Builder getItemListBuilder(
          int index) {
        return getItemListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Item item_list = 10;</code>
       */
      public emu.grasscutter.net.newproto.ItemOuterClass.ItemOrBuilder getItemListOrBuilder(
          int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);  } else {
          return itemListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Item item_list = 10;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.ItemOuterClass.ItemOrBuilder> 
           getItemListOrBuilderList() {
        if (itemListBuilder_ != null) {
          return itemListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(itemList_);
        }
      }
      /**
       * <code>repeated .Item item_list = 10;</code>
       */
      public emu.grasscutter.net.newproto.ItemOuterClass.Item.Builder addItemListBuilder() {
        return getItemListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.ItemOuterClass.Item.getDefaultInstance());
      }
      /**
       * <code>repeated .Item item_list = 10;</code>
       */
      public emu.grasscutter.net.newproto.ItemOuterClass.Item.Builder addItemListBuilder(
          int index) {
        return getItemListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.ItemOuterClass.Item.getDefaultInstance());
      }
      /**
       * <code>repeated .Item item_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.ItemOuterClass.Item.Builder> 
           getItemListBuilderList() {
        return getItemListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.ItemOuterClass.Item, emu.grasscutter.net.newproto.ItemOuterClass.Item.Builder, emu.grasscutter.net.newproto.ItemOuterClass.ItemOrBuilder> 
          getItemListFieldBuilder() {
        if (itemListBuilder_ == null) {
          itemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.ItemOuterClass.Item, emu.grasscutter.net.newproto.ItemOuterClass.Item.Builder, emu.grasscutter.net.newproto.ItemOuterClass.ItemOrBuilder>(
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


      // @@protoc_insertion_point(builder_scope:PlayerStoreNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerStoreNotify)
    private static final emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify();
    }

    public static emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerStoreNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerStoreNotify>() {
      @java.lang.Override
      public PlayerStoreNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerStoreNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerStoreNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PlayerStoreNotifyOuterClass.PlayerStoreNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerStoreNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerStoreNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PlayerStoreNotify.proto\032\nItem.proto\032\017S" +
      "toreType.proto\"c\n\021PlayerStoreNotify\022\036\n\ns" +
      "tore_type\030\001 \001(\0162\n.StoreType\022\024\n\014weight_li" +
      "mit\030\016 \001(\r\022\030\n\titem_list\030\n \003(\0132\005.ItemB\036\n\034e" +
      "mu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ItemOuterClass.getDescriptor(),
          emu.grasscutter.net.newproto.StoreTypeOuterClass.getDescriptor(),
        });
    internal_static_PlayerStoreNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerStoreNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerStoreNotify_descriptor,
        new java.lang.String[] { "StoreType", "WeightLimit", "ItemList", });
    emu.grasscutter.net.newproto.ItemOuterClass.getDescriptor();
    emu.grasscutter.net.newproto.StoreTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
