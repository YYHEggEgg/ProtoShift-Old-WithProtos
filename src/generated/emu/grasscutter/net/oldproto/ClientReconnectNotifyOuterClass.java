// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientReconnectNotify.proto

package emu.grasscutter.net.oldproto;

public final class ClientReconnectNotifyOuterClass {
  private ClientReconnectNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientReconnectNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientReconnectNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ClientReconnectReason reason = 6;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.ClientReconnectReason reason = 6;</code>
     * @return The reason.
     */
    emu.grasscutter.net.oldproto.ClientReconnectReasonOuterClass.ClientReconnectReason getReason();
  }
  /**
   * <pre>
   * CmdId: 75
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code ClientReconnectNotify}
   */
  public static final class ClientReconnectNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientReconnectNotify)
      ClientReconnectNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientReconnectNotify.newBuilder() to construct.
    private ClientReconnectNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientReconnectNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientReconnectNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.internal_static_ClientReconnectNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.internal_static_ClientReconnectNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify.class, emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 6;
    private int reason_;
    /**
     * <code>.ClientReconnectReason reason = 6;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.ClientReconnectReason reason = 6;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.ClientReconnectReasonOuterClass.ClientReconnectReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.ClientReconnectReasonOuterClass.ClientReconnectReason result = emu.grasscutter.net.oldproto.ClientReconnectReasonOuterClass.ClientReconnectReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.oldproto.ClientReconnectReasonOuterClass.ClientReconnectReason.UNRECOGNIZED : result;
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
      if (reason_ != emu.grasscutter.net.oldproto.ClientReconnectReasonOuterClass.ClientReconnectReason.CLIENT_RECONNECT_REASON_RECONNNECT_NONE.getNumber()) {
        output.writeEnum(6, reason_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != emu.grasscutter.net.oldproto.ClientReconnectReasonOuterClass.ClientReconnectReason.CLIENT_RECONNECT_REASON_RECONNNECT_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, reason_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify other = (emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify) obj;

      if (reason_ != other.reason_) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify prototype) {
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
     * CmdId: 75
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code ClientReconnectNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientReconnectNotify)
        emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.internal_static_ClientReconnectNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.internal_static_ClientReconnectNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify.class, emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        reason_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.internal_static_ClientReconnectNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify build() {
        emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify buildPartial() {
        emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify result = new emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify(this);
        result.reason_ = reason_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify other) {
        if (other == emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify.getDefaultInstance()) return this;
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
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
                reason_ = input.readEnum();

                break;
              } // case 48
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

      private int reason_ = 0;
      /**
       * <code>.ClientReconnectReason reason = 6;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.ClientReconnectReason reason = 6;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ClientReconnectReason reason = 6;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.ClientReconnectReasonOuterClass.ClientReconnectReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.ClientReconnectReasonOuterClass.ClientReconnectReason result = emu.grasscutter.net.oldproto.ClientReconnectReasonOuterClass.ClientReconnectReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.oldproto.ClientReconnectReasonOuterClass.ClientReconnectReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.ClientReconnectReason reason = 6;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.oldproto.ClientReconnectReasonOuterClass.ClientReconnectReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ClientReconnectReason reason = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ClientReconnectNotify)
    }

    // @@protoc_insertion_point(class_scope:ClientReconnectNotify)
    private static final emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify();
    }

    public static emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientReconnectNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClientReconnectNotify>() {
      @java.lang.Override
      public ClientReconnectNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ClientReconnectNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientReconnectNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ClientReconnectNotifyOuterClass.ClientReconnectNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientReconnectNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientReconnectNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ClientReconnectNotify.proto\032\033ClientRec" +
      "onnectReason.proto\"?\n\025ClientReconnectNot" +
      "ify\022&\n\006reason\030\006 \001(\0162\026.ClientReconnectRea" +
      "sonB\036\n\034emu.grasscutter.net.oldprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.ClientReconnectReasonOuterClass.getDescriptor(),
        });
    internal_static_ClientReconnectNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientReconnectNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientReconnectNotify_descriptor,
        new java.lang.String[] { "Reason", });
    emu.grasscutter.net.oldproto.ClientReconnectReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
