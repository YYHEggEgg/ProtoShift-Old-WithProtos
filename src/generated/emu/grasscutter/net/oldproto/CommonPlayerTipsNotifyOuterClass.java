// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CommonPlayerTipsNotify.proto

package emu.grasscutter.net.oldproto;

public final class CommonPlayerTipsNotifyOuterClass {
  private CommonPlayerTipsNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CommonPlayerTipsNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CommonPlayerTipsNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 notify_type = 3;</code>
     * @return The notifyType.
     */
    int getNotifyType();

    /**
     * <code>repeated string text_map_id_list = 9;</code>
     * @return A list containing the textMapIdList.
     */
    java.util.List<java.lang.String>
        getTextMapIdListList();
    /**
     * <code>repeated string text_map_id_list = 9;</code>
     * @return The count of textMapIdList.
     */
    int getTextMapIdListCount();
    /**
     * <code>repeated string text_map_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The textMapIdList at the given index.
     */
    java.lang.String getTextMapIdList(int index);
    /**
     * <code>repeated string text_map_id_list = 9;</code>
     * @param index The index of the value to return.
     * @return The bytes of the textMapIdList at the given index.
     */
    com.google.protobuf.ByteString
        getTextMapIdListBytes(int index);
  }
  /**
   * <pre>
   * CmdId: 8466
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code CommonPlayerTipsNotify}
   */
  public static final class CommonPlayerTipsNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CommonPlayerTipsNotify)
      CommonPlayerTipsNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CommonPlayerTipsNotify.newBuilder() to construct.
    private CommonPlayerTipsNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CommonPlayerTipsNotify() {
      textMapIdList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CommonPlayerTipsNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.internal_static_CommonPlayerTipsNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.internal_static_CommonPlayerTipsNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify.class, emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify.Builder.class);
    }

    public static final int NOTIFY_TYPE_FIELD_NUMBER = 3;
    private int notifyType_;
    /**
     * <code>uint32 notify_type = 3;</code>
     * @return The notifyType.
     */
    @java.lang.Override
    public int getNotifyType() {
      return notifyType_;
    }

    public static final int TEXT_MAP_ID_LIST_FIELD_NUMBER = 9;
    private com.google.protobuf.LazyStringList textMapIdList_;
    /**
     * <code>repeated string text_map_id_list = 9;</code>
     * @return A list containing the textMapIdList.
     */
    public com.google.protobuf.ProtocolStringList
        getTextMapIdListList() {
      return textMapIdList_;
    }
    /**
     * <code>repeated string text_map_id_list = 9;</code>
     * @return The count of textMapIdList.
     */
    public int getTextMapIdListCount() {
      return textMapIdList_.size();
    }
    /**
     * <code>repeated string text_map_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The textMapIdList at the given index.
     */
    public java.lang.String getTextMapIdList(int index) {
      return textMapIdList_.get(index);
    }
    /**
     * <code>repeated string text_map_id_list = 9;</code>
     * @param index The index of the value to return.
     * @return The bytes of the textMapIdList at the given index.
     */
    public com.google.protobuf.ByteString
        getTextMapIdListBytes(int index) {
      return textMapIdList_.getByteString(index);
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
      if (notifyType_ != 0) {
        output.writeUInt32(3, notifyType_);
      }
      for (int i = 0; i < textMapIdList_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, textMapIdList_.getRaw(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (notifyType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, notifyType_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < textMapIdList_.size(); i++) {
          dataSize += computeStringSizeNoTag(textMapIdList_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getTextMapIdListList().size();
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify other = (emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify) obj;

      if (getNotifyType()
          != other.getNotifyType()) return false;
      if (!getTextMapIdListList()
          .equals(other.getTextMapIdListList())) return false;
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
      hash = (37 * hash) + NOTIFY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getNotifyType();
      if (getTextMapIdListCount() > 0) {
        hash = (37 * hash) + TEXT_MAP_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTextMapIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify prototype) {
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
     * CmdId: 8466
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code CommonPlayerTipsNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CommonPlayerTipsNotify)
        emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.internal_static_CommonPlayerTipsNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.internal_static_CommonPlayerTipsNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify.class, emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        notifyType_ = 0;

        textMapIdList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.internal_static_CommonPlayerTipsNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify build() {
        emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify buildPartial() {
        emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify result = new emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify(this);
        int from_bitField0_ = bitField0_;
        result.notifyType_ = notifyType_;
        if (((bitField0_ & 0x00000001) != 0)) {
          textMapIdList_ = textMapIdList_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.textMapIdList_ = textMapIdList_;
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
        if (other instanceof emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify other) {
        if (other == emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify.getDefaultInstance()) return this;
        if (other.getNotifyType() != 0) {
          setNotifyType(other.getNotifyType());
        }
        if (!other.textMapIdList_.isEmpty()) {
          if (textMapIdList_.isEmpty()) {
            textMapIdList_ = other.textMapIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTextMapIdListIsMutable();
            textMapIdList_.addAll(other.textMapIdList_);
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
              case 24: {
                notifyType_ = input.readUInt32();

                break;
              } // case 24
              case 74: {
                java.lang.String s = input.readStringRequireUtf8();
                ensureTextMapIdListIsMutable();
                textMapIdList_.add(s);
                break;
              } // case 74
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

      private int notifyType_ ;
      /**
       * <code>uint32 notify_type = 3;</code>
       * @return The notifyType.
       */
      @java.lang.Override
      public int getNotifyType() {
        return notifyType_;
      }
      /**
       * <code>uint32 notify_type = 3;</code>
       * @param value The notifyType to set.
       * @return This builder for chaining.
       */
      public Builder setNotifyType(int value) {
        
        notifyType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 notify_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearNotifyType() {
        
        notifyType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList textMapIdList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureTextMapIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          textMapIdList_ = new com.google.protobuf.LazyStringArrayList(textMapIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string text_map_id_list = 9;</code>
       * @return A list containing the textMapIdList.
       */
      public com.google.protobuf.ProtocolStringList
          getTextMapIdListList() {
        return textMapIdList_.getUnmodifiableView();
      }
      /**
       * <code>repeated string text_map_id_list = 9;</code>
       * @return The count of textMapIdList.
       */
      public int getTextMapIdListCount() {
        return textMapIdList_.size();
      }
      /**
       * <code>repeated string text_map_id_list = 9;</code>
       * @param index The index of the element to return.
       * @return The textMapIdList at the given index.
       */
      public java.lang.String getTextMapIdList(int index) {
        return textMapIdList_.get(index);
      }
      /**
       * <code>repeated string text_map_id_list = 9;</code>
       * @param index The index of the value to return.
       * @return The bytes of the textMapIdList at the given index.
       */
      public com.google.protobuf.ByteString
          getTextMapIdListBytes(int index) {
        return textMapIdList_.getByteString(index);
      }
      /**
       * <code>repeated string text_map_id_list = 9;</code>
       * @param index The index to set the value at.
       * @param value The textMapIdList to set.
       * @return This builder for chaining.
       */
      public Builder setTextMapIdList(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureTextMapIdListIsMutable();
        textMapIdList_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string text_map_id_list = 9;</code>
       * @param value The textMapIdList to add.
       * @return This builder for chaining.
       */
      public Builder addTextMapIdList(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureTextMapIdListIsMutable();
        textMapIdList_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string text_map_id_list = 9;</code>
       * @param values The textMapIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTextMapIdList(
          java.lang.Iterable<java.lang.String> values) {
        ensureTextMapIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, textMapIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string text_map_id_list = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTextMapIdList() {
        textMapIdList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string text_map_id_list = 9;</code>
       * @param value The bytes of the textMapIdList to add.
       * @return This builder for chaining.
       */
      public Builder addTextMapIdListBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureTextMapIdListIsMutable();
        textMapIdList_.add(value);
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


      // @@protoc_insertion_point(builder_scope:CommonPlayerTipsNotify)
    }

    // @@protoc_insertion_point(class_scope:CommonPlayerTipsNotify)
    private static final emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify();
    }

    public static emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CommonPlayerTipsNotify>
        PARSER = new com.google.protobuf.AbstractParser<CommonPlayerTipsNotify>() {
      @java.lang.Override
      public CommonPlayerTipsNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<CommonPlayerTipsNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CommonPlayerTipsNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.CommonPlayerTipsNotifyOuterClass.CommonPlayerTipsNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CommonPlayerTipsNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CommonPlayerTipsNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034CommonPlayerTipsNotify.proto\"G\n\026Common" +
      "PlayerTipsNotify\022\023\n\013notify_type\030\003 \001(\r\022\030\n" +
      "\020text_map_id_list\030\t \003(\tB\036\n\034emu.grasscutt" +
      "er.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CommonPlayerTipsNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CommonPlayerTipsNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CommonPlayerTipsNotify_descriptor,
        new java.lang.String[] { "NotifyType", "TextMapIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
