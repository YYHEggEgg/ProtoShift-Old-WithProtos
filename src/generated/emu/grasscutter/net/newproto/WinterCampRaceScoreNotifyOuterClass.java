// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WinterCampRaceScoreNotify.proto

package emu.grasscutter.net.newproto;

public final class WinterCampRaceScoreNotifyOuterClass {
  private WinterCampRaceScoreNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WinterCampRaceScoreNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WinterCampRaceScoreNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 max_score = 9;</code>
     * @return The maxScore.
     */
    int getMaxScore();

    /**
     * <code>uint32 id = 4;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8960;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code WinterCampRaceScoreNotify}
   */
  public static final class WinterCampRaceScoreNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WinterCampRaceScoreNotify)
      WinterCampRaceScoreNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WinterCampRaceScoreNotify.newBuilder() to construct.
    private WinterCampRaceScoreNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WinterCampRaceScoreNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WinterCampRaceScoreNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.internal_static_WinterCampRaceScoreNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.internal_static_WinterCampRaceScoreNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify.class, emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify.Builder.class);
    }

    public static final int MAX_SCORE_FIELD_NUMBER = 9;
    private int maxScore_;
    /**
     * <code>uint32 max_score = 9;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
    }

    public static final int ID_FIELD_NUMBER = 4;
    private int id_;
    /**
     * <code>uint32 id = 4;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (id_ != 0) {
        output.writeUInt32(4, id_);
      }
      if (maxScore_ != 0) {
        output.writeUInt32(9, maxScore_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, id_);
      }
      if (maxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, maxScore_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify other = (emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify) obj;

      if (getMaxScore()
          != other.getMaxScore()) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScore();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify prototype) {
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
     *   CMD_ID = 8960;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code WinterCampRaceScoreNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WinterCampRaceScoreNotify)
        emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.internal_static_WinterCampRaceScoreNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.internal_static_WinterCampRaceScoreNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify.class, emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        maxScore_ = 0;

        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.internal_static_WinterCampRaceScoreNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify build() {
        emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify buildPartial() {
        emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify result = new emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify(this);
        result.maxScore_ = maxScore_;
        result.id_ = id_;
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
        if (other instanceof emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify other) {
        if (other == emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify.getDefaultInstance()) return this;
        if (other.getMaxScore() != 0) {
          setMaxScore(other.getMaxScore());
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
                id_ = input.readUInt32();

                break;
              } // case 32
              case 72: {
                maxScore_ = input.readUInt32();

                break;
              } // case 72
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

      private int maxScore_ ;
      /**
       * <code>uint32 max_score = 9;</code>
       * @return The maxScore.
       */
      @java.lang.Override
      public int getMaxScore() {
        return maxScore_;
      }
      /**
       * <code>uint32 max_score = 9;</code>
       * @param value The maxScore to set.
       * @return This builder for chaining.
       */
      public Builder setMaxScore(int value) {
        
        maxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_score = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxScore() {
        
        maxScore_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 4;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 4;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WinterCampRaceScoreNotify)
    }

    // @@protoc_insertion_point(class_scope:WinterCampRaceScoreNotify)
    private static final emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify();
    }

    public static emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WinterCampRaceScoreNotify>
        PARSER = new com.google.protobuf.AbstractParser<WinterCampRaceScoreNotify>() {
      @java.lang.Override
      public WinterCampRaceScoreNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<WinterCampRaceScoreNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WinterCampRaceScoreNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.WinterCampRaceScoreNotifyOuterClass.WinterCampRaceScoreNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WinterCampRaceScoreNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampRaceScoreNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037WinterCampRaceScoreNotify.proto\":\n\031Win" +
      "terCampRaceScoreNotify\022\021\n\tmax_score\030\t \001(" +
      "\r\022\n\n\002id\030\004 \001(\rB\036\n\034emu.grasscutter.net.new" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WinterCampRaceScoreNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WinterCampRaceScoreNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WinterCampRaceScoreNotify_descriptor,
        new java.lang.String[] { "MaxScore", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
