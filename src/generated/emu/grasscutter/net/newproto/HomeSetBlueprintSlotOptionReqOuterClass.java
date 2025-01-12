// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeSetBlueprintSlotOptionReq.proto

package emu.grasscutter.net.newproto;

public final class HomeSetBlueprintSlotOptionReqOuterClass {
  private HomeSetBlueprintSlotOptionReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeSetBlueprintSlotOptionReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeSetBlueprintSlotOptionReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 slot_id = 3;</code>
     * @return The slotId.
     */
    int getSlotId();

    /**
     * <code>bool is_allow_copy = 8;</code>
     * @return The isAllowCopy.
     */
    boolean getIsAllowCopy();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4491;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HomeSetBlueprintSlotOptionReq}
   */
  public static final class HomeSetBlueprintSlotOptionReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeSetBlueprintSlotOptionReq)
      HomeSetBlueprintSlotOptionReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeSetBlueprintSlotOptionReq.newBuilder() to construct.
    private HomeSetBlueprintSlotOptionReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeSetBlueprintSlotOptionReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeSetBlueprintSlotOptionReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.internal_static_HomeSetBlueprintSlotOptionReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.internal_static_HomeSetBlueprintSlotOptionReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq.class, emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq.Builder.class);
    }

    public static final int SLOT_ID_FIELD_NUMBER = 3;
    private int slotId_;
    /**
     * <code>uint32 slot_id = 3;</code>
     * @return The slotId.
     */
    @java.lang.Override
    public int getSlotId() {
      return slotId_;
    }

    public static final int IS_ALLOW_COPY_FIELD_NUMBER = 8;
    private boolean isAllowCopy_;
    /**
     * <code>bool is_allow_copy = 8;</code>
     * @return The isAllowCopy.
     */
    @java.lang.Override
    public boolean getIsAllowCopy() {
      return isAllowCopy_;
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
      if (slotId_ != 0) {
        output.writeUInt32(3, slotId_);
      }
      if (isAllowCopy_ != false) {
        output.writeBool(8, isAllowCopy_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (slotId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, slotId_);
      }
      if (isAllowCopy_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isAllowCopy_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq other = (emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq) obj;

      if (getSlotId()
          != other.getSlotId()) return false;
      if (getIsAllowCopy()
          != other.getIsAllowCopy()) return false;
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
      hash = (37 * hash) + SLOT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSlotId();
      hash = (37 * hash) + IS_ALLOW_COPY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAllowCopy());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq prototype) {
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
     *   CMD_ID = 4491;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HomeSetBlueprintSlotOptionReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeSetBlueprintSlotOptionReq)
        emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.internal_static_HomeSetBlueprintSlotOptionReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.internal_static_HomeSetBlueprintSlotOptionReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq.class, emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        slotId_ = 0;

        isAllowCopy_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.internal_static_HomeSetBlueprintSlotOptionReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq build() {
        emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq buildPartial() {
        emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq result = new emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq(this);
        result.slotId_ = slotId_;
        result.isAllowCopy_ = isAllowCopy_;
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
        if (other instanceof emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq) {
          return mergeFrom((emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq other) {
        if (other == emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq.getDefaultInstance()) return this;
        if (other.getSlotId() != 0) {
          setSlotId(other.getSlotId());
        }
        if (other.getIsAllowCopy() != false) {
          setIsAllowCopy(other.getIsAllowCopy());
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
              case 24: {
                slotId_ = input.readUInt32();

                break;
              } // case 24
              case 64: {
                isAllowCopy_ = input.readBool();

                break;
              } // case 64
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

      private int slotId_ ;
      /**
       * <code>uint32 slot_id = 3;</code>
       * @return The slotId.
       */
      @java.lang.Override
      public int getSlotId() {
        return slotId_;
      }
      /**
       * <code>uint32 slot_id = 3;</code>
       * @param value The slotId to set.
       * @return This builder for chaining.
       */
      public Builder setSlotId(int value) {
        
        slotId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slot_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlotId() {
        
        slotId_ = 0;
        onChanged();
        return this;
      }

      private boolean isAllowCopy_ ;
      /**
       * <code>bool is_allow_copy = 8;</code>
       * @return The isAllowCopy.
       */
      @java.lang.Override
      public boolean getIsAllowCopy() {
        return isAllowCopy_;
      }
      /**
       * <code>bool is_allow_copy = 8;</code>
       * @param value The isAllowCopy to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllowCopy(boolean value) {
        
        isAllowCopy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_allow_copy = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllowCopy() {
        
        isAllowCopy_ = false;
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


      // @@protoc_insertion_point(builder_scope:HomeSetBlueprintSlotOptionReq)
    }

    // @@protoc_insertion_point(class_scope:HomeSetBlueprintSlotOptionReq)
    private static final emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq();
    }

    public static emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeSetBlueprintSlotOptionReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeSetBlueprintSlotOptionReq>() {
      @java.lang.Override
      public HomeSetBlueprintSlotOptionReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeSetBlueprintSlotOptionReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeSetBlueprintSlotOptionReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.HomeSetBlueprintSlotOptionReqOuterClass.HomeSetBlueprintSlotOptionReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSetBlueprintSlotOptionReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSetBlueprintSlotOptionReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#HomeSetBlueprintSlotOptionReq.proto\"G\n" +
      "\035HomeSetBlueprintSlotOptionReq\022\017\n\007slot_i" +
      "d\030\003 \001(\r\022\025\n\ris_allow_copy\030\010 \001(\010B\036\n\034emu.gr" +
      "asscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeSetBlueprintSlotOptionReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeSetBlueprintSlotOptionReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeSetBlueprintSlotOptionReq_descriptor,
        new java.lang.String[] { "SlotId", "IsAllowCopy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
