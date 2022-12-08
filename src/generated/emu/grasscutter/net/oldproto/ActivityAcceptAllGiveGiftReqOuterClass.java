// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityAcceptAllGiveGiftReq.proto

package emu.grasscutter.net.oldproto;

public final class ActivityAcceptAllGiveGiftReqOuterClass {
  private ActivityAcceptAllGiveGiftReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityAcceptAllGiveGiftReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityAcceptAllGiveGiftReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 schedule_id = 3;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * <pre>
   * CmdId: 8113
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ActivityAcceptAllGiveGiftReq}
   */
  public static final class ActivityAcceptAllGiveGiftReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityAcceptAllGiveGiftReq)
      ActivityAcceptAllGiveGiftReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityAcceptAllGiveGiftReq.newBuilder() to construct.
    private ActivityAcceptAllGiveGiftReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityAcceptAllGiveGiftReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityAcceptAllGiveGiftReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.internal_static_ActivityAcceptAllGiveGiftReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.internal_static_ActivityAcceptAllGiveGiftReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq.class, emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq.Builder.class);
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 3;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 3;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
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
      if (scheduleId_ != 0) {
        output.writeUInt32(3, scheduleId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, scheduleId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq other = (emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq) obj;

      if (getScheduleId()
          != other.getScheduleId()) return false;
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
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq prototype) {
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
     * CmdId: 8113
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ActivityAcceptAllGiveGiftReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityAcceptAllGiveGiftReq)
        emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.internal_static_ActivityAcceptAllGiveGiftReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.internal_static_ActivityAcceptAllGiveGiftReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq.class, emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        scheduleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.internal_static_ActivityAcceptAllGiveGiftReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq build() {
        emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq buildPartial() {
        emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq result = new emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq(this);
        result.scheduleId_ = scheduleId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq other) {
        if (other == emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq.getDefaultInstance()) return this;
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
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
              case 24: {
                scheduleId_ = input.readUInt32();

                break;
              } // case 24
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

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 3;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 3;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityAcceptAllGiveGiftReq)
    }

    // @@protoc_insertion_point(class_scope:ActivityAcceptAllGiveGiftReq)
    private static final emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq();
    }

    public static emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityAcceptAllGiveGiftReq>
        PARSER = new com.google.protobuf.AbstractParser<ActivityAcceptAllGiveGiftReq>() {
      @java.lang.Override
      public ActivityAcceptAllGiveGiftReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ActivityAcceptAllGiveGiftReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityAcceptAllGiveGiftReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ActivityAcceptAllGiveGiftReqOuterClass.ActivityAcceptAllGiveGiftReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityAcceptAllGiveGiftReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityAcceptAllGiveGiftReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"ActivityAcceptAllGiveGiftReq.proto\"3\n\034" +
      "ActivityAcceptAllGiveGiftReq\022\023\n\013schedule" +
      "_id\030\003 \001(\rB\036\n\034emu.grasscutter.net.oldprot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityAcceptAllGiveGiftReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityAcceptAllGiveGiftReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityAcceptAllGiveGiftReq_descriptor,
        new java.lang.String[] { "ScheduleId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
