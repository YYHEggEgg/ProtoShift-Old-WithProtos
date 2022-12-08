// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusEscapeMonsterNotify.proto

package emu.grasscutter.net.newproto;

public final class InBattleMechanicusEscapeMonsterNotifyOuterClass {
  private InBattleMechanicusEscapeMonsterNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InBattleMechanicusEscapeMonsterNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InBattleMechanicusEscapeMonsterNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 escaped_monster_num = 15;</code>
     * @return The escapedMonsterNum.
     */
    int getEscapedMonsterNum();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5400;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code InBattleMechanicusEscapeMonsterNotify}
   */
  public static final class InBattleMechanicusEscapeMonsterNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InBattleMechanicusEscapeMonsterNotify)
      InBattleMechanicusEscapeMonsterNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleMechanicusEscapeMonsterNotify.newBuilder() to construct.
    private InBattleMechanicusEscapeMonsterNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleMechanicusEscapeMonsterNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleMechanicusEscapeMonsterNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.internal_static_InBattleMechanicusEscapeMonsterNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.internal_static_InBattleMechanicusEscapeMonsterNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify.class, emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify.Builder.class);
    }

    public static final int ESCAPED_MONSTER_NUM_FIELD_NUMBER = 15;
    private int escapedMonsterNum_;
    /**
     * <code>uint32 escaped_monster_num = 15;</code>
     * @return The escapedMonsterNum.
     */
    @java.lang.Override
    public int getEscapedMonsterNum() {
      return escapedMonsterNum_;
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
      if (escapedMonsterNum_ != 0) {
        output.writeUInt32(15, escapedMonsterNum_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (escapedMonsterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, escapedMonsterNum_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify other = (emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify) obj;

      if (getEscapedMonsterNum()
          != other.getEscapedMonsterNum()) return false;
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
      hash = (37 * hash) + ESCAPED_MONSTER_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getEscapedMonsterNum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify prototype) {
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
     *   CMD_ID = 5400;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code InBattleMechanicusEscapeMonsterNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleMechanicusEscapeMonsterNotify)
        emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.internal_static_InBattleMechanicusEscapeMonsterNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.internal_static_InBattleMechanicusEscapeMonsterNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify.class, emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        escapedMonsterNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.internal_static_InBattleMechanicusEscapeMonsterNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify build() {
        emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify buildPartial() {
        emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify result = new emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify(this);
        result.escapedMonsterNum_ = escapedMonsterNum_;
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
        if (other instanceof emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify other) {
        if (other == emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify.getDefaultInstance()) return this;
        if (other.getEscapedMonsterNum() != 0) {
          setEscapedMonsterNum(other.getEscapedMonsterNum());
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
              case 120: {
                escapedMonsterNum_ = input.readUInt32();

                break;
              } // case 120
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

      private int escapedMonsterNum_ ;
      /**
       * <code>uint32 escaped_monster_num = 15;</code>
       * @return The escapedMonsterNum.
       */
      @java.lang.Override
      public int getEscapedMonsterNum() {
        return escapedMonsterNum_;
      }
      /**
       * <code>uint32 escaped_monster_num = 15;</code>
       * @param value The escapedMonsterNum to set.
       * @return This builder for chaining.
       */
      public Builder setEscapedMonsterNum(int value) {
        
        escapedMonsterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 escaped_monster_num = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearEscapedMonsterNum() {
        
        escapedMonsterNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InBattleMechanicusEscapeMonsterNotify)
    }

    // @@protoc_insertion_point(class_scope:InBattleMechanicusEscapeMonsterNotify)
    private static final emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify();
    }

    public static emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InBattleMechanicusEscapeMonsterNotify>
        PARSER = new com.google.protobuf.AbstractParser<InBattleMechanicusEscapeMonsterNotify>() {
      @java.lang.Override
      public InBattleMechanicusEscapeMonsterNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<InBattleMechanicusEscapeMonsterNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleMechanicusEscapeMonsterNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.InBattleMechanicusEscapeMonsterNotifyOuterClass.InBattleMechanicusEscapeMonsterNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleMechanicusEscapeMonsterNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleMechanicusEscapeMonsterNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+InBattleMechanicusEscapeMonsterNotify." +
      "proto\"D\n%InBattleMechanicusEscapeMonster" +
      "Notify\022\033\n\023escaped_monster_num\030\017 \001(\rB\036\n\034e" +
      "mu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InBattleMechanicusEscapeMonsterNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InBattleMechanicusEscapeMonsterNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleMechanicusEscapeMonsterNotify_descriptor,
        new java.lang.String[] { "EscapedMonsterNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
