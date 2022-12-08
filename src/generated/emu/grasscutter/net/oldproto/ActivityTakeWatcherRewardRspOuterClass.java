// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityTakeWatcherRewardRsp.proto

package emu.grasscutter.net.oldproto;

public final class ActivityTakeWatcherRewardRspOuterClass {
  private ActivityTakeWatcherRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityTakeWatcherRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityTakeWatcherRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 activity_id = 14;</code>
     * @return The activityId.
     */
    int getActivityId();

    /**
     * <code>uint32 watcher_id = 7;</code>
     * @return The watcherId.
     */
    int getWatcherId();

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 2034
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code ActivityTakeWatcherRewardRsp}
   */
  public static final class ActivityTakeWatcherRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityTakeWatcherRewardRsp)
      ActivityTakeWatcherRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityTakeWatcherRewardRsp.newBuilder() to construct.
    private ActivityTakeWatcherRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityTakeWatcherRewardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityTakeWatcherRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.internal_static_ActivityTakeWatcherRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.internal_static_ActivityTakeWatcherRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp.class, emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp.Builder.class);
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 14;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 14;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
    }

    public static final int WATCHER_ID_FIELD_NUMBER = 7;
    private int watcherId_;
    /**
     * <code>uint32 watcher_id = 7;</code>
     * @return The watcherId.
     */
    @java.lang.Override
    public int getWatcherId() {
      return watcherId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
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
      if (watcherId_ != 0) {
        output.writeUInt32(7, watcherId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (activityId_ != 0) {
        output.writeUInt32(14, activityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (watcherId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, watcherId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, activityId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp other = (emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp) obj;

      if (getActivityId()
          != other.getActivityId()) return false;
      if (getWatcherId()
          != other.getWatcherId()) return false;
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
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (37 * hash) + WATCHER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWatcherId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp prototype) {
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
     * CmdId: 2034
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code ActivityTakeWatcherRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityTakeWatcherRewardRsp)
        emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.internal_static_ActivityTakeWatcherRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.internal_static_ActivityTakeWatcherRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp.class, emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        activityId_ = 0;

        watcherId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.internal_static_ActivityTakeWatcherRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp build() {
        emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp buildPartial() {
        emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp result = new emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp(this);
        result.activityId_ = activityId_;
        result.watcherId_ = watcherId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp other) {
        if (other == emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp.getDefaultInstance()) return this;
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
        }
        if (other.getWatcherId() != 0) {
          setWatcherId(other.getWatcherId());
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
              case 56: {
                watcherId_ = input.readUInt32();

                break;
              } // case 56
              case 72: {
                retcode_ = input.readInt32();

                break;
              } // case 72
              case 112: {
                activityId_ = input.readUInt32();

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

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 14;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 14;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
        onChanged();
        return this;
      }

      private int watcherId_ ;
      /**
       * <code>uint32 watcher_id = 7;</code>
       * @return The watcherId.
       */
      @java.lang.Override
      public int getWatcherId() {
        return watcherId_;
      }
      /**
       * <code>uint32 watcher_id = 7;</code>
       * @param value The watcherId to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherId(int value) {
        
        watcherId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 watcher_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherId() {
        
        watcherId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
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


      // @@protoc_insertion_point(builder_scope:ActivityTakeWatcherRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:ActivityTakeWatcherRewardRsp)
    private static final emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp();
    }

    public static emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityTakeWatcherRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<ActivityTakeWatcherRewardRsp>() {
      @java.lang.Override
      public ActivityTakeWatcherRewardRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<ActivityTakeWatcherRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityTakeWatcherRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ActivityTakeWatcherRewardRspOuterClass.ActivityTakeWatcherRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityTakeWatcherRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityTakeWatcherRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"ActivityTakeWatcherRewardRsp.proto\"X\n\034" +
      "ActivityTakeWatcherRewardRsp\022\023\n\013activity" +
      "_id\030\016 \001(\r\022\022\n\nwatcher_id\030\007 \001(\r\022\017\n\007retcode" +
      "\030\t \001(\005B\036\n\034emu.grasscutter.net.oldprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityTakeWatcherRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityTakeWatcherRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityTakeWatcherRewardRsp_descriptor,
        new java.lang.String[] { "ActivityId", "WatcherId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
