// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleIrodoriChessSettleInfo.proto

package emu.grasscutter.net.newproto;

public final class InBattleIrodoriChessSettleInfoOuterClass {
  private InBattleIrodoriChessSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InBattleIrodoriChessSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InBattleIrodoriChessSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 kill_monster_num = 15;</code>
     * @return The killMonsterNum.
     */
    int getKillMonsterNum();

    /**
     * <code>uint64 scene_time_ms = 14;</code>
     * @return The sceneTimeMs.
     */
    long getSceneTimeMs();

    /**
     * <code>bool is_perfect = 8;</code>
     * @return The isPerfect.
     */
    boolean getIsPerfect();

    /**
     * <code>bool is_new_record = 7;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 settle_score = 10;</code>
     * @return The settleScore.
     */
    int getSettleScore();

    /**
     * <code>bool is_activity_end = 5;</code>
     * @return The isActivityEnd.
     */
    boolean getIsActivityEnd();
  }
  /**
   * Protobuf type {@code InBattleIrodoriChessSettleInfo}
   */
  public static final class InBattleIrodoriChessSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InBattleIrodoriChessSettleInfo)
      InBattleIrodoriChessSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleIrodoriChessSettleInfo.newBuilder() to construct.
    private InBattleIrodoriChessSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleIrodoriChessSettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleIrodoriChessSettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.internal_static_InBattleIrodoriChessSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.internal_static_InBattleIrodoriChessSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo.class, emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo.Builder.class);
    }

    public static final int KILL_MONSTER_NUM_FIELD_NUMBER = 15;
    private int killMonsterNum_;
    /**
     * <code>uint32 kill_monster_num = 15;</code>
     * @return The killMonsterNum.
     */
    @java.lang.Override
    public int getKillMonsterNum() {
      return killMonsterNum_;
    }

    public static final int SCENE_TIME_MS_FIELD_NUMBER = 14;
    private long sceneTimeMs_;
    /**
     * <code>uint64 scene_time_ms = 14;</code>
     * @return The sceneTimeMs.
     */
    @java.lang.Override
    public long getSceneTimeMs() {
      return sceneTimeMs_;
    }

    public static final int IS_PERFECT_FIELD_NUMBER = 8;
    private boolean isPerfect_;
    /**
     * <code>bool is_perfect = 8;</code>
     * @return The isPerfect.
     */
    @java.lang.Override
    public boolean getIsPerfect() {
      return isPerfect_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 7;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 7;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int SETTLE_SCORE_FIELD_NUMBER = 10;
    private int settleScore_;
    /**
     * <code>uint32 settle_score = 10;</code>
     * @return The settleScore.
     */
    @java.lang.Override
    public int getSettleScore() {
      return settleScore_;
    }

    public static final int IS_ACTIVITY_END_FIELD_NUMBER = 5;
    private boolean isActivityEnd_;
    /**
     * <code>bool is_activity_end = 5;</code>
     * @return The isActivityEnd.
     */
    @java.lang.Override
    public boolean getIsActivityEnd() {
      return isActivityEnd_;
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
      if (isActivityEnd_ != false) {
        output.writeBool(5, isActivityEnd_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(7, isNewRecord_);
      }
      if (isPerfect_ != false) {
        output.writeBool(8, isPerfect_);
      }
      if (settleScore_ != 0) {
        output.writeUInt32(10, settleScore_);
      }
      if (sceneTimeMs_ != 0L) {
        output.writeUInt64(14, sceneTimeMs_);
      }
      if (killMonsterNum_ != 0) {
        output.writeUInt32(15, killMonsterNum_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isActivityEnd_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isActivityEnd_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isNewRecord_);
      }
      if (isPerfect_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isPerfect_);
      }
      if (settleScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, settleScore_);
      }
      if (sceneTimeMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(14, sceneTimeMs_);
      }
      if (killMonsterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, killMonsterNum_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo other = (emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo) obj;

      if (getKillMonsterNum()
          != other.getKillMonsterNum()) return false;
      if (getSceneTimeMs()
          != other.getSceneTimeMs()) return false;
      if (getIsPerfect()
          != other.getIsPerfect()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getSettleScore()
          != other.getSettleScore()) return false;
      if (getIsActivityEnd()
          != other.getIsActivityEnd()) return false;
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
      hash = (37 * hash) + KILL_MONSTER_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getKillMonsterNum();
      hash = (37 * hash) + SCENE_TIME_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSceneTimeMs());
      hash = (37 * hash) + IS_PERFECT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsPerfect());
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + SETTLE_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getSettleScore();
      hash = (37 * hash) + IS_ACTIVITY_END_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsActivityEnd());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo prototype) {
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
     * Protobuf type {@code InBattleIrodoriChessSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleIrodoriChessSettleInfo)
        emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.internal_static_InBattleIrodoriChessSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.internal_static_InBattleIrodoriChessSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo.class, emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        killMonsterNum_ = 0;

        sceneTimeMs_ = 0L;

        isPerfect_ = false;

        isNewRecord_ = false;

        settleScore_ = 0;

        isActivityEnd_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.internal_static_InBattleIrodoriChessSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo build() {
        emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo buildPartial() {
        emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo result = new emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo(this);
        result.killMonsterNum_ = killMonsterNum_;
        result.sceneTimeMs_ = sceneTimeMs_;
        result.isPerfect_ = isPerfect_;
        result.isNewRecord_ = isNewRecord_;
        result.settleScore_ = settleScore_;
        result.isActivityEnd_ = isActivityEnd_;
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
        if (other instanceof emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo other) {
        if (other == emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo.getDefaultInstance()) return this;
        if (other.getKillMonsterNum() != 0) {
          setKillMonsterNum(other.getKillMonsterNum());
        }
        if (other.getSceneTimeMs() != 0L) {
          setSceneTimeMs(other.getSceneTimeMs());
        }
        if (other.getIsPerfect() != false) {
          setIsPerfect(other.getIsPerfect());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getSettleScore() != 0) {
          setSettleScore(other.getSettleScore());
        }
        if (other.getIsActivityEnd() != false) {
          setIsActivityEnd(other.getIsActivityEnd());
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
                isActivityEnd_ = input.readBool();

                break;
              } // case 40
              case 56: {
                isNewRecord_ = input.readBool();

                break;
              } // case 56
              case 64: {
                isPerfect_ = input.readBool();

                break;
              } // case 64
              case 80: {
                settleScore_ = input.readUInt32();

                break;
              } // case 80
              case 112: {
                sceneTimeMs_ = input.readUInt64();

                break;
              } // case 112
              case 120: {
                killMonsterNum_ = input.readUInt32();

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

      private int killMonsterNum_ ;
      /**
       * <code>uint32 kill_monster_num = 15;</code>
       * @return The killMonsterNum.
       */
      @java.lang.Override
      public int getKillMonsterNum() {
        return killMonsterNum_;
      }
      /**
       * <code>uint32 kill_monster_num = 15;</code>
       * @param value The killMonsterNum to set.
       * @return This builder for chaining.
       */
      public Builder setKillMonsterNum(int value) {
        
        killMonsterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_monster_num = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillMonsterNum() {
        
        killMonsterNum_ = 0;
        onChanged();
        return this;
      }

      private long sceneTimeMs_ ;
      /**
       * <code>uint64 scene_time_ms = 14;</code>
       * @return The sceneTimeMs.
       */
      @java.lang.Override
      public long getSceneTimeMs() {
        return sceneTimeMs_;
      }
      /**
       * <code>uint64 scene_time_ms = 14;</code>
       * @param value The sceneTimeMs to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTimeMs(long value) {
        
        sceneTimeMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 scene_time_ms = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTimeMs() {
        
        sceneTimeMs_ = 0L;
        onChanged();
        return this;
      }

      private boolean isPerfect_ ;
      /**
       * <code>bool is_perfect = 8;</code>
       * @return The isPerfect.
       */
      @java.lang.Override
      public boolean getIsPerfect() {
        return isPerfect_;
      }
      /**
       * <code>bool is_perfect = 8;</code>
       * @param value The isPerfect to set.
       * @return This builder for chaining.
       */
      public Builder setIsPerfect(boolean value) {
        
        isPerfect_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_perfect = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsPerfect() {
        
        isPerfect_ = false;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 7;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 7;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int settleScore_ ;
      /**
       * <code>uint32 settle_score = 10;</code>
       * @return The settleScore.
       */
      @java.lang.Override
      public int getSettleScore() {
        return settleScore_;
      }
      /**
       * <code>uint32 settle_score = 10;</code>
       * @param value The settleScore to set.
       * @return This builder for chaining.
       */
      public Builder setSettleScore(int value) {
        
        settleScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 settle_score = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearSettleScore() {
        
        settleScore_ = 0;
        onChanged();
        return this;
      }

      private boolean isActivityEnd_ ;
      /**
       * <code>bool is_activity_end = 5;</code>
       * @return The isActivityEnd.
       */
      @java.lang.Override
      public boolean getIsActivityEnd() {
        return isActivityEnd_;
      }
      /**
       * <code>bool is_activity_end = 5;</code>
       * @param value The isActivityEnd to set.
       * @return This builder for chaining.
       */
      public Builder setIsActivityEnd(boolean value) {
        
        isActivityEnd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_activity_end = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsActivityEnd() {
        
        isActivityEnd_ = false;
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


      // @@protoc_insertion_point(builder_scope:InBattleIrodoriChessSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:InBattleIrodoriChessSettleInfo)
    private static final emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo();
    }

    public static emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InBattleIrodoriChessSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<InBattleIrodoriChessSettleInfo>() {
      @java.lang.Override
      public InBattleIrodoriChessSettleInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<InBattleIrodoriChessSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleIrodoriChessSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.InBattleIrodoriChessSettleInfoOuterClass.InBattleIrodoriChessSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleIrodoriChessSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleIrodoriChessSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$InBattleIrodoriChessSettleInfo.proto\"\253" +
      "\001\n\036InBattleIrodoriChessSettleInfo\022\030\n\020kil" +
      "l_monster_num\030\017 \001(\r\022\025\n\rscene_time_ms\030\016 \001" +
      "(\004\022\022\n\nis_perfect\030\010 \001(\010\022\025\n\ris_new_record\030" +
      "\007 \001(\010\022\024\n\014settle_score\030\n \001(\r\022\027\n\017is_activi" +
      "ty_end\030\005 \001(\010B\036\n\034emu.grasscutter.net.newp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InBattleIrodoriChessSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InBattleIrodoriChessSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleIrodoriChessSettleInfo_descriptor,
        new java.lang.String[] { "KillMonsterNum", "SceneTimeMs", "IsPerfect", "IsNewRecord", "SettleScore", "IsActivityEnd", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
