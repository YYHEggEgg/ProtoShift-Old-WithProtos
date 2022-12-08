// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGSkillPreviewCardInfo.proto

package emu.grasscutter.net.newproto;

public final class GCGSkillPreviewCardInfoOuterClass {
  private GCGSkillPreviewCardInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGSkillPreviewCardInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGSkillPreviewCardInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_guid = 10;</code>
     * @return The cardGuid.
     */
    int getCardGuid();

    /**
     * <code>uint32 face_type = 2;</code>
     * @return The faceType.
     */
    int getFaceType();

    /**
     * <code>uint32 controller_id = 11;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>uint32 card_id = 8;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>.GCGZoneType zone_type = 14;</code>
     * @return The enum numeric value on the wire for zoneType.
     */
    int getZoneTypeValue();
    /**
     * <code>.GCGZoneType zone_type = 14;</code>
     * @return The zoneType.
     */
    emu.grasscutter.net.newproto.GCGZoneTypeOuterClass.GCGZoneType getZoneType();

    /**
     * <code>uint32 owner_card_guid = 3;</code>
     * @return The ownerCardGuid.
     */
    int getOwnerCardGuid();
  }
  /**
   * Protobuf type {@code GCGSkillPreviewCardInfo}
   */
  public static final class GCGSkillPreviewCardInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGSkillPreviewCardInfo)
      GCGSkillPreviewCardInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGSkillPreviewCardInfo.newBuilder() to construct.
    private GCGSkillPreviewCardInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGSkillPreviewCardInfo() {
      zoneType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGSkillPreviewCardInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.internal_static_GCGSkillPreviewCardInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.internal_static_GCGSkillPreviewCardInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo.class, emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo.Builder.class);
    }

    public static final int CARD_GUID_FIELD_NUMBER = 10;
    private int cardGuid_;
    /**
     * <code>uint32 card_guid = 10;</code>
     * @return The cardGuid.
     */
    @java.lang.Override
    public int getCardGuid() {
      return cardGuid_;
    }

    public static final int FACE_TYPE_FIELD_NUMBER = 2;
    private int faceType_;
    /**
     * <code>uint32 face_type = 2;</code>
     * @return The faceType.
     */
    @java.lang.Override
    public int getFaceType() {
      return faceType_;
    }

    public static final int CONTROLLER_ID_FIELD_NUMBER = 11;
    private int controllerId_;
    /**
     * <code>uint32 controller_id = 11;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 8;
    private int cardId_;
    /**
     * <code>uint32 card_id = 8;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
    }

    public static final int ZONE_TYPE_FIELD_NUMBER = 14;
    private int zoneType_;
    /**
     * <code>.GCGZoneType zone_type = 14;</code>
     * @return The enum numeric value on the wire for zoneType.
     */
    @java.lang.Override public int getZoneTypeValue() {
      return zoneType_;
    }
    /**
     * <code>.GCGZoneType zone_type = 14;</code>
     * @return The zoneType.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.GCGZoneTypeOuterClass.GCGZoneType getZoneType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.GCGZoneTypeOuterClass.GCGZoneType result = emu.grasscutter.net.newproto.GCGZoneTypeOuterClass.GCGZoneType.valueOf(zoneType_);
      return result == null ? emu.grasscutter.net.newproto.GCGZoneTypeOuterClass.GCGZoneType.UNRECOGNIZED : result;
    }

    public static final int OWNER_CARD_GUID_FIELD_NUMBER = 3;
    private int ownerCardGuid_;
    /**
     * <code>uint32 owner_card_guid = 3;</code>
     * @return The ownerCardGuid.
     */
    @java.lang.Override
    public int getOwnerCardGuid() {
      return ownerCardGuid_;
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
      if (faceType_ != 0) {
        output.writeUInt32(2, faceType_);
      }
      if (ownerCardGuid_ != 0) {
        output.writeUInt32(3, ownerCardGuid_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(8, cardId_);
      }
      if (cardGuid_ != 0) {
        output.writeUInt32(10, cardGuid_);
      }
      if (controllerId_ != 0) {
        output.writeUInt32(11, controllerId_);
      }
      if (zoneType_ != emu.grasscutter.net.newproto.GCGZoneTypeOuterClass.GCGZoneType.GCG_ZONE_TYPE_INVALID.getNumber()) {
        output.writeEnum(14, zoneType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (faceType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, faceType_);
      }
      if (ownerCardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, ownerCardGuid_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, cardId_);
      }
      if (cardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, cardGuid_);
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, controllerId_);
      }
      if (zoneType_ != emu.grasscutter.net.newproto.GCGZoneTypeOuterClass.GCGZoneType.GCG_ZONE_TYPE_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(14, zoneType_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo other = (emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo) obj;

      if (getCardGuid()
          != other.getCardGuid()) return false;
      if (getFaceType()
          != other.getFaceType()) return false;
      if (getControllerId()
          != other.getControllerId()) return false;
      if (getCardId()
          != other.getCardId()) return false;
      if (zoneType_ != other.zoneType_) return false;
      if (getOwnerCardGuid()
          != other.getOwnerCardGuid()) return false;
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
      hash = (37 * hash) + CARD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getCardGuid();
      hash = (37 * hash) + FACE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getFaceType();
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (37 * hash) + ZONE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + zoneType_;
      hash = (37 * hash) + OWNER_CARD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerCardGuid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo prototype) {
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
     * Protobuf type {@code GCGSkillPreviewCardInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGSkillPreviewCardInfo)
        emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.internal_static_GCGSkillPreviewCardInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.internal_static_GCGSkillPreviewCardInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo.class, emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        cardGuid_ = 0;

        faceType_ = 0;

        controllerId_ = 0;

        cardId_ = 0;

        zoneType_ = 0;

        ownerCardGuid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.internal_static_GCGSkillPreviewCardInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo build() {
        emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo buildPartial() {
        emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo result = new emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo(this);
        result.cardGuid_ = cardGuid_;
        result.faceType_ = faceType_;
        result.controllerId_ = controllerId_;
        result.cardId_ = cardId_;
        result.zoneType_ = zoneType_;
        result.ownerCardGuid_ = ownerCardGuid_;
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
        if (other instanceof emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo other) {
        if (other == emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo.getDefaultInstance()) return this;
        if (other.getCardGuid() != 0) {
          setCardGuid(other.getCardGuid());
        }
        if (other.getFaceType() != 0) {
          setFaceType(other.getFaceType());
        }
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
        }
        if (other.zoneType_ != 0) {
          setZoneTypeValue(other.getZoneTypeValue());
        }
        if (other.getOwnerCardGuid() != 0) {
          setOwnerCardGuid(other.getOwnerCardGuid());
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
                faceType_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                ownerCardGuid_ = input.readUInt32();

                break;
              } // case 24
              case 64: {
                cardId_ = input.readUInt32();

                break;
              } // case 64
              case 80: {
                cardGuid_ = input.readUInt32();

                break;
              } // case 80
              case 88: {
                controllerId_ = input.readUInt32();

                break;
              } // case 88
              case 112: {
                zoneType_ = input.readEnum();

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

      private int cardGuid_ ;
      /**
       * <code>uint32 card_guid = 10;</code>
       * @return The cardGuid.
       */
      @java.lang.Override
      public int getCardGuid() {
        return cardGuid_;
      }
      /**
       * <code>uint32 card_guid = 10;</code>
       * @param value The cardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuid(int value) {
        
        cardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_guid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuid() {
        
        cardGuid_ = 0;
        onChanged();
        return this;
      }

      private int faceType_ ;
      /**
       * <code>uint32 face_type = 2;</code>
       * @return The faceType.
       */
      @java.lang.Override
      public int getFaceType() {
        return faceType_;
      }
      /**
       * <code>uint32 face_type = 2;</code>
       * @param value The faceType to set.
       * @return This builder for chaining.
       */
      public Builder setFaceType(int value) {
        
        faceType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 face_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFaceType() {
        
        faceType_ = 0;
        onChanged();
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 11;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 11;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 8;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 8;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
        return this;
      }

      private int zoneType_ = 0;
      /**
       * <code>.GCGZoneType zone_type = 14;</code>
       * @return The enum numeric value on the wire for zoneType.
       */
      @java.lang.Override public int getZoneTypeValue() {
        return zoneType_;
      }
      /**
       * <code>.GCGZoneType zone_type = 14;</code>
       * @param value The enum numeric value on the wire for zoneType to set.
       * @return This builder for chaining.
       */
      public Builder setZoneTypeValue(int value) {
        
        zoneType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGZoneType zone_type = 14;</code>
       * @return The zoneType.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGZoneTypeOuterClass.GCGZoneType getZoneType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.GCGZoneTypeOuterClass.GCGZoneType result = emu.grasscutter.net.newproto.GCGZoneTypeOuterClass.GCGZoneType.valueOf(zoneType_);
        return result == null ? emu.grasscutter.net.newproto.GCGZoneTypeOuterClass.GCGZoneType.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGZoneType zone_type = 14;</code>
       * @param value The zoneType to set.
       * @return This builder for chaining.
       */
      public Builder setZoneType(emu.grasscutter.net.newproto.GCGZoneTypeOuterClass.GCGZoneType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        zoneType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGZoneType zone_type = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearZoneType() {
        
        zoneType_ = 0;
        onChanged();
        return this;
      }

      private int ownerCardGuid_ ;
      /**
       * <code>uint32 owner_card_guid = 3;</code>
       * @return The ownerCardGuid.
       */
      @java.lang.Override
      public int getOwnerCardGuid() {
        return ownerCardGuid_;
      }
      /**
       * <code>uint32 owner_card_guid = 3;</code>
       * @param value The ownerCardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setOwnerCardGuid(int value) {
        
        ownerCardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 owner_card_guid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearOwnerCardGuid() {
        
        ownerCardGuid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGSkillPreviewCardInfo)
    }

    // @@protoc_insertion_point(class_scope:GCGSkillPreviewCardInfo)
    private static final emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo();
    }

    public static emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGSkillPreviewCardInfo>
        PARSER = new com.google.protobuf.AbstractParser<GCGSkillPreviewCardInfo>() {
      @java.lang.Override
      public GCGSkillPreviewCardInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGSkillPreviewCardInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGSkillPreviewCardInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGSkillPreviewCardInfoOuterClass.GCGSkillPreviewCardInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGSkillPreviewCardInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGSkillPreviewCardInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035GCGSkillPreviewCardInfo.proto\032\021GCGZone" +
      "Type.proto\"\241\001\n\027GCGSkillPreviewCardInfo\022\021" +
      "\n\tcard_guid\030\n \001(\r\022\021\n\tface_type\030\002 \001(\r\022\025\n\r" +
      "controller_id\030\013 \001(\r\022\017\n\007card_id\030\010 \001(\r\022\037\n\t" +
      "zone_type\030\016 \001(\0162\014.GCGZoneType\022\027\n\017owner_c" +
      "ard_guid\030\003 \001(\rB\036\n\034emu.grasscutter.net.ne" +
      "wprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.GCGZoneTypeOuterClass.getDescriptor(),
        });
    internal_static_GCGSkillPreviewCardInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGSkillPreviewCardInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGSkillPreviewCardInfo_descriptor,
        new java.lang.String[] { "CardGuid", "FaceType", "ControllerId", "CardId", "ZoneType", "OwnerCardGuid", });
    emu.grasscutter.net.newproto.GCGZoneTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}