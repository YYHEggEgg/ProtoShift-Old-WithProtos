// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3100_OGIPKMEFMDI.proto

package emu.grasscutter.net.newproto;

public final class Unk3100OGIPKMEFMDI {
  private Unk3100OGIPKMEFMDI() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3100_OGIPKMEFMDIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3100_OGIPKMEFMDI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_ADJKIIJFNME = 3;</code>
     * @return The unk3250ADJKIIJFNME.
     */
    int getUnk3250ADJKIIJFNME();

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 Unk3250_LCCNEKGONFG = 6;</code>
     * @return The unk3250LCCNEKGONFG.
     */
    int getUnk3250LCCNEKGONFG();

    /**
     * <code>uint32 Unk3100_IFHHJEFBLNI = 2;</code>
     * @return The unk3100IFHHJEFBLNI.
     */
    int getUnk3100IFHHJEFBLNI();
  }
  /**
   * <pre>
   * CmdId: 22332
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3100_OGIPKMEFMDI}
   */
  public static final class Unk3100_OGIPKMEFMDI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3100_OGIPKMEFMDI)
      Unk3100_OGIPKMEFMDIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3100_OGIPKMEFMDI.newBuilder() to construct.
    private Unk3100_OGIPKMEFMDI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3100_OGIPKMEFMDI() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3100_OGIPKMEFMDI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.internal_static_Unk3100_OGIPKMEFMDI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.internal_static_Unk3100_OGIPKMEFMDI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI.class, emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI.Builder.class);
    }

    public static final int UNK3250_ADJKIIJFNME_FIELD_NUMBER = 3;
    private int unk3250ADJKIIJFNME_;
    /**
     * <code>uint32 Unk3250_ADJKIIJFNME = 3;</code>
     * @return The unk3250ADJKIIJFNME.
     */
    @java.lang.Override
    public int getUnk3250ADJKIIJFNME() {
      return unk3250ADJKIIJFNME_;
    }

    public static final int RETCODE_FIELD_NUMBER = 13;
    private int retcode_;
    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UNK3250_LCCNEKGONFG_FIELD_NUMBER = 6;
    private int unk3250LCCNEKGONFG_;
    /**
     * <code>uint32 Unk3250_LCCNEKGONFG = 6;</code>
     * @return The unk3250LCCNEKGONFG.
     */
    @java.lang.Override
    public int getUnk3250LCCNEKGONFG() {
      return unk3250LCCNEKGONFG_;
    }

    public static final int UNK3100_IFHHJEFBLNI_FIELD_NUMBER = 2;
    private int unk3100IFHHJEFBLNI_;
    /**
     * <code>uint32 Unk3100_IFHHJEFBLNI = 2;</code>
     * @return The unk3100IFHHJEFBLNI.
     */
    @java.lang.Override
    public int getUnk3100IFHHJEFBLNI() {
      return unk3100IFHHJEFBLNI_;
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
      if (unk3100IFHHJEFBLNI_ != 0) {
        output.writeUInt32(2, unk3100IFHHJEFBLNI_);
      }
      if (unk3250ADJKIIJFNME_ != 0) {
        output.writeUInt32(3, unk3250ADJKIIJFNME_);
      }
      if (unk3250LCCNEKGONFG_ != 0) {
        output.writeUInt32(6, unk3250LCCNEKGONFG_);
      }
      if (retcode_ != 0) {
        output.writeInt32(13, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3100IFHHJEFBLNI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk3100IFHHJEFBLNI_);
      }
      if (unk3250ADJKIIJFNME_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, unk3250ADJKIIJFNME_);
      }
      if (unk3250LCCNEKGONFG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk3250LCCNEKGONFG_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI other = (emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI) obj;

      if (getUnk3250ADJKIIJFNME()
          != other.getUnk3250ADJKIIJFNME()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getUnk3250LCCNEKGONFG()
          != other.getUnk3250LCCNEKGONFG()) return false;
      if (getUnk3100IFHHJEFBLNI()
          != other.getUnk3100IFHHJEFBLNI()) return false;
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
      hash = (37 * hash) + UNK3250_ADJKIIJFNME_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250ADJKIIJFNME();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + UNK3250_LCCNEKGONFG_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250LCCNEKGONFG();
      hash = (37 * hash) + UNK3100_IFHHJEFBLNI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3100IFHHJEFBLNI();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI prototype) {
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
     * CmdId: 22332
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3100_OGIPKMEFMDI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3100_OGIPKMEFMDI)
        emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.internal_static_Unk3100_OGIPKMEFMDI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.internal_static_Unk3100_OGIPKMEFMDI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI.class, emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250ADJKIIJFNME_ = 0;

        retcode_ = 0;

        unk3250LCCNEKGONFG_ = 0;

        unk3100IFHHJEFBLNI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.internal_static_Unk3100_OGIPKMEFMDI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI build() {
        emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI buildPartial() {
        emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI result = new emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI(this);
        result.unk3250ADJKIIJFNME_ = unk3250ADJKIIJFNME_;
        result.retcode_ = retcode_;
        result.unk3250LCCNEKGONFG_ = unk3250LCCNEKGONFG_;
        result.unk3100IFHHJEFBLNI_ = unk3100IFHHJEFBLNI_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI other) {
        if (other == emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI.getDefaultInstance()) return this;
        if (other.getUnk3250ADJKIIJFNME() != 0) {
          setUnk3250ADJKIIJFNME(other.getUnk3250ADJKIIJFNME());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getUnk3250LCCNEKGONFG() != 0) {
          setUnk3250LCCNEKGONFG(other.getUnk3250LCCNEKGONFG());
        }
        if (other.getUnk3100IFHHJEFBLNI() != 0) {
          setUnk3100IFHHJEFBLNI(other.getUnk3100IFHHJEFBLNI());
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
                unk3100IFHHJEFBLNI_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                unk3250ADJKIIJFNME_ = input.readUInt32();

                break;
              } // case 24
              case 48: {
                unk3250LCCNEKGONFG_ = input.readUInt32();

                break;
              } // case 48
              case 104: {
                retcode_ = input.readInt32();

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

      private int unk3250ADJKIIJFNME_ ;
      /**
       * <code>uint32 Unk3250_ADJKIIJFNME = 3;</code>
       * @return The unk3250ADJKIIJFNME.
       */
      @java.lang.Override
      public int getUnk3250ADJKIIJFNME() {
        return unk3250ADJKIIJFNME_;
      }
      /**
       * <code>uint32 Unk3250_ADJKIIJFNME = 3;</code>
       * @param value The unk3250ADJKIIJFNME to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250ADJKIIJFNME(int value) {
        
        unk3250ADJKIIJFNME_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_ADJKIIJFNME = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250ADJKIIJFNME() {
        
        unk3250ADJKIIJFNME_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 13;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int unk3250LCCNEKGONFG_ ;
      /**
       * <code>uint32 Unk3250_LCCNEKGONFG = 6;</code>
       * @return The unk3250LCCNEKGONFG.
       */
      @java.lang.Override
      public int getUnk3250LCCNEKGONFG() {
        return unk3250LCCNEKGONFG_;
      }
      /**
       * <code>uint32 Unk3250_LCCNEKGONFG = 6;</code>
       * @param value The unk3250LCCNEKGONFG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250LCCNEKGONFG(int value) {
        
        unk3250LCCNEKGONFG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_LCCNEKGONFG = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250LCCNEKGONFG() {
        
        unk3250LCCNEKGONFG_ = 0;
        onChanged();
        return this;
      }

      private int unk3100IFHHJEFBLNI_ ;
      /**
       * <code>uint32 Unk3100_IFHHJEFBLNI = 2;</code>
       * @return The unk3100IFHHJEFBLNI.
       */
      @java.lang.Override
      public int getUnk3100IFHHJEFBLNI() {
        return unk3100IFHHJEFBLNI_;
      }
      /**
       * <code>uint32 Unk3100_IFHHJEFBLNI = 2;</code>
       * @param value The unk3100IFHHJEFBLNI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3100IFHHJEFBLNI(int value) {
        
        unk3100IFHHJEFBLNI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3100_IFHHJEFBLNI = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3100IFHHJEFBLNI() {
        
        unk3100IFHHJEFBLNI_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3100_OGIPKMEFMDI)
    }

    // @@protoc_insertion_point(class_scope:Unk3100_OGIPKMEFMDI)
    private static final emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI();
    }

    public static emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3100_OGIPKMEFMDI>
        PARSER = new com.google.protobuf.AbstractParser<Unk3100_OGIPKMEFMDI>() {
      @java.lang.Override
      public Unk3100_OGIPKMEFMDI parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3100_OGIPKMEFMDI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3100_OGIPKMEFMDI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3100OGIPKMEFMDI.Unk3100_OGIPKMEFMDI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3100_OGIPKMEFMDI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3100_OGIPKMEFMDI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3100_OGIPKMEFMDI.proto\"}\n\023Unk3100_O" +
      "GIPKMEFMDI\022\033\n\023Unk3250_ADJKIIJFNME\030\003 \001(\r\022" +
      "\017\n\007retcode\030\r \001(\005\022\033\n\023Unk3250_LCCNEKGONFG\030" +
      "\006 \001(\r\022\033\n\023Unk3100_IFHHJEFBLNI\030\002 \001(\rB\036\n\034em" +
      "u.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3100_OGIPKMEFMDI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3100_OGIPKMEFMDI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3100_OGIPKMEFMDI_descriptor,
        new java.lang.String[] { "Unk3250ADJKIIJFNME", "Retcode", "Unk3250LCCNEKGONFG", "Unk3100IFHHJEFBLNI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
