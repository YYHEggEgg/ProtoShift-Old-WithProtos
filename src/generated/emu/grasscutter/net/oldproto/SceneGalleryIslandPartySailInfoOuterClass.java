// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryIslandPartySailInfo.proto

package emu.grasscutter.net.oldproto;

public final class SceneGalleryIslandPartySailInfoOuterClass {
  private SceneGalleryIslandPartySailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryIslandPartySailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryIslandPartySailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 max_clean_progress = 14;</code>
     * @return The maxCleanProgress.
     */
    int getMaxCleanProgress();

    /**
     * <code>uint32 clean_progress = 10;</code>
     * @return The cleanProgress.
     */
    int getCleanProgress();

    /**
     * <code>.GalleryStartSource start_source = 1;</code>
     * @return The enum numeric value on the wire for startSource.
     */
    int getStartSourceValue();
    /**
     * <code>.GalleryStartSource start_source = 1;</code>
     * @return The startSource.
     */
    emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource();

    /**
     * <code>uint32 kill_progress = 11;</code>
     * @return The killProgress.
     */
    int getKillProgress();

    /**
     * <code>uint32 coin = 15;</code>
     * @return The coin.
     */
    int getCoin();

    /**
     * <code>.IslandPartySailStage stage = 12;</code>
     * @return The enum numeric value on the wire for stage.
     */
    int getStageValue();
    /**
     * <code>.IslandPartySailStage stage = 12;</code>
     * @return The stage.
     */
    emu.grasscutter.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage getStage();

