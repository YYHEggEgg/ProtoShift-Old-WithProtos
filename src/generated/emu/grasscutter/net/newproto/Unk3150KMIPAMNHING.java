// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_KMIPAMNHING.proto

package emu.grasscutter.net.newproto;

public final class Unk3150KMIPAMNHING {
  private Unk3150KMIPAMNHING() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_KMIPAMNHINGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_KMIPAMNHING)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_LDPGEEOEPCJ = 6;</code>
     * @return The unk3250LDPGEEOEPCJ.
     */
    int getUnk3250LDPGEEOEPCJ();
  }
  /**
   * <pre>
   * CmdId: 7847
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_KMIPAMNHING}
   */
  public static final class Unk3150_KMIPAMNHING extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_KMIPAMNHING)
      Unk3150_KMIPAMNHINGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_KMIPAMNHING.newBuilder() to construct.
    private Unk3150_KMIPAMNHING(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_KMIPAMNHING() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_KMIPAMNHING();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.internal_static_Unk3150_KMIPAMNHING_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.internal_static_Unk3150_KMIPAMNHING_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING.class, emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING.Builder.class);
    }

    public static final int UNK3250_LDPGEEOEPCJ_FIELD_NUMBER = 6;
    private int unk3250LDPGEEOEPCJ_;
    /**
     * <code>uint32 Unk3250_LDPGEEOEPCJ = 6;</code>
     * @return The unk3250LDPGEEOEPCJ.
     */
    @java.lang.Override
    public int getUnk3250LDPGEEOEPCJ() {
      return unk3250LDPGEEOEPCJ_;
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
      if (unk3250LDPGEEOEPCJ_ != 0) {
        output.writeUInt32(6, unk3250LDPGEEOEPCJ_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250LDPGEEOEPCJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk3250LDPGEEOEPCJ_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING other = (emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING) obj;

      if (getUnk3250LDPGEEOEPCJ()
          != other.getUnk3250LDPGEEOEPCJ()) return false;
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
      hash = (37 * hash) + UNK3250_LDPGEEOEPCJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250LDPGEEOEPCJ();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING prototype) {
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
     * CmdId: 7847
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_KMIPAMNHING}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_KMIPAMNHING)
        emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHINGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.internal_static_Unk3150_KMIPAMNHING_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.internal_static_Unk3150_KMIPAMNHING_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING.class, emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250LDPGEEOEPCJ_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.internal_static_Unk3150_KMIPAMNHING_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING build() {
        emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING buildPartial() {
        emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING result = new emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING(this);
        result.unk3250LDPGEEOEPCJ_ = unk3250LDPGEEOEPCJ_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING other) {
        if (other == emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING.getDefaultInstance()) return this;
        if (other.getUnk3250LDPGEEOEPCJ() != 0) {
          setUnk3250LDPGEEOEPCJ(other.getUnk3250LDPGEEOEPCJ());
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
              case 48: {
                unk3250LDPGEEOEPCJ_ = input.readUInt32();

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

      private int unk3250LDPGEEOEPCJ_ ;
      /**
       * <code>uint32 Unk3250_LDPGEEOEPCJ = 6;</code>
       * @return The unk3250LDPGEEOEPCJ.
       */
      @java.lang.Override
      public int getUnk3250LDPGEEOEPCJ() {
        return unk3250LDPGEEOEPCJ_;
      }
      /**
       * <code>uint32 Unk3250_LDPGEEOEPCJ = 6;</code>
       * @param value The unk3250LDPGEEOEPCJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250LDPGEEOEPCJ(int value) {
        
        unk3250LDPGEEOEPCJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_LDPGEEOEPCJ = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250LDPGEEOEPCJ() {
        
        unk3250LDPGEEOEPCJ_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_KMIPAMNHING)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_KMIPAMNHING)
    private static final emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING();
    }

    public static emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_KMIPAMNHING>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_KMIPAMNHING>() {
      @java.lang.Override
      public Unk3150_KMIPAMNHING parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_KMIPAMNHING> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_KMIPAMNHING> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150KMIPAMNHING.Unk3150_KMIPAMNHING getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_KMIPAMNHING_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_KMIPAMNHING_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_KMIPAMNHING.proto\"2\n\023Unk3150_K" +
      "MIPAMNHING\022\033\n\023Unk3250_LDPGEEOEPCJ\030\006 \001(\rB" +
      "\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_KMIPAMNHING_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_KMIPAMNHING_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_KMIPAMNHING_descriptor,
        new java.lang.String[] { "Unk3250LDPGEEOEPCJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
