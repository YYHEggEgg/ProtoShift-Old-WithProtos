// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MechanicusCandidateTeamCreateReq.proto

package emu.grasscutter.net.oldproto;

public final class MechanicusCandidateTeamCreateReqOuterClass {
  private MechanicusCandidateTeamCreateReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MechanicusCandidateTeamCreateReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MechanicusCandidateTeamCreateReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 difficult_level = 6;</code>
     * @return The difficultLevel.
     */
    int getDifficultLevel();
  }
  /**
   * <pre>
   * CmdId: 3981
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code MechanicusCandidateTeamCreateReq}
   */
  public static final class MechanicusCandidateTeamCreateReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MechanicusCandidateTeamCreateReq)
      MechanicusCandidateTeamCreateReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MechanicusCandidateTeamCreateReq.newBuilder() to construct.
    private MechanicusCandidateTeamCreateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MechanicusCandidateTeamCreateReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MechanicusCandidateTeamCreateReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.internal_static_MechanicusCandidateTeamCreateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.internal_static_MechanicusCandidateTeamCreateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq.class, emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq.Builder.class);
    }

    public static final int DIFFICULT_LEVEL_FIELD_NUMBER = 6;
    private int difficultLevel_;
    /**
     * <code>uint32 difficult_level = 6;</code>
     * @return The difficultLevel.
     */
    @java.lang.Override
    public int getDifficultLevel() {
      return difficultLevel_;
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
      if (difficultLevel_ != 0) {
        output.writeUInt32(6, difficultLevel_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficultLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, difficultLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq other = (emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq) obj;

      if (getDifficultLevel()
          != other.getDifficultLevel()) return false;
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
      hash = (37 * hash) + DIFFICULT_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultLevel();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq prototype) {
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
     * CmdId: 3981
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code MechanicusCandidateTeamCreateReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MechanicusCandidateTeamCreateReq)
        emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.internal_static_MechanicusCandidateTeamCreateReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.internal_static_MechanicusCandidateTeamCreateReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq.class, emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        difficultLevel_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.internal_static_MechanicusCandidateTeamCreateReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq build() {
        emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq buildPartial() {
        emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq result = new emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq(this);
        result.difficultLevel_ = difficultLevel_;
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
        if (other instanceof emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq other) {
        if (other == emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq.getDefaultInstance()) return this;
        if (other.getDifficultLevel() != 0) {
          setDifficultLevel(other.getDifficultLevel());
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
                difficultLevel_ = input.readUInt32();

                break;
              } // case 48
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

      private int difficultLevel_ ;
      /**
       * <code>uint32 difficult_level = 6;</code>
       * @return The difficultLevel.
       */
      @java.lang.Override
      public int getDifficultLevel() {
        return difficultLevel_;
      }
      /**
       * <code>uint32 difficult_level = 6;</code>
       * @param value The difficultLevel to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultLevel(int value) {
        
        difficultLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficult_level = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultLevel() {
        
        difficultLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MechanicusCandidateTeamCreateReq)
    }

    // @@protoc_insertion_point(class_scope:MechanicusCandidateTeamCreateReq)
    private static final emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq();
    }

    public static emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MechanicusCandidateTeamCreateReq>
        PARSER = new com.google.protobuf.AbstractParser<MechanicusCandidateTeamCreateReq>() {
      @java.lang.Override
      public MechanicusCandidateTeamCreateReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<MechanicusCandidateTeamCreateReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MechanicusCandidateTeamCreateReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.MechanicusCandidateTeamCreateReqOuterClass.MechanicusCandidateTeamCreateReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MechanicusCandidateTeamCreateReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MechanicusCandidateTeamCreateReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&MechanicusCandidateTeamCreateReq.proto" +
      "\";\n MechanicusCandidateTeamCreateReq\022\027\n\017" +
      "difficult_level\030\006 \001(\rB\036\n\034emu.grasscutter" +
      ".net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MechanicusCandidateTeamCreateReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MechanicusCandidateTeamCreateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MechanicusCandidateTeamCreateReq_descriptor,
        new java.lang.String[] { "DifficultLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
