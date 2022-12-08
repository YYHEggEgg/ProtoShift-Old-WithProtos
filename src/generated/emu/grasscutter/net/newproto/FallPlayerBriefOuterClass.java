// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FallPlayerBrief.proto

package emu.grasscutter.net.newproto;

public final class FallPlayerBriefOuterClass {
  private FallPlayerBriefOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FallPlayerBriefOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FallPlayerBrief)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_ground = 7;</code>
     * @return The isGround.
     */
    boolean getIsGround();

    /**
     * <code>uint32 uid = 2;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>uint32 score = 12;</code>
     * @return The score.
     */
    int getScore();
  }
  /**
   * Protobuf type {@code FallPlayerBrief}
   */
  public static final class FallPlayerBrief extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FallPlayerBrief)
      FallPlayerBriefOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FallPlayerBrief.newBuilder() to construct.
    private FallPlayerBrief(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FallPlayerBrief() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FallPlayerBrief();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.internal_static_FallPlayerBrief_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.internal_static_FallPlayerBrief_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief.class, emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief.Builder.class);
    }

    public static final int IS_GROUND_FIELD_NUMBER = 7;
    private boolean isGround_;
    /**
     * <code>bool is_ground = 7;</code>
     * @return The isGround.
     */
    @java.lang.Override
    public boolean getIsGround() {
      return isGround_;
    }

    public static final int UID_FIELD_NUMBER = 2;
    private int uid_;
    /**
     * <code>uint32 uid = 2;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int SCORE_FIELD_NUMBER = 12;
    private int score_;
    /**
     * <code>uint32 score = 12;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
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
      if (uid_ != 0) {
        output.writeUInt32(2, uid_);
      }
      if (isGround_ != false) {
        output.writeBool(7, isGround_);
      }
      if (score_ != 0) {
        output.writeUInt32(12, score_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, uid_);
      }
      if (isGround_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isGround_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, score_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief other = (emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief) obj;

      if (getIsGround()
          != other.getIsGround()) return false;
      if (getUid()
          != other.getUid()) return false;
      if (getScore()
          != other.getScore()) return false;
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
      hash = (37 * hash) + IS_GROUND_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsGround());
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief prototype) {
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
     * Protobuf type {@code FallPlayerBrief}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FallPlayerBrief)
        emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBriefOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.internal_static_FallPlayerBrief_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.internal_static_FallPlayerBrief_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief.class, emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isGround_ = false;

        uid_ = 0;

        score_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.internal_static_FallPlayerBrief_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief build() {
        emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief buildPartial() {
        emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief result = new emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief(this);
        result.isGround_ = isGround_;
        result.uid_ = uid_;
        result.score_ = score_;
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
        if (other instanceof emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief) {
          return mergeFrom((emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief other) {
        if (other == emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief.getDefaultInstance()) return this;
        if (other.getIsGround() != false) {
          setIsGround(other.getIsGround());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
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
                uid_ = input.readUInt32();

                break;
              } // case 16
              case 56: {
                isGround_ = input.readBool();

                break;
              } // case 56
              case 96: {
                score_ = input.readUInt32();

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

      private boolean isGround_ ;
      /**
       * <code>bool is_ground = 7;</code>
       * @return The isGround.
       */
      @java.lang.Override
      public boolean getIsGround() {
        return isGround_;
      }
      /**
       * <code>bool is_ground = 7;</code>
       * @param value The isGround to set.
       * @return This builder for chaining.
       */
      public Builder setIsGround(boolean value) {
        
        isGround_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_ground = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsGround() {
        
        isGround_ = false;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 2;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 2;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 12;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 12;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FallPlayerBrief)
    }

    // @@protoc_insertion_point(class_scope:FallPlayerBrief)
    private static final emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief();
    }

    public static emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FallPlayerBrief>
        PARSER = new com.google.protobuf.AbstractParser<FallPlayerBrief>() {
      @java.lang.Override
      public FallPlayerBrief parsePartialFrom(
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

    public static com.google.protobuf.Parser<FallPlayerBrief> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FallPlayerBrief> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.FallPlayerBriefOuterClass.FallPlayerBrief getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FallPlayerBrief_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FallPlayerBrief_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025FallPlayerBrief.proto\"@\n\017FallPlayerBri" +
      "ef\022\021\n\tis_ground\030\007 \001(\010\022\013\n\003uid\030\002 \001(\r\022\r\n\005sc" +
      "ore\030\014 \001(\rB\036\n\034emu.grasscutter.net.newprot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FallPlayerBrief_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FallPlayerBrief_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FallPlayerBrief_descriptor,
        new java.lang.String[] { "IsGround", "Uid", "Score", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
