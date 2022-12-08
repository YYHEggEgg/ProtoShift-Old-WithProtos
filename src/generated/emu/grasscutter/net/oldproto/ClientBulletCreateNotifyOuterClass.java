// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientBulletCreateNotify.proto

package emu.grasscutter.net.oldproto;

public final class ClientBulletCreateNotifyOuterClass {
  private ClientBulletCreateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientBulletCreateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientBulletCreateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 param = 6;</code>
     * @return The param.
     */
    int getParam();
  }
  /**
   * <pre>
   * CmdId: 4
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ClientBulletCreateNotify}
   */
  public static final class ClientBulletCreateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientBulletCreateNotify)
      ClientBulletCreateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientBulletCreateNotify.newBuilder() to construct.
    private ClientBulletCreateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientBulletCreateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientBulletCreateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.internal_static_ClientBulletCreateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.internal_static_ClientBulletCreateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify.class, emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify.Builder.class);
    }

    public static final int PARAM_FIELD_NUMBER = 6;
    private int param_;
    /**
     * <code>uint32 param = 6;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
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
      if (param_ != 0) {
        output.writeUInt32(6, param_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, param_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify other = (emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify) obj;

      if (getParam()
          != other.getParam()) return false;
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
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify prototype) {
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
     * CmdId: 4
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ClientBulletCreateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientBulletCreateNotify)
        emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.internal_static_ClientBulletCreateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.internal_static_ClientBulletCreateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify.class, emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        param_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.internal_static_ClientBulletCreateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify build() {
        emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify buildPartial() {
        emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify result = new emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify(this);
        result.param_ = param_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify other) {
        if (other == emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify.getDefaultInstance()) return this;
        if (other.getParam() != 0) {
          setParam(other.getParam());
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
                param_ = input.readUInt32();

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

      private int param_ ;
      /**
       * <code>uint32 param = 6;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 6;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        
        param_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ClientBulletCreateNotify)
    }

    // @@protoc_insertion_point(class_scope:ClientBulletCreateNotify)
    private static final emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify();
    }

    public static emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientBulletCreateNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClientBulletCreateNotify>() {
      @java.lang.Override
      public ClientBulletCreateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ClientBulletCreateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientBulletCreateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ClientBulletCreateNotifyOuterClass.ClientBulletCreateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientBulletCreateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientBulletCreateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036ClientBulletCreateNotify.proto\")\n\030Clie" +
      "ntBulletCreateNotify\022\r\n\005param\030\006 \001(\rB\036\n\034e" +
      "mu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientBulletCreateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientBulletCreateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientBulletCreateNotify_descriptor,
        new java.lang.String[] { "Param", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
