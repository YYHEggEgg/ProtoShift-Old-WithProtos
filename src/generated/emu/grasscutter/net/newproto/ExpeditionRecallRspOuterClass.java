// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExpeditionRecallRsp.proto

package emu.grasscutter.net.newproto;

public final class ExpeditionRecallRspOuterClass {
  private ExpeditionRecallRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExpeditionRecallRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExpeditionRecallRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 path_id = 2;</code>
     * @return The pathId.
     */
    int getPathId();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2066;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ExpeditionRecallRsp}
   */
  public static final class ExpeditionRecallRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExpeditionRecallRsp)
      ExpeditionRecallRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExpeditionRecallRsp.newBuilder() to construct.
    private ExpeditionRecallRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExpeditionRecallRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExpeditionRecallRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.internal_static_ExpeditionRecallRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.internal_static_ExpeditionRecallRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp.class, emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp.Builder.class);
    }

    public static final int PATH_ID_FIELD_NUMBER = 2;
    private int pathId_;
    /**
     * <code>uint32 path_id = 2;</code>
     * @return The pathId.
     */
    @java.lang.Override
    public int getPathId() {
      return pathId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
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
      if (pathId_ != 0) {
        output.writeUInt32(2, pathId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pathId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, pathId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp other = (emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp) obj;

      if (getPathId()
          != other.getPathId()) return false;
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
      hash = (37 * hash) + PATH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPathId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp prototype) {
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
     *   CMD_ID = 2066;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ExpeditionRecallRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExpeditionRecallRsp)
        emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.internal_static_ExpeditionRecallRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.internal_static_ExpeditionRecallRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp.class, emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        pathId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.internal_static_ExpeditionRecallRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp build() {
        emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp buildPartial() {
        emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp result = new emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp(this);
        result.pathId_ = pathId_;
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
        if (other instanceof emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp other) {
        if (other == emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp.getDefaultInstance()) return this;
        if (other.getPathId() != 0) {
          setPathId(other.getPathId());
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
              case 16: {
                pathId_ = input.readUInt32();

                break;
              } // case 16
              case 32: {
                retcode_ = input.readInt32();

                break;
              } // case 32
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

      private int pathId_ ;
      /**
       * <code>uint32 path_id = 2;</code>
       * @return The pathId.
       */
      @java.lang.Override
      public int getPathId() {
        return pathId_;
      }
      /**
       * <code>uint32 path_id = 2;</code>
       * @param value The pathId to set.
       * @return This builder for chaining.
       */
      public Builder setPathId(int value) {
        
        pathId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 path_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPathId() {
        
        pathId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
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


      // @@protoc_insertion_point(builder_scope:ExpeditionRecallRsp)
    }

    // @@protoc_insertion_point(class_scope:ExpeditionRecallRsp)
    private static final emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp();
    }

    public static emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExpeditionRecallRsp>
        PARSER = new com.google.protobuf.AbstractParser<ExpeditionRecallRsp>() {
      @java.lang.Override
      public ExpeditionRecallRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<ExpeditionRecallRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExpeditionRecallRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ExpeditionRecallRspOuterClass.ExpeditionRecallRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExpeditionRecallRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExpeditionRecallRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ExpeditionRecallRsp.proto\"7\n\023Expeditio" +
      "nRecallRsp\022\017\n\007path_id\030\002 \001(\r\022\017\n\007retcode\030\004" +
      " \001(\005B\036\n\034emu.grasscutter.net.newprotob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ExpeditionRecallRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExpeditionRecallRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExpeditionRecallRsp_descriptor,
        new java.lang.String[] { "PathId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
