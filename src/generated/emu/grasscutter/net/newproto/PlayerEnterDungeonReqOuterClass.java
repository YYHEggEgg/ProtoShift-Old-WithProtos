// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerEnterDungeonReq.proto

package emu.grasscutter.net.newproto;

public final class PlayerEnterDungeonReqOuterClass {
  private PlayerEnterDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerEnterDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerEnterDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 4;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
     * @return Whether the enterPosInfo field is set.
     */
    boolean hasEnterPosInfo();
    /**
     * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
     * @return The enterPosInfo.
     */
    emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo getEnterPosInfo();
    /**
     * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
     */
    emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfoOrBuilder getEnterPosInfoOrBuilder();

    /**
     * <code>uint32 point_id = 1;</code>
     * @return The pointId.
     */
    int getPointId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 956;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerEnterDungeonReq}
   */
  public static final class PlayerEnterDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerEnterDungeonReq)
      PlayerEnterDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerEnterDungeonReq.newBuilder() to construct.
    private PlayerEnterDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerEnterDungeonReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerEnterDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.class, emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 4;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 4;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int ENTER_POS_INFO_FIELD_NUMBER = 9;
    private emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo enterPosInfo_;
    /**
     * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
     * @return Whether the enterPosInfo field is set.
     */
    @java.lang.Override
    public boolean hasEnterPosInfo() {
      return enterPosInfo_ != null;
    }
    /**
     * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
     * @return The enterPosInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo getEnterPosInfo() {
      return enterPosInfo_ == null ? emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.getDefaultInstance() : enterPosInfo_;
    }
    /**
     * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfoOrBuilder getEnterPosInfoOrBuilder() {
      return getEnterPosInfo();
    }

    public static final int POINT_ID_FIELD_NUMBER = 1;
    private int pointId_;
    /**
     * <code>uint32 point_id = 1;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
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
      if (pointId_ != 0) {
        output.writeUInt32(1, pointId_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(4, dungeonId_);
      }
      if (enterPosInfo_ != null) {
        output.writeMessage(9, getEnterPosInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, pointId_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, dungeonId_);
      }
      if (enterPosInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getEnterPosInfo());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq other = (emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (hasEnterPosInfo() != other.hasEnterPosInfo()) return false;
      if (hasEnterPosInfo()) {
        if (!getEnterPosInfo()
            .equals(other.getEnterPosInfo())) return false;
      }
      if (getPointId()
          != other.getPointId()) return false;
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
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      if (hasEnterPosInfo()) {
        hash = (37 * hash) + ENTER_POS_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getEnterPosInfo().hashCode();
      }
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq prototype) {
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
     *   CMD_ID = 956;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerEnterDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerEnterDungeonReq)
        emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.class, emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dungeonId_ = 0;

        if (enterPosInfoBuilder_ == null) {
          enterPosInfo_ = null;
        } else {
          enterPosInfo_ = null;
          enterPosInfoBuilder_ = null;
        }
        pointId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq build() {
        emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq buildPartial() {
        emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq result = new emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq(this);
        result.dungeonId_ = dungeonId_;
        if (enterPosInfoBuilder_ == null) {
          result.enterPosInfo_ = enterPosInfo_;
        } else {
          result.enterPosInfo_ = enterPosInfoBuilder_.build();
        }
        result.pointId_ = pointId_;
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
        if (other instanceof emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq) {
          return mergeFrom((emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq other) {
        if (other == emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.hasEnterPosInfo()) {
          mergeEnterPosInfo(other.getEnterPosInfo());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
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
                pointId_ = input.readUInt32();

                break;
              } // case 8
              case 32: {
                dungeonId_ = input.readUInt32();

                break;
              } // case 32
              case 74: {
                input.readMessage(
                    getEnterPosInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 74
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

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 4;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 4;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo enterPosInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo, emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.Builder, emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfoOrBuilder> enterPosInfoBuilder_;
      /**
       * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
       * @return Whether the enterPosInfo field is set.
       */
      public boolean hasEnterPosInfo() {
        return enterPosInfoBuilder_ != null || enterPosInfo_ != null;
      }
      /**
       * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
       * @return The enterPosInfo.
       */
      public emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo getEnterPosInfo() {
        if (enterPosInfoBuilder_ == null) {
          return enterPosInfo_ == null ? emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.getDefaultInstance() : enterPosInfo_;
        } else {
          return enterPosInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
       */
      public Builder setEnterPosInfo(emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo value) {
        if (enterPosInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          enterPosInfo_ = value;
          onChanged();
        } else {
          enterPosInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
       */
      public Builder setEnterPosInfo(
          emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.Builder builderForValue) {
        if (enterPosInfoBuilder_ == null) {
          enterPosInfo_ = builderForValue.build();
          onChanged();
        } else {
          enterPosInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
       */
      public Builder mergeEnterPosInfo(emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo value) {
        if (enterPosInfoBuilder_ == null) {
          if (enterPosInfo_ != null) {
            enterPosInfo_ =
              emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.newBuilder(enterPosInfo_).mergeFrom(value).buildPartial();
          } else {
            enterPosInfo_ = value;
          }
          onChanged();
        } else {
          enterPosInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
       */
      public Builder clearEnterPosInfo() {
        if (enterPosInfoBuilder_ == null) {
          enterPosInfo_ = null;
          onChanged();
        } else {
          enterPosInfo_ = null;
          enterPosInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
       */
      public emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.Builder getEnterPosInfoBuilder() {
        
        onChanged();
        return getEnterPosInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
       */
      public emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfoOrBuilder getEnterPosInfoOrBuilder() {
        if (enterPosInfoBuilder_ != null) {
          return enterPosInfoBuilder_.getMessageOrBuilder();
        } else {
          return enterPosInfo_ == null ?
              emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.getDefaultInstance() : enterPosInfo_;
        }
      }
      /**
       * <code>.DungeonEnterPosInfo enter_pos_info = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo, emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.Builder, emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfoOrBuilder> 
          getEnterPosInfoFieldBuilder() {
        if (enterPosInfoBuilder_ == null) {
          enterPosInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo, emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.Builder, emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfoOrBuilder>(
                  getEnterPosInfo(),
                  getParentForChildren(),
                  isClean());
          enterPosInfo_ = null;
        }
        return enterPosInfoBuilder_;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 1;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 1;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerEnterDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerEnterDungeonReq)
    private static final emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq();
    }

    public static emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerEnterDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerEnterDungeonReq>() {
      @java.lang.Override
      public PlayerEnterDungeonReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerEnterDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerEnterDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerEnterDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerEnterDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033PlayerEnterDungeonReq.proto\032\031DungeonEn" +
      "terPosInfo.proto\"k\n\025PlayerEnterDungeonRe" +
      "q\022\022\n\ndungeon_id\030\004 \001(\r\022,\n\016enter_pos_info\030" +
      "\t \001(\0132\024.DungeonEnterPosInfo\022\020\n\010point_id\030" +
      "\001 \001(\rB\036\n\034emu.grasscutter.net.newprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayerEnterDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerEnterDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerEnterDungeonReq_descriptor,
        new java.lang.String[] { "DungeonId", "EnterPosInfo", "PointId", });
    emu.grasscutter.net.newproto.DungeonEnterPosInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
