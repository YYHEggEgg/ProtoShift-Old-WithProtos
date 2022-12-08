// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryWillStartCountdownNotify.proto

package emu.grasscutter.net.newproto;

public final class GalleryWillStartCountdownNotifyOuterClass {
  private GalleryWillStartCountdownNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GalleryWillStartCountdownNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GalleryWillStartCountdownNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 13;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>.GalleryStartSource start_source = 14;</code>
     * @return The enum numeric value on the wire for startSource.
     */
    int getStartSourceValue();
    /**
     * <code>.GalleryStartSource start_source = 14;</code>
     * @return The startSource.
     */
    emu.grasscutter.net.newproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource();

    /**
     * <code>uint32 end_time = 15;</code>
     * @return The endTime.
     */
    int getEndTime();

    /**
     * <code>bool is_end = 6;</code>
     * @return The isEnd.
     */
    boolean getIsEnd();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5505;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GalleryWillStartCountdownNotify}
   */
  public static final class GalleryWillStartCountdownNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GalleryWillStartCountdownNotify)
      GalleryWillStartCountdownNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GalleryWillStartCountdownNotify.newBuilder() to construct.
    private GalleryWillStartCountdownNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GalleryWillStartCountdownNotify() {
      startSource_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GalleryWillStartCountdownNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.class, emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 13;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 13;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int START_SOURCE_FIELD_NUMBER = 14;
    private int startSource_;
    /**
     * <code>.GalleryStartSource start_source = 14;</code>
     * @return The enum numeric value on the wire for startSource.
     */
    @java.lang.Override public int getStartSourceValue() {
      return startSource_;
    }
    /**
     * <code>.GalleryStartSource start_source = 14;</code>
     * @return The startSource.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.GalleryStartSourceOuterClass.GalleryStartSource result = emu.grasscutter.net.newproto.GalleryStartSourceOuterClass.GalleryStartSource.valueOf(startSource_);
      return result == null ? emu.grasscutter.net.newproto.GalleryStartSourceOuterClass.GalleryStartSource.UNRECOGNIZED : result;
    }

    public static final int END_TIME_FIELD_NUMBER = 15;
    private int endTime_;
    /**
     * <code>uint32 end_time = 15;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }

    public static final int IS_END_FIELD_NUMBER = 6;
    private boolean isEnd_;
    /**
     * <code>bool is_end = 6;</code>
     * @return The isEnd.
     */
    @java.lang.Override
    public boolean getIsEnd() {
      return isEnd_;
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
      if (isEnd_ != false) {
        output.writeBool(6, isEnd_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(13, galleryId_);
      }
      if (startSource_ != emu.grasscutter.net.newproto.GalleryStartSourceOuterClass.GalleryStartSource.GALLERY_START_SOURCE_BY_NONE.getNumber()) {
        output.writeEnum(14, startSource_);
      }
      if (endTime_ != 0) {
        output.writeUInt32(15, endTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isEnd_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isEnd_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, galleryId_);
      }
      if (startSource_ != emu.grasscutter.net.newproto.GalleryStartSourceOuterClass.GalleryStartSource.GALLERY_START_SOURCE_BY_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(14, startSource_);
      }
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, endTime_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify other = (emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (startSource_ != other.startSource_) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
      if (getIsEnd()
          != other.getIsEnd()) return false;
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
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + START_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + startSource_;
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (37 * hash) + IS_END_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsEnd());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify prototype) {
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
     *   CMD_ID = 5505;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GalleryWillStartCountdownNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GalleryWillStartCountdownNotify)
        emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.class, emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        galleryId_ = 0;

        startSource_ = 0;

        endTime_ = 0;

        isEnd_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify build() {
        emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify buildPartial() {
        emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify result = new emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify(this);
        result.galleryId_ = galleryId_;
        result.startSource_ = startSource_;
        result.endTime_ = endTime_;
        result.isEnd_ = isEnd_;
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
        if (other instanceof emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify other) {
        if (other == emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.startSource_ != 0) {
          setStartSourceValue(other.getStartSourceValue());
        }
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
        }
        if (other.getIsEnd() != false) {
          setIsEnd(other.getIsEnd());
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
              case 48: {
                isEnd_ = input.readBool();

                break;
              } // case 48
              case 104: {
                galleryId_ = input.readUInt32();

                break;
              } // case 104
              case 112: {
                startSource_ = input.readEnum();

                break;
              } // case 112
              case 120: {
                endTime_ = input.readUInt32();

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

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 13;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 13;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int startSource_ = 0;
      /**
       * <code>.GalleryStartSource start_source = 14;</code>
       * @return The enum numeric value on the wire for startSource.
       */
      @java.lang.Override public int getStartSourceValue() {
        return startSource_;
      }
      /**
       * <code>.GalleryStartSource start_source = 14;</code>
       * @param value The enum numeric value on the wire for startSource to set.
       * @return This builder for chaining.
       */
      public Builder setStartSourceValue(int value) {
        
        startSource_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStartSource start_source = 14;</code>
       * @return The startSource.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.GalleryStartSourceOuterClass.GalleryStartSource result = emu.grasscutter.net.newproto.GalleryStartSourceOuterClass.GalleryStartSource.valueOf(startSource_);
        return result == null ? emu.grasscutter.net.newproto.GalleryStartSourceOuterClass.GalleryStartSource.UNRECOGNIZED : result;
      }
      /**
       * <code>.GalleryStartSource start_source = 14;</code>
       * @param value The startSource to set.
       * @return This builder for chaining.
       */
      public Builder setStartSource(emu.grasscutter.net.newproto.GalleryStartSourceOuterClass.GalleryStartSource value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        startSource_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStartSource start_source = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartSource() {
        
        startSource_ = 0;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 15;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 15;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isEnd_ ;
      /**
       * <code>bool is_end = 6;</code>
       * @return The isEnd.
       */
      @java.lang.Override
      public boolean getIsEnd() {
        return isEnd_;
      }
      /**
       * <code>bool is_end = 6;</code>
       * @param value The isEnd to set.
       * @return This builder for chaining.
       */
      public Builder setIsEnd(boolean value) {
        
        isEnd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_end = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsEnd() {
        
        isEnd_ = false;
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


      // @@protoc_insertion_point(builder_scope:GalleryWillStartCountdownNotify)
    }

    // @@protoc_insertion_point(class_scope:GalleryWillStartCountdownNotify)
    private static final emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify();
    }

    public static emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GalleryWillStartCountdownNotify>
        PARSER = new com.google.protobuf.AbstractParser<GalleryWillStartCountdownNotify>() {
      @java.lang.Override
      public GalleryWillStartCountdownNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GalleryWillStartCountdownNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GalleryWillStartCountdownNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GalleryWillStartCountdownNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GalleryWillStartCountdownNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%GalleryWillStartCountdownNotify.proto\032" +
      "\030GalleryStartSource.proto\"\202\001\n\037GalleryWil" +
      "lStartCountdownNotify\022\022\n\ngallery_id\030\r \001(" +
      "\r\022)\n\014start_source\030\016 \001(\0162\023.GalleryStartSo" +
      "urce\022\020\n\010end_time\030\017 \001(\r\022\016\n\006is_end\030\006 \001(\010B\036" +
      "\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.GalleryStartSourceOuterClass.getDescriptor(),
        });
    internal_static_GalleryWillStartCountdownNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GalleryWillStartCountdownNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GalleryWillStartCountdownNotify_descriptor,
        new java.lang.String[] { "GalleryId", "StartSource", "EndTime", "IsEnd", });
    emu.grasscutter.net.newproto.GalleryStartSourceOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
