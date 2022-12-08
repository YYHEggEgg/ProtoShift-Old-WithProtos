// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlessingRecvFriendPicNotify.proto

package emu.grasscutter.net.newproto;

public final class BlessingRecvFriendPicNotifyOuterClass {
  private BlessingRecvFriendPicNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlessingRecvFriendPicNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlessingRecvFriendPicNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 pic_id = 4;</code>
     * @return The picId.
     */
    int getPicId();

    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2107;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code BlessingRecvFriendPicNotify}
   */
  public static final class BlessingRecvFriendPicNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlessingRecvFriendPicNotify)
      BlessingRecvFriendPicNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlessingRecvFriendPicNotify.newBuilder() to construct.
    private BlessingRecvFriendPicNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlessingRecvFriendPicNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlessingRecvFriendPicNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.internal_static_BlessingRecvFriendPicNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.internal_static_BlessingRecvFriendPicNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify.class, emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify.Builder.class);
    }

    public static final int PIC_ID_FIELD_NUMBER = 4;
    private int picId_;
    /**
     * <code>uint32 pic_id = 4;</code>
     * @return The picId.
     */
    @java.lang.Override
    public int getPicId() {
      return picId_;
    }

    public static final int UID_FIELD_NUMBER = 14;
    private int uid_;
    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      if (picId_ != 0) {
        output.writeUInt32(4, picId_);
      }
      if (uid_ != 0) {
        output.writeUInt32(14, uid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (picId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, picId_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, uid_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify other = (emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify) obj;

      if (getPicId()
          != other.getPicId()) return false;
      if (getUid()
          != other.getUid()) return false;
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
      hash = (37 * hash) + PIC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPicId();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify prototype) {
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
     *   CMD_ID = 2107;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code BlessingRecvFriendPicNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlessingRecvFriendPicNotify)
        emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.internal_static_BlessingRecvFriendPicNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.internal_static_BlessingRecvFriendPicNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify.class, emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        picId_ = 0;

        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.internal_static_BlessingRecvFriendPicNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify build() {
        emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify buildPartial() {
        emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify result = new emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify(this);
        result.picId_ = picId_;
        result.uid_ = uid_;
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
        if (other instanceof emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify other) {
        if (other == emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify.getDefaultInstance()) return this;
        if (other.getPicId() != 0) {
          setPicId(other.getPicId());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
                picId_ = input.readUInt32();

                break;
              } // case 32
              case 112: {
                uid_ = input.readUInt32();

                break;
              } // case 112
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

      private int picId_ ;
      /**
       * <code>uint32 pic_id = 4;</code>
       * @return The picId.
       */
      @java.lang.Override
      public int getPicId() {
        return picId_;
      }
      /**
       * <code>uint32 pic_id = 4;</code>
       * @param value The picId to set.
       * @return This builder for chaining.
       */
      public Builder setPicId(int value) {
        
        picId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pic_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPicId() {
        
        picId_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 14;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 14;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BlessingRecvFriendPicNotify)
    }

    // @@protoc_insertion_point(class_scope:BlessingRecvFriendPicNotify)
    private static final emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify();
    }

    public static emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlessingRecvFriendPicNotify>
        PARSER = new com.google.protobuf.AbstractParser<BlessingRecvFriendPicNotify>() {
      @java.lang.Override
      public BlessingRecvFriendPicNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<BlessingRecvFriendPicNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlessingRecvFriendPicNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.BlessingRecvFriendPicNotifyOuterClass.BlessingRecvFriendPicNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlessingRecvFriendPicNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlessingRecvFriendPicNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!BlessingRecvFriendPicNotify.proto\":\n\033B" +
      "lessingRecvFriendPicNotify\022\016\n\006pic_id\030\004 \001" +
      "(\r\022\013\n\003uid\030\016 \001(\rB\036\n\034emu.grasscutter.net.n" +
      "ewprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BlessingRecvFriendPicNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlessingRecvFriendPicNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlessingRecvFriendPicNotify_descriptor,
        new java.lang.String[] { "PicId", "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
