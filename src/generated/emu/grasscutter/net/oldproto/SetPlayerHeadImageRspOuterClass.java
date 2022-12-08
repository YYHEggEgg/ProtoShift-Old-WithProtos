// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetPlayerHeadImageRsp.proto

package emu.grasscutter.net.oldproto;

public final class SetPlayerHeadImageRspOuterClass {
  private SetPlayerHeadImageRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetPlayerHeadImageRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetPlayerHeadImageRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ProfilePicture profile_picture = 6;</code>
     * @return Whether the profilePicture field is set.
     */
    boolean hasProfilePicture();
    /**
     * <code>.ProfilePicture profile_picture = 6;</code>
     * @return The profilePicture.
     */
    emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture getProfilePicture();
    /**
     * <code>.ProfilePicture profile_picture = 6;</code>
     */
    emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder();

    /**
     * <code>uint32 avatar_id = 5;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 4047
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code SetPlayerHeadImageRsp}
   */
  public static final class SetPlayerHeadImageRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetPlayerHeadImageRsp)
      SetPlayerHeadImageRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetPlayerHeadImageRsp.newBuilder() to construct.
    private SetPlayerHeadImageRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetPlayerHeadImageRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetPlayerHeadImageRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.internal_static_SetPlayerHeadImageRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.internal_static_SetPlayerHeadImageRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.class, emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.Builder.class);
    }

    public static final int PROFILE_PICTURE_FIELD_NUMBER = 6;
    private emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture profilePicture_;
    /**
     * <code>.ProfilePicture profile_picture = 6;</code>
     * @return Whether the profilePicture field is set.
     */
    @java.lang.Override
    public boolean hasProfilePicture() {
      return profilePicture_ != null;
    }
    /**
     * <code>.ProfilePicture profile_picture = 6;</code>
     * @return The profilePicture.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture getProfilePicture() {
      return profilePicture_ == null ? emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
    }
    /**
     * <code>.ProfilePicture profile_picture = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
      return getProfilePicture();
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 5;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 5;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
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
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(5, avatarId_);
      }
      if (profilePicture_ != null) {
        output.writeMessage(6, getProfilePicture());
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
          .computeInt32Size(1, retcode_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, avatarId_);
      }
      if (profilePicture_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getProfilePicture());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp other = (emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp) obj;

      if (hasProfilePicture() != other.hasProfilePicture()) return false;
      if (hasProfilePicture()) {
        if (!getProfilePicture()
            .equals(other.getProfilePicture())) return false;
      }
      if (getAvatarId()
          != other.getAvatarId()) return false;
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
      if (hasProfilePicture()) {
        hash = (37 * hash) + PROFILE_PICTURE_FIELD_NUMBER;
        hash = (53 * hash) + getProfilePicture().hashCode();
      }
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp prototype) {
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
     * CmdId: 4047
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code SetPlayerHeadImageRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetPlayerHeadImageRsp)
        emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.internal_static_SetPlayerHeadImageRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.internal_static_SetPlayerHeadImageRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.class, emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (profilePictureBuilder_ == null) {
          profilePicture_ = null;
        } else {
          profilePicture_ = null;
          profilePictureBuilder_ = null;
        }
        avatarId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.internal_static_SetPlayerHeadImageRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp build() {
        emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp buildPartial() {
        emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp result = new emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp(this);
        if (profilePictureBuilder_ == null) {
          result.profilePicture_ = profilePicture_;
        } else {
          result.profilePicture_ = profilePictureBuilder_.build();
        }
        result.avatarId_ = avatarId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp other) {
        if (other == emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.getDefaultInstance()) return this;
        if (other.hasProfilePicture()) {
          mergeProfilePicture(other.getProfilePicture());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
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
              case 8: {
                retcode_ = input.readInt32();

                break;
              } // case 8
              case 40: {
                avatarId_ = input.readUInt32();

                break;
              } // case 40
              case 50: {
                input.readMessage(
                    getProfilePictureFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 50
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

      private emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture profilePicture_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePictureOrBuilder> profilePictureBuilder_;
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>
       * @return Whether the profilePicture field is set.
       */
      public boolean hasProfilePicture() {
        return profilePictureBuilder_ != null || profilePicture_ != null;
      }
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>
       * @return The profilePicture.
       */
      public emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture getProfilePicture() {
        if (profilePictureBuilder_ == null) {
          return profilePicture_ == null ? emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
        } else {
          return profilePictureBuilder_.getMessage();
        }
      }
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>
       */
      public Builder setProfilePicture(emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture value) {
        if (profilePictureBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          profilePicture_ = value;
          onChanged();
        } else {
          profilePictureBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>
       */
      public Builder setProfilePicture(
          emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture.Builder builderForValue) {
        if (profilePictureBuilder_ == null) {
          profilePicture_ = builderForValue.build();
          onChanged();
        } else {
          profilePictureBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>
       */
      public Builder mergeProfilePicture(emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture value) {
        if (profilePictureBuilder_ == null) {
          if (profilePicture_ != null) {
            profilePicture_ =
              emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture.newBuilder(profilePicture_).mergeFrom(value).buildPartial();
          } else {
            profilePicture_ = value;
          }
          onChanged();
        } else {
          profilePictureBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>
       */
      public Builder clearProfilePicture() {
        if (profilePictureBuilder_ == null) {
          profilePicture_ = null;
          onChanged();
        } else {
          profilePicture_ = null;
          profilePictureBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>
       */
      public emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture.Builder getProfilePictureBuilder() {
        
        onChanged();
        return getProfilePictureFieldBuilder().getBuilder();
      }
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>
       */
      public emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
        if (profilePictureBuilder_ != null) {
          return profilePictureBuilder_.getMessageOrBuilder();
        } else {
          return profilePicture_ == null ?
              emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
        }
      }
      /**
       * <code>.ProfilePicture profile_picture = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePictureOrBuilder> 
          getProfilePictureFieldBuilder() {
        if (profilePictureBuilder_ == null) {
          profilePictureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.oldproto.ProfilePictureOuterClass.ProfilePictureOrBuilder>(
                  getProfilePicture(),
                  getParentForChildren(),
                  isClean());
          profilePicture_ = null;
        }
        return profilePictureBuilder_;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
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


      // @@protoc_insertion_point(builder_scope:SetPlayerHeadImageRsp)
    }

    // @@protoc_insertion_point(class_scope:SetPlayerHeadImageRsp)
    private static final emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp();
    }

    public static emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetPlayerHeadImageRsp>
        PARSER = new com.google.protobuf.AbstractParser<SetPlayerHeadImageRsp>() {
      @java.lang.Override
      public SetPlayerHeadImageRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<SetPlayerHeadImageRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetPlayerHeadImageRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetPlayerHeadImageRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetPlayerHeadImageRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SetPlayerHeadImageRsp.proto\032\024ProfilePi" +
      "cture.proto\"e\n\025SetPlayerHeadImageRsp\022(\n\017" +
      "profile_picture\030\006 \001(\0132\017.ProfilePicture\022\021" +
      "\n\tavatar_id\030\005 \001(\r\022\017\n\007retcode\030\001 \001(\005B\036\n\034em" +
      "u.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.ProfilePictureOuterClass.getDescriptor(),
        });
    internal_static_SetPlayerHeadImageRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetPlayerHeadImageRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetPlayerHeadImageRsp_descriptor,
        new java.lang.String[] { "ProfilePicture", "AvatarId", "Retcode", });
    emu.grasscutter.net.oldproto.ProfilePictureOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
