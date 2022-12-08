// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CombineReq.proto

package emu.grasscutter.net.newproto;

public final class CombineReqOuterClass {
  private CombineReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CombineReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CombineReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 avatar_guid = 6;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 combine_id = 5;</code>
     * @return The combineId.
     */
    int getCombineId();

    /**
     * <code>uint32 combine_count = 15;</code>
     * @return The combineCount.
     */
    int getCombineCount();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 675;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code CombineReq}
   */
  public static final class CombineReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CombineReq)
      CombineReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CombineReq.newBuilder() to construct.
    private CombineReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CombineReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CombineReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.CombineReqOuterClass.internal_static_CombineReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.CombineReqOuterClass.internal_static_CombineReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq.class, emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq.Builder.class);
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 6;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 6;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int COMBINE_ID_FIELD_NUMBER = 5;
    private int combineId_;
    /**
     * <code>uint32 combine_id = 5;</code>
     * @return The combineId.
     */
    @java.lang.Override
    public int getCombineId() {
      return combineId_;
    }

    public static final int COMBINE_COUNT_FIELD_NUMBER = 15;
    private int combineCount_;
    /**
     * <code>uint32 combine_count = 15;</code>
     * @return The combineCount.
     */
    @java.lang.Override
    public int getCombineCount() {
      return combineCount_;
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
      if (combineId_ != 0) {
        output.writeUInt32(5, combineId_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(6, avatarGuid_);
      }
      if (combineCount_ != 0) {
        output.writeUInt32(15, combineCount_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (combineId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, combineId_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, avatarGuid_);
      }
      if (combineCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, combineCount_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq other = (emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq) obj;

      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getCombineId()
          != other.getCombineId()) return false;
      if (getCombineCount()
          != other.getCombineCount()) return false;
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
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + COMBINE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCombineId();
      hash = (37 * hash) + COMBINE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCombineCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq prototype) {
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
     *   CMD_ID = 675;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code CombineReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CombineReq)
        emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.CombineReqOuterClass.internal_static_CombineReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.CombineReqOuterClass.internal_static_CombineReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq.class, emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        avatarGuid_ = 0L;

        combineId_ = 0;

        combineCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.CombineReqOuterClass.internal_static_CombineReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq build() {
        emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq buildPartial() {
        emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq result = new emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq(this);
        result.avatarGuid_ = avatarGuid_;
        result.combineId_ = combineId_;
        result.combineCount_ = combineCount_;
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
        if (other instanceof emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq) {
          return mergeFrom((emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq other) {
        if (other == emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq.getDefaultInstance()) return this;
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getCombineId() != 0) {
          setCombineId(other.getCombineId());
        }
        if (other.getCombineCount() != 0) {
          setCombineCount(other.getCombineCount());
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
                combineId_ = input.readUInt32();

                break;
              } // case 40
              case 48: {
                avatarGuid_ = input.readUInt64();

                break;
              } // case 48
              case 120: {
                combineCount_ = input.readUInt32();

                break;
              } // case 120
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

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 6;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 6;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int combineId_ ;
      /**
       * <code>uint32 combine_id = 5;</code>
       * @return The combineId.
       */
      @java.lang.Override
      public int getCombineId() {
        return combineId_;
      }
      /**
       * <code>uint32 combine_id = 5;</code>
       * @param value The combineId to set.
       * @return This builder for chaining.
       */
      public Builder setCombineId(int value) {
        
        combineId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 combine_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCombineId() {
        
        combineId_ = 0;
        onChanged();
        return this;
      }

      private int combineCount_ ;
      /**
       * <code>uint32 combine_count = 15;</code>
       * @return The combineCount.
       */
      @java.lang.Override
      public int getCombineCount() {
        return combineCount_;
      }
      /**
       * <code>uint32 combine_count = 15;</code>
       * @param value The combineCount to set.
       * @return This builder for chaining.
       */
      public Builder setCombineCount(int value) {
        
        combineCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 combine_count = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCombineCount() {
        
        combineCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CombineReq)
    }

    // @@protoc_insertion_point(class_scope:CombineReq)
    private static final emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq();
    }

    public static emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CombineReq>
        PARSER = new com.google.protobuf.AbstractParser<CombineReq>() {
      @java.lang.Override
      public CombineReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<CombineReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CombineReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.CombineReqOuterClass.CombineReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CombineReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CombineReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020CombineReq.proto\"L\n\nCombineReq\022\023\n\013avat" +
      "ar_guid\030\006 \001(\004\022\022\n\ncombine_id\030\005 \001(\r\022\025\n\rcom" +
      "bine_count\030\017 \001(\rB\036\n\034emu.grasscutter.net." +
      "newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CombineReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CombineReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CombineReq_descriptor,
        new java.lang.String[] { "AvatarGuid", "CombineId", "CombineCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
