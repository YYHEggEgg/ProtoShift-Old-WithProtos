// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_DLCDJPKNGBD.proto

package emu.grasscutter.net.newproto;

public final class Unk3000DLCDJPKNGBD {
  private Unk3000DLCDJPKNGBD() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_DLCDJPKNGBDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_DLCDJPKNGBD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_BGHFBCLHCIG = 3;</code>
     * @return The unk3250BGHFBCLHCIG.
     */
    int getUnk3250BGHFBCLHCIG();

    /**
     * <code>uint32 Unk3250_PPDDLODBIKG = 9;</code>
     * @return The unk3250PPDDLODBIKG.
     */
    int getUnk3250PPDDLODBIKG();

    /**
     * <code>bool Unk3000_FGIJKFANKEI = 5;</code>
     * @return The unk3000FGIJKFANKEI.
     */
    boolean getUnk3000FGIJKFANKEI();

    /**
     * <code>uint32 Unk3250_FEGPHHFLFLM = 10;</code>
     * @return The unk3250FEGPHHFLFLM.
     */
    int getUnk3250FEGPHHFLFLM();
  }
  /**
   * <pre>
   * CmdId: 172
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_DLCDJPKNGBD}
   */
  public static final class Unk3000_DLCDJPKNGBD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_DLCDJPKNGBD)
      Unk3000_DLCDJPKNGBDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_DLCDJPKNGBD.newBuilder() to construct.
    private Unk3000_DLCDJPKNGBD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_DLCDJPKNGBD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_DLCDJPKNGBD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.internal_static_Unk3000_DLCDJPKNGBD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.internal_static_Unk3000_DLCDJPKNGBD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD.class, emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD.Builder.class);
    }

    public static final int UNK3250_BGHFBCLHCIG_FIELD_NUMBER = 3;
    private int unk3250BGHFBCLHCIG_;
    /**
     * <code>uint32 Unk3250_BGHFBCLHCIG = 3;</code>
     * @return The unk3250BGHFBCLHCIG.
     */
    @java.lang.Override
    public int getUnk3250BGHFBCLHCIG() {
      return unk3250BGHFBCLHCIG_;
    }

    public static final int UNK3250_PPDDLODBIKG_FIELD_NUMBER = 9;
    private int unk3250PPDDLODBIKG_;
    /**
     * <code>uint32 Unk3250_PPDDLODBIKG = 9;</code>
     * @return The unk3250PPDDLODBIKG.
     */
    @java.lang.Override
    public int getUnk3250PPDDLODBIKG() {
      return unk3250PPDDLODBIKG_;
    }

    public static final int UNK3000_FGIJKFANKEI_FIELD_NUMBER = 5;
    private boolean unk3000FGIJKFANKEI_;
    /**
     * <code>bool Unk3000_FGIJKFANKEI = 5;</code>
     * @return The unk3000FGIJKFANKEI.
     */
    @java.lang.Override
    public boolean getUnk3000FGIJKFANKEI() {
      return unk3000FGIJKFANKEI_;
    }

    public static final int UNK3250_FEGPHHFLFLM_FIELD_NUMBER = 10;
    private int unk3250FEGPHHFLFLM_;
    /**
     * <code>uint32 Unk3250_FEGPHHFLFLM = 10;</code>
     * @return The unk3250FEGPHHFLFLM.
     */
    @java.lang.Override
    public int getUnk3250FEGPHHFLFLM() {
      return unk3250FEGPHHFLFLM_;
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
      if (unk3250BGHFBCLHCIG_ != 0) {
        output.writeUInt32(3, unk3250BGHFBCLHCIG_);
      }
      if (unk3000FGIJKFANKEI_ != false) {
        output.writeBool(5, unk3000FGIJKFANKEI_);
      }
      if (unk3250PPDDLODBIKG_ != 0) {
        output.writeUInt32(9, unk3250PPDDLODBIKG_);
      }
      if (unk3250FEGPHHFLFLM_ != 0) {
        output.writeUInt32(10, unk3250FEGPHHFLFLM_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250BGHFBCLHCIG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, unk3250BGHFBCLHCIG_);
      }
      if (unk3000FGIJKFANKEI_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, unk3000FGIJKFANKEI_);
      }
      if (unk3250PPDDLODBIKG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, unk3250PPDDLODBIKG_);
      }
      if (unk3250FEGPHHFLFLM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3250FEGPHHFLFLM_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD other = (emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD) obj;

      if (getUnk3250BGHFBCLHCIG()
          != other.getUnk3250BGHFBCLHCIG()) return false;
      if (getUnk3250PPDDLODBIKG()
          != other.getUnk3250PPDDLODBIKG()) return false;
      if (getUnk3000FGIJKFANKEI()
          != other.getUnk3000FGIJKFANKEI()) return false;
      if (getUnk3250FEGPHHFLFLM()
          != other.getUnk3250FEGPHHFLFLM()) return false;
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
      hash = (37 * hash) + UNK3250_BGHFBCLHCIG_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250BGHFBCLHCIG();
      hash = (37 * hash) + UNK3250_PPDDLODBIKG_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250PPDDLODBIKG();
      hash = (37 * hash) + UNK3000_FGIJKFANKEI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3000FGIJKFANKEI());
      hash = (37 * hash) + UNK3250_FEGPHHFLFLM_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250FEGPHHFLFLM();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD prototype) {
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
     * CmdId: 172
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_DLCDJPKNGBD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_DLCDJPKNGBD)
        emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.internal_static_Unk3000_DLCDJPKNGBD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.internal_static_Unk3000_DLCDJPKNGBD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD.class, emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250BGHFBCLHCIG_ = 0;

        unk3250PPDDLODBIKG_ = 0;

        unk3000FGIJKFANKEI_ = false;

        unk3250FEGPHHFLFLM_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.internal_static_Unk3000_DLCDJPKNGBD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD build() {
        emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD buildPartial() {
        emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD result = new emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD(this);
        result.unk3250BGHFBCLHCIG_ = unk3250BGHFBCLHCIG_;
        result.unk3250PPDDLODBIKG_ = unk3250PPDDLODBIKG_;
        result.unk3000FGIJKFANKEI_ = unk3000FGIJKFANKEI_;
        result.unk3250FEGPHHFLFLM_ = unk3250FEGPHHFLFLM_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD other) {
        if (other == emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD.getDefaultInstance()) return this;
        if (other.getUnk3250BGHFBCLHCIG() != 0) {
          setUnk3250BGHFBCLHCIG(other.getUnk3250BGHFBCLHCIG());
        }
        if (other.getUnk3250PPDDLODBIKG() != 0) {
          setUnk3250PPDDLODBIKG(other.getUnk3250PPDDLODBIKG());
        }
        if (other.getUnk3000FGIJKFANKEI() != false) {
          setUnk3000FGIJKFANKEI(other.getUnk3000FGIJKFANKEI());
        }
        if (other.getUnk3250FEGPHHFLFLM() != 0) {
          setUnk3250FEGPHHFLFLM(other.getUnk3250FEGPHHFLFLM());
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
              case 24: {
                unk3250BGHFBCLHCIG_ = input.readUInt32();

                break;
              } // case 24
              case 40: {
                unk3000FGIJKFANKEI_ = input.readBool();

                break;
              } // case 40
              case 72: {
                unk3250PPDDLODBIKG_ = input.readUInt32();

                break;
              } // case 72
              case 80: {
                unk3250FEGPHHFLFLM_ = input.readUInt32();

                break;
              } // case 80
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

      private int unk3250BGHFBCLHCIG_ ;
      /**
       * <code>uint32 Unk3250_BGHFBCLHCIG = 3;</code>
       * @return The unk3250BGHFBCLHCIG.
       */
      @java.lang.Override
      public int getUnk3250BGHFBCLHCIG() {
        return unk3250BGHFBCLHCIG_;
      }
      /**
       * <code>uint32 Unk3250_BGHFBCLHCIG = 3;</code>
       * @param value The unk3250BGHFBCLHCIG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250BGHFBCLHCIG(int value) {
        
        unk3250BGHFBCLHCIG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_BGHFBCLHCIG = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250BGHFBCLHCIG() {
        
        unk3250BGHFBCLHCIG_ = 0;
        onChanged();
        return this;
      }

      private int unk3250PPDDLODBIKG_ ;
      /**
       * <code>uint32 Unk3250_PPDDLODBIKG = 9;</code>
       * @return The unk3250PPDDLODBIKG.
       */
      @java.lang.Override
      public int getUnk3250PPDDLODBIKG() {
        return unk3250PPDDLODBIKG_;
      }
      /**
       * <code>uint32 Unk3250_PPDDLODBIKG = 9;</code>
       * @param value The unk3250PPDDLODBIKG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250PPDDLODBIKG(int value) {
        
        unk3250PPDDLODBIKG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_PPDDLODBIKG = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250PPDDLODBIKG() {
        
        unk3250PPDDLODBIKG_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3000FGIJKFANKEI_ ;
      /**
       * <code>bool Unk3000_FGIJKFANKEI = 5;</code>
       * @return The unk3000FGIJKFANKEI.
       */
      @java.lang.Override
      public boolean getUnk3000FGIJKFANKEI() {
        return unk3000FGIJKFANKEI_;
      }
      /**
       * <code>bool Unk3000_FGIJKFANKEI = 5;</code>
       * @param value The unk3000FGIJKFANKEI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000FGIJKFANKEI(boolean value) {
        
        unk3000FGIJKFANKEI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3000_FGIJKFANKEI = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000FGIJKFANKEI() {
        
        unk3000FGIJKFANKEI_ = false;
        onChanged();
        return this;
      }

      private int unk3250FEGPHHFLFLM_ ;
      /**
       * <code>uint32 Unk3250_FEGPHHFLFLM = 10;</code>
       * @return The unk3250FEGPHHFLFLM.
       */
      @java.lang.Override
      public int getUnk3250FEGPHHFLFLM() {
        return unk3250FEGPHHFLFLM_;
      }
      /**
       * <code>uint32 Unk3250_FEGPHHFLFLM = 10;</code>
       * @param value The unk3250FEGPHHFLFLM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250FEGPHHFLFLM(int value) {
        
        unk3250FEGPHHFLFLM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_FEGPHHFLFLM = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250FEGPHHFLFLM() {
        
        unk3250FEGPHHFLFLM_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_DLCDJPKNGBD)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_DLCDJPKNGBD)
    private static final emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD();
    }

    public static emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_DLCDJPKNGBD>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_DLCDJPKNGBD>() {
      @java.lang.Override
      public Unk3000_DLCDJPKNGBD parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3000_DLCDJPKNGBD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_DLCDJPKNGBD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3000DLCDJPKNGBD.Unk3000_DLCDJPKNGBD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_DLCDJPKNGBD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_DLCDJPKNGBD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_DLCDJPKNGBD.proto\"\211\001\n\023Unk3000_" +
      "DLCDJPKNGBD\022\033\n\023Unk3250_BGHFBCLHCIG\030\003 \001(\r" +
      "\022\033\n\023Unk3250_PPDDLODBIKG\030\t \001(\r\022\033\n\023Unk3000" +
      "_FGIJKFANKEI\030\005 \001(\010\022\033\n\023Unk3250_FEGPHHFLFL" +
      "M\030\n \001(\rB\036\n\034emu.grasscutter.net.newprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_DLCDJPKNGBD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_DLCDJPKNGBD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_DLCDJPKNGBD_descriptor,
        new java.lang.String[] { "Unk3250BGHFBCLHCIG", "Unk3250PPDDLODBIKG", "Unk3000FGIJKFANKEI", "Unk3250FEGPHHFLFLM", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
