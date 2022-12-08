// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpActivityTagBriefInfo.proto

package emu.grasscutter.net.oldproto;

public final class OpActivityTagBriefInfoOuterClass {
  private OpActivityTagBriefInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OpActivityTagBriefInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpActivityTagBriefInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 config_id = 2;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>bool has_reward = 3;</code>
     * @return The hasReward.
     */
    boolean getHasReward();

    /**
     * <code>uint32 op_activity_type = 11;</code>
     * @return The opActivityType.
     */
    int getOpActivityType();
  }
  /**
   * Protobuf type {@code OpActivityTagBriefInfo}
   */
  public static final class OpActivityTagBriefInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OpActivityTagBriefInfo)
      OpActivityTagBriefInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpActivityTagBriefInfo.newBuilder() to construct.
    private OpActivityTagBriefInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpActivityTagBriefInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpActivityTagBriefInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.internal_static_OpActivityTagBriefInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.internal_static_OpActivityTagBriefInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo.class, emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo.Builder.class);
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 2;
    private int configId_;
    /**
     * <code>uint32 config_id = 2;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int HAS_REWARD_FIELD_NUMBER = 3;
    private boolean hasReward_;
    /**
     * <code>bool has_reward = 3;</code>
     * @return The hasReward.
     */
    @java.lang.Override
    public boolean getHasReward() {
      return hasReward_;
    }

    public static final int OP_ACTIVITY_TYPE_FIELD_NUMBER = 11;
    private int opActivityType_;
    /**
     * <code>uint32 op_activity_type = 11;</code>
     * @return The opActivityType.
     */
    @java.lang.Override
    public int getOpActivityType() {
      return opActivityType_;
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
      if (configId_ != 0) {
        output.writeUInt32(2, configId_);
      }
      if (hasReward_ != false) {
        output.writeBool(3, hasReward_);
      }
      if (opActivityType_ != 0) {
        output.writeUInt32(11, opActivityType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, configId_);
      }
      if (hasReward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, hasReward_);
      }
      if (opActivityType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, opActivityType_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo other = (emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo) obj;

      if (getConfigId()
          != other.getConfigId()) return false;
      if (getHasReward()
          != other.getHasReward()) return false;
      if (getOpActivityType()
          != other.getOpActivityType()) return false;
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
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + HAS_REWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHasReward());
      hash = (37 * hash) + OP_ACTIVITY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getOpActivityType();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo prototype) {
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
     * Protobuf type {@code OpActivityTagBriefInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpActivityTagBriefInfo)
        emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.internal_static_OpActivityTagBriefInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.internal_static_OpActivityTagBriefInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo.class, emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        configId_ = 0;

        hasReward_ = false;

        opActivityType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.internal_static_OpActivityTagBriefInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo build() {
        emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo buildPartial() {
        emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo result = new emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo(this);
        result.configId_ = configId_;
        result.hasReward_ = hasReward_;
        result.opActivityType_ = opActivityType_;
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
        if (other instanceof emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo other) {
        if (other == emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo.getDefaultInstance()) return this;
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (other.getHasReward() != false) {
          setHasReward(other.getHasReward());
        }
        if (other.getOpActivityType() != 0) {
          setOpActivityType(other.getOpActivityType());
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
              case 16: {
                configId_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                hasReward_ = input.readBool();

                break;
              } // case 24
              case 88: {
                opActivityType_ = input.readUInt32();

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

      private int configId_ ;
      /**
       * <code>uint32 config_id = 2;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 2;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private boolean hasReward_ ;
      /**
       * <code>bool has_reward = 3;</code>
       * @return The hasReward.
       */
      @java.lang.Override
      public boolean getHasReward() {
        return hasReward_;
      }
      /**
       * <code>bool has_reward = 3;</code>
       * @param value The hasReward to set.
       * @return This builder for chaining.
       */
      public Builder setHasReward(boolean value) {
        
        hasReward_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool has_reward = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearHasReward() {
        
        hasReward_ = false;
        onChanged();
        return this;
      }

      private int opActivityType_ ;
      /**
       * <code>uint32 op_activity_type = 11;</code>
       * @return The opActivityType.
       */
      @java.lang.Override
      public int getOpActivityType() {
        return opActivityType_;
      }
      /**
       * <code>uint32 op_activity_type = 11;</code>
       * @param value The opActivityType to set.
       * @return This builder for chaining.
       */
      public Builder setOpActivityType(int value) {
        
        opActivityType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 op_activity_type = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpActivityType() {
        
        opActivityType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OpActivityTagBriefInfo)
    }

    // @@protoc_insertion_point(class_scope:OpActivityTagBriefInfo)
    private static final emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo();
    }

    public static emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpActivityTagBriefInfo>
        PARSER = new com.google.protobuf.AbstractParser<OpActivityTagBriefInfo>() {
      @java.lang.Override
      public OpActivityTagBriefInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<OpActivityTagBriefInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpActivityTagBriefInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.OpActivityTagBriefInfoOuterClass.OpActivityTagBriefInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpActivityTagBriefInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpActivityTagBriefInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034OpActivityTagBriefInfo.proto\"Y\n\026OpActi" +
      "vityTagBriefInfo\022\021\n\tconfig_id\030\002 \001(\r\022\022\n\nh" +
      "as_reward\030\003 \001(\010\022\030\n\020op_activity_type\030\013 \001(" +
      "\rB\036\n\034emu.grasscutter.net.oldprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OpActivityTagBriefInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpActivityTagBriefInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpActivityTagBriefInfo_descriptor,
        new java.lang.String[] { "ConfigId", "HasReward", "OpActivityType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
