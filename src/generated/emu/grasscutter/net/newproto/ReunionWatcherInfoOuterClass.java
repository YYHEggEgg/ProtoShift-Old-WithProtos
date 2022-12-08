// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReunionWatcherInfo.proto

package emu.grasscutter.net.newproto;

public final class ReunionWatcherInfoOuterClass {
  private ReunionWatcherInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReunionWatcherInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReunionWatcherInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 total_progress = 4;</code>
     * @return The totalProgress.
     */
    int getTotalProgress();

    /**
     * <code>uint32 reward_unlock_time = 1;</code>
     * @return The rewardUnlockTime.
     */
    int getRewardUnlockTime();

    /**
     * <code>uint32 watcher_id = 9;</code>
     * @return The watcherId.
     */
    int getWatcherId();

    /**
     * <code>bool is_taken_reward = 12;</code>
     * @return The isTakenReward.
     */
    boolean getIsTakenReward();

    /**
     * <code>uint32 cur_progress = 10;</code>
     * @return The curProgress.
     */
    int getCurProgress();
  }
  /**
   * Protobuf type {@code ReunionWatcherInfo}
   */
  public static final class ReunionWatcherInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReunionWatcherInfo)
      ReunionWatcherInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReunionWatcherInfo.newBuilder() to construct.
    private ReunionWatcherInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReunionWatcherInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReunionWatcherInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.internal_static_ReunionWatcherInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.internal_static_ReunionWatcherInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo.class, emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo.Builder.class);
    }

    public static final int TOTAL_PROGRESS_FIELD_NUMBER = 4;
    private int totalProgress_;
    /**
     * <code>uint32 total_progress = 4;</code>
     * @return The totalProgress.
     */
    @java.lang.Override
    public int getTotalProgress() {
      return totalProgress_;
    }

    public static final int REWARD_UNLOCK_TIME_FIELD_NUMBER = 1;
    private int rewardUnlockTime_;
    /**
     * <code>uint32 reward_unlock_time = 1;</code>
     * @return The rewardUnlockTime.
     */
    @java.lang.Override
    public int getRewardUnlockTime() {
      return rewardUnlockTime_;
    }

    public static final int WATCHER_ID_FIELD_NUMBER = 9;
    private int watcherId_;
    /**
     * <code>uint32 watcher_id = 9;</code>
     * @return The watcherId.
     */
    @java.lang.Override
    public int getWatcherId() {
      return watcherId_;
    }

    public static final int IS_TAKEN_REWARD_FIELD_NUMBER = 12;
    private boolean isTakenReward_;
    /**
     * <code>bool is_taken_reward = 12;</code>
     * @return The isTakenReward.
     */
    @java.lang.Override
    public boolean getIsTakenReward() {
      return isTakenReward_;
    }

    public static final int CUR_PROGRESS_FIELD_NUMBER = 10;
    private int curProgress_;
    /**
     * <code>uint32 cur_progress = 10;</code>
     * @return The curProgress.
     */
    @java.lang.Override
    public int getCurProgress() {
      return curProgress_;
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
      if (rewardUnlockTime_ != 0) {
        output.writeUInt32(1, rewardUnlockTime_);
      }
      if (totalProgress_ != 0) {
        output.writeUInt32(4, totalProgress_);
      }
      if (watcherId_ != 0) {
        output.writeUInt32(9, watcherId_);
      }
      if (curProgress_ != 0) {
        output.writeUInt32(10, curProgress_);
      }
      if (isTakenReward_ != false) {
        output.writeBool(12, isTakenReward_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rewardUnlockTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, rewardUnlockTime_);
      }
      if (totalProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, totalProgress_);
      }
      if (watcherId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, watcherId_);
      }
      if (curProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, curProgress_);
      }
      if (isTakenReward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isTakenReward_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo other = (emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo) obj;

      if (getTotalProgress()
          != other.getTotalProgress()) return false;
      if (getRewardUnlockTime()
          != other.getRewardUnlockTime()) return false;
      if (getWatcherId()
          != other.getWatcherId()) return false;
      if (getIsTakenReward()
          != other.getIsTakenReward()) return false;
      if (getCurProgress()
          != other.getCurProgress()) return false;
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
      hash = (37 * hash) + TOTAL_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getTotalProgress();
      hash = (37 * hash) + REWARD_UNLOCK_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getRewardUnlockTime();
      hash = (37 * hash) + WATCHER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWatcherId();
      hash = (37 * hash) + IS_TAKEN_REWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTakenReward());
      hash = (37 * hash) + CUR_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getCurProgress();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo prototype) {
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
     * Protobuf type {@code ReunionWatcherInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReunionWatcherInfo)
        emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.internal_static_ReunionWatcherInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.internal_static_ReunionWatcherInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo.class, emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        totalProgress_ = 0;

        rewardUnlockTime_ = 0;

        watcherId_ = 0;

        isTakenReward_ = false;

        curProgress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.internal_static_ReunionWatcherInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo build() {
        emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo buildPartial() {
        emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo result = new emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo(this);
        result.totalProgress_ = totalProgress_;
        result.rewardUnlockTime_ = rewardUnlockTime_;
        result.watcherId_ = watcherId_;
        result.isTakenReward_ = isTakenReward_;
        result.curProgress_ = curProgress_;
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
        if (other instanceof emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo other) {
        if (other == emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo.getDefaultInstance()) return this;
        if (other.getTotalProgress() != 0) {
          setTotalProgress(other.getTotalProgress());
        }
        if (other.getRewardUnlockTime() != 0) {
          setRewardUnlockTime(other.getRewardUnlockTime());
        }
        if (other.getWatcherId() != 0) {
          setWatcherId(other.getWatcherId());
        }
        if (other.getIsTakenReward() != false) {
          setIsTakenReward(other.getIsTakenReward());
        }
        if (other.getCurProgress() != 0) {
          setCurProgress(other.getCurProgress());
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
                rewardUnlockTime_ = input.readUInt32();

                break;
              } // case 8
              case 32: {
                totalProgress_ = input.readUInt32();

                break;
              } // case 32
              case 72: {
                watcherId_ = input.readUInt32();

                break;
              } // case 72
              case 80: {
                curProgress_ = input.readUInt32();

                break;
              } // case 80
              case 96: {
                isTakenReward_ = input.readBool();

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

      private int totalProgress_ ;
      /**
       * <code>uint32 total_progress = 4;</code>
       * @return The totalProgress.
       */
      @java.lang.Override
      public int getTotalProgress() {
        return totalProgress_;
      }
      /**
       * <code>uint32 total_progress = 4;</code>
       * @param value The totalProgress to set.
       * @return This builder for chaining.
       */
      public Builder setTotalProgress(int value) {
        
        totalProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_progress = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalProgress() {
        
        totalProgress_ = 0;
        onChanged();
        return this;
      }

      private int rewardUnlockTime_ ;
      /**
       * <code>uint32 reward_unlock_time = 1;</code>
       * @return The rewardUnlockTime.
       */
      @java.lang.Override
      public int getRewardUnlockTime() {
        return rewardUnlockTime_;
      }
      /**
       * <code>uint32 reward_unlock_time = 1;</code>
       * @param value The rewardUnlockTime to set.
       * @return This builder for chaining.
       */
      public Builder setRewardUnlockTime(int value) {
        
        rewardUnlockTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_unlock_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardUnlockTime() {
        
        rewardUnlockTime_ = 0;
        onChanged();
        return this;
      }

      private int watcherId_ ;
      /**
       * <code>uint32 watcher_id = 9;</code>
       * @return The watcherId.
       */
      @java.lang.Override
      public int getWatcherId() {
        return watcherId_;
      }
      /**
       * <code>uint32 watcher_id = 9;</code>
       * @param value The watcherId to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherId(int value) {
        
        watcherId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 watcher_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherId() {
        
        watcherId_ = 0;
        onChanged();
        return this;
      }

      private boolean isTakenReward_ ;
      /**
       * <code>bool is_taken_reward = 12;</code>
       * @return The isTakenReward.
       */
      @java.lang.Override
      public boolean getIsTakenReward() {
        return isTakenReward_;
      }
      /**
       * <code>bool is_taken_reward = 12;</code>
       * @param value The isTakenReward to set.
       * @return This builder for chaining.
       */
      public Builder setIsTakenReward(boolean value) {
        
        isTakenReward_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_taken_reward = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTakenReward() {
        
        isTakenReward_ = false;
        onChanged();
        return this;
      }

      private int curProgress_ ;
      /**
       * <code>uint32 cur_progress = 10;</code>
       * @return The curProgress.
       */
      @java.lang.Override
      public int getCurProgress() {
        return curProgress_;
      }
      /**
       * <code>uint32 cur_progress = 10;</code>
       * @param value The curProgress to set.
       * @return This builder for chaining.
       */
      public Builder setCurProgress(int value) {
        
        curProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_progress = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurProgress() {
        
        curProgress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ReunionWatcherInfo)
    }

    // @@protoc_insertion_point(class_scope:ReunionWatcherInfo)
    private static final emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo();
    }

    public static emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReunionWatcherInfo>
        PARSER = new com.google.protobuf.AbstractParser<ReunionWatcherInfo>() {
      @java.lang.Override
      public ReunionWatcherInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ReunionWatcherInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReunionWatcherInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ReunionWatcherInfoOuterClass.ReunionWatcherInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReunionWatcherInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReunionWatcherInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ReunionWatcherInfo.proto\"\213\001\n\022ReunionWa" +
      "tcherInfo\022\026\n\016total_progress\030\004 \001(\r\022\032\n\022rew" +
      "ard_unlock_time\030\001 \001(\r\022\022\n\nwatcher_id\030\t \001(" +
      "\r\022\027\n\017is_taken_reward\030\014 \001(\010\022\024\n\014cur_progre" +
      "ss\030\n \001(\rB\036\n\034emu.grasscutter.net.newproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReunionWatcherInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReunionWatcherInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReunionWatcherInfo_descriptor,
        new java.lang.String[] { "TotalProgress", "RewardUnlockTime", "WatcherId", "IsTakenReward", "CurProgress", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}