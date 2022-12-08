// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeVerifyFurnitureData.proto

package emu.grasscutter.net.oldproto;

public final class HomeVerifyFurnitureDataOuterClass {
  private HomeVerifyFurnitureDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeVerifyFurnitureDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeVerifyFurnitureData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 type = 7;</code>
     * @return A list containing the type.
     */
    java.util.List<java.lang.Integer> getTypeList();
    /**
     * <code>repeated uint32 type = 7;</code>
     * @return The count of type.
     */
    int getTypeCount();
    /**
     * <code>repeated uint32 type = 7;</code>
     * @param index The index of the element to return.
     * @return The type at the given index.
     */
    int getType(int index);

    /**
     * <code>uint32 id = 5;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>uint32 num = 9;</code>
     * @return The num.
     */
    int getNum();
  }
  /**
   * Protobuf type {@code HomeVerifyFurnitureData}
   */
  public static final class HomeVerifyFurnitureData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeVerifyFurnitureData)
      HomeVerifyFurnitureDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeVerifyFurnitureData.newBuilder() to construct.
    private HomeVerifyFurnitureData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeVerifyFurnitureData() {
      type_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeVerifyFurnitureData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.internal_static_HomeVerifyFurnitureData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.internal_static_HomeVerifyFurnitureData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData.class, emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList type_;
    /**
     * <code>repeated uint32 type = 7;</code>
     * @return A list containing the type.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getTypeList() {
      return type_;
    }
    /**
     * <code>repeated uint32 type = 7;</code>
     * @return The count of type.
     */
    public int getTypeCount() {
      return type_.size();
    }
    /**
     * <code>repeated uint32 type = 7;</code>
     * @param index The index of the element to return.
     * @return The type at the given index.
     */
    public int getType(int index) {
      return type_.getInt(index);
    }
    private int typeMemoizedSerializedSize = -1;

    public static final int ID_FIELD_NUMBER = 5;
    private int id_;
    /**
     * <code>uint32 id = 5;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int NUM_FIELD_NUMBER = 9;
    private int num_;
    /**
     * <code>uint32 num = 9;</code>
     * @return The num.
     */
    @java.lang.Override
    public int getNum() {
      return num_;
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
      if (id_ != 0) {
        output.writeUInt32(5, id_);
      }
      if (getTypeList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(typeMemoizedSerializedSize);
      }
      for (int i = 0; i < type_.size(); i++) {
        output.writeUInt32NoTag(type_.getInt(i));
      }
      if (num_ != 0) {
        output.writeUInt32(9, num_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, id_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < type_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(type_.getInt(i));
        }
        size += dataSize;
        if (!getTypeList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        typeMemoizedSerializedSize = dataSize;
      }
      if (num_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, num_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData other = (emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData) obj;

      if (!getTypeList()
          .equals(other.getTypeList())) return false;
      if (getId()
          != other.getId()) return false;
      if (getNum()
          != other.getNum()) return false;
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
      if (getTypeCount() > 0) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getTypeList().hashCode();
      }
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + NUM_FIELD_NUMBER;
      hash = (53 * hash) + getNum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData prototype) {
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
     * Protobuf type {@code HomeVerifyFurnitureData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeVerifyFurnitureData)
        emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.internal_static_HomeVerifyFurnitureData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.internal_static_HomeVerifyFurnitureData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData.class, emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;

        num_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.internal_static_HomeVerifyFurnitureData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData build() {
        emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData buildPartial() {
        emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData result = new emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          type_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.type_ = type_;
        result.id_ = id_;
        result.num_ = num_;
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
        if (other instanceof emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData) {
          return mergeFrom((emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData other) {
        if (other == emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData.getDefaultInstance()) return this;
        if (!other.type_.isEmpty()) {
          if (type_.isEmpty()) {
            type_ = other.type_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTypeIsMutable();
            type_.addAll(other.type_);
          }
          onChanged();
        }
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getNum() != 0) {
          setNum(other.getNum());
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
              case 40: {
                id_ = input.readUInt32();

                break;
              } // case 40
              case 56: {
                int v = input.readUInt32();
                ensureTypeIsMutable();
                type_.addInt(v);
                break;
              } // case 56
              case 58: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureTypeIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  type_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 58
              case 72: {
                num_ = input.readUInt32();

                break;
              } // case 72
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

      private com.google.protobuf.Internal.IntList type_ = emptyIntList();
      private void ensureTypeIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          type_ = mutableCopy(type_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 type = 7;</code>
       * @return A list containing the type.
       */
      public java.util.List<java.lang.Integer>
          getTypeList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(type_) : type_;
      }
      /**
       * <code>repeated uint32 type = 7;</code>
       * @return The count of type.
       */
      public int getTypeCount() {
        return type_.size();
      }
      /**
       * <code>repeated uint32 type = 7;</code>
       * @param index The index of the element to return.
       * @return The type at the given index.
       */
      public int getType(int index) {
        return type_.getInt(index);
      }
      /**
       * <code>repeated uint32 type = 7;</code>
       * @param index The index to set the value at.
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(
          int index, int value) {
        ensureTypeIsMutable();
        type_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 type = 7;</code>
       * @param value The type to add.
       * @return This builder for chaining.
       */
      public Builder addType(int value) {
        ensureTypeIsMutable();
        type_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 type = 7;</code>
       * @param values The type to add.
       * @return This builder for chaining.
       */
      public Builder addAllType(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTypeIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, type_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        type_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 5;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 5;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int num_ ;
      /**
       * <code>uint32 num = 9;</code>
       * @return The num.
       */
      @java.lang.Override
      public int getNum() {
        return num_;
      }
      /**
       * <code>uint32 num = 9;</code>
       * @param value The num to set.
       * @return This builder for chaining.
       */
      public Builder setNum(int value) {
        
        num_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 num = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearNum() {
        
        num_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeVerifyFurnitureData)
    }

    // @@protoc_insertion_point(class_scope:HomeVerifyFurnitureData)
    private static final emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData();
    }

    public static emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeVerifyFurnitureData>
        PARSER = new com.google.protobuf.AbstractParser<HomeVerifyFurnitureData>() {
      @java.lang.Override
      public HomeVerifyFurnitureData parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeVerifyFurnitureData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeVerifyFurnitureData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeVerifyFurnitureDataOuterClass.HomeVerifyFurnitureData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeVerifyFurnitureData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeVerifyFurnitureData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035HomeVerifyFurnitureData.proto\"@\n\027HomeV" +
      "erifyFurnitureData\022\014\n\004type\030\007 \003(\r\022\n\n\002id\030\005" +
      " \001(\r\022\013\n\003num\030\t \001(\rB\036\n\034emu.grasscutter.net" +
      ".oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeVerifyFurnitureData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeVerifyFurnitureData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeVerifyFurnitureData_descriptor,
        new java.lang.String[] { "Type", "Id", "Num", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
