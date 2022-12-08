// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeCityReputationParentQuestReq.proto

package emu.grasscutter.net.oldproto;

public final class TakeCityReputationParentQuestReqOuterClass {
  private TakeCityReputationParentQuestReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeCityReputationParentQuestReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeCityReputationParentQuestReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 city_id = 1;</code>
     * @return The cityId.
     */
    int getCityId();

    /**
     * <code>repeated uint32 parent_quest_list = 6;</code>
     * @return A list containing the parentQuestList.
     */
    java.util.List<java.lang.Integer> getParentQuestListList();
    /**
     * <code>repeated uint32 parent_quest_list = 6;</code>
     * @return The count of parentQuestList.
     */
    int getParentQuestListCount();
    /**
     * <code>repeated uint32 parent_quest_list = 6;</code>
     * @param index The index of the element to return.
     * @return The parentQuestList at the given index.
     */
    int getParentQuestList(int index);
  }
  /**
   * <pre>
   * CmdId: 2821
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code TakeCityReputationParentQuestReq}
   */
  public static final class TakeCityReputationParentQuestReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeCityReputationParentQuestReq)
      TakeCityReputationParentQuestReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeCityReputationParentQuestReq.newBuilder() to construct.
    private TakeCityReputationParentQuestReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeCityReputationParentQuestReq() {
      parentQuestList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeCityReputationParentQuestReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.internal_static_TakeCityReputationParentQuestReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.internal_static_TakeCityReputationParentQuestReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.class, emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.Builder.class);
    }

    public static final int CITY_ID_FIELD_NUMBER = 1;
    private int cityId_;
    /**
     * <code>uint32 city_id = 1;</code>
     * @return The cityId.
     */
    @java.lang.Override
    public int getCityId() {
      return cityId_;
    }

    public static final int PARENT_QUEST_LIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList parentQuestList_;
    /**
     * <code>repeated uint32 parent_quest_list = 6;</code>
     * @return A list containing the parentQuestList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParentQuestListList() {
      return parentQuestList_;
    }
    /**
     * <code>repeated uint32 parent_quest_list = 6;</code>
     * @return The count of parentQuestList.
     */
    public int getParentQuestListCount() {
      return parentQuestList_.size();
    }
    /**
     * <code>repeated uint32 parent_quest_list = 6;</code>
     * @param index The index of the element to return.
     * @return The parentQuestList at the given index.
     */
    public int getParentQuestList(int index) {
      return parentQuestList_.getInt(index);
    }
    private int parentQuestListMemoizedSerializedSize = -1;

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
      if (cityId_ != 0) {
        output.writeUInt32(1, cityId_);
      }
      if (getParentQuestListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(parentQuestListMemoizedSerializedSize);
      }
      for (int i = 0; i < parentQuestList_.size(); i++) {
        output.writeUInt32NoTag(parentQuestList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, cityId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < parentQuestList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(parentQuestList_.getInt(i));
        }
        size += dataSize;
        if (!getParentQuestListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        parentQuestListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq other = (emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq) obj;

      if (getCityId()
          != other.getCityId()) return false;
      if (!getParentQuestListList()
          .equals(other.getParentQuestListList())) return false;
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
      hash = (37 * hash) + CITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCityId();
      if (getParentQuestListCount() > 0) {
        hash = (37 * hash) + PARENT_QUEST_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParentQuestListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq prototype) {
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
     * CmdId: 2821
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code TakeCityReputationParentQuestReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeCityReputationParentQuestReq)
        emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.internal_static_TakeCityReputationParentQuestReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.internal_static_TakeCityReputationParentQuestReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.class, emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        cityId_ = 0;

        parentQuestList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.internal_static_TakeCityReputationParentQuestReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq build() {
        emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq buildPartial() {
        emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq result = new emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq(this);
        int from_bitField0_ = bitField0_;
        result.cityId_ = cityId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          parentQuestList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.parentQuestList_ = parentQuestList_;
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
        if (other instanceof emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq other) {
        if (other == emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq.getDefaultInstance()) return this;
        if (other.getCityId() != 0) {
          setCityId(other.getCityId());
        }
        if (!other.parentQuestList_.isEmpty()) {
          if (parentQuestList_.isEmpty()) {
            parentQuestList_ = other.parentQuestList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParentQuestListIsMutable();
            parentQuestList_.addAll(other.parentQuestList_);
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
                cityId_ = input.readUInt32();

                break;
              } // case 8
              case 48: {
                int v = input.readUInt32();
                ensureParentQuestListIsMutable();
                parentQuestList_.addInt(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureParentQuestListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  parentQuestList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 50
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

      private int cityId_ ;
      /**
       * <code>uint32 city_id = 1;</code>
       * @return The cityId.
       */
      @java.lang.Override
      public int getCityId() {
        return cityId_;
      }
      /**
       * <code>uint32 city_id = 1;</code>
       * @param value The cityId to set.
       * @return This builder for chaining.
       */
      public Builder setCityId(int value) {
        
        cityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 city_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityId() {
        
        cityId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList parentQuestList_ = emptyIntList();
      private void ensureParentQuestListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          parentQuestList_ = mutableCopy(parentQuestList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 parent_quest_list = 6;</code>
       * @return A list containing the parentQuestList.
       */
      public java.util.List<java.lang.Integer>
          getParentQuestListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(parentQuestList_) : parentQuestList_;
      }
      /**
       * <code>repeated uint32 parent_quest_list = 6;</code>
       * @return The count of parentQuestList.
       */
      public int getParentQuestListCount() {
        return parentQuestList_.size();
      }
      /**
       * <code>repeated uint32 parent_quest_list = 6;</code>
       * @param index The index of the element to return.
       * @return The parentQuestList at the given index.
       */
      public int getParentQuestList(int index) {
        return parentQuestList_.getInt(index);
      }
      /**
       * <code>repeated uint32 parent_quest_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The parentQuestList to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestList(
          int index, int value) {
        ensureParentQuestListIsMutable();
        parentQuestList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 parent_quest_list = 6;</code>
       * @param value The parentQuestList to add.
       * @return This builder for chaining.
       */
      public Builder addParentQuestList(int value) {
        ensureParentQuestListIsMutable();
        parentQuestList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 parent_quest_list = 6;</code>
       * @param values The parentQuestList to add.
       * @return This builder for chaining.
       */
      public Builder addAllParentQuestList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureParentQuestListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, parentQuestList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 parent_quest_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestList() {
        parentQuestList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:TakeCityReputationParentQuestReq)
    }

    // @@protoc_insertion_point(class_scope:TakeCityReputationParentQuestReq)
    private static final emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq();
    }

    public static emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeCityReputationParentQuestReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeCityReputationParentQuestReq>() {
      @java.lang.Override
      public TakeCityReputationParentQuestReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<TakeCityReputationParentQuestReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeCityReputationParentQuestReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.TakeCityReputationParentQuestReqOuterClass.TakeCityReputationParentQuestReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeCityReputationParentQuestReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeCityReputationParentQuestReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&TakeCityReputationParentQuestReq.proto" +
      "\"N\n TakeCityReputationParentQuestReq\022\017\n\007" +
      "city_id\030\001 \001(\r\022\031\n\021parent_quest_list\030\006 \003(\r" +
      "B\036\n\034emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeCityReputationParentQuestReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeCityReputationParentQuestReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeCityReputationParentQuestReq_descriptor,
        new java.lang.String[] { "CityId", "ParentQuestList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
