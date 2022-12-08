// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeLimitedShopInfoNotify.proto

package emu.grasscutter.net.oldproto;

public final class HomeLimitedShopInfoNotifyOuterClass {
  private HomeLimitedShopInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeLimitedShopInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeLimitedShopInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HomeLimitedShopInfo shop_info = 2;</code>
     * @return Whether the shopInfo field is set.
     */
    boolean hasShopInfo();
    /**
     * <code>.HomeLimitedShopInfo shop_info = 2;</code>
     * @return The shopInfo.
     */
    emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo getShopInfo();
    /**
     * <code>.HomeLimitedShopInfo shop_info = 2;</code>
     */
    emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder getShopInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 4887
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code HomeLimitedShopInfoNotify}
   */
  public static final class HomeLimitedShopInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeLimitedShopInfoNotify)
      HomeLimitedShopInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeLimitedShopInfoNotify.newBuilder() to construct.
    private HomeLimitedShopInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeLimitedShopInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeLimitedShopInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.internal_static_HomeLimitedShopInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.internal_static_HomeLimitedShopInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify.class, emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify.Builder.class);
    }

    public static final int SHOP_INFO_FIELD_NUMBER = 2;
    private emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo shopInfo_;
    /**
     * <code>.HomeLimitedShopInfo shop_info = 2;</code>
     * @return Whether the shopInfo field is set.
     */
    @java.lang.Override
    public boolean hasShopInfo() {
      return shopInfo_ != null;
    }
    /**
     * <code>.HomeLimitedShopInfo shop_info = 2;</code>
     * @return The shopInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo getShopInfo() {
      return shopInfo_ == null ? emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.getDefaultInstance() : shopInfo_;
    }
    /**
     * <code>.HomeLimitedShopInfo shop_info = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder getShopInfoOrBuilder() {
      return getShopInfo();
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
      if (shopInfo_ != null) {
        output.writeMessage(2, getShopInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (shopInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getShopInfo());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify other = (emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify) obj;

      if (hasShopInfo() != other.hasShopInfo()) return false;
      if (hasShopInfo()) {
        if (!getShopInfo()
            .equals(other.getShopInfo())) return false;
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
      if (hasShopInfo()) {
        hash = (37 * hash) + SHOP_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getShopInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify prototype) {
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
     * CmdId: 4887
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code HomeLimitedShopInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeLimitedShopInfoNotify)
        emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.internal_static_HomeLimitedShopInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.internal_static_HomeLimitedShopInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify.class, emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (shopInfoBuilder_ == null) {
          shopInfo_ = null;
        } else {
          shopInfo_ = null;
          shopInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.internal_static_HomeLimitedShopInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify build() {
        emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify buildPartial() {
        emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify result = new emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify(this);
        if (shopInfoBuilder_ == null) {
          result.shopInfo_ = shopInfo_;
        } else {
          result.shopInfo_ = shopInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify other) {
        if (other == emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify.getDefaultInstance()) return this;
        if (other.hasShopInfo()) {
          mergeShopInfo(other.getShopInfo());
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
                    getShopInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 18
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

      private emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo shopInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo, emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder, emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder> shopInfoBuilder_;
      /**
       * <code>.HomeLimitedShopInfo shop_info = 2;</code>
       * @return Whether the shopInfo field is set.
       */
      public boolean hasShopInfo() {
        return shopInfoBuilder_ != null || shopInfo_ != null;
      }
      /**
       * <code>.HomeLimitedShopInfo shop_info = 2;</code>
       * @return The shopInfo.
       */
      public emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo getShopInfo() {
        if (shopInfoBuilder_ == null) {
          return shopInfo_ == null ? emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.getDefaultInstance() : shopInfo_;
        } else {
          return shopInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeLimitedShopInfo shop_info = 2;</code>
       */
      public Builder setShopInfo(emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo value) {
        if (shopInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          shopInfo_ = value;
          onChanged();
        } else {
          shopInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomeLimitedShopInfo shop_info = 2;</code>
       */
      public Builder setShopInfo(
          emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder builderForValue) {
        if (shopInfoBuilder_ == null) {
          shopInfo_ = builderForValue.build();
          onChanged();
        } else {
          shopInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomeLimitedShopInfo shop_info = 2;</code>
       */
      public Builder mergeShopInfo(emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo value) {
        if (shopInfoBuilder_ == null) {
          if (shopInfo_ != null) {
            shopInfo_ =
              emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.newBuilder(shopInfo_).mergeFrom(value).buildPartial();
          } else {
            shopInfo_ = value;
          }
          onChanged();
        } else {
          shopInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomeLimitedShopInfo shop_info = 2;</code>
       */
      public Builder clearShopInfo() {
        if (shopInfoBuilder_ == null) {
          shopInfo_ = null;
          onChanged();
        } else {
          shopInfo_ = null;
          shopInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomeLimitedShopInfo shop_info = 2;</code>
       */
      public emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder getShopInfoBuilder() {
        
        onChanged();
        return getShopInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeLimitedShopInfo shop_info = 2;</code>
       */
      public emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder getShopInfoOrBuilder() {
        if (shopInfoBuilder_ != null) {
          return shopInfoBuilder_.getMessageOrBuilder();
        } else {
          return shopInfo_ == null ?
              emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.getDefaultInstance() : shopInfo_;
        }
      }
      /**
       * <code>.HomeLimitedShopInfo shop_info = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo, emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder, emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder> 
          getShopInfoFieldBuilder() {
        if (shopInfoBuilder_ == null) {
          shopInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo, emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder, emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder>(
                  getShopInfo(),
                  getParentForChildren(),
                  isClean());
          shopInfo_ = null;
        }
        return shopInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeLimitedShopInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeLimitedShopInfoNotify)
    private static final emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify();
    }

    public static emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeLimitedShopInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeLimitedShopInfoNotify>() {
      @java.lang.Override
      public HomeLimitedShopInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeLimitedShopInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeLimitedShopInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeLimitedShopInfoNotifyOuterClass.HomeLimitedShopInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeLimitedShopInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeLimitedShopInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037HomeLimitedShopInfoNotify.proto\032\031HomeL" +
      "imitedShopInfo.proto\"D\n\031HomeLimitedShopI" +
      "nfoNotify\022\'\n\tshop_info\030\002 \001(\0132\024.HomeLimit" +
      "edShopInfoB\036\n\034emu.grasscutter.net.oldpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeLimitedShopInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeLimitedShopInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeLimitedShopInfoNotify_descriptor,
        new java.lang.String[] { "ShopInfo", });
    emu.grasscutter.net.oldproto.HomeLimitedShopInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
