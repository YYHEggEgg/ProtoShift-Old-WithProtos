// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MuqadasPotionCaptureWeaknessReq.proto

package emu.grasscutter.net.oldproto;

public final class MuqadasPotionCaptureWeaknessReqOuterClass {
  private MuqadasPotionCaptureWeaknessReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MuqadasPotionCaptureWeaknessReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MuqadasPotionCaptureWeaknessReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 capture_weakness_count = 10;</code>
     * @return The captureWeaknessCount.
     */
    int getCaptureWeaknessCount();

    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * CmdId: 20011
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code MuqadasPotionCaptureWeaknessReq}
   */
  public static final class MuqadasPotionCaptureWeaknessReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MuqadasPotionCaptureWeaknessReq)
      MuqadasPotionCaptureWeaknessReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MuqadasPotionCaptureWeaknessReq.newBuilder() to construct.
    private MuqadasPotionCaptureWeaknessReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MuqadasPotionCaptureWeaknessReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MuqadasPotionCaptureWeaknessReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.internal_static_MuqadasPotionCaptureWeaknessReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.internal_static_MuqadasPotionCaptureWeaknessReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq.class, emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq.Builder.class);
    }

    public static final int CAPTURE_WEAKNESS_COUNT_FIELD_NUMBER = 10;
    private int captureWeaknessCount_;
    /**
     * <code>uint32 capture_weakness_count = 10;</code>
     * @return The captureWeaknessCount.
     */
    @java.lang.Override
    public int getCaptureWeaknessCount() {
      return captureWeaknessCount_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 15;
    private int levelId_;
    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      if (captureWeaknessCount_ != 0) {
        output.writeUInt32(10, captureWeaknessCount_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(15, levelId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (captureWeaknessCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, captureWeaknessCount_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq other = (emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq) obj;

      if (getCaptureWeaknessCount()
          != other.getCaptureWeaknessCount()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + CAPTURE_WEAKNESS_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCaptureWeaknessCount();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq prototype) {
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
     * CmdId: 20011
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code MuqadasPotionCaptureWeaknessReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MuqadasPotionCaptureWeaknessReq)
        emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.internal_static_MuqadasPotionCaptureWeaknessReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.internal_static_MuqadasPotionCaptureWeaknessReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq.class, emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        captureWeaknessCount_ = 0;

        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.internal_static_MuqadasPotionCaptureWeaknessReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq build() {
        emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq buildPartial() {
        emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq result = new emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq(this);
        result.captureWeaknessCount_ = captureWeaknessCount_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq other) {
        if (other == emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq.getDefaultInstance()) return this;
        if (other.getCaptureWeaknessCount() != 0) {
          setCaptureWeaknessCount(other.getCaptureWeaknessCount());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
              case 80: {
                captureWeaknessCount_ = input.readUInt32();

                break;
              } // case 80
              case 120: {
                levelId_ = input.readUInt32();

                break;
              } // case 120
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

      private int captureWeaknessCount_ ;
      /**
       * <code>uint32 capture_weakness_count = 10;</code>
       * @return The captureWeaknessCount.
       */
      @java.lang.Override
      public int getCaptureWeaknessCount() {
        return captureWeaknessCount_;
      }
      /**
       * <code>uint32 capture_weakness_count = 10;</code>
       * @param value The captureWeaknessCount to set.
       * @return This builder for chaining.
       */
      public Builder setCaptureWeaknessCount(int value) {
        
        captureWeaknessCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 capture_weakness_count = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCaptureWeaknessCount() {
        
        captureWeaknessCount_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 15;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MuqadasPotionCaptureWeaknessReq)
    }

    // @@protoc_insertion_point(class_scope:MuqadasPotionCaptureWeaknessReq)
    private static final emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq();
    }

    public static emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MuqadasPotionCaptureWeaknessReq>
        PARSER = new com.google.protobuf.AbstractParser<MuqadasPotionCaptureWeaknessReq>() {
      @java.lang.Override
      public MuqadasPotionCaptureWeaknessReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<MuqadasPotionCaptureWeaknessReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MuqadasPotionCaptureWeaknessReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.MuqadasPotionCaptureWeaknessReqOuterClass.MuqadasPotionCaptureWeaknessReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MuqadasPotionCaptureWeaknessReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MuqadasPotionCaptureWeaknessReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%MuqadasPotionCaptureWeaknessReq.proto\"" +
      "S\n\037MuqadasPotionCaptureWeaknessReq\022\036\n\026ca" +
      "pture_weakness_count\030\n \001(\r\022\020\n\010level_id\030\017" +
      " \001(\rB\036\n\034emu.grasscutter.net.oldprotob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MuqadasPotionCaptureWeaknessReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MuqadasPotionCaptureWeaknessReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MuqadasPotionCaptureWeaknessReq_descriptor,
        new java.lang.String[] { "CaptureWeaknessCount", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}