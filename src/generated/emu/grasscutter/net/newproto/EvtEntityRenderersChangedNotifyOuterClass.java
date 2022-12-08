// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtEntityRenderersChangedNotify.proto

package emu.grasscutter.net.newproto;

public final class EvtEntityRenderersChangedNotifyOuterClass {
  private EvtEntityRenderersChangedNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtEntityRenderersChangedNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtEntityRenderersChangedNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ForwardType forward_type = 5;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 5;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType getForwardType();

    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>bool is_server_cache = 3;</code>
     * @return The isServerCache.
     */
    boolean getIsServerCache();

    /**
     * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
     * @return Whether the rendererChangedInfo field is set.
     */
    boolean hasRendererChangedInfo();
    /**
     * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
     * @return The rendererChangedInfo.
     */
    emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo getRendererChangedInfo();
    /**
     * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
     */
    emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder getRendererChangedInfoOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 375;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EvtEntityRenderersChangedNotify}
   */
  public static final class EvtEntityRenderersChangedNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtEntityRenderersChangedNotify)
      EvtEntityRenderersChangedNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtEntityRenderersChangedNotify.newBuilder() to construct.
    private EvtEntityRenderersChangedNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtEntityRenderersChangedNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtEntityRenderersChangedNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.internal_static_EvtEntityRenderersChangedNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.internal_static_EvtEntityRenderersChangedNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify.class, emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify.Builder.class);
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 5;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 5;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 5;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 1;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int IS_SERVER_CACHE_FIELD_NUMBER = 3;
    private boolean isServerCache_;
    /**
     * <code>bool is_server_cache = 3;</code>
     * @return The isServerCache.
     */
    @java.lang.Override
    public boolean getIsServerCache() {
      return isServerCache_;
    }

    public static final int RENDERER_CHANGED_INFO_FIELD_NUMBER = 15;
    private emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo rendererChangedInfo_;
    /**
     * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
     * @return Whether the rendererChangedInfo field is set.
     */
    @java.lang.Override
    public boolean hasRendererChangedInfo() {
      return rendererChangedInfo_ != null;
    }
    /**
     * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
     * @return The rendererChangedInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo getRendererChangedInfo() {
      return rendererChangedInfo_ == null ? emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.getDefaultInstance() : rendererChangedInfo_;
    }
    /**
     * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder getRendererChangedInfoOrBuilder() {
      return getRendererChangedInfo();
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
      if (entityId_ != 0) {
        output.writeUInt32(1, entityId_);
      }
      if (isServerCache_ != false) {
        output.writeBool(3, isServerCache_);
      }
      if (forwardType_ != emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(5, forwardType_);
      }
      if (rendererChangedInfo_ != null) {
        output.writeMessage(15, getRendererChangedInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, entityId_);
      }
      if (isServerCache_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isServerCache_);
      }
      if (forwardType_ != emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, forwardType_);
      }
      if (rendererChangedInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getRendererChangedInfo());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify other = (emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify) obj;

      if (forwardType_ != other.forwardType_) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getIsServerCache()
          != other.getIsServerCache()) return false;
      if (hasRendererChangedInfo() != other.hasRendererChangedInfo()) return false;
      if (hasRendererChangedInfo()) {
        if (!getRendererChangedInfo()
            .equals(other.getRendererChangedInfo())) return false;
      }
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
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + IS_SERVER_CACHE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsServerCache());
      if (hasRendererChangedInfo()) {
        hash = (37 * hash) + RENDERER_CHANGED_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getRendererChangedInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify prototype) {
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
     *   CMD_ID = 375;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EvtEntityRenderersChangedNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtEntityRenderersChangedNotify)
        emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.internal_static_EvtEntityRenderersChangedNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.internal_static_EvtEntityRenderersChangedNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify.class, emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        forwardType_ = 0;

        entityId_ = 0;

        isServerCache_ = false;

        if (rendererChangedInfoBuilder_ == null) {
          rendererChangedInfo_ = null;
        } else {
          rendererChangedInfo_ = null;
          rendererChangedInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.internal_static_EvtEntityRenderersChangedNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify build() {
        emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify buildPartial() {
        emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify result = new emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify(this);
        result.forwardType_ = forwardType_;
        result.entityId_ = entityId_;
        result.isServerCache_ = isServerCache_;
        if (rendererChangedInfoBuilder_ == null) {
          result.rendererChangedInfo_ = rendererChangedInfo_;
        } else {
          result.rendererChangedInfo_ = rendererChangedInfoBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify other) {
        if (other == emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify.getDefaultInstance()) return this;
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getIsServerCache() != false) {
          setIsServerCache(other.getIsServerCache());
        }
        if (other.hasRendererChangedInfo()) {
          mergeRendererChangedInfo(other.getRendererChangedInfo());
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
                entityId_ = input.readUInt32();

                break;
              } // case 8
              case 24: {
                isServerCache_ = input.readBool();

                break;
              } // case 24
              case 40: {
                forwardType_ = input.readEnum();

                break;
              } // case 40
              case 122: {
                input.readMessage(
                    getRendererChangedInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

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

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 5;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 5;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 5;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 5;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private boolean isServerCache_ ;
      /**
       * <code>bool is_server_cache = 3;</code>
       * @return The isServerCache.
       */
      @java.lang.Override
      public boolean getIsServerCache() {
        return isServerCache_;
      }
      /**
       * <code>bool is_server_cache = 3;</code>
       * @param value The isServerCache to set.
       * @return This builder for chaining.
       */
      public Builder setIsServerCache(boolean value) {
        
        isServerCache_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_server_cache = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsServerCache() {
        
        isServerCache_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo rendererChangedInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo, emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder, emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder> rendererChangedInfoBuilder_;
      /**
       * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
       * @return Whether the rendererChangedInfo field is set.
       */
      public boolean hasRendererChangedInfo() {
        return rendererChangedInfoBuilder_ != null || rendererChangedInfo_ != null;
      }
      /**
       * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
       * @return The rendererChangedInfo.
       */
      public emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo getRendererChangedInfo() {
        if (rendererChangedInfoBuilder_ == null) {
          return rendererChangedInfo_ == null ? emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.getDefaultInstance() : rendererChangedInfo_;
        } else {
          return rendererChangedInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
       */
      public Builder setRendererChangedInfo(emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo value) {
        if (rendererChangedInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rendererChangedInfo_ = value;
          onChanged();
        } else {
          rendererChangedInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
       */
      public Builder setRendererChangedInfo(
          emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder builderForValue) {
        if (rendererChangedInfoBuilder_ == null) {
          rendererChangedInfo_ = builderForValue.build();
          onChanged();
        } else {
          rendererChangedInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
       */
      public Builder mergeRendererChangedInfo(emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo value) {
        if (rendererChangedInfoBuilder_ == null) {
          if (rendererChangedInfo_ != null) {
            rendererChangedInfo_ =
              emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.newBuilder(rendererChangedInfo_).mergeFrom(value).buildPartial();
          } else {
            rendererChangedInfo_ = value;
          }
          onChanged();
        } else {
          rendererChangedInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
       */
      public Builder clearRendererChangedInfo() {
        if (rendererChangedInfoBuilder_ == null) {
          rendererChangedInfo_ = null;
          onChanged();
        } else {
          rendererChangedInfo_ = null;
          rendererChangedInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
       */
      public emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder getRendererChangedInfoBuilder() {
        
        onChanged();
        return getRendererChangedInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
       */
      public emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder getRendererChangedInfoOrBuilder() {
        if (rendererChangedInfoBuilder_ != null) {
          return rendererChangedInfoBuilder_.getMessageOrBuilder();
        } else {
          return rendererChangedInfo_ == null ?
              emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.getDefaultInstance() : rendererChangedInfo_;
        }
      }
      /**
       * <code>.EntityRendererChangedInfo renderer_changed_info = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo, emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder, emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder> 
          getRendererChangedInfoFieldBuilder() {
        if (rendererChangedInfoBuilder_ == null) {
          rendererChangedInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo, emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder, emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder>(
                  getRendererChangedInfo(),
                  getParentForChildren(),
                  isClean());
          rendererChangedInfo_ = null;
        }
        return rendererChangedInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtEntityRenderersChangedNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtEntityRenderersChangedNotify)
    private static final emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify();
    }

    public static emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtEntityRenderersChangedNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtEntityRenderersChangedNotify>() {
      @java.lang.Override
      public EvtEntityRenderersChangedNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtEntityRenderersChangedNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtEntityRenderersChangedNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.EvtEntityRenderersChangedNotifyOuterClass.EvtEntityRenderersChangedNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtEntityRenderersChangedNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtEntityRenderersChangedNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%EvtEntityRenderersChangedNotify.proto\032" +
      "\037EntityRendererChangedInfo.proto\032\021Forwar" +
      "dType.proto\"\254\001\n\037EvtEntityRenderersChange" +
      "dNotify\022\"\n\014forward_type\030\005 \001(\0162\014.ForwardT" +
      "ype\022\021\n\tentity_id\030\001 \001(\r\022\027\n\017is_server_cach" +
      "e\030\003 \001(\010\0229\n\025renderer_changed_info\030\017 \001(\0132\032" +
      ".EntityRendererChangedInfoB\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.getDescriptor(),
          emu.grasscutter.net.newproto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtEntityRenderersChangedNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtEntityRenderersChangedNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtEntityRenderersChangedNotify_descriptor,
        new java.lang.String[] { "ForwardType", "EntityId", "IsServerCache", "RendererChangedInfo", });
    emu.grasscutter.net.newproto.EntityRendererChangedInfoOuterClass.getDescriptor();
    emu.grasscutter.net.newproto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
