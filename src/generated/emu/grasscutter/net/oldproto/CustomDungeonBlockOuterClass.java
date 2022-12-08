// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDungeonBlock.proto

package emu.grasscutter.net.oldproto;

public final class CustomDungeonBlockOuterClass {
  private CustomDungeonBlockOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomDungeonBlockOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomDungeonBlock)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 block_id = 8;</code>
     * @return The blockId.
     */
    int getBlockId();

    /**
     * <code>.Vector rot = 12;</code>
     * @return Whether the rot field is set.
     */
    boolean hasRot();
    /**
     * <code>.Vector rot = 12;</code>
     * @return The rot.
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.Vector getRot();
    /**
     * <code>.Vector rot = 12;</code>
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getRotOrBuilder();

    /**
     * <code>uint32 guid = 4;</code>
     * @return The guid.
     */
    int getGuid();

    /**
     * <code>.Vector pos = 1;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 1;</code>
     * @return The pos.
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 1;</code>
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();
  }
  /**
   * Protobuf type {@code CustomDungeonBlock}
   */
  public static final class CustomDungeonBlock extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CustomDungeonBlock)
      CustomDungeonBlockOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CustomDungeonBlock.newBuilder() to construct.
    private CustomDungeonBlock(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CustomDungeonBlock() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CustomDungeonBlock();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.internal_static_CustomDungeonBlock_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.internal_static_CustomDungeonBlock_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock.class, emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock.Builder.class);
    }

    public static final int BLOCK_ID_FIELD_NUMBER = 8;
    private int blockId_;
    /**
     * <code>uint32 block_id = 8;</code>
     * @return The blockId.
     */
    @java.lang.Override
    public int getBlockId() {
      return blockId_;
    }

    public static final int ROT_FIELD_NUMBER = 12;
    private emu.grasscutter.net.oldproto.VectorOuterClass.Vector rot_;
    /**
     * <code>.Vector rot = 12;</code>
     * @return Whether the rot field is set.
     */
    @java.lang.Override
    public boolean hasRot() {
      return rot_ != null;
    }
    /**
     * <code>.Vector rot = 12;</code>
     * @return The rot.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getRot() {
      return rot_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
    }
    /**
     * <code>.Vector rot = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
      return getRot();
    }

    public static final int GUID_FIELD_NUMBER = 4;
    private int guid_;
    /**
     * <code>uint32 guid = 4;</code>
     * @return The guid.
     */
    @java.lang.Override
    public int getGuid() {
      return guid_;
    }

    public static final int POS_FIELD_NUMBER = 1;
    private emu.grasscutter.net.oldproto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 1;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 1;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 1;</code>
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
      if (pos_ != null) {
        output.writeMessage(1, getPos());
      }
      if (guid_ != 0) {
        output.writeUInt32(4, guid_);
      }
      if (blockId_ != 0) {
        output.writeUInt32(8, blockId_);
      }
      if (rot_ != null) {
        output.writeMessage(12, getRot());
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
          .computeMessageSize(1, getPos());
      }
      if (guid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, guid_);
      }
      if (blockId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, blockId_);
      }
      if (rot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getRot());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock other = (emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock) obj;

      if (getBlockId()
          != other.getBlockId()) return false;
      if (hasRot() != other.hasRot()) return false;
      if (hasRot()) {
        if (!getRot()
            .equals(other.getRot())) return false;
      }
      if (getGuid()
          != other.getGuid()) return false;
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
      hash = (37 * hash) + BLOCK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBlockId();
      if (hasRot()) {
        hash = (37 * hash) + ROT_FIELD_NUMBER;
        hash = (53 * hash) + getRot().hashCode();
      }
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid();
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock prototype) {
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
     * Protobuf type {@code CustomDungeonBlock}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomDungeonBlock)
        emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlockOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.internal_static_CustomDungeonBlock_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.internal_static_CustomDungeonBlock_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock.class, emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        blockId_ = 0;

        if (rotBuilder_ == null) {
          rot_ = null;
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }
        guid_ = 0;

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
        return emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.internal_static_CustomDungeonBlock_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock build() {
        emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock buildPartial() {
        emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock result = new emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock(this);
        result.blockId_ = blockId_;
        if (rotBuilder_ == null) {
          result.rot_ = rot_;
        } else {
          result.rot_ = rotBuilder_.build();
        }
        result.guid_ = guid_;
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
        if (other instanceof emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock) {
          return mergeFrom((emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock other) {
        if (other == emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock.getDefaultInstance()) return this;
        if (other.getBlockId() != 0) {
          setBlockId(other.getBlockId());
        }
        if (other.hasRot()) {
          mergeRot(other.getRot());
        }
        if (other.getGuid() != 0) {
          setGuid(other.getGuid());
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
              case 10: {
                input.readMessage(
                    getPosFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 10
              case 32: {
                guid_ = input.readUInt32();

                break;
              } // case 32
              case 64: {
                blockId_ = input.readUInt32();

                break;
              } // case 64
              case 98: {
                input.readMessage(
                    getRotFieldBuilder().getBuilder(),
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

      private int blockId_ ;
      /**
       * <code>uint32 block_id = 8;</code>
       * @return The blockId.
       */
      @java.lang.Override
      public int getBlockId() {
        return blockId_;
      }
      /**
       * <code>uint32 block_id = 8;</code>
       * @param value The blockId to set.
       * @return This builder for chaining.
       */
      public Builder setBlockId(int value) {
        
        blockId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 block_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearBlockId() {
        
        blockId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.VectorOuterClass.Vector rot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> rotBuilder_;
      /**
       * <code>.Vector rot = 12;</code>
       * @return Whether the rot field is set.
       */
      public boolean hasRot() {
        return rotBuilder_ != null || rot_ != null;
      }
      /**
       * <code>.Vector rot = 12;</code>
       * @return The rot.
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getRot() {
        if (rotBuilder_ == null) {
          return rot_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        } else {
          return rotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector rot = 12;</code>
       */
      public Builder setRot(emu.grasscutter.net.oldproto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rot_ = value;
          onChanged();
        } else {
          rotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector rot = 12;</code>
       */
      public Builder setRot(
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (rotBuilder_ == null) {
          rot_ = builderForValue.build();
          onChanged();
        } else {
          rotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector rot = 12;</code>
       */
      public Builder mergeRot(emu.grasscutter.net.oldproto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (rot_ != null) {
            rot_ =
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.newBuilder(rot_).mergeFrom(value).buildPartial();
          } else {
            rot_ = value;
          }
          onChanged();
        } else {
          rotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector rot = 12;</code>
       */
      public Builder clearRot() {
        if (rotBuilder_ == null) {
          rot_ = null;
          onChanged();
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector rot = 12;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder getRotBuilder() {
        
        onChanged();
        return getRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector rot = 12;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
        if (rotBuilder_ != null) {
          return rotBuilder_.getMessageOrBuilder();
        } else {
          return rot_ == null ?
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        }
      }
      /**
       * <code>.Vector rot = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> 
          getRotFieldBuilder() {
        if (rotBuilder_ == null) {
          rotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder>(
                  getRot(),
                  getParentForChildren(),
                  isClean());
          rot_ = null;
        }
        return rotBuilder_;
      }

      private int guid_ ;
      /**
       * <code>uint32 guid = 4;</code>
       * @return The guid.
       */
      @java.lang.Override
      public int getGuid() {
        return guid_;
      }
      /**
       * <code>uint32 guid = 4;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(int value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 1;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Vector pos = 1;</code>
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
       * <code>.Vector pos = 1;</code>
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
       * <code>.Vector pos = 1;</code>
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
       * <code>.Vector pos = 1;</code>
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
       * <code>.Vector pos = 1;</code>
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
       * <code>.Vector pos = 1;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 1;</code>
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
       * <code>.Vector pos = 1;</code>
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


      // @@protoc_insertion_point(builder_scope:CustomDungeonBlock)
    }

    // @@protoc_insertion_point(class_scope:CustomDungeonBlock)
    private static final emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock();
    }

    public static emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomDungeonBlock>
        PARSER = new com.google.protobuf.AbstractParser<CustomDungeonBlock>() {
      @java.lang.Override
      public CustomDungeonBlock parsePartialFrom(
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

    public static com.google.protobuf.Parser<CustomDungeonBlock> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CustomDungeonBlock> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.CustomDungeonBlockOuterClass.CustomDungeonBlock getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomDungeonBlock_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomDungeonBlock_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030CustomDungeonBlock.proto\032\014Vector.proto" +
      "\"`\n\022CustomDungeonBlock\022\020\n\010block_id\030\010 \001(\r" +
      "\022\024\n\003rot\030\014 \001(\0132\007.Vector\022\014\n\004guid\030\004 \001(\r\022\024\n\003" +
      "pos\030\001 \001(\0132\007.VectorB\036\n\034emu.grasscutter.ne" +
      "t.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_CustomDungeonBlock_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomDungeonBlock_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomDungeonBlock_descriptor,
        new java.lang.String[] { "BlockId", "Rot", "Guid", "Pos", });
    emu.grasscutter.net.oldproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
