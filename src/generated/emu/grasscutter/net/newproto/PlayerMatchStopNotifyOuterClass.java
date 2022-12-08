// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerMatchStopNotify.proto

package emu.grasscutter.net.newproto;

public final class PlayerMatchStopNotifyOuterClass {
  private PlayerMatchStopNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerMatchStopNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerMatchStopNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MatchReason reason = 10;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.MatchReason reason = 10;</code>
     * @return The reason.
     */
    emu.grasscutter.net.newproto.MatchReasonOuterClass.MatchReason getReason();

    /**
     * <code>uint32 host_uid = 8;</code>
     * @return The hostUid.
     */
    int getHostUid();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4181;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerMatchStopNotify}
   */
  public static final class PlayerMatchStopNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerMatchStopNotify)
      PlayerMatchStopNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerMatchStopNotify.newBuilder() to construct.
    private PlayerMatchStopNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerMatchStopNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerMatchStopNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.internal_static_PlayerMatchStopNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.internal_static_PlayerMatchStopNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify.class, emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 10;
    private int reason_;
    /**
     * <code>.MatchReason reason = 10;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.MatchReason reason = 10;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.MatchReasonOuterClass.MatchReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.MatchReasonOuterClass.MatchReason result = emu.grasscutter.net.newproto.MatchReasonOuterClass.MatchReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.newproto.MatchReasonOuterClass.MatchReason.UNRECOGNIZED : result;
    }

    public static final int HOST_UID_FIELD_NUMBER = 8;
    private int hostUid_;
    /**
     * <code>uint32 host_uid = 8;</code>
     * @return The hostUid.
     */
    @java.lang.Override
    public int getHostUid() {
      return hostUid_;
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
      if (hostUid_ != 0) {
        output.writeUInt32(8, hostUid_);
      }
      if (reason_ != emu.grasscutter.net.newproto.MatchReasonOuterClass.MatchReason.MATCH_REASON_NONE.getNumber()) {
        output.writeEnum(10, reason_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hostUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, hostUid_);
      }
      if (reason_ != emu.grasscutter.net.newproto.MatchReasonOuterClass.MatchReason.MATCH_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(10, reason_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify other = (emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify) obj;

      if (reason_ != other.reason_) return false;
      if (getHostUid()
          != other.getHostUid()) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + HOST_UID_FIELD_NUMBER;
      hash = (53 * hash) + getHostUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify prototype) {
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
     *   CMD_ID = 4181;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerMatchStopNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerMatchStopNotify)
        emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.internal_static_PlayerMatchStopNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.internal_static_PlayerMatchStopNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify.class, emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        reason_ = 0;

        hostUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.internal_static_PlayerMatchStopNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify build() {
        emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify buildPartial() {
        emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify result = new emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify(this);
        result.reason_ = reason_;
        result.hostUid_ = hostUid_;
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
        if (other instanceof emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify other) {
        if (other == emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify.getDefaultInstance()) return this;
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getHostUid() != 0) {
          setHostUid(other.getHostUid());
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
              case 64: {
                hostUid_ = input.readUInt32();

                break;
              } // case 64
              case 80: {
                reason_ = input.readEnum();

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

      private int reason_ = 0;
      /**
       * <code>.MatchReason reason = 10;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.MatchReason reason = 10;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MatchReason reason = 10;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.MatchReasonOuterClass.MatchReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.MatchReasonOuterClass.MatchReason result = emu.grasscutter.net.newproto.MatchReasonOuterClass.MatchReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.newproto.MatchReasonOuterClass.MatchReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.MatchReason reason = 10;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.newproto.MatchReasonOuterClass.MatchReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MatchReason reason = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int hostUid_ ;
      /**
       * <code>uint32 host_uid = 8;</code>
       * @return The hostUid.
       */
      @java.lang.Override
      public int getHostUid() {
        return hostUid_;
      }
      /**
       * <code>uint32 host_uid = 8;</code>
       * @param value The hostUid to set.
       * @return This builder for chaining.
       */
      public Builder setHostUid(int value) {
        
        hostUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 host_uid = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearHostUid() {
        
        hostUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerMatchStopNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerMatchStopNotify)
    private static final emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify();
    }

    public static emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerMatchStopNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerMatchStopNotify>() {
      @java.lang.Override
      public PlayerMatchStopNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerMatchStopNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerMatchStopNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerMatchStopNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerMatchStopNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033PlayerMatchStopNotify.proto\032\021MatchReas" +
      "on.proto\"G\n\025PlayerMatchStopNotify\022\034\n\006rea" +
      "son\030\n \001(\0162\014.MatchReason\022\020\n\010host_uid\030\010 \001(" +
      "\rB\036\n\034emu.grasscutter.net.newprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.MatchReasonOuterClass.getDescriptor(),
        });
    internal_static_PlayerMatchStopNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerMatchStopNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerMatchStopNotify_descriptor,
        new java.lang.String[] { "Reason", "HostUid", });
    emu.grasscutter.net.newproto.MatchReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
