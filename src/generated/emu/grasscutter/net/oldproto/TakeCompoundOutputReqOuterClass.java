// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeCompoundOutputReq.proto

package emu.grasscutter.net.oldproto;

public final class TakeCompoundOutputReqOuterClass {
  private TakeCompoundOutputReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeCompoundOutputReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeCompoundOutputReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 compound_group_id = 3;</code>
     * @return The compoundGroupId.
     */
    int getCompoundGroupId();

    /**
     * <code>uint32 compound_id = 10;</code>
     * @return The compoundId.
     */
    int getCompoundId();
  }
  /**
   * <pre>
   * CmdId: 174
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code TakeCompoundOutputReq}
   */
  public static final class TakeCompoundOutputReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeCompoundOutputReq)
      TakeCompoundOutputReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeCompoundOutputReq.newBuilder() to construct.
    private TakeCompoundOutputReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeCompoundOutputReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeCompoundOutputReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.internal_static_TakeCompoundOutputReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.internal_static_TakeCompoundOutputReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq.class, emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq.Builder.class);
    }

    public static final int COMPOUND_GROUP_ID_FIELD_NUMBER = 3;
    private int compoundGroupId_;
    /**
     * <code>uint32 compound_group_id = 3;</code>
     * @return The compoundGroupId.
     */
    @java.lang.Override
    public int getCompoundGroupId() {
      return compoundGroupId_;
    }

    public static final int COMPOUND_ID_FIELD_NUMBER = 10;
    private int compoundId_;
    /**
     * <code>uint32 compound_id = 10;</code>
     * @return The compoundId.
     */
    @java.lang.Override
    public int getCompoundId() {
      return compoundId_;
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
      if (compoundGroupId_ != 0) {
        output.writeUInt32(3, compoundGroupId_);
      }
      if (compoundId_ != 0) {
        output.writeUInt32(10, compoundId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (compoundGroupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, compoundGroupId_);
      }
      if (compoundId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, compoundId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq other = (emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq) obj;

      if (getCompoundGroupId()
          != other.getCompoundGroupId()) return false;
      if (getCompoundId()
          != other.getCompoundId()) return false;
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
      hash = (37 * hash) + COMPOUND_GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCompoundGroupId();
      hash = (37 * hash) + COMPOUND_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCompoundId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq prototype) {
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
     * CmdId: 174
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code TakeCompoundOutputReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeCompoundOutputReq)
        emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.internal_static_TakeCompoundOutputReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.internal_static_TakeCompoundOutputReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq.class, emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        compoundGroupId_ = 0;

        compoundId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.internal_static_TakeCompoundOutputReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq build() {
        emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq buildPartial() {
        emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq result = new emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq(this);
        result.compoundGroupId_ = compoundGroupId_;
        result.compoundId_ = compoundId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq other) {
        if (other == emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq.getDefaultInstance()) return this;
        if (other.getCompoundGroupId() != 0) {
          setCompoundGroupId(other.getCompoundGroupId());
        }
        if (other.getCompoundId() != 0) {
          setCompoundId(other.getCompoundId());
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
                compoundGroupId_ = input.readUInt32();

                break;
              } // case 24
              case 80: {
                compoundId_ = input.readUInt32();

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

      private int compoundGroupId_ ;
      /**
       * <code>uint32 compound_group_id = 3;</code>
       * @return The compoundGroupId.
       */
      @java.lang.Override
      public int getCompoundGroupId() {
        return compoundGroupId_;
      }
      /**
       * <code>uint32 compound_group_id = 3;</code>
       * @param value The compoundGroupId to set.
       * @return This builder for chaining.
       */
      public Builder setCompoundGroupId(int value) {
        
        compoundGroupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 compound_group_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCompoundGroupId() {
        
        compoundGroupId_ = 0;
        onChanged();
        return this;
      }

      private int compoundId_ ;
      /**
       * <code>uint32 compound_id = 10;</code>
       * @return The compoundId.
       */
      @java.lang.Override
      public int getCompoundId() {
        return compoundId_;
      }
      /**
       * <code>uint32 compound_id = 10;</code>
       * @param value The compoundId to set.
       * @return This builder for chaining.
       */
      public Builder setCompoundId(int value) {
        
        compoundId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 compound_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCompoundId() {
        
        compoundId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TakeCompoundOutputReq)
    }

    // @@protoc_insertion_point(class_scope:TakeCompoundOutputReq)
    private static final emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq();
    }

    public static emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeCompoundOutputReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeCompoundOutputReq>() {
      @java.lang.Override
      public TakeCompoundOutputReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<TakeCompoundOutputReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeCompoundOutputReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.TakeCompoundOutputReqOuterClass.TakeCompoundOutputReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeCompoundOutputReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeCompoundOutputReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033TakeCompoundOutputReq.proto\"G\n\025TakeCom" +
      "poundOutputReq\022\031\n\021compound_group_id\030\003 \001(" +
      "\r\022\023\n\013compound_id\030\n \001(\rB\036\n\034emu.grasscutte" +
      "r.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeCompoundOutputReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeCompoundOutputReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeCompoundOutputReq_descriptor,
        new java.lang.String[] { "CompoundGroupId", "CompoundId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
