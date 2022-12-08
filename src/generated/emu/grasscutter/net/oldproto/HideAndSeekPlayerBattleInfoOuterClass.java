// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HideAndSeekPlayerBattleInfo.proto

package emu.grasscutter.net.oldproto;

public final class HideAndSeekPlayerBattleInfoOuterClass {
  private HideAndSeekPlayerBattleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HideAndSeekPlayerBattleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HideAndSeekPlayerBattleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 costume_id = 3;</code>
     * @return The costumeId.
     */
    int getCostumeId();

    /**
     * <code>repeated uint32 skill_list = 15;</code>
     * @return A list containing the skillList.
     */
    java.util.List<java.lang.Integer> getSkillListList();
    /**
     * <code>repeated uint32 skill_list = 15;</code>
     * @return The count of skillList.
     */
    int getSkillListCount();
    /**
     * <code>repeated uint32 skill_list = 15;</code>
     * @param index The index of the element to return.
     * @return The skillList at the given index.
     */
    int getSkillList(int index);

    /**
     * <code>bool is_ready = 12;</code>
     * @return The isReady.
     */
    boolean getIsReady();

    /**
     * <code>uint32 avatar_id = 6;</code>
     * @return The avatarId.
     */
    int getAvatarId();
  }
  /**
   * Protobuf type {@code HideAndSeekPlayerBattleInfo}
   */
  public static final class HideAndSeekPlayerBattleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HideAndSeekPlayerBattleInfo)
      HideAndSeekPlayerBattleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HideAndSeekPlayerBattleInfo.newBuilder() to construct.
    private HideAndSeekPlayerBattleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HideAndSeekPlayerBattleInfo() {
      skillList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HideAndSeekPlayerBattleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.internal_static_HideAndSeekPlayerBattleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.internal_static_HideAndSeekPlayerBattleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo.class, emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo.Builder.class);
    }

    public static final int COSTUME_ID_FIELD_NUMBER = 3;
    private int costumeId_;
    /**
     * <code>uint32 costume_id = 3;</code>
     * @return The costumeId.
     */
    @java.lang.Override
    public int getCostumeId() {
      return costumeId_;
    }

    public static final int SKILL_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList skillList_;
    /**
     * <code>repeated uint32 skill_list = 15;</code>
     * @return A list containing the skillList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSkillListList() {
      return skillList_;
    }
    /**
     * <code>repeated uint32 skill_list = 15;</code>
     * @return The count of skillList.
     */
    public int getSkillListCount() {
      return skillList_.size();
    }
    /**
     * <code>repeated uint32 skill_list = 15;</code>
     * @param index The index of the element to return.
     * @return The skillList at the given index.
     */
    public int getSkillList(int index) {
      return skillList_.getInt(index);
    }
    private int skillListMemoizedSerializedSize = -1;

    public static final int IS_READY_FIELD_NUMBER = 12;
    private boolean isReady_;
    /**
     * <code>bool is_ready = 12;</code>
     * @return The isReady.
     */
    @java.lang.Override
    public boolean getIsReady() {
      return isReady_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 6;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 6;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
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
      if (costumeId_ != 0) {
        output.writeUInt32(3, costumeId_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(6, avatarId_);
      }
      if (isReady_ != false) {
        output.writeBool(12, isReady_);
      }
      if (getSkillListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(skillListMemoizedSerializedSize);
      }
      for (int i = 0; i < skillList_.size(); i++) {
        output.writeUInt32NoTag(skillList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (costumeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, costumeId_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, avatarId_);
      }
      if (isReady_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isReady_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < skillList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(skillList_.getInt(i));
        }
        size += dataSize;
        if (!getSkillListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        skillListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo other = (emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo) obj;

      if (getCostumeId()
          != other.getCostumeId()) return false;
      if (!getSkillListList()
          .equals(other.getSkillListList())) return false;
      if (getIsReady()
          != other.getIsReady()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
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
      hash = (37 * hash) + COSTUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCostumeId();
      if (getSkillListCount() > 0) {
        hash = (37 * hash) + SKILL_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSkillListList().hashCode();
      }
      hash = (37 * hash) + IS_READY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsReady());
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo prototype) {
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
     * Protobuf type {@code HideAndSeekPlayerBattleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HideAndSeekPlayerBattleInfo)
        emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.internal_static_HideAndSeekPlayerBattleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.internal_static_HideAndSeekPlayerBattleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo.class, emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        costumeId_ = 0;

        skillList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        isReady_ = false;

        avatarId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.internal_static_HideAndSeekPlayerBattleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo build() {
        emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo buildPartial() {
        emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo result = new emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo(this);
        int from_bitField0_ = bitField0_;
        result.costumeId_ = costumeId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          skillList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.skillList_ = skillList_;
        result.isReady_ = isReady_;
        result.avatarId_ = avatarId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo other) {
        if (other == emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo.getDefaultInstance()) return this;
        if (other.getCostumeId() != 0) {
          setCostumeId(other.getCostumeId());
        }
        if (!other.skillList_.isEmpty()) {
          if (skillList_.isEmpty()) {
            skillList_ = other.skillList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSkillListIsMutable();
            skillList_.addAll(other.skillList_);
          }
          onChanged();
        }
        if (other.getIsReady() != false) {
          setIsReady(other.getIsReady());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
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
              case 24: {
                costumeId_ = input.readUInt32();

                break;
              } // case 24
              case 48: {
                avatarId_ = input.readUInt32();

                break;
              } // case 48
              case 96: {
                isReady_ = input.readBool();

                break;
              } // case 96
              case 120: {
                int v = input.readUInt32();
                ensureSkillListIsMutable();
                skillList_.addInt(v);
                break;
              } // case 120
              case 122: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureSkillListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  skillList_.addInt(input.readUInt32());
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

      private int costumeId_ ;
      /**
       * <code>uint32 costume_id = 3;</code>
       * @return The costumeId.
       */
      @java.lang.Override
      public int getCostumeId() {
        return costumeId_;
      }
      /**
       * <code>uint32 costume_id = 3;</code>
       * @param value The costumeId to set.
       * @return This builder for chaining.
       */
      public Builder setCostumeId(int value) {
        
        costumeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 costume_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostumeId() {
        
        costumeId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList skillList_ = emptyIntList();
      private void ensureSkillListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          skillList_ = mutableCopy(skillList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 skill_list = 15;</code>
       * @return A list containing the skillList.
       */
      public java.util.List<java.lang.Integer>
          getSkillListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(skillList_) : skillList_;
      }
      /**
       * <code>repeated uint32 skill_list = 15;</code>
       * @return The count of skillList.
       */
      public int getSkillListCount() {
        return skillList_.size();
      }
      /**
       * <code>repeated uint32 skill_list = 15;</code>
       * @param index The index of the element to return.
       * @return The skillList at the given index.
       */
      public int getSkillList(int index) {
        return skillList_.getInt(index);
      }
      /**
       * <code>repeated uint32 skill_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The skillList to set.
       * @return This builder for chaining.
       */
      public Builder setSkillList(
          int index, int value) {
        ensureSkillListIsMutable();
        skillList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_list = 15;</code>
       * @param value The skillList to add.
       * @return This builder for chaining.
       */
      public Builder addSkillList(int value) {
        ensureSkillListIsMutable();
        skillList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_list = 15;</code>
       * @param values The skillList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSkillList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSkillListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skillList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillList() {
        skillList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isReady_ ;
      /**
       * <code>bool is_ready = 12;</code>
       * @return The isReady.
       */
      @java.lang.Override
      public boolean getIsReady() {
        return isReady_;
      }
      /**
       * <code>bool is_ready = 12;</code>
       * @param value The isReady to set.
       * @return This builder for chaining.
       */
      public Builder setIsReady(boolean value) {
        
        isReady_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_ready = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsReady() {
        
        isReady_ = false;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 6;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 6;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HideAndSeekPlayerBattleInfo)
    }

    // @@protoc_insertion_point(class_scope:HideAndSeekPlayerBattleInfo)
    private static final emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo();
    }

    public static emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HideAndSeekPlayerBattleInfo>
        PARSER = new com.google.protobuf.AbstractParser<HideAndSeekPlayerBattleInfo>() {
      @java.lang.Override
      public HideAndSeekPlayerBattleInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<HideAndSeekPlayerBattleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HideAndSeekPlayerBattleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HideAndSeekPlayerBattleInfoOuterClass.HideAndSeekPlayerBattleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HideAndSeekPlayerBattleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HideAndSeekPlayerBattleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!HideAndSeekPlayerBattleInfo.proto\"j\n\033H" +
      "ideAndSeekPlayerBattleInfo\022\022\n\ncostume_id" +
      "\030\003 \001(\r\022\022\n\nskill_list\030\017 \003(\r\022\020\n\010is_ready\030\014" +
      " \001(\010\022\021\n\tavatar_id\030\006 \001(\rB\036\n\034emu.grasscutt" +
      "er.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HideAndSeekPlayerBattleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HideAndSeekPlayerBattleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HideAndSeekPlayerBattleInfo_descriptor,
        new java.lang.String[] { "CostumeId", "SkillList", "IsReady", "AvatarId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
