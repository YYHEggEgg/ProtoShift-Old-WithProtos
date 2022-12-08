// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGOperationPlayCard.proto

package emu.grasscutter.net.newproto;

public final class GCGOperationPlayCardOuterClass {
  private GCGOperationPlayCardOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGOperationPlayCardOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGOperationPlayCard)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 replace_card_guid = 8;</code>
     * @return The replaceCardGuid.
     */
    int getReplaceCardGuid();

    /**
     * <code>repeated uint32 target_card_guid_list = 14;</code>
     * @return A list containing the targetCardGuidList.
     */
    java.util.List<java.lang.Integer> getTargetCardGuidListList();
    /**
     * <code>repeated uint32 target_card_guid_list = 14;</code>
     * @return The count of targetCardGuidList.
     */
    int getTargetCardGuidListCount();
    /**
     * <code>repeated uint32 target_card_guid_list = 14;</code>
     * @param index The index of the element to return.
     * @return The targetCardGuidList at the given index.
     */
    int getTargetCardGuidList(int index);

    /**
     * <code>uint32 card_guid = 1;</code>
     * @return The cardGuid.
     */
    int getCardGuid();

    /**
     * <code>repeated uint32 cost_dice_index_list = 11;</code>
     * @return A list containing the costDiceIndexList.
     */
    java.util.List<java.lang.Integer> getCostDiceIndexListList();
    /**
     * <code>repeated uint32 cost_dice_index_list = 11;</code>
     * @return The count of costDiceIndexList.
     */
    int getCostDiceIndexListCount();
    /**
     * <code>repeated uint32 cost_dice_index_list = 11;</code>
     * @param index The index of the element to return.
     * @return The costDiceIndexList at the given index.
     */
    int getCostDiceIndexList(int index);
  }
  /**
   * Protobuf type {@code GCGOperationPlayCard}
   */
  public static final class GCGOperationPlayCard extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGOperationPlayCard)
      GCGOperationPlayCardOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGOperationPlayCard.newBuilder() to construct.
    private GCGOperationPlayCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGOperationPlayCard() {
      targetCardGuidList_ = emptyIntList();
      costDiceIndexList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGOperationPlayCard();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.internal_static_GCGOperationPlayCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.internal_static_GCGOperationPlayCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard.class, emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard.Builder.class);
    }

    public static final int REPLACE_CARD_GUID_FIELD_NUMBER = 8;
    private int replaceCardGuid_;
    /**
     * <code>uint32 replace_card_guid = 8;</code>
     * @return The replaceCardGuid.
     */
    @java.lang.Override
    public int getReplaceCardGuid() {
      return replaceCardGuid_;
    }

    public static final int TARGET_CARD_GUID_LIST_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList targetCardGuidList_;
    /**
     * <code>repeated uint32 target_card_guid_list = 14;</code>
     * @return A list containing the targetCardGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getTargetCardGuidListList() {
      return targetCardGuidList_;
    }
    /**
     * <code>repeated uint32 target_card_guid_list = 14;</code>
     * @return The count of targetCardGuidList.
     */
    public int getTargetCardGuidListCount() {
      return targetCardGuidList_.size();
    }
    /**
     * <code>repeated uint32 target_card_guid_list = 14;</code>
     * @param index The index of the element to return.
     * @return The targetCardGuidList at the given index.
     */
    public int getTargetCardGuidList(int index) {
      return targetCardGuidList_.getInt(index);
    }
    private int targetCardGuidListMemoizedSerializedSize = -1;

    public static final int CARD_GUID_FIELD_NUMBER = 1;
    private int cardGuid_;
    /**
     * <code>uint32 card_guid = 1;</code>
     * @return The cardGuid.
     */
    @java.lang.Override
    public int getCardGuid() {
      return cardGuid_;
    }

    public static final int COST_DICE_INDEX_LIST_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList costDiceIndexList_;
    /**
     * <code>repeated uint32 cost_dice_index_list = 11;</code>
     * @return A list containing the costDiceIndexList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCostDiceIndexListList() {
      return costDiceIndexList_;
    }
    /**
     * <code>repeated uint32 cost_dice_index_list = 11;</code>
     * @return The count of costDiceIndexList.
     */
    public int getCostDiceIndexListCount() {
      return costDiceIndexList_.size();
    }
    /**
     * <code>repeated uint32 cost_dice_index_list = 11;</code>
     * @param index The index of the element to return.
     * @return The costDiceIndexList at the given index.
     */
    public int getCostDiceIndexList(int index) {
      return costDiceIndexList_.getInt(index);
    }
    private int costDiceIndexListMemoizedSerializedSize = -1;

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
      if (cardGuid_ != 0) {
        output.writeUInt32(1, cardGuid_);
      }
      if (replaceCardGuid_ != 0) {
        output.writeUInt32(8, replaceCardGuid_);
      }
      if (getCostDiceIndexListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(costDiceIndexListMemoizedSerializedSize);
      }
      for (int i = 0; i < costDiceIndexList_.size(); i++) {
        output.writeUInt32NoTag(costDiceIndexList_.getInt(i));
      }
      if (getTargetCardGuidListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(targetCardGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < targetCardGuidList_.size(); i++) {
        output.writeUInt32NoTag(targetCardGuidList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, cardGuid_);
      }
      if (replaceCardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, replaceCardGuid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < costDiceIndexList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(costDiceIndexList_.getInt(i));
        }
        size += dataSize;
        if (!getCostDiceIndexListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        costDiceIndexListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < targetCardGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(targetCardGuidList_.getInt(i));
        }
        size += dataSize;
        if (!getTargetCardGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        targetCardGuidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard other = (emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard) obj;

      if (getReplaceCardGuid()
          != other.getReplaceCardGuid()) return false;
      if (!getTargetCardGuidListList()
          .equals(other.getTargetCardGuidListList())) return false;
      if (getCardGuid()
          != other.getCardGuid()) return false;
      if (!getCostDiceIndexListList()
          .equals(other.getCostDiceIndexListList())) return false;
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
      hash = (37 * hash) + REPLACE_CARD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getReplaceCardGuid();
      if (getTargetCardGuidListCount() > 0) {
        hash = (37 * hash) + TARGET_CARD_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTargetCardGuidListList().hashCode();
      }
      hash = (37 * hash) + CARD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getCardGuid();
      if (getCostDiceIndexListCount() > 0) {
        hash = (37 * hash) + COST_DICE_INDEX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCostDiceIndexListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard prototype) {
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
     * Protobuf type {@code GCGOperationPlayCard}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGOperationPlayCard)
        emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCardOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.internal_static_GCGOperationPlayCard_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.internal_static_GCGOperationPlayCard_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard.class, emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        replaceCardGuid_ = 0;

        targetCardGuidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        cardGuid_ = 0;

        costDiceIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.internal_static_GCGOperationPlayCard_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard build() {
        emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard buildPartial() {
        emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard result = new emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard(this);
        int from_bitField0_ = bitField0_;
        result.replaceCardGuid_ = replaceCardGuid_;
        if (((bitField0_ & 0x00000001) != 0)) {
          targetCardGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.targetCardGuidList_ = targetCardGuidList_;
        result.cardGuid_ = cardGuid_;
        if (((bitField0_ & 0x00000002) != 0)) {
          costDiceIndexList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.costDiceIndexList_ = costDiceIndexList_;
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
        if (other instanceof emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard) {
          return mergeFrom((emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard other) {
        if (other == emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard.getDefaultInstance()) return this;
        if (other.getReplaceCardGuid() != 0) {
          setReplaceCardGuid(other.getReplaceCardGuid());
        }
        if (!other.targetCardGuidList_.isEmpty()) {
          if (targetCardGuidList_.isEmpty()) {
            targetCardGuidList_ = other.targetCardGuidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTargetCardGuidListIsMutable();
            targetCardGuidList_.addAll(other.targetCardGuidList_);
          }
          onChanged();
        }
        if (other.getCardGuid() != 0) {
          setCardGuid(other.getCardGuid());
        }
        if (!other.costDiceIndexList_.isEmpty()) {
          if (costDiceIndexList_.isEmpty()) {
            costDiceIndexList_ = other.costDiceIndexList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureCostDiceIndexListIsMutable();
            costDiceIndexList_.addAll(other.costDiceIndexList_);
          }
          onChanged();
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
                cardGuid_ = input.readUInt32();

                break;
              } // case 8
              case 64: {
                replaceCardGuid_ = input.readUInt32();

                break;
              } // case 64
              case 88: {
                int v = input.readUInt32();
                ensureCostDiceIndexListIsMutable();
                costDiceIndexList_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCostDiceIndexListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  costDiceIndexList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 90
              case 112: {
                int v = input.readUInt32();
                ensureTargetCardGuidListIsMutable();
                targetCardGuidList_.addInt(v);
                break;
              } // case 112
              case 114: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureTargetCardGuidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  targetCardGuidList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 114
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

      private int replaceCardGuid_ ;
      /**
       * <code>uint32 replace_card_guid = 8;</code>
       * @return The replaceCardGuid.
       */
      @java.lang.Override
      public int getReplaceCardGuid() {
        return replaceCardGuid_;
      }
      /**
       * <code>uint32 replace_card_guid = 8;</code>
       * @param value The replaceCardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setReplaceCardGuid(int value) {
        
        replaceCardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 replace_card_guid = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearReplaceCardGuid() {
        
        replaceCardGuid_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList targetCardGuidList_ = emptyIntList();
      private void ensureTargetCardGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          targetCardGuidList_ = mutableCopy(targetCardGuidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 target_card_guid_list = 14;</code>
       * @return A list containing the targetCardGuidList.
       */
      public java.util.List<java.lang.Integer>
          getTargetCardGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(targetCardGuidList_) : targetCardGuidList_;
      }
      /**
       * <code>repeated uint32 target_card_guid_list = 14;</code>
       * @return The count of targetCardGuidList.
       */
      public int getTargetCardGuidListCount() {
        return targetCardGuidList_.size();
      }
      /**
       * <code>repeated uint32 target_card_guid_list = 14;</code>
       * @param index The index of the element to return.
       * @return The targetCardGuidList at the given index.
       */
      public int getTargetCardGuidList(int index) {
        return targetCardGuidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 target_card_guid_list = 14;</code>
       * @param index The index to set the value at.
       * @param value The targetCardGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setTargetCardGuidList(
          int index, int value) {
        ensureTargetCardGuidListIsMutable();
        targetCardGuidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 target_card_guid_list = 14;</code>
       * @param value The targetCardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addTargetCardGuidList(int value) {
        ensureTargetCardGuidListIsMutable();
        targetCardGuidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 target_card_guid_list = 14;</code>
       * @param values The targetCardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTargetCardGuidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTargetCardGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, targetCardGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 target_card_guid_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetCardGuidList() {
        targetCardGuidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int cardGuid_ ;
      /**
       * <code>uint32 card_guid = 1;</code>
       * @return The cardGuid.
       */
      @java.lang.Override
      public int getCardGuid() {
        return cardGuid_;
      }
      /**
       * <code>uint32 card_guid = 1;</code>
       * @param value The cardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuid(int value) {
        
        cardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_guid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuid() {
        
        cardGuid_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList costDiceIndexList_ = emptyIntList();
      private void ensureCostDiceIndexListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          costDiceIndexList_ = mutableCopy(costDiceIndexList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 cost_dice_index_list = 11;</code>
       * @return A list containing the costDiceIndexList.
       */
      public java.util.List<java.lang.Integer>
          getCostDiceIndexListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(costDiceIndexList_) : costDiceIndexList_;
      }
      /**
       * <code>repeated uint32 cost_dice_index_list = 11;</code>
       * @return The count of costDiceIndexList.
       */
      public int getCostDiceIndexListCount() {
        return costDiceIndexList_.size();
      }
      /**
       * <code>repeated uint32 cost_dice_index_list = 11;</code>
       * @param index The index of the element to return.
       * @return The costDiceIndexList at the given index.
       */
      public int getCostDiceIndexList(int index) {
        return costDiceIndexList_.getInt(index);
      }
      /**
       * <code>repeated uint32 cost_dice_index_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The costDiceIndexList to set.
       * @return This builder for chaining.
       */
      public Builder setCostDiceIndexList(
          int index, int value) {
        ensureCostDiceIndexListIsMutable();
        costDiceIndexList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cost_dice_index_list = 11;</code>
       * @param value The costDiceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addCostDiceIndexList(int value) {
        ensureCostDiceIndexListIsMutable();
        costDiceIndexList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cost_dice_index_list = 11;</code>
       * @param values The costDiceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCostDiceIndexList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCostDiceIndexListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, costDiceIndexList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cost_dice_index_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostDiceIndexList() {
        costDiceIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:GCGOperationPlayCard)
    }

    // @@protoc_insertion_point(class_scope:GCGOperationPlayCard)
    private static final emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard();
    }

    public static emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGOperationPlayCard>
        PARSER = new com.google.protobuf.AbstractParser<GCGOperationPlayCard>() {
      @java.lang.Override
      public GCGOperationPlayCard parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGOperationPlayCard> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGOperationPlayCard> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGOperationPlayCardOuterClass.GCGOperationPlayCard getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGOperationPlayCard_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGOperationPlayCard_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032GCGOperationPlayCard.proto\"\201\001\n\024GCGOper" +
      "ationPlayCard\022\031\n\021replace_card_guid\030\010 \001(\r" +
      "\022\035\n\025target_card_guid_list\030\016 \003(\r\022\021\n\tcard_" +
      "guid\030\001 \001(\r\022\034\n\024cost_dice_index_list\030\013 \003(\r" +
      "B\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGOperationPlayCard_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGOperationPlayCard_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGOperationPlayCard_descriptor,
        new java.lang.String[] { "ReplaceCardGuid", "TargetCardGuidList", "CardGuid", "CostDiceIndexList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
