// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3250_OBAAJIPPJBD.proto

package emu.grasscutter.net.newproto;

public final class Unk3250OBAAJIPPJBD {
  private Unk3250OBAAJIPPJBD() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3250_OBAAJIPPJBDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3250_OBAAJIPPJBD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3150_NEJFJBDDEJD = 5;</code>
     * @return A list containing the unk3150NEJFJBDDEJD.
     */
    java.util.List<java.lang.Integer> getUnk3150NEJFJBDDEJDList();
    /**
     * <code>repeated uint32 Unk3150_NEJFJBDDEJD = 5;</code>
     * @return The count of unk3150NEJFJBDDEJD.
     */
    int getUnk3150NEJFJBDDEJDCount();
    /**
     * <code>repeated uint32 Unk3150_NEJFJBDDEJD = 5;</code>
     * @param index The index of the element to return.
     * @return The unk3150NEJFJBDDEJD at the given index.
     */
    int getUnk3150NEJFJBDDEJD(int index);

    /**
     * <code>uint32 Unk3250_OGPCGOEIDOB = 2;</code>
     * @return The unk3250OGPCGOEIDOB.
     */
    int getUnk3250OGPCGOEIDOB();
  }
  /**
   * Protobuf type {@code Unk3250_OBAAJIPPJBD}
   */
  public static final class Unk3250_OBAAJIPPJBD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3250_OBAAJIPPJBD)
      Unk3250_OBAAJIPPJBDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3250_OBAAJIPPJBD.newBuilder() to construct.
    private Unk3250_OBAAJIPPJBD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3250_OBAAJIPPJBD() {
      unk3150NEJFJBDDEJD_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3250_OBAAJIPPJBD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.internal_static_Unk3250_OBAAJIPPJBD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.internal_static_Unk3250_OBAAJIPPJBD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD.class, emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD.Builder.class);
    }

    public static final int UNK3150_NEJFJBDDEJD_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList unk3150NEJFJBDDEJD_;
    /**
     * <code>repeated uint32 Unk3150_NEJFJBDDEJD = 5;</code>
     * @return A list containing the unk3150NEJFJBDDEJD.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3150NEJFJBDDEJDList() {
      return unk3150NEJFJBDDEJD_;
    }
    /**
     * <code>repeated uint32 Unk3150_NEJFJBDDEJD = 5;</code>
     * @return The count of unk3150NEJFJBDDEJD.
     */
    public int getUnk3150NEJFJBDDEJDCount() {
      return unk3150NEJFJBDDEJD_.size();
    }
    /**
     * <code>repeated uint32 Unk3150_NEJFJBDDEJD = 5;</code>
     * @param index The index of the element to return.
     * @return The unk3150NEJFJBDDEJD at the given index.
     */
    public int getUnk3150NEJFJBDDEJD(int index) {
      return unk3150NEJFJBDDEJD_.getInt(index);
    }
    private int unk3150NEJFJBDDEJDMemoizedSerializedSize = -1;

    public static final int UNK3250_OGPCGOEIDOB_FIELD_NUMBER = 2;
    private int unk3250OGPCGOEIDOB_;
    /**
     * <code>uint32 Unk3250_OGPCGOEIDOB = 2;</code>
     * @return The unk3250OGPCGOEIDOB.
     */
    @java.lang.Override
    public int getUnk3250OGPCGOEIDOB() {
      return unk3250OGPCGOEIDOB_;
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
      if (unk3250OGPCGOEIDOB_ != 0) {
        output.writeUInt32(2, unk3250OGPCGOEIDOB_);
      }
      if (getUnk3150NEJFJBDDEJDList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(unk3150NEJFJBDDEJDMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3150NEJFJBDDEJD_.size(); i++) {
        output.writeUInt32NoTag(unk3150NEJFJBDDEJD_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250OGPCGOEIDOB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk3250OGPCGOEIDOB_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk3150NEJFJBDDEJD_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3150NEJFJBDDEJD_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3150NEJFJBDDEJDList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3150NEJFJBDDEJDMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD other = (emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD) obj;

      if (!getUnk3150NEJFJBDDEJDList()
          .equals(other.getUnk3150NEJFJBDDEJDList())) return false;
      if (getUnk3250OGPCGOEIDOB()
          != other.getUnk3250OGPCGOEIDOB()) return false;
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
      if (getUnk3150NEJFJBDDEJDCount() > 0) {
        hash = (37 * hash) + UNK3150_NEJFJBDDEJD_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3150NEJFJBDDEJDList().hashCode();
      }
      hash = (37 * hash) + UNK3250_OGPCGOEIDOB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250OGPCGOEIDOB();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD prototype) {
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
     * Protobuf type {@code Unk3250_OBAAJIPPJBD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3250_OBAAJIPPJBD)
        emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.internal_static_Unk3250_OBAAJIPPJBD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.internal_static_Unk3250_OBAAJIPPJBD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD.class, emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3150NEJFJBDDEJD_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        unk3250OGPCGOEIDOB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.internal_static_Unk3250_OBAAJIPPJBD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD build() {
        emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD buildPartial() {
        emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD result = new emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3150NEJFJBDDEJD_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3150NEJFJBDDEJD_ = unk3150NEJFJBDDEJD_;
        result.unk3250OGPCGOEIDOB_ = unk3250OGPCGOEIDOB_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD other) {
        if (other == emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD.getDefaultInstance()) return this;
        if (!other.unk3150NEJFJBDDEJD_.isEmpty()) {
          if (unk3150NEJFJBDDEJD_.isEmpty()) {
            unk3150NEJFJBDDEJD_ = other.unk3150NEJFJBDDEJD_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3150NEJFJBDDEJDIsMutable();
            unk3150NEJFJBDDEJD_.addAll(other.unk3150NEJFJBDDEJD_);
          }
          onChanged();
        }
        if (other.getUnk3250OGPCGOEIDOB() != 0) {
          setUnk3250OGPCGOEIDOB(other.getUnk3250OGPCGOEIDOB());
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
              case 16: {
                unk3250OGPCGOEIDOB_ = input.readUInt32();

                break;
              } // case 16
              case 40: {
                int v = input.readUInt32();
                ensureUnk3150NEJFJBDDEJDIsMutable();
                unk3150NEJFJBDDEJD_.addInt(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3150NEJFJBDDEJDIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3150NEJFJBDDEJD_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 42
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

      private com.google.protobuf.Internal.IntList unk3150NEJFJBDDEJD_ = emptyIntList();
      private void ensureUnk3150NEJFJBDDEJDIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3150NEJFJBDDEJD_ = mutableCopy(unk3150NEJFJBDDEJD_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3150_NEJFJBDDEJD = 5;</code>
       * @return A list containing the unk3150NEJFJBDDEJD.
       */
      public java.util.List<java.lang.Integer>
          getUnk3150NEJFJBDDEJDList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3150NEJFJBDDEJD_) : unk3150NEJFJBDDEJD_;
      }
      /**
       * <code>repeated uint32 Unk3150_NEJFJBDDEJD = 5;</code>
       * @return The count of unk3150NEJFJBDDEJD.
       */
      public int getUnk3150NEJFJBDDEJDCount() {
        return unk3150NEJFJBDDEJD_.size();
      }
      /**
       * <code>repeated uint32 Unk3150_NEJFJBDDEJD = 5;</code>
       * @param index The index of the element to return.
       * @return The unk3150NEJFJBDDEJD at the given index.
       */
      public int getUnk3150NEJFJBDDEJD(int index) {
        return unk3150NEJFJBDDEJD_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3150_NEJFJBDDEJD = 5;</code>
       * @param index The index to set the value at.
       * @param value The unk3150NEJFJBDDEJD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150NEJFJBDDEJD(
          int index, int value) {
        ensureUnk3150NEJFJBDDEJDIsMutable();
        unk3150NEJFJBDDEJD_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_NEJFJBDDEJD = 5;</code>
       * @param value The unk3150NEJFJBDDEJD to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3150NEJFJBDDEJD(int value) {
        ensureUnk3150NEJFJBDDEJDIsMutable();
        unk3150NEJFJBDDEJD_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_NEJFJBDDEJD = 5;</code>
       * @param values The unk3150NEJFJBDDEJD to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3150NEJFJBDDEJD(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3150NEJFJBDDEJDIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3150NEJFJBDDEJD_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_NEJFJBDDEJD = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150NEJFJBDDEJD() {
        unk3150NEJFJBDDEJD_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int unk3250OGPCGOEIDOB_ ;
      /**
       * <code>uint32 Unk3250_OGPCGOEIDOB = 2;</code>
       * @return The unk3250OGPCGOEIDOB.
       */
      @java.lang.Override
      public int getUnk3250OGPCGOEIDOB() {
        return unk3250OGPCGOEIDOB_;
      }
      /**
       * <code>uint32 Unk3250_OGPCGOEIDOB = 2;</code>
       * @param value The unk3250OGPCGOEIDOB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250OGPCGOEIDOB(int value) {
        
        unk3250OGPCGOEIDOB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_OGPCGOEIDOB = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250OGPCGOEIDOB() {
        
        unk3250OGPCGOEIDOB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3250_OBAAJIPPJBD)
    }

    // @@protoc_insertion_point(class_scope:Unk3250_OBAAJIPPJBD)
    private static final emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD();
    }

    public static emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3250_OBAAJIPPJBD>
        PARSER = new com.google.protobuf.AbstractParser<Unk3250_OBAAJIPPJBD>() {
      @java.lang.Override
      public Unk3250_OBAAJIPPJBD parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3250_OBAAJIPPJBD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3250_OBAAJIPPJBD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3250OBAAJIPPJBD.Unk3250_OBAAJIPPJBD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3250_OBAAJIPPJBD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3250_OBAAJIPPJBD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3250_OBAAJIPPJBD.proto\"O\n\023Unk3250_O" +
      "BAAJIPPJBD\022\033\n\023Unk3150_NEJFJBDDEJD\030\005 \003(\r\022" +
      "\033\n\023Unk3250_OGPCGOEIDOB\030\002 \001(\rB\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3250_OBAAJIPPJBD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3250_OBAAJIPPJBD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3250_OBAAJIPPJBD_descriptor,
        new java.lang.String[] { "Unk3150NEJFJBDDEJD", "Unk3250OGPCGOEIDOB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
