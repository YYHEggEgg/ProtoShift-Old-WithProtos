// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_DOGEKCNIIAO.proto

package emu.grasscutter.net.newproto;

public final class Unk2700DOGEKCNIIAO {
  private Unk2700DOGEKCNIIAO() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_DOGEKCNIIAOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_DOGEKCNIIAO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level = 14;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>repeated uint32 affix_list = 6;</code>
     * @return A list containing the affixList.
     */
    java.util.List<java.lang.Integer> getAffixListList();
    /**
     * <code>repeated uint32 affix_list = 6;</code>
     * @return The count of affixList.
     */
    int getAffixListCount();
    /**
     * <code>repeated uint32 affix_list = 6;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    int getAffixList(int index);

    /**
     * <code>uint32 monster_id = 12;</code>
     * @return The monsterId.
     */
    int getMonsterId();

    /**
     * <code>uint32 Unk2700_KJFBIFHFIBO = 4;</code>
     * @return The unk2700KJFBIFHFIBO.
     */
    int getUnk2700KJFBIFHFIBO();
  }
  /**
   * Protobuf type {@code Unk2700_DOGEKCNIIAO}
   */
  public static final class Unk2700_DOGEKCNIIAO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_DOGEKCNIIAO)
      Unk2700_DOGEKCNIIAOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_DOGEKCNIIAO.newBuilder() to construct.
    private Unk2700_DOGEKCNIIAO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_DOGEKCNIIAO() {
      affixList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_DOGEKCNIIAO();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.internal_static_Unk2700_DOGEKCNIIAO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.internal_static_Unk2700_DOGEKCNIIAO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO.class, emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO.Builder.class);
    }

    public static final int LEVEL_FIELD_NUMBER = 14;
    private int level_;
    /**
     * <code>uint32 level = 14;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int AFFIX_LIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList affixList_;
    /**
     * <code>repeated uint32 affix_list = 6;</code>
     * @return A list containing the affixList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAffixListList() {
      return affixList_;
    }
    /**
     * <code>repeated uint32 affix_list = 6;</code>
     * @return The count of affixList.
     */
    public int getAffixListCount() {
      return affixList_.size();
    }
    /**
     * <code>repeated uint32 affix_list = 6;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    public int getAffixList(int index) {
      return affixList_.getInt(index);
    }
    private int affixListMemoizedSerializedSize = -1;

    public static final int MONSTER_ID_FIELD_NUMBER = 12;
    private int monsterId_;
    /**
     * <code>uint32 monster_id = 12;</code>
     * @return The monsterId.
     */
    @java.lang.Override
    public int getMonsterId() {
      return monsterId_;
    }

    public static final int UNK2700_KJFBIFHFIBO_FIELD_NUMBER = 4;
    private int unk2700KJFBIFHFIBO_;
    /**
     * <code>uint32 Unk2700_KJFBIFHFIBO = 4;</code>
     * @return The unk2700KJFBIFHFIBO.
     */
    @java.lang.Override
    public int getUnk2700KJFBIFHFIBO() {
      return unk2700KJFBIFHFIBO_;
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
      if (unk2700KJFBIFHFIBO_ != 0) {
        output.writeUInt32(4, unk2700KJFBIFHFIBO_);
      }
      if (getAffixListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(affixListMemoizedSerializedSize);
      }
      for (int i = 0; i < affixList_.size(); i++) {
        output.writeUInt32NoTag(affixList_.getInt(i));
      }
      if (monsterId_ != 0) {
        output.writeUInt32(12, monsterId_);
      }
      if (level_ != 0) {
        output.writeUInt32(14, level_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700KJFBIFHFIBO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, unk2700KJFBIFHFIBO_);
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
      if (monsterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, monsterId_);
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, level_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO other = (emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO) obj;

      if (getLevel()
          != other.getLevel()) return false;
      if (!getAffixListList()
          .equals(other.getAffixListList())) return false;
      if (getMonsterId()
          != other.getMonsterId()) return false;
      if (getUnk2700KJFBIFHFIBO()
          != other.getUnk2700KJFBIFHFIBO()) return false;
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
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      if (getAffixListCount() > 0) {
        hash = (37 * hash) + AFFIX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAffixListList().hashCode();
      }
      hash = (37 * hash) + MONSTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterId();
      hash = (37 * hash) + UNK2700_KJFBIFHFIBO_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700KJFBIFHFIBO();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO prototype) {
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
     * Protobuf type {@code Unk2700_DOGEKCNIIAO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_DOGEKCNIIAO)
        emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.internal_static_Unk2700_DOGEKCNIIAO_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.internal_static_Unk2700_DOGEKCNIIAO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO.class, emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        level_ = 0;

        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        monsterId_ = 0;

        unk2700KJFBIFHFIBO_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.internal_static_Unk2700_DOGEKCNIIAO_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO build() {
        emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO buildPartial() {
        emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO result = new emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO(this);
        int from_bitField0_ = bitField0_;
        result.level_ = level_;
        if (((bitField0_ & 0x00000001) != 0)) {
          affixList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.affixList_ = affixList_;
        result.monsterId_ = monsterId_;
        result.unk2700KJFBIFHFIBO_ = unk2700KJFBIFHFIBO_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO other) {
        if (other == emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO.getDefaultInstance()) return this;
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
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
        if (other.getMonsterId() != 0) {
          setMonsterId(other.getMonsterId());
        }
        if (other.getUnk2700KJFBIFHFIBO() != 0) {
          setUnk2700KJFBIFHFIBO(other.getUnk2700KJFBIFHFIBO());
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
              case 32: {
                unk2700KJFBIFHFIBO_ = input.readUInt32();

                break;
              } // case 32
              case 48: {
                int v = input.readUInt32();
                ensureAffixListIsMutable();
                affixList_.addInt(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAffixListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  affixList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 50
              case 96: {
                monsterId_ = input.readUInt32();

                break;
              } // case 96
              case 112: {
                level_ = input.readUInt32();

                break;
              } // case 112
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

      private int level_ ;
      /**
       * <code>uint32 level = 14;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 14;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
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
       * <code>repeated uint32 affix_list = 6;</code>
       * @return A list containing the affixList.
       */
      public java.util.List<java.lang.Integer>
          getAffixListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(affixList_) : affixList_;
      }
      /**
       * <code>repeated uint32 affix_list = 6;</code>
       * @return The count of affixList.
       */
      public int getAffixListCount() {
        return affixList_.size();
      }
      /**
       * <code>repeated uint32 affix_list = 6;</code>
       * @param index The index of the element to return.
       * @return The affixList at the given index.
       */
      public int getAffixList(int index) {
        return affixList_.getInt(index);
      }
      /**
       * <code>repeated uint32 affix_list = 6;</code>
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
       * <code>repeated uint32 affix_list = 6;</code>
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
       * <code>repeated uint32 affix_list = 6;</code>
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
       * <code>repeated uint32 affix_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAffixList() {
        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int monsterId_ ;
      /**
       * <code>uint32 monster_id = 12;</code>
       * @return The monsterId.
       */
      @java.lang.Override
      public int getMonsterId() {
        return monsterId_;
      }
      /**
       * <code>uint32 monster_id = 12;</code>
       * @param value The monsterId to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterId(int value) {
        
        monsterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monster_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterId() {
        
        monsterId_ = 0;
        onChanged();
        return this;
      }

      private int unk2700KJFBIFHFIBO_ ;
      /**
       * <code>uint32 Unk2700_KJFBIFHFIBO = 4;</code>
       * @return The unk2700KJFBIFHFIBO.
       */
      @java.lang.Override
      public int getUnk2700KJFBIFHFIBO() {
        return unk2700KJFBIFHFIBO_;
      }
      /**
       * <code>uint32 Unk2700_KJFBIFHFIBO = 4;</code>
       * @param value The unk2700KJFBIFHFIBO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700KJFBIFHFIBO(int value) {
        
        unk2700KJFBIFHFIBO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_KJFBIFHFIBO = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700KJFBIFHFIBO() {
        
        unk2700KJFBIFHFIBO_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_DOGEKCNIIAO)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_DOGEKCNIIAO)
    private static final emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO();
    }

    public static emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_DOGEKCNIIAO>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_DOGEKCNIIAO>() {
      @java.lang.Override
      public Unk2700_DOGEKCNIIAO parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_DOGEKCNIIAO> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_DOGEKCNIIAO> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700DOGEKCNIIAO.Unk2700_DOGEKCNIIAO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_DOGEKCNIIAO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_DOGEKCNIIAO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_DOGEKCNIIAO.proto\"i\n\023Unk2700_D" +
      "OGEKCNIIAO\022\r\n\005level\030\016 \001(\r\022\022\n\naffix_list\030" +
      "\006 \003(\r\022\022\n\nmonster_id\030\014 \001(\r\022\033\n\023Unk2700_KJF" +
      "BIFHFIBO\030\004 \001(\rB\036\n\034emu.grasscutter.net.ne" +
      "wprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_DOGEKCNIIAO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_DOGEKCNIIAO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_DOGEKCNIIAO_descriptor,
        new java.lang.String[] { "Level", "AffixList", "MonsterId", "Unk2700KJFBIFHFIBO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
