// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SelectAsterMidDifficultyRsp.proto

package emu.grasscutter.net.oldproto;

public final class SelectAsterMidDifficultyRspOuterClass {
  private SelectAsterMidDifficultyRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SelectAsterMidDifficultyRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SelectAsterMidDifficultyRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 schedule_id = 2;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>uint32 gadget_entity_id = 5;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>uint32 difficulty_id = 14;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();
  }
  /**
   * <pre>
   * CmdId: 2180
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code SelectAsterMidDifficultyRsp}
   */
  public static final class SelectAsterMidDifficultyRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SelectAsterMidDifficultyRsp)
      SelectAsterMidDifficultyRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SelectAsterMidDifficultyRsp.newBuilder() to construct.
    private SelectAsterMidDifficultyRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SelectAsterMidDifficultyRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SelectAsterMidDifficultyRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.internal_static_SelectAsterMidDifficultyRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.internal_static_SelectAsterMidDifficultyRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp.class, emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 2;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 2;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 5;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 5;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int DIFFICULTY_ID_FIELD_NUMBER = 14;
    private int difficultyId_;
    /**
     * <code>uint32 difficulty_id = 14;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
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
        output.writeUInt32(2, scheduleId_);
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(5, gadgetEntityId_);
      }
      if (difficultyId_ != 0) {
        output.writeUInt32(14, difficultyId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
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
          .computeUInt32Size(2, scheduleId_);
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, gadgetEntityId_);
      }
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, difficultyId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp other = (emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (getDifficultyId()
          != other.getDifficultyId()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp prototype) {
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
     * CmdId: 2180
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code SelectAsterMidDifficultyRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SelectAsterMidDifficultyRsp)
        emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.internal_static_SelectAsterMidDifficultyRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.internal_static_SelectAsterMidDifficultyRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp.class, emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        scheduleId_ = 0;

        gadgetEntityId_ = 0;

        difficultyId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.internal_static_SelectAsterMidDifficultyRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp build() {
        emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp buildPartial() {
        emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp result = new emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp(this);
        result.retcode_ = retcode_;
        result.scheduleId_ = scheduleId_;
        result.gadgetEntityId_ = gadgetEntityId_;
        result.difficultyId_ = difficultyId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp other) {
        if (other == emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
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
                scheduleId_ = input.readUInt32();

                break;
              } // case 16
              case 40: {
                gadgetEntityId_ = input.readUInt32();

                break;
              } // case 40
              case 112: {
                difficultyId_ = input.readUInt32();

                break;
              } // case 112
              case 120: {
                retcode_ = input.readInt32();

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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 2;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 2;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 5;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 5;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int difficultyId_ ;
      /**
       * <code>uint32 difficulty_id = 14;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 14;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        
        difficultyId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SelectAsterMidDifficultyRsp)
    }

    // @@protoc_insertion_point(class_scope:SelectAsterMidDifficultyRsp)
    private static final emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp();
    }

    public static emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SelectAsterMidDifficultyRsp>
        PARSER = new com.google.protobuf.AbstractParser<SelectAsterMidDifficultyRsp>() {
      @java.lang.Override
      public SelectAsterMidDifficultyRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<SelectAsterMidDifficultyRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SelectAsterMidDifficultyRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SelectAsterMidDifficultyRspOuterClass.SelectAsterMidDifficultyRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SelectAsterMidDifficultyRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SelectAsterMidDifficultyRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!SelectAsterMidDifficultyRsp.proto\"t\n\033S" +
      "electAsterMidDifficultyRsp\022\017\n\007retcode\030\017 " +
      "\001(\005\022\023\n\013schedule_id\030\002 \001(\r\022\030\n\020gadget_entit" +
      "y_id\030\005 \001(\r\022\025\n\rdifficulty_id\030\016 \001(\rB\036\n\034emu" +
      ".grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SelectAsterMidDifficultyRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SelectAsterMidDifficultyRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SelectAsterMidDifficultyRsp_descriptor,
        new java.lang.String[] { "Retcode", "ScheduleId", "GadgetEntityId", "DifficultyId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
