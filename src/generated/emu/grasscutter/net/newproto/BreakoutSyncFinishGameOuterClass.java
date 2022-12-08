// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BreakoutSyncFinishGame.proto

package emu.grasscutter.net.newproto;

public final class BreakoutSyncFinishGameOuterClass {
  private BreakoutSyncFinishGameOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BreakoutSyncFinishGameOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BreakoutSyncFinishGame)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 server_game_time = 8;</code>
     * @return The serverGameTime.
     */
    long getServerGameTime();

    /**
     * <code>bool is_win = 1;</code>
     * @return The isWin.
     */
    boolean getIsWin();

    /**
     * <code>bool is_stop_gallery = 2;</code>
     * @return The isStopGallery.
     */
    boolean getIsStopGallery();
  }
  /**
   * Protobuf type {@code BreakoutSyncFinishGame}
   */
  public static final class BreakoutSyncFinishGame extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BreakoutSyncFinishGame)
      BreakoutSyncFinishGameOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BreakoutSyncFinishGame.newBuilder() to construct.
    private BreakoutSyncFinishGame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BreakoutSyncFinishGame() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BreakoutSyncFinishGame();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.internal_static_BreakoutSyncFinishGame_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.internal_static_BreakoutSyncFinishGame_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame.class, emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame.Builder.class);
    }

    public static final int SERVER_GAME_TIME_FIELD_NUMBER = 8;
    private long serverGameTime_;
    /**
     * <code>uint64 server_game_time = 8;</code>
     * @return The serverGameTime.
     */
    @java.lang.Override
    public long getServerGameTime() {
      return serverGameTime_;
    }

    public static final int IS_WIN_FIELD_NUMBER = 1;
    private boolean isWin_;
    /**
     * <code>bool is_win = 1;</code>
     * @return The isWin.
     */
    @java.lang.Override
    public boolean getIsWin() {
      return isWin_;
    }

    public static final int IS_STOP_GALLERY_FIELD_NUMBER = 2;
    private boolean isStopGallery_;
    /**
     * <code>bool is_stop_gallery = 2;</code>
     * @return The isStopGallery.
     */
    @java.lang.Override
    public boolean getIsStopGallery() {
      return isStopGallery_;
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
      if (isWin_ != false) {
        output.writeBool(1, isWin_);
      }
      if (isStopGallery_ != false) {
        output.writeBool(2, isStopGallery_);
      }
      if (serverGameTime_ != 0L) {
        output.writeUInt64(8, serverGameTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isWin_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isWin_);
      }
      if (isStopGallery_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isStopGallery_);
      }
      if (serverGameTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, serverGameTime_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame other = (emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame) obj;

      if (getServerGameTime()
          != other.getServerGameTime()) return false;
      if (getIsWin()
          != other.getIsWin()) return false;
      if (getIsStopGallery()
          != other.getIsStopGallery()) return false;
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
      hash = (37 * hash) + SERVER_GAME_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getServerGameTime());
      hash = (37 * hash) + IS_WIN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsWin());
      hash = (37 * hash) + IS_STOP_GALLERY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsStopGallery());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame prototype) {
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
     * Protobuf type {@code BreakoutSyncFinishGame}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BreakoutSyncFinishGame)
        emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.internal_static_BreakoutSyncFinishGame_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.internal_static_BreakoutSyncFinishGame_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame.class, emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        serverGameTime_ = 0L;

        isWin_ = false;

        isStopGallery_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.internal_static_BreakoutSyncFinishGame_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame build() {
        emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame buildPartial() {
        emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame result = new emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame(this);
        result.serverGameTime_ = serverGameTime_;
        result.isWin_ = isWin_;
        result.isStopGallery_ = isStopGallery_;
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
        if (other instanceof emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame) {
          return mergeFrom((emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame other) {
        if (other == emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame.getDefaultInstance()) return this;
        if (other.getServerGameTime() != 0L) {
          setServerGameTime(other.getServerGameTime());
        }
        if (other.getIsWin() != false) {
          setIsWin(other.getIsWin());
        }
        if (other.getIsStopGallery() != false) {
          setIsStopGallery(other.getIsStopGallery());
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
                isWin_ = input.readBool();

                break;
              } // case 8
              case 16: {
                isStopGallery_ = input.readBool();

                break;
              } // case 16
              case 64: {
                serverGameTime_ = input.readUInt64();

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

      private long serverGameTime_ ;
      /**
       * <code>uint64 server_game_time = 8;</code>
       * @return The serverGameTime.
       */
      @java.lang.Override
      public long getServerGameTime() {
        return serverGameTime_;
      }
      /**
       * <code>uint64 server_game_time = 8;</code>
       * @param value The serverGameTime to set.
       * @return This builder for chaining.
       */
      public Builder setServerGameTime(long value) {
        
        serverGameTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 server_game_time = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerGameTime() {
        
        serverGameTime_ = 0L;
        onChanged();
        return this;
      }

      private boolean isWin_ ;
      /**
       * <code>bool is_win = 1;</code>
       * @return The isWin.
       */
      @java.lang.Override
      public boolean getIsWin() {
        return isWin_;
      }
      /**
       * <code>bool is_win = 1;</code>
       * @param value The isWin to set.
       * @return This builder for chaining.
       */
      public Builder setIsWin(boolean value) {
        
        isWin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_win = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsWin() {
        
        isWin_ = false;
        onChanged();
        return this;
      }

      private boolean isStopGallery_ ;
      /**
       * <code>bool is_stop_gallery = 2;</code>
       * @return The isStopGallery.
       */
      @java.lang.Override
      public boolean getIsStopGallery() {
        return isStopGallery_;
      }
      /**
       * <code>bool is_stop_gallery = 2;</code>
       * @param value The isStopGallery to set.
       * @return This builder for chaining.
       */
      public Builder setIsStopGallery(boolean value) {
        
        isStopGallery_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_stop_gallery = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsStopGallery() {
        
        isStopGallery_ = false;
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


      // @@protoc_insertion_point(builder_scope:BreakoutSyncFinishGame)
    }

    // @@protoc_insertion_point(class_scope:BreakoutSyncFinishGame)
    private static final emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame();
    }

    public static emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BreakoutSyncFinishGame>
        PARSER = new com.google.protobuf.AbstractParser<BreakoutSyncFinishGame>() {
      @java.lang.Override
      public BreakoutSyncFinishGame parsePartialFrom(
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

    public static com.google.protobuf.Parser<BreakoutSyncFinishGame> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BreakoutSyncFinishGame> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.BreakoutSyncFinishGameOuterClass.BreakoutSyncFinishGame getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BreakoutSyncFinishGame_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BreakoutSyncFinishGame_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034BreakoutSyncFinishGame.proto\"[\n\026Breako" +
      "utSyncFinishGame\022\030\n\020server_game_time\030\010 \001" +
      "(\004\022\016\n\006is_win\030\001 \001(\010\022\027\n\017is_stop_gallery\030\002 " +
      "\001(\010B\036\n\034emu.grasscutter.net.newprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BreakoutSyncFinishGame_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BreakoutSyncFinishGame_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BreakoutSyncFinishGame_descriptor,
        new java.lang.String[] { "ServerGameTime", "IsWin", "IsStopGallery", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
