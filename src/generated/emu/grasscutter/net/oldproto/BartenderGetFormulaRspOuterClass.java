// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BartenderGetFormulaRsp.proto

package emu.grasscutter.net.oldproto;

public final class BartenderGetFormulaRspOuterClass {
  private BartenderGetFormulaRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BartenderGetFormulaRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BartenderGetFormulaRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_new = 12;</code>
     * @return The isNew.
     */
    boolean getIsNew();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @return A list containing the affixList.
     */
    java.util.List<java.lang.Integer> getAffixListList();
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @return The count of affixList.
     */
    int getAffixListCount();
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    int getAffixList(int index);

    /**
     * <code>uint32 formula_id = 11;</code>
     * @return The formulaId.
     */
    int getFormulaId();
  }
  /**
   * <pre>
   * CmdId: 8842
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code BartenderGetFormulaRsp}
   */
  public static final class BartenderGetFormulaRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BartenderGetFormulaRsp)
      BartenderGetFormulaRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BartenderGetFormulaRsp.newBuilder() to construct.
    private BartenderGetFormulaRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BartenderGetFormulaRsp() {
      affixList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BartenderGetFormulaRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.internal_static_BartenderGetFormulaRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.internal_static_BartenderGetFormulaRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp.class, emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp.Builder.class);
    }

    public static final int IS_NEW_FIELD_NUMBER = 12;
    private boolean isNew_;
    /**
     * <code>bool is_new = 12;</code>
     * @return The isNew.
     */
    @java.lang.Override
    public boolean getIsNew() {
      return isNew_;
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int AFFIX_LIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList affixList_;
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @return A list containing the affixList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAffixListList() {
      return affixList_;
    }
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @return The count of affixList.
     */
    public int getAffixListCount() {
      return affixList_.size();
    }
    /**
     * <code>repeated uint32 affix_list = 8;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    public int getAffixList(int index) {
      return affixList_.getInt(index);
    }
    private int affixListMemoizedSerializedSize = -1;

    public static final int FORMULA_ID_FIELD_NUMBER = 11;
    private int formulaId_;
    /**
     * <code>uint32 formula_id = 11;</code>
     * @return The formulaId.
     */
    @java.lang.Override
    public int getFormulaId() {
      return formulaId_;
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
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (getAffixListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(affixListMemoizedSerializedSize);
      }
      for (int i = 0; i < affixList_.size(); i++) {
        output.writeUInt32NoTag(affixList_.getInt(i));
      }
      if (formulaId_ != 0) {
        output.writeUInt32(11, formulaId_);
      }
      if (isNew_ != false) {
        output.writeBool(12, isNew_);
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
          .computeInt32Size(6, retcode_);
      }
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
      if (formulaId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, formulaId_);
      }
      if (isNew_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isNew_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp other = (emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp) obj;

      if (getIsNew()
          != other.getIsNew()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getAffixListList()
          .equals(other.getAffixListList())) return false;
      if (getFormulaId()
          != other.getFormulaId()) return false;
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
      hash = (37 * hash) + IS_NEW_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNew());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getAffixListCount() > 0) {
        hash = (37 * hash) + AFFIX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAffixListList().hashCode();
      }
      hash = (37 * hash) + FORMULA_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFormulaId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp prototype) {
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
     * CmdId: 8842
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code BartenderGetFormulaRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BartenderGetFormulaRsp)
        emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.internal_static_BartenderGetFormulaRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.internal_static_BartenderGetFormulaRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp.class, emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isNew_ = false;

        retcode_ = 0;

        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        formulaId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.internal_static_BartenderGetFormulaRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp build() {
        emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp buildPartial() {
        emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp result = new emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp(this);
        int from_bitField0_ = bitField0_;
        result.isNew_ = isNew_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          affixList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.affixList_ = affixList_;
        result.formulaId_ = formulaId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp other) {
        if (other == emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp.getDefaultInstance()) return this;
        if (other.getIsNew() != false) {
          setIsNew(other.getIsNew());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        if (other.getFormulaId() != 0) {
          setFormulaId(other.getFormulaId());
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
              case 48: {
                retcode_ = input.readInt32();

                break;
              } // case 48
              case 64: {
                int v = input.readUInt32();
                ensureAffixListIsMutable();
                affixList_.addInt(v);
                break;
              } // case 64
              case 66: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAffixListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  affixList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 66
              case 88: {
                formulaId_ = input.readUInt32();

                break;
              } // case 88
              case 96: {
                isNew_ = input.readBool();

                break;
              } // case 96
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

      private boolean isNew_ ;
      /**
       * <code>bool is_new = 12;</code>
       * @return The isNew.
       */
      @java.lang.Override
      public boolean getIsNew() {
        return isNew_;
      }
      /**
       * <code>bool is_new = 12;</code>
       * @param value The isNew to set.
       * @return This builder for chaining.
       */
      public Builder setIsNew(boolean value) {
        
        isNew_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNew() {
        
        isNew_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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
       * <code>repeated uint32 affix_list = 8;</code>
       * @return A list containing the affixList.
       */
      public java.util.List<java.lang.Integer>
          getAffixListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(affixList_) : affixList_;
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @return The count of affixList.
       */
      public int getAffixListCount() {
        return affixList_.size();
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
       * @param index The index of the element to return.
       * @return The affixList at the given index.
       */
      public int getAffixList(int index) {
        return affixList_.getInt(index);
      }
      /**
       * <code>repeated uint32 affix_list = 8;</code>
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
       * <code>repeated uint32 affix_list = 8;</code>
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
       * <code>repeated uint32 affix_list = 8;</code>
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
       * <code>repeated uint32 affix_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearAffixList() {
        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int formulaId_ ;
      /**
       * <code>uint32 formula_id = 11;</code>
       * @return The formulaId.
       */
      @java.lang.Override
      public int getFormulaId() {
        return formulaId_;
      }
      /**
       * <code>uint32 formula_id = 11;</code>
       * @param value The formulaId to set.
       * @return This builder for chaining.
       */
      public Builder setFormulaId(int value) {
        
        formulaId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 formula_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearFormulaId() {
        
        formulaId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BartenderGetFormulaRsp)
    }

    // @@protoc_insertion_point(class_scope:BartenderGetFormulaRsp)
    private static final emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp();
    }

    public static emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BartenderGetFormulaRsp>
        PARSER = new com.google.protobuf.AbstractParser<BartenderGetFormulaRsp>() {
      @java.lang.Override
      public BartenderGetFormulaRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<BartenderGetFormulaRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BartenderGetFormulaRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.BartenderGetFormulaRspOuterClass.BartenderGetFormulaRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BartenderGetFormulaRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BartenderGetFormulaRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034BartenderGetFormulaRsp.proto\"a\n\026Barten" +
      "derGetFormulaRsp\022\016\n\006is_new\030\014 \001(\010\022\017\n\007retc" +
      "ode\030\006 \001(\005\022\022\n\naffix_list\030\010 \003(\r\022\022\n\nformula" +
      "_id\030\013 \001(\rB\036\n\034emu.grasscutter.net.oldprot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BartenderGetFormulaRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BartenderGetFormulaRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BartenderGetFormulaRsp_descriptor,
        new java.lang.String[] { "IsNew", "Retcode", "AffixList", "FormulaId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
