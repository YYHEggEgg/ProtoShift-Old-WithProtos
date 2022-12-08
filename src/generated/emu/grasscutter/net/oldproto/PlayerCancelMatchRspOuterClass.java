// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerCancelMatchRsp.proto

package emu.grasscutter.net.oldproto;

public final class PlayerCancelMatchRspOuterClass {
  private PlayerCancelMatchRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerCancelMatchRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerCancelMatchRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.MatchType match_type = 7;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    int getMatchTypeValue();
    /**
     * <code>.MatchType match_type = 7;</code>
     * @return The matchType.
     */
    emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType getMatchType();
  }
  /**
   * <pre>
   * CmdId: 4152
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code PlayerCancelMatchRsp}
   */
  public static final class PlayerCancelMatchRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerCancelMatchRsp)
      PlayerCancelMatchRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerCancelMatchRsp.newBuilder() to construct.
    private PlayerCancelMatchRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerCancelMatchRsp() {
      matchType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerCancelMatchRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.internal_static_PlayerCancelMatchRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.internal_static_PlayerCancelMatchRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp.class, emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int MATCH_TYPE_FIELD_NUMBER = 7;
    private int matchType_;
    /**
     * <code>.MatchType match_type = 7;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    @java.lang.Override public int getMatchTypeValue() {
      return matchType_;
    }
    /**
     * <code>.MatchType match_type = 7;</code>
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
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (matchType_ != emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        output.writeEnum(7, matchType_);
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
          .computeInt32Size(6, retcode_);
      }
      if (matchType_ != emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, matchType_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp other = (emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + MATCH_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + matchType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp prototype) {
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
     * CmdId: 4152
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code PlayerCancelMatchRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerCancelMatchRsp)
        emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.internal_static_PlayerCancelMatchRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.internal_static_PlayerCancelMatchRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp.class, emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        matchType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.internal_static_PlayerCancelMatchRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp build() {
        emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp buildPartial() {
        emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp result = new emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp(this);
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp other) {
        if (other == emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 48: {
                retcode_ = input.readInt32();

                break;
              } // case 48
              case 56: {
                matchType_ = input.readEnum();

                break;
              } // case 56
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int matchType_ = 0;
      /**
       * <code>.MatchType match_type = 7;</code>
       * @return The enum numeric value on the wire for matchType.
       */
      @java.lang.Override public int getMatchTypeValue() {
        return matchType_;
      }
      /**
       * <code>.MatchType match_type = 7;</code>
       * @param value The enum numeric value on the wire for matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchTypeValue(int value) {
        
        matchType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 7;</code>
       * @return The matchType.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType getMatchType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType result = emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
        return result == null ? emu.grasscutter.net.oldproto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
      }
      /**
       * <code>.MatchType match_type = 7;</code>
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
       * <code>.MatchType match_type = 7;</code>
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


      // @@protoc_insertion_point(builder_scope:PlayerCancelMatchRsp)
    }

    // @@protoc_insertion_point(class_scope:PlayerCancelMatchRsp)
    private static final emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp();
    }

    public static emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerCancelMatchRsp>
        PARSER = new com.google.protobuf.AbstractParser<PlayerCancelMatchRsp>() {
      @java.lang.Override
      public PlayerCancelMatchRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerCancelMatchRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerCancelMatchRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.PlayerCancelMatchRspOuterClass.PlayerCancelMatchRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerCancelMatchRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerCancelMatchRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032PlayerCancelMatchRsp.proto\032\017MatchType." +
      "proto\"G\n\024PlayerCancelMatchRsp\022\017\n\007retcode" +
      "\030\006 \001(\005\022\036\n\nmatch_type\030\007 \001(\0162\n.MatchTypeB\036" +
      "\n\034emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.MatchTypeOuterClass.getDescriptor(),
        });
    internal_static_PlayerCancelMatchRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerCancelMatchRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerCancelMatchRsp_descriptor,
        new java.lang.String[] { "Retcode", "MatchType", });
    emu.grasscutter.net.oldproto.MatchTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
