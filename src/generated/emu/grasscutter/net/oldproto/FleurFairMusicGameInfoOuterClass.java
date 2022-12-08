// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairMusicGameInfo.proto

package emu.grasscutter.net.oldproto;

public final class FleurFairMusicGameInfoOuterClass {
  private FleurFairMusicGameInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairMusicGameInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairMusicGameInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
     */
    int getMusicRecordMapCount();
    /**
     * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
     */
    boolean containsMusicRecordMap(
        int key);
    /**
     * Use {@link #getMusicRecordMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord>
    getMusicRecordMap();
    /**
     * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord>
    getMusicRecordMapMap();
    /**
     * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
     */

    /* nullable */
emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord getMusicRecordMapOrDefault(
        int key,
        /* nullable */
emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord defaultValue);
    /**
     * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
     */

    emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord getMusicRecordMapOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code FleurFairMusicGameInfo}
   */
  public static final class FleurFairMusicGameInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FleurFairMusicGameInfo)
      FleurFairMusicGameInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairMusicGameInfo.newBuilder() to construct.
    private FleurFairMusicGameInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FleurFairMusicGameInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairMusicGameInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.internal_static_FleurFairMusicGameInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 10:
          return internalGetMusicRecordMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.internal_static_FleurFairMusicGameInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo.class, emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo.Builder.class);
    }

    public static final int MUSIC_RECORD_MAP_FIELD_NUMBER = 10;
    private static final class MusicRecordMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord>newDefaultInstance(
                  emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.internal_static_FleurFairMusicGameInfo_MusicRecordMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord> musicRecordMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord>
    internalGetMusicRecordMap() {
      if (musicRecordMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MusicRecordMapDefaultEntryHolder.defaultEntry);
      }
      return musicRecordMap_;
    }

    public int getMusicRecordMapCount() {
      return internalGetMusicRecordMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
     */

    @java.lang.Override
    public boolean containsMusicRecordMap(
        int key) {
      
      return internalGetMusicRecordMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMusicRecordMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord> getMusicRecordMap() {
      return getMusicRecordMapMap();
    }
    /**
     * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord> getMusicRecordMapMap() {
      return internalGetMusicRecordMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord getMusicRecordMapOrDefault(
        int key,
        emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord> map =
          internalGetMusicRecordMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord getMusicRecordMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord> map =
          internalGetMusicRecordMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
          internalGetMusicRecordMap(),
          MusicRecordMapDefaultEntryHolder.defaultEntry,
          10);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord> entry
           : internalGetMusicRecordMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord>
        musicRecordMap__ = MusicRecordMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(10, musicRecordMap__);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo other = (emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo) obj;

      if (!internalGetMusicRecordMap().equals(
          other.internalGetMusicRecordMap())) return false;
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
      if (!internalGetMusicRecordMap().getMap().isEmpty()) {
        hash = (37 * hash) + MUSIC_RECORD_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetMusicRecordMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo prototype) {
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
     * Protobuf type {@code FleurFairMusicGameInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FleurFairMusicGameInfo)
        emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.internal_static_FleurFairMusicGameInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 10:
            return internalGetMusicRecordMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 10:
            return internalGetMutableMusicRecordMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.internal_static_FleurFairMusicGameInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo.class, emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        internalGetMutableMusicRecordMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.internal_static_FleurFairMusicGameInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo build() {
        emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo buildPartial() {
        emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo result = new emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo(this);
        int from_bitField0_ = bitField0_;
        result.musicRecordMap_ = internalGetMusicRecordMap();
        result.musicRecordMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo other) {
        if (other == emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo.getDefaultInstance()) return this;
        internalGetMutableMusicRecordMap().mergeFrom(
            other.internalGetMusicRecordMap());
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
              case 82: {
                com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord>
                musicRecordMap__ = input.readMessage(
                    MusicRecordMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableMusicRecordMap().getMutableMap().put(
                    musicRecordMap__.getKey(), musicRecordMap__.getValue());
                break;
              } // case 82
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
          java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord> musicRecordMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord>
      internalGetMusicRecordMap() {
        if (musicRecordMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              MusicRecordMapDefaultEntryHolder.defaultEntry);
        }
        return musicRecordMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord>
      internalGetMutableMusicRecordMap() {
        onChanged();;
        if (musicRecordMap_ == null) {
          musicRecordMap_ = com.google.protobuf.MapField.newMapField(
              MusicRecordMapDefaultEntryHolder.defaultEntry);
        }
        if (!musicRecordMap_.isMutable()) {
          musicRecordMap_ = musicRecordMap_.copy();
        }
        return musicRecordMap_;
      }

      public int getMusicRecordMapCount() {
        return internalGetMusicRecordMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
       */

      @java.lang.Override
      public boolean containsMusicRecordMap(
          int key) {
        
        return internalGetMusicRecordMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getMusicRecordMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord> getMusicRecordMap() {
        return getMusicRecordMapMap();
      }
      /**
       * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord> getMusicRecordMapMap() {
        return internalGetMusicRecordMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord getMusicRecordMapOrDefault(
          int key,
          emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord> map =
            internalGetMusicRecordMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord getMusicRecordMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord> map =
            internalGetMusicRecordMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearMusicRecordMap() {
        internalGetMutableMusicRecordMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
       */

      public Builder removeMusicRecordMap(
          int key) {
        
        internalGetMutableMusicRecordMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord>
      getMutableMusicRecordMap() {
        return internalGetMutableMusicRecordMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
       */
      public Builder putMusicRecordMap(
          int key,
          emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord value) {
        
        if (value == null) {
  throw new NullPointerException("map value");
}

        internalGetMutableMusicRecordMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .FleurFairMusicRecord&gt; music_record_map = 10;</code>
       */

      public Builder putAllMusicRecordMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord> values) {
        internalGetMutableMusicRecordMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:FleurFairMusicGameInfo)
    }

    // @@protoc_insertion_point(class_scope:FleurFairMusicGameInfo)
    private static final emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo();
    }

    public static emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FleurFairMusicGameInfo>
        PARSER = new com.google.protobuf.AbstractParser<FleurFairMusicGameInfo>() {
      @java.lang.Override
      public FleurFairMusicGameInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<FleurFairMusicGameInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairMusicGameInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.FleurFairMusicGameInfoOuterClass.FleurFairMusicGameInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairMusicGameInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairMusicGameInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairMusicGameInfo_MusicRecordMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairMusicGameInfo_MusicRecordMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034FleurFairMusicGameInfo.proto\032\032FleurFai" +
      "rMusicRecord.proto\"\255\001\n\026FleurFairMusicGam" +
      "eInfo\022E\n\020music_record_map\030\n \003(\0132+.FleurF" +
      "airMusicGameInfo.MusicRecordMapEntry\032L\n\023" +
      "MusicRecordMapEntry\022\013\n\003key\030\001 \001(\r\022$\n\005valu" +
      "e\030\002 \001(\0132\025.FleurFairMusicRecord:\0028\001B\036\n\034em" +
      "u.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.getDescriptor(),
        });
    internal_static_FleurFairMusicGameInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FleurFairMusicGameInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairMusicGameInfo_descriptor,
        new java.lang.String[] { "MusicRecordMap", });
    internal_static_FleurFairMusicGameInfo_MusicRecordMapEntry_descriptor =
      internal_static_FleurFairMusicGameInfo_descriptor.getNestedTypes().get(0);
    internal_static_FleurFairMusicGameInfo_MusicRecordMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairMusicGameInfo_MusicRecordMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.oldproto.FleurFairMusicRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
