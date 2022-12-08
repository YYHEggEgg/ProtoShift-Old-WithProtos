// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneWeatherForecastRsp.proto

package emu.grasscutter.net.newproto;

public final class SceneWeatherForecastRspOuterClass {
  private SceneWeatherForecastRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneWeatherForecastRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneWeatherForecastRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 forecast_climate_list = 15;</code>
     * @return A list containing the forecastClimateList.
     */
    java.util.List<java.lang.Integer> getForecastClimateListList();
    /**
     * <code>repeated uint32 forecast_climate_list = 15;</code>
     * @return The count of forecastClimateList.
     */
    int getForecastClimateListCount();
    /**
     * <code>repeated uint32 forecast_climate_list = 15;</code>
     * @param index The index of the element to return.
     * @return The forecastClimateList at the given index.
     */
    int getForecastClimateList(int index);

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint64 next_climate_time = 4;</code>
     * @return The nextClimateTime.
     */
    long getNextClimateTime();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3064;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SceneWeatherForecastRsp}
   */
  public static final class SceneWeatherForecastRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneWeatherForecastRsp)
      SceneWeatherForecastRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneWeatherForecastRsp.newBuilder() to construct.
    private SceneWeatherForecastRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneWeatherForecastRsp() {
      forecastClimateList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneWeatherForecastRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.internal_static_SceneWeatherForecastRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.internal_static_SceneWeatherForecastRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp.class, emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp.Builder.class);
    }

    public static final int FORECAST_CLIMATE_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList forecastClimateList_;
    /**
     * <code>repeated uint32 forecast_climate_list = 15;</code>
     * @return A list containing the forecastClimateList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getForecastClimateListList() {
      return forecastClimateList_;
    }
    /**
     * <code>repeated uint32 forecast_climate_list = 15;</code>
     * @return The count of forecastClimateList.
     */
    public int getForecastClimateListCount() {
      return forecastClimateList_.size();
    }
    /**
     * <code>repeated uint32 forecast_climate_list = 15;</code>
     * @param index The index of the element to return.
     * @return The forecastClimateList at the given index.
     */
    public int getForecastClimateList(int index) {
      return forecastClimateList_.getInt(index);
    }
    private int forecastClimateListMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int NEXT_CLIMATE_TIME_FIELD_NUMBER = 4;
    private long nextClimateTime_;
    /**
     * <code>uint64 next_climate_time = 4;</code>
     * @return The nextClimateTime.
     */
    @java.lang.Override
    public long getNextClimateTime() {
      return nextClimateTime_;
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
      if (nextClimateTime_ != 0L) {
        output.writeUInt64(4, nextClimateTime_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      if (getForecastClimateListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(forecastClimateListMemoizedSerializedSize);
      }
      for (int i = 0; i < forecastClimateList_.size(); i++) {
        output.writeUInt32NoTag(forecastClimateList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nextClimateTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, nextClimateTime_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < forecastClimateList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(forecastClimateList_.getInt(i));
        }
        size += dataSize;
        if (!getForecastClimateListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        forecastClimateListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp other = (emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp) obj;

      if (!getForecastClimateListList()
          .equals(other.getForecastClimateListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getNextClimateTime()
          != other.getNextClimateTime()) return false;
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
      if (getForecastClimateListCount() > 0) {
        hash = (37 * hash) + FORECAST_CLIMATE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getForecastClimateListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + NEXT_CLIMATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getNextClimateTime());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp prototype) {
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
     *   CMD_ID = 3064;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SceneWeatherForecastRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneWeatherForecastRsp)
        emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.internal_static_SceneWeatherForecastRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.internal_static_SceneWeatherForecastRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp.class, emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        forecastClimateList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        nextClimateTime_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.internal_static_SceneWeatherForecastRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp build() {
        emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp buildPartial() {
        emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp result = new emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          forecastClimateList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.forecastClimateList_ = forecastClimateList_;
        result.retcode_ = retcode_;
        result.nextClimateTime_ = nextClimateTime_;
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
        if (other instanceof emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp other) {
        if (other == emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp.getDefaultInstance()) return this;
        if (!other.forecastClimateList_.isEmpty()) {
          if (forecastClimateList_.isEmpty()) {
            forecastClimateList_ = other.forecastClimateList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureForecastClimateListIsMutable();
            forecastClimateList_.addAll(other.forecastClimateList_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getNextClimateTime() != 0L) {
          setNextClimateTime(other.getNextClimateTime());
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
                nextClimateTime_ = input.readUInt64();

                break;
              } // case 32
              case 96: {
                retcode_ = input.readInt32();

                break;
              } // case 96
              case 120: {
                int v = input.readUInt32();
                ensureForecastClimateListIsMutable();
                forecastClimateList_.addInt(v);
                break;
              } // case 120
              case 122: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureForecastClimateListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  forecastClimateList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 122
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

      private com.google.protobuf.Internal.IntList forecastClimateList_ = emptyIntList();
      private void ensureForecastClimateListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          forecastClimateList_ = mutableCopy(forecastClimateList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 forecast_climate_list = 15;</code>
       * @return A list containing the forecastClimateList.
       */
      public java.util.List<java.lang.Integer>
          getForecastClimateListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(forecastClimateList_) : forecastClimateList_;
      }
      /**
       * <code>repeated uint32 forecast_climate_list = 15;</code>
       * @return The count of forecastClimateList.
       */
      public int getForecastClimateListCount() {
        return forecastClimateList_.size();
      }
      /**
       * <code>repeated uint32 forecast_climate_list = 15;</code>
       * @param index The index of the element to return.
       * @return The forecastClimateList at the given index.
       */
      public int getForecastClimateList(int index) {
        return forecastClimateList_.getInt(index);
      }
      /**
       * <code>repeated uint32 forecast_climate_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The forecastClimateList to set.
       * @return This builder for chaining.
       */
      public Builder setForecastClimateList(
          int index, int value) {
        ensureForecastClimateListIsMutable();
        forecastClimateList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 forecast_climate_list = 15;</code>
       * @param value The forecastClimateList to add.
       * @return This builder for chaining.
       */
      public Builder addForecastClimateList(int value) {
        ensureForecastClimateListIsMutable();
        forecastClimateList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 forecast_climate_list = 15;</code>
       * @param values The forecastClimateList to add.
       * @return This builder for chaining.
       */
      public Builder addAllForecastClimateList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureForecastClimateListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, forecastClimateList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 forecast_climate_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearForecastClimateList() {
        forecastClimateList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private long nextClimateTime_ ;
      /**
       * <code>uint64 next_climate_time = 4;</code>
       * @return The nextClimateTime.
       */
      @java.lang.Override
      public long getNextClimateTime() {
        return nextClimateTime_;
      }
      /**
       * <code>uint64 next_climate_time = 4;</code>
       * @param value The nextClimateTime to set.
       * @return This builder for chaining.
       */
      public Builder setNextClimateTime(long value) {
        
        nextClimateTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 next_climate_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearNextClimateTime() {
        
        nextClimateTime_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:SceneWeatherForecastRsp)
    }

    // @@protoc_insertion_point(class_scope:SceneWeatherForecastRsp)
    private static final emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp();
    }

    public static emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneWeatherForecastRsp>
        PARSER = new com.google.protobuf.AbstractParser<SceneWeatherForecastRsp>() {
      @java.lang.Override
      public SceneWeatherForecastRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneWeatherForecastRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneWeatherForecastRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SceneWeatherForecastRspOuterClass.SceneWeatherForecastRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneWeatherForecastRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneWeatherForecastRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035SceneWeatherForecastRsp.proto\"d\n\027Scene" +
      "WeatherForecastRsp\022\035\n\025forecast_climate_l" +
      "ist\030\017 \003(\r\022\017\n\007retcode\030\014 \001(\005\022\031\n\021next_clima" +
      "te_time\030\004 \001(\004B\036\n\034emu.grasscutter.net.new" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneWeatherForecastRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneWeatherForecastRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneWeatherForecastRsp_descriptor,
        new java.lang.String[] { "ForecastClimateList", "Retcode", "NextClimateTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
