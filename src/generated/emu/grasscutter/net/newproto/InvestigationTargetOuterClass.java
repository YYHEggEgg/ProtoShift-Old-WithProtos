// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InvestigationTarget.proto

package emu.grasscutter.net.newproto;

public final class InvestigationTargetOuterClass {
  private InvestigationTargetOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InvestigationTargetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InvestigationTarget)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 investigation_id = 8;</code>
     * @return The investigationId.
     */
    int getInvestigationId();

    /**
     * <code>uint32 quest_id = 6;</code>
     * @return The questId.
     */
    int getQuestId();

    /**
     * <code>.InvestigationTarget.State state = 2;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.InvestigationTarget.State state = 2;</code>
     * @return The state.
     */
    emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.State getState();

    /**
     * <code>uint32 total_progress = 5;</code>
     * @return The totalProgress.
     */
    int getTotalProgress();

    /**
     * <code>uint32 progress = 15;</code>
     * @return The progress.
     */
    int getProgress();
  }
  /**
   * Protobuf type {@code InvestigationTarget}
   */
  public static final class InvestigationTarget extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InvestigationTarget)
      InvestigationTargetOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InvestigationTarget.newBuilder() to construct.
    private InvestigationTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InvestigationTarget() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InvestigationTarget();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.class, emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.Builder.class);
    }

    /**
     * Protobuf enum {@code InvestigationTarget.State}
     */
    public enum State
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>STATE_INVALID = 0;</code>
       */
      STATE_INVALID(0),
      /**
       * <code>STATE_IN_PROGRESS = 1;</code>
       */
      STATE_IN_PROGRESS(1),
      /**
       * <code>STATE_COMPLETE = 2;</code>
       */
      STATE_COMPLETE(2),
      /**
       * <code>STATE_REWARD_TAKEN = 3;</code>
       */
      STATE_REWARD_TAKEN(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>STATE_INVALID = 0;</code>
       */
      public static final int STATE_INVALID_VALUE = 0;
      /**
       * <code>STATE_IN_PROGRESS = 1;</code>
       */
      public static final int STATE_IN_PROGRESS_VALUE = 1;
      /**
       * <code>STATE_COMPLETE = 2;</code>
       */
      public static final int STATE_COMPLETE_VALUE = 2;
      /**
       * <code>STATE_REWARD_TAKEN = 3;</code>
       */
      public static final int STATE_REWARD_TAKEN_VALUE = 3;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static State valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static State forNumber(int value) {
        switch (value) {
          case 0: return STATE_INVALID;
          case 1: return STATE_IN_PROGRESS;
          case 2: return STATE_COMPLETE;
          case 3: return STATE_REWARD_TAKEN;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<State>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          State> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<State>() {
              public State findValueByNumber(int number) {
                return State.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.getDescriptor().getEnumTypes().get(0);
      }

      private static final State[] VALUES = values();

      public static State valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private State(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:InvestigationTarget.State)
    }

    public static final int INVESTIGATION_ID_FIELD_NUMBER = 8;
    private int investigationId_;
    /**
     * <code>uint32 investigation_id = 8;</code>
     * @return The investigationId.
     */
    @java.lang.Override
    public int getInvestigationId() {
      return investigationId_;
    }

    public static final int QUEST_ID_FIELD_NUMBER = 6;
    private int questId_;
    /**
     * <code>uint32 quest_id = 6;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
    }

    public static final int STATE_FIELD_NUMBER = 2;
    private int state_;
    /**
     * <code>.InvestigationTarget.State state = 2;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.InvestigationTarget.State state = 2;</code>
     * @return The state.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.State getState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.State result = emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.State.valueOf(state_);
      return result == null ? emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.State.UNRECOGNIZED : result;
    }

    public static final int TOTAL_PROGRESS_FIELD_NUMBER = 5;
    private int totalProgress_;
    /**
     * <code>uint32 total_progress = 5;</code>
     * @return The totalProgress.
     */
    @java.lang.Override
    public int getTotalProgress() {
      return totalProgress_;
    }

    public static final int PROGRESS_FIELD_NUMBER = 15;
    private int progress_;
    /**
     * <code>uint32 progress = 15;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
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
      if (state_ != emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.State.STATE_INVALID.getNumber()) {
        output.writeEnum(2, state_);
      }
      if (totalProgress_ != 0) {
        output.writeUInt32(5, totalProgress_);
      }
      if (questId_ != 0) {
        output.writeUInt32(6, questId_);
      }
      if (investigationId_ != 0) {
        output.writeUInt32(8, investigationId_);
      }
      if (progress_ != 0) {
        output.writeUInt32(15, progress_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (state_ != emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.State.STATE_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, state_);
      }
      if (totalProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, totalProgress_);
      }
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, questId_);
      }
      if (investigationId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, investigationId_);
      }
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, progress_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget other = (emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget) obj;

      if (getInvestigationId()
          != other.getInvestigationId()) return false;
      if (getQuestId()
          != other.getQuestId()) return false;
      if (state_ != other.state_) return false;
      if (getTotalProgress()
          != other.getTotalProgress()) return false;
      if (getProgress()
          != other.getProgress()) return false;
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
      hash = (37 * hash) + INVESTIGATION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInvestigationId();
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (37 * hash) + TOTAL_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getTotalProgress();
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget prototype) {
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
     * Protobuf type {@code InvestigationTarget}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InvestigationTarget)
        emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTargetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.class, emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        investigationId_ = 0;

        questId_ = 0;

        state_ = 0;

        totalProgress_ = 0;

        progress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget build() {
        emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget buildPartial() {
        emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget result = new emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget(this);
        result.investigationId_ = investigationId_;
        result.questId_ = questId_;
        result.state_ = state_;
        result.totalProgress_ = totalProgress_;
        result.progress_ = progress_;
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
        if (other instanceof emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget) {
          return mergeFrom((emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget other) {
        if (other == emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.getDefaultInstance()) return this;
        if (other.getInvestigationId() != 0) {
          setInvestigationId(other.getInvestigationId());
        }
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
        }
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
        }
        if (other.getTotalProgress() != 0) {
          setTotalProgress(other.getTotalProgress());
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
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
                state_ = input.readEnum();

                break;
              } // case 16
              case 40: {
                totalProgress_ = input.readUInt32();

                break;
              } // case 40
              case 48: {
                questId_ = input.readUInt32();

                break;
              } // case 48
              case 64: {
                investigationId_ = input.readUInt32();

                break;
              } // case 64
              case 120: {
                progress_ = input.readUInt32();

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

      private int investigationId_ ;
      /**
       * <code>uint32 investigation_id = 8;</code>
       * @return The investigationId.
       */
      @java.lang.Override
      public int getInvestigationId() {
        return investigationId_;
      }
      /**
       * <code>uint32 investigation_id = 8;</code>
       * @param value The investigationId to set.
       * @return This builder for chaining.
       */
      public Builder setInvestigationId(int value) {
        
        investigationId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 investigation_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearInvestigationId() {
        
        investigationId_ = 0;
        onChanged();
        return this;
      }

      private int questId_ ;
      /**
       * <code>uint32 quest_id = 6;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 quest_id = 6;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {
        
        questId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        
        questId_ = 0;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.InvestigationTarget.State state = 2;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.InvestigationTarget.State state = 2;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.InvestigationTarget.State state = 2;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.State getState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.State result = emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.State.valueOf(state_);
        return result == null ? emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.State.UNRECOGNIZED : result;
      }
      /**
       * <code>.InvestigationTarget.State state = 2;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget.State value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.InvestigationTarget.State state = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
        onChanged();
        return this;
      }

      private int totalProgress_ ;
      /**
       * <code>uint32 total_progress = 5;</code>
       * @return The totalProgress.
       */
      @java.lang.Override
      public int getTotalProgress() {
        return totalProgress_;
      }
      /**
       * <code>uint32 total_progress = 5;</code>
       * @param value The totalProgress to set.
       * @return This builder for chaining.
       */
      public Builder setTotalProgress(int value) {
        
        totalProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_progress = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalProgress() {
        
        totalProgress_ = 0;
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 15;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 15;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        
        progress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InvestigationTarget)
    }

    // @@protoc_insertion_point(class_scope:InvestigationTarget)
    private static final emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget();
    }

    public static emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InvestigationTarget>
        PARSER = new com.google.protobuf.AbstractParser<InvestigationTarget>() {
      @java.lang.Override
      public InvestigationTarget parsePartialFrom(
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

    public static com.google.protobuf.Parser<InvestigationTarget> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InvestigationTarget> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.InvestigationTargetOuterClass.InvestigationTarget getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InvestigationTarget_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InvestigationTarget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031InvestigationTarget.proto\"\365\001\n\023Investig" +
      "ationTarget\022\030\n\020investigation_id\030\010 \001(\r\022\020\n" +
      "\010quest_id\030\006 \001(\r\022)\n\005state\030\002 \001(\0162\032.Investi" +
      "gationTarget.State\022\026\n\016total_progress\030\005 \001" +
      "(\r\022\020\n\010progress\030\017 \001(\r\"]\n\005State\022\021\n\rSTATE_I" +
      "NVALID\020\000\022\025\n\021STATE_IN_PROGRESS\020\001\022\022\n\016STATE" +
      "_COMPLETE\020\002\022\026\n\022STATE_REWARD_TAKEN\020\003B\036\n\034e" +
      "mu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InvestigationTarget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InvestigationTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InvestigationTarget_descriptor,
        new java.lang.String[] { "InvestigationId", "QuestId", "State", "TotalProgress", "Progress", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
