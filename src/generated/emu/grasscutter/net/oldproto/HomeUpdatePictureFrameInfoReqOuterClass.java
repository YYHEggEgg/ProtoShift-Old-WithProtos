// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeUpdatePictureFrameInfoReq.proto

package emu.grasscutter.net.oldproto;

public final class HomeUpdatePictureFrameInfoReqOuterClass {
  private HomeUpdatePictureFrameInfoReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeUpdatePictureFrameInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeUpdatePictureFrameInfoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
     * @return Whether the pictureFrameInfo field is set.
     */
    boolean hasPictureFrameInfo();
    /**
     * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
     * @return The pictureFrameInfo.
     */
    emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo getPictureFrameInfo();
    /**
     * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
     */
    emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfoOrBuilder getPictureFrameInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 4486
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code HomeUpdatePictureFrameInfoReq}
   */
  public static final class HomeUpdatePictureFrameInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeUpdatePictureFrameInfoReq)
      HomeUpdatePictureFrameInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeUpdatePictureFrameInfoReq.newBuilder() to construct.
    private HomeUpdatePictureFrameInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeUpdatePictureFrameInfoReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeUpdatePictureFrameInfoReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.internal_static_HomeUpdatePictureFrameInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.internal_static_HomeUpdatePictureFrameInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq.class, emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq.Builder.class);
    }

    public static final int PICTURE_FRAME_INFO_FIELD_NUMBER = 1;
    private emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo pictureFrameInfo_;
    /**
     * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
     * @return Whether the pictureFrameInfo field is set.
     */
    @java.lang.Override
    public boolean hasPictureFrameInfo() {
      return pictureFrameInfo_ != null;
    }
    /**
     * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
     * @return The pictureFrameInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo getPictureFrameInfo() {
      return pictureFrameInfo_ == null ? emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo.getDefaultInstance() : pictureFrameInfo_;
    }
    /**
     * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfoOrBuilder getPictureFrameInfoOrBuilder() {
      return getPictureFrameInfo();
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
      if (pictureFrameInfo_ != null) {
        output.writeMessage(1, getPictureFrameInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pictureFrameInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getPictureFrameInfo());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq other = (emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq) obj;

      if (hasPictureFrameInfo() != other.hasPictureFrameInfo()) return false;
      if (hasPictureFrameInfo()) {
        if (!getPictureFrameInfo()
            .equals(other.getPictureFrameInfo())) return false;
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
      if (hasPictureFrameInfo()) {
        hash = (37 * hash) + PICTURE_FRAME_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getPictureFrameInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq prototype) {
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
     * CmdId: 4486
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code HomeUpdatePictureFrameInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeUpdatePictureFrameInfoReq)
        emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.internal_static_HomeUpdatePictureFrameInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.internal_static_HomeUpdatePictureFrameInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq.class, emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (pictureFrameInfoBuilder_ == null) {
          pictureFrameInfo_ = null;
        } else {
          pictureFrameInfo_ = null;
          pictureFrameInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.internal_static_HomeUpdatePictureFrameInfoReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq build() {
        emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq buildPartial() {
        emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq result = new emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq(this);
        if (pictureFrameInfoBuilder_ == null) {
          result.pictureFrameInfo_ = pictureFrameInfo_;
        } else {
          result.pictureFrameInfo_ = pictureFrameInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq other) {
        if (other == emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq.getDefaultInstance()) return this;
        if (other.hasPictureFrameInfo()) {
          mergePictureFrameInfo(other.getPictureFrameInfo());
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
                    getPictureFrameInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 10
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

      private emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo pictureFrameInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo, emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo.Builder, emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfoOrBuilder> pictureFrameInfoBuilder_;
      /**
       * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
       * @return Whether the pictureFrameInfo field is set.
       */
      public boolean hasPictureFrameInfo() {
        return pictureFrameInfoBuilder_ != null || pictureFrameInfo_ != null;
      }
      /**
       * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
       * @return The pictureFrameInfo.
       */
      public emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo getPictureFrameInfo() {
        if (pictureFrameInfoBuilder_ == null) {
          return pictureFrameInfo_ == null ? emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo.getDefaultInstance() : pictureFrameInfo_;
        } else {
          return pictureFrameInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
       */
      public Builder setPictureFrameInfo(emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo value) {
        if (pictureFrameInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pictureFrameInfo_ = value;
          onChanged();
        } else {
          pictureFrameInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
       */
      public Builder setPictureFrameInfo(
          emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo.Builder builderForValue) {
        if (pictureFrameInfoBuilder_ == null) {
          pictureFrameInfo_ = builderForValue.build();
          onChanged();
        } else {
          pictureFrameInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
       */
      public Builder mergePictureFrameInfo(emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo value) {
        if (pictureFrameInfoBuilder_ == null) {
          if (pictureFrameInfo_ != null) {
            pictureFrameInfo_ =
              emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo.newBuilder(pictureFrameInfo_).mergeFrom(value).buildPartial();
          } else {
            pictureFrameInfo_ = value;
          }
          onChanged();
        } else {
          pictureFrameInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
       */
      public Builder clearPictureFrameInfo() {
        if (pictureFrameInfoBuilder_ == null) {
          pictureFrameInfo_ = null;
          onChanged();
        } else {
          pictureFrameInfo_ = null;
          pictureFrameInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
       */
      public emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo.Builder getPictureFrameInfoBuilder() {
        
        onChanged();
        return getPictureFrameInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
       */
      public emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfoOrBuilder getPictureFrameInfoOrBuilder() {
        if (pictureFrameInfoBuilder_ != null) {
          return pictureFrameInfoBuilder_.getMessageOrBuilder();
        } else {
          return pictureFrameInfo_ == null ?
              emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo.getDefaultInstance() : pictureFrameInfo_;
        }
      }
      /**
       * <code>.HomePictureFrameInfo picture_frame_info = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo, emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo.Builder, emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfoOrBuilder> 
          getPictureFrameInfoFieldBuilder() {
        if (pictureFrameInfoBuilder_ == null) {
          pictureFrameInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo, emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo.Builder, emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.HomePictureFrameInfoOrBuilder>(
                  getPictureFrameInfo(),
                  getParentForChildren(),
                  isClean());
          pictureFrameInfo_ = null;
        }
        return pictureFrameInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeUpdatePictureFrameInfoReq)
    }

    // @@protoc_insertion_point(class_scope:HomeUpdatePictureFrameInfoReq)
    private static final emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq();
    }

    public static emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeUpdatePictureFrameInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeUpdatePictureFrameInfoReq>() {
      @java.lang.Override
      public HomeUpdatePictureFrameInfoReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeUpdatePictureFrameInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeUpdatePictureFrameInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeUpdatePictureFrameInfoReqOuterClass.HomeUpdatePictureFrameInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeUpdatePictureFrameInfoReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeUpdatePictureFrameInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#HomeUpdatePictureFrameInfoReq.proto\032\032H" +
      "omePictureFrameInfo.proto\"R\n\035HomeUpdateP" +
      "ictureFrameInfoReq\0221\n\022picture_frame_info" +
      "\030\001 \001(\0132\025.HomePictureFrameInfoB\036\n\034emu.gra" +
      "sscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeUpdatePictureFrameInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeUpdatePictureFrameInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeUpdatePictureFrameInfoReq_descriptor,
        new java.lang.String[] { "PictureFrameInfo", });
    emu.grasscutter.net.oldproto.HomePictureFrameInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
