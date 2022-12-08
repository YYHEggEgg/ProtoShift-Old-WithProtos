// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarUnlockTalentNotify.proto

package emu.grasscutter.net.oldproto;

public final class AvatarUnlockTalentNotifyOuterClass {
  private AvatarUnlockTalentNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarUnlockTalentNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarUnlockTalentNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 14;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint64 avatar_guid = 13;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 talent_id = 10;</code>
     * @return The talentId.
     */
    int getTalentId();

    /**
     * <code>uint32 skill_depot_id = 1;</code>
     * @return The skillDepotId.
     */
    int getSkillDepotId();
  }
  /**
   * <pre>
   * CmdId: 1012
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code AvatarUnlockTalentNotify}
   */
  public static final class AvatarUnlockTalentNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarUnlockTalentNotify)
      AvatarUnlockTalentNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarUnlockTalentNotify.newBuilder() to construct.
    private AvatarUnlockTalentNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarUnlockTalentNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarUnlockTalentNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.internal_static_AvatarUnlockTalentNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.internal_static_AvatarUnlockTalentNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify.class, emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 14;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 14;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 13;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 13;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int TALENT_ID_FIELD_NUMBER = 10;
    private int talentId_;
    /**
     * <code>uint32 talent_id = 10;</code>
     * @return The talentId.
     */
    @java.lang.Override
    public int getTalentId() {
      return talentId_;
    }

    public static final int SKILL_DEPOT_ID_FIELD_NUMBER = 1;
    private int skillDepotId_;
    /**
     * <code>uint32 skill_depot_id = 1;</code>
     * @return The skillDepotId.
     */
    @java.lang.Override
    public int getSkillDepotId() {
      return skillDepotId_;
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
      if (skillDepotId_ != 0) {
        output.writeUInt32(1, skillDepotId_);
      }
      if (talentId_ != 0) {
        output.writeUInt32(10, talentId_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(13, avatarGuid_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(14, entityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skillDepotId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, skillDepotId_);
      }
      if (talentId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, talentId_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(13, avatarGuid_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify other = (emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getTalentId()
          != other.getTalentId()) return false;
      if (getSkillDepotId()
          != other.getSkillDepotId()) return false;
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
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + TALENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTalentId();
      hash = (37 * hash) + SKILL_DEPOT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillDepotId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify prototype) {
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
     * CmdId: 1012
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code AvatarUnlockTalentNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarUnlockTalentNotify)
        emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.internal_static_AvatarUnlockTalentNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.internal_static_AvatarUnlockTalentNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify.class, emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify.newBuilder()
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

        avatarGuid_ = 0L;

        talentId_ = 0;

        skillDepotId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.internal_static_AvatarUnlockTalentNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify build() {
        emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify buildPartial() {
        emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify result = new emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify(this);
        result.entityId_ = entityId_;
        result.avatarGuid_ = avatarGuid_;
        result.talentId_ = talentId_;
        result.skillDepotId_ = skillDepotId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify other) {
        if (other == emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getTalentId() != 0) {
          setTalentId(other.getTalentId());
        }
        if (other.getSkillDepotId() != 0) {
          setSkillDepotId(other.getSkillDepotId());
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
                skillDepotId_ = input.readUInt32();

                break;
              } // case 8
              case 80: {
                talentId_ = input.readUInt32();

                break;
              } // case 80
              case 104: {
                avatarGuid_ = input.readUInt64();

                break;
              } // case 104
              case 112: {
                entityId_ = input.readUInt32();

                break;
              } // case 112
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
       * <code>uint32 entity_id = 14;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 14;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 13;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 13;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int talentId_ ;
      /**
       * <code>uint32 talent_id = 10;</code>
       * @return The talentId.
       */
      @java.lang.Override
      public int getTalentId() {
        return talentId_;
      }
      /**
       * <code>uint32 talent_id = 10;</code>
       * @param value The talentId to set.
       * @return This builder for chaining.
       */
      public Builder setTalentId(int value) {
        
        talentId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 talent_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTalentId() {
        
        talentId_ = 0;
        onChanged();
        return this;
      }

      private int skillDepotId_ ;
      /**
       * <code>uint32 skill_depot_id = 1;</code>
       * @return The skillDepotId.
       */
      @java.lang.Override
      public int getSkillDepotId() {
        return skillDepotId_;
      }
      /**
       * <code>uint32 skill_depot_id = 1;</code>
       * @param value The skillDepotId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillDepotId(int value) {
        
        skillDepotId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_depot_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillDepotId() {
        
        skillDepotId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarUnlockTalentNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarUnlockTalentNotify)
    private static final emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify();
    }

    public static emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarUnlockTalentNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarUnlockTalentNotify>() {
      @java.lang.Override
      public AvatarUnlockTalentNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarUnlockTalentNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarUnlockTalentNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.AvatarUnlockTalentNotifyOuterClass.AvatarUnlockTalentNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarUnlockTalentNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarUnlockTalentNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036AvatarUnlockTalentNotify.proto\"m\n\030Avat" +
      "arUnlockTalentNotify\022\021\n\tentity_id\030\016 \001(\r\022" +
      "\023\n\013avatar_guid\030\r \001(\004\022\021\n\ttalent_id\030\n \001(\r\022" +
      "\026\n\016skill_depot_id\030\001 \001(\rB\036\n\034emu.grasscutt" +
      "er.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarUnlockTalentNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarUnlockTalentNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarUnlockTalentNotify_descriptor,
        new java.lang.String[] { "EntityId", "AvatarGuid", "TalentId", "SkillDepotId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
