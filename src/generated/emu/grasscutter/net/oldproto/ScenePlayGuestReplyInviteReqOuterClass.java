// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayGuestReplyInviteReq.proto

package emu.grasscutter.net.oldproto;

public final class ScenePlayGuestReplyInviteReqOuterClass {
  private ScenePlayGuestReplyInviteReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayGuestReplyInviteReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayGuestReplyInviteReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_agree = 15;</code>
     * @return The isAgree.
     */
    boolean getIsAgree();

    /**
     * <code>uint32 play_id = 6;</code>
     * @return The playId.
     */
    int getPlayId();
  }
  /**
   * <pre>
   * CmdId: 4353
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ScenePlayGuestReplyInviteReq}
   */
  public static final class ScenePlayGuestReplyInviteReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayGuestReplyInviteReq)
      ScenePlayGuestReplyInviteReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayGuestReplyInviteReq.newBuilder() to construct.
    private ScenePlayGuestReplyInviteReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayGuestReplyInviteReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayGuestReplyInviteReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.internal_static_ScenePlayGuestReplyInviteReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.internal_static_ScenePlayGuestReplyInviteReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq.class, emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq.Builder.class);
    }

    public static final int IS_AGREE_FIELD_NUMBER = 15;
    private boolean isAgree_;
    /**
     * <code>bool is_agree = 15;</code>
     * @return The isAgree.
     */
    @java.lang.Override
    public boolean getIsAgree() {
      return isAgree_;
    }

    public static final int PLAY_ID_FIELD_NUMBER = 6;
    private int playId_;
    /**
     * <code>uint32 play_id = 6;</code>
     * @return The playId.
     */
    @java.lang.Override
    public int getPlayId() {
      return playId_;
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
      if (playId_ != 0) {
        output.writeUInt32(6, playId_);
      }
      if (isAgree_ != false) {
        output.writeBool(15, isAgree_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, playId_);
      }
      if (isAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isAgree_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq other = (emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq) obj;

      if (getIsAgree()
          != other.getIsAgree()) return false;
      if (getPlayId()
          != other.getPlayId()) return false;
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
      hash = (37 * hash) + IS_AGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgree());
      hash = (37 * hash) + PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq prototype) {
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
     * CmdId: 4353
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ScenePlayGuestReplyInviteReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayGuestReplyInviteReq)
        emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.internal_static_ScenePlayGuestReplyInviteReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.internal_static_ScenePlayGuestReplyInviteReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq.class, emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isAgree_ = false;

        playId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.internal_static_ScenePlayGuestReplyInviteReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq build() {
        emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq buildPartial() {
        emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq result = new emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq(this);
        result.isAgree_ = isAgree_;
        result.playId_ = playId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq other) {
        if (other == emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq.getDefaultInstance()) return this;
        if (other.getIsAgree() != false) {
          setIsAgree(other.getIsAgree());
        }
        if (other.getPlayId() != 0) {
          setPlayId(other.getPlayId());
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
              case 48: {
                playId_ = input.readUInt32();

                break;
              } // case 48
              case 120: {
                isAgree_ = input.readBool();

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

      private boolean isAgree_ ;
      /**
       * <code>bool is_agree = 15;</code>
       * @return The isAgree.
       */
      @java.lang.Override
      public boolean getIsAgree() {
        return isAgree_;
      }
      /**
       * <code>bool is_agree = 15;</code>
       * @param value The isAgree to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgree(boolean value) {
        
        isAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_agree = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgree() {
        
        isAgree_ = false;
        onChanged();
        return this;
      }

      private int playId_ ;
      /**
       * <code>uint32 play_id = 6;</code>
       * @return The playId.
       */
      @java.lang.Override
      public int getPlayId() {
        return playId_;
      }
      /**
       * <code>uint32 play_id = 6;</code>
       * @param value The playId to set.
       * @return This builder for chaining.
       */
      public Builder setPlayId(int value) {
        
        playId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 play_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayId() {
        
        playId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayGuestReplyInviteReq)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayGuestReplyInviteReq)
    private static final emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq();
    }

    public static emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayGuestReplyInviteReq>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayGuestReplyInviteReq>() {
      @java.lang.Override
      public ScenePlayGuestReplyInviteReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ScenePlayGuestReplyInviteReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayGuestReplyInviteReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayGuestReplyInviteReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayGuestReplyInviteReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"ScenePlayGuestReplyInviteReq.proto\"A\n\034" +
      "ScenePlayGuestReplyInviteReq\022\020\n\010is_agree" +
      "\030\017 \001(\010\022\017\n\007play_id\030\006 \001(\rB\036\n\034emu.grasscutt" +
      "er.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ScenePlayGuestReplyInviteReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayGuestReplyInviteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayGuestReplyInviteReq_descriptor,
        new java.lang.String[] { "IsAgree", "PlayId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
