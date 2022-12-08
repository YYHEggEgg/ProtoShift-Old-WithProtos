// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyChallengeV2EnterDungeonRsp.proto

package emu.grasscutter.net.newproto;

public final class EffigyChallengeV2EnterDungeonRspOuterClass {
  private EffigyChallengeV2EnterDungeonRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EffigyChallengeV2EnterDungeonRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EffigyChallengeV2EnterDungeonRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_mode_difficulty = 3;</code>
     * @return The challengeModeDifficulty.
     */
    int getChallengeModeDifficulty();

    /**
     * <code>uint32 challenge_mode_skill_no = 7;</code>
     * @return The challengeModeSkillNo.
     */
    int getChallengeModeSkillNo();

    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 22024;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EffigyChallengeV2EnterDungeonRsp}
   */
  public static final class EffigyChallengeV2EnterDungeonRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EffigyChallengeV2EnterDungeonRsp)
      EffigyChallengeV2EnterDungeonRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EffigyChallengeV2EnterDungeonRsp.newBuilder() to construct.
    private EffigyChallengeV2EnterDungeonRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EffigyChallengeV2EnterDungeonRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EffigyChallengeV2EnterDungeonRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.internal_static_EffigyChallengeV2EnterDungeonRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.internal_static_EffigyChallengeV2EnterDungeonRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp.class, emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp.Builder.class);
    }

    public static final int CHALLENGE_MODE_DIFFICULTY_FIELD_NUMBER = 3;
    private int challengeModeDifficulty_;
    /**
     * <code>uint32 challenge_mode_difficulty = 3;</code>
     * @return The challengeModeDifficulty.
     */
    @java.lang.Override
    public int getChallengeModeDifficulty() {
      return challengeModeDifficulty_;
    }

    public static final int CHALLENGE_MODE_SKILL_NO_FIELD_NUMBER = 7;
    private int challengeModeSkillNo_;
    /**
     * <code>uint32 challenge_mode_skill_no = 7;</code>
     * @return The challengeModeSkillNo.
     */
    @java.lang.Override
    public int getChallengeModeSkillNo() {
      return challengeModeSkillNo_;
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

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
        output.writeUInt32(3, challengeModeDifficulty_);
      }
      if (challengeModeSkillNo_ != 0) {
        output.writeUInt32(7, challengeModeSkillNo_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(10, levelId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
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
          .computeUInt32Size(3, challengeModeDifficulty_);
      }
      if (challengeModeSkillNo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, challengeModeSkillNo_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, levelId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp other = (emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp) obj;

      if (getChallengeModeDifficulty()
          != other.getChallengeModeDifficulty()) return false;
      if (getChallengeModeSkillNo()
          != other.getChallengeModeSkillNo()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + CHALLENGE_MODE_SKILL_NO_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeModeSkillNo();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 22024;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EffigyChallengeV2EnterDungeonRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EffigyChallengeV2EnterDungeonRsp)
        emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.internal_static_EffigyChallengeV2EnterDungeonRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.internal_static_EffigyChallengeV2EnterDungeonRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp.class, emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp.newBuilder()
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

        challengeModeSkillNo_ = 0;

        levelId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.internal_static_EffigyChallengeV2EnterDungeonRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp build() {
        emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp buildPartial() {
        emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp result = new emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp(this);
        result.challengeModeDifficulty_ = challengeModeDifficulty_;
        result.challengeModeSkillNo_ = challengeModeSkillNo_;
        result.levelId_ = levelId_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp other) {
        if (other == emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp.getDefaultInstance()) return this;
        if (other.getChallengeModeDifficulty() != 0) {
          setChallengeModeDifficulty(other.getChallengeModeDifficulty());
        }
        if (other.getChallengeModeSkillNo() != 0) {
          setChallengeModeSkillNo(other.getChallengeModeSkillNo());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
                challengeModeDifficulty_ = input.readUInt32();

                break;
              } // case 24
              case 56: {
                challengeModeSkillNo_ = input.readUInt32();

                break;
              } // case 56
              case 80: {
                levelId_ = input.readUInt32();

                break;
              } // case 80
              case 120: {
                retcode_ = input.readInt32();

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

      private int challengeModeDifficulty_ ;
      /**
       * <code>uint32 challenge_mode_difficulty = 3;</code>
       * @return The challengeModeDifficulty.
       */
      @java.lang.Override
      public int getChallengeModeDifficulty() {
        return challengeModeDifficulty_;
      }
      /**
       * <code>uint32 challenge_mode_difficulty = 3;</code>
       * @param value The challengeModeDifficulty to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeModeDifficulty(int value) {
        
        challengeModeDifficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_mode_difficulty = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeModeDifficulty() {
        
        challengeModeDifficulty_ = 0;
        onChanged();
        return this;
      }

      private int challengeModeSkillNo_ ;
      /**
       * <code>uint32 challenge_mode_skill_no = 7;</code>
       * @return The challengeModeSkillNo.
       */
      @java.lang.Override
      public int getChallengeModeSkillNo() {
        return challengeModeSkillNo_;
      }
      /**
       * <code>uint32 challenge_mode_skill_no = 7;</code>
       * @param value The challengeModeSkillNo to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeModeSkillNo(int value) {
        
        challengeModeSkillNo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_mode_skill_no = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeModeSkillNo() {
        
        challengeModeSkillNo_ = 0;
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EffigyChallengeV2EnterDungeonRsp)
    }

    // @@protoc_insertion_point(class_scope:EffigyChallengeV2EnterDungeonRsp)
    private static final emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp();
    }

    public static emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EffigyChallengeV2EnterDungeonRsp>
        PARSER = new com.google.protobuf.AbstractParser<EffigyChallengeV2EnterDungeonRsp>() {
      @java.lang.Override
      public EffigyChallengeV2EnterDungeonRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<EffigyChallengeV2EnterDungeonRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EffigyChallengeV2EnterDungeonRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.EffigyChallengeV2EnterDungeonRspOuterClass.EffigyChallengeV2EnterDungeonRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EffigyChallengeV2EnterDungeonRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EffigyChallengeV2EnterDungeonRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&EffigyChallengeV2EnterDungeonRsp.proto" +
      "\"\211\001\n EffigyChallengeV2EnterDungeonRsp\022!\n" +
      "\031challenge_mode_difficulty\030\003 \001(\r\022\037\n\027chal" +
      "lenge_mode_skill_no\030\007 \001(\r\022\020\n\010level_id\030\n " +
      "\001(\r\022\017\n\007retcode\030\017 \001(\005B\036\n\034emu.grasscutter." +
      "net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EffigyChallengeV2EnterDungeonRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EffigyChallengeV2EnterDungeonRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EffigyChallengeV2EnterDungeonRsp_descriptor,
        new java.lang.String[] { "ChallengeModeDifficulty", "ChallengeModeSkillNo", "LevelId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
