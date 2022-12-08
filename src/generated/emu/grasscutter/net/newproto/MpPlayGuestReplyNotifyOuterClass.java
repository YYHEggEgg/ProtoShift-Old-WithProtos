// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MpPlayGuestReplyNotify.proto

package emu.grasscutter.net.newproto;

public final class MpPlayGuestReplyNotifyOuterClass {
  private MpPlayGuestReplyNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MpPlayGuestReplyNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MpPlayGuestReplyNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_agree = 4;</code>
     * @return The isAgree.
     */
    boolean getIsAgree();

    /**
     * <code>uint32 uid = 11;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>uint32 mp_play_id = 2;</code>
     * @return The mpPlayId.
     */
    int getMpPlayId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1810;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code MpPlayGuestReplyNotify}
   */
  public static final class MpPlayGuestReplyNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MpPlayGuestReplyNotify)
      MpPlayGuestReplyNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MpPlayGuestReplyNotify.newBuilder() to construct.
    private MpPlayGuestReplyNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MpPlayGuestReplyNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MpPlayGuestReplyNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.internal_static_MpPlayGuestReplyNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.internal_static_MpPlayGuestReplyNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify.class, emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify.Builder.class);
    }

    public static final int IS_AGREE_FIELD_NUMBER = 4;
    private boolean isAgree_;
    /**
     * <code>bool is_agree = 4;</code>
     * @return The isAgree.
     */
    @java.lang.Override
    public boolean getIsAgree() {
      return isAgree_;
    }

    public static final int UID_FIELD_NUMBER = 11;
    private int uid_;
    /**
     * <code>uint32 uid = 11;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int MP_PLAY_ID_FIELD_NUMBER = 2;
    private int mpPlayId_;
    /**
     * <code>uint32 mp_play_id = 2;</code>
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
      if (mpPlayId_ != 0) {
        output.writeUInt32(2, mpPlayId_);
      }
      if (isAgree_ != false) {
        output.writeBool(4, isAgree_);
      }
      if (uid_ != 0) {
        output.writeUInt32(11, uid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mpPlayId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, mpPlayId_);
      }
      if (isAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isAgree_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, uid_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify other = (emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify) obj;

      if (getIsAgree()
          != other.getIsAgree()) return false;
      if (getUid()
          != other.getUid()) return false;
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
      hash = (37 * hash) + IS_AGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgree());
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + MP_PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMpPlayId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify prototype) {
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
     *   CMD_ID = 1810;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code MpPlayGuestReplyNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MpPlayGuestReplyNotify)
        emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.internal_static_MpPlayGuestReplyNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.internal_static_MpPlayGuestReplyNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify.class, emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify.newBuilder()
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

        uid_ = 0;

        mpPlayId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.internal_static_MpPlayGuestReplyNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify build() {
        emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify buildPartial() {
        emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify result = new emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify(this);
        result.isAgree_ = isAgree_;
        result.uid_ = uid_;
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
        if (other instanceof emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify other) {
        if (other == emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify.getDefaultInstance()) return this;
        if (other.getIsAgree() != false) {
          setIsAgree(other.getIsAgree());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
              case 16: {
                mpPlayId_ = input.readUInt32();

                break;
              } // case 16
              case 32: {
                isAgree_ = input.readBool();

                break;
              } // case 32
              case 88: {
                uid_ = input.readUInt32();

                break;
              } // case 88
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
       * <code>bool is_agree = 4;</code>
       * @return The isAgree.
       */
      @java.lang.Override
      public boolean getIsAgree() {
        return isAgree_;
      }
      /**
       * <code>bool is_agree = 4;</code>
       * @param value The isAgree to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgree(boolean value) {
        
        isAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_agree = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgree() {
        
        isAgree_ = false;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 11;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 11;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int mpPlayId_ ;
      /**
       * <code>uint32 mp_play_id = 2;</code>
       * @return The mpPlayId.
       */
      @java.lang.Override
      public int getMpPlayId() {
        return mpPlayId_;
      }
      /**
       * <code>uint32 mp_play_id = 2;</code>
       * @param value The mpPlayId to set.
       * @return This builder for chaining.
       */
      public Builder setMpPlayId(int value) {
        
        mpPlayId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mp_play_id = 2;</code>
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


      // @@protoc_insertion_point(builder_scope:MpPlayGuestReplyNotify)
    }

    // @@protoc_insertion_point(class_scope:MpPlayGuestReplyNotify)
    private static final emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify();
    }

    public static emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MpPlayGuestReplyNotify>
        PARSER = new com.google.protobuf.AbstractParser<MpPlayGuestReplyNotify>() {
      @java.lang.Override
      public MpPlayGuestReplyNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<MpPlayGuestReplyNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MpPlayGuestReplyNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.MpPlayGuestReplyNotifyOuterClass.MpPlayGuestReplyNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MpPlayGuestReplyNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MpPlayGuestReplyNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034MpPlayGuestReplyNotify.proto\"K\n\026MpPlay" +
      "GuestReplyNotify\022\020\n\010is_agree\030\004 \001(\010\022\013\n\003ui" +
      "d\030\013 \001(\r\022\022\n\nmp_play_id\030\002 \001(\rB\036\n\034emu.grass" +
      "cutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MpPlayGuestReplyNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MpPlayGuestReplyNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MpPlayGuestReplyNotify_descriptor,
        new java.lang.String[] { "IsAgree", "Uid", "MpPlayId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
