// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyDailyInfo.proto

package emu.grasscutter.net.oldproto;

public final class EffigyDailyInfoOuterClass {
  private EffigyDailyInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EffigyDailyInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EffigyDailyInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_max_score = 6;</code>
     * @return The challengeMaxScore.
     */
    int getChallengeMaxScore();

    /**
     * <code>bool is_first_pass_reward_taken = 12;</code>
     * @return The isFirstPassRewardTaken.
     */
    boolean getIsFirstPassRewardTaken();

    /**
     * <code>uint32 challenge_total_score = 15;</code>
     * @return The challengeTotalScore.
     */
    int getChallengeTotalScore();

    /**
     * <code>uint32 challenge_id = 1;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>uint32 challenge_count = 3;</code>
     * @return The challengeCount.
     */
    int getChallengeCount();

    /**
     * <code>uint32 day_index = 14;</code>
     * @return The dayIndex.
     */
    int getDayIndex();

    /**
     * <code>uint32 begin_time = 2;</code>
     * @return The beginTime.
     */
    int getBeginTime();
  }
  /**
   * Protobuf type {@code EffigyDailyInfo}
   */
  public static final class EffigyDailyInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EffigyDailyInfo)
      EffigyDailyInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EffigyDailyInfo.newBuilder() to construct.
    private EffigyDailyInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EffigyDailyInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EffigyDailyInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.internal_static_EffigyDailyInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.internal_static_EffigyDailyInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo.class, emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo.Builder.class);
    }

    public static final int CHALLENGE_MAX_SCORE_FIELD_NUMBER = 6;
    private int challengeMaxScore_;
    /**
     * <code>uint32 challenge_max_score = 6;</code>
     * @return The challengeMaxScore.
     */
    @java.lang.Override
    public int getChallengeMaxScore() {
      return challengeMaxScore_;
    }

    public static final int IS_FIRST_PASS_REWARD_TAKEN_FIELD_NUMBER = 12;
    private boolean isFirstPassRewardTaken_;
    /**
     * <code>bool is_first_pass_reward_taken = 12;</code>
     * @return The isFirstPassRewardTaken.
     */
    @java.lang.Override
    public boolean getIsFirstPassRewardTaken() {
      return isFirstPassRewardTaken_;
    }

    public static final int CHALLENGE_TOTAL_SCORE_FIELD_NUMBER = 15;
    private int challengeTotalScore_;
    /**
     * <code>uint32 challenge_total_score = 15;</code>
     * @return The challengeTotalScore.
     */
    @java.lang.Override
    public int getChallengeTotalScore() {
      return challengeTotalScore_;
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 1;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 1;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int CHALLENGE_COUNT_FIELD_NUMBER = 3;
    private int challengeCount_;
    /**
     * <code>uint32 challenge_count = 3;</code>
     * @return The challengeCount.
     */
    @java.lang.Override
    public int getChallengeCount() {
      return challengeCount_;
    }

    public static final int DAY_INDEX_FIELD_NUMBER = 14;
    private int dayIndex_;
    /**
     * <code>uint32 day_index = 14;</code>
     * @return The dayIndex.
     */
    @java.lang.Override
    public int getDayIndex() {
      return dayIndex_;
    }

    public static final int BEGIN_TIME_FIELD_NUMBER = 2;
    private int beginTime_;
    /**
     * <code>uint32 begin_time = 2;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public int getBeginTime() {
      return beginTime_;
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
      if (challengeId_ != 0) {
        output.writeUInt32(1, challengeId_);
      }
      if (beginTime_ != 0) {
        output.writeUInt32(2, beginTime_);
      }
      if (challengeCount_ != 0) {
        output.writeUInt32(3, challengeCount_);
      }
      if (challengeMaxScore_ != 0) {
        output.writeUInt32(6, challengeMaxScore_);
      }
      if (isFirstPassRewardTaken_ != false) {
        output.writeBool(12, isFirstPassRewardTaken_);
      }
      if (dayIndex_ != 0) {
        output.writeUInt32(14, dayIndex_);
      }
      if (challengeTotalScore_ != 0) {
        output.writeUInt32(15, challengeTotalScore_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, challengeId_);
      }
      if (beginTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, beginTime_);
      }
      if (challengeCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, challengeCount_);
      }
      if (challengeMaxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, challengeMaxScore_);
      }
      if (isFirstPassRewardTaken_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isFirstPassRewardTaken_);
      }
      if (dayIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, dayIndex_);
      }
      if (challengeTotalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, challengeTotalScore_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo other = (emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo) obj;

      if (getChallengeMaxScore()
          != other.getChallengeMaxScore()) return false;
      if (getIsFirstPassRewardTaken()
          != other.getIsFirstPassRewardTaken()) return false;
      if (getChallengeTotalScore()
          != other.getChallengeTotalScore()) return false;
      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getChallengeCount()
          != other.getChallengeCount()) return false;
      if (getDayIndex()
          != other.getDayIndex()) return false;
      if (getBeginTime()
          != other.getBeginTime()) return false;
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
      hash = (37 * hash) + CHALLENGE_MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeMaxScore();
      hash = (37 * hash) + IS_FIRST_PASS_REWARD_TAKEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFirstPassRewardTaken());
      hash = (37 * hash) + CHALLENGE_TOTAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeTotalScore();
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + CHALLENGE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeCount();
      hash = (37 * hash) + DAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getDayIndex();
      hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getBeginTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo prototype) {
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
     * Protobuf type {@code EffigyDailyInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EffigyDailyInfo)
        emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.internal_static_EffigyDailyInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.internal_static_EffigyDailyInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo.class, emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        challengeMaxScore_ = 0;

        isFirstPassRewardTaken_ = false;

        challengeTotalScore_ = 0;

        challengeId_ = 0;

        challengeCount_ = 0;

        dayIndex_ = 0;

        beginTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.internal_static_EffigyDailyInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo build() {
        emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo buildPartial() {
        emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo result = new emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo(this);
        result.challengeMaxScore_ = challengeMaxScore_;
        result.isFirstPassRewardTaken_ = isFirstPassRewardTaken_;
        result.challengeTotalScore_ = challengeTotalScore_;
        result.challengeId_ = challengeId_;
        result.challengeCount_ = challengeCount_;
        result.dayIndex_ = dayIndex_;
        result.beginTime_ = beginTime_;
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
        if (other instanceof emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo other) {
        if (other == emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo.getDefaultInstance()) return this;
        if (other.getChallengeMaxScore() != 0) {
          setChallengeMaxScore(other.getChallengeMaxScore());
        }
        if (other.getIsFirstPassRewardTaken() != false) {
          setIsFirstPassRewardTaken(other.getIsFirstPassRewardTaken());
        }
        if (other.getChallengeTotalScore() != 0) {
          setChallengeTotalScore(other.getChallengeTotalScore());
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getChallengeCount() != 0) {
          setChallengeCount(other.getChallengeCount());
        }
        if (other.getDayIndex() != 0) {
          setDayIndex(other.getDayIndex());
        }
        if (other.getBeginTime() != 0) {
          setBeginTime(other.getBeginTime());
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
                challengeId_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                beginTime_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                challengeCount_ = input.readUInt32();

                break;
              } // case 24
              case 48: {
                challengeMaxScore_ = input.readUInt32();

                break;
              } // case 48
              case 96: {
                isFirstPassRewardTaken_ = input.readBool();

                break;
              } // case 96
              case 112: {
                dayIndex_ = input.readUInt32();

                break;
              } // case 112
              case 120: {
                challengeTotalScore_ = input.readUInt32();

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

      private int challengeMaxScore_ ;
      /**
       * <code>uint32 challenge_max_score = 6;</code>
       * @return The challengeMaxScore.
       */
      @java.lang.Override
      public int getChallengeMaxScore() {
        return challengeMaxScore_;
      }
      /**
       * <code>uint32 challenge_max_score = 6;</code>
       * @param value The challengeMaxScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeMaxScore(int value) {
        
        challengeMaxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_max_score = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeMaxScore() {
        
        challengeMaxScore_ = 0;
        onChanged();
        return this;
      }

      private boolean isFirstPassRewardTaken_ ;
      /**
       * <code>bool is_first_pass_reward_taken = 12;</code>
       * @return The isFirstPassRewardTaken.
       */
      @java.lang.Override
      public boolean getIsFirstPassRewardTaken() {
        return isFirstPassRewardTaken_;
      }
      /**
       * <code>bool is_first_pass_reward_taken = 12;</code>
       * @param value The isFirstPassRewardTaken to set.
       * @return This builder for chaining.
       */
      public Builder setIsFirstPassRewardTaken(boolean value) {
        
        isFirstPassRewardTaken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_first_pass_reward_taken = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFirstPassRewardTaken() {
        
        isFirstPassRewardTaken_ = false;
        onChanged();
        return this;
      }

      private int challengeTotalScore_ ;
      /**
       * <code>uint32 challenge_total_score = 15;</code>
       * @return The challengeTotalScore.
       */
      @java.lang.Override
      public int getChallengeTotalScore() {
        return challengeTotalScore_;
      }
      /**
       * <code>uint32 challenge_total_score = 15;</code>
       * @param value The challengeTotalScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeTotalScore(int value) {
        
        challengeTotalScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_total_score = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeTotalScore() {
        
        challengeTotalScore_ = 0;
        onChanged();
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 1;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 1;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int challengeCount_ ;
      /**
       * <code>uint32 challenge_count = 3;</code>
       * @return The challengeCount.
       */
      @java.lang.Override
      public int getChallengeCount() {
        return challengeCount_;
      }
      /**
       * <code>uint32 challenge_count = 3;</code>
       * @param value The challengeCount to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeCount(int value) {
        
        challengeCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_count = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeCount() {
        
        challengeCount_ = 0;
        onChanged();
        return this;
      }

      private int dayIndex_ ;
      /**
       * <code>uint32 day_index = 14;</code>
       * @return The dayIndex.
       */
      @java.lang.Override
      public int getDayIndex() {
        return dayIndex_;
      }
      /**
       * <code>uint32 day_index = 14;</code>
       * @param value The dayIndex to set.
       * @return This builder for chaining.
       */
      public Builder setDayIndex(int value) {
        
        dayIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 day_index = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearDayIndex() {
        
        dayIndex_ = 0;
        onChanged();
        return this;
      }

      private int beginTime_ ;
      /**
       * <code>uint32 begin_time = 2;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public int getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>uint32 begin_time = 2;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(int value) {
        
        beginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 begin_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        
        beginTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EffigyDailyInfo)
    }

    // @@protoc_insertion_point(class_scope:EffigyDailyInfo)
    private static final emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo();
    }

    public static emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EffigyDailyInfo>
        PARSER = new com.google.protobuf.AbstractParser<EffigyDailyInfo>() {
      @java.lang.Override
      public EffigyDailyInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<EffigyDailyInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EffigyDailyInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.EffigyDailyInfoOuterClass.EffigyDailyInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EffigyDailyInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EffigyDailyInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025EffigyDailyInfo.proto\"\307\001\n\017EffigyDailyI" +
      "nfo\022\033\n\023challenge_max_score\030\006 \001(\r\022\"\n\032is_f" +
      "irst_pass_reward_taken\030\014 \001(\010\022\035\n\025challeng" +
      "e_total_score\030\017 \001(\r\022\024\n\014challenge_id\030\001 \001(" +
      "\r\022\027\n\017challenge_count\030\003 \001(\r\022\021\n\tday_index\030" +
      "\016 \001(\r\022\022\n\nbegin_time\030\002 \001(\rB\036\n\034emu.grasscu" +
      "tter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EffigyDailyInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EffigyDailyInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EffigyDailyInfo_descriptor,
        new java.lang.String[] { "ChallengeMaxScore", "IsFirstPassRewardTaken", "ChallengeTotalScore", "ChallengeId", "ChallengeCount", "DayIndex", "BeginTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
