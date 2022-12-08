// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryBrokenFloorInfo.proto

package emu.grasscutter.net.oldproto;

public final class SceneGalleryBrokenFloorInfoOuterClass {
  private SceneGalleryBrokenFloorInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryBrokenFloorInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryBrokenFloorInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
     */
    int getFallCountMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
     */
    boolean containsFallCountMap(
        int key);
    /**
     * Use {@link #getFallCountMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getFallCountMap();
    /**
     * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getFallCountMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
     */

    int getFallCountMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
     */

    int getFallCountMapOrThrow(
        int key);

    /**
     * <code>uint32 end_time = 9;</code>
     * @return The endTime.
     */
    int getEndTime();
  }
  /**
   * Protobuf type {@code SceneGalleryBrokenFloorInfo}
   */
  public static final class SceneGalleryBrokenFloorInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryBrokenFloorInfo)
      SceneGalleryBrokenFloorInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryBrokenFloorInfo.newBuilder() to construct.
    private SceneGalleryBrokenFloorInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryBrokenFloorInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryBrokenFloorInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.internal_static_SceneGalleryBrokenFloorInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetFallCountMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.internal_static_SceneGalleryBrokenFloorInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo.class, emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo.Builder.class);
    }

    public static final int FALL_COUNT_MAP_FIELD_NUMBER = 3;
    private static final class FallCountMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.internal_static_SceneGalleryBrokenFloorInfo_FallCountMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> fallCountMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetFallCountMap() {
      if (fallCountMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FallCountMapDefaultEntryHolder.defaultEntry);
      }
      return fallCountMap_;
    }

    public int getFallCountMapCount() {
      return internalGetFallCountMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
     */

    @java.lang.Override
    public boolean containsFallCountMap(
        int key) {
      
      return internalGetFallCountMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getFallCountMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getFallCountMap() {
      return getFallCountMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getFallCountMapMap() {
      return internalGetFallCountMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
     */
    @java.lang.Override

    public int getFallCountMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetFallCountMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
     */
    @java.lang.Override

    public int getFallCountMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetFallCountMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int END_TIME_FIELD_NUMBER = 9;
    private int endTime_;
    /**
     * <code>uint32 end_time = 9;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetFallCountMap(),
          FallCountMapDefaultEntryHolder.defaultEntry,
          3);
      if (endTime_ != 0) {
        output.writeUInt32(9, endTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetFallCountMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        fallCountMap__ = FallCountMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(3, fallCountMap__);
      }
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, endTime_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo other = (emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo) obj;

      if (!internalGetFallCountMap().equals(
          other.internalGetFallCountMap())) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
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
      if (!internalGetFallCountMap().getMap().isEmpty()) {
        hash = (37 * hash) + FALL_COUNT_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetFallCountMap().hashCode();
      }
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo prototype) {
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
     * Protobuf type {@code SceneGalleryBrokenFloorInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryBrokenFloorInfo)
        emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.internal_static_SceneGalleryBrokenFloorInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 3:
            return internalGetFallCountMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 3:
            return internalGetMutableFallCountMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.internal_static_SceneGalleryBrokenFloorInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo.class, emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        internalGetMutableFallCountMap().clear();
        endTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.internal_static_SceneGalleryBrokenFloorInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo build() {
        emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo buildPartial() {
        emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo result = new emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo(this);
        int from_bitField0_ = bitField0_;
        result.fallCountMap_ = internalGetFallCountMap();
        result.fallCountMap_.makeImmutable();
        result.endTime_ = endTime_;
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
        if (other instanceof emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo other) {
        if (other == emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo.getDefaultInstance()) return this;
        internalGetMutableFallCountMap().mergeFrom(
            other.internalGetFallCountMap());
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
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
              case 26: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                fallCountMap__ = input.readMessage(
                    FallCountMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableFallCountMap().getMutableMap().put(
                    fallCountMap__.getKey(), fallCountMap__.getValue());
                break;
              } // case 26
              case 72: {
                endTime_ = input.readUInt32();

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
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> fallCountMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetFallCountMap() {
        if (fallCountMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              FallCountMapDefaultEntryHolder.defaultEntry);
        }
        return fallCountMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableFallCountMap() {
        onChanged();;
        if (fallCountMap_ == null) {
          fallCountMap_ = com.google.protobuf.MapField.newMapField(
              FallCountMapDefaultEntryHolder.defaultEntry);
        }
        if (!fallCountMap_.isMutable()) {
          fallCountMap_ = fallCountMap_.copy();
        }
        return fallCountMap_;
      }

      public int getFallCountMapCount() {
        return internalGetFallCountMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
       */

      @java.lang.Override
      public boolean containsFallCountMap(
          int key) {
        
        return internalGetFallCountMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getFallCountMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getFallCountMap() {
        return getFallCountMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getFallCountMapMap() {
        return internalGetFallCountMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
       */
      @java.lang.Override

      public int getFallCountMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetFallCountMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
       */
      @java.lang.Override

      public int getFallCountMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetFallCountMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearFallCountMap() {
        internalGetMutableFallCountMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
       */

      public Builder removeFallCountMap(
          int key) {
        
        internalGetMutableFallCountMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableFallCountMap() {
        return internalGetMutableFallCountMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
       */
      public Builder putFallCountMap(
          int key,
          int value) {
        
        
        internalGetMutableFallCountMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; fall_count_map = 3;</code>
       */

      public Builder putAllFallCountMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableFallCountMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 9;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 9;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryBrokenFloorInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryBrokenFloorInfo)
    private static final emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo();
    }

    public static emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryBrokenFloorInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryBrokenFloorInfo>() {
      @java.lang.Override
      public SceneGalleryBrokenFloorInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGalleryBrokenFloorInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryBrokenFloorInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SceneGalleryBrokenFloorInfoOuterClass.SceneGalleryBrokenFloorInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryBrokenFloorInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryBrokenFloorInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryBrokenFloorInfo_FallCountMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryBrokenFloorInfo_FallCountMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!SceneGalleryBrokenFloorInfo.proto\"\254\001\n\033" +
      "SceneGalleryBrokenFloorInfo\022F\n\016fall_coun" +
      "t_map\030\003 \003(\0132..SceneGalleryBrokenFloorInf" +
      "o.FallCountMapEntry\022\020\n\010end_time\030\t \001(\r\0323\n" +
      "\021FallCountMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value" +
      "\030\002 \001(\r:\0028\001B\036\n\034emu.grasscutter.net.oldpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryBrokenFloorInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryBrokenFloorInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryBrokenFloorInfo_descriptor,
        new java.lang.String[] { "FallCountMap", "EndTime", });
    internal_static_SceneGalleryBrokenFloorInfo_FallCountMapEntry_descriptor =
      internal_static_SceneGalleryBrokenFloorInfo_descriptor.getNestedTypes().get(0);
    internal_static_SceneGalleryBrokenFloorInfo_FallCountMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryBrokenFloorInfo_FallCountMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
