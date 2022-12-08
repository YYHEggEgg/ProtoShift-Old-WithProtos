// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessEquipCardReq.proto

package emu.grasscutter.net.oldproto;

public final class IrodoriChessEquipCardReqOuterClass {
  private IrodoriChessEquipCardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriChessEquipCardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriChessEquipCardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_hard_map = 2;</code>
     * @return The isHardMap.
     */
    boolean getIsHardMap();

    /**
     * <code>uint32 level_id = 12;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 card_id = 9;</code>
     * @return The cardId.
     */
    int getCardId();
  }
  /**
   * <pre>
   * CmdId: 8561
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code IrodoriChessEquipCardReq}
   */
  public static final class IrodoriChessEquipCardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriChessEquipCardReq)
      IrodoriChessEquipCardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriChessEquipCardReq.newBuilder() to construct.
    private IrodoriChessEquipCardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriChessEquipCardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriChessEquipCardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.internal_static_IrodoriChessEquipCardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.internal_static_IrodoriChessEquipCardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq.class, emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq.Builder.class);
    }

    public static final int IS_HARD_MAP_FIELD_NUMBER = 2;
    private boolean isHardMap_;
    /**
     * <code>bool is_hard_map = 2;</code>
     * @return The isHardMap.
     */
    @java.lang.Override
    public boolean getIsHardMap() {
      return isHardMap_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 12;
    private int levelId_;
    /**
     * <code>uint32 level_id = 12;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 9;
    private int cardId_;
    /**
     * <code>uint32 card_id = 9;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
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
      if (isHardMap_ != false) {
        output.writeBool(2, isHardMap_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(9, cardId_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(12, levelId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isHardMap_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isHardMap_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, cardId_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq other = (emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq) obj;

      if (getIsHardMap()
          != other.getIsHardMap()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getCardId()
          != other.getCardId()) return false;
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
      hash = (37 * hash) + IS_HARD_MAP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHardMap());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq prototype) {
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
     * CmdId: 8561
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code IrodoriChessEquipCardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriChessEquipCardReq)
        emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.internal_static_IrodoriChessEquipCardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.internal_static_IrodoriChessEquipCardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq.class, emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isHardMap_ = false;

        levelId_ = 0;

        cardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.internal_static_IrodoriChessEquipCardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq build() {
        emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq buildPartial() {
        emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq result = new emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq(this);
        result.isHardMap_ = isHardMap_;
        result.levelId_ = levelId_;
        result.cardId_ = cardId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq other) {
        if (other == emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq.getDefaultInstance()) return this;
        if (other.getIsHardMap() != false) {
          setIsHardMap(other.getIsHardMap());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
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
                isHardMap_ = input.readBool();

                break;
              } // case 16
              case 72: {
                cardId_ = input.readUInt32();

                break;
              } // case 72
              case 96: {
                levelId_ = input.readUInt32();

                break;
              } // case 96
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

      private boolean isHardMap_ ;
      /**
       * <code>bool is_hard_map = 2;</code>
       * @return The isHardMap.
       */
      @java.lang.Override
      public boolean getIsHardMap() {
        return isHardMap_;
      }
      /**
       * <code>bool is_hard_map = 2;</code>
       * @param value The isHardMap to set.
       * @return This builder for chaining.
       */
      public Builder setIsHardMap(boolean value) {
        
        isHardMap_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_hard_map = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHardMap() {
        
        isHardMap_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 12;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 12;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 9;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 9;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IrodoriChessEquipCardReq)
    }

    // @@protoc_insertion_point(class_scope:IrodoriChessEquipCardReq)
    private static final emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq();
    }

    public static emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriChessEquipCardReq>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriChessEquipCardReq>() {
      @java.lang.Override
      public IrodoriChessEquipCardReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<IrodoriChessEquipCardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriChessEquipCardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriChessEquipCardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriChessEquipCardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036IrodoriChessEquipCardReq.proto\"R\n\030Irod" +
      "oriChessEquipCardReq\022\023\n\013is_hard_map\030\002 \001(" +
      "\010\022\020\n\010level_id\030\014 \001(\r\022\017\n\007card_id\030\t \001(\rB\036\n\034" +
      "emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IrodoriChessEquipCardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriChessEquipCardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriChessEquipCardReq_descriptor,
        new java.lang.String[] { "IsHardMap", "LevelId", "CardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
