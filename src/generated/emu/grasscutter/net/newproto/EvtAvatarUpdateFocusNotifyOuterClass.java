// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtAvatarUpdateFocusNotify.proto

package emu.grasscutter.net.newproto;

public final class EvtAvatarUpdateFocusNotifyOuterClass {
  private EvtAvatarUpdateFocusNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtAvatarUpdateFocusNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtAvatarUpdateFocusNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ForwardType forward_type = 4;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 4;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType getForwardType();

    /**
     * <code>uint32 entity_id = 3;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.Vector focus_forward = 6;</code>
     * @return Whether the focusForward field is set.
     */
    boolean hasFocusForward();
    /**
     * <code>.Vector focus_forward = 6;</code>
     * @return The focusForward.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getFocusForward();
    /**
     * <code>.Vector focus_forward = 6;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getFocusForwardOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 317;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EvtAvatarUpdateFocusNotify}
   */
  public static final class EvtAvatarUpdateFocusNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtAvatarUpdateFocusNotify)
      EvtAvatarUpdateFocusNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtAvatarUpdateFocusNotify.newBuilder() to construct.
    private EvtAvatarUpdateFocusNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtAvatarUpdateFocusNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtAvatarUpdateFocusNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.class, emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.Builder.class);
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 4;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 4;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 4;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 3;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 3;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int FOCUS_FORWARD_FIELD_NUMBER = 6;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector focusForward_;
    /**
     * <code>.Vector focus_forward = 6;</code>
     * @return Whether the focusForward field is set.
     */
    @java.lang.Override
    public boolean hasFocusForward() {
      return focusForward_ != null;
    }
    /**
     * <code>.Vector focus_forward = 6;</code>
     * @return The focusForward.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getFocusForward() {
      return focusForward_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : focusForward_;
    }
    /**
     * <code>.Vector focus_forward = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getFocusForwardOrBuilder() {
      return getFocusForward();
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
        output.writeUInt32(3, entityId_);
      }
      if (forwardType_ != emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(4, forwardType_);
      }
      if (focusForward_ != null) {
        output.writeMessage(6, getFocusForward());
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
          .computeUInt32Size(3, entityId_);
      }
      if (forwardType_ != emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, forwardType_);
      }
      if (focusForward_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getFocusForward());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify other = (emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify) obj;

      if (forwardType_ != other.forwardType_) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasFocusForward() != other.hasFocusForward()) return false;
      if (hasFocusForward()) {
        if (!getFocusForward()
            .equals(other.getFocusForward())) return false;
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
      if (hasFocusForward()) {
        hash = (37 * hash) + FOCUS_FORWARD_FIELD_NUMBER;
        hash = (53 * hash) + getFocusForward().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify prototype) {
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
     *   CMD_ID = 317;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EvtAvatarUpdateFocusNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtAvatarUpdateFocusNotify)
        emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.class, emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.newBuilder()
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

        if (focusForwardBuilder_ == null) {
          focusForward_ = null;
        } else {
          focusForward_ = null;
          focusForwardBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.internal_static_EvtAvatarUpdateFocusNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify build() {
        emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify buildPartial() {
        emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify result = new emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify(this);
        result.forwardType_ = forwardType_;
        result.entityId_ = entityId_;
        if (focusForwardBuilder_ == null) {
          result.focusForward_ = focusForward_;
        } else {
          result.focusForward_ = focusForwardBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify other) {
        if (other == emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify.getDefaultInstance()) return this;
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasFocusForward()) {
          mergeFocusForward(other.getFocusForward());
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
                entityId_ = input.readUInt32();

                break;
              } // case 24
              case 32: {
                forwardType_ = input.readEnum();

                break;
              } // case 32
              case 50: {
                input.readMessage(
                    getFocusForwardFieldBuilder().getBuilder(),
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

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 4;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 4;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 4;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 4;</code>
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
       * <code>.ForwardType forward_type = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 3;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 3;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector focusForward_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> focusForwardBuilder_;
      /**
       * <code>.Vector focus_forward = 6;</code>
       * @return Whether the focusForward field is set.
       */
      public boolean hasFocusForward() {
        return focusForwardBuilder_ != null || focusForward_ != null;
      }
      /**
       * <code>.Vector focus_forward = 6;</code>
       * @return The focusForward.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getFocusForward() {
        if (focusForwardBuilder_ == null) {
          return focusForward_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : focusForward_;
        } else {
          return focusForwardBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector focus_forward = 6;</code>
       */
      public Builder setFocusForward(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (focusForwardBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          focusForward_ = value;
          onChanged();
        } else {
          focusForwardBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector focus_forward = 6;</code>
       */
      public Builder setFocusForward(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (focusForwardBuilder_ == null) {
          focusForward_ = builderForValue.build();
          onChanged();
        } else {
          focusForwardBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector focus_forward = 6;</code>
       */
      public Builder mergeFocusForward(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (focusForwardBuilder_ == null) {
          if (focusForward_ != null) {
            focusForward_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(focusForward_).mergeFrom(value).buildPartial();
          } else {
            focusForward_ = value;
          }
          onChanged();
        } else {
          focusForwardBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector focus_forward = 6;</code>
       */
      public Builder clearFocusForward() {
        if (focusForwardBuilder_ == null) {
          focusForward_ = null;
          onChanged();
        } else {
          focusForward_ = null;
          focusForwardBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector focus_forward = 6;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getFocusForwardBuilder() {
        
        onChanged();
        return getFocusForwardFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector focus_forward = 6;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getFocusForwardOrBuilder() {
        if (focusForwardBuilder_ != null) {
          return focusForwardBuilder_.getMessageOrBuilder();
        } else {
          return focusForward_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : focusForward_;
        }
      }
      /**
       * <code>.Vector focus_forward = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getFocusForwardFieldBuilder() {
        if (focusForwardBuilder_ == null) {
          focusForwardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getFocusForward(),
                  getParentForChildren(),
                  isClean());
          focusForward_ = null;
        }
        return focusForwardBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtAvatarUpdateFocusNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtAvatarUpdateFocusNotify)
    private static final emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify();
    }

    public static emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtAvatarUpdateFocusNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtAvatarUpdateFocusNotify>() {
      @java.lang.Override
      public EvtAvatarUpdateFocusNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtAvatarUpdateFocusNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtAvatarUpdateFocusNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.EvtAvatarUpdateFocusNotifyOuterClass.EvtAvatarUpdateFocusNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtAvatarUpdateFocusNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtAvatarUpdateFocusNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n EvtAvatarUpdateFocusNotify.proto\032\021Forw" +
      "ardType.proto\032\014Vector.proto\"s\n\032EvtAvatar" +
      "UpdateFocusNotify\022\"\n\014forward_type\030\004 \001(\0162" +
      "\014.ForwardType\022\021\n\tentity_id\030\003 \001(\r\022\036\n\rfocu" +
      "s_forward\030\006 \001(\0132\007.VectorB\036\n\034emu.grasscut" +
      "ter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ForwardTypeOuterClass.getDescriptor(),
          emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EvtAvatarUpdateFocusNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtAvatarUpdateFocusNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtAvatarUpdateFocusNotify_descriptor,
        new java.lang.String[] { "ForwardType", "EntityId", "FocusForward", });
    emu.grasscutter.net.newproto.ForwardTypeOuterClass.getDescriptor();
    emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
