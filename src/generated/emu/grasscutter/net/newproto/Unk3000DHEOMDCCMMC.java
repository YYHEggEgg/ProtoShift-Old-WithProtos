// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_DHEOMDCCMMC.proto

package emu.grasscutter.net.newproto;

public final class Unk3000DHEOMDCCMMC {
  private Unk3000DHEOMDCCMMC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_DHEOMDCCMMCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_DHEOMDCCMMC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_EPMGHELECNH = 5;</code>
     * @return The unk3250EPMGHELECNH.
     */
    int getUnk3250EPMGHELECNH();

    /**
     * <code>uint32 Unk3000_CIOLEGEHDAC = 1;</code>
     * @return The unk3000CIOLEGEHDAC.
     */
    int getUnk3000CIOLEGEHDAC();

    /**
     * <code>uint32 Unk3250_FDGLBLJOKOK = 10;</code>
     * @return The unk3250FDGLBLJOKOK.
     */
    int getUnk3250FDGLBLJOKOK();
  }
  /**
   * <pre>
   * CmdId: 486
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_DHEOMDCCMMC}
   */
  public static final class Unk3000_DHEOMDCCMMC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_DHEOMDCCMMC)
      Unk3000_DHEOMDCCMMCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_DHEOMDCCMMC.newBuilder() to construct.
    private Unk3000_DHEOMDCCMMC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_DHEOMDCCMMC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_DHEOMDCCMMC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.internal_static_Unk3000_DHEOMDCCMMC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.internal_static_Unk3000_DHEOMDCCMMC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC.class, emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC.Builder.class);
    }

    public static final int UNK3250_EPMGHELECNH_FIELD_NUMBER = 5;
    private int unk3250EPMGHELECNH_;
    /**
     * <code>uint32 Unk3250_EPMGHELECNH = 5;</code>
     * @return The unk3250EPMGHELECNH.
     */
    @java.lang.Override
    public int getUnk3250EPMGHELECNH() {
      return unk3250EPMGHELECNH_;
    }

    public static final int UNK3000_CIOLEGEHDAC_FIELD_NUMBER = 1;
    private int unk3000CIOLEGEHDAC_;
    /**
     * <code>uint32 Unk3000_CIOLEGEHDAC = 1;</code>
     * @return The unk3000CIOLEGEHDAC.
     */
    @java.lang.Override
    public int getUnk3000CIOLEGEHDAC() {
      return unk3000CIOLEGEHDAC_;
    }

    public static final int UNK3250_FDGLBLJOKOK_FIELD_NUMBER = 10;
    private int unk3250FDGLBLJOKOK_;
    /**
     * <code>uint32 Unk3250_FDGLBLJOKOK = 10;</code>
     * @return The unk3250FDGLBLJOKOK.
     */
    @java.lang.Override
    public int getUnk3250FDGLBLJOKOK() {
      return unk3250FDGLBLJOKOK_;
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
      if (unk3000CIOLEGEHDAC_ != 0) {
        output.writeUInt32(1, unk3000CIOLEGEHDAC_);
      }
      if (unk3250EPMGHELECNH_ != 0) {
        output.writeUInt32(5, unk3250EPMGHELECNH_);
      }
      if (unk3250FDGLBLJOKOK_ != 0) {
        output.writeUInt32(10, unk3250FDGLBLJOKOK_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3000CIOLEGEHDAC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3000CIOLEGEHDAC_);
      }
      if (unk3250EPMGHELECNH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk3250EPMGHELECNH_);
      }
      if (unk3250FDGLBLJOKOK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3250FDGLBLJOKOK_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC other = (emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC) obj;

      if (getUnk3250EPMGHELECNH()
          != other.getUnk3250EPMGHELECNH()) return false;
      if (getUnk3000CIOLEGEHDAC()
          != other.getUnk3000CIOLEGEHDAC()) return false;
      if (getUnk3250FDGLBLJOKOK()
          != other.getUnk3250FDGLBLJOKOK()) return false;
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
      hash = (37 * hash) + UNK3250_EPMGHELECNH_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250EPMGHELECNH();
      hash = (37 * hash) + UNK3000_CIOLEGEHDAC_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3000CIOLEGEHDAC();
      hash = (37 * hash) + UNK3250_FDGLBLJOKOK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250FDGLBLJOKOK();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC prototype) {
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
     * CmdId: 486
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_DHEOMDCCMMC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_DHEOMDCCMMC)
        emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.internal_static_Unk3000_DHEOMDCCMMC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.internal_static_Unk3000_DHEOMDCCMMC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC.class, emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250EPMGHELECNH_ = 0;

        unk3000CIOLEGEHDAC_ = 0;

        unk3250FDGLBLJOKOK_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.internal_static_Unk3000_DHEOMDCCMMC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC build() {
        emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC buildPartial() {
        emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC result = new emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC(this);
        result.unk3250EPMGHELECNH_ = unk3250EPMGHELECNH_;
        result.unk3000CIOLEGEHDAC_ = unk3000CIOLEGEHDAC_;
        result.unk3250FDGLBLJOKOK_ = unk3250FDGLBLJOKOK_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC other) {
        if (other == emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC.getDefaultInstance()) return this;
        if (other.getUnk3250EPMGHELECNH() != 0) {
          setUnk3250EPMGHELECNH(other.getUnk3250EPMGHELECNH());
        }
        if (other.getUnk3000CIOLEGEHDAC() != 0) {
          setUnk3000CIOLEGEHDAC(other.getUnk3000CIOLEGEHDAC());
        }
        if (other.getUnk3250FDGLBLJOKOK() != 0) {
          setUnk3250FDGLBLJOKOK(other.getUnk3250FDGLBLJOKOK());
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
                unk3000CIOLEGEHDAC_ = input.readUInt32();

                break;
              } // case 8
              case 40: {
                unk3250EPMGHELECNH_ = input.readUInt32();

                break;
              } // case 40
              case 80: {
                unk3250FDGLBLJOKOK_ = input.readUInt32();

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

      private int unk3250EPMGHELECNH_ ;
      /**
       * <code>uint32 Unk3250_EPMGHELECNH = 5;</code>
       * @return The unk3250EPMGHELECNH.
       */
      @java.lang.Override
      public int getUnk3250EPMGHELECNH() {
        return unk3250EPMGHELECNH_;
      }
      /**
       * <code>uint32 Unk3250_EPMGHELECNH = 5;</code>
       * @param value The unk3250EPMGHELECNH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250EPMGHELECNH(int value) {
        
        unk3250EPMGHELECNH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_EPMGHELECNH = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250EPMGHELECNH() {
        
        unk3250EPMGHELECNH_ = 0;
        onChanged();
        return this;
      }

      private int unk3000CIOLEGEHDAC_ ;
      /**
       * <code>uint32 Unk3000_CIOLEGEHDAC = 1;</code>
       * @return The unk3000CIOLEGEHDAC.
       */
      @java.lang.Override
      public int getUnk3000CIOLEGEHDAC() {
        return unk3000CIOLEGEHDAC_;
      }
      /**
       * <code>uint32 Unk3000_CIOLEGEHDAC = 1;</code>
       * @param value The unk3000CIOLEGEHDAC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000CIOLEGEHDAC(int value) {
        
        unk3000CIOLEGEHDAC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3000_CIOLEGEHDAC = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000CIOLEGEHDAC() {
        
        unk3000CIOLEGEHDAC_ = 0;
        onChanged();
        return this;
      }

      private int unk3250FDGLBLJOKOK_ ;
      /**
       * <code>uint32 Unk3250_FDGLBLJOKOK = 10;</code>
       * @return The unk3250FDGLBLJOKOK.
       */
      @java.lang.Override
      public int getUnk3250FDGLBLJOKOK() {
        return unk3250FDGLBLJOKOK_;
      }
      /**
       * <code>uint32 Unk3250_FDGLBLJOKOK = 10;</code>
       * @param value The unk3250FDGLBLJOKOK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250FDGLBLJOKOK(int value) {
        
        unk3250FDGLBLJOKOK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_FDGLBLJOKOK = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250FDGLBLJOKOK() {
        
        unk3250FDGLBLJOKOK_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_DHEOMDCCMMC)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_DHEOMDCCMMC)
    private static final emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC();
    }

    public static emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_DHEOMDCCMMC>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_DHEOMDCCMMC>() {
      @java.lang.Override
      public Unk3000_DHEOMDCCMMC parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3000_DHEOMDCCMMC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_DHEOMDCCMMC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3000DHEOMDCCMMC.Unk3000_DHEOMDCCMMC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_DHEOMDCCMMC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_DHEOMDCCMMC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_DHEOMDCCMMC.proto\"l\n\023Unk3000_D" +
      "HEOMDCCMMC\022\033\n\023Unk3250_EPMGHELECNH\030\005 \001(\r\022" +
      "\033\n\023Unk3000_CIOLEGEHDAC\030\001 \001(\r\022\033\n\023Unk3250_" +
      "FDGLBLJOKOK\030\n \001(\rB\036\n\034emu.grasscutter.net" +
      ".newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_DHEOMDCCMMC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_DHEOMDCCMMC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_DHEOMDCCMMC_descriptor,
        new java.lang.String[] { "Unk3250EPMGHELECNH", "Unk3000CIOLEGEHDAC", "Unk3250FDGLBLJOKOK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
