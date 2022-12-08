// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterTrainingInfoNotify.proto

package emu.grasscutter.net.oldproto;

public final class FungusFighterTrainingInfoNotifyOuterClass {
  private FungusFighterTrainingInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusFighterTrainingInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusFighterTrainingInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 buff_start_time = 3;</code>
     * @return The buffStartTime.
     */
    int getBuffStartTime();

    /**
     * <code>uint32 max_skill_count = 7;</code>
     * @return The maxSkillCount.
     */
    int getMaxSkillCount();

    /**
     * <code>uint32 max_monster_count = 8;</code>
     * @return The maxMonsterCount.
     */
    int getMaxMonsterCount();

    /**
     * <code>uint32 buff_id = 14;</code>
     * @return The buffId.
     */
    int getBuffId();

    /**
     * <code>uint32 buff_last_time = 4;</code>
     * @return The buffLastTime.
     */
    int getBuffLastTime();

    /**
     * <code>uint32 rest_skill_count = 6;</code>
     * @return The restSkillCount.
     */
    int getRestSkillCount();

    /**
     * <code>uint32 killed_monster_count = 15;</code>
     * @return The killedMonsterCount.
     */
    int getKilledMonsterCount();
  }
  /**
   * <pre>
   * CmdId: 5595
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code FungusFighterTrainingInfoNotify}
   */
  public static final class FungusFighterTrainingInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusFighterTrainingInfoNotify)
      FungusFighterTrainingInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusFighterTrainingInfoNotify.newBuilder() to construct.
    private FungusFighterTrainingInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusFighterTrainingInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusFighterTrainingInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.internal_static_FungusFighterTrainingInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.internal_static_FungusFighterTrainingInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify.class, emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify.Builder.class);
    }

    public static final int BUFF_START_TIME_FIELD_NUMBER = 3;
    private int buffStartTime_;
    /**
     * <code>uint32 buff_start_time = 3;</code>
     * @return The buffStartTime.
     */
    @java.lang.Override
    public int getBuffStartTime() {
      return buffStartTime_;
    }

    public static final int MAX_SKILL_COUNT_FIELD_NUMBER = 7;
    private int maxSkillCount_;
    /**
     * <code>uint32 max_skill_count = 7;</code>
     * @return The maxSkillCount.
     */
    @java.lang.Override
    public int getMaxSkillCount() {
      return maxSkillCount_;
    }

    public static final int MAX_MONSTER_COUNT_FIELD_NUMBER = 8;
    private int maxMonsterCount_;
    /**
     * <code>uint32 max_monster_count = 8;</code>
     * @return The maxMonsterCount.
     */
    @java.lang.Override
    public int getMaxMonsterCount() {
      return maxMonsterCount_;
    }

    public static final int BUFF_ID_FIELD_NUMBER = 14;
    private int buffId_;
    /**
     * <code>uint32 buff_id = 14;</code>
     * @return The buffId.
     */
    @java.lang.Override
    public int getBuffId() {
      return buffId_;
    }

    public static final int BUFF_LAST_TIME_FIELD_NUMBER = 4;
    private int buffLastTime_;
    /**
     * <code>uint32 buff_last_time = 4;</code>
     * @return The buffLastTime.
     */
    @java.lang.Override
    public int getBuffLastTime() {
      return buffLastTime_;
    }

    public static final int REST_SKILL_COUNT_FIELD_NUMBER = 6;
    private int restSkillCount_;
    /**
     * <code>uint32 rest_skill_count = 6;</code>
     * @return The restSkillCount.
     */
    @java.lang.Override
    public int getRestSkillCount() {
      return restSkillCount_;
    }

    public static final int KILLED_MONSTER_COUNT_FIELD_NUMBER = 15;
    private int killedMonsterCount_;
    /**
     * <code>uint32 killed_monster_count = 15;</code>
     * @return The killedMonsterCount.
     */
    @java.lang.Override
    public int getKilledMonsterCount() {
      return killedMonsterCount_;
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
      if (buffStartTime_ != 0) {
        output.writeUInt32(3, buffStartTime_);
      }
      if (buffLastTime_ != 0) {
        output.writeUInt32(4, buffLastTime_);
      }
      if (restSkillCount_ != 0) {
        output.writeUInt32(6, restSkillCount_);
      }
      if (maxSkillCount_ != 0) {
        output.writeUInt32(7, maxSkillCount_);
      }
      if (maxMonsterCount_ != 0) {
        output.writeUInt32(8, maxMonsterCount_);
      }
      if (buffId_ != 0) {
        output.writeUInt32(14, buffId_);
      }
      if (killedMonsterCount_ != 0) {
        output.writeUInt32(15, killedMonsterCount_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (buffStartTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, buffStartTime_);
      }
      if (buffLastTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, buffLastTime_);
      }
      if (restSkillCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, restSkillCount_);
      }
      if (maxSkillCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, maxSkillCount_);
      }
      if (maxMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, maxMonsterCount_);
      }
      if (buffId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, buffId_);
      }
      if (killedMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, killedMonsterCount_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify other = (emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify) obj;

      if (getBuffStartTime()
          != other.getBuffStartTime()) return false;
      if (getMaxSkillCount()
          != other.getMaxSkillCount()) return false;
      if (getMaxMonsterCount()
          != other.getMaxMonsterCount()) return false;
      if (getBuffId()
          != other.getBuffId()) return false;
      if (getBuffLastTime()
          != other.getBuffLastTime()) return false;
      if (getRestSkillCount()
          != other.getRestSkillCount()) return false;
      if (getKilledMonsterCount()
          != other.getKilledMonsterCount()) return false;
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
      hash = (37 * hash) + BUFF_START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getBuffStartTime();
      hash = (37 * hash) + MAX_SKILL_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMaxSkillCount();
      hash = (37 * hash) + MAX_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMaxMonsterCount();
      hash = (37 * hash) + BUFF_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuffId();
      hash = (37 * hash) + BUFF_LAST_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getBuffLastTime();
      hash = (37 * hash) + REST_SKILL_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getRestSkillCount();
      hash = (37 * hash) + KILLED_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKilledMonsterCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify prototype) {
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
     * CmdId: 5595
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code FungusFighterTrainingInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusFighterTrainingInfoNotify)
        emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.internal_static_FungusFighterTrainingInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.internal_static_FungusFighterTrainingInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify.class, emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        buffStartTime_ = 0;

        maxSkillCount_ = 0;

        maxMonsterCount_ = 0;

        buffId_ = 0;

        buffLastTime_ = 0;

        restSkillCount_ = 0;

        killedMonsterCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.internal_static_FungusFighterTrainingInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify build() {
        emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify buildPartial() {
        emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify result = new emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify(this);
        result.buffStartTime_ = buffStartTime_;
        result.maxSkillCount_ = maxSkillCount_;
        result.maxMonsterCount_ = maxMonsterCount_;
        result.buffId_ = buffId_;
        result.buffLastTime_ = buffLastTime_;
        result.restSkillCount_ = restSkillCount_;
        result.killedMonsterCount_ = killedMonsterCount_;
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
        if (other instanceof emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify other) {
        if (other == emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify.getDefaultInstance()) return this;
        if (other.getBuffStartTime() != 0) {
          setBuffStartTime(other.getBuffStartTime());
        }
        if (other.getMaxSkillCount() != 0) {
          setMaxSkillCount(other.getMaxSkillCount());
        }
        if (other.getMaxMonsterCount() != 0) {
          setMaxMonsterCount(other.getMaxMonsterCount());
        }
        if (other.getBuffId() != 0) {
          setBuffId(other.getBuffId());
        }
        if (other.getBuffLastTime() != 0) {
          setBuffLastTime(other.getBuffLastTime());
        }
        if (other.getRestSkillCount() != 0) {
          setRestSkillCount(other.getRestSkillCount());
        }
        if (other.getKilledMonsterCount() != 0) {
          setKilledMonsterCount(other.getKilledMonsterCount());
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
                buffStartTime_ = input.readUInt32();

                break;
              } // case 24
              case 32: {
                buffLastTime_ = input.readUInt32();

                break;
              } // case 32
              case 48: {
                restSkillCount_ = input.readUInt32();

                break;
              } // case 48
              case 56: {
                maxSkillCount_ = input.readUInt32();

                break;
              } // case 56
              case 64: {
                maxMonsterCount_ = input.readUInt32();

                break;
              } // case 64
              case 112: {
                buffId_ = input.readUInt32();

                break;
              } // case 112
              case 120: {
                killedMonsterCount_ = input.readUInt32();

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

      private int buffStartTime_ ;
      /**
       * <code>uint32 buff_start_time = 3;</code>
       * @return The buffStartTime.
       */
      @java.lang.Override
      public int getBuffStartTime() {
        return buffStartTime_;
      }
      /**
       * <code>uint32 buff_start_time = 3;</code>
       * @param value The buffStartTime to set.
       * @return This builder for chaining.
       */
      public Builder setBuffStartTime(int value) {
        
        buffStartTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buff_start_time = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuffStartTime() {
        
        buffStartTime_ = 0;
        onChanged();
        return this;
      }

      private int maxSkillCount_ ;
      /**
       * <code>uint32 max_skill_count = 7;</code>
       * @return The maxSkillCount.
       */
      @java.lang.Override
      public int getMaxSkillCount() {
        return maxSkillCount_;
      }
      /**
       * <code>uint32 max_skill_count = 7;</code>
       * @param value The maxSkillCount to set.
       * @return This builder for chaining.
       */
      public Builder setMaxSkillCount(int value) {
        
        maxSkillCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_skill_count = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxSkillCount() {
        
        maxSkillCount_ = 0;
        onChanged();
        return this;
      }

      private int maxMonsterCount_ ;
      /**
       * <code>uint32 max_monster_count = 8;</code>
       * @return The maxMonsterCount.
       */
      @java.lang.Override
      public int getMaxMonsterCount() {
        return maxMonsterCount_;
      }
      /**
       * <code>uint32 max_monster_count = 8;</code>
       * @param value The maxMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setMaxMonsterCount(int value) {
        
        maxMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_monster_count = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxMonsterCount() {
        
        maxMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int buffId_ ;
      /**
       * <code>uint32 buff_id = 14;</code>
       * @return The buffId.
       */
      @java.lang.Override
      public int getBuffId() {
        return buffId_;
      }
      /**
       * <code>uint32 buff_id = 14;</code>
       * @param value The buffId to set.
       * @return This builder for chaining.
       */
      public Builder setBuffId(int value) {
        
        buffId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buff_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuffId() {
        
        buffId_ = 0;
        onChanged();
        return this;
      }

      private int buffLastTime_ ;
      /**
       * <code>uint32 buff_last_time = 4;</code>
       * @return The buffLastTime.
       */
      @java.lang.Override
      public int getBuffLastTime() {
        return buffLastTime_;
      }
      /**
       * <code>uint32 buff_last_time = 4;</code>
       * @param value The buffLastTime to set.
       * @return This builder for chaining.
       */
      public Builder setBuffLastTime(int value) {
        
        buffLastTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buff_last_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuffLastTime() {
        
        buffLastTime_ = 0;
        onChanged();
        return this;
      }

      private int restSkillCount_ ;
      /**
       * <code>uint32 rest_skill_count = 6;</code>
       * @return The restSkillCount.
       */
      @java.lang.Override
      public int getRestSkillCount() {
        return restSkillCount_;
      }
      /**
       * <code>uint32 rest_skill_count = 6;</code>
       * @param value The restSkillCount to set.
       * @return This builder for chaining.
       */
      public Builder setRestSkillCount(int value) {
        
        restSkillCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rest_skill_count = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRestSkillCount() {
        
        restSkillCount_ = 0;
        onChanged();
        return this;
      }

      private int killedMonsterCount_ ;
      /**
       * <code>uint32 killed_monster_count = 15;</code>
       * @return The killedMonsterCount.
       */
      @java.lang.Override
      public int getKilledMonsterCount() {
        return killedMonsterCount_;
      }
      /**
       * <code>uint32 killed_monster_count = 15;</code>
       * @param value The killedMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setKilledMonsterCount(int value) {
        
        killedMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 killed_monster_count = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearKilledMonsterCount() {
        
        killedMonsterCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FungusFighterTrainingInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:FungusFighterTrainingInfoNotify)
    private static final emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify();
    }

    public static emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusFighterTrainingInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<FungusFighterTrainingInfoNotify>() {
      @java.lang.Override
      public FungusFighterTrainingInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<FungusFighterTrainingInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusFighterTrainingInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.FungusFighterTrainingInfoNotifyOuterClass.FungusFighterTrainingInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusFighterTrainingInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusFighterTrainingInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%FungusFighterTrainingInfoNotify.proto\"" +
      "\317\001\n\037FungusFighterTrainingInfoNotify\022\027\n\017b" +
      "uff_start_time\030\003 \001(\r\022\027\n\017max_skill_count\030" +
      "\007 \001(\r\022\031\n\021max_monster_count\030\010 \001(\r\022\017\n\007buff" +
      "_id\030\016 \001(\r\022\026\n\016buff_last_time\030\004 \001(\r\022\030\n\020res" +
      "t_skill_count\030\006 \001(\r\022\034\n\024killed_monster_co" +
      "unt\030\017 \001(\rB\036\n\034emu.grasscutter.net.oldprot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusFighterTrainingInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusFighterTrainingInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusFighterTrainingInfoNotify_descriptor,
        new java.lang.String[] { "BuffStartTime", "MaxSkillCount", "MaxMonsterCount", "BuffId", "BuffLastTime", "RestSkillCount", "KilledMonsterCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}