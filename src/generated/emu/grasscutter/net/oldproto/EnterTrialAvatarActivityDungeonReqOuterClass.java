// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterTrialAvatarActivityDungeonReq.proto

package emu.grasscutter.net.oldproto;

public final class EnterTrialAvatarActivityDungeonReqOuterClass {
  private EnterTrialAvatarActivityDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterTrialAvatarActivityDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterTrialAvatarActivityDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 enter_point_id = 10;</code>
     * @return The enterPointId.
     */
    int getEnterPointId();

    /**
     * <code>uint32 trial_avatar_index_id = 5;</code>
     * @return The trialAvatarIndexId.
     */
    int getTrialAvatarIndexId();

    /**
     * <code>uint32 activity_id = 14;</code>
     * @return The activityId.
     */
    int getActivityId();
  }
  /**
   * <pre>
   * CmdId: 2118
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code EnterTrialAvatarActivityDungeonReq}
   */
  public static final class EnterTrialAvatarActivityDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterTrialAvatarActivityDungeonReq)
      EnterTrialAvatarActivityDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterTrialAvatarActivityDungeonReq.newBuilder() to construct.
    private EnterTrialAvatarActivityDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterTrialAvatarActivityDungeonReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterTrialAvatarActivityDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.internal_static_EnterTrialAvatarActivityDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.internal_static_EnterTrialAvatarActivityDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq.class, emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq.Builder.class);
    }

    public static final int ENTER_POINT_ID_FIELD_NUMBER = 10;
    private int enterPointId_;
    /**
     * <code>uint32 enter_point_id = 10;</code>
     * @return The enterPointId.
     */
    @java.lang.Override
    public int getEnterPointId() {
      return enterPointId_;
    }

    public static final int TRIAL_AVATAR_INDEX_ID_FIELD_NUMBER = 5;
    private int trialAvatarIndexId_;
    /**
     * <code>uint32 trial_avatar_index_id = 5;</code>
     * @return The trialAvatarIndexId.
     */
    @java.lang.Override
    public int getTrialAvatarIndexId() {
      return trialAvatarIndexId_;
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
      if (trialAvatarIndexId_ != 0) {
        output.writeUInt32(5, trialAvatarIndexId_);
      }
      if (enterPointId_ != 0) {
        output.writeUInt32(10, enterPointId_);
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
      if (trialAvatarIndexId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, trialAvatarIndexId_);
      }
      if (enterPointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, enterPointId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq other = (emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq) obj;

      if (getEnterPointId()
          != other.getEnterPointId()) return false;
      if (getTrialAvatarIndexId()
          != other.getTrialAvatarIndexId()) return false;
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
      hash = (37 * hash) + ENTER_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEnterPointId();
      hash = (37 * hash) + TRIAL_AVATAR_INDEX_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTrialAvatarIndexId();
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq prototype) {
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
     * CmdId: 2118
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code EnterTrialAvatarActivityDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterTrialAvatarActivityDungeonReq)
        emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.internal_static_EnterTrialAvatarActivityDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.internal_static_EnterTrialAvatarActivityDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq.class, emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        enterPointId_ = 0;

        trialAvatarIndexId_ = 0;

        activityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.internal_static_EnterTrialAvatarActivityDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq build() {
        emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq buildPartial() {
        emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq result = new emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq(this);
        result.enterPointId_ = enterPointId_;
        result.trialAvatarIndexId_ = trialAvatarIndexId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq other) {
        if (other == emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq.getDefaultInstance()) return this;
        if (other.getEnterPointId() != 0) {
          setEnterPointId(other.getEnterPointId());
        }
        if (other.getTrialAvatarIndexId() != 0) {
          setTrialAvatarIndexId(other.getTrialAvatarIndexId());
        }
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
              case 40: {
                trialAvatarIndexId_ = input.readUInt32();

                break;
              } // case 40
              case 80: {
                enterPointId_ = input.readUInt32();

                break;
              } // case 80
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

      private int enterPointId_ ;
      /**
       * <code>uint32 enter_point_id = 10;</code>
       * @return The enterPointId.
       */
      @java.lang.Override
      public int getEnterPointId() {
        return enterPointId_;
      }
      /**
       * <code>uint32 enter_point_id = 10;</code>
       * @param value The enterPointId to set.
       * @return This builder for chaining.
       */
      public Builder setEnterPointId(int value) {
        
        enterPointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 enter_point_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterPointId() {
        
        enterPointId_ = 0;
        onChanged();
        return this;
      }

      private int trialAvatarIndexId_ ;
      /**
       * <code>uint32 trial_avatar_index_id = 5;</code>
       * @return The trialAvatarIndexId.
       */
      @java.lang.Override
      public int getTrialAvatarIndexId() {
        return trialAvatarIndexId_;
      }
      /**
       * <code>uint32 trial_avatar_index_id = 5;</code>
       * @param value The trialAvatarIndexId to set.
       * @return This builder for chaining.
       */
      public Builder setTrialAvatarIndexId(int value) {
        
        trialAvatarIndexId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trial_avatar_index_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTrialAvatarIndexId() {
        
        trialAvatarIndexId_ = 0;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:EnterTrialAvatarActivityDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:EnterTrialAvatarActivityDungeonReq)
    private static final emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq();
    }

    public static emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterTrialAvatarActivityDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<EnterTrialAvatarActivityDungeonReq>() {
      @java.lang.Override
      public EnterTrialAvatarActivityDungeonReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<EnterTrialAvatarActivityDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterTrialAvatarActivityDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.EnterTrialAvatarActivityDungeonReqOuterClass.EnterTrialAvatarActivityDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterTrialAvatarActivityDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterTrialAvatarActivityDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(EnterTrialAvatarActivityDungeonReq.pro" +
      "to\"p\n\"EnterTrialAvatarActivityDungeonReq" +
      "\022\026\n\016enter_point_id\030\n \001(\r\022\035\n\025trial_avatar" +
      "_index_id\030\005 \001(\r\022\023\n\013activity_id\030\016 \001(\rB\036\n\034" +
      "emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterTrialAvatarActivityDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterTrialAvatarActivityDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterTrialAvatarActivityDungeonReq_descriptor,
        new java.lang.String[] { "EnterPointId", "TrialAvatarIndexId", "ActivityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
