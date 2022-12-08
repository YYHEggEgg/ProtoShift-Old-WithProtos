// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientAIStateNotify.proto

package emu.grasscutter.net.newproto;

public final class ClientAIStateNotifyOuterClass {
  private ClientAIStateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientAIStateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientAIStateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 13;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 cur_tactic = 3;</code>
     * @return The curTactic.
     */
    int getCurTactic();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1125;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ClientAIStateNotify}
   */
  public static final class ClientAIStateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientAIStateNotify)
      ClientAIStateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientAIStateNotify.newBuilder() to construct.
    private ClientAIStateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientAIStateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientAIStateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.internal_static_ClientAIStateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.internal_static_ClientAIStateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify.class, emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 13;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 13;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int CUR_TACTIC_FIELD_NUMBER = 3;
    private int curTactic_;
    /**
     * <code>uint32 cur_tactic = 3;</code>
     * @return The curTactic.
     */
    @java.lang.Override
    public int getCurTactic() {
      return curTactic_;
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
      if (curTactic_ != 0) {
        output.writeUInt32(3, curTactic_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(13, entityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curTactic_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, curTactic_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify other = (emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getCurTactic()
          != other.getCurTactic()) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + CUR_TACTIC_FIELD_NUMBER;
      hash = (53 * hash) + getCurTactic();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify prototype) {
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
     *   CMD_ID = 1125;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ClientAIStateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientAIStateNotify)
        emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.internal_static_ClientAIStateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.internal_static_ClientAIStateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify.class, emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        entityId_ = 0;

        curTactic_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.internal_static_ClientAIStateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify build() {
        emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify buildPartial() {
        emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify result = new emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify(this);
        result.entityId_ = entityId_;
        result.curTactic_ = curTactic_;
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
        if (other instanceof emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify other) {
        if (other == emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getCurTactic() != 0) {
          setCurTactic(other.getCurTactic());
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
              case 24: {
                curTactic_ = input.readUInt32();

                break;
              } // case 24
              case 104: {
                entityId_ = input.readUInt32();

                break;
              } // case 104
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

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 13;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 13;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int curTactic_ ;
      /**
       * <code>uint32 cur_tactic = 3;</code>
       * @return The curTactic.
       */
      @java.lang.Override
      public int getCurTactic() {
        return curTactic_;
      }
      /**
       * <code>uint32 cur_tactic = 3;</code>
       * @param value The curTactic to set.
       * @return This builder for chaining.
       */
      public Builder setCurTactic(int value) {
        
        curTactic_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_tactic = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurTactic() {
        
        curTactic_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ClientAIStateNotify)
    }

    // @@protoc_insertion_point(class_scope:ClientAIStateNotify)
    private static final emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify();
    }

    public static emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientAIStateNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClientAIStateNotify>() {
      @java.lang.Override
      public ClientAIStateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ClientAIStateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientAIStateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ClientAIStateNotifyOuterClass.ClientAIStateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientAIStateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientAIStateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ClientAIStateNotify.proto\"<\n\023ClientAIS" +
      "tateNotify\022\021\n\tentity_id\030\r \001(\r\022\022\n\ncur_tac" +
      "tic\030\003 \001(\rB\036\n\034emu.grasscutter.net.newprot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientAIStateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientAIStateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientAIStateNotify_descriptor,
        new java.lang.String[] { "EntityId", "CurTactic", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
