// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PublishUgcRsp.proto

package emu.grasscutter.net.oldproto;

public final class PublishUgcRspOuterClass {
  private PublishUgcRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PublishUgcRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PublishUgcRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 ugc_guid = 14;</code>
     * @return The ugcGuid.
     */
    long getUgcGuid();

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.UgcType ugc_type = 13;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    int getUgcTypeValue();
    /**
     * <code>.UgcType ugc_type = 13;</code>
     * @return The ugcType.
     */
    emu.grasscutter.net.oldproto.UgcTypeOuterClass.UgcType getUgcType();
  }
  /**
   * <pre>
   * CmdId: 6349
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code PublishUgcRsp}
   */
  public static final class PublishUgcRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PublishUgcRsp)
      PublishUgcRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PublishUgcRsp.newBuilder() to construct.
    private PublishUgcRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PublishUgcRsp() {
      ugcType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PublishUgcRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.internal_static_PublishUgcRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.internal_static_PublishUgcRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp.class, emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp.Builder.class);
    }

    public static final int UGC_GUID_FIELD_NUMBER = 14;
    private long ugcGuid_;
    /**
     * <code>uint64 ugc_guid = 14;</code>
     * @return The ugcGuid.
     */
    @java.lang.Override
    public long getUgcGuid() {
      return ugcGuid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UGC_TYPE_FIELD_NUMBER = 13;
    private int ugcType_;
    /**
     * <code>.UgcType ugc_type = 13;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    @java.lang.Override public int getUgcTypeValue() {
      return ugcType_;
    }
    /**
     * <code>.UgcType ugc_type = 13;</code>
     * @return The ugcType.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.UgcTypeOuterClass.UgcType getUgcType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.UgcTypeOuterClass.UgcType result = emu.grasscutter.net.oldproto.UgcTypeOuterClass.UgcType.valueOf(ugcType_);
      return result == null ? emu.grasscutter.net.oldproto.UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
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
      if (ugcType_ != emu.grasscutter.net.oldproto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        output.writeEnum(13, ugcType_);
      }
      if (ugcGuid_ != 0L) {
        output.writeUInt64(14, ugcGuid_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ugcType_ != emu.grasscutter.net.oldproto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, ugcType_);
      }
      if (ugcGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(14, ugcGuid_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp other = (emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp) obj;

      if (getUgcGuid()
          != other.getUgcGuid()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + UGC_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + ugcType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp prototype) {
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
     * CmdId: 6349
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code PublishUgcRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PublishUgcRsp)
        emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.internal_static_PublishUgcRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.internal_static_PublishUgcRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp.class, emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp.newBuilder()
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

        retcode_ = 0;

        ugcType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.internal_static_PublishUgcRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp build() {
        emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp buildPartial() {
        emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp result = new emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp(this);
        result.ugcGuid_ = ugcGuid_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp other) {
        if (other == emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp.getDefaultInstance()) return this;
        if (other.getUgcGuid() != 0L) {
          setUgcGuid(other.getUgcGuid());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 104: {
                ugcType_ = input.readEnum();

                break;
              } // case 104
              case 112: {
                ugcGuid_ = input.readUInt64();

                break;
              } // case 112
              case 120: {
                retcode_ = input.readInt32();

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

      private long ugcGuid_ ;
      /**
       * <code>uint64 ugc_guid = 14;</code>
       * @return The ugcGuid.
       */
      @java.lang.Override
      public long getUgcGuid() {
        return ugcGuid_;
      }
      /**
       * <code>uint64 ugc_guid = 14;</code>
       * @param value The ugcGuid to set.
       * @return This builder for chaining.
       */
      public Builder setUgcGuid(long value) {
        
        ugcGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 ugc_guid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcGuid() {
        
        ugcGuid_ = 0L;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int ugcType_ = 0;
      /**
       * <code>.UgcType ugc_type = 13;</code>
       * @return The enum numeric value on the wire for ugcType.
       */
      @java.lang.Override public int getUgcTypeValue() {
        return ugcType_;
      }
      /**
       * <code>.UgcType ugc_type = 13;</code>
       * @param value The enum numeric value on the wire for ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcTypeValue(int value) {
        
        ugcType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugc_type = 13;</code>
       * @return The ugcType.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.UgcTypeOuterClass.UgcType getUgcType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.UgcTypeOuterClass.UgcType result = emu.grasscutter.net.oldproto.UgcTypeOuterClass.UgcType.valueOf(ugcType_);
        return result == null ? emu.grasscutter.net.oldproto.UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
      }
      /**
       * <code>.UgcType ugc_type = 13;</code>
       * @param value The ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcType(emu.grasscutter.net.oldproto.UgcTypeOuterClass.UgcType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        ugcType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugc_type = 13;</code>
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


      // @@protoc_insertion_point(builder_scope:PublishUgcRsp)
    }

    // @@protoc_insertion_point(class_scope:PublishUgcRsp)
    private static final emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp();
    }

    public static emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PublishUgcRsp>
        PARSER = new com.google.protobuf.AbstractParser<PublishUgcRsp>() {
      @java.lang.Override
      public PublishUgcRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<PublishUgcRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PublishUgcRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.PublishUgcRspOuterClass.PublishUgcRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PublishUgcRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PublishUgcRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023PublishUgcRsp.proto\032\rUgcType.proto\"N\n\r" +
      "PublishUgcRsp\022\020\n\010ugc_guid\030\016 \001(\004\022\017\n\007retco" +
      "de\030\017 \001(\005\022\032\n\010ugc_type\030\r \001(\0162\010.UgcTypeB\036\n\034" +
      "emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.UgcTypeOuterClass.getDescriptor(),
        });
    internal_static_PublishUgcRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PublishUgcRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PublishUgcRsp_descriptor,
        new java.lang.String[] { "UgcGuid", "Retcode", "UgcType", });
    emu.grasscutter.net.oldproto.UgcTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
