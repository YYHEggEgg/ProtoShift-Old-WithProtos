// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SeaLampFlyLampReq.proto

package emu.grasscutter.net.newproto;

public final class SeaLampFlyLampReqOuterClass {
  private SeaLampFlyLampReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SeaLampFlyLampReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SeaLampFlyLampReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector pos = 5;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 5;</code>
     * @return The pos.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 5;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

    /**
     * <code>uint32 item_num = 15;</code>
     * @return The itemNum.
     */
    int getItemNum();

    /**
     * <code>uint32 item_id = 7;</code>
     * @return The itemId.
     */
    int getItemId();

    /**
     * <code>int32 param = 14;</code>
     * @return The param.
     */
    int getParam();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2187;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SeaLampFlyLampReq}
   */
  public static final class SeaLampFlyLampReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SeaLampFlyLampReq)
      SeaLampFlyLampReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SeaLampFlyLampReq.newBuilder() to construct.
    private SeaLampFlyLampReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SeaLampFlyLampReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SeaLampFlyLampReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.internal_static_SeaLampFlyLampReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.internal_static_SeaLampFlyLampReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq.class, emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq.Builder.class);
    }

    public static final int POS_FIELD_NUMBER = 5;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 5;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 5;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return getPos();
    }

    public static final int ITEM_NUM_FIELD_NUMBER = 15;
    private int itemNum_;
    /**
     * <code>uint32 item_num = 15;</code>
     * @return The itemNum.
     */
    @java.lang.Override
    public int getItemNum() {
      return itemNum_;
    }

    public static final int ITEM_ID_FIELD_NUMBER = 7;
    private int itemId_;
    /**
     * <code>uint32 item_id = 7;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
    }

    public static final int PARAM_FIELD_NUMBER = 14;
    private int param_;
    /**
     * <code>int32 param = 14;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
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
      if (pos_ != null) {
        output.writeMessage(5, getPos());
      }
      if (itemId_ != 0) {
        output.writeUInt32(7, itemId_);
      }
      if (param_ != 0) {
        output.writeInt32(14, param_);
      }
      if (itemNum_ != 0) {
        output.writeUInt32(15, itemNum_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getPos());
      }
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, itemId_);
      }
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, param_);
      }
      if (itemNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, itemNum_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq other = (emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq) obj;

      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
      if (getItemNum()
          != other.getItemNum()) return false;
      if (getItemId()
          != other.getItemId()) return false;
      if (getParam()
          != other.getParam()) return false;
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
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (37 * hash) + ITEM_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getItemNum();
      hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq prototype) {
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
     *   CMD_ID = 2187;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SeaLampFlyLampReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SeaLampFlyLampReq)
        emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.internal_static_SeaLampFlyLampReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.internal_static_SeaLampFlyLampReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq.class, emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        itemNum_ = 0;

        itemId_ = 0;

        param_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.internal_static_SeaLampFlyLampReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq build() {
        emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq buildPartial() {
        emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq result = new emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq(this);
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
        }
        result.itemNum_ = itemNum_;
        result.itemId_ = itemId_;
        result.param_ = param_;
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
        if (other instanceof emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq) {
          return mergeFrom((emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq other) {
        if (other == emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq.getDefaultInstance()) return this;
        if (other.hasPos()) {
          mergePos(other.getPos());
        }
        if (other.getItemNum() != 0) {
          setItemNum(other.getItemNum());
        }
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
        }
        if (other.getParam() != 0) {
          setParam(other.getParam());
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
              case 42: {
                input.readMessage(
                    getPosFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 42
              case 56: {
                itemId_ = input.readUInt32();

                break;
              } // case 56
              case 112: {
                param_ = input.readInt32();

                break;
              } // case 112
              case 120: {
                itemNum_ = input.readUInt32();

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

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 5;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Vector pos = 5;</code>
       * @return The pos.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public Builder setPos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
          onChanged();
        } else {
          posBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public Builder setPos(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
          onChanged();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public Builder mergePos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (pos_ != null) {
            pos_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(pos_).mergeFrom(value).buildPartial();
          } else {
            pos_ = value;
          }
          onChanged();
        } else {
          posBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public Builder clearPos() {
        if (posBuilder_ == null) {
          pos_ = null;
          onChanged();
        } else {
          pos_ = null;
          posBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
      }

      private int itemNum_ ;
      /**
       * <code>uint32 item_num = 15;</code>
       * @return The itemNum.
       */
      @java.lang.Override
      public int getItemNum() {
        return itemNum_;
      }
      /**
       * <code>uint32 item_num = 15;</code>
       * @param value The itemNum to set.
       * @return This builder for chaining.
       */
      public Builder setItemNum(int value) {
        
        itemNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_num = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemNum() {
        
        itemNum_ = 0;
        onChanged();
        return this;
      }

      private int itemId_ ;
      /**
       * <code>uint32 item_id = 7;</code>
       * @return The itemId.
       */
      @java.lang.Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 item_id = 7;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {
        
        itemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {
        
        itemId_ = 0;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>int32 param = 14;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>int32 param = 14;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 param = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        
        param_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SeaLampFlyLampReq)
    }

    // @@protoc_insertion_point(class_scope:SeaLampFlyLampReq)
    private static final emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq();
    }

    public static emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SeaLampFlyLampReq>
        PARSER = new com.google.protobuf.AbstractParser<SeaLampFlyLampReq>() {
      @java.lang.Override
      public SeaLampFlyLampReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SeaLampFlyLampReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SeaLampFlyLampReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SeaLampFlyLampReqOuterClass.SeaLampFlyLampReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SeaLampFlyLampReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SeaLampFlyLampReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027SeaLampFlyLampReq.proto\032\014Vector.proto\"" +
      "[\n\021SeaLampFlyLampReq\022\024\n\003pos\030\005 \001(\0132\007.Vect" +
      "or\022\020\n\010item_num\030\017 \001(\r\022\017\n\007item_id\030\007 \001(\r\022\r\n" +
      "\005param\030\016 \001(\005B\036\n\034emu.grasscutter.net.newp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_SeaLampFlyLampReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SeaLampFlyLampReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SeaLampFlyLampReq_descriptor,
        new java.lang.String[] { "Pos", "ItemNum", "ItemId", "Param", });
    emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
