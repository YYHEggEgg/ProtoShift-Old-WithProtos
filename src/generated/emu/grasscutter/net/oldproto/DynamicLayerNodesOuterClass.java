// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DynamicLayerNodes.proto

package emu.grasscutter.net.oldproto;

public final class DynamicLayerNodesOuterClass {
  private DynamicLayerNodesOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DynamicLayerNodesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DynamicLayerNodes)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 level = 10;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>repeated .DynamicSVONode nodes = 6;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode> 
        getNodesList();
    /**
     * <code>repeated .DynamicSVONode nodes = 6;</code>
     */
    emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode getNodes(int index);
    /**
     * <code>repeated .DynamicSVONode nodes = 6;</code>
     */
    int getNodesCount();
    /**
     * <code>repeated .DynamicSVONode nodes = 6;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONodeOrBuilder> 
        getNodesOrBuilderList();
    /**
     * <code>repeated .DynamicSVONode nodes = 6;</code>
     */
    emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONodeOrBuilder getNodesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code DynamicLayerNodes}
   */
  public static final class DynamicLayerNodes extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DynamicLayerNodes)
      DynamicLayerNodesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DynamicLayerNodes.newBuilder() to construct.
    private DynamicLayerNodes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DynamicLayerNodes() {
      nodes_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DynamicLayerNodes();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.internal_static_DynamicLayerNodes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.internal_static_DynamicLayerNodes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.class, emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder.class);
    }

    public static final int LEVEL_FIELD_NUMBER = 10;
    private int level_;
    /**
     * <code>int32 level = 10;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int NODES_FIELD_NUMBER = 6;
    private java.util.List<emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode> nodes_;
    /**
     * <code>repeated .DynamicSVONode nodes = 6;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode> getNodesList() {
      return nodes_;
    }
    /**
     * <code>repeated .DynamicSVONode nodes = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONodeOrBuilder> 
        getNodesOrBuilderList() {
      return nodes_;
    }
    /**
     * <code>repeated .DynamicSVONode nodes = 6;</code>
     */
    @java.lang.Override
    public int getNodesCount() {
      return nodes_.size();
    }
    /**
     * <code>repeated .DynamicSVONode nodes = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode getNodes(int index) {
      return nodes_.get(index);
    }
    /**
     * <code>repeated .DynamicSVONode nodes = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONodeOrBuilder getNodesOrBuilder(
        int index) {
      return nodes_.get(index);
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
      for (int i = 0; i < nodes_.size(); i++) {
        output.writeMessage(6, nodes_.get(i));
      }
      if (level_ != 0) {
        output.writeInt32(10, level_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < nodes_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, nodes_.get(i));
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, level_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes other = (emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes) obj;

      if (getLevel()
          != other.getLevel()) return false;
      if (!getNodesList()
          .equals(other.getNodesList())) return false;
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
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      if (getNodesCount() > 0) {
        hash = (37 * hash) + NODES_FIELD_NUMBER;
        hash = (53 * hash) + getNodesList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes prototype) {
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
     * Protobuf type {@code DynamicLayerNodes}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DynamicLayerNodes)
        emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.internal_static_DynamicLayerNodes_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.internal_static_DynamicLayerNodes_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.class, emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        level_ = 0;

        if (nodesBuilder_ == null) {
          nodes_ = java.util.Collections.emptyList();
        } else {
          nodes_ = null;
          nodesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.internal_static_DynamicLayerNodes_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes build() {
        emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes buildPartial() {
        emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes result = new emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes(this);
        int from_bitField0_ = bitField0_;
        result.level_ = level_;
        if (nodesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            nodes_ = java.util.Collections.unmodifiableList(nodes_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.nodes_ = nodes_;
        } else {
          result.nodes_ = nodesBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes) {
          return mergeFrom((emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes other) {
        if (other == emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes.getDefaultInstance()) return this;
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (nodesBuilder_ == null) {
          if (!other.nodes_.isEmpty()) {
            if (nodes_.isEmpty()) {
              nodes_ = other.nodes_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNodesIsMutable();
              nodes_.addAll(other.nodes_);
            }
            onChanged();
          }
        } else {
          if (!other.nodes_.isEmpty()) {
            if (nodesBuilder_.isEmpty()) {
              nodesBuilder_.dispose();
              nodesBuilder_ = null;
              nodes_ = other.nodes_;
              bitField0_ = (bitField0_ & ~0x00000001);
              nodesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getNodesFieldBuilder() : null;
            } else {
              nodesBuilder_.addAllMessages(other.nodes_);
            }
          }
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
              case 50: {
                emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.parser(),
                        extensionRegistry);
                if (nodesBuilder_ == null) {
                  ensureNodesIsMutable();
                  nodes_.add(m);
                } else {
                  nodesBuilder_.addMessage(m);
                }
                break;
              } // case 50
              case 80: {
                level_ = input.readInt32();

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
      private int bitField0_;

      private int level_ ;
      /**
       * <code>int32 level = 10;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>int32 level = 10;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 level = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode> nodes_ =
        java.util.Collections.emptyList();
      private void ensureNodesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          nodes_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode>(nodes_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode, emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.Builder, emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONodeOrBuilder> nodesBuilder_;

      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode> getNodesList() {
        if (nodesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(nodes_);
        } else {
          return nodesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public int getNodesCount() {
        if (nodesBuilder_ == null) {
          return nodes_.size();
        } else {
          return nodesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode getNodes(int index) {
        if (nodesBuilder_ == null) {
          return nodes_.get(index);
        } else {
          return nodesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public Builder setNodes(
          int index, emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode value) {
        if (nodesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodesIsMutable();
          nodes_.set(index, value);
          onChanged();
        } else {
          nodesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public Builder setNodes(
          int index, emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.Builder builderForValue) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.set(index, builderForValue.build());
          onChanged();
        } else {
          nodesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public Builder addNodes(emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode value) {
        if (nodesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodesIsMutable();
          nodes_.add(value);
          onChanged();
        } else {
          nodesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public Builder addNodes(
          int index, emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode value) {
        if (nodesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodesIsMutable();
          nodes_.add(index, value);
          onChanged();
        } else {
          nodesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public Builder addNodes(
          emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.Builder builderForValue) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.add(builderForValue.build());
          onChanged();
        } else {
          nodesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public Builder addNodes(
          int index, emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.Builder builderForValue) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.add(index, builderForValue.build());
          onChanged();
        } else {
          nodesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public Builder addAllNodes(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode> values) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, nodes_);
          onChanged();
        } else {
          nodesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public Builder clearNodes() {
        if (nodesBuilder_ == null) {
          nodes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          nodesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public Builder removeNodes(int index) {
        if (nodesBuilder_ == null) {
          ensureNodesIsMutable();
          nodes_.remove(index);
          onChanged();
        } else {
          nodesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.Builder getNodesBuilder(
          int index) {
        return getNodesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONodeOrBuilder getNodesOrBuilder(
          int index) {
        if (nodesBuilder_ == null) {
          return nodes_.get(index);  } else {
          return nodesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONodeOrBuilder> 
           getNodesOrBuilderList() {
        if (nodesBuilder_ != null) {
          return nodesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(nodes_);
        }
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.Builder addNodesBuilder() {
        return getNodesFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.getDefaultInstance());
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.Builder addNodesBuilder(
          int index) {
        return getNodesFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.getDefaultInstance());
      }
      /**
       * <code>repeated .DynamicSVONode nodes = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.Builder> 
           getNodesBuilderList() {
        return getNodesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode, emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.Builder, emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONodeOrBuilder> 
          getNodesFieldBuilder() {
        if (nodesBuilder_ == null) {
          nodesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode, emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONode.Builder, emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.DynamicSVONodeOrBuilder>(
                  nodes_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          nodes_ = null;
        }
        return nodesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DynamicLayerNodes)
    }

    // @@protoc_insertion_point(class_scope:DynamicLayerNodes)
    private static final emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes();
    }

    public static emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DynamicLayerNodes>
        PARSER = new com.google.protobuf.AbstractParser<DynamicLayerNodes>() {
      @java.lang.Override
      public DynamicLayerNodes parsePartialFrom(
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

    public static com.google.protobuf.Parser<DynamicLayerNodes> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DynamicLayerNodes> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.DynamicLayerNodesOuterClass.DynamicLayerNodes getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DynamicLayerNodes_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DynamicLayerNodes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027DynamicLayerNodes.proto\032\024DynamicSVONod" +
      "e.proto\"B\n\021DynamicLayerNodes\022\r\n\005level\030\n " +
      "\001(\005\022\036\n\005nodes\030\006 \003(\0132\017.DynamicSVONodeB\036\n\034e" +
      "mu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.getDescriptor(),
        });
    internal_static_DynamicLayerNodes_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DynamicLayerNodes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DynamicLayerNodes_descriptor,
        new java.lang.String[] { "Level", "Nodes", });
    emu.grasscutter.net.oldproto.DynamicSVONodeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
