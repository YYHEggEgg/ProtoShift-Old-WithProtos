// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityPlayOpenAnimNotify.proto

package emu.grasscutter.net.oldproto;

public final class ActivityPlayOpenAnimNotifyOuterClass {
  private ActivityPlayOpenAnimNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityPlayOpenAnimNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityPlayOpenAnimNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 activity_id = 8;</code>
     * @return The activityId.
     */
    int getActivityId();
  }
  /**
   * <pre>
   * CmdId: 2157
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ActivityPlayOpenAnimNotify}
   */
  public static final class ActivityPlayOpenAnimNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityPlayOpenAnimNotify)
      ActivityPlayOpenAnimNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityPlayOpenAnimNotify.newBuilder() to construct.
    private ActivityPlayOpenAnimNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityPlayOpenAnimNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityPlayOpenAnimNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.internal_static_ActivityPlayOpenAnimNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.internal_static_ActivityPlayOpenAnimNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.class, emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.Builder.class);
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 8;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 8;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
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
      if (activityId_ != 0) {
        output.writeUInt32(8, activityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, activityId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify other = (emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify) obj;

      if (getActivityId()
          != other.getActivityId()) return false;
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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify prototype) {
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
     * CmdId: 2157
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ActivityPlayOpenAnimNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityPlayOpenAnimNotify)
        emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.internal_static_ActivityPlayOpenAnimNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.internal_static_ActivityPlayOpenAnimNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.class, emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.newBuilder()
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

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.internal_static_ActivityPlayOpenAnimNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify build() {
        emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify buildPartial() {
        emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify result = new emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify(this);
        result.activityId_ = activityId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify other) {
        if (other == emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify.getDefaultInstance()) return this;
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
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
                activityId_ = input.readUInt32();

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

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 8;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 8;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityPlayOpenAnimNotify)
    }

    // @@protoc_insertion_point(class_scope:ActivityPlayOpenAnimNotify)
    private static final emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify();
    }

    public static emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityPlayOpenAnimNotify>
        PARSER = new com.google.protobuf.AbstractParser<ActivityPlayOpenAnimNotify>() {
      @java.lang.Override
      public ActivityPlayOpenAnimNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ActivityPlayOpenAnimNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityPlayOpenAnimNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ActivityPlayOpenAnimNotifyOuterClass.ActivityPlayOpenAnimNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityPlayOpenAnimNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityPlayOpenAnimNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ActivityPlayOpenAnimNotify.proto\"1\n\032Ac" +
      "tivityPlayOpenAnimNotify\022\023\n\013activity_id\030" +
      "\010 \001(\rB\036\n\034emu.grasscutter.net.oldprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityPlayOpenAnimNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityPlayOpenAnimNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityPlayOpenAnimNotify_descriptor,
        new java.lang.String[] { "ActivityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
