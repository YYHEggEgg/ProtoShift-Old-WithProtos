// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGOperationReq.proto

package emu.grasscutter.net.oldproto;

public final class GCGOperationReqOuterClass {
  private GCGOperationReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGOperationReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGOperationReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 op_seq = 2;</code>
     * @return The opSeq.
     */
    int getOpSeq();

    /**
     * <code>uint32 redirect_uid = 7;</code>
     * @return The redirectUid.
     */
    int getRedirectUid();

    /**
     * <code>.GCGOperation op = 15;</code>
     * @return Whether the op field is set.
     */
    boolean hasOp();
    /**
     * <code>.GCGOperation op = 15;</code>
     * @return The op.
     */
    emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation getOp();
    /**
     * <code>.GCGOperation op = 15;</code>
     */
    emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperationOrBuilder getOpOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 7107
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code GCGOperationReq}
   */
  public static final class GCGOperationReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGOperationReq)
      GCGOperationReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGOperationReq.newBuilder() to construct.
    private GCGOperationReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGOperationReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGOperationReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.internal_static_GCGOperationReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.internal_static_GCGOperationReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq.class, emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq.Builder.class);
    }

    public static final int OP_SEQ_FIELD_NUMBER = 2;
    private int opSeq_;
    /**
     * <code>uint32 op_seq = 2;</code>
     * @return The opSeq.
     */
    @java.lang.Override
    public int getOpSeq() {
      return opSeq_;
    }

    public static final int REDIRECT_UID_FIELD_NUMBER = 7;
    private int redirectUid_;
    /**
     * <code>uint32 redirect_uid = 7;</code>
     * @return The redirectUid.
     */
    @java.lang.Override
    public int getRedirectUid() {
      return redirectUid_;
    }

    public static final int OP_FIELD_NUMBER = 15;
    private emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation op_;
    /**
     * <code>.GCGOperation op = 15;</code>
     * @return Whether the op field is set.
     */
    @java.lang.Override
    public boolean hasOp() {
      return op_ != null;
    }
    /**
     * <code>.GCGOperation op = 15;</code>
     * @return The op.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation getOp() {
      return op_ == null ? emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation.getDefaultInstance() : op_;
    }
    /**
     * <code>.GCGOperation op = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperationOrBuilder getOpOrBuilder() {
      return getOp();
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
      if (opSeq_ != 0) {
        output.writeUInt32(2, opSeq_);
      }
      if (redirectUid_ != 0) {
        output.writeUInt32(7, redirectUid_);
      }
      if (op_ != null) {
        output.writeMessage(15, getOp());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (opSeq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, opSeq_);
      }
      if (redirectUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, redirectUid_);
      }
      if (op_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getOp());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq other = (emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq) obj;

      if (getOpSeq()
          != other.getOpSeq()) return false;
      if (getRedirectUid()
          != other.getRedirectUid()) return false;
      if (hasOp() != other.hasOp()) return false;
      if (hasOp()) {
        if (!getOp()
            .equals(other.getOp())) return false;
      }
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
      hash = (37 * hash) + OP_SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getOpSeq();
      hash = (37 * hash) + REDIRECT_UID_FIELD_NUMBER;
      hash = (53 * hash) + getRedirectUid();
      if (hasOp()) {
        hash = (37 * hash) + OP_FIELD_NUMBER;
        hash = (53 * hash) + getOp().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq prototype) {
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
     * CmdId: 7107
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code GCGOperationReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGOperationReq)
        emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.internal_static_GCGOperationReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.internal_static_GCGOperationReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq.class, emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        opSeq_ = 0;

        redirectUid_ = 0;

        if (opBuilder_ == null) {
          op_ = null;
        } else {
          op_ = null;
          opBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.internal_static_GCGOperationReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq build() {
        emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq buildPartial() {
        emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq result = new emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq(this);
        result.opSeq_ = opSeq_;
        result.redirectUid_ = redirectUid_;
        if (opBuilder_ == null) {
          result.op_ = op_;
        } else {
          result.op_ = opBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq other) {
        if (other == emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq.getDefaultInstance()) return this;
        if (other.getOpSeq() != 0) {
          setOpSeq(other.getOpSeq());
        }
        if (other.getRedirectUid() != 0) {
          setRedirectUid(other.getRedirectUid());
        }
        if (other.hasOp()) {
          mergeOp(other.getOp());
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
              case 16: {
                opSeq_ = input.readUInt32();

                break;
              } // case 16
              case 56: {
                redirectUid_ = input.readUInt32();

                break;
              } // case 56
              case 122: {
                input.readMessage(
                    getOpFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 122
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

      private int opSeq_ ;
      /**
       * <code>uint32 op_seq = 2;</code>
       * @return The opSeq.
       */
      @java.lang.Override
      public int getOpSeq() {
        return opSeq_;
      }
      /**
       * <code>uint32 op_seq = 2;</code>
       * @param value The opSeq to set.
       * @return This builder for chaining.
       */
      public Builder setOpSeq(int value) {
        
        opSeq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 op_seq = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpSeq() {
        
        opSeq_ = 0;
        onChanged();
        return this;
      }

      private int redirectUid_ ;
      /**
       * <code>uint32 redirect_uid = 7;</code>
       * @return The redirectUid.
       */
      @java.lang.Override
      public int getRedirectUid() {
        return redirectUid_;
      }
      /**
       * <code>uint32 redirect_uid = 7;</code>
       * @param value The redirectUid to set.
       * @return This builder for chaining.
       */
      public Builder setRedirectUid(int value) {
        
        redirectUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 redirect_uid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRedirectUid() {
        
        redirectUid_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation op_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation, emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation.Builder, emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperationOrBuilder> opBuilder_;
      /**
       * <code>.GCGOperation op = 15;</code>
       * @return Whether the op field is set.
       */
      public boolean hasOp() {
        return opBuilder_ != null || op_ != null;
      }
      /**
       * <code>.GCGOperation op = 15;</code>
       * @return The op.
       */
      public emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation getOp() {
        if (opBuilder_ == null) {
          return op_ == null ? emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation.getDefaultInstance() : op_;
        } else {
          return opBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGOperation op = 15;</code>
       */
      public Builder setOp(emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation value) {
        if (opBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          op_ = value;
          onChanged();
        } else {
          opBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGOperation op = 15;</code>
       */
      public Builder setOp(
          emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation.Builder builderForValue) {
        if (opBuilder_ == null) {
          op_ = builderForValue.build();
          onChanged();
        } else {
          opBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGOperation op = 15;</code>
       */
      public Builder mergeOp(emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation value) {
        if (opBuilder_ == null) {
          if (op_ != null) {
            op_ =
              emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation.newBuilder(op_).mergeFrom(value).buildPartial();
          } else {
            op_ = value;
          }
          onChanged();
        } else {
          opBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGOperation op = 15;</code>
       */
      public Builder clearOp() {
        if (opBuilder_ == null) {
          op_ = null;
          onChanged();
        } else {
          op_ = null;
          opBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGOperation op = 15;</code>
       */
      public emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation.Builder getOpBuilder() {
        
        onChanged();
        return getOpFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGOperation op = 15;</code>
       */
      public emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperationOrBuilder getOpOrBuilder() {
        if (opBuilder_ != null) {
          return opBuilder_.getMessageOrBuilder();
        } else {
          return op_ == null ?
              emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation.getDefaultInstance() : op_;
        }
      }
      /**
       * <code>.GCGOperation op = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation, emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation.Builder, emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperationOrBuilder> 
          getOpFieldBuilder() {
        if (opBuilder_ == null) {
          opBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation, emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperation.Builder, emu.grasscutter.net.oldproto.GCGOperationOuterClass.GCGOperationOrBuilder>(
                  getOp(),
                  getParentForChildren(),
                  isClean());
          op_ = null;
        }
        return opBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGOperationReq)
    }

    // @@protoc_insertion_point(class_scope:GCGOperationReq)
    private static final emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq();
    }

    public static emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGOperationReq>
        PARSER = new com.google.protobuf.AbstractParser<GCGOperationReq>() {
      @java.lang.Override
      public GCGOperationReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGOperationReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGOperationReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.GCGOperationReqOuterClass.GCGOperationReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGOperationReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGOperationReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025GCGOperationReq.proto\032\022GCGOperation.pr" +
      "oto\"R\n\017GCGOperationReq\022\016\n\006op_seq\030\002 \001(\r\022\024" +
      "\n\014redirect_uid\030\007 \001(\r\022\031\n\002op\030\017 \001(\0132\r.GCGOp" +
      "erationB\036\n\034emu.grasscutter.net.oldprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.GCGOperationOuterClass.getDescriptor(),
        });
    internal_static_GCGOperationReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGOperationReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGOperationReq_descriptor,
        new java.lang.String[] { "OpSeq", "RedirectUid", "Op", });
    emu.grasscutter.net.oldproto.GCGOperationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
