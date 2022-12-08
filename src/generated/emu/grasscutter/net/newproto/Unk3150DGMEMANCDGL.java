// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_DGMEMANCDGL.proto

package emu.grasscutter.net.newproto;

public final class Unk3150DGMEMANCDGL {
  private Unk3150DGMEMANCDGL() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_DGMEMANCDGLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_DGMEMANCDGL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @return A list containing the affixList.
     */
    java.util.List<java.lang.Integer> getAffixListList();
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @return The count of affixList.
     */
    int getAffixListCount();
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    int getAffixList(int index);

    /**
     * <code>uint32 level = 11;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 monster_id = 8;</code>
     * @return The monsterId.
     */
    int getMonsterId();
  }
  /**
   * Protobuf type {@code Unk3150_DGMEMANCDGL}
   */
  public static final class Unk3150_DGMEMANCDGL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_DGMEMANCDGL)
      Unk3150_DGMEMANCDGLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_DGMEMANCDGL.newBuilder() to construct.
    private Unk3150_DGMEMANCDGL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_DGMEMANCDGL() {
      affixList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_DGMEMANCDGL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.internal_static_Unk3150_DGMEMANCDGL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.internal_static_Unk3150_DGMEMANCDGL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL.class, emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL.Builder.class);
    }

    public static final int AFFIX_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList affixList_;
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @return A list containing the affixList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAffixListList() {
      return affixList_;
    }
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @return The count of affixList.
     */
    public int getAffixListCount() {
      return affixList_.size();
    }
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    public int getAffixList(int index) {
      return affixList_.getInt(index);
    }
    private int affixListMemoizedSerializedSize = -1;

    public static final int LEVEL_FIELD_NUMBER = 11;
    private int level_;
    /**
     * <code>uint32 level = 11;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int MONSTER_ID_FIELD_NUMBER = 8;
    private int monsterId_;
    /**
     * <code>uint32 monster_id = 8;</code>
     * @return The monsterId.
     */
    @java.lang.Override
    public int getMonsterId() {
      return monsterId_;
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
      if (monsterId_ != 0) {
        output.writeUInt32(8, monsterId_);
      }
      if (level_ != 0) {
        output.writeUInt32(11, level_);
      }
      if (getAffixListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(affixListMemoizedSerializedSize);
      }
      for (int i = 0; i < affixList_.size(); i++) {
        output.writeUInt32NoTag(affixList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (monsterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, monsterId_);
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, level_);
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
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL other = (emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL) obj;

      if (!getAffixListList()
          .equals(other.getAffixListList())) return false;
      if (getLevel()
          != other.getLevel()) return false;
      if (getMonsterId()
          != other.getMonsterId()) return false;
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
      if (getAffixListCount() > 0) {
        hash = (37 * hash) + AFFIX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAffixListList().hashCode();
      }
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + MONSTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL prototype) {
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
     * Protobuf type {@code Unk3150_DGMEMANCDGL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_DGMEMANCDGL)
        emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.internal_static_Unk3150_DGMEMANCDGL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.internal_static_Unk3150_DGMEMANCDGL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL.class, emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        level_ = 0;

        monsterId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.internal_static_Unk3150_DGMEMANCDGL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL build() {
        emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL buildPartial() {
        emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL result = new emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          affixList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.affixList_ = affixList_;
        result.level_ = level_;
        result.monsterId_ = monsterId_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL other) {
        if (other == emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL.getDefaultInstance()) return this;
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
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getMonsterId() != 0) {
          setMonsterId(other.getMonsterId());
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
              case 64: {
                monsterId_ = input.readUInt32();

                break;
              } // case 64
              case 88: {
                level_ = input.readUInt32();

                break;
              } // case 88
              case 104: {
                int v = input.readUInt32();
                ensureAffixListIsMutable();
                affixList_.addInt(v);
                break;
              } // case 104
              case 106: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAffixListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  affixList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 106
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

      private com.google.protobuf.Internal.IntList affixList_ = emptyIntList();
      private void ensureAffixListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          affixList_ = mutableCopy(affixList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @return A list containing the affixList.
       */
      public java.util.List<java.lang.Integer>
          getAffixListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(affixList_) : affixList_;
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @return The count of affixList.
       */
      public int getAffixListCount() {
        return affixList_.size();
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @param index The index of the element to return.
       * @return The affixList at the given index.
       */
      public int getAffixList(int index) {
        return affixList_.getInt(index);
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
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
       * <code>repeated uint32 affix_list = 13;</code>
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
       * <code>repeated uint32 affix_list = 13;</code>
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
       * <code>repeated uint32 affix_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAffixList() {
        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 11;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 11;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private int monsterId_ ;
      /**
       * <code>uint32 monster_id = 8;</code>
       * @return The monsterId.
       */
      @java.lang.Override
      public int getMonsterId() {
        return monsterId_;
      }
      /**
       * <code>uint32 monster_id = 8;</code>
       * @param value The monsterId to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterId(int value) {
        
        monsterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monster_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterId() {
        
        monsterId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_DGMEMANCDGL)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_DGMEMANCDGL)
    private static final emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL();
    }

    public static emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_DGMEMANCDGL>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_DGMEMANCDGL>() {
      @java.lang.Override
      public Unk3150_DGMEMANCDGL parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_DGMEMANCDGL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_DGMEMANCDGL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150DGMEMANCDGL.Unk3150_DGMEMANCDGL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_DGMEMANCDGL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_DGMEMANCDGL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_DGMEMANCDGL.proto\"L\n\023Unk3150_D" +
      "GMEMANCDGL\022\022\n\naffix_list\030\r \003(\r\022\r\n\005level\030" +
      "\013 \001(\r\022\022\n\nmonster_id\030\010 \001(\rB\036\n\034emu.grasscu" +
      "tter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_DGMEMANCDGL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_DGMEMANCDGL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_DGMEMANCDGL_descriptor,
        new java.lang.String[] { "AffixList", "Level", "MonsterId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}