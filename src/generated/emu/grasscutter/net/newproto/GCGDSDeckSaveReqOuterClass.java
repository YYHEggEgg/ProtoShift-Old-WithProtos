// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSDeckSaveReq.proto

package emu.grasscutter.net.newproto;

public final class GCGDSDeckSaveReqOuterClass {
  private GCGDSDeckSaveReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSDeckSaveReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSDeckSaveReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 deck_id = 4;</code>
     * @return The deckId.
     */
    int getDeckId();

    /**
     * <code>repeated uint32 card_list = 11;</code>
     * @return A list containing the cardList.
     */
    java.util.List<java.lang.Integer> getCardListList();
    /**
     * <code>repeated uint32 card_list = 11;</code>
     * @return The count of cardList.
     */
    int getCardListCount();
    /**
     * <code>repeated uint32 card_list = 11;</code>
     * @param index The index of the element to return.
     * @return The cardList at the given index.
     */
    int getCardList(int index);

    /**
     * <code>repeated uint32 character_card_list = 6;</code>
     * @return A list containing the characterCardList.
     */
    java.util.List<java.lang.Integer> getCharacterCardListList();
    /**
     * <code>repeated uint32 character_card_list = 6;</code>
     * @return The count of characterCardList.
     */
    int getCharacterCardListCount();
    /**
     * <code>repeated uint32 character_card_list = 6;</code>
     * @param index The index of the element to return.
     * @return The characterCardList at the given index.
     */
    int getCharacterCardList(int index);

