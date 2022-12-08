// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtCostStaminaNotify.proto

package emu.grasscutter.net.oldproto;

public final class EvtCostStaminaNotifyOuterClass {
  private EvtCostStaminaNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtCostStaminaNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtCostStaminaNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 skill_id = 6;</code>
     * @return The skillId.
     */
    int getSkillId();

    /**
     * <code>float cost_stamina = 11;</code>
     * @return The costStamina.
     */
    float getCostStamina();
  }
  /**
   * <pre>
   * CmdId: 373
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code EvtCostStaminaNotify}
   */
  public static final class EvtCostStaminaNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtCostStaminaNotify)
      EvtCostStaminaNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtCostStaminaNotify.newBuilder() to construct.
    private EvtCostStaminaNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtCostStaminaNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtCostStaminaNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.internal_static_EvtCostStaminaNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.internal_static_EvtCostStaminaNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify.class, emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify.Builder.class);
    }

    public static final int SKILL_ID_FIELD_NUMBER = 6;
    private int skillId_;
    /**
     * <code>uint32 skill_id = 6;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
    }

    public static final int COST_STAMINA_FIELD_NUMBER = 11;
    private float costStamina_;
    /**
     * <code>float cost_stamina = 11;</code>
     * @return The costStamina.
     */
    @java.lang.Override
    public float getCostStamina() {
      return costStamina_;
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
      if (skillId_ != 0) {
        output.writeUInt32(6, skillId_);
      }
      if (java.lang.Float.floatToRawIntBits(costStamina_) != 0) {
        output.writeFloat(11, costStamina_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, skillId_);
      }
      if (java.lang.Float.floatToRawIntBits(costStamina_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(11, costStamina_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify other = (emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify) obj;

      if (getSkillId()
          != other.getSkillId()) return false;
      if (java.lang.Float.floatToIntBits(getCostStamina())
          != java.lang.Float.floatToIntBits(
              other.getCostStamina())) return false;
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
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (37 * hash) + COST_STAMINA_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCostStamina());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify prototype) {
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
     * CmdId: 373
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code EvtCostStaminaNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtCostStaminaNotify)
        emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.internal_static_EvtCostStaminaNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.internal_static_EvtCostStaminaNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify.class, emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        skillId_ = 0;

        costStamina_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.internal_static_EvtCostStaminaNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify build() {
        emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify buildPartial() {
        emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify result = new emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify(this);
        result.skillId_ = skillId_;
        result.costStamina_ = costStamina_;
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
        if (other instanceof emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify other) {
        if (other == emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify.getDefaultInstance()) return this;
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
        }
        if (other.getCostStamina() != 0F) {
          setCostStamina(other.getCostStamina());
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
                skillId_ = input.readUInt32();

                break;
              } // case 48
              case 93: {
                costStamina_ = input.readFloat();

                break;
              } // case 93
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

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 6;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 6;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        
        skillId_ = 0;
        onChanged();
        return this;
      }

      private float costStamina_ ;
      /**
       * <code>float cost_stamina = 11;</code>
       * @return The costStamina.
       */
      @java.lang.Override
      public float getCostStamina() {
        return costStamina_;
      }
      /**
       * <code>float cost_stamina = 11;</code>
       * @param value The costStamina to set.
       * @return This builder for chaining.
       */
      public Builder setCostStamina(float value) {
        
        costStamina_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float cost_stamina = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostStamina() {
        
        costStamina_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:EvtCostStaminaNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtCostStaminaNotify)
    private static final emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify();
    }

    public static emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtCostStaminaNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtCostStaminaNotify>() {
      @java.lang.Override
      public EvtCostStaminaNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtCostStaminaNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtCostStaminaNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.EvtCostStaminaNotifyOuterClass.EvtCostStaminaNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtCostStaminaNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtCostStaminaNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032EvtCostStaminaNotify.proto\">\n\024EvtCostS" +
      "taminaNotify\022\020\n\010skill_id\030\006 \001(\r\022\024\n\014cost_s" +
      "tamina\030\013 \001(\002B\036\n\034emu.grasscutter.net.oldp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EvtCostStaminaNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtCostStaminaNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtCostStaminaNotify_descriptor,
        new java.lang.String[] { "SkillId", "CostStamina", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
