// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_ODLGFAOGKEK.proto

package emu.grasscutter.net.newproto;

public final class Unk3150ODLGFAOGKEK {
  private Unk3150ODLGFAOGKEK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_ODLGFAOGKEKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_ODLGFAOGKEK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 13;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    int getUnk3250PPIHJFNMEFB();

    /**
     * <code>repeated uint32 Unk3150_LGEPLGELEMD = 8;</code>
     * @return A list containing the unk3150LGEPLGELEMD.
     */
    java.util.List<java.lang.Integer> getUnk3150LGEPLGELEMDList();
    /**
     * <code>repeated uint32 Unk3150_LGEPLGELEMD = 8;</code>
     * @return The count of unk3150LGEPLGELEMD.
     */
    int getUnk3150LGEPLGELEMDCount();
    /**
     * <code>repeated uint32 Unk3150_LGEPLGELEMD = 8;</code>
     * @param index The index of the element to return.
     * @return The unk3150LGEPLGELEMD at the given index.
     */
    int getUnk3150LGEPLGELEMD(int index);
  }
  /**
   * <pre>
   * CmdId: 7663
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_ODLGFAOGKEK}
   */
  public static final class Unk3150_ODLGFAOGKEK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_ODLGFAOGKEK)
      Unk3150_ODLGFAOGKEKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_ODLGFAOGKEK.newBuilder() to construct.
    private Unk3150_ODLGFAOGKEK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_ODLGFAOGKEK() {
      unk3150LGEPLGELEMD_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_ODLGFAOGKEK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.internal_static_Unk3150_ODLGFAOGKEK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.internal_static_Unk3150_ODLGFAOGKEK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK.class, emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK.Builder.class);
    }

    public static final int UNK3250_PPIHJFNMEFB_FIELD_NUMBER = 13;
    private int unk3250PPIHJFNMEFB_;
    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 13;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    @java.lang.Override
    public int getUnk3250PPIHJFNMEFB() {
      return unk3250PPIHJFNMEFB_;
    }

    public static final int UNK3150_LGEPLGELEMD_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList unk3150LGEPLGELEMD_;
    /**
     * <code>repeated uint32 Unk3150_LGEPLGELEMD = 8;</code>
     * @return A list containing the unk3150LGEPLGELEMD.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3150LGEPLGELEMDList() {
      return unk3150LGEPLGELEMD_;
    }
    /**
     * <code>repeated uint32 Unk3150_LGEPLGELEMD = 8;</code>
     * @return The count of unk3150LGEPLGELEMD.
     */
    public int getUnk3150LGEPLGELEMDCount() {
      return unk3150LGEPLGELEMD_.size();
    }
    /**
     * <code>repeated uint32 Unk3150_LGEPLGELEMD = 8;</code>
     * @param index The index of the element to return.
     * @return The unk3150LGEPLGELEMD at the given index.
     */
    public int getUnk3150LGEPLGELEMD(int index) {
      return unk3150LGEPLGELEMD_.getInt(index);
    }
    private int unk3150LGEPLGELEMDMemoizedSerializedSize = -1;

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
      if (getUnk3150LGEPLGELEMDList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(unk3150LGEPLGELEMDMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3150LGEPLGELEMD_.size(); i++) {
        output.writeUInt32NoTag(unk3150LGEPLGELEMD_.getInt(i));
      }
      if (unk3250PPIHJFNMEFB_ != 0) {
        output.writeUInt32(13, unk3250PPIHJFNMEFB_);
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
        for (int i = 0; i < unk3150LGEPLGELEMD_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3150LGEPLGELEMD_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3150LGEPLGELEMDList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3150LGEPLGELEMDMemoizedSerializedSize = dataSize;
      }
      if (unk3250PPIHJFNMEFB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3250PPIHJFNMEFB_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK other = (emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK) obj;

      if (getUnk3250PPIHJFNMEFB()
          != other.getUnk3250PPIHJFNMEFB()) return false;
      if (!getUnk3150LGEPLGELEMDList()
          .equals(other.getUnk3150LGEPLGELEMDList())) return false;
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
      hash = (37 * hash) + UNK3250_PPIHJFNMEFB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250PPIHJFNMEFB();
      if (getUnk3150LGEPLGELEMDCount() > 0) {
        hash = (37 * hash) + UNK3150_LGEPLGELEMD_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3150LGEPLGELEMDList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK prototype) {
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
     * CmdId: 7663
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_ODLGFAOGKEK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_ODLGFAOGKEK)
        emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.internal_static_Unk3150_ODLGFAOGKEK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.internal_static_Unk3150_ODLGFAOGKEK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK.class, emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250PPIHJFNMEFB_ = 0;

        unk3150LGEPLGELEMD_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.internal_static_Unk3150_ODLGFAOGKEK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK build() {
        emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK buildPartial() {
        emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK result = new emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK(this);
        int from_bitField0_ = bitField0_;
        result.unk3250PPIHJFNMEFB_ = unk3250PPIHJFNMEFB_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3150LGEPLGELEMD_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3150LGEPLGELEMD_ = unk3150LGEPLGELEMD_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK other) {
        if (other == emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK.getDefaultInstance()) return this;
        if (other.getUnk3250PPIHJFNMEFB() != 0) {
          setUnk3250PPIHJFNMEFB(other.getUnk3250PPIHJFNMEFB());
        }
        if (!other.unk3150LGEPLGELEMD_.isEmpty()) {
          if (unk3150LGEPLGELEMD_.isEmpty()) {
            unk3150LGEPLGELEMD_ = other.unk3150LGEPLGELEMD_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3150LGEPLGELEMDIsMutable();
            unk3150LGEPLGELEMD_.addAll(other.unk3150LGEPLGELEMD_);
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
                ensureUnk3150LGEPLGELEMDIsMutable();
                unk3150LGEPLGELEMD_.addInt(v);
                break;
              } // case 64
              case 66: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3150LGEPLGELEMDIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3150LGEPLGELEMD_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 66
              case 104: {
                unk3250PPIHJFNMEFB_ = input.readUInt32();

                break;
              } // case 104
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

      private int unk3250PPIHJFNMEFB_ ;
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 13;</code>
       * @return The unk3250PPIHJFNMEFB.
       */
      @java.lang.Override
      public int getUnk3250PPIHJFNMEFB() {
        return unk3250PPIHJFNMEFB_;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 13;</code>
       * @param value The unk3250PPIHJFNMEFB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250PPIHJFNMEFB(int value) {
        
        unk3250PPIHJFNMEFB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250PPIHJFNMEFB() {
        
        unk3250PPIHJFNMEFB_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3150LGEPLGELEMD_ = emptyIntList();
      private void ensureUnk3150LGEPLGELEMDIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3150LGEPLGELEMD_ = mutableCopy(unk3150LGEPLGELEMD_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3150_LGEPLGELEMD = 8;</code>
       * @return A list containing the unk3150LGEPLGELEMD.
       */
      public java.util.List<java.lang.Integer>
          getUnk3150LGEPLGELEMDList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3150LGEPLGELEMD_) : unk3150LGEPLGELEMD_;
      }
      /**
       * <code>repeated uint32 Unk3150_LGEPLGELEMD = 8;</code>
       * @return The count of unk3150LGEPLGELEMD.
       */
      public int getUnk3150LGEPLGELEMDCount() {
        return unk3150LGEPLGELEMD_.size();
      }
      /**
       * <code>repeated uint32 Unk3150_LGEPLGELEMD = 8;</code>
       * @param index The index of the element to return.
       * @return The unk3150LGEPLGELEMD at the given index.
       */
      public int getUnk3150LGEPLGELEMD(int index) {
        return unk3150LGEPLGELEMD_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3150_LGEPLGELEMD = 8;</code>
       * @param index The index to set the value at.
       * @param value The unk3150LGEPLGELEMD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150LGEPLGELEMD(
          int index, int value) {
        ensureUnk3150LGEPLGELEMDIsMutable();
        unk3150LGEPLGELEMD_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_LGEPLGELEMD = 8;</code>
       * @param value The unk3150LGEPLGELEMD to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3150LGEPLGELEMD(int value) {
        ensureUnk3150LGEPLGELEMDIsMutable();
        unk3150LGEPLGELEMD_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_LGEPLGELEMD = 8;</code>
       * @param values The unk3150LGEPLGELEMD to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3150LGEPLGELEMD(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3150LGEPLGELEMDIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3150LGEPLGELEMD_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_LGEPLGELEMD = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150LGEPLGELEMD() {
        unk3150LGEPLGELEMD_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:Unk3150_ODLGFAOGKEK)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_ODLGFAOGKEK)
    private static final emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK();
    }

    public static emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_ODLGFAOGKEK>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_ODLGFAOGKEK>() {
      @java.lang.Override
      public Unk3150_ODLGFAOGKEK parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_ODLGFAOGKEK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_ODLGFAOGKEK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150ODLGFAOGKEK.Unk3150_ODLGFAOGKEK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_ODLGFAOGKEK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_ODLGFAOGKEK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_ODLGFAOGKEK.proto\"O\n\023Unk3150_O" +
      "DLGFAOGKEK\022\033\n\023Unk3250_PPIHJFNMEFB\030\r \001(\r\022" +
      "\033\n\023Unk3150_LGEPLGELEMD\030\010 \003(\rB\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_ODLGFAOGKEK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_ODLGFAOGKEK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_ODLGFAOGKEK_descriptor,
        new java.lang.String[] { "Unk3250PPIHJFNMEFB", "Unk3150LGEPLGELEMD", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
