// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerDailyRewardProgressChangeNotify.proto

package emu.grasscutter.net.oldproto;

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
     * <code>uint32 daily_floor_id = 15;</code>
     * @return The dailyFloorId.
     */
    int getDailyFloorId();

    /**
     * <code>uint32 daily_level_index = 9;</code>
     * @return The dailyLevelIndex.
     */
    int getDailyLevelIndex();
  }
  /**
   * <pre>
   * CmdId: 2435
   * EnetChannelId: 0
   * EnetIsReliable: true
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
      return emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.class, emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.Builder.class);
    }

    public static final int DAILY_FLOOR_ID_FIELD_NUMBER = 15;
    private int dailyFloorId_;
    /**
     * <code>uint32 daily_floor_id = 15;</code>
     * @return The dailyFloorId.
     */
    @java.lang.Override
    public int getDailyFloorId() {
      return dailyFloorId_;
    }

    public static final int DAILY_LEVEL_INDEX_FIELD_NUMBER = 9;
    private int dailyLevelIndex_;
    /**
     * <code>uint32 daily_level_index = 9;</code>
     * @return The dailyLevelIndex.
     */
    @java.lang.Override
    public int getDailyLevelIndex() {
      return dailyLevelIndex_;
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
      if (dailyLevelIndex_ != 0) {
        output.writeUInt32(9, dailyLevelIndex_);
      }
      if (dailyFloorId_ != 0) {
        output.writeUInt32(15, dailyFloorId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dailyLevelIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, dailyLevelIndex_);
      }
      if (dailyFloorId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, dailyFloorId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify other = (emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify) obj;

      if (getDailyFloorId()
          != other.getDailyFloorId()) return false;
      if (getDailyLevelIndex()
          != other.getDailyLevelIndex()) return false;
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
      hash = (37 * hash) + DAILY_FLOOR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDailyFloorId();
      hash = (37 * hash) + DAILY_LEVEL_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getDailyLevelIndex();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify prototype) {
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
     * CmdId: 2435
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code TowerDailyRewardProgressChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerDailyRewardProgressChangeNotify)
        emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.class, emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dailyFloorId_ = 0;

        dailyLevelIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify build() {
        emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify buildPartial() {
        emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify result = new emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify(this);
        result.dailyFloorId_ = dailyFloorId_;
        result.dailyLevelIndex_ = dailyLevelIndex_;
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
        if (other instanceof emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify other) {
        if (other == emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.getDefaultInstance()) return this;
        if (other.getDailyFloorId() != 0) {
          setDailyFloorId(other.getDailyFloorId());
        }
        if (other.getDailyLevelIndex() != 0) {
          setDailyLevelIndex(other.getDailyLevelIndex());
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
              case 72: {
                dailyLevelIndex_ = input.readUInt32();

                break;
              } // case 72
              case 120: {
                dailyFloorId_ = input.readUInt32();

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

      private int dailyFloorId_ ;
      /**
       * <code>uint32 daily_floor_id = 15;</code>
       * @return The dailyFloorId.
       */
      @java.lang.Override
      public int getDailyFloorId() {
        return dailyFloorId_;
      }
      /**
       * <code>uint32 daily_floor_id = 15;</code>
       * @param value The dailyFloorId to set.
       * @return This builder for chaining.
       */
      public Builder setDailyFloorId(int value) {
        
        dailyFloorId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 daily_floor_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearDailyFloorId() {
        
        dailyFloorId_ = 0;
        onChanged();
        return this;
      }

      private int dailyLevelIndex_ ;
      /**
       * <code>uint32 daily_level_index = 9;</code>
       * @return The dailyLevelIndex.
       */
      @java.lang.Override
      public int getDailyLevelIndex() {
        return dailyLevelIndex_;
      }
      /**
       * <code>uint32 daily_level_index = 9;</code>
       * @param value The dailyLevelIndex to set.
       * @return This builder for chaining.
       */
      public Builder setDailyLevelIndex(int value) {
        
        dailyLevelIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 daily_level_index = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearDailyLevelIndex() {
        
        dailyLevelIndex_ = 0;
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
    private static final emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify();
    }

    public static emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify getDefaultInstance() {
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
    public emu.grasscutter.net.oldproto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify getDefaultInstanceForType() {
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
      "roto\"Y\n$TowerDailyRewardProgressChangeNo" +
      "tify\022\026\n\016daily_floor_id\030\017 \001(\r\022\031\n\021daily_le" +
      "vel_index\030\t \001(\rB\036\n\034emu.grasscutter.net.o" +
      "ldprotob\006proto3"
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
        new java.lang.String[] { "DailyFloorId", "DailyLevelIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
