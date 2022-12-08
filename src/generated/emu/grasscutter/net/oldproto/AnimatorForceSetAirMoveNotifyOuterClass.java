// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnimatorForceSetAirMoveNotify.proto

package emu.grasscutter.net.oldproto;

public final class AnimatorForceSetAirMoveNotifyOuterClass {
  private AnimatorForceSetAirMoveNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AnimatorForceSetAirMoveNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AnimatorForceSetAirMoveNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 14;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>bool in_air_move = 13;</code>
     * @return The inAirMove.
     */
    boolean getInAirMove();

    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType getForwardType();
  }
  /**
   * <pre>
   * CmdId: 374
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code AnimatorForceSetAirMoveNotify}
   */
  public static final class AnimatorForceSetAirMoveNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AnimatorForceSetAirMoveNotify)
      AnimatorForceSetAirMoveNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AnimatorForceSetAirMoveNotify.newBuilder() to construct.
    private AnimatorForceSetAirMoveNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AnimatorForceSetAirMoveNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AnimatorForceSetAirMoveNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.internal_static_AnimatorForceSetAirMoveNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.internal_static_AnimatorForceSetAirMoveNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify.class, emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 14;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 14;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int IN_AIR_MOVE_FIELD_NUMBER = 13;
    private boolean inAirMove_;
    /**
     * <code>bool in_air_move = 13;</code>
     * @return The inAirMove.
     */
    @java.lang.Override
    public boolean getInAirMove() {
      return inAirMove_;
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 9;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
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
      if (forwardType_ != emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(9, forwardType_);
      }
      if (inAirMove_ != false) {
        output.writeBool(13, inAirMove_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(14, entityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (forwardType_ != emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, forwardType_);
      }
      if (inAirMove_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, inAirMove_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify other = (emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getInAirMove()
          != other.getInAirMove()) return false;
      if (forwardType_ != other.forwardType_) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + IN_AIR_MOVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getInAirMove());
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify prototype) {
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
     * CmdId: 374
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code AnimatorForceSetAirMoveNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AnimatorForceSetAirMoveNotify)
        emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.internal_static_AnimatorForceSetAirMoveNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.internal_static_AnimatorForceSetAirMoveNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify.class, emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        entityId_ = 0;

        inAirMove_ = false;

        forwardType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.internal_static_AnimatorForceSetAirMoveNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify build() {
        emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify buildPartial() {
        emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify result = new emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify(this);
        result.entityId_ = entityId_;
        result.inAirMove_ = inAirMove_;
        result.forwardType_ = forwardType_;
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
        if (other instanceof emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify other) {
        if (other == emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getInAirMove() != false) {
          setInAirMove(other.getInAirMove());
        }
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
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
              case 72: {
                forwardType_ = input.readEnum();

                break;
              } // case 72
              case 104: {
                inAirMove_ = input.readBool();

                break;
              } // case 104
              case 112: {
                entityId_ = input.readUInt32();

                break;
              } // case 112
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

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 14;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 14;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private boolean inAirMove_ ;
      /**
       * <code>bool in_air_move = 13;</code>
       * @return The inAirMove.
       */
      @java.lang.Override
      public boolean getInAirMove() {
        return inAirMove_;
      }
      /**
       * <code>bool in_air_move = 13;</code>
       * @param value The inAirMove to set.
       * @return This builder for chaining.
       */
      public Builder setInAirMove(boolean value) {
        
        inAirMove_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool in_air_move = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearInAirMove() {
        
        inAirMove_ = false;
        onChanged();
        return this;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AnimatorForceSetAirMoveNotify)
    }

    // @@protoc_insertion_point(class_scope:AnimatorForceSetAirMoveNotify)
    private static final emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify();
    }

    public static emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AnimatorForceSetAirMoveNotify>
        PARSER = new com.google.protobuf.AbstractParser<AnimatorForceSetAirMoveNotify>() {
      @java.lang.Override
      public AnimatorForceSetAirMoveNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AnimatorForceSetAirMoveNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AnimatorForceSetAirMoveNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.AnimatorForceSetAirMoveNotifyOuterClass.AnimatorForceSetAirMoveNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnimatorForceSetAirMoveNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnimatorForceSetAirMoveNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#AnimatorForceSetAirMoveNotify.proto\032\021F" +
      "orwardType.proto\"k\n\035AnimatorForceSetAirM" +
      "oveNotify\022\021\n\tentity_id\030\016 \001(\r\022\023\n\013in_air_m" +
      "ove\030\r \001(\010\022\"\n\014forward_type\030\t \001(\0162\014.Forwar" +
      "dTypeB\036\n\034emu.grasscutter.net.oldprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_AnimatorForceSetAirMoveNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AnimatorForceSetAirMoveNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnimatorForceSetAirMoveNotify_descriptor,
        new java.lang.String[] { "EntityId", "InAirMove", "ForwardType", });
    emu.grasscutter.net.oldproto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
