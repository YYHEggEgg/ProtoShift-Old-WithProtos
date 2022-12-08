// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestCreateEntityReq.proto

package emu.grasscutter.net.oldproto;

public final class QuestCreateEntityReqOuterClass {
  private QuestCreateEntityReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestCreateEntityReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestCreateEntityReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 parent_quest_id = 9;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();

    /**
     * <code>bool is_rewind = 3;</code>
     * @return The isRewind.
     */
    boolean getIsRewind();

    /**
     * <code>uint32 quest_id = 2;</code>
     * @return The questId.
     */
    int getQuestId();

    /**
     * <code>.CreateEntityInfo entity = 13;</code>
     * @return Whether the entity field is set.
     */
    boolean hasEntity();
    /**
     * <code>.CreateEntityInfo entity = 13;</code>
     * @return The entity.
     */
    emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity();
    /**
     * <code>.CreateEntityInfo entity = 13;</code>
     */
    emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 499
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code QuestCreateEntityReq}
   */
  public static final class QuestCreateEntityReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestCreateEntityReq)
      QuestCreateEntityReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestCreateEntityReq.newBuilder() to construct.
    private QuestCreateEntityReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestCreateEntityReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestCreateEntityReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.class, emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.Builder.class);
    }

    public static final int PARENT_QUEST_ID_FIELD_NUMBER = 9;
    private int parentQuestId_;
    /**
     * <code>uint32 parent_quest_id = 9;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
    }

    public static final int IS_REWIND_FIELD_NUMBER = 3;
    private boolean isRewind_;
    /**
     * <code>bool is_rewind = 3;</code>
     * @return The isRewind.
     */
    @java.lang.Override
    public boolean getIsRewind() {
      return isRewind_;
    }

    public static final int QUEST_ID_FIELD_NUMBER = 2;
    private int questId_;
    /**
     * <code>uint32 quest_id = 2;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
    }

    public static final int ENTITY_FIELD_NUMBER = 13;
    private emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo entity_;
    /**
     * <code>.CreateEntityInfo entity = 13;</code>
     * @return Whether the entity field is set.
     */
    @java.lang.Override
    public boolean hasEntity() {
      return entity_ != null;
    }
    /**
     * <code>.CreateEntityInfo entity = 13;</code>
     * @return The entity.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity() {
      return entity_ == null ? emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
    }
    /**
     * <code>.CreateEntityInfo entity = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder() {
      return getEntity();
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
      if (questId_ != 0) {
        output.writeUInt32(2, questId_);
      }
      if (isRewind_ != false) {
        output.writeBool(3, isRewind_);
      }
      if (parentQuestId_ != 0) {
        output.writeUInt32(9, parentQuestId_);
      }
      if (entity_ != null) {
        output.writeMessage(13, getEntity());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, questId_);
      }
      if (isRewind_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isRewind_);
      }
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, parentQuestId_);
      }
      if (entity_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getEntity());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq other = (emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq) obj;

      if (getParentQuestId()
          != other.getParentQuestId()) return false;
      if (getIsRewind()
          != other.getIsRewind()) return false;
      if (getQuestId()
          != other.getQuestId()) return false;
      if (hasEntity() != other.hasEntity()) return false;
      if (hasEntity()) {
        if (!getEntity()
            .equals(other.getEntity())) return false;
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
      hash = (37 * hash) + PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      hash = (37 * hash) + IS_REWIND_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsRewind());
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      if (hasEntity()) {
        hash = (37 * hash) + ENTITY_FIELD_NUMBER;
        hash = (53 * hash) + getEntity().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq prototype) {
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
     * CmdId: 499
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code QuestCreateEntityReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestCreateEntityReq)
        emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.class, emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        parentQuestId_ = 0;

        isRewind_ = false;

        questId_ = 0;

        if (entityBuilder_ == null) {
          entity_ = null;
        } else {
          entity_ = null;
          entityBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq build() {
        emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq buildPartial() {
        emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq result = new emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq(this);
        result.parentQuestId_ = parentQuestId_;
        result.isRewind_ = isRewind_;
        result.questId_ = questId_;
        if (entityBuilder_ == null) {
          result.entity_ = entity_;
        } else {
          result.entity_ = entityBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq other) {
        if (other == emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.getDefaultInstance()) return this;
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
        }
        if (other.getIsRewind() != false) {
          setIsRewind(other.getIsRewind());
        }
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
        }
        if (other.hasEntity()) {
          mergeEntity(other.getEntity());
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
              case 16: {
                questId_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                isRewind_ = input.readBool();

                break;
              } // case 24
              case 72: {
                parentQuestId_ = input.readUInt32();

                break;
              } // case 72
              case 106: {
                input.readMessage(
                    getEntityFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 106
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

      private int parentQuestId_ ;
      /**
       * <code>uint32 parent_quest_id = 9;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parent_quest_id = 9;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        
        parentQuestId_ = 0;
        onChanged();
        return this;
      }

      private boolean isRewind_ ;
      /**
       * <code>bool is_rewind = 3;</code>
       * @return The isRewind.
       */
      @java.lang.Override
      public boolean getIsRewind() {
        return isRewind_;
      }
      /**
       * <code>bool is_rewind = 3;</code>
       * @param value The isRewind to set.
       * @return This builder for chaining.
       */
      public Builder setIsRewind(boolean value) {
        
        isRewind_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_rewind = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsRewind() {
        
        isRewind_ = false;
        onChanged();
        return this;
      }

      private int questId_ ;
      /**
       * <code>uint32 quest_id = 2;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 quest_id = 2;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {
        
        questId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        
        questId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo entity_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder> entityBuilder_;
      /**
       * <code>.CreateEntityInfo entity = 13;</code>
       * @return Whether the entity field is set.
       */
      public boolean hasEntity() {
        return entityBuilder_ != null || entity_ != null;
      }
      /**
       * <code>.CreateEntityInfo entity = 13;</code>
       * @return The entity.
       */
      public emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity() {
        if (entityBuilder_ == null) {
          return entity_ == null ? emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
        } else {
          return entityBuilder_.getMessage();
        }
      }
      /**
       * <code>.CreateEntityInfo entity = 13;</code>
       */
      public Builder setEntity(emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo value) {
        if (entityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entity_ = value;
          onChanged();
        } else {
          entityBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 13;</code>
       */
      public Builder setEntity(
          emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder builderForValue) {
        if (entityBuilder_ == null) {
          entity_ = builderForValue.build();
          onChanged();
        } else {
          entityBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 13;</code>
       */
      public Builder mergeEntity(emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo value) {
        if (entityBuilder_ == null) {
          if (entity_ != null) {
            entity_ =
              emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo.newBuilder(entity_).mergeFrom(value).buildPartial();
          } else {
            entity_ = value;
          }
          onChanged();
        } else {
          entityBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 13;</code>
       */
      public Builder clearEntity() {
        if (entityBuilder_ == null) {
          entity_ = null;
          onChanged();
        } else {
          entity_ = null;
          entityBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 13;</code>
       */
      public emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder getEntityBuilder() {
        
        onChanged();
        return getEntityFieldBuilder().getBuilder();
      }
      /**
       * <code>.CreateEntityInfo entity = 13;</code>
       */
      public emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder() {
        if (entityBuilder_ != null) {
          return entityBuilder_.getMessageOrBuilder();
        } else {
          return entity_ == null ?
              emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
        }
      }
      /**
       * <code>.CreateEntityInfo entity = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder> 
          getEntityFieldBuilder() {
        if (entityBuilder_ == null) {
          entityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder>(
                  getEntity(),
                  getParentForChildren(),
                  isClean());
          entity_ = null;
        }
        return entityBuilder_;
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


      // @@protoc_insertion_point(builder_scope:QuestCreateEntityReq)
    }

    // @@protoc_insertion_point(class_scope:QuestCreateEntityReq)
    private static final emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq();
    }

    public static emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestCreateEntityReq>
        PARSER = new com.google.protobuf.AbstractParser<QuestCreateEntityReq>() {
      @java.lang.Override
      public QuestCreateEntityReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<QuestCreateEntityReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestCreateEntityReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestCreateEntityReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestCreateEntityReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032QuestCreateEntityReq.proto\032\026CreateEnti" +
      "tyInfo.proto\"w\n\024QuestCreateEntityReq\022\027\n\017" +
      "parent_quest_id\030\t \001(\r\022\021\n\tis_rewind\030\003 \001(\010" +
      "\022\020\n\010quest_id\030\002 \001(\r\022!\n\006entity\030\r \001(\0132\021.Cre" +
      "ateEntityInfoB\036\n\034emu.grasscutter.net.old" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.getDescriptor(),
        });
    internal_static_QuestCreateEntityReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestCreateEntityReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestCreateEntityReq_descriptor,
        new java.lang.String[] { "ParentQuestId", "IsRewind", "QuestId", "Entity", });
    emu.grasscutter.net.oldproto.CreateEntityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
