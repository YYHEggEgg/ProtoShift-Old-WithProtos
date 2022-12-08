// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestRenameAvatarReq.proto

package emu.grasscutter.net.newproto;

public final class QuestRenameAvatarReqOuterClass {
  private QuestRenameAvatarReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestRenameAvatarReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestRenameAvatarReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string avatar_name = 11;</code>
     * @return The avatarName.
     */
    java.lang.String getAvatarName();
    /**
     * <code>string avatar_name = 11;</code>
     * @return The bytes for avatarName.
     */
    com.google.protobuf.ByteString
        getAvatarNameBytes();

    /**
     * <code>uint32 rename_id = 12;</code>
     * @return The renameId.
     */
    int getRenameId();

    /**
     * <code>bool is_check = 4;</code>
     * @return The isCheck.
     */
    boolean getIsCheck();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 487;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code QuestRenameAvatarReq}
   */
  public static final class QuestRenameAvatarReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestRenameAvatarReq)
      QuestRenameAvatarReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestRenameAvatarReq.newBuilder() to construct.
    private QuestRenameAvatarReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestRenameAvatarReq() {
      avatarName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestRenameAvatarReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.internal_static_QuestRenameAvatarReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.internal_static_QuestRenameAvatarReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.class, emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.Builder.class);
    }

    public static final int AVATAR_NAME_FIELD_NUMBER = 11;
    private volatile java.lang.Object avatarName_;
    /**
     * <code>string avatar_name = 11;</code>
     * @return The avatarName.
     */
    @java.lang.Override
    public java.lang.String getAvatarName() {
      java.lang.Object ref = avatarName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        avatarName_ = s;
        return s;
      }
    }
    /**
     * <code>string avatar_name = 11;</code>
     * @return The bytes for avatarName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAvatarNameBytes() {
      java.lang.Object ref = avatarName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        avatarName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RENAME_ID_FIELD_NUMBER = 12;
    private int renameId_;
    /**
     * <code>uint32 rename_id = 12;</code>
     * @return The renameId.
     */
    @java.lang.Override
    public int getRenameId() {
      return renameId_;
    }

    public static final int IS_CHECK_FIELD_NUMBER = 4;
    private boolean isCheck_;
    /**
     * <code>bool is_check = 4;</code>
     * @return The isCheck.
     */
    @java.lang.Override
    public boolean getIsCheck() {
      return isCheck_;
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
      if (isCheck_ != false) {
        output.writeBool(4, isCheck_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(avatarName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, avatarName_);
      }
      if (renameId_ != 0) {
        output.writeUInt32(12, renameId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isCheck_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isCheck_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(avatarName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, avatarName_);
      }
      if (renameId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, renameId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq other = (emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq) obj;

      if (!getAvatarName()
          .equals(other.getAvatarName())) return false;
      if (getRenameId()
          != other.getRenameId()) return false;
      if (getIsCheck()
          != other.getIsCheck()) return false;
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
      hash = (37 * hash) + AVATAR_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarName().hashCode();
      hash = (37 * hash) + RENAME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRenameId();
      hash = (37 * hash) + IS_CHECK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsCheck());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq prototype) {
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
     *   CMD_ID = 487;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code QuestRenameAvatarReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestRenameAvatarReq)
        emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.internal_static_QuestRenameAvatarReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.internal_static_QuestRenameAvatarReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.class, emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        avatarName_ = "";

        renameId_ = 0;

        isCheck_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.internal_static_QuestRenameAvatarReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq build() {
        emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq buildPartial() {
        emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq result = new emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq(this);
        result.avatarName_ = avatarName_;
        result.renameId_ = renameId_;
        result.isCheck_ = isCheck_;
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
        if (other instanceof emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq) {
          return mergeFrom((emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq other) {
        if (other == emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq.getDefaultInstance()) return this;
        if (!other.getAvatarName().isEmpty()) {
          avatarName_ = other.avatarName_;
          onChanged();
        }
        if (other.getRenameId() != 0) {
          setRenameId(other.getRenameId());
        }
        if (other.getIsCheck() != false) {
          setIsCheck(other.getIsCheck());
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
                isCheck_ = input.readBool();

                break;
              } // case 32
              case 90: {
                avatarName_ = input.readStringRequireUtf8();

                break;
              } // case 90
              case 96: {
                renameId_ = input.readUInt32();

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

      private java.lang.Object avatarName_ = "";
      /**
       * <code>string avatar_name = 11;</code>
       * @return The avatarName.
       */
      public java.lang.String getAvatarName() {
        java.lang.Object ref = avatarName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          avatarName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string avatar_name = 11;</code>
       * @return The bytes for avatarName.
       */
      public com.google.protobuf.ByteString
          getAvatarNameBytes() {
        java.lang.Object ref = avatarName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          avatarName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string avatar_name = 11;</code>
       * @param value The avatarName to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        avatarName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string avatar_name = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarName() {
        
        avatarName_ = getDefaultInstance().getAvatarName();
        onChanged();
        return this;
      }
      /**
       * <code>string avatar_name = 11;</code>
       * @param value The bytes for avatarName to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        avatarName_ = value;
        onChanged();
        return this;
      }

      private int renameId_ ;
      /**
       * <code>uint32 rename_id = 12;</code>
       * @return The renameId.
       */
      @java.lang.Override
      public int getRenameId() {
        return renameId_;
      }
      /**
       * <code>uint32 rename_id = 12;</code>
       * @param value The renameId to set.
       * @return This builder for chaining.
       */
      public Builder setRenameId(int value) {
        
        renameId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rename_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRenameId() {
        
        renameId_ = 0;
        onChanged();
        return this;
      }

      private boolean isCheck_ ;
      /**
       * <code>bool is_check = 4;</code>
       * @return The isCheck.
       */
      @java.lang.Override
      public boolean getIsCheck() {
        return isCheck_;
      }
      /**
       * <code>bool is_check = 4;</code>
       * @param value The isCheck to set.
       * @return This builder for chaining.
       */
      public Builder setIsCheck(boolean value) {
        
        isCheck_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_check = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCheck() {
        
        isCheck_ = false;
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


      // @@protoc_insertion_point(builder_scope:QuestRenameAvatarReq)
    }

    // @@protoc_insertion_point(class_scope:QuestRenameAvatarReq)
    private static final emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq();
    }

    public static emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestRenameAvatarReq>
        PARSER = new com.google.protobuf.AbstractParser<QuestRenameAvatarReq>() {
      @java.lang.Override
      public QuestRenameAvatarReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<QuestRenameAvatarReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestRenameAvatarReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.QuestRenameAvatarReqOuterClass.QuestRenameAvatarReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestRenameAvatarReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestRenameAvatarReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032QuestRenameAvatarReq.proto\"P\n\024QuestRen" +
      "ameAvatarReq\022\023\n\013avatar_name\030\013 \001(\t\022\021\n\tren" +
      "ame_id\030\014 \001(\r\022\020\n\010is_check\030\004 \001(\010B\036\n\034emu.gr" +
      "asscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QuestRenameAvatarReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestRenameAvatarReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestRenameAvatarReq_descriptor,
        new java.lang.String[] { "AvatarName", "RenameId", "IsCheck", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
