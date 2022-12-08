// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeTeamNameReq.proto

package emu.grasscutter.net.oldproto;

public final class ChangeTeamNameReqOuterClass {
  private ChangeTeamNameReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeTeamNameReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeTeamNameReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 team_id = 8;</code>
     * @return The teamId.
     */
    int getTeamId();

    /**
     * <code>string team_name = 9;</code>
     * @return The teamName.
     */
    java.lang.String getTeamName();
    /**
     * <code>string team_name = 9;</code>
     * @return The bytes for teamName.
     */
    com.google.protobuf.ByteString
        getTeamNameBytes();
  }
  /**
   * <pre>
   * CmdId: 1603
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ChangeTeamNameReq}
   */
  public static final class ChangeTeamNameReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeTeamNameReq)
      ChangeTeamNameReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeTeamNameReq.newBuilder() to construct.
    private ChangeTeamNameReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeTeamNameReq() {
      teamName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeTeamNameReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.internal_static_ChangeTeamNameReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.internal_static_ChangeTeamNameReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq.class, emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq.Builder.class);
    }

    public static final int TEAM_ID_FIELD_NUMBER = 8;
    private int teamId_;
    /**
     * <code>int32 team_id = 8;</code>
     * @return The teamId.
     */
    @java.lang.Override
    public int getTeamId() {
      return teamId_;
    }

    public static final int TEAM_NAME_FIELD_NUMBER = 9;
    private volatile java.lang.Object teamName_;
    /**
     * <code>string team_name = 9;</code>
     * @return The teamName.
     */
    @java.lang.Override
    public java.lang.String getTeamName() {
      java.lang.Object ref = teamName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        teamName_ = s;
        return s;
      }
    }
    /**
     * <code>string team_name = 9;</code>
     * @return The bytes for teamName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTeamNameBytes() {
      java.lang.Object ref = teamName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        teamName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (teamId_ != 0) {
        output.writeInt32(8, teamId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(teamName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, teamName_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (teamId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, teamId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(teamName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, teamName_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq other = (emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq) obj;

      if (getTeamId()
          != other.getTeamId()) return false;
      if (!getTeamName()
          .equals(other.getTeamName())) return false;
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
      hash = (37 * hash) + TEAM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTeamId();
      hash = (37 * hash) + TEAM_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTeamName().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq prototype) {
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
     * CmdId: 1603
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ChangeTeamNameReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeTeamNameReq)
        emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.internal_static_ChangeTeamNameReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.internal_static_ChangeTeamNameReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq.class, emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        teamId_ = 0;

        teamName_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.internal_static_ChangeTeamNameReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq build() {
        emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq buildPartial() {
        emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq result = new emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq(this);
        result.teamId_ = teamId_;
        result.teamName_ = teamName_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq other) {
        if (other == emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq.getDefaultInstance()) return this;
        if (other.getTeamId() != 0) {
          setTeamId(other.getTeamId());
        }
        if (!other.getTeamName().isEmpty()) {
          teamName_ = other.teamName_;
          onChanged();
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
                teamId_ = input.readInt32();

                break;
              } // case 64
              case 74: {
                teamName_ = input.readStringRequireUtf8();

                break;
              } // case 74
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

      private int teamId_ ;
      /**
       * <code>int32 team_id = 8;</code>
       * @return The teamId.
       */
      @java.lang.Override
      public int getTeamId() {
        return teamId_;
      }
      /**
       * <code>int32 team_id = 8;</code>
       * @param value The teamId to set.
       * @return This builder for chaining.
       */
      public Builder setTeamId(int value) {
        
        teamId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 team_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTeamId() {
        
        teamId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object teamName_ = "";
      /**
       * <code>string team_name = 9;</code>
       * @return The teamName.
       */
      public java.lang.String getTeamName() {
        java.lang.Object ref = teamName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          teamName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string team_name = 9;</code>
       * @return The bytes for teamName.
       */
      public com.google.protobuf.ByteString
          getTeamNameBytes() {
        java.lang.Object ref = teamName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          teamName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string team_name = 9;</code>
       * @param value The teamName to set.
       * @return This builder for chaining.
       */
      public Builder setTeamName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        teamName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string team_name = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTeamName() {
        
        teamName_ = getDefaultInstance().getTeamName();
        onChanged();
        return this;
      }
      /**
       * <code>string team_name = 9;</code>
       * @param value The bytes for teamName to set.
       * @return This builder for chaining.
       */
      public Builder setTeamNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        teamName_ = value;
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


      // @@protoc_insertion_point(builder_scope:ChangeTeamNameReq)
    }

    // @@protoc_insertion_point(class_scope:ChangeTeamNameReq)
    private static final emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq();
    }

    public static emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeTeamNameReq>
        PARSER = new com.google.protobuf.AbstractParser<ChangeTeamNameReq>() {
      @java.lang.Override
      public ChangeTeamNameReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChangeTeamNameReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeTeamNameReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ChangeTeamNameReqOuterClass.ChangeTeamNameReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeTeamNameReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeTeamNameReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ChangeTeamNameReq.proto\"7\n\021ChangeTeamN" +
      "ameReq\022\017\n\007team_id\030\010 \001(\005\022\021\n\tteam_name\030\t \001" +
      "(\tB\036\n\034emu.grasscutter.net.oldprotob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeTeamNameReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeTeamNameReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeTeamNameReq_descriptor,
        new java.lang.String[] { "TeamId", "TeamName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}