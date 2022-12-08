// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UpdatePlayerShowNameCardListReq.proto

package emu.grasscutter.net.newproto;

public final class UpdatePlayerShowNameCardListReqOuterClass {
  private UpdatePlayerShowNameCardListReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdatePlayerShowNameCardListReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UpdatePlayerShowNameCardListReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 show_name_card_id_list = 11;</code>
     * @return A list containing the showNameCardIdList.
     */
    java.util.List<java.lang.Integer> getShowNameCardIdListList();
    /**
     * <code>repeated uint32 show_name_card_id_list = 11;</code>
     * @return The count of showNameCardIdList.
     */
    int getShowNameCardIdListCount();
    /**
     * <code>repeated uint32 show_name_card_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The showNameCardIdList at the given index.
     */
    int getShowNameCardIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4093;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code UpdatePlayerShowNameCardListReq}
   */
  public static final class UpdatePlayerShowNameCardListReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UpdatePlayerShowNameCardListReq)
      UpdatePlayerShowNameCardListReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdatePlayerShowNameCardListReq.newBuilder() to construct.
    private UpdatePlayerShowNameCardListReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdatePlayerShowNameCardListReq() {
      showNameCardIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UpdatePlayerShowNameCardListReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.internal_static_UpdatePlayerShowNameCardListReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.internal_static_UpdatePlayerShowNameCardListReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq.class, emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq.Builder.class);
    }

    public static final int SHOW_NAME_CARD_ID_LIST_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList showNameCardIdList_;
    /**
     * <code>repeated uint32 show_name_card_id_list = 11;</code>
     * @return A list containing the showNameCardIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getShowNameCardIdListList() {
      return showNameCardIdList_;
    }
    /**
     * <code>repeated uint32 show_name_card_id_list = 11;</code>
     * @return The count of showNameCardIdList.
     */
    public int getShowNameCardIdListCount() {
      return showNameCardIdList_.size();
    }
    /**
     * <code>repeated uint32 show_name_card_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The showNameCardIdList at the given index.
     */
    public int getShowNameCardIdList(int index) {
      return showNameCardIdList_.getInt(index);
    }
    private int showNameCardIdListMemoizedSerializedSize = -1;

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
      if (getShowNameCardIdListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(showNameCardIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < showNameCardIdList_.size(); i++) {
        output.writeUInt32NoTag(showNameCardIdList_.getInt(i));
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
        for (int i = 0; i < showNameCardIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(showNameCardIdList_.getInt(i));
        }
        size += dataSize;
        if (!getShowNameCardIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        showNameCardIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq other = (emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq) obj;

      if (!getShowNameCardIdListList()
          .equals(other.getShowNameCardIdListList())) return false;
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
      if (getShowNameCardIdListCount() > 0) {
        hash = (37 * hash) + SHOW_NAME_CARD_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getShowNameCardIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq prototype) {
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
     *   CMD_ID = 4093;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code UpdatePlayerShowNameCardListReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UpdatePlayerShowNameCardListReq)
        emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.internal_static_UpdatePlayerShowNameCardListReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.internal_static_UpdatePlayerShowNameCardListReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq.class, emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        showNameCardIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.internal_static_UpdatePlayerShowNameCardListReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq build() {
        emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq buildPartial() {
        emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq result = new emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          showNameCardIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.showNameCardIdList_ = showNameCardIdList_;
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
        if (other instanceof emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq) {
          return mergeFrom((emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq other) {
        if (other == emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq.getDefaultInstance()) return this;
        if (!other.showNameCardIdList_.isEmpty()) {
          if (showNameCardIdList_.isEmpty()) {
            showNameCardIdList_ = other.showNameCardIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureShowNameCardIdListIsMutable();
            showNameCardIdList_.addAll(other.showNameCardIdList_);
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
              case 88: {
                int v = input.readUInt32();
                ensureShowNameCardIdListIsMutable();
                showNameCardIdList_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureShowNameCardIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  showNameCardIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 90
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

      private com.google.protobuf.Internal.IntList showNameCardIdList_ = emptyIntList();
      private void ensureShowNameCardIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          showNameCardIdList_ = mutableCopy(showNameCardIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 11;</code>
       * @return A list containing the showNameCardIdList.
       */
      public java.util.List<java.lang.Integer>
          getShowNameCardIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(showNameCardIdList_) : showNameCardIdList_;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 11;</code>
       * @return The count of showNameCardIdList.
       */
      public int getShowNameCardIdListCount() {
        return showNameCardIdList_.size();
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 11;</code>
       * @param index The index of the element to return.
       * @return The showNameCardIdList at the given index.
       */
      public int getShowNameCardIdList(int index) {
        return showNameCardIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The showNameCardIdList to set.
       * @return This builder for chaining.
       */
      public Builder setShowNameCardIdList(
          int index, int value) {
        ensureShowNameCardIdListIsMutable();
        showNameCardIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 11;</code>
       * @param value The showNameCardIdList to add.
       * @return This builder for chaining.
       */
      public Builder addShowNameCardIdList(int value) {
        ensureShowNameCardIdListIsMutable();
        showNameCardIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 11;</code>
       * @param values The showNameCardIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllShowNameCardIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureShowNameCardIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, showNameCardIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearShowNameCardIdList() {
        showNameCardIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:UpdatePlayerShowNameCardListReq)
    }

    // @@protoc_insertion_point(class_scope:UpdatePlayerShowNameCardListReq)
    private static final emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq();
    }

    public static emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdatePlayerShowNameCardListReq>
        PARSER = new com.google.protobuf.AbstractParser<UpdatePlayerShowNameCardListReq>() {
      @java.lang.Override
      public UpdatePlayerShowNameCardListReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<UpdatePlayerShowNameCardListReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdatePlayerShowNameCardListReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.UpdatePlayerShowNameCardListReqOuterClass.UpdatePlayerShowNameCardListReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdatePlayerShowNameCardListReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdatePlayerShowNameCardListReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%UpdatePlayerShowNameCardListReq.proto\"" +
      "A\n\037UpdatePlayerShowNameCardListReq\022\036\n\026sh" +
      "ow_name_card_id_list\030\013 \003(\rB\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UpdatePlayerShowNameCardListReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpdatePlayerShowNameCardListReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdatePlayerShowNameCardListReq_descriptor,
        new java.lang.String[] { "ShowNameCardIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
