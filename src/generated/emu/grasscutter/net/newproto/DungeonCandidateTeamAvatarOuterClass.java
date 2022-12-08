// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamAvatar.proto

package emu.grasscutter.net.newproto;

public final class DungeonCandidateTeamAvatarOuterClass {
  private DungeonCandidateTeamAvatarOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonCandidateTeamAvatarOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonCandidateTeamAvatar)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AvatarInfo avatar_info = 6;</code>
     * @return Whether the avatarInfo field is set.
     */
    boolean hasAvatarInfo();
    /**
     * <code>.AvatarInfo avatar_info = 6;</code>
     * @return The avatarInfo.
     */
    emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo getAvatarInfo();
    /**
     * <code>.AvatarInfo avatar_info = 6;</code>
     */
    emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarInfoOrBuilder();

    /**
     * <code>uint32 player_uid = 7;</code>
     * @return The playerUid.
     */
    int getPlayerUid();
  }
  /**
   * Protobuf type {@code DungeonCandidateTeamAvatar}
   */
  public static final class DungeonCandidateTeamAvatar extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonCandidateTeamAvatar)
      DungeonCandidateTeamAvatarOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonCandidateTeamAvatar.newBuilder() to construct.
    private DungeonCandidateTeamAvatar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonCandidateTeamAvatar() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonCandidateTeamAvatar();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.internal_static_DungeonCandidateTeamAvatar_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.internal_static_DungeonCandidateTeamAvatar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar.class, emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar.Builder.class);
    }

    public static final int AVATAR_INFO_FIELD_NUMBER = 6;
    private emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo avatarInfo_;
    /**
     * <code>.AvatarInfo avatar_info = 6;</code>
     * @return Whether the avatarInfo field is set.
     */
    @java.lang.Override
    public boolean hasAvatarInfo() {
      return avatarInfo_ != null;
    }
    /**
     * <code>.AvatarInfo avatar_info = 6;</code>
     * @return The avatarInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo getAvatarInfo() {
      return avatarInfo_ == null ? emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatarInfo_;
    }
    /**
     * <code>.AvatarInfo avatar_info = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarInfoOrBuilder() {
      return getAvatarInfo();
    }

    public static final int PLAYER_UID_FIELD_NUMBER = 7;
    private int playerUid_;
    /**
     * <code>uint32 player_uid = 7;</code>
     * @return The playerUid.
     */
    @java.lang.Override
    public int getPlayerUid() {
      return playerUid_;
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
      if (avatarInfo_ != null) {
        output.writeMessage(6, getAvatarInfo());
      }
      if (playerUid_ != 0) {
        output.writeUInt32(7, playerUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getAvatarInfo());
      }
      if (playerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, playerUid_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar other = (emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar) obj;

      if (hasAvatarInfo() != other.hasAvatarInfo()) return false;
      if (hasAvatarInfo()) {
        if (!getAvatarInfo()
            .equals(other.getAvatarInfo())) return false;
      }
      if (getPlayerUid()
          != other.getPlayerUid()) return false;
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
      if (hasAvatarInfo()) {
        hash = (37 * hash) + AVATAR_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarInfo().hashCode();
      }
      hash = (37 * hash) + PLAYER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar prototype) {
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
     * Protobuf type {@code DungeonCandidateTeamAvatar}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonCandidateTeamAvatar)
        emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatarOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.internal_static_DungeonCandidateTeamAvatar_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.internal_static_DungeonCandidateTeamAvatar_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar.class, emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (avatarInfoBuilder_ == null) {
          avatarInfo_ = null;
        } else {
          avatarInfo_ = null;
          avatarInfoBuilder_ = null;
        }
        playerUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.internal_static_DungeonCandidateTeamAvatar_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar build() {
        emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar buildPartial() {
        emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar result = new emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar(this);
        if (avatarInfoBuilder_ == null) {
          result.avatarInfo_ = avatarInfo_;
        } else {
          result.avatarInfo_ = avatarInfoBuilder_.build();
        }
        result.playerUid_ = playerUid_;
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
        if (other instanceof emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar) {
          return mergeFrom((emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar other) {
        if (other == emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar.getDefaultInstance()) return this;
        if (other.hasAvatarInfo()) {
          mergeAvatarInfo(other.getAvatarInfo());
        }
        if (other.getPlayerUid() != 0) {
          setPlayerUid(other.getPlayerUid());
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
              case 50: {
                input.readMessage(
                    getAvatarInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 50
              case 56: {
                playerUid_ = input.readUInt32();

                break;
              } // case 56
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

      private emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo avatarInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfoOrBuilder> avatarInfoBuilder_;
      /**
       * <code>.AvatarInfo avatar_info = 6;</code>
       * @return Whether the avatarInfo field is set.
       */
      public boolean hasAvatarInfo() {
        return avatarInfoBuilder_ != null || avatarInfo_ != null;
      }
      /**
       * <code>.AvatarInfo avatar_info = 6;</code>
       * @return The avatarInfo.
       */
      public emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo getAvatarInfo() {
        if (avatarInfoBuilder_ == null) {
          return avatarInfo_ == null ? emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatarInfo_;
        } else {
          return avatarInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.AvatarInfo avatar_info = 6;</code>
       */
      public Builder setAvatarInfo(emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo value) {
        if (avatarInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          avatarInfo_ = value;
          onChanged();
        } else {
          avatarInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar_info = 6;</code>
       */
      public Builder setAvatarInfo(
          emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo.Builder builderForValue) {
        if (avatarInfoBuilder_ == null) {
          avatarInfo_ = builderForValue.build();
          onChanged();
        } else {
          avatarInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar_info = 6;</code>
       */
      public Builder mergeAvatarInfo(emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo value) {
        if (avatarInfoBuilder_ == null) {
          if (avatarInfo_ != null) {
            avatarInfo_ =
              emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo.newBuilder(avatarInfo_).mergeFrom(value).buildPartial();
          } else {
            avatarInfo_ = value;
          }
          onChanged();
        } else {
          avatarInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar_info = 6;</code>
       */
      public Builder clearAvatarInfo() {
        if (avatarInfoBuilder_ == null) {
          avatarInfo_ = null;
          onChanged();
        } else {
          avatarInfo_ = null;
          avatarInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar_info = 6;</code>
       */
      public emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo.Builder getAvatarInfoBuilder() {
        
        onChanged();
        return getAvatarInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.AvatarInfo avatar_info = 6;</code>
       */
      public emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarInfoOrBuilder() {
        if (avatarInfoBuilder_ != null) {
          return avatarInfoBuilder_.getMessageOrBuilder();
        } else {
          return avatarInfo_ == null ?
              emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatarInfo_;
        }
      }
      /**
       * <code>.AvatarInfo avatar_info = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfoOrBuilder> 
          getAvatarInfoFieldBuilder() {
        if (avatarInfoBuilder_ == null) {
          avatarInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.newproto.AvatarInfoOuterClass.AvatarInfoOrBuilder>(
                  getAvatarInfo(),
                  getParentForChildren(),
                  isClean());
          avatarInfo_ = null;
        }
        return avatarInfoBuilder_;
      }

      private int playerUid_ ;
      /**
       * <code>uint32 player_uid = 7;</code>
       * @return The playerUid.
       */
      @java.lang.Override
      public int getPlayerUid() {
        return playerUid_;
      }
      /**
       * <code>uint32 player_uid = 7;</code>
       * @param value The playerUid to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerUid(int value) {
        
        playerUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 player_uid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerUid() {
        
        playerUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonCandidateTeamAvatar)
    }

    // @@protoc_insertion_point(class_scope:DungeonCandidateTeamAvatar)
    private static final emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar();
    }

    public static emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonCandidateTeamAvatar>
        PARSER = new com.google.protobuf.AbstractParser<DungeonCandidateTeamAvatar>() {
      @java.lang.Override
      public DungeonCandidateTeamAvatar parsePartialFrom(
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

    public static com.google.protobuf.Parser<DungeonCandidateTeamAvatar> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonCandidateTeamAvatar> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.DungeonCandidateTeamAvatarOuterClass.DungeonCandidateTeamAvatar getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonCandidateTeamAvatar_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonCandidateTeamAvatar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n DungeonCandidateTeamAvatar.proto\032\020Avat" +
      "arInfo.proto\"R\n\032DungeonCandidateTeamAvat" +
      "ar\022 \n\013avatar_info\030\006 \001(\0132\013.AvatarInfo\022\022\n\n" +
      "player_uid\030\007 \001(\rB\036\n\034emu.grasscutter.net." +
      "newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.AvatarInfoOuterClass.getDescriptor(),
        });
    internal_static_DungeonCandidateTeamAvatar_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonCandidateTeamAvatar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonCandidateTeamAvatar_descriptor,
        new java.lang.String[] { "AvatarInfo", "PlayerUid", });
    emu.grasscutter.net.newproto.AvatarInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}