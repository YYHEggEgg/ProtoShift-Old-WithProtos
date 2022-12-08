// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarExpeditionStartReq.proto

package emu.grasscutter.net.newproto;

public final class AvatarExpeditionStartReqOuterClass {
  private AvatarExpeditionStartReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarExpeditionStartReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarExpeditionStartReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 hour_time = 7;</code>
     * @return The hourTime.
     */
    int getHourTime();

    /**
     * <code>uint64 avatar_guid = 3;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 exp_id = 2;</code>
     * @return The expId.
     */
    int getExpId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1697;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code AvatarExpeditionStartReq}
   */
  public static final class AvatarExpeditionStartReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarExpeditionStartReq)
      AvatarExpeditionStartReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarExpeditionStartReq.newBuilder() to construct.
    private AvatarExpeditionStartReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarExpeditionStartReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarExpeditionStartReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.internal_static_AvatarExpeditionStartReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.internal_static_AvatarExpeditionStartReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq.class, emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq.Builder.class);
    }

    public static final int HOUR_TIME_FIELD_NUMBER = 7;
    private int hourTime_;
    /**
     * <code>uint32 hour_time = 7;</code>
     * @return The hourTime.
     */
    @java.lang.Override
    public int getHourTime() {
      return hourTime_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 3;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 3;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int EXP_ID_FIELD_NUMBER = 2;
    private int expId_;
    /**
     * <code>uint32 exp_id = 2;</code>
     * @return The expId.
     */
    @java.lang.Override
    public int getExpId() {
      return expId_;
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
      if (expId_ != 0) {
        output.writeUInt32(2, expId_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(3, avatarGuid_);
      }
      if (hourTime_ != 0) {
        output.writeUInt32(7, hourTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (expId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, expId_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, avatarGuid_);
      }
      if (hourTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, hourTime_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq other = (emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq) obj;

      if (getHourTime()
          != other.getHourTime()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getExpId()
          != other.getExpId()) return false;
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
      hash = (37 * hash) + HOUR_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getHourTime();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + EXP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getExpId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq prototype) {
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
     *   CMD_ID = 1697;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code AvatarExpeditionStartReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarExpeditionStartReq)
        emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.internal_static_AvatarExpeditionStartReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.internal_static_AvatarExpeditionStartReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq.class, emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        hourTime_ = 0;

        avatarGuid_ = 0L;

        expId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.internal_static_AvatarExpeditionStartReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq build() {
        emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq buildPartial() {
        emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq result = new emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq(this);
        result.hourTime_ = hourTime_;
        result.avatarGuid_ = avatarGuid_;
        result.expId_ = expId_;
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
        if (other instanceof emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq) {
          return mergeFrom((emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq other) {
        if (other == emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq.getDefaultInstance()) return this;
        if (other.getHourTime() != 0) {
          setHourTime(other.getHourTime());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getExpId() != 0) {
          setExpId(other.getExpId());
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
                expId_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                avatarGuid_ = input.readUInt64();

                break;
              } // case 24
              case 56: {
                hourTime_ = input.readUInt32();

                break;
              } // case 56
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

      private int hourTime_ ;
      /**
       * <code>uint32 hour_time = 7;</code>
       * @return The hourTime.
       */
      @java.lang.Override
      public int getHourTime() {
        return hourTime_;
      }
      /**
       * <code>uint32 hour_time = 7;</code>
       * @param value The hourTime to set.
       * @return This builder for chaining.
       */
      public Builder setHourTime(int value) {
        
        hourTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hour_time = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearHourTime() {
        
        hourTime_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 3;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 3;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int expId_ ;
      /**
       * <code>uint32 exp_id = 2;</code>
       * @return The expId.
       */
      @java.lang.Override
      public int getExpId() {
        return expId_;
      }
      /**
       * <code>uint32 exp_id = 2;</code>
       * @param value The expId to set.
       * @return This builder for chaining.
       */
      public Builder setExpId(int value) {
        
        expId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 exp_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearExpId() {
        
        expId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarExpeditionStartReq)
    }

    // @@protoc_insertion_point(class_scope:AvatarExpeditionStartReq)
    private static final emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq();
    }

    public static emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarExpeditionStartReq>
        PARSER = new com.google.protobuf.AbstractParser<AvatarExpeditionStartReq>() {
      @java.lang.Override
      public AvatarExpeditionStartReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarExpeditionStartReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarExpeditionStartReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.AvatarExpeditionStartReqOuterClass.AvatarExpeditionStartReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarExpeditionStartReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarExpeditionStartReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036AvatarExpeditionStartReq.proto\"R\n\030Avat" +
      "arExpeditionStartReq\022\021\n\thour_time\030\007 \001(\r\022" +
      "\023\n\013avatar_guid\030\003 \001(\004\022\016\n\006exp_id\030\002 \001(\rB\036\n\034" +
      "emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarExpeditionStartReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarExpeditionStartReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarExpeditionStartReq_descriptor,
        new java.lang.String[] { "HourTime", "AvatarGuid", "ExpId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
