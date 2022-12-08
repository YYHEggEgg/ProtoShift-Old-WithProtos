// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DraftOwnerInviteNotify.proto

package emu.grasscutter.net.oldproto;

public final class DraftOwnerInviteNotifyOuterClass {
  private DraftOwnerInviteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DraftOwnerInviteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DraftOwnerInviteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 draft_id = 4;</code>
     * @return The draftId.
     */
    int getDraftId();

    /**
     * <code>uint32 invite_deadline_time = 15;</code>
     * @return The inviteDeadlineTime.
     */
    int getInviteDeadlineTime();
  }
  /**
   * <pre>
   * CmdId: 5407
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code DraftOwnerInviteNotify}
   */
  public static final class DraftOwnerInviteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DraftOwnerInviteNotify)
      DraftOwnerInviteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DraftOwnerInviteNotify.newBuilder() to construct.
    private DraftOwnerInviteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DraftOwnerInviteNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DraftOwnerInviteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.internal_static_DraftOwnerInviteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.internal_static_DraftOwnerInviteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify.class, emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify.Builder.class);
    }

    public static final int DRAFT_ID_FIELD_NUMBER = 4;
    private int draftId_;
    /**
     * <code>uint32 draft_id = 4;</code>
     * @return The draftId.
     */
    @java.lang.Override
    public int getDraftId() {
      return draftId_;
    }

    public static final int INVITE_DEADLINE_TIME_FIELD_NUMBER = 15;
    private int inviteDeadlineTime_;
    /**
     * <code>uint32 invite_deadline_time = 15;</code>
     * @return The inviteDeadlineTime.
     */
    @java.lang.Override
    public int getInviteDeadlineTime() {
      return inviteDeadlineTime_;
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
      if (draftId_ != 0) {
        output.writeUInt32(4, draftId_);
      }
      if (inviteDeadlineTime_ != 0) {
        output.writeUInt32(15, inviteDeadlineTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (draftId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, draftId_);
      }
      if (inviteDeadlineTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, inviteDeadlineTime_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify other = (emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify) obj;

      if (getDraftId()
          != other.getDraftId()) return false;
      if (getInviteDeadlineTime()
          != other.getInviteDeadlineTime()) return false;
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
      hash = (37 * hash) + DRAFT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDraftId();
      hash = (37 * hash) + INVITE_DEADLINE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getInviteDeadlineTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify prototype) {
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
     * CmdId: 5407
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code DraftOwnerInviteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DraftOwnerInviteNotify)
        emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.internal_static_DraftOwnerInviteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.internal_static_DraftOwnerInviteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify.class, emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        draftId_ = 0;

        inviteDeadlineTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.internal_static_DraftOwnerInviteNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify build() {
        emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify buildPartial() {
        emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify result = new emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify(this);
        result.draftId_ = draftId_;
        result.inviteDeadlineTime_ = inviteDeadlineTime_;
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
        if (other instanceof emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify other) {
        if (other == emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify.getDefaultInstance()) return this;
        if (other.getDraftId() != 0) {
          setDraftId(other.getDraftId());
        }
        if (other.getInviteDeadlineTime() != 0) {
          setInviteDeadlineTime(other.getInviteDeadlineTime());
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
                draftId_ = input.readUInt32();

                break;
              } // case 32
              case 120: {
                inviteDeadlineTime_ = input.readUInt32();

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

      private int draftId_ ;
      /**
       * <code>uint32 draft_id = 4;</code>
       * @return The draftId.
       */
      @java.lang.Override
      public int getDraftId() {
        return draftId_;
      }
      /**
       * <code>uint32 draft_id = 4;</code>
       * @param value The draftId to set.
       * @return This builder for chaining.
       */
      public Builder setDraftId(int value) {
        
        draftId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 draft_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDraftId() {
        
        draftId_ = 0;
        onChanged();
        return this;
      }

      private int inviteDeadlineTime_ ;
      /**
       * <code>uint32 invite_deadline_time = 15;</code>
       * @return The inviteDeadlineTime.
       */
      @java.lang.Override
      public int getInviteDeadlineTime() {
        return inviteDeadlineTime_;
      }
      /**
       * <code>uint32 invite_deadline_time = 15;</code>
       * @param value The inviteDeadlineTime to set.
       * @return This builder for chaining.
       */
      public Builder setInviteDeadlineTime(int value) {
        
        inviteDeadlineTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 invite_deadline_time = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearInviteDeadlineTime() {
        
        inviteDeadlineTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DraftOwnerInviteNotify)
    }

    // @@protoc_insertion_point(class_scope:DraftOwnerInviteNotify)
    private static final emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify();
    }

    public static emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DraftOwnerInviteNotify>
        PARSER = new com.google.protobuf.AbstractParser<DraftOwnerInviteNotify>() {
      @java.lang.Override
      public DraftOwnerInviteNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<DraftOwnerInviteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DraftOwnerInviteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.DraftOwnerInviteNotifyOuterClass.DraftOwnerInviteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DraftOwnerInviteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DraftOwnerInviteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034DraftOwnerInviteNotify.proto\"H\n\026DraftO" +
      "wnerInviteNotify\022\020\n\010draft_id\030\004 \001(\r\022\034\n\024in" +
      "vite_deadline_time\030\017 \001(\rB\036\n\034emu.grasscut" +
      "ter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DraftOwnerInviteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DraftOwnerInviteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DraftOwnerInviteNotify_descriptor,
        new java.lang.String[] { "DraftId", "InviteDeadlineTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
