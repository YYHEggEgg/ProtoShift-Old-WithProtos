// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FinishMainCoopReq.proto

package emu.grasscutter.net.newproto;

public final class FinishMainCoopReqOuterClass {
  private FinishMainCoopReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FinishMainCoopReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FinishMainCoopReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 14;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>uint32 ending_save_point_id = 3;</code>
     * @return The endingSavePointId.
     */
    int getEndingSavePointId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1977;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code FinishMainCoopReq}
   */
  public static final class FinishMainCoopReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FinishMainCoopReq)
      FinishMainCoopReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FinishMainCoopReq.newBuilder() to construct.
    private FinishMainCoopReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FinishMainCoopReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FinishMainCoopReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.internal_static_FinishMainCoopReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.internal_static_FinishMainCoopReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq.class, emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 14;
    private int id_;
    /**
     * <code>uint32 id = 14;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int ENDING_SAVE_POINT_ID_FIELD_NUMBER = 3;
    private int endingSavePointId_;
    /**
     * <code>uint32 ending_save_point_id = 3;</code>
     * @return The endingSavePointId.
     */
    @java.lang.Override
    public int getEndingSavePointId() {
      return endingSavePointId_;
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
      if (endingSavePointId_ != 0) {
        output.writeUInt32(3, endingSavePointId_);
      }
      if (id_ != 0) {
        output.writeUInt32(14, id_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (endingSavePointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, endingSavePointId_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, id_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq other = (emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq) obj;

      if (getId()
          != other.getId()) return false;
      if (getEndingSavePointId()
          != other.getEndingSavePointId()) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + ENDING_SAVE_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEndingSavePointId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq prototype) {
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
     *   CMD_ID = 1977;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code FinishMainCoopReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FinishMainCoopReq)
        emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.internal_static_FinishMainCoopReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.internal_static_FinishMainCoopReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq.class, emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        id_ = 0;

        endingSavePointId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.internal_static_FinishMainCoopReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq build() {
        emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq buildPartial() {
        emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq result = new emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq(this);
        result.id_ = id_;
        result.endingSavePointId_ = endingSavePointId_;
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
        if (other instanceof emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq) {
          return mergeFrom((emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq other) {
        if (other == emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getEndingSavePointId() != 0) {
          setEndingSavePointId(other.getEndingSavePointId());
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
                endingSavePointId_ = input.readUInt32();

                break;
              } // case 24
              case 112: {
                id_ = input.readUInt32();

                break;
              } // case 112
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

      private int id_ ;
      /**
       * <code>uint32 id = 14;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 14;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int endingSavePointId_ ;
      /**
       * <code>uint32 ending_save_point_id = 3;</code>
       * @return The endingSavePointId.
       */
      @java.lang.Override
      public int getEndingSavePointId() {
        return endingSavePointId_;
      }
      /**
       * <code>uint32 ending_save_point_id = 3;</code>
       * @param value The endingSavePointId to set.
       * @return This builder for chaining.
       */
      public Builder setEndingSavePointId(int value) {
        
        endingSavePointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ending_save_point_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndingSavePointId() {
        
        endingSavePointId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FinishMainCoopReq)
    }

    // @@protoc_insertion_point(class_scope:FinishMainCoopReq)
    private static final emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq();
    }

    public static emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FinishMainCoopReq>
        PARSER = new com.google.protobuf.AbstractParser<FinishMainCoopReq>() {
      @java.lang.Override
      public FinishMainCoopReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<FinishMainCoopReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FinishMainCoopReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.FinishMainCoopReqOuterClass.FinishMainCoopReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FinishMainCoopReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FinishMainCoopReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027FinishMainCoopReq.proto\"=\n\021FinishMainC" +
      "oopReq\022\n\n\002id\030\016 \001(\r\022\034\n\024ending_save_point_" +
      "id\030\003 \001(\rB\036\n\034emu.grasscutter.net.newproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FinishMainCoopReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FinishMainCoopReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FinishMainCoopReq_descriptor,
        new java.lang.String[] { "Id", "EndingSavePointId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
