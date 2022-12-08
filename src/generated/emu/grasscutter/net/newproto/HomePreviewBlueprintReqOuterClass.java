// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomePreviewBlueprintReq.proto

package emu.grasscutter.net.newproto;

public final class HomePreviewBlueprintReqOuterClass {
  private HomePreviewBlueprintReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomePreviewBlueprintReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomePreviewBlueprintReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string share_code = 10;</code>
     * @return The shareCode.
     */
    java.lang.String getShareCode();
    /**
     * <code>string share_code = 10;</code>
     * @return The bytes for shareCode.
     */
    com.google.protobuf.ByteString
        getShareCodeBytes();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4745;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HomePreviewBlueprintReq}
   */
  public static final class HomePreviewBlueprintReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomePreviewBlueprintReq)
      HomePreviewBlueprintReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomePreviewBlueprintReq.newBuilder() to construct.
    private HomePreviewBlueprintReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomePreviewBlueprintReq() {
      shareCode_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomePreviewBlueprintReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.internal_static_HomePreviewBlueprintReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.internal_static_HomePreviewBlueprintReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq.class, emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq.Builder.class);
    }

    public static final int SHARE_CODE_FIELD_NUMBER = 10;
    private volatile java.lang.Object shareCode_;
    /**
     * <code>string share_code = 10;</code>
     * @return The shareCode.
     */
    @java.lang.Override
    public java.lang.String getShareCode() {
      java.lang.Object ref = shareCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shareCode_ = s;
        return s;
      }
    }
    /**
     * <code>string share_code = 10;</code>
     * @return The bytes for shareCode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getShareCodeBytes() {
      java.lang.Object ref = shareCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shareCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareCode_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 10, shareCode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareCode_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, shareCode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq other = (emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq) obj;

      if (!getShareCode()
          .equals(other.getShareCode())) return false;
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
      hash = (37 * hash) + SHARE_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getShareCode().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 4745;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HomePreviewBlueprintReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomePreviewBlueprintReq)
        emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.internal_static_HomePreviewBlueprintReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.internal_static_HomePreviewBlueprintReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq.class, emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        shareCode_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.internal_static_HomePreviewBlueprintReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq build() {
        emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq buildPartial() {
        emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq result = new emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq(this);
        result.shareCode_ = shareCode_;
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
        if (other instanceof emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq) {
          return mergeFrom((emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq other) {
        if (other == emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq.getDefaultInstance()) return this;
        if (!other.getShareCode().isEmpty()) {
          shareCode_ = other.shareCode_;
          onChanged();
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
              case 82: {
                shareCode_ = input.readStringRequireUtf8();

                break;
              } // case 82
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

      private java.lang.Object shareCode_ = "";
      /**
       * <code>string share_code = 10;</code>
       * @return The shareCode.
       */
      public java.lang.String getShareCode() {
        java.lang.Object ref = shareCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          shareCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string share_code = 10;</code>
       * @return The bytes for shareCode.
       */
      public com.google.protobuf.ByteString
          getShareCodeBytes() {
        java.lang.Object ref = shareCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          shareCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string share_code = 10;</code>
       * @param value The shareCode to set.
       * @return This builder for chaining.
       */
      public Builder setShareCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        shareCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string share_code = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearShareCode() {
        
        shareCode_ = getDefaultInstance().getShareCode();
        onChanged();
        return this;
      }
      /**
       * <code>string share_code = 10;</code>
       * @param value The bytes for shareCode to set.
       * @return This builder for chaining.
       */
      public Builder setShareCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        shareCode_ = value;
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


      // @@protoc_insertion_point(builder_scope:HomePreviewBlueprintReq)
    }

    // @@protoc_insertion_point(class_scope:HomePreviewBlueprintReq)
    private static final emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq();
    }

    public static emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomePreviewBlueprintReq>
        PARSER = new com.google.protobuf.AbstractParser<HomePreviewBlueprintReq>() {
      @java.lang.Override
      public HomePreviewBlueprintReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomePreviewBlueprintReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomePreviewBlueprintReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.HomePreviewBlueprintReqOuterClass.HomePreviewBlueprintReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomePreviewBlueprintReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomePreviewBlueprintReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035HomePreviewBlueprintReq.proto\"-\n\027HomeP" +
      "reviewBlueprintReq\022\022\n\nshare_code\030\n \001(\tB\036" +
      "\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomePreviewBlueprintReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomePreviewBlueprintReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomePreviewBlueprintReq_descriptor,
        new java.lang.String[] { "ShareCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
