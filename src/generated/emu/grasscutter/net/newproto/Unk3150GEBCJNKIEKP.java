// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_GEBCJNKIEKP.proto

package emu.grasscutter.net.newproto;

public final class Unk3150GEBCJNKIEKP {
  private Unk3150GEBCJNKIEKP() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_GEBCJNKIEKPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_GEBCJNKIEKP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3150_PKHCJGLMPDC = 7;</code>
     * @return A list containing the unk3150PKHCJGLMPDC.
     */
    java.util.List<java.lang.Integer> getUnk3150PKHCJGLMPDCList();
    /**
     * <code>repeated uint32 Unk3150_PKHCJGLMPDC = 7;</code>
     * @return The count of unk3150PKHCJGLMPDC.
     */
    int getUnk3150PKHCJGLMPDCCount();
    /**
     * <code>repeated uint32 Unk3150_PKHCJGLMPDC = 7;</code>
     * @param index The index of the element to return.
     * @return The unk3150PKHCJGLMPDC at the given index.
     */
    int getUnk3150PKHCJGLMPDC(int index);
  }
  /**
   * <pre>
   * CmdId: 7587
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_GEBCJNKIEKP}
   */
  public static final class Unk3150_GEBCJNKIEKP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_GEBCJNKIEKP)
      Unk3150_GEBCJNKIEKPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_GEBCJNKIEKP.newBuilder() to construct.
    private Unk3150_GEBCJNKIEKP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_GEBCJNKIEKP() {
      unk3150PKHCJGLMPDC_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_GEBCJNKIEKP();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.internal_static_Unk3150_GEBCJNKIEKP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.internal_static_Unk3150_GEBCJNKIEKP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP.class, emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP.Builder.class);
    }

    public static final int UNK3150_PKHCJGLMPDC_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList unk3150PKHCJGLMPDC_;
    /**
     * <code>repeated uint32 Unk3150_PKHCJGLMPDC = 7;</code>
     * @return A list containing the unk3150PKHCJGLMPDC.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3150PKHCJGLMPDCList() {
      return unk3150PKHCJGLMPDC_;
    }
    /**
     * <code>repeated uint32 Unk3150_PKHCJGLMPDC = 7;</code>
     * @return The count of unk3150PKHCJGLMPDC.
     */
    public int getUnk3150PKHCJGLMPDCCount() {
      return unk3150PKHCJGLMPDC_.size();
    }
    /**
     * <code>repeated uint32 Unk3150_PKHCJGLMPDC = 7;</code>
     * @param index The index of the element to return.
     * @return The unk3150PKHCJGLMPDC at the given index.
     */
    public int getUnk3150PKHCJGLMPDC(int index) {
      return unk3150PKHCJGLMPDC_.getInt(index);
    }
    private int unk3150PKHCJGLMPDCMemoizedSerializedSize = -1;

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
      if (getUnk3150PKHCJGLMPDCList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(unk3150PKHCJGLMPDCMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3150PKHCJGLMPDC_.size(); i++) {
        output.writeUInt32NoTag(unk3150PKHCJGLMPDC_.getInt(i));
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
        for (int i = 0; i < unk3150PKHCJGLMPDC_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3150PKHCJGLMPDC_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3150PKHCJGLMPDCList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3150PKHCJGLMPDCMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP other = (emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP) obj;

      if (!getUnk3150PKHCJGLMPDCList()
          .equals(other.getUnk3150PKHCJGLMPDCList())) return false;
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
      if (getUnk3150PKHCJGLMPDCCount() > 0) {
        hash = (37 * hash) + UNK3150_PKHCJGLMPDC_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3150PKHCJGLMPDCList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP prototype) {
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
     * CmdId: 7587
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_GEBCJNKIEKP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_GEBCJNKIEKP)
        emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.internal_static_Unk3150_GEBCJNKIEKP_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.internal_static_Unk3150_GEBCJNKIEKP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP.class, emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3150PKHCJGLMPDC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.internal_static_Unk3150_GEBCJNKIEKP_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP build() {
        emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP buildPartial() {
        emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP result = new emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3150PKHCJGLMPDC_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3150PKHCJGLMPDC_ = unk3150PKHCJGLMPDC_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP other) {
        if (other == emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP.getDefaultInstance()) return this;
        if (!other.unk3150PKHCJGLMPDC_.isEmpty()) {
          if (unk3150PKHCJGLMPDC_.isEmpty()) {
            unk3150PKHCJGLMPDC_ = other.unk3150PKHCJGLMPDC_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3150PKHCJGLMPDCIsMutable();
            unk3150PKHCJGLMPDC_.addAll(other.unk3150PKHCJGLMPDC_);
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
                int v = input.readUInt32();
                ensureUnk3150PKHCJGLMPDCIsMutable();
                unk3150PKHCJGLMPDC_.addInt(v);
                break;
              } // case 56
              case 58: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3150PKHCJGLMPDCIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3150PKHCJGLMPDC_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 58
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

      private com.google.protobuf.Internal.IntList unk3150PKHCJGLMPDC_ = emptyIntList();
      private void ensureUnk3150PKHCJGLMPDCIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3150PKHCJGLMPDC_ = mutableCopy(unk3150PKHCJGLMPDC_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3150_PKHCJGLMPDC = 7;</code>
       * @return A list containing the unk3150PKHCJGLMPDC.
       */
      public java.util.List<java.lang.Integer>
          getUnk3150PKHCJGLMPDCList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3150PKHCJGLMPDC_) : unk3150PKHCJGLMPDC_;
      }
      /**
       * <code>repeated uint32 Unk3150_PKHCJGLMPDC = 7;</code>
       * @return The count of unk3150PKHCJGLMPDC.
       */
      public int getUnk3150PKHCJGLMPDCCount() {
        return unk3150PKHCJGLMPDC_.size();
      }
      /**
       * <code>repeated uint32 Unk3150_PKHCJGLMPDC = 7;</code>
       * @param index The index of the element to return.
       * @return The unk3150PKHCJGLMPDC at the given index.
       */
      public int getUnk3150PKHCJGLMPDC(int index) {
        return unk3150PKHCJGLMPDC_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3150_PKHCJGLMPDC = 7;</code>
       * @param index The index to set the value at.
       * @param value The unk3150PKHCJGLMPDC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150PKHCJGLMPDC(
          int index, int value) {
        ensureUnk3150PKHCJGLMPDCIsMutable();
        unk3150PKHCJGLMPDC_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_PKHCJGLMPDC = 7;</code>
       * @param value The unk3150PKHCJGLMPDC to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3150PKHCJGLMPDC(int value) {
        ensureUnk3150PKHCJGLMPDCIsMutable();
        unk3150PKHCJGLMPDC_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_PKHCJGLMPDC = 7;</code>
       * @param values The unk3150PKHCJGLMPDC to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3150PKHCJGLMPDC(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3150PKHCJGLMPDCIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3150PKHCJGLMPDC_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_PKHCJGLMPDC = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150PKHCJGLMPDC() {
        unk3150PKHCJGLMPDC_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:Unk3150_GEBCJNKIEKP)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_GEBCJNKIEKP)
    private static final emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP();
    }

    public static emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_GEBCJNKIEKP>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_GEBCJNKIEKP>() {
      @java.lang.Override
      public Unk3150_GEBCJNKIEKP parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_GEBCJNKIEKP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_GEBCJNKIEKP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150GEBCJNKIEKP.Unk3150_GEBCJNKIEKP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_GEBCJNKIEKP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_GEBCJNKIEKP_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_GEBCJNKIEKP.proto\"2\n\023Unk3150_G" +
      "EBCJNKIEKP\022\033\n\023Unk3150_PKHCJGLMPDC\030\007 \003(\rB" +
      "\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_GEBCJNKIEKP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_GEBCJNKIEKP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_GEBCJNKIEKP_descriptor,
        new java.lang.String[] { "Unk3150PKHCJGLMPDC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
