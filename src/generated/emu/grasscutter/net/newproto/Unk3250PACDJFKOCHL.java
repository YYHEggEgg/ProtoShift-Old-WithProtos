// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3250_PACDJFKOCHL.proto

package emu.grasscutter.net.newproto;

public final class Unk3250PACDJFKOCHL {
  private Unk3250PACDJFKOCHL() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3250_PACDJFKOCHLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3250_PACDJFKOCHL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Unk3250_KBHAOBLPMAI = 9;</code>
     * @return The unk3250KBHAOBLPMAI.
     */
    boolean getUnk3250KBHAOBLPMAI();

    /**
     * <code>uint32 channel_id = 8;</code>
     * @return The channelId.
     */
    int getChannelId();
  }
  /**
   * <pre>
   * CmdId: 5044
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3250_PACDJFKOCHL}
   */
  public static final class Unk3250_PACDJFKOCHL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3250_PACDJFKOCHL)
      Unk3250_PACDJFKOCHLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3250_PACDJFKOCHL.newBuilder() to construct.
    private Unk3250_PACDJFKOCHL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3250_PACDJFKOCHL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3250_PACDJFKOCHL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.internal_static_Unk3250_PACDJFKOCHL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.internal_static_Unk3250_PACDJFKOCHL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL.class, emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL.Builder.class);
    }

    public static final int UNK3250_KBHAOBLPMAI_FIELD_NUMBER = 9;
    private boolean unk3250KBHAOBLPMAI_;
    /**
     * <code>bool Unk3250_KBHAOBLPMAI = 9;</code>
     * @return The unk3250KBHAOBLPMAI.
     */
    @java.lang.Override
    public boolean getUnk3250KBHAOBLPMAI() {
      return unk3250KBHAOBLPMAI_;
    }

    public static final int CHANNEL_ID_FIELD_NUMBER = 8;
    private int channelId_;
    /**
     * <code>uint32 channel_id = 8;</code>
     * @return The channelId.
     */
    @java.lang.Override
    public int getChannelId() {
      return channelId_;
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
      if (channelId_ != 0) {
        output.writeUInt32(8, channelId_);
      }
      if (unk3250KBHAOBLPMAI_ != false) {
        output.writeBool(9, unk3250KBHAOBLPMAI_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (channelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, channelId_);
      }
      if (unk3250KBHAOBLPMAI_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, unk3250KBHAOBLPMAI_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL other = (emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL) obj;

      if (getUnk3250KBHAOBLPMAI()
          != other.getUnk3250KBHAOBLPMAI()) return false;
      if (getChannelId()
          != other.getChannelId()) return false;
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
      hash = (37 * hash) + UNK3250_KBHAOBLPMAI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3250KBHAOBLPMAI());
      hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChannelId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL prototype) {
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
     * CmdId: 5044
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3250_PACDJFKOCHL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3250_PACDJFKOCHL)
        emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.internal_static_Unk3250_PACDJFKOCHL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.internal_static_Unk3250_PACDJFKOCHL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL.class, emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250KBHAOBLPMAI_ = false;

        channelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.internal_static_Unk3250_PACDJFKOCHL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL build() {
        emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL buildPartial() {
        emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL result = new emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL(this);
        result.unk3250KBHAOBLPMAI_ = unk3250KBHAOBLPMAI_;
        result.channelId_ = channelId_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL other) {
        if (other == emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL.getDefaultInstance()) return this;
        if (other.getUnk3250KBHAOBLPMAI() != false) {
          setUnk3250KBHAOBLPMAI(other.getUnk3250KBHAOBLPMAI());
        }
        if (other.getChannelId() != 0) {
          setChannelId(other.getChannelId());
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
                channelId_ = input.readUInt32();

                break;
              } // case 64
              case 72: {
                unk3250KBHAOBLPMAI_ = input.readBool();

                break;
              } // case 72
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

      private boolean unk3250KBHAOBLPMAI_ ;
      /**
       * <code>bool Unk3250_KBHAOBLPMAI = 9;</code>
       * @return The unk3250KBHAOBLPMAI.
       */
      @java.lang.Override
      public boolean getUnk3250KBHAOBLPMAI() {
        return unk3250KBHAOBLPMAI_;
      }
      /**
       * <code>bool Unk3250_KBHAOBLPMAI = 9;</code>
       * @param value The unk3250KBHAOBLPMAI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250KBHAOBLPMAI(boolean value) {
        
        unk3250KBHAOBLPMAI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3250_KBHAOBLPMAI = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250KBHAOBLPMAI() {
        
        unk3250KBHAOBLPMAI_ = false;
        onChanged();
        return this;
      }

      private int channelId_ ;
      /**
       * <code>uint32 channel_id = 8;</code>
       * @return The channelId.
       */
      @java.lang.Override
      public int getChannelId() {
        return channelId_;
      }
      /**
       * <code>uint32 channel_id = 8;</code>
       * @param value The channelId to set.
       * @return This builder for chaining.
       */
      public Builder setChannelId(int value) {
        
        channelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 channel_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearChannelId() {
        
        channelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3250_PACDJFKOCHL)
    }

    // @@protoc_insertion_point(class_scope:Unk3250_PACDJFKOCHL)
    private static final emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL();
    }

    public static emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3250_PACDJFKOCHL>
        PARSER = new com.google.protobuf.AbstractParser<Unk3250_PACDJFKOCHL>() {
      @java.lang.Override
      public Unk3250_PACDJFKOCHL parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3250_PACDJFKOCHL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3250_PACDJFKOCHL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3250PACDJFKOCHL.Unk3250_PACDJFKOCHL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3250_PACDJFKOCHL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3250_PACDJFKOCHL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3250_PACDJFKOCHL.proto\"F\n\023Unk3250_P" +
      "ACDJFKOCHL\022\033\n\023Unk3250_KBHAOBLPMAI\030\t \001(\010\022" +
      "\022\n\nchannel_id\030\010 \001(\rB\036\n\034emu.grasscutter.n" +
      "et.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3250_PACDJFKOCHL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3250_PACDJFKOCHL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3250_PACDJFKOCHL_descriptor,
        new java.lang.String[] { "Unk3250KBHAOBLPMAI", "ChannelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
