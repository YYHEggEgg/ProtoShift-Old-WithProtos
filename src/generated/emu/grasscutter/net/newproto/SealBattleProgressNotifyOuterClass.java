// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SealBattleProgressNotify.proto

package emu.grasscutter.net.newproto;

public final class SealBattleProgressNotifyOuterClass {
  private SealBattleProgressNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SealBattleProgressNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SealBattleProgressNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 end_time = 5;</code>
     * @return The endTime.
     */
    int getEndTime();

    /**
     * <code>uint32 seal_radius = 1;</code>
     * @return The sealRadius.
     */
    int getSealRadius();

    /**
     * <code>uint32 max_progress = 9;</code>
     * @return The maxProgress.
     */
    int getMaxProgress();

    /**
     * <code>uint32 seal_entity_id = 6;</code>
     * @return The sealEntityId.
     */
    int getSealEntityId();

    /**
     * <code>uint32 progress = 4;</code>
     * @return The progress.
     */
    int getProgress();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 265;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SealBattleProgressNotify}
   */
  public static final class SealBattleProgressNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SealBattleProgressNotify)
      SealBattleProgressNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SealBattleProgressNotify.newBuilder() to construct.
    private SealBattleProgressNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SealBattleProgressNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SealBattleProgressNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.internal_static_SealBattleProgressNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.internal_static_SealBattleProgressNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify.class, emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify.Builder.class);
    }

    public static final int END_TIME_FIELD_NUMBER = 5;
    private int endTime_;
    /**
     * <code>uint32 end_time = 5;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }

    public static final int SEAL_RADIUS_FIELD_NUMBER = 1;
    private int sealRadius_;
    /**
     * <code>uint32 seal_radius = 1;</code>
     * @return The sealRadius.
     */
    @java.lang.Override
    public int getSealRadius() {
      return sealRadius_;
    }

    public static final int MAX_PROGRESS_FIELD_NUMBER = 9;
    private int maxProgress_;
    /**
     * <code>uint32 max_progress = 9;</code>
     * @return The maxProgress.
     */
    @java.lang.Override
    public int getMaxProgress() {
      return maxProgress_;
    }

    public static final int SEAL_ENTITY_ID_FIELD_NUMBER = 6;
    private int sealEntityId_;
    /**
     * <code>uint32 seal_entity_id = 6;</code>
     * @return The sealEntityId.
     */
    @java.lang.Override
    public int getSealEntityId() {
      return sealEntityId_;
    }

    public static final int PROGRESS_FIELD_NUMBER = 4;
    private int progress_;
    /**
     * <code>uint32 progress = 4;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
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
      if (sealRadius_ != 0) {
        output.writeUInt32(1, sealRadius_);
      }
      if (progress_ != 0) {
        output.writeUInt32(4, progress_);
      }
      if (endTime_ != 0) {
        output.writeUInt32(5, endTime_);
      }
      if (sealEntityId_ != 0) {
        output.writeUInt32(6, sealEntityId_);
      }
      if (maxProgress_ != 0) {
        output.writeUInt32(9, maxProgress_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sealRadius_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, sealRadius_);
      }
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, progress_);
      }
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, endTime_);
      }
      if (sealEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, sealEntityId_);
      }
      if (maxProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, maxProgress_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify other = (emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify) obj;

      if (getEndTime()
          != other.getEndTime()) return false;
      if (getSealRadius()
          != other.getSealRadius()) return false;
      if (getMaxProgress()
          != other.getMaxProgress()) return false;
      if (getSealEntityId()
          != other.getSealEntityId()) return false;
      if (getProgress()
          != other.getProgress()) return false;
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
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (37 * hash) + SEAL_RADIUS_FIELD_NUMBER;
      hash = (53 * hash) + getSealRadius();
      hash = (37 * hash) + MAX_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxProgress();
      hash = (37 * hash) + SEAL_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSealEntityId();
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify prototype) {
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
     *   CMD_ID = 265;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SealBattleProgressNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SealBattleProgressNotify)
        emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.internal_static_SealBattleProgressNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.internal_static_SealBattleProgressNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify.class, emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        endTime_ = 0;

        sealRadius_ = 0;

        maxProgress_ = 0;

        sealEntityId_ = 0;

        progress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.internal_static_SealBattleProgressNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify build() {
        emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify buildPartial() {
        emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify result = new emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify(this);
        result.endTime_ = endTime_;
        result.sealRadius_ = sealRadius_;
        result.maxProgress_ = maxProgress_;
        result.sealEntityId_ = sealEntityId_;
        result.progress_ = progress_;
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
        if (other instanceof emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify other) {
        if (other == emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify.getDefaultInstance()) return this;
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
        }
        if (other.getSealRadius() != 0) {
          setSealRadius(other.getSealRadius());
        }
        if (other.getMaxProgress() != 0) {
          setMaxProgress(other.getMaxProgress());
        }
        if (other.getSealEntityId() != 0) {
          setSealEntityId(other.getSealEntityId());
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
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
                sealRadius_ = input.readUInt32();

                break;
              } // case 8
              case 32: {
                progress_ = input.readUInt32();

                break;
              } // case 32
              case 40: {
                endTime_ = input.readUInt32();

                break;
              } // case 40
              case 48: {
                sealEntityId_ = input.readUInt32();

                break;
              } // case 48
              case 72: {
                maxProgress_ = input.readUInt32();

                break;
              } // case 72
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

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 5;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 5;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
        onChanged();
        return this;
      }

      private int sealRadius_ ;
      /**
       * <code>uint32 seal_radius = 1;</code>
       * @return The sealRadius.
       */
      @java.lang.Override
      public int getSealRadius() {
        return sealRadius_;
      }
      /**
       * <code>uint32 seal_radius = 1;</code>
       * @param value The sealRadius to set.
       * @return This builder for chaining.
       */
      public Builder setSealRadius(int value) {
        
        sealRadius_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 seal_radius = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSealRadius() {
        
        sealRadius_ = 0;
        onChanged();
        return this;
      }

      private int maxProgress_ ;
      /**
       * <code>uint32 max_progress = 9;</code>
       * @return The maxProgress.
       */
      @java.lang.Override
      public int getMaxProgress() {
        return maxProgress_;
      }
      /**
       * <code>uint32 max_progress = 9;</code>
       * @param value The maxProgress to set.
       * @return This builder for chaining.
       */
      public Builder setMaxProgress(int value) {
        
        maxProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_progress = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxProgress() {
        
        maxProgress_ = 0;
        onChanged();
        return this;
      }

      private int sealEntityId_ ;
      /**
       * <code>uint32 seal_entity_id = 6;</code>
       * @return The sealEntityId.
       */
      @java.lang.Override
      public int getSealEntityId() {
        return sealEntityId_;
      }
      /**
       * <code>uint32 seal_entity_id = 6;</code>
       * @param value The sealEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setSealEntityId(int value) {
        
        sealEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 seal_entity_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSealEntityId() {
        
        sealEntityId_ = 0;
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 4;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 4;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        
        progress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SealBattleProgressNotify)
    }

    // @@protoc_insertion_point(class_scope:SealBattleProgressNotify)
    private static final emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify();
    }

    public static emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SealBattleProgressNotify>
        PARSER = new com.google.protobuf.AbstractParser<SealBattleProgressNotify>() {
      @java.lang.Override
      public SealBattleProgressNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SealBattleProgressNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SealBattleProgressNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SealBattleProgressNotifyOuterClass.SealBattleProgressNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SealBattleProgressNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SealBattleProgressNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036SealBattleProgressNotify.proto\"\201\001\n\030Sea" +
      "lBattleProgressNotify\022\020\n\010end_time\030\005 \001(\r\022" +
      "\023\n\013seal_radius\030\001 \001(\r\022\024\n\014max_progress\030\t \001" +
      "(\r\022\026\n\016seal_entity_id\030\006 \001(\r\022\020\n\010progress\030\004" +
      " \001(\rB\036\n\034emu.grasscutter.net.newprotob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SealBattleProgressNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SealBattleProgressNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SealBattleProgressNotify_descriptor,
        new java.lang.String[] { "EndTime", "SealRadius", "MaxProgress", "SealEntityId", "Progress", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
