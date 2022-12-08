// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GravenInnocenceCampStageInfo.proto

package emu.grasscutter.net.oldproto;

public final class GravenInnocenceCampStageInfoOuterClass {
  private GravenInnocenceCampStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GravenInnocenceCampStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GravenInnocenceCampStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 15;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 stage_id = 9;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool is_finished = 3;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();
  }
  /**
   * Protobuf type {@code GravenInnocenceCampStageInfo}
   */
  public static final class GravenInnocenceCampStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GravenInnocenceCampStageInfo)
      GravenInnocenceCampStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GravenInnocenceCampStageInfo.newBuilder() to construct.
    private GravenInnocenceCampStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GravenInnocenceCampStageInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GravenInnocenceCampStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.internal_static_GravenInnocenceCampStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.internal_static_GravenInnocenceCampStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo.class, emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo.Builder.class);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 15;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 15;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 10;
    private int levelId_;
    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 9;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 9;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 3;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 3;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
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
      if (isFinished_ != false) {
        output.writeBool(3, isFinished_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(9, stageId_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(10, levelId_);
      }
      if (isOpen_ != false) {
        output.writeBool(15, isOpen_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isFinished_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, stageId_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, levelId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo other = (emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
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
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo prototype) {
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
     * Protobuf type {@code GravenInnocenceCampStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GravenInnocenceCampStageInfo)
        emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.internal_static_GravenInnocenceCampStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.internal_static_GravenInnocenceCampStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo.class, emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isOpen_ = false;

        levelId_ = 0;

        stageId_ = 0;

        isFinished_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.internal_static_GravenInnocenceCampStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo build() {
        emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo buildPartial() {
        emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo result = new emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo(this);
        result.isOpen_ = isOpen_;
        result.levelId_ = levelId_;
        result.stageId_ = stageId_;
        result.isFinished_ = isFinished_;
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
        if (other instanceof emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo other) {
        if (other == emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
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
                isFinished_ = input.readBool();

                break;
              } // case 24
              case 72: {
                stageId_ = input.readUInt32();

                break;
              } // case 72
              case 80: {
                levelId_ = input.readUInt32();

                break;
              } // case 80
              case 120: {
                isOpen_ = input.readBool();

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

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 15;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 15;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 10;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 9;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 9;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 3;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 3;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
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


      // @@protoc_insertion_point(builder_scope:GravenInnocenceCampStageInfo)
    }

    // @@protoc_insertion_point(class_scope:GravenInnocenceCampStageInfo)
    private static final emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo();
    }

    public static emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GravenInnocenceCampStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<GravenInnocenceCampStageInfo>() {
      @java.lang.Override
      public GravenInnocenceCampStageInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<GravenInnocenceCampStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GravenInnocenceCampStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.GravenInnocenceCampStageInfoOuterClass.GravenInnocenceCampStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GravenInnocenceCampStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GravenInnocenceCampStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"GravenInnocenceCampStageInfo.proto\"h\n\034" +
      "GravenInnocenceCampStageInfo\022\017\n\007is_open\030" +
      "\017 \001(\010\022\020\n\010level_id\030\n \001(\r\022\020\n\010stage_id\030\t \001(" +
      "\r\022\023\n\013is_finished\030\003 \001(\010B\036\n\034emu.grasscutte" +
      "r.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GravenInnocenceCampStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GravenInnocenceCampStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GravenInnocenceCampStageInfo_descriptor,
        new java.lang.String[] { "IsOpen", "LevelId", "StageId", "IsFinished", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
