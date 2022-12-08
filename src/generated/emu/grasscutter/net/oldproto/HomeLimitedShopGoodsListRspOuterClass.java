// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeLimitedShopGoodsListRsp.proto

package emu.grasscutter.net.oldproto;

public final class HomeLimitedShopGoodsListRspOuterClass {
  private HomeLimitedShopGoodsListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeLimitedShopGoodsListRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeLimitedShopGoodsListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.HomeLimitedShop shop = 12;</code>
     * @return Whether the shop field is set.
     */
    boolean hasShop();
    /**
     * <code>.HomeLimitedShop shop = 12;</code>
     * @return The shop.
     */
    emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop getShop();
    /**
     * <code>.HomeLimitedShop shop = 12;</code>
     */
    emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShopOrBuilder getShopOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 4546
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code HomeLimitedShopGoodsListRsp}
   */
  public static final class HomeLimitedShopGoodsListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeLimitedShopGoodsListRsp)
      HomeLimitedShopGoodsListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeLimitedShopGoodsListRsp.newBuilder() to construct.
    private HomeLimitedShopGoodsListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeLimitedShopGoodsListRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeLimitedShopGoodsListRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.internal_static_HomeLimitedShopGoodsListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.internal_static_HomeLimitedShopGoodsListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp.class, emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SHOP_FIELD_NUMBER = 12;
    private emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop shop_;
    /**
     * <code>.HomeLimitedShop shop = 12;</code>
     * @return Whether the shop field is set.
     */
    @java.lang.Override
    public boolean hasShop() {
      return shop_ != null;
    }
    /**
     * <code>.HomeLimitedShop shop = 12;</code>
     * @return The shop.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop getShop() {
      return shop_ == null ? emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop.getDefaultInstance() : shop_;
    }
    /**
     * <code>.HomeLimitedShop shop = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShopOrBuilder getShopOrBuilder() {
      return getShop();
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
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (shop_ != null) {
        output.writeMessage(12, getShop());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (shop_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getShop());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp other = (emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasShop() != other.hasShop()) return false;
      if (hasShop()) {
        if (!getShop()
            .equals(other.getShop())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasShop()) {
        hash = (37 * hash) + SHOP_FIELD_NUMBER;
        hash = (53 * hash) + getShop().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp prototype) {
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
     * CmdId: 4546
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code HomeLimitedShopGoodsListRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeLimitedShopGoodsListRsp)
        emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.internal_static_HomeLimitedShopGoodsListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.internal_static_HomeLimitedShopGoodsListRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp.class, emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (shopBuilder_ == null) {
          shop_ = null;
        } else {
          shop_ = null;
          shopBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.internal_static_HomeLimitedShopGoodsListRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp build() {
        emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp buildPartial() {
        emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp result = new emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp(this);
        result.retcode_ = retcode_;
        if (shopBuilder_ == null) {
          result.shop_ = shop_;
        } else {
          result.shop_ = shopBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp other) {
        if (other == emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasShop()) {
          mergeShop(other.getShop());
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
              case 48: {
                retcode_ = input.readInt32();

                break;
              } // case 48
              case 98: {
                input.readMessage(
                    getShopFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 98
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop shop_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop, emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop.Builder, emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShopOrBuilder> shopBuilder_;
      /**
       * <code>.HomeLimitedShop shop = 12;</code>
       * @return Whether the shop field is set.
       */
      public boolean hasShop() {
        return shopBuilder_ != null || shop_ != null;
      }
      /**
       * <code>.HomeLimitedShop shop = 12;</code>
       * @return The shop.
       */
      public emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop getShop() {
        if (shopBuilder_ == null) {
          return shop_ == null ? emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop.getDefaultInstance() : shop_;
        } else {
          return shopBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeLimitedShop shop = 12;</code>
       */
      public Builder setShop(emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop value) {
        if (shopBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          shop_ = value;
          onChanged();
        } else {
          shopBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomeLimitedShop shop = 12;</code>
       */
      public Builder setShop(
          emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop.Builder builderForValue) {
        if (shopBuilder_ == null) {
          shop_ = builderForValue.build();
          onChanged();
        } else {
          shopBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomeLimitedShop shop = 12;</code>
       */
      public Builder mergeShop(emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop value) {
        if (shopBuilder_ == null) {
          if (shop_ != null) {
            shop_ =
              emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop.newBuilder(shop_).mergeFrom(value).buildPartial();
          } else {
            shop_ = value;
          }
          onChanged();
        } else {
          shopBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomeLimitedShop shop = 12;</code>
       */
      public Builder clearShop() {
        if (shopBuilder_ == null) {
          shop_ = null;
          onChanged();
        } else {
          shop_ = null;
          shopBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomeLimitedShop shop = 12;</code>
       */
      public emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop.Builder getShopBuilder() {
        
        onChanged();
        return getShopFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeLimitedShop shop = 12;</code>
       */
      public emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShopOrBuilder getShopOrBuilder() {
        if (shopBuilder_ != null) {
          return shopBuilder_.getMessageOrBuilder();
        } else {
          return shop_ == null ?
              emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop.getDefaultInstance() : shop_;
        }
      }
      /**
       * <code>.HomeLimitedShop shop = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop, emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop.Builder, emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShopOrBuilder> 
          getShopFieldBuilder() {
        if (shopBuilder_ == null) {
          shopBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop, emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShop.Builder, emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.HomeLimitedShopOrBuilder>(
                  getShop(),
                  getParentForChildren(),
                  isClean());
          shop_ = null;
        }
        return shopBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeLimitedShopGoodsListRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeLimitedShopGoodsListRsp)
    private static final emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp();
    }

    public static emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeLimitedShopGoodsListRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeLimitedShopGoodsListRsp>() {
      @java.lang.Override
      public HomeLimitedShopGoodsListRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeLimitedShopGoodsListRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeLimitedShopGoodsListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeLimitedShopGoodsListRspOuterClass.HomeLimitedShopGoodsListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeLimitedShopGoodsListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeLimitedShopGoodsListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!HomeLimitedShopGoodsListRsp.proto\032\025Hom" +
      "eLimitedShop.proto\"N\n\033HomeLimitedShopGoo" +
      "dsListRsp\022\017\n\007retcode\030\006 \001(\005\022\036\n\004shop\030\014 \001(\013" +
      "2\020.HomeLimitedShopB\036\n\034emu.grasscutter.ne" +
      "t.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.getDescriptor(),
        });
    internal_static_HomeLimitedShopGoodsListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeLimitedShopGoodsListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeLimitedShopGoodsListRsp_descriptor,
        new java.lang.String[] { "Retcode", "Shop", });
    emu.grasscutter.net.oldproto.HomeLimitedShopOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
