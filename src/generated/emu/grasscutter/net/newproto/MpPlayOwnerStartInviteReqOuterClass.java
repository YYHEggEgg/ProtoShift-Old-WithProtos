// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MpPlayOwnerStartInviteReq.proto

package emu.grasscutter.net.newproto;

public final class MpPlayOwnerStartInviteReqOuterClass {
  private MpPlayOwnerStartInviteReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MpPlayOwnerStartInviteReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MpPlayOwnerStartInviteReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_skip_match = 9;</code>
     * @return The isSkipMatch.
     */
    boolean getIsSkipMatch();

    /**
     * <code>uint32 mp_play_id = 10;</code>
     * @return The mpPlayId.
     */
    int getMpPlayId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1809;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code MpPlayOwnerStartInviteReq}
   */
  public static final class MpPlayOwnerStartInviteReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MpPlayOwnerStartInviteReq)
      MpPlayOwnerStartInviteReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MpPlayOwnerStartInviteReq.newBuilder() to construct.
    private MpPlayOwnerStartInviteReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MpPlayOwnerStartInviteReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MpPlayOwnerStartInviteReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.internal_static_MpPlayOwnerStartInviteReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.internal_static_MpPlayOwnerStartInviteReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq.class, emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq.Builder.class);
    }

    public static final int IS_SKIP_MATCH_FIELD_NUMBER = 9;
    private boolean isSkipMatch_;
    /**
     * <code>bool is_skip_match = 9;</code>
     * @return The isSkipMatch.
     */
    @java.lang.Override
    public boolean getIsSkipMatch() {
      return isSkipMatch_;
    }

    public static final int MP_PLAY_ID_FIELD_NUMBER = 10;
    private int mpPlayId_;
    /**
     * <code>uint32 mp_play_id = 10;</code>
     * @return The mpPlayId.
     */
    @java.lang.Override
    public int getMpPlayId() {
      return mpPlayId_;
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
      if (isSkipMatch_ != false) {
        output.writeBool(9, isSkipMatch_);
      }
      if (mpPlayId_ != 0) {
        output.writeUInt32(10, mpPlayId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSkipMatch_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isSkipMatch_);
      }
      if (mpPlayId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, mpPlayId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq other = (emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq) obj;

      if (getIsSkipMatch()
          != other.getIsSkipMatch()) return false;
      if (getMpPlayId()
          != other.getMpPlayId()) return false;
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
      hash = (37 * hash) + IS_SKIP_MATCH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSkipMatch());
      hash = (37 * hash) + MP_PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMpPlayId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq prototype) {
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
     *   CMD_ID = 1809;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code MpPlayOwnerStartInviteReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MpPlayOwnerStartInviteReq)
        emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.internal_static_MpPlayOwnerStartInviteReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.internal_static_MpPlayOwnerStartInviteReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq.class, emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isSkipMatch_ = false;

        mpPlayId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.internal_static_MpPlayOwnerStartInviteReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq build() {
        emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq buildPartial() {
        emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq result = new emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq(this);
        result.isSkipMatch_ = isSkipMatch_;
        result.mpPlayId_ = mpPlayId_;
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
        if (other instanceof emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq) {
          return mergeFrom((emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq other) {
        if (other == emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq.getDefaultInstance()) return this;
        if (other.getIsSkipMatch() != false) {
          setIsSkipMatch(other.getIsSkipMatch());
        }
        if (other.getMpPlayId() != 0) {
          setMpPlayId(other.getMpPlayId());
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
                isSkipMatch_ = input.readBool();

                break;
              } // case 72
              case 80: {
                mpPlayId_ = input.readUInt32();

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

      private boolean isSkipMatch_ ;
      /**
       * <code>bool is_skip_match = 9;</code>
       * @return The isSkipMatch.
       */
      @java.lang.Override
      public boolean getIsSkipMatch() {
        return isSkipMatch_;
      }
      /**
       * <code>bool is_skip_match = 9;</code>
       * @param value The isSkipMatch to set.
       * @return This builder for chaining.
       */
      public Builder setIsSkipMatch(boolean value) {
        
        isSkipMatch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_skip_match = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSkipMatch() {
        
        isSkipMatch_ = false;
        onChanged();
        return this;
      }

      private int mpPlayId_ ;
      /**
       * <code>uint32 mp_play_id = 10;</code>
       * @return The mpPlayId.
       */
      @java.lang.Override
      public int getMpPlayId() {
        return mpPlayId_;
      }
      /**
       * <code>uint32 mp_play_id = 10;</code>
       * @param value The mpPlayId to set.
       * @return This builder for chaining.
       */
      public Builder setMpPlayId(int value) {
        
        mpPlayId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mp_play_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMpPlayId() {
        
        mpPlayId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MpPlayOwnerStartInviteReq)
    }

    // @@protoc_insertion_point(class_scope:MpPlayOwnerStartInviteReq)
    private static final emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq();
    }

    public static emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MpPlayOwnerStartInviteReq>
        PARSER = new com.google.protobuf.AbstractParser<MpPlayOwnerStartInviteReq>() {
      @java.lang.Override
      public MpPlayOwnerStartInviteReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<MpPlayOwnerStartInviteReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MpPlayOwnerStartInviteReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.MpPlayOwnerStartInviteReqOuterClass.MpPlayOwnerStartInviteReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MpPlayOwnerStartInviteReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MpPlayOwnerStartInviteReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037MpPlayOwnerStartInviteReq.proto\"F\n\031MpP" +
      "layOwnerStartInviteReq\022\025\n\ris_skip_match\030" +
      "\t \001(\010\022\022\n\nmp_play_id\030\n \001(\rB\036\n\034emu.grasscu" +
      "tter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MpPlayOwnerStartInviteReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MpPlayOwnerStartInviteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MpPlayOwnerStartInviteReq_descriptor,
        new java.lang.String[] { "IsSkipMatch", "MpPlayId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
