// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeRegionSearchRewardReq.proto

package emu.grasscutter.net.oldproto;

public final class TakeRegionSearchRewardReqOuterClass {
  private TakeRegionSearchRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeRegionSearchRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeRegionSearchRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 search_id = 3;</code>
     * @return The searchId.
     */
    int getSearchId();

    /**
     * <code>uint32 id = 15;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * <pre>
   * CmdId: 5625
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code TakeRegionSearchRewardReq}
   */
  public static final class TakeRegionSearchRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeRegionSearchRewardReq)
      TakeRegionSearchRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeRegionSearchRewardReq.newBuilder() to construct.
    private TakeRegionSearchRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeRegionSearchRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeRegionSearchRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.internal_static_TakeRegionSearchRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.internal_static_TakeRegionSearchRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq.class, emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq.Builder.class);
    }

    public static final int SEARCH_ID_FIELD_NUMBER = 3;
    private int searchId_;
    /**
     * <code>uint32 search_id = 3;</code>
     * @return The searchId.
     */
    @java.lang.Override
    public int getSearchId() {
      return searchId_;
    }

    public static final int ID_FIELD_NUMBER = 15;
    private int id_;
    /**
     * <code>uint32 id = 15;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (searchId_ != 0) {
        output.writeUInt32(3, searchId_);
      }
      if (id_ != 0) {
        output.writeUInt32(15, id_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (searchId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, searchId_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, id_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq other = (emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq) obj;

      if (getSearchId()
          != other.getSearchId()) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + SEARCH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSearchId();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq prototype) {
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
     * CmdId: 5625
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code TakeRegionSearchRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeRegionSearchRewardReq)
        emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.internal_static_TakeRegionSearchRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.internal_static_TakeRegionSearchRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq.class, emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        searchId_ = 0;

        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.internal_static_TakeRegionSearchRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq build() {
        emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq buildPartial() {
        emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq result = new emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq(this);
        result.searchId_ = searchId_;
        result.id_ = id_;
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
        if (other instanceof emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq other) {
        if (other == emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq.getDefaultInstance()) return this;
        if (other.getSearchId() != 0) {
          setSearchId(other.getSearchId());
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
              case 24: {
                searchId_ = input.readUInt32();

                break;
              } // case 24
              case 120: {
                id_ = input.readUInt32();

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

      private int searchId_ ;
      /**
       * <code>uint32 search_id = 3;</code>
       * @return The searchId.
       */
      @java.lang.Override
      public int getSearchId() {
        return searchId_;
      }
      /**
       * <code>uint32 search_id = 3;</code>
       * @param value The searchId to set.
       * @return This builder for chaining.
       */
      public Builder setSearchId(int value) {
        
        searchId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 search_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSearchId() {
        
        searchId_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 15;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 15;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TakeRegionSearchRewardReq)
    }

    // @@protoc_insertion_point(class_scope:TakeRegionSearchRewardReq)
    private static final emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq();
    }

    public static emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeRegionSearchRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeRegionSearchRewardReq>() {
      @java.lang.Override
      public TakeRegionSearchRewardReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<TakeRegionSearchRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeRegionSearchRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.TakeRegionSearchRewardReqOuterClass.TakeRegionSearchRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeRegionSearchRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeRegionSearchRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037TakeRegionSearchRewardReq.proto\":\n\031Tak" +
      "eRegionSearchRewardReq\022\021\n\tsearch_id\030\003 \001(" +
      "\r\022\n\n\002id\030\017 \001(\rB\036\n\034emu.grasscutter.net.old" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeRegionSearchRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeRegionSearchRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeRegionSearchRewardReq_descriptor,
        new java.lang.String[] { "SearchId", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
