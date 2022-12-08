// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneEntityUpdateNotify.proto

package emu.grasscutter.net.newproto;

public final class SceneEntityUpdateNotifyOuterClass {
  private SceneEntityUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneEntityUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneEntityUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.VisionType appear_type = 11;</code>
     * @return The enum numeric value on the wire for appearType.
     */
    int getAppearTypeValue();
    /**
     * <code>.VisionType appear_type = 11;</code>
     * @return The appearType.
     */
    emu.grasscutter.net.newproto.VisionTypeOuterClass.VisionType getAppearType();

    /**
     * <code>uint32 param = 12;</code>
     * @return The param.
     */
    int getParam();

    /**
     * <code>repeated .SceneEntityInfo entity_list = 10;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo> 
        getEntityListList();
    /**
     * <code>repeated .SceneEntityInfo entity_list = 10;</code>
     */
    emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo getEntityList(int index);
    /**
     * <code>repeated .SceneEntityInfo entity_list = 10;</code>
     */
    int getEntityListCount();
    /**
     * <code>repeated .SceneEntityInfo entity_list = 10;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> 
        getEntityListOrBuilderList();
    /**
     * <code>repeated .SceneEntityInfo entity_list = 10;</code>
     */
    emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3115;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SceneEntityUpdateNotify}
   */
  public static final class SceneEntityUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneEntityUpdateNotify)
      SceneEntityUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneEntityUpdateNotify.newBuilder() to construct.
    private SceneEntityUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneEntityUpdateNotify() {
      appearType_ = 0;
      entityList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneEntityUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.internal_static_SceneEntityUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.internal_static_SceneEntityUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify.class, emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify.Builder.class);
    }

    public static final int APPEAR_TYPE_FIELD_NUMBER = 11;
    private int appearType_;
    /**
     * <code>.VisionType appear_type = 11;</code>
     * @return The enum numeric value on the wire for appearType.
     */
    @java.lang.Override public int getAppearTypeValue() {
      return appearType_;
    }
    /**
     * <code>.VisionType appear_type = 11;</code>
     * @return The appearType.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.VisionTypeOuterClass.VisionType getAppearType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.VisionTypeOuterClass.VisionType result = emu.grasscutter.net.newproto.VisionTypeOuterClass.VisionType.valueOf(appearType_);
      return result == null ? emu.grasscutter.net.newproto.VisionTypeOuterClass.VisionType.UNRECOGNIZED : result;
    }

    public static final int PARAM_FIELD_NUMBER = 12;
    private int param_;
    /**
     * <code>uint32 param = 12;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
    }

    public static final int ENTITY_LIST_FIELD_NUMBER = 10;
    private java.util.List<emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo> entityList_;
    /**
     * <code>repeated .SceneEntityInfo entity_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo> getEntityListList() {
      return entityList_;
    }
    /**
     * <code>repeated .SceneEntityInfo entity_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> 
        getEntityListOrBuilderList() {
      return entityList_;
    }
    /**
     * <code>repeated .SceneEntityInfo entity_list = 10;</code>
     */
    @java.lang.Override
    public int getEntityListCount() {
      return entityList_.size();
    }
    /**
     * <code>repeated .SceneEntityInfo entity_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo getEntityList(int index) {
      return entityList_.get(index);
    }
    /**
     * <code>repeated .SceneEntityInfo entity_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityListOrBuilder(
        int index) {
      return entityList_.get(index);
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
      for (int i = 0; i < entityList_.size(); i++) {
        output.writeMessage(10, entityList_.get(i));
      }
      if (appearType_ != emu.grasscutter.net.newproto.VisionTypeOuterClass.VisionType.VISION_TYPE_NONE.getNumber()) {
        output.writeEnum(11, appearType_);
      }
      if (param_ != 0) {
        output.writeUInt32(12, param_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < entityList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, entityList_.get(i));
      }
      if (appearType_ != emu.grasscutter.net.newproto.VisionTypeOuterClass.VisionType.VISION_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, appearType_);
      }
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, param_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify other = (emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify) obj;

      if (appearType_ != other.appearType_) return false;
      if (getParam()
          != other.getParam()) return false;
      if (!getEntityListList()
          .equals(other.getEntityListList())) return false;
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
      hash = (37 * hash) + APPEAR_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + appearType_;
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      if (getEntityListCount() > 0) {
        hash = (37 * hash) + ENTITY_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEntityListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify prototype) {
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
     *   CMD_ID = 3115;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SceneEntityUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneEntityUpdateNotify)
        emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.internal_static_SceneEntityUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.internal_static_SceneEntityUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify.class, emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        appearType_ = 0;

        param_ = 0;

        if (entityListBuilder_ == null) {
          entityList_ = java.util.Collections.emptyList();
        } else {
          entityList_ = null;
          entityListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.internal_static_SceneEntityUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify build() {
        emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify buildPartial() {
        emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify result = new emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify(this);
        int from_bitField0_ = bitField0_;
        result.appearType_ = appearType_;
        result.param_ = param_;
        if (entityListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            entityList_ = java.util.Collections.unmodifiableList(entityList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.entityList_ = entityList_;
        } else {
          result.entityList_ = entityListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify other) {
        if (other == emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify.getDefaultInstance()) return this;
        if (other.appearType_ != 0) {
          setAppearTypeValue(other.getAppearTypeValue());
        }
        if (other.getParam() != 0) {
          setParam(other.getParam());
        }
        if (entityListBuilder_ == null) {
          if (!other.entityList_.isEmpty()) {
            if (entityList_.isEmpty()) {
              entityList_ = other.entityList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEntityListIsMutable();
              entityList_.addAll(other.entityList_);
            }
            onChanged();
          }
        } else {
          if (!other.entityList_.isEmpty()) {
            if (entityListBuilder_.isEmpty()) {
              entityListBuilder_.dispose();
              entityListBuilder_ = null;
              entityList_ = other.entityList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              entityListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEntityListFieldBuilder() : null;
            } else {
              entityListBuilder_.addAllMessages(other.entityList_);
            }
          }
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
              case 82: {
                emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo.parser(),
                        extensionRegistry);
                if (entityListBuilder_ == null) {
                  ensureEntityListIsMutable();
                  entityList_.add(m);
                } else {
                  entityListBuilder_.addMessage(m);
                }
                break;
              } // case 82
              case 88: {
                appearType_ = input.readEnum();

                break;
              } // case 88
              case 96: {
                param_ = input.readUInt32();

                break;
              } // case 96
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

      private int appearType_ = 0;
      /**
       * <code>.VisionType appear_type = 11;</code>
       * @return The enum numeric value on the wire for appearType.
       */
      @java.lang.Override public int getAppearTypeValue() {
        return appearType_;
      }
      /**
       * <code>.VisionType appear_type = 11;</code>
       * @param value The enum numeric value on the wire for appearType to set.
       * @return This builder for chaining.
       */
      public Builder setAppearTypeValue(int value) {
        
        appearType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.VisionType appear_type = 11;</code>
       * @return The appearType.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.VisionTypeOuterClass.VisionType getAppearType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.VisionTypeOuterClass.VisionType result = emu.grasscutter.net.newproto.VisionTypeOuterClass.VisionType.valueOf(appearType_);
        return result == null ? emu.grasscutter.net.newproto.VisionTypeOuterClass.VisionType.UNRECOGNIZED : result;
      }
      /**
       * <code>.VisionType appear_type = 11;</code>
       * @param value The appearType to set.
       * @return This builder for chaining.
       */
      public Builder setAppearType(emu.grasscutter.net.newproto.VisionTypeOuterClass.VisionType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        appearType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.VisionType appear_type = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAppearType() {
        
        appearType_ = 0;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 12;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 12;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        
        param_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo> entityList_ =
        java.util.Collections.emptyList();
      private void ensureEntityListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          entityList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo>(entityList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo, emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder, emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> entityListBuilder_;

      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo> getEntityListList() {
        if (entityListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entityList_);
        } else {
          return entityListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public int getEntityListCount() {
        if (entityListBuilder_ == null) {
          return entityList_.size();
        } else {
          return entityListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo getEntityList(int index) {
        if (entityListBuilder_ == null) {
          return entityList_.get(index);
        } else {
          return entityListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public Builder setEntityList(
          int index, emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo value) {
        if (entityListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityListIsMutable();
          entityList_.set(index, value);
          onChanged();
        } else {
          entityListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public Builder setEntityList(
          int index, emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder builderForValue) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          entityList_.set(index, builderForValue.build());
          onChanged();
        } else {
          entityListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public Builder addEntityList(emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo value) {
        if (entityListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityListIsMutable();
          entityList_.add(value);
          onChanged();
        } else {
          entityListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public Builder addEntityList(
          int index, emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo value) {
        if (entityListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityListIsMutable();
          entityList_.add(index, value);
          onChanged();
        } else {
          entityListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public Builder addEntityList(
          emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder builderForValue) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          entityList_.add(builderForValue.build());
          onChanged();
        } else {
          entityListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public Builder addEntityList(
          int index, emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder builderForValue) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          entityList_.add(index, builderForValue.build());
          onChanged();
        } else {
          entityListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public Builder addAllEntityList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo> values) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, entityList_);
          onChanged();
        } else {
          entityListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public Builder clearEntityList() {
        if (entityListBuilder_ == null) {
          entityList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          entityListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public Builder removeEntityList(int index) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          entityList_.remove(index);
          onChanged();
        } else {
          entityListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder getEntityListBuilder(
          int index) {
        return getEntityListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityListOrBuilder(
          int index) {
        if (entityListBuilder_ == null) {
          return entityList_.get(index);  } else {
          return entityListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> 
           getEntityListOrBuilderList() {
        if (entityListBuilder_ != null) {
          return entityListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(entityList_);
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder addEntityListBuilder() {
        return getEntityListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder addEntityListBuilder(
          int index) {
        return getEntityListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder> 
           getEntityListBuilderList() {
        return getEntityListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo, emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder, emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> 
          getEntityListFieldBuilder() {
        if (entityListBuilder_ == null) {
          entityListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo, emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfo.Builder, emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder>(
                  entityList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          entityList_ = null;
        }
        return entityListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SceneEntityUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneEntityUpdateNotify)
    private static final emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify();
    }

    public static emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneEntityUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneEntityUpdateNotify>() {
      @java.lang.Override
      public SceneEntityUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneEntityUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneEntityUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SceneEntityUpdateNotifyOuterClass.SceneEntityUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneEntityUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneEntityUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035SceneEntityUpdateNotify.proto\032\025SceneEn" +
      "tityInfo.proto\032\020VisionType.proto\"q\n\027Scen" +
      "eEntityUpdateNotify\022 \n\013appear_type\030\013 \001(\016" +
      "2\013.VisionType\022\r\n\005param\030\014 \001(\r\022%\n\013entity_l" +
      "ist\030\n \003(\0132\020.SceneEntityInfoB\036\n\034emu.grass" +
      "cutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.getDescriptor(),
          emu.grasscutter.net.newproto.VisionTypeOuterClass.getDescriptor(),
        });
    internal_static_SceneEntityUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneEntityUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneEntityUpdateNotify_descriptor,
        new java.lang.String[] { "AppearType", "Param", "EntityList", });
    emu.grasscutter.net.newproto.SceneEntityInfoOuterClass.getDescriptor();
    emu.grasscutter.net.newproto.VisionTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
