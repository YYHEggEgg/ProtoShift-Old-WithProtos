// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMixinShootFromCamera.proto

package emu.grasscutter.net.newproto;

public final class AbilityMixinShootFromCameraOuterClass {
  private AbilityMixinShootFromCameraOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMixinShootFromCameraOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMixinShootFromCamera)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector forward = 13;</code>
     * @return Whether the forward field is set.
     */
    boolean hasForward();
    /**
     * <code>.Vector forward = 13;</code>
     * @return The forward.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getForward();
    /**
     * <code>.Vector forward = 13;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getForwardOrBuilder();

    /**
     * <code>.Vector init_pos = 9;</code>
     * @return Whether the initPos field is set.
     */
    boolean hasInitPos();
    /**
     * <code>.Vector init_pos = 9;</code>
     * @return The initPos.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getInitPos();
    /**
     * <code>.Vector init_pos = 9;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getInitPosOrBuilder();
  }
  /**
   * Protobuf type {@code AbilityMixinShootFromCamera}
   */
  public static final class AbilityMixinShootFromCamera extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMixinShootFromCamera)
      AbilityMixinShootFromCameraOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMixinShootFromCamera.newBuilder() to construct.
    private AbilityMixinShootFromCamera(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMixinShootFromCamera() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMixinShootFromCamera();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.internal_static_AbilityMixinShootFromCamera_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.internal_static_AbilityMixinShootFromCamera_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera.class, emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera.Builder.class);
    }

    public static final int FORWARD_FIELD_NUMBER = 13;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector forward_;
    /**
     * <code>.Vector forward = 13;</code>
     * @return Whether the forward field is set.
     */
    @java.lang.Override
    public boolean hasForward() {
      return forward_ != null;
    }
    /**
     * <code>.Vector forward = 13;</code>
     * @return The forward.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getForward() {
      return forward_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : forward_;
    }
    /**
     * <code>.Vector forward = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getForwardOrBuilder() {
      return getForward();
    }

    public static final int INIT_POS_FIELD_NUMBER = 9;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector initPos_;
    /**
     * <code>.Vector init_pos = 9;</code>
     * @return Whether the initPos field is set.
     */
    @java.lang.Override
    public boolean hasInitPos() {
      return initPos_ != null;
    }
    /**
     * <code>.Vector init_pos = 9;</code>
     * @return The initPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getInitPos() {
      return initPos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : initPos_;
    }
    /**
     * <code>.Vector init_pos = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getInitPosOrBuilder() {
      return getInitPos();
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
      if (initPos_ != null) {
        output.writeMessage(9, getInitPos());
      }
      if (forward_ != null) {
        output.writeMessage(13, getForward());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (initPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getInitPos());
      }
      if (forward_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getForward());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera other = (emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera) obj;

      if (hasForward() != other.hasForward()) return false;
      if (hasForward()) {
        if (!getForward()
            .equals(other.getForward())) return false;
      }
      if (hasInitPos() != other.hasInitPos()) return false;
      if (hasInitPos()) {
        if (!getInitPos()
            .equals(other.getInitPos())) return false;
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
      if (hasForward()) {
        hash = (37 * hash) + FORWARD_FIELD_NUMBER;
        hash = (53 * hash) + getForward().hashCode();
      }
      if (hasInitPos()) {
        hash = (37 * hash) + INIT_POS_FIELD_NUMBER;
        hash = (53 * hash) + getInitPos().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera prototype) {
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
     * Protobuf type {@code AbilityMixinShootFromCamera}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMixinShootFromCamera)
        emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCameraOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.internal_static_AbilityMixinShootFromCamera_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.internal_static_AbilityMixinShootFromCamera_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera.class, emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (forwardBuilder_ == null) {
          forward_ = null;
        } else {
          forward_ = null;
          forwardBuilder_ = null;
        }
        if (initPosBuilder_ == null) {
          initPos_ = null;
        } else {
          initPos_ = null;
          initPosBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.internal_static_AbilityMixinShootFromCamera_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera build() {
        emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera buildPartial() {
        emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera result = new emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera(this);
        if (forwardBuilder_ == null) {
          result.forward_ = forward_;
        } else {
          result.forward_ = forwardBuilder_.build();
        }
        if (initPosBuilder_ == null) {
          result.initPos_ = initPos_;
        } else {
          result.initPos_ = initPosBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera) {
          return mergeFrom((emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera other) {
        if (other == emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera.getDefaultInstance()) return this;
        if (other.hasForward()) {
          mergeForward(other.getForward());
        }
        if (other.hasInitPos()) {
          mergeInitPos(other.getInitPos());
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
              case 74: {
                input.readMessage(
                    getInitPosFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 74
              case 106: {
                input.readMessage(
                    getForwardFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 106
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

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector forward_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> forwardBuilder_;
      /**
       * <code>.Vector forward = 13;</code>
       * @return Whether the forward field is set.
       */
      public boolean hasForward() {
        return forwardBuilder_ != null || forward_ != null;
      }
      /**
       * <code>.Vector forward = 13;</code>
       * @return The forward.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getForward() {
        if (forwardBuilder_ == null) {
          return forward_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : forward_;
        } else {
          return forwardBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector forward = 13;</code>
       */
      public Builder setForward(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (forwardBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          forward_ = value;
          onChanged();
        } else {
          forwardBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector forward = 13;</code>
       */
      public Builder setForward(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (forwardBuilder_ == null) {
          forward_ = builderForValue.build();
          onChanged();
        } else {
          forwardBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector forward = 13;</code>
       */
      public Builder mergeForward(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (forwardBuilder_ == null) {
          if (forward_ != null) {
            forward_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(forward_).mergeFrom(value).buildPartial();
          } else {
            forward_ = value;
          }
          onChanged();
        } else {
          forwardBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector forward = 13;</code>
       */
      public Builder clearForward() {
        if (forwardBuilder_ == null) {
          forward_ = null;
          onChanged();
        } else {
          forward_ = null;
          forwardBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector forward = 13;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getForwardBuilder() {
        
        onChanged();
        return getForwardFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector forward = 13;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getForwardOrBuilder() {
        if (forwardBuilder_ != null) {
          return forwardBuilder_.getMessageOrBuilder();
        } else {
          return forward_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : forward_;
        }
      }
      /**
       * <code>.Vector forward = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getForwardFieldBuilder() {
        if (forwardBuilder_ == null) {
          forwardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getForward(),
                  getParentForChildren(),
                  isClean());
          forward_ = null;
        }
        return forwardBuilder_;
      }

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector initPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> initPosBuilder_;
      /**
       * <code>.Vector init_pos = 9;</code>
       * @return Whether the initPos field is set.
       */
      public boolean hasInitPos() {
        return initPosBuilder_ != null || initPos_ != null;
      }
      /**
       * <code>.Vector init_pos = 9;</code>
       * @return The initPos.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getInitPos() {
        if (initPosBuilder_ == null) {
          return initPos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : initPos_;
        } else {
          return initPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector init_pos = 9;</code>
       */
      public Builder setInitPos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (initPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          initPos_ = value;
          onChanged();
        } else {
          initPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector init_pos = 9;</code>
       */
      public Builder setInitPos(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (initPosBuilder_ == null) {
          initPos_ = builderForValue.build();
          onChanged();
        } else {
          initPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector init_pos = 9;</code>
       */
      public Builder mergeInitPos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (initPosBuilder_ == null) {
          if (initPos_ != null) {
            initPos_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(initPos_).mergeFrom(value).buildPartial();
          } else {
            initPos_ = value;
          }
          onChanged();
        } else {
          initPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector init_pos = 9;</code>
       */
      public Builder clearInitPos() {
        if (initPosBuilder_ == null) {
          initPos_ = null;
          onChanged();
        } else {
          initPos_ = null;
          initPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector init_pos = 9;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getInitPosBuilder() {
        
        onChanged();
        return getInitPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector init_pos = 9;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getInitPosOrBuilder() {
        if (initPosBuilder_ != null) {
          return initPosBuilder_.getMessageOrBuilder();
        } else {
          return initPos_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : initPos_;
        }
      }
      /**
       * <code>.Vector init_pos = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getInitPosFieldBuilder() {
        if (initPosBuilder_ == null) {
          initPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getInitPos(),
                  getParentForChildren(),
                  isClean());
          initPos_ = null;
        }
        return initPosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AbilityMixinShootFromCamera)
    }

    // @@protoc_insertion_point(class_scope:AbilityMixinShootFromCamera)
    private static final emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera();
    }

    public static emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMixinShootFromCamera>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMixinShootFromCamera>() {
      @java.lang.Override
      public AbilityMixinShootFromCamera parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityMixinShootFromCamera> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMixinShootFromCamera> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.AbilityMixinShootFromCameraOuterClass.AbilityMixinShootFromCamera getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMixinShootFromCamera_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMixinShootFromCamera_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!AbilityMixinShootFromCamera.proto\032\014Vec" +
      "tor.proto\"R\n\033AbilityMixinShootFromCamera" +
      "\022\030\n\007forward\030\r \001(\0132\007.Vector\022\031\n\010init_pos\030\t" +
      " \001(\0132\007.VectorB\036\n\034emu.grasscutter.net.new" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_AbilityMixinShootFromCamera_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMixinShootFromCamera_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMixinShootFromCamera_descriptor,
        new java.lang.String[] { "Forward", "InitPos", });
    emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
