// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3100_ENNGOAOEIKE.proto

package emu.grasscutter.net.newproto;

public final class Unk3100ENNGOAOEIKE {
  private Unk3100ENNGOAOEIKE() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3100_ENNGOAOEIKEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3100_ENNGOAOEIKE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 5;</code>
     * @return A list containing the unk3100CKOJIKGDEPO.
     */
    java.util.List<java.lang.Integer> getUnk3100CKOJIKGDEPOList();
    /**
     * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 5;</code>
     * @return The count of unk3100CKOJIKGDEPO.
     */
    int getUnk3100CKOJIKGDEPOCount();
    /**
     * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 5;</code>
     * @param index The index of the element to return.
     * @return The unk3100CKOJIKGDEPO at the given index.
     */
    int getUnk3100CKOJIKGDEPO(int index);

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 Unk3100_HGKBAEHFMKI = 8;</code>
     * @return The unk3100HGKBAEHFMKI.
     */
    int getUnk3100HGKBAEHFMKI();
  }
  /**
   * <pre>
   * CmdId: 23298
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3100_ENNGOAOEIKE}
   */
  public static final class Unk3100_ENNGOAOEIKE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3100_ENNGOAOEIKE)
      Unk3100_ENNGOAOEIKEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3100_ENNGOAOEIKE.newBuilder() to construct.
    private Unk3100_ENNGOAOEIKE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3100_ENNGOAOEIKE() {
      unk3100CKOJIKGDEPO_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3100_ENNGOAOEIKE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.internal_static_Unk3100_ENNGOAOEIKE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.internal_static_Unk3100_ENNGOAOEIKE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE.class, emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE.Builder.class);
    }

    public static final int UNK3100_CKOJIKGDEPO_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList unk3100CKOJIKGDEPO_;
    /**
     * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 5;</code>
     * @return A list containing the unk3100CKOJIKGDEPO.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3100CKOJIKGDEPOList() {
      return unk3100CKOJIKGDEPO_;
    }
    /**
     * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 5;</code>
     * @return The count of unk3100CKOJIKGDEPO.
     */
    public int getUnk3100CKOJIKGDEPOCount() {
      return unk3100CKOJIKGDEPO_.size();
    }
    /**
     * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 5;</code>
     * @param index The index of the element to return.
     * @return The unk3100CKOJIKGDEPO at the given index.
     */
    public int getUnk3100CKOJIKGDEPO(int index) {
      return unk3100CKOJIKGDEPO_.getInt(index);
    }
    private int unk3100CKOJIKGDEPOMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UNK3100_HGKBAEHFMKI_FIELD_NUMBER = 8;
    private int unk3100HGKBAEHFMKI_;
    /**
     * <code>uint32 Unk3100_HGKBAEHFMKI = 8;</code>
     * @return The unk3100HGKBAEHFMKI.
     */
    @java.lang.Override
    public int getUnk3100HGKBAEHFMKI() {
      return unk3100HGKBAEHFMKI_;
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
      if (getUnk3100CKOJIKGDEPOList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(unk3100CKOJIKGDEPOMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3100CKOJIKGDEPO_.size(); i++) {
        output.writeUInt32NoTag(unk3100CKOJIKGDEPO_.getInt(i));
      }
      if (unk3100HGKBAEHFMKI_ != 0) {
        output.writeUInt32(8, unk3100HGKBAEHFMKI_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
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
        for (int i = 0; i < unk3100CKOJIKGDEPO_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3100CKOJIKGDEPO_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3100CKOJIKGDEPOList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3100CKOJIKGDEPOMemoizedSerializedSize = dataSize;
      }
      if (unk3100HGKBAEHFMKI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3100HGKBAEHFMKI_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE other = (emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE) obj;

      if (!getUnk3100CKOJIKGDEPOList()
          .equals(other.getUnk3100CKOJIKGDEPOList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getUnk3100HGKBAEHFMKI()
          != other.getUnk3100HGKBAEHFMKI()) return false;
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
      if (getUnk3100CKOJIKGDEPOCount() > 0) {
        hash = (37 * hash) + UNK3100_CKOJIKGDEPO_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3100CKOJIKGDEPOList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + UNK3100_HGKBAEHFMKI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3100HGKBAEHFMKI();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE prototype) {
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
     * CmdId: 23298
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3100_ENNGOAOEIKE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3100_ENNGOAOEIKE)
        emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.internal_static_Unk3100_ENNGOAOEIKE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.internal_static_Unk3100_ENNGOAOEIKE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE.class, emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3100CKOJIKGDEPO_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        unk3100HGKBAEHFMKI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.internal_static_Unk3100_ENNGOAOEIKE_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE build() {
        emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE buildPartial() {
        emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE result = new emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3100CKOJIKGDEPO_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3100CKOJIKGDEPO_ = unk3100CKOJIKGDEPO_;
        result.retcode_ = retcode_;
        result.unk3100HGKBAEHFMKI_ = unk3100HGKBAEHFMKI_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE other) {
        if (other == emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE.getDefaultInstance()) return this;
        if (!other.unk3100CKOJIKGDEPO_.isEmpty()) {
          if (unk3100CKOJIKGDEPO_.isEmpty()) {
            unk3100CKOJIKGDEPO_ = other.unk3100CKOJIKGDEPO_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3100CKOJIKGDEPOIsMutable();
            unk3100CKOJIKGDEPO_.addAll(other.unk3100CKOJIKGDEPO_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getUnk3100HGKBAEHFMKI() != 0) {
          setUnk3100HGKBAEHFMKI(other.getUnk3100HGKBAEHFMKI());
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
                int v = input.readUInt32();
                ensureUnk3100CKOJIKGDEPOIsMutable();
                unk3100CKOJIKGDEPO_.addInt(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3100CKOJIKGDEPOIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3100CKOJIKGDEPO_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 42
              case 64: {
                unk3100HGKBAEHFMKI_ = input.readUInt32();

                break;
              } // case 64
              case 120: {
                retcode_ = input.readInt32();

                break;
              } // case 120
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

      private com.google.protobuf.Internal.IntList unk3100CKOJIKGDEPO_ = emptyIntList();
      private void ensureUnk3100CKOJIKGDEPOIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3100CKOJIKGDEPO_ = mutableCopy(unk3100CKOJIKGDEPO_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 5;</code>
       * @return A list containing the unk3100CKOJIKGDEPO.
       */
      public java.util.List<java.lang.Integer>
          getUnk3100CKOJIKGDEPOList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3100CKOJIKGDEPO_) : unk3100CKOJIKGDEPO_;
      }
      /**
       * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 5;</code>
       * @return The count of unk3100CKOJIKGDEPO.
       */
      public int getUnk3100CKOJIKGDEPOCount() {
        return unk3100CKOJIKGDEPO_.size();
      }
      /**
       * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 5;</code>
       * @param index The index of the element to return.
       * @return The unk3100CKOJIKGDEPO at the given index.
       */
      public int getUnk3100CKOJIKGDEPO(int index) {
        return unk3100CKOJIKGDEPO_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 5;</code>
       * @param index The index to set the value at.
       * @param value The unk3100CKOJIKGDEPO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3100CKOJIKGDEPO(
          int index, int value) {
        ensureUnk3100CKOJIKGDEPOIsMutable();
        unk3100CKOJIKGDEPO_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 5;</code>
       * @param value The unk3100CKOJIKGDEPO to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3100CKOJIKGDEPO(int value) {
        ensureUnk3100CKOJIKGDEPOIsMutable();
        unk3100CKOJIKGDEPO_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 5;</code>
       * @param values The unk3100CKOJIKGDEPO to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3100CKOJIKGDEPO(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3100CKOJIKGDEPOIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3100CKOJIKGDEPO_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3100_CKOJIKGDEPO = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3100CKOJIKGDEPO() {
        unk3100CKOJIKGDEPO_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int unk3100HGKBAEHFMKI_ ;
      /**
       * <code>uint32 Unk3100_HGKBAEHFMKI = 8;</code>
       * @return The unk3100HGKBAEHFMKI.
       */
      @java.lang.Override
      public int getUnk3100HGKBAEHFMKI() {
        return unk3100HGKBAEHFMKI_;
      }
      /**
       * <code>uint32 Unk3100_HGKBAEHFMKI = 8;</code>
       * @param value The unk3100HGKBAEHFMKI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3100HGKBAEHFMKI(int value) {
        
        unk3100HGKBAEHFMKI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3100_HGKBAEHFMKI = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3100HGKBAEHFMKI() {
        
        unk3100HGKBAEHFMKI_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3100_ENNGOAOEIKE)
    }

    // @@protoc_insertion_point(class_scope:Unk3100_ENNGOAOEIKE)
    private static final emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE();
    }

    public static emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3100_ENNGOAOEIKE>
        PARSER = new com.google.protobuf.AbstractParser<Unk3100_ENNGOAOEIKE>() {
      @java.lang.Override
      public Unk3100_ENNGOAOEIKE parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3100_ENNGOAOEIKE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3100_ENNGOAOEIKE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3100ENNGOAOEIKE.Unk3100_ENNGOAOEIKE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3100_ENNGOAOEIKE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3100_ENNGOAOEIKE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3100_ENNGOAOEIKE.proto\"`\n\023Unk3100_E" +
      "NNGOAOEIKE\022\033\n\023Unk3100_CKOJIKGDEPO\030\005 \003(\r\022" +
      "\017\n\007retcode\030\017 \001(\005\022\033\n\023Unk3100_HGKBAEHFMKI\030" +
      "\010 \001(\rB\036\n\034emu.grasscutter.net.newprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3100_ENNGOAOEIKE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3100_ENNGOAOEIKE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3100_ENNGOAOEIKE_descriptor,
        new java.lang.String[] { "Unk3100CKOJIKGDEPO", "Retcode", "Unk3100HGKBAEHFMKI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
