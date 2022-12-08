// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerQuitFromHomeNotify.proto

package emu.grasscutter.net.newproto;

public final class PlayerQuitFromHomeNotifyOuterClass {
  private PlayerQuitFromHomeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerQuitFromHomeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerQuitFromHomeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 11;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 11;</code>
     * @return The reason.
     */
    emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason getReason();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4724;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerQuitFromHomeNotify}
   */
  public static final class PlayerQuitFromHomeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerQuitFromHomeNotify)
      PlayerQuitFromHomeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerQuitFromHomeNotify.newBuilder() to construct.
    private PlayerQuitFromHomeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerQuitFromHomeNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerQuitFromHomeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.internal_static_PlayerQuitFromHomeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.internal_static_PlayerQuitFromHomeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.class, emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code PlayerQuitFromHomeNotify.QuitReason}
     */
    public enum QuitReason
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>QUIT_REASON_INVALID = 0;</code>
       */
      QUIT_REASON_INVALID(0),
      /**
       * <code>QUIT_REASON_KICK_BY_HOST = 1;</code>
       */
      QUIT_REASON_KICK_BY_HOST(1),
      /**
       * <code>QUIT_REASON_BACK_TO_MY_WORLD = 2;</code>
       */
      QUIT_REASON_BACK_TO_MY_WORLD(2),
      /**
       * <code>QUIT_REASON_HOME_BLOCKED = 3;</code>
       */
      QUIT_REASON_HOME_BLOCKED(3),
      /**
       * <code>QUIT_REASON_HOME_IN_EDIT_MODE = 4;</code>
       */
      QUIT_REASON_HOME_IN_EDIT_MODE(4),
      /**
       * <code>QUIT_REASON_BY_MUIP = 5;</code>
       */
      QUIT_REASON_BY_MUIP(5),
      /**
       * <code>QUIT_REASON_CUR_MODULE_CLOSED = 6;</code>
       */
      QUIT_REASON_CUR_MODULE_CLOSED(6),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>QUIT_REASON_INVALID = 0;</code>
       */
      public static final int QUIT_REASON_INVALID_VALUE = 0;
      /**
       * <code>QUIT_REASON_KICK_BY_HOST = 1;</code>
       */
      public static final int QUIT_REASON_KICK_BY_HOST_VALUE = 1;
      /**
       * <code>QUIT_REASON_BACK_TO_MY_WORLD = 2;</code>
       */
      public static final int QUIT_REASON_BACK_TO_MY_WORLD_VALUE = 2;
      /**
       * <code>QUIT_REASON_HOME_BLOCKED = 3;</code>
       */
      public static final int QUIT_REASON_HOME_BLOCKED_VALUE = 3;
      /**
       * <code>QUIT_REASON_HOME_IN_EDIT_MODE = 4;</code>
       */
      public static final int QUIT_REASON_HOME_IN_EDIT_MODE_VALUE = 4;
      /**
       * <code>QUIT_REASON_BY_MUIP = 5;</code>
       */
      public static final int QUIT_REASON_BY_MUIP_VALUE = 5;
      /**
       * <code>QUIT_REASON_CUR_MODULE_CLOSED = 6;</code>
       */
      public static final int QUIT_REASON_CUR_MODULE_CLOSED_VALUE = 6;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static QuitReason valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static QuitReason forNumber(int value) {
        switch (value) {
          case 0: return QUIT_REASON_INVALID;
          case 1: return QUIT_REASON_KICK_BY_HOST;
          case 2: return QUIT_REASON_BACK_TO_MY_WORLD;
          case 3: return QUIT_REASON_HOME_BLOCKED;
          case 4: return QUIT_REASON_HOME_IN_EDIT_MODE;
          case 5: return QUIT_REASON_BY_MUIP;
          case 6: return QUIT_REASON_CUR_MODULE_CLOSED;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<QuitReason>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          QuitReason> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<QuitReason>() {
              public QuitReason findValueByNumber(int number) {
                return QuitReason.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final QuitReason[] VALUES = values();

      public static QuitReason valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private QuitReason(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PlayerQuitFromHomeNotify.QuitReason)
    }

    public static final int REASON_FIELD_NUMBER = 11;
    private int reason_;
    /**
     * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 11;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 11;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason result = emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason.UNRECOGNIZED : result;
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
      if (reason_ != emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason.QUIT_REASON_INVALID.getNumber()) {
        output.writeEnum(11, reason_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason.QUIT_REASON_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, reason_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify other = (emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify) obj;

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

    public static emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify prototype) {
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
     *   CMD_ID = 4724;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerQuitFromHomeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerQuitFromHomeNotify)
        emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.internal_static_PlayerQuitFromHomeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.internal_static_PlayerQuitFromHomeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.class, emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.newBuilder()
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
        return emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.internal_static_PlayerQuitFromHomeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify build() {
        emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify buildPartial() {
        emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify result = new emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify(this);
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
        if (other instanceof emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify other) {
        if (other == emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.getDefaultInstance()) return this;
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
              case 88: {
                reason_ = input.readEnum();

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

      private int reason_ = 0;
      /**
       * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 11;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 11;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 11;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason result = emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 11;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify.QuitReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerQuitFromHomeNotify.QuitReason reason = 11;</code>
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


      // @@protoc_insertion_point(builder_scope:PlayerQuitFromHomeNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerQuitFromHomeNotify)
    private static final emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify();
    }

    public static emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerQuitFromHomeNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerQuitFromHomeNotify>() {
      @java.lang.Override
      public PlayerQuitFromHomeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerQuitFromHomeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerQuitFromHomeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PlayerQuitFromHomeNotifyOuterClass.PlayerQuitFromHomeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerQuitFromHomeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerQuitFromHomeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PlayerQuitFromHomeNotify.proto\"\265\002\n\030Pla" +
      "yerQuitFromHomeNotify\0224\n\006reason\030\013 \001(\0162$." +
      "PlayerQuitFromHomeNotify.QuitReason\"\342\001\n\n" +
      "QuitReason\022\027\n\023QUIT_REASON_INVALID\020\000\022\034\n\030Q" +
      "UIT_REASON_KICK_BY_HOST\020\001\022 \n\034QUIT_REASON" +
      "_BACK_TO_MY_WORLD\020\002\022\034\n\030QUIT_REASON_HOME_" +
      "BLOCKED\020\003\022!\n\035QUIT_REASON_HOME_IN_EDIT_MO" +
      "DE\020\004\022\027\n\023QUIT_REASON_BY_MUIP\020\005\022!\n\035QUIT_RE" +
      "ASON_CUR_MODULE_CLOSED\020\006B\036\n\034emu.grasscut" +
      "ter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerQuitFromHomeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerQuitFromHomeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerQuitFromHomeNotify_descriptor,
        new java.lang.String[] { "Reason", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
