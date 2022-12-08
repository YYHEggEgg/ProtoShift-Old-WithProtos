// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnionCmd.proto

package emu.grasscutter.net.newproto;

public final class UnionCmdOuterClass {
  private UnionCmdOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnionCmdOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UnionCmd)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes body = 3;</code>
     * @return The body.
     */
    com.google.protobuf.ByteString getBody();

    /**
     * <code>uint32 message_id = 4;</code>
     * @return The messageId.
     */
    int getMessageId();
  }
  /**
   * Protobuf type {@code UnionCmd}
   */
  public static final class UnionCmd extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UnionCmd)
      UnionCmdOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnionCmd.newBuilder() to construct.
    private UnionCmd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnionCmd() {
      body_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UnionCmd();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.UnionCmdOuterClass.internal_static_UnionCmd_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.UnionCmdOuterClass.internal_static_UnionCmd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd.class, emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd.Builder.class);
    }

    public static final int BODY_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString body_;
    /**
     * <code>bytes body = 3;</code>
     * @return The body.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBody() {
      return body_;
    }

    public static final int MESSAGE_ID_FIELD_NUMBER = 4;
    private int messageId_;
    /**
     * <code>uint32 message_id = 4;</code>
     * @return The messageId.
     */
    @java.lang.Override
    public int getMessageId() {
      return messageId_;
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
      if (!body_.isEmpty()) {
        output.writeBytes(3, body_);
      }
      if (messageId_ != 0) {
        output.writeUInt32(4, messageId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!body_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, body_);
      }
      if (messageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, messageId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd other = (emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd) obj;

      if (!getBody()
          .equals(other.getBody())) return false;
      if (getMessageId()
          != other.getMessageId()) return false;
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
      hash = (37 * hash) + BODY_FIELD_NUMBER;
      hash = (53 * hash) + getBody().hashCode();
      hash = (37 * hash) + MESSAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMessageId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd prototype) {
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
     * Protobuf type {@code UnionCmd}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UnionCmd)
        emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.UnionCmdOuterClass.internal_static_UnionCmd_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.UnionCmdOuterClass.internal_static_UnionCmd_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd.class, emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        body_ = com.google.protobuf.ByteString.EMPTY;

        messageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.UnionCmdOuterClass.internal_static_UnionCmd_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd build() {
        emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd buildPartial() {
        emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd result = new emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd(this);
        result.body_ = body_;
        result.messageId_ = messageId_;
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
        if (other instanceof emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd) {
          return mergeFrom((emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd other) {
        if (other == emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd.getDefaultInstance()) return this;
        if (other.getBody() != com.google.protobuf.ByteString.EMPTY) {
          setBody(other.getBody());
        }
        if (other.getMessageId() != 0) {
          setMessageId(other.getMessageId());
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
              case 26: {
                body_ = input.readBytes();

                break;
              } // case 26
              case 32: {
                messageId_ = input.readUInt32();

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

      private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes body = 3;</code>
       * @return The body.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getBody() {
        return body_;
      }
      /**
       * <code>bytes body = 3;</code>
       * @param value The body to set.
       * @return This builder for chaining.
       */
      public Builder setBody(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        body_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes body = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBody() {
        
        body_ = getDefaultInstance().getBody();
        onChanged();
        return this;
      }

      private int messageId_ ;
      /**
       * <code>uint32 message_id = 4;</code>
       * @return The messageId.
       */
      @java.lang.Override
      public int getMessageId() {
        return messageId_;
      }
      /**
       * <code>uint32 message_id = 4;</code>
       * @param value The messageId to set.
       * @return This builder for chaining.
       */
      public Builder setMessageId(int value) {
        
        messageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 message_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMessageId() {
        
        messageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:UnionCmd)
    }

    // @@protoc_insertion_point(class_scope:UnionCmd)
    private static final emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd();
    }

    public static emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnionCmd>
        PARSER = new com.google.protobuf.AbstractParser<UnionCmd>() {
      @java.lang.Override
      public UnionCmd parsePartialFrom(
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

    public static com.google.protobuf.Parser<UnionCmd> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnionCmd> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.UnionCmdOuterClass.UnionCmd getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnionCmd_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnionCmd_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016UnionCmd.proto\",\n\010UnionCmd\022\014\n\004body\030\003 \001" +
      "(\014\022\022\n\nmessage_id\030\004 \001(\rB\036\n\034emu.grasscutte" +
      "r.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UnionCmd_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UnionCmd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnionCmd_descriptor,
        new java.lang.String[] { "Body", "MessageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
