// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamInviteRsp.proto

package emu.grasscutter.net.newproto;

public final class DungeonCandidateTeamInviteRspOuterClass {
  private DungeonCandidateTeamInviteRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonCandidateTeamInviteRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonCandidateTeamInviteRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 invalid_player_uids = 11;</code>
     * @return A list containing the invalidPlayerUids.
     */
    java.util.List<java.lang.Integer> getInvalidPlayerUidsList();
    /**
     * <code>repeated uint32 invalid_player_uids = 11;</code>
     * @return The count of invalidPlayerUids.
     */
    int getInvalidPlayerUidsCount();
    /**
     * <code>repeated uint32 invalid_player_uids = 11;</code>
     * @param index The index of the element to return.
     * @return The invalidPlayerUids at the given index.
     */
    int getInvalidPlayerUids(int index);

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 946;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code DungeonCandidateTeamInviteRsp}
   */
  public static final class DungeonCandidateTeamInviteRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonCandidateTeamInviteRsp)
      DungeonCandidateTeamInviteRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonCandidateTeamInviteRsp.newBuilder() to construct.
    private DungeonCandidateTeamInviteRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonCandidateTeamInviteRsp() {
      invalidPlayerUids_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonCandidateTeamInviteRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.internal_static_DungeonCandidateTeamInviteRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.internal_static_DungeonCandidateTeamInviteRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp.class, emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp.Builder.class);
    }

    public static final int INVALID_PLAYER_UIDS_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList invalidPlayerUids_;
    /**
     * <code>repeated uint32 invalid_player_uids = 11;</code>
     * @return A list containing the invalidPlayerUids.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getInvalidPlayerUidsList() {
      return invalidPlayerUids_;
    }
    /**
     * <code>repeated uint32 invalid_player_uids = 11;</code>
     * @return The count of invalidPlayerUids.
     */
    public int getInvalidPlayerUidsCount() {
      return invalidPlayerUids_.size();
    }
    /**
     * <code>repeated uint32 invalid_player_uids = 11;</code>
     * @param index The index of the element to return.
     * @return The invalidPlayerUids at the given index.
     */
    public int getInvalidPlayerUids(int index) {
      return invalidPlayerUids_.getInt(index);
    }
    private int invalidPlayerUidsMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      if (getInvalidPlayerUidsList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(invalidPlayerUidsMemoizedSerializedSize);
      }
      for (int i = 0; i < invalidPlayerUids_.size(); i++) {
        output.writeUInt32NoTag(invalidPlayerUids_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < invalidPlayerUids_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(invalidPlayerUids_.getInt(i));
        }
        size += dataSize;
        if (!getInvalidPlayerUidsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        invalidPlayerUidsMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp other = (emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp) obj;

      if (!getInvalidPlayerUidsList()
          .equals(other.getInvalidPlayerUidsList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getInvalidPlayerUidsCount() > 0) {
        hash = (37 * hash) + INVALID_PLAYER_UIDS_FIELD_NUMBER;
        hash = (53 * hash) + getInvalidPlayerUidsList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp prototype) {
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
     *   CMD_ID = 946;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code DungeonCandidateTeamInviteRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonCandidateTeamInviteRsp)
        emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.internal_static_DungeonCandidateTeamInviteRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.internal_static_DungeonCandidateTeamInviteRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp.class, emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        invalidPlayerUids_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.internal_static_DungeonCandidateTeamInviteRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp build() {
        emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp buildPartial() {
        emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp result = new emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          invalidPlayerUids_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.invalidPlayerUids_ = invalidPlayerUids_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp other) {
        if (other == emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp.getDefaultInstance()) return this;
        if (!other.invalidPlayerUids_.isEmpty()) {
          if (invalidPlayerUids_.isEmpty()) {
            invalidPlayerUids_ = other.invalidPlayerUids_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInvalidPlayerUidsIsMutable();
            invalidPlayerUids_.addAll(other.invalidPlayerUids_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
                retcode_ = input.readInt32();

                break;
              } // case 32
              case 88: {
                int v = input.readUInt32();
                ensureInvalidPlayerUidsIsMutable();
                invalidPlayerUids_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureInvalidPlayerUidsIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  invalidPlayerUids_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 90
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

      private com.google.protobuf.Internal.IntList invalidPlayerUids_ = emptyIntList();
      private void ensureInvalidPlayerUidsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          invalidPlayerUids_ = mutableCopy(invalidPlayerUids_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 invalid_player_uids = 11;</code>
       * @return A list containing the invalidPlayerUids.
       */
      public java.util.List<java.lang.Integer>
          getInvalidPlayerUidsList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(invalidPlayerUids_) : invalidPlayerUids_;
      }
      /**
       * <code>repeated uint32 invalid_player_uids = 11;</code>
       * @return The count of invalidPlayerUids.
       */
      public int getInvalidPlayerUidsCount() {
        return invalidPlayerUids_.size();
      }
      /**
       * <code>repeated uint32 invalid_player_uids = 11;</code>
       * @param index The index of the element to return.
       * @return The invalidPlayerUids at the given index.
       */
      public int getInvalidPlayerUids(int index) {
        return invalidPlayerUids_.getInt(index);
      }
      /**
       * <code>repeated uint32 invalid_player_uids = 11;</code>
       * @param index The index to set the value at.
       * @param value The invalidPlayerUids to set.
       * @return This builder for chaining.
       */
      public Builder setInvalidPlayerUids(
          int index, int value) {
        ensureInvalidPlayerUidsIsMutable();
        invalidPlayerUids_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 invalid_player_uids = 11;</code>
       * @param value The invalidPlayerUids to add.
       * @return This builder for chaining.
       */
      public Builder addInvalidPlayerUids(int value) {
        ensureInvalidPlayerUidsIsMutable();
        invalidPlayerUids_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 invalid_player_uids = 11;</code>
       * @param values The invalidPlayerUids to add.
       * @return This builder for chaining.
       */
      public Builder addAllInvalidPlayerUids(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureInvalidPlayerUidsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, invalidPlayerUids_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 invalid_player_uids = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearInvalidPlayerUids() {
        invalidPlayerUids_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonCandidateTeamInviteRsp)
    }

    // @@protoc_insertion_point(class_scope:DungeonCandidateTeamInviteRsp)
    private static final emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp();
    }

    public static emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonCandidateTeamInviteRsp>
        PARSER = new com.google.protobuf.AbstractParser<DungeonCandidateTeamInviteRsp>() {
      @java.lang.Override
      public DungeonCandidateTeamInviteRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<DungeonCandidateTeamInviteRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonCandidateTeamInviteRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.DungeonCandidateTeamInviteRspOuterClass.DungeonCandidateTeamInviteRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonCandidateTeamInviteRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonCandidateTeamInviteRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#DungeonCandidateTeamInviteRsp.proto\"M\n" +
      "\035DungeonCandidateTeamInviteRsp\022\033\n\023invali" +
      "d_player_uids\030\013 \003(\r\022\017\n\007retcode\030\004 \001(\005B\036\n\034" +
      "emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonCandidateTeamInviteRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonCandidateTeamInviteRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonCandidateTeamInviteRsp_descriptor,
        new java.lang.String[] { "InvalidPlayerUids", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
