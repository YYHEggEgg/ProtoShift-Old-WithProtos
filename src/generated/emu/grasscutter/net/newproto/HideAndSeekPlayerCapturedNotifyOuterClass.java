// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HideAndSeekPlayerCapturedNotify.proto

package emu.grasscutter.net.newproto;

public final class HideAndSeekPlayerCapturedNotifyOuterClass {
  private HideAndSeekPlayerCapturedNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HideAndSeekPlayerCapturedNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HideAndSeekPlayerCapturedNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 ghost_skill_id = 12;</code>
     * @return The ghostSkillId.
     */
    int getGhostSkillId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5580;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HideAndSeekPlayerCapturedNotify}
   */
  public static final class HideAndSeekPlayerCapturedNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HideAndSeekPlayerCapturedNotify)
      HideAndSeekPlayerCapturedNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HideAndSeekPlayerCapturedNotify.newBuilder() to construct.
    private HideAndSeekPlayerCapturedNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HideAndSeekPlayerCapturedNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HideAndSeekPlayerCapturedNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.internal_static_HideAndSeekPlayerCapturedNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.internal_static_HideAndSeekPlayerCapturedNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify.class, emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify.Builder.class);
    }

    public static final int GHOST_SKILL_ID_FIELD_NUMBER = 12;
    private int ghostSkillId_;
    /**
     * <code>uint32 ghost_skill_id = 12;</code>
     * @return The ghostSkillId.
     */
    @java.lang.Override
    public int getGhostSkillId() {
      return ghostSkillId_;
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
      if (ghostSkillId_ != 0) {
        output.writeUInt32(12, ghostSkillId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ghostSkillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, ghostSkillId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify other = (emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify) obj;

      if (getGhostSkillId()
          != other.getGhostSkillId()) return false;
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
      hash = (37 * hash) + GHOST_SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGhostSkillId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify prototype) {
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
     *   CMD_ID = 5580;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HideAndSeekPlayerCapturedNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HideAndSeekPlayerCapturedNotify)
        emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.internal_static_HideAndSeekPlayerCapturedNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.internal_static_HideAndSeekPlayerCapturedNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify.class, emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        ghostSkillId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.internal_static_HideAndSeekPlayerCapturedNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify build() {
        emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify buildPartial() {
        emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify result = new emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify(this);
        result.ghostSkillId_ = ghostSkillId_;
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
        if (other instanceof emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify other) {
        if (other == emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify.getDefaultInstance()) return this;
        if (other.getGhostSkillId() != 0) {
          setGhostSkillId(other.getGhostSkillId());
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
              case 96: {
                ghostSkillId_ = input.readUInt32();

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

      private int ghostSkillId_ ;
      /**
       * <code>uint32 ghost_skill_id = 12;</code>
       * @return The ghostSkillId.
       */
      @java.lang.Override
      public int getGhostSkillId() {
        return ghostSkillId_;
      }
      /**
       * <code>uint32 ghost_skill_id = 12;</code>
       * @param value The ghostSkillId to set.
       * @return This builder for chaining.
       */
      public Builder setGhostSkillId(int value) {
        
        ghostSkillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ghost_skill_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGhostSkillId() {
        
        ghostSkillId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HideAndSeekPlayerCapturedNotify)
    }

    // @@protoc_insertion_point(class_scope:HideAndSeekPlayerCapturedNotify)
    private static final emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify();
    }

    public static emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HideAndSeekPlayerCapturedNotify>
        PARSER = new com.google.protobuf.AbstractParser<HideAndSeekPlayerCapturedNotify>() {
      @java.lang.Override
      public HideAndSeekPlayerCapturedNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<HideAndSeekPlayerCapturedNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HideAndSeekPlayerCapturedNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.HideAndSeekPlayerCapturedNotifyOuterClass.HideAndSeekPlayerCapturedNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HideAndSeekPlayerCapturedNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HideAndSeekPlayerCapturedNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%HideAndSeekPlayerCapturedNotify.proto\"" +
      "9\n\037HideAndSeekPlayerCapturedNotify\022\026\n\016gh" +
      "ost_skill_id\030\014 \001(\rB\036\n\034emu.grasscutter.ne" +
      "t.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HideAndSeekPlayerCapturedNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HideAndSeekPlayerCapturedNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HideAndSeekPlayerCapturedNotify_descriptor,
        new java.lang.String[] { "GhostSkillId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
