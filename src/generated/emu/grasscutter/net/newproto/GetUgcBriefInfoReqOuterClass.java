// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetUgcBriefInfoReq.proto

package emu.grasscutter.net.newproto;

public final class GetUgcBriefInfoReqOuterClass {
  private GetUgcBriefInfoReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetUgcBriefInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetUgcBriefInfoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 ugc_guid = 5;</code>
     * @return The ugcGuid.
     */
    long getUgcGuid();

    /**
     * <code>.UgcType ugc_type = 1;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    int getUgcTypeValue();
    /**
     * <code>.UgcType ugc_type = 1;</code>
     * @return The ugcType.
     */
    emu.grasscutter.net.newproto.UgcTypeOuterClass.UgcType getUgcType();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 6322;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GetUgcBriefInfoReq}
   */
  public static final class GetUgcBriefInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetUgcBriefInfoReq)
      GetUgcBriefInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetUgcBriefInfoReq.newBuilder() to construct.
    private GetUgcBriefInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetUgcBriefInfoReq() {
      ugcType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetUgcBriefInfoReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.internal_static_GetUgcBriefInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.internal_static_GetUgcBriefInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq.class, emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq.Builder.class);
    }

    public static final int UGC_GUID_FIELD_NUMBER = 5;
    private long ugcGuid_;
    /**
     * <code>uint64 ugc_guid = 5;</code>
     * @return The ugcGuid.
     */
    @java.lang.Override
    public long getUgcGuid() {
      return ugcGuid_;
    }

    public static final int UGC_TYPE_FIELD_NUMBER = 1;
    private int ugcType_;
    /**
     * <code>.UgcType ugc_type = 1;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    @java.lang.Override public int getUgcTypeValue() {
      return ugcType_;
    }
    /**
     * <code>.UgcType ugc_type = 1;</code>
     * @return The ugcType.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.UgcTypeOuterClass.UgcType getUgcType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.UgcTypeOuterClass.UgcType result = emu.grasscutter.net.newproto.UgcTypeOuterClass.UgcType.valueOf(ugcType_);
      return result == null ? emu.grasscutter.net.newproto.UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
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
      if (ugcType_ != emu.grasscutter.net.newproto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        output.writeEnum(1, ugcType_);
      }
      if (ugcGuid_ != 0L) {
        output.writeUInt64(5, ugcGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ugcType_ != emu.grasscutter.net.newproto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, ugcType_);
      }
      if (ugcGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, ugcGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq other = (emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq) obj;

      if (getUgcGuid()
          != other.getUgcGuid()) return false;
      if (ugcType_ != other.ugcType_) return false;
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
      hash = (37 * hash) + UGC_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUgcGuid());
      hash = (37 * hash) + UGC_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + ugcType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq prototype) {
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
     *   CMD_ID = 6322;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GetUgcBriefInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetUgcBriefInfoReq)
        emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.internal_static_GetUgcBriefInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.internal_static_GetUgcBriefInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq.class, emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        ugcGuid_ = 0L;

        ugcType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.internal_static_GetUgcBriefInfoReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq build() {
        emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq buildPartial() {
        emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq result = new emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq(this);
        result.ugcGuid_ = ugcGuid_;
        result.ugcType_ = ugcType_;
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
        if (other instanceof emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq) {
          return mergeFrom((emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq other) {
        if (other == emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq.getDefaultInstance()) return this;
        if (other.getUgcGuid() != 0L) {
          setUgcGuid(other.getUgcGuid());
        }
        if (other.ugcType_ != 0) {
          setUgcTypeValue(other.getUgcTypeValue());
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
              case 8: {
                ugcType_ = input.readEnum();

                break;
              } // case 8
              case 40: {
                ugcGuid_ = input.readUInt64();

                break;
              } // case 40
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

      private long ugcGuid_ ;
      /**
       * <code>uint64 ugc_guid = 5;</code>
       * @return The ugcGuid.
       */
      @java.lang.Override
      public long getUgcGuid() {
        return ugcGuid_;
      }
      /**
       * <code>uint64 ugc_guid = 5;</code>
       * @param value The ugcGuid to set.
       * @return This builder for chaining.
       */
      public Builder setUgcGuid(long value) {
        
        ugcGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 ugc_guid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcGuid() {
        
        ugcGuid_ = 0L;
        onChanged();
        return this;
      }

      private int ugcType_ = 0;
      /**
       * <code>.UgcType ugc_type = 1;</code>
       * @return The enum numeric value on the wire for ugcType.
       */
      @java.lang.Override public int getUgcTypeValue() {
        return ugcType_;
      }
      /**
       * <code>.UgcType ugc_type = 1;</code>
       * @param value The enum numeric value on the wire for ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcTypeValue(int value) {
        
        ugcType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugc_type = 1;</code>
       * @return The ugcType.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.UgcTypeOuterClass.UgcType getUgcType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.UgcTypeOuterClass.UgcType result = emu.grasscutter.net.newproto.UgcTypeOuterClass.UgcType.valueOf(ugcType_);
        return result == null ? emu.grasscutter.net.newproto.UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
      }
      /**
       * <code>.UgcType ugc_type = 1;</code>
       * @param value The ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcType(emu.grasscutter.net.newproto.UgcTypeOuterClass.UgcType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        ugcType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugc_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcType() {
        
        ugcType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetUgcBriefInfoReq)
    }

    // @@protoc_insertion_point(class_scope:GetUgcBriefInfoReq)
    private static final emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq();
    }

    public static emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetUgcBriefInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<GetUgcBriefInfoReq>() {
      @java.lang.Override
      public GetUgcBriefInfoReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetUgcBriefInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetUgcBriefInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GetUgcBriefInfoReqOuterClass.GetUgcBriefInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetUgcBriefInfoReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetUgcBriefInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GetUgcBriefInfoReq.proto\032\rUgcType.prot" +
      "o\"B\n\022GetUgcBriefInfoReq\022\020\n\010ugc_guid\030\005 \001(" +
      "\004\022\032\n\010ugc_type\030\001 \001(\0162\010.UgcTypeB\036\n\034emu.gra" +
      "sscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.UgcTypeOuterClass.getDescriptor(),
        });
    internal_static_GetUgcBriefInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetUgcBriefInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetUgcBriefInfoReq_descriptor,
        new java.lang.String[] { "UgcGuid", "UgcType", });
    emu.grasscutter.net.newproto.UgcTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
