// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeEffigyFirstPassRewardRsp.proto

package emu.grasscutter.net.newproto;

public final class TakeEffigyFirstPassRewardRspOuterClass {
  private TakeEffigyFirstPassRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeEffigyFirstPassRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeEffigyFirstPassRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_id = 10;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2178;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code TakeEffigyFirstPassRewardRsp}
   */
  public static final class TakeEffigyFirstPassRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeEffigyFirstPassRewardRsp)
      TakeEffigyFirstPassRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeEffigyFirstPassRewardRsp.newBuilder() to construct.
    private TakeEffigyFirstPassRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeEffigyFirstPassRewardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeEffigyFirstPassRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.internal_static_TakeEffigyFirstPassRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.internal_static_TakeEffigyFirstPassRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp.class, emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp.Builder.class);
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 10;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 10;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      if (challengeId_ != 0) {
        output.writeUInt32(10, challengeId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, retcode_);
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, challengeId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp other = (emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp) obj;

      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp prototype) {
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
     *   CMD_ID = 2178;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code TakeEffigyFirstPassRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeEffigyFirstPassRewardRsp)
        emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.internal_static_TakeEffigyFirstPassRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.internal_static_TakeEffigyFirstPassRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp.class, emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        challengeId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.internal_static_TakeEffigyFirstPassRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp build() {
        emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp buildPartial() {
        emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp result = new emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp(this);
        result.challengeId_ = challengeId_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp other) {
        if (other == emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp.getDefaultInstance()) return this;
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 32: {
                retcode_ = input.readInt32();

                break;
              } // case 32
              case 80: {
                challengeId_ = input.readUInt32();

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

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 10;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 10;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TakeEffigyFirstPassRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:TakeEffigyFirstPassRewardRsp)
    private static final emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp();
    }

    public static emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeEffigyFirstPassRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<TakeEffigyFirstPassRewardRsp>() {
      @java.lang.Override
      public TakeEffigyFirstPassRewardRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<TakeEffigyFirstPassRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeEffigyFirstPassRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.TakeEffigyFirstPassRewardRspOuterClass.TakeEffigyFirstPassRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeEffigyFirstPassRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeEffigyFirstPassRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"TakeEffigyFirstPassRewardRsp.proto\"E\n\034" +
      "TakeEffigyFirstPassRewardRsp\022\024\n\014challeng" +
      "e_id\030\n \001(\r\022\017\n\007retcode\030\004 \001(\005B\036\n\034emu.grass" +
      "cutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeEffigyFirstPassRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeEffigyFirstPassRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeEffigyFirstPassRewardRsp_descriptor,
        new java.lang.String[] { "ChallengeId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
