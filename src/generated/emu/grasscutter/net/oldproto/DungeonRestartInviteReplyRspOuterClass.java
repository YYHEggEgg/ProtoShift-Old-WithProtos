// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonRestartInviteReplyRsp.proto

package emu.grasscutter.net.oldproto;

public final class DungeonRestartInviteReplyRspOuterClass {
  private DungeonRestartInviteReplyRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonRestartInviteReplyRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonRestartInviteReplyRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_accept = 10;</code>
     * @return The isAccept.
     */
    boolean getIsAccept();

    /**
     * <code>bool is_trans_point = 1;</code>
     * @return The isTransPoint.
     */
    boolean getIsTransPoint();

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 916
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code DungeonRestartInviteReplyRsp}
   */
  public static final class DungeonRestartInviteReplyRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonRestartInviteReplyRsp)
      DungeonRestartInviteReplyRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonRestartInviteReplyRsp.newBuilder() to construct.
    private DungeonRestartInviteReplyRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonRestartInviteReplyRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonRestartInviteReplyRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.internal_static_DungeonRestartInviteReplyRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.internal_static_DungeonRestartInviteReplyRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp.class, emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp.Builder.class);
    }

    public static final int IS_ACCEPT_FIELD_NUMBER = 10;
    private boolean isAccept_;
    /**
     * <code>bool is_accept = 10;</code>
     * @return The isAccept.
     */
    @java.lang.Override
    public boolean getIsAccept() {
      return isAccept_;
    }

    public static final int IS_TRANS_POINT_FIELD_NUMBER = 1;
    private boolean isTransPoint_;
    /**
     * <code>bool is_trans_point = 1;</code>
     * @return The isTransPoint.
     */
    @java.lang.Override
    public boolean getIsTransPoint() {
      return isTransPoint_;
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
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
      if (isTransPoint_ != false) {
        output.writeBool(1, isTransPoint_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (isAccept_ != false) {
        output.writeBool(10, isAccept_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isTransPoint_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isTransPoint_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (isAccept_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isAccept_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp other = (emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp) obj;

      if (getIsAccept()
          != other.getIsAccept()) return false;
      if (getIsTransPoint()
          != other.getIsTransPoint()) return false;
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
      hash = (37 * hash) + IS_ACCEPT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAccept());
      hash = (37 * hash) + IS_TRANS_POINT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTransPoint());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp prototype) {
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
     * CmdId: 916
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code DungeonRestartInviteReplyRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonRestartInviteReplyRsp)
        emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.internal_static_DungeonRestartInviteReplyRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.internal_static_DungeonRestartInviteReplyRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp.class, emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isAccept_ = false;

        isTransPoint_ = false;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.internal_static_DungeonRestartInviteReplyRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp build() {
        emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp buildPartial() {
        emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp result = new emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp(this);
        result.isAccept_ = isAccept_;
        result.isTransPoint_ = isTransPoint_;
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
        if (other instanceof emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp other) {
        if (other == emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp.getDefaultInstance()) return this;
        if (other.getIsAccept() != false) {
          setIsAccept(other.getIsAccept());
        }
        if (other.getIsTransPoint() != false) {
          setIsTransPoint(other.getIsTransPoint());
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
              case 8: {
                isTransPoint_ = input.readBool();

                break;
              } // case 8
              case 72: {
                retcode_ = input.readInt32();

                break;
              } // case 72
              case 80: {
                isAccept_ = input.readBool();

                break;
              } // case 80
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

      private boolean isAccept_ ;
      /**
       * <code>bool is_accept = 10;</code>
       * @return The isAccept.
       */
      @java.lang.Override
      public boolean getIsAccept() {
        return isAccept_;
      }
      /**
       * <code>bool is_accept = 10;</code>
       * @param value The isAccept to set.
       * @return This builder for chaining.
       */
      public Builder setIsAccept(boolean value) {
        
        isAccept_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_accept = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAccept() {
        
        isAccept_ = false;
        onChanged();
        return this;
      }

      private boolean isTransPoint_ ;
      /**
       * <code>bool is_trans_point = 1;</code>
       * @return The isTransPoint.
       */
      @java.lang.Override
      public boolean getIsTransPoint() {
        return isTransPoint_;
      }
      /**
       * <code>bool is_trans_point = 1;</code>
       * @param value The isTransPoint to set.
       * @return This builder for chaining.
       */
      public Builder setIsTransPoint(boolean value) {
        
        isTransPoint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_trans_point = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTransPoint() {
        
        isTransPoint_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
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


      // @@protoc_insertion_point(builder_scope:DungeonRestartInviteReplyRsp)
    }

    // @@protoc_insertion_point(class_scope:DungeonRestartInviteReplyRsp)
    private static final emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp();
    }

    public static emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonRestartInviteReplyRsp>
        PARSER = new com.google.protobuf.AbstractParser<DungeonRestartInviteReplyRsp>() {
      @java.lang.Override
      public DungeonRestartInviteReplyRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<DungeonRestartInviteReplyRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonRestartInviteReplyRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.DungeonRestartInviteReplyRspOuterClass.DungeonRestartInviteReplyRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonRestartInviteReplyRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonRestartInviteReplyRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"DungeonRestartInviteReplyRsp.proto\"Z\n\034" +
      "DungeonRestartInviteReplyRsp\022\021\n\tis_accep" +
      "t\030\n \001(\010\022\026\n\016is_trans_point\030\001 \001(\010\022\017\n\007retco" +
      "de\030\t \001(\005B\036\n\034emu.grasscutter.net.oldproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonRestartInviteReplyRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonRestartInviteReplyRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonRestartInviteReplyRsp_descriptor,
        new java.lang.String[] { "IsAccept", "IsTransPoint", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
