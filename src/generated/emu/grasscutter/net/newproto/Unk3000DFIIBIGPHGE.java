// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_DFIIBIGPHGE.proto

package emu.grasscutter.net.newproto;

public final class Unk3000DFIIBIGPHGE {
  private Unk3000DFIIBIGPHGE() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_DFIIBIGPHGEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_DFIIBIGPHGE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3000_GCAJHPHIEAA = 8;</code>
     * @return The unk3000GCAJHPHIEAA.
     */
    int getUnk3000GCAJHPHIEAA();
  }
  /**
   * <pre>
   * CmdId: 1796
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_DFIIBIGPHGE}
   */
  public static final class Unk3000_DFIIBIGPHGE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_DFIIBIGPHGE)
      Unk3000_DFIIBIGPHGEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_DFIIBIGPHGE.newBuilder() to construct.
    private Unk3000_DFIIBIGPHGE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_DFIIBIGPHGE() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_DFIIBIGPHGE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.internal_static_Unk3000_DFIIBIGPHGE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.internal_static_Unk3000_DFIIBIGPHGE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE.class, emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE.Builder.class);
    }

    public static final int UNK3000_GCAJHPHIEAA_FIELD_NUMBER = 8;
    private int unk3000GCAJHPHIEAA_;
    /**
     * <code>uint32 Unk3000_GCAJHPHIEAA = 8;</code>
     * @return The unk3000GCAJHPHIEAA.
     */
    @java.lang.Override
    public int getUnk3000GCAJHPHIEAA() {
      return unk3000GCAJHPHIEAA_;
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
      if (unk3000GCAJHPHIEAA_ != 0) {
        output.writeUInt32(8, unk3000GCAJHPHIEAA_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3000GCAJHPHIEAA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3000GCAJHPHIEAA_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE other = (emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE) obj;

      if (getUnk3000GCAJHPHIEAA()
          != other.getUnk3000GCAJHPHIEAA()) return false;
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
      hash = (37 * hash) + UNK3000_GCAJHPHIEAA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3000GCAJHPHIEAA();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE prototype) {
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
     * CmdId: 1796
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_DFIIBIGPHGE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_DFIIBIGPHGE)
        emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.internal_static_Unk3000_DFIIBIGPHGE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.internal_static_Unk3000_DFIIBIGPHGE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE.class, emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3000GCAJHPHIEAA_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.internal_static_Unk3000_DFIIBIGPHGE_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE build() {
        emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE buildPartial() {
        emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE result = new emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE(this);
        result.unk3000GCAJHPHIEAA_ = unk3000GCAJHPHIEAA_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE other) {
        if (other == emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE.getDefaultInstance()) return this;
        if (other.getUnk3000GCAJHPHIEAA() != 0) {
          setUnk3000GCAJHPHIEAA(other.getUnk3000GCAJHPHIEAA());
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
                unk3000GCAJHPHIEAA_ = input.readUInt32();

                break;
              } // case 64
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

      private int unk3000GCAJHPHIEAA_ ;
      /**
       * <code>uint32 Unk3000_GCAJHPHIEAA = 8;</code>
       * @return The unk3000GCAJHPHIEAA.
       */
      @java.lang.Override
      public int getUnk3000GCAJHPHIEAA() {
        return unk3000GCAJHPHIEAA_;
      }
      /**
       * <code>uint32 Unk3000_GCAJHPHIEAA = 8;</code>
       * @param value The unk3000GCAJHPHIEAA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000GCAJHPHIEAA(int value) {
        
        unk3000GCAJHPHIEAA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3000_GCAJHPHIEAA = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000GCAJHPHIEAA() {
        
        unk3000GCAJHPHIEAA_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_DFIIBIGPHGE)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_DFIIBIGPHGE)
    private static final emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE();
    }

    public static emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_DFIIBIGPHGE>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_DFIIBIGPHGE>() {
      @java.lang.Override
      public Unk3000_DFIIBIGPHGE parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3000_DFIIBIGPHGE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_DFIIBIGPHGE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3000DFIIBIGPHGE.Unk3000_DFIIBIGPHGE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_DFIIBIGPHGE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_DFIIBIGPHGE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_DFIIBIGPHGE.proto\"2\n\023Unk3000_D" +
      "FIIBIGPHGE\022\033\n\023Unk3000_GCAJHPHIEAA\030\010 \001(\rB" +
      "\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_DFIIBIGPHGE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_DFIIBIGPHGE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_DFIIBIGPHGE_descriptor,
        new java.lang.String[] { "Unk3000GCAJHPHIEAA", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
