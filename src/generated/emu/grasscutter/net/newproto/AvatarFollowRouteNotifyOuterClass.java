// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarFollowRouteNotify.proto

package emu.grasscutter.net.newproto;

public final class AvatarFollowRouteNotifyOuterClass {
  private AvatarFollowRouteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarFollowRouteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarFollowRouteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string client_params = 5;</code>
     * @return The clientParams.
     */
    java.lang.String getClientParams();
    /**
     * <code>string client_params = 5;</code>
     * @return The bytes for clientParams.
     */
    com.google.protobuf.ByteString
        getClientParamsBytes();

    /**
     * <code>.Route route = 1;</code>
     * @return Whether the route field is set.
     */
    boolean hasRoute();
    /**
     * <code>.Route route = 1;</code>
     * @return The route.
     */
    emu.grasscutter.net.newproto.RouteOuterClass.Route getRoute();
    /**
     * <code>.Route route = 1;</code>
     */
    emu.grasscutter.net.newproto.RouteOuterClass.RouteOrBuilder getRouteOrBuilder();

    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 template_id = 4;</code>
     * @return The templateId.
     */
    int getTemplateId();

    /**
     * <code>uint32 start_scene_time_ms = 3;</code>
     * @return The startSceneTimeMs.
     */
    int getStartSceneTimeMs();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3256;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code AvatarFollowRouteNotify}
   */
  public static final class AvatarFollowRouteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarFollowRouteNotify)
      AvatarFollowRouteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarFollowRouteNotify.newBuilder() to construct.
    private AvatarFollowRouteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarFollowRouteNotify() {
      clientParams_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarFollowRouteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.class, emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.Builder.class);
    }

    public static final int CLIENT_PARAMS_FIELD_NUMBER = 5;
    private volatile java.lang.Object clientParams_;
    /**
     * <code>string client_params = 5;</code>
     * @return The clientParams.
     */
    @java.lang.Override
    public java.lang.String getClientParams() {
      java.lang.Object ref = clientParams_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientParams_ = s;
        return s;
      }
    }
    /**
     * <code>string client_params = 5;</code>
     * @return The bytes for clientParams.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getClientParamsBytes() {
      java.lang.Object ref = clientParams_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientParams_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ROUTE_FIELD_NUMBER = 1;
    private emu.grasscutter.net.newproto.RouteOuterClass.Route route_;
    /**
     * <code>.Route route = 1;</code>
     * @return Whether the route field is set.
     */
    @java.lang.Override
    public boolean hasRoute() {
      return route_ != null;
    }
    /**
     * <code>.Route route = 1;</code>
     * @return The route.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.RouteOuterClass.Route getRoute() {
      return route_ == null ? emu.grasscutter.net.newproto.RouteOuterClass.Route.getDefaultInstance() : route_;
    }
    /**
     * <code>.Route route = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.RouteOuterClass.RouteOrBuilder getRouteOrBuilder() {
      return getRoute();
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 10;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int TEMPLATE_ID_FIELD_NUMBER = 4;
    private int templateId_;
    /**
     * <code>uint32 template_id = 4;</code>
     * @return The templateId.
     */
    @java.lang.Override
    public int getTemplateId() {
      return templateId_;
    }

    public static final int START_SCENE_TIME_MS_FIELD_NUMBER = 3;
    private int startSceneTimeMs_;
    /**
     * <code>uint32 start_scene_time_ms = 3;</code>
     * @return The startSceneTimeMs.
     */
    @java.lang.Override
    public int getStartSceneTimeMs() {
      return startSceneTimeMs_;
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
      if (route_ != null) {
        output.writeMessage(1, getRoute());
      }
      if (startSceneTimeMs_ != 0) {
        output.writeUInt32(3, startSceneTimeMs_);
      }
      if (templateId_ != 0) {
        output.writeUInt32(4, templateId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientParams_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, clientParams_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(10, entityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (route_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getRoute());
      }
      if (startSceneTimeMs_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, startSceneTimeMs_);
      }
      if (templateId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, templateId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientParams_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, clientParams_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify other = (emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify) obj;

      if (!getClientParams()
          .equals(other.getClientParams())) return false;
      if (hasRoute() != other.hasRoute()) return false;
      if (hasRoute()) {
        if (!getRoute()
            .equals(other.getRoute())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getTemplateId()
          != other.getTemplateId()) return false;
      if (getStartSceneTimeMs()
          != other.getStartSceneTimeMs()) return false;
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
      hash = (37 * hash) + CLIENT_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getClientParams().hashCode();
      if (hasRoute()) {
        hash = (37 * hash) + ROUTE_FIELD_NUMBER;
        hash = (53 * hash) + getRoute().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + TEMPLATE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTemplateId();
      hash = (37 * hash) + START_SCENE_TIME_MS_FIELD_NUMBER;
      hash = (53 * hash) + getStartSceneTimeMs();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify prototype) {
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
     *   CMD_ID = 3256;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code AvatarFollowRouteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarFollowRouteNotify)
        emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.class, emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        clientParams_ = "";

        if (routeBuilder_ == null) {
          route_ = null;
        } else {
          route_ = null;
          routeBuilder_ = null;
        }
        entityId_ = 0;

        templateId_ = 0;

        startSceneTimeMs_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.internal_static_AvatarFollowRouteNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify build() {
        emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify buildPartial() {
        emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify result = new emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify(this);
        result.clientParams_ = clientParams_;
        if (routeBuilder_ == null) {
          result.route_ = route_;
        } else {
          result.route_ = routeBuilder_.build();
        }
        result.entityId_ = entityId_;
        result.templateId_ = templateId_;
        result.startSceneTimeMs_ = startSceneTimeMs_;
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
        if (other instanceof emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify other) {
        if (other == emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify.getDefaultInstance()) return this;
        if (!other.getClientParams().isEmpty()) {
          clientParams_ = other.clientParams_;
          onChanged();
        }
        if (other.hasRoute()) {
          mergeRoute(other.getRoute());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getTemplateId() != 0) {
          setTemplateId(other.getTemplateId());
        }
        if (other.getStartSceneTimeMs() != 0) {
          setStartSceneTimeMs(other.getStartSceneTimeMs());
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
              case 10: {
                input.readMessage(
                    getRouteFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 10
              case 24: {
                startSceneTimeMs_ = input.readUInt32();

                break;
              } // case 24
              case 32: {
                templateId_ = input.readUInt32();

                break;
              } // case 32
              case 42: {
                clientParams_ = input.readStringRequireUtf8();

                break;
              } // case 42
              case 80: {
                entityId_ = input.readUInt32();

                break;
              } // case 80
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

      private java.lang.Object clientParams_ = "";
      /**
       * <code>string client_params = 5;</code>
       * @return The clientParams.
       */
      public java.lang.String getClientParams() {
        java.lang.Object ref = clientParams_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          clientParams_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string client_params = 5;</code>
       * @return The bytes for clientParams.
       */
      public com.google.protobuf.ByteString
          getClientParamsBytes() {
        java.lang.Object ref = clientParams_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientParams_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string client_params = 5;</code>
       * @param value The clientParams to set.
       * @return This builder for chaining.
       */
      public Builder setClientParams(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        clientParams_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string client_params = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientParams() {
        
        clientParams_ = getDefaultInstance().getClientParams();
        onChanged();
        return this;
      }
      /**
       * <code>string client_params = 5;</code>
       * @param value The bytes for clientParams to set.
       * @return This builder for chaining.
       */
      public Builder setClientParamsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        clientParams_ = value;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.RouteOuterClass.Route route_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.RouteOuterClass.Route, emu.grasscutter.net.newproto.RouteOuterClass.Route.Builder, emu.grasscutter.net.newproto.RouteOuterClass.RouteOrBuilder> routeBuilder_;
      /**
       * <code>.Route route = 1;</code>
       * @return Whether the route field is set.
       */
      public boolean hasRoute() {
        return routeBuilder_ != null || route_ != null;
      }
      /**
       * <code>.Route route = 1;</code>
       * @return The route.
       */
      public emu.grasscutter.net.newproto.RouteOuterClass.Route getRoute() {
        if (routeBuilder_ == null) {
          return route_ == null ? emu.grasscutter.net.newproto.RouteOuterClass.Route.getDefaultInstance() : route_;
        } else {
          return routeBuilder_.getMessage();
        }
      }
      /**
       * <code>.Route route = 1;</code>
       */
      public Builder setRoute(emu.grasscutter.net.newproto.RouteOuterClass.Route value) {
        if (routeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          route_ = value;
          onChanged();
        } else {
          routeBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Route route = 1;</code>
       */
      public Builder setRoute(
          emu.grasscutter.net.newproto.RouteOuterClass.Route.Builder builderForValue) {
        if (routeBuilder_ == null) {
          route_ = builderForValue.build();
          onChanged();
        } else {
          routeBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Route route = 1;</code>
       */
      public Builder mergeRoute(emu.grasscutter.net.newproto.RouteOuterClass.Route value) {
        if (routeBuilder_ == null) {
          if (route_ != null) {
            route_ =
              emu.grasscutter.net.newproto.RouteOuterClass.Route.newBuilder(route_).mergeFrom(value).buildPartial();
          } else {
            route_ = value;
          }
          onChanged();
        } else {
          routeBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Route route = 1;</code>
       */
      public Builder clearRoute() {
        if (routeBuilder_ == null) {
          route_ = null;
          onChanged();
        } else {
          route_ = null;
          routeBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Route route = 1;</code>
       */
      public emu.grasscutter.net.newproto.RouteOuterClass.Route.Builder getRouteBuilder() {
        
        onChanged();
        return getRouteFieldBuilder().getBuilder();
      }
      /**
       * <code>.Route route = 1;</code>
       */
      public emu.grasscutter.net.newproto.RouteOuterClass.RouteOrBuilder getRouteOrBuilder() {
        if (routeBuilder_ != null) {
          return routeBuilder_.getMessageOrBuilder();
        } else {
          return route_ == null ?
              emu.grasscutter.net.newproto.RouteOuterClass.Route.getDefaultInstance() : route_;
        }
      }
      /**
       * <code>.Route route = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.RouteOuterClass.Route, emu.grasscutter.net.newproto.RouteOuterClass.Route.Builder, emu.grasscutter.net.newproto.RouteOuterClass.RouteOrBuilder> 
          getRouteFieldBuilder() {
        if (routeBuilder_ == null) {
          routeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.RouteOuterClass.Route, emu.grasscutter.net.newproto.RouteOuterClass.Route.Builder, emu.grasscutter.net.newproto.RouteOuterClass.RouteOrBuilder>(
                  getRoute(),
                  getParentForChildren(),
                  isClean());
          route_ = null;
        }
        return routeBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int templateId_ ;
      /**
       * <code>uint32 template_id = 4;</code>
       * @return The templateId.
       */
      @java.lang.Override
      public int getTemplateId() {
        return templateId_;
      }
      /**
       * <code>uint32 template_id = 4;</code>
       * @param value The templateId to set.
       * @return This builder for chaining.
       */
      public Builder setTemplateId(int value) {
        
        templateId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 template_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTemplateId() {
        
        templateId_ = 0;
        onChanged();
        return this;
      }

      private int startSceneTimeMs_ ;
      /**
       * <code>uint32 start_scene_time_ms = 3;</code>
       * @return The startSceneTimeMs.
       */
      @java.lang.Override
      public int getStartSceneTimeMs() {
        return startSceneTimeMs_;
      }
      /**
       * <code>uint32 start_scene_time_ms = 3;</code>
       * @param value The startSceneTimeMs to set.
       * @return This builder for chaining.
       */
      public Builder setStartSceneTimeMs(int value) {
        
        startSceneTimeMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 start_scene_time_ms = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartSceneTimeMs() {
        
        startSceneTimeMs_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarFollowRouteNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarFollowRouteNotify)
    private static final emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify();
    }

    public static emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarFollowRouteNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarFollowRouteNotify>() {
      @java.lang.Override
      public AvatarFollowRouteNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarFollowRouteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarFollowRouteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.AvatarFollowRouteNotifyOuterClass.AvatarFollowRouteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarFollowRouteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarFollowRouteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035AvatarFollowRouteNotify.proto\032\013Route.p" +
      "roto\"\214\001\n\027AvatarFollowRouteNotify\022\025\n\rclie" +
      "nt_params\030\005 \001(\t\022\025\n\005route\030\001 \001(\0132\006.Route\022\021" +
      "\n\tentity_id\030\n \001(\r\022\023\n\013template_id\030\004 \001(\r\022\033" +
      "\n\023start_scene_time_ms\030\003 \001(\rB\036\n\034emu.grass" +
      "cutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.RouteOuterClass.getDescriptor(),
        });
    internal_static_AvatarFollowRouteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarFollowRouteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarFollowRouteNotify_descriptor,
        new java.lang.String[] { "ClientParams", "Route", "EntityId", "TemplateId", "StartSceneTimeMs", });
    emu.grasscutter.net.newproto.RouteOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}