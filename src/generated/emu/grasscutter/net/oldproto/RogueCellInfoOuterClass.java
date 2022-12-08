// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueCellInfo.proto

package emu.grasscutter.net.oldproto;

public final class RogueCellInfoOuterClass {
  private RogueCellInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueCellInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueCellInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cell_config_id = 14;</code>
     * @return The cellConfigId.
     */
    int getCellConfigId();

    /**
     * <code>uint32 dungeon_id = 4;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 cell_id = 9;</code>
     * @return The cellId.
     */
    int getCellId();

    /**
     * <code>uint32 cell_type = 13;</code>
     * @return The cellType.
     */
    int getCellType();

    /**
     * <code>.RogueCellState state = 10;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.RogueCellState state = 10;</code>
     * @return The state.
     */
    emu.grasscutter.net.oldproto.RogueCellStateOuterClass.RogueCellState getState();
  }
  /**
   * Protobuf type {@code RogueCellInfo}
   */
  public static final class RogueCellInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueCellInfo)
      RogueCellInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueCellInfo.newBuilder() to construct.
    private RogueCellInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueCellInfo() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueCellInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.internal_static_RogueCellInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.internal_static_RogueCellInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.class, emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.Builder.class);
    }

    public static final int CELL_CONFIG_ID_FIELD_NUMBER = 14;
    private int cellConfigId_;
    /**
     * <code>uint32 cell_config_id = 14;</code>
     * @return The cellConfigId.
     */
    @java.lang.Override
    public int getCellConfigId() {
      return cellConfigId_;
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 4;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 4;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int CELL_ID_FIELD_NUMBER = 9;
    private int cellId_;
    /**
     * <code>uint32 cell_id = 9;</code>
     * @return The cellId.
     */
    @java.lang.Override
    public int getCellId() {
      return cellId_;
    }

    public static final int CELL_TYPE_FIELD_NUMBER = 13;
    private int cellType_;
    /**
     * <code>uint32 cell_type = 13;</code>
     * @return The cellType.
     */
    @java.lang.Override
    public int getCellType() {
      return cellType_;
    }

    public static final int STATE_FIELD_NUMBER = 10;
    private int state_;
    /**
     * <code>.RogueCellState state = 10;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.RogueCellState state = 10;</code>
     * @return The state.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.RogueCellStateOuterClass.RogueCellState getState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.RogueCellStateOuterClass.RogueCellState result = emu.grasscutter.net.oldproto.RogueCellStateOuterClass.RogueCellState.valueOf(state_);
      return result == null ? emu.grasscutter.net.oldproto.RogueCellStateOuterClass.RogueCellState.UNRECOGNIZED : result;
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
      if (dungeonId_ != 0) {
        output.writeUInt32(4, dungeonId_);
      }
      if (cellId_ != 0) {
        output.writeUInt32(9, cellId_);
      }
      if (state_ != emu.grasscutter.net.oldproto.RogueCellStateOuterClass.RogueCellState.ROGUE_CELL_STATE_NONE.getNumber()) {
        output.writeEnum(10, state_);
      }
      if (cellType_ != 0) {
        output.writeUInt32(13, cellType_);
      }
      if (cellConfigId_ != 0) {
        output.writeUInt32(14, cellConfigId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, dungeonId_);
      }
      if (cellId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, cellId_);
      }
      if (state_ != emu.grasscutter.net.oldproto.RogueCellStateOuterClass.RogueCellState.ROGUE_CELL_STATE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(10, state_);
      }
      if (cellType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, cellType_);
      }
      if (cellConfigId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, cellConfigId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo other = (emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo) obj;

      if (getCellConfigId()
          != other.getCellConfigId()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getCellId()
          != other.getCellId()) return false;
      if (getCellType()
          != other.getCellType()) return false;
      if (state_ != other.state_) return false;
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
      hash = (37 * hash) + CELL_CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCellConfigId();
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + CELL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCellId();
      hash = (37 * hash) + CELL_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getCellType();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo prototype) {
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
     * Protobuf type {@code RogueCellInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueCellInfo)
        emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.internal_static_RogueCellInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.internal_static_RogueCellInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.class, emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        cellConfigId_ = 0;

        dungeonId_ = 0;

        cellId_ = 0;

        cellType_ = 0;

        state_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.internal_static_RogueCellInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo build() {
        emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo buildPartial() {
        emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo result = new emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo(this);
        result.cellConfigId_ = cellConfigId_;
        result.dungeonId_ = dungeonId_;
        result.cellId_ = cellId_;
        result.cellType_ = cellType_;
        result.state_ = state_;
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
        if (other instanceof emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo other) {
        if (other == emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.getDefaultInstance()) return this;
        if (other.getCellConfigId() != 0) {
          setCellConfigId(other.getCellConfigId());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getCellId() != 0) {
          setCellId(other.getCellId());
        }
        if (other.getCellType() != 0) {
          setCellType(other.getCellType());
        }
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
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
                dungeonId_ = input.readUInt32();

                break;
              } // case 32
              case 72: {
                cellId_ = input.readUInt32();

                break;
              } // case 72
              case 80: {
                state_ = input.readEnum();

                break;
              } // case 80
              case 104: {
                cellType_ = input.readUInt32();

                break;
              } // case 104
              case 112: {
                cellConfigId_ = input.readUInt32();

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

      private int cellConfigId_ ;
      /**
       * <code>uint32 cell_config_id = 14;</code>
       * @return The cellConfigId.
       */
      @java.lang.Override
      public int getCellConfigId() {
        return cellConfigId_;
      }
      /**
       * <code>uint32 cell_config_id = 14;</code>
       * @param value The cellConfigId to set.
       * @return This builder for chaining.
       */
      public Builder setCellConfigId(int value) {
        
        cellConfigId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cell_config_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCellConfigId() {
        
        cellConfigId_ = 0;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 4;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 4;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int cellId_ ;
      /**
       * <code>uint32 cell_id = 9;</code>
       * @return The cellId.
       */
      @java.lang.Override
      public int getCellId() {
        return cellId_;
      }
      /**
       * <code>uint32 cell_id = 9;</code>
       * @param value The cellId to set.
       * @return This builder for chaining.
       */
      public Builder setCellId(int value) {
        
        cellId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cell_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCellId() {
        
        cellId_ = 0;
        onChanged();
        return this;
      }

      private int cellType_ ;
      /**
       * <code>uint32 cell_type = 13;</code>
       * @return The cellType.
       */
      @java.lang.Override
      public int getCellType() {
        return cellType_;
      }
      /**
       * <code>uint32 cell_type = 13;</code>
       * @param value The cellType to set.
       * @return This builder for chaining.
       */
      public Builder setCellType(int value) {
        
        cellType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cell_type = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCellType() {
        
        cellType_ = 0;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.RogueCellState state = 10;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.RogueCellState state = 10;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.RogueCellState state = 10;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.RogueCellStateOuterClass.RogueCellState getState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.RogueCellStateOuterClass.RogueCellState result = emu.grasscutter.net.oldproto.RogueCellStateOuterClass.RogueCellState.valueOf(state_);
        return result == null ? emu.grasscutter.net.oldproto.RogueCellStateOuterClass.RogueCellState.UNRECOGNIZED : result;
      }
      /**
       * <code>.RogueCellState state = 10;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.grasscutter.net.oldproto.RogueCellStateOuterClass.RogueCellState value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.RogueCellState state = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RogueCellInfo)
    }

    // @@protoc_insertion_point(class_scope:RogueCellInfo)
    private static final emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo();
    }

    public static emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueCellInfo>
        PARSER = new com.google.protobuf.AbstractParser<RogueCellInfo>() {
      @java.lang.Override
      public RogueCellInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<RogueCellInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueCellInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueCellInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueCellInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023RogueCellInfo.proto\032\024RogueCellState.pr" +
      "oto\"\177\n\rRogueCellInfo\022\026\n\016cell_config_id\030\016" +
      " \001(\r\022\022\n\ndungeon_id\030\004 \001(\r\022\017\n\007cell_id\030\t \001(" +
      "\r\022\021\n\tcell_type\030\r \001(\r\022\036\n\005state\030\n \001(\0162\017.Ro" +
      "gueCellStateB\036\n\034emu.grasscutter.net.oldp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.RogueCellStateOuterClass.getDescriptor(),
        });
    internal_static_RogueCellInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueCellInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueCellInfo_descriptor,
        new java.lang.String[] { "CellConfigId", "DungeonId", "CellId", "CellType", "State", });
    emu.grasscutter.net.oldproto.RogueCellStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
