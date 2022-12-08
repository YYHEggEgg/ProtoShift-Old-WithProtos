// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DraftGuestReplyInviteNotify.proto

package emu.grasscutter.net.oldproto;

public final class DraftGuestReplyInviteNotifyOuterClass {
  private DraftGuestReplyInviteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DraftGuestReplyInviteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DraftGuestReplyInviteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 draft_id = 5;</code>
     * @return The draftId.
     */
    int getDraftId();

    /**
     * <code>bool is_agree = 9;</code>
     * @return The isAgree.
     */
    boolean getIsAgree();

    /**
     * <code>uint32 guest_uid = 10;</code>
     * @return The guestUid.
     */
    int getGuestUid();
  }
  /**
   * <pre>
   * CmdId: 5490
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code DraftGuestReplyInviteNotify}
   */
  public static final class DraftGuestReplyInviteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DraftGuestReplyInviteNotify)
      DraftGuestReplyInviteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DraftGuestReplyInviteNotify.newBuilder() to construct.
    private DraftGuestReplyInviteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DraftGuestReplyInviteNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DraftGuestReplyInviteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.class, emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.Builder.class);
    }

    public static final int DRAFT_ID_FIELD_NUMBER = 5;
    private int draftId_;
    /**
     * <code>uint32 draft_id = 5;</code>
     * @return The draftId.
     */
    @java.lang.Override
    public int getDraftId() {
      return draftId_;
    }

    public static final int IS_AGREE_FIELD_NUMBER = 9;
    private boolean isAgree_;
    /**
     * <code>bool is_agree = 9;</code>
     * @return The isAgree.
     */
    @java.lang.Override
    public boolean getIsAgree() {
      return isAgree_;
    }

    public static final int GUEST_UID_FIELD_NUMBER = 10;
    private int guestUid_;
    /**
     * <code>uint32 guest_uid = 10;</code>
     * @return The guestUid.
     */
    @java.lang.Override
    public int getGuestUid() {
      return guestUid_;
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
        output.writeUInt32(5, draftId_);
      }
      if (isAgree_ != false) {
        output.writeBool(9, isAgree_);
      }
      if (guestUid_ != 0) {
        output.writeUInt32(10, guestUid_);
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
          .computeUInt32Size(5, draftId_);
      }
      if (isAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isAgree_);
      }
      if (guestUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, guestUid_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify other = (emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify) obj;

      if (getDraftId()
          != other.getDraftId()) return false;
      if (getIsAgree()
          != other.getIsAgree()) return false;
      if (getGuestUid()
          != other.getGuestUid()) return false;
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
      hash = (37 * hash) + IS_AGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgree());
      hash = (37 * hash) + GUEST_UID_FIELD_NUMBER;
      hash = (53 * hash) + getGuestUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify prototype) {
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
     * CmdId: 5490
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code DraftGuestReplyInviteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DraftGuestReplyInviteNotify)
        emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.class, emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.newBuilder()
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

        isAgree_ = false;

        guestUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.internal_static_DraftGuestReplyInviteNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify build() {
        emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify buildPartial() {
        emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify result = new emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify(this);
        result.draftId_ = draftId_;
        result.isAgree_ = isAgree_;
        result.guestUid_ = guestUid_;
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
        if (other instanceof emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify other) {
        if (other == emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify.getDefaultInstance()) return this;
        if (other.getDraftId() != 0) {
          setDraftId(other.getDraftId());
        }
        if (other.getIsAgree() != false) {
          setIsAgree(other.getIsAgree());
        }
        if (other.getGuestUid() != 0) {
          setGuestUid(other.getGuestUid());
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
              case 40: {
                draftId_ = input.readUInt32();

                break;
              } // case 40
              case 72: {
                isAgree_ = input.readBool();

                break;
              } // case 72
              case 80: {
                guestUid_ = input.readUInt32();

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

      private int draftId_ ;
      /**
       * <code>uint32 draft_id = 5;</code>
       * @return The draftId.
       */
      @java.lang.Override
      public int getDraftId() {
        return draftId_;
      }
      /**
       * <code>uint32 draft_id = 5;</code>
       * @param value The draftId to set.
       * @return This builder for chaining.
       */
      public Builder setDraftId(int value) {
        
        draftId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 draft_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDraftId() {
        
        draftId_ = 0;
        onChanged();
        return this;
      }

      private boolean isAgree_ ;
      /**
       * <code>bool is_agree = 9;</code>
       * @return The isAgree.
       */
      @java.lang.Override
      public boolean getIsAgree() {
        return isAgree_;
      }
      /**
       * <code>bool is_agree = 9;</code>
       * @param value The isAgree to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgree(boolean value) {
        
        isAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_agree = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgree() {
        
        isAgree_ = false;
        onChanged();
        return this;
      }

      private int guestUid_ ;
      /**
       * <code>uint32 guest_uid = 10;</code>
       * @return The guestUid.
       */
      @java.lang.Override
      public int getGuestUid() {
        return guestUid_;
      }
      /**
       * <code>uint32 guest_uid = 10;</code>
       * @param value The guestUid to set.
       * @return This builder for chaining.
       */
      public Builder setGuestUid(int value) {
        
        guestUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guest_uid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuestUid() {
        
        guestUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DraftGuestReplyInviteNotify)
    }

    // @@protoc_insertion_point(class_scope:DraftGuestReplyInviteNotify)
    private static final emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify();
    }

    public static emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DraftGuestReplyInviteNotify>
        PARSER = new com.google.protobuf.AbstractParser<DraftGuestReplyInviteNotify>() {
      @java.lang.Override
      public DraftGuestReplyInviteNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<DraftGuestReplyInviteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DraftGuestReplyInviteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.DraftGuestReplyInviteNotifyOuterClass.DraftGuestReplyInviteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DraftGuestReplyInviteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DraftGuestReplyInviteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!DraftGuestReplyInviteNotify.proto\"T\n\033D" +
      "raftGuestReplyInviteNotify\022\020\n\010draft_id\030\005" +
      " \001(\r\022\020\n\010is_agree\030\t \001(\010\022\021\n\tguest_uid\030\n \001(" +
      "\rB\036\n\034emu.grasscutter.net.oldprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DraftGuestReplyInviteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DraftGuestReplyInviteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DraftGuestReplyInviteNotify_descriptor,
        new java.lang.String[] { "DraftId", "IsAgree", "GuestUid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
