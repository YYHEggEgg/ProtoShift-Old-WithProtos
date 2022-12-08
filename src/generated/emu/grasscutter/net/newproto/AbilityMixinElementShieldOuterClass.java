// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMixinElementShield.proto

package emu.grasscutter.net.newproto;

public final class AbilityMixinElementShieldOuterClass {
  private AbilityMixinElementShieldOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMixinElementShieldOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMixinElementShield)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 player_num = 9;</code>
     * @return The playerNum.
     */
    int getPlayerNum();

    /**
     * <code>float shield = 5;</code>
     * @return The shield.
     */
    float getShield();

    /**
     * <code>bool is_shield_broken = 8;</code>
     * @return The isShieldBroken.
     */
    boolean getIsShieldBroken();

    /**
     * <code>float sub_shield = 4;</code>
     * @return The subShield.
     */
    float getSubShield();

    /**
     * <code>float max_shield = 13;</code>
     * @return The maxShield.
     */
    float getMaxShield();

    /**
     * <code>uint32 absorb_type = 10;</code>
     * @return The absorbType.
     */
    int getAbsorbType();
  }
  /**
   * Protobuf type {@code AbilityMixinElementShield}
   */
  public static final class AbilityMixinElementShield extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMixinElementShield)
      AbilityMixinElementShieldOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMixinElementShield.newBuilder() to construct.
    private AbilityMixinElementShield(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMixinElementShield() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMixinElementShield();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.internal_static_AbilityMixinElementShield_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.internal_static_AbilityMixinElementShield_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield.class, emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield.Builder.class);
    }

    public static final int PLAYER_NUM_FIELD_NUMBER = 9;
    private int playerNum_;
    /**
     * <code>uint32 player_num = 9;</code>
     * @return The playerNum.
     */
    @java.lang.Override
    public int getPlayerNum() {
      return playerNum_;
    }

    public static final int SHIELD_FIELD_NUMBER = 5;
    private float shield_;
    /**
     * <code>float shield = 5;</code>
     * @return The shield.
     */
    @java.lang.Override
    public float getShield() {
      return shield_;
    }

    public static final int IS_SHIELD_BROKEN_FIELD_NUMBER = 8;
    private boolean isShieldBroken_;
    /**
     * <code>bool is_shield_broken = 8;</code>
     * @return The isShieldBroken.
     */
    @java.lang.Override
    public boolean getIsShieldBroken() {
      return isShieldBroken_;
    }

    public static final int SUB_SHIELD_FIELD_NUMBER = 4;
    private float subShield_;
    /**
     * <code>float sub_shield = 4;</code>
     * @return The subShield.
     */
    @java.lang.Override
    public float getSubShield() {
      return subShield_;
    }

    public static final int MAX_SHIELD_FIELD_NUMBER = 13;
    private float maxShield_;
    /**
     * <code>float max_shield = 13;</code>
     * @return The maxShield.
     */
    @java.lang.Override
    public float getMaxShield() {
      return maxShield_;
    }

    public static final int ABSORB_TYPE_FIELD_NUMBER = 10;
    private int absorbType_;
    /**
     * <code>uint32 absorb_type = 10;</code>
     * @return The absorbType.
     */
    @java.lang.Override
    public int getAbsorbType() {
      return absorbType_;
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
      if (java.lang.Float.floatToRawIntBits(subShield_) != 0) {
        output.writeFloat(4, subShield_);
      }
      if (java.lang.Float.floatToRawIntBits(shield_) != 0) {
        output.writeFloat(5, shield_);
      }
      if (isShieldBroken_ != false) {
        output.writeBool(8, isShieldBroken_);
      }
      if (playerNum_ != 0) {
        output.writeUInt32(9, playerNum_);
      }
      if (absorbType_ != 0) {
        output.writeUInt32(10, absorbType_);
      }
      if (java.lang.Float.floatToRawIntBits(maxShield_) != 0) {
        output.writeFloat(13, maxShield_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(subShield_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, subShield_);
      }
      if (java.lang.Float.floatToRawIntBits(shield_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, shield_);
      }
      if (isShieldBroken_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isShieldBroken_);
      }
      if (playerNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, playerNum_);
      }
      if (absorbType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, absorbType_);
      }
      if (java.lang.Float.floatToRawIntBits(maxShield_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(13, maxShield_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield other = (emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield) obj;

      if (getPlayerNum()
          != other.getPlayerNum()) return false;
      if (java.lang.Float.floatToIntBits(getShield())
          != java.lang.Float.floatToIntBits(
              other.getShield())) return false;
      if (getIsShieldBroken()
          != other.getIsShieldBroken()) return false;
      if (java.lang.Float.floatToIntBits(getSubShield())
          != java.lang.Float.floatToIntBits(
              other.getSubShield())) return false;
      if (java.lang.Float.floatToIntBits(getMaxShield())
          != java.lang.Float.floatToIntBits(
              other.getMaxShield())) return false;
      if (getAbsorbType()
          != other.getAbsorbType()) return false;
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
      hash = (37 * hash) + PLAYER_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerNum();
      hash = (37 * hash) + SHIELD_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getShield());
      hash = (37 * hash) + IS_SHIELD_BROKEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsShieldBroken());
      hash = (37 * hash) + SUB_SHIELD_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getSubShield());
      hash = (37 * hash) + MAX_SHIELD_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getMaxShield());
      hash = (37 * hash) + ABSORB_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getAbsorbType();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield prototype) {
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
     * Protobuf type {@code AbilityMixinElementShield}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMixinElementShield)
        emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShieldOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.internal_static_AbilityMixinElementShield_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.internal_static_AbilityMixinElementShield_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield.class, emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        playerNum_ = 0;

        shield_ = 0F;

        isShieldBroken_ = false;

        subShield_ = 0F;

        maxShield_ = 0F;

        absorbType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.internal_static_AbilityMixinElementShield_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield build() {
        emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield buildPartial() {
        emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield result = new emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield(this);
        result.playerNum_ = playerNum_;
        result.shield_ = shield_;
        result.isShieldBroken_ = isShieldBroken_;
        result.subShield_ = subShield_;
        result.maxShield_ = maxShield_;
        result.absorbType_ = absorbType_;
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
        if (other instanceof emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield) {
          return mergeFrom((emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield other) {
        if (other == emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield.getDefaultInstance()) return this;
        if (other.getPlayerNum() != 0) {
          setPlayerNum(other.getPlayerNum());
        }
        if (other.getShield() != 0F) {
          setShield(other.getShield());
        }
        if (other.getIsShieldBroken() != false) {
          setIsShieldBroken(other.getIsShieldBroken());
        }
        if (other.getSubShield() != 0F) {
          setSubShield(other.getSubShield());
        }
        if (other.getMaxShield() != 0F) {
          setMaxShield(other.getMaxShield());
        }
        if (other.getAbsorbType() != 0) {
          setAbsorbType(other.getAbsorbType());
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
              case 37: {
                subShield_ = input.readFloat();

                break;
              } // case 37
              case 45: {
                shield_ = input.readFloat();

                break;
              } // case 45
              case 64: {
                isShieldBroken_ = input.readBool();

                break;
              } // case 64
              case 72: {
                playerNum_ = input.readUInt32();

                break;
              } // case 72
              case 80: {
                absorbType_ = input.readUInt32();

                break;
              } // case 80
              case 109: {
                maxShield_ = input.readFloat();

                break;
              } // case 109
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

      private int playerNum_ ;
      /**
       * <code>uint32 player_num = 9;</code>
       * @return The playerNum.
       */
      @java.lang.Override
      public int getPlayerNum() {
        return playerNum_;
      }
      /**
       * <code>uint32 player_num = 9;</code>
       * @param value The playerNum to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerNum(int value) {
        
        playerNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 player_num = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerNum() {
        
        playerNum_ = 0;
        onChanged();
        return this;
      }

      private float shield_ ;
      /**
       * <code>float shield = 5;</code>
       * @return The shield.
       */
      @java.lang.Override
      public float getShield() {
        return shield_;
      }
      /**
       * <code>float shield = 5;</code>
       * @param value The shield to set.
       * @return This builder for chaining.
       */
      public Builder setShield(float value) {
        
        shield_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float shield = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearShield() {
        
        shield_ = 0F;
        onChanged();
        return this;
      }

      private boolean isShieldBroken_ ;
      /**
       * <code>bool is_shield_broken = 8;</code>
       * @return The isShieldBroken.
       */
      @java.lang.Override
      public boolean getIsShieldBroken() {
        return isShieldBroken_;
      }
      /**
       * <code>bool is_shield_broken = 8;</code>
       * @param value The isShieldBroken to set.
       * @return This builder for chaining.
       */
      public Builder setIsShieldBroken(boolean value) {
        
        isShieldBroken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_shield_broken = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsShieldBroken() {
        
        isShieldBroken_ = false;
        onChanged();
        return this;
      }

      private float subShield_ ;
      /**
       * <code>float sub_shield = 4;</code>
       * @return The subShield.
       */
      @java.lang.Override
      public float getSubShield() {
        return subShield_;
      }
      /**
       * <code>float sub_shield = 4;</code>
       * @param value The subShield to set.
       * @return This builder for chaining.
       */
      public Builder setSubShield(float value) {
        
        subShield_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float sub_shield = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSubShield() {
        
        subShield_ = 0F;
        onChanged();
        return this;
      }

      private float maxShield_ ;
      /**
       * <code>float max_shield = 13;</code>
       * @return The maxShield.
       */
      @java.lang.Override
      public float getMaxShield() {
        return maxShield_;
      }
      /**
       * <code>float max_shield = 13;</code>
       * @param value The maxShield to set.
       * @return This builder for chaining.
       */
      public Builder setMaxShield(float value) {
        
        maxShield_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float max_shield = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxShield() {
        
        maxShield_ = 0F;
        onChanged();
        return this;
      }

      private int absorbType_ ;
      /**
       * <code>uint32 absorb_type = 10;</code>
       * @return The absorbType.
       */
      @java.lang.Override
      public int getAbsorbType() {
        return absorbType_;
      }
      /**
       * <code>uint32 absorb_type = 10;</code>
       * @param value The absorbType to set.
       * @return This builder for chaining.
       */
      public Builder setAbsorbType(int value) {
        
        absorbType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 absorb_type = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearAbsorbType() {
        
        absorbType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AbilityMixinElementShield)
    }

    // @@protoc_insertion_point(class_scope:AbilityMixinElementShield)
    private static final emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield();
    }

    public static emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMixinElementShield>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMixinElementShield>() {
      @java.lang.Override
      public AbilityMixinElementShield parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityMixinElementShield> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMixinElementShield> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.AbilityMixinElementShieldOuterClass.AbilityMixinElementShield getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMixinElementShield_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMixinElementShield_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037AbilityMixinElementShield.proto\"\226\001\n\031Ab" +
      "ilityMixinElementShield\022\022\n\nplayer_num\030\t " +
      "\001(\r\022\016\n\006shield\030\005 \001(\002\022\030\n\020is_shield_broken\030" +
      "\010 \001(\010\022\022\n\nsub_shield\030\004 \001(\002\022\022\n\nmax_shield\030" +
      "\r \001(\002\022\023\n\013absorb_type\030\n \001(\rB\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityMixinElementShield_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMixinElementShield_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMixinElementShield_descriptor,
        new java.lang.String[] { "PlayerNum", "Shield", "IsShieldBroken", "SubShield", "MaxShield", "AbsorbType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
