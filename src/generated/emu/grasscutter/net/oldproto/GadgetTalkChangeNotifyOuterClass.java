// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetTalkChangeNotify.proto

package emu.grasscutter.net.oldproto;

public final class GadgetTalkChangeNotifyOuterClass {
  private GadgetTalkChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GadgetTalkChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GadgetTalkChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gadget_entity_id = 5;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>uint32 cur_gadget_talk_state = 15;</code>
     * @return The curGadgetTalkState.
     */
    int getCurGadgetTalkState();
  }
  /**
   * <pre>
   * CmdId: 839
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GadgetTalkChangeNotify}
   */
  public static final class GadgetTalkChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GadgetTalkChangeNotify)
      GadgetTalkChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GadgetTalkChangeNotify.newBuilder() to construct.
    private GadgetTalkChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GadgetTalkChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GadgetTalkChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.internal_static_GadgetTalkChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.internal_static_GadgetTalkChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify.class, emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify.Builder.class);
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

    public static final int CUR_GADGET_TALK_STATE_FIELD_NUMBER = 15;
    private int curGadgetTalkState_;
    /**
     * <code>uint32 cur_gadget_talk_state = 15;</code>
     * @return The curGadgetTalkState.
     */
    @java.lang.Override
    public int getCurGadgetTalkState() {
      return curGadgetTalkState_;
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
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(5, gadgetEntityId_);
      }
      if (curGadgetTalkState_ != 0) {
        output.writeUInt32(15, curGadgetTalkState_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, gadgetEntityId_);
      }
      if (curGadgetTalkState_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, curGadgetTalkState_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify other = (emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify) obj;

      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (getCurGadgetTalkState()
          != other.getCurGadgetTalkState()) return false;
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
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + CUR_GADGET_TALK_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getCurGadgetTalkState();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify prototype) {
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
     * CmdId: 839
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GadgetTalkChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GadgetTalkChangeNotify)
        emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.internal_static_GadgetTalkChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.internal_static_GadgetTalkChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify.class, emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        gadgetEntityId_ = 0;

        curGadgetTalkState_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.internal_static_GadgetTalkChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify build() {
        emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify buildPartial() {
        emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify result = new emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify(this);
        result.gadgetEntityId_ = gadgetEntityId_;
        result.curGadgetTalkState_ = curGadgetTalkState_;
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
        if (other instanceof emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify other) {
        if (other == emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify.getDefaultInstance()) return this;
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.getCurGadgetTalkState() != 0) {
          setCurGadgetTalkState(other.getCurGadgetTalkState());
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
                gadgetEntityId_ = input.readUInt32();

                break;
              } // case 40
              case 120: {
                curGadgetTalkState_ = input.readUInt32();

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

      private int curGadgetTalkState_ ;
      /**
       * <code>uint32 cur_gadget_talk_state = 15;</code>
       * @return The curGadgetTalkState.
       */
      @java.lang.Override
      public int getCurGadgetTalkState() {
        return curGadgetTalkState_;
      }
      /**
       * <code>uint32 cur_gadget_talk_state = 15;</code>
       * @param value The curGadgetTalkState to set.
       * @return This builder for chaining.
       */
      public Builder setCurGadgetTalkState(int value) {
        
        curGadgetTalkState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_gadget_talk_state = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurGadgetTalkState() {
        
        curGadgetTalkState_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GadgetTalkChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:GadgetTalkChangeNotify)
    private static final emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify();
    }

    public static emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GadgetTalkChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<GadgetTalkChangeNotify>() {
      @java.lang.Override
      public GadgetTalkChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GadgetTalkChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GadgetTalkChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.GadgetTalkChangeNotifyOuterClass.GadgetTalkChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GadgetTalkChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GadgetTalkChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GadgetTalkChangeNotify.proto\"Q\n\026Gadget" +
      "TalkChangeNotify\022\030\n\020gadget_entity_id\030\005 \001" +
      "(\r\022\035\n\025cur_gadget_talk_state\030\017 \001(\rB\036\n\034emu" +
      ".grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GadgetTalkChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GadgetTalkChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GadgetTalkChangeNotify_descriptor,
        new java.lang.String[] { "GadgetEntityId", "CurGadgetTalkState", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
