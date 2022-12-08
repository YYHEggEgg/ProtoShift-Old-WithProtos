// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PotionLevelData.proto

package emu.grasscutter.net.oldproto;

public final class PotionLevelDataOuterClass {
  private PotionLevelDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PotionLevelDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PotionLevelData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 score = 7;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 mode_id = 5;</code>
     * @return The modeId.
     */
    int getModeId();

    /**
     * <code>uint32 difficulty_level = 2;</code>
     * @return The difficultyLevel.
     */
    int getDifficultyLevel();
  }
  /**
   * Protobuf type {@code PotionLevelData}
   */
  public static final class PotionLevelData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PotionLevelData)
      PotionLevelDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PotionLevelData.newBuilder() to construct.
    private PotionLevelData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PotionLevelData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PotionLevelData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.internal_static_PotionLevelData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.internal_static_PotionLevelData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData.class, emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData.Builder.class);
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

    public static final int SCORE_FIELD_NUMBER = 7;
    private int score_;
    /**
     * <code>uint32 score = 7;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int MODE_ID_FIELD_NUMBER = 5;
    private int modeId_;
    /**
     * <code>uint32 mode_id = 5;</code>
     * @return The modeId.
     */
    @java.lang.Override
    public int getModeId() {
      return modeId_;
    }

    public static final int DIFFICULTY_LEVEL_FIELD_NUMBER = 2;
    private int difficultyLevel_;
    /**
     * <code>uint32 difficulty_level = 2;</code>
     * @return The difficultyLevel.
     */
    @java.lang.Override
    public int getDifficultyLevel() {
      return difficultyLevel_;
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
      if (difficultyLevel_ != 0) {
        output.writeUInt32(2, difficultyLevel_);
      }
      if (modeId_ != 0) {
        output.writeUInt32(5, modeId_);
      }
      if (score_ != 0) {
        output.writeUInt32(7, score_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(10, levelId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficultyLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, difficultyLevel_);
      }
      if (modeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, modeId_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, score_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData other = (emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getModeId()
          != other.getModeId()) return false;
      if (getDifficultyLevel()
          != other.getDifficultyLevel()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + MODE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getModeId();
      hash = (37 * hash) + DIFFICULTY_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyLevel();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData prototype) {
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
     * Protobuf type {@code PotionLevelData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PotionLevelData)
        emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.internal_static_PotionLevelData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.internal_static_PotionLevelData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData.class, emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        levelId_ = 0;

        score_ = 0;

        modeId_ = 0;

        difficultyLevel_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.internal_static_PotionLevelData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData build() {
        emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData buildPartial() {
        emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData result = new emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData(this);
        result.levelId_ = levelId_;
        result.score_ = score_;
        result.modeId_ = modeId_;
        result.difficultyLevel_ = difficultyLevel_;
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
        if (other instanceof emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData) {
          return mergeFrom((emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData other) {
        if (other == emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getModeId() != 0) {
          setModeId(other.getModeId());
        }
        if (other.getDifficultyLevel() != 0) {
          setDifficultyLevel(other.getDifficultyLevel());
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
                difficultyLevel_ = input.readUInt32();

                break;
              } // case 16
              case 40: {
                modeId_ = input.readUInt32();

                break;
              } // case 40
              case 56: {
                score_ = input.readUInt32();

                break;
              } // case 56
              case 80: {
                levelId_ = input.readUInt32();

                break;
              } // case 80
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

      private int score_ ;
      /**
       * <code>uint32 score = 7;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 7;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int modeId_ ;
      /**
       * <code>uint32 mode_id = 5;</code>
       * @return The modeId.
       */
      @java.lang.Override
      public int getModeId() {
        return modeId_;
      }
      /**
       * <code>uint32 mode_id = 5;</code>
       * @param value The modeId to set.
       * @return This builder for chaining.
       */
      public Builder setModeId(int value) {
        
        modeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mode_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearModeId() {
        
        modeId_ = 0;
        onChanged();
        return this;
      }

      private int difficultyLevel_ ;
      /**
       * <code>uint32 difficulty_level = 2;</code>
       * @return The difficultyLevel.
       */
      @java.lang.Override
      public int getDifficultyLevel() {
        return difficultyLevel_;
      }
      /**
       * <code>uint32 difficulty_level = 2;</code>
       * @param value The difficultyLevel to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyLevel(int value) {
        
        difficultyLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_level = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyLevel() {
        
        difficultyLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PotionLevelData)
    }

    // @@protoc_insertion_point(class_scope:PotionLevelData)
    private static final emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData();
    }

    public static emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PotionLevelData>
        PARSER = new com.google.protobuf.AbstractParser<PotionLevelData>() {
      @java.lang.Override
      public PotionLevelData parsePartialFrom(
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

    public static com.google.protobuf.Parser<PotionLevelData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PotionLevelData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.PotionLevelDataOuterClass.PotionLevelData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PotionLevelData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PotionLevelData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025PotionLevelData.proto\"]\n\017PotionLevelDa" +
      "ta\022\020\n\010level_id\030\n \001(\r\022\r\n\005score\030\007 \001(\r\022\017\n\007m" +
      "ode_id\030\005 \001(\r\022\030\n\020difficulty_level\030\002 \001(\rB\036" +
      "\n\034emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PotionLevelData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PotionLevelData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PotionLevelData_descriptor,
        new java.lang.String[] { "LevelId", "Score", "ModeId", "DifficultyLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
