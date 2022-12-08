// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BrickBreakerSetChangingReq.proto

package emu.grasscutter.net.newproto;

public final class BrickBreakerSetChangingReqOuterClass {
  private BrickBreakerSetChangingReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BrickBreakerSetChangingReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BrickBreakerSetChangingReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_changing = 1;</code>
     * @return The isChanging.
     */
    boolean getIsChanging();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5358;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code BrickBreakerSetChangingReq}
   */
  public static final class BrickBreakerSetChangingReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BrickBreakerSetChangingReq)
      BrickBreakerSetChangingReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BrickBreakerSetChangingReq.newBuilder() to construct.
    private BrickBreakerSetChangingReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BrickBreakerSetChangingReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BrickBreakerSetChangingReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.internal_static_BrickBreakerSetChangingReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.internal_static_BrickBreakerSetChangingReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq.class, emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq.Builder.class);
    }

    public static final int IS_CHANGING_FIELD_NUMBER = 1;
    private boolean isChanging_;
    /**
     * <code>bool is_changing = 1;</code>
     * @return The isChanging.
     */
    @java.lang.Override
    public boolean getIsChanging() {
      return isChanging_;
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
      if (isChanging_ != false) {
        output.writeBool(1, isChanging_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isChanging_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isChanging_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq other = (emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq) obj;

      if (getIsChanging()
          != other.getIsChanging()) return false;
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
      hash = (37 * hash) + IS_CHANGING_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsChanging());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq prototype) {
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
     *   CMD_ID = 5358;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code BrickBreakerSetChangingReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BrickBreakerSetChangingReq)
        emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.internal_static_BrickBreakerSetChangingReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.internal_static_BrickBreakerSetChangingReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq.class, emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isChanging_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.internal_static_BrickBreakerSetChangingReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq build() {
        emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq buildPartial() {
        emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq result = new emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq(this);
        result.isChanging_ = isChanging_;
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
        if (other instanceof emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq) {
          return mergeFrom((emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq other) {
        if (other == emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq.getDefaultInstance()) return this;
        if (other.getIsChanging() != false) {
          setIsChanging(other.getIsChanging());
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
              case 8: {
                isChanging_ = input.readBool();

                break;
              } // case 8
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

      private boolean isChanging_ ;
      /**
       * <code>bool is_changing = 1;</code>
       * @return The isChanging.
       */
      @java.lang.Override
      public boolean getIsChanging() {
        return isChanging_;
      }
      /**
       * <code>bool is_changing = 1;</code>
       * @param value The isChanging to set.
       * @return This builder for chaining.
       */
      public Builder setIsChanging(boolean value) {
        
        isChanging_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_changing = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsChanging() {
        
        isChanging_ = false;
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


      // @@protoc_insertion_point(builder_scope:BrickBreakerSetChangingReq)
    }

    // @@protoc_insertion_point(class_scope:BrickBreakerSetChangingReq)
    private static final emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq();
    }

    public static emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BrickBreakerSetChangingReq>
        PARSER = new com.google.protobuf.AbstractParser<BrickBreakerSetChangingReq>() {
      @java.lang.Override
      public BrickBreakerSetChangingReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<BrickBreakerSetChangingReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BrickBreakerSetChangingReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.BrickBreakerSetChangingReqOuterClass.BrickBreakerSetChangingReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BrickBreakerSetChangingReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BrickBreakerSetChangingReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n BrickBreakerSetChangingReq.proto\"1\n\032Br" +
      "ickBreakerSetChangingReq\022\023\n\013is_changing\030" +
      "\001 \001(\010B\036\n\034emu.grasscutter.net.newprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BrickBreakerSetChangingReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BrickBreakerSetChangingReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BrickBreakerSetChangingReq_descriptor,
        new java.lang.String[] { "IsChanging", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
