// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerApplyEnterHomeResultReq.proto

package emu.grasscutter.net.newproto;

public final class PlayerApplyEnterHomeResultReqOuterClass {
  private PlayerApplyEnterHomeResultReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerApplyEnterHomeResultReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerApplyEnterHomeResultReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 apply_uid = 9;</code>
     * @return The applyUid.
     */
    int getApplyUid();

    /**
     * <code>bool is_agreed = 2;</code>
     * @return The isAgreed.
     */
    boolean getIsAgreed();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4646;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerApplyEnterHomeResultReq}
   */
  public static final class PlayerApplyEnterHomeResultReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerApplyEnterHomeResultReq)
      PlayerApplyEnterHomeResultReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerApplyEnterHomeResultReq.newBuilder() to construct.
    private PlayerApplyEnterHomeResultReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerApplyEnterHomeResultReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerApplyEnterHomeResultReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.internal_static_PlayerApplyEnterHomeResultReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.internal_static_PlayerApplyEnterHomeResultReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq.class, emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq.Builder.class);
    }

    public static final int APPLY_UID_FIELD_NUMBER = 9;
    private int applyUid_;
    /**
     * <code>uint32 apply_uid = 9;</code>
     * @return The applyUid.
     */
    @java.lang.Override
    public int getApplyUid() {
      return applyUid_;
    }

    public static final int IS_AGREED_FIELD_NUMBER = 2;
    private boolean isAgreed_;
    /**
     * <code>bool is_agreed = 2;</code>
     * @return The isAgreed.
     */
    @java.lang.Override
    public boolean getIsAgreed() {
      return isAgreed_;
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
      if (isAgreed_ != false) {
        output.writeBool(2, isAgreed_);
      }
      if (applyUid_ != 0) {
        output.writeUInt32(9, applyUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAgreed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isAgreed_);
      }
      if (applyUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, applyUid_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq other = (emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq) obj;

      if (getApplyUid()
          != other.getApplyUid()) return false;
      if (getIsAgreed()
          != other.getIsAgreed()) return false;
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
      hash = (37 * hash) + APPLY_UID_FIELD_NUMBER;
      hash = (53 * hash) + getApplyUid();
      hash = (37 * hash) + IS_AGREED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgreed());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq prototype) {
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
     *   CMD_ID = 4646;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerApplyEnterHomeResultReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerApplyEnterHomeResultReq)
        emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.internal_static_PlayerApplyEnterHomeResultReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.internal_static_PlayerApplyEnterHomeResultReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq.class, emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        applyUid_ = 0;

        isAgreed_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.internal_static_PlayerApplyEnterHomeResultReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq build() {
        emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq buildPartial() {
        emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq result = new emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq(this);
        result.applyUid_ = applyUid_;
        result.isAgreed_ = isAgreed_;
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
        if (other instanceof emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq) {
          return mergeFrom((emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq other) {
        if (other == emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq.getDefaultInstance()) return this;
        if (other.getApplyUid() != 0) {
          setApplyUid(other.getApplyUid());
        }
        if (other.getIsAgreed() != false) {
          setIsAgreed(other.getIsAgreed());
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
                isAgreed_ = input.readBool();

                break;
              } // case 16
              case 72: {
                applyUid_ = input.readUInt32();

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

      private int applyUid_ ;
      /**
       * <code>uint32 apply_uid = 9;</code>
       * @return The applyUid.
       */
      @java.lang.Override
      public int getApplyUid() {
        return applyUid_;
      }
      /**
       * <code>uint32 apply_uid = 9;</code>
       * @param value The applyUid to set.
       * @return This builder for chaining.
       */
      public Builder setApplyUid(int value) {
        
        applyUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 apply_uid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearApplyUid() {
        
        applyUid_ = 0;
        onChanged();
        return this;
      }

      private boolean isAgreed_ ;
      /**
       * <code>bool is_agreed = 2;</code>
       * @return The isAgreed.
       */
      @java.lang.Override
      public boolean getIsAgreed() {
        return isAgreed_;
      }
      /**
       * <code>bool is_agreed = 2;</code>
       * @param value The isAgreed to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgreed(boolean value) {
        
        isAgreed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_agreed = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgreed() {
        
        isAgreed_ = false;
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


      // @@protoc_insertion_point(builder_scope:PlayerApplyEnterHomeResultReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerApplyEnterHomeResultReq)
    private static final emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq();
    }

    public static emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerApplyEnterHomeResultReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerApplyEnterHomeResultReq>() {
      @java.lang.Override
      public PlayerApplyEnterHomeResultReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerApplyEnterHomeResultReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerApplyEnterHomeResultReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PlayerApplyEnterHomeResultReqOuterClass.PlayerApplyEnterHomeResultReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerApplyEnterHomeResultReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerApplyEnterHomeResultReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#PlayerApplyEnterHomeResultReq.proto\"E\n" +
      "\035PlayerApplyEnterHomeResultReq\022\021\n\tapply_" +
      "uid\030\t \001(\r\022\021\n\tis_agreed\030\002 \001(\010B\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerApplyEnterHomeResultReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerApplyEnterHomeResultReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerApplyEnterHomeResultReq_descriptor,
        new java.lang.String[] { "ApplyUid", "IsAgreed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
