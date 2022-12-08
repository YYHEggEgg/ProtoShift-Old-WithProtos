// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TeamEntityInfo.proto

package emu.grasscutter.net.newproto;

public final class TeamEntityInfoOuterClass {
  private TeamEntityInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TeamEntityInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TeamEntityInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 team_entity_id = 3;</code>
     * @return The teamEntityId.
     */
    int getTeamEntityId();

    /**
     * <code>uint32 authority_peer_id = 12;</code>
     * @return The authorityPeerId.
     */
    int getAuthorityPeerId();

    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
     * @return Whether the teamAbilityInfo field is set.
     */
    boolean hasTeamAbilityInfo();
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
     * @return The teamAbilityInfo.
     */
    emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getTeamAbilityInfo();
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
     */
    emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getTeamAbilityInfoOrBuilder();
  }
  /**
   * Protobuf type {@code TeamEntityInfo}
   */
  public static final class TeamEntityInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TeamEntityInfo)
      TeamEntityInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TeamEntityInfo.newBuilder() to construct.
    private TeamEntityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TeamEntityInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TeamEntityInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.internal_static_TeamEntityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.internal_static_TeamEntityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo.class, emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo.Builder.class);
    }

    public static final int TEAM_ENTITY_ID_FIELD_NUMBER = 3;
    private int teamEntityId_;
    /**
     * <code>uint32 team_entity_id = 3;</code>
     * @return The teamEntityId.
     */
    @java.lang.Override
    public int getTeamEntityId() {
      return teamEntityId_;
    }

    public static final int AUTHORITY_PEER_ID_FIELD_NUMBER = 12;
    private int authorityPeerId_;
    /**
     * <code>uint32 authority_peer_id = 12;</code>
     * @return The authorityPeerId.
     */
    @java.lang.Override
    public int getAuthorityPeerId() {
      return authorityPeerId_;
    }

    public static final int TEAM_ABILITY_INFO_FIELD_NUMBER = 5;
    private emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo teamAbilityInfo_;
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
     * @return Whether the teamAbilityInfo field is set.
     */
    @java.lang.Override
    public boolean hasTeamAbilityInfo() {
      return teamAbilityInfo_ != null;
    }
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
     * @return The teamAbilityInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getTeamAbilityInfo() {
      return teamAbilityInfo_ == null ? emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : teamAbilityInfo_;
    }
    /**
     * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getTeamAbilityInfoOrBuilder() {
      return getTeamAbilityInfo();
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
      if (teamEntityId_ != 0) {
        output.writeUInt32(3, teamEntityId_);
      }
      if (teamAbilityInfo_ != null) {
        output.writeMessage(5, getTeamAbilityInfo());
      }
      if (authorityPeerId_ != 0) {
        output.writeUInt32(12, authorityPeerId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (teamEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, teamEntityId_);
      }
      if (teamAbilityInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getTeamAbilityInfo());
      }
      if (authorityPeerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, authorityPeerId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo other = (emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo) obj;

      if (getTeamEntityId()
          != other.getTeamEntityId()) return false;
      if (getAuthorityPeerId()
          != other.getAuthorityPeerId()) return false;
      if (hasTeamAbilityInfo() != other.hasTeamAbilityInfo()) return false;
      if (hasTeamAbilityInfo()) {
        if (!getTeamAbilityInfo()
            .equals(other.getTeamAbilityInfo())) return false;
      }
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
      hash = (37 * hash) + TEAM_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTeamEntityId();
      hash = (37 * hash) + AUTHORITY_PEER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorityPeerId();
      if (hasTeamAbilityInfo()) {
        hash = (37 * hash) + TEAM_ABILITY_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getTeamAbilityInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo prototype) {
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
     * Protobuf type {@code TeamEntityInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TeamEntityInfo)
        emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.internal_static_TeamEntityInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.internal_static_TeamEntityInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo.class, emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        teamEntityId_ = 0;

        authorityPeerId_ = 0;

        if (teamAbilityInfoBuilder_ == null) {
          teamAbilityInfo_ = null;
        } else {
          teamAbilityInfo_ = null;
          teamAbilityInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.internal_static_TeamEntityInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo build() {
        emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo buildPartial() {
        emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo result = new emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo(this);
        result.teamEntityId_ = teamEntityId_;
        result.authorityPeerId_ = authorityPeerId_;
        if (teamAbilityInfoBuilder_ == null) {
          result.teamAbilityInfo_ = teamAbilityInfo_;
        } else {
          result.teamAbilityInfo_ = teamAbilityInfoBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo other) {
        if (other == emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo.getDefaultInstance()) return this;
        if (other.getTeamEntityId() != 0) {
          setTeamEntityId(other.getTeamEntityId());
        }
        if (other.getAuthorityPeerId() != 0) {
          setAuthorityPeerId(other.getAuthorityPeerId());
        }
        if (other.hasTeamAbilityInfo()) {
          mergeTeamAbilityInfo(other.getTeamAbilityInfo());
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
                teamEntityId_ = input.readUInt32();

                break;
              } // case 24
              case 42: {
                input.readMessage(
                    getTeamAbilityInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 42
              case 96: {
                authorityPeerId_ = input.readUInt32();

                break;
              } // case 96
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

      private int teamEntityId_ ;
      /**
       * <code>uint32 team_entity_id = 3;</code>
       * @return The teamEntityId.
       */
      @java.lang.Override
      public int getTeamEntityId() {
        return teamEntityId_;
      }
      /**
       * <code>uint32 team_entity_id = 3;</code>
       * @param value The teamEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTeamEntityId(int value) {
        
        teamEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 team_entity_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTeamEntityId() {
        
        teamEntityId_ = 0;
        onChanged();
        return this;
      }

      private int authorityPeerId_ ;
      /**
       * <code>uint32 authority_peer_id = 12;</code>
       * @return The authorityPeerId.
       */
      @java.lang.Override
      public int getAuthorityPeerId() {
        return authorityPeerId_;
      }
      /**
       * <code>uint32 authority_peer_id = 12;</code>
       * @param value The authorityPeerId to set.
       * @return This builder for chaining.
       */
      public Builder setAuthorityPeerId(int value) {
        
        authorityPeerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 authority_peer_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthorityPeerId() {
        
        authorityPeerId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo teamAbilityInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> teamAbilityInfoBuilder_;
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
       * @return Whether the teamAbilityInfo field is set.
       */
      public boolean hasTeamAbilityInfo() {
        return teamAbilityInfoBuilder_ != null || teamAbilityInfo_ != null;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
       * @return The teamAbilityInfo.
       */
      public emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getTeamAbilityInfo() {
        if (teamAbilityInfoBuilder_ == null) {
          return teamAbilityInfo_ == null ? emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : teamAbilityInfo_;
        } else {
          return teamAbilityInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
       */
      public Builder setTeamAbilityInfo(emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
        if (teamAbilityInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          teamAbilityInfo_ = value;
          onChanged();
        } else {
          teamAbilityInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
       */
      public Builder setTeamAbilityInfo(
          emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
        if (teamAbilityInfoBuilder_ == null) {
          teamAbilityInfo_ = builderForValue.build();
          onChanged();
        } else {
          teamAbilityInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
       */
      public Builder mergeTeamAbilityInfo(emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
        if (teamAbilityInfoBuilder_ == null) {
          if (teamAbilityInfo_ != null) {
            teamAbilityInfo_ =
              emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder(teamAbilityInfo_).mergeFrom(value).buildPartial();
          } else {
            teamAbilityInfo_ = value;
          }
          onChanged();
        } else {
          teamAbilityInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
       */
      public Builder clearTeamAbilityInfo() {
        if (teamAbilityInfoBuilder_ == null) {
          teamAbilityInfo_ = null;
          onChanged();
        } else {
          teamAbilityInfo_ = null;
          teamAbilityInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
       */
      public emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getTeamAbilityInfoBuilder() {
        
        onChanged();
        return getTeamAbilityInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
       */
      public emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getTeamAbilityInfoOrBuilder() {
        if (teamAbilityInfoBuilder_ != null) {
          return teamAbilityInfoBuilder_.getMessageOrBuilder();
        } else {
          return teamAbilityInfo_ == null ?
              emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : teamAbilityInfo_;
        }
      }
      /**
       * <code>.AbilitySyncStateInfo team_ability_info = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> 
          getTeamAbilityInfoFieldBuilder() {
        if (teamAbilityInfoBuilder_ == null) {
          teamAbilityInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(
                  getTeamAbilityInfo(),
                  getParentForChildren(),
                  isClean());
          teamAbilityInfo_ = null;
        }
        return teamAbilityInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TeamEntityInfo)
    }

    // @@protoc_insertion_point(class_scope:TeamEntityInfo)
    private static final emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo();
    }

    public static emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TeamEntityInfo>
        PARSER = new com.google.protobuf.AbstractParser<TeamEntityInfo>() {
      @java.lang.Override
      public TeamEntityInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<TeamEntityInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TeamEntityInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.TeamEntityInfoOuterClass.TeamEntityInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeamEntityInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TeamEntityInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024TeamEntityInfo.proto\032\032AbilitySyncState" +
      "Info.proto\"u\n\016TeamEntityInfo\022\026\n\016team_ent" +
      "ity_id\030\003 \001(\r\022\031\n\021authority_peer_id\030\014 \001(\r\022" +
      "0\n\021team_ability_info\030\005 \001(\0132\025.AbilitySync" +
      "StateInfoB\036\n\034emu.grasscutter.net.newprot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.getDescriptor(),
        });
    internal_static_TeamEntityInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TeamEntityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TeamEntityInfo_descriptor,
        new java.lang.String[] { "TeamEntityId", "AuthorityPeerId", "TeamAbilityInfo", });
    emu.grasscutter.net.newproto.AbilitySyncStateInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
