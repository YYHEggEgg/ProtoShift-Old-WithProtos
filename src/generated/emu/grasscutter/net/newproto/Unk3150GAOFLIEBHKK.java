// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_GAOFLIEBHKK.proto

package emu.grasscutter.net.newproto;

public final class Unk3150GAOFLIEBHKK {
  private Unk3150GAOFLIEBHKK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_GAOFLIEBHKKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_GAOFLIEBHKK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_PDEHPHJFAKD = 2;</code>
     * @return The unk3250PDEHPHJFAKD.
     */
    int getUnk3250PDEHPHJFAKD();

    /**
     * <code>uint32 Unk3250_AENPLEDPMJH = 6;</code>
     * @return The unk3250AENPLEDPMJH.
     */
    int getUnk3250AENPLEDPMJH();
  }
  /**
   * Protobuf type {@code Unk3150_GAOFLIEBHKK}
   */
  public static final class Unk3150_GAOFLIEBHKK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_GAOFLIEBHKK)
      Unk3150_GAOFLIEBHKKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_GAOFLIEBHKK.newBuilder() to construct.
    private Unk3150_GAOFLIEBHKK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_GAOFLIEBHKK() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_GAOFLIEBHKK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.internal_static_Unk3150_GAOFLIEBHKK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.internal_static_Unk3150_GAOFLIEBHKK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK.class, emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK.Builder.class);
    }

    public static final int UNK3250_PDEHPHJFAKD_FIELD_NUMBER = 2;
    private int unk3250PDEHPHJFAKD_;
    /**
     * <code>uint32 Unk3250_PDEHPHJFAKD = 2;</code>
     * @return The unk3250PDEHPHJFAKD.
     */
    @java.lang.Override
    public int getUnk3250PDEHPHJFAKD() {
      return unk3250PDEHPHJFAKD_;
    }

    public static final int UNK3250_AENPLEDPMJH_FIELD_NUMBER = 6;
    private int unk3250AENPLEDPMJH_;
    /**
     * <code>uint32 Unk3250_AENPLEDPMJH = 6;</code>
     * @return The unk3250AENPLEDPMJH.
     */
    @java.lang.Override
    public int getUnk3250AENPLEDPMJH() {
      return unk3250AENPLEDPMJH_;
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
      if (unk3250PDEHPHJFAKD_ != 0) {
        output.writeUInt32(2, unk3250PDEHPHJFAKD_);
      }
      if (unk3250AENPLEDPMJH_ != 0) {
        output.writeUInt32(6, unk3250AENPLEDPMJH_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250PDEHPHJFAKD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk3250PDEHPHJFAKD_);
      }
      if (unk3250AENPLEDPMJH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk3250AENPLEDPMJH_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK other = (emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK) obj;

      if (getUnk3250PDEHPHJFAKD()
          != other.getUnk3250PDEHPHJFAKD()) return false;
      if (getUnk3250AENPLEDPMJH()
          != other.getUnk3250AENPLEDPMJH()) return false;
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
      hash = (37 * hash) + UNK3250_PDEHPHJFAKD_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250PDEHPHJFAKD();
      hash = (37 * hash) + UNK3250_AENPLEDPMJH_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250AENPLEDPMJH();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK prototype) {
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
     * Protobuf type {@code Unk3150_GAOFLIEBHKK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_GAOFLIEBHKK)
        emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.internal_static_Unk3150_GAOFLIEBHKK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.internal_static_Unk3150_GAOFLIEBHKK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK.class, emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250PDEHPHJFAKD_ = 0;

        unk3250AENPLEDPMJH_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.internal_static_Unk3150_GAOFLIEBHKK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK build() {
        emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK buildPartial() {
        emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK result = new emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK(this);
        result.unk3250PDEHPHJFAKD_ = unk3250PDEHPHJFAKD_;
        result.unk3250AENPLEDPMJH_ = unk3250AENPLEDPMJH_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK other) {
        if (other == emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK.getDefaultInstance()) return this;
        if (other.getUnk3250PDEHPHJFAKD() != 0) {
          setUnk3250PDEHPHJFAKD(other.getUnk3250PDEHPHJFAKD());
        }
        if (other.getUnk3250AENPLEDPMJH() != 0) {
          setUnk3250AENPLEDPMJH(other.getUnk3250AENPLEDPMJH());
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
                unk3250PDEHPHJFAKD_ = input.readUInt32();

                break;
              } // case 16
              case 48: {
                unk3250AENPLEDPMJH_ = input.readUInt32();

                break;
              } // case 48
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

      private int unk3250PDEHPHJFAKD_ ;
      /**
       * <code>uint32 Unk3250_PDEHPHJFAKD = 2;</code>
       * @return The unk3250PDEHPHJFAKD.
       */
      @java.lang.Override
      public int getUnk3250PDEHPHJFAKD() {
        return unk3250PDEHPHJFAKD_;
      }
      /**
       * <code>uint32 Unk3250_PDEHPHJFAKD = 2;</code>
       * @param value The unk3250PDEHPHJFAKD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250PDEHPHJFAKD(int value) {
        
        unk3250PDEHPHJFAKD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_PDEHPHJFAKD = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250PDEHPHJFAKD() {
        
        unk3250PDEHPHJFAKD_ = 0;
        onChanged();
        return this;
      }

      private int unk3250AENPLEDPMJH_ ;
      /**
       * <code>uint32 Unk3250_AENPLEDPMJH = 6;</code>
       * @return The unk3250AENPLEDPMJH.
       */
      @java.lang.Override
      public int getUnk3250AENPLEDPMJH() {
        return unk3250AENPLEDPMJH_;
      }
      /**
       * <code>uint32 Unk3250_AENPLEDPMJH = 6;</code>
       * @param value The unk3250AENPLEDPMJH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250AENPLEDPMJH(int value) {
        
        unk3250AENPLEDPMJH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_AENPLEDPMJH = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250AENPLEDPMJH() {
        
        unk3250AENPLEDPMJH_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_GAOFLIEBHKK)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_GAOFLIEBHKK)
    private static final emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK();
    }

    public static emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_GAOFLIEBHKK>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_GAOFLIEBHKK>() {
      @java.lang.Override
      public Unk3150_GAOFLIEBHKK parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_GAOFLIEBHKK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_GAOFLIEBHKK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150GAOFLIEBHKK.Unk3150_GAOFLIEBHKK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_GAOFLIEBHKK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_GAOFLIEBHKK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_GAOFLIEBHKK.proto\"O\n\023Unk3150_G" +
      "AOFLIEBHKK\022\033\n\023Unk3250_PDEHPHJFAKD\030\002 \001(\r\022" +
      "\033\n\023Unk3250_AENPLEDPMJH\030\006 \001(\rB\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_GAOFLIEBHKK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_GAOFLIEBHKK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_GAOFLIEBHKK_descriptor,
        new java.lang.String[] { "Unk3250PDEHPHJFAKD", "Unk3250AENPLEDPMJH", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
