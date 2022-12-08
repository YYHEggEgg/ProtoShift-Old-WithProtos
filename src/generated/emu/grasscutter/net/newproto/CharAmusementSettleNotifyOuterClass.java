// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CharAmusementSettleNotify.proto

package emu.grasscutter.net.newproto;

public final class CharAmusementSettleNotifyOuterClass {
  private CharAmusementSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CharAmusementSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CharAmusementSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_new_record = 10;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 finish_time = 2;</code>
     * @return The finishTime.
     */
    int getFinishTime();

    /**
     * <code>bool is_succ = 12;</code>
     * @return The isSucc.
     */
    boolean getIsSucc();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 23128;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code CharAmusementSettleNotify}
   */
  public static final class CharAmusementSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CharAmusementSettleNotify)
      CharAmusementSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CharAmusementSettleNotify.newBuilder() to construct.
    private CharAmusementSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CharAmusementSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CharAmusementSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.internal_static_CharAmusementSettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.internal_static_CharAmusementSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify.class, emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify.Builder.class);
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 10;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 10;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int FINISH_TIME_FIELD_NUMBER = 2;
    private int finishTime_;
    /**
     * <code>uint32 finish_time = 2;</code>
     * @return The finishTime.
     */
    @java.lang.Override
    public int getFinishTime() {
      return finishTime_;
    }

    public static final int IS_SUCC_FIELD_NUMBER = 12;
    private boolean isSucc_;
    /**
     * <code>bool is_succ = 12;</code>
     * @return The isSucc.
     */
    @java.lang.Override
    public boolean getIsSucc() {
      return isSucc_;
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
      if (finishTime_ != 0) {
        output.writeUInt32(2, finishTime_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(10, isNewRecord_);
      }
      if (isSucc_ != false) {
        output.writeBool(12, isSucc_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (finishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, finishTime_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isNewRecord_);
      }
      if (isSucc_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isSucc_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify other = (emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify) obj;

      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getFinishTime()
          != other.getFinishTime()) return false;
      if (getIsSucc()
          != other.getIsSucc()) return false;
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
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getFinishTime();
      hash = (37 * hash) + IS_SUCC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSucc());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify prototype) {
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
     *   CMD_ID = 23128;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code CharAmusementSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CharAmusementSettleNotify)
        emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.internal_static_CharAmusementSettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.internal_static_CharAmusementSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify.class, emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isNewRecord_ = false;

        finishTime_ = 0;

        isSucc_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.internal_static_CharAmusementSettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify build() {
        emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify buildPartial() {
        emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify result = new emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify(this);
        result.isNewRecord_ = isNewRecord_;
        result.finishTime_ = finishTime_;
        result.isSucc_ = isSucc_;
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
        if (other instanceof emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify other) {
        if (other == emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify.getDefaultInstance()) return this;
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getFinishTime() != 0) {
          setFinishTime(other.getFinishTime());
        }
        if (other.getIsSucc() != false) {
          setIsSucc(other.getIsSucc());
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
                finishTime_ = input.readUInt32();

                break;
              } // case 16
              case 80: {
                isNewRecord_ = input.readBool();

                break;
              } // case 80
              case 96: {
                isSucc_ = input.readBool();

                break;
              } // case 96
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

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 10;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 10;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int finishTime_ ;
      /**
       * <code>uint32 finish_time = 2;</code>
       * @return The finishTime.
       */
      @java.lang.Override
      public int getFinishTime() {
        return finishTime_;
      }
      /**
       * <code>uint32 finish_time = 2;</code>
       * @param value The finishTime to set.
       * @return This builder for chaining.
       */
      public Builder setFinishTime(int value) {
        
        finishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishTime() {
        
        finishTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isSucc_ ;
      /**
       * <code>bool is_succ = 12;</code>
       * @return The isSucc.
       */
      @java.lang.Override
      public boolean getIsSucc() {
        return isSucc_;
      }
      /**
       * <code>bool is_succ = 12;</code>
       * @param value The isSucc to set.
       * @return This builder for chaining.
       */
      public Builder setIsSucc(boolean value) {
        
        isSucc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_succ = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSucc() {
        
        isSucc_ = false;
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


      // @@protoc_insertion_point(builder_scope:CharAmusementSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:CharAmusementSettleNotify)
    private static final emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify();
    }

    public static emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CharAmusementSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<CharAmusementSettleNotify>() {
      @java.lang.Override
      public CharAmusementSettleNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<CharAmusementSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CharAmusementSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.CharAmusementSettleNotifyOuterClass.CharAmusementSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CharAmusementSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CharAmusementSettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037CharAmusementSettleNotify.proto\"X\n\031Cha" +
      "rAmusementSettleNotify\022\025\n\ris_new_record\030" +
      "\n \001(\010\022\023\n\013finish_time\030\002 \001(\r\022\017\n\007is_succ\030\014 " +
      "\001(\010B\036\n\034emu.grasscutter.net.newprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CharAmusementSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CharAmusementSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CharAmusementSettleNotify_descriptor,
        new java.lang.String[] { "IsNewRecord", "FinishTime", "IsSucc", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
