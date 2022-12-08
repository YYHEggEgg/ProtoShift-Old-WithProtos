// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryBalloonShootNotify.proto

package emu.grasscutter.net.newproto;

public final class GalleryBalloonShootNotifyOuterClass {
  private GalleryBalloonShootNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GalleryBalloonShootNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GalleryBalloonShootNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 trigger_entity_id = 3;</code>
     * @return The triggerEntityId.
     */
    int getTriggerEntityId();

    /**
     * <code>uint32 combo = 15;</code>
     * @return The combo.
     */
    int getCombo();

    /**
     * <code>uint64 combo_disable_time = 9;</code>
     * @return The comboDisableTime.
     */
    long getComboDisableTime();

    /**
     * <code>uint32 cur_score = 1;</code>
     * @return The curScore.
     */
    int getCurScore();

    /**
     * <code>int32 add_score = 2;</code>
     * @return The addScore.
     */
    int getAddScore();

    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5530;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GalleryBalloonShootNotify}
   */
  public static final class GalleryBalloonShootNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GalleryBalloonShootNotify)
      GalleryBalloonShootNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GalleryBalloonShootNotify.newBuilder() to construct.
    private GalleryBalloonShootNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GalleryBalloonShootNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GalleryBalloonShootNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.internal_static_GalleryBalloonShootNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.internal_static_GalleryBalloonShootNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify.class, emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify.Builder.class);
    }

    public static final int TRIGGER_ENTITY_ID_FIELD_NUMBER = 3;
    private int triggerEntityId_;
    /**
     * <code>uint32 trigger_entity_id = 3;</code>
     * @return The triggerEntityId.
     */
    @java.lang.Override
    public int getTriggerEntityId() {
      return triggerEntityId_;
    }

    public static final int COMBO_FIELD_NUMBER = 15;
    private int combo_;
    /**
     * <code>uint32 combo = 15;</code>
     * @return The combo.
     */
    @java.lang.Override
    public int getCombo() {
      return combo_;
    }

    public static final int COMBO_DISABLE_TIME_FIELD_NUMBER = 9;
    private long comboDisableTime_;
    /**
     * <code>uint64 combo_disable_time = 9;</code>
     * @return The comboDisableTime.
     */
    @java.lang.Override
    public long getComboDisableTime() {
      return comboDisableTime_;
    }

    public static final int CUR_SCORE_FIELD_NUMBER = 1;
    private int curScore_;
    /**
     * <code>uint32 cur_score = 1;</code>
     * @return The curScore.
     */
    @java.lang.Override
    public int getCurScore() {
      return curScore_;
    }

    public static final int ADD_SCORE_FIELD_NUMBER = 2;
    private int addScore_;
    /**
     * <code>int32 add_score = 2;</code>
     * @return The addScore.
     */
    @java.lang.Override
    public int getAddScore() {
      return addScore_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 11;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
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
      if (curScore_ != 0) {
        output.writeUInt32(1, curScore_);
      }
      if (addScore_ != 0) {
        output.writeInt32(2, addScore_);
      }
      if (triggerEntityId_ != 0) {
        output.writeUInt32(3, triggerEntityId_);
      }
      if (comboDisableTime_ != 0L) {
        output.writeUInt64(9, comboDisableTime_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(11, galleryId_);
      }
      if (combo_ != 0) {
        output.writeUInt32(15, combo_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, curScore_);
      }
      if (addScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, addScore_);
      }
      if (triggerEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, triggerEntityId_);
      }
      if (comboDisableTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, comboDisableTime_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, galleryId_);
      }
      if (combo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, combo_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify other = (emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify) obj;

      if (getTriggerEntityId()
          != other.getTriggerEntityId()) return false;
      if (getCombo()
          != other.getCombo()) return false;
      if (getComboDisableTime()
          != other.getComboDisableTime()) return false;
      if (getCurScore()
          != other.getCurScore()) return false;
      if (getAddScore()
          != other.getAddScore()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
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
      hash = (37 * hash) + TRIGGER_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTriggerEntityId();
      hash = (37 * hash) + COMBO_FIELD_NUMBER;
      hash = (53 * hash) + getCombo();
      hash = (37 * hash) + COMBO_DISABLE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getComboDisableTime());
      hash = (37 * hash) + CUR_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getCurScore();
      hash = (37 * hash) + ADD_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getAddScore();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify prototype) {
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
     *   CMD_ID = 5530;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GalleryBalloonShootNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GalleryBalloonShootNotify)
        emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.internal_static_GalleryBalloonShootNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.internal_static_GalleryBalloonShootNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify.class, emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        triggerEntityId_ = 0;

        combo_ = 0;

        comboDisableTime_ = 0L;

        curScore_ = 0;

        addScore_ = 0;

        galleryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.internal_static_GalleryBalloonShootNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify build() {
        emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify buildPartial() {
        emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify result = new emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify(this);
        result.triggerEntityId_ = triggerEntityId_;
        result.combo_ = combo_;
        result.comboDisableTime_ = comboDisableTime_;
        result.curScore_ = curScore_;
        result.addScore_ = addScore_;
        result.galleryId_ = galleryId_;
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
        if (other instanceof emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify other) {
        if (other == emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify.getDefaultInstance()) return this;
        if (other.getTriggerEntityId() != 0) {
          setTriggerEntityId(other.getTriggerEntityId());
        }
        if (other.getCombo() != 0) {
          setCombo(other.getCombo());
        }
        if (other.getComboDisableTime() != 0L) {
          setComboDisableTime(other.getComboDisableTime());
        }
        if (other.getCurScore() != 0) {
          setCurScore(other.getCurScore());
        }
        if (other.getAddScore() != 0) {
          setAddScore(other.getAddScore());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
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
                curScore_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                addScore_ = input.readInt32();

                break;
              } // case 16
              case 24: {
                triggerEntityId_ = input.readUInt32();

                break;
              } // case 24
              case 72: {
                comboDisableTime_ = input.readUInt64();

                break;
              } // case 72
              case 88: {
                galleryId_ = input.readUInt32();

                break;
              } // case 88
              case 120: {
                combo_ = input.readUInt32();

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

      private int triggerEntityId_ ;
      /**
       * <code>uint32 trigger_entity_id = 3;</code>
       * @return The triggerEntityId.
       */
      @java.lang.Override
      public int getTriggerEntityId() {
        return triggerEntityId_;
      }
      /**
       * <code>uint32 trigger_entity_id = 3;</code>
       * @param value The triggerEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTriggerEntityId(int value) {
        
        triggerEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trigger_entity_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTriggerEntityId() {
        
        triggerEntityId_ = 0;
        onChanged();
        return this;
      }

      private int combo_ ;
      /**
       * <code>uint32 combo = 15;</code>
       * @return The combo.
       */
      @java.lang.Override
      public int getCombo() {
        return combo_;
      }
      /**
       * <code>uint32 combo = 15;</code>
       * @param value The combo to set.
       * @return This builder for chaining.
       */
      public Builder setCombo(int value) {
        
        combo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 combo = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCombo() {
        
        combo_ = 0;
        onChanged();
        return this;
      }

      private long comboDisableTime_ ;
      /**
       * <code>uint64 combo_disable_time = 9;</code>
       * @return The comboDisableTime.
       */
      @java.lang.Override
      public long getComboDisableTime() {
        return comboDisableTime_;
      }
      /**
       * <code>uint64 combo_disable_time = 9;</code>
       * @param value The comboDisableTime to set.
       * @return This builder for chaining.
       */
      public Builder setComboDisableTime(long value) {
        
        comboDisableTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 combo_disable_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearComboDisableTime() {
        
        comboDisableTime_ = 0L;
        onChanged();
        return this;
      }

      private int curScore_ ;
      /**
       * <code>uint32 cur_score = 1;</code>
       * @return The curScore.
       */
      @java.lang.Override
      public int getCurScore() {
        return curScore_;
      }
      /**
       * <code>uint32 cur_score = 1;</code>
       * @param value The curScore to set.
       * @return This builder for chaining.
       */
      public Builder setCurScore(int value) {
        
        curScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_score = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurScore() {
        
        curScore_ = 0;
        onChanged();
        return this;
      }

      private int addScore_ ;
      /**
       * <code>int32 add_score = 2;</code>
       * @return The addScore.
       */
      @java.lang.Override
      public int getAddScore() {
        return addScore_;
      }
      /**
       * <code>int32 add_score = 2;</code>
       * @param value The addScore to set.
       * @return This builder for chaining.
       */
      public Builder setAddScore(int value) {
        
        addScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 add_score = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddScore() {
        
        addScore_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GalleryBalloonShootNotify)
    }

    // @@protoc_insertion_point(class_scope:GalleryBalloonShootNotify)
    private static final emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify();
    }

    public static emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GalleryBalloonShootNotify>
        PARSER = new com.google.protobuf.AbstractParser<GalleryBalloonShootNotify>() {
      @java.lang.Override
      public GalleryBalloonShootNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GalleryBalloonShootNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GalleryBalloonShootNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GalleryBalloonShootNotifyOuterClass.GalleryBalloonShootNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GalleryBalloonShootNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GalleryBalloonShootNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037GalleryBalloonShootNotify.proto\"\233\001\n\031Ga" +
      "lleryBalloonShootNotify\022\031\n\021trigger_entit" +
      "y_id\030\003 \001(\r\022\r\n\005combo\030\017 \001(\r\022\032\n\022combo_disab" +
      "le_time\030\t \001(\004\022\021\n\tcur_score\030\001 \001(\r\022\021\n\tadd_" +
      "score\030\002 \001(\005\022\022\n\ngallery_id\030\013 \001(\rB\036\n\034emu.g" +
      "rasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GalleryBalloonShootNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GalleryBalloonShootNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GalleryBalloonShootNotify_descriptor,
        new java.lang.String[] { "TriggerEntityId", "Combo", "ComboDisableTime", "CurScore", "AddScore", "GalleryId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
