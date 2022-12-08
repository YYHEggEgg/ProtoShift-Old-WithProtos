// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeVerifySceneData.proto

package emu.grasscutter.net.oldproto;

public final class HomeVerifySceneDataOuterClass {
  private HomeVerifySceneDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeVerifySceneDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeVerifySceneData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData> 
        getBlocksList();
    /**
     * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
     */
    emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData getBlocks(int index);
    /**
     * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
     */
    int getBlocksCount();
    /**
     * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockDataOrBuilder> 
        getBlocksOrBuilderList();
    /**
     * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
     */
    emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockDataOrBuilder getBlocksOrBuilder(
        int index);

    /**
     * <code>uint32 module_id = 11;</code>
     * @return The moduleId.
     */
    int getModuleId();

    /**
     * <code>uint32 scene_id = 4;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>uint32 version = 14;</code>
     * @return The version.
     */
    int getVersion();

    /**
     * <code>uint32 is_room = 2;</code>
     * @return The isRoom.
     */
    int getIsRoom();
  }
  /**
   * Protobuf type {@code HomeVerifySceneData}
   */
  public static final class HomeVerifySceneData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeVerifySceneData)
      HomeVerifySceneDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeVerifySceneData.newBuilder() to construct.
    private HomeVerifySceneData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeVerifySceneData() {
      blocks_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeVerifySceneData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.internal_static_HomeVerifySceneData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.internal_static_HomeVerifySceneData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData.class, emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData.Builder.class);
    }

    public static final int BLOCKS_FIELD_NUMBER = 6;
    private java.util.List<emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData> blocks_;
    /**
     * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData> getBlocksList() {
      return blocks_;
    }
    /**
     * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockDataOrBuilder> 
        getBlocksOrBuilderList() {
      return blocks_;
    }
    /**
     * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
     */
    @java.lang.Override
    public int getBlocksCount() {
      return blocks_.size();
    }
    /**
     * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData getBlocks(int index) {
      return blocks_.get(index);
    }
    /**
     * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockDataOrBuilder getBlocksOrBuilder(
        int index) {
      return blocks_.get(index);
    }

    public static final int MODULE_ID_FIELD_NUMBER = 11;
    private int moduleId_;
    /**
     * <code>uint32 module_id = 11;</code>
     * @return The moduleId.
     */
    @java.lang.Override
    public int getModuleId() {
      return moduleId_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 4;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 4;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int VERSION_FIELD_NUMBER = 14;
    private int version_;
    /**
     * <code>uint32 version = 14;</code>
     * @return The version.
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
    }

    public static final int IS_ROOM_FIELD_NUMBER = 2;
    private int isRoom_;
    /**
     * <code>uint32 is_room = 2;</code>
     * @return The isRoom.
     */
    @java.lang.Override
    public int getIsRoom() {
      return isRoom_;
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
      if (isRoom_ != 0) {
        output.writeUInt32(2, isRoom_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(4, sceneId_);
      }
      for (int i = 0; i < blocks_.size(); i++) {
        output.writeMessage(6, blocks_.get(i));
      }
      if (moduleId_ != 0) {
        output.writeUInt32(11, moduleId_);
      }
      if (version_ != 0) {
        output.writeUInt32(14, version_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isRoom_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, isRoom_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, sceneId_);
      }
      for (int i = 0; i < blocks_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, blocks_.get(i));
      }
      if (moduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, moduleId_);
      }
      if (version_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, version_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData other = (emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData) obj;

      if (!getBlocksList()
          .equals(other.getBlocksList())) return false;
      if (getModuleId()
          != other.getModuleId()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
      if (getVersion()
          != other.getVersion()) return false;
      if (getIsRoom()
          != other.getIsRoom()) return false;
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
      if (getBlocksCount() > 0) {
        hash = (37 * hash) + BLOCKS_FIELD_NUMBER;
        hash = (53 * hash) + getBlocksList().hashCode();
      }
      hash = (37 * hash) + MODULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getModuleId();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion();
      hash = (37 * hash) + IS_ROOM_FIELD_NUMBER;
      hash = (53 * hash) + getIsRoom();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData prototype) {
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
     * Protobuf type {@code HomeVerifySceneData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeVerifySceneData)
        emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.internal_static_HomeVerifySceneData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.internal_static_HomeVerifySceneData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData.class, emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (blocksBuilder_ == null) {
          blocks_ = java.util.Collections.emptyList();
        } else {
          blocks_ = null;
          blocksBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        moduleId_ = 0;

        sceneId_ = 0;

        version_ = 0;

        isRoom_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.internal_static_HomeVerifySceneData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData build() {
        emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData buildPartial() {
        emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData result = new emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData(this);
        int from_bitField0_ = bitField0_;
        if (blocksBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            blocks_ = java.util.Collections.unmodifiableList(blocks_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.blocks_ = blocks_;
        } else {
          result.blocks_ = blocksBuilder_.build();
        }
        result.moduleId_ = moduleId_;
        result.sceneId_ = sceneId_;
        result.version_ = version_;
        result.isRoom_ = isRoom_;
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
        if (other instanceof emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData) {
          return mergeFrom((emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData other) {
        if (other == emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData.getDefaultInstance()) return this;
        if (blocksBuilder_ == null) {
          if (!other.blocks_.isEmpty()) {
            if (blocks_.isEmpty()) {
              blocks_ = other.blocks_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBlocksIsMutable();
              blocks_.addAll(other.blocks_);
            }
            onChanged();
          }
        } else {
          if (!other.blocks_.isEmpty()) {
            if (blocksBuilder_.isEmpty()) {
              blocksBuilder_.dispose();
              blocksBuilder_ = null;
              blocks_ = other.blocks_;
              bitField0_ = (bitField0_ & ~0x00000001);
              blocksBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBlocksFieldBuilder() : null;
            } else {
              blocksBuilder_.addAllMessages(other.blocks_);
            }
          }
        }
        if (other.getModuleId() != 0) {
          setModuleId(other.getModuleId());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getVersion() != 0) {
          setVersion(other.getVersion());
        }
        if (other.getIsRoom() != 0) {
          setIsRoom(other.getIsRoom());
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
              case 16: {
                isRoom_ = input.readUInt32();

                break;
              } // case 16
              case 32: {
                sceneId_ = input.readUInt32();

                break;
              } // case 32
              case 50: {
                emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData.parser(),
                        extensionRegistry);
                if (blocksBuilder_ == null) {
                  ensureBlocksIsMutable();
                  blocks_.add(m);
                } else {
                  blocksBuilder_.addMessage(m);
                }
                break;
              } // case 50
              case 88: {
                moduleId_ = input.readUInt32();

                break;
              } // case 88
              case 112: {
                version_ = input.readUInt32();

                break;
              } // case 112
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

      private java.util.List<emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData> blocks_ =
        java.util.Collections.emptyList();
      private void ensureBlocksIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          blocks_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData>(blocks_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData, emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData.Builder, emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockDataOrBuilder> blocksBuilder_;

      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData> getBlocksList() {
        if (blocksBuilder_ == null) {
          return java.util.Collections.unmodifiableList(blocks_);
        } else {
          return blocksBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public int getBlocksCount() {
        if (blocksBuilder_ == null) {
          return blocks_.size();
        } else {
          return blocksBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData getBlocks(int index) {
        if (blocksBuilder_ == null) {
          return blocks_.get(index);
        } else {
          return blocksBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public Builder setBlocks(
          int index, emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData value) {
        if (blocksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlocksIsMutable();
          blocks_.set(index, value);
          onChanged();
        } else {
          blocksBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public Builder setBlocks(
          int index, emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData.Builder builderForValue) {
        if (blocksBuilder_ == null) {
          ensureBlocksIsMutable();
          blocks_.set(index, builderForValue.build());
          onChanged();
        } else {
          blocksBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public Builder addBlocks(emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData value) {
        if (blocksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlocksIsMutable();
          blocks_.add(value);
          onChanged();
        } else {
          blocksBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public Builder addBlocks(
          int index, emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData value) {
        if (blocksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlocksIsMutable();
          blocks_.add(index, value);
          onChanged();
        } else {
          blocksBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public Builder addBlocks(
          emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData.Builder builderForValue) {
        if (blocksBuilder_ == null) {
          ensureBlocksIsMutable();
          blocks_.add(builderForValue.build());
          onChanged();
        } else {
          blocksBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public Builder addBlocks(
          int index, emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData.Builder builderForValue) {
        if (blocksBuilder_ == null) {
          ensureBlocksIsMutable();
          blocks_.add(index, builderForValue.build());
          onChanged();
        } else {
          blocksBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public Builder addAllBlocks(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData> values) {
        if (blocksBuilder_ == null) {
          ensureBlocksIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, blocks_);
          onChanged();
        } else {
          blocksBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public Builder clearBlocks() {
        if (blocksBuilder_ == null) {
          blocks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          blocksBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public Builder removeBlocks(int index) {
        if (blocksBuilder_ == null) {
          ensureBlocksIsMutable();
          blocks_.remove(index);
          onChanged();
        } else {
          blocksBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData.Builder getBlocksBuilder(
          int index) {
        return getBlocksFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockDataOrBuilder getBlocksOrBuilder(
          int index) {
        if (blocksBuilder_ == null) {
          return blocks_.get(index);  } else {
          return blocksBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockDataOrBuilder> 
           getBlocksOrBuilderList() {
        if (blocksBuilder_ != null) {
          return blocksBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(blocks_);
        }
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData.Builder addBlocksBuilder() {
        return getBlocksFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData.Builder addBlocksBuilder(
          int index) {
        return getBlocksFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeVerifyBlockData blocks = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData.Builder> 
           getBlocksBuilderList() {
        return getBlocksFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData, emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData.Builder, emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockDataOrBuilder> 
          getBlocksFieldBuilder() {
        if (blocksBuilder_ == null) {
          blocksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData, emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockData.Builder, emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.HomeVerifyBlockDataOrBuilder>(
                  blocks_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          blocks_ = null;
        }
        return blocksBuilder_;
      }

      private int moduleId_ ;
      /**
       * <code>uint32 module_id = 11;</code>
       * @return The moduleId.
       */
      @java.lang.Override
      public int getModuleId() {
        return moduleId_;
      }
      /**
       * <code>uint32 module_id = 11;</code>
       * @param value The moduleId to set.
       * @return This builder for chaining.
       */
      public Builder setModuleId(int value) {
        
        moduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 module_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearModuleId() {
        
        moduleId_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 4;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 4;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int version_ ;
      /**
       * <code>uint32 version = 14;</code>
       * @return The version.
       */
      @java.lang.Override
      public int getVersion() {
        return version_;
      }
      /**
       * <code>uint32 version = 14;</code>
       * @param value The version to set.
       * @return This builder for chaining.
       */
      public Builder setVersion(int value) {
        
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 version = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersion() {
        
        version_ = 0;
        onChanged();
        return this;
      }

      private int isRoom_ ;
      /**
       * <code>uint32 is_room = 2;</code>
       * @return The isRoom.
       */
      @java.lang.Override
      public int getIsRoom() {
        return isRoom_;
      }
      /**
       * <code>uint32 is_room = 2;</code>
       * @param value The isRoom to set.
       * @return This builder for chaining.
       */
      public Builder setIsRoom(int value) {
        
        isRoom_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 is_room = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsRoom() {
        
        isRoom_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeVerifySceneData)
    }

    // @@protoc_insertion_point(class_scope:HomeVerifySceneData)
    private static final emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData();
    }

    public static emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeVerifySceneData>
        PARSER = new com.google.protobuf.AbstractParser<HomeVerifySceneData>() {
      @java.lang.Override
      public HomeVerifySceneData parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeVerifySceneData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeVerifySceneData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeVerifySceneDataOuterClass.HomeVerifySceneData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeVerifySceneData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeVerifySceneData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031HomeVerifySceneData.proto\032\031HomeVerifyB" +
      "lockData.proto\"\202\001\n\023HomeVerifySceneData\022$" +
      "\n\006blocks\030\006 \003(\0132\024.HomeVerifyBlockData\022\021\n\t" +
      "module_id\030\013 \001(\r\022\020\n\010scene_id\030\004 \001(\r\022\017\n\007ver" +
      "sion\030\016 \001(\r\022\017\n\007is_room\030\002 \001(\rB\036\n\034emu.grass" +
      "cutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.getDescriptor(),
        });
    internal_static_HomeVerifySceneData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeVerifySceneData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeVerifySceneData_descriptor,
        new java.lang.String[] { "Blocks", "ModuleId", "SceneId", "Version", "IsRoom", });
    emu.grasscutter.net.oldproto.HomeVerifyBlockDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
