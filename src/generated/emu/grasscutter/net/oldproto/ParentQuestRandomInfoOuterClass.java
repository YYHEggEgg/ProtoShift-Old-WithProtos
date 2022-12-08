// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ParentQuestRandomInfo.proto

package emu.grasscutter.net.oldproto;

public final class ParentQuestRandomInfoOuterClass {
  private ParentQuestRandomInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParentQuestRandomInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ParentQuestRandomInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 factor_list = 1;</code>
     * @return A list containing the factorList.
     */
    java.util.List<java.lang.Integer> getFactorListList();
    /**
     * <code>repeated uint32 factor_list = 1;</code>
     * @return The count of factorList.
     */
    int getFactorListCount();
    /**
     * <code>repeated uint32 factor_list = 1;</code>
     * @param index The index of the element to return.
     * @return The factorList at the given index.
     */
    int getFactorList(int index);

    /**
     * <code>uint32 template_id = 8;</code>
     * @return The templateId.
     */
    int getTemplateId();

    /**
     * <code>uint32 entrance_id = 2;</code>
     * @return The entranceId.
     */
    int getEntranceId();
  }
  /**
   * Protobuf type {@code ParentQuestRandomInfo}
   */
  public static final class ParentQuestRandomInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ParentQuestRandomInfo)
      ParentQuestRandomInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ParentQuestRandomInfo.newBuilder() to construct.
    private ParentQuestRandomInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ParentQuestRandomInfo() {
      factorList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ParentQuestRandomInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.internal_static_ParentQuestRandomInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.internal_static_ParentQuestRandomInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.class, emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.Builder.class);
    }

    public static final int FACTOR_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList factorList_;
    /**
     * <code>repeated uint32 factor_list = 1;</code>
     * @return A list containing the factorList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFactorListList() {
      return factorList_;
    }
    /**
     * <code>repeated uint32 factor_list = 1;</code>
     * @return The count of factorList.
     */
    public int getFactorListCount() {
      return factorList_.size();
    }
    /**
     * <code>repeated uint32 factor_list = 1;</code>
     * @param index The index of the element to return.
     * @return The factorList at the given index.
     */
    public int getFactorList(int index) {
      return factorList_.getInt(index);
    }
    private int factorListMemoizedSerializedSize = -1;

    public static final int TEMPLATE_ID_FIELD_NUMBER = 8;
    private int templateId_;
    /**
     * <code>uint32 template_id = 8;</code>
     * @return The templateId.
     */
    @java.lang.Override
    public int getTemplateId() {
      return templateId_;
    }

    public static final int ENTRANCE_ID_FIELD_NUMBER = 2;
    private int entranceId_;
    /**
     * <code>uint32 entrance_id = 2;</code>
     * @return The entranceId.
     */
    @java.lang.Override
    public int getEntranceId() {
      return entranceId_;
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
      if (getFactorListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(factorListMemoizedSerializedSize);
      }
      for (int i = 0; i < factorList_.size(); i++) {
        output.writeUInt32NoTag(factorList_.getInt(i));
      }
      if (entranceId_ != 0) {
        output.writeUInt32(2, entranceId_);
      }
      if (templateId_ != 0) {
        output.writeUInt32(8, templateId_);
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
        for (int i = 0; i < factorList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(factorList_.getInt(i));
        }
        size += dataSize;
        if (!getFactorListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        factorListMemoizedSerializedSize = dataSize;
      }
      if (entranceId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, entranceId_);
      }
      if (templateId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, templateId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo other = (emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo) obj;

      if (!getFactorListList()
          .equals(other.getFactorListList())) return false;
      if (getTemplateId()
          != other.getTemplateId()) return false;
      if (getEntranceId()
          != other.getEntranceId()) return false;
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
      if (getFactorListCount() > 0) {
        hash = (37 * hash) + FACTOR_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFactorListList().hashCode();
      }
      hash = (37 * hash) + TEMPLATE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTemplateId();
      hash = (37 * hash) + ENTRANCE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntranceId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo prototype) {
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
     * Protobuf type {@code ParentQuestRandomInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ParentQuestRandomInfo)
        emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.internal_static_ParentQuestRandomInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.internal_static_ParentQuestRandomInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.class, emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        factorList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        templateId_ = 0;

        entranceId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.internal_static_ParentQuestRandomInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo build() {
        emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo buildPartial() {
        emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo result = new emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          factorList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.factorList_ = factorList_;
        result.templateId_ = templateId_;
        result.entranceId_ = entranceId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo other) {
        if (other == emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo.getDefaultInstance()) return this;
        if (!other.factorList_.isEmpty()) {
          if (factorList_.isEmpty()) {
            factorList_ = other.factorList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFactorListIsMutable();
            factorList_.addAll(other.factorList_);
          }
          onChanged();
        }
        if (other.getTemplateId() != 0) {
          setTemplateId(other.getTemplateId());
        }
        if (other.getEntranceId() != 0) {
          setEntranceId(other.getEntranceId());
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
                ensureFactorListIsMutable();
                factorList_.addInt(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureFactorListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  factorList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 10
              case 16: {
                entranceId_ = input.readUInt32();

                break;
              } // case 16
              case 64: {
                templateId_ = input.readUInt32();

                break;
              } // case 64
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

      private com.google.protobuf.Internal.IntList factorList_ = emptyIntList();
      private void ensureFactorListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          factorList_ = mutableCopy(factorList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 factor_list = 1;</code>
       * @return A list containing the factorList.
       */
      public java.util.List<java.lang.Integer>
          getFactorListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(factorList_) : factorList_;
      }
      /**
       * <code>repeated uint32 factor_list = 1;</code>
       * @return The count of factorList.
       */
      public int getFactorListCount() {
        return factorList_.size();
      }
      /**
       * <code>repeated uint32 factor_list = 1;</code>
       * @param index The index of the element to return.
       * @return The factorList at the given index.
       */
      public int getFactorList(int index) {
        return factorList_.getInt(index);
      }
      /**
       * <code>repeated uint32 factor_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The factorList to set.
       * @return This builder for chaining.
       */
      public Builder setFactorList(
          int index, int value) {
        ensureFactorListIsMutable();
        factorList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 factor_list = 1;</code>
       * @param value The factorList to add.
       * @return This builder for chaining.
       */
      public Builder addFactorList(int value) {
        ensureFactorListIsMutable();
        factorList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 factor_list = 1;</code>
       * @param values The factorList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFactorList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFactorListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, factorList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 factor_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFactorList() {
        factorList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int templateId_ ;
      /**
       * <code>uint32 template_id = 8;</code>
       * @return The templateId.
       */
      @java.lang.Override
      public int getTemplateId() {
        return templateId_;
      }
      /**
       * <code>uint32 template_id = 8;</code>
       * @param value The templateId to set.
       * @return This builder for chaining.
       */
      public Builder setTemplateId(int value) {
        
        templateId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 template_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTemplateId() {
        
        templateId_ = 0;
        onChanged();
        return this;
      }

      private int entranceId_ ;
      /**
       * <code>uint32 entrance_id = 2;</code>
       * @return The entranceId.
       */
      @java.lang.Override
      public int getEntranceId() {
        return entranceId_;
      }
      /**
       * <code>uint32 entrance_id = 2;</code>
       * @param value The entranceId to set.
       * @return This builder for chaining.
       */
      public Builder setEntranceId(int value) {
        
        entranceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entrance_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntranceId() {
        
        entranceId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ParentQuestRandomInfo)
    }

    // @@protoc_insertion_point(class_scope:ParentQuestRandomInfo)
    private static final emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo();
    }

    public static emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ParentQuestRandomInfo>
        PARSER = new com.google.protobuf.AbstractParser<ParentQuestRandomInfo>() {
      @java.lang.Override
      public ParentQuestRandomInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ParentQuestRandomInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ParentQuestRandomInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ParentQuestRandomInfoOuterClass.ParentQuestRandomInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ParentQuestRandomInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ParentQuestRandomInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ParentQuestRandomInfo.proto\"V\n\025ParentQ" +
      "uestRandomInfo\022\023\n\013factor_list\030\001 \003(\r\022\023\n\013t" +
      "emplate_id\030\010 \001(\r\022\023\n\013entrance_id\030\002 \001(\rB\036\n" +
      "\034emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ParentQuestRandomInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ParentQuestRandomInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ParentQuestRandomInfo_descriptor,
        new java.lang.String[] { "FactorList", "TemplateId", "EntranceId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
