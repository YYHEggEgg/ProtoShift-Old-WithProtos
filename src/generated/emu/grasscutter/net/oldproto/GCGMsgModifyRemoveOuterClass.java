// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgModifyRemove.proto

package emu.grasscutter.net.oldproto;

public final class GCGMsgModifyRemoveOuterClass {
  private GCGMsgModifyRemoveOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgModifyRemoveOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgModifyRemove)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 controller_id = 14;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>.GCGReason reason = 12;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GCGReason reason = 12;</code>
     * @return The reason.
     */
    emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason getReason();

    /**
     * <code>uint32 owner_card_guid = 5;</code>
     * @return The ownerCardGuid.
     */
    int getOwnerCardGuid();

    /**
     * <code>repeated uint32 card_guid_list = 4;</code>
     * @return A list containing the cardGuidList.
     */
    java.util.List<java.lang.Integer> getCardGuidListList();
    /**
     * <code>repeated uint32 card_guid_list = 4;</code>
     * @return The count of cardGuidList.
     */
    int getCardGuidListCount();
    /**
     * <code>repeated uint32 card_guid_list = 4;</code>
     * @param index The index of the element to return.
     * @return The cardGuidList at the given index.
     */
    int getCardGuidList(int index);
  }
  /**
   * Protobuf type {@code GCGMsgModifyRemove}
   */
  public static final class GCGMsgModifyRemove extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgModifyRemove)
      GCGMsgModifyRemoveOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgModifyRemove.newBuilder() to construct.
    private GCGMsgModifyRemove(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgModifyRemove() {
      reason_ = 0;
      cardGuidList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgModifyRemove();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.internal_static_GCGMsgModifyRemove_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.internal_static_GCGMsgModifyRemove_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove.class, emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove.Builder.class);
    }

    public static final int CONTROLLER_ID_FIELD_NUMBER = 14;
    private int controllerId_;
    /**
     * <code>uint32 controller_id = 14;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int REASON_FIELD_NUMBER = 12;
    private int reason_;
    /**
     * <code>.GCGReason reason = 12;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GCGReason reason = 12;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason result = emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
    }

    public static final int OWNER_CARD_GUID_FIELD_NUMBER = 5;
    private int ownerCardGuid_;
    /**
     * <code>uint32 owner_card_guid = 5;</code>
     * @return The ownerCardGuid.
     */
    @java.lang.Override
    public int getOwnerCardGuid() {
      return ownerCardGuid_;
    }

    public static final int CARD_GUID_LIST_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList cardGuidList_;
    /**
     * <code>repeated uint32 card_guid_list = 4;</code>
     * @return A list containing the cardGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCardGuidListList() {
      return cardGuidList_;
    }
    /**
     * <code>repeated uint32 card_guid_list = 4;</code>
     * @return The count of cardGuidList.
     */
    public int getCardGuidListCount() {
      return cardGuidList_.size();
    }
    /**
     * <code>repeated uint32 card_guid_list = 4;</code>
     * @param index The index of the element to return.
     * @return The cardGuidList at the given index.
     */
    public int getCardGuidList(int index) {
      return cardGuidList_.getInt(index);
    }
    private int cardGuidListMemoizedSerializedSize = -1;

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
      if (getCardGuidListList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(cardGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < cardGuidList_.size(); i++) {
        output.writeUInt32NoTag(cardGuidList_.getInt(i));
      }
      if (ownerCardGuid_ != 0) {
        output.writeUInt32(5, ownerCardGuid_);
      }
      if (reason_ != emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        output.writeEnum(12, reason_);
      }
      if (controllerId_ != 0) {
        output.writeUInt32(14, controllerId_);
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
        for (int i = 0; i < cardGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cardGuidList_.getInt(i));
        }
        size += dataSize;
        if (!getCardGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cardGuidListMemoizedSerializedSize = dataSize;
      }
      if (ownerCardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, ownerCardGuid_);
      }
      if (reason_ != emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, reason_);
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, controllerId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove other = (emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove) obj;

      if (getControllerId()
          != other.getControllerId()) return false;
      if (reason_ != other.reason_) return false;
      if (getOwnerCardGuid()
          != other.getOwnerCardGuid()) return false;
      if (!getCardGuidListList()
          .equals(other.getCardGuidListList())) return false;
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
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + OWNER_CARD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerCardGuid();
      if (getCardGuidListCount() > 0) {
        hash = (37 * hash) + CARD_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCardGuidListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove prototype) {
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
     * Protobuf type {@code GCGMsgModifyRemove}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgModifyRemove)
        emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemoveOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.internal_static_GCGMsgModifyRemove_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.internal_static_GCGMsgModifyRemove_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove.class, emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        controllerId_ = 0;

        reason_ = 0;

        ownerCardGuid_ = 0;

        cardGuidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.internal_static_GCGMsgModifyRemove_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove build() {
        emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove buildPartial() {
        emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove result = new emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove(this);
        int from_bitField0_ = bitField0_;
        result.controllerId_ = controllerId_;
        result.reason_ = reason_;
        result.ownerCardGuid_ = ownerCardGuid_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cardGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cardGuidList_ = cardGuidList_;
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
        if (other instanceof emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove) {
          return mergeFrom((emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove other) {
        if (other == emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove.getDefaultInstance()) return this;
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getOwnerCardGuid() != 0) {
          setOwnerCardGuid(other.getOwnerCardGuid());
        }
        if (!other.cardGuidList_.isEmpty()) {
          if (cardGuidList_.isEmpty()) {
            cardGuidList_ = other.cardGuidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCardGuidListIsMutable();
            cardGuidList_.addAll(other.cardGuidList_);
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
              case 32: {
                int v = input.readUInt32();
                ensureCardGuidListIsMutable();
                cardGuidList_.addInt(v);
                break;
              } // case 32
              case 34: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCardGuidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  cardGuidList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 34
              case 40: {
                ownerCardGuid_ = input.readUInt32();

                break;
              } // case 40
              case 96: {
                reason_ = input.readEnum();

                break;
              } // case 96
              case 112: {
                controllerId_ = input.readUInt32();

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

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 14;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 14;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.GCGReason reason = 12;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GCGReason reason = 12;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 12;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason result = emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGReason reason = 12;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int ownerCardGuid_ ;
      /**
       * <code>uint32 owner_card_guid = 5;</code>
       * @return The ownerCardGuid.
       */
      @java.lang.Override
      public int getOwnerCardGuid() {
        return ownerCardGuid_;
      }
      /**
       * <code>uint32 owner_card_guid = 5;</code>
       * @param value The ownerCardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setOwnerCardGuid(int value) {
        
        ownerCardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 owner_card_guid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearOwnerCardGuid() {
        
        ownerCardGuid_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList cardGuidList_ = emptyIntList();
      private void ensureCardGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cardGuidList_ = mutableCopy(cardGuidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 card_guid_list = 4;</code>
       * @return A list containing the cardGuidList.
       */
      public java.util.List<java.lang.Integer>
          getCardGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cardGuidList_) : cardGuidList_;
      }
      /**
       * <code>repeated uint32 card_guid_list = 4;</code>
       * @return The count of cardGuidList.
       */
      public int getCardGuidListCount() {
        return cardGuidList_.size();
      }
      /**
       * <code>repeated uint32 card_guid_list = 4;</code>
       * @param index The index of the element to return.
       * @return The cardGuidList at the given index.
       */
      public int getCardGuidList(int index) {
        return cardGuidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 card_guid_list = 4;</code>
       * @param index The index to set the value at.
       * @param value The cardGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuidList(
          int index, int value) {
        ensureCardGuidListIsMutable();
        cardGuidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_guid_list = 4;</code>
       * @param value The cardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addCardGuidList(int value) {
        ensureCardGuidListIsMutable();
        cardGuidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_guid_list = 4;</code>
       * @param values The cardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCardGuidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCardGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cardGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_guid_list = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuidList() {
        cardGuidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:GCGMsgModifyRemove)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgModifyRemove)
    private static final emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove();
    }

    public static emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgModifyRemove>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgModifyRemove>() {
      @java.lang.Override
      public GCGMsgModifyRemove parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGMsgModifyRemove> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgModifyRemove> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.GCGMsgModifyRemoveOuterClass.GCGMsgModifyRemove getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgModifyRemove_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgModifyRemove_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGMsgModifyRemove.proto\032\017GCGReason.pr" +
      "oto\"x\n\022GCGMsgModifyRemove\022\025\n\rcontroller_" +
      "id\030\016 \001(\r\022\032\n\006reason\030\014 \001(\0162\n.GCGReason\022\027\n\017" +
      "owner_card_guid\030\005 \001(\r\022\026\n\016card_guid_list\030" +
      "\004 \003(\rB\036\n\034emu.grasscutter.net.oldprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.GCGReasonOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgModifyRemove_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgModifyRemove_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgModifyRemove_descriptor,
        new java.lang.String[] { "ControllerId", "Reason", "OwnerCardGuid", "CardGuidList", });
    emu.grasscutter.net.oldproto.GCGReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
