// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryIslandPartyRaftInfo.proto

package emu.grasscutter.net.oldproto;

public final class SceneGalleryIslandPartyRaftInfoOuterClass {
  private SceneGalleryIslandPartyRaftInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryIslandPartyRaftInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryIslandPartyRaftInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 coin = 6;</code>
     * @return The coin.
     */
    int getCoin();

    /**
     * <code>.GalleryStartSource start_source = 7;</code>
     * @return The enum numeric value on the wire for startSource.
     */
    int getStartSourceValue();
    /**
     * <code>.GalleryStartSource start_source = 7;</code>
     * @return The startSource.
     */
    emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource();

    /**
     * <code>uint32 component = 1;</code>
     * @return The component.
     */
    int getComponent();

    /**
     * <code>uint32 fuel = 15;</code>
     * @return The fuel.
     */
    int getFuel();

    /**
     * <code>uint32 point_id = 12;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 raft_entity_id = 4;</code>
     * @return The raftEntityId.
     */
    int getRaftEntityId();
  }
  /**
   * Protobuf type {@code SceneGalleryIslandPartyRaftInfo}
   */
  public static final class SceneGalleryIslandPartyRaftInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryIslandPartyRaftInfo)
      SceneGalleryIslandPartyRaftInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryIslandPartyRaftInfo.newBuilder() to construct.
    private SceneGalleryIslandPartyRaftInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryIslandPartyRaftInfo() {
      startSource_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryIslandPartyRaftInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.internal_static_SceneGalleryIslandPartyRaftInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.internal_static_SceneGalleryIslandPartyRaftInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo.class, emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo.Builder.class);
    }

    public static final int COIN_FIELD_NUMBER = 6;
    private int coin_;
    /**
     * <code>uint32 coin = 6;</code>
     * @return The coin.
     */
    @java.lang.Override
    public int getCoin() {
      return coin_;
    }

    public static final int START_SOURCE_FIELD_NUMBER = 7;
    private int startSource_;
    /**
     * <code>.GalleryStartSource start_source = 7;</code>
     * @return The enum numeric value on the wire for startSource.
     */
    @java.lang.Override public int getStartSourceValue() {
      return startSource_;
    }
    /**
     * <code>.GalleryStartSource start_source = 7;</code>
     * @return The startSource.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource result = emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.valueOf(startSource_);
      return result == null ? emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.UNRECOGNIZED : result;
    }

    public static final int COMPONENT_FIELD_NUMBER = 1;
    private int component_;
    /**
     * <code>uint32 component = 1;</code>
     * @return The component.
     */
    @java.lang.Override
    public int getComponent() {
      return component_;
    }

    public static final int FUEL_FIELD_NUMBER = 15;
    private int fuel_;
    /**
     * <code>uint32 fuel = 15;</code>
     * @return The fuel.
     */
    @java.lang.Override
    public int getFuel() {
      return fuel_;
    }

    public static final int POINT_ID_FIELD_NUMBER = 12;
    private int pointId_;
    /**
     * <code>uint32 point_id = 12;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int RAFT_ENTITY_ID_FIELD_NUMBER = 4;
    private int raftEntityId_;
    /**
     * <code>uint32 raft_entity_id = 4;</code>
     * @return The raftEntityId.
     */
    @java.lang.Override
    public int getRaftEntityId() {
      return raftEntityId_;
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
      if (component_ != 0) {
        output.writeUInt32(1, component_);
      }
      if (raftEntityId_ != 0) {
        output.writeUInt32(4, raftEntityId_);
      }
      if (coin_ != 0) {
        output.writeUInt32(6, coin_);
      }
      if (startSource_ != emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.GALLERY_START_SOURCE_BY_NONE.getNumber()) {
        output.writeEnum(7, startSource_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(12, pointId_);
      }
      if (fuel_ != 0) {
        output.writeUInt32(15, fuel_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (component_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, component_);
      }
      if (raftEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, raftEntityId_);
      }
      if (coin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, coin_);
      }
      if (startSource_ != emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.GALLERY_START_SOURCE_BY_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, startSource_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, pointId_);
      }
      if (fuel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, fuel_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo other = (emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo) obj;

      if (getCoin()
          != other.getCoin()) return false;
      if (startSource_ != other.startSource_) return false;
      if (getComponent()
          != other.getComponent()) return false;
      if (getFuel()
          != other.getFuel()) return false;
      if (getPointId()
          != other.getPointId()) return false;
      if (getRaftEntityId()
          != other.getRaftEntityId()) return false;
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
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin();
      hash = (37 * hash) + START_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + startSource_;
      hash = (37 * hash) + COMPONENT_FIELD_NUMBER;
      hash = (53 * hash) + getComponent();
      hash = (37 * hash) + FUEL_FIELD_NUMBER;
      hash = (53 * hash) + getFuel();
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + RAFT_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRaftEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo prototype) {
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
     * Protobuf type {@code SceneGalleryIslandPartyRaftInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryIslandPartyRaftInfo)
        emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.internal_static_SceneGalleryIslandPartyRaftInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.internal_static_SceneGalleryIslandPartyRaftInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo.class, emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        coin_ = 0;

        startSource_ = 0;

        component_ = 0;

        fuel_ = 0;

        pointId_ = 0;

        raftEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.internal_static_SceneGalleryIslandPartyRaftInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo build() {
        emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo buildPartial() {
        emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo result = new emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo(this);
        result.coin_ = coin_;
        result.startSource_ = startSource_;
        result.component_ = component_;
        result.fuel_ = fuel_;
        result.pointId_ = pointId_;
        result.raftEntityId_ = raftEntityId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo other) {
        if (other == emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo.getDefaultInstance()) return this;
        if (other.getCoin() != 0) {
          setCoin(other.getCoin());
        }
        if (other.startSource_ != 0) {
          setStartSourceValue(other.getStartSourceValue());
        }
        if (other.getComponent() != 0) {
          setComponent(other.getComponent());
        }
        if (other.getFuel() != 0) {
          setFuel(other.getFuel());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getRaftEntityId() != 0) {
          setRaftEntityId(other.getRaftEntityId());
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
                component_ = input.readUInt32();

                break;
              } // case 8
              case 32: {
                raftEntityId_ = input.readUInt32();

                break;
              } // case 32
              case 48: {
                coin_ = input.readUInt32();

                break;
              } // case 48
              case 56: {
                startSource_ = input.readEnum();

                break;
              } // case 56
              case 96: {
                pointId_ = input.readUInt32();

                break;
              } // case 96
              case 120: {
                fuel_ = input.readUInt32();

                break;
              } // case 120
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

      private int coin_ ;
      /**
       * <code>uint32 coin = 6;</code>
       * @return The coin.
       */
      @java.lang.Override
      public int getCoin() {
        return coin_;
      }
      /**
       * <code>uint32 coin = 6;</code>
       * @param value The coin to set.
       * @return This builder for chaining.
       */
      public Builder setCoin(int value) {
        
        coin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoin() {
        
        coin_ = 0;
        onChanged();
        return this;
      }

      private int startSource_ = 0;
      /**
       * <code>.GalleryStartSource start_source = 7;</code>
       * @return The enum numeric value on the wire for startSource.
       */
      @java.lang.Override public int getStartSourceValue() {
        return startSource_;
      }
      /**
       * <code>.GalleryStartSource start_source = 7;</code>
       * @param value The enum numeric value on the wire for startSource to set.
       * @return This builder for chaining.
       */
      public Builder setStartSourceValue(int value) {
        
        startSource_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStartSource start_source = 7;</code>
       * @return The startSource.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource result = emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.valueOf(startSource_);
        return result == null ? emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.UNRECOGNIZED : result;
      }
      /**
       * <code>.GalleryStartSource start_source = 7;</code>
       * @param value The startSource to set.
       * @return This builder for chaining.
       */
      public Builder setStartSource(emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        startSource_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStartSource start_source = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartSource() {
        
        startSource_ = 0;
        onChanged();
        return this;
      }

      private int component_ ;
      /**
       * <code>uint32 component = 1;</code>
       * @return The component.
       */
      @java.lang.Override
      public int getComponent() {
        return component_;
      }
      /**
       * <code>uint32 component = 1;</code>
       * @param value The component to set.
       * @return This builder for chaining.
       */
      public Builder setComponent(int value) {
        
        component_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 component = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearComponent() {
        
        component_ = 0;
        onChanged();
        return this;
      }

      private int fuel_ ;
      /**
       * <code>uint32 fuel = 15;</code>
       * @return The fuel.
       */
      @java.lang.Override
      public int getFuel() {
        return fuel_;
      }
      /**
       * <code>uint32 fuel = 15;</code>
       * @param value The fuel to set.
       * @return This builder for chaining.
       */
      public Builder setFuel(int value) {
        
        fuel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fuel = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearFuel() {
        
        fuel_ = 0;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 12;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 12;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int raftEntityId_ ;
      /**
       * <code>uint32 raft_entity_id = 4;</code>
       * @return The raftEntityId.
       */
      @java.lang.Override
      public int getRaftEntityId() {
        return raftEntityId_;
      }
      /**
       * <code>uint32 raft_entity_id = 4;</code>
       * @param value The raftEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setRaftEntityId(int value) {
        
        raftEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 raft_entity_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRaftEntityId() {
        
        raftEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryIslandPartyRaftInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryIslandPartyRaftInfo)
    private static final emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo();
    }

    public static emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryIslandPartyRaftInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryIslandPartyRaftInfo>() {
      @java.lang.Override
      public SceneGalleryIslandPartyRaftInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGalleryIslandPartyRaftInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryIslandPartyRaftInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SceneGalleryIslandPartyRaftInfoOuterClass.SceneGalleryIslandPartyRaftInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryIslandPartyRaftInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryIslandPartyRaftInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%SceneGalleryIslandPartyRaftInfo.proto\032" +
      "\030GalleryStartSource.proto\"\245\001\n\037SceneGalle" +
      "ryIslandPartyRaftInfo\022\014\n\004coin\030\006 \001(\r\022)\n\014s" +
      "tart_source\030\007 \001(\0162\023.GalleryStartSource\022\021" +
      "\n\tcomponent\030\001 \001(\r\022\014\n\004fuel\030\017 \001(\r\022\020\n\010point" +
      "_id\030\014 \001(\r\022\026\n\016raft_entity_id\030\004 \001(\rB\036\n\034emu" +
      ".grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.getDescriptor(),
        });
    internal_static_SceneGalleryIslandPartyRaftInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryIslandPartyRaftInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryIslandPartyRaftInfo_descriptor,
        new java.lang.String[] { "Coin", "StartSource", "Component", "Fuel", "PointId", "RaftEntityId", });
    emu.grasscutter.net.oldproto.GalleryStartSourceOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
