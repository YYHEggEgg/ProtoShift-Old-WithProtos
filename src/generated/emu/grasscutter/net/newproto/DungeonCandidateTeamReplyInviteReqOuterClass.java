// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamReplyInviteReq.proto

package emu.grasscutter.net.newproto;

public final class DungeonCandidateTeamReplyInviteReqOuterClass {
  private DungeonCandidateTeamReplyInviteReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonCandidateTeamReplyInviteReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonCandidateTeamReplyInviteReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_accept = 1;</code>
     * @return The isAccept.
     */
    boolean getIsAccept();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 967;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code DungeonCandidateTeamReplyInviteReq}
   */
  public static final class DungeonCandidateTeamReplyInviteReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonCandidateTeamReplyInviteReq)
      DungeonCandidateTeamReplyInviteReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonCandidateTeamReplyInviteReq.newBuilder() to construct.
    private DungeonCandidateTeamReplyInviteReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonCandidateTeamReplyInviteReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonCandidateTeamReplyInviteReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.internal_static_DungeonCandidateTeamReplyInviteReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.internal_static_DungeonCandidateTeamReplyInviteReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq.class, emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq.Builder.class);
    }

    public static final int IS_ACCEPT_FIELD_NUMBER = 1;
    private boolean isAccept_;
    /**
     * <code>bool is_accept = 1;</code>
     * @return The isAccept.
     */
    @java.lang.Override
    public boolean getIsAccept() {
      return isAccept_;
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
      if (isAccept_ != false) {
        output.writeBool(1, isAccept_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAccept_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isAccept_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq other = (emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq) obj;

      if (getIsAccept()
          != other.getIsAccept()) return false;
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
      hash = (37 * hash) + IS_ACCEPT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAccept());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq prototype) {
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
     *   CMD_ID = 967;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code DungeonCandidateTeamReplyInviteReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonCandidateTeamReplyInviteReq)
        emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.internal_static_DungeonCandidateTeamReplyInviteReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.internal_static_DungeonCandidateTeamReplyInviteReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq.class, emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isAccept_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.internal_static_DungeonCandidateTeamReplyInviteReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq build() {
        emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq buildPartial() {
        emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq result = new emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq(this);
        result.isAccept_ = isAccept_;
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
        if (other instanceof emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq) {
          return mergeFrom((emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq other) {
        if (other == emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq.getDefaultInstance()) return this;
        if (other.getIsAccept() != false) {
          setIsAccept(other.getIsAccept());
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
              case 8: {
                isAccept_ = input.readBool();

                break;
              } // case 8
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

      private boolean isAccept_ ;
      /**
       * <code>bool is_accept = 1;</code>
       * @return The isAccept.
       */
      @java.lang.Override
      public boolean getIsAccept() {
        return isAccept_;
      }
      /**
       * <code>bool is_accept = 1;</code>
       * @param value The isAccept to set.
       * @return This builder for chaining.
       */
      public Builder setIsAccept(boolean value) {
        
        isAccept_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_accept = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAccept() {
        
        isAccept_ = false;
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


      // @@protoc_insertion_point(builder_scope:DungeonCandidateTeamReplyInviteReq)
    }

    // @@protoc_insertion_point(class_scope:DungeonCandidateTeamReplyInviteReq)
    private static final emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq();
    }

    public static emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonCandidateTeamReplyInviteReq>
        PARSER = new com.google.protobuf.AbstractParser<DungeonCandidateTeamReplyInviteReq>() {
      @java.lang.Override
      public DungeonCandidateTeamReplyInviteReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<DungeonCandidateTeamReplyInviteReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonCandidateTeamReplyInviteReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.DungeonCandidateTeamReplyInviteReqOuterClass.DungeonCandidateTeamReplyInviteReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonCandidateTeamReplyInviteReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonCandidateTeamReplyInviteReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(DungeonCandidateTeamReplyInviteReq.pro" +
      "to\"7\n\"DungeonCandidateTeamReplyInviteReq" +
      "\022\021\n\tis_accept\030\001 \001(\010B\036\n\034emu.grasscutter.n" +
      "et.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonCandidateTeamReplyInviteReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonCandidateTeamReplyInviteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonCandidateTeamReplyInviteReq_descriptor,
        new java.lang.String[] { "IsAccept", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