    /**
     * <code>string name = 5;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 5;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7713;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGDSDeckSaveReq}
   */
  public static final class GCGDSDeckSaveReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSDeckSaveReq)
      GCGDSDeckSaveReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSDeckSaveReq.newBuilder() to construct.
    private GCGDSDeckSaveReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSDeckSaveReq() {
      cardList_ = emptyIntList();
      characterCardList_ = emptyIntList();
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSDeckSaveReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.internal_static_GCGDSDeckSaveReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.internal_static_GCGDSDeckSaveReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq.class, emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq.Builder.class);
    }

    public static final int DECK_ID_FIELD_NUMBER = 4;
    private int deckId_;
    /**
     * <code>uint32 deck_id = 4;</code>
     * @return The deckId.
     */
    @java.lang.Override
    public int getDeckId() {
      return deckId_;
    }

    public static final int CARD_LIST_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList cardList_;
    /**
     * <code>repeated uint32 card_list = 11;</code>
     * @return A list containing the cardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCardListList() {
      return cardList_;
    }
    /**
     * <code>repeated uint32 card_list = 11;</code>
     * @return The count of cardList.
     */
    public int getCardListCount() {
      return cardList_.size();
    }
    /**
     * <code>repeated uint32 card_list = 11;</code>
     * @param index The index of the element to return.
     * @return The cardList at the given index.
     */
    public int getCardList(int index) {
      return cardList_.getInt(index);
    }
    private int cardListMemoizedSerializedSize = -1;

    public static final int CHARACTER_CARD_LIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList characterCardList_;
    /**
     * <code>repeated uint32 character_card_list = 6;</code>
     * @return A list containing the characterCardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCharacterCardListList() {
      return characterCardList_;
    }
    /**
     * <code>repeated uint32 character_card_list = 6;</code>
     * @return The count of characterCardList.
     */
    public int getCharacterCardListCount() {
      return characterCardList_.size();
    }
    /**
     * <code>repeated uint32 character_card_list = 6;</code>
     * @param index The index of the element to return.
     * @return The characterCardList at the given index.
     */
    public int getCharacterCardList(int index) {
      return characterCardList_.getInt(index);
    }
    private int characterCardListMemoizedSerializedSize = -1;

    public static final int NAME_FIELD_NUMBER = 5;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 5;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 5;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (deckId_ != 0) {
        output.writeUInt32(4, deckId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, name_);
      }
      if (getCharacterCardListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(characterCardListMemoizedSerializedSize);
      }
      for (int i = 0; i < characterCardList_.size(); i++) {
        output.writeUInt32NoTag(characterCardList_.getInt(i));
      }
      if (getCardListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(cardListMemoizedSerializedSize);
      }
      for (int i = 0; i < cardList_.size(); i++) {
        output.writeUInt32NoTag(cardList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (deckId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, deckId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, name_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < characterCardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(characterCardList_.getInt(i));
        }
        size += dataSize;
        if (!getCharacterCardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        characterCardListMemoizedSerializedSize = dataSize;
      }
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
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq other = (emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq) obj;

      if (getDeckId()
          != other.getDeckId()) return false;
      if (!getCardListList()
          .equals(other.getCardListList())) return false;
      if (!getCharacterCardListList()
          .equals(other.getCharacterCardListList())) return false;
      if (!getName()
          .equals(other.getName())) return false;
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
      hash = (37 * hash) + DECK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDeckId();
      if (getCardListCount() > 0) {
        hash = (37 * hash) + CARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCardListList().hashCode();
      }
      if (getCharacterCardListCount() > 0) {
        hash = (37 * hash) + CHARACTER_CARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCharacterCardListList().hashCode();
      }
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq prototype) {
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
     *   CMD_ID = 7713;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGDSDeckSaveReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSDeckSaveReq)
        emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.internal_static_GCGDSDeckSaveReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.internal_static_GCGDSDeckSaveReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq.class, emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        deckId_ = 0;

        cardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        characterCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.internal_static_GCGDSDeckSaveReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq build() {
        emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq buildPartial() {
        emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq result = new emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq(this);
        int from_bitField0_ = bitField0_;
        result.deckId_ = deckId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cardList_ = cardList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          characterCardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.characterCardList_ = characterCardList_;
        result.name_ = name_;
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
        if (other instanceof emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq) {
          return mergeFrom((emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq other) {
        if (other == emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq.getDefaultInstance()) return this;
        if (other.getDeckId() != 0) {
          setDeckId(other.getDeckId());
        }
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
        if (!other.characterCardList_.isEmpty()) {
          if (characterCardList_.isEmpty()) {
            characterCardList_ = other.characterCardList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureCharacterCardListIsMutable();
            characterCardList_.addAll(other.characterCardList_);
          }
          onChanged();
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
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
                deckId_ = input.readUInt32();

                break;
              } // case 32
              case 42: {
                name_ = input.readStringRequireUtf8();

                break;
              } // case 42
              case 48: {
                int v = input.readUInt32();
                ensureCharacterCardListIsMutable();
                characterCardList_.addInt(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCharacterCardListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  characterCardList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 50
              case 88: {
                int v = input.readUInt32();
                ensureCardListIsMutable();
                cardList_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCardListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  cardList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 90
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

      private int deckId_ ;
      /**
       * <code>uint32 deck_id = 4;</code>
       * @return The deckId.
       */
      @java.lang.Override
      public int getDeckId() {
        return deckId_;
      }
      /**
       * <code>uint32 deck_id = 4;</code>
       * @param value The deckId to set.
       * @return This builder for chaining.
       */
      public Builder setDeckId(int value) {
        
        deckId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 deck_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeckId() {
        
        deckId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList cardList_ = emptyIntList();
      private void ensureCardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cardList_ = mutableCopy(cardList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 card_list = 11;</code>
       * @return A list containing the cardList.
       */
      public java.util.List<java.lang.Integer>
          getCardListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cardList_) : cardList_;
      }
      /**
       * <code>repeated uint32 card_list = 11;</code>
       * @return The count of cardList.
       */
      public int getCardListCount() {
        return cardList_.size();
      }
      /**
       * <code>repeated uint32 card_list = 11;</code>
       * @param index The index of the element to return.
       * @return The cardList at the given index.
       */
      public int getCardList(int index) {
        return cardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 card_list = 11;</code>
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
       * <code>repeated uint32 card_list = 11;</code>
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
       * <code>repeated uint32 card_list = 11;</code>
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
       * <code>repeated uint32 card_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardList() {
        cardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList characterCardList_ = emptyIntList();
      private void ensureCharacterCardListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          characterCardList_ = mutableCopy(characterCardList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 character_card_list = 6;</code>
       * @return A list containing the characterCardList.
       */
      public java.util.List<java.lang.Integer>
          getCharacterCardListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(characterCardList_) : characterCardList_;
      }
      /**
       * <code>repeated uint32 character_card_list = 6;</code>
       * @return The count of characterCardList.
       */
      public int getCharacterCardListCount() {
        return characterCardList_.size();
      }
      /**
       * <code>repeated uint32 character_card_list = 6;</code>
       * @param index The index of the element to return.
       * @return The characterCardList at the given index.
       */
      public int getCharacterCardList(int index) {
        return characterCardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 character_card_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The characterCardList to set.
       * @return This builder for chaining.
       */
      public Builder setCharacterCardList(
          int index, int value) {
        ensureCharacterCardListIsMutable();
        characterCardList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 character_card_list = 6;</code>
       * @param value The characterCardList to add.
       * @return This builder for chaining.
       */
      public Builder addCharacterCardList(int value) {
        ensureCharacterCardListIsMutable();
        characterCardList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 character_card_list = 6;</code>
       * @param values The characterCardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCharacterCardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCharacterCardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, characterCardList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 character_card_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCharacterCardList() {
        characterCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 5;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 5;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 5;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 5;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
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


      // @@protoc_insertion_point(builder_scope:GCGDSDeckSaveReq)
    }

    // @@protoc_insertion_point(class_scope:GCGDSDeckSaveReq)
    private static final emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq();
    }

    public static emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSDeckSaveReq>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSDeckSaveReq>() {
      @java.lang.Override
      public GCGDSDeckSaveReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGDSDeckSaveReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSDeckSaveReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGDSDeckSaveReqOuterClass.GCGDSDeckSaveReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSDeckSaveReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSDeckSaveReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GCGDSDeckSaveReq.proto\"a\n\020GCGDSDeckSav" +
      "eReq\022\017\n\007deck_id\030\004 \001(\r\022\021\n\tcard_list\030\013 \003(\r" +
      "\022\033\n\023character_card_list\030\006 \003(\r\022\014\n\004name\030\005 " +
      "\001(\tB\036\n\034emu.grasscutter.net.newprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSDeckSaveReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSDeckSaveReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSDeckSaveReq_descriptor,
        new java.lang.String[] { "DeckId", "CardList", "CharacterCardList", "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
