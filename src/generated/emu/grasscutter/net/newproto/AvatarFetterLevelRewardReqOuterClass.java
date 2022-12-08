// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarFetterLevelRewardReq.proto

package emu.grasscutter.net.newproto;

public final class AvatarFetterLevelRewardReqOuterClass {
  private AvatarFetterLevelRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarFetterLevelRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarFetterLevelRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 avatar_guid = 2;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 fetter_level = 5;</code>
     * @return The fetterLevel.
     */
    int getFetterLevel();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1642;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code AvatarFetterLevelRewardReq}
   */
  public static final class AvatarFetterLevelRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarFetterLevelRewardReq)
      AvatarFetterLevelRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarFetterLevelRewardReq.newBuilder() to construct.
    private AvatarFetterLevelRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarFetterLevelRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarFetterLevelRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.internal_static_AvatarFetterLevelRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.internal_static_AvatarFetterLevelRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq.class, emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq.Builder.class);
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 2;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 2;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int FETTER_LEVEL_FIELD_NUMBER = 5;
    private int fetterLevel_;
    /**
     * <code>uint32 fetter_level = 5;</code>
     * @return The fetterLevel.
     */
    @java.lang.Override
    public int getFetterLevel() {
      return fetterLevel_;
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
      if (avatarGuid_ != 0L) {
        output.writeUInt64(2, avatarGuid_);
      }
      if (fetterLevel_ != 0) {
        output.writeUInt32(5, fetterLevel_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, avatarGuid_);
      }
      if (fetterLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, fetterLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq other = (emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq) obj;

      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getFetterLevel()
          != other.getFetterLevel()) return false;
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
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + FETTER_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getFetterLevel();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq prototype) {
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
     *   CMD_ID = 1642;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code AvatarFetterLevelRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarFetterLevelRewardReq)
        emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.internal_static_AvatarFetterLevelRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.internal_static_AvatarFetterLevelRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq.class, emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        avatarGuid_ = 0L;

        fetterLevel_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.internal_static_AvatarFetterLevelRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq build() {
        emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq buildPartial() {
        emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq result = new emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq(this);
        result.avatarGuid_ = avatarGuid_;
        result.fetterLevel_ = fetterLevel_;
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
        if (other instanceof emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq) {
          return mergeFrom((emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq other) {
        if (other == emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq.getDefaultInstance()) return this;
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getFetterLevel() != 0) {
          setFetterLevel(other.getFetterLevel());
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
                avatarGuid_ = input.readUInt64();

                break;
              } // case 16
              case 40: {
                fetterLevel_ = input.readUInt32();

                break;
              } // case 40
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

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 2;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 2;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int fetterLevel_ ;
      /**
       * <code>uint32 fetter_level = 5;</code>
       * @return The fetterLevel.
       */
      @java.lang.Override
      public int getFetterLevel() {
        return fetterLevel_;
      }
      /**
       * <code>uint32 fetter_level = 5;</code>
       * @param value The fetterLevel to set.
       * @return This builder for chaining.
       */
      public Builder setFetterLevel(int value) {
        
        fetterLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fetter_level = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFetterLevel() {
        
        fetterLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarFetterLevelRewardReq)
    }

    // @@protoc_insertion_point(class_scope:AvatarFetterLevelRewardReq)
    private static final emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq();
    }

    public static emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarFetterLevelRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<AvatarFetterLevelRewardReq>() {
      @java.lang.Override
      public AvatarFetterLevelRewardReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarFetterLevelRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarFetterLevelRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.AvatarFetterLevelRewardReqOuterClass.AvatarFetterLevelRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarFetterLevelRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarFetterLevelRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n AvatarFetterLevelRewardReq.proto\"G\n\032Av" +
      "atarFetterLevelRewardReq\022\023\n\013avatar_guid\030" +
      "\002 \001(\004\022\024\n\014fetter_level\030\005 \001(\rB\036\n\034emu.grass" +
      "cutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarFetterLevelRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarFetterLevelRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarFetterLevelRewardReq_descriptor,
        new java.lang.String[] { "AvatarGuid", "FetterLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
