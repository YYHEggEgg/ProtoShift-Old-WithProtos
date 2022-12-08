// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SealBattleEndNotify.proto

package emu.grasscutter.net.newproto;

public final class SealBattleEndNotifyOuterClass {
  private SealBattleEndNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SealBattleEndNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SealBattleEndNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 seal_entity_id = 11;</code>
     * @return The sealEntityId.
     */
    int getSealEntityId();

    /**
     * <code>bool is_win = 12;</code>
     * @return The isWin.
     */
    boolean getIsWin();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 277;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SealBattleEndNotify}
   */
  public static final class SealBattleEndNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SealBattleEndNotify)
      SealBattleEndNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SealBattleEndNotify.newBuilder() to construct.
    private SealBattleEndNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SealBattleEndNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SealBattleEndNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.internal_static_SealBattleEndNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.internal_static_SealBattleEndNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify.class, emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify.Builder.class);
    }

    public static final int SEAL_ENTITY_ID_FIELD_NUMBER = 11;
    private int sealEntityId_;
    /**
     * <code>uint32 seal_entity_id = 11;</code>
     * @return The sealEntityId.
     */
    @java.lang.Override
    public int getSealEntityId() {
      return sealEntityId_;
    }

    public static final int IS_WIN_FIELD_NUMBER = 12;
    private boolean isWin_;
    /**
     * <code>bool is_win = 12;</code>
     * @return The isWin.
     */
    @java.lang.Override
    public boolean getIsWin() {
      return isWin_;
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
      if (sealEntityId_ != 0) {
        output.writeUInt32(11, sealEntityId_);
      }
      if (isWin_ != false) {
        output.writeBool(12, isWin_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sealEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, sealEntityId_);
      }
      if (isWin_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isWin_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify other = (emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify) obj;

      if (getSealEntityId()
          != other.getSealEntityId()) return false;
      if (getIsWin()
          != other.getIsWin()) return false;
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
      hash = (37 * hash) + SEAL_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSealEntityId();
      hash = (37 * hash) + IS_WIN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsWin());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify prototype) {
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
     *   CMD_ID = 277;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SealBattleEndNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SealBattleEndNotify)
        emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.internal_static_SealBattleEndNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.internal_static_SealBattleEndNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify.class, emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        sealEntityId_ = 0;

        isWin_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.internal_static_SealBattleEndNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify build() {
        emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify buildPartial() {
        emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify result = new emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify(this);
        result.sealEntityId_ = sealEntityId_;
        result.isWin_ = isWin_;
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
        if (other instanceof emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify other) {
        if (other == emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify.getDefaultInstance()) return this;
        if (other.getSealEntityId() != 0) {
          setSealEntityId(other.getSealEntityId());
        }
        if (other.getIsWin() != false) {
          setIsWin(other.getIsWin());
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
              case 88: {
                sealEntityId_ = input.readUInt32();

                break;
              } // case 88
              case 96: {
                isWin_ = input.readBool();

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

      private int sealEntityId_ ;
      /**
       * <code>uint32 seal_entity_id = 11;</code>
       * @return The sealEntityId.
       */
      @java.lang.Override
      public int getSealEntityId() {
        return sealEntityId_;
      }
      /**
       * <code>uint32 seal_entity_id = 11;</code>
       * @param value The sealEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setSealEntityId(int value) {
        
        sealEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 seal_entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSealEntityId() {
        
        sealEntityId_ = 0;
        onChanged();
        return this;
      }

      private boolean isWin_ ;
      /**
       * <code>bool is_win = 12;</code>
       * @return The isWin.
       */
      @java.lang.Override
      public boolean getIsWin() {
        return isWin_;
      }
      /**
       * <code>bool is_win = 12;</code>
       * @param value The isWin to set.
       * @return This builder for chaining.
       */
      public Builder setIsWin(boolean value) {
        
        isWin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_win = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsWin() {
        
        isWin_ = false;
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


      // @@protoc_insertion_point(builder_scope:SealBattleEndNotify)
    }

    // @@protoc_insertion_point(class_scope:SealBattleEndNotify)
    private static final emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify();
    }

    public static emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SealBattleEndNotify>
        PARSER = new com.google.protobuf.AbstractParser<SealBattleEndNotify>() {
      @java.lang.Override
      public SealBattleEndNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SealBattleEndNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SealBattleEndNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SealBattleEndNotifyOuterClass.SealBattleEndNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SealBattleEndNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SealBattleEndNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031SealBattleEndNotify.proto\"=\n\023SealBattl" +
      "eEndNotify\022\026\n\016seal_entity_id\030\013 \001(\r\022\016\n\006is" +
      "_win\030\014 \001(\010B\036\n\034emu.grasscutter.net.newpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SealBattleEndNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SealBattleEndNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SealBattleEndNotify_descriptor,
        new java.lang.String[] { "SealEntityId", "IsWin", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
