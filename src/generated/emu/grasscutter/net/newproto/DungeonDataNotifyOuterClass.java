// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonDataNotify.proto

package emu.grasscutter.net.newproto;

public final class DungeonDataNotifyOuterClass {
  private DungeonDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
     */
    int getDungeonDataMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
     */
    boolean containsDungeonDataMap(
        int key);
    /**
     * Use {@link #getDungeonDataMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getDungeonDataMap();
    /**
     * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getDungeonDataMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
     */

    int getDungeonDataMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
     */

    int getDungeonDataMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 990;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code DungeonDataNotify}
   */
  public static final class DungeonDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonDataNotify)
      DungeonDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonDataNotify.newBuilder() to construct.
    private DungeonDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.internal_static_DungeonDataNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 7:
          return internalGetDungeonDataMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.internal_static_DungeonDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify.class, emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify.Builder.class);
    }

    public static final int DUNGEON_DATA_MAP_FIELD_NUMBER = 7;
    private static final class DungeonDataMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.internal_static_DungeonDataNotify_DungeonDataMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> dungeonDataMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetDungeonDataMap() {
      if (dungeonDataMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            DungeonDataMapDefaultEntryHolder.defaultEntry);
      }
      return dungeonDataMap_;
    }

    public int getDungeonDataMapCount() {
      return internalGetDungeonDataMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
     */

    @java.lang.Override
    public boolean containsDungeonDataMap(
        int key) {
      
      return internalGetDungeonDataMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getDungeonDataMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getDungeonDataMap() {
      return getDungeonDataMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getDungeonDataMapMap() {
      return internalGetDungeonDataMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
     */
    @java.lang.Override

    public int getDungeonDataMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetDungeonDataMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
     */
    @java.lang.Override

    public int getDungeonDataMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetDungeonDataMap().getMap();
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
          internalGetDungeonDataMap(),
          DungeonDataMapDefaultEntryHolder.defaultEntry,
          7);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetDungeonDataMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        dungeonDataMap__ = DungeonDataMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(7, dungeonDataMap__);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify other = (emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify) obj;

      if (!internalGetDungeonDataMap().equals(
          other.internalGetDungeonDataMap())) return false;
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
      if (!internalGetDungeonDataMap().getMap().isEmpty()) {
        hash = (37 * hash) + DUNGEON_DATA_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetDungeonDataMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify prototype) {
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
     *   CMD_ID = 990;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code DungeonDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonDataNotify)
        emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.internal_static_DungeonDataNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 7:
            return internalGetDungeonDataMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 7:
            return internalGetMutableDungeonDataMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.internal_static_DungeonDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify.class, emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        internalGetMutableDungeonDataMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.internal_static_DungeonDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify build() {
        emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify buildPartial() {
        emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify result = new emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify(this);
        int from_bitField0_ = bitField0_;
        result.dungeonDataMap_ = internalGetDungeonDataMap();
        result.dungeonDataMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify other) {
        if (other == emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify.getDefaultInstance()) return this;
        internalGetMutableDungeonDataMap().mergeFrom(
            other.internalGetDungeonDataMap());
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
              case 58: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                dungeonDataMap__ = input.readMessage(
                    DungeonDataMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableDungeonDataMap().getMutableMap().put(
                    dungeonDataMap__.getKey(), dungeonDataMap__.getValue());
                break;
              } // case 58
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
          java.lang.Integer, java.lang.Integer> dungeonDataMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetDungeonDataMap() {
        if (dungeonDataMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              DungeonDataMapDefaultEntryHolder.defaultEntry);
        }
        return dungeonDataMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableDungeonDataMap() {
        onChanged();;
        if (dungeonDataMap_ == null) {
          dungeonDataMap_ = com.google.protobuf.MapField.newMapField(
              DungeonDataMapDefaultEntryHolder.defaultEntry);
        }
        if (!dungeonDataMap_.isMutable()) {
          dungeonDataMap_ = dungeonDataMap_.copy();
        }
        return dungeonDataMap_;
      }

      public int getDungeonDataMapCount() {
        return internalGetDungeonDataMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
       */

      @java.lang.Override
      public boolean containsDungeonDataMap(
          int key) {
        
        return internalGetDungeonDataMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getDungeonDataMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getDungeonDataMap() {
        return getDungeonDataMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getDungeonDataMapMap() {
        return internalGetDungeonDataMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
       */
      @java.lang.Override

      public int getDungeonDataMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetDungeonDataMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
       */
      @java.lang.Override

      public int getDungeonDataMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetDungeonDataMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearDungeonDataMap() {
        internalGetMutableDungeonDataMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
       */

      public Builder removeDungeonDataMap(
          int key) {
        
        internalGetMutableDungeonDataMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableDungeonDataMap() {
        return internalGetMutableDungeonDataMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
       */
      public Builder putDungeonDataMap(
          int key,
          int value) {
        
        
        internalGetMutableDungeonDataMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; dungeon_data_map = 7;</code>
       */

      public Builder putAllDungeonDataMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableDungeonDataMap().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:DungeonDataNotify)
    }

    // @@protoc_insertion_point(class_scope:DungeonDataNotify)
    private static final emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify();
    }

    public static emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<DungeonDataNotify>() {
      @java.lang.Override
      public DungeonDataNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<DungeonDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.DungeonDataNotifyOuterClass.DungeonDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonDataNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonDataNotify_DungeonDataMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonDataNotify_DungeonDataMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027DungeonDataNotify.proto\"\214\001\n\021DungeonDat" +
      "aNotify\022@\n\020dungeon_data_map\030\007 \003(\0132&.Dung" +
      "eonDataNotify.DungeonDataMapEntry\0325\n\023Dun" +
      "geonDataMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002" +
      " \001(\r:\0028\001B\036\n\034emu.grasscutter.net.newproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonDataNotify_descriptor,
        new java.lang.String[] { "DungeonDataMap", });
    internal_static_DungeonDataNotify_DungeonDataMapEntry_descriptor =
      internal_static_DungeonDataNotify_descriptor.getNestedTypes().get(0);
    internal_static_DungeonDataNotify_DungeonDataMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonDataNotify_DungeonDataMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
