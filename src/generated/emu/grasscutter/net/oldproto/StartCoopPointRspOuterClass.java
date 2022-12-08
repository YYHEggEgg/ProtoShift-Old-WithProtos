// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StartCoopPointRsp.proto

package emu.grasscutter.net.oldproto;

public final class StartCoopPointRspOuterClass {
  private StartCoopPointRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StartCoopPointRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StartCoopPointRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_start = 9;</code>
     * @return The isStart.
     */
    boolean getIsStart();

    /**
     * <code>.MainCoop start_main_coop = 15;</code>
     * @return Whether the startMainCoop field is set.
     */
    boolean hasStartMainCoop();
    /**
     * <code>.MainCoop start_main_coop = 15;</code>
     * @return The startMainCoop.
     */
    emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop getStartMainCoop();
    /**
     * <code>.MainCoop start_main_coop = 15;</code>
     */
    emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoopOrBuilder getStartMainCoopOrBuilder();

    /**
     * <code>uint32 coop_point = 13;</code>
     * @return The coopPoint.
     */
    int getCoopPoint();

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 1964
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code StartCoopPointRsp}
   */
  public static final class StartCoopPointRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StartCoopPointRsp)
      StartCoopPointRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StartCoopPointRsp.newBuilder() to construct.
    private StartCoopPointRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StartCoopPointRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StartCoopPointRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp.class, emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp.Builder.class);
    }

    public static final int IS_START_FIELD_NUMBER = 9;
    private boolean isStart_;
    /**
     * <code>bool is_start = 9;</code>
     * @return The isStart.
     */
    @java.lang.Override
    public boolean getIsStart() {
      return isStart_;
    }

    public static final int START_MAIN_COOP_FIELD_NUMBER = 15;
    private emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop startMainCoop_;
    /**
     * <code>.MainCoop start_main_coop = 15;</code>
     * @return Whether the startMainCoop field is set.
     */
    @java.lang.Override
    public boolean hasStartMainCoop() {
      return startMainCoop_ != null;
    }
    /**
     * <code>.MainCoop start_main_coop = 15;</code>
     * @return The startMainCoop.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop getStartMainCoop() {
      return startMainCoop_ == null ? emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop.getDefaultInstance() : startMainCoop_;
    }
    /**
     * <code>.MainCoop start_main_coop = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoopOrBuilder getStartMainCoopOrBuilder() {
      return getStartMainCoop();
    }

    public static final int COOP_POINT_FIELD_NUMBER = 13;
    private int coopPoint_;
    /**
     * <code>uint32 coop_point = 13;</code>
     * @return The coopPoint.
     */
    @java.lang.Override
    public int getCoopPoint() {
      return coopPoint_;
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (isStart_ != false) {
        output.writeBool(9, isStart_);
      }
      if (coopPoint_ != 0) {
        output.writeUInt32(13, coopPoint_);
      }
      if (startMainCoop_ != null) {
        output.writeMessage(15, getStartMainCoop());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (isStart_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isStart_);
      }
      if (coopPoint_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, coopPoint_);
      }
      if (startMainCoop_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getStartMainCoop());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp other = (emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp) obj;

      if (getIsStart()
          != other.getIsStart()) return false;
      if (hasStartMainCoop() != other.hasStartMainCoop()) return false;
      if (hasStartMainCoop()) {
        if (!getStartMainCoop()
            .equals(other.getStartMainCoop())) return false;
      }
      if (getCoopPoint()
          != other.getCoopPoint()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + IS_START_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsStart());
      if (hasStartMainCoop()) {
        hash = (37 * hash) + START_MAIN_COOP_FIELD_NUMBER;
        hash = (53 * hash) + getStartMainCoop().hashCode();
      }
      hash = (37 * hash) + COOP_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getCoopPoint();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp prototype) {
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
     * CmdId: 1964
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code StartCoopPointRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StartCoopPointRsp)
        emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp.class, emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isStart_ = false;

        if (startMainCoopBuilder_ == null) {
          startMainCoop_ = null;
        } else {
          startMainCoop_ = null;
          startMainCoopBuilder_ = null;
        }
        coopPoint_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp build() {
        emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp buildPartial() {
        emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp result = new emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp(this);
        result.isStart_ = isStart_;
        if (startMainCoopBuilder_ == null) {
          result.startMainCoop_ = startMainCoop_;
        } else {
          result.startMainCoop_ = startMainCoopBuilder_.build();
        }
        result.coopPoint_ = coopPoint_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp other) {
        if (other == emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp.getDefaultInstance()) return this;
        if (other.getIsStart() != false) {
          setIsStart(other.getIsStart());
        }
        if (other.hasStartMainCoop()) {
          mergeStartMainCoop(other.getStartMainCoop());
        }
        if (other.getCoopPoint() != 0) {
          setCoopPoint(other.getCoopPoint());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 64: {
                retcode_ = input.readInt32();

                break;
              } // case 64
              case 72: {
                isStart_ = input.readBool();

                break;
              } // case 72
              case 104: {
                coopPoint_ = input.readUInt32();

                break;
              } // case 104
              case 122: {
                input.readMessage(
                    getStartMainCoopFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 122
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

      private boolean isStart_ ;
      /**
       * <code>bool is_start = 9;</code>
       * @return The isStart.
       */
      @java.lang.Override
      public boolean getIsStart() {
        return isStart_;
      }
      /**
       * <code>bool is_start = 9;</code>
       * @param value The isStart to set.
       * @return This builder for chaining.
       */
      public Builder setIsStart(boolean value) {
        
        isStart_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_start = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsStart() {
        
        isStart_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop startMainCoop_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop, emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop.Builder, emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoopOrBuilder> startMainCoopBuilder_;
      /**
       * <code>.MainCoop start_main_coop = 15;</code>
       * @return Whether the startMainCoop field is set.
       */
      public boolean hasStartMainCoop() {
        return startMainCoopBuilder_ != null || startMainCoop_ != null;
      }
      /**
       * <code>.MainCoop start_main_coop = 15;</code>
       * @return The startMainCoop.
       */
      public emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop getStartMainCoop() {
        if (startMainCoopBuilder_ == null) {
          return startMainCoop_ == null ? emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop.getDefaultInstance() : startMainCoop_;
        } else {
          return startMainCoopBuilder_.getMessage();
        }
      }
      /**
       * <code>.MainCoop start_main_coop = 15;</code>
       */
      public Builder setStartMainCoop(emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop value) {
        if (startMainCoopBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          startMainCoop_ = value;
          onChanged();
        } else {
          startMainCoopBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MainCoop start_main_coop = 15;</code>
       */
      public Builder setStartMainCoop(
          emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop.Builder builderForValue) {
        if (startMainCoopBuilder_ == null) {
          startMainCoop_ = builderForValue.build();
          onChanged();
        } else {
          startMainCoopBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MainCoop start_main_coop = 15;</code>
       */
      public Builder mergeStartMainCoop(emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop value) {
        if (startMainCoopBuilder_ == null) {
          if (startMainCoop_ != null) {
            startMainCoop_ =
              emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop.newBuilder(startMainCoop_).mergeFrom(value).buildPartial();
          } else {
            startMainCoop_ = value;
          }
          onChanged();
        } else {
          startMainCoopBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MainCoop start_main_coop = 15;</code>
       */
      public Builder clearStartMainCoop() {
        if (startMainCoopBuilder_ == null) {
          startMainCoop_ = null;
          onChanged();
        } else {
          startMainCoop_ = null;
          startMainCoopBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MainCoop start_main_coop = 15;</code>
       */
      public emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop.Builder getStartMainCoopBuilder() {
        
        onChanged();
        return getStartMainCoopFieldBuilder().getBuilder();
      }
      /**
       * <code>.MainCoop start_main_coop = 15;</code>
       */
      public emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoopOrBuilder getStartMainCoopOrBuilder() {
        if (startMainCoopBuilder_ != null) {
          return startMainCoopBuilder_.getMessageOrBuilder();
        } else {
          return startMainCoop_ == null ?
              emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop.getDefaultInstance() : startMainCoop_;
        }
      }
      /**
       * <code>.MainCoop start_main_coop = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop, emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop.Builder, emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoopOrBuilder> 
          getStartMainCoopFieldBuilder() {
        if (startMainCoopBuilder_ == null) {
          startMainCoopBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop, emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoop.Builder, emu.grasscutter.net.oldproto.MainCoopOuterClass.MainCoopOrBuilder>(
                  getStartMainCoop(),
                  getParentForChildren(),
                  isClean());
          startMainCoop_ = null;
        }
        return startMainCoopBuilder_;
      }

      private int coopPoint_ ;
      /**
       * <code>uint32 coop_point = 13;</code>
       * @return The coopPoint.
       */
      @java.lang.Override
      public int getCoopPoint() {
        return coopPoint_;
      }
      /**
       * <code>uint32 coop_point = 13;</code>
       * @param value The coopPoint to set.
       * @return This builder for chaining.
       */
      public Builder setCoopPoint(int value) {
        
        coopPoint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coop_point = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoopPoint() {
        
        coopPoint_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StartCoopPointRsp)
    }

    // @@protoc_insertion_point(class_scope:StartCoopPointRsp)
    private static final emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp();
    }

    public static emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StartCoopPointRsp>
        PARSER = new com.google.protobuf.AbstractParser<StartCoopPointRsp>() {
      @java.lang.Override
      public StartCoopPointRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<StartCoopPointRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StartCoopPointRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.StartCoopPointRspOuterClass.StartCoopPointRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StartCoopPointRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StartCoopPointRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027StartCoopPointRsp.proto\032\016MainCoop.prot" +
      "o\"n\n\021StartCoopPointRsp\022\020\n\010is_start\030\t \001(\010" +
      "\022\"\n\017start_main_coop\030\017 \001(\0132\t.MainCoop\022\022\n\n" +
      "coop_point\030\r \001(\r\022\017\n\007retcode\030\010 \001(\005B\036\n\034emu" +
      ".grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.MainCoopOuterClass.getDescriptor(),
        });
    internal_static_StartCoopPointRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StartCoopPointRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StartCoopPointRsp_descriptor,
        new java.lang.String[] { "IsStart", "StartMainCoop", "CoopPoint", "Retcode", });
    emu.grasscutter.net.oldproto.MainCoopOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
