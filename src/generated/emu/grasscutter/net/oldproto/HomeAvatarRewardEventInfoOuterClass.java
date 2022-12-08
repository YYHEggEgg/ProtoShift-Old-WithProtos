// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAvatarRewardEventInfo.proto

package emu.grasscutter.net.oldproto;

public final class HomeAvatarRewardEventInfoOuterClass {
  private HomeAvatarRewardEventInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeAvatarRewardEventInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeAvatarRewardEventInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 avatar_id = 1;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>uint32 guid = 12;</code>
     * @return The guid.
     */
    int getGuid();

    /**
     * <code>uint32 event_id = 2;</code>
     * @return The eventId.
     */
    int getEventId();

    /**
     * <code>uint32 suite_id = 14;</code>
     * @return The suiteId.
     */
    int getSuiteId();

    /**
     * <code>uint32 random_position = 9;</code>
     * @return The randomPosition.
     */
    int getRandomPosition();
  }
  /**
   * Protobuf type {@code HomeAvatarRewardEventInfo}
   */
  public static final class HomeAvatarRewardEventInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeAvatarRewardEventInfo)
      HomeAvatarRewardEventInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeAvatarRewardEventInfo.newBuilder() to construct.
    private HomeAvatarRewardEventInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeAvatarRewardEventInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeAvatarRewardEventInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.internal_static_HomeAvatarRewardEventInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.internal_static_HomeAvatarRewardEventInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo.class, emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo.Builder.class);
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 1;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 1;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int GUID_FIELD_NUMBER = 12;
    private int guid_;
    /**
     * <code>uint32 guid = 12;</code>
     * @return The guid.
     */
    @java.lang.Override
    public int getGuid() {
      return guid_;
    }

    public static final int EVENT_ID_FIELD_NUMBER = 2;
    private int eventId_;
    /**
     * <code>uint32 event_id = 2;</code>
     * @return The eventId.
     */
    @java.lang.Override
    public int getEventId() {
      return eventId_;
    }

    public static final int SUITE_ID_FIELD_NUMBER = 14;
    private int suiteId_;
    /**
     * <code>uint32 suite_id = 14;</code>
     * @return The suiteId.
     */
    @java.lang.Override
    public int getSuiteId() {
      return suiteId_;
    }

    public static final int RANDOM_POSITION_FIELD_NUMBER = 9;
    private int randomPosition_;
    /**
     * <code>uint32 random_position = 9;</code>
     * @return The randomPosition.
     */
    @java.lang.Override
    public int getRandomPosition() {
      return randomPosition_;
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
      if (avatarId_ != 0) {
        output.writeUInt32(1, avatarId_);
      }
      if (eventId_ != 0) {
        output.writeUInt32(2, eventId_);
      }
      if (randomPosition_ != 0) {
        output.writeUInt32(9, randomPosition_);
      }
      if (guid_ != 0) {
        output.writeUInt32(12, guid_);
      }
      if (suiteId_ != 0) {
        output.writeUInt32(14, suiteId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, avatarId_);
      }
      if (eventId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, eventId_);
      }
      if (randomPosition_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, randomPosition_);
      }
      if (guid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, guid_);
      }
      if (suiteId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, suiteId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo other = (emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo) obj;

      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (getEventId()
          != other.getEventId()) return false;
      if (getSuiteId()
          != other.getSuiteId()) return false;
      if (getRandomPosition()
          != other.getRandomPosition()) return false;
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
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid();
      hash = (37 * hash) + EVENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEventId();
      hash = (37 * hash) + SUITE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSuiteId();
      hash = (37 * hash) + RANDOM_POSITION_FIELD_NUMBER;
      hash = (53 * hash) + getRandomPosition();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo prototype) {
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
     * Protobuf type {@code HomeAvatarRewardEventInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeAvatarRewardEventInfo)
        emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.internal_static_HomeAvatarRewardEventInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.internal_static_HomeAvatarRewardEventInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo.class, emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        avatarId_ = 0;

        guid_ = 0;

        eventId_ = 0;

        suiteId_ = 0;

        randomPosition_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.internal_static_HomeAvatarRewardEventInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo build() {
        emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo buildPartial() {
        emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo result = new emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo(this);
        result.avatarId_ = avatarId_;
        result.guid_ = guid_;
        result.eventId_ = eventId_;
        result.suiteId_ = suiteId_;
        result.randomPosition_ = randomPosition_;
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
        if (other instanceof emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo other) {
        if (other == emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo.getDefaultInstance()) return this;
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getGuid() != 0) {
          setGuid(other.getGuid());
        }
        if (other.getEventId() != 0) {
          setEventId(other.getEventId());
        }
        if (other.getSuiteId() != 0) {
          setSuiteId(other.getSuiteId());
        }
        if (other.getRandomPosition() != 0) {
          setRandomPosition(other.getRandomPosition());
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
                avatarId_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                eventId_ = input.readUInt32();

                break;
              } // case 16
              case 72: {
                randomPosition_ = input.readUInt32();

                break;
              } // case 72
              case 96: {
                guid_ = input.readUInt32();

                break;
              } // case 96
              case 112: {
                suiteId_ = input.readUInt32();

                break;
              } // case 112
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

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 1;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 1;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private int guid_ ;
      /**
       * <code>uint32 guid = 12;</code>
       * @return The guid.
       */
      @java.lang.Override
      public int getGuid() {
        return guid_;
      }
      /**
       * <code>uint32 guid = 12;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(int value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0;
        onChanged();
        return this;
      }

      private int eventId_ ;
      /**
       * <code>uint32 event_id = 2;</code>
       * @return The eventId.
       */
      @java.lang.Override
      public int getEventId() {
        return eventId_;
      }
      /**
       * <code>uint32 event_id = 2;</code>
       * @param value The eventId to set.
       * @return This builder for chaining.
       */
      public Builder setEventId(int value) {
        
        eventId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 event_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEventId() {
        
        eventId_ = 0;
        onChanged();
        return this;
      }

      private int suiteId_ ;
      /**
       * <code>uint32 suite_id = 14;</code>
       * @return The suiteId.
       */
      @java.lang.Override
      public int getSuiteId() {
        return suiteId_;
      }
      /**
       * <code>uint32 suite_id = 14;</code>
       * @param value The suiteId to set.
       * @return This builder for chaining.
       */
      public Builder setSuiteId(int value) {
        
        suiteId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 suite_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearSuiteId() {
        
        suiteId_ = 0;
        onChanged();
        return this;
      }

      private int randomPosition_ ;
      /**
       * <code>uint32 random_position = 9;</code>
       * @return The randomPosition.
       */
      @java.lang.Override
      public int getRandomPosition() {
        return randomPosition_;
      }
      /**
       * <code>uint32 random_position = 9;</code>
       * @param value The randomPosition to set.
       * @return This builder for chaining.
       */
      public Builder setRandomPosition(int value) {
        
        randomPosition_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 random_position = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRandomPosition() {
        
        randomPosition_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeAvatarRewardEventInfo)
    }

    // @@protoc_insertion_point(class_scope:HomeAvatarRewardEventInfo)
    private static final emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo();
    }

    public static emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeAvatarRewardEventInfo>
        PARSER = new com.google.protobuf.AbstractParser<HomeAvatarRewardEventInfo>() {
      @java.lang.Override
      public HomeAvatarRewardEventInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeAvatarRewardEventInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeAvatarRewardEventInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeAvatarRewardEventInfoOuterClass.HomeAvatarRewardEventInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeAvatarRewardEventInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeAvatarRewardEventInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037HomeAvatarRewardEventInfo.proto\"y\n\031Hom" +
      "eAvatarRewardEventInfo\022\021\n\tavatar_id\030\001 \001(" +
      "\r\022\014\n\004guid\030\014 \001(\r\022\020\n\010event_id\030\002 \001(\r\022\020\n\010sui" +
      "te_id\030\016 \001(\r\022\027\n\017random_position\030\t \001(\rB\036\n\034" +
      "emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeAvatarRewardEventInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeAvatarRewardEventInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeAvatarRewardEventInfo_descriptor,
        new java.lang.String[] { "AvatarId", "Guid", "EventId", "SuiteId", "RandomPosition", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
