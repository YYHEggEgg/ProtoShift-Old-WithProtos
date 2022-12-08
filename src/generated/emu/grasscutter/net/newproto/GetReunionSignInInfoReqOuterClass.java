// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetReunionSignInInfoReq.proto

package emu.grasscutter.net.newproto;

public final class GetReunionSignInInfoReqOuterClass {
  private GetReunionSignInInfoReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetReunionSignInInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetReunionSignInInfoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 sign_in_config_id = 3;</code>
     * @return The signInConfigId.
     */
    int getSignInConfigId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5077;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GetReunionSignInInfoReq}
   */
  public static final class GetReunionSignInInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetReunionSignInInfoReq)
      GetReunionSignInInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetReunionSignInInfoReq.newBuilder() to construct.
    private GetReunionSignInInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetReunionSignInInfoReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetReunionSignInInfoReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.internal_static_GetReunionSignInInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.internal_static_GetReunionSignInInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq.class, emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq.Builder.class);
    }

    public static final int SIGN_IN_CONFIG_ID_FIELD_NUMBER = 3;
    private int signInConfigId_;
    /**
     * <code>uint32 sign_in_config_id = 3;</code>
     * @return The signInConfigId.
     */
    @java.lang.Override
    public int getSignInConfigId() {
      return signInConfigId_;
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
      if (signInConfigId_ != 0) {
        output.writeUInt32(3, signInConfigId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (signInConfigId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, signInConfigId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq other = (emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq) obj;

      if (getSignInConfigId()
          != other.getSignInConfigId()) return false;
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
      hash = (37 * hash) + SIGN_IN_CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSignInConfigId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 5077;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GetReunionSignInInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetReunionSignInInfoReq)
        emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.internal_static_GetReunionSignInInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.internal_static_GetReunionSignInInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq.class, emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        signInConfigId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.internal_static_GetReunionSignInInfoReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq build() {
        emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq buildPartial() {
        emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq result = new emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq(this);
        result.signInConfigId_ = signInConfigId_;
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
        if (other instanceof emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq) {
          return mergeFrom((emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq other) {
        if (other == emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq.getDefaultInstance()) return this;
        if (other.getSignInConfigId() != 0) {
          setSignInConfigId(other.getSignInConfigId());
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
                signInConfigId_ = input.readUInt32();

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

      private int signInConfigId_ ;
      /**
       * <code>uint32 sign_in_config_id = 3;</code>
       * @return The signInConfigId.
       */
      @java.lang.Override
      public int getSignInConfigId() {
        return signInConfigId_;
      }
      /**
       * <code>uint32 sign_in_config_id = 3;</code>
       * @param value The signInConfigId to set.
       * @return This builder for chaining.
       */
      public Builder setSignInConfigId(int value) {
        
        signInConfigId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sign_in_config_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSignInConfigId() {
        
        signInConfigId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetReunionSignInInfoReq)
    }

    // @@protoc_insertion_point(class_scope:GetReunionSignInInfoReq)
    private static final emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq();
    }

    public static emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetReunionSignInInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<GetReunionSignInInfoReq>() {
      @java.lang.Override
      public GetReunionSignInInfoReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetReunionSignInInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetReunionSignInInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GetReunionSignInInfoReqOuterClass.GetReunionSignInInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetReunionSignInInfoReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetReunionSignInInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035GetReunionSignInInfoReq.proto\"4\n\027GetRe" +
      "unionSignInInfoReq\022\031\n\021sign_in_config_id\030" +
      "\003 \001(\rB\036\n\034emu.grasscutter.net.newprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetReunionSignInInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetReunionSignInInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetReunionSignInInfoReq_descriptor,
        new java.lang.String[] { "SignInConfigId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
