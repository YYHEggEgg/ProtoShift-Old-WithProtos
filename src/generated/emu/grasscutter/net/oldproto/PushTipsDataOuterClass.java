// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PushTipsData.proto

package emu.grasscutter.net.oldproto;

public final class PushTipsDataOuterClass {
  private PushTipsDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PushTipsDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PushTipsData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 push_tips_id = 13;</code>
     * @return The pushTipsId.
     */
    int getPushTipsId();

    /**
     * <code>uint32 state = 4;</code>
     * @return The state.
     */
    int getState();
  }
  /**
   * Protobuf type {@code PushTipsData}
   */
  public static final class PushTipsData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PushTipsData)
      PushTipsDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PushTipsData.newBuilder() to construct.
    private PushTipsData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PushTipsData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PushTipsData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.PushTipsDataOuterClass.internal_static_PushTipsData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.PushTipsDataOuterClass.internal_static_PushTipsData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData.class, emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData.Builder.class);
    }

    public static final int PUSH_TIPS_ID_FIELD_NUMBER = 13;
    private int pushTipsId_;
    /**
     * <code>uint32 push_tips_id = 13;</code>
     * @return The pushTipsId.
     */
    @java.lang.Override
    public int getPushTipsId() {
      return pushTipsId_;
    }

    public static final int STATE_FIELD_NUMBER = 4;
    private int state_;
    /**
     * <code>uint32 state = 4;</code>
     * @return The state.
     */
    @java.lang.Override
    public int getState() {
      return state_;
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
      if (state_ != 0) {
        output.writeUInt32(4, state_);
      }
      if (pushTipsId_ != 0) {
        output.writeUInt32(13, pushTipsId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (state_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, state_);
      }
      if (pushTipsId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, pushTipsId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData other = (emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData) obj;

      if (getPushTipsId()
          != other.getPushTipsId()) return false;
      if (getState()
          != other.getState()) return false;
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
      hash = (37 * hash) + PUSH_TIPS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPushTipsId();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData prototype) {
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
     * Protobuf type {@code PushTipsData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PushTipsData)
        emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PushTipsDataOuterClass.internal_static_PushTipsData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.PushTipsDataOuterClass.internal_static_PushTipsData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData.class, emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        pushTipsId_ = 0;

        state_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.PushTipsDataOuterClass.internal_static_PushTipsData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData build() {
        emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData buildPartial() {
        emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData result = new emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData(this);
        result.pushTipsId_ = pushTipsId_;
        result.state_ = state_;
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
        if (other instanceof emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData) {
          return mergeFrom((emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData other) {
        if (other == emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData.getDefaultInstance()) return this;
        if (other.getPushTipsId() != 0) {
          setPushTipsId(other.getPushTipsId());
        }
        if (other.getState() != 0) {
          setState(other.getState());
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
                state_ = input.readUInt32();

                break;
              } // case 32
              case 104: {
                pushTipsId_ = input.readUInt32();

                break;
              } // case 104
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

      private int pushTipsId_ ;
      /**
       * <code>uint32 push_tips_id = 13;</code>
       * @return The pushTipsId.
       */
      @java.lang.Override
      public int getPushTipsId() {
        return pushTipsId_;
      }
      /**
       * <code>uint32 push_tips_id = 13;</code>
       * @param value The pushTipsId to set.
       * @return This builder for chaining.
       */
      public Builder setPushTipsId(int value) {
        
        pushTipsId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 push_tips_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearPushTipsId() {
        
        pushTipsId_ = 0;
        onChanged();
        return this;
      }

      private int state_ ;
      /**
       * <code>uint32 state = 4;</code>
       * @return The state.
       */
      @java.lang.Override
      public int getState() {
        return state_;
      }
      /**
       * <code>uint32 state = 4;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 state = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PushTipsData)
    }

    // @@protoc_insertion_point(class_scope:PushTipsData)
    private static final emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData();
    }

    public static emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PushTipsData>
        PARSER = new com.google.protobuf.AbstractParser<PushTipsData>() {
      @java.lang.Override
      public PushTipsData parsePartialFrom(
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

    public static com.google.protobuf.Parser<PushTipsData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PushTipsData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.PushTipsDataOuterClass.PushTipsData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PushTipsData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PushTipsData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022PushTipsData.proto\"3\n\014PushTipsData\022\024\n\014" +
      "push_tips_id\030\r \001(\r\022\r\n\005state\030\004 \001(\rB\036\n\034emu" +
      ".grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PushTipsData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PushTipsData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PushTipsData_descriptor,
        new java.lang.String[] { "PushTipsId", "State", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
