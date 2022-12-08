// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalvageEscortSettleNotify.proto

package emu.grasscutter.net.oldproto;

public final class SalvageEscortSettleNotifyOuterClass {
  private SalvageEscortSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SalvageEscortSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SalvageEscortSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 14;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
     * @return Whether the settleInfo field is set.
     */
    boolean hasSettleInfo();
    /**
     * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
     * @return The settleInfo.
     */
    emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo getSettleInfo();
    /**
     * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
     */
    emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfoOrBuilder getSettleInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 8499
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code SalvageEscortSettleNotify}
   */
  public static final class SalvageEscortSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SalvageEscortSettleNotify)
      SalvageEscortSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SalvageEscortSettleNotify.newBuilder() to construct.
    private SalvageEscortSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SalvageEscortSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SalvageEscortSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.internal_static_SalvageEscortSettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.internal_static_SalvageEscortSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify.class, emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 14;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 14;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int SETTLE_INFO_FIELD_NUMBER = 15;
    private emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo settleInfo_;
    /**
     * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
     * @return Whether the settleInfo field is set.
     */
    @java.lang.Override
    public boolean hasSettleInfo() {
      return settleInfo_ != null;
    }
    /**
     * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
     * @return The settleInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo getSettleInfo() {
      return settleInfo_ == null ? emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.getDefaultInstance() : settleInfo_;
    }
    /**
     * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfoOrBuilder getSettleInfoOrBuilder() {
      return getSettleInfo();
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
      if (galleryId_ != 0) {
        output.writeUInt32(14, galleryId_);
      }
      if (settleInfo_ != null) {
        output.writeMessage(15, getSettleInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, galleryId_);
      }
      if (settleInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getSettleInfo());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify other = (emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (hasSettleInfo() != other.hasSettleInfo()) return false;
      if (hasSettleInfo()) {
        if (!getSettleInfo()
            .equals(other.getSettleInfo())) return false;
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
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      if (hasSettleInfo()) {
        hash = (37 * hash) + SETTLE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSettleInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify prototype) {
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
     * CmdId: 8499
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code SalvageEscortSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SalvageEscortSettleNotify)
        emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.internal_static_SalvageEscortSettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.internal_static_SalvageEscortSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify.class, emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        galleryId_ = 0;

        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.internal_static_SalvageEscortSettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify build() {
        emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify buildPartial() {
        emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify result = new emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify(this);
        result.galleryId_ = galleryId_;
        if (settleInfoBuilder_ == null) {
          result.settleInfo_ = settleInfo_;
        } else {
          result.settleInfo_ = settleInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify other) {
        if (other == emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.hasSettleInfo()) {
          mergeSettleInfo(other.getSettleInfo());
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
              case 112: {
                galleryId_ = input.readUInt32();

                break;
              } // case 112
              case 122: {
                input.readMessage(
                    getSettleInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 122
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

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 14;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 14;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo settleInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo, emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.Builder, emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfoOrBuilder> settleInfoBuilder_;
      /**
       * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
       * @return Whether the settleInfo field is set.
       */
      public boolean hasSettleInfo() {
        return settleInfoBuilder_ != null || settleInfo_ != null;
      }
      /**
       * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
       * @return The settleInfo.
       */
      public emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo getSettleInfo() {
        if (settleInfoBuilder_ == null) {
          return settleInfo_ == null ? emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.getDefaultInstance() : settleInfo_;
        } else {
          return settleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
       */
      public Builder setSettleInfo(emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          settleInfo_ = value;
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
       */
      public Builder setSettleInfo(
          emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.Builder builderForValue) {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = builderForValue.build();
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
       */
      public Builder mergeSettleInfo(emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (settleInfo_ != null) {
            settleInfo_ =
              emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.newBuilder(settleInfo_).mergeFrom(value).buildPartial();
          } else {
            settleInfo_ = value;
          }
          onChanged();
        } else {
          settleInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
       */
      public Builder clearSettleInfo() {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
          onChanged();
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
       */
      public emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.Builder getSettleInfoBuilder() {
        
        onChanged();
        return getSettleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
       */
      public emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfoOrBuilder getSettleInfoOrBuilder() {
        if (settleInfoBuilder_ != null) {
          return settleInfoBuilder_.getMessageOrBuilder();
        } else {
          return settleInfo_ == null ?
              emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.getDefaultInstance() : settleInfo_;
        }
      }
      /**
       * <code>.SalvageEscortSettleInfo settle_info = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo, emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.Builder, emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfoOrBuilder> 
          getSettleInfoFieldBuilder() {
        if (settleInfoBuilder_ == null) {
          settleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo, emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfo.Builder, emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.SalvageEscortSettleInfoOrBuilder>(
                  getSettleInfo(),
                  getParentForChildren(),
                  isClean());
          settleInfo_ = null;
        }
        return settleInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SalvageEscortSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:SalvageEscortSettleNotify)
    private static final emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify();
    }

    public static emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SalvageEscortSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<SalvageEscortSettleNotify>() {
      @java.lang.Override
      public SalvageEscortSettleNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SalvageEscortSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SalvageEscortSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SalvageEscortSettleNotifyOuterClass.SalvageEscortSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SalvageEscortSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SalvageEscortSettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037SalvageEscortSettleNotify.proto\032\035Salva" +
      "geEscortSettleInfo.proto\"^\n\031SalvageEscor" +
      "tSettleNotify\022\022\n\ngallery_id\030\016 \001(\r\022-\n\013set" +
      "tle_info\030\017 \001(\0132\030.SalvageEscortSettleInfo" +
      "B\036\n\034emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.getDescriptor(),
        });
    internal_static_SalvageEscortSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SalvageEscortSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SalvageEscortSettleNotify_descriptor,
        new java.lang.String[] { "GalleryId", "SettleInfo", });
    emu.grasscutter.net.oldproto.SalvageEscortSettleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
