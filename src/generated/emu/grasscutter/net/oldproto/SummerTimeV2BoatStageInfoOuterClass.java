// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SummerTimeV2BoatStageInfo.proto

package emu.grasscutter.net.oldproto;

public final class SummerTimeV2BoatStageInfoOuterClass {
  private SummerTimeV2BoatStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SummerTimeV2BoatStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SummerTimeV2BoatStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 open_time = 7;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>bool is_open = 14;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 stage_id = 10;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 best_score = 13;</code>
     * @return The bestScore.
     */
    int getBestScore();
  }
  /**
   * Protobuf type {@code SummerTimeV2BoatStageInfo}
   */
  public static final class SummerTimeV2BoatStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SummerTimeV2BoatStageInfo)
      SummerTimeV2BoatStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SummerTimeV2BoatStageInfo.newBuilder() to construct.
    private SummerTimeV2BoatStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SummerTimeV2BoatStageInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SummerTimeV2BoatStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.internal_static_SummerTimeV2BoatStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.internal_static_SummerTimeV2BoatStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo.class, emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo.Builder.class);
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 7;
    private int openTime_;
    /**
     * <code>uint32 open_time = 7;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 14;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 14;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 10;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 10;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int BEST_SCORE_FIELD_NUMBER = 13;
    private int bestScore_;
    /**
     * <code>uint32 best_score = 13;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
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
      if (openTime_ != 0) {
        output.writeUInt32(7, openTime_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(10, stageId_);
      }
      if (bestScore_ != 0) {
        output.writeUInt32(13, bestScore_);
      }
      if (isOpen_ != false) {
        output.writeBool(14, isOpen_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, openTime_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, stageId_);
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, bestScore_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo other = (emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo) obj;

      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getBestScore()
          != other.getBestScore()) return false;
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
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo prototype) {
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
     * Protobuf type {@code SummerTimeV2BoatStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SummerTimeV2BoatStageInfo)
        emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.internal_static_SummerTimeV2BoatStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.internal_static_SummerTimeV2BoatStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo.class, emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        openTime_ = 0;

        isOpen_ = false;

        stageId_ = 0;

        bestScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.internal_static_SummerTimeV2BoatStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo build() {
        emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo buildPartial() {
        emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo result = new emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo(this);
        result.openTime_ = openTime_;
        result.isOpen_ = isOpen_;
        result.stageId_ = stageId_;
        result.bestScore_ = bestScore_;
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
        if (other instanceof emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo other) {
        if (other == emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo.getDefaultInstance()) return this;
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
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
                openTime_ = input.readUInt32();

                break;
              } // case 56
              case 80: {
                stageId_ = input.readUInt32();

                break;
              } // case 80
              case 104: {
                bestScore_ = input.readUInt32();

                break;
              } // case 104
              case 112: {
                isOpen_ = input.readBool();

                break;
              } // case 112
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

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 7;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 7;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 14;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 14;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 10;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 10;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 13;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 13;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        
        bestScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SummerTimeV2BoatStageInfo)
    }

    // @@protoc_insertion_point(class_scope:SummerTimeV2BoatStageInfo)
    private static final emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo();
    }

    public static emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SummerTimeV2BoatStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<SummerTimeV2BoatStageInfo>() {
      @java.lang.Override
      public SummerTimeV2BoatStageInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SummerTimeV2BoatStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SummerTimeV2BoatStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SummerTimeV2BoatStageInfoOuterClass.SummerTimeV2BoatStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SummerTimeV2BoatStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SummerTimeV2BoatStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037SummerTimeV2BoatStageInfo.proto\"e\n\031Sum" +
      "merTimeV2BoatStageInfo\022\021\n\topen_time\030\007 \001(" +
      "\r\022\017\n\007is_open\030\016 \001(\010\022\020\n\010stage_id\030\n \001(\r\022\022\n\n" +
      "best_score\030\r \001(\rB\036\n\034emu.grasscutter.net." +
      "oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SummerTimeV2BoatStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SummerTimeV2BoatStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SummerTimeV2BoatStageInfo_descriptor,
        new java.lang.String[] { "OpenTime", "IsOpen", "StageId", "BestScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
