// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StartRogueDiaryPlayReq.proto

package emu.grasscutter.net.oldproto;

public final class StartRogueDiaryPlayReqOuterClass {
  private StartRogueDiaryPlayReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StartRogueDiaryPlayReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StartRogueDiaryPlayReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 difficulty = 1;</code>
     * @return The difficulty.
     */
    int getDifficulty();

    /**
     * <code>uint32 stage_id = 12;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * <pre>
   * CmdId: 8419
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code StartRogueDiaryPlayReq}
   */
  public static final class StartRogueDiaryPlayReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StartRogueDiaryPlayReq)
      StartRogueDiaryPlayReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StartRogueDiaryPlayReq.newBuilder() to construct.
    private StartRogueDiaryPlayReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StartRogueDiaryPlayReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StartRogueDiaryPlayReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.internal_static_StartRogueDiaryPlayReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.internal_static_StartRogueDiaryPlayReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq.class, emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq.Builder.class);
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 1;
    private int difficulty_;
    /**
     * <code>uint32 difficulty = 1;</code>
     * @return The difficulty.
     */
    @java.lang.Override
    public int getDifficulty() {
      return difficulty_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 12;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 12;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (difficulty_ != 0) {
        output.writeUInt32(1, difficulty_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(12, stageId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, difficulty_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, stageId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq other = (emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq) obj;

      if (getDifficulty()
          != other.getDifficulty()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq prototype) {
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
     * CmdId: 8419
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code StartRogueDiaryPlayReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StartRogueDiaryPlayReq)
        emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.internal_static_StartRogueDiaryPlayReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.internal_static_StartRogueDiaryPlayReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq.class, emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        difficulty_ = 0;

        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.internal_static_StartRogueDiaryPlayReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq build() {
        emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq buildPartial() {
        emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq result = new emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq(this);
        result.difficulty_ = difficulty_;
        result.stageId_ = stageId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq other) {
        if (other == emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq.getDefaultInstance()) return this;
        if (other.getDifficulty() != 0) {
          setDifficulty(other.getDifficulty());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
                difficulty_ = input.readUInt32();

                break;
              } // case 8
              case 96: {
                stageId_ = input.readUInt32();

                break;
              } // case 96
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

      private int difficulty_ ;
      /**
       * <code>uint32 difficulty = 1;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public int getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>uint32 difficulty = 1;</code>
       * @param value The difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficulty(int value) {
        
        difficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        
        difficulty_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 12;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 12;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StartRogueDiaryPlayReq)
    }

    // @@protoc_insertion_point(class_scope:StartRogueDiaryPlayReq)
    private static final emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq();
    }

    public static emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StartRogueDiaryPlayReq>
        PARSER = new com.google.protobuf.AbstractParser<StartRogueDiaryPlayReq>() {
      @java.lang.Override
      public StartRogueDiaryPlayReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<StartRogueDiaryPlayReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StartRogueDiaryPlayReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.StartRogueDiaryPlayReqOuterClass.StartRogueDiaryPlayReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StartRogueDiaryPlayReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StartRogueDiaryPlayReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034StartRogueDiaryPlayReq.proto\">\n\026StartR" +
      "ogueDiaryPlayReq\022\022\n\ndifficulty\030\001 \001(\r\022\020\n\010" +
      "stage_id\030\014 \001(\rB\036\n\034emu.grasscutter.net.ol" +
      "dprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StartRogueDiaryPlayReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StartRogueDiaryPlayReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StartRogueDiaryPlayReq_descriptor,
        new java.lang.String[] { "Difficulty", "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
