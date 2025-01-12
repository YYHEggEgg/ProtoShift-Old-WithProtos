// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SingleStartBrickBreakerRsp.proto

package emu.grasscutter.net.newproto;

public final class SingleStartBrickBreakerRspOuterClass {
  private SingleStartBrickBreakerRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SingleStartBrickBreakerRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SingleStartBrickBreakerRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_dungeon = 9;</code>
     * @return The isDungeon.
     */
    boolean getIsDungeon();

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 20712;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SingleStartBrickBreakerRsp}
   */
  public static final class SingleStartBrickBreakerRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SingleStartBrickBreakerRsp)
      SingleStartBrickBreakerRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SingleStartBrickBreakerRsp.newBuilder() to construct.
    private SingleStartBrickBreakerRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SingleStartBrickBreakerRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SingleStartBrickBreakerRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.internal_static_SingleStartBrickBreakerRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.internal_static_SingleStartBrickBreakerRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp.class, emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 10;
    private int levelId_;
    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_DUNGEON_FIELD_NUMBER = 9;
    private boolean isDungeon_;
    /**
     * <code>bool is_dungeon = 9;</code>
     * @return The isDungeon.
     */
    @java.lang.Override
    public boolean getIsDungeon() {
      return isDungeon_;
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
        output.writeInt32(8, retcode_);
      }
      if (isDungeon_ != false) {
        output.writeBool(9, isDungeon_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(10, levelId_);
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
          .computeInt32Size(8, retcode_);
      }
      if (isDungeon_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isDungeon_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp other = (emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsDungeon()
          != other.getIsDungeon()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_DUNGEON_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsDungeon());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp prototype) {
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
     *   CMD_ID = 20712;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SingleStartBrickBreakerRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SingleStartBrickBreakerRsp)
        emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.internal_static_SingleStartBrickBreakerRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.internal_static_SingleStartBrickBreakerRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp.class, emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        levelId_ = 0;

        isDungeon_ = false;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.internal_static_SingleStartBrickBreakerRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp build() {
        emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp buildPartial() {
        emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp result = new emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp(this);
        result.levelId_ = levelId_;
        result.isDungeon_ = isDungeon_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp other) {
        if (other == emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsDungeon() != false) {
          setIsDungeon(other.getIsDungeon());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 64: {
                retcode_ = input.readInt32();

                break;
              } // case 64
              case 72: {
                isDungeon_ = input.readBool();

                break;
              } // case 72
              case 80: {
                levelId_ = input.readUInt32();

                break;
              } // case 80
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

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 10;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isDungeon_ ;
      /**
       * <code>bool is_dungeon = 9;</code>
       * @return The isDungeon.
       */
      @java.lang.Override
      public boolean getIsDungeon() {
        return isDungeon_;
      }
      /**
       * <code>bool is_dungeon = 9;</code>
       * @param value The isDungeon to set.
       * @return This builder for chaining.
       */
      public Builder setIsDungeon(boolean value) {
        
        isDungeon_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_dungeon = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsDungeon() {
        
        isDungeon_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SingleStartBrickBreakerRsp)
    }

    // @@protoc_insertion_point(class_scope:SingleStartBrickBreakerRsp)
    private static final emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp();
    }

    public static emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SingleStartBrickBreakerRsp>
        PARSER = new com.google.protobuf.AbstractParser<SingleStartBrickBreakerRsp>() {
      @java.lang.Override
      public SingleStartBrickBreakerRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<SingleStartBrickBreakerRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SingleStartBrickBreakerRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SingleStartBrickBreakerRspOuterClass.SingleStartBrickBreakerRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SingleStartBrickBreakerRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SingleStartBrickBreakerRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n SingleStartBrickBreakerRsp.proto\"S\n\032Si" +
      "ngleStartBrickBreakerRsp\022\020\n\010level_id\030\n \001" +
      "(\r\022\022\n\nis_dungeon\030\t \001(\010\022\017\n\007retcode\030\010 \001(\005B" +
      "\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SingleStartBrickBreakerRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SingleStartBrickBreakerRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SingleStartBrickBreakerRsp_descriptor,
        new java.lang.String[] { "LevelId", "IsDungeon", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
