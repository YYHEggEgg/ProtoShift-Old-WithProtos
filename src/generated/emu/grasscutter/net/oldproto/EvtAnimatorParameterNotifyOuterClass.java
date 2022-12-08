// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtAnimatorParameterNotify.proto

package emu.grasscutter.net.oldproto;

public final class EvtAnimatorParameterNotifyOuterClass {
  private EvtAnimatorParameterNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtAnimatorParameterNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtAnimatorParameterNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
     * @return Whether the animatorParamInfo field is set.
     */
    boolean hasAnimatorParamInfo();
    /**
     * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
     * @return The animatorParamInfo.
     */
    emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo getAnimatorParamInfo();
    /**
     * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
     */
    emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder getAnimatorParamInfoOrBuilder();

    /**
     * <code>.ForwardType forward_type = 14;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 14;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType getForwardType();
  }
  /**
   * <pre>
   * CmdId: 398
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code EvtAnimatorParameterNotify}
   */
  public static final class EvtAnimatorParameterNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtAnimatorParameterNotify)
      EvtAnimatorParameterNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtAnimatorParameterNotify.newBuilder() to construct.
    private EvtAnimatorParameterNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtAnimatorParameterNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtAnimatorParameterNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.class, emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.Builder.class);
    }

    public static final int ANIMATOR_PARAM_INFO_FIELD_NUMBER = 12;
    private emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo animatorParamInfo_;
    /**
     * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
     * @return Whether the animatorParamInfo field is set.
     */
    @java.lang.Override
    public boolean hasAnimatorParamInfo() {
      return animatorParamInfo_ != null;
    }
    /**
     * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
     * @return The animatorParamInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo getAnimatorParamInfo() {
      return animatorParamInfo_ == null ? emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.getDefaultInstance() : animatorParamInfo_;
    }
    /**
     * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder getAnimatorParamInfoOrBuilder() {
      return getAnimatorParamInfo();
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 14;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 14;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 14;</code>
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
      if (animatorParamInfo_ != null) {
        output.writeMessage(12, getAnimatorParamInfo());
      }
      if (forwardType_ != emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(14, forwardType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (animatorParamInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getAnimatorParamInfo());
      }
      if (forwardType_ != emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(14, forwardType_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify other = (emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify) obj;

      if (hasAnimatorParamInfo() != other.hasAnimatorParamInfo()) return false;
      if (hasAnimatorParamInfo()) {
        if (!getAnimatorParamInfo()
            .equals(other.getAnimatorParamInfo())) return false;
      }
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
      if (hasAnimatorParamInfo()) {
        hash = (37 * hash) + ANIMATOR_PARAM_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getAnimatorParamInfo().hashCode();
      }
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify prototype) {
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
     * CmdId: 398
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code EvtAnimatorParameterNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtAnimatorParameterNotify)
        emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.class, emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (animatorParamInfoBuilder_ == null) {
          animatorParamInfo_ = null;
        } else {
          animatorParamInfo_ = null;
          animatorParamInfoBuilder_ = null;
        }
        forwardType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify build() {
        emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify buildPartial() {
        emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify result = new emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify(this);
        if (animatorParamInfoBuilder_ == null) {
          result.animatorParamInfo_ = animatorParamInfo_;
        } else {
          result.animatorParamInfo_ = animatorParamInfoBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify other) {
        if (other == emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.getDefaultInstance()) return this;
        if (other.hasAnimatorParamInfo()) {
          mergeAnimatorParamInfo(other.getAnimatorParamInfo());
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
              case 98: {
                input.readMessage(
                    getAnimatorParamInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 98
              case 112: {
                forwardType_ = input.readEnum();

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

      private emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo animatorParamInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo, emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder, emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder> animatorParamInfoBuilder_;
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
       * @return Whether the animatorParamInfo field is set.
       */
      public boolean hasAnimatorParamInfo() {
        return animatorParamInfoBuilder_ != null || animatorParamInfo_ != null;
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
       * @return The animatorParamInfo.
       */
      public emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo getAnimatorParamInfo() {
        if (animatorParamInfoBuilder_ == null) {
          return animatorParamInfo_ == null ? emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.getDefaultInstance() : animatorParamInfo_;
        } else {
          return animatorParamInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
       */
      public Builder setAnimatorParamInfo(emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo value) {
        if (animatorParamInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          animatorParamInfo_ = value;
          onChanged();
        } else {
          animatorParamInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
       */
      public Builder setAnimatorParamInfo(
          emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder builderForValue) {
        if (animatorParamInfoBuilder_ == null) {
          animatorParamInfo_ = builderForValue.build();
          onChanged();
        } else {
          animatorParamInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
       */
      public Builder mergeAnimatorParamInfo(emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo value) {
        if (animatorParamInfoBuilder_ == null) {
          if (animatorParamInfo_ != null) {
            animatorParamInfo_ =
              emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.newBuilder(animatorParamInfo_).mergeFrom(value).buildPartial();
          } else {
            animatorParamInfo_ = value;
          }
          onChanged();
        } else {
          animatorParamInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
       */
      public Builder clearAnimatorParamInfo() {
        if (animatorParamInfoBuilder_ == null) {
          animatorParamInfo_ = null;
          onChanged();
        } else {
          animatorParamInfo_ = null;
          animatorParamInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
       */
      public emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder getAnimatorParamInfoBuilder() {
        
        onChanged();
        return getAnimatorParamInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
       */
      public emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder getAnimatorParamInfoOrBuilder() {
        if (animatorParamInfoBuilder_ != null) {
          return animatorParamInfoBuilder_.getMessageOrBuilder();
        } else {
          return animatorParamInfo_ == null ?
              emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.getDefaultInstance() : animatorParamInfo_;
        }
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo, emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder, emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder> 
          getAnimatorParamInfoFieldBuilder() {
        if (animatorParamInfoBuilder_ == null) {
          animatorParamInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo, emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder, emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder>(
                  getAnimatorParamInfo(),
                  getParentForChildren(),
                  isClean());
          animatorParamInfo_ = null;
        }
        return animatorParamInfoBuilder_;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 14;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 14;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 14;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? emu.grasscutter.net.oldproto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 14;</code>
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
       * <code>.ForwardType forward_type = 14;</code>
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


      // @@protoc_insertion_point(builder_scope:EvtAnimatorParameterNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtAnimatorParameterNotify)
    private static final emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify();
    }

    public static emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtAnimatorParameterNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtAnimatorParameterNotify>() {
      @java.lang.Override
      public EvtAnimatorParameterNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtAnimatorParameterNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtAnimatorParameterNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtAnimatorParameterNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtAnimatorParameterNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n EvtAnimatorParameterNotify.proto\032\036EvtA" +
      "nimatorParameterInfo.proto\032\021ForwardType." +
      "proto\"x\n\032EvtAnimatorParameterNotify\0226\n\023a" +
      "nimator_param_info\030\014 \001(\0132\031.EvtAnimatorPa" +
      "rameterInfo\022\"\n\014forward_type\030\016 \001(\0162\014.Forw" +
      "ardTypeB\036\n\034emu.grasscutter.net.oldprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.getDescriptor(),
          emu.grasscutter.net.oldproto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtAnimatorParameterNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtAnimatorParameterNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtAnimatorParameterNotify_descriptor,
        new java.lang.String[] { "AnimatorParamInfo", "ForwardType", });
    emu.grasscutter.net.oldproto.EvtAnimatorParameterInfoOuterClass.getDescriptor();
    emu.grasscutter.net.oldproto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
