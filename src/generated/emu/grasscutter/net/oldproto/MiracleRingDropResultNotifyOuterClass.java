// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MiracleRingDropResultNotify.proto

package emu.grasscutter.net.oldproto;

public final class MiracleRingDropResultNotifyOuterClass {
  private MiracleRingDropResultNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MiracleRingDropResultNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MiracleRingDropResultNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 last_take_reward_time = 5;</code>
     * @return The lastTakeRewardTime.
     */
    int getLastTakeRewardTime();

    /**
     * <code>int32 drop_result = 9;</code>
     * @return The dropResult.
     */
    int getDropResult();
  }
  /**
   * <pre>
   * CmdId: 5231
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code MiracleRingDropResultNotify}
   */
  public static final class MiracleRingDropResultNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MiracleRingDropResultNotify)
      MiracleRingDropResultNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MiracleRingDropResultNotify.newBuilder() to construct.
    private MiracleRingDropResultNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MiracleRingDropResultNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MiracleRingDropResultNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.internal_static_MiracleRingDropResultNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.internal_static_MiracleRingDropResultNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify.class, emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify.Builder.class);
    }

    public static final int LAST_TAKE_REWARD_TIME_FIELD_NUMBER = 5;
    private int lastTakeRewardTime_;
    /**
     * <code>int32 last_take_reward_time = 5;</code>
     * @return The lastTakeRewardTime.
     */
    @java.lang.Override
    public int getLastTakeRewardTime() {
      return lastTakeRewardTime_;
    }

    public static final int DROP_RESULT_FIELD_NUMBER = 9;
    private int dropResult_;
    /**
     * <code>int32 drop_result = 9;</code>
     * @return The dropResult.
     */
    @java.lang.Override
    public int getDropResult() {
      return dropResult_;
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
      if (lastTakeRewardTime_ != 0) {
        output.writeInt32(5, lastTakeRewardTime_);
      }
      if (dropResult_ != 0) {
        output.writeInt32(9, dropResult_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lastTakeRewardTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, lastTakeRewardTime_);
      }
      if (dropResult_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, dropResult_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify other = (emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify) obj;

      if (getLastTakeRewardTime()
          != other.getLastTakeRewardTime()) return false;
      if (getDropResult()
          != other.getDropResult()) return false;
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
      hash = (37 * hash) + LAST_TAKE_REWARD_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastTakeRewardTime();
      hash = (37 * hash) + DROP_RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getDropResult();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify prototype) {
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
     * CmdId: 5231
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code MiracleRingDropResultNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MiracleRingDropResultNotify)
        emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.internal_static_MiracleRingDropResultNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.internal_static_MiracleRingDropResultNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify.class, emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        lastTakeRewardTime_ = 0;

        dropResult_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.internal_static_MiracleRingDropResultNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify build() {
        emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify buildPartial() {
        emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify result = new emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify(this);
        result.lastTakeRewardTime_ = lastTakeRewardTime_;
        result.dropResult_ = dropResult_;
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
        if (other instanceof emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify other) {
        if (other == emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify.getDefaultInstance()) return this;
        if (other.getLastTakeRewardTime() != 0) {
          setLastTakeRewardTime(other.getLastTakeRewardTime());
        }
        if (other.getDropResult() != 0) {
          setDropResult(other.getDropResult());
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
                lastTakeRewardTime_ = input.readInt32();

                break;
              } // case 40
              case 72: {
                dropResult_ = input.readInt32();

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

      private int lastTakeRewardTime_ ;
      /**
       * <code>int32 last_take_reward_time = 5;</code>
       * @return The lastTakeRewardTime.
       */
      @java.lang.Override
      public int getLastTakeRewardTime() {
        return lastTakeRewardTime_;
      }
      /**
       * <code>int32 last_take_reward_time = 5;</code>
       * @param value The lastTakeRewardTime to set.
       * @return This builder for chaining.
       */
      public Builder setLastTakeRewardTime(int value) {
        
        lastTakeRewardTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 last_take_reward_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastTakeRewardTime() {
        
        lastTakeRewardTime_ = 0;
        onChanged();
        return this;
      }

      private int dropResult_ ;
      /**
       * <code>int32 drop_result = 9;</code>
       * @return The dropResult.
       */
      @java.lang.Override
      public int getDropResult() {
        return dropResult_;
      }
      /**
       * <code>int32 drop_result = 9;</code>
       * @param value The dropResult to set.
       * @return This builder for chaining.
       */
      public Builder setDropResult(int value) {
        
        dropResult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 drop_result = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearDropResult() {
        
        dropResult_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MiracleRingDropResultNotify)
    }

    // @@protoc_insertion_point(class_scope:MiracleRingDropResultNotify)
    private static final emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify();
    }

    public static emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MiracleRingDropResultNotify>
        PARSER = new com.google.protobuf.AbstractParser<MiracleRingDropResultNotify>() {
      @java.lang.Override
      public MiracleRingDropResultNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<MiracleRingDropResultNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MiracleRingDropResultNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MiracleRingDropResultNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MiracleRingDropResultNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!MiracleRingDropResultNotify.proto\"Q\n\033M" +
      "iracleRingDropResultNotify\022\035\n\025last_take_" +
      "reward_time\030\005 \001(\005\022\023\n\013drop_result\030\t \001(\005B\036" +
      "\n\034emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MiracleRingDropResultNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MiracleRingDropResultNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MiracleRingDropResultNotify_descriptor,
        new java.lang.String[] { "LastTakeRewardTime", "DropResult", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
