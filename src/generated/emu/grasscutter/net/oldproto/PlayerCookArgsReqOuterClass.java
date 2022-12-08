// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerCookArgsReq.proto

package emu.grasscutter.net.oldproto;

public final class PlayerCookArgsReqOuterClass {
  private PlayerCookArgsReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerCookArgsReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerCookArgsReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 assist_avatar = 10;</code>
     * @return The assistAvatar.
     */
    int getAssistAvatar();

    /**
     * <code>uint32 recipe_id = 11;</code>
     * @return The recipeId.
     */
    int getRecipeId();
  }
  /**
   * <pre>
   * CmdId: 166
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code PlayerCookArgsReq}
   */
  public static final class PlayerCookArgsReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerCookArgsReq)
      PlayerCookArgsReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerCookArgsReq.newBuilder() to construct.
    private PlayerCookArgsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerCookArgsReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerCookArgsReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq.class, emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq.Builder.class);
    }

    public static final int ASSIST_AVATAR_FIELD_NUMBER = 10;
    private int assistAvatar_;
    /**
     * <code>uint32 assist_avatar = 10;</code>
     * @return The assistAvatar.
     */
    @java.lang.Override
    public int getAssistAvatar() {
      return assistAvatar_;
    }

    public static final int RECIPE_ID_FIELD_NUMBER = 11;
    private int recipeId_;
    /**
     * <code>uint32 recipe_id = 11;</code>
     * @return The recipeId.
     */
    @java.lang.Override
    public int getRecipeId() {
      return recipeId_;
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
      if (assistAvatar_ != 0) {
        output.writeUInt32(10, assistAvatar_);
      }
      if (recipeId_ != 0) {
        output.writeUInt32(11, recipeId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (assistAvatar_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, assistAvatar_);
      }
      if (recipeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, recipeId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq other = (emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq) obj;

      if (getAssistAvatar()
          != other.getAssistAvatar()) return false;
      if (getRecipeId()
          != other.getRecipeId()) return false;
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
      hash = (37 * hash) + ASSIST_AVATAR_FIELD_NUMBER;
      hash = (53 * hash) + getAssistAvatar();
      hash = (37 * hash) + RECIPE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRecipeId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq prototype) {
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
     * CmdId: 166
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code PlayerCookArgsReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerCookArgsReq)
        emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq.class, emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        assistAvatar_ = 0;

        recipeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq build() {
        emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq buildPartial() {
        emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq result = new emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq(this);
        result.assistAvatar_ = assistAvatar_;
        result.recipeId_ = recipeId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq other) {
        if (other == emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq.getDefaultInstance()) return this;
        if (other.getAssistAvatar() != 0) {
          setAssistAvatar(other.getAssistAvatar());
        }
        if (other.getRecipeId() != 0) {
          setRecipeId(other.getRecipeId());
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
              case 80: {
                assistAvatar_ = input.readUInt32();

                break;
              } // case 80
              case 88: {
                recipeId_ = input.readUInt32();

                break;
              } // case 88
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

      private int assistAvatar_ ;
      /**
       * <code>uint32 assist_avatar = 10;</code>
       * @return The assistAvatar.
       */
      @java.lang.Override
      public int getAssistAvatar() {
        return assistAvatar_;
      }
      /**
       * <code>uint32 assist_avatar = 10;</code>
       * @param value The assistAvatar to set.
       * @return This builder for chaining.
       */
      public Builder setAssistAvatar(int value) {
        
        assistAvatar_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 assist_avatar = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearAssistAvatar() {
        
        assistAvatar_ = 0;
        onChanged();
        return this;
      }

      private int recipeId_ ;
      /**
       * <code>uint32 recipe_id = 11;</code>
       * @return The recipeId.
       */
      @java.lang.Override
      public int getRecipeId() {
        return recipeId_;
      }
      /**
       * <code>uint32 recipe_id = 11;</code>
       * @param value The recipeId to set.
       * @return This builder for chaining.
       */
      public Builder setRecipeId(int value) {
        
        recipeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 recipe_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRecipeId() {
        
        recipeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerCookArgsReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerCookArgsReq)
    private static final emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq();
    }

    public static emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerCookArgsReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerCookArgsReq>() {
      @java.lang.Override
      public PlayerCookArgsReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerCookArgsReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerCookArgsReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.PlayerCookArgsReqOuterClass.PlayerCookArgsReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerCookArgsReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerCookArgsReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PlayerCookArgsReq.proto\"=\n\021PlayerCookA" +
      "rgsReq\022\025\n\rassist_avatar\030\n \001(\r\022\021\n\trecipe_" +
      "id\030\013 \001(\rB\036\n\034emu.grasscutter.net.oldproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerCookArgsReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerCookArgsReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerCookArgsReq_descriptor,
        new java.lang.String[] { "AssistAvatar", "RecipeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
