// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_PGFLJBBEBKG.proto

package emu.grasscutter.net.newproto;

public final class Unk2700PGFLJBBEBKG {
  private Unk2700PGFLJBBEBKG() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_PGFLJBBEBKGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_PGFLJBBEBKG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 Unk2700_ONOOJBEABOE = 1;</code>
     * @return The unk2700ONOOJBEABOE.
     */
    long getUnk2700ONOOJBEABOE();

    /**
     * <code>uint32 Unk2700_MKIMFKIGBCL = 2;</code>
     * @return The unk2700MKIMFKIGBCL.
     */
    int getUnk2700MKIMFKIGBCL();
  }
  /**
   * Protobuf type {@code Unk2700_PGFLJBBEBKG}
   */
  public static final class Unk2700_PGFLJBBEBKG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_PGFLJBBEBKG)
      Unk2700_PGFLJBBEBKGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_PGFLJBBEBKG.newBuilder() to construct.
    private Unk2700_PGFLJBBEBKG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_PGFLJBBEBKG() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_PGFLJBBEBKG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.internal_static_Unk2700_PGFLJBBEBKG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.internal_static_Unk2700_PGFLJBBEBKG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG.class, emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG.Builder.class);
    }

    public static final int UNK2700_ONOOJBEABOE_FIELD_NUMBER = 1;
    private long unk2700ONOOJBEABOE_;
    /**
     * <code>uint64 Unk2700_ONOOJBEABOE = 1;</code>
     * @return The unk2700ONOOJBEABOE.
     */
    @java.lang.Override
    public long getUnk2700ONOOJBEABOE() {
      return unk2700ONOOJBEABOE_;
    }

    public static final int UNK2700_MKIMFKIGBCL_FIELD_NUMBER = 2;
    private int unk2700MKIMFKIGBCL_;
    /**
     * <code>uint32 Unk2700_MKIMFKIGBCL = 2;</code>
     * @return The unk2700MKIMFKIGBCL.
     */
    @java.lang.Override
    public int getUnk2700MKIMFKIGBCL() {
      return unk2700MKIMFKIGBCL_;
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
      if (unk2700ONOOJBEABOE_ != 0L) {
        output.writeUInt64(1, unk2700ONOOJBEABOE_);
      }
      if (unk2700MKIMFKIGBCL_ != 0) {
        output.writeUInt32(2, unk2700MKIMFKIGBCL_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700ONOOJBEABOE_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, unk2700ONOOJBEABOE_);
      }
      if (unk2700MKIMFKIGBCL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk2700MKIMFKIGBCL_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG other = (emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG) obj;

      if (getUnk2700ONOOJBEABOE()
          != other.getUnk2700ONOOJBEABOE()) return false;
      if (getUnk2700MKIMFKIGBCL()
          != other.getUnk2700MKIMFKIGBCL()) return false;
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
      hash = (37 * hash) + UNK2700_ONOOJBEABOE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUnk2700ONOOJBEABOE());
      hash = (37 * hash) + UNK2700_MKIMFKIGBCL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700MKIMFKIGBCL();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG prototype) {
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
     * Protobuf type {@code Unk2700_PGFLJBBEBKG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_PGFLJBBEBKG)
        emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.internal_static_Unk2700_PGFLJBBEBKG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.internal_static_Unk2700_PGFLJBBEBKG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG.class, emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk2700ONOOJBEABOE_ = 0L;

        unk2700MKIMFKIGBCL_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.internal_static_Unk2700_PGFLJBBEBKG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG build() {
        emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG buildPartial() {
        emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG result = new emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG(this);
        result.unk2700ONOOJBEABOE_ = unk2700ONOOJBEABOE_;
        result.unk2700MKIMFKIGBCL_ = unk2700MKIMFKIGBCL_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG other) {
        if (other == emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG.getDefaultInstance()) return this;
        if (other.getUnk2700ONOOJBEABOE() != 0L) {
          setUnk2700ONOOJBEABOE(other.getUnk2700ONOOJBEABOE());
        }
        if (other.getUnk2700MKIMFKIGBCL() != 0) {
          setUnk2700MKIMFKIGBCL(other.getUnk2700MKIMFKIGBCL());
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
                unk2700ONOOJBEABOE_ = input.readUInt64();

                break;
              } // case 8
              case 16: {
                unk2700MKIMFKIGBCL_ = input.readUInt32();

                break;
              } // case 16
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

      private long unk2700ONOOJBEABOE_ ;
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 1;</code>
       * @return The unk2700ONOOJBEABOE.
       */
      @java.lang.Override
      public long getUnk2700ONOOJBEABOE() {
        return unk2700ONOOJBEABOE_;
      }
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 1;</code>
       * @param value The unk2700ONOOJBEABOE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700ONOOJBEABOE(long value) {
        
        unk2700ONOOJBEABOE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700ONOOJBEABOE() {
        
        unk2700ONOOJBEABOE_ = 0L;
        onChanged();
        return this;
      }

      private int unk2700MKIMFKIGBCL_ ;
      /**
       * <code>uint32 Unk2700_MKIMFKIGBCL = 2;</code>
       * @return The unk2700MKIMFKIGBCL.
       */
      @java.lang.Override
      public int getUnk2700MKIMFKIGBCL() {
        return unk2700MKIMFKIGBCL_;
      }
      /**
       * <code>uint32 Unk2700_MKIMFKIGBCL = 2;</code>
       * @param value The unk2700MKIMFKIGBCL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700MKIMFKIGBCL(int value) {
        
        unk2700MKIMFKIGBCL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_MKIMFKIGBCL = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700MKIMFKIGBCL() {
        
        unk2700MKIMFKIGBCL_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_PGFLJBBEBKG)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_PGFLJBBEBKG)
    private static final emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG();
    }

    public static emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_PGFLJBBEBKG>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_PGFLJBBEBKG>() {
      @java.lang.Override
      public Unk2700_PGFLJBBEBKG parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_PGFLJBBEBKG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_PGFLJBBEBKG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700PGFLJBBEBKG.Unk2700_PGFLJBBEBKG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_PGFLJBBEBKG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_PGFLJBBEBKG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_PGFLJBBEBKG.proto\"O\n\023Unk2700_P" +
      "GFLJBBEBKG\022\033\n\023Unk2700_ONOOJBEABOE\030\001 \001(\004\022" +
      "\033\n\023Unk2700_MKIMFKIGBCL\030\002 \001(\rB\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_PGFLJBBEBKG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_PGFLJBBEBKG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_PGFLJBBEBKG_descriptor,
        new java.lang.String[] { "Unk2700ONOOJBEABOE", "Unk2700MKIMFKIGBCL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
