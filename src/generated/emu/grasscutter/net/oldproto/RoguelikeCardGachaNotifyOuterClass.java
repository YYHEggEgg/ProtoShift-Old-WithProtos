// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeCardGachaNotify.proto

package emu.grasscutter.net.oldproto;

public final class RoguelikeCardGachaNotifyOuterClass {
  private RoguelikeCardGachaNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeCardGachaNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeCardGachaNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 card_list = 10;</code>
     * @return A list containing the cardList.
     */
    java.util.List<java.lang.Integer> getCardListList();
    /**
     * <code>repeated uint32 card_list = 10;</code>
     * @return The count of cardList.
     */
    int getCardListCount();
    /**
     * <code>repeated uint32 card_list = 10;</code>
     * @param index The index of the element to return.
     * @return The cardList at the given index.
     */
    int getCardList(int index);

    /**
     * <code>bool is_can_refresh = 11;</code>
     * @return The isCanRefresh.
     */
    boolean getIsCanRefresh();
  }
  /**
   * <pre>
   * CmdId: 8925
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code RoguelikeCardGachaNotify}
   */
  public static final class RoguelikeCardGachaNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeCardGachaNotify)
      RoguelikeCardGachaNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeCardGachaNotify.newBuilder() to construct.
    private RoguelikeCardGachaNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeCardGachaNotify() {
      cardList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeCardGachaNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.internal_static_RoguelikeCardGachaNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.internal_static_RoguelikeCardGachaNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify.class, emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify.Builder.class);
    }

    public static final int CARD_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList cardList_;
    /**
     * <code>repeated uint32 card_list = 10;</code>
     * @return A list containing the cardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCardListList() {
      return cardList_;
    }
    /**
     * <code>repeated uint32 card_list = 10;</code>
     * @return The count of cardList.
     */
    public int getCardListCount() {
      return cardList_.size();
    }
    /**
     * <code>repeated uint32 card_list = 10;</code>
     * @param index The index of the element to return.
     * @return The cardList at the given index.
     */
    public int getCardList(int index) {
      return cardList_.getInt(index);
    }
    private int cardListMemoizedSerializedSize = -1;

    public static final int IS_CAN_REFRESH_FIELD_NUMBER = 11;
    private boolean isCanRefresh_;
    /**
     * <code>bool is_can_refresh = 11;</code>
     * @return The isCanRefresh.
     */
    @java.lang.Override
    public boolean getIsCanRefresh() {
      return isCanRefresh_;
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
      getSerializedSize();
      if (getCardListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(cardListMemoizedSerializedSize);
      }
      for (int i = 0; i < cardList_.size(); i++) {
        output.writeUInt32NoTag(cardList_.getInt(i));
      }
      if (isCanRefresh_ != false) {
        output.writeBool(11, isCanRefresh_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < cardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cardList_.getInt(i));
        }
        size += dataSize;
        if (!getCardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cardListMemoizedSerializedSize = dataSize;
      }
      if (isCanRefresh_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isCanRefresh_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify other = (emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify) obj;

      if (!getCardListList()
          .equals(other.getCardListList())) return false;
      if (getIsCanRefresh()
          != other.getIsCanRefresh()) return false;
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
      if (getCardListCount() > 0) {
        hash = (37 * hash) + CARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCardListList().hashCode();
      }
      hash = (37 * hash) + IS_CAN_REFRESH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsCanRefresh());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify prototype) {
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
     * CmdId: 8925
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code RoguelikeCardGachaNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeCardGachaNotify)
        emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.internal_static_RoguelikeCardGachaNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.internal_static_RoguelikeCardGachaNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify.class, emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        cardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        isCanRefresh_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.internal_static_RoguelikeCardGachaNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify build() {
        emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify buildPartial() {
        emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify result = new emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cardList_ = cardList_;
        result.isCanRefresh_ = isCanRefresh_;
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
        if (other instanceof emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify other) {
        if (other == emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify.getDefaultInstance()) return this;
        if (!other.cardList_.isEmpty()) {
          if (cardList_.isEmpty()) {
            cardList_ = other.cardList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCardListIsMutable();
            cardList_.addAll(other.cardList_);
          }
          onChanged();
        }
        if (other.getIsCanRefresh() != false) {
          setIsCanRefresh(other.getIsCanRefresh());
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
              case 80: {
                int v = input.readUInt32();
                ensureCardListIsMutable();
                cardList_.addInt(v);
                break;
              } // case 80
              case 82: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCardListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  cardList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 82
              case 88: {
                isCanRefresh_ = input.readBool();

                break;
              } // case 88
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

      private com.google.protobuf.Internal.IntList cardList_ = emptyIntList();
      private void ensureCardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cardList_ = mutableCopy(cardList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 card_list = 10;</code>
       * @return A list containing the cardList.
       */
      public java.util.List<java.lang.Integer>
          getCardListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cardList_) : cardList_;
      }
      /**
       * <code>repeated uint32 card_list = 10;</code>
       * @return The count of cardList.
       */
      public int getCardListCount() {
        return cardList_.size();
      }
      /**
       * <code>repeated uint32 card_list = 10;</code>
       * @param index The index of the element to return.
       * @return The cardList at the given index.
       */
      public int getCardList(int index) {
        return cardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 card_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The cardList to set.
       * @return This builder for chaining.
       */
      public Builder setCardList(
          int index, int value) {
        ensureCardListIsMutable();
        cardList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_list = 10;</code>
       * @param value The cardList to add.
       * @return This builder for chaining.
       */
      public Builder addCardList(int value) {
        ensureCardListIsMutable();
        cardList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_list = 10;</code>
       * @param values The cardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cardList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardList() {
        cardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isCanRefresh_ ;
      /**
       * <code>bool is_can_refresh = 11;</code>
       * @return The isCanRefresh.
       */
      @java.lang.Override
      public boolean getIsCanRefresh() {
        return isCanRefresh_;
      }
      /**
       * <code>bool is_can_refresh = 11;</code>
       * @param value The isCanRefresh to set.
       * @return This builder for chaining.
       */
      public Builder setIsCanRefresh(boolean value) {
        
        isCanRefresh_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_can_refresh = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCanRefresh() {
        
        isCanRefresh_ = false;
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


      // @@protoc_insertion_point(builder_scope:RoguelikeCardGachaNotify)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeCardGachaNotify)
    private static final emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify();
    }

    public static emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeCardGachaNotify>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeCardGachaNotify>() {
      @java.lang.Override
      public RoguelikeCardGachaNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<RoguelikeCardGachaNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeCardGachaNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.RoguelikeCardGachaNotifyOuterClass.RoguelikeCardGachaNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeCardGachaNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeCardGachaNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036RoguelikeCardGachaNotify.proto\"E\n\030Rogu" +
      "elikeCardGachaNotify\022\021\n\tcard_list\030\n \003(\r\022" +
      "\026\n\016is_can_refresh\030\013 \001(\010B\036\n\034emu.grasscutt" +
      "er.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoguelikeCardGachaNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeCardGachaNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeCardGachaNotify_descriptor,
        new java.lang.String[] { "CardList", "IsCanRefresh", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
