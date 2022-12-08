// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMixinFireworksLauncher.proto

package emu.grasscutter.net.oldproto;

public final class AbilityMixinFireworksLauncherOuterClass {
  private AbilityMixinFireworksLauncherOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMixinFireworksLauncherOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMixinFireworksLauncher)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 invoke_type = 2;</code>
     * @return The invokeType.
     */
    int getInvokeType();

    /**
     * <code>uint32 start_count_down_time = 3;</code>
     * @return The startCountDownTime.
     */
    int getStartCountDownTime();

    /**
     * <code>uint32 fired_bullet_count = 1;</code>
     * @return The firedBulletCount.
     */
    int getFiredBulletCount();

    /**
     * <code>uint32 phase = 6;</code>
     * @return The phase.
     */
    int getPhase();

    /**
     * <code>repeated uint32 fireworks_config = 4;</code>
     * @return A list containing the fireworksConfig.
     */
    java.util.List<java.lang.Integer> getFireworksConfigList();
    /**
     * <code>repeated uint32 fireworks_config = 4;</code>
     * @return The count of fireworksConfig.
     */
    int getFireworksConfigCount();
    /**
     * <code>repeated uint32 fireworks_config = 4;</code>
     * @param index The index of the element to return.
     * @return The fireworksConfig at the given index.
     */
    int getFireworksConfig(int index);

    /**
     * <code>uint32 turn_index = 7;</code>
     * @return The turnIndex.
     */
    int getTurnIndex();
  }
  /**
   * Protobuf type {@code AbilityMixinFireworksLauncher}
   */
  public static final class AbilityMixinFireworksLauncher extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMixinFireworksLauncher)
      AbilityMixinFireworksLauncherOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMixinFireworksLauncher.newBuilder() to construct.
    private AbilityMixinFireworksLauncher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMixinFireworksLauncher() {
      fireworksConfig_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMixinFireworksLauncher();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.internal_static_AbilityMixinFireworksLauncher_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.internal_static_AbilityMixinFireworksLauncher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher.class, emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher.Builder.class);
    }

    public static final int INVOKE_TYPE_FIELD_NUMBER = 2;
    private int invokeType_;
    /**
     * <code>uint32 invoke_type = 2;</code>
     * @return The invokeType.
     */
    @java.lang.Override
    public int getInvokeType() {
      return invokeType_;
    }

    public static final int START_COUNT_DOWN_TIME_FIELD_NUMBER = 3;
    private int startCountDownTime_;
    /**
     * <code>uint32 start_count_down_time = 3;</code>
     * @return The startCountDownTime.
     */
    @java.lang.Override
    public int getStartCountDownTime() {
      return startCountDownTime_;
    }

    public static final int FIRED_BULLET_COUNT_FIELD_NUMBER = 1;
    private int firedBulletCount_;
    /**
     * <code>uint32 fired_bullet_count = 1;</code>
     * @return The firedBulletCount.
     */
    @java.lang.Override
    public int getFiredBulletCount() {
      return firedBulletCount_;
    }

    public static final int PHASE_FIELD_NUMBER = 6;
    private int phase_;
    /**
     * <code>uint32 phase = 6;</code>
     * @return The phase.
     */
    @java.lang.Override
    public int getPhase() {
      return phase_;
    }

    public static final int FIREWORKS_CONFIG_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList fireworksConfig_;
    /**
     * <code>repeated uint32 fireworks_config = 4;</code>
     * @return A list containing the fireworksConfig.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFireworksConfigList() {
      return fireworksConfig_;
    }
    /**
     * <code>repeated uint32 fireworks_config = 4;</code>
     * @return The count of fireworksConfig.
     */
    public int getFireworksConfigCount() {
      return fireworksConfig_.size();
    }
    /**
     * <code>repeated uint32 fireworks_config = 4;</code>
     * @param index The index of the element to return.
     * @return The fireworksConfig at the given index.
     */
    public int getFireworksConfig(int index) {
      return fireworksConfig_.getInt(index);
    }
    private int fireworksConfigMemoizedSerializedSize = -1;

    public static final int TURN_INDEX_FIELD_NUMBER = 7;
    private int turnIndex_;
    /**
     * <code>uint32 turn_index = 7;</code>
     * @return The turnIndex.
     */
    @java.lang.Override
    public int getTurnIndex() {
      return turnIndex_;
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
      getSerializedSize();
      if (firedBulletCount_ != 0) {
        output.writeUInt32(1, firedBulletCount_);
      }
      if (invokeType_ != 0) {
        output.writeUInt32(2, invokeType_);
      }
      if (startCountDownTime_ != 0) {
        output.writeUInt32(3, startCountDownTime_);
      }
      if (getFireworksConfigList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(fireworksConfigMemoizedSerializedSize);
      }
      for (int i = 0; i < fireworksConfig_.size(); i++) {
        output.writeUInt32NoTag(fireworksConfig_.getInt(i));
      }
      if (phase_ != 0) {
        output.writeUInt32(6, phase_);
      }
      if (turnIndex_ != 0) {
        output.writeUInt32(7, turnIndex_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (firedBulletCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, firedBulletCount_);
      }
      if (invokeType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, invokeType_);
      }
      if (startCountDownTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, startCountDownTime_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fireworksConfig_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(fireworksConfig_.getInt(i));
        }
        size += dataSize;
        if (!getFireworksConfigList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fireworksConfigMemoizedSerializedSize = dataSize;
      }
      if (phase_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, phase_);
      }
      if (turnIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, turnIndex_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher other = (emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher) obj;

      if (getInvokeType()
          != other.getInvokeType()) return false;
      if (getStartCountDownTime()
          != other.getStartCountDownTime()) return false;
      if (getFiredBulletCount()
          != other.getFiredBulletCount()) return false;
      if (getPhase()
          != other.getPhase()) return false;
      if (!getFireworksConfigList()
          .equals(other.getFireworksConfigList())) return false;
      if (getTurnIndex()
          != other.getTurnIndex()) return false;
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
      hash = (37 * hash) + INVOKE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getInvokeType();
      hash = (37 * hash) + START_COUNT_DOWN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartCountDownTime();
      hash = (37 * hash) + FIRED_BULLET_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getFiredBulletCount();
      hash = (37 * hash) + PHASE_FIELD_NUMBER;
      hash = (53 * hash) + getPhase();
      if (getFireworksConfigCount() > 0) {
        hash = (37 * hash) + FIREWORKS_CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getFireworksConfigList().hashCode();
      }
      hash = (37 * hash) + TURN_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getTurnIndex();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher prototype) {
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
     * Protobuf type {@code AbilityMixinFireworksLauncher}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMixinFireworksLauncher)
        emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncherOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.internal_static_AbilityMixinFireworksLauncher_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.internal_static_AbilityMixinFireworksLauncher_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher.class, emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        invokeType_ = 0;

        startCountDownTime_ = 0;

        firedBulletCount_ = 0;

        phase_ = 0;

        fireworksConfig_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        turnIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.internal_static_AbilityMixinFireworksLauncher_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher build() {
        emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher buildPartial() {
        emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher result = new emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher(this);
        int from_bitField0_ = bitField0_;
        result.invokeType_ = invokeType_;
        result.startCountDownTime_ = startCountDownTime_;
        result.firedBulletCount_ = firedBulletCount_;
        result.phase_ = phase_;
        if (((bitField0_ & 0x00000001) != 0)) {
          fireworksConfig_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fireworksConfig_ = fireworksConfig_;
        result.turnIndex_ = turnIndex_;
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
        if (other instanceof emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher) {
          return mergeFrom((emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher other) {
        if (other == emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher.getDefaultInstance()) return this;
        if (other.getInvokeType() != 0) {
          setInvokeType(other.getInvokeType());
        }
        if (other.getStartCountDownTime() != 0) {
          setStartCountDownTime(other.getStartCountDownTime());
        }
        if (other.getFiredBulletCount() != 0) {
          setFiredBulletCount(other.getFiredBulletCount());
        }
        if (other.getPhase() != 0) {
          setPhase(other.getPhase());
        }
        if (!other.fireworksConfig_.isEmpty()) {
          if (fireworksConfig_.isEmpty()) {
            fireworksConfig_ = other.fireworksConfig_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFireworksConfigIsMutable();
            fireworksConfig_.addAll(other.fireworksConfig_);
          }
          onChanged();
        }
        if (other.getTurnIndex() != 0) {
          setTurnIndex(other.getTurnIndex());
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
                firedBulletCount_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                invokeType_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                startCountDownTime_ = input.readUInt32();

                break;
              } // case 24
              case 32: {
                int v = input.readUInt32();
                ensureFireworksConfigIsMutable();
                fireworksConfig_.addInt(v);
                break;
              } // case 32
              case 34: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureFireworksConfigIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  fireworksConfig_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 34
              case 48: {
                phase_ = input.readUInt32();

                break;
              } // case 48
              case 56: {
                turnIndex_ = input.readUInt32();

                break;
              } // case 56
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
      private int bitField0_;

      private int invokeType_ ;
      /**
       * <code>uint32 invoke_type = 2;</code>
       * @return The invokeType.
       */
      @java.lang.Override
      public int getInvokeType() {
        return invokeType_;
      }
      /**
       * <code>uint32 invoke_type = 2;</code>
       * @param value The invokeType to set.
       * @return This builder for chaining.
       */
      public Builder setInvokeType(int value) {
        
        invokeType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 invoke_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearInvokeType() {
        
        invokeType_ = 0;
        onChanged();
        return this;
      }

      private int startCountDownTime_ ;
      /**
       * <code>uint32 start_count_down_time = 3;</code>
       * @return The startCountDownTime.
       */
      @java.lang.Override
      public int getStartCountDownTime() {
        return startCountDownTime_;
      }
      /**
       * <code>uint32 start_count_down_time = 3;</code>
       * @param value The startCountDownTime to set.
       * @return This builder for chaining.
       */
      public Builder setStartCountDownTime(int value) {
        
        startCountDownTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 start_count_down_time = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartCountDownTime() {
        
        startCountDownTime_ = 0;
        onChanged();
        return this;
      }

      private int firedBulletCount_ ;
      /**
       * <code>uint32 fired_bullet_count = 1;</code>
       * @return The firedBulletCount.
       */
      @java.lang.Override
      public int getFiredBulletCount() {
        return firedBulletCount_;
      }
      /**
       * <code>uint32 fired_bullet_count = 1;</code>
       * @param value The firedBulletCount to set.
       * @return This builder for chaining.
       */
      public Builder setFiredBulletCount(int value) {
        
        firedBulletCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fired_bullet_count = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFiredBulletCount() {
        
        firedBulletCount_ = 0;
        onChanged();
        return this;
      }

      private int phase_ ;
      /**
       * <code>uint32 phase = 6;</code>
       * @return The phase.
       */
      @java.lang.Override
      public int getPhase() {
        return phase_;
      }
      /**
       * <code>uint32 phase = 6;</code>
       * @param value The phase to set.
       * @return This builder for chaining.
       */
      public Builder setPhase(int value) {
        
        phase_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 phase = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPhase() {
        
        phase_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList fireworksConfig_ = emptyIntList();
      private void ensureFireworksConfigIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fireworksConfig_ = mutableCopy(fireworksConfig_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 fireworks_config = 4;</code>
       * @return A list containing the fireworksConfig.
       */
      public java.util.List<java.lang.Integer>
          getFireworksConfigList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(fireworksConfig_) : fireworksConfig_;
      }
      /**
       * <code>repeated uint32 fireworks_config = 4;</code>
       * @return The count of fireworksConfig.
       */
      public int getFireworksConfigCount() {
        return fireworksConfig_.size();
      }
      /**
       * <code>repeated uint32 fireworks_config = 4;</code>
       * @param index The index of the element to return.
       * @return The fireworksConfig at the given index.
       */
      public int getFireworksConfig(int index) {
        return fireworksConfig_.getInt(index);
      }
      /**
       * <code>repeated uint32 fireworks_config = 4;</code>
       * @param index The index to set the value at.
       * @param value The fireworksConfig to set.
       * @return This builder for chaining.
       */
      public Builder setFireworksConfig(
          int index, int value) {
        ensureFireworksConfigIsMutable();
        fireworksConfig_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fireworks_config = 4;</code>
       * @param value The fireworksConfig to add.
       * @return This builder for chaining.
       */
      public Builder addFireworksConfig(int value) {
        ensureFireworksConfigIsMutable();
        fireworksConfig_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fireworks_config = 4;</code>
       * @param values The fireworksConfig to add.
       * @return This builder for chaining.
       */
      public Builder addAllFireworksConfig(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFireworksConfigIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fireworksConfig_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fireworks_config = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFireworksConfig() {
        fireworksConfig_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int turnIndex_ ;
      /**
       * <code>uint32 turn_index = 7;</code>
       * @return The turnIndex.
       */
      @java.lang.Override
      public int getTurnIndex() {
        return turnIndex_;
      }
      /**
       * <code>uint32 turn_index = 7;</code>
       * @param value The turnIndex to set.
       * @return This builder for chaining.
       */
      public Builder setTurnIndex(int value) {
        
        turnIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 turn_index = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearTurnIndex() {
        
        turnIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AbilityMixinFireworksLauncher)
    }

    // @@protoc_insertion_point(class_scope:AbilityMixinFireworksLauncher)
    private static final emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher();
    }

    public static emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMixinFireworksLauncher>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMixinFireworksLauncher>() {
      @java.lang.Override
      public AbilityMixinFireworksLauncher parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityMixinFireworksLauncher> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMixinFireworksLauncher> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMixinFireworksLauncher_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMixinFireworksLauncher_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#AbilityMixinFireworksLauncher.proto\"\254\001" +
      "\n\035AbilityMixinFireworksLauncher\022\023\n\013invok" +
      "e_type\030\002 \001(\r\022\035\n\025start_count_down_time\030\003 " +
      "\001(\r\022\032\n\022fired_bullet_count\030\001 \001(\r\022\r\n\005phase" +
      "\030\006 \001(\r\022\030\n\020fireworks_config\030\004 \003(\r\022\022\n\nturn" +
      "_index\030\007 \001(\rB\036\n\034emu.grasscutter.net.oldp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityMixinFireworksLauncher_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMixinFireworksLauncher_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMixinFireworksLauncher_descriptor,
        new java.lang.String[] { "InvokeType", "StartCountDownTime", "FiredBulletCount", "Phase", "FireworksConfig", "TurnIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
