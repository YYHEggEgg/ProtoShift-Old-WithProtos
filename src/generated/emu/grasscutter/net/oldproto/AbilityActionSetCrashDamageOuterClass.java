// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityActionSetCrashDamage.proto

package emu.grasscutter.net.oldproto;

public final class AbilityActionSetCrashDamageOuterClass {
  private AbilityActionSetCrashDamageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityActionSetCrashDamageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityActionSetCrashDamage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector hit_pos = 2;</code>
     * @return Whether the hitPos field is set.
     */
    boolean hasHitPos();
    /**
     * <code>.Vector hit_pos = 2;</code>
     * @return The hitPos.
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.Vector getHitPos();
    /**
     * <code>.Vector hit_pos = 2;</code>
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getHitPosOrBuilder();

    /**
     * <code>float damage = 15;</code>
     * @return The damage.
     */
    float getDamage();
  }
  /**
   * Protobuf type {@code AbilityActionSetCrashDamage}
   */
  public static final class AbilityActionSetCrashDamage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityActionSetCrashDamage)
      AbilityActionSetCrashDamageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityActionSetCrashDamage.newBuilder() to construct.
    private AbilityActionSetCrashDamage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityActionSetCrashDamage() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityActionSetCrashDamage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.internal_static_AbilityActionSetCrashDamage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.internal_static_AbilityActionSetCrashDamage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.class, emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.Builder.class);
    }

    public static final int HIT_POS_FIELD_NUMBER = 2;
    private emu.grasscutter.net.oldproto.VectorOuterClass.Vector hitPos_;
    /**
     * <code>.Vector hit_pos = 2;</code>
     * @return Whether the hitPos field is set.
     */
    @java.lang.Override
    public boolean hasHitPos() {
      return hitPos_ != null;
    }
    /**
     * <code>.Vector hit_pos = 2;</code>
     * @return The hitPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getHitPos() {
      return hitPos_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : hitPos_;
    }
    /**
     * <code>.Vector hit_pos = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getHitPosOrBuilder() {
      return getHitPos();
    }

    public static final int DAMAGE_FIELD_NUMBER = 15;
    private float damage_;
    /**
     * <code>float damage = 15;</code>
     * @return The damage.
     */
    @java.lang.Override
    public float getDamage() {
      return damage_;
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
      if (hitPos_ != null) {
        output.writeMessage(2, getHitPos());
      }
      if (java.lang.Float.floatToRawIntBits(damage_) != 0) {
        output.writeFloat(15, damage_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hitPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getHitPos());
      }
      if (java.lang.Float.floatToRawIntBits(damage_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(15, damage_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage other = (emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage) obj;

      if (hasHitPos() != other.hasHitPos()) return false;
      if (hasHitPos()) {
        if (!getHitPos()
            .equals(other.getHitPos())) return false;
      }
      if (java.lang.Float.floatToIntBits(getDamage())
          != java.lang.Float.floatToIntBits(
              other.getDamage())) return false;
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
      if (hasHitPos()) {
        hash = (37 * hash) + HIT_POS_FIELD_NUMBER;
        hash = (53 * hash) + getHitPos().hashCode();
      }
      hash = (37 * hash) + DAMAGE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getDamage());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage prototype) {
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
     * Protobuf type {@code AbilityActionSetCrashDamage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityActionSetCrashDamage)
        emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.internal_static_AbilityActionSetCrashDamage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.internal_static_AbilityActionSetCrashDamage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.class, emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (hitPosBuilder_ == null) {
          hitPos_ = null;
        } else {
          hitPos_ = null;
          hitPosBuilder_ = null;
        }
        damage_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.internal_static_AbilityActionSetCrashDamage_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage build() {
        emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage buildPartial() {
        emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage result = new emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage(this);
        if (hitPosBuilder_ == null) {
          result.hitPos_ = hitPos_;
        } else {
          result.hitPos_ = hitPosBuilder_.build();
        }
        result.damage_ = damage_;
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
        if (other instanceof emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage) {
          return mergeFrom((emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage other) {
        if (other == emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage.getDefaultInstance()) return this;
        if (other.hasHitPos()) {
          mergeHitPos(other.getHitPos());
        }
        if (other.getDamage() != 0F) {
          setDamage(other.getDamage());
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
                    getHitPosFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 18
              case 125: {
                damage_ = input.readFloat();

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

      private emu.grasscutter.net.oldproto.VectorOuterClass.Vector hitPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> hitPosBuilder_;
      /**
       * <code>.Vector hit_pos = 2;</code>
       * @return Whether the hitPos field is set.
       */
      public boolean hasHitPos() {
        return hitPosBuilder_ != null || hitPos_ != null;
      }
      /**
       * <code>.Vector hit_pos = 2;</code>
       * @return The hitPos.
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getHitPos() {
        if (hitPosBuilder_ == null) {
          return hitPos_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : hitPos_;
        } else {
          return hitPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector hit_pos = 2;</code>
       */
      public Builder setHitPos(emu.grasscutter.net.oldproto.VectorOuterClass.Vector value) {
        if (hitPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hitPos_ = value;
          onChanged();
        } else {
          hitPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector hit_pos = 2;</code>
       */
      public Builder setHitPos(
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (hitPosBuilder_ == null) {
          hitPos_ = builderForValue.build();
          onChanged();
        } else {
          hitPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector hit_pos = 2;</code>
       */
      public Builder mergeHitPos(emu.grasscutter.net.oldproto.VectorOuterClass.Vector value) {
        if (hitPosBuilder_ == null) {
          if (hitPos_ != null) {
            hitPos_ =
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.newBuilder(hitPos_).mergeFrom(value).buildPartial();
          } else {
            hitPos_ = value;
          }
          onChanged();
        } else {
          hitPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector hit_pos = 2;</code>
       */
      public Builder clearHitPos() {
        if (hitPosBuilder_ == null) {
          hitPos_ = null;
          onChanged();
        } else {
          hitPos_ = null;
          hitPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector hit_pos = 2;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder getHitPosBuilder() {
        
        onChanged();
        return getHitPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector hit_pos = 2;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getHitPosOrBuilder() {
        if (hitPosBuilder_ != null) {
          return hitPosBuilder_.getMessageOrBuilder();
        } else {
          return hitPos_ == null ?
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : hitPos_;
        }
      }
      /**
       * <code>.Vector hit_pos = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> 
          getHitPosFieldBuilder() {
        if (hitPosBuilder_ == null) {
          hitPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder>(
                  getHitPos(),
                  getParentForChildren(),
                  isClean());
          hitPos_ = null;
        }
        return hitPosBuilder_;
      }

      private float damage_ ;
      /**
       * <code>float damage = 15;</code>
       * @return The damage.
       */
      @java.lang.Override
      public float getDamage() {
        return damage_;
      }
      /**
       * <code>float damage = 15;</code>
       * @param value The damage to set.
       * @return This builder for chaining.
       */
      public Builder setDamage(float value) {
        
        damage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float damage = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearDamage() {
        
        damage_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:AbilityActionSetCrashDamage)
    }

    // @@protoc_insertion_point(class_scope:AbilityActionSetCrashDamage)
    private static final emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage();
    }

    public static emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityActionSetCrashDamage>
        PARSER = new com.google.protobuf.AbstractParser<AbilityActionSetCrashDamage>() {
      @java.lang.Override
      public AbilityActionSetCrashDamage parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityActionSetCrashDamage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityActionSetCrashDamage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.AbilityActionSetCrashDamageOuterClass.AbilityActionSetCrashDamage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityActionSetCrashDamage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityActionSetCrashDamage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!AbilityActionSetCrashDamage.proto\032\014Vec" +
      "tor.proto\"G\n\033AbilityActionSetCrashDamage" +
      "\022\030\n\007hit_pos\030\002 \001(\0132\007.Vector\022\016\n\006damage\030\017 \001" +
      "(\002B\036\n\034emu.grasscutter.net.oldprotob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_AbilityActionSetCrashDamage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityActionSetCrashDamage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityActionSetCrashDamage_descriptor,
        new java.lang.String[] { "HitPos", "Damage", });
    emu.grasscutter.net.oldproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}