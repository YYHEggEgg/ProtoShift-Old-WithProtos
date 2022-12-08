// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BartenderCompleteOrderRsp.proto

package emu.grasscutter.net.newproto;

public final class BartenderCompleteOrderRspOuterClass {
  private BartenderCompleteOrderRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BartenderCompleteOrderRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BartenderCompleteOrderRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 formula_id = 9;</code>
     * @return The formulaId.
     */
    int getFormulaId();

    /**
     * <code>uint32 quest_id = 7;</code>
     * @return The questId.
     */
    int getQuestId();

    /**
     * <code>uint32 finish_order_id = 6;</code>
     * @return The finishOrderId.
     */
    int getFinishOrderId();

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool is_new = 8;</code>
     * @return The isNew.
     */
    boolean getIsNew();

    /**
     * <code>repeated uint32 affix_list = 1;</code>
     * @return A list containing the affixList.
     */
    java.util.List<java.lang.Integer> getAffixListList();
    /**
     * <code>repeated uint32 affix_list = 1;</code>
     * @return The count of affixList.
     */
    int getAffixListCount();
    /**
     * <code>repeated uint32 affix_list = 1;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    int getAffixList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8870;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code BartenderCompleteOrderRsp}
   */
  public static final class BartenderCompleteOrderRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BartenderCompleteOrderRsp)
      BartenderCompleteOrderRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BartenderCompleteOrderRsp.newBuilder() to construct.
    private BartenderCompleteOrderRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BartenderCompleteOrderRsp() {
      affixList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BartenderCompleteOrderRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.internal_static_BartenderCompleteOrderRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.internal_static_BartenderCompleteOrderRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp.class, emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp.Builder.class);
    }

    public static final int FORMULA_ID_FIELD_NUMBER = 9;
    private int formulaId_;
    /**
     * <code>uint32 formula_id = 9;</code>
     * @return The formulaId.
     */
    @java.lang.Override
    public int getFormulaId() {
      return formulaId_;
    }

    public static final int QUEST_ID_FIELD_NUMBER = 7;
    private int questId_;
    /**
     * <code>uint32 quest_id = 7;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
    }

    public static final int FINISH_ORDER_ID_FIELD_NUMBER = 6;
    private int finishOrderId_;
    /**
     * <code>uint32 finish_order_id = 6;</code>
     * @return The finishOrderId.
     */
    @java.lang.Override
    public int getFinishOrderId() {
      return finishOrderId_;
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

    public static final int IS_NEW_FIELD_NUMBER = 8;
    private boolean isNew_;
    /**
     * <code>bool is_new = 8;</code>
     * @return The isNew.
     */
    @java.lang.Override
    public boolean getIsNew() {
      return isNew_;
    }

    public static final int AFFIX_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList affixList_;
    /**
     * <code>repeated uint32 affix_list = 1;</code>
     * @return A list containing the affixList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAffixListList() {
      return affixList_;
    }
    /**
     * <code>repeated uint32 affix_list = 1;</code>
     * @return The count of affixList.
     */
    public int getAffixListCount() {
      return affixList_.size();
    }
    /**
     * <code>repeated uint32 affix_list = 1;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    public int getAffixList(int index) {
      return affixList_.getInt(index);
    }
    private int affixListMemoizedSerializedSize = -1;

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
      if (getAffixListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(affixListMemoizedSerializedSize);
      }
      for (int i = 0; i < affixList_.size(); i++) {
        output.writeUInt32NoTag(affixList_.getInt(i));
      }
      if (finishOrderId_ != 0) {
        output.writeUInt32(6, finishOrderId_);
      }
      if (questId_ != 0) {
        output.writeUInt32(7, questId_);
      }
      if (isNew_ != false) {
        output.writeBool(8, isNew_);
      }
      if (formulaId_ != 0) {
        output.writeUInt32(9, formulaId_);
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
      {
        int dataSize = 0;
        for (int i = 0; i < affixList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(affixList_.getInt(i));
        }
        size += dataSize;
        if (!getAffixListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        affixListMemoizedSerializedSize = dataSize;
      }
      if (finishOrderId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, finishOrderId_);
      }
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, questId_);
      }
      if (isNew_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isNew_);
      }
      if (formulaId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, formulaId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp other = (emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp) obj;

      if (getFormulaId()
          != other.getFormulaId()) return false;
      if (getQuestId()
          != other.getQuestId()) return false;
      if (getFinishOrderId()
          != other.getFinishOrderId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsNew()
          != other.getIsNew()) return false;
      if (!getAffixListList()
          .equals(other.getAffixListList())) return false;
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
      hash = (37 * hash) + FORMULA_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFormulaId();
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (37 * hash) + FINISH_ORDER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFinishOrderId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + IS_NEW_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNew());
      if (getAffixListCount() > 0) {
        hash = (37 * hash) + AFFIX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAffixListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp prototype) {
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
     *   CMD_ID = 8870;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code BartenderCompleteOrderRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BartenderCompleteOrderRsp)
        emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.internal_static_BartenderCompleteOrderRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.internal_static_BartenderCompleteOrderRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp.class, emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        formulaId_ = 0;

        questId_ = 0;

        finishOrderId_ = 0;

        retcode_ = 0;

        isNew_ = false;

        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.internal_static_BartenderCompleteOrderRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp build() {
        emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp buildPartial() {
        emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp result = new emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp(this);
        int from_bitField0_ = bitField0_;
        result.formulaId_ = formulaId_;
        result.questId_ = questId_;
        result.finishOrderId_ = finishOrderId_;
        result.retcode_ = retcode_;
        result.isNew_ = isNew_;
        if (((bitField0_ & 0x00000001) != 0)) {
          affixList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.affixList_ = affixList_;
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
        if (other instanceof emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp other) {
        if (other == emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp.getDefaultInstance()) return this;
        if (other.getFormulaId() != 0) {
          setFormulaId(other.getFormulaId());
        }
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
        }
        if (other.getFinishOrderId() != 0) {
          setFinishOrderId(other.getFinishOrderId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsNew() != false) {
          setIsNew(other.getIsNew());
        }
        if (!other.affixList_.isEmpty()) {
          if (affixList_.isEmpty()) {
            affixList_ = other.affixList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAffixListIsMutable();
            affixList_.addAll(other.affixList_);
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
                int v = input.readUInt32();
                ensureAffixListIsMutable();
                affixList_.addInt(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAffixListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  affixList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 10
              case 48: {
                finishOrderId_ = input.readUInt32();

                break;
              } // case 48
              case 56: {
                questId_ = input.readUInt32();

                break;
              } // case 56
              case 64: {
                isNew_ = input.readBool();

                break;
              } // case 64
              case 72: {
                formulaId_ = input.readUInt32();

                break;
              } // case 72
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

      private int formulaId_ ;
      /**
       * <code>uint32 formula_id = 9;</code>
       * @return The formulaId.
       */
      @java.lang.Override
      public int getFormulaId() {
        return formulaId_;
      }
      /**
       * <code>uint32 formula_id = 9;</code>
       * @param value The formulaId to set.
       * @return This builder for chaining.
       */
      public Builder setFormulaId(int value) {
        
        formulaId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 formula_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearFormulaId() {
        
        formulaId_ = 0;
        onChanged();
        return this;
      }

      private int questId_ ;
      /**
       * <code>uint32 quest_id = 7;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 quest_id = 7;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {
        
        questId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        
        questId_ = 0;
        onChanged();
        return this;
      }

      private int finishOrderId_ ;
      /**
       * <code>uint32 finish_order_id = 6;</code>
       * @return The finishOrderId.
       */
      @java.lang.Override
      public int getFinishOrderId() {
        return finishOrderId_;
      }
      /**
       * <code>uint32 finish_order_id = 6;</code>
       * @param value The finishOrderId to set.
       * @return This builder for chaining.
       */
      public Builder setFinishOrderId(int value) {
        
        finishOrderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_order_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishOrderId() {
        
        finishOrderId_ = 0;
        onChanged();
        return this;
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

      private boolean isNew_ ;
      /**
       * <code>bool is_new = 8;</code>
       * @return The isNew.
       */
      @java.lang.Override
      public boolean getIsNew() {
        return isNew_;
      }
      /**
       * <code>bool is_new = 8;</code>
       * @param value The isNew to set.
       * @return This builder for chaining.
       */
      public Builder setIsNew(boolean value) {
        
        isNew_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNew() {
        
        isNew_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList affixList_ = emptyIntList();
      private void ensureAffixListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          affixList_ = mutableCopy(affixList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 affix_list = 1;</code>
       * @return A list containing the affixList.
       */
      public java.util.List<java.lang.Integer>
          getAffixListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(affixList_) : affixList_;
      }
      /**
       * <code>repeated uint32 affix_list = 1;</code>
       * @return The count of affixList.
       */
      public int getAffixListCount() {
        return affixList_.size();
      }
      /**
       * <code>repeated uint32 affix_list = 1;</code>
       * @param index The index of the element to return.
       * @return The affixList at the given index.
       */
      public int getAffixList(int index) {
        return affixList_.getInt(index);
      }
      /**
       * <code>repeated uint32 affix_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The affixList to set.
       * @return This builder for chaining.
       */
      public Builder setAffixList(
          int index, int value) {
        ensureAffixListIsMutable();
        affixList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 1;</code>
       * @param value The affixList to add.
       * @return This builder for chaining.
       */
      public Builder addAffixList(int value) {
        ensureAffixListIsMutable();
        affixList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 1;</code>
       * @param values The affixList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAffixList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAffixListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, affixList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAffixList() {
        affixList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:BartenderCompleteOrderRsp)
    }

    // @@protoc_insertion_point(class_scope:BartenderCompleteOrderRsp)
    private static final emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp();
    }

    public static emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BartenderCompleteOrderRsp>
        PARSER = new com.google.protobuf.AbstractParser<BartenderCompleteOrderRsp>() {
      @java.lang.Override
      public BartenderCompleteOrderRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<BartenderCompleteOrderRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BartenderCompleteOrderRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.BartenderCompleteOrderRspOuterClass.BartenderCompleteOrderRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BartenderCompleteOrderRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BartenderCompleteOrderRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037BartenderCompleteOrderRsp.proto\"\217\001\n\031Ba" +
      "rtenderCompleteOrderRsp\022\022\n\nformula_id\030\t " +
      "\001(\r\022\020\n\010quest_id\030\007 \001(\r\022\027\n\017finish_order_id" +
      "\030\006 \001(\r\022\017\n\007retcode\030\n \001(\005\022\016\n\006is_new\030\010 \001(\010\022" +
      "\022\n\naffix_list\030\001 \003(\rB\036\n\034emu.grasscutter.n" +
      "et.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BartenderCompleteOrderRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BartenderCompleteOrderRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BartenderCompleteOrderRsp_descriptor,
        new java.lang.String[] { "FormulaId", "QuestId", "FinishOrderId", "Retcode", "IsNew", "AffixList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
