// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerNicknameAuditDataNotify.proto

package emu.grasscutter.net.newproto;

public final class PlayerNicknameAuditDataNotifyOuterClass {
  private PlayerNicknameAuditDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerNicknameAuditDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerNicknameAuditDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ContentAuditInfo info = 7;</code>
     * @return Whether the info field is set.
     */
    boolean hasInfo();
    /**
     * <code>.ContentAuditInfo info = 7;</code>
     * @return The info.
     */
    emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo getInfo();
    /**
     * <code>.ContentAuditInfo info = 7;</code>
     */
    emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfoOrBuilder getInfoOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 162;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerNicknameAuditDataNotify}
   */
  public static final class PlayerNicknameAuditDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerNicknameAuditDataNotify)
      PlayerNicknameAuditDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerNicknameAuditDataNotify.newBuilder() to construct.
    private PlayerNicknameAuditDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerNicknameAuditDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerNicknameAuditDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.internal_static_PlayerNicknameAuditDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.internal_static_PlayerNicknameAuditDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify.class, emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify.Builder.class);
    }

    public static final int INFO_FIELD_NUMBER = 7;
    private emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo info_;
    /**
     * <code>.ContentAuditInfo info = 7;</code>
     * @return Whether the info field is set.
     */
    @java.lang.Override
    public boolean hasInfo() {
      return info_ != null;
    }
    /**
     * <code>.ContentAuditInfo info = 7;</code>
     * @return The info.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo getInfo() {
      return info_ == null ? emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo.getDefaultInstance() : info_;
    }
    /**
     * <code>.ContentAuditInfo info = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfoOrBuilder getInfoOrBuilder() {
      return getInfo();
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
      if (info_ != null) {
        output.writeMessage(7, getInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (info_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getInfo());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify other = (emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify) obj;

      if (hasInfo() != other.hasInfo()) return false;
      if (hasInfo()) {
        if (!getInfo()
            .equals(other.getInfo())) return false;
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
      if (hasInfo()) {
        hash = (37 * hash) + INFO_FIELD_NUMBER;
        hash = (53 * hash) + getInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify prototype) {
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
     *   CMD_ID = 162;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerNicknameAuditDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerNicknameAuditDataNotify)
        emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.internal_static_PlayerNicknameAuditDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.internal_static_PlayerNicknameAuditDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify.class, emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (infoBuilder_ == null) {
          info_ = null;
        } else {
          info_ = null;
          infoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.internal_static_PlayerNicknameAuditDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify build() {
        emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify buildPartial() {
        emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify result = new emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify(this);
        if (infoBuilder_ == null) {
          result.info_ = info_;
        } else {
          result.info_ = infoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify other) {
        if (other == emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify.getDefaultInstance()) return this;
        if (other.hasInfo()) {
          mergeInfo(other.getInfo());
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
              case 58: {
                input.readMessage(
                    getInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 58
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

      private emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo info_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo, emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo.Builder, emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfoOrBuilder> infoBuilder_;
      /**
       * <code>.ContentAuditInfo info = 7;</code>
       * @return Whether the info field is set.
       */
      public boolean hasInfo() {
        return infoBuilder_ != null || info_ != null;
      }
      /**
       * <code>.ContentAuditInfo info = 7;</code>
       * @return The info.
       */
      public emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo getInfo() {
        if (infoBuilder_ == null) {
          return info_ == null ? emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo.getDefaultInstance() : info_;
        } else {
          return infoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ContentAuditInfo info = 7;</code>
       */
      public Builder setInfo(emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo value) {
        if (infoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          info_ = value;
          onChanged();
        } else {
          infoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ContentAuditInfo info = 7;</code>
       */
      public Builder setInfo(
          emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo.Builder builderForValue) {
        if (infoBuilder_ == null) {
          info_ = builderForValue.build();
          onChanged();
        } else {
          infoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ContentAuditInfo info = 7;</code>
       */
      public Builder mergeInfo(emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo value) {
        if (infoBuilder_ == null) {
          if (info_ != null) {
            info_ =
              emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo.newBuilder(info_).mergeFrom(value).buildPartial();
          } else {
            info_ = value;
          }
          onChanged();
        } else {
          infoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ContentAuditInfo info = 7;</code>
       */
      public Builder clearInfo() {
        if (infoBuilder_ == null) {
          info_ = null;
          onChanged();
        } else {
          info_ = null;
          infoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ContentAuditInfo info = 7;</code>
       */
      public emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo.Builder getInfoBuilder() {
        
        onChanged();
        return getInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ContentAuditInfo info = 7;</code>
       */
      public emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfoOrBuilder getInfoOrBuilder() {
        if (infoBuilder_ != null) {
          return infoBuilder_.getMessageOrBuilder();
        } else {
          return info_ == null ?
              emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo.getDefaultInstance() : info_;
        }
      }
      /**
       * <code>.ContentAuditInfo info = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo, emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo.Builder, emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfoOrBuilder> 
          getInfoFieldBuilder() {
        if (infoBuilder_ == null) {
          infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo, emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfo.Builder, emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.ContentAuditInfoOrBuilder>(
                  getInfo(),
                  getParentForChildren(),
                  isClean());
          info_ = null;
        }
        return infoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlayerNicknameAuditDataNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerNicknameAuditDataNotify)
    private static final emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify();
    }

    public static emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerNicknameAuditDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerNicknameAuditDataNotify>() {
      @java.lang.Override
      public PlayerNicknameAuditDataNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerNicknameAuditDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerNicknameAuditDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PlayerNicknameAuditDataNotifyOuterClass.PlayerNicknameAuditDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerNicknameAuditDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerNicknameAuditDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#PlayerNicknameAuditDataNotify.proto\032\026C" +
      "ontentAuditInfo.proto\"@\n\035PlayerNicknameA" +
      "uditDataNotify\022\037\n\004info\030\007 \001(\0132\021.ContentAu" +
      "ditInfoB\036\n\034emu.grasscutter.net.newprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayerNicknameAuditDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerNicknameAuditDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerNicknameAuditDataNotify_descriptor,
        new java.lang.String[] { "Info", });
    emu.grasscutter.net.newproto.ContentAuditInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
