// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForceAddPlayerFriendRsp.proto

package emu.grasscutter.net.oldproto;

public final class ForceAddPlayerFriendRspOuterClass {
  private ForceAddPlayerFriendRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ForceAddPlayerFriendRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ForceAddPlayerFriendRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.FriendBrief target_friend_brief = 2;</code>
     * @return Whether the targetFriendBrief field is set.
     */
    boolean hasTargetFriendBrief();
    /**
     * <code>.FriendBrief target_friend_brief = 2;</code>
     * @return The targetFriendBrief.
     */
    emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief getTargetFriendBrief();
    /**
     * <code>.FriendBrief target_friend_brief = 2;</code>
     */
    emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBriefOrBuilder getTargetFriendBriefOrBuilder();

    /**
     * <code>uint32 target_uid = 9;</code>
     * @return The targetUid.
     */
    int getTargetUid();
  }
  /**
   * <pre>
   * CmdId: 4100
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code ForceAddPlayerFriendRsp}
   */
  public static final class ForceAddPlayerFriendRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ForceAddPlayerFriendRsp)
      ForceAddPlayerFriendRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ForceAddPlayerFriendRsp.newBuilder() to construct.
    private ForceAddPlayerFriendRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ForceAddPlayerFriendRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ForceAddPlayerFriendRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.internal_static_ForceAddPlayerFriendRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.internal_static_ForceAddPlayerFriendRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.class, emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int TARGET_FRIEND_BRIEF_FIELD_NUMBER = 2;
    private emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief targetFriendBrief_;
    /**
     * <code>.FriendBrief target_friend_brief = 2;</code>
     * @return Whether the targetFriendBrief field is set.
     */
    @java.lang.Override
    public boolean hasTargetFriendBrief() {
      return targetFriendBrief_ != null;
    }
    /**
     * <code>.FriendBrief target_friend_brief = 2;</code>
     * @return The targetFriendBrief.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief getTargetFriendBrief() {
      return targetFriendBrief_ == null ? emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief.getDefaultInstance() : targetFriendBrief_;
    }
    /**
     * <code>.FriendBrief target_friend_brief = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBriefOrBuilder getTargetFriendBriefOrBuilder() {
      return getTargetFriendBrief();
    }

    public static final int TARGET_UID_FIELD_NUMBER = 9;
    private int targetUid_;
    /**
     * <code>uint32 target_uid = 9;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
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
      if (targetFriendBrief_ != null) {
        output.writeMessage(2, getTargetFriendBrief());
      }
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(9, targetUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetFriendBrief_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getTargetFriendBrief());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, targetUid_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp other = (emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasTargetFriendBrief() != other.hasTargetFriendBrief()) return false;
      if (hasTargetFriendBrief()) {
        if (!getTargetFriendBrief()
            .equals(other.getTargetFriendBrief())) return false;
      }
      if (getTargetUid()
          != other.getTargetUid()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasTargetFriendBrief()) {
        hash = (37 * hash) + TARGET_FRIEND_BRIEF_FIELD_NUMBER;
        hash = (53 * hash) + getTargetFriendBrief().hashCode();
      }
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp prototype) {
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
     * CmdId: 4100
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code ForceAddPlayerFriendRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ForceAddPlayerFriendRsp)
        emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.internal_static_ForceAddPlayerFriendRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.internal_static_ForceAddPlayerFriendRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.class, emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (targetFriendBriefBuilder_ == null) {
          targetFriendBrief_ = null;
        } else {
          targetFriendBrief_ = null;
          targetFriendBriefBuilder_ = null;
        }
        targetUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.internal_static_ForceAddPlayerFriendRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp build() {
        emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp buildPartial() {
        emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp result = new emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp(this);
        result.retcode_ = retcode_;
        if (targetFriendBriefBuilder_ == null) {
          result.targetFriendBrief_ = targetFriendBrief_;
        } else {
          result.targetFriendBrief_ = targetFriendBriefBuilder_.build();
        }
        result.targetUid_ = targetUid_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp other) {
        if (other == emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasTargetFriendBrief()) {
          mergeTargetFriendBrief(other.getTargetFriendBrief());
        }
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
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
              case 18: {
                input.readMessage(
                    getTargetFriendBriefFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 18
              case 40: {
                retcode_ = input.readInt32();

                break;
              } // case 40
              case 72: {
                targetUid_ = input.readUInt32();

                break;
              } // case 72
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief targetFriendBrief_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBriefOrBuilder> targetFriendBriefBuilder_;
      /**
       * <code>.FriendBrief target_friend_brief = 2;</code>
       * @return Whether the targetFriendBrief field is set.
       */
      public boolean hasTargetFriendBrief() {
        return targetFriendBriefBuilder_ != null || targetFriendBrief_ != null;
      }
      /**
       * <code>.FriendBrief target_friend_brief = 2;</code>
       * @return The targetFriendBrief.
       */
      public emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief getTargetFriendBrief() {
        if (targetFriendBriefBuilder_ == null) {
          return targetFriendBrief_ == null ? emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief.getDefaultInstance() : targetFriendBrief_;
        } else {
          return targetFriendBriefBuilder_.getMessage();
        }
      }
      /**
       * <code>.FriendBrief target_friend_brief = 2;</code>
       */
      public Builder setTargetFriendBrief(emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief value) {
        if (targetFriendBriefBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetFriendBrief_ = value;
          onChanged();
        } else {
          targetFriendBriefBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.FriendBrief target_friend_brief = 2;</code>
       */
      public Builder setTargetFriendBrief(
          emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (targetFriendBriefBuilder_ == null) {
          targetFriendBrief_ = builderForValue.build();
          onChanged();
        } else {
          targetFriendBriefBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.FriendBrief target_friend_brief = 2;</code>
       */
      public Builder mergeTargetFriendBrief(emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief value) {
        if (targetFriendBriefBuilder_ == null) {
          if (targetFriendBrief_ != null) {
            targetFriendBrief_ =
              emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief.newBuilder(targetFriendBrief_).mergeFrom(value).buildPartial();
          } else {
            targetFriendBrief_ = value;
          }
          onChanged();
        } else {
          targetFriendBriefBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.FriendBrief target_friend_brief = 2;</code>
       */
      public Builder clearTargetFriendBrief() {
        if (targetFriendBriefBuilder_ == null) {
          targetFriendBrief_ = null;
          onChanged();
        } else {
          targetFriendBrief_ = null;
          targetFriendBriefBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.FriendBrief target_friend_brief = 2;</code>
       */
      public emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief.Builder getTargetFriendBriefBuilder() {
        
        onChanged();
        return getTargetFriendBriefFieldBuilder().getBuilder();
      }
      /**
       * <code>.FriendBrief target_friend_brief = 2;</code>
       */
      public emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBriefOrBuilder getTargetFriendBriefOrBuilder() {
        if (targetFriendBriefBuilder_ != null) {
          return targetFriendBriefBuilder_.getMessageOrBuilder();
        } else {
          return targetFriendBrief_ == null ?
              emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief.getDefaultInstance() : targetFriendBrief_;
        }
      }
      /**
       * <code>.FriendBrief target_friend_brief = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBriefOrBuilder> 
          getTargetFriendBriefFieldBuilder() {
        if (targetFriendBriefBuilder_ == null) {
          targetFriendBriefBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.oldproto.FriendBriefOuterClass.FriendBriefOrBuilder>(
                  getTargetFriendBrief(),
                  getParentForChildren(),
                  isClean());
          targetFriendBrief_ = null;
        }
        return targetFriendBriefBuilder_;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 9;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 9;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ForceAddPlayerFriendRsp)
    }

    // @@protoc_insertion_point(class_scope:ForceAddPlayerFriendRsp)
    private static final emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp();
    }

    public static emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ForceAddPlayerFriendRsp>
        PARSER = new com.google.protobuf.AbstractParser<ForceAddPlayerFriendRsp>() {
      @java.lang.Override
      public ForceAddPlayerFriendRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<ForceAddPlayerFriendRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ForceAddPlayerFriendRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ForceAddPlayerFriendRspOuterClass.ForceAddPlayerFriendRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ForceAddPlayerFriendRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ForceAddPlayerFriendRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ForceAddPlayerFriendRsp.proto\032\021FriendB" +
      "rief.proto\"i\n\027ForceAddPlayerFriendRsp\022\017\n" +
      "\007retcode\030\005 \001(\005\022)\n\023target_friend_brief\030\002 " +
      "\001(\0132\014.FriendBrief\022\022\n\ntarget_uid\030\t \001(\rB\036\n" +
      "\034emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.FriendBriefOuterClass.getDescriptor(),
        });
    internal_static_ForceAddPlayerFriendRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ForceAddPlayerFriendRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ForceAddPlayerFriendRsp_descriptor,
        new java.lang.String[] { "Retcode", "TargetFriendBrief", "TargetUid", });
    emu.grasscutter.net.oldproto.FriendBriefOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
