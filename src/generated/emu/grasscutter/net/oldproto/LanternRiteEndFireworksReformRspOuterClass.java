// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LanternRiteEndFireworksReformRsp.proto

package emu.grasscutter.net.oldproto;

public final class LanternRiteEndFireworksReformRspOuterClass {
  private LanternRiteEndFireworksReformRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LanternRiteEndFireworksReformRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LanternRiteEndFireworksReformRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_full_score = 10;</code>
     * @return The isFullScore.
     */
    boolean getIsFullScore();

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool is_unlock_fireworks = 6;</code>
     * @return The isUnlockFireworks.
     */
    boolean getIsUnlockFireworks();

    /**
     * <code>uint32 stage_id = 15;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool is_unlock_new_skill = 12;</code>
     * @return The isUnlockNewSkill.
     */
    boolean getIsUnlockNewSkill();

    /**
     * <code>bool is_stamina_up = 4;</code>
     * @return The isStaminaUp.
     */
    boolean getIsStaminaUp();

    /**
     * <code>uint32 final_score = 13;</code>
     * @return The finalScore.
     */
    int getFinalScore();

    /**
     * <code>uint32 challenge_id = 5;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>bool is_new_record = 9;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();
  }
  /**
   * <pre>
   * CmdId: 8933
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code LanternRiteEndFireworksReformRsp}
   */
  public static final class LanternRiteEndFireworksReformRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LanternRiteEndFireworksReformRsp)
      LanternRiteEndFireworksReformRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LanternRiteEndFireworksReformRsp.newBuilder() to construct.
    private LanternRiteEndFireworksReformRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LanternRiteEndFireworksReformRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LanternRiteEndFireworksReformRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.internal_static_LanternRiteEndFireworksReformRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.internal_static_LanternRiteEndFireworksReformRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp.class, emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp.Builder.class);
    }

    public static final int IS_FULL_SCORE_FIELD_NUMBER = 10;
    private boolean isFullScore_;
    /**
     * <code>bool is_full_score = 10;</code>
     * @return The isFullScore.
     */
    @java.lang.Override
    public boolean getIsFullScore() {
      return isFullScore_;
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int IS_UNLOCK_FIREWORKS_FIELD_NUMBER = 6;
    private boolean isUnlockFireworks_;
    /**
     * <code>bool is_unlock_fireworks = 6;</code>
     * @return The isUnlockFireworks.
     */
    @java.lang.Override
    public boolean getIsUnlockFireworks() {
      return isUnlockFireworks_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 15;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 15;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int IS_UNLOCK_NEW_SKILL_FIELD_NUMBER = 12;
    private boolean isUnlockNewSkill_;
    /**
     * <code>bool is_unlock_new_skill = 12;</code>
     * @return The isUnlockNewSkill.
     */
    @java.lang.Override
    public boolean getIsUnlockNewSkill() {
      return isUnlockNewSkill_;
    }

    public static final int IS_STAMINA_UP_FIELD_NUMBER = 4;
    private boolean isStaminaUp_;
    /**
     * <code>bool is_stamina_up = 4;</code>
     * @return The isStaminaUp.
     */
    @java.lang.Override
    public boolean getIsStaminaUp() {
      return isStaminaUp_;
    }

    public static final int FINAL_SCORE_FIELD_NUMBER = 13;
    private int finalScore_;
    /**
     * <code>uint32 final_score = 13;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 5;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 5;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 9;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 9;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
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
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (isStaminaUp_ != false) {
        output.writeBool(4, isStaminaUp_);
      }
      if (challengeId_ != 0) {
        output.writeUInt32(5, challengeId_);
      }
      if (isUnlockFireworks_ != false) {
        output.writeBool(6, isUnlockFireworks_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(9, isNewRecord_);
      }
      if (isFullScore_ != false) {
        output.writeBool(10, isFullScore_);
      }
      if (isUnlockNewSkill_ != false) {
        output.writeBool(12, isUnlockNewSkill_);
      }
      if (finalScore_ != 0) {
        output.writeUInt32(13, finalScore_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(15, stageId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      if (isStaminaUp_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isStaminaUp_);
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, challengeId_);
      }
      if (isUnlockFireworks_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isUnlockFireworks_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isNewRecord_);
      }
      if (isFullScore_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isFullScore_);
      }
      if (isUnlockNewSkill_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isUnlockNewSkill_);
      }
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, finalScore_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, stageId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp other = (emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp) obj;

      if (getIsFullScore()
          != other.getIsFullScore()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsUnlockFireworks()
          != other.getIsUnlockFireworks()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getIsUnlockNewSkill()
          != other.getIsUnlockNewSkill()) return false;
      if (getIsStaminaUp()
          != other.getIsStaminaUp()) return false;
      if (getFinalScore()
          != other.getFinalScore()) return false;
      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
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
      hash = (37 * hash) + IS_FULL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFullScore());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + IS_UNLOCK_FIREWORKS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsUnlockFireworks());
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + IS_UNLOCK_NEW_SKILL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsUnlockNewSkill());
      hash = (37 * hash) + IS_STAMINA_UP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsStaminaUp());
      hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp prototype) {
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
     * CmdId: 8933
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code LanternRiteEndFireworksReformRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LanternRiteEndFireworksReformRsp)
        emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.internal_static_LanternRiteEndFireworksReformRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.internal_static_LanternRiteEndFireworksReformRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp.class, emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isFullScore_ = false;

        retcode_ = 0;

        isUnlockFireworks_ = false;

        stageId_ = 0;

        isUnlockNewSkill_ = false;

        isStaminaUp_ = false;

        finalScore_ = 0;

        challengeId_ = 0;

        isNewRecord_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.internal_static_LanternRiteEndFireworksReformRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp build() {
        emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp buildPartial() {
        emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp result = new emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp(this);
        result.isFullScore_ = isFullScore_;
        result.retcode_ = retcode_;
        result.isUnlockFireworks_ = isUnlockFireworks_;
        result.stageId_ = stageId_;
        result.isUnlockNewSkill_ = isUnlockNewSkill_;
        result.isStaminaUp_ = isStaminaUp_;
        result.finalScore_ = finalScore_;
        result.challengeId_ = challengeId_;
        result.isNewRecord_ = isNewRecord_;
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
        if (other instanceof emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp other) {
        if (other == emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp.getDefaultInstance()) return this;
        if (other.getIsFullScore() != false) {
          setIsFullScore(other.getIsFullScore());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsUnlockFireworks() != false) {
          setIsUnlockFireworks(other.getIsUnlockFireworks());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getIsUnlockNewSkill() != false) {
          setIsUnlockNewSkill(other.getIsUnlockNewSkill());
        }
        if (other.getIsStaminaUp() != false) {
          setIsStaminaUp(other.getIsStaminaUp());
        }
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
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
                retcode_ = input.readInt32();

                break;
              } // case 8
              case 32: {
                isStaminaUp_ = input.readBool();

                break;
              } // case 32
              case 40: {
                challengeId_ = input.readUInt32();

                break;
              } // case 40
              case 48: {
                isUnlockFireworks_ = input.readBool();

                break;
              } // case 48
              case 72: {
                isNewRecord_ = input.readBool();

                break;
              } // case 72
              case 80: {
                isFullScore_ = input.readBool();

                break;
              } // case 80
              case 96: {
                isUnlockNewSkill_ = input.readBool();

                break;
              } // case 96
              case 104: {
                finalScore_ = input.readUInt32();

                break;
              } // case 104
              case 120: {
                stageId_ = input.readUInt32();

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

      private boolean isFullScore_ ;
      /**
       * <code>bool is_full_score = 10;</code>
       * @return The isFullScore.
       */
      @java.lang.Override
      public boolean getIsFullScore() {
        return isFullScore_;
      }
      /**
       * <code>bool is_full_score = 10;</code>
       * @param value The isFullScore to set.
       * @return This builder for chaining.
       */
      public Builder setIsFullScore(boolean value) {
        
        isFullScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_full_score = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFullScore() {
        
        isFullScore_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean isUnlockFireworks_ ;
      /**
       * <code>bool is_unlock_fireworks = 6;</code>
       * @return The isUnlockFireworks.
       */
      @java.lang.Override
      public boolean getIsUnlockFireworks() {
        return isUnlockFireworks_;
      }
      /**
       * <code>bool is_unlock_fireworks = 6;</code>
       * @param value The isUnlockFireworks to set.
       * @return This builder for chaining.
       */
      public Builder setIsUnlockFireworks(boolean value) {
        
        isUnlockFireworks_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_unlock_fireworks = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsUnlockFireworks() {
        
        isUnlockFireworks_ = false;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 15;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 15;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean isUnlockNewSkill_ ;
      /**
       * <code>bool is_unlock_new_skill = 12;</code>
       * @return The isUnlockNewSkill.
       */
      @java.lang.Override
      public boolean getIsUnlockNewSkill() {
        return isUnlockNewSkill_;
      }
      /**
       * <code>bool is_unlock_new_skill = 12;</code>
       * @param value The isUnlockNewSkill to set.
       * @return This builder for chaining.
       */
      public Builder setIsUnlockNewSkill(boolean value) {
        
        isUnlockNewSkill_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_unlock_new_skill = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsUnlockNewSkill() {
        
        isUnlockNewSkill_ = false;
        onChanged();
        return this;
      }

      private boolean isStaminaUp_ ;
      /**
       * <code>bool is_stamina_up = 4;</code>
       * @return The isStaminaUp.
       */
      @java.lang.Override
      public boolean getIsStaminaUp() {
        return isStaminaUp_;
      }
      /**
       * <code>bool is_stamina_up = 4;</code>
       * @param value The isStaminaUp to set.
       * @return This builder for chaining.
       */
      public Builder setIsStaminaUp(boolean value) {
        
        isStaminaUp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_stamina_up = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsStaminaUp() {
        
        isStaminaUp_ = false;
        onChanged();
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 final_score = 13;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 final_score = 13;</code>
       * @param value The finalScore to set.
       * @return This builder for chaining.
       */
      public Builder setFinalScore(int value) {
        
        finalScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 final_score = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        
        finalScore_ = 0;
        onChanged();
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 5;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 5;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 9;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 9;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
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


      // @@protoc_insertion_point(builder_scope:LanternRiteEndFireworksReformRsp)
    }

    // @@protoc_insertion_point(class_scope:LanternRiteEndFireworksReformRsp)
    private static final emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp();
    }

    public static emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LanternRiteEndFireworksReformRsp>
        PARSER = new com.google.protobuf.AbstractParser<LanternRiteEndFireworksReformRsp>() {
      @java.lang.Override
      public LanternRiteEndFireworksReformRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<LanternRiteEndFireworksReformRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LanternRiteEndFireworksReformRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.LanternRiteEndFireworksReformRspOuterClass.LanternRiteEndFireworksReformRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LanternRiteEndFireworksReformRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LanternRiteEndFireworksReformRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&LanternRiteEndFireworksReformRsp.proto" +
      "\"\357\001\n LanternRiteEndFireworksReformRsp\022\025\n" +
      "\ris_full_score\030\n \001(\010\022\017\n\007retcode\030\001 \001(\005\022\033\n" +
      "\023is_unlock_fireworks\030\006 \001(\010\022\020\n\010stage_id\030\017" +
      " \001(\r\022\033\n\023is_unlock_new_skill\030\014 \001(\010\022\025\n\ris_" +
      "stamina_up\030\004 \001(\010\022\023\n\013final_score\030\r \001(\r\022\024\n" +
      "\014challenge_id\030\005 \001(\r\022\025\n\ris_new_record\030\t \001" +
      "(\010B\036\n\034emu.grasscutter.net.oldprotob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LanternRiteEndFireworksReformRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LanternRiteEndFireworksReformRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LanternRiteEndFireworksReformRsp_descriptor,
        new java.lang.String[] { "IsFullScore", "Retcode", "IsUnlockFireworks", "StageId", "IsUnlockNewSkill", "IsStaminaUp", "FinalScore", "ChallengeId", "IsNewRecord", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
