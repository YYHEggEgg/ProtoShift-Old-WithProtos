// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueAvatarInfo.proto

package emu.grasscutter.net.newproto;

public final class RogueAvatarInfoOuterClass {
  private RogueAvatarInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueAvatarInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueAvatarInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_onstage = 2;</code>
     * @return The isOnstage.
     */
    boolean getIsOnstage();

    /**
     * <code>bool is_alive = 8;</code>
     * @return The isAlive.
     */
    boolean getIsAlive();

    /**
     * <code>uint32 avatar_id = 5;</code>
     * @return The avatarId.
     */
    int getAvatarId();
  }
  /**
   * Protobuf type {@code RogueAvatarInfo}
   */
  public static final class RogueAvatarInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueAvatarInfo)
      RogueAvatarInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueAvatarInfo.newBuilder() to construct.
    private RogueAvatarInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueAvatarInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueAvatarInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.internal_static_RogueAvatarInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.internal_static_RogueAvatarInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo.class, emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo.Builder.class);
    }

    public static final int IS_ONSTAGE_FIELD_NUMBER = 2;
    private boolean isOnstage_;
    /**
     * <code>bool is_onstage = 2;</code>
     * @return The isOnstage.
     */
    @java.lang.Override
    public boolean getIsOnstage() {
      return isOnstage_;
    }

    public static final int IS_ALIVE_FIELD_NUMBER = 8;
    private boolean isAlive_;
    /**
     * <code>bool is_alive = 8;</code>
     * @return The isAlive.
     */
    @java.lang.Override
    public boolean getIsAlive() {
      return isAlive_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 5;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 5;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
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
      if (isOnstage_ != false) {
        output.writeBool(2, isOnstage_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(5, avatarId_);
      }
      if (isAlive_ != false) {
        output.writeBool(8, isAlive_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOnstage_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isOnstage_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, avatarId_);
      }
      if (isAlive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isAlive_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo other = (emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo) obj;

      if (getIsOnstage()
          != other.getIsOnstage()) return false;
      if (getIsAlive()
          != other.getIsAlive()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
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
      hash = (37 * hash) + IS_ONSTAGE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOnstage());
      hash = (37 * hash) + IS_ALIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAlive());
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo prototype) {
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
     * Protobuf type {@code RogueAvatarInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueAvatarInfo)
        emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.internal_static_RogueAvatarInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.internal_static_RogueAvatarInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo.class, emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isOnstage_ = false;

        isAlive_ = false;

        avatarId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.internal_static_RogueAvatarInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo build() {
        emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo buildPartial() {
        emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo result = new emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo(this);
        result.isOnstage_ = isOnstage_;
        result.isAlive_ = isAlive_;
        result.avatarId_ = avatarId_;
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
        if (other instanceof emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo other) {
        if (other == emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo.getDefaultInstance()) return this;
        if (other.getIsOnstage() != false) {
          setIsOnstage(other.getIsOnstage());
        }
        if (other.getIsAlive() != false) {
          setIsAlive(other.getIsAlive());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
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
              case 16: {
                isOnstage_ = input.readBool();

                break;
              } // case 16
              case 40: {
                avatarId_ = input.readUInt32();

                break;
              } // case 40
              case 64: {
                isAlive_ = input.readBool();

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

      private boolean isOnstage_ ;
      /**
       * <code>bool is_onstage = 2;</code>
       * @return The isOnstage.
       */
      @java.lang.Override
      public boolean getIsOnstage() {
        return isOnstage_;
      }
      /**
       * <code>bool is_onstage = 2;</code>
       * @param value The isOnstage to set.
       * @return This builder for chaining.
       */
      public Builder setIsOnstage(boolean value) {
        
        isOnstage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_onstage = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOnstage() {
        
        isOnstage_ = false;
        onChanged();
        return this;
      }

      private boolean isAlive_ ;
      /**
       * <code>bool is_alive = 8;</code>
       * @return The isAlive.
       */
      @java.lang.Override
      public boolean getIsAlive() {
        return isAlive_;
      }
      /**
       * <code>bool is_alive = 8;</code>
       * @param value The isAlive to set.
       * @return This builder for chaining.
       */
      public Builder setIsAlive(boolean value) {
        
        isAlive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_alive = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAlive() {
        
        isAlive_ = false;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RogueAvatarInfo)
    }

    // @@protoc_insertion_point(class_scope:RogueAvatarInfo)
    private static final emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo();
    }

    public static emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueAvatarInfo>
        PARSER = new com.google.protobuf.AbstractParser<RogueAvatarInfo>() {
      @java.lang.Override
      public RogueAvatarInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<RogueAvatarInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueAvatarInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.RogueAvatarInfoOuterClass.RogueAvatarInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueAvatarInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueAvatarInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025RogueAvatarInfo.proto\"J\n\017RogueAvatarIn" +
      "fo\022\022\n\nis_onstage\030\002 \001(\010\022\020\n\010is_alive\030\010 \001(\010" +
      "\022\021\n\tavatar_id\030\005 \001(\rB\036\n\034emu.grasscutter.n" +
      "et.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RogueAvatarInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueAvatarInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueAvatarInfo_descriptor,
        new java.lang.String[] { "IsOnstage", "IsAlive", "AvatarId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
