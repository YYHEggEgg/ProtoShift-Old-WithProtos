// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PveGenCardOp.proto

package emu.grasscutter.net.newproto;

public final class PveGenCardOpOuterClass {
  private PveGenCardOpOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PveGenCardOpOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PveGenCardOp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3150_IPBCLBMCHJL = 1;</code>
     * @return The unk3150IPBCLBMCHJL.
     */
    int getUnk3150IPBCLBMCHJL();

    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 15;</code>
     * @return A list containing the unk3250JDGLLFNGLGI.
     */
    java.util.List<java.lang.Integer> getUnk3250JDGLLFNGLGIList();
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 15;</code>
     * @return The count of unk3250JDGLLFNGLGI.
     */
    int getUnk3250JDGLLFNGLGICount();
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 15;</code>
     * @param index The index of the element to return.
     * @return The unk3250JDGLLFNGLGI at the given index.
     */
    int getUnk3250JDGLLFNGLGI(int index);
  }
  /**
   * Protobuf type {@code PveGenCardOp}
   */
  public static final class PveGenCardOp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PveGenCardOp)
      PveGenCardOpOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PveGenCardOp.newBuilder() to construct.
    private PveGenCardOp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PveGenCardOp() {
      unk3250JDGLLFNGLGI_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PveGenCardOp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PveGenCardOpOuterClass.internal_static_PveGenCardOp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PveGenCardOpOuterClass.internal_static_PveGenCardOp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp.class, emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp.Builder.class);
    }

    public static final int UNK3150_IPBCLBMCHJL_FIELD_NUMBER = 1;
    private int unk3150IPBCLBMCHJL_;
    /**
     * <code>uint32 Unk3150_IPBCLBMCHJL = 1;</code>
     * @return The unk3150IPBCLBMCHJL.
     */
    @java.lang.Override
    public int getUnk3150IPBCLBMCHJL() {
      return unk3150IPBCLBMCHJL_;
    }

    public static final int UNK3250_JDGLLFNGLGI_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList unk3250JDGLLFNGLGI_;
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 15;</code>
     * @return A list containing the unk3250JDGLLFNGLGI.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3250JDGLLFNGLGIList() {
      return unk3250JDGLLFNGLGI_;
    }
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 15;</code>
     * @return The count of unk3250JDGLLFNGLGI.
     */
    public int getUnk3250JDGLLFNGLGICount() {
      return unk3250JDGLLFNGLGI_.size();
    }
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 15;</code>
     * @param index The index of the element to return.
     * @return The unk3250JDGLLFNGLGI at the given index.
     */
    public int getUnk3250JDGLLFNGLGI(int index) {
      return unk3250JDGLLFNGLGI_.getInt(index);
    }
    private int unk3250JDGLLFNGLGIMemoizedSerializedSize = -1;

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
      if (unk3150IPBCLBMCHJL_ != 0) {
        output.writeUInt32(1, unk3150IPBCLBMCHJL_);
      }
      if (getUnk3250JDGLLFNGLGIList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(unk3250JDGLLFNGLGIMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3250JDGLLFNGLGI_.size(); i++) {
        output.writeUInt32NoTag(unk3250JDGLLFNGLGI_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3150IPBCLBMCHJL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3150IPBCLBMCHJL_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk3250JDGLLFNGLGI_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3250JDGLLFNGLGI_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3250JDGLLFNGLGIList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3250JDGLLFNGLGIMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp other = (emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp) obj;

      if (getUnk3150IPBCLBMCHJL()
          != other.getUnk3150IPBCLBMCHJL()) return false;
      if (!getUnk3250JDGLLFNGLGIList()
          .equals(other.getUnk3250JDGLLFNGLGIList())) return false;
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
      hash = (37 * hash) + UNK3150_IPBCLBMCHJL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3150IPBCLBMCHJL();
      if (getUnk3250JDGLLFNGLGICount() > 0) {
        hash = (37 * hash) + UNK3250_JDGLLFNGLGI_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3250JDGLLFNGLGIList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp prototype) {
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
     * Protobuf type {@code PveGenCardOp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PveGenCardOp)
        emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOpOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PveGenCardOpOuterClass.internal_static_PveGenCardOp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PveGenCardOpOuterClass.internal_static_PveGenCardOp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp.class, emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3150IPBCLBMCHJL_ = 0;

        unk3250JDGLLFNGLGI_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PveGenCardOpOuterClass.internal_static_PveGenCardOp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp build() {
        emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp buildPartial() {
        emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp result = new emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp(this);
        int from_bitField0_ = bitField0_;
        result.unk3150IPBCLBMCHJL_ = unk3150IPBCLBMCHJL_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3250JDGLLFNGLGI_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3250JDGLLFNGLGI_ = unk3250JDGLLFNGLGI_;
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
        if (other instanceof emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp) {
          return mergeFrom((emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp other) {
        if (other == emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp.getDefaultInstance()) return this;
        if (other.getUnk3150IPBCLBMCHJL() != 0) {
          setUnk3150IPBCLBMCHJL(other.getUnk3150IPBCLBMCHJL());
        }
        if (!other.unk3250JDGLLFNGLGI_.isEmpty()) {
          if (unk3250JDGLLFNGLGI_.isEmpty()) {
            unk3250JDGLLFNGLGI_ = other.unk3250JDGLLFNGLGI_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3250JDGLLFNGLGIIsMutable();
            unk3250JDGLLFNGLGI_.addAll(other.unk3250JDGLLFNGLGI_);
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
              case 8: {
                unk3150IPBCLBMCHJL_ = input.readUInt32();

                break;
              } // case 8
              case 120: {
                int v = input.readUInt32();
                ensureUnk3250JDGLLFNGLGIIsMutable();
                unk3250JDGLLFNGLGI_.addInt(v);
                break;
              } // case 120
              case 122: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3250JDGLLFNGLGIIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3250JDGLLFNGLGI_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 122
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

      private int unk3150IPBCLBMCHJL_ ;
      /**
       * <code>uint32 Unk3150_IPBCLBMCHJL = 1;</code>
       * @return The unk3150IPBCLBMCHJL.
       */
      @java.lang.Override
      public int getUnk3150IPBCLBMCHJL() {
        return unk3150IPBCLBMCHJL_;
      }
      /**
       * <code>uint32 Unk3150_IPBCLBMCHJL = 1;</code>
       * @param value The unk3150IPBCLBMCHJL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150IPBCLBMCHJL(int value) {
        
        unk3150IPBCLBMCHJL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3150_IPBCLBMCHJL = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150IPBCLBMCHJL() {
        
        unk3150IPBCLBMCHJL_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3250JDGLLFNGLGI_ = emptyIntList();
      private void ensureUnk3250JDGLLFNGLGIIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3250JDGLLFNGLGI_ = mutableCopy(unk3250JDGLLFNGLGI_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 15;</code>
       * @return A list containing the unk3250JDGLLFNGLGI.
       */
      public java.util.List<java.lang.Integer>
          getUnk3250JDGLLFNGLGIList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3250JDGLLFNGLGI_) : unk3250JDGLLFNGLGI_;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 15;</code>
       * @return The count of unk3250JDGLLFNGLGI.
       */
      public int getUnk3250JDGLLFNGLGICount() {
        return unk3250JDGLLFNGLGI_.size();
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 15;</code>
       * @param index The index of the element to return.
       * @return The unk3250JDGLLFNGLGI at the given index.
       */
      public int getUnk3250JDGLLFNGLGI(int index) {
        return unk3250JDGLLFNGLGI_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 15;</code>
       * @param index The index to set the value at.
       * @param value The unk3250JDGLLFNGLGI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250JDGLLFNGLGI(
          int index, int value) {
        ensureUnk3250JDGLLFNGLGIIsMutable();
        unk3250JDGLLFNGLGI_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 15;</code>
       * @param value The unk3250JDGLLFNGLGI to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3250JDGLLFNGLGI(int value) {
        ensureUnk3250JDGLLFNGLGIIsMutable();
        unk3250JDGLLFNGLGI_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 15;</code>
       * @param values The unk3250JDGLLFNGLGI to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3250JDGLLFNGLGI(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3250JDGLLFNGLGIIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3250JDGLLFNGLGI_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250JDGLLFNGLGI() {
        unk3250JDGLLFNGLGI_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:PveGenCardOp)
    }

    // @@protoc_insertion_point(class_scope:PveGenCardOp)
    private static final emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp();
    }

    public static emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PveGenCardOp>
        PARSER = new com.google.protobuf.AbstractParser<PveGenCardOp>() {
      @java.lang.Override
      public PveGenCardOp parsePartialFrom(
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

    public static com.google.protobuf.Parser<PveGenCardOp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PveGenCardOp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PveGenCardOpOuterClass.PveGenCardOp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PveGenCardOp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PveGenCardOp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022PveGenCardOp.proto\"H\n\014PveGenCardOp\022\033\n\023" +
      "Unk3150_IPBCLBMCHJL\030\001 \001(\r\022\033\n\023Unk3250_JDG" +
      "LLFNGLGI\030\017 \003(\rB\036\n\034emu.grasscutter.net.ne" +
      "wprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PveGenCardOp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PveGenCardOp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PveGenCardOp_descriptor,
        new java.lang.String[] { "Unk3150IPBCLBMCHJL", "Unk3250JDGLLFNGLGI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
