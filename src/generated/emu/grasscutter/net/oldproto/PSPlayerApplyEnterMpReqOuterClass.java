// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PSPlayerApplyEnterMpReq.proto

package emu.grasscutter.net.oldproto;

public final class PSPlayerApplyEnterMpReqOuterClass {
  private PSPlayerApplyEnterMpReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PSPlayerApplyEnterMpReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PSPlayerApplyEnterMpReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string target_psn_id = 5;</code>
     * @return The targetPsnId.
     */
    java.lang.String getTargetPsnId();
    /**
     * <code>string target_psn_id = 5;</code>
     * @return The bytes for targetPsnId.
     */
    com.google.protobuf.ByteString
        getTargetPsnIdBytes();
  }
  /**
   * <pre>
   * CmdId: 1841
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code PSPlayerApplyEnterMpReq}
   */
  public static final class PSPlayerApplyEnterMpReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PSPlayerApplyEnterMpReq)
      PSPlayerApplyEnterMpReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PSPlayerApplyEnterMpReq.newBuilder() to construct.
    private PSPlayerApplyEnterMpReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PSPlayerApplyEnterMpReq() {
      targetPsnId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PSPlayerApplyEnterMpReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.internal_static_PSPlayerApplyEnterMpReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.internal_static_PSPlayerApplyEnterMpReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq.class, emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq.Builder.class);
    }

    public static final int TARGET_PSN_ID_FIELD_NUMBER = 5;
    private volatile java.lang.Object targetPsnId_;
    /**
     * <code>string target_psn_id = 5;</code>
     * @return The targetPsnId.
     */
    @java.lang.Override
    public java.lang.String getTargetPsnId() {
      java.lang.Object ref = targetPsnId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetPsnId_ = s;
        return s;
      }
    }
    /**
     * <code>string target_psn_id = 5;</code>
     * @return The bytes for targetPsnId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTargetPsnIdBytes() {
      java.lang.Object ref = targetPsnId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetPsnId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetPsnId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, targetPsnId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetPsnId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, targetPsnId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq other = (emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq) obj;

      if (!getTargetPsnId()
          .equals(other.getTargetPsnId())) return false;
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
      hash = (37 * hash) + TARGET_PSN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetPsnId().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq prototype) {
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
     * CmdId: 1841
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code PSPlayerApplyEnterMpReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PSPlayerApplyEnterMpReq)
        emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.internal_static_PSPlayerApplyEnterMpReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.internal_static_PSPlayerApplyEnterMpReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq.class, emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        targetPsnId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.internal_static_PSPlayerApplyEnterMpReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq build() {
        emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq buildPartial() {
        emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq result = new emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq(this);
        result.targetPsnId_ = targetPsnId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq other) {
        if (other == emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq.getDefaultInstance()) return this;
        if (!other.getTargetPsnId().isEmpty()) {
          targetPsnId_ = other.targetPsnId_;
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
              case 42: {
                targetPsnId_ = input.readStringRequireUtf8();

                break;
              } // case 42
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

      private java.lang.Object targetPsnId_ = "";
      /**
       * <code>string target_psn_id = 5;</code>
       * @return The targetPsnId.
       */
      public java.lang.String getTargetPsnId() {
        java.lang.Object ref = targetPsnId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          targetPsnId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string target_psn_id = 5;</code>
       * @return The bytes for targetPsnId.
       */
      public com.google.protobuf.ByteString
          getTargetPsnIdBytes() {
        java.lang.Object ref = targetPsnId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          targetPsnId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string target_psn_id = 5;</code>
       * @param value The targetPsnId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetPsnId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        targetPsnId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string target_psn_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetPsnId() {
        
        targetPsnId_ = getDefaultInstance().getTargetPsnId();
        onChanged();
        return this;
      }
      /**
       * <code>string target_psn_id = 5;</code>
       * @param value The bytes for targetPsnId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetPsnIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        targetPsnId_ = value;
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


      // @@protoc_insertion_point(builder_scope:PSPlayerApplyEnterMpReq)
    }

    // @@protoc_insertion_point(class_scope:PSPlayerApplyEnterMpReq)
    private static final emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq();
    }

    public static emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PSPlayerApplyEnterMpReq>
        PARSER = new com.google.protobuf.AbstractParser<PSPlayerApplyEnterMpReq>() {
      @java.lang.Override
      public PSPlayerApplyEnterMpReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PSPlayerApplyEnterMpReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PSPlayerApplyEnterMpReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.PSPlayerApplyEnterMpReqOuterClass.PSPlayerApplyEnterMpReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PSPlayerApplyEnterMpReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PSPlayerApplyEnterMpReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035PSPlayerApplyEnterMpReq.proto\"0\n\027PSPla" +
      "yerApplyEnterMpReq\022\025\n\rtarget_psn_id\030\005 \001(" +
      "\tB\036\n\034emu.grasscutter.net.oldprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PSPlayerApplyEnterMpReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PSPlayerApplyEnterMpReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PSPlayerApplyEnterMpReq_descriptor,
        new java.lang.String[] { "TargetPsnId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
