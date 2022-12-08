// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueDiaryDungeonSettleNotify.proto

package emu.grasscutter.net.newproto;

public final class RogueDiaryDungeonSettleNotifyOuterClass {
  private RogueDiaryDungeonSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueDiaryDungeonSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueDiaryDungeonSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finish = 14;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>uint32 cur_round = 11;</code>
     * @return The curRound.
     */
    int getCurRound();

    /**
     * <code>uint32 explore_time = 4;</code>
     * @return The exploreTime.
     */
    int getExploreTime();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8726;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code RogueDiaryDungeonSettleNotify}
   */
  public static final class RogueDiaryDungeonSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueDiaryDungeonSettleNotify)
      RogueDiaryDungeonSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueDiaryDungeonSettleNotify.newBuilder() to construct.
    private RogueDiaryDungeonSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueDiaryDungeonSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueDiaryDungeonSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.internal_static_RogueDiaryDungeonSettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.internal_static_RogueDiaryDungeonSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify.class, emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify.Builder.class);
    }

    public static final int IS_FINISH_FIELD_NUMBER = 14;
    private boolean isFinish_;
    /**
     * <code>bool is_finish = 14;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int CUR_ROUND_FIELD_NUMBER = 11;
    private int curRound_;
    /**
     * <code>uint32 cur_round = 11;</code>
     * @return The curRound.
     */
    @java.lang.Override
    public int getCurRound() {
      return curRound_;
    }

    public static final int EXPLORE_TIME_FIELD_NUMBER = 4;
    private int exploreTime_;
    /**
     * <code>uint32 explore_time = 4;</code>
     * @return The exploreTime.
     */
    @java.lang.Override
    public int getExploreTime() {
      return exploreTime_;
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
      if (exploreTime_ != 0) {
        output.writeUInt32(4, exploreTime_);
      }
      if (curRound_ != 0) {
        output.writeUInt32(11, curRound_);
      }
      if (isFinish_ != false) {
        output.writeBool(14, isFinish_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (exploreTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, exploreTime_);
      }
      if (curRound_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, curRound_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isFinish_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify other = (emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify) obj;

      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getCurRound()
          != other.getCurRound()) return false;
      if (getExploreTime()
          != other.getExploreTime()) return false;
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
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + CUR_ROUND_FIELD_NUMBER;
      hash = (53 * hash) + getCurRound();
      hash = (37 * hash) + EXPLORE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getExploreTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 8726;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code RogueDiaryDungeonSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueDiaryDungeonSettleNotify)
        emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.internal_static_RogueDiaryDungeonSettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.internal_static_RogueDiaryDungeonSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify.class, emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isFinish_ = false;

        curRound_ = 0;

        exploreTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.internal_static_RogueDiaryDungeonSettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify build() {
        emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify buildPartial() {
        emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify result = new emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify(this);
        result.isFinish_ = isFinish_;
        result.curRound_ = curRound_;
        result.exploreTime_ = exploreTime_;
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
        if (other instanceof emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify other) {
        if (other == emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify.getDefaultInstance()) return this;
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getCurRound() != 0) {
          setCurRound(other.getCurRound());
        }
        if (other.getExploreTime() != 0) {
          setExploreTime(other.getExploreTime());
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
              case 32: {
                exploreTime_ = input.readUInt32();

                break;
              } // case 32
              case 88: {
                curRound_ = input.readUInt32();

                break;
              } // case 88
              case 112: {
                isFinish_ = input.readBool();

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

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 14;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 14;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {
        
        isFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        
        isFinish_ = false;
        onChanged();
        return this;
      }

      private int curRound_ ;
      /**
       * <code>uint32 cur_round = 11;</code>
       * @return The curRound.
       */
      @java.lang.Override
      public int getCurRound() {
        return curRound_;
      }
      /**
       * <code>uint32 cur_round = 11;</code>
       * @param value The curRound to set.
       * @return This builder for chaining.
       */
      public Builder setCurRound(int value) {
        
        curRound_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_round = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurRound() {
        
        curRound_ = 0;
        onChanged();
        return this;
      }

      private int exploreTime_ ;
      /**
       * <code>uint32 explore_time = 4;</code>
       * @return The exploreTime.
       */
      @java.lang.Override
      public int getExploreTime() {
        return exploreTime_;
      }
      /**
       * <code>uint32 explore_time = 4;</code>
       * @param value The exploreTime to set.
       * @return This builder for chaining.
       */
      public Builder setExploreTime(int value) {
        
        exploreTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 explore_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearExploreTime() {
        
        exploreTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RogueDiaryDungeonSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:RogueDiaryDungeonSettleNotify)
    private static final emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify();
    }

    public static emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueDiaryDungeonSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<RogueDiaryDungeonSettleNotify>() {
      @java.lang.Override
      public RogueDiaryDungeonSettleNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<RogueDiaryDungeonSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueDiaryDungeonSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.RogueDiaryDungeonSettleNotifyOuterClass.RogueDiaryDungeonSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueDiaryDungeonSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueDiaryDungeonSettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#RogueDiaryDungeonSettleNotify.proto\"[\n" +
      "\035RogueDiaryDungeonSettleNotify\022\021\n\tis_fin" +
      "ish\030\016 \001(\010\022\021\n\tcur_round\030\013 \001(\r\022\024\n\014explore_" +
      "time\030\004 \001(\rB\036\n\034emu.grasscutter.net.newpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RogueDiaryDungeonSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueDiaryDungeonSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueDiaryDungeonSettleNotify_descriptor,
        new java.lang.String[] { "IsFinish", "CurRound", "ExploreTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
