// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_ICABIPHHPKE.proto

package emu.grasscutter.net.newproto;

public final class Unk2700ICABIPHHPKE {
  private Unk2700ICABIPHHPKE() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_ICABIPHHPKEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_ICABIPHHPKE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk2700_GGNBBHMGLAN = 12;</code>
     * @return A list containing the unk2700GGNBBHMGLAN.
     */
    java.util.List<java.lang.Integer> getUnk2700GGNBBHMGLANList();
    /**
     * <code>repeated uint32 Unk2700_GGNBBHMGLAN = 12;</code>
     * @return The count of unk2700GGNBBHMGLAN.
     */
    int getUnk2700GGNBBHMGLANCount();
    /**
     * <code>repeated uint32 Unk2700_GGNBBHMGLAN = 12;</code>
     * @param index The index of the element to return.
     * @return The unk2700GGNBBHMGLAN at the given index.
     */
    int getUnk2700GGNBBHMGLAN(int index);

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 8300
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_ICABIPHHPKE}
   */
  public static final class Unk2700_ICABIPHHPKE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_ICABIPHHPKE)
      Unk2700_ICABIPHHPKEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_ICABIPHHPKE.newBuilder() to construct.
    private Unk2700_ICABIPHHPKE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_ICABIPHHPKE() {
      unk2700GGNBBHMGLAN_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_ICABIPHHPKE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.internal_static_Unk2700_ICABIPHHPKE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.internal_static_Unk2700_ICABIPHHPKE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE.class, emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE.Builder.class);
    }

    public static final int UNK2700_GGNBBHMGLAN_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList unk2700GGNBBHMGLAN_;
    /**
     * <code>repeated uint32 Unk2700_GGNBBHMGLAN = 12;</code>
     * @return A list containing the unk2700GGNBBHMGLAN.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk2700GGNBBHMGLANList() {
      return unk2700GGNBBHMGLAN_;
    }
    /**
     * <code>repeated uint32 Unk2700_GGNBBHMGLAN = 12;</code>
     * @return The count of unk2700GGNBBHMGLAN.
     */
    public int getUnk2700GGNBBHMGLANCount() {
      return unk2700GGNBBHMGLAN_.size();
    }
    /**
     * <code>repeated uint32 Unk2700_GGNBBHMGLAN = 12;</code>
     * @param index The index of the element to return.
     * @return The unk2700GGNBBHMGLAN at the given index.
     */
    public int getUnk2700GGNBBHMGLAN(int index) {
      return unk2700GGNBBHMGLAN_.getInt(index);
    }
    private int unk2700GGNBBHMGLANMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (getUnk2700GGNBBHMGLANList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(unk2700GGNBBHMGLANMemoizedSerializedSize);
      }
      for (int i = 0; i < unk2700GGNBBHMGLAN_.size(); i++) {
        output.writeUInt32NoTag(unk2700GGNBBHMGLAN_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk2700GGNBBHMGLAN_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk2700GGNBBHMGLAN_.getInt(i));
        }
        size += dataSize;
        if (!getUnk2700GGNBBHMGLANList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk2700GGNBBHMGLANMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE other = (emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE) obj;

      if (!getUnk2700GGNBBHMGLANList()
          .equals(other.getUnk2700GGNBBHMGLANList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getUnk2700GGNBBHMGLANCount() > 0) {
        hash = (37 * hash) + UNK2700_GGNBBHMGLAN_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700GGNBBHMGLANList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE prototype) {
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
     * CmdId: 8300
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_ICABIPHHPKE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_ICABIPHHPKE)
        emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.internal_static_Unk2700_ICABIPHHPKE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.internal_static_Unk2700_ICABIPHHPKE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE.class, emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk2700GGNBBHMGLAN_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.internal_static_Unk2700_ICABIPHHPKE_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE build() {
        emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE buildPartial() {
        emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE result = new emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk2700GGNBBHMGLAN_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk2700GGNBBHMGLAN_ = unk2700GGNBBHMGLAN_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE other) {
        if (other == emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE.getDefaultInstance()) return this;
        if (!other.unk2700GGNBBHMGLAN_.isEmpty()) {
          if (unk2700GGNBBHMGLAN_.isEmpty()) {
            unk2700GGNBBHMGLAN_ = other.unk2700GGNBBHMGLAN_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk2700GGNBBHMGLANIsMutable();
            unk2700GGNBBHMGLAN_.addAll(other.unk2700GGNBBHMGLAN_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
                retcode_ = input.readInt32();

                break;
              } // case 56
              case 96: {
                int v = input.readUInt32();
                ensureUnk2700GGNBBHMGLANIsMutable();
                unk2700GGNBBHMGLAN_.addInt(v);
                break;
              } // case 96
              case 98: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk2700GGNBBHMGLANIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk2700GGNBBHMGLAN_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 98
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

      private com.google.protobuf.Internal.IntList unk2700GGNBBHMGLAN_ = emptyIntList();
      private void ensureUnk2700GGNBBHMGLANIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700GGNBBHMGLAN_ = mutableCopy(unk2700GGNBBHMGLAN_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk2700_GGNBBHMGLAN = 12;</code>
       * @return A list containing the unk2700GGNBBHMGLAN.
       */
      public java.util.List<java.lang.Integer>
          getUnk2700GGNBBHMGLANList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk2700GGNBBHMGLAN_) : unk2700GGNBBHMGLAN_;
      }
      /**
       * <code>repeated uint32 Unk2700_GGNBBHMGLAN = 12;</code>
       * @return The count of unk2700GGNBBHMGLAN.
       */
      public int getUnk2700GGNBBHMGLANCount() {
        return unk2700GGNBBHMGLAN_.size();
      }
      /**
       * <code>repeated uint32 Unk2700_GGNBBHMGLAN = 12;</code>
       * @param index The index of the element to return.
       * @return The unk2700GGNBBHMGLAN at the given index.
       */
      public int getUnk2700GGNBBHMGLAN(int index) {
        return unk2700GGNBBHMGLAN_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk2700_GGNBBHMGLAN = 12;</code>
       * @param index The index to set the value at.
       * @param value The unk2700GGNBBHMGLAN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700GGNBBHMGLAN(
          int index, int value) {
        ensureUnk2700GGNBBHMGLANIsMutable();
        unk2700GGNBBHMGLAN_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_GGNBBHMGLAN = 12;</code>
       * @param value The unk2700GGNBBHMGLAN to add.
       * @return This builder for chaining.
       */
      public Builder addUnk2700GGNBBHMGLAN(int value) {
        ensureUnk2700GGNBBHMGLANIsMutable();
        unk2700GGNBBHMGLAN_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_GGNBBHMGLAN = 12;</code>
       * @param values The unk2700GGNBBHMGLAN to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk2700GGNBBHMGLAN(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk2700GGNBBHMGLANIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk2700GGNBBHMGLAN_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_GGNBBHMGLAN = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700GGNBBHMGLAN() {
        unk2700GGNBBHMGLAN_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_ICABIPHHPKE)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_ICABIPHHPKE)
    private static final emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE();
    }

    public static emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_ICABIPHHPKE>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_ICABIPHHPKE>() {
      @java.lang.Override
      public Unk2700_ICABIPHHPKE parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_ICABIPHHPKE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_ICABIPHHPKE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700ICABIPHHPKE.Unk2700_ICABIPHHPKE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_ICABIPHHPKE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_ICABIPHHPKE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_ICABIPHHPKE.proto\"C\n\023Unk2700_I" +
      "CABIPHHPKE\022\033\n\023Unk2700_GGNBBHMGLAN\030\014 \003(\r\022" +
      "\017\n\007retcode\030\007 \001(\005B\036\n\034emu.grasscutter.net." +
      "newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_ICABIPHHPKE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_ICABIPHHPKE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_ICABIPHHPKE_descriptor,
        new java.lang.String[] { "Unk2700GGNBBHMGLAN", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}