// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpReboot.proto

package emu.grasscutter.net.newproto;

public final class OpRebootOuterClass {
  private OpRebootOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OpRebootOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpReboot)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3150_OGEOKKDPPKG = 10;</code>
     * @return A list containing the unk3150OGEOKKDPPKG.
     */
    java.util.List<java.lang.Integer> getUnk3150OGEOKKDPPKGList();
    /**
     * <code>repeated uint32 Unk3150_OGEOKKDPPKG = 10;</code>
     * @return The count of unk3150OGEOKKDPPKG.
     */
    int getUnk3150OGEOKKDPPKGCount();
    /**
     * <code>repeated uint32 Unk3150_OGEOKKDPPKG = 10;</code>
     * @param index The index of the element to return.
     * @return The unk3150OGEOKKDPPKG at the given index.
     */
    int getUnk3150OGEOKKDPPKG(int index);

    /**
     * <code>repeated uint32 Unk3150_PAGPHEFOBBK = 8;</code>
     * @return A list containing the unk3150PAGPHEFOBBK.
     */
    java.util.List<java.lang.Integer> getUnk3150PAGPHEFOBBKList();
    /**
     * <code>repeated uint32 Unk3150_PAGPHEFOBBK = 8;</code>
     * @return The count of unk3150PAGPHEFOBBK.
     */
    int getUnk3150PAGPHEFOBBKCount();
    /**
     * <code>repeated uint32 Unk3150_PAGPHEFOBBK = 8;</code>
     * @param index The index of the element to return.
     * @return The unk3150PAGPHEFOBBK at the given index.
     */
    int getUnk3150PAGPHEFOBBK(int index);
  }
  /**
   * Protobuf type {@code OpReboot}
   */
  public static final class OpReboot extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OpReboot)
      OpRebootOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpReboot.newBuilder() to construct.
    private OpReboot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpReboot() {
      unk3150OGEOKKDPPKG_ = emptyIntList();
      unk3150PAGPHEFOBBK_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpReboot();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.OpRebootOuterClass.internal_static_OpReboot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.OpRebootOuterClass.internal_static_OpReboot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot.class, emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot.Builder.class);
    }

    public static final int UNK3150_OGEOKKDPPKG_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList unk3150OGEOKKDPPKG_;
    /**
     * <code>repeated uint32 Unk3150_OGEOKKDPPKG = 10;</code>
     * @return A list containing the unk3150OGEOKKDPPKG.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3150OGEOKKDPPKGList() {
      return unk3150OGEOKKDPPKG_;
    }
    /**
     * <code>repeated uint32 Unk3150_OGEOKKDPPKG = 10;</code>
     * @return The count of unk3150OGEOKKDPPKG.
     */
    public int getUnk3150OGEOKKDPPKGCount() {
      return unk3150OGEOKKDPPKG_.size();
    }
    /**
     * <code>repeated uint32 Unk3150_OGEOKKDPPKG = 10;</code>
     * @param index The index of the element to return.
     * @return The unk3150OGEOKKDPPKG at the given index.
     */
    public int getUnk3150OGEOKKDPPKG(int index) {
      return unk3150OGEOKKDPPKG_.getInt(index);
    }
    private int unk3150OGEOKKDPPKGMemoizedSerializedSize = -1;

    public static final int UNK3150_PAGPHEFOBBK_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList unk3150PAGPHEFOBBK_;
    /**
     * <code>repeated uint32 Unk3150_PAGPHEFOBBK = 8;</code>
     * @return A list containing the unk3150PAGPHEFOBBK.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3150PAGPHEFOBBKList() {
      return unk3150PAGPHEFOBBK_;
    }
    /**
     * <code>repeated uint32 Unk3150_PAGPHEFOBBK = 8;</code>
     * @return The count of unk3150PAGPHEFOBBK.
     */
    public int getUnk3150PAGPHEFOBBKCount() {
      return unk3150PAGPHEFOBBK_.size();
    }
    /**
     * <code>repeated uint32 Unk3150_PAGPHEFOBBK = 8;</code>
     * @param index The index of the element to return.
     * @return The unk3150PAGPHEFOBBK at the given index.
     */
    public int getUnk3150PAGPHEFOBBK(int index) {
      return unk3150PAGPHEFOBBK_.getInt(index);
    }
    private int unk3150PAGPHEFOBBKMemoizedSerializedSize = -1;

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
      if (getUnk3150PAGPHEFOBBKList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(unk3150PAGPHEFOBBKMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3150PAGPHEFOBBK_.size(); i++) {
        output.writeUInt32NoTag(unk3150PAGPHEFOBBK_.getInt(i));
      }
      if (getUnk3150OGEOKKDPPKGList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(unk3150OGEOKKDPPKGMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3150OGEOKKDPPKG_.size(); i++) {
        output.writeUInt32NoTag(unk3150OGEOKKDPPKG_.getInt(i));
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
        for (int i = 0; i < unk3150PAGPHEFOBBK_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3150PAGPHEFOBBK_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3150PAGPHEFOBBKList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3150PAGPHEFOBBKMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk3150OGEOKKDPPKG_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3150OGEOKKDPPKG_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3150OGEOKKDPPKGList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3150OGEOKKDPPKGMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot other = (emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot) obj;

      if (!getUnk3150OGEOKKDPPKGList()
          .equals(other.getUnk3150OGEOKKDPPKGList())) return false;
      if (!getUnk3150PAGPHEFOBBKList()
          .equals(other.getUnk3150PAGPHEFOBBKList())) return false;
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
      if (getUnk3150OGEOKKDPPKGCount() > 0) {
        hash = (37 * hash) + UNK3150_OGEOKKDPPKG_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3150OGEOKKDPPKGList().hashCode();
      }
      if (getUnk3150PAGPHEFOBBKCount() > 0) {
        hash = (37 * hash) + UNK3150_PAGPHEFOBBK_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3150PAGPHEFOBBKList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot prototype) {
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
     * Protobuf type {@code OpReboot}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpReboot)
        emu.grasscutter.net.newproto.OpRebootOuterClass.OpRebootOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.OpRebootOuterClass.internal_static_OpReboot_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.OpRebootOuterClass.internal_static_OpReboot_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot.class, emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3150OGEOKKDPPKG_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        unk3150PAGPHEFOBBK_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.OpRebootOuterClass.internal_static_OpReboot_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot build() {
        emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot buildPartial() {
        emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot result = new emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3150OGEOKKDPPKG_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3150OGEOKKDPPKG_ = unk3150OGEOKKDPPKG_;
        if (((bitField0_ & 0x00000002) != 0)) {
          unk3150PAGPHEFOBBK_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.unk3150PAGPHEFOBBK_ = unk3150PAGPHEFOBBK_;
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
        if (other instanceof emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot) {
          return mergeFrom((emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot other) {
        if (other == emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot.getDefaultInstance()) return this;
        if (!other.unk3150OGEOKKDPPKG_.isEmpty()) {
          if (unk3150OGEOKKDPPKG_.isEmpty()) {
            unk3150OGEOKKDPPKG_ = other.unk3150OGEOKKDPPKG_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3150OGEOKKDPPKGIsMutable();
            unk3150OGEOKKDPPKG_.addAll(other.unk3150OGEOKKDPPKG_);
          }
          onChanged();
        }
        if (!other.unk3150PAGPHEFOBBK_.isEmpty()) {
          if (unk3150PAGPHEFOBBK_.isEmpty()) {
            unk3150PAGPHEFOBBK_ = other.unk3150PAGPHEFOBBK_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureUnk3150PAGPHEFOBBKIsMutable();
            unk3150PAGPHEFOBBK_.addAll(other.unk3150PAGPHEFOBBK_);
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
              case 64: {
                int v = input.readUInt32();
                ensureUnk3150PAGPHEFOBBKIsMutable();
                unk3150PAGPHEFOBBK_.addInt(v);
                break;
              } // case 64
              case 66: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3150PAGPHEFOBBKIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3150PAGPHEFOBBK_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 66
              case 80: {
                int v = input.readUInt32();
                ensureUnk3150OGEOKKDPPKGIsMutable();
                unk3150OGEOKKDPPKG_.addInt(v);
                break;
              } // case 80
              case 82: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3150OGEOKKDPPKGIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3150OGEOKKDPPKG_.addInt(input.readUInt32());
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

      private com.google.protobuf.Internal.IntList unk3150OGEOKKDPPKG_ = emptyIntList();
      private void ensureUnk3150OGEOKKDPPKGIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3150OGEOKKDPPKG_ = mutableCopy(unk3150OGEOKKDPPKG_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3150_OGEOKKDPPKG = 10;</code>
       * @return A list containing the unk3150OGEOKKDPPKG.
       */
      public java.util.List<java.lang.Integer>
          getUnk3150OGEOKKDPPKGList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3150OGEOKKDPPKG_) : unk3150OGEOKKDPPKG_;
      }
      /**
       * <code>repeated uint32 Unk3150_OGEOKKDPPKG = 10;</code>
       * @return The count of unk3150OGEOKKDPPKG.
       */
      public int getUnk3150OGEOKKDPPKGCount() {
        return unk3150OGEOKKDPPKG_.size();
      }
      /**
       * <code>repeated uint32 Unk3150_OGEOKKDPPKG = 10;</code>
       * @param index The index of the element to return.
       * @return The unk3150OGEOKKDPPKG at the given index.
       */
      public int getUnk3150OGEOKKDPPKG(int index) {
        return unk3150OGEOKKDPPKG_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3150_OGEOKKDPPKG = 10;</code>
       * @param index The index to set the value at.
       * @param value The unk3150OGEOKKDPPKG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150OGEOKKDPPKG(
          int index, int value) {
        ensureUnk3150OGEOKKDPPKGIsMutable();
        unk3150OGEOKKDPPKG_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_OGEOKKDPPKG = 10;</code>
       * @param value The unk3150OGEOKKDPPKG to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3150OGEOKKDPPKG(int value) {
        ensureUnk3150OGEOKKDPPKGIsMutable();
        unk3150OGEOKKDPPKG_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_OGEOKKDPPKG = 10;</code>
       * @param values The unk3150OGEOKKDPPKG to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3150OGEOKKDPPKG(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3150OGEOKKDPPKGIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3150OGEOKKDPPKG_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_OGEOKKDPPKG = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150OGEOKKDPPKG() {
        unk3150OGEOKKDPPKG_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3150PAGPHEFOBBK_ = emptyIntList();
      private void ensureUnk3150PAGPHEFOBBKIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          unk3150PAGPHEFOBBK_ = mutableCopy(unk3150PAGPHEFOBBK_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 Unk3150_PAGPHEFOBBK = 8;</code>
       * @return A list containing the unk3150PAGPHEFOBBK.
       */
      public java.util.List<java.lang.Integer>
          getUnk3150PAGPHEFOBBKList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(unk3150PAGPHEFOBBK_) : unk3150PAGPHEFOBBK_;
      }
      /**
       * <code>repeated uint32 Unk3150_PAGPHEFOBBK = 8;</code>
       * @return The count of unk3150PAGPHEFOBBK.
       */
      public int getUnk3150PAGPHEFOBBKCount() {
        return unk3150PAGPHEFOBBK_.size();
      }
      /**
       * <code>repeated uint32 Unk3150_PAGPHEFOBBK = 8;</code>
       * @param index The index of the element to return.
       * @return The unk3150PAGPHEFOBBK at the given index.
       */
      public int getUnk3150PAGPHEFOBBK(int index) {
        return unk3150PAGPHEFOBBK_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3150_PAGPHEFOBBK = 8;</code>
       * @param index The index to set the value at.
       * @param value The unk3150PAGPHEFOBBK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150PAGPHEFOBBK(
          int index, int value) {
        ensureUnk3150PAGPHEFOBBKIsMutable();
        unk3150PAGPHEFOBBK_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_PAGPHEFOBBK = 8;</code>
       * @param value The unk3150PAGPHEFOBBK to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3150PAGPHEFOBBK(int value) {
        ensureUnk3150PAGPHEFOBBKIsMutable();
        unk3150PAGPHEFOBBK_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_PAGPHEFOBBK = 8;</code>
       * @param values The unk3150PAGPHEFOBBK to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3150PAGPHEFOBBK(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3150PAGPHEFOBBKIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3150PAGPHEFOBBK_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_PAGPHEFOBBK = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150PAGPHEFOBBK() {
        unk3150PAGPHEFOBBK_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:OpReboot)
    }

    // @@protoc_insertion_point(class_scope:OpReboot)
    private static final emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot();
    }

    public static emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpReboot>
        PARSER = new com.google.protobuf.AbstractParser<OpReboot>() {
      @java.lang.Override
      public OpReboot parsePartialFrom(
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

    public static com.google.protobuf.Parser<OpReboot> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpReboot> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.OpRebootOuterClass.OpReboot getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpReboot_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpReboot_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016OpReboot.proto\"D\n\010OpReboot\022\033\n\023Unk3150_" +
      "OGEOKKDPPKG\030\n \003(\r\022\033\n\023Unk3150_PAGPHEFOBBK" +
      "\030\010 \003(\rB\036\n\034emu.grasscutter.net.newprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OpReboot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpReboot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpReboot_descriptor,
        new java.lang.String[] { "Unk3150OGEOKKDPPKG", "Unk3150PAGPHEFOBBK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
