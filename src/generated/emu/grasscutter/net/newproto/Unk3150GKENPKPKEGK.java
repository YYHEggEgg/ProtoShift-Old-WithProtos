// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_GKENPKPKEGK.proto

package emu.grasscutter.net.newproto;

public final class Unk3150GKENPKPKEGK {
  private Unk3150GKENPKPKEGK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_GKENPKPKEGKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_GKENPKPKEGK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool Unk3150_MEKMHGKCFEO = 5;</code>
     * @return The unk3150MEKMHGKCFEO.
     */
    boolean getUnk3150MEKMHGKCFEO();
  }
  /**
   * <pre>
   * CmdId: 4643
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_GKENPKPKEGK}
   */
  public static final class Unk3150_GKENPKPKEGK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_GKENPKPKEGK)
      Unk3150_GKENPKPKEGKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_GKENPKPKEGK.newBuilder() to construct.
    private Unk3150_GKENPKPKEGK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_GKENPKPKEGK() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_GKENPKPKEGK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.internal_static_Unk3150_GKENPKPKEGK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.internal_static_Unk3150_GKENPKPKEGK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK.class, emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UNK3150_MEKMHGKCFEO_FIELD_NUMBER = 5;
    private boolean unk3150MEKMHGKCFEO_;
    /**
     * <code>bool Unk3150_MEKMHGKCFEO = 5;</code>
     * @return The unk3150MEKMHGKCFEO.
     */
    @java.lang.Override
    public boolean getUnk3150MEKMHGKCFEO() {
      return unk3150MEKMHGKCFEO_;
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
      if (unk3150MEKMHGKCFEO_ != false) {
        output.writeBool(5, unk3150MEKMHGKCFEO_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3150MEKMHGKCFEO_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, unk3150MEKMHGKCFEO_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK other = (emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getUnk3150MEKMHGKCFEO()
          != other.getUnk3150MEKMHGKCFEO()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + UNK3150_MEKMHGKCFEO_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3150MEKMHGKCFEO());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK prototype) {
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
     * CmdId: 4643
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_GKENPKPKEGK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_GKENPKPKEGK)
        emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.internal_static_Unk3150_GKENPKPKEGK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.internal_static_Unk3150_GKENPKPKEGK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK.class, emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        unk3150MEKMHGKCFEO_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.internal_static_Unk3150_GKENPKPKEGK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK build() {
        emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK buildPartial() {
        emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK result = new emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK(this);
        result.retcode_ = retcode_;
        result.unk3150MEKMHGKCFEO_ = unk3150MEKMHGKCFEO_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK other) {
        if (other == emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getUnk3150MEKMHGKCFEO() != false) {
          setUnk3150MEKMHGKCFEO(other.getUnk3150MEKMHGKCFEO());
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
              case 40: {
                unk3150MEKMHGKCFEO_ = input.readBool();

                break;
              } // case 40
              case 112: {
                retcode_ = input.readInt32();

                break;
              } // case 112
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3150MEKMHGKCFEO_ ;
      /**
       * <code>bool Unk3150_MEKMHGKCFEO = 5;</code>
       * @return The unk3150MEKMHGKCFEO.
       */
      @java.lang.Override
      public boolean getUnk3150MEKMHGKCFEO() {
        return unk3150MEKMHGKCFEO_;
      }
      /**
       * <code>bool Unk3150_MEKMHGKCFEO = 5;</code>
       * @param value The unk3150MEKMHGKCFEO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150MEKMHGKCFEO(boolean value) {
        
        unk3150MEKMHGKCFEO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3150_MEKMHGKCFEO = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150MEKMHGKCFEO() {
        
        unk3150MEKMHGKCFEO_ = false;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_GKENPKPKEGK)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_GKENPKPKEGK)
    private static final emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK();
    }

    public static emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_GKENPKPKEGK>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_GKENPKPKEGK>() {
      @java.lang.Override
      public Unk3150_GKENPKPKEGK parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_GKENPKPKEGK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_GKENPKPKEGK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150GKENPKPKEGK.Unk3150_GKENPKPKEGK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_GKENPKPKEGK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_GKENPKPKEGK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_GKENPKPKEGK.proto\"C\n\023Unk3150_G" +
      "KENPKPKEGK\022\017\n\007retcode\030\016 \001(\005\022\033\n\023Unk3150_M" +
      "EKMHGKCFEO\030\005 \001(\010B\036\n\034emu.grasscutter.net." +
      "newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_GKENPKPKEGK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_GKENPKPKEGK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_GKENPKPKEGK_descriptor,
        new java.lang.String[] { "Retcode", "Unk3150MEKMHGKCFEO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
