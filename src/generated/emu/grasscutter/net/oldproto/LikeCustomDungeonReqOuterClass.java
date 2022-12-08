// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LikeCustomDungeonReq.proto

package emu.grasscutter.net.oldproto;

public final class LikeCustomDungeonReqOuterClass {
  private LikeCustomDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LikeCustomDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LikeCustomDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_cancel_like = 5;</code>
     * @return The isCancelLike.
     */
    boolean getIsCancelLike();

    /**
     * <code>uint64 dungeon_guid = 10;</code>
     * @return The dungeonGuid.
     */
    long getDungeonGuid();
  }
  /**
   * <pre>
   * CmdId: 6210
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code LikeCustomDungeonReq}
   */
  public static final class LikeCustomDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LikeCustomDungeonReq)
      LikeCustomDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LikeCustomDungeonReq.newBuilder() to construct.
    private LikeCustomDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LikeCustomDungeonReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LikeCustomDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.internal_static_LikeCustomDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.internal_static_LikeCustomDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq.class, emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq.Builder.class);
    }

    public static final int IS_CANCEL_LIKE_FIELD_NUMBER = 5;
    private boolean isCancelLike_;
    /**
     * <code>bool is_cancel_like = 5;</code>
     * @return The isCancelLike.
     */
    @java.lang.Override
    public boolean getIsCancelLike() {
      return isCancelLike_;
    }

    public static final int DUNGEON_GUID_FIELD_NUMBER = 10;
    private long dungeonGuid_;
    /**
     * <code>uint64 dungeon_guid = 10;</code>
     * @return The dungeonGuid.
     */
    @java.lang.Override
    public long getDungeonGuid() {
      return dungeonGuid_;
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
      if (isCancelLike_ != false) {
        output.writeBool(5, isCancelLike_);
      }
      if (dungeonGuid_ != 0L) {
        output.writeUInt64(10, dungeonGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isCancelLike_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isCancelLike_);
      }
      if (dungeonGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(10, dungeonGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq other = (emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq) obj;

      if (getIsCancelLike()
          != other.getIsCancelLike()) return false;
      if (getDungeonGuid()
          != other.getDungeonGuid()) return false;
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
      hash = (37 * hash) + IS_CANCEL_LIKE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsCancelLike());
      hash = (37 * hash) + DUNGEON_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDungeonGuid());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq prototype) {
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
     * CmdId: 6210
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code LikeCustomDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LikeCustomDungeonReq)
        emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.internal_static_LikeCustomDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.internal_static_LikeCustomDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq.class, emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isCancelLike_ = false;

        dungeonGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.internal_static_LikeCustomDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq build() {
        emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq buildPartial() {
        emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq result = new emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq(this);
        result.isCancelLike_ = isCancelLike_;
        result.dungeonGuid_ = dungeonGuid_;
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
        if (other instanceof emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq other) {
        if (other == emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq.getDefaultInstance()) return this;
        if (other.getIsCancelLike() != false) {
          setIsCancelLike(other.getIsCancelLike());
        }
        if (other.getDungeonGuid() != 0L) {
          setDungeonGuid(other.getDungeonGuid());
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
              case 40: {
                isCancelLike_ = input.readBool();

                break;
              } // case 40
              case 80: {
                dungeonGuid_ = input.readUInt64();

                break;
              } // case 80
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

      private boolean isCancelLike_ ;
      /**
       * <code>bool is_cancel_like = 5;</code>
       * @return The isCancelLike.
       */
      @java.lang.Override
      public boolean getIsCancelLike() {
        return isCancelLike_;
      }
      /**
       * <code>bool is_cancel_like = 5;</code>
       * @param value The isCancelLike to set.
       * @return This builder for chaining.
       */
      public Builder setIsCancelLike(boolean value) {
        
        isCancelLike_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_cancel_like = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCancelLike() {
        
        isCancelLike_ = false;
        onChanged();
        return this;
      }

      private long dungeonGuid_ ;
      /**
       * <code>uint64 dungeon_guid = 10;</code>
       * @return The dungeonGuid.
       */
      @java.lang.Override
      public long getDungeonGuid() {
        return dungeonGuid_;
      }
      /**
       * <code>uint64 dungeon_guid = 10;</code>
       * @param value The dungeonGuid to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonGuid(long value) {
        
        dungeonGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 dungeon_guid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonGuid() {
        
        dungeonGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:LikeCustomDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:LikeCustomDungeonReq)
    private static final emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq();
    }

    public static emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LikeCustomDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<LikeCustomDungeonReq>() {
      @java.lang.Override
      public LikeCustomDungeonReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<LikeCustomDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LikeCustomDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.LikeCustomDungeonReqOuterClass.LikeCustomDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LikeCustomDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LikeCustomDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032LikeCustomDungeonReq.proto\"D\n\024LikeCust" +
      "omDungeonReq\022\026\n\016is_cancel_like\030\005 \001(\010\022\024\n\014" +
      "dungeon_guid\030\n \001(\004B\036\n\034emu.grasscutter.ne" +
      "t.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LikeCustomDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LikeCustomDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LikeCustomDungeonReq_descriptor,
        new java.lang.String[] { "IsCancelLike", "DungeonGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
