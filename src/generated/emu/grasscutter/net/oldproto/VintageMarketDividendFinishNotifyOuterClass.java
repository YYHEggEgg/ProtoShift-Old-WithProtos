// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageMarketDividendFinishNotify.proto

package emu.grasscutter.net.oldproto;

public final class VintageMarketDividendFinishNotifyOuterClass {
  private VintageMarketDividendFinishNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageMarketDividendFinishNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageMarketDividendFinishNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 coin_a = 5;</code>
     * @return The coinA.
     */
    int getCoinA();

    /**
     * <code>uint32 coin_c = 11;</code>
     * @return The coinC.
     */
    int getCoinC();
  }
  /**
   * <pre>
   * CmdId: 23147
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code VintageMarketDividendFinishNotify}
   */
  public static final class VintageMarketDividendFinishNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageMarketDividendFinishNotify)
      VintageMarketDividendFinishNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageMarketDividendFinishNotify.newBuilder() to construct.
    private VintageMarketDividendFinishNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageMarketDividendFinishNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageMarketDividendFinishNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.internal_static_VintageMarketDividendFinishNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.internal_static_VintageMarketDividendFinishNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify.class, emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify.Builder.class);
    }

    public static final int COIN_A_FIELD_NUMBER = 5;
    private int coinA_;
    /**
     * <code>uint32 coin_a = 5;</code>
     * @return The coinA.
     */
    @java.lang.Override
    public int getCoinA() {
      return coinA_;
    }

    public static final int COIN_C_FIELD_NUMBER = 11;
    private int coinC_;
    /**
     * <code>uint32 coin_c = 11;</code>
     * @return The coinC.
     */
    @java.lang.Override
    public int getCoinC() {
      return coinC_;
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
      if (coinA_ != 0) {
        output.writeUInt32(5, coinA_);
      }
      if (coinC_ != 0) {
        output.writeUInt32(11, coinC_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (coinA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, coinA_);
      }
      if (coinC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, coinC_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify other = (emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify) obj;

      if (getCoinA()
          != other.getCoinA()) return false;
      if (getCoinC()
          != other.getCoinC()) return false;
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
      hash = (37 * hash) + COIN_A_FIELD_NUMBER;
      hash = (53 * hash) + getCoinA();
      hash = (37 * hash) + COIN_C_FIELD_NUMBER;
      hash = (53 * hash) + getCoinC();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify prototype) {
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
     * CmdId: 23147
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code VintageMarketDividendFinishNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageMarketDividendFinishNotify)
        emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.internal_static_VintageMarketDividendFinishNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.internal_static_VintageMarketDividendFinishNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify.class, emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        coinA_ = 0;

        coinC_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.internal_static_VintageMarketDividendFinishNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify build() {
        emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify buildPartial() {
        emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify result = new emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify(this);
        result.coinA_ = coinA_;
        result.coinC_ = coinC_;
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
        if (other instanceof emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify other) {
        if (other == emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify.getDefaultInstance()) return this;
        if (other.getCoinA() != 0) {
          setCoinA(other.getCoinA());
        }
        if (other.getCoinC() != 0) {
          setCoinC(other.getCoinC());
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
                coinA_ = input.readUInt32();

                break;
              } // case 40
              case 88: {
                coinC_ = input.readUInt32();

                break;
              } // case 88
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

      private int coinA_ ;
      /**
       * <code>uint32 coin_a = 5;</code>
       * @return The coinA.
       */
      @java.lang.Override
      public int getCoinA() {
        return coinA_;
      }
      /**
       * <code>uint32 coin_a = 5;</code>
       * @param value The coinA to set.
       * @return This builder for chaining.
       */
      public Builder setCoinA(int value) {
        
        coinA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin_a = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoinA() {
        
        coinA_ = 0;
        onChanged();
        return this;
      }

      private int coinC_ ;
      /**
       * <code>uint32 coin_c = 11;</code>
       * @return The coinC.
       */
      @java.lang.Override
      public int getCoinC() {
        return coinC_;
      }
      /**
       * <code>uint32 coin_c = 11;</code>
       * @param value The coinC to set.
       * @return This builder for chaining.
       */
      public Builder setCoinC(int value) {
        
        coinC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin_c = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoinC() {
        
        coinC_ = 0;
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


      // @@protoc_insertion_point(builder_scope:VintageMarketDividendFinishNotify)
    }

    // @@protoc_insertion_point(class_scope:VintageMarketDividendFinishNotify)
    private static final emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify();
    }

    public static emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageMarketDividendFinishNotify>
        PARSER = new com.google.protobuf.AbstractParser<VintageMarketDividendFinishNotify>() {
      @java.lang.Override
      public VintageMarketDividendFinishNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<VintageMarketDividendFinishNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageMarketDividendFinishNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.VintageMarketDividendFinishNotifyOuterClass.VintageMarketDividendFinishNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageMarketDividendFinishNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageMarketDividendFinishNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'VintageMarketDividendFinishNotify.prot" +
      "o\"C\n!VintageMarketDividendFinishNotify\022\016" +
      "\n\006coin_a\030\005 \001(\r\022\016\n\006coin_c\030\013 \001(\rB\036\n\034emu.gr" +
      "asscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageMarketDividendFinishNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageMarketDividendFinishNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageMarketDividendFinishNotify_descriptor,
        new java.lang.String[] { "CoinA", "CoinC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
