// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgCostDice.proto

package emu.grasscutter.net.newproto;

public final class GCGMsgCostDiceOuterClass {
  private GCGMsgCostDiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgCostDiceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgCostDice)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGReason reason = 1;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GCGReason reason = 1;</code>
     * @return The reason.
     */
    emu.grasscutter.net.newproto.GCGReasonOuterClass.GCGReason getReason();

    /**
     * <code>repeated uint32 select_dice_index_list = 12;</code>
     * @return A list containing the selectDiceIndexList.
     */
    java.util.List<java.lang.Integer> getSelectDiceIndexListList();
    /**
     * <code>repeated uint32 select_dice_index_list = 12;</code>
     * @return The count of selectDiceIndexList.
     */
    int getSelectDiceIndexListCount();
    /**
     * <code>repeated uint32 select_dice_index_list = 12;</code>
     * @param index The index of the element to return.
     * @return The selectDiceIndexList at the given index.
     */
    int getSelectDiceIndexList(int index);

    /**
     * <code>uint32 controller_id = 7;</code>
     * @return The controllerId.
     */
    int getControllerId();
  }
  /**
   * Protobuf type {@code GCGMsgCostDice}
   */
  public static final class GCGMsgCostDice extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgCostDice)
      GCGMsgCostDiceOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgCostDice.newBuilder() to construct.
    private GCGMsgCostDice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgCostDice() {
      reason_ = 0;
      selectDiceIndexList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgCostDice();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.internal_static_GCGMsgCostDice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.internal_static_GCGMsgCostDice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice.class, emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_;
    /**
     * <code>.GCGReason reason = 1;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GCGReason reason = 1;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.GCGReasonOuterClass.GCGReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.GCGReasonOuterClass.GCGReason result = emu.grasscutter.net.newproto.GCGReasonOuterClass.GCGReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.newproto.GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
    }

    public static final int SELECT_DICE_INDEX_LIST_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList selectDiceIndexList_;
    /**
     * <code>repeated uint32 select_dice_index_list = 12;</code>
     * @return A list containing the selectDiceIndexList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSelectDiceIndexListList() {
      return selectDiceIndexList_;
    }
    /**
     * <code>repeated uint32 select_dice_index_list = 12;</code>
     * @return The count of selectDiceIndexList.
     */
    public int getSelectDiceIndexListCount() {
      return selectDiceIndexList_.size();
    }
    /**
     * <code>repeated uint32 select_dice_index_list = 12;</code>
     * @param index The index of the element to return.
     * @return The selectDiceIndexList at the given index.
     */
    public int getSelectDiceIndexList(int index) {
      return selectDiceIndexList_.getInt(index);
    }
    private int selectDiceIndexListMemoizedSerializedSize = -1;

    public static final int CONTROLLER_ID_FIELD_NUMBER = 7;
    private int controllerId_;
    /**
     * <code>uint32 controller_id = 7;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
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
      getSerializedSize();
      if (reason_ != emu.grasscutter.net.newproto.GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        output.writeEnum(1, reason_);
      }
      if (controllerId_ != 0) {
        output.writeUInt32(7, controllerId_);
      }
      if (getSelectDiceIndexListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(selectDiceIndexListMemoizedSerializedSize);
      }
      for (int i = 0; i < selectDiceIndexList_.size(); i++) {
        output.writeUInt32NoTag(selectDiceIndexList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != emu.grasscutter.net.newproto.GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, reason_);
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, controllerId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < selectDiceIndexList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(selectDiceIndexList_.getInt(i));
        }
        size += dataSize;
        if (!getSelectDiceIndexListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        selectDiceIndexListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice other = (emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice) obj;

      if (reason_ != other.reason_) return false;
      if (!getSelectDiceIndexListList()
          .equals(other.getSelectDiceIndexListList())) return false;
      if (getControllerId()
          != other.getControllerId()) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      if (getSelectDiceIndexListCount() > 0) {
        hash = (37 * hash) + SELECT_DICE_INDEX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSelectDiceIndexListList().hashCode();
      }
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice prototype) {
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
     * Protobuf type {@code GCGMsgCostDice}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgCostDice)
        emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDiceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.internal_static_GCGMsgCostDice_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.internal_static_GCGMsgCostDice_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice.class, emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        reason_ = 0;

        selectDiceIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        controllerId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.internal_static_GCGMsgCostDice_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice build() {
        emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice buildPartial() {
        emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice result = new emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice(this);
        int from_bitField0_ = bitField0_;
        result.reason_ = reason_;
        if (((bitField0_ & 0x00000001) != 0)) {
          selectDiceIndexList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.selectDiceIndexList_ = selectDiceIndexList_;
        result.controllerId_ = controllerId_;
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
        if (other instanceof emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice) {
          return mergeFrom((emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice other) {
        if (other == emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice.getDefaultInstance()) return this;
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (!other.selectDiceIndexList_.isEmpty()) {
          if (selectDiceIndexList_.isEmpty()) {
            selectDiceIndexList_ = other.selectDiceIndexList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSelectDiceIndexListIsMutable();
            selectDiceIndexList_.addAll(other.selectDiceIndexList_);
          }
          onChanged();
        }
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
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
                reason_ = input.readEnum();

                break;
              } // case 8
              case 56: {
                controllerId_ = input.readUInt32();

                break;
              } // case 56
              case 96: {
                int v = input.readUInt32();
                ensureSelectDiceIndexListIsMutable();
                selectDiceIndexList_.addInt(v);
                break;
              } // case 96
              case 98: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureSelectDiceIndexListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  selectDiceIndexList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
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

      private int reason_ = 0;
      /**
       * <code>.GCGReason reason = 1;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GCGReason reason = 1;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 1;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGReasonOuterClass.GCGReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.GCGReasonOuterClass.GCGReason result = emu.grasscutter.net.newproto.GCGReasonOuterClass.GCGReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.newproto.GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGReason reason = 1;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.newproto.GCGReasonOuterClass.GCGReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList selectDiceIndexList_ = emptyIntList();
      private void ensureSelectDiceIndexListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          selectDiceIndexList_ = mutableCopy(selectDiceIndexList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 select_dice_index_list = 12;</code>
       * @return A list containing the selectDiceIndexList.
       */
      public java.util.List<java.lang.Integer>
          getSelectDiceIndexListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(selectDiceIndexList_) : selectDiceIndexList_;
      }
      /**
       * <code>repeated uint32 select_dice_index_list = 12;</code>
       * @return The count of selectDiceIndexList.
       */
      public int getSelectDiceIndexListCount() {
        return selectDiceIndexList_.size();
      }
      /**
       * <code>repeated uint32 select_dice_index_list = 12;</code>
       * @param index The index of the element to return.
       * @return The selectDiceIndexList at the given index.
       */
      public int getSelectDiceIndexList(int index) {
        return selectDiceIndexList_.getInt(index);
      }
      /**
       * <code>repeated uint32 select_dice_index_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The selectDiceIndexList to set.
       * @return This builder for chaining.
       */
      public Builder setSelectDiceIndexList(
          int index, int value) {
        ensureSelectDiceIndexListIsMutable();
        selectDiceIndexList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 select_dice_index_list = 12;</code>
       * @param value The selectDiceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addSelectDiceIndexList(int value) {
        ensureSelectDiceIndexListIsMutable();
        selectDiceIndexList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 select_dice_index_list = 12;</code>
       * @param values The selectDiceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSelectDiceIndexList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSelectDiceIndexListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, selectDiceIndexList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 select_dice_index_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearSelectDiceIndexList() {
        selectDiceIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 7;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 7;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGMsgCostDice)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgCostDice)
    private static final emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice();
    }

    public static emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgCostDice>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgCostDice>() {
      @java.lang.Override
      public GCGMsgCostDice parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGMsgCostDice> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgCostDice> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGMsgCostDiceOuterClass.GCGMsgCostDice getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgCostDice_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgCostDice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024GCGMsgCostDice.proto\032\017GCGReason.proto\"" +
      "c\n\016GCGMsgCostDice\022\032\n\006reason\030\001 \001(\0162\n.GCGR" +
      "eason\022\036\n\026select_dice_index_list\030\014 \003(\r\022\025\n" +
      "\rcontroller_id\030\007 \001(\rB\036\n\034emu.grasscutter." +
      "net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.GCGReasonOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgCostDice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgCostDice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgCostDice_descriptor,
        new java.lang.String[] { "Reason", "SelectDiceIndexList", "ControllerId", });
    emu.grasscutter.net.newproto.GCGReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
