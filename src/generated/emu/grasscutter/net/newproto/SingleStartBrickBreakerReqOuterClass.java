// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SingleStartBrickBreakerReq.proto

package emu.grasscutter.net.newproto;

public final class SingleStartBrickBreakerReqOuterClass {
  private SingleStartBrickBreakerReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SingleStartBrickBreakerReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SingleStartBrickBreakerReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_dungeon = 13;</code>
     * @return The isDungeon.
     */
    boolean getIsDungeon();

    /**
     * <code>uint32 level_id = 8;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>repeated uint32 chosen_skill_list = 12;</code>
     * @return A list containing the chosenSkillList.
     */
    java.util.List<java.lang.Integer> getChosenSkillListList();
    /**
     * <code>repeated uint32 chosen_skill_list = 12;</code>
     * @return The count of chosenSkillList.
     */
    int getChosenSkillListCount();
    /**
     * <code>repeated uint32 chosen_skill_list = 12;</code>
     * @param index The index of the element to return.
     * @return The chosenSkillList at the given index.
     */
    int getChosenSkillList(int index);

    /**
     * <code>repeated uint32 chosen_avatar_list = 5;</code>
     * @return A list containing the chosenAvatarList.
     */
    java.util.List<java.lang.Integer> getChosenAvatarListList();
    /**
     * <code>repeated uint32 chosen_avatar_list = 5;</code>
     * @return The count of chosenAvatarList.
     */
    int getChosenAvatarListCount();
    /**
     * <code>repeated uint32 chosen_avatar_list = 5;</code>
     * @param index The index of the element to return.
     * @return The chosenAvatarList at the given index.
     */
    int getChosenAvatarList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 23663;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SingleStartBrickBreakerReq}
   */
  public static final class SingleStartBrickBreakerReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SingleStartBrickBreakerReq)
      SingleStartBrickBreakerReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SingleStartBrickBreakerReq.newBuilder() to construct.
    private SingleStartBrickBreakerReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SingleStartBrickBreakerReq() {
      chosenSkillList_ = emptyIntList();
      chosenAvatarList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SingleStartBrickBreakerReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.internal_static_SingleStartBrickBreakerReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.internal_static_SingleStartBrickBreakerReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq.class, emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq.Builder.class);
    }

    public static final int IS_DUNGEON_FIELD_NUMBER = 13;
    private boolean isDungeon_;
    /**
     * <code>bool is_dungeon = 13;</code>
     * @return The isDungeon.
     */
    @java.lang.Override
    public boolean getIsDungeon() {
      return isDungeon_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 8;
    private int levelId_;
    /**
     * <code>uint32 level_id = 8;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int CHOSEN_SKILL_LIST_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList chosenSkillList_;
    /**
     * <code>repeated uint32 chosen_skill_list = 12;</code>
     * @return A list containing the chosenSkillList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getChosenSkillListList() {
      return chosenSkillList_;
    }
    /**
     * <code>repeated uint32 chosen_skill_list = 12;</code>
     * @return The count of chosenSkillList.
     */
    public int getChosenSkillListCount() {
      return chosenSkillList_.size();
    }
    /**
     * <code>repeated uint32 chosen_skill_list = 12;</code>
     * @param index The index of the element to return.
     * @return The chosenSkillList at the given index.
     */
    public int getChosenSkillList(int index) {
      return chosenSkillList_.getInt(index);
    }
    private int chosenSkillListMemoizedSerializedSize = -1;

    public static final int CHOSEN_AVATAR_LIST_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList chosenAvatarList_;
    /**
     * <code>repeated uint32 chosen_avatar_list = 5;</code>
     * @return A list containing the chosenAvatarList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getChosenAvatarListList() {
      return chosenAvatarList_;
    }
    /**
     * <code>repeated uint32 chosen_avatar_list = 5;</code>
     * @return The count of chosenAvatarList.
     */
    public int getChosenAvatarListCount() {
      return chosenAvatarList_.size();
    }
    /**
     * <code>repeated uint32 chosen_avatar_list = 5;</code>
     * @param index The index of the element to return.
     * @return The chosenAvatarList at the given index.
     */
    public int getChosenAvatarList(int index) {
      return chosenAvatarList_.getInt(index);
    }
    private int chosenAvatarListMemoizedSerializedSize = -1;

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
      if (getChosenAvatarListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(chosenAvatarListMemoizedSerializedSize);
      }
      for (int i = 0; i < chosenAvatarList_.size(); i++) {
        output.writeUInt32NoTag(chosenAvatarList_.getInt(i));
      }
      if (levelId_ != 0) {
        output.writeUInt32(8, levelId_);
      }
      if (getChosenSkillListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(chosenSkillListMemoizedSerializedSize);
      }
      for (int i = 0; i < chosenSkillList_.size(); i++) {
        output.writeUInt32NoTag(chosenSkillList_.getInt(i));
      }
      if (isDungeon_ != false) {
        output.writeBool(13, isDungeon_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < chosenAvatarList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(chosenAvatarList_.getInt(i));
        }
        size += dataSize;
        if (!getChosenAvatarListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        chosenAvatarListMemoizedSerializedSize = dataSize;
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, levelId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < chosenSkillList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(chosenSkillList_.getInt(i));
        }
        size += dataSize;
        if (!getChosenSkillListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        chosenSkillListMemoizedSerializedSize = dataSize;
      }
      if (isDungeon_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isDungeon_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq other = (emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq) obj;

      if (getIsDungeon()
          != other.getIsDungeon()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (!getChosenSkillListList()
          .equals(other.getChosenSkillListList())) return false;
      if (!getChosenAvatarListList()
          .equals(other.getChosenAvatarListList())) return false;
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
      hash = (37 * hash) + IS_DUNGEON_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsDungeon());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      if (getChosenSkillListCount() > 0) {
        hash = (37 * hash) + CHOSEN_SKILL_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getChosenSkillListList().hashCode();
      }
      if (getChosenAvatarListCount() > 0) {
        hash = (37 * hash) + CHOSEN_AVATAR_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getChosenAvatarListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq prototype) {
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
     *   CMD_ID = 23663;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SingleStartBrickBreakerReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SingleStartBrickBreakerReq)
        emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.internal_static_SingleStartBrickBreakerReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.internal_static_SingleStartBrickBreakerReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq.class, emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isDungeon_ = false;

        levelId_ = 0;

        chosenSkillList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        chosenAvatarList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.internal_static_SingleStartBrickBreakerReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq build() {
        emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq buildPartial() {
        emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq result = new emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq(this);
        int from_bitField0_ = bitField0_;
        result.isDungeon_ = isDungeon_;
        result.levelId_ = levelId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          chosenSkillList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.chosenSkillList_ = chosenSkillList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          chosenAvatarList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.chosenAvatarList_ = chosenAvatarList_;
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
        if (other instanceof emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq) {
          return mergeFrom((emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq other) {
        if (other == emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq.getDefaultInstance()) return this;
        if (other.getIsDungeon() != false) {
          setIsDungeon(other.getIsDungeon());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (!other.chosenSkillList_.isEmpty()) {
          if (chosenSkillList_.isEmpty()) {
            chosenSkillList_ = other.chosenSkillList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureChosenSkillListIsMutable();
            chosenSkillList_.addAll(other.chosenSkillList_);
          }
          onChanged();
        }
        if (!other.chosenAvatarList_.isEmpty()) {
          if (chosenAvatarList_.isEmpty()) {
            chosenAvatarList_ = other.chosenAvatarList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureChosenAvatarListIsMutable();
            chosenAvatarList_.addAll(other.chosenAvatarList_);
          }
          onChanged();
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
              case 40: {
                int v = input.readUInt32();
                ensureChosenAvatarListIsMutable();
                chosenAvatarList_.addInt(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureChosenAvatarListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  chosenAvatarList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 42
              case 64: {
                levelId_ = input.readUInt32();

                break;
              } // case 64
              case 96: {
                int v = input.readUInt32();
                ensureChosenSkillListIsMutable();
                chosenSkillList_.addInt(v);
                break;
              } // case 96
              case 98: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureChosenSkillListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  chosenSkillList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 98
              case 104: {
                isDungeon_ = input.readBool();

                break;
              } // case 104
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

      private boolean isDungeon_ ;
      /**
       * <code>bool is_dungeon = 13;</code>
       * @return The isDungeon.
       */
      @java.lang.Override
      public boolean getIsDungeon() {
        return isDungeon_;
      }
      /**
       * <code>bool is_dungeon = 13;</code>
       * @param value The isDungeon to set.
       * @return This builder for chaining.
       */
      public Builder setIsDungeon(boolean value) {
        
        isDungeon_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_dungeon = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsDungeon() {
        
        isDungeon_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 8;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 8;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList chosenSkillList_ = emptyIntList();
      private void ensureChosenSkillListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          chosenSkillList_ = mutableCopy(chosenSkillList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 chosen_skill_list = 12;</code>
       * @return A list containing the chosenSkillList.
       */
      public java.util.List<java.lang.Integer>
          getChosenSkillListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(chosenSkillList_) : chosenSkillList_;
      }
      /**
       * <code>repeated uint32 chosen_skill_list = 12;</code>
       * @return The count of chosenSkillList.
       */
      public int getChosenSkillListCount() {
        return chosenSkillList_.size();
      }
      /**
       * <code>repeated uint32 chosen_skill_list = 12;</code>
       * @param index The index of the element to return.
       * @return The chosenSkillList at the given index.
       */
      public int getChosenSkillList(int index) {
        return chosenSkillList_.getInt(index);
      }
      /**
       * <code>repeated uint32 chosen_skill_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The chosenSkillList to set.
       * @return This builder for chaining.
       */
      public Builder setChosenSkillList(
          int index, int value) {
        ensureChosenSkillListIsMutable();
        chosenSkillList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 chosen_skill_list = 12;</code>
       * @param value The chosenSkillList to add.
       * @return This builder for chaining.
       */
      public Builder addChosenSkillList(int value) {
        ensureChosenSkillListIsMutable();
        chosenSkillList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 chosen_skill_list = 12;</code>
       * @param values The chosenSkillList to add.
       * @return This builder for chaining.
       */
      public Builder addAllChosenSkillList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureChosenSkillListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, chosenSkillList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 chosen_skill_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearChosenSkillList() {
        chosenSkillList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList chosenAvatarList_ = emptyIntList();
      private void ensureChosenAvatarListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          chosenAvatarList_ = mutableCopy(chosenAvatarList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 chosen_avatar_list = 5;</code>
       * @return A list containing the chosenAvatarList.
       */
      public java.util.List<java.lang.Integer>
          getChosenAvatarListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(chosenAvatarList_) : chosenAvatarList_;
      }
      /**
       * <code>repeated uint32 chosen_avatar_list = 5;</code>
       * @return The count of chosenAvatarList.
       */
      public int getChosenAvatarListCount() {
        return chosenAvatarList_.size();
      }
      /**
       * <code>repeated uint32 chosen_avatar_list = 5;</code>
       * @param index The index of the element to return.
       * @return The chosenAvatarList at the given index.
       */
      public int getChosenAvatarList(int index) {
        return chosenAvatarList_.getInt(index);
      }
      /**
       * <code>repeated uint32 chosen_avatar_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The chosenAvatarList to set.
       * @return This builder for chaining.
       */
      public Builder setChosenAvatarList(
          int index, int value) {
        ensureChosenAvatarListIsMutable();
        chosenAvatarList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 chosen_avatar_list = 5;</code>
       * @param value The chosenAvatarList to add.
       * @return This builder for chaining.
       */
      public Builder addChosenAvatarList(int value) {
        ensureChosenAvatarListIsMutable();
        chosenAvatarList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 chosen_avatar_list = 5;</code>
       * @param values The chosenAvatarList to add.
       * @return This builder for chaining.
       */
      public Builder addAllChosenAvatarList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureChosenAvatarListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, chosenAvatarList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 chosen_avatar_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearChosenAvatarList() {
        chosenAvatarList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:SingleStartBrickBreakerReq)
    }

    // @@protoc_insertion_point(class_scope:SingleStartBrickBreakerReq)
    private static final emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq();
    }

    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SingleStartBrickBreakerReq>
        PARSER = new com.google.protobuf.AbstractParser<SingleStartBrickBreakerReq>() {
      @java.lang.Override
      public SingleStartBrickBreakerReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SingleStartBrickBreakerReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SingleStartBrickBreakerReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SingleStartBrickBreakerReqOuterClass.SingleStartBrickBreakerReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SingleStartBrickBreakerReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SingleStartBrickBreakerReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n SingleStartBrickBreakerReq.proto\"y\n\032Si" +
      "ngleStartBrickBreakerReq\022\022\n\nis_dungeon\030\r" +
      " \001(\010\022\020\n\010level_id\030\010 \001(\r\022\031\n\021chosen_skill_l" +
      "ist\030\014 \003(\r\022\032\n\022chosen_avatar_list\030\005 \003(\rB\036\n" +
      "\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SingleStartBrickBreakerReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SingleStartBrickBreakerReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SingleStartBrickBreakerReq_descriptor,
        new java.lang.String[] { "IsDungeon", "LevelId", "ChosenSkillList", "ChosenAvatarList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
