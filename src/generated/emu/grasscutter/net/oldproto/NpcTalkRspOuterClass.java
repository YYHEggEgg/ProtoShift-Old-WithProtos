// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NpcTalkRsp.proto

package emu.grasscutter.net.oldproto;

public final class NpcTalkRspOuterClass {
  private NpcTalkRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NpcTalkRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NpcTalkRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cur_talk_id = 9;</code>
     * @return The curTalkId.
     */
    int getCurTalkId();

    /**
     * <code>uint32 npc_entity_id = 6;</code>
     * @return The npcEntityId.
     */
    int getNpcEntityId();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 entity_id = 13;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * CmdId: 598
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code NpcTalkRsp}
   */
  public static final class NpcTalkRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NpcTalkRsp)
      NpcTalkRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NpcTalkRsp.newBuilder() to construct.
    private NpcTalkRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NpcTalkRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NpcTalkRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.internal_static_NpcTalkRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.internal_static_NpcTalkRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp.class, emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp.Builder.class);
    }

    public static final int CUR_TALK_ID_FIELD_NUMBER = 9;
    private int curTalkId_;
    /**
     * <code>uint32 cur_talk_id = 9;</code>
     * @return The curTalkId.
     */
    @java.lang.Override
    public int getCurTalkId() {
      return curTalkId_;
    }

    public static final int NPC_ENTITY_ID_FIELD_NUMBER = 6;
    private int npcEntityId_;
    /**
     * <code>uint32 npc_entity_id = 6;</code>
     * @return The npcEntityId.
     */
    @java.lang.Override
    public int getNpcEntityId() {
      return npcEntityId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
        output.writeInt32(3, retcode_);
      }
      if (npcEntityId_ != 0) {
        output.writeUInt32(6, npcEntityId_);
      }
      if (curTalkId_ != 0) {
        output.writeUInt32(9, curTalkId_);
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
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (npcEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, npcEntityId_);
      }
      if (curTalkId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, curTalkId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp other = (emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp) obj;

      if (getCurTalkId()
          != other.getCurTalkId()) return false;
      if (getNpcEntityId()
          != other.getNpcEntityId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      hash = (37 * hash) + CUR_TALK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCurTalkId();
      hash = (37 * hash) + NPC_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNpcEntityId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp prototype) {
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
     * CmdId: 598
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code NpcTalkRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NpcTalkRsp)
        emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.internal_static_NpcTalkRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.internal_static_NpcTalkRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp.class, emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        curTalkId_ = 0;

        npcEntityId_ = 0;

        retcode_ = 0;

        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.internal_static_NpcTalkRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp build() {
        emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp buildPartial() {
        emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp result = new emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp(this);
        result.curTalkId_ = curTalkId_;
        result.npcEntityId_ = npcEntityId_;
        result.retcode_ = retcode_;
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp other) {
        if (other == emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp.getDefaultInstance()) return this;
        if (other.getCurTalkId() != 0) {
          setCurTalkId(other.getCurTalkId());
        }
        if (other.getNpcEntityId() != 0) {
          setNpcEntityId(other.getNpcEntityId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
                retcode_ = input.readInt32();

                break;
              } // case 24
              case 48: {
                npcEntityId_ = input.readUInt32();

                break;
              } // case 48
              case 72: {
                curTalkId_ = input.readUInt32();

                break;
              } // case 72
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

      private int curTalkId_ ;
      /**
       * <code>uint32 cur_talk_id = 9;</code>
       * @return The curTalkId.
       */
      @java.lang.Override
      public int getCurTalkId() {
        return curTalkId_;
      }
      /**
       * <code>uint32 cur_talk_id = 9;</code>
       * @param value The curTalkId to set.
       * @return This builder for chaining.
       */
      public Builder setCurTalkId(int value) {
        
        curTalkId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_talk_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurTalkId() {
        
        curTalkId_ = 0;
        onChanged();
        return this;
      }

      private int npcEntityId_ ;
      /**
       * <code>uint32 npc_entity_id = 6;</code>
       * @return The npcEntityId.
       */
      @java.lang.Override
      public int getNpcEntityId() {
        return npcEntityId_;
      }
      /**
       * <code>uint32 npc_entity_id = 6;</code>
       * @param value The npcEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setNpcEntityId(int value) {
        
        npcEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 npc_entity_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearNpcEntityId() {
        
        npcEntityId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:NpcTalkRsp)
    }

    // @@protoc_insertion_point(class_scope:NpcTalkRsp)
    private static final emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp();
    }

    public static emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NpcTalkRsp>
        PARSER = new com.google.protobuf.AbstractParser<NpcTalkRsp>() {
      @java.lang.Override
      public NpcTalkRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<NpcTalkRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NpcTalkRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.NpcTalkRspOuterClass.NpcTalkRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NpcTalkRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NpcTalkRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020NpcTalkRsp.proto\"\\\n\nNpcTalkRsp\022\023\n\013cur_" +
      "talk_id\030\t \001(\r\022\025\n\rnpc_entity_id\030\006 \001(\r\022\017\n\007" +
      "retcode\030\003 \001(\005\022\021\n\tentity_id\030\r \001(\rB\036\n\034emu." +
      "grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NpcTalkRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NpcTalkRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NpcTalkRsp_descriptor,
        new java.lang.String[] { "CurTalkId", "NpcEntityId", "Retcode", "EntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}