// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeBalloonGallerySettleNotify.proto

package emu.grasscutter.net.oldproto;

public final class HomeBalloonGallerySettleNotifyOuterClass {
  private HomeBalloonGallerySettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeBalloonGallerySettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeBalloonGallerySettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 1;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
     * @return Whether the settleInfo field is set.
     */
    boolean hasSettleInfo();
    /**
     * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
     * @return The settleInfo.
     */
    emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo getSettleInfo();
    /**
     * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
     */
    emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfoOrBuilder getSettleInfoOrBuilder();

    /**
     * <code>uint32 rank = 6;</code>
     * @return The rank.
     */
    int getRank();

    /**
     * <code>bool is_new_record = 4;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();
  }
  /**
   * <pre>
   * CmdId: 4811
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code HomeBalloonGallerySettleNotify}
   */
  public static final class HomeBalloonGallerySettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeBalloonGallerySettleNotify)
      HomeBalloonGallerySettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeBalloonGallerySettleNotify.newBuilder() to construct.
    private HomeBalloonGallerySettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeBalloonGallerySettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeBalloonGallerySettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.internal_static_HomeBalloonGallerySettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.internal_static_HomeBalloonGallerySettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify.class, emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 1;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 1;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int SETTLE_INFO_FIELD_NUMBER = 5;
    private emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo settleInfo_;
    /**
     * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
     * @return Whether the settleInfo field is set.
     */
    @java.lang.Override
    public boolean hasSettleInfo() {
      return settleInfo_ != null;
    }
    /**
     * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
     * @return The settleInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo getSettleInfo() {
      return settleInfo_ == null ? emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.getDefaultInstance() : settleInfo_;
    }
    /**
     * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfoOrBuilder getSettleInfoOrBuilder() {
      return getSettleInfo();
    }

    public static final int RANK_FIELD_NUMBER = 6;
    private int rank_;
    /**
     * <code>uint32 rank = 6;</code>
     * @return The rank.
     */
    @java.lang.Override
    public int getRank() {
      return rank_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 4;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 4;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
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
        output.writeUInt32(1, galleryId_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(4, isNewRecord_);
      }
      if (settleInfo_ != null) {
        output.writeMessage(5, getSettleInfo());
      }
      if (rank_ != 0) {
        output.writeUInt32(6, rank_);
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
          .computeUInt32Size(1, galleryId_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isNewRecord_);
      }
      if (settleInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getSettleInfo());
      }
      if (rank_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, rank_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify other = (emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (hasSettleInfo() != other.hasSettleInfo()) return false;
      if (hasSettleInfo()) {
        if (!getSettleInfo()
            .equals(other.getSettleInfo())) return false;
      }
      if (getRank()
          != other.getRank()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
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
      hash = (37 * hash) + RANK_FIELD_NUMBER;
      hash = (53 * hash) + getRank();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify prototype) {
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
     * CmdId: 4811
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code HomeBalloonGallerySettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeBalloonGallerySettleNotify)
        emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.internal_static_HomeBalloonGallerySettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.internal_static_HomeBalloonGallerySettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify.class, emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify.newBuilder()
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
        rank_ = 0;

        isNewRecord_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.internal_static_HomeBalloonGallerySettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify build() {
        emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify buildPartial() {
        emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify result = new emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify(this);
        result.galleryId_ = galleryId_;
        if (settleInfoBuilder_ == null) {
          result.settleInfo_ = settleInfo_;
        } else {
          result.settleInfo_ = settleInfoBuilder_.build();
        }
        result.rank_ = rank_;
        result.isNewRecord_ = isNewRecord_;
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
        if (other instanceof emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify other) {
        if (other == emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.hasSettleInfo()) {
          mergeSettleInfo(other.getSettleInfo());
        }
        if (other.getRank() != 0) {
          setRank(other.getRank());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
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
                galleryId_ = input.readUInt32();

                break;
              } // case 8
              case 32: {
                isNewRecord_ = input.readBool();

                break;
              } // case 32
              case 42: {
                input.readMessage(
                    getSettleInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 42
              case 48: {
                rank_ = input.readUInt32();

                break;
              } // case 48
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
       * <code>uint32 gallery_id = 1;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 1;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo settleInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo, emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.Builder, emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfoOrBuilder> settleInfoBuilder_;
      /**
       * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
       * @return Whether the settleInfo field is set.
       */
      public boolean hasSettleInfo() {
        return settleInfoBuilder_ != null || settleInfo_ != null;
      }
      /**
       * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
       * @return The settleInfo.
       */
      public emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo getSettleInfo() {
        if (settleInfoBuilder_ == null) {
          return settleInfo_ == null ? emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.getDefaultInstance() : settleInfo_;
        } else {
          return settleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
       */
      public Builder setSettleInfo(emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo value) {
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
       * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
       */
      public Builder setSettleInfo(
          emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.Builder builderForValue) {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = builderForValue.build();
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
       */
      public Builder mergeSettleInfo(emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (settleInfo_ != null) {
            settleInfo_ =
              emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.newBuilder(settleInfo_).mergeFrom(value).buildPartial();
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
       * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
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
       * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
       */
      public emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.Builder getSettleInfoBuilder() {
        
        onChanged();
        return getSettleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
       */
      public emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfoOrBuilder getSettleInfoOrBuilder() {
        if (settleInfoBuilder_ != null) {
          return settleInfoBuilder_.getMessageOrBuilder();
        } else {
          return settleInfo_ == null ?
              emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.getDefaultInstance() : settleInfo_;
        }
      }
      /**
       * <code>.BalloonGallerySettleInfo settle_info = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo, emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.Builder, emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfoOrBuilder> 
          getSettleInfoFieldBuilder() {
        if (settleInfoBuilder_ == null) {
          settleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo, emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.Builder, emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfoOrBuilder>(
                  getSettleInfo(),
                  getParentForChildren(),
                  isClean());
          settleInfo_ = null;
        }
        return settleInfoBuilder_;
      }

      private int rank_ ;
      /**
       * <code>uint32 rank = 6;</code>
       * @return The rank.
       */
      @java.lang.Override
      public int getRank() {
        return rank_;
      }
      /**
       * <code>uint32 rank = 6;</code>
       * @param value The rank to set.
       * @return This builder for chaining.
       */
      public Builder setRank(int value) {
        
        rank_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rank = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRank() {
        
        rank_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 4;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 4;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
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


      // @@protoc_insertion_point(builder_scope:HomeBalloonGallerySettleNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeBalloonGallerySettleNotify)
    private static final emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify();
    }

    public static emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeBalloonGallerySettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeBalloonGallerySettleNotify>() {
      @java.lang.Override
      public HomeBalloonGallerySettleNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeBalloonGallerySettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeBalloonGallerySettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeBalloonGallerySettleNotifyOuterClass.HomeBalloonGallerySettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeBalloonGallerySettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeBalloonGallerySettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$HomeBalloonGallerySettleNotify.proto\032\036" +
      "BalloonGallerySettleInfo.proto\"\211\001\n\036HomeB" +
      "alloonGallerySettleNotify\022\022\n\ngallery_id\030" +
      "\001 \001(\r\022.\n\013settle_info\030\005 \001(\0132\031.BalloonGall" +
      "erySettleInfo\022\014\n\004rank\030\006 \001(\r\022\025\n\ris_new_re" +
      "cord\030\004 \001(\010B\036\n\034emu.grasscutter.net.oldpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeBalloonGallerySettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeBalloonGallerySettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeBalloonGallerySettleNotify_descriptor,
        new java.lang.String[] { "GalleryId", "SettleInfo", "Rank", "IsNewRecord", });
    emu.grasscutter.net.oldproto.BalloonGallerySettleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
