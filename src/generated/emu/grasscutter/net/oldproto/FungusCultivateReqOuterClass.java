// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusCultivateReq.proto

package emu.grasscutter.net.oldproto;

public final class FungusCultivateReqOuterClass {
  private FungusCultivateReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusCultivateReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusCultivateReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cultivate_id = 8;</code>
     * @return The cultivateId.
     */
    int getCultivateId();

    /**
     * <code>uint32 copy_step = 7;</code>
     * @return The copyStep.
     */
    int getCopyStep();

    /**
     * <code>uint32 exchange_step = 11;</code>
     * @return The exchangeStep.
     */
    int getExchangeStep();

    /**
     * <code>uint32 cultivate_step = 13;</code>
     * @return The cultivateStep.
     */
    int getCultivateStep();

    /**
     * <code>uint32 rotate_step = 15;</code>
     * @return The rotateStep.
     */
    int getRotateStep();

    /**
     * <code>uint32 undo_step = 6;</code>
     * @return The undoStep.
     */
    int getUndoStep();

    /**
     * <code>uint32 time = 2;</code>
     * @return The time.
     */
    int getTime();

    /**
     * <code>uint32 place_step = 10;</code>
     * @return The placeStep.
     */
    int getPlaceStep();
  }
  /**
   * <pre>
   * CmdId: 21749
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code FungusCultivateReq}
   */
  public static final class FungusCultivateReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusCultivateReq)
      FungusCultivateReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusCultivateReq.newBuilder() to construct.
    private FungusCultivateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusCultivateReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusCultivateReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.internal_static_FungusCultivateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.internal_static_FungusCultivateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq.class, emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq.Builder.class);
    }

    public static final int CULTIVATE_ID_FIELD_NUMBER = 8;
    private int cultivateId_;
    /**
     * <code>uint32 cultivate_id = 8;</code>
     * @return The cultivateId.
     */
    @java.lang.Override
    public int getCultivateId() {
      return cultivateId_;
    }

    public static final int COPY_STEP_FIELD_NUMBER = 7;
    private int copyStep_;
    /**
     * <code>uint32 copy_step = 7;</code>
     * @return The copyStep.
     */
    @java.lang.Override
    public int getCopyStep() {
      return copyStep_;
    }

    public static final int EXCHANGE_STEP_FIELD_NUMBER = 11;
    private int exchangeStep_;
    /**
     * <code>uint32 exchange_step = 11;</code>
     * @return The exchangeStep.
     */
    @java.lang.Override
    public int getExchangeStep() {
      return exchangeStep_;
    }

    public static final int CULTIVATE_STEP_FIELD_NUMBER = 13;
    private int cultivateStep_;
    /**
     * <code>uint32 cultivate_step = 13;</code>
     * @return The cultivateStep.
     */
    @java.lang.Override
    public int getCultivateStep() {
      return cultivateStep_;
    }

    public static final int ROTATE_STEP_FIELD_NUMBER = 15;
    private int rotateStep_;
    /**
     * <code>uint32 rotate_step = 15;</code>
     * @return The rotateStep.
     */
    @java.lang.Override
    public int getRotateStep() {
      return rotateStep_;
    }

    public static final int UNDO_STEP_FIELD_NUMBER = 6;
    private int undoStep_;
    /**
     * <code>uint32 undo_step = 6;</code>
     * @return The undoStep.
     */
    @java.lang.Override
    public int getUndoStep() {
      return undoStep_;
    }

    public static final int TIME_FIELD_NUMBER = 2;
    private int time_;
    /**
     * <code>uint32 time = 2;</code>
     * @return The time.
     */
    @java.lang.Override
    public int getTime() {
      return time_;
    }

    public static final int PLACE_STEP_FIELD_NUMBER = 10;
    private int placeStep_;
    /**
     * <code>uint32 place_step = 10;</code>
     * @return The placeStep.
     */
    @java.lang.Override
    public int getPlaceStep() {
      return placeStep_;
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
      if (time_ != 0) {
        output.writeUInt32(2, time_);
      }
      if (undoStep_ != 0) {
        output.writeUInt32(6, undoStep_);
      }
      if (copyStep_ != 0) {
        output.writeUInt32(7, copyStep_);
      }
      if (cultivateId_ != 0) {
        output.writeUInt32(8, cultivateId_);
      }
      if (placeStep_ != 0) {
        output.writeUInt32(10, placeStep_);
      }
      if (exchangeStep_ != 0) {
        output.writeUInt32(11, exchangeStep_);
      }
      if (cultivateStep_ != 0) {
        output.writeUInt32(13, cultivateStep_);
      }
      if (rotateStep_ != 0) {
        output.writeUInt32(15, rotateStep_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (time_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, time_);
      }
      if (undoStep_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, undoStep_);
      }
      if (copyStep_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, copyStep_);
      }
      if (cultivateId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, cultivateId_);
      }
      if (placeStep_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, placeStep_);
      }
      if (exchangeStep_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, exchangeStep_);
      }
      if (cultivateStep_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, cultivateStep_);
      }
      if (rotateStep_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, rotateStep_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq other = (emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq) obj;

      if (getCultivateId()
          != other.getCultivateId()) return false;
      if (getCopyStep()
          != other.getCopyStep()) return false;
      if (getExchangeStep()
          != other.getExchangeStep()) return false;
      if (getCultivateStep()
          != other.getCultivateStep()) return false;
      if (getRotateStep()
          != other.getRotateStep()) return false;
      if (getUndoStep()
          != other.getUndoStep()) return false;
      if (getTime()
          != other.getTime()) return false;
      if (getPlaceStep()
          != other.getPlaceStep()) return false;
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
      hash = (37 * hash) + CULTIVATE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCultivateId();
      hash = (37 * hash) + COPY_STEP_FIELD_NUMBER;
      hash = (53 * hash) + getCopyStep();
      hash = (37 * hash) + EXCHANGE_STEP_FIELD_NUMBER;
      hash = (53 * hash) + getExchangeStep();
      hash = (37 * hash) + CULTIVATE_STEP_FIELD_NUMBER;
      hash = (53 * hash) + getCultivateStep();
      hash = (37 * hash) + ROTATE_STEP_FIELD_NUMBER;
      hash = (53 * hash) + getRotateStep();
      hash = (37 * hash) + UNDO_STEP_FIELD_NUMBER;
      hash = (53 * hash) + getUndoStep();
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime();
      hash = (37 * hash) + PLACE_STEP_FIELD_NUMBER;
      hash = (53 * hash) + getPlaceStep();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq prototype) {
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
     * CmdId: 21749
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code FungusCultivateReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusCultivateReq)
        emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.internal_static_FungusCultivateReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.internal_static_FungusCultivateReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq.class, emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        cultivateId_ = 0;

        copyStep_ = 0;

        exchangeStep_ = 0;

        cultivateStep_ = 0;

        rotateStep_ = 0;

        undoStep_ = 0;

        time_ = 0;

        placeStep_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.internal_static_FungusCultivateReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq build() {
        emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq buildPartial() {
        emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq result = new emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq(this);
        result.cultivateId_ = cultivateId_;
        result.copyStep_ = copyStep_;
        result.exchangeStep_ = exchangeStep_;
        result.cultivateStep_ = cultivateStep_;
        result.rotateStep_ = rotateStep_;
        result.undoStep_ = undoStep_;
        result.time_ = time_;
        result.placeStep_ = placeStep_;
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
        if (other instanceof emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq other) {
        if (other == emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq.getDefaultInstance()) return this;
        if (other.getCultivateId() != 0) {
          setCultivateId(other.getCultivateId());
        }
        if (other.getCopyStep() != 0) {
          setCopyStep(other.getCopyStep());
        }
        if (other.getExchangeStep() != 0) {
          setExchangeStep(other.getExchangeStep());
        }
        if (other.getCultivateStep() != 0) {
          setCultivateStep(other.getCultivateStep());
        }
        if (other.getRotateStep() != 0) {
          setRotateStep(other.getRotateStep());
        }
        if (other.getUndoStep() != 0) {
          setUndoStep(other.getUndoStep());
        }
        if (other.getTime() != 0) {
          setTime(other.getTime());
        }
        if (other.getPlaceStep() != 0) {
          setPlaceStep(other.getPlaceStep());
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
                time_ = input.readUInt32();

                break;
              } // case 16
              case 48: {
                undoStep_ = input.readUInt32();

                break;
              } // case 48
              case 56: {
                copyStep_ = input.readUInt32();

                break;
              } // case 56
              case 64: {
                cultivateId_ = input.readUInt32();

                break;
              } // case 64
              case 80: {
                placeStep_ = input.readUInt32();

                break;
              } // case 80
              case 88: {
                exchangeStep_ = input.readUInt32();

                break;
              } // case 88
              case 104: {
                cultivateStep_ = input.readUInt32();

                break;
              } // case 104
              case 120: {
                rotateStep_ = input.readUInt32();

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

      private int cultivateId_ ;
      /**
       * <code>uint32 cultivate_id = 8;</code>
       * @return The cultivateId.
       */
      @java.lang.Override
      public int getCultivateId() {
        return cultivateId_;
      }
      /**
       * <code>uint32 cultivate_id = 8;</code>
       * @param value The cultivateId to set.
       * @return This builder for chaining.
       */
      public Builder setCultivateId(int value) {
        
        cultivateId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cultivate_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCultivateId() {
        
        cultivateId_ = 0;
        onChanged();
        return this;
      }

      private int copyStep_ ;
      /**
       * <code>uint32 copy_step = 7;</code>
       * @return The copyStep.
       */
      @java.lang.Override
      public int getCopyStep() {
        return copyStep_;
      }
      /**
       * <code>uint32 copy_step = 7;</code>
       * @param value The copyStep to set.
       * @return This builder for chaining.
       */
      public Builder setCopyStep(int value) {
        
        copyStep_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 copy_step = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCopyStep() {
        
        copyStep_ = 0;
        onChanged();
        return this;
      }

      private int exchangeStep_ ;
      /**
       * <code>uint32 exchange_step = 11;</code>
       * @return The exchangeStep.
       */
      @java.lang.Override
      public int getExchangeStep() {
        return exchangeStep_;
      }
      /**
       * <code>uint32 exchange_step = 11;</code>
       * @param value The exchangeStep to set.
       * @return This builder for chaining.
       */
      public Builder setExchangeStep(int value) {
        
        exchangeStep_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 exchange_step = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearExchangeStep() {
        
        exchangeStep_ = 0;
        onChanged();
        return this;
      }

      private int cultivateStep_ ;
      /**
       * <code>uint32 cultivate_step = 13;</code>
       * @return The cultivateStep.
       */
      @java.lang.Override
      public int getCultivateStep() {
        return cultivateStep_;
      }
      /**
       * <code>uint32 cultivate_step = 13;</code>
       * @param value The cultivateStep to set.
       * @return This builder for chaining.
       */
      public Builder setCultivateStep(int value) {
        
        cultivateStep_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cultivate_step = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCultivateStep() {
        
        cultivateStep_ = 0;
        onChanged();
        return this;
      }

      private int rotateStep_ ;
      /**
       * <code>uint32 rotate_step = 15;</code>
       * @return The rotateStep.
       */
      @java.lang.Override
      public int getRotateStep() {
        return rotateStep_;
      }
      /**
       * <code>uint32 rotate_step = 15;</code>
       * @param value The rotateStep to set.
       * @return This builder for chaining.
       */
      public Builder setRotateStep(int value) {
        
        rotateStep_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rotate_step = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRotateStep() {
        
        rotateStep_ = 0;
        onChanged();
        return this;
      }

      private int undoStep_ ;
      /**
       * <code>uint32 undo_step = 6;</code>
       * @return The undoStep.
       */
      @java.lang.Override
      public int getUndoStep() {
        return undoStep_;
      }
      /**
       * <code>uint32 undo_step = 6;</code>
       * @param value The undoStep to set.
       * @return This builder for chaining.
       */
      public Builder setUndoStep(int value) {
        
        undoStep_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 undo_step = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUndoStep() {
        
        undoStep_ = 0;
        onChanged();
        return this;
      }

      private int time_ ;
      /**
       * <code>uint32 time = 2;</code>
       * @return The time.
       */
      @java.lang.Override
      public int getTime() {
        return time_;
      }
      /**
       * <code>uint32 time = 2;</code>
       * @param value The time to set.
       * @return This builder for chaining.
       */
      public Builder setTime(int value) {
        
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTime() {
        
        time_ = 0;
        onChanged();
        return this;
      }

      private int placeStep_ ;
      /**
       * <code>uint32 place_step = 10;</code>
       * @return The placeStep.
       */
      @java.lang.Override
      public int getPlaceStep() {
        return placeStep_;
      }
      /**
       * <code>uint32 place_step = 10;</code>
       * @param value The placeStep to set.
       * @return This builder for chaining.
       */
      public Builder setPlaceStep(int value) {
        
        placeStep_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 place_step = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlaceStep() {
        
        placeStep_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FungusCultivateReq)
    }

    // @@protoc_insertion_point(class_scope:FungusCultivateReq)
    private static final emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq();
    }

    public static emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusCultivateReq>
        PARSER = new com.google.protobuf.AbstractParser<FungusCultivateReq>() {
      @java.lang.Override
      public FungusCultivateReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<FungusCultivateReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusCultivateReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.FungusCultivateReqOuterClass.FungusCultivateReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusCultivateReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusCultivateReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030FungusCultivateReq.proto\"\266\001\n\022FungusCul" +
      "tivateReq\022\024\n\014cultivate_id\030\010 \001(\r\022\021\n\tcopy_" +
      "step\030\007 \001(\r\022\025\n\rexchange_step\030\013 \001(\r\022\026\n\016cul" +
      "tivate_step\030\r \001(\r\022\023\n\013rotate_step\030\017 \001(\r\022\021" +
      "\n\tundo_step\030\006 \001(\r\022\014\n\004time\030\002 \001(\r\022\022\n\nplace" +
      "_step\030\n \001(\rB\036\n\034emu.grasscutter.net.oldpr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusCultivateReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusCultivateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusCultivateReq_descriptor,
        new java.lang.String[] { "CultivateId", "CopyStep", "ExchangeStep", "CultivateStep", "RotateStep", "UndoStep", "Time", "PlaceStep", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
