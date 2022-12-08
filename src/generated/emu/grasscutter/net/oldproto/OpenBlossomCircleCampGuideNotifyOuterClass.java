// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpenBlossomCircleCampGuideNotify.proto

package emu.grasscutter.net.oldproto;

public final class OpenBlossomCircleCampGuideNotifyOuterClass {
  private OpenBlossomCircleCampGuideNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OpenBlossomCircleCampGuideNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpenBlossomCircleCampGuideNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 refresh_id = 7;</code>
     * @return The refreshId.
     */
    int getRefreshId();

    /**
     * <code>repeated uint32 circle_camp_id_list = 11;</code>
     * @return A list containing the circleCampIdList.
     */
    java.util.List<java.lang.Integer> getCircleCampIdListList();
    /**
     * <code>repeated uint32 circle_camp_id_list = 11;</code>
     * @return The count of circleCampIdList.
     */
    int getCircleCampIdListCount();
    /**
     * <code>repeated uint32 circle_camp_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The circleCampIdList at the given index.
     */
    int getCircleCampIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 2703
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code OpenBlossomCircleCampGuideNotify}
   */
  public static final class OpenBlossomCircleCampGuideNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OpenBlossomCircleCampGuideNotify)
      OpenBlossomCircleCampGuideNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpenBlossomCircleCampGuideNotify.newBuilder() to construct.
    private OpenBlossomCircleCampGuideNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpenBlossomCircleCampGuideNotify() {
      circleCampIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpenBlossomCircleCampGuideNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.internal_static_OpenBlossomCircleCampGuideNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.internal_static_OpenBlossomCircleCampGuideNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify.class, emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify.Builder.class);
    }

    public static final int REFRESH_ID_FIELD_NUMBER = 7;
    private int refreshId_;
    /**
     * <code>uint32 refresh_id = 7;</code>
     * @return The refreshId.
     */
    @java.lang.Override
    public int getRefreshId() {
      return refreshId_;
    }

    public static final int CIRCLE_CAMP_ID_LIST_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList circleCampIdList_;
    /**
     * <code>repeated uint32 circle_camp_id_list = 11;</code>
     * @return A list containing the circleCampIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCircleCampIdListList() {
      return circleCampIdList_;
    }
    /**
     * <code>repeated uint32 circle_camp_id_list = 11;</code>
     * @return The count of circleCampIdList.
     */
    public int getCircleCampIdListCount() {
      return circleCampIdList_.size();
    }
    /**
     * <code>repeated uint32 circle_camp_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The circleCampIdList at the given index.
     */
    public int getCircleCampIdList(int index) {
      return circleCampIdList_.getInt(index);
    }
    private int circleCampIdListMemoizedSerializedSize = -1;

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
      if (refreshId_ != 0) {
        output.writeUInt32(7, refreshId_);
      }
      if (getCircleCampIdListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(circleCampIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < circleCampIdList_.size(); i++) {
        output.writeUInt32NoTag(circleCampIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (refreshId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, refreshId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < circleCampIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(circleCampIdList_.getInt(i));
        }
        size += dataSize;
        if (!getCircleCampIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        circleCampIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify other = (emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify) obj;

      if (getRefreshId()
          != other.getRefreshId()) return false;
      if (!getCircleCampIdListList()
          .equals(other.getCircleCampIdListList())) return false;
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
      hash = (37 * hash) + REFRESH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRefreshId();
      if (getCircleCampIdListCount() > 0) {
        hash = (37 * hash) + CIRCLE_CAMP_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCircleCampIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify prototype) {
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
     * CmdId: 2703
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code OpenBlossomCircleCampGuideNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpenBlossomCircleCampGuideNotify)
        emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.internal_static_OpenBlossomCircleCampGuideNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.internal_static_OpenBlossomCircleCampGuideNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify.class, emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        refreshId_ = 0;

        circleCampIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.internal_static_OpenBlossomCircleCampGuideNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify build() {
        emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify buildPartial() {
        emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify result = new emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify(this);
        int from_bitField0_ = bitField0_;
        result.refreshId_ = refreshId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          circleCampIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.circleCampIdList_ = circleCampIdList_;
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
        if (other instanceof emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify other) {
        if (other == emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify.getDefaultInstance()) return this;
        if (other.getRefreshId() != 0) {
          setRefreshId(other.getRefreshId());
        }
        if (!other.circleCampIdList_.isEmpty()) {
          if (circleCampIdList_.isEmpty()) {
            circleCampIdList_ = other.circleCampIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCircleCampIdListIsMutable();
            circleCampIdList_.addAll(other.circleCampIdList_);
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
              case 56: {
                refreshId_ = input.readUInt32();

                break;
              } // case 56
              case 88: {
                int v = input.readUInt32();
                ensureCircleCampIdListIsMutable();
                circleCampIdList_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCircleCampIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  circleCampIdList_.addInt(input.readUInt32());
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

      private int refreshId_ ;
      /**
       * <code>uint32 refresh_id = 7;</code>
       * @return The refreshId.
       */
      @java.lang.Override
      public int getRefreshId() {
        return refreshId_;
      }
      /**
       * <code>uint32 refresh_id = 7;</code>
       * @param value The refreshId to set.
       * @return This builder for chaining.
       */
      public Builder setRefreshId(int value) {
        
        refreshId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 refresh_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRefreshId() {
        
        refreshId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList circleCampIdList_ = emptyIntList();
      private void ensureCircleCampIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          circleCampIdList_ = mutableCopy(circleCampIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 circle_camp_id_list = 11;</code>
       * @return A list containing the circleCampIdList.
       */
      public java.util.List<java.lang.Integer>
          getCircleCampIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(circleCampIdList_) : circleCampIdList_;
      }
      /**
       * <code>repeated uint32 circle_camp_id_list = 11;</code>
       * @return The count of circleCampIdList.
       */
      public int getCircleCampIdListCount() {
        return circleCampIdList_.size();
      }
      /**
       * <code>repeated uint32 circle_camp_id_list = 11;</code>
       * @param index The index of the element to return.
       * @return The circleCampIdList at the given index.
       */
      public int getCircleCampIdList(int index) {
        return circleCampIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 circle_camp_id_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The circleCampIdList to set.
       * @return This builder for chaining.
       */
      public Builder setCircleCampIdList(
          int index, int value) {
        ensureCircleCampIdListIsMutable();
        circleCampIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 circle_camp_id_list = 11;</code>
       * @param value The circleCampIdList to add.
       * @return This builder for chaining.
       */
      public Builder addCircleCampIdList(int value) {
        ensureCircleCampIdListIsMutable();
        circleCampIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 circle_camp_id_list = 11;</code>
       * @param values The circleCampIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCircleCampIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCircleCampIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, circleCampIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 circle_camp_id_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCircleCampIdList() {
        circleCampIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:OpenBlossomCircleCampGuideNotify)
    }

    // @@protoc_insertion_point(class_scope:OpenBlossomCircleCampGuideNotify)
    private static final emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify();
    }

    public static emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpenBlossomCircleCampGuideNotify>
        PARSER = new com.google.protobuf.AbstractParser<OpenBlossomCircleCampGuideNotify>() {
      @java.lang.Override
      public OpenBlossomCircleCampGuideNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<OpenBlossomCircleCampGuideNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpenBlossomCircleCampGuideNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.OpenBlossomCircleCampGuideNotifyOuterClass.OpenBlossomCircleCampGuideNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpenBlossomCircleCampGuideNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpenBlossomCircleCampGuideNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&OpenBlossomCircleCampGuideNotify.proto" +
      "\"S\n OpenBlossomCircleCampGuideNotify\022\022\n\n" +
      "refresh_id\030\007 \001(\r\022\033\n\023circle_camp_id_list\030" +
      "\013 \003(\rB\036\n\034emu.grasscutter.net.oldprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OpenBlossomCircleCampGuideNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpenBlossomCircleCampGuideNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpenBlossomCircleCampGuideNotify_descriptor,
        new java.lang.String[] { "RefreshId", "CircleCampIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
