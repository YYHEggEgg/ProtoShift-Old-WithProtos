// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpAttack.proto

package emu.grasscutter.net.newproto;

public final class OpAttackOuterClass {
  private OpAttackOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OpAttackOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpAttack)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 10;</code>
     * @return A list containing the unk3150OFHEJEGJLJD.
     */
    java.util.List<java.lang.Integer> getUnk3150OFHEJEGJLJDList();
    /**
     * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 10;</code>
     * @return The count of unk3150OFHEJEGJLJD.
     */
    int getUnk3150OFHEJEGJLJDCount();
    /**
     * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 10;</code>
     * @param index The index of the element to return.
     * @return The unk3150OFHEJEGJLJD at the given index.
     */
    int getUnk3150OFHEJEGJLJD(int index);

    /**
     * <code>uint32 Unk3150_JAKPANLHCEF = 6;</code>
     * @return The unk3150JAKPANLHCEF.
     */
    int getUnk3150JAKPANLHCEF();
  }
  /**
   * Protobuf type {@code OpAttack}
   */
  public static final class OpAttack extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OpAttack)
      OpAttackOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpAttack.newBuilder() to construct.
    private OpAttack(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpAttack() {
      unk3150OFHEJEGJLJD_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpAttack();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.OpAttackOuterClass.internal_static_OpAttack_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.OpAttackOuterClass.internal_static_OpAttack_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack.class, emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack.Builder.class);
    }

    public static final int UNK3150_OFHEJEGJLJD_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList unk3150OFHEJEGJLJD_;
    /**
     * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 10;</code>
     * @return A list containing the unk3150OFHEJEGJLJD.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3150OFHEJEGJLJDList() {
      return unk3150OFHEJEGJLJD_;
    }
    /**
     * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 10;</code>
     * @return The count of unk3150OFHEJEGJLJD.
     */
    public int getUnk3150OFHEJEGJLJDCount() {
      return unk3150OFHEJEGJLJD_.size();
    }
    /**
     * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 10;</code>
     * @param index The index of the element to return.
     * @return The unk3150OFHEJEGJLJD at the given index.
     */
    public int getUnk3150OFHEJEGJLJD(int index) {
      return unk3150OFHEJEGJLJD_.getInt(index);
    }
    private int unk3150OFHEJEGJLJDMemoizedSerializedSize = -1;

    public static final int UNK3150_JAKPANLHCEF_FIELD_NUMBER = 6;
    private int unk3150JAKPANLHCEF_;
    /**
     * <code>uint32 Unk3150_JAKPANLHCEF = 6;</code>
     * @return The unk3150JAKPANLHCEF.
     */
    @java.lang.Override
    public int getUnk3150JAKPANLHCEF() {
      return unk3150JAKPANLHCEF_;
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
      if (unk3150JAKPANLHCEF_ != 0) {
        output.writeUInt32(6, unk3150JAKPANLHCEF_);
      }
      if (getUnk3150OFHEJEGJLJDList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(unk3150OFHEJEGJLJDMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3150OFHEJEGJLJD_.size(); i++) {
        output.writeUInt32NoTag(unk3150OFHEJEGJLJD_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3150JAKPANLHCEF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk3150JAKPANLHCEF_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk3150OFHEJEGJLJD_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3150OFHEJEGJLJD_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3150OFHEJEGJLJDList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3150OFHEJEGJLJDMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack other = (emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack) obj;

      if (!getUnk3150OFHEJEGJLJDList()
          .equals(other.getUnk3150OFHEJEGJLJDList())) return false;
      if (getUnk3150JAKPANLHCEF()
          != other.getUnk3150JAKPANLHCEF()) return false;
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
      if (getUnk3150OFHEJEGJLJDCount() > 0) {
        hash = (37 * hash) + UNK3150_OFHEJEGJLJD_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3150OFHEJEGJLJDList().hashCode();
      }
      hash = (37 * hash) + UNK3150_JAKPANLHCEF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3150JAKPANLHCEF();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack prototype) {
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
     * Protobuf type {@code OpAttack}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpAttack)
        emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttackOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.OpAttackOuterClass.internal_static_OpAttack_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.OpAttackOuterClass.internal_static_OpAttack_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack.class, emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3150OFHEJEGJLJD_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        unk3150JAKPANLHCEF_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.OpAttackOuterClass.internal_static_OpAttack_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack build() {
        emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack buildPartial() {
        emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack result = new emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3150OFHEJEGJLJD_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3150OFHEJEGJLJD_ = unk3150OFHEJEGJLJD_;
        result.unk3150JAKPANLHCEF_ = unk3150JAKPANLHCEF_;
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
        if (other instanceof emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack) {
          return mergeFrom((emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack other) {
        if (other == emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack.getDefaultInstance()) return this;
        if (!other.unk3150OFHEJEGJLJD_.isEmpty()) {
          if (unk3150OFHEJEGJLJD_.isEmpty()) {
            unk3150OFHEJEGJLJD_ = other.unk3150OFHEJEGJLJD_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3150OFHEJEGJLJDIsMutable();
            unk3150OFHEJEGJLJD_.addAll(other.unk3150OFHEJEGJLJD_);
          }
          onChanged();
        }
        if (other.getUnk3150JAKPANLHCEF() != 0) {
          setUnk3150JAKPANLHCEF(other.getUnk3150JAKPANLHCEF());
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
                unk3150JAKPANLHCEF_ = input.readUInt32();

                break;
              } // case 48
              case 80: {
                int v = input.readUInt32();
                ensureUnk3150OFHEJEGJLJDIsMutable();
                unk3150OFHEJEGJLJD_.addInt(v);
                break;
              } // case 80
              case 82: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3150OFHEJEGJLJDIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3150OFHEJEGJLJD_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 82
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

      private com.google.protobuf.Internal.IntList unk3150OFHEJEGJLJD_ = emptyIntList();
      private void ensureUnk3150OFHEJEGJLJDIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3150OFHEJEGJLJD_ = mutableCopy(unk3150OFHEJEGJLJD_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 10;</code>
       * @return A list containing the unk3150OFHEJEGJLJD.
       */
      public java.util.List<java.lang.Integer>
          getUnk3150OFHEJEGJLJDList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3150OFHEJEGJLJD_) : unk3150OFHEJEGJLJD_;
      }
      /**
       * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 10;</code>
       * @return The count of unk3150OFHEJEGJLJD.
       */
      public int getUnk3150OFHEJEGJLJDCount() {
        return unk3150OFHEJEGJLJD_.size();
      }
      /**
       * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 10;</code>
       * @param index The index of the element to return.
       * @return The unk3150OFHEJEGJLJD at the given index.
       */
      public int getUnk3150OFHEJEGJLJD(int index) {
        return unk3150OFHEJEGJLJD_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 10;</code>
       * @param index The index to set the value at.
       * @param value The unk3150OFHEJEGJLJD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150OFHEJEGJLJD(
          int index, int value) {
        ensureUnk3150OFHEJEGJLJDIsMutable();
        unk3150OFHEJEGJLJD_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 10;</code>
       * @param value The unk3150OFHEJEGJLJD to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3150OFHEJEGJLJD(int value) {
        ensureUnk3150OFHEJEGJLJDIsMutable();
        unk3150OFHEJEGJLJD_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 10;</code>
       * @param values The unk3150OFHEJEGJLJD to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3150OFHEJEGJLJD(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3150OFHEJEGJLJDIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3150OFHEJEGJLJD_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150OFHEJEGJLJD() {
        unk3150OFHEJEGJLJD_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int unk3150JAKPANLHCEF_ ;
      /**
       * <code>uint32 Unk3150_JAKPANLHCEF = 6;</code>
       * @return The unk3150JAKPANLHCEF.
       */
      @java.lang.Override
      public int getUnk3150JAKPANLHCEF() {
        return unk3150JAKPANLHCEF_;
      }
      /**
       * <code>uint32 Unk3150_JAKPANLHCEF = 6;</code>
       * @param value The unk3150JAKPANLHCEF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150JAKPANLHCEF(int value) {
        
        unk3150JAKPANLHCEF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3150_JAKPANLHCEF = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150JAKPANLHCEF() {
        
        unk3150JAKPANLHCEF_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OpAttack)
    }

    // @@protoc_insertion_point(class_scope:OpAttack)
    private static final emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack();
    }

    public static emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpAttack>
        PARSER = new com.google.protobuf.AbstractParser<OpAttack>() {
      @java.lang.Override
      public OpAttack parsePartialFrom(
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

    public static com.google.protobuf.Parser<OpAttack> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpAttack> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.OpAttackOuterClass.OpAttack getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpAttack_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpAttack_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016OpAttack.proto\"D\n\010OpAttack\022\033\n\023Unk3150_" +
      "OFHEJEGJLJD\030\n \003(\r\022\033\n\023Unk3150_JAKPANLHCEF" +
      "\030\006 \001(\rB\036\n\034emu.grasscutter.net.newprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OpAttack_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpAttack_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpAttack_descriptor,
        new java.lang.String[] { "Unk3150OFHEJEGJLJD", "Unk3150JAKPANLHCEF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
