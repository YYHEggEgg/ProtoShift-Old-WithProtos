// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGLevelChallengeDeleteNotify.proto

package emu.grasscutter.net.newproto;

public final class GCGLevelChallengeDeleteNotifyOuterClass {
  private GCGLevelChallengeDeleteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGLevelChallengeDeleteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGLevelChallengeDeleteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 level_id_list = 6;</code>
     * @return A list containing the levelIdList.
     */
    java.util.List<java.lang.Integer> getLevelIdListList();
    /**
     * <code>repeated uint32 level_id_list = 6;</code>
     * @return The count of levelIdList.
     */
    int getLevelIdListCount();
    /**
     * <code>repeated uint32 level_id_list = 6;</code>
     * @param index The index of the element to return.
     * @return The levelIdList at the given index.
     */
    int getLevelIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7993;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGLevelChallengeDeleteNotify}
   */
  public static final class GCGLevelChallengeDeleteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGLevelChallengeDeleteNotify)
      GCGLevelChallengeDeleteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGLevelChallengeDeleteNotify.newBuilder() to construct.
    private GCGLevelChallengeDeleteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGLevelChallengeDeleteNotify() {
      levelIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGLevelChallengeDeleteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.internal_static_GCGLevelChallengeDeleteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.internal_static_GCGLevelChallengeDeleteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify.class, emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify.Builder.class);
    }

    public static final int LEVEL_ID_LIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList levelIdList_;
    /**
     * <code>repeated uint32 level_id_list = 6;</code>
     * @return A list containing the levelIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getLevelIdListList() {
      return levelIdList_;
    }
    /**
     * <code>repeated uint32 level_id_list = 6;</code>
     * @return The count of levelIdList.
     */
    public int getLevelIdListCount() {
      return levelIdList_.size();
    }
    /**
     * <code>repeated uint32 level_id_list = 6;</code>
     * @param index The index of the element to return.
     * @return The levelIdList at the given index.
     */
    public int getLevelIdList(int index) {
      return levelIdList_.getInt(index);
    }
    private int levelIdListMemoizedSerializedSize = -1;

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
      if (getLevelIdListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(levelIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < levelIdList_.size(); i++) {
        output.writeUInt32NoTag(levelIdList_.getInt(i));
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
        for (int i = 0; i < levelIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(levelIdList_.getInt(i));
        }
        size += dataSize;
        if (!getLevelIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        levelIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify other = (emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify) obj;

      if (!getLevelIdListList()
          .equals(other.getLevelIdListList())) return false;
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
      if (getLevelIdListCount() > 0) {
        hash = (37 * hash) + LEVEL_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getLevelIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify prototype) {
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
     *   CMD_ID = 7993;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGLevelChallengeDeleteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGLevelChallengeDeleteNotify)
        emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.internal_static_GCGLevelChallengeDeleteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.internal_static_GCGLevelChallengeDeleteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify.class, emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        levelIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.internal_static_GCGLevelChallengeDeleteNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify build() {
        emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify buildPartial() {
        emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify result = new emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          levelIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.levelIdList_ = levelIdList_;
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
        if (other instanceof emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify other) {
        if (other == emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify.getDefaultInstance()) return this;
        if (!other.levelIdList_.isEmpty()) {
          if (levelIdList_.isEmpty()) {
            levelIdList_ = other.levelIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLevelIdListIsMutable();
            levelIdList_.addAll(other.levelIdList_);
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
                ensureLevelIdListIsMutable();
                levelIdList_.addInt(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureLevelIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  levelIdList_.addInt(input.readUInt32());
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

      private com.google.protobuf.Internal.IntList levelIdList_ = emptyIntList();
      private void ensureLevelIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          levelIdList_ = mutableCopy(levelIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 level_id_list = 6;</code>
       * @return A list containing the levelIdList.
       */
      public java.util.List<java.lang.Integer>
          getLevelIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(levelIdList_) : levelIdList_;
      }
      /**
       * <code>repeated uint32 level_id_list = 6;</code>
       * @return The count of levelIdList.
       */
      public int getLevelIdListCount() {
        return levelIdList_.size();
      }
      /**
       * <code>repeated uint32 level_id_list = 6;</code>
       * @param index The index of the element to return.
       * @return The levelIdList at the given index.
       */
      public int getLevelIdList(int index) {
        return levelIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 level_id_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The levelIdList to set.
       * @return This builder for chaining.
       */
      public Builder setLevelIdList(
          int index, int value) {
        ensureLevelIdListIsMutable();
        levelIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 level_id_list = 6;</code>
       * @param value The levelIdList to add.
       * @return This builder for chaining.
       */
      public Builder addLevelIdList(int value) {
        ensureLevelIdListIsMutable();
        levelIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 level_id_list = 6;</code>
       * @param values The levelIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllLevelIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureLevelIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, levelIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 level_id_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelIdList() {
        levelIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:GCGLevelChallengeDeleteNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGLevelChallengeDeleteNotify)
    private static final emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify();
    }

    public static emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGLevelChallengeDeleteNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGLevelChallengeDeleteNotify>() {
      @java.lang.Override
      public GCGLevelChallengeDeleteNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGLevelChallengeDeleteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGLevelChallengeDeleteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGLevelChallengeDeleteNotifyOuterClass.GCGLevelChallengeDeleteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGLevelChallengeDeleteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGLevelChallengeDeleteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#GCGLevelChallengeDeleteNotify.proto\"6\n" +
      "\035GCGLevelChallengeDeleteNotify\022\025\n\rlevel_" +
      "id_list\030\006 \003(\rB\036\n\034emu.grasscutter.net.new" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGLevelChallengeDeleteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGLevelChallengeDeleteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGLevelChallengeDeleteNotify_descriptor,
        new java.lang.String[] { "LevelIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
