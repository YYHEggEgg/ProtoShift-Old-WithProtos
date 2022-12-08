// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OneofGatherPointDetectorData.proto

package emu.grasscutter.net.newproto;

public final class OneofGatherPointDetectorDataOuterClass {
  private OneofGatherPointDetectorDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OneofGatherPointDetectorDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OneofGatherPointDetectorData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 hint_radius = 4;</code>
     * @return The hintRadius.
     */
    int getHintRadius();

    /**
     * <code>uint32 config_id = 3;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>bool is_hint_valid = 11;</code>
     * @return The isHintValid.
     */
    boolean getIsHintValid();

    /**
     * <code>.Vector hint_center_pos = 12;</code>
     * @return Whether the hintCenterPos field is set.
     */
    boolean hasHintCenterPos();
    /**
     * <code>.Vector hint_center_pos = 12;</code>
     * @return The hintCenterPos.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getHintCenterPos();
    /**
     * <code>.Vector hint_center_pos = 12;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder();

    /**
     * <code>bool is_all_collected = 10;</code>
     * @return The isAllCollected.
     */
    boolean getIsAllCollected();

    /**
     * <code>uint32 group_id = 1;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 material_id = 9;</code>
     * @return The materialId.
     */
    int getMaterialId();
  }
  /**
   * Protobuf type {@code OneofGatherPointDetectorData}
   */
  public static final class OneofGatherPointDetectorData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OneofGatherPointDetectorData)
      OneofGatherPointDetectorDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OneofGatherPointDetectorData.newBuilder() to construct.
    private OneofGatherPointDetectorData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OneofGatherPointDetectorData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OneofGatherPointDetectorData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.class, emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder.class);
    }

    public static final int HINT_RADIUS_FIELD_NUMBER = 4;
    private int hintRadius_;
    /**
     * <code>uint32 hint_radius = 4;</code>
     * @return The hintRadius.
     */
    @java.lang.Override
    public int getHintRadius() {
      return hintRadius_;
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 3;
    private int configId_;
    /**
     * <code>uint32 config_id = 3;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int IS_HINT_VALID_FIELD_NUMBER = 11;
    private boolean isHintValid_;
    /**
     * <code>bool is_hint_valid = 11;</code>
     * @return The isHintValid.
     */
    @java.lang.Override
    public boolean getIsHintValid() {
      return isHintValid_;
    }

    public static final int HINT_CENTER_POS_FIELD_NUMBER = 12;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector hintCenterPos_;
    /**
     * <code>.Vector hint_center_pos = 12;</code>
     * @return Whether the hintCenterPos field is set.
     */
    @java.lang.Override
    public boolean hasHintCenterPos() {
      return hintCenterPos_ != null;
    }
    /**
     * <code>.Vector hint_center_pos = 12;</code>
     * @return The hintCenterPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getHintCenterPos() {
      return hintCenterPos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
    }
    /**
     * <code>.Vector hint_center_pos = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
      return getHintCenterPos();
    }

    public static final int IS_ALL_COLLECTED_FIELD_NUMBER = 10;
    private boolean isAllCollected_;
    /**
     * <code>bool is_all_collected = 10;</code>
     * @return The isAllCollected.
     */
    @java.lang.Override
    public boolean getIsAllCollected() {
      return isAllCollected_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 1;
    private int groupId_;
    /**
     * <code>uint32 group_id = 1;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 9;
    private int materialId_;
    /**
     * <code>uint32 material_id = 9;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
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
      if (groupId_ != 0) {
        output.writeUInt32(1, groupId_);
      }
      if (configId_ != 0) {
        output.writeUInt32(3, configId_);
      }
      if (hintRadius_ != 0) {
        output.writeUInt32(4, hintRadius_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(9, materialId_);
      }
      if (isAllCollected_ != false) {
        output.writeBool(10, isAllCollected_);
      }
      if (isHintValid_ != false) {
        output.writeBool(11, isHintValid_);
      }
      if (hintCenterPos_ != null) {
        output.writeMessage(12, getHintCenterPos());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, groupId_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, configId_);
      }
      if (hintRadius_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, hintRadius_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, materialId_);
      }
      if (isAllCollected_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isAllCollected_);
      }
      if (isHintValid_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isHintValid_);
      }
      if (hintCenterPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getHintCenterPos());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData other = (emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData) obj;

      if (getHintRadius()
          != other.getHintRadius()) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
      if (getIsHintValid()
          != other.getIsHintValid()) return false;
      if (hasHintCenterPos() != other.hasHintCenterPos()) return false;
      if (hasHintCenterPos()) {
        if (!getHintCenterPos()
            .equals(other.getHintCenterPos())) return false;
      }
      if (getIsAllCollected()
          != other.getIsAllCollected()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
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
      hash = (37 * hash) + HINT_RADIUS_FIELD_NUMBER;
      hash = (53 * hash) + getHintRadius();
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + IS_HINT_VALID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHintValid());
      if (hasHintCenterPos()) {
        hash = (37 * hash) + HINT_CENTER_POS_FIELD_NUMBER;
        hash = (53 * hash) + getHintCenterPos().hashCode();
      }
      hash = (37 * hash) + IS_ALL_COLLECTED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAllCollected());
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData prototype) {
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
     * Protobuf type {@code OneofGatherPointDetectorData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OneofGatherPointDetectorData)
        emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.class, emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        hintRadius_ = 0;

        configId_ = 0;

        isHintValid_ = false;

        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = null;
        } else {
          hintCenterPos_ = null;
          hintCenterPosBuilder_ = null;
        }
        isAllCollected_ = false;

        groupId_ = 0;

        materialId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.internal_static_OneofGatherPointDetectorData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData build() {
        emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData buildPartial() {
        emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData result = new emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData(this);
        result.hintRadius_ = hintRadius_;
        result.configId_ = configId_;
        result.isHintValid_ = isHintValid_;
        if (hintCenterPosBuilder_ == null) {
          result.hintCenterPos_ = hintCenterPos_;
        } else {
          result.hintCenterPos_ = hintCenterPosBuilder_.build();
        }
        result.isAllCollected_ = isAllCollected_;
        result.groupId_ = groupId_;
        result.materialId_ = materialId_;
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
        if (other instanceof emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData) {
          return mergeFrom((emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData other) {
        if (other == emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData.getDefaultInstance()) return this;
        if (other.getHintRadius() != 0) {
          setHintRadius(other.getHintRadius());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (other.getIsHintValid() != false) {
          setIsHintValid(other.getIsHintValid());
        }
        if (other.hasHintCenterPos()) {
          mergeHintCenterPos(other.getHintCenterPos());
        }
        if (other.getIsAllCollected() != false) {
          setIsAllCollected(other.getIsAllCollected());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
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
                groupId_ = input.readUInt32();

                break;
              } // case 8
              case 24: {
                configId_ = input.readUInt32();

                break;
              } // case 24
              case 32: {
                hintRadius_ = input.readUInt32();

                break;
              } // case 32
              case 72: {
                materialId_ = input.readUInt32();

                break;
              } // case 72
              case 80: {
                isAllCollected_ = input.readBool();

                break;
              } // case 80
              case 88: {
                isHintValid_ = input.readBool();

                break;
              } // case 88
              case 98: {
                input.readMessage(
                    getHintCenterPosFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 98
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

      private int hintRadius_ ;
      /**
       * <code>uint32 hint_radius = 4;</code>
       * @return The hintRadius.
       */
      @java.lang.Override
      public int getHintRadius() {
        return hintRadius_;
      }
      /**
       * <code>uint32 hint_radius = 4;</code>
       * @param value The hintRadius to set.
       * @return This builder for chaining.
       */
      public Builder setHintRadius(int value) {
        
        hintRadius_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hint_radius = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearHintRadius() {
        
        hintRadius_ = 0;
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 3;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 3;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private boolean isHintValid_ ;
      /**
       * <code>bool is_hint_valid = 11;</code>
       * @return The isHintValid.
       */
      @java.lang.Override
      public boolean getIsHintValid() {
        return isHintValid_;
      }
      /**
       * <code>bool is_hint_valid = 11;</code>
       * @param value The isHintValid to set.
       * @return This builder for chaining.
       */
      public Builder setIsHintValid(boolean value) {
        
        isHintValid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_hint_valid = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHintValid() {
        
        isHintValid_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector hintCenterPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> hintCenterPosBuilder_;
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       * @return Whether the hintCenterPos field is set.
       */
      public boolean hasHintCenterPos() {
        return hintCenterPosBuilder_ != null || hintCenterPos_ != null;
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       * @return The hintCenterPos.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getHintCenterPos() {
        if (hintCenterPosBuilder_ == null) {
          return hintCenterPos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
        } else {
          return hintCenterPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       */
      public Builder setHintCenterPos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (hintCenterPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hintCenterPos_ = value;
          onChanged();
        } else {
          hintCenterPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       */
      public Builder setHintCenterPos(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = builderForValue.build();
          onChanged();
        } else {
          hintCenterPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       */
      public Builder mergeHintCenterPos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (hintCenterPosBuilder_ == null) {
          if (hintCenterPos_ != null) {
            hintCenterPos_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(hintCenterPos_).mergeFrom(value).buildPartial();
          } else {
            hintCenterPos_ = value;
          }
          onChanged();
        } else {
          hintCenterPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       */
      public Builder clearHintCenterPos() {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = null;
          onChanged();
        } else {
          hintCenterPos_ = null;
          hintCenterPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getHintCenterPosBuilder() {
        
        onChanged();
        return getHintCenterPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
        if (hintCenterPosBuilder_ != null) {
          return hintCenterPosBuilder_.getMessageOrBuilder();
        } else {
          return hintCenterPos_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
        }
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getHintCenterPosFieldBuilder() {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getHintCenterPos(),
                  getParentForChildren(),
                  isClean());
          hintCenterPos_ = null;
        }
        return hintCenterPosBuilder_;
      }

      private boolean isAllCollected_ ;
      /**
       * <code>bool is_all_collected = 10;</code>
       * @return The isAllCollected.
       */
      @java.lang.Override
      public boolean getIsAllCollected() {
        return isAllCollected_;
      }
      /**
       * <code>bool is_all_collected = 10;</code>
       * @param value The isAllCollected to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllCollected(boolean value) {
        
        isAllCollected_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_all_collected = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllCollected() {
        
        isAllCollected_ = false;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 1;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 1;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 9;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 9;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OneofGatherPointDetectorData)
    }

    // @@protoc_insertion_point(class_scope:OneofGatherPointDetectorData)
    private static final emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData();
    }

    public static emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OneofGatherPointDetectorData>
        PARSER = new com.google.protobuf.AbstractParser<OneofGatherPointDetectorData>() {
      @java.lang.Override
      public OneofGatherPointDetectorData parsePartialFrom(
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

    public static com.google.protobuf.Parser<OneofGatherPointDetectorData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OneofGatherPointDetectorData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.OneofGatherPointDetectorDataOuterClass.OneofGatherPointDetectorData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OneofGatherPointDetectorData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OneofGatherPointDetectorData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"OneofGatherPointDetectorData.proto\032\014Ve" +
      "ctor.proto\"\300\001\n\034OneofGatherPointDetectorD" +
      "ata\022\023\n\013hint_radius\030\004 \001(\r\022\021\n\tconfig_id\030\003 " +
      "\001(\r\022\025\n\ris_hint_valid\030\013 \001(\010\022 \n\017hint_cente" +
      "r_pos\030\014 \001(\0132\007.Vector\022\030\n\020is_all_collected" +
      "\030\n \001(\010\022\020\n\010group_id\030\001 \001(\r\022\023\n\013material_id\030" +
      "\t \001(\rB\036\n\034emu.grasscutter.net.newprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_OneofGatherPointDetectorData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OneofGatherPointDetectorData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OneofGatherPointDetectorData_descriptor,
        new java.lang.String[] { "HintRadius", "ConfigId", "IsHintValid", "HintCenterPos", "IsAllCollected", "GroupId", "MaterialId", });
    emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
