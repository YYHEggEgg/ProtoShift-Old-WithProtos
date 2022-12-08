// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StartBuoyantCombatGalleryReq.proto

package emu.grasscutter.net.oldproto;

public final class StartBuoyantCombatGalleryReqOuterClass {
  private StartBuoyantCombatGalleryReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StartBuoyantCombatGalleryReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StartBuoyantCombatGalleryReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 15;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>uint32 gallery_level = 13;</code>
     * @return The galleryLevel.
     */
    int getGalleryLevel();
  }
  /**
   * <pre>
   * CmdId: 8732
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code StartBuoyantCombatGalleryReq}
   */
  public static final class StartBuoyantCombatGalleryReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StartBuoyantCombatGalleryReq)
      StartBuoyantCombatGalleryReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StartBuoyantCombatGalleryReq.newBuilder() to construct.
    private StartBuoyantCombatGalleryReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StartBuoyantCombatGalleryReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StartBuoyantCombatGalleryReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.internal_static_StartBuoyantCombatGalleryReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.internal_static_StartBuoyantCombatGalleryReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq.class, emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 15;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 15;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int GALLERY_LEVEL_FIELD_NUMBER = 13;
    private int galleryLevel_;
    /**
     * <code>uint32 gallery_level = 13;</code>
     * @return The galleryLevel.
     */
    @java.lang.Override
    public int getGalleryLevel() {
      return galleryLevel_;
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
      if (galleryLevel_ != 0) {
        output.writeUInt32(13, galleryLevel_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(15, galleryId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, galleryLevel_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, galleryId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq other = (emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getGalleryLevel()
          != other.getGalleryLevel()) return false;
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
      hash = (37 * hash) + GALLERY_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryLevel();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq prototype) {
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
     * CmdId: 8732
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code StartBuoyantCombatGalleryReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StartBuoyantCombatGalleryReq)
        emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.internal_static_StartBuoyantCombatGalleryReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.internal_static_StartBuoyantCombatGalleryReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq.class, emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq.newBuilder()
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

        galleryLevel_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.internal_static_StartBuoyantCombatGalleryReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq build() {
        emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq buildPartial() {
        emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq result = new emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq(this);
        result.galleryId_ = galleryId_;
        result.galleryLevel_ = galleryLevel_;
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
        if (other instanceof emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq other) {
        if (other == emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getGalleryLevel() != 0) {
          setGalleryLevel(other.getGalleryLevel());
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
              case 104: {
                galleryLevel_ = input.readUInt32();

                break;
              } // case 104
              case 120: {
                galleryId_ = input.readUInt32();

                break;
              } // case 120
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
       * <code>uint32 gallery_id = 15;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 15;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int galleryLevel_ ;
      /**
       * <code>uint32 gallery_level = 13;</code>
       * @return The galleryLevel.
       */
      @java.lang.Override
      public int getGalleryLevel() {
        return galleryLevel_;
      }
      /**
       * <code>uint32 gallery_level = 13;</code>
       * @param value The galleryLevel to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryLevel(int value) {
        
        galleryLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_level = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryLevel() {
        
        galleryLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StartBuoyantCombatGalleryReq)
    }

    // @@protoc_insertion_point(class_scope:StartBuoyantCombatGalleryReq)
    private static final emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq();
    }

    public static emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StartBuoyantCombatGalleryReq>
        PARSER = new com.google.protobuf.AbstractParser<StartBuoyantCombatGalleryReq>() {
      @java.lang.Override
      public StartBuoyantCombatGalleryReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<StartBuoyantCombatGalleryReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StartBuoyantCombatGalleryReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.StartBuoyantCombatGalleryReqOuterClass.StartBuoyantCombatGalleryReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StartBuoyantCombatGalleryReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StartBuoyantCombatGalleryReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"StartBuoyantCombatGalleryReq.proto\"I\n\034" +
      "StartBuoyantCombatGalleryReq\022\022\n\ngallery_" +
      "id\030\017 \001(\r\022\025\n\rgallery_level\030\r \001(\rB\036\n\034emu.g" +
      "rasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StartBuoyantCombatGalleryReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StartBuoyantCombatGalleryReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StartBuoyantCombatGalleryReq_descriptor,
        new java.lang.String[] { "GalleryId", "GalleryLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
