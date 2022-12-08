// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabLoopDungeonResultInfo.proto

package emu.grasscutter.net.newproto;

public final class ChannelerSlabLoopDungeonResultInfoOuterClass {
  private ChannelerSlabLoopDungeonResultInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelerSlabLoopDungeonResultInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelerSlabLoopDungeonResultInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_index = 7;</code>
     * @return The dungeonIndex.
     */
    int getDungeonIndex();

    /**
     * <code>uint32 challenge_score = 5;</code>
     * @return The challengeScore.
     */
    int getChallengeScore();

    /**
     * <code>bool is_in_time_limit = 8;</code>
     * @return The isInTimeLimit.
     */
    boolean getIsInTimeLimit();

    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 challenge_max_score = 13;</code>
     * @return The challengeMaxScore.
     */
    int getChallengeMaxScore();
  }
  /**
   * Protobuf type {@code ChannelerSlabLoopDungeonResultInfo}
   */
  public static final class ChannelerSlabLoopDungeonResultInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelerSlabLoopDungeonResultInfo)
      ChannelerSlabLoopDungeonResultInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelerSlabLoopDungeonResultInfo.newBuilder() to construct.
    private ChannelerSlabLoopDungeonResultInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelerSlabLoopDungeonResultInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelerSlabLoopDungeonResultInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannelerSlabLoopDungeonResultInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannelerSlabLoopDungeonResultInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.class, emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.Builder.class);
    }

    public static final int DUNGEON_INDEX_FIELD_NUMBER = 7;
    private int dungeonIndex_;
    /**
     * <code>uint32 dungeon_index = 7;</code>
     * @return The dungeonIndex.
     */
    @java.lang.Override
    public int getDungeonIndex() {
      return dungeonIndex_;
    }

    public static final int CHALLENGE_SCORE_FIELD_NUMBER = 5;
    private int challengeScore_;
    /**
     * <code>uint32 challenge_score = 5;</code>
     * @return The challengeScore.
     */
    @java.lang.Override
    public int getChallengeScore() {
      return challengeScore_;
    }

    public static final int IS_IN_TIME_LIMIT_FIELD_NUMBER = 8;
    private boolean isInTimeLimit_;
    /**
     * <code>bool is_in_time_limit = 8;</code>
     * @return The isInTimeLimit.
     */
    @java.lang.Override
    public boolean getIsInTimeLimit() {
      return isInTimeLimit_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 12;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int CHALLENGE_MAX_SCORE_FIELD_NUMBER = 13;
    private int challengeMaxScore_;
    /**
     * <code>uint32 challenge_max_score = 13;</code>
     * @return The challengeMaxScore.
     */
    @java.lang.Override
    public int getChallengeMaxScore() {
      return challengeMaxScore_;
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
      if (challengeScore_ != 0) {
        output.writeUInt32(5, challengeScore_);
      }
      if (dungeonIndex_ != 0) {
        output.writeUInt32(7, dungeonIndex_);
      }
      if (isInTimeLimit_ != false) {
        output.writeBool(8, isInTimeLimit_);
      }
      if (isSuccess_ != false) {
        output.writeBool(12, isSuccess_);
      }
      if (challengeMaxScore_ != 0) {
        output.writeUInt32(13, challengeMaxScore_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, challengeScore_);
      }
      if (dungeonIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, dungeonIndex_);
      }
      if (isInTimeLimit_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isInTimeLimit_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isSuccess_);
      }
      if (challengeMaxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, challengeMaxScore_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo other = (emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo) obj;

      if (getDungeonIndex()
          != other.getDungeonIndex()) return false;
      if (getChallengeScore()
          != other.getChallengeScore()) return false;
      if (getIsInTimeLimit()
          != other.getIsInTimeLimit()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getChallengeMaxScore()
          != other.getChallengeMaxScore()) return false;
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
      hash = (37 * hash) + DUNGEON_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonIndex();
      hash = (37 * hash) + CHALLENGE_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeScore();
      hash = (37 * hash) + IS_IN_TIME_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsInTimeLimit());
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + CHALLENGE_MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeMaxScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo prototype) {
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
     * Protobuf type {@code ChannelerSlabLoopDungeonResultInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelerSlabLoopDungeonResultInfo)
        emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannelerSlabLoopDungeonResultInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannelerSlabLoopDungeonResultInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.class, emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dungeonIndex_ = 0;

        challengeScore_ = 0;

        isInTimeLimit_ = false;

        isSuccess_ = false;

        challengeMaxScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannelerSlabLoopDungeonResultInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo build() {
        emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo buildPartial() {
        emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo result = new emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo(this);
        result.dungeonIndex_ = dungeonIndex_;
        result.challengeScore_ = challengeScore_;
        result.isInTimeLimit_ = isInTimeLimit_;
        result.isSuccess_ = isSuccess_;
        result.challengeMaxScore_ = challengeMaxScore_;
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
        if (other instanceof emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo other) {
        if (other == emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance()) return this;
        if (other.getDungeonIndex() != 0) {
          setDungeonIndex(other.getDungeonIndex());
        }
        if (other.getChallengeScore() != 0) {
          setChallengeScore(other.getChallengeScore());
        }
        if (other.getIsInTimeLimit() != false) {
          setIsInTimeLimit(other.getIsInTimeLimit());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getChallengeMaxScore() != 0) {
          setChallengeMaxScore(other.getChallengeMaxScore());
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
                challengeScore_ = input.readUInt32();

                break;
              } // case 40
              case 56: {
                dungeonIndex_ = input.readUInt32();

                break;
              } // case 56
              case 64: {
                isInTimeLimit_ = input.readBool();

                break;
              } // case 64
              case 96: {
                isSuccess_ = input.readBool();

                break;
              } // case 96
              case 104: {
                challengeMaxScore_ = input.readUInt32();

                break;
              } // case 104
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

      private int dungeonIndex_ ;
      /**
       * <code>uint32 dungeon_index = 7;</code>
       * @return The dungeonIndex.
       */
      @java.lang.Override
      public int getDungeonIndex() {
        return dungeonIndex_;
      }
      /**
       * <code>uint32 dungeon_index = 7;</code>
       * @param value The dungeonIndex to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonIndex(int value) {
        
        dungeonIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_index = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonIndex() {
        
        dungeonIndex_ = 0;
        onChanged();
        return this;
      }

      private int challengeScore_ ;
      /**
       * <code>uint32 challenge_score = 5;</code>
       * @return The challengeScore.
       */
      @java.lang.Override
      public int getChallengeScore() {
        return challengeScore_;
      }
      /**
       * <code>uint32 challenge_score = 5;</code>
       * @param value The challengeScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeScore(int value) {
        
        challengeScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_score = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeScore() {
        
        challengeScore_ = 0;
        onChanged();
        return this;
      }

      private boolean isInTimeLimit_ ;
      /**
       * <code>bool is_in_time_limit = 8;</code>
       * @return The isInTimeLimit.
       */
      @java.lang.Override
      public boolean getIsInTimeLimit() {
        return isInTimeLimit_;
      }
      /**
       * <code>bool is_in_time_limit = 8;</code>
       * @param value The isInTimeLimit to set.
       * @return This builder for chaining.
       */
      public Builder setIsInTimeLimit(boolean value) {
        
        isInTimeLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_in_time_limit = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsInTimeLimit() {
        
        isInTimeLimit_ = false;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 12;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 12;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int challengeMaxScore_ ;
      /**
       * <code>uint32 challenge_max_score = 13;</code>
       * @return The challengeMaxScore.
       */
      @java.lang.Override
      public int getChallengeMaxScore() {
        return challengeMaxScore_;
      }
      /**
       * <code>uint32 challenge_max_score = 13;</code>
       * @param value The challengeMaxScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeMaxScore(int value) {
        
        challengeMaxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_max_score = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeMaxScore() {
        
        challengeMaxScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChannelerSlabLoopDungeonResultInfo)
    }

    // @@protoc_insertion_point(class_scope:ChannelerSlabLoopDungeonResultInfo)
    private static final emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo();
    }

    public static emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelerSlabLoopDungeonResultInfo>
        PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabLoopDungeonResultInfo>() {
      @java.lang.Override
      public ChannelerSlabLoopDungeonResultInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChannelerSlabLoopDungeonResultInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelerSlabLoopDungeonResultInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabLoopDungeonResultInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabLoopDungeonResultInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(ChannelerSlabLoopDungeonResultInfo.pro" +
      "to\"\237\001\n\"ChannelerSlabLoopDungeonResultInf" +
      "o\022\025\n\rdungeon_index\030\007 \001(\r\022\027\n\017challenge_sc" +
      "ore\030\005 \001(\r\022\030\n\020is_in_time_limit\030\010 \001(\010\022\022\n\ni" +
      "s_success\030\014 \001(\010\022\033\n\023challenge_max_score\030\r" +
      " \001(\rB\036\n\034emu.grasscutter.net.newprotob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannelerSlabLoopDungeonResultInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelerSlabLoopDungeonResultInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabLoopDungeonResultInfo_descriptor,
        new java.lang.String[] { "DungeonIndex", "ChallengeScore", "IsInTimeLimit", "IsSuccess", "ChallengeMaxScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
