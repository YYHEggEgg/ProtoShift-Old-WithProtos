// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeCreateBlueprintReq.proto

package emu.grasscutter.net.oldproto;

public final class HomeCreateBlueprintReqOuterClass {
  private HomeCreateBlueprintReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeCreateBlueprintReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeCreateBlueprintReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
     * @return Whether the sceneArrangementInfo field is set.
     */
    boolean hasSceneArrangementInfo();
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
     * @return The sceneArrangementInfo.
     */
    emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo();
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
     */
    emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder();

    /**
     * <code>uint32 slot_id = 13;</code>
     * @return The slotId.
     */
    int getSlotId();

    /**
     * <code>string server_share_code = 6;</code>
     * @return The serverShareCode.
     */
    java.lang.String getServerShareCode();
    /**
     * <code>string server_share_code = 6;</code>
     * @return The bytes for serverShareCode.
     */
    com.google.protobuf.ByteString
        getServerShareCodeBytes();

    /**
     * <code>uint32 gen_share_code_count = 4;</code>
     * @return The genShareCodeCount.
     */
    int getGenShareCodeCount();
  }
  /**
   * <pre>
   * CmdId: 4619
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code HomeCreateBlueprintReq}
   */
  public static final class HomeCreateBlueprintReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeCreateBlueprintReq)
      HomeCreateBlueprintReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeCreateBlueprintReq.newBuilder() to construct.
    private HomeCreateBlueprintReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeCreateBlueprintReq() {
      serverShareCode_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeCreateBlueprintReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.internal_static_HomeCreateBlueprintReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.internal_static_HomeCreateBlueprintReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq.class, emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq.Builder.class);
    }

    public static final int SCENE_ARRANGEMENT_INFO_FIELD_NUMBER = 2;
    private emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo sceneArrangementInfo_;
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
     * @return Whether the sceneArrangementInfo field is set.
     */
    @java.lang.Override
    public boolean hasSceneArrangementInfo() {
      return sceneArrangementInfo_ != null;
    }
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
     * @return The sceneArrangementInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo() {
      return sceneArrangementInfo_ == null ? emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : sceneArrangementInfo_;
    }
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder() {
      return getSceneArrangementInfo();
    }

    public static final int SLOT_ID_FIELD_NUMBER = 13;
    private int slotId_;
    /**
     * <code>uint32 slot_id = 13;</code>
     * @return The slotId.
     */
    @java.lang.Override
    public int getSlotId() {
      return slotId_;
    }

    public static final int SERVER_SHARE_CODE_FIELD_NUMBER = 6;
    private volatile java.lang.Object serverShareCode_;
    /**
     * <code>string server_share_code = 6;</code>
     * @return The serverShareCode.
     */
    @java.lang.Override
    public java.lang.String getServerShareCode() {
      java.lang.Object ref = serverShareCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serverShareCode_ = s;
        return s;
      }
    }
    /**
     * <code>string server_share_code = 6;</code>
     * @return The bytes for serverShareCode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getServerShareCodeBytes() {
      java.lang.Object ref = serverShareCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverShareCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GEN_SHARE_CODE_COUNT_FIELD_NUMBER = 4;
    private int genShareCodeCount_;
    /**
     * <code>uint32 gen_share_code_count = 4;</code>
     * @return The genShareCodeCount.
     */
    @java.lang.Override
    public int getGenShareCodeCount() {
      return genShareCodeCount_;
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
      if (sceneArrangementInfo_ != null) {
        output.writeMessage(2, getSceneArrangementInfo());
      }
      if (genShareCodeCount_ != 0) {
        output.writeUInt32(4, genShareCodeCount_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serverShareCode_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, serverShareCode_);
      }
      if (slotId_ != 0) {
        output.writeUInt32(13, slotId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneArrangementInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getSceneArrangementInfo());
      }
      if (genShareCodeCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, genShareCodeCount_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serverShareCode_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, serverShareCode_);
      }
      if (slotId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, slotId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq other = (emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq) obj;

      if (hasSceneArrangementInfo() != other.hasSceneArrangementInfo()) return false;
      if (hasSceneArrangementInfo()) {
        if (!getSceneArrangementInfo()
            .equals(other.getSceneArrangementInfo())) return false;
      }
      if (getSlotId()
          != other.getSlotId()) return false;
      if (!getServerShareCode()
          .equals(other.getServerShareCode())) return false;
      if (getGenShareCodeCount()
          != other.getGenShareCodeCount()) return false;
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
      if (hasSceneArrangementInfo()) {
        hash = (37 * hash) + SCENE_ARRANGEMENT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSceneArrangementInfo().hashCode();
      }
      hash = (37 * hash) + SLOT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSlotId();
      hash = (37 * hash) + SERVER_SHARE_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getServerShareCode().hashCode();
      hash = (37 * hash) + GEN_SHARE_CODE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getGenShareCodeCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq prototype) {
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
     * CmdId: 4619
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code HomeCreateBlueprintReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeCreateBlueprintReq)
        emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.internal_static_HomeCreateBlueprintReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.internal_static_HomeCreateBlueprintReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq.class, emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfo_ = null;
        } else {
          sceneArrangementInfo_ = null;
          sceneArrangementInfoBuilder_ = null;
        }
        slotId_ = 0;

        serverShareCode_ = "";

        genShareCodeCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.internal_static_HomeCreateBlueprintReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq build() {
        emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq buildPartial() {
        emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq result = new emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq(this);
        if (sceneArrangementInfoBuilder_ == null) {
          result.sceneArrangementInfo_ = sceneArrangementInfo_;
        } else {
          result.sceneArrangementInfo_ = sceneArrangementInfoBuilder_.build();
        }
        result.slotId_ = slotId_;
        result.serverShareCode_ = serverShareCode_;
        result.genShareCodeCount_ = genShareCodeCount_;
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
        if (other instanceof emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq other) {
        if (other == emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq.getDefaultInstance()) return this;
        if (other.hasSceneArrangementInfo()) {
          mergeSceneArrangementInfo(other.getSceneArrangementInfo());
        }
        if (other.getSlotId() != 0) {
          setSlotId(other.getSlotId());
        }
        if (!other.getServerShareCode().isEmpty()) {
          serverShareCode_ = other.serverShareCode_;
          onChanged();
        }
        if (other.getGenShareCodeCount() != 0) {
          setGenShareCodeCount(other.getGenShareCodeCount());
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
                    getSceneArrangementInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 18
              case 32: {
                genShareCodeCount_ = input.readUInt32();

                break;
              } // case 32
              case 50: {
                serverShareCode_ = input.readStringRequireUtf8();

                break;
              } // case 50
              case 104: {
                slotId_ = input.readUInt32();

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

      private emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo sceneArrangementInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> sceneArrangementInfoBuilder_;
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
       * @return Whether the sceneArrangementInfo field is set.
       */
      public boolean hasSceneArrangementInfo() {
        return sceneArrangementInfoBuilder_ != null || sceneArrangementInfo_ != null;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
       * @return The sceneArrangementInfo.
       */
      public emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo() {
        if (sceneArrangementInfoBuilder_ == null) {
          return sceneArrangementInfo_ == null ? emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : sceneArrangementInfo_;
        } else {
          return sceneArrangementInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
       */
      public Builder setSceneArrangementInfo(emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
        if (sceneArrangementInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          sceneArrangementInfo_ = value;
          onChanged();
        } else {
          sceneArrangementInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
       */
      public Builder setSceneArrangementInfo(
          emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder builderForValue) {
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfo_ = builderForValue.build();
          onChanged();
        } else {
          sceneArrangementInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
       */
      public Builder mergeSceneArrangementInfo(emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
        if (sceneArrangementInfoBuilder_ == null) {
          if (sceneArrangementInfo_ != null) {
            sceneArrangementInfo_ =
              emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.newBuilder(sceneArrangementInfo_).mergeFrom(value).buildPartial();
          } else {
            sceneArrangementInfo_ = value;
          }
          onChanged();
        } else {
          sceneArrangementInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
       */
      public Builder clearSceneArrangementInfo() {
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfo_ = null;
          onChanged();
        } else {
          sceneArrangementInfo_ = null;
          sceneArrangementInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
       */
      public emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder getSceneArrangementInfoBuilder() {
        
        onChanged();
        return getSceneArrangementInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
       */
      public emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder() {
        if (sceneArrangementInfoBuilder_ != null) {
          return sceneArrangementInfoBuilder_.getMessageOrBuilder();
        } else {
          return sceneArrangementInfo_ == null ?
              emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : sceneArrangementInfo_;
        }
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> 
          getSceneArrangementInfoFieldBuilder() {
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder>(
                  getSceneArrangementInfo(),
                  getParentForChildren(),
                  isClean());
          sceneArrangementInfo_ = null;
        }
        return sceneArrangementInfoBuilder_;
      }

      private int slotId_ ;
      /**
       * <code>uint32 slot_id = 13;</code>
       * @return The slotId.
       */
      @java.lang.Override
      public int getSlotId() {
        return slotId_;
      }
      /**
       * <code>uint32 slot_id = 13;</code>
       * @param value The slotId to set.
       * @return This builder for chaining.
       */
      public Builder setSlotId(int value) {
        
        slotId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slot_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlotId() {
        
        slotId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object serverShareCode_ = "";
      /**
       * <code>string server_share_code = 6;</code>
       * @return The serverShareCode.
       */
      public java.lang.String getServerShareCode() {
        java.lang.Object ref = serverShareCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          serverShareCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string server_share_code = 6;</code>
       * @return The bytes for serverShareCode.
       */
      public com.google.protobuf.ByteString
          getServerShareCodeBytes() {
        java.lang.Object ref = serverShareCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serverShareCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string server_share_code = 6;</code>
       * @param value The serverShareCode to set.
       * @return This builder for chaining.
       */
      public Builder setServerShareCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        serverShareCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string server_share_code = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerShareCode() {
        
        serverShareCode_ = getDefaultInstance().getServerShareCode();
        onChanged();
        return this;
      }
      /**
       * <code>string server_share_code = 6;</code>
       * @param value The bytes for serverShareCode to set.
       * @return This builder for chaining.
       */
      public Builder setServerShareCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        serverShareCode_ = value;
        onChanged();
        return this;
      }

      private int genShareCodeCount_ ;
      /**
       * <code>uint32 gen_share_code_count = 4;</code>
       * @return The genShareCodeCount.
       */
      @java.lang.Override
      public int getGenShareCodeCount() {
        return genShareCodeCount_;
      }
      /**
       * <code>uint32 gen_share_code_count = 4;</code>
       * @param value The genShareCodeCount to set.
       * @return This builder for chaining.
       */
      public Builder setGenShareCodeCount(int value) {
        
        genShareCodeCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gen_share_code_count = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGenShareCodeCount() {
        
        genShareCodeCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeCreateBlueprintReq)
    }

    // @@protoc_insertion_point(class_scope:HomeCreateBlueprintReq)
    private static final emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq();
    }

    public static emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeCreateBlueprintReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeCreateBlueprintReq>() {
      @java.lang.Override
      public HomeCreateBlueprintReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeCreateBlueprintReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeCreateBlueprintReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeCreateBlueprintReqOuterClass.HomeCreateBlueprintReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeCreateBlueprintReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeCreateBlueprintReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034HomeCreateBlueprintReq.proto\032\036HomeScen" +
      "eArrangementInfo.proto\"\235\001\n\026HomeCreateBlu" +
      "eprintReq\0229\n\026scene_arrangement_info\030\002 \001(" +
      "\0132\031.HomeSceneArrangementInfo\022\017\n\007slot_id\030" +
      "\r \001(\r\022\031\n\021server_share_code\030\006 \001(\t\022\034\n\024gen_" +
      "share_code_count\030\004 \001(\rB\036\n\034emu.grasscutte" +
      "r.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeCreateBlueprintReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeCreateBlueprintReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeCreateBlueprintReq_descriptor,
        new java.lang.String[] { "SceneArrangementInfo", "SlotId", "ServerShareCode", "GenShareCodeCount", });
    emu.grasscutter.net.oldproto.HomeSceneArrangementInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
