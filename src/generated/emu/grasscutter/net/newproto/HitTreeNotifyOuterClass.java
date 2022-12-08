// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HitTreeNotify.proto

package emu.grasscutter.net.newproto;

public final class HitTreeNotifyOuterClass {
  private HitTreeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HitTreeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HitTreeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 tree_type = 8;</code>
     * @return The treeType.
     */
    int getTreeType();

    /**
     * <code>.Vector drop_pos = 12;</code>
     * @return Whether the dropPos field is set.
     */
    boolean hasDropPos();
    /**
     * <code>.Vector drop_pos = 12;</code>
     * @return The dropPos.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getDropPos();
    /**
     * <code>.Vector drop_pos = 12;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getDropPosOrBuilder();

    /**
     * <code>.Vector tree_pos = 15;</code>
     * @return Whether the treePos field is set.
     */
    boolean hasTreePos();
    /**
     * <code>.Vector tree_pos = 15;</code>
     * @return The treePos.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getTreePos();
    /**
     * <code>.Vector tree_pos = 15;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getTreePosOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3018;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HitTreeNotify}
   */
  public static final class HitTreeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HitTreeNotify)
      HitTreeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HitTreeNotify.newBuilder() to construct.
    private HitTreeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HitTreeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HitTreeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.internal_static_HitTreeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.internal_static_HitTreeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify.class, emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify.Builder.class);
    }

    public static final int TREE_TYPE_FIELD_NUMBER = 8;
    private int treeType_;
    /**
     * <code>uint32 tree_type = 8;</code>
     * @return The treeType.
     */
    @java.lang.Override
    public int getTreeType() {
      return treeType_;
    }

    public static final int DROP_POS_FIELD_NUMBER = 12;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector dropPos_;
    /**
     * <code>.Vector drop_pos = 12;</code>
     * @return Whether the dropPos field is set.
     */
    @java.lang.Override
    public boolean hasDropPos() {
      return dropPos_ != null;
    }
    /**
     * <code>.Vector drop_pos = 12;</code>
     * @return The dropPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getDropPos() {
      return dropPos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : dropPos_;
    }
    /**
     * <code>.Vector drop_pos = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getDropPosOrBuilder() {
      return getDropPos();
    }

    public static final int TREE_POS_FIELD_NUMBER = 15;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector treePos_;
    /**
     * <code>.Vector tree_pos = 15;</code>
     * @return Whether the treePos field is set.
     */
    @java.lang.Override
    public boolean hasTreePos() {
      return treePos_ != null;
    }
    /**
     * <code>.Vector tree_pos = 15;</code>
     * @return The treePos.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getTreePos() {
      return treePos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : treePos_;
    }
    /**
     * <code>.Vector tree_pos = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getTreePosOrBuilder() {
      return getTreePos();
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
      if (treeType_ != 0) {
        output.writeUInt32(8, treeType_);
      }
      if (dropPos_ != null) {
        output.writeMessage(12, getDropPos());
      }
      if (treePos_ != null) {
        output.writeMessage(15, getTreePos());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (treeType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, treeType_);
      }
      if (dropPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getDropPos());
      }
      if (treePos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getTreePos());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify other = (emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify) obj;

      if (getTreeType()
          != other.getTreeType()) return false;
      if (hasDropPos() != other.hasDropPos()) return false;
      if (hasDropPos()) {
        if (!getDropPos()
            .equals(other.getDropPos())) return false;
      }
      if (hasTreePos() != other.hasTreePos()) return false;
      if (hasTreePos()) {
        if (!getTreePos()
            .equals(other.getTreePos())) return false;
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
      hash = (37 * hash) + TREE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getTreeType();
      if (hasDropPos()) {
        hash = (37 * hash) + DROP_POS_FIELD_NUMBER;
        hash = (53 * hash) + getDropPos().hashCode();
      }
      if (hasTreePos()) {
        hash = (37 * hash) + TREE_POS_FIELD_NUMBER;
        hash = (53 * hash) + getTreePos().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify prototype) {
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
     *   CMD_ID = 3018;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HitTreeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HitTreeNotify)
        emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.internal_static_HitTreeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.internal_static_HitTreeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify.class, emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        treeType_ = 0;

        if (dropPosBuilder_ == null) {
          dropPos_ = null;
        } else {
          dropPos_ = null;
          dropPosBuilder_ = null;
        }
        if (treePosBuilder_ == null) {
          treePos_ = null;
        } else {
          treePos_ = null;
          treePosBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.internal_static_HitTreeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify build() {
        emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify buildPartial() {
        emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify result = new emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify(this);
        result.treeType_ = treeType_;
        if (dropPosBuilder_ == null) {
          result.dropPos_ = dropPos_;
        } else {
          result.dropPos_ = dropPosBuilder_.build();
        }
        if (treePosBuilder_ == null) {
          result.treePos_ = treePos_;
        } else {
          result.treePos_ = treePosBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify other) {
        if (other == emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify.getDefaultInstance()) return this;
        if (other.getTreeType() != 0) {
          setTreeType(other.getTreeType());
        }
        if (other.hasDropPos()) {
          mergeDropPos(other.getDropPos());
        }
        if (other.hasTreePos()) {
          mergeTreePos(other.getTreePos());
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
              case 64: {
                treeType_ = input.readUInt32();

                break;
              } // case 64
              case 98: {
                input.readMessage(
                    getDropPosFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 98
              case 122: {
                input.readMessage(
                    getTreePosFieldBuilder().getBuilder(),
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

      private int treeType_ ;
      /**
       * <code>uint32 tree_type = 8;</code>
       * @return The treeType.
       */
      @java.lang.Override
      public int getTreeType() {
        return treeType_;
      }
      /**
       * <code>uint32 tree_type = 8;</code>
       * @param value The treeType to set.
       * @return This builder for chaining.
       */
      public Builder setTreeType(int value) {
        
        treeType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 tree_type = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTreeType() {
        
        treeType_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector dropPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> dropPosBuilder_;
      /**
       * <code>.Vector drop_pos = 12;</code>
       * @return Whether the dropPos field is set.
       */
      public boolean hasDropPos() {
        return dropPosBuilder_ != null || dropPos_ != null;
      }
      /**
       * <code>.Vector drop_pos = 12;</code>
       * @return The dropPos.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getDropPos() {
        if (dropPosBuilder_ == null) {
          return dropPos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : dropPos_;
        } else {
          return dropPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector drop_pos = 12;</code>
       */
      public Builder setDropPos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (dropPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dropPos_ = value;
          onChanged();
        } else {
          dropPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector drop_pos = 12;</code>
       */
      public Builder setDropPos(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (dropPosBuilder_ == null) {
          dropPos_ = builderForValue.build();
          onChanged();
        } else {
          dropPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector drop_pos = 12;</code>
       */
      public Builder mergeDropPos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (dropPosBuilder_ == null) {
          if (dropPos_ != null) {
            dropPos_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(dropPos_).mergeFrom(value).buildPartial();
          } else {
            dropPos_ = value;
          }
          onChanged();
        } else {
          dropPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector drop_pos = 12;</code>
       */
      public Builder clearDropPos() {
        if (dropPosBuilder_ == null) {
          dropPos_ = null;
          onChanged();
        } else {
          dropPos_ = null;
          dropPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector drop_pos = 12;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getDropPosBuilder() {
        
        onChanged();
        return getDropPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector drop_pos = 12;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getDropPosOrBuilder() {
        if (dropPosBuilder_ != null) {
          return dropPosBuilder_.getMessageOrBuilder();
        } else {
          return dropPos_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : dropPos_;
        }
      }
      /**
       * <code>.Vector drop_pos = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getDropPosFieldBuilder() {
        if (dropPosBuilder_ == null) {
          dropPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getDropPos(),
                  getParentForChildren(),
                  isClean());
          dropPos_ = null;
        }
        return dropPosBuilder_;
      }

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector treePos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> treePosBuilder_;
      /**
       * <code>.Vector tree_pos = 15;</code>
       * @return Whether the treePos field is set.
       */
      public boolean hasTreePos() {
        return treePosBuilder_ != null || treePos_ != null;
      }
      /**
       * <code>.Vector tree_pos = 15;</code>
       * @return The treePos.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getTreePos() {
        if (treePosBuilder_ == null) {
          return treePos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : treePos_;
        } else {
          return treePosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector tree_pos = 15;</code>
       */
      public Builder setTreePos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (treePosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          treePos_ = value;
          onChanged();
        } else {
          treePosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector tree_pos = 15;</code>
       */
      public Builder setTreePos(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (treePosBuilder_ == null) {
          treePos_ = builderForValue.build();
          onChanged();
        } else {
          treePosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector tree_pos = 15;</code>
       */
      public Builder mergeTreePos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (treePosBuilder_ == null) {
          if (treePos_ != null) {
            treePos_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(treePos_).mergeFrom(value).buildPartial();
          } else {
            treePos_ = value;
          }
          onChanged();
        } else {
          treePosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector tree_pos = 15;</code>
       */
      public Builder clearTreePos() {
        if (treePosBuilder_ == null) {
          treePos_ = null;
          onChanged();
        } else {
          treePos_ = null;
          treePosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector tree_pos = 15;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getTreePosBuilder() {
        
        onChanged();
        return getTreePosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector tree_pos = 15;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getTreePosOrBuilder() {
        if (treePosBuilder_ != null) {
          return treePosBuilder_.getMessageOrBuilder();
        } else {
          return treePos_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : treePos_;
        }
      }
      /**
       * <code>.Vector tree_pos = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getTreePosFieldBuilder() {
        if (treePosBuilder_ == null) {
          treePosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getTreePos(),
                  getParentForChildren(),
                  isClean());
          treePos_ = null;
        }
        return treePosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HitTreeNotify)
    }

    // @@protoc_insertion_point(class_scope:HitTreeNotify)
    private static final emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify();
    }

    public static emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HitTreeNotify>
        PARSER = new com.google.protobuf.AbstractParser<HitTreeNotify>() {
      @java.lang.Override
      public HitTreeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<HitTreeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HitTreeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.HitTreeNotifyOuterClass.HitTreeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HitTreeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HitTreeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023HitTreeNotify.proto\032\014Vector.proto\"X\n\rH" +
      "itTreeNotify\022\021\n\ttree_type\030\010 \001(\r\022\031\n\010drop_" +
      "pos\030\014 \001(\0132\007.Vector\022\031\n\010tree_pos\030\017 \001(\0132\007.V" +
      "ectorB\036\n\034emu.grasscutter.net.newprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_HitTreeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HitTreeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HitTreeNotify_descriptor,
        new java.lang.String[] { "TreeType", "DropPos", "TreePos", });
    emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
