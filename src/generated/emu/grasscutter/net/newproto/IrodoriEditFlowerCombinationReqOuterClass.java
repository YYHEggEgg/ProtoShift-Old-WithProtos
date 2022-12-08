// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriEditFlowerCombinationReq.proto

package emu.grasscutter.net.newproto;

public final class IrodoriEditFlowerCombinationReqOuterClass {
  private IrodoriEditFlowerCombinationReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriEditFlowerCombinationReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriEditFlowerCombinationReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
     * @return Whether the combinationInfo field is set.
     */
    boolean hasCombinationInfo();
    /**
     * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
     * @return The combinationInfo.
     */
    emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCombinationInfo();
    /**
     * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
     */
    emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCombinationInfoOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8835;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code IrodoriEditFlowerCombinationReq}
   */
  public static final class IrodoriEditFlowerCombinationReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriEditFlowerCombinationReq)
      IrodoriEditFlowerCombinationReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriEditFlowerCombinationReq.newBuilder() to construct.
    private IrodoriEditFlowerCombinationReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriEditFlowerCombinationReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriEditFlowerCombinationReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.internal_static_IrodoriEditFlowerCombinationReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.internal_static_IrodoriEditFlowerCombinationReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq.class, emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 1;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int COMBINATION_INFO_FIELD_NUMBER = 12;
    private emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo combinationInfo_;
    /**
     * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
     * @return Whether the combinationInfo field is set.
     */
    @java.lang.Override
    public boolean hasCombinationInfo() {
      return combinationInfo_ != null;
    }
    /**
     * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
     * @return The combinationInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCombinationInfo() {
      return combinationInfo_ == null ? emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : combinationInfo_;
    }
    /**
     * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCombinationInfoOrBuilder() {
      return getCombinationInfo();
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
      if (entityId_ != 0) {
        output.writeUInt32(1, entityId_);
      }
      if (combinationInfo_ != null) {
        output.writeMessage(12, getCombinationInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, entityId_);
      }
      if (combinationInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getCombinationInfo());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq other = (emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasCombinationInfo() != other.hasCombinationInfo()) return false;
      if (hasCombinationInfo()) {
        if (!getCombinationInfo()
            .equals(other.getCombinationInfo())) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasCombinationInfo()) {
        hash = (37 * hash) + COMBINATION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getCombinationInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq prototype) {
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
     *   CMD_ID = 8835;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code IrodoriEditFlowerCombinationReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriEditFlowerCombinationReq)
        emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.internal_static_IrodoriEditFlowerCombinationReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.internal_static_IrodoriEditFlowerCombinationReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq.class, emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        entityId_ = 0;

        if (combinationInfoBuilder_ == null) {
          combinationInfo_ = null;
        } else {
          combinationInfo_ = null;
          combinationInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.internal_static_IrodoriEditFlowerCombinationReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq build() {
        emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq buildPartial() {
        emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq result = new emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq(this);
        result.entityId_ = entityId_;
        if (combinationInfoBuilder_ == null) {
          result.combinationInfo_ = combinationInfo_;
        } else {
          result.combinationInfo_ = combinationInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq) {
          return mergeFrom((emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq other) {
        if (other == emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasCombinationInfo()) {
          mergeCombinationInfo(other.getCombinationInfo());
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
              case 8: {
                entityId_ = input.readUInt32();

                break;
              } // case 8
              case 98: {
                input.readMessage(
                    getCombinationInfoFieldBuilder().getBuilder(),
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

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo combinationInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder> combinationInfoBuilder_;
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
       * @return Whether the combinationInfo field is set.
       */
      public boolean hasCombinationInfo() {
        return combinationInfoBuilder_ != null || combinationInfo_ != null;
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
       * @return The combinationInfo.
       */
      public emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCombinationInfo() {
        if (combinationInfoBuilder_ == null) {
          return combinationInfo_ == null ? emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : combinationInfo_;
        } else {
          return combinationInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
       */
      public Builder setCombinationInfo(emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo value) {
        if (combinationInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          combinationInfo_ = value;
          onChanged();
        } else {
          combinationInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
       */
      public Builder setCombinationInfo(
          emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder builderForValue) {
        if (combinationInfoBuilder_ == null) {
          combinationInfo_ = builderForValue.build();
          onChanged();
        } else {
          combinationInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
       */
      public Builder mergeCombinationInfo(emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo value) {
        if (combinationInfoBuilder_ == null) {
          if (combinationInfo_ != null) {
            combinationInfo_ =
              emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.newBuilder(combinationInfo_).mergeFrom(value).buildPartial();
          } else {
            combinationInfo_ = value;
          }
          onChanged();
        } else {
          combinationInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
       */
      public Builder clearCombinationInfo() {
        if (combinationInfoBuilder_ == null) {
          combinationInfo_ = null;
          onChanged();
        } else {
          combinationInfo_ = null;
          combinationInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
       */
      public emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder getCombinationInfoBuilder() {
        
        onChanged();
        return getCombinationInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
       */
      public emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCombinationInfoOrBuilder() {
        if (combinationInfoBuilder_ != null) {
          return combinationInfoBuilder_.getMessageOrBuilder();
        } else {
          return combinationInfo_ == null ?
              emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance() : combinationInfo_;
        }
      }
      /**
       * <code>.CustomGadgetTreeInfo combination_info = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder> 
          getCombinationInfoFieldBuilder() {
        if (combinationInfoBuilder_ == null) {
          combinationInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder>(
                  getCombinationInfo(),
                  getParentForChildren(),
                  isClean());
          combinationInfo_ = null;
        }
        return combinationInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:IrodoriEditFlowerCombinationReq)
    }

    // @@protoc_insertion_point(class_scope:IrodoriEditFlowerCombinationReq)
    private static final emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq();
    }

    public static emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriEditFlowerCombinationReq>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriEditFlowerCombinationReq>() {
      @java.lang.Override
      public IrodoriEditFlowerCombinationReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<IrodoriEditFlowerCombinationReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriEditFlowerCombinationReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.IrodoriEditFlowerCombinationReqOuterClass.IrodoriEditFlowerCombinationReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriEditFlowerCombinationReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriEditFlowerCombinationReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%IrodoriEditFlowerCombinationReq.proto\032" +
      "\032CustomGadgetTreeInfo.proto\"e\n\037IrodoriEd" +
      "itFlowerCombinationReq\022\021\n\tentity_id\030\001 \001(" +
      "\r\022/\n\020combination_info\030\014 \001(\0132\025.CustomGadg" +
      "etTreeInfoB\036\n\034emu.grasscutter.net.newpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.getDescriptor(),
        });
    internal_static_IrodoriEditFlowerCombinationReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriEditFlowerCombinationReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriEditFlowerCombinationReq_descriptor,
        new java.lang.String[] { "EntityId", "CombinationInfo", });
    emu.grasscutter.net.newproto.CustomGadgetTreeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
