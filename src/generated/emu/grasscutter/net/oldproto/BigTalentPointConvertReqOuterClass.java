// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BigTalentPointConvertReq.proto

package emu.grasscutter.net.oldproto;

public final class BigTalentPointConvertReqOuterClass {
  private BigTalentPointConvertReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BigTalentPointConvertReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BigTalentPointConvertReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint64 item_guid_list = 6;</code>
     * @return A list containing the itemGuidList.
     */
    java.util.List<java.lang.Long> getItemGuidListList();
    /**
     * <code>repeated uint64 item_guid_list = 6;</code>
     * @return The count of itemGuidList.
     */
    int getItemGuidListCount();
    /**
     * <code>repeated uint64 item_guid_list = 6;</code>
     * @param index The index of the element to return.
     * @return The itemGuidList at the given index.
     */
    long getItemGuidList(int index);

    /**
     * <code>uint64 avatar_guid = 3;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();
  }
  /**
   * <pre>
   * CmdId: 1007
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code BigTalentPointConvertReq}
   */
  public static final class BigTalentPointConvertReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BigTalentPointConvertReq)
      BigTalentPointConvertReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BigTalentPointConvertReq.newBuilder() to construct.
    private BigTalentPointConvertReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BigTalentPointConvertReq() {
      itemGuidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BigTalentPointConvertReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.internal_static_BigTalentPointConvertReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.internal_static_BigTalentPointConvertReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq.class, emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq.Builder.class);
    }

    public static final int ITEM_GUID_LIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.LongList itemGuidList_;
    /**
     * <code>repeated uint64 item_guid_list = 6;</code>
     * @return A list containing the itemGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getItemGuidListList() {
      return itemGuidList_;
    }
    /**
     * <code>repeated uint64 item_guid_list = 6;</code>
     * @return The count of itemGuidList.
     */
    public int getItemGuidListCount() {
      return itemGuidList_.size();
    }
    /**
     * <code>repeated uint64 item_guid_list = 6;</code>
     * @param index The index of the element to return.
     * @return The itemGuidList at the given index.
     */
    public long getItemGuidList(int index) {
      return itemGuidList_.getLong(index);
    }
    private int itemGuidListMemoizedSerializedSize = -1;

    public static final int AVATAR_GUID_FIELD_NUMBER = 3;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 3;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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
      if (avatarGuid_ != 0L) {
        output.writeUInt64(3, avatarGuid_);
      }
      if (getItemGuidListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(itemGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < itemGuidList_.size(); i++) {
        output.writeUInt64NoTag(itemGuidList_.getLong(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, avatarGuid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < itemGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(itemGuidList_.getLong(i));
        }
        size += dataSize;
        if (!getItemGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        itemGuidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq other = (emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq) obj;

      if (!getItemGuidListList()
          .equals(other.getItemGuidListList())) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
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
      if (getItemGuidListCount() > 0) {
        hash = (37 * hash) + ITEM_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemGuidListList().hashCode();
      }
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq prototype) {
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
     * CmdId: 1007
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code BigTalentPointConvertReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BigTalentPointConvertReq)
        emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.internal_static_BigTalentPointConvertReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.internal_static_BigTalentPointConvertReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq.class, emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        itemGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        avatarGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.internal_static_BigTalentPointConvertReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq build() {
        emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq buildPartial() {
        emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq result = new emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          itemGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.itemGuidList_ = itemGuidList_;
        result.avatarGuid_ = avatarGuid_;
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
        if (other instanceof emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq other) {
        if (other == emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq.getDefaultInstance()) return this;
        if (!other.itemGuidList_.isEmpty()) {
          if (itemGuidList_.isEmpty()) {
            itemGuidList_ = other.itemGuidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemGuidListIsMutable();
            itemGuidList_.addAll(other.itemGuidList_);
          }
          onChanged();
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
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
              case 24: {
                avatarGuid_ = input.readUInt64();

                break;
              } // case 24
              case 48: {
                long v = input.readUInt64();
                ensureItemGuidListIsMutable();
                itemGuidList_.addLong(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureItemGuidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  itemGuidList_.addLong(input.readUInt64());
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

      private com.google.protobuf.Internal.LongList itemGuidList_ = emptyLongList();
      private void ensureItemGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemGuidList_ = mutableCopy(itemGuidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 item_guid_list = 6;</code>
       * @return A list containing the itemGuidList.
       */
      public java.util.List<java.lang.Long>
          getItemGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(itemGuidList_) : itemGuidList_;
      }
      /**
       * <code>repeated uint64 item_guid_list = 6;</code>
       * @return The count of itemGuidList.
       */
      public int getItemGuidListCount() {
        return itemGuidList_.size();
      }
      /**
       * <code>repeated uint64 item_guid_list = 6;</code>
       * @param index The index of the element to return.
       * @return The itemGuidList at the given index.
       */
      public long getItemGuidList(int index) {
        return itemGuidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 item_guid_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The itemGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setItemGuidList(
          int index, long value) {
        ensureItemGuidListIsMutable();
        itemGuidList_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 item_guid_list = 6;</code>
       * @param value The itemGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addItemGuidList(long value) {
        ensureItemGuidListIsMutable();
        itemGuidList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 item_guid_list = 6;</code>
       * @param values The itemGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllItemGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureItemGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, itemGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 item_guid_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemGuidList() {
        itemGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 3;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 3;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:BigTalentPointConvertReq)
    }

    // @@protoc_insertion_point(class_scope:BigTalentPointConvertReq)
    private static final emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq();
    }

    public static emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BigTalentPointConvertReq>
        PARSER = new com.google.protobuf.AbstractParser<BigTalentPointConvertReq>() {
      @java.lang.Override
      public BigTalentPointConvertReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<BigTalentPointConvertReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BigTalentPointConvertReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.BigTalentPointConvertReqOuterClass.BigTalentPointConvertReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BigTalentPointConvertReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BigTalentPointConvertReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036BigTalentPointConvertReq.proto\"G\n\030BigT" +
      "alentPointConvertReq\022\026\n\016item_guid_list\030\006" +
      " \003(\004\022\023\n\013avatar_guid\030\003 \001(\004B\036\n\034emu.grasscu" +
      "tter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BigTalentPointConvertReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BigTalentPointConvertReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BigTalentPointConvertReq_descriptor,
        new java.lang.String[] { "ItemGuidList", "AvatarGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
