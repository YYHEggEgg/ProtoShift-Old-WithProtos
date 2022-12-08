// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerApplyEnterMpAfterMatchAgreedNotify.proto

package emu.grasscutter.net.oldproto;

public final class PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass {
  private PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerApplyEnterMpAfterMatchAgreedNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerApplyEnterMpAfterMatchAgreedNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.OnlinePlayerInfo src_player_info = 11;</code>
     * @return Whether the srcPlayerInfo field is set.
     */
    boolean hasSrcPlayerInfo();
    /**
     * <code>.OnlinePlayerInfo src_player_info = 11;</code>
     * @return The srcPlayerInfo.
     */
    emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo();
    /**
     * <code>.OnlinePlayerInfo src_player_info = 11;</code>
     */
    emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder();

    /**
     * <code>uint32 matchserver_id = 10;</code>
     * @return The matchserverId.
     */
    int getMatchserverId();

    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    int getMatchTypeValue();
    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The matchType.
     */
    emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType getMatchType();
  }
  /**
   * <pre>
   * CmdId: 4195
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code PlayerApplyEnterMpAfterMatchAgreedNotify}
   */
  public static final class PlayerApplyEnterMpAfterMatchAgreedNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerApplyEnterMpAfterMatchAgreedNotify)
      PlayerApplyEnterMpAfterMatchAgreedNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerApplyEnterMpAfterMatchAgreedNotify.newBuilder() to construct.
    private PlayerApplyEnterMpAfterMatchAgreedNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerApplyEnterMpAfterMatchAgreedNotify() {
      matchType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerApplyEnterMpAfterMatchAgreedNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.internal_static_PlayerApplyEnterMpAfterMatchAgreedNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.internal_static_PlayerApplyEnterMpAfterMatchAgreedNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify.class, emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify.Builder.class);
    }

    public static final int SRC_PLAYER_INFO_FIELD_NUMBER = 11;
    private emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo srcPlayerInfo_;
    /**
     * <code>.OnlinePlayerInfo src_player_info = 11;</code>
     * @return Whether the srcPlayerInfo field is set.
     */
    @java.lang.Override
    public boolean hasSrcPlayerInfo() {
      return srcPlayerInfo_ != null;
    }
    /**
     * <code>.OnlinePlayerInfo src_player_info = 11;</code>
     * @return The srcPlayerInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo() {
      return srcPlayerInfo_ == null ? emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : srcPlayerInfo_;
    }
    /**
     * <code>.OnlinePlayerInfo src_player_info = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder() {
      return getSrcPlayerInfo();
    }

    public static final int MATCHSERVER_ID_FIELD_NUMBER = 10;
    private int matchserverId_;
    /**
     * <code>uint32 matchserver_id = 10;</code>
     * @return The matchserverId.
     */
    @java.lang.Override
    public int getMatchserverId() {
      return matchserverId_;
    }

    public static final int MATCH_TYPE_FIELD_NUMBER = 3;
    private int matchType_;
    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    @java.lang.Override public int getMatchTypeValue() {
      return matchType_;
    }
    /**
     * <code>.MatchType match_type = 3;</code>
     * @return The matchType.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType getMatchType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType result = emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
      return result == null ? emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
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
      if (matchType_ != emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        output.writeEnum(3, matchType_);
      }
      if (matchserverId_ != 0) {
        output.writeUInt32(10, matchserverId_);
      }
      if (srcPlayerInfo_ != null) {
        output.writeMessage(11, getSrcPlayerInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (matchType_ != emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, matchType_);
      }
      if (matchserverId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, matchserverId_);
      }
      if (srcPlayerInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getSrcPlayerInfo());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify other = (emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify) obj;

      if (hasSrcPlayerInfo() != other.hasSrcPlayerInfo()) return false;
      if (hasSrcPlayerInfo()) {
        if (!getSrcPlayerInfo()
            .equals(other.getSrcPlayerInfo())) return false;
      }
      if (getMatchserverId()
          != other.getMatchserverId()) return false;
      if (matchType_ != other.matchType_) return false;
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
      if (hasSrcPlayerInfo()) {
        hash = (37 * hash) + SRC_PLAYER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSrcPlayerInfo().hashCode();
      }
      hash = (37 * hash) + MATCHSERVER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchserverId();
      hash = (37 * hash) + MATCH_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + matchType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify prototype) {
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
     * CmdId: 4195
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code PlayerApplyEnterMpAfterMatchAgreedNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerApplyEnterMpAfterMatchAgreedNotify)
        emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.internal_static_PlayerApplyEnterMpAfterMatchAgreedNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.internal_static_PlayerApplyEnterMpAfterMatchAgreedNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify.class, emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (srcPlayerInfoBuilder_ == null) {
          srcPlayerInfo_ = null;
        } else {
          srcPlayerInfo_ = null;
          srcPlayerInfoBuilder_ = null;
        }
        matchserverId_ = 0;

        matchType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.internal_static_PlayerApplyEnterMpAfterMatchAgreedNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify build() {
        emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify buildPartial() {
        emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify result = new emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify(this);
        if (srcPlayerInfoBuilder_ == null) {
          result.srcPlayerInfo_ = srcPlayerInfo_;
        } else {
          result.srcPlayerInfo_ = srcPlayerInfoBuilder_.build();
        }
        result.matchserverId_ = matchserverId_;
        result.matchType_ = matchType_;
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
        if (other instanceof emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify other) {
        if (other == emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify.getDefaultInstance()) return this;
        if (other.hasSrcPlayerInfo()) {
          mergeSrcPlayerInfo(other.getSrcPlayerInfo());
        }
        if (other.getMatchserverId() != 0) {
          setMatchserverId(other.getMatchserverId());
        }
        if (other.matchType_ != 0) {
          setMatchTypeValue(other.getMatchTypeValue());
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
                matchType_ = input.readEnum();

                break;
              } // case 24
              case 80: {
                matchserverId_ = input.readUInt32();

                break;
              } // case 80
              case 90: {
                input.readMessage(
                    getSrcPlayerInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 90
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

      private emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo srcPlayerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> srcPlayerInfoBuilder_;
      /**
       * <code>.OnlinePlayerInfo src_player_info = 11;</code>
       * @return Whether the srcPlayerInfo field is set.
       */
      public boolean hasSrcPlayerInfo() {
        return srcPlayerInfoBuilder_ != null || srcPlayerInfo_ != null;
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 11;</code>
       * @return The srcPlayerInfo.
       */
      public emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo() {
        if (srcPlayerInfoBuilder_ == null) {
          return srcPlayerInfo_ == null ? emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : srcPlayerInfo_;
        } else {
          return srcPlayerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 11;</code>
       */
      public Builder setSrcPlayerInfo(emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (srcPlayerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          srcPlayerInfo_ = value;
          onChanged();
        } else {
          srcPlayerInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 11;</code>
       */
      public Builder setSrcPlayerInfo(
          emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
        if (srcPlayerInfoBuilder_ == null) {
          srcPlayerInfo_ = builderForValue.build();
          onChanged();
        } else {
          srcPlayerInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 11;</code>
       */
      public Builder mergeSrcPlayerInfo(emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (srcPlayerInfoBuilder_ == null) {
          if (srcPlayerInfo_ != null) {
            srcPlayerInfo_ =
              emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.newBuilder(srcPlayerInfo_).mergeFrom(value).buildPartial();
          } else {
            srcPlayerInfo_ = value;
          }
          onChanged();
        } else {
          srcPlayerInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 11;</code>
       */
      public Builder clearSrcPlayerInfo() {
        if (srcPlayerInfoBuilder_ == null) {
          srcPlayerInfo_ = null;
          onChanged();
        } else {
          srcPlayerInfo_ = null;
          srcPlayerInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 11;</code>
       */
      public emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getSrcPlayerInfoBuilder() {
        
        onChanged();
        return getSrcPlayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 11;</code>
       */
      public emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder() {
        if (srcPlayerInfoBuilder_ != null) {
          return srcPlayerInfoBuilder_.getMessageOrBuilder();
        } else {
          return srcPlayerInfo_ == null ?
              emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : srcPlayerInfo_;
        }
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> 
          getSrcPlayerInfoFieldBuilder() {
        if (srcPlayerInfoBuilder_ == null) {
          srcPlayerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(
                  getSrcPlayerInfo(),
                  getParentForChildren(),
                  isClean());
          srcPlayerInfo_ = null;
        }
        return srcPlayerInfoBuilder_;
      }

      private int matchserverId_ ;
      /**
       * <code>uint32 matchserver_id = 10;</code>
       * @return The matchserverId.
       */
      @java.lang.Override
      public int getMatchserverId() {
        return matchserverId_;
      }
      /**
       * <code>uint32 matchserver_id = 10;</code>
       * @param value The matchserverId to set.
       * @return This builder for chaining.
       */
      public Builder setMatchserverId(int value) {
        
        matchserverId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 matchserver_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchserverId() {
        
        matchserverId_ = 0;
        onChanged();
        return this;
      }

      private int matchType_ = 0;
      /**
       * <code>.MatchType match_type = 3;</code>
       * @return The enum numeric value on the wire for matchType.
       */
      @java.lang.Override public int getMatchTypeValue() {
        return matchType_;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @param value The enum numeric value on the wire for matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchTypeValue(int value) {
        
        matchType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @return The matchType.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType getMatchType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType result = emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
        return result == null ? emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @param value The matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchType(emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        matchType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchType() {
        
        matchType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerApplyEnterMpAfterMatchAgreedNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerApplyEnterMpAfterMatchAgreedNotify)
    private static final emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify();
    }

    public static emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerApplyEnterMpAfterMatchAgreedNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerApplyEnterMpAfterMatchAgreedNotify>() {
      @java.lang.Override
      public PlayerApplyEnterMpAfterMatchAgreedNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerApplyEnterMpAfterMatchAgreedNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerApplyEnterMpAfterMatchAgreedNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.PlayerApplyEnterMpAfterMatchAgreedNotifyOuterClass.PlayerApplyEnterMpAfterMatchAgreedNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerApplyEnterMpAfterMatchAgreedNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerApplyEnterMpAfterMatchAgreedNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.PlayerApplyEnterMpAfterMatchAgreedNoti" +
      "fy.proto\032\017MatchType.proto\032\026OnlinePlayerI" +
      "nfo.proto\"\216\001\n(PlayerApplyEnterMpAfterMat" +
      "chAgreedNotify\022*\n\017src_player_info\030\013 \001(\0132" +
      "\021.OnlinePlayerInfo\022\026\n\016matchserver_id\030\n \001" +
      "(\r\022\036\n\nmatch_type\030\003 \001(\0162\n.MatchTypeB\036\n\034em" +
      "u.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.MatchTypeOuterClass.getDescriptor(),
          emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayerApplyEnterMpAfterMatchAgreedNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerApplyEnterMpAfterMatchAgreedNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerApplyEnterMpAfterMatchAgreedNotify_descriptor,
        new java.lang.String[] { "SrcPlayerInfo", "MatchserverId", "MatchType", });
    emu.grasscutter.net.oldproto.MatchTypeOuterClass.getDescriptor();
    emu.grasscutter.net.oldproto.OnlinePlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
