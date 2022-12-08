// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GachaActivityTakeRewardReq.proto

package emu.grasscutter.net.newproto;

public final class GachaActivityTakeRewardReqOuterClass {
  private GachaActivityTakeRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GachaActivityTakeRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GachaActivityTakeRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
     */
    int getRobotNumMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
     */
    boolean containsRobotNumMap(
        int key);
    /**
     * Use {@link #getRobotNumMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getRobotNumMap();
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getRobotNumMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
     */

    int getRobotNumMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
     */

    int getRobotNumMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8853;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GachaActivityTakeRewardReq}
   */
  public static final class GachaActivityTakeRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GachaActivityTakeRewardReq)
      GachaActivityTakeRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GachaActivityTakeRewardReq.newBuilder() to construct.
    private GachaActivityTakeRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GachaActivityTakeRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GachaActivityTakeRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.internal_static_GachaActivityTakeRewardReq_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 7:
          return internalGetRobotNumMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.internal_static_GachaActivityTakeRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq.class, emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq.Builder.class);
    }

    public static final int ROBOT_NUM_MAP_FIELD_NUMBER = 7;
    private static final class RobotNumMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.internal_static_GachaActivityTakeRewardReq_RobotNumMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> robotNumMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetRobotNumMap() {
      if (robotNumMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            RobotNumMapDefaultEntryHolder.defaultEntry);
      }
      return robotNumMap_;
    }

    public int getRobotNumMapCount() {
      return internalGetRobotNumMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
     */

    @java.lang.Override
    public boolean containsRobotNumMap(
        int key) {
      
      return internalGetRobotNumMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getRobotNumMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getRobotNumMap() {
      return getRobotNumMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getRobotNumMapMap() {
      return internalGetRobotNumMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
     */
    @java.lang.Override

    public int getRobotNumMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetRobotNumMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
     */
    @java.lang.Override

    public int getRobotNumMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetRobotNumMap().getMap();
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
          internalGetRobotNumMap(),
          RobotNumMapDefaultEntryHolder.defaultEntry,
          7);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetRobotNumMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        robotNumMap__ = RobotNumMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(7, robotNumMap__);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq other = (emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq) obj;

      if (!internalGetRobotNumMap().equals(
          other.internalGetRobotNumMap())) return false;
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
      if (!internalGetRobotNumMap().getMap().isEmpty()) {
        hash = (37 * hash) + ROBOT_NUM_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetRobotNumMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq prototype) {
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
     *   CMD_ID = 8853;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GachaActivityTakeRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GachaActivityTakeRewardReq)
        emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.internal_static_GachaActivityTakeRewardReq_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 7:
            return internalGetRobotNumMap();
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
            return internalGetMutableRobotNumMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.internal_static_GachaActivityTakeRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq.class, emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        internalGetMutableRobotNumMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.internal_static_GachaActivityTakeRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq build() {
        emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq buildPartial() {
        emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq result = new emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq(this);
        int from_bitField0_ = bitField0_;
        result.robotNumMap_ = internalGetRobotNumMap();
        result.robotNumMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq) {
          return mergeFrom((emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq other) {
        if (other == emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq.getDefaultInstance()) return this;
        internalGetMutableRobotNumMap().mergeFrom(
            other.internalGetRobotNumMap());
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
                robotNumMap__ = input.readMessage(
                    RobotNumMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableRobotNumMap().getMutableMap().put(
                    robotNumMap__.getKey(), robotNumMap__.getValue());
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
          java.lang.Integer, java.lang.Integer> robotNumMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetRobotNumMap() {
        if (robotNumMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              RobotNumMapDefaultEntryHolder.defaultEntry);
        }
        return robotNumMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableRobotNumMap() {
        onChanged();;
        if (robotNumMap_ == null) {
          robotNumMap_ = com.google.protobuf.MapField.newMapField(
              RobotNumMapDefaultEntryHolder.defaultEntry);
        }
        if (!robotNumMap_.isMutable()) {
          robotNumMap_ = robotNumMap_.copy();
        }
        return robotNumMap_;
      }

      public int getRobotNumMapCount() {
        return internalGetRobotNumMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
       */

      @java.lang.Override
      public boolean containsRobotNumMap(
          int key) {
        
        return internalGetRobotNumMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getRobotNumMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getRobotNumMap() {
        return getRobotNumMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getRobotNumMapMap() {
        return internalGetRobotNumMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
       */
      @java.lang.Override

      public int getRobotNumMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetRobotNumMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
       */
      @java.lang.Override

      public int getRobotNumMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetRobotNumMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearRobotNumMap() {
        internalGetMutableRobotNumMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
       */

      public Builder removeRobotNumMap(
          int key) {
        
        internalGetMutableRobotNumMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableRobotNumMap() {
        return internalGetMutableRobotNumMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
       */
      public Builder putRobotNumMap(
          int key,
          int value) {
        
        
        internalGetMutableRobotNumMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; robot_num_map = 7;</code>
       */

      public Builder putAllRobotNumMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableRobotNumMap().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:GachaActivityTakeRewardReq)
    }

    // @@protoc_insertion_point(class_scope:GachaActivityTakeRewardReq)
    private static final emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq();
    }

    public static emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GachaActivityTakeRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<GachaActivityTakeRewardReq>() {
      @java.lang.Override
      public GachaActivityTakeRewardReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GachaActivityTakeRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GachaActivityTakeRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GachaActivityTakeRewardReqOuterClass.GachaActivityTakeRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GachaActivityTakeRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GachaActivityTakeRewardReq_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GachaActivityTakeRewardReq_RobotNumMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GachaActivityTakeRewardReq_RobotNumMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GachaActivityTakeRewardReq.proto\"\225\001\n\032G" +
      "achaActivityTakeRewardReq\022C\n\rrobot_num_m" +
      "ap\030\007 \003(\0132,.GachaActivityTakeRewardReq.Ro" +
      "botNumMapEntry\0322\n\020RobotNumMapEntry\022\013\n\003ke" +
      "y\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GachaActivityTakeRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GachaActivityTakeRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GachaActivityTakeRewardReq_descriptor,
        new java.lang.String[] { "RobotNumMap", });
    internal_static_GachaActivityTakeRewardReq_RobotNumMapEntry_descriptor =
      internal_static_GachaActivityTakeRewardReq_descriptor.getNestedTypes().get(0);
    internal_static_GachaActivityTakeRewardReq_RobotNumMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GachaActivityTakeRewardReq_RobotNumMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
