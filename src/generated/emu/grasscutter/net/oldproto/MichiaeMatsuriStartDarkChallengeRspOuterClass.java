// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MichiaeMatsuriStartDarkChallengeRsp.proto

package emu.grasscutter.net.oldproto;

public final class MichiaeMatsuriStartDarkChallengeRspOuterClass {
  private MichiaeMatsuriStartDarkChallengeRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MichiaeMatsuriStartDarkChallengeRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MichiaeMatsuriStartDarkChallengeRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 8791
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code MichiaeMatsuriStartDarkChallengeRsp}
   */
  public static final class MichiaeMatsuriStartDarkChallengeRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MichiaeMatsuriStartDarkChallengeRsp)
      MichiaeMatsuriStartDarkChallengeRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MichiaeMatsuriStartDarkChallengeRsp.newBuilder() to construct.
    private MichiaeMatsuriStartDarkChallengeRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MichiaeMatsuriStartDarkChallengeRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MichiaeMatsuriStartDarkChallengeRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.internal_static_MichiaeMatsuriStartDarkChallengeRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.internal_static_MichiaeMatsuriStartDarkChallengeRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp.class, emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp other = (emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp prototype) {
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
     * CmdId: 8791
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code MichiaeMatsuriStartDarkChallengeRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MichiaeMatsuriStartDarkChallengeRsp)
        emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.internal_static_MichiaeMatsuriStartDarkChallengeRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.internal_static_MichiaeMatsuriStartDarkChallengeRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp.class, emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp.newBuilder()
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

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.internal_static_MichiaeMatsuriStartDarkChallengeRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp build() {
        emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp buildPartial() {
        emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp result = new emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp(this);
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp other) {
        if (other == emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
                retcode_ = input.readInt32();

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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MichiaeMatsuriStartDarkChallengeRsp)
    }

    // @@protoc_insertion_point(class_scope:MichiaeMatsuriStartDarkChallengeRsp)
    private static final emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp();
    }

    public static emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MichiaeMatsuriStartDarkChallengeRsp>
        PARSER = new com.google.protobuf.AbstractParser<MichiaeMatsuriStartDarkChallengeRsp>() {
      @java.lang.Override
      public MichiaeMatsuriStartDarkChallengeRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<MichiaeMatsuriStartDarkChallengeRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MichiaeMatsuriStartDarkChallengeRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.MichiaeMatsuriStartDarkChallengeRspOuterClass.MichiaeMatsuriStartDarkChallengeRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MichiaeMatsuriStartDarkChallengeRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MichiaeMatsuriStartDarkChallengeRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)MichiaeMatsuriStartDarkChallengeRsp.pr" +
      "oto\"6\n#MichiaeMatsuriStartDarkChallengeR" +
      "sp\022\017\n\007retcode\030\002 \001(\005B\036\n\034emu.grasscutter.n" +
      "et.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MichiaeMatsuriStartDarkChallengeRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MichiaeMatsuriStartDarkChallengeRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MichiaeMatsuriStartDarkChallengeRsp_descriptor,
        new java.lang.String[] { "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
