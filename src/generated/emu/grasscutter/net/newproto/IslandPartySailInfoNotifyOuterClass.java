// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IslandPartySailInfoNotify.proto

package emu.grasscutter.net.newproto;

public final class IslandPartySailInfoNotifyOuterClass {
  private IslandPartySailInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IslandPartySailInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IslandPartySailInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.IslandPartySailStage stage = 2;</code>
     * @return The enum numeric value on the wire for stage.
     */
    int getStageValue();
    /**
     * <code>.IslandPartySailStage stage = 2;</code>
     * @return The stage.
     */
    emu.grasscutter.net.newproto.IslandPartySailStageOuterClass.IslandPartySailStage getStage();

    /**
     * <code>uint32 kill_monster_count = 6;</code>
     * @return The killMonsterCount.
     */
    int getKillMonsterCount();

    /**
     * <code>uint32 coin = 14;</code>
     * @return The coin.
     */
    int getCoin();

    /**
     * <code>uint32 progress = 9;</code>
     * @return The progress.
     */
    int getProgress();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5544;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code IslandPartySailInfoNotify}
   */
  public static final class IslandPartySailInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IslandPartySailInfoNotify)
      IslandPartySailInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IslandPartySailInfoNotify.newBuilder() to construct.
    private IslandPartySailInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IslandPartySailInfoNotify() {
      stage_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IslandPartySailInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.internal_static_IslandPartySailInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.internal_static_IslandPartySailInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify.class, emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify.Builder.class);
    }

    public static final int STAGE_FIELD_NUMBER = 2;
    private int stage_;
    /**
     * <code>.IslandPartySailStage stage = 2;</code>
     * @return The enum numeric value on the wire for stage.
     */
    @java.lang.Override public int getStageValue() {
      return stage_;
    }
    /**
     * <code>.IslandPartySailStage stage = 2;</code>
     * @return The stage.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.IslandPartySailStageOuterClass.IslandPartySailStage getStage() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.IslandPartySailStageOuterClass.IslandPartySailStage result = emu.grasscutter.net.newproto.IslandPartySailStageOuterClass.IslandPartySailStage.valueOf(stage_);
      return result == null ? emu.grasscutter.net.newproto.IslandPartySailStageOuterClass.IslandPartySailStage.UNRECOGNIZED : result;
    }

    public static final int KILL_MONSTER_COUNT_FIELD_NUMBER = 6;
    private int killMonsterCount_;
    /**
     * <code>uint32 kill_monster_count = 6;</code>
     * @return The killMonsterCount.
     */
    @java.lang.Override
    public int getKillMonsterCount() {
      return killMonsterCount_;
    }

    public static final int COIN_FIELD_NUMBER = 14;
    private int coin_;
    /**
     * <code>uint32 coin = 14;</code>
     * @return The coin.
     */
    @java.lang.Override
    public int getCoin() {
      return coin_;
    }

    public static final int PROGRESS_FIELD_NUMBER = 9;
    private int progress_;
    /**
     * <code>uint32 progress = 9;</code>
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
      if (stage_ != emu.grasscutter.net.newproto.IslandPartySailStageOuterClass.IslandPartySailStage.ISLAND_PARTY_SAIL_STAGE_NONE.getNumber()) {
        output.writeEnum(2, stage_);
      }
      if (killMonsterCount_ != 0) {
        output.writeUInt32(6, killMonsterCount_);
      }
      if (progress_ != 0) {
        output.writeUInt32(9, progress_);
      }
      if (coin_ != 0) {
        output.writeUInt32(14, coin_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stage_ != emu.grasscutter.net.newproto.IslandPartySailStageOuterClass.IslandPartySailStage.ISLAND_PARTY_SAIL_STAGE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, stage_);
      }
      if (killMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, killMonsterCount_);
      }
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, progress_);
      }
      if (coin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, coin_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify other = (emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify) obj;

      if (stage_ != other.stage_) return false;
      if (getKillMonsterCount()
          != other.getKillMonsterCount()) return false;
      if (getCoin()
          != other.getCoin()) return false;
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
      hash = (37 * hash) + STAGE_FIELD_NUMBER;
      hash = (53 * hash) + stage_;
      hash = (37 * hash) + KILL_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKillMonsterCount();
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin();
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify prototype) {
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
     *   CMD_ID = 5544;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code IslandPartySailInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IslandPartySailInfoNotify)
        emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.internal_static_IslandPartySailInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.internal_static_IslandPartySailInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify.class, emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        stage_ = 0;

        killMonsterCount_ = 0;

        coin_ = 0;

        progress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.internal_static_IslandPartySailInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify build() {
        emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify buildPartial() {
        emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify result = new emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify(this);
        result.stage_ = stage_;
        result.killMonsterCount_ = killMonsterCount_;
        result.coin_ = coin_;
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
        if (other instanceof emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify other) {
        if (other == emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify.getDefaultInstance()) return this;
        if (other.stage_ != 0) {
          setStageValue(other.getStageValue());
        }
        if (other.getKillMonsterCount() != 0) {
          setKillMonsterCount(other.getKillMonsterCount());
        }
        if (other.getCoin() != 0) {
          setCoin(other.getCoin());
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
              case 16: {
                stage_ = input.readEnum();

                break;
              } // case 16
              case 48: {
                killMonsterCount_ = input.readUInt32();

                break;
              } // case 48
              case 72: {
                progress_ = input.readUInt32();

                break;
              } // case 72
              case 112: {
                coin_ = input.readUInt32();

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

      private int stage_ = 0;
      /**
       * <code>.IslandPartySailStage stage = 2;</code>
       * @return The enum numeric value on the wire for stage.
       */
      @java.lang.Override public int getStageValue() {
        return stage_;
      }
      /**
       * <code>.IslandPartySailStage stage = 2;</code>
       * @param value The enum numeric value on the wire for stage to set.
       * @return This builder for chaining.
       */
      public Builder setStageValue(int value) {
        
        stage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.IslandPartySailStage stage = 2;</code>
       * @return The stage.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.IslandPartySailStageOuterClass.IslandPartySailStage getStage() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.IslandPartySailStageOuterClass.IslandPartySailStage result = emu.grasscutter.net.newproto.IslandPartySailStageOuterClass.IslandPartySailStage.valueOf(stage_);
        return result == null ? emu.grasscutter.net.newproto.IslandPartySailStageOuterClass.IslandPartySailStage.UNRECOGNIZED : result;
      }
      /**
       * <code>.IslandPartySailStage stage = 2;</code>
       * @param value The stage to set.
       * @return This builder for chaining.
       */
      public Builder setStage(emu.grasscutter.net.newproto.IslandPartySailStageOuterClass.IslandPartySailStage value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        stage_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.IslandPartySailStage stage = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStage() {
        
        stage_ = 0;
        onChanged();
        return this;
      }

      private int killMonsterCount_ ;
      /**
       * <code>uint32 kill_monster_count = 6;</code>
       * @return The killMonsterCount.
       */
      @java.lang.Override
      public int getKillMonsterCount() {
        return killMonsterCount_;
      }
      /**
       * <code>uint32 kill_monster_count = 6;</code>
       * @param value The killMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setKillMonsterCount(int value) {
        
        killMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_monster_count = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillMonsterCount() {
        
        killMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int coin_ ;
      /**
       * <code>uint32 coin = 14;</code>
       * @return The coin.
       */
      @java.lang.Override
      public int getCoin() {
        return coin_;
      }
      /**
       * <code>uint32 coin = 14;</code>
       * @param value The coin to set.
       * @return This builder for chaining.
       */
      public Builder setCoin(int value) {
        
        coin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoin() {
        
        coin_ = 0;
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 9;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 9;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 9;</code>
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


      // @@protoc_insertion_point(builder_scope:IslandPartySailInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:IslandPartySailInfoNotify)
    private static final emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify();
    }

    public static emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IslandPartySailInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<IslandPartySailInfoNotify>() {
      @java.lang.Override
      public IslandPartySailInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<IslandPartySailInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IslandPartySailInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.IslandPartySailInfoNotifyOuterClass.IslandPartySailInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IslandPartySailInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IslandPartySailInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037IslandPartySailInfoNotify.proto\032\032Islan" +
      "dPartySailStage.proto\"}\n\031IslandPartySail" +
      "InfoNotify\022$\n\005stage\030\002 \001(\0162\025.IslandPartyS" +
      "ailStage\022\032\n\022kill_monster_count\030\006 \001(\r\022\014\n\004" +
      "coin\030\016 \001(\r\022\020\n\010progress\030\t \001(\rB\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.IslandPartySailStageOuterClass.getDescriptor(),
        });
    internal_static_IslandPartySailInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IslandPartySailInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IslandPartySailInfoNotify_descriptor,
        new java.lang.String[] { "Stage", "KillMonsterCount", "Coin", "Progress", });
    emu.grasscutter.net.newproto.IslandPartySailStageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}