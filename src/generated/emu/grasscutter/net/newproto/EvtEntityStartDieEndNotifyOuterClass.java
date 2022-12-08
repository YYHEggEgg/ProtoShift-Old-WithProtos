// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtEntityStartDieEndNotify.proto

package emu.grasscutter.net.newproto;

public final class EvtEntityStartDieEndNotifyOuterClass {
  private EvtEntityStartDieEndNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtEntityStartDieEndNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtEntityStartDieEndNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool immediately = 9;</code>
     * @return The immediately.
     */
    boolean getImmediately();

    /**
     * <code>.ForwardType forward_type = 2;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 2;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType getForwardType();

    /**
     * <code>uint32 die_state_flag = 4;</code>
     * @return The dieStateFlag.
     */
    int getDieStateFlag();

    /**
     * <code>uint32 entity_id = 6;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 325;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EvtEntityStartDieEndNotify}
   */
  public static final class EvtEntityStartDieEndNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtEntityStartDieEndNotify)
      EvtEntityStartDieEndNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtEntityStartDieEndNotify.newBuilder() to construct.
    private EvtEntityStartDieEndNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtEntityStartDieEndNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtEntityStartDieEndNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.internal_static_EvtEntityStartDieEndNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.internal_static_EvtEntityStartDieEndNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify.class, emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify.Builder.class);
    }

    public static final int IMMEDIATELY_FIELD_NUMBER = 9;
    private boolean immediately_;
    /**
     * <code>bool immediately = 9;</code>
     * @return The immediately.
     */
    @java.lang.Override
    public boolean getImmediately() {
      return immediately_;
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 2;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 2;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 2;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
    }

    public static final int DIE_STATE_FLAG_FIELD_NUMBER = 4;
    private int dieStateFlag_;
    /**
     * <code>uint32 die_state_flag = 4;</code>
     * @return The dieStateFlag.
     */
    @java.lang.Override
    public int getDieStateFlag() {
      return dieStateFlag_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 6;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 6;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (forwardType_ != emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(2, forwardType_);
      }
      if (dieStateFlag_ != 0) {
        output.writeUInt32(4, dieStateFlag_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(6, entityId_);
      }
      if (immediately_ != false) {
        output.writeBool(9, immediately_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (forwardType_ != emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, forwardType_);
      }
      if (dieStateFlag_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, dieStateFlag_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, entityId_);
      }
      if (immediately_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, immediately_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify other = (emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify) obj;

      if (getImmediately()
          != other.getImmediately()) return false;
      if (forwardType_ != other.forwardType_) return false;
      if (getDieStateFlag()
          != other.getDieStateFlag()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      hash = (37 * hash) + IMMEDIATELY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getImmediately());
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (37 * hash) + DIE_STATE_FLAG_FIELD_NUMBER;
      hash = (53 * hash) + getDieStateFlag();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify prototype) {
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
     *   CMD_ID = 325;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EvtEntityStartDieEndNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtEntityStartDieEndNotify)
        emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.internal_static_EvtEntityStartDieEndNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.internal_static_EvtEntityStartDieEndNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify.class, emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        immediately_ = false;

        forwardType_ = 0;

        dieStateFlag_ = 0;

        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.internal_static_EvtEntityStartDieEndNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify build() {
        emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify buildPartial() {
        emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify result = new emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify(this);
        result.immediately_ = immediately_;
        result.forwardType_ = forwardType_;
        result.dieStateFlag_ = dieStateFlag_;
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify other) {
        if (other == emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify.getDefaultInstance()) return this;
        if (other.getImmediately() != false) {
          setImmediately(other.getImmediately());
        }
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
        }
        if (other.getDieStateFlag() != 0) {
          setDieStateFlag(other.getDieStateFlag());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
              case 16: {
                forwardType_ = input.readEnum();

                break;
              } // case 16
              case 32: {
                dieStateFlag_ = input.readUInt32();

                break;
              } // case 32
              case 48: {
                entityId_ = input.readUInt32();

                break;
              } // case 48
              case 72: {
                immediately_ = input.readBool();

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

      private boolean immediately_ ;
      /**
       * <code>bool immediately = 9;</code>
       * @return The immediately.
       */
      @java.lang.Override
      public boolean getImmediately() {
        return immediately_;
      }
      /**
       * <code>bool immediately = 9;</code>
       * @param value The immediately to set.
       * @return This builder for chaining.
       */
      public Builder setImmediately(boolean value) {
        
        immediately_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool immediately = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearImmediately() {
        
        immediately_ = false;
        onChanged();
        return this;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 2;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 2;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 2;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? emu.grasscutter.net.newproto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 2;</code>
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
       * <code>.ForwardType forward_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
        onChanged();
        return this;
      }

      private int dieStateFlag_ ;
      /**
       * <code>uint32 die_state_flag = 4;</code>
       * @return The dieStateFlag.
       */
      @java.lang.Override
      public int getDieStateFlag() {
        return dieStateFlag_;
      }
      /**
       * <code>uint32 die_state_flag = 4;</code>
       * @param value The dieStateFlag to set.
       * @return This builder for chaining.
       */
      public Builder setDieStateFlag(int value) {
        
        dieStateFlag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 die_state_flag = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDieStateFlag() {
        
        dieStateFlag_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 6;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 6;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtEntityStartDieEndNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtEntityStartDieEndNotify)
    private static final emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify();
    }

    public static emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtEntityStartDieEndNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtEntityStartDieEndNotify>() {
      @java.lang.Override
      public EvtEntityStartDieEndNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtEntityStartDieEndNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtEntityStartDieEndNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.EvtEntityStartDieEndNotifyOuterClass.EvtEntityStartDieEndNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtEntityStartDieEndNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtEntityStartDieEndNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n EvtEntityStartDieEndNotify.proto\032\021Forw" +
      "ardType.proto\"\200\001\n\032EvtEntityStartDieEndNo" +
      "tify\022\023\n\013immediately\030\t \001(\010\022\"\n\014forward_typ" +
      "e\030\002 \001(\0162\014.ForwardType\022\026\n\016die_state_flag\030" +
      "\004 \001(\r\022\021\n\tentity_id\030\006 \001(\rB\036\n\034emu.grasscut" +
      "ter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtEntityStartDieEndNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtEntityStartDieEndNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtEntityStartDieEndNotify_descriptor,
        new java.lang.String[] { "Immediately", "ForwardType", "DieStateFlag", "EntityId", });
    emu.grasscutter.net.newproto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
