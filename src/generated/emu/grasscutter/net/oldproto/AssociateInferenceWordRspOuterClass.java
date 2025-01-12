// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AssociateInferenceWordRsp.proto

package emu.grasscutter.net.oldproto;

public final class AssociateInferenceWordRspOuterClass {
  private AssociateInferenceWordRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AssociateInferenceWordRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AssociateInferenceWordRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 base_word_id = 14;</code>
     * @return The baseWordId.
     */
    int getBaseWordId();

    /**
     * <code>uint32 associate_word_id = 13;</code>
     * @return The associateWordId.
     */
    int getAssociateWordId();

    /**
     * <code>uint32 page_id = 1;</code>
     * @return The pageId.
     */
    int getPageId();
  }
  /**
   * <pre>
   * CmdId: 457
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code AssociateInferenceWordRsp}
   */
  public static final class AssociateInferenceWordRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AssociateInferenceWordRsp)
      AssociateInferenceWordRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AssociateInferenceWordRsp.newBuilder() to construct.
    private AssociateInferenceWordRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AssociateInferenceWordRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AssociateInferenceWordRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.internal_static_AssociateInferenceWordRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.internal_static_AssociateInferenceWordRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp.class, emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp.Builder.class);
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

    public static final int BASE_WORD_ID_FIELD_NUMBER = 14;
    private int baseWordId_;
    /**
     * <code>uint32 base_word_id = 14;</code>
     * @return The baseWordId.
     */
    @java.lang.Override
    public int getBaseWordId() {
      return baseWordId_;
    }

    public static final int ASSOCIATE_WORD_ID_FIELD_NUMBER = 13;
    private int associateWordId_;
    /**
     * <code>uint32 associate_word_id = 13;</code>
     * @return The associateWordId.
     */
    @java.lang.Override
    public int getAssociateWordId() {
      return associateWordId_;
    }

    public static final int PAGE_ID_FIELD_NUMBER = 1;
    private int pageId_;
    /**
     * <code>uint32 page_id = 1;</code>
     * @return The pageId.
     */
    @java.lang.Override
    public int getPageId() {
      return pageId_;
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
      if (pageId_ != 0) {
        output.writeUInt32(1, pageId_);
      }
      if (associateWordId_ != 0) {
        output.writeUInt32(13, associateWordId_);
      }
      if (baseWordId_ != 0) {
        output.writeUInt32(14, baseWordId_);
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
      if (pageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, pageId_);
      }
      if (associateWordId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, associateWordId_);
      }
      if (baseWordId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, baseWordId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp other = (emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getBaseWordId()
          != other.getBaseWordId()) return false;
      if (getAssociateWordId()
          != other.getAssociateWordId()) return false;
      if (getPageId()
          != other.getPageId()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + BASE_WORD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBaseWordId();
      hash = (37 * hash) + ASSOCIATE_WORD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAssociateWordId();
      hash = (37 * hash) + PAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPageId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp prototype) {
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
     * CmdId: 457
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code AssociateInferenceWordRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AssociateInferenceWordRsp)
        emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.internal_static_AssociateInferenceWordRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.internal_static_AssociateInferenceWordRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp.class, emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        baseWordId_ = 0;

        associateWordId_ = 0;

        pageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.internal_static_AssociateInferenceWordRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp build() {
        emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp buildPartial() {
        emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp result = new emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp(this);
        result.retcode_ = retcode_;
        result.baseWordId_ = baseWordId_;
        result.associateWordId_ = associateWordId_;
        result.pageId_ = pageId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp other) {
        if (other == emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getBaseWordId() != 0) {
          setBaseWordId(other.getBaseWordId());
        }
        if (other.getAssociateWordId() != 0) {
          setAssociateWordId(other.getAssociateWordId());
        }
        if (other.getPageId() != 0) {
          setPageId(other.getPageId());
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
                pageId_ = input.readUInt32();

                break;
              } // case 8
              case 104: {
                associateWordId_ = input.readUInt32();

                break;
              } // case 104
              case 112: {
                baseWordId_ = input.readUInt32();

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

      private int baseWordId_ ;
      /**
       * <code>uint32 base_word_id = 14;</code>
       * @return The baseWordId.
       */
      @java.lang.Override
      public int getBaseWordId() {
        return baseWordId_;
      }
      /**
       * <code>uint32 base_word_id = 14;</code>
       * @param value The baseWordId to set.
       * @return This builder for chaining.
       */
      public Builder setBaseWordId(int value) {
        
        baseWordId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 base_word_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBaseWordId() {
        
        baseWordId_ = 0;
        onChanged();
        return this;
      }

      private int associateWordId_ ;
      /**
       * <code>uint32 associate_word_id = 13;</code>
       * @return The associateWordId.
       */
      @java.lang.Override
      public int getAssociateWordId() {
        return associateWordId_;
      }
      /**
       * <code>uint32 associate_word_id = 13;</code>
       * @param value The associateWordId to set.
       * @return This builder for chaining.
       */
      public Builder setAssociateWordId(int value) {
        
        associateWordId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 associate_word_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAssociateWordId() {
        
        associateWordId_ = 0;
        onChanged();
        return this;
      }

      private int pageId_ ;
      /**
       * <code>uint32 page_id = 1;</code>
       * @return The pageId.
       */
      @java.lang.Override
      public int getPageId() {
        return pageId_;
      }
      /**
       * <code>uint32 page_id = 1;</code>
       * @param value The pageId to set.
       * @return This builder for chaining.
       */
      public Builder setPageId(int value) {
        
        pageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 page_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPageId() {
        
        pageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AssociateInferenceWordRsp)
    }

    // @@protoc_insertion_point(class_scope:AssociateInferenceWordRsp)
    private static final emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp();
    }

    public static emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AssociateInferenceWordRsp>
        PARSER = new com.google.protobuf.AbstractParser<AssociateInferenceWordRsp>() {
      @java.lang.Override
      public AssociateInferenceWordRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<AssociateInferenceWordRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AssociateInferenceWordRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.AssociateInferenceWordRspOuterClass.AssociateInferenceWordRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AssociateInferenceWordRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AssociateInferenceWordRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037AssociateInferenceWordRsp.proto\"n\n\031Ass" +
      "ociateInferenceWordRsp\022\017\n\007retcode\030\017 \001(\005\022" +
      "\024\n\014base_word_id\030\016 \001(\r\022\031\n\021associate_word_" +
      "id\030\r \001(\r\022\017\n\007page_id\030\001 \001(\rB\036\n\034emu.grasscu" +
      "tter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AssociateInferenceWordRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AssociateInferenceWordRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AssociateInferenceWordRsp_descriptor,
        new java.lang.String[] { "Retcode", "BaseWordId", "AssociateWordId", "PageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