    /**
     * <code>uint32 max_kill_progress = 8;</code>
     * @return The maxKillProgress.
     */
    int getMaxKillProgress();
  }
  /**
   * Protobuf type {@code SceneGalleryIslandPartySailInfo}
   */
  public static final class SceneGalleryIslandPartySailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryIslandPartySailInfo)
      SceneGalleryIslandPartySailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryIslandPartySailInfo.newBuilder() to construct.
    private SceneGalleryIslandPartySailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryIslandPartySailInfo() {
      startSource_ = 0;
      stage_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryIslandPartySailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.internal_static_SceneGalleryIslandPartySailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.internal_static_SceneGalleryIslandPartySailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo.class, emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo.Builder.class);
    }

    public static final int MAX_CLEAN_PROGRESS_FIELD_NUMBER = 14;
    private int maxCleanProgress_;
    /**
     * <code>uint32 max_clean_progress = 14;</code>
     * @return The maxCleanProgress.
     */
    @java.lang.Override
    public int getMaxCleanProgress() {
      return maxCleanProgress_;
    }

    public static final int CLEAN_PROGRESS_FIELD_NUMBER = 10;
    private int cleanProgress_;
    /**
     * <code>uint32 clean_progress = 10;</code>
     * @return The cleanProgress.
     */
    @java.lang.Override
    public int getCleanProgress() {
      return cleanProgress_;
    }

    public static final int START_SOURCE_FIELD_NUMBER = 1;
    private int startSource_;
    /**
     * <code>.GalleryStartSource start_source = 1;</code>
     * @return The enum numeric value on the wire for startSource.
     */
    @java.lang.Override public int getStartSourceValue() {
      return startSource_;
    }
    /**
     * <code>.GalleryStartSource start_source = 1;</code>
     * @return The startSource.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource result = emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.valueOf(startSource_);
      return result == null ? emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.UNRECOGNIZED : result;
    }

    public static final int KILL_PROGRESS_FIELD_NUMBER = 11;
    private int killProgress_;
    /**
     * <code>uint32 kill_progress = 11;</code>
     * @return The killProgress.
     */
    @java.lang.Override
    public int getKillProgress() {
      return killProgress_;
    }

    public static final int COIN_FIELD_NUMBER = 15;
    private int coin_;
    /**
     * <code>uint32 coin = 15;</code>
     * @return The coin.
     */
    @java.lang.Override
    public int getCoin() {
      return coin_;
    }

    public static final int STAGE_FIELD_NUMBER = 12;
    private int stage_;
    /**
     * <code>.IslandPartySailStage stage = 12;</code>
     * @return The enum numeric value on the wire for stage.
     */
    @java.lang.Override public int getStageValue() {
      return stage_;
    }
    /**
     * <code>.IslandPartySailStage stage = 12;</code>
     * @return The stage.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage getStage() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage result = emu.grasscutter.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage.valueOf(stage_);
      return result == null ? emu.grasscutter.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage.UNRECOGNIZED : result;
    }

    public static final int MAX_KILL_PROGRESS_FIELD_NUMBER = 8;
    private int maxKillProgress_;
    /**
     * <code>uint32 max_kill_progress = 8;</code>
     * @return The maxKillProgress.
     */
    @java.lang.Override
    public int getMaxKillProgress() {
      return maxKillProgress_;
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
      if (startSource_ != emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.GALLERY_START_SOURCE_BY_NONE.getNumber()) {
        output.writeEnum(1, startSource_);
      }
      if (maxKillProgress_ != 0) {
        output.writeUInt32(8, maxKillProgress_);
      }
      if (cleanProgress_ != 0) {
        output.writeUInt32(10, cleanProgress_);
      }
      if (killProgress_ != 0) {
        output.writeUInt32(11, killProgress_);
      }
      if (stage_ != emu.grasscutter.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage.ISLAND_PARTY_SAIL_STAGE_NONE.getNumber()) {
        output.writeEnum(12, stage_);
      }
      if (maxCleanProgress_ != 0) {
        output.writeUInt32(14, maxCleanProgress_);
      }
      if (coin_ != 0) {
        output.writeUInt32(15, coin_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (startSource_ != emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.GALLERY_START_SOURCE_BY_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, startSource_);
      }
      if (maxKillProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, maxKillProgress_);
      }
      if (cleanProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, cleanProgress_);
      }
      if (killProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, killProgress_);
      }
      if (stage_ != emu.grasscutter.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage.ISLAND_PARTY_SAIL_STAGE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, stage_);
      }
      if (maxCleanProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, maxCleanProgress_);
      }
      if (coin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, coin_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo other = (emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo) obj;

      if (getMaxCleanProgress()
          != other.getMaxCleanProgress()) return false;
      if (getCleanProgress()
          != other.getCleanProgress()) return false;
      if (startSource_ != other.startSource_) return false;
      if (getKillProgress()
          != other.getKillProgress()) return false;
      if (getCoin()
          != other.getCoin()) return false;
      if (stage_ != other.stage_) return false;
      if (getMaxKillProgress()
          != other.getMaxKillProgress()) return false;
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
      hash = (37 * hash) + MAX_CLEAN_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxCleanProgress();
      hash = (37 * hash) + CLEAN_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getCleanProgress();
      hash = (37 * hash) + START_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + startSource_;
      hash = (37 * hash) + KILL_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getKillProgress();
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin();
      hash = (37 * hash) + STAGE_FIELD_NUMBER;
      hash = (53 * hash) + stage_;
      hash = (37 * hash) + MAX_KILL_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxKillProgress();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo prototype) {
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
     * Protobuf type {@code SceneGalleryIslandPartySailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryIslandPartySailInfo)
        emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.internal_static_SceneGalleryIslandPartySailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.internal_static_SceneGalleryIslandPartySailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo.class, emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        maxCleanProgress_ = 0;

        cleanProgress_ = 0;

        startSource_ = 0;

        killProgress_ = 0;

        coin_ = 0;

        stage_ = 0;

        maxKillProgress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.internal_static_SceneGalleryIslandPartySailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo build() {
        emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo buildPartial() {
        emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo result = new emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo(this);
        result.maxCleanProgress_ = maxCleanProgress_;
        result.cleanProgress_ = cleanProgress_;
        result.startSource_ = startSource_;
        result.killProgress_ = killProgress_;
        result.coin_ = coin_;
        result.stage_ = stage_;
        result.maxKillProgress_ = maxKillProgress_;
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
        if (other instanceof emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo other) {
        if (other == emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo.getDefaultInstance()) return this;
        if (other.getMaxCleanProgress() != 0) {
          setMaxCleanProgress(other.getMaxCleanProgress());
        }
        if (other.getCleanProgress() != 0) {
          setCleanProgress(other.getCleanProgress());
        }
        if (other.startSource_ != 0) {
          setStartSourceValue(other.getStartSourceValue());
        }
        if (other.getKillProgress() != 0) {
          setKillProgress(other.getKillProgress());
        }
        if (other.getCoin() != 0) {
          setCoin(other.getCoin());
        }
        if (other.stage_ != 0) {
          setStageValue(other.getStageValue());
        }
        if (other.getMaxKillProgress() != 0) {
          setMaxKillProgress(other.getMaxKillProgress());
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
                startSource_ = input.readEnum();

                break;
              } // case 8
              case 64: {
                maxKillProgress_ = input.readUInt32();

                break;
              } // case 64
              case 80: {
                cleanProgress_ = input.readUInt32();

                break;
              } // case 80
              case 88: {
                killProgress_ = input.readUInt32();

                break;
              } // case 88
              case 96: {
                stage_ = input.readEnum();

                break;
              } // case 96
              case 112: {
                maxCleanProgress_ = input.readUInt32();

                break;
              } // case 112
              case 120: {
                coin_ = input.readUInt32();

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

      private int maxCleanProgress_ ;
      /**
       * <code>uint32 max_clean_progress = 14;</code>
       * @return The maxCleanProgress.
       */
      @java.lang.Override
      public int getMaxCleanProgress() {
        return maxCleanProgress_;
      }
      /**
       * <code>uint32 max_clean_progress = 14;</code>
       * @param value The maxCleanProgress to set.
       * @return This builder for chaining.
       */
      public Builder setMaxCleanProgress(int value) {
        
        maxCleanProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_clean_progress = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxCleanProgress() {
        
        maxCleanProgress_ = 0;
        onChanged();
        return this;
      }

      private int cleanProgress_ ;
      /**
       * <code>uint32 clean_progress = 10;</code>
       * @return The cleanProgress.
       */
      @java.lang.Override
      public int getCleanProgress() {
        return cleanProgress_;
      }
      /**
       * <code>uint32 clean_progress = 10;</code>
       * @param value The cleanProgress to set.
       * @return This builder for chaining.
       */
      public Builder setCleanProgress(int value) {
        
        cleanProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 clean_progress = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCleanProgress() {
        
        cleanProgress_ = 0;
        onChanged();
        return this;
      }

      private int startSource_ = 0;
      /**
       * <code>.GalleryStartSource start_source = 1;</code>
       * @return The enum numeric value on the wire for startSource.
       */
      @java.lang.Override public int getStartSourceValue() {
        return startSource_;
      }
      /**
       * <code>.GalleryStartSource start_source = 1;</code>
       * @param value The enum numeric value on the wire for startSource to set.
       * @return This builder for chaining.
       */
      public Builder setStartSourceValue(int value) {
        
        startSource_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStartSource start_source = 1;</code>
       * @return The startSource.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource result = emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.valueOf(startSource_);
        return result == null ? emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.UNRECOGNIZED : result;
      }
      /**
       * <code>.GalleryStartSource start_source = 1;</code>
       * @param value The startSource to set.
       * @return This builder for chaining.
       */
      public Builder setStartSource(emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        startSource_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStartSource start_source = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartSource() {
        
        startSource_ = 0;
        onChanged();
        return this;
      }

      private int killProgress_ ;
      /**
       * <code>uint32 kill_progress = 11;</code>
       * @return The killProgress.
       */
      @java.lang.Override
      public int getKillProgress() {
        return killProgress_;
      }
      /**
       * <code>uint32 kill_progress = 11;</code>
       * @param value The killProgress to set.
       * @return This builder for chaining.
       */
      public Builder setKillProgress(int value) {
        
        killProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_progress = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillProgress() {
        
        killProgress_ = 0;
        onChanged();
        return this;
      }

      private int coin_ ;
      /**
       * <code>uint32 coin = 15;</code>
       * @return The coin.
       */
      @java.lang.Override
      public int getCoin() {
        return coin_;
      }
      /**
       * <code>uint32 coin = 15;</code>
       * @param value The coin to set.
       * @return This builder for chaining.
       */
      public Builder setCoin(int value) {
        
        coin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoin() {
        
        coin_ = 0;
        onChanged();
        return this;
      }

      private int stage_ = 0;
      /**
       * <code>.IslandPartySailStage stage = 12;</code>
       * @return The enum numeric value on the wire for stage.
       */
      @java.lang.Override public int getStageValue() {
        return stage_;
      }
      /**
       * <code>.IslandPartySailStage stage = 12;</code>
       * @param value The enum numeric value on the wire for stage to set.
       * @return This builder for chaining.
       */
      public Builder setStageValue(int value) {
        
        stage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.IslandPartySailStage stage = 12;</code>
       * @return The stage.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage getStage() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage result = emu.grasscutter.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage.valueOf(stage_);
        return result == null ? emu.grasscutter.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage.UNRECOGNIZED : result;
      }
      /**
       * <code>.IslandPartySailStage stage = 12;</code>
       * @param value The stage to set.
       * @return This builder for chaining.
       */
      public Builder setStage(emu.grasscutter.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        stage_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.IslandPartySailStage stage = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearStage() {
        
        stage_ = 0;
        onChanged();
        return this;
      }

      private int maxKillProgress_ ;
      /**
       * <code>uint32 max_kill_progress = 8;</code>
       * @return The maxKillProgress.
       */
      @java.lang.Override
      public int getMaxKillProgress() {
        return maxKillProgress_;
      }
      /**
       * <code>uint32 max_kill_progress = 8;</code>
       * @param value The maxKillProgress to set.
       * @return This builder for chaining.
       */
      public Builder setMaxKillProgress(int value) {
        
        maxKillProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_kill_progress = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxKillProgress() {
        
        maxKillProgress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryIslandPartySailInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryIslandPartySailInfo)
    private static final emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo();
    }

    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryIslandPartySailInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryIslandPartySailInfo>() {
      @java.lang.Override
      public SceneGalleryIslandPartySailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGalleryIslandPartySailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryIslandPartySailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryIslandPartySailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryIslandPartySailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%SceneGalleryIslandPartySailInfo.proto\032" +
      "\030GalleryStartSource.proto\032\032IslandPartySa" +
      "ilStage.proto\"\346\001\n\037SceneGalleryIslandPart" +
      "ySailInfo\022\032\n\022max_clean_progress\030\016 \001(\r\022\026\n" +
      "\016clean_progress\030\n \001(\r\022)\n\014start_source\030\001 " +
      "\001(\0162\023.GalleryStartSource\022\025\n\rkill_progres" +
      "s\030\013 \001(\r\022\014\n\004coin\030\017 \001(\r\022$\n\005stage\030\014 \001(\0162\025.I" +
      "slandPartySailStage\022\031\n\021max_kill_progress" +
      "\030\010 \001(\rB\036\n\034emu.grasscutter.net.oldprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.getDescriptor(),
          emu.grasscutter.net.oldproto.IslandPartySailStageOuterClass.getDescriptor(),
        });
    internal_static_SceneGalleryIslandPartySailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryIslandPartySailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryIslandPartySailInfo_descriptor,
        new java.lang.String[] { "MaxCleanProgress", "CleanProgress", "StartSource", "KillProgress", "Coin", "Stage", "MaxKillProgress", });
    emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.getDescriptor();
    emu.grasscutter.net.oldproto.IslandPartySailStageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
