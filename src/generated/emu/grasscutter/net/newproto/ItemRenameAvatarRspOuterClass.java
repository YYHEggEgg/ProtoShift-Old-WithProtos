// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ItemRenameAvatarRsp.proto

package emu.grasscutter.net.newproto;

public final class ItemRenameAvatarRspOuterClass {
  private ItemRenameAvatarRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ItemRenameAvatarRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ItemRenameAvatarRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 cd_time = 5;</code>
     * @return The cdTime.
     */
    int getCdTime();

    /**
     * <code>uint32 rename_id = 8;</code>
     * @return The renameId.
     */
    int getRenameId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1700;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ItemRenameAvatarRsp}
   */
  public static final class ItemRenameAvatarRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ItemRenameAvatarRsp)
      ItemRenameAvatarRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ItemRenameAvatarRsp.newBuilder() to construct.
    private ItemRenameAvatarRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ItemRenameAvatarRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ItemRenameAvatarRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.internal_static_ItemRenameAvatarRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.internal_static_ItemRenameAvatarRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp.class, emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CD_TIME_FIELD_NUMBER = 5;
    private int cdTime_;
    /**
     * <code>uint32 cd_time = 5;</code>
     * @return The cdTime.
     */
    @java.lang.Override
    public int getCdTime() {
      return cdTime_;
    }

    public static final int RENAME_ID_FIELD_NUMBER = 8;
    private int renameId_;
    /**
     * <code>uint32 rename_id = 8;</code>
     * @return The renameId.
     */
    @java.lang.Override
    public int getRenameId() {
      return renameId_;
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
      if (cdTime_ != 0) {
        output.writeUInt32(5, cdTime_);
      }
      if (renameId_ != 0) {
        output.writeUInt32(8, renameId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cdTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, cdTime_);
      }
      if (renameId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, renameId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp other = (emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getCdTime()
          != other.getCdTime()) return false;
      if (getRenameId()
          != other.getRenameId()) return false;
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
      hash = (37 * hash) + CD_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCdTime();
      hash = (37 * hash) + RENAME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRenameId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp prototype) {
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
     *   CMD_ID = 1700;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ItemRenameAvatarRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ItemRenameAvatarRsp)
        emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.internal_static_ItemRenameAvatarRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.internal_static_ItemRenameAvatarRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp.class, emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp.newBuilder()
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

        cdTime_ = 0;

        renameId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.internal_static_ItemRenameAvatarRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp build() {
        emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp buildPartial() {
        emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp result = new emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp(this);
        result.retcode_ = retcode_;
        result.cdTime_ = cdTime_;
        result.renameId_ = renameId_;
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
        if (other instanceof emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp other) {
        if (other == emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getCdTime() != 0) {
          setCdTime(other.getCdTime());
        }
        if (other.getRenameId() != 0) {
          setRenameId(other.getRenameId());
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
                cdTime_ = input.readUInt32();

                break;
              } // case 40
              case 64: {
                renameId_ = input.readUInt32();

                break;
              } // case 64
              case 112: {
                retcode_ = input.readInt32();

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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int cdTime_ ;
      /**
       * <code>uint32 cd_time = 5;</code>
       * @return The cdTime.
       */
      @java.lang.Override
      public int getCdTime() {
        return cdTime_;
      }
      /**
       * <code>uint32 cd_time = 5;</code>
       * @param value The cdTime to set.
       * @return This builder for chaining.
       */
      public Builder setCdTime(int value) {
        
        cdTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cd_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCdTime() {
        
        cdTime_ = 0;
        onChanged();
        return this;
      }

      private int renameId_ ;
      /**
       * <code>uint32 rename_id = 8;</code>
       * @return The renameId.
       */
      @java.lang.Override
      public int getRenameId() {
        return renameId_;
      }
      /**
       * <code>uint32 rename_id = 8;</code>
       * @param value The renameId to set.
       * @return This builder for chaining.
       */
      public Builder setRenameId(int value) {
        
        renameId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rename_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRenameId() {
        
        renameId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ItemRenameAvatarRsp)
    }

    // @@protoc_insertion_point(class_scope:ItemRenameAvatarRsp)
    private static final emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp();
    }

    public static emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ItemRenameAvatarRsp>
        PARSER = new com.google.protobuf.AbstractParser<ItemRenameAvatarRsp>() {
      @java.lang.Override
      public ItemRenameAvatarRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<ItemRenameAvatarRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ItemRenameAvatarRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ItemRenameAvatarRspOuterClass.ItemRenameAvatarRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ItemRenameAvatarRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ItemRenameAvatarRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ItemRenameAvatarRsp.proto\"J\n\023ItemRenam" +
      "eAvatarRsp\022\017\n\007retcode\030\016 \001(\005\022\017\n\007cd_time\030\005" +
      " \001(\r\022\021\n\trename_id\030\010 \001(\rB\036\n\034emu.grasscutt" +
      "er.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ItemRenameAvatarRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ItemRenameAvatarRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ItemRenameAvatarRsp_descriptor,
        new java.lang.String[] { "Retcode", "CdTime", "RenameId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
