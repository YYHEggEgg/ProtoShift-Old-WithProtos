// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDungeonBattleRecordMuipData.proto

package emu.grasscutter.net.oldproto;

public final class CustomDungeonBattleRecordMuipDataOuterClass {
  private CustomDungeonBattleRecordMuipDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomDungeonBattleRecordMuipDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomDungeonBattleRecordMuipData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 dungeon_guid = 1;</code>
     * @return The dungeonGuid.
     */
    long getDungeonGuid();

    /**
     * <code>uint32 min_cost_time = 2;</code>
     * @return The minCostTime.
     */
    int getMinCostTime();
  }
  /**
   * Protobuf type {@code CustomDungeonBattleRecordMuipData}
   */
  public static final class CustomDungeonBattleRecordMuipData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CustomDungeonBattleRecordMuipData)
      CustomDungeonBattleRecordMuipDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CustomDungeonBattleRecordMuipData.newBuilder() to construct.
    private CustomDungeonBattleRecordMuipData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CustomDungeonBattleRecordMuipData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CustomDungeonBattleRecordMuipData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.internal_static_CustomDungeonBattleRecordMuipData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.internal_static_CustomDungeonBattleRecordMuipData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData.class, emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData.Builder.class);
    }

    public static final int DUNGEON_GUID_FIELD_NUMBER = 1;
    private long dungeonGuid_;
    /**
     * <code>uint64 dungeon_guid = 1;</code>
     * @return The dungeonGuid.
     */
    @java.lang.Override
    public long getDungeonGuid() {
      return dungeonGuid_;
    }

    public static final int MIN_COST_TIME_FIELD_NUMBER = 2;
    private int minCostTime_;
    /**
     * <code>uint32 min_cost_time = 2;</code>
     * @return The minCostTime.
     */
    @java.lang.Override
    public int getMinCostTime() {
      return minCostTime_;
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
      if (dungeonGuid_ != 0L) {
        output.writeUInt64(1, dungeonGuid_);
      }
      if (minCostTime_ != 0) {
        output.writeUInt32(2, minCostTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, dungeonGuid_);
      }
      if (minCostTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, minCostTime_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData other = (emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData) obj;

      if (getDungeonGuid()
          != other.getDungeonGuid()) return false;
      if (getMinCostTime()
          != other.getMinCostTime()) return false;
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
      hash = (37 * hash) + DUNGEON_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDungeonGuid());
      hash = (37 * hash) + MIN_COST_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMinCostTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData prototype) {
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
     * Protobuf type {@code CustomDungeonBattleRecordMuipData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomDungeonBattleRecordMuipData)
        emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.internal_static_CustomDungeonBattleRecordMuipData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.internal_static_CustomDungeonBattleRecordMuipData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData.class, emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dungeonGuid_ = 0L;

        minCostTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.internal_static_CustomDungeonBattleRecordMuipData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData build() {
        emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData buildPartial() {
        emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData result = new emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData(this);
        result.dungeonGuid_ = dungeonGuid_;
        result.minCostTime_ = minCostTime_;
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
        if (other instanceof emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData) {
          return mergeFrom((emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData other) {
        if (other == emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData.getDefaultInstance()) return this;
        if (other.getDungeonGuid() != 0L) {
          setDungeonGuid(other.getDungeonGuid());
        }
        if (other.getMinCostTime() != 0) {
          setMinCostTime(other.getMinCostTime());
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
                dungeonGuid_ = input.readUInt64();

                break;
              } // case 8
              case 16: {
                minCostTime_ = input.readUInt32();

                break;
              } // case 16
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

      private long dungeonGuid_ ;
      /**
       * <code>uint64 dungeon_guid = 1;</code>
       * @return The dungeonGuid.
       */
      @java.lang.Override
      public long getDungeonGuid() {
        return dungeonGuid_;
      }
      /**
       * <code>uint64 dungeon_guid = 1;</code>
       * @param value The dungeonGuid to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonGuid(long value) {
        
        dungeonGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 dungeon_guid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonGuid() {
        
        dungeonGuid_ = 0L;
        onChanged();
        return this;
      }

      private int minCostTime_ ;
      /**
       * <code>uint32 min_cost_time = 2;</code>
       * @return The minCostTime.
       */
      @java.lang.Override
      public int getMinCostTime() {
        return minCostTime_;
      }
      /**
       * <code>uint32 min_cost_time = 2;</code>
       * @param value The minCostTime to set.
       * @return This builder for chaining.
       */
      public Builder setMinCostTime(int value) {
        
        minCostTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 min_cost_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinCostTime() {
        
        minCostTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CustomDungeonBattleRecordMuipData)
    }

    // @@protoc_insertion_point(class_scope:CustomDungeonBattleRecordMuipData)
    private static final emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData();
    }

    public static emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomDungeonBattleRecordMuipData>
        PARSER = new com.google.protobuf.AbstractParser<CustomDungeonBattleRecordMuipData>() {
      @java.lang.Override
      public CustomDungeonBattleRecordMuipData parsePartialFrom(
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

    public static com.google.protobuf.Parser<CustomDungeonBattleRecordMuipData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CustomDungeonBattleRecordMuipData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.CustomDungeonBattleRecordMuipDataOuterClass.CustomDungeonBattleRecordMuipData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomDungeonBattleRecordMuipData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomDungeonBattleRecordMuipData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'CustomDungeonBattleRecordMuipData.prot" +
      "o\"P\n!CustomDungeonBattleRecordMuipData\022\024" +
      "\n\014dungeon_guid\030\001 \001(\004\022\025\n\rmin_cost_time\030\002 " +
      "\001(\rB\036\n\034emu.grasscutter.net.oldprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CustomDungeonBattleRecordMuipData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomDungeonBattleRecordMuipData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomDungeonBattleRecordMuipData_descriptor,
        new java.lang.String[] { "DungeonGuid", "MinCostTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
