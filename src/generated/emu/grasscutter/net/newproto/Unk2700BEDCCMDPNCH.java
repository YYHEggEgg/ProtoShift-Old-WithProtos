// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_BEDCCMDPNCH.proto

package emu.grasscutter.net.newproto;

public final class Unk2700BEDCCMDPNCH {
  private Unk2700BEDCCMDPNCH() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_BEDCCMDPNCHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_BEDCCMDPNCH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
     * @return Whether the settleInfo field is set.
     */
    boolean hasSettleInfo();
    /**
     * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
     * @return The settleInfo.
     */
    emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA getSettleInfo();
    /**
     * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
     */
    emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIAOrBuilder getSettleInfoOrBuilder();

    /**
     * <code>uint32 gallery_id = 10;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * CmdId: 8503
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_BEDCCMDPNCH}
   */
  public static final class Unk2700_BEDCCMDPNCH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_BEDCCMDPNCH)
      Unk2700_BEDCCMDPNCHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_BEDCCMDPNCH.newBuilder() to construct.
    private Unk2700_BEDCCMDPNCH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_BEDCCMDPNCH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_BEDCCMDPNCH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.internal_static_Unk2700_BEDCCMDPNCH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.internal_static_Unk2700_BEDCCMDPNCH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH.class, emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH.Builder.class);
    }

    public static final int SETTLE_INFO_FIELD_NUMBER = 4;
    private emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA settleInfo_;
    /**
     * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
     * @return Whether the settleInfo field is set.
     */
    @java.lang.Override
    public boolean hasSettleInfo() {
      return settleInfo_ != null;
    }
    /**
     * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
     * @return The settleInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA getSettleInfo() {
      return settleInfo_ == null ? emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA.getDefaultInstance() : settleInfo_;
    }
    /**
     * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIAOrBuilder getSettleInfoOrBuilder() {
      return getSettleInfo();
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 10;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 10;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
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
      if (settleInfo_ != null) {
        output.writeMessage(4, getSettleInfo());
      }
      if (galleryId_ != 0) {
        output.writeUInt32(10, galleryId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (settleInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getSettleInfo());
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, galleryId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH other = (emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH) obj;

      if (hasSettleInfo() != other.hasSettleInfo()) return false;
      if (hasSettleInfo()) {
        if (!getSettleInfo()
            .equals(other.getSettleInfo())) return false;
      }
      if (getGalleryId()
          != other.getGalleryId()) return false;
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
      if (hasSettleInfo()) {
        hash = (37 * hash) + SETTLE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSettleInfo().hashCode();
      }
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH prototype) {
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
     * CmdId: 8503
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_BEDCCMDPNCH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_BEDCCMDPNCH)
        emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.internal_static_Unk2700_BEDCCMDPNCH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.internal_static_Unk2700_BEDCCMDPNCH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH.class, emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }
        galleryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.internal_static_Unk2700_BEDCCMDPNCH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH build() {
        emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH buildPartial() {
        emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH result = new emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH(this);
        if (settleInfoBuilder_ == null) {
          result.settleInfo_ = settleInfo_;
        } else {
          result.settleInfo_ = settleInfoBuilder_.build();
        }
        result.galleryId_ = galleryId_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH other) {
        if (other == emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH.getDefaultInstance()) return this;
        if (other.hasSettleInfo()) {
          mergeSettleInfo(other.getSettleInfo());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
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
              case 34: {
                input.readMessage(
                    getSettleInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 34
              case 80: {
                galleryId_ = input.readUInt32();

                break;
              } // case 80
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

      private emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA settleInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA, emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA.Builder, emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIAOrBuilder> settleInfoBuilder_;
      /**
       * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
       * @return Whether the settleInfo field is set.
       */
      public boolean hasSettleInfo() {
        return settleInfoBuilder_ != null || settleInfo_ != null;
      }
      /**
       * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
       * @return The settleInfo.
       */
      public emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA getSettleInfo() {
        if (settleInfoBuilder_ == null) {
          return settleInfo_ == null ? emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA.getDefaultInstance() : settleInfo_;
        } else {
          return settleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
       */
      public Builder setSettleInfo(emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA value) {
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
       * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
       */
      public Builder setSettleInfo(
          emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA.Builder builderForValue) {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = builderForValue.build();
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
       */
      public Builder mergeSettleInfo(emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA value) {
        if (settleInfoBuilder_ == null) {
          if (settleInfo_ != null) {
            settleInfo_ =
              emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA.newBuilder(settleInfo_).mergeFrom(value).buildPartial();
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
       * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
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
       * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA.Builder getSettleInfoBuilder() {
        
        onChanged();
        return getSettleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIAOrBuilder getSettleInfoOrBuilder() {
        if (settleInfoBuilder_ != null) {
          return settleInfoBuilder_.getMessageOrBuilder();
        } else {
          return settleInfo_ == null ?
              emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA.getDefaultInstance() : settleInfo_;
        }
      }
      /**
       * <code>.Unk2700_BKHBKHINBIA settle_info = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA, emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA.Builder, emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIAOrBuilder> 
          getSettleInfoFieldBuilder() {
        if (settleInfoBuilder_ == null) {
          settleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA, emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIA.Builder, emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.Unk2700_BKHBKHINBIAOrBuilder>(
                  getSettleInfo(),
                  getParentForChildren(),
                  isClean());
          settleInfo_ = null;
        }
        return settleInfoBuilder_;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 10;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 10;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_BEDCCMDPNCH)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_BEDCCMDPNCH)
    private static final emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH();
    }

    public static emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_BEDCCMDPNCH>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_BEDCCMDPNCH>() {
      @java.lang.Override
      public Unk2700_BEDCCMDPNCH parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_BEDCCMDPNCH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_BEDCCMDPNCH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700BEDCCMDPNCH.Unk2700_BEDCCMDPNCH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_BEDCCMDPNCH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_BEDCCMDPNCH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_BEDCCMDPNCH.proto\032\031Unk2700_BKH" +
      "BKHINBIA.proto\"T\n\023Unk2700_BEDCCMDPNCH\022)\n" +
      "\013settle_info\030\004 \001(\0132\024.Unk2700_BKHBKHINBIA" +
      "\022\022\n\ngallery_id\030\n \001(\rB\036\n\034emu.grasscutter." +
      "net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.getDescriptor(),
        });
    internal_static_Unk2700_BEDCCMDPNCH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_BEDCCMDPNCH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_BEDCCMDPNCH_descriptor,
        new java.lang.String[] { "SettleInfo", "GalleryId", });
    emu.grasscutter.net.newproto.Unk2700BKHBKHINBIA.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
