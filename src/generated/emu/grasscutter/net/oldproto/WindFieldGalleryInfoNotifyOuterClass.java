// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WindFieldGalleryInfoNotify.proto

package emu.grasscutter.net.oldproto;

public final class WindFieldGalleryInfoNotifyOuterClass {
  private WindFieldGalleryInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WindFieldGalleryInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WindFieldGalleryInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 show_id = 3;</code>
     * @return The showId.
     */
    int getShowId();

    /**
     * <code>uint32 killed_monster_num = 7;</code>
     * @return The killedMonsterNum.
     */
    int getKilledMonsterNum();

    /**
     * <code>uint32 coin_num = 9;</code>
     * @return The coinNum.
     */
    int getCoinNum();

    /**
     * <code>uint32 challenge_ball_max_count = 1;</code>
     * @return The challengeBallMaxCount.
     */
    int getChallengeBallMaxCount();

    /**
     * <code>uint32 challenge_total_time = 5;</code>
     * @return The challengeTotalTime.
     */
    int getChallengeTotalTime();

    /**
     * <code>uint32 challenge_ball_cur_count = 10;</code>
     * @return The challengeBallCurCount.
     */
    int getChallengeBallCurCount();

    /**
     * <code>uint32 challenge_timestamp = 4;</code>
     * @return The challengeTimestamp.
     */
    int getChallengeTimestamp();

