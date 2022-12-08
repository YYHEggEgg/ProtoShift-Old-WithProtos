// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FishCastRodReq.proto

package emu.grasscutter.net.oldproto;

public final class FishCastRodReqOuterClass {
  private FishCastRodReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FishCastRodReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FishCastRodReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 bait_id = 14;</code>
     * @return The baitId.
     */
    int getBaitId();

    /**
     * <code>uint32 rod_id = 4;</code>
     * @return The rodId.
     */
    int getRodId();

    /**
     * <code>uint32 rod_entity_id = 7;</code>
     * @return The rodEntityId.
     */
    int getRodEntityId();

    /**
     * <code>.Vector pos = 12;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 12;</code>
     * @return The pos.
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 12;</code>
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 5802
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code FishCastRodReq}
   */
  public static final class FishCastRodReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FishCastRodReq)
      FishCastRodReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FishCastRodReq.newBuilder() to construct.
    private FishCastRodReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FishCastRodReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FishCastRodReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.internal_static_FishCastRodReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.internal_static_FishCastRodReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq.class, emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq.Builder.class);
    }

    public static final int BAIT_ID_FIELD_NUMBER = 14;
    private int baitId_;
    /**
     * <code>uint32 bait_id = 14;</code>
     * @return The baitId.
     */
    @java.lang.Override
    public int getBaitId() {
      return baitId_;
    }

    public static final int ROD_ID_FIELD_NUMBER = 4;
    private int rodId_;
    /**
     * <code>uint32 rod_id = 4;</code>
     * @return The rodId.
     */
    @java.lang.Override
    public int getRodId() {
      return rodId_;
    }

    public static final int ROD_ENTITY_ID_FIELD_NUMBER = 7;
    private int rodEntityId_;
    /**
     * <code>uint32 rod_entity_id = 7;</code>
     * @return The rodEntityId.
     */
    @java.lang.Override
    public int getRodEntityId() {
      return rodEntityId_;
    }

    public static final int POS_FIELD_NUMBER = 12;
    private emu.grasscutter.net.oldproto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 12;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 12;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return getPos();
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
      if (rodId_ != 0) {
        output.writeUInt32(4, rodId_);
      }
      if (rodEntityId_ != 0) {
        output.writeUInt32(7, rodEntityId_);
      }
      if (pos_ != null) {
        output.writeMessage(12, getPos());
      }
      if (baitId_ != 0) {
        output.writeUInt32(14, baitId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rodId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, rodId_);
      }
      if (rodEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, rodEntityId_);
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getPos());
      }
      if (baitId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, baitId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq other = (emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq) obj;

      if (getBaitId()
          != other.getBaitId()) return false;
      if (getRodId()
          != other.getRodId()) return false;
      if (getRodEntityId()
          != other.getRodEntityId()) return false;
      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
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
      hash = (37 * hash) + BAIT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBaitId();
      hash = (37 * hash) + ROD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRodId();
      hash = (37 * hash) + ROD_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRodEntityId();
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq prototype) {
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
     * CmdId: 5802
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code FishCastRodReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FishCastRodReq)
        emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.internal_static_FishCastRodReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.internal_static_FishCastRodReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq.class, emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        baitId_ = 0;

        rodId_ = 0;

        rodEntityId_ = 0;

        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.internal_static_FishCastRodReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq build() {
        emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq buildPartial() {
        emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq result = new emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq(this);
        result.baitId_ = baitId_;
        result.rodId_ = rodId_;
        result.rodEntityId_ = rodEntityId_;
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq other) {
        if (other == emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq.getDefaultInstance()) return this;
        if (other.getBaitId() != 0) {
          setBaitId(other.getBaitId());
        }
        if (other.getRodId() != 0) {
          setRodId(other.getRodId());
        }
        if (other.getRodEntityId() != 0) {
          setRodEntityId(other.getRodEntityId());
        }
        if (other.hasPos()) {
          mergePos(other.getPos());
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
              case 32: {
                rodId_ = input.readUInt32();

                break;
              } // case 32
              case 56: {
                rodEntityId_ = input.readUInt32();

                break;
              } // case 56
              case 98: {
                input.readMessage(
                    getPosFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 98
              case 112: {
                baitId_ = input.readUInt32();

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

      private int baitId_ ;
      /**
       * <code>uint32 bait_id = 14;</code>
       * @return The baitId.
       */
      @java.lang.Override
      public int getBaitId() {
        return baitId_;
      }
      /**
       * <code>uint32 bait_id = 14;</code>
       * @param value The baitId to set.
       * @return This builder for chaining.
       */
      public Builder setBaitId(int value) {
        
        baitId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bait_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBaitId() {
        
        baitId_ = 0;
        onChanged();
        return this;
      }

      private int rodId_ ;
      /**
       * <code>uint32 rod_id = 4;</code>
       * @return The rodId.
       */
      @java.lang.Override
      public int getRodId() {
        return rodId_;
      }
      /**
       * <code>uint32 rod_id = 4;</code>
       * @param value The rodId to set.
       * @return This builder for chaining.
       */
      public Builder setRodId(int value) {
        
        rodId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rod_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRodId() {
        
        rodId_ = 0;
        onChanged();
        return this;
      }

      private int rodEntityId_ ;
      /**
       * <code>uint32 rod_entity_id = 7;</code>
       * @return The rodEntityId.
       */
      @java.lang.Override
      public int getRodEntityId() {
        return rodEntityId_;
      }
      /**
       * <code>uint32 rod_entity_id = 7;</code>
       * @param value The rodEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setRodEntityId(int value) {
        
        rodEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rod_entity_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRodEntityId() {
        
        rodEntityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 12;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Vector pos = 12;</code>
       * @return The pos.
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 12;</code>
       */
      public Builder setPos(emu.grasscutter.net.oldproto.VectorOuterClass.Vector value) {
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
       * <code>.Vector pos = 12;</code>
       */
      public Builder setPos(
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
          onChanged();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector pos = 12;</code>
       */
      public Builder mergePos(emu.grasscutter.net.oldproto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (pos_ != null) {
            pos_ =
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.newBuilder(pos_).mergeFrom(value).buildPartial();
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
       * <code>.Vector pos = 12;</code>
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
       * <code>.Vector pos = 12;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 12;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FishCastRodReq)
    }

    // @@protoc_insertion_point(class_scope:FishCastRodReq)
    private static final emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq();
    }

    public static emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FishCastRodReq>
        PARSER = new com.google.protobuf.AbstractParser<FishCastRodReq>() {
      @java.lang.Override
      public FishCastRodReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<FishCastRodReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FishCastRodReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.FishCastRodReqOuterClass.FishCastRodReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FishCastRodReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FishCastRodReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024FishCastRodReq.proto\032\014Vector.proto\"^\n\016" +
      "FishCastRodReq\022\017\n\007bait_id\030\016 \001(\r\022\016\n\006rod_i" +
      "d\030\004 \001(\r\022\025\n\rrod_entity_id\030\007 \001(\r\022\024\n\003pos\030\014 " +
      "\001(\0132\007.VectorB\036\n\034emu.grasscutter.net.oldp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_FishCastRodReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FishCastRodReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FishCastRodReq_descriptor,
        new java.lang.String[] { "BaitId", "RodId", "RodEntityId", "Pos", });
    emu.grasscutter.net.oldproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
