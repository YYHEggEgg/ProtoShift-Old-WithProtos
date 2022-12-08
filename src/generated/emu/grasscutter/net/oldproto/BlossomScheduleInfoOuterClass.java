// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlossomScheduleInfo.proto

package emu.grasscutter.net.oldproto;

public final class BlossomScheduleInfoOuterClass {
  private BlossomScheduleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlossomScheduleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlossomScheduleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 progress = 13;</code>
     * @return The progress.
     */
    int getProgress();

    /**
     * <code>uint32 state = 10;</code>
     * @return The state.
     */
    int getState();

    /**
     * <code>uint32 round = 4;</code>
     * @return The round.
     */
    int getRound();

    /**
     * <code>uint32 circle_camp_id = 15;</code>
     * @return The circleCampId.
     */
    int getCircleCampId();

    /**
     * <code>uint32 refresh_id = 6;</code>
     * @return The refreshId.
     */
    int getRefreshId();

    /**
     * <code>uint32 finish_progress = 14;</code>
     * @return The finishProgress.
     */
    int getFinishProgress();
  }
  /**
   * Protobuf type {@code BlossomScheduleInfo}
   */
  public static final class BlossomScheduleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlossomScheduleInfo)
      BlossomScheduleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlossomScheduleInfo.newBuilder() to construct.
    private BlossomScheduleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlossomScheduleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlossomScheduleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.internal_static_BlossomScheduleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.internal_static_BlossomScheduleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.class, emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.Builder.class);
    }

    public static final int PROGRESS_FIELD_NUMBER = 13;
    private int progress_;
    /**
     * <code>uint32 progress = 13;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
    }

    public static final int STATE_FIELD_NUMBER = 10;
    private int state_;
    /**
     * <code>uint32 state = 10;</code>
     * @return The state.
     */
    @java.lang.Override
    public int getState() {
      return state_;
    }

    public static final int ROUND_FIELD_NUMBER = 4;
    private int round_;
    /**
     * <code>uint32 round = 4;</code>
     * @return The round.
     */
    @java.lang.Override
    public int getRound() {
      return round_;
    }

    public static final int CIRCLE_CAMP_ID_FIELD_NUMBER = 15;
    private int circleCampId_;
    /**
     * <code>uint32 circle_camp_id = 15;</code>
     * @return The circleCampId.
     */
    @java.lang.Override
    public int getCircleCampId() {
      return circleCampId_;
    }

    public static final int REFRESH_ID_FIELD_NUMBER = 6;
    private int refreshId_;
    /**
     * <code>uint32 refresh_id = 6;</code>
     * @return The refreshId.
     */
    @java.lang.Override
    public int getRefreshId() {
      return refreshId_;
    }

    public static final int FINISH_PROGRESS_FIELD_NUMBER = 14;
    private int finishProgress_;
    /**
     * <code>uint32 finish_progress = 14;</code>
     * @return The finishProgress.
     */
    @java.lang.Override
    public int getFinishProgress() {
      return finishProgress_;
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
      if (round_ != 0) {
        output.writeUInt32(4, round_);
      }
      if (refreshId_ != 0) {
        output.writeUInt32(6, refreshId_);
      }
      if (state_ != 0) {
        output.writeUInt32(10, state_);
      }
      if (progress_ != 0) {
        output.writeUInt32(13, progress_);
      }
      if (finishProgress_ != 0) {
        output.writeUInt32(14, finishProgress_);
      }
      if (circleCampId_ != 0) {
        output.writeUInt32(15, circleCampId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (round_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, round_);
      }
      if (refreshId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, refreshId_);
      }
      if (state_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, state_);
      }
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, progress_);
      }
      if (finishProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, finishProgress_);
      }
      if (circleCampId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, circleCampId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo other = (emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo) obj;

      if (getProgress()
          != other.getProgress()) return false;
      if (getState()
          != other.getState()) return false;
      if (getRound()
          != other.getRound()) return false;
      if (getCircleCampId()
          != other.getCircleCampId()) return false;
      if (getRefreshId()
          != other.getRefreshId()) return false;
      if (getFinishProgress()
          != other.getFinishProgress()) return false;
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
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState();
      hash = (37 * hash) + ROUND_FIELD_NUMBER;
      hash = (53 * hash) + getRound();
      hash = (37 * hash) + CIRCLE_CAMP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCircleCampId();
      hash = (37 * hash) + REFRESH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRefreshId();
      hash = (37 * hash) + FINISH_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getFinishProgress();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo prototype) {
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
     * Protobuf type {@code BlossomScheduleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlossomScheduleInfo)
        emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.internal_static_BlossomScheduleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.internal_static_BlossomScheduleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.class, emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        progress_ = 0;

        state_ = 0;

        round_ = 0;

        circleCampId_ = 0;

        refreshId_ = 0;

        finishProgress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.internal_static_BlossomScheduleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo build() {
        emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo buildPartial() {
        emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo result = new emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo(this);
        result.progress_ = progress_;
        result.state_ = state_;
        result.round_ = round_;
        result.circleCampId_ = circleCampId_;
        result.refreshId_ = refreshId_;
        result.finishProgress_ = finishProgress_;
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
        if (other instanceof emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo other) {
        if (other == emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo.getDefaultInstance()) return this;
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
        }
        if (other.getState() != 0) {
          setState(other.getState());
        }
        if (other.getRound() != 0) {
          setRound(other.getRound());
        }
        if (other.getCircleCampId() != 0) {
          setCircleCampId(other.getCircleCampId());
        }
        if (other.getRefreshId() != 0) {
          setRefreshId(other.getRefreshId());
        }
        if (other.getFinishProgress() != 0) {
          setFinishProgress(other.getFinishProgress());
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
              case 32: {
                round_ = input.readUInt32();

                break;
              } // case 32
              case 48: {
                refreshId_ = input.readUInt32();

                break;
              } // case 48
              case 80: {
                state_ = input.readUInt32();

                break;
              } // case 80
              case 104: {
                progress_ = input.readUInt32();

                break;
              } // case 104
              case 112: {
                finishProgress_ = input.readUInt32();

                break;
              } // case 112
              case 120: {
                circleCampId_ = input.readUInt32();

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

      private int progress_ ;
      /**
       * <code>uint32 progress = 13;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 13;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        
        progress_ = 0;
        onChanged();
        return this;
      }

      private int state_ ;
      /**
       * <code>uint32 state = 10;</code>
       * @return The state.
       */
      @java.lang.Override
      public int getState() {
        return state_;
      }
      /**
       * <code>uint32 state = 10;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 state = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
        onChanged();
        return this;
      }

      private int round_ ;
      /**
       * <code>uint32 round = 4;</code>
       * @return The round.
       */
      @java.lang.Override
      public int getRound() {
        return round_;
      }
      /**
       * <code>uint32 round = 4;</code>
       * @param value The round to set.
       * @return This builder for chaining.
       */
      public Builder setRound(int value) {
        
        round_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 round = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRound() {
        
        round_ = 0;
        onChanged();
        return this;
      }

      private int circleCampId_ ;
      /**
       * <code>uint32 circle_camp_id = 15;</code>
       * @return The circleCampId.
       */
      @java.lang.Override
      public int getCircleCampId() {
        return circleCampId_;
      }
      /**
       * <code>uint32 circle_camp_id = 15;</code>
       * @param value The circleCampId to set.
       * @return This builder for chaining.
       */
      public Builder setCircleCampId(int value) {
        
        circleCampId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 circle_camp_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCircleCampId() {
        
        circleCampId_ = 0;
        onChanged();
        return this;
      }

      private int refreshId_ ;
      /**
       * <code>uint32 refresh_id = 6;</code>
       * @return The refreshId.
       */
      @java.lang.Override
      public int getRefreshId() {
        return refreshId_;
      }
      /**
       * <code>uint32 refresh_id = 6;</code>
       * @param value The refreshId to set.
       * @return This builder for chaining.
       */
      public Builder setRefreshId(int value) {
        
        refreshId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 refresh_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRefreshId() {
        
        refreshId_ = 0;
        onChanged();
        return this;
      }

      private int finishProgress_ ;
      /**
       * <code>uint32 finish_progress = 14;</code>
       * @return The finishProgress.
       */
      @java.lang.Override
      public int getFinishProgress() {
        return finishProgress_;
      }
      /**
       * <code>uint32 finish_progress = 14;</code>
       * @param value The finishProgress to set.
       * @return This builder for chaining.
       */
      public Builder setFinishProgress(int value) {
        
        finishProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_progress = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishProgress() {
        
        finishProgress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BlossomScheduleInfo)
    }

    // @@protoc_insertion_point(class_scope:BlossomScheduleInfo)
    private static final emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo();
    }

    public static emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlossomScheduleInfo>
        PARSER = new com.google.protobuf.AbstractParser<BlossomScheduleInfo>() {
      @java.lang.Override
      public BlossomScheduleInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<BlossomScheduleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlossomScheduleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.BlossomScheduleInfoOuterClass.BlossomScheduleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlossomScheduleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlossomScheduleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031BlossomScheduleInfo.proto\"\212\001\n\023BlossomS" +
      "cheduleInfo\022\020\n\010progress\030\r \001(\r\022\r\n\005state\030\n" +
      " \001(\r\022\r\n\005round\030\004 \001(\r\022\026\n\016circle_camp_id\030\017 " +
      "\001(\r\022\022\n\nrefresh_id\030\006 \001(\r\022\027\n\017finish_progre" +
      "ss\030\016 \001(\rB\036\n\034emu.grasscutter.net.oldproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BlossomScheduleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlossomScheduleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlossomScheduleInfo_descriptor,
        new java.lang.String[] { "Progress", "State", "Round", "CircleCampId", "RefreshId", "FinishProgress", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
