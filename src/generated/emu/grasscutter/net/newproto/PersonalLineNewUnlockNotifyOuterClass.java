// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PersonalLineNewUnlockNotify.proto

package emu.grasscutter.net.newproto;

public final class PersonalLineNewUnlockNotifyOuterClass {
  private PersonalLineNewUnlockNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PersonalLineNewUnlockNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PersonalLineNewUnlockNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 personal_line_id_list = 6;</code>
     * @return A list containing the personalLineIdList.
     */
    java.util.List<java.lang.Integer> getPersonalLineIdListList();
    /**
     * <code>repeated uint32 personal_line_id_list = 6;</code>
     * @return The count of personalLineIdList.
     */
    int getPersonalLineIdListCount();
    /**
     * <code>repeated uint32 personal_line_id_list = 6;</code>
     * @param index The index of the element to return.
     * @return The personalLineIdList at the given index.
     */
    int getPersonalLineIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 411;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PersonalLineNewUnlockNotify}
   */
  public static final class PersonalLineNewUnlockNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PersonalLineNewUnlockNotify)
      PersonalLineNewUnlockNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PersonalLineNewUnlockNotify.newBuilder() to construct.
    private PersonalLineNewUnlockNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PersonalLineNewUnlockNotify() {
      personalLineIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PersonalLineNewUnlockNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.internal_static_PersonalLineNewUnlockNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.internal_static_PersonalLineNewUnlockNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify.class, emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify.Builder.class);
    }

    public static final int PERSONAL_LINE_ID_LIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList personalLineIdList_;
    /**
     * <code>repeated uint32 personal_line_id_list = 6;</code>
     * @return A list containing the personalLineIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getPersonalLineIdListList() {
      return personalLineIdList_;
    }
    /**
     * <code>repeated uint32 personal_line_id_list = 6;</code>
     * @return The count of personalLineIdList.
     */
    public int getPersonalLineIdListCount() {
      return personalLineIdList_.size();
    }
    /**
     * <code>repeated uint32 personal_line_id_list = 6;</code>
     * @param index The index of the element to return.
     * @return The personalLineIdList at the given index.
     */
    public int getPersonalLineIdList(int index) {
      return personalLineIdList_.getInt(index);
    }
    private int personalLineIdListMemoizedSerializedSize = -1;

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
      if (getPersonalLineIdListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(personalLineIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < personalLineIdList_.size(); i++) {
        output.writeUInt32NoTag(personalLineIdList_.getInt(i));
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
        for (int i = 0; i < personalLineIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(personalLineIdList_.getInt(i));
        }
        size += dataSize;
        if (!getPersonalLineIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        personalLineIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify other = (emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify) obj;

      if (!getPersonalLineIdListList()
          .equals(other.getPersonalLineIdListList())) return false;
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
      if (getPersonalLineIdListCount() > 0) {
        hash = (37 * hash) + PERSONAL_LINE_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPersonalLineIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify prototype) {
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
     *   CMD_ID = 411;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PersonalLineNewUnlockNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PersonalLineNewUnlockNotify)
        emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.internal_static_PersonalLineNewUnlockNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.internal_static_PersonalLineNewUnlockNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify.class, emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        personalLineIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.internal_static_PersonalLineNewUnlockNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify build() {
        emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify buildPartial() {
        emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify result = new emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          personalLineIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.personalLineIdList_ = personalLineIdList_;
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
        if (other instanceof emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify other) {
        if (other == emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify.getDefaultInstance()) return this;
        if (!other.personalLineIdList_.isEmpty()) {
          if (personalLineIdList_.isEmpty()) {
            personalLineIdList_ = other.personalLineIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePersonalLineIdListIsMutable();
            personalLineIdList_.addAll(other.personalLineIdList_);
          }
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
              case 48: {
                int v = input.readUInt32();
                ensurePersonalLineIdListIsMutable();
                personalLineIdList_.addInt(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensurePersonalLineIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  personalLineIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 50
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

      private com.google.protobuf.Internal.IntList personalLineIdList_ = emptyIntList();
      private void ensurePersonalLineIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          personalLineIdList_ = mutableCopy(personalLineIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 personal_line_id_list = 6;</code>
       * @return A list containing the personalLineIdList.
       */
      public java.util.List<java.lang.Integer>
          getPersonalLineIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(personalLineIdList_) : personalLineIdList_;
      }
      /**
       * <code>repeated uint32 personal_line_id_list = 6;</code>
       * @return The count of personalLineIdList.
       */
      public int getPersonalLineIdListCount() {
        return personalLineIdList_.size();
      }
      /**
       * <code>repeated uint32 personal_line_id_list = 6;</code>
       * @param index The index of the element to return.
       * @return The personalLineIdList at the given index.
       */
      public int getPersonalLineIdList(int index) {
        return personalLineIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 personal_line_id_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The personalLineIdList to set.
       * @return This builder for chaining.
       */
      public Builder setPersonalLineIdList(
          int index, int value) {
        ensurePersonalLineIdListIsMutable();
        personalLineIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 personal_line_id_list = 6;</code>
       * @param value The personalLineIdList to add.
       * @return This builder for chaining.
       */
      public Builder addPersonalLineIdList(int value) {
        ensurePersonalLineIdListIsMutable();
        personalLineIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 personal_line_id_list = 6;</code>
       * @param values The personalLineIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllPersonalLineIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensurePersonalLineIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, personalLineIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 personal_line_id_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPersonalLineIdList() {
        personalLineIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:PersonalLineNewUnlockNotify)
    }

    // @@protoc_insertion_point(class_scope:PersonalLineNewUnlockNotify)
    private static final emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify();
    }

    public static emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PersonalLineNewUnlockNotify>
        PARSER = new com.google.protobuf.AbstractParser<PersonalLineNewUnlockNotify>() {
      @java.lang.Override
      public PersonalLineNewUnlockNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PersonalLineNewUnlockNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PersonalLineNewUnlockNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PersonalLineNewUnlockNotifyOuterClass.PersonalLineNewUnlockNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PersonalLineNewUnlockNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PersonalLineNewUnlockNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!PersonalLineNewUnlockNotify.proto\"<\n\033P" +
      "ersonalLineNewUnlockNotify\022\035\n\025personal_l" +
      "ine_id_list\030\006 \003(\rB\036\n\034emu.grasscutter.net" +
      ".newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PersonalLineNewUnlockNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PersonalLineNewUnlockNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PersonalLineNewUnlockNotify_descriptor,
        new java.lang.String[] { "PersonalLineIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
