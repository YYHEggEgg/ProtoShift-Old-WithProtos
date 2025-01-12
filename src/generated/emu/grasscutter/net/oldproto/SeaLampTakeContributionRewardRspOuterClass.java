// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SeaLampTakeContributionRewardRsp.proto

package emu.grasscutter.net.oldproto;

public final class SeaLampTakeContributionRewardRspOuterClass {
  private SeaLampTakeContributionRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SeaLampTakeContributionRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SeaLampTakeContributionRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 config_id = 9;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 2177
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code SeaLampTakeContributionRewardRsp}
   */
  public static final class SeaLampTakeContributionRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SeaLampTakeContributionRewardRsp)
      SeaLampTakeContributionRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SeaLampTakeContributionRewardRsp.newBuilder() to construct.
    private SeaLampTakeContributionRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SeaLampTakeContributionRewardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SeaLampTakeContributionRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.internal_static_SeaLampTakeContributionRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.internal_static_SeaLampTakeContributionRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp.class, emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp.Builder.class);
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 9;
    private int configId_;
    /**
     * <code>uint32 config_id = 9;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
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
        output.writeInt32(7, retcode_);
      }
      if (configId_ != 0) {
        output.writeUInt32(9, configId_);
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
          .computeInt32Size(7, retcode_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, configId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp other = (emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp) obj;

      if (getConfigId()
          != other.getConfigId()) return false;
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
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp prototype) {
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
     * CmdId: 2177
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code SeaLampTakeContributionRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SeaLampTakeContributionRewardRsp)
        emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.internal_static_SeaLampTakeContributionRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.internal_static_SeaLampTakeContributionRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp.class, emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        configId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.internal_static_SeaLampTakeContributionRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp build() {
        emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp buildPartial() {
        emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp result = new emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp(this);
        result.configId_ = configId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp other) {
        if (other == emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp.getDefaultInstance()) return this;
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
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
              case 56: {
                retcode_ = input.readInt32();

                break;
              } // case 56
              case 72: {
                configId_ = input.readUInt32();

                break;
              } // case 72
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

      private int configId_ ;
      /**
       * <code>uint32 config_id = 9;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 9;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
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


      // @@protoc_insertion_point(builder_scope:SeaLampTakeContributionRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:SeaLampTakeContributionRewardRsp)
    private static final emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp();
    }

    public static emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SeaLampTakeContributionRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<SeaLampTakeContributionRewardRsp>() {
      @java.lang.Override
      public SeaLampTakeContributionRewardRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<SeaLampTakeContributionRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SeaLampTakeContributionRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SeaLampTakeContributionRewardRspOuterClass.SeaLampTakeContributionRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SeaLampTakeContributionRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SeaLampTakeContributionRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&SeaLampTakeContributionRewardRsp.proto" +
      "\"F\n SeaLampTakeContributionRewardRsp\022\021\n\t" +
      "config_id\030\t \001(\r\022\017\n\007retcode\030\007 \001(\005B\036\n\034emu." +
      "grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SeaLampTakeContributionRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SeaLampTakeContributionRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SeaLampTakeContributionRewardRsp_descriptor,
        new java.lang.String[] { "ConfigId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
