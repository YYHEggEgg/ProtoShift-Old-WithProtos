// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerDailyRewardProgressChangeNotify.proto

package emu.grasscutter.net.newproto;

public final class TowerDailyRewardProgressChangeNotifyOuterClass {
  private TowerDailyRewardProgressChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerDailyRewardProgressChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerDailyRewardProgressChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_OHCHCJGJIDK = 8;</code>
     * @return The unk3300OHCHCJGJIDK.
     */
    int getUnk3300OHCHCJGJIDK();

    /**
     * <code>uint32 Unk3300_JBACKENDHDG = 6;</code>
     * @return The unk3300JBACKENDHDG.
     */
    int getUnk3300JBACKENDHDG();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2419;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code TowerDailyRewardProgressChangeNotify}
   */
  public static final class TowerDailyRewardProgressChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerDailyRewardProgressChangeNotify)
      TowerDailyRewardProgressChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerDailyRewardProgressChangeNotify.newBuilder() to construct.
    private TowerDailyRewardProgressChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerDailyRewardProgressChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerDailyRewardProgressChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.class, emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.Builder.class);
    }

    public static final int UNK3300_OHCHCJGJIDK_FIELD_NUMBER = 8;
    private int unk3300OHCHCJGJIDK_;
    /**
     * <code>uint32 Unk3300_OHCHCJGJIDK = 8;</code>
     * @return The unk3300OHCHCJGJIDK.
     */
    @java.lang.Override
    public int getUnk3300OHCHCJGJIDK() {
      return unk3300OHCHCJGJIDK_;
    }

    public static final int UNK3300_JBACKENDHDG_FIELD_NUMBER = 6;
    private int unk3300JBACKENDHDG_;
    /**
     * <code>uint32 Unk3300_JBACKENDHDG = 6;</code>
     * @return The unk3300JBACKENDHDG.
     */
    @java.lang.Override
    public int getUnk3300JBACKENDHDG() {
      return unk3300JBACKENDHDG_;
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
      if (unk3300JBACKENDHDG_ != 0) {
        output.writeUInt32(6, unk3300JBACKENDHDG_);
      }
      if (unk3300OHCHCJGJIDK_ != 0) {
        output.writeUInt32(8, unk3300OHCHCJGJIDK_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300JBACKENDHDG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk3300JBACKENDHDG_);
      }
      if (unk3300OHCHCJGJIDK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3300OHCHCJGJIDK_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify other = (emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify) obj;

      if (getUnk3300OHCHCJGJIDK()
          != other.getUnk3300OHCHCJGJIDK()) return false;
      if (getUnk3300JBACKENDHDG()
          != other.getUnk3300JBACKENDHDG()) return false;
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
      hash = (37 * hash) + UNK3300_OHCHCJGJIDK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300OHCHCJGJIDK();
      hash = (37 * hash) + UNK3300_JBACKENDHDG_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300JBACKENDHDG();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify prototype) {
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
     *   CMD_ID = 2419;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code TowerDailyRewardProgressChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerDailyRewardProgressChangeNotify)
        emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.class, emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3300OHCHCJGJIDK_ = 0;

        unk3300JBACKENDHDG_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify build() {
        emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify buildPartial() {
        emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify result = new emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify(this);
        result.unk3300OHCHCJGJIDK_ = unk3300OHCHCJGJIDK_;
        result.unk3300JBACKENDHDG_ = unk3300JBACKENDHDG_;
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
        if (other instanceof emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify other) {
        if (other == emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.getDefaultInstance()) return this;
        if (other.getUnk3300OHCHCJGJIDK() != 0) {
          setUnk3300OHCHCJGJIDK(other.getUnk3300OHCHCJGJIDK());
        }
        if (other.getUnk3300JBACKENDHDG() != 0) {
          setUnk3300JBACKENDHDG(other.getUnk3300JBACKENDHDG());
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
                unk3300JBACKENDHDG_ = input.readUInt32();

                break;
              } // case 48
              case 64: {
                unk3300OHCHCJGJIDK_ = input.readUInt32();

                break;
              } // case 64
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

      private int unk3300OHCHCJGJIDK_ ;
      /**
       * <code>uint32 Unk3300_OHCHCJGJIDK = 8;</code>
       * @return The unk3300OHCHCJGJIDK.
       */
      @java.lang.Override
      public int getUnk3300OHCHCJGJIDK() {
        return unk3300OHCHCJGJIDK_;
      }
      /**
       * <code>uint32 Unk3300_OHCHCJGJIDK = 8;</code>
       * @param value The unk3300OHCHCJGJIDK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300OHCHCJGJIDK(int value) {
        
        unk3300OHCHCJGJIDK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_OHCHCJGJIDK = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300OHCHCJGJIDK() {
        
        unk3300OHCHCJGJIDK_ = 0;
        onChanged();
        return this;
      }

      private int unk3300JBACKENDHDG_ ;
      /**
       * <code>uint32 Unk3300_JBACKENDHDG = 6;</code>
       * @return The unk3300JBACKENDHDG.
       */
      @java.lang.Override
      public int getUnk3300JBACKENDHDG() {
        return unk3300JBACKENDHDG_;
      }
      /**
       * <code>uint32 Unk3300_JBACKENDHDG = 6;</code>
       * @param value The unk3300JBACKENDHDG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300JBACKENDHDG(int value) {
        
        unk3300JBACKENDHDG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_JBACKENDHDG = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300JBACKENDHDG() {
        
        unk3300JBACKENDHDG_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TowerDailyRewardProgressChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:TowerDailyRewardProgressChangeNotify)
    private static final emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify();
    }

    public static emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerDailyRewardProgressChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<TowerDailyRewardProgressChangeNotify>() {
      @java.lang.Override
      public TowerDailyRewardProgressChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<TowerDailyRewardProgressChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerDailyRewardProgressChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerDailyRewardProgressChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerDailyRewardProgressChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*TowerDailyRewardProgressChangeNotify.p" +
      "roto\"`\n$TowerDailyRewardProgressChangeNo" +
      "tify\022\033\n\023Unk3300_OHCHCJGJIDK\030\010 \001(\r\022\033\n\023Unk" +
      "3300_JBACKENDHDG\030\006 \001(\rB\036\n\034emu.grasscutte" +
      "r.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TowerDailyRewardProgressChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerDailyRewardProgressChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerDailyRewardProgressChangeNotify_descriptor,
        new java.lang.String[] { "Unk3300OHCHCJGJIDK", "Unk3300JBACKENDHDG", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
