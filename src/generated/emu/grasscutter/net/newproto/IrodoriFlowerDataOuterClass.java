// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriFlowerData.proto

package emu.grasscutter.net.newproto;

public final class IrodoriFlowerDataOuterClass {
  private IrodoriFlowerDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriFlowerDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriFlowerData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 finished_theme_list = 10;</code>
     * @return A list containing the finishedThemeList.
     */
    java.util.List<java.lang.Integer> getFinishedThemeListList();
    /**
     * <code>repeated uint32 finished_theme_list = 10;</code>
     * @return The count of finishedThemeList.
     */
    int getFinishedThemeListCount();
    /**
     * <code>repeated uint32 finished_theme_list = 10;</code>
     * @param index The index of the element to return.
     * @return The finishedThemeList at the given index.
     */
    int getFinishedThemeList(int index);

    /**
     * <code>repeated .ItemParam used_flower_list = 8;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam> 
        getUsedFlowerListList();
    /**
     * <code>repeated .ItemParam used_flower_list = 8;</code>
     */
    emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam getUsedFlowerList(int index);
    /**
     * <code>repeated .ItemParam used_flower_list = 8;</code>
     */
    int getUsedFlowerListCount();
    /**
     * <code>repeated .ItemParam used_flower_list = 8;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder> 
        getUsedFlowerListOrBuilderList();
    /**
     * <code>repeated .ItemParam used_flower_list = 8;</code>
     */
    emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder getUsedFlowerListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code IrodoriFlowerData}
   */
  public static final class IrodoriFlowerData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriFlowerData)
      IrodoriFlowerDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriFlowerData.newBuilder() to construct.
    private IrodoriFlowerData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriFlowerData() {
      finishedThemeList_ = emptyIntList();
      usedFlowerList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriFlowerData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.internal_static_IrodoriFlowerData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.internal_static_IrodoriFlowerData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData.class, emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData.Builder.class);
    }

    public static final int FINISHED_THEME_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList finishedThemeList_;
    /**
     * <code>repeated uint32 finished_theme_list = 10;</code>
     * @return A list containing the finishedThemeList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFinishedThemeListList() {
      return finishedThemeList_;
    }
    /**
     * <code>repeated uint32 finished_theme_list = 10;</code>
     * @return The count of finishedThemeList.
     */
    public int getFinishedThemeListCount() {
      return finishedThemeList_.size();
    }
    /**
     * <code>repeated uint32 finished_theme_list = 10;</code>
     * @param index The index of the element to return.
     * @return The finishedThemeList at the given index.
     */
    public int getFinishedThemeList(int index) {
      return finishedThemeList_.getInt(index);
    }
    private int finishedThemeListMemoizedSerializedSize = -1;

    public static final int USED_FLOWER_LIST_FIELD_NUMBER = 8;
    private java.util.List<emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam> usedFlowerList_;
    /**
     * <code>repeated .ItemParam used_flower_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam> getUsedFlowerListList() {
      return usedFlowerList_;
    }
    /**
     * <code>repeated .ItemParam used_flower_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder> 
        getUsedFlowerListOrBuilderList() {
      return usedFlowerList_;
    }
    /**
     * <code>repeated .ItemParam used_flower_list = 8;</code>
     */
    @java.lang.Override
    public int getUsedFlowerListCount() {
      return usedFlowerList_.size();
    }
    /**
     * <code>repeated .ItemParam used_flower_list = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam getUsedFlowerList(int index) {
      return usedFlowerList_.get(index);
    }
    /**
     * <code>repeated .ItemParam used_flower_list = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder getUsedFlowerListOrBuilder(
        int index) {
      return usedFlowerList_.get(index);
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
      for (int i = 0; i < usedFlowerList_.size(); i++) {
        output.writeMessage(8, usedFlowerList_.get(i));
      }
      if (getFinishedThemeListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(finishedThemeListMemoizedSerializedSize);
      }
      for (int i = 0; i < finishedThemeList_.size(); i++) {
        output.writeUInt32NoTag(finishedThemeList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < usedFlowerList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, usedFlowerList_.get(i));
      }
      {
        int dataSize = 0;
        for (int i = 0; i < finishedThemeList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(finishedThemeList_.getInt(i));
        }
        size += dataSize;
        if (!getFinishedThemeListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        finishedThemeListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData other = (emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData) obj;

      if (!getFinishedThemeListList()
          .equals(other.getFinishedThemeListList())) return false;
      if (!getUsedFlowerListList()
          .equals(other.getUsedFlowerListList())) return false;
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
      if (getFinishedThemeListCount() > 0) {
        hash = (37 * hash) + FINISHED_THEME_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFinishedThemeListList().hashCode();
      }
      if (getUsedFlowerListCount() > 0) {
        hash = (37 * hash) + USED_FLOWER_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getUsedFlowerListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData prototype) {
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
     * Protobuf type {@code IrodoriFlowerData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriFlowerData)
        emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.internal_static_IrodoriFlowerData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.internal_static_IrodoriFlowerData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData.class, emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        finishedThemeList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        if (usedFlowerListBuilder_ == null) {
          usedFlowerList_ = java.util.Collections.emptyList();
        } else {
          usedFlowerList_ = null;
          usedFlowerListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.internal_static_IrodoriFlowerData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData build() {
        emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData buildPartial() {
        emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData result = new emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          finishedThemeList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.finishedThemeList_ = finishedThemeList_;
        if (usedFlowerListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            usedFlowerList_ = java.util.Collections.unmodifiableList(usedFlowerList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.usedFlowerList_ = usedFlowerList_;
        } else {
          result.usedFlowerList_ = usedFlowerListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData) {
          return mergeFrom((emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData other) {
        if (other == emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData.getDefaultInstance()) return this;
        if (!other.finishedThemeList_.isEmpty()) {
          if (finishedThemeList_.isEmpty()) {
            finishedThemeList_ = other.finishedThemeList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFinishedThemeListIsMutable();
            finishedThemeList_.addAll(other.finishedThemeList_);
          }
          onChanged();
        }
        if (usedFlowerListBuilder_ == null) {
          if (!other.usedFlowerList_.isEmpty()) {
            if (usedFlowerList_.isEmpty()) {
              usedFlowerList_ = other.usedFlowerList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureUsedFlowerListIsMutable();
              usedFlowerList_.addAll(other.usedFlowerList_);
            }
            onChanged();
          }
        } else {
          if (!other.usedFlowerList_.isEmpty()) {
            if (usedFlowerListBuilder_.isEmpty()) {
              usedFlowerListBuilder_.dispose();
              usedFlowerListBuilder_ = null;
              usedFlowerList_ = other.usedFlowerList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              usedFlowerListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUsedFlowerListFieldBuilder() : null;
            } else {
              usedFlowerListBuilder_.addAllMessages(other.usedFlowerList_);
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
              case 66: {
                emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.parser(),
                        extensionRegistry);
                if (usedFlowerListBuilder_ == null) {
                  ensureUsedFlowerListIsMutable();
                  usedFlowerList_.add(m);
                } else {
                  usedFlowerListBuilder_.addMessage(m);
                }
                break;
              } // case 66
              case 80: {
                int v = input.readUInt32();
                ensureFinishedThemeListIsMutable();
                finishedThemeList_.addInt(v);
                break;
              } // case 80
              case 82: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureFinishedThemeListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  finishedThemeList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 82
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

      private com.google.protobuf.Internal.IntList finishedThemeList_ = emptyIntList();
      private void ensureFinishedThemeListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          finishedThemeList_ = mutableCopy(finishedThemeList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 finished_theme_list = 10;</code>
       * @return A list containing the finishedThemeList.
       */
      public java.util.List<java.lang.Integer>
          getFinishedThemeListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(finishedThemeList_) : finishedThemeList_;
      }
      /**
       * <code>repeated uint32 finished_theme_list = 10;</code>
       * @return The count of finishedThemeList.
       */
      public int getFinishedThemeListCount() {
        return finishedThemeList_.size();
      }
      /**
       * <code>repeated uint32 finished_theme_list = 10;</code>
       * @param index The index of the element to return.
       * @return The finishedThemeList at the given index.
       */
      public int getFinishedThemeList(int index) {
        return finishedThemeList_.getInt(index);
      }
      /**
       * <code>repeated uint32 finished_theme_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The finishedThemeList to set.
       * @return This builder for chaining.
       */
      public Builder setFinishedThemeList(
          int index, int value) {
        ensureFinishedThemeListIsMutable();
        finishedThemeList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_theme_list = 10;</code>
       * @param value The finishedThemeList to add.
       * @return This builder for chaining.
       */
      public Builder addFinishedThemeList(int value) {
        ensureFinishedThemeListIsMutable();
        finishedThemeList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_theme_list = 10;</code>
       * @param values The finishedThemeList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFinishedThemeList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFinishedThemeListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, finishedThemeList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_theme_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishedThemeList() {
        finishedThemeList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam> usedFlowerList_ =
        java.util.Collections.emptyList();
      private void ensureUsedFlowerListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          usedFlowerList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam>(usedFlowerList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder> usedFlowerListBuilder_;

      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam> getUsedFlowerListList() {
        if (usedFlowerListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(usedFlowerList_);
        } else {
          return usedFlowerListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public int getUsedFlowerListCount() {
        if (usedFlowerListBuilder_ == null) {
          return usedFlowerList_.size();
        } else {
          return usedFlowerListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam getUsedFlowerList(int index) {
        if (usedFlowerListBuilder_ == null) {
          return usedFlowerList_.get(index);
        } else {
          return usedFlowerListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public Builder setUsedFlowerList(
          int index, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam value) {
        if (usedFlowerListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUsedFlowerListIsMutable();
          usedFlowerList_.set(index, value);
          onChanged();
        } else {
          usedFlowerListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public Builder setUsedFlowerList(
          int index, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (usedFlowerListBuilder_ == null) {
          ensureUsedFlowerListIsMutable();
          usedFlowerList_.set(index, builderForValue.build());
          onChanged();
        } else {
          usedFlowerListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public Builder addUsedFlowerList(emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam value) {
        if (usedFlowerListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUsedFlowerListIsMutable();
          usedFlowerList_.add(value);
          onChanged();
        } else {
          usedFlowerListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public Builder addUsedFlowerList(
          int index, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam value) {
        if (usedFlowerListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUsedFlowerListIsMutable();
          usedFlowerList_.add(index, value);
          onChanged();
        } else {
          usedFlowerListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public Builder addUsedFlowerList(
          emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (usedFlowerListBuilder_ == null) {
          ensureUsedFlowerListIsMutable();
          usedFlowerList_.add(builderForValue.build());
          onChanged();
        } else {
          usedFlowerListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public Builder addUsedFlowerList(
          int index, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (usedFlowerListBuilder_ == null) {
          ensureUsedFlowerListIsMutable();
          usedFlowerList_.add(index, builderForValue.build());
          onChanged();
        } else {
          usedFlowerListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public Builder addAllUsedFlowerList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam> values) {
        if (usedFlowerListBuilder_ == null) {
          ensureUsedFlowerListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, usedFlowerList_);
          onChanged();
        } else {
          usedFlowerListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public Builder clearUsedFlowerList() {
        if (usedFlowerListBuilder_ == null) {
          usedFlowerList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          usedFlowerListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public Builder removeUsedFlowerList(int index) {
        if (usedFlowerListBuilder_ == null) {
          ensureUsedFlowerListIsMutable();
          usedFlowerList_.remove(index);
          onChanged();
        } else {
          usedFlowerListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder getUsedFlowerListBuilder(
          int index) {
        return getUsedFlowerListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder getUsedFlowerListOrBuilder(
          int index) {
        if (usedFlowerListBuilder_ == null) {
          return usedFlowerList_.get(index);  } else {
          return usedFlowerListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder> 
           getUsedFlowerListOrBuilderList() {
        if (usedFlowerListBuilder_ != null) {
          return usedFlowerListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(usedFlowerList_);
        }
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder addUsedFlowerListBuilder() {
        return getUsedFlowerListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder addUsedFlowerListBuilder(
          int index) {
        return getUsedFlowerListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam used_flower_list = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder> 
           getUsedFlowerListBuilderList() {
        return getUsedFlowerListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder> 
          getUsedFlowerListFieldBuilder() {
        if (usedFlowerListBuilder_ == null) {
          usedFlowerListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.newproto.ItemParamOuterClass.ItemParamOrBuilder>(
                  usedFlowerList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          usedFlowerList_ = null;
        }
        return usedFlowerListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:IrodoriFlowerData)
    }

    // @@protoc_insertion_point(class_scope:IrodoriFlowerData)
    private static final emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData();
    }

    public static emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriFlowerData>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriFlowerData>() {
      @java.lang.Override
      public IrodoriFlowerData parsePartialFrom(
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

    public static com.google.protobuf.Parser<IrodoriFlowerData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriFlowerData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.IrodoriFlowerDataOuterClass.IrodoriFlowerData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriFlowerData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriFlowerData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027IrodoriFlowerData.proto\032\017ItemParam.pro" +
      "to\"V\n\021IrodoriFlowerData\022\033\n\023finished_them" +
      "e_list\030\n \003(\r\022$\n\020used_flower_list\030\010 \003(\0132\n" +
      ".ItemParamB\036\n\034emu.grasscutter.net.newpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_IrodoriFlowerData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriFlowerData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriFlowerData_descriptor,
        new java.lang.String[] { "FinishedThemeList", "UsedFlowerList", });
    emu.grasscutter.net.newproto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
