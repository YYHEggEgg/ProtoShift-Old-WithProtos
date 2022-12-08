// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyChallengeV2EnterDungeonReq.proto

package emu.grasscutter.net.oldproto;

public final class EffigyChallengeV2EnterDungeonReqOuterClass {
  private EffigyChallengeV2EnterDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EffigyChallengeV2EnterDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EffigyChallengeV2EnterDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_mode_difficulty = 7;</code>
     * @return The challengeModeDifficulty.
     */
    int getChallengeModeDifficulty();

    /**
     * <code>uint32 level_id = 12;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 challenge_mode_skill_no = 11;</code>
     * @return The challengeModeSkillNo.
     */
    int getChallengeModeSkillNo();
  }
  /**
   * <pre>
   * CmdId: 23489
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code EffigyChallengeV2EnterDungeonReq}
   */
  public static final class EffigyChallengeV2EnterDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EffigyChallengeV2EnterDungeonReq)
      EffigyChallengeV2EnterDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EffigyChallengeV2EnterDungeonReq.newBuilder() to construct.
    private EffigyChallengeV2EnterDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EffigyChallengeV2EnterDungeonReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EffigyChallengeV2EnterDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.internal_static_EffigyChallengeV2EnterDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.internal_static_EffigyChallengeV2EnterDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq.class, emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq.Builder.class);
    }

    public static final int CHALLENGE_MODE_DIFFICULTY_FIELD_NUMBER = 7;
    private int challengeModeDifficulty_;
    /**
     * <code>uint32 challenge_mode_difficulty = 7;</code>
     * @return The challengeModeDifficulty.
     */
    @java.lang.Override
    public int getChallengeModeDifficulty() {
      return challengeModeDifficulty_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 12;
    private int levelId_;
    /**
     * <code>uint32 level_id = 12;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int CHALLENGE_MODE_SKILL_NO_FIELD_NUMBER = 11;
    private int challengeModeSkillNo_;
    /**
     * <code>uint32 challenge_mode_skill_no = 11;</code>
     * @return The challengeModeSkillNo.
     */
    @java.lang.Override
    public int getChallengeModeSkillNo() {
      return challengeModeSkillNo_;
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
      if (challengeModeDifficulty_ != 0) {
        output.writeUInt32(7, challengeModeDifficulty_);
      }
      if (challengeModeSkillNo_ != 0) {
        output.writeUInt32(11, challengeModeSkillNo_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(12, levelId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeModeDifficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, challengeModeDifficulty_);
      }
      if (challengeModeSkillNo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, challengeModeSkillNo_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq other = (emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq) obj;

      if (getChallengeModeDifficulty()
          != other.getChallengeModeDifficulty()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getChallengeModeSkillNo()
          != other.getChallengeModeSkillNo()) return false;
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
      hash = (37 * hash) + CHALLENGE_MODE_DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeModeDifficulty();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + CHALLENGE_MODE_SKILL_NO_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeModeSkillNo();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq prototype) {
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
     * CmdId: 23489
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code EffigyChallengeV2EnterDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EffigyChallengeV2EnterDungeonReq)
        emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.internal_static_EffigyChallengeV2EnterDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.internal_static_EffigyChallengeV2EnterDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq.class, emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        challengeModeDifficulty_ = 0;

        levelId_ = 0;

        challengeModeSkillNo_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.internal_static_EffigyChallengeV2EnterDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq build() {
        emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq buildPartial() {
        emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq result = new emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq(this);
        result.challengeModeDifficulty_ = challengeModeDifficulty_;
        result.levelId_ = levelId_;
        result.challengeModeSkillNo_ = challengeModeSkillNo_;
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
        if (other instanceof emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq other) {
        if (other == emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq.getDefaultInstance()) return this;
        if (other.getChallengeModeDifficulty() != 0) {
          setChallengeModeDifficulty(other.getChallengeModeDifficulty());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getChallengeModeSkillNo() != 0) {
          setChallengeModeSkillNo(other.getChallengeModeSkillNo());
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
                challengeModeDifficulty_ = input.readUInt32();

                break;
              } // case 56
              case 88: {
                challengeModeSkillNo_ = input.readUInt32();

                break;
              } // case 88
              case 96: {
                levelId_ = input.readUInt32();

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

      private int challengeModeDifficulty_ ;
      /**
       * <code>uint32 challenge_mode_difficulty = 7;</code>
       * @return The challengeModeDifficulty.
       */
      @java.lang.Override
      public int getChallengeModeDifficulty() {
        return challengeModeDifficulty_;
      }
      /**
       * <code>uint32 challenge_mode_difficulty = 7;</code>
       * @param value The challengeModeDifficulty to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeModeDifficulty(int value) {
        
        challengeModeDifficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_mode_difficulty = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeModeDifficulty() {
        
        challengeModeDifficulty_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 12;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 12;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int challengeModeSkillNo_ ;
      /**
       * <code>uint32 challenge_mode_skill_no = 11;</code>
       * @return The challengeModeSkillNo.
       */
      @java.lang.Override
      public int getChallengeModeSkillNo() {
        return challengeModeSkillNo_;
      }
      /**
       * <code>uint32 challenge_mode_skill_no = 11;</code>
       * @param value The challengeModeSkillNo to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeModeSkillNo(int value) {
        
        challengeModeSkillNo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_mode_skill_no = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeModeSkillNo() {
        
        challengeModeSkillNo_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EffigyChallengeV2EnterDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:EffigyChallengeV2EnterDungeonReq)
    private static final emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq();
    }

    public static emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EffigyChallengeV2EnterDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<EffigyChallengeV2EnterDungeonReq>() {
      @java.lang.Override
      public EffigyChallengeV2EnterDungeonReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<EffigyChallengeV2EnterDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EffigyChallengeV2EnterDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.EffigyChallengeV2EnterDungeonReqOuterClass.EffigyChallengeV2EnterDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EffigyChallengeV2EnterDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EffigyChallengeV2EnterDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&EffigyChallengeV2EnterDungeonReq.proto" +
      "\"x\n EffigyChallengeV2EnterDungeonReq\022!\n\031" +
      "challenge_mode_difficulty\030\007 \001(\r\022\020\n\010level" +
      "_id\030\014 \001(\r\022\037\n\027challenge_mode_skill_no\030\013 \001" +
      "(\rB\036\n\034emu.grasscutter.net.oldprotob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EffigyChallengeV2EnterDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EffigyChallengeV2EnterDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EffigyChallengeV2EnterDungeonReq_descriptor,
        new java.lang.String[] { "ChallengeModeDifficulty", "LevelId", "ChallengeModeSkillNo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
