// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarPropChangeReasonNotify.proto

package emu.grasscutter.net.oldproto;

public final class AvatarPropChangeReasonNotifyOuterClass {
  private AvatarPropChangeReasonNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarPropChangeReasonNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarPropChangeReasonNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float old_value = 11;</code>
     * @return The oldValue.
     */
    float getOldValue();

    /**
     * <code>.PropChangeReason reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.PropChangeReason reason = 5;</code>
     * @return The reason.
     */
    emu.grasscutter.net.oldproto.PropChangeReasonOuterClass.PropChangeReason getReason();

    /**
     * <code>uint32 prop_type = 1;</code>
     * @return The propType.
     */
    int getPropType();

    /**
     * <code>uint64 avatar_guid = 8;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>float cur_value = 15;</code>
     * @return The curValue.
     */
    float getCurValue();
  }
  /**
   * <pre>
   * CmdId: 1273
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code AvatarPropChangeReasonNotify}
   */
  public static final class AvatarPropChangeReasonNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarPropChangeReasonNotify)
      AvatarPropChangeReasonNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarPropChangeReasonNotify.newBuilder() to construct.
    private AvatarPropChangeReasonNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarPropChangeReasonNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarPropChangeReasonNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.internal_static_AvatarPropChangeReasonNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.internal_static_AvatarPropChangeReasonNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.class, emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.Builder.class);
    }

    public static final int OLD_VALUE_FIELD_NUMBER = 11;
    private float oldValue_;
    /**
     * <code>float old_value = 11;</code>
     * @return The oldValue.
     */
    @java.lang.Override
    public float getOldValue() {
      return oldValue_;
    }

    public static final int REASON_FIELD_NUMBER = 5;
    private int reason_;
    /**
     * <code>.PropChangeReason reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.PropChangeReason reason = 5;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.PropChangeReasonOuterClass.PropChangeReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.PropChangeReasonOuterClass.PropChangeReason result = emu.grasscutter.net.oldproto.PropChangeReasonOuterClass.PropChangeReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.oldproto.PropChangeReasonOuterClass.PropChangeReason.UNRECOGNIZED : result;
    }

    public static final int PROP_TYPE_FIELD_NUMBER = 1;
    private int propType_;
    /**
     * <code>uint32 prop_type = 1;</code>
     * @return The propType.
     */
    @java.lang.Override
    public int getPropType() {
      return propType_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 8;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 8;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int CUR_VALUE_FIELD_NUMBER = 15;
    private float curValue_;
    /**
     * <code>float cur_value = 15;</code>
     * @return The curValue.
     */
    @java.lang.Override
    public float getCurValue() {
      return curValue_;
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
      if (propType_ != 0) {
        output.writeUInt32(1, propType_);
      }
      if (reason_ != emu.grasscutter.net.oldproto.PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_NONE.getNumber()) {
        output.writeEnum(5, reason_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(8, avatarGuid_);
      }
      if (java.lang.Float.floatToRawIntBits(oldValue_) != 0) {
        output.writeFloat(11, oldValue_);
      }
      if (java.lang.Float.floatToRawIntBits(curValue_) != 0) {
        output.writeFloat(15, curValue_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (propType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, propType_);
      }
      if (reason_ != emu.grasscutter.net.oldproto.PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, reason_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, avatarGuid_);
      }
      if (java.lang.Float.floatToRawIntBits(oldValue_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(11, oldValue_);
      }
      if (java.lang.Float.floatToRawIntBits(curValue_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(15, curValue_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify other = (emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify) obj;

      if (java.lang.Float.floatToIntBits(getOldValue())
          != java.lang.Float.floatToIntBits(
              other.getOldValue())) return false;
      if (reason_ != other.reason_) return false;
      if (getPropType()
          != other.getPropType()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (java.lang.Float.floatToIntBits(getCurValue())
          != java.lang.Float.floatToIntBits(
              other.getCurValue())) return false;
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
      hash = (37 * hash) + OLD_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getOldValue());
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + PROP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getPropType();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + CUR_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCurValue());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify prototype) {
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
     * CmdId: 1273
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code AvatarPropChangeReasonNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarPropChangeReasonNotify)
        emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.internal_static_AvatarPropChangeReasonNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.internal_static_AvatarPropChangeReasonNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.class, emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        oldValue_ = 0F;

        reason_ = 0;

        propType_ = 0;

        avatarGuid_ = 0L;

        curValue_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.internal_static_AvatarPropChangeReasonNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify build() {
        emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify buildPartial() {
        emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify result = new emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify(this);
        result.oldValue_ = oldValue_;
        result.reason_ = reason_;
        result.propType_ = propType_;
        result.avatarGuid_ = avatarGuid_;
        result.curValue_ = curValue_;
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
        if (other instanceof emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify other) {
        if (other == emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify.getDefaultInstance()) return this;
        if (other.getOldValue() != 0F) {
          setOldValue(other.getOldValue());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getPropType() != 0) {
          setPropType(other.getPropType());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getCurValue() != 0F) {
          setCurValue(other.getCurValue());
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
                propType_ = input.readUInt32();

                break;
              } // case 8
              case 40: {
                reason_ = input.readEnum();

                break;
              } // case 40
              case 64: {
                avatarGuid_ = input.readUInt64();

                break;
              } // case 64
              case 93: {
                oldValue_ = input.readFloat();

                break;
              } // case 93
              case 125: {
                curValue_ = input.readFloat();

                break;
              } // case 125
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

      private float oldValue_ ;
      /**
       * <code>float old_value = 11;</code>
       * @return The oldValue.
       */
      @java.lang.Override
      public float getOldValue() {
        return oldValue_;
      }
      /**
       * <code>float old_value = 11;</code>
       * @param value The oldValue to set.
       * @return This builder for chaining.
       */
      public Builder setOldValue(float value) {
        
        oldValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float old_value = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearOldValue() {
        
        oldValue_ = 0F;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.PropChangeReason reason = 5;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.PropChangeReason reason = 5;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PropChangeReason reason = 5;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.PropChangeReasonOuterClass.PropChangeReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.PropChangeReasonOuterClass.PropChangeReason result = emu.grasscutter.net.oldproto.PropChangeReasonOuterClass.PropChangeReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.oldproto.PropChangeReasonOuterClass.PropChangeReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.PropChangeReason reason = 5;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.oldproto.PropChangeReasonOuterClass.PropChangeReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PropChangeReason reason = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int propType_ ;
      /**
       * <code>uint32 prop_type = 1;</code>
       * @return The propType.
       */
      @java.lang.Override
      public int getPropType() {
        return propType_;
      }
      /**
       * <code>uint32 prop_type = 1;</code>
       * @param value The propType to set.
       * @return This builder for chaining.
       */
      public Builder setPropType(int value) {
        
        propType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 prop_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPropType() {
        
        propType_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 8;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 8;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private float curValue_ ;
      /**
       * <code>float cur_value = 15;</code>
       * @return The curValue.
       */
      @java.lang.Override
      public float getCurValue() {
        return curValue_;
      }
      /**
       * <code>float cur_value = 15;</code>
       * @param value The curValue to set.
       * @return This builder for chaining.
       */
      public Builder setCurValue(float value) {
        
        curValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float cur_value = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurValue() {
        
        curValue_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:AvatarPropChangeReasonNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarPropChangeReasonNotify)
    private static final emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify();
    }

    public static emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarPropChangeReasonNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarPropChangeReasonNotify>() {
      @java.lang.Override
      public AvatarPropChangeReasonNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarPropChangeReasonNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarPropChangeReasonNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.AvatarPropChangeReasonNotifyOuterClass.AvatarPropChangeReasonNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarPropChangeReasonNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarPropChangeReasonNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"AvatarPropChangeReasonNotify.proto\032\026Pr" +
      "opChangeReason.proto\"\217\001\n\034AvatarPropChang" +
      "eReasonNotify\022\021\n\told_value\030\013 \001(\002\022!\n\006reas" +
      "on\030\005 \001(\0162\021.PropChangeReason\022\021\n\tprop_type" +
      "\030\001 \001(\r\022\023\n\013avatar_guid\030\010 \001(\004\022\021\n\tcur_value" +
      "\030\017 \001(\002B\036\n\034emu.grasscutter.net.oldprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.PropChangeReasonOuterClass.getDescriptor(),
        });
    internal_static_AvatarPropChangeReasonNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarPropChangeReasonNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarPropChangeReasonNotify_descriptor,
        new java.lang.String[] { "OldValue", "Reason", "PropType", "AvatarGuid", "CurValue", });
    emu.grasscutter.net.oldproto.PropChangeReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}