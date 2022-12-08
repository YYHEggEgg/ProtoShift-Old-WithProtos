// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterIrodoriChessDungeonRsp.proto

package emu.grasscutter.net.newproto;

public final class EnterIrodoriChessDungeonRspOuterClass {
  private EnterIrodoriChessDungeonRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterIrodoriChessDungeonRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterIrodoriChessDungeonRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_hard_map = 5;</code>
     * @return The isHardMap.
     */
    boolean getIsHardMap();

    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    int getLevelId();

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
   *   CMD_ID = 8238;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EnterIrodoriChessDungeonRsp}
   */
  public static final class EnterIrodoriChessDungeonRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterIrodoriChessDungeonRsp)
      EnterIrodoriChessDungeonRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterIrodoriChessDungeonRsp.newBuilder() to construct.
    private EnterIrodoriChessDungeonRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterIrodoriChessDungeonRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterIrodoriChessDungeonRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.internal_static_EnterIrodoriChessDungeonRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.internal_static_EnterIrodoriChessDungeonRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.class, emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.Builder.class);
    }

    public static final int IS_HARD_MAP_FIELD_NUMBER = 5;
    private boolean isHardMap_;
    /**
     * <code>bool is_hard_map = 5;</code>
     * @return The isHardMap.
     */
    @java.lang.Override
    public boolean getIsHardMap() {
      return isHardMap_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 15;
    private int levelId_;
    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      if (isHardMap_ != false) {
        output.writeBool(5, isHardMap_);
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(15, levelId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isHardMap_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isHardMap_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp other = (emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp) obj;

      if (getIsHardMap()
          != other.getIsHardMap()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + IS_HARD_MAP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHardMap());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp prototype) {
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
     *   CMD_ID = 8238;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EnterIrodoriChessDungeonRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterIrodoriChessDungeonRsp)
        emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.internal_static_EnterIrodoriChessDungeonRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.internal_static_EnterIrodoriChessDungeonRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.class, emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isHardMap_ = false;

        levelId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.internal_static_EnterIrodoriChessDungeonRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp build() {
        emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp buildPartial() {
        emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp result = new emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp(this);
        result.isHardMap_ = isHardMap_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp other) {
        if (other == emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp.getDefaultInstance()) return this;
        if (other.getIsHardMap() != false) {
          setIsHardMap(other.getIsHardMap());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
              case 40: {
                isHardMap_ = input.readBool();

                break;
              } // case 40
              case 64: {
                retcode_ = input.readInt32();

                break;
              } // case 64
              case 120: {
                levelId_ = input.readUInt32();

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

      private boolean isHardMap_ ;
      /**
       * <code>bool is_hard_map = 5;</code>
       * @return The isHardMap.
       */
      @java.lang.Override
      public boolean getIsHardMap() {
        return isHardMap_;
      }
      /**
       * <code>bool is_hard_map = 5;</code>
       * @param value The isHardMap to set.
       * @return This builder for chaining.
       */
      public Builder setIsHardMap(boolean value) {
        
        isHardMap_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_hard_map = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHardMap() {
        
        isHardMap_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 15;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EnterIrodoriChessDungeonRsp)
    }

    // @@protoc_insertion_point(class_scope:EnterIrodoriChessDungeonRsp)
    private static final emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp();
    }

    public static emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterIrodoriChessDungeonRsp>
        PARSER = new com.google.protobuf.AbstractParser<EnterIrodoriChessDungeonRsp>() {
      @java.lang.Override
      public EnterIrodoriChessDungeonRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<EnterIrodoriChessDungeonRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterIrodoriChessDungeonRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.EnterIrodoriChessDungeonRspOuterClass.EnterIrodoriChessDungeonRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterIrodoriChessDungeonRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterIrodoriChessDungeonRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!EnterIrodoriChessDungeonRsp.proto\"U\n\033E" +
      "nterIrodoriChessDungeonRsp\022\023\n\013is_hard_ma" +
      "p\030\005 \001(\010\022\020\n\010level_id\030\017 \001(\r\022\017\n\007retcode\030\010 \001" +
      "(\005B\036\n\034emu.grasscutter.net.newprotob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterIrodoriChessDungeonRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterIrodoriChessDungeonRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterIrodoriChessDungeonRsp_descriptor,
        new java.lang.String[] { "IsHardMap", "LevelId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
