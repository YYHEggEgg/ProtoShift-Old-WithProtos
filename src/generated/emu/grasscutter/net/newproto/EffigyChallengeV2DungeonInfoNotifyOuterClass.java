// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyChallengeV2DungeonInfoNotify.proto

package emu.grasscutter.net.newproto;

public final class EffigyChallengeV2DungeonInfoNotifyOuterClass {
  private EffigyChallengeV2DungeonInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EffigyChallengeV2DungeonInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EffigyChallengeV2DungeonInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_mode_difficulty = 13;</code>
     * @return The challengeModeDifficulty.
     */
    int getChallengeModeDifficulty();

    /**
     * <code>uint32 skill_no = 15;</code>
     * @return The skillNo.
     */
    int getSkillNo();

    /**
     * <code>uint32 level_id = 2;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 24761;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EffigyChallengeV2DungeonInfoNotify}
   */
  public static final class EffigyChallengeV2DungeonInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EffigyChallengeV2DungeonInfoNotify)
      EffigyChallengeV2DungeonInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EffigyChallengeV2DungeonInfoNotify.newBuilder() to construct.
    private EffigyChallengeV2DungeonInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EffigyChallengeV2DungeonInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EffigyChallengeV2DungeonInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.internal_static_EffigyChallengeV2DungeonInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.internal_static_EffigyChallengeV2DungeonInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify.class, emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify.Builder.class);
    }

    public static final int CHALLENGE_MODE_DIFFICULTY_FIELD_NUMBER = 13;
    private int challengeModeDifficulty_;
    /**
     * <code>uint32 challenge_mode_difficulty = 13;</code>
     * @return The challengeModeDifficulty.
     */
    @java.lang.Override
    public int getChallengeModeDifficulty() {
      return challengeModeDifficulty_;
    }

    public static final int SKILL_NO_FIELD_NUMBER = 15;
    private int skillNo_;
    /**
     * <code>uint32 skill_no = 15;</code>
     * @return The skillNo.
     */
    @java.lang.Override
    public int getSkillNo() {
      return skillNo_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 2;
    private int levelId_;
    /**
     * <code>uint32 level_id = 2;</code>
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
      if (levelId_ != 0) {
        output.writeUInt32(2, levelId_);
      }
      if (challengeModeDifficulty_ != 0) {
        output.writeUInt32(13, challengeModeDifficulty_);
      }
      if (skillNo_ != 0) {
        output.writeUInt32(15, skillNo_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, levelId_);
      }
      if (challengeModeDifficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, challengeModeDifficulty_);
      }
      if (skillNo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, skillNo_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify other = (emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify) obj;

      if (getChallengeModeDifficulty()
          != other.getChallengeModeDifficulty()) return false;
      if (getSkillNo()
          != other.getSkillNo()) return false;
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
      hash = (37 * hash) + CHALLENGE_MODE_DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeModeDifficulty();
      hash = (37 * hash) + SKILL_NO_FIELD_NUMBER;
      hash = (53 * hash) + getSkillNo();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify prototype) {
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
     *   CMD_ID = 24761;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EffigyChallengeV2DungeonInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EffigyChallengeV2DungeonInfoNotify)
        emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.internal_static_EffigyChallengeV2DungeonInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.internal_static_EffigyChallengeV2DungeonInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify.class, emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify.newBuilder()
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

        skillNo_ = 0;

        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.internal_static_EffigyChallengeV2DungeonInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify build() {
        emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify buildPartial() {
        emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify result = new emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify(this);
        result.challengeModeDifficulty_ = challengeModeDifficulty_;
        result.skillNo_ = skillNo_;
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
        if (other instanceof emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify other) {
        if (other == emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify.getDefaultInstance()) return this;
        if (other.getChallengeModeDifficulty() != 0) {
          setChallengeModeDifficulty(other.getChallengeModeDifficulty());
        }
        if (other.getSkillNo() != 0) {
          setSkillNo(other.getSkillNo());
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
              case 16: {
                levelId_ = input.readUInt32();

                break;
              } // case 16
              case 104: {
                challengeModeDifficulty_ = input.readUInt32();

                break;
              } // case 104
              case 120: {
                skillNo_ = input.readUInt32();

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
       * <code>uint32 challenge_mode_difficulty = 13;</code>
       * @return The challengeModeDifficulty.
       */
      @java.lang.Override
      public int getChallengeModeDifficulty() {
        return challengeModeDifficulty_;
      }
      /**
       * <code>uint32 challenge_mode_difficulty = 13;</code>
       * @param value The challengeModeDifficulty to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeModeDifficulty(int value) {
        
        challengeModeDifficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_mode_difficulty = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeModeDifficulty() {
        
        challengeModeDifficulty_ = 0;
        onChanged();
        return this;
      }

      private int skillNo_ ;
      /**
       * <code>uint32 skill_no = 15;</code>
       * @return The skillNo.
       */
      @java.lang.Override
      public int getSkillNo() {
        return skillNo_;
      }
      /**
       * <code>uint32 skill_no = 15;</code>
       * @param value The skillNo to set.
       * @return This builder for chaining.
       */
      public Builder setSkillNo(int value) {
        
        skillNo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_no = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillNo() {
        
        skillNo_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 2;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 2;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 2;</code>
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


      // @@protoc_insertion_point(builder_scope:EffigyChallengeV2DungeonInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:EffigyChallengeV2DungeonInfoNotify)
    private static final emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify();
    }

    public static emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EffigyChallengeV2DungeonInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<EffigyChallengeV2DungeonInfoNotify>() {
      @java.lang.Override
      public EffigyChallengeV2DungeonInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EffigyChallengeV2DungeonInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EffigyChallengeV2DungeonInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.EffigyChallengeV2DungeonInfoNotifyOuterClass.EffigyChallengeV2DungeonInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EffigyChallengeV2DungeonInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EffigyChallengeV2DungeonInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(EffigyChallengeV2DungeonInfoNotify.pro" +
      "to\"k\n\"EffigyChallengeV2DungeonInfoNotify" +
      "\022!\n\031challenge_mode_difficulty\030\r \001(\r\022\020\n\010s" +
      "kill_no\030\017 \001(\r\022\020\n\010level_id\030\002 \001(\rB\036\n\034emu.g" +
      "rasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EffigyChallengeV2DungeonInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EffigyChallengeV2DungeonInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EffigyChallengeV2DungeonInfoNotify_descriptor,
        new java.lang.String[] { "ChallengeModeDifficulty", "SkillNo", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
