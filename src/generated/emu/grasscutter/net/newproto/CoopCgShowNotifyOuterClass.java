// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoopCgShowNotify.proto

package emu.grasscutter.net.newproto;

public final class CoopCgShowNotifyOuterClass {
  private CoopCgShowNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoopCgShowNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoopCgShowNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 cg_list = 14;</code>
     * @return A list containing the cgList.
     */
    java.util.List<java.lang.Integer> getCgListList();
    /**
     * <code>repeated uint32 cg_list = 14;</code>
     * @return The count of cgList.
     */
    int getCgListCount();
    /**
     * <code>repeated uint32 cg_list = 14;</code>
     * @param index The index of the element to return.
     * @return The cgList at the given index.
     */
    int getCgList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1951;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code CoopCgShowNotify}
   */
  public static final class CoopCgShowNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoopCgShowNotify)
      CoopCgShowNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoopCgShowNotify.newBuilder() to construct.
    private CoopCgShowNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoopCgShowNotify() {
      cgList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoopCgShowNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.internal_static_CoopCgShowNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.internal_static_CoopCgShowNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify.class, emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify.Builder.class);
    }

    public static final int CG_LIST_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList cgList_;
    /**
     * <code>repeated uint32 cg_list = 14;</code>
     * @return A list containing the cgList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCgListList() {
      return cgList_;
    }
    /**
     * <code>repeated uint32 cg_list = 14;</code>
     * @return The count of cgList.
     */
    public int getCgListCount() {
      return cgList_.size();
    }
    /**
     * <code>repeated uint32 cg_list = 14;</code>
     * @param index The index of the element to return.
     * @return The cgList at the given index.
     */
    public int getCgList(int index) {
      return cgList_.getInt(index);
    }
    private int cgListMemoizedSerializedSize = -1;

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
      if (getCgListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(cgListMemoizedSerializedSize);
      }
      for (int i = 0; i < cgList_.size(); i++) {
        output.writeUInt32NoTag(cgList_.getInt(i));
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
        for (int i = 0; i < cgList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cgList_.getInt(i));
        }
        size += dataSize;
        if (!getCgListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cgListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify other = (emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify) obj;

      if (!getCgListList()
          .equals(other.getCgListList())) return false;
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
      if (getCgListCount() > 0) {
        hash = (37 * hash) + CG_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCgListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify prototype) {
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
     *   CMD_ID = 1951;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code CoopCgShowNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoopCgShowNotify)
        emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.internal_static_CoopCgShowNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.internal_static_CoopCgShowNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify.class, emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        cgList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.internal_static_CoopCgShowNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify build() {
        emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify buildPartial() {
        emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify result = new emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cgList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cgList_ = cgList_;
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
        if (other instanceof emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify other) {
        if (other == emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify.getDefaultInstance()) return this;
        if (!other.cgList_.isEmpty()) {
          if (cgList_.isEmpty()) {
            cgList_ = other.cgList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCgListIsMutable();
            cgList_.addAll(other.cgList_);
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
              case 112: {
                int v = input.readUInt32();
                ensureCgListIsMutable();
                cgList_.addInt(v);
                break;
              } // case 112
              case 114: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCgListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  cgList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 114
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

      private com.google.protobuf.Internal.IntList cgList_ = emptyIntList();
      private void ensureCgListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cgList_ = mutableCopy(cgList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 cg_list = 14;</code>
       * @return A list containing the cgList.
       */
      public java.util.List<java.lang.Integer>
          getCgListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cgList_) : cgList_;
      }
      /**
       * <code>repeated uint32 cg_list = 14;</code>
       * @return The count of cgList.
       */
      public int getCgListCount() {
        return cgList_.size();
      }
      /**
       * <code>repeated uint32 cg_list = 14;</code>
       * @param index The index of the element to return.
       * @return The cgList at the given index.
       */
      public int getCgList(int index) {
        return cgList_.getInt(index);
      }
      /**
       * <code>repeated uint32 cg_list = 14;</code>
       * @param index The index to set the value at.
       * @param value The cgList to set.
       * @return This builder for chaining.
       */
      public Builder setCgList(
          int index, int value) {
        ensureCgListIsMutable();
        cgList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cg_list = 14;</code>
       * @param value The cgList to add.
       * @return This builder for chaining.
       */
      public Builder addCgList(int value) {
        ensureCgListIsMutable();
        cgList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cg_list = 14;</code>
       * @param values The cgList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCgList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCgListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cgList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cg_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCgList() {
        cgList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:CoopCgShowNotify)
    }

    // @@protoc_insertion_point(class_scope:CoopCgShowNotify)
    private static final emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify();
    }

    public static emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoopCgShowNotify>
        PARSER = new com.google.protobuf.AbstractParser<CoopCgShowNotify>() {
      @java.lang.Override
      public CoopCgShowNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<CoopCgShowNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoopCgShowNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.CoopCgShowNotifyOuterClass.CoopCgShowNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoopCgShowNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoopCgShowNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026CoopCgShowNotify.proto\"#\n\020CoopCgShowNo" +
      "tify\022\017\n\007cg_list\030\016 \003(\rB\036\n\034emu.grasscutter" +
      ".net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CoopCgShowNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoopCgShowNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoopCgShowNotify_descriptor,
        new java.lang.String[] { "CgList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
