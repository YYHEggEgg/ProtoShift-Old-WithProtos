// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairReplayMiniGameReq.proto

package emu.grasscutter.net.oldproto;

public final class FleurFairReplayMiniGameReqOuterClass {
  private FleurFairReplayMiniGameReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairReplayMiniGameReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairReplayMiniGameReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 minigame_id = 5;</code>
     * @return The minigameId.
     */
    int getMinigameId();
  }
  /**
   * <pre>
   * CmdId: 2181
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code FleurFairReplayMiniGameReq}
   */
  public static final class FleurFairReplayMiniGameReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FleurFairReplayMiniGameReq)
      FleurFairReplayMiniGameReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairReplayMiniGameReq.newBuilder() to construct.
    private FleurFairReplayMiniGameReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FleurFairReplayMiniGameReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairReplayMiniGameReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.internal_static_FleurFairReplayMiniGameReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.internal_static_FleurFairReplayMiniGameReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq.class, emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq.Builder.class);
    }

    public static final int MINIGAME_ID_FIELD_NUMBER = 5;
    private int minigameId_;
    /**
     * <code>uint32 minigame_id = 5;</code>
     * @return The minigameId.
     */
    @java.lang.Override
    public int getMinigameId() {
      return minigameId_;
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
      if (minigameId_ != 0) {
        output.writeUInt32(5, minigameId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (minigameId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, minigameId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq other = (emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq) obj;

      if (getMinigameId()
          != other.getMinigameId()) return false;
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
      hash = (37 * hash) + MINIGAME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMinigameId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq prototype) {
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
     * CmdId: 2181
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code FleurFairReplayMiniGameReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FleurFairReplayMiniGameReq)
        emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.internal_static_FleurFairReplayMiniGameReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.internal_static_FleurFairReplayMiniGameReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq.class, emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        minigameId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.internal_static_FleurFairReplayMiniGameReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq build() {
        emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq buildPartial() {
        emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq result = new emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq(this);
        result.minigameId_ = minigameId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq other) {
        if (other == emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq.getDefaultInstance()) return this;
        if (other.getMinigameId() != 0) {
          setMinigameId(other.getMinigameId());
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
                minigameId_ = input.readUInt32();

                break;
              } // case 40
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

      private int minigameId_ ;
      /**
       * <code>uint32 minigame_id = 5;</code>
       * @return The minigameId.
       */
      @java.lang.Override
      public int getMinigameId() {
        return minigameId_;
      }
      /**
       * <code>uint32 minigame_id = 5;</code>
       * @param value The minigameId to set.
       * @return This builder for chaining.
       */
      public Builder setMinigameId(int value) {
        
        minigameId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 minigame_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinigameId() {
        
        minigameId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FleurFairReplayMiniGameReq)
    }

    // @@protoc_insertion_point(class_scope:FleurFairReplayMiniGameReq)
    private static final emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq();
    }

    public static emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FleurFairReplayMiniGameReq>
        PARSER = new com.google.protobuf.AbstractParser<FleurFairReplayMiniGameReq>() {
      @java.lang.Override
      public FleurFairReplayMiniGameReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<FleurFairReplayMiniGameReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairReplayMiniGameReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.FleurFairReplayMiniGameReqOuterClass.FleurFairReplayMiniGameReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairReplayMiniGameReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairReplayMiniGameReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n FleurFairReplayMiniGameReq.proto\"1\n\032Fl" +
      "eurFairReplayMiniGameReq\022\023\n\013minigame_id\030" +
      "\005 \001(\rB\036\n\034emu.grasscutter.net.oldprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FleurFairReplayMiniGameReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FleurFairReplayMiniGameReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairReplayMiniGameReq_descriptor,
        new java.lang.String[] { "MinigameId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
