// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OfferingInteractReq.proto

package emu.grasscutter.net.newproto;

public final class OfferingInteractReqOuterClass {
  private OfferingInteractReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OfferingInteractReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OfferingInteractReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 offering_id = 9;</code>
     * @return The offeringId.
     */
    int getOfferingId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2920;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code OfferingInteractReq}
   */
  public static final class OfferingInteractReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OfferingInteractReq)
      OfferingInteractReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OfferingInteractReq.newBuilder() to construct.
    private OfferingInteractReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OfferingInteractReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OfferingInteractReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.internal_static_OfferingInteractReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.internal_static_OfferingInteractReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq.class, emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq.Builder.class);
    }

    public static final int OFFERING_ID_FIELD_NUMBER = 9;
    private int offeringId_;
    /**
     * <code>uint32 offering_id = 9;</code>
     * @return The offeringId.
     */
    @java.lang.Override
    public int getOfferingId() {
      return offeringId_;
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
      if (offeringId_ != 0) {
        output.writeUInt32(9, offeringId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (offeringId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, offeringId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq other = (emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq) obj;

      if (getOfferingId()
          != other.getOfferingId()) return false;
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
      hash = (37 * hash) + OFFERING_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOfferingId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq prototype) {
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
     *   CMD_ID = 2920;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code OfferingInteractReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OfferingInteractReq)
        emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.internal_static_OfferingInteractReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.internal_static_OfferingInteractReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq.class, emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        offeringId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.internal_static_OfferingInteractReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq build() {
        emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq buildPartial() {
        emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq result = new emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq(this);
        result.offeringId_ = offeringId_;
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
        if (other instanceof emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq) {
          return mergeFrom((emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq other) {
        if (other == emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq.getDefaultInstance()) return this;
        if (other.getOfferingId() != 0) {
          setOfferingId(other.getOfferingId());
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
              case 72: {
                offeringId_ = input.readUInt32();

                break;
              } // case 72
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

      private int offeringId_ ;
      /**
       * <code>uint32 offering_id = 9;</code>
       * @return The offeringId.
       */
      @java.lang.Override
      public int getOfferingId() {
        return offeringId_;
      }
      /**
       * <code>uint32 offering_id = 9;</code>
       * @param value The offeringId to set.
       * @return This builder for chaining.
       */
      public Builder setOfferingId(int value) {
        
        offeringId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 offering_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearOfferingId() {
        
        offeringId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OfferingInteractReq)
    }

    // @@protoc_insertion_point(class_scope:OfferingInteractReq)
    private static final emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq();
    }

    public static emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OfferingInteractReq>
        PARSER = new com.google.protobuf.AbstractParser<OfferingInteractReq>() {
      @java.lang.Override
      public OfferingInteractReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<OfferingInteractReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OfferingInteractReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.OfferingInteractReqOuterClass.OfferingInteractReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OfferingInteractReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OfferingInteractReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031OfferingInteractReq.proto\"*\n\023OfferingI" +
      "nteractReq\022\023\n\013offering_id\030\t \001(\rB\036\n\034emu.g" +
      "rasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OfferingInteractReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OfferingInteractReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OfferingInteractReq_descriptor,
        new java.lang.String[] { "OfferingId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
