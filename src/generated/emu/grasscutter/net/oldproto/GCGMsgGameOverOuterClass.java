// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgGameOver.proto

package emu.grasscutter.net.oldproto;

public final class GCGMsgGameOverOuterClass {
  private GCGMsgGameOverOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgGameOverOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgGameOver)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGEndReason end_reason = 13;</code>
     * @return The enum numeric value on the wire for endReason.
     */
    int getEndReasonValue();
    /**
     * <code>.GCGEndReason end_reason = 13;</code>
     * @return The endReason.
     */
    emu.grasscutter.net.oldproto.GCGEndReasonOuterClass.GCGEndReason getEndReason();

    /**
     * <code>uint32 win_controller_id = 6;</code>
     * @return The winControllerId.
     */
    int getWinControllerId();
  }
  /**
   * Protobuf type {@code GCGMsgGameOver}
   */
  public static final class GCGMsgGameOver extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgGameOver)
      GCGMsgGameOverOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgGameOver.newBuilder() to construct.
    private GCGMsgGameOver(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgGameOver() {
      endReason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgGameOver();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.internal_static_GCGMsgGameOver_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.internal_static_GCGMsgGameOver_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver.class, emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver.Builder.class);
    }

    public static final int END_REASON_FIELD_NUMBER = 13;
    private int endReason_;
    /**
     * <code>.GCGEndReason end_reason = 13;</code>
     * @return The enum numeric value on the wire for endReason.
     */
    @java.lang.Override public int getEndReasonValue() {
      return endReason_;
    }
    /**
     * <code>.GCGEndReason end_reason = 13;</code>
     * @return The endReason.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.GCGEndReasonOuterClass.GCGEndReason getEndReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.GCGEndReasonOuterClass.GCGEndReason result = emu.grasscutter.net.oldproto.GCGEndReasonOuterClass.GCGEndReason.valueOf(endReason_);
      return result == null ? emu.grasscutter.net.oldproto.GCGEndReasonOuterClass.GCGEndReason.UNRECOGNIZED : result;
    }

    public static final int WIN_CONTROLLER_ID_FIELD_NUMBER = 6;
    private int winControllerId_;
    /**
     * <code>uint32 win_controller_id = 6;</code>
     * @return The winControllerId.
     */
    @java.lang.Override
    public int getWinControllerId() {
      return winControllerId_;
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
      if (winControllerId_ != 0) {
        output.writeUInt32(6, winControllerId_);
      }
      if (endReason_ != emu.grasscutter.net.oldproto.GCGEndReasonOuterClass.GCGEndReason.GCG_END_REASON_DEFAULT.getNumber()) {
        output.writeEnum(13, endReason_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (winControllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, winControllerId_);
      }
      if (endReason_ != emu.grasscutter.net.oldproto.GCGEndReasonOuterClass.GCGEndReason.GCG_END_REASON_DEFAULT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, endReason_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver other = (emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver) obj;

      if (endReason_ != other.endReason_) return false;
      if (getWinControllerId()
          != other.getWinControllerId()) return false;
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
      hash = (37 * hash) + END_REASON_FIELD_NUMBER;
      hash = (53 * hash) + endReason_;
      hash = (37 * hash) + WIN_CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWinControllerId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver prototype) {
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
     * Protobuf type {@code GCGMsgGameOver}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgGameOver)
        emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOverOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.internal_static_GCGMsgGameOver_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.internal_static_GCGMsgGameOver_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver.class, emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        endReason_ = 0;

        winControllerId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.internal_static_GCGMsgGameOver_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver build() {
        emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver buildPartial() {
        emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver result = new emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver(this);
        result.endReason_ = endReason_;
        result.winControllerId_ = winControllerId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver) {
          return mergeFrom((emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver other) {
        if (other == emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver.getDefaultInstance()) return this;
        if (other.endReason_ != 0) {
          setEndReasonValue(other.getEndReasonValue());
        }
        if (other.getWinControllerId() != 0) {
          setWinControllerId(other.getWinControllerId());
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
              case 48: {
                winControllerId_ = input.readUInt32();

                break;
              } // case 48
              case 104: {
                endReason_ = input.readEnum();

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

      private int endReason_ = 0;
      /**
       * <code>.GCGEndReason end_reason = 13;</code>
       * @return The enum numeric value on the wire for endReason.
       */
      @java.lang.Override public int getEndReasonValue() {
        return endReason_;
      }
      /**
       * <code>.GCGEndReason end_reason = 13;</code>
       * @param value The enum numeric value on the wire for endReason to set.
       * @return This builder for chaining.
       */
      public Builder setEndReasonValue(int value) {
        
        endReason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGEndReason end_reason = 13;</code>
       * @return The endReason.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGEndReasonOuterClass.GCGEndReason getEndReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.GCGEndReasonOuterClass.GCGEndReason result = emu.grasscutter.net.oldproto.GCGEndReasonOuterClass.GCGEndReason.valueOf(endReason_);
        return result == null ? emu.grasscutter.net.oldproto.GCGEndReasonOuterClass.GCGEndReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGEndReason end_reason = 13;</code>
       * @param value The endReason to set.
       * @return This builder for chaining.
       */
      public Builder setEndReason(emu.grasscutter.net.oldproto.GCGEndReasonOuterClass.GCGEndReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        endReason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGEndReason end_reason = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndReason() {
        
        endReason_ = 0;
        onChanged();
        return this;
      }

      private int winControllerId_ ;
      /**
       * <code>uint32 win_controller_id = 6;</code>
       * @return The winControllerId.
       */
      @java.lang.Override
      public int getWinControllerId() {
        return winControllerId_;
      }
      /**
       * <code>uint32 win_controller_id = 6;</code>
       * @param value The winControllerId to set.
       * @return This builder for chaining.
       */
      public Builder setWinControllerId(int value) {
        
        winControllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 win_controller_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearWinControllerId() {
        
        winControllerId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGMsgGameOver)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgGameOver)
    private static final emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver();
    }

    public static emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgGameOver>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgGameOver>() {
      @java.lang.Override
      public GCGMsgGameOver parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGMsgGameOver> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgGameOver> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.GCGMsgGameOverOuterClass.GCGMsgGameOver getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgGameOver_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgGameOver_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024GCGMsgGameOver.proto\032\022GCGEndReason.pro" +
      "to\"N\n\016GCGMsgGameOver\022!\n\nend_reason\030\r \001(\016" +
      "2\r.GCGEndReason\022\031\n\021win_controller_id\030\006 \001" +
      "(\rB\036\n\034emu.grasscutter.net.oldprotob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.GCGEndReasonOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgGameOver_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgGameOver_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgGameOver_descriptor,
        new java.lang.String[] { "EndReason", "WinControllerId", });
    emu.grasscutter.net.oldproto.GCGEndReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