    /**
     * <code>uint32 element_ball_num = 14;</code>
     * @return The elementBallNum.
     */
    int getElementBallNum();
  }
  /**
   * <pre>
   * CmdId: 5526
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code WindFieldGalleryInfoNotify}
   */
  public static final class WindFieldGalleryInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WindFieldGalleryInfoNotify)
      WindFieldGalleryInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WindFieldGalleryInfoNotify.newBuilder() to construct.
    private WindFieldGalleryInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WindFieldGalleryInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WindFieldGalleryInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.internal_static_WindFieldGalleryInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.internal_static_WindFieldGalleryInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify.class, emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify.Builder.class);
    }

    public static final int SHOW_ID_FIELD_NUMBER = 3;
    private int showId_;
    /**
     * <code>uint32 show_id = 3;</code>
     * @return The showId.
     */
    @java.lang.Override
    public int getShowId() {
      return showId_;
    }

    public static final int KILLED_MONSTER_NUM_FIELD_NUMBER = 7;
    private int killedMonsterNum_;
    /**
     * <code>uint32 killed_monster_num = 7;</code>
     * @return The killedMonsterNum.
     */
    @java.lang.Override
    public int getKilledMonsterNum() {
      return killedMonsterNum_;
    }

    public static final int COIN_NUM_FIELD_NUMBER = 9;
    private int coinNum_;
    /**
     * <code>uint32 coin_num = 9;</code>
     * @return The coinNum.
     */
    @java.lang.Override
    public int getCoinNum() {
      return coinNum_;
    }

    public static final int CHALLENGE_BALL_MAX_COUNT_FIELD_NUMBER = 1;
    private int challengeBallMaxCount_;
    /**
     * <code>uint32 challenge_ball_max_count = 1;</code>
     * @return The challengeBallMaxCount.
     */
    @java.lang.Override
    public int getChallengeBallMaxCount() {
      return challengeBallMaxCount_;
    }

    public static final int CHALLENGE_TOTAL_TIME_FIELD_NUMBER = 5;
    private int challengeTotalTime_;
    /**
     * <code>uint32 challenge_total_time = 5;</code>
     * @return The challengeTotalTime.
     */
    @java.lang.Override
    public int getChallengeTotalTime() {
      return challengeTotalTime_;
    }

    public static final int CHALLENGE_BALL_CUR_COUNT_FIELD_NUMBER = 10;
    private int challengeBallCurCount_;
    /**
     * <code>uint32 challenge_ball_cur_count = 10;</code>
     * @return The challengeBallCurCount.
     */
    @java.lang.Override
    public int getChallengeBallCurCount() {
      return challengeBallCurCount_;
    }

    public static final int CHALLENGE_TIMESTAMP_FIELD_NUMBER = 4;
    private int challengeTimestamp_;
    /**
     * <code>uint32 challenge_timestamp = 4;</code>
     * @return The challengeTimestamp.
     */
    @java.lang.Override
    public int getChallengeTimestamp() {
      return challengeTimestamp_;
    }

    public static final int ELEMENT_BALL_NUM_FIELD_NUMBER = 14;
    private int elementBallNum_;
    /**
     * <code>uint32 element_ball_num = 14;</code>
     * @return The elementBallNum.
     */
    @java.lang.Override
    public int getElementBallNum() {
      return elementBallNum_;
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
      if (challengeBallMaxCount_ != 0) {
        output.writeUInt32(1, challengeBallMaxCount_);
      }
      if (showId_ != 0) {
        output.writeUInt32(3, showId_);
      }
      if (challengeTimestamp_ != 0) {
        output.writeUInt32(4, challengeTimestamp_);
      }
      if (challengeTotalTime_ != 0) {
        output.writeUInt32(5, challengeTotalTime_);
      }
      if (killedMonsterNum_ != 0) {
        output.writeUInt32(7, killedMonsterNum_);
      }
      if (coinNum_ != 0) {
        output.writeUInt32(9, coinNum_);
      }
      if (challengeBallCurCount_ != 0) {
        output.writeUInt32(10, challengeBallCurCount_);
      }
      if (elementBallNum_ != 0) {
        output.writeUInt32(14, elementBallNum_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeBallMaxCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, challengeBallMaxCount_);
      }
      if (showId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, showId_);
      }
      if (challengeTimestamp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, challengeTimestamp_);
      }
      if (challengeTotalTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, challengeTotalTime_);
      }
      if (killedMonsterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, killedMonsterNum_);
      }
      if (coinNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, coinNum_);
      }
      if (challengeBallCurCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, challengeBallCurCount_);
      }
      if (elementBallNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, elementBallNum_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify other = (emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify) obj;

      if (getShowId()
          != other.getShowId()) return false;
      if (getKilledMonsterNum()
          != other.getKilledMonsterNum()) return false;
      if (getCoinNum()
          != other.getCoinNum()) return false;
      if (getChallengeBallMaxCount()
          != other.getChallengeBallMaxCount()) return false;
      if (getChallengeTotalTime()
          != other.getChallengeTotalTime()) return false;
      if (getChallengeBallCurCount()
          != other.getChallengeBallCurCount()) return false;
      if (getChallengeTimestamp()
          != other.getChallengeTimestamp()) return false;
      if (getElementBallNum()
          != other.getElementBallNum()) return false;
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
      hash = (37 * hash) + SHOW_ID_FIELD_NUMBER;
      hash = (53 * hash) + getShowId();
      hash = (37 * hash) + KILLED_MONSTER_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getKilledMonsterNum();
      hash = (37 * hash) + COIN_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getCoinNum();
      hash = (37 * hash) + CHALLENGE_BALL_MAX_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeBallMaxCount();
      hash = (37 * hash) + CHALLENGE_TOTAL_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeTotalTime();
      hash = (37 * hash) + CHALLENGE_BALL_CUR_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeBallCurCount();
      hash = (37 * hash) + CHALLENGE_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeTimestamp();
      hash = (37 * hash) + ELEMENT_BALL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getElementBallNum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify prototype) {
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
     * CmdId: 5526
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code WindFieldGalleryInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WindFieldGalleryInfoNotify)
        emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.internal_static_WindFieldGalleryInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.internal_static_WindFieldGalleryInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify.class, emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        showId_ = 0;

        killedMonsterNum_ = 0;

        coinNum_ = 0;

        challengeBallMaxCount_ = 0;

        challengeTotalTime_ = 0;

        challengeBallCurCount_ = 0;

        challengeTimestamp_ = 0;

        elementBallNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.internal_static_WindFieldGalleryInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify build() {
        emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify buildPartial() {
        emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify result = new emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify(this);
        result.showId_ = showId_;
        result.killedMonsterNum_ = killedMonsterNum_;
        result.coinNum_ = coinNum_;
        result.challengeBallMaxCount_ = challengeBallMaxCount_;
        result.challengeTotalTime_ = challengeTotalTime_;
        result.challengeBallCurCount_ = challengeBallCurCount_;
        result.challengeTimestamp_ = challengeTimestamp_;
        result.elementBallNum_ = elementBallNum_;
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
        if (other instanceof emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify other) {
        if (other == emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify.getDefaultInstance()) return this;
        if (other.getShowId() != 0) {
          setShowId(other.getShowId());
        }
        if (other.getKilledMonsterNum() != 0) {
          setKilledMonsterNum(other.getKilledMonsterNum());
        }
        if (other.getCoinNum() != 0) {
          setCoinNum(other.getCoinNum());
        }
        if (other.getChallengeBallMaxCount() != 0) {
          setChallengeBallMaxCount(other.getChallengeBallMaxCount());
        }
        if (other.getChallengeTotalTime() != 0) {
          setChallengeTotalTime(other.getChallengeTotalTime());
        }
        if (other.getChallengeBallCurCount() != 0) {
          setChallengeBallCurCount(other.getChallengeBallCurCount());
        }
        if (other.getChallengeTimestamp() != 0) {
          setChallengeTimestamp(other.getChallengeTimestamp());
        }
        if (other.getElementBallNum() != 0) {
          setElementBallNum(other.getElementBallNum());
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
                challengeBallMaxCount_ = input.readUInt32();

                break;
              } // case 8
              case 24: {
                showId_ = input.readUInt32();

                break;
              } // case 24
              case 32: {
                challengeTimestamp_ = input.readUInt32();

                break;
              } // case 32
              case 40: {
                challengeTotalTime_ = input.readUInt32();

                break;
              } // case 40
              case 56: {
                killedMonsterNum_ = input.readUInt32();

                break;
              } // case 56
              case 72: {
                coinNum_ = input.readUInt32();

                break;
              } // case 72
              case 80: {
                challengeBallCurCount_ = input.readUInt32();

                break;
              } // case 80
              case 112: {
                elementBallNum_ = input.readUInt32();

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

      private int showId_ ;
      /**
       * <code>uint32 show_id = 3;</code>
       * @return The showId.
       */
      @java.lang.Override
      public int getShowId() {
        return showId_;
      }
      /**
       * <code>uint32 show_id = 3;</code>
       * @param value The showId to set.
       * @return This builder for chaining.
       */
      public Builder setShowId(int value) {
        
        showId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 show_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearShowId() {
        
        showId_ = 0;
        onChanged();
        return this;
      }

      private int killedMonsterNum_ ;
      /**
       * <code>uint32 killed_monster_num = 7;</code>
       * @return The killedMonsterNum.
       */
      @java.lang.Override
      public int getKilledMonsterNum() {
        return killedMonsterNum_;
      }
      /**
       * <code>uint32 killed_monster_num = 7;</code>
       * @param value The killedMonsterNum to set.
       * @return This builder for chaining.
       */
      public Builder setKilledMonsterNum(int value) {
        
        killedMonsterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 killed_monster_num = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearKilledMonsterNum() {
        
        killedMonsterNum_ = 0;
        onChanged();
        return this;
      }

      private int coinNum_ ;
      /**
       * <code>uint32 coin_num = 9;</code>
       * @return The coinNum.
       */
      @java.lang.Override
      public int getCoinNum() {
        return coinNum_;
      }
      /**
       * <code>uint32 coin_num = 9;</code>
       * @param value The coinNum to set.
       * @return This builder for chaining.
       */
      public Builder setCoinNum(int value) {
        
        coinNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin_num = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoinNum() {
        
        coinNum_ = 0;
        onChanged();
        return this;
      }

      private int challengeBallMaxCount_ ;
      /**
       * <code>uint32 challenge_ball_max_count = 1;</code>
       * @return The challengeBallMaxCount.
       */
      @java.lang.Override
      public int getChallengeBallMaxCount() {
        return challengeBallMaxCount_;
      }
      /**
       * <code>uint32 challenge_ball_max_count = 1;</code>
       * @param value The challengeBallMaxCount to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeBallMaxCount(int value) {
        
        challengeBallMaxCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_ball_max_count = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeBallMaxCount() {
        
        challengeBallMaxCount_ = 0;
        onChanged();
        return this;
      }

      private int challengeTotalTime_ ;
      /**
       * <code>uint32 challenge_total_time = 5;</code>
       * @return The challengeTotalTime.
       */
      @java.lang.Override
      public int getChallengeTotalTime() {
        return challengeTotalTime_;
      }
      /**
       * <code>uint32 challenge_total_time = 5;</code>
       * @param value The challengeTotalTime to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeTotalTime(int value) {
        
        challengeTotalTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_total_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeTotalTime() {
        
        challengeTotalTime_ = 0;
        onChanged();
        return this;
      }

      private int challengeBallCurCount_ ;
      /**
       * <code>uint32 challenge_ball_cur_count = 10;</code>
       * @return The challengeBallCurCount.
       */
      @java.lang.Override
      public int getChallengeBallCurCount() {
        return challengeBallCurCount_;
      }
      /**
       * <code>uint32 challenge_ball_cur_count = 10;</code>
       * @param value The challengeBallCurCount to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeBallCurCount(int value) {
        
        challengeBallCurCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_ball_cur_count = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeBallCurCount() {
        
        challengeBallCurCount_ = 0;
        onChanged();
        return this;
      }

      private int challengeTimestamp_ ;
      /**
       * <code>uint32 challenge_timestamp = 4;</code>
       * @return The challengeTimestamp.
       */
      @java.lang.Override
      public int getChallengeTimestamp() {
        return challengeTimestamp_;
      }
      /**
       * <code>uint32 challenge_timestamp = 4;</code>
       * @param value The challengeTimestamp to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeTimestamp(int value) {
        
        challengeTimestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_timestamp = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeTimestamp() {
        
        challengeTimestamp_ = 0;
        onChanged();
        return this;
      }

      private int elementBallNum_ ;
      /**
       * <code>uint32 element_ball_num = 14;</code>
       * @return The elementBallNum.
       */
      @java.lang.Override
      public int getElementBallNum() {
        return elementBallNum_;
      }
      /**
       * <code>uint32 element_ball_num = 14;</code>
       * @param value The elementBallNum to set.
       * @return This builder for chaining.
       */
      public Builder setElementBallNum(int value) {
        
        elementBallNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 element_ball_num = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementBallNum() {
        
        elementBallNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WindFieldGalleryInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:WindFieldGalleryInfoNotify)
    private static final emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify();
    }

    public static emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WindFieldGalleryInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<WindFieldGalleryInfoNotify>() {
      @java.lang.Override
      public WindFieldGalleryInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<WindFieldGalleryInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WindFieldGalleryInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.WindFieldGalleryInfoNotifyOuterClass.WindFieldGalleryInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WindFieldGalleryInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WindFieldGalleryInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n WindFieldGalleryInfoNotify.proto\"\364\001\n\032W" +
      "indFieldGalleryInfoNotify\022\017\n\007show_id\030\003 \001" +
      "(\r\022\032\n\022killed_monster_num\030\007 \001(\r\022\020\n\010coin_n" +
      "um\030\t \001(\r\022 \n\030challenge_ball_max_count\030\001 \001" +
      "(\r\022\034\n\024challenge_total_time\030\005 \001(\r\022 \n\030chal" +
      "lenge_ball_cur_count\030\n \001(\r\022\033\n\023challenge_" +
      "timestamp\030\004 \001(\r\022\030\n\020element_ball_num\030\016 \001(" +
      "\rB\036\n\034emu.grasscutter.net.oldprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WindFieldGalleryInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WindFieldGalleryInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WindFieldGalleryInfoNotify_descriptor,
        new java.lang.String[] { "ShowId", "KilledMonsterNum", "CoinNum", "ChallengeBallMaxCount", "ChallengeTotalTime", "ChallengeBallCurCount", "ChallengeTimestamp", "ElementBallNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
