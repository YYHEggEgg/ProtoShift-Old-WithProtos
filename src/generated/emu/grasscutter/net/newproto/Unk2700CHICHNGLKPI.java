// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_CHICHNGLKPI.proto

package emu.grasscutter.net.newproto;

public final class Unk2700CHICHNGLKPI {
  private Unk2700CHICHNGLKPI() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_CHICHNGLKPIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_CHICHNGLKPI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_CKLDFNJKMBL = 3;</code>
     * @return The unk3250CKLDFNJKMBL.
     */
    int getUnk3250CKLDFNJKMBL();

    /**
     * <code>uint32 id = 2;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * <pre>
   * CmdId: 8634
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_CHICHNGLKPI}
   */
  public static final class Unk2700_CHICHNGLKPI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_CHICHNGLKPI)
      Unk2700_CHICHNGLKPIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_CHICHNGLKPI.newBuilder() to construct.
    private Unk2700_CHICHNGLKPI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_CHICHNGLKPI() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_CHICHNGLKPI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.internal_static_Unk2700_CHICHNGLKPI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.internal_static_Unk2700_CHICHNGLKPI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI.class, emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI.Builder.class);
    }

    public static final int UNK3250_CKLDFNJKMBL_FIELD_NUMBER = 3;
    private int unk3250CKLDFNJKMBL_;
    /**
     * <code>uint32 Unk3250_CKLDFNJKMBL = 3;</code>
     * @return The unk3250CKLDFNJKMBL.
     */
    @java.lang.Override
    public int getUnk3250CKLDFNJKMBL() {
      return unk3250CKLDFNJKMBL_;
    }

    public static final int ID_FIELD_NUMBER = 2;
    private int id_;
    /**
     * <code>uint32 id = 2;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (id_ != 0) {
        output.writeUInt32(2, id_);
      }
      if (unk3250CKLDFNJKMBL_ != 0) {
        output.writeUInt32(3, unk3250CKLDFNJKMBL_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, id_);
      }
      if (unk3250CKLDFNJKMBL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, unk3250CKLDFNJKMBL_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI other = (emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI) obj;

      if (getUnk3250CKLDFNJKMBL()
          != other.getUnk3250CKLDFNJKMBL()) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + UNK3250_CKLDFNJKMBL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250CKLDFNJKMBL();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI prototype) {
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
     * CmdId: 8634
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_CHICHNGLKPI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_CHICHNGLKPI)
        emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.internal_static_Unk2700_CHICHNGLKPI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.internal_static_Unk2700_CHICHNGLKPI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI.class, emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250CKLDFNJKMBL_ = 0;

        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.internal_static_Unk2700_CHICHNGLKPI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI build() {
        emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI buildPartial() {
        emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI result = new emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI(this);
        result.unk3250CKLDFNJKMBL_ = unk3250CKLDFNJKMBL_;
        result.id_ = id_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI other) {
        if (other == emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI.getDefaultInstance()) return this;
        if (other.getUnk3250CKLDFNJKMBL() != 0) {
          setUnk3250CKLDFNJKMBL(other.getUnk3250CKLDFNJKMBL());
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
                id_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                unk3250CKLDFNJKMBL_ = input.readUInt32();

                break;
              } // case 24
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

      private int unk3250CKLDFNJKMBL_ ;
      /**
       * <code>uint32 Unk3250_CKLDFNJKMBL = 3;</code>
       * @return The unk3250CKLDFNJKMBL.
       */
      @java.lang.Override
      public int getUnk3250CKLDFNJKMBL() {
        return unk3250CKLDFNJKMBL_;
      }
      /**
       * <code>uint32 Unk3250_CKLDFNJKMBL = 3;</code>
       * @param value The unk3250CKLDFNJKMBL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250CKLDFNJKMBL(int value) {
        
        unk3250CKLDFNJKMBL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_CKLDFNJKMBL = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250CKLDFNJKMBL() {
        
        unk3250CKLDFNJKMBL_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 2;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 2;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_CHICHNGLKPI)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_CHICHNGLKPI)
    private static final emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI();
    }

    public static emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_CHICHNGLKPI>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_CHICHNGLKPI>() {
      @java.lang.Override
      public Unk2700_CHICHNGLKPI parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_CHICHNGLKPI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_CHICHNGLKPI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700CHICHNGLKPI.Unk2700_CHICHNGLKPI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_CHICHNGLKPI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_CHICHNGLKPI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_CHICHNGLKPI.proto\">\n\023Unk2700_C" +
      "HICHNGLKPI\022\033\n\023Unk3250_CKLDFNJKMBL\030\003 \001(\r\022" +
      "\n\n\002id\030\002 \001(\rB\036\n\034emu.grasscutter.net.newpr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_CHICHNGLKPI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_CHICHNGLKPI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_CHICHNGLKPI_descriptor,
        new java.lang.String[] { "Unk3250CKLDFNJKMBL", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}