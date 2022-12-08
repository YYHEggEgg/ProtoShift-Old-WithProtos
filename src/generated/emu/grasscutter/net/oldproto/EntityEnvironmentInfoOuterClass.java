// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EntityEnvironmentInfo.proto

package emu.grasscutter.net.oldproto;

public final class EntityEnvironmentInfoOuterClass {
  private EntityEnvironmentInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EntityEnvironmentInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EntityEnvironmentInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 json_climate_type = 1;</code>
     * @return The jsonClimateType.
     */
    int getJsonClimateType();

    /**
     * <code>uint32 climate_area_id = 2;</code>
     * @return The climateAreaId.
     */
    int getClimateAreaId();
  }
  /**
   * Protobuf type {@code EntityEnvironmentInfo}
   */
  public static final class EntityEnvironmentInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EntityEnvironmentInfo)
      EntityEnvironmentInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EntityEnvironmentInfo.newBuilder() to construct.
    private EntityEnvironmentInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EntityEnvironmentInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EntityEnvironmentInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.internal_static_EntityEnvironmentInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.internal_static_EntityEnvironmentInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.class, emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.Builder.class);
    }

    public static final int JSON_CLIMATE_TYPE_FIELD_NUMBER = 1;
    private int jsonClimateType_;
    /**
     * <code>uint32 json_climate_type = 1;</code>
     * @return The jsonClimateType.
     */
    @java.lang.Override
    public int getJsonClimateType() {
      return jsonClimateType_;
    }

    public static final int CLIMATE_AREA_ID_FIELD_NUMBER = 2;
    private int climateAreaId_;
    /**
     * <code>uint32 climate_area_id = 2;</code>
     * @return The climateAreaId.
     */
    @java.lang.Override
    public int getClimateAreaId() {
      return climateAreaId_;
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
      if (jsonClimateType_ != 0) {
        output.writeUInt32(1, jsonClimateType_);
      }
      if (climateAreaId_ != 0) {
        output.writeUInt32(2, climateAreaId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (jsonClimateType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, jsonClimateType_);
      }
      if (climateAreaId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, climateAreaId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo other = (emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo) obj;

      if (getJsonClimateType()
          != other.getJsonClimateType()) return false;
      if (getClimateAreaId()
          != other.getClimateAreaId()) return false;
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
      hash = (37 * hash) + JSON_CLIMATE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getJsonClimateType();
      hash = (37 * hash) + CLIMATE_AREA_ID_FIELD_NUMBER;
      hash = (53 * hash) + getClimateAreaId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo prototype) {
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
     * Protobuf type {@code EntityEnvironmentInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EntityEnvironmentInfo)
        emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.internal_static_EntityEnvironmentInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.internal_static_EntityEnvironmentInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.class, emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        jsonClimateType_ = 0;

        climateAreaId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.internal_static_EntityEnvironmentInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo build() {
        emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo buildPartial() {
        emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo result = new emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo(this);
        result.jsonClimateType_ = jsonClimateType_;
        result.climateAreaId_ = climateAreaId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo other) {
        if (other == emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.getDefaultInstance()) return this;
        if (other.getJsonClimateType() != 0) {
          setJsonClimateType(other.getJsonClimateType());
        }
        if (other.getClimateAreaId() != 0) {
          setClimateAreaId(other.getClimateAreaId());
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
                jsonClimateType_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                climateAreaId_ = input.readUInt32();

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

      private int jsonClimateType_ ;
      /**
       * <code>uint32 json_climate_type = 1;</code>
       * @return The jsonClimateType.
       */
      @java.lang.Override
      public int getJsonClimateType() {
        return jsonClimateType_;
      }
      /**
       * <code>uint32 json_climate_type = 1;</code>
       * @param value The jsonClimateType to set.
       * @return This builder for chaining.
       */
      public Builder setJsonClimateType(int value) {
        
        jsonClimateType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 json_climate_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearJsonClimateType() {
        
        jsonClimateType_ = 0;
        onChanged();
        return this;
      }

      private int climateAreaId_ ;
      /**
       * <code>uint32 climate_area_id = 2;</code>
       * @return The climateAreaId.
       */
      @java.lang.Override
      public int getClimateAreaId() {
        return climateAreaId_;
      }
      /**
       * <code>uint32 climate_area_id = 2;</code>
       * @param value The climateAreaId to set.
       * @return This builder for chaining.
       */
      public Builder setClimateAreaId(int value) {
        
        climateAreaId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 climate_area_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearClimateAreaId() {
        
        climateAreaId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EntityEnvironmentInfo)
    }

    // @@protoc_insertion_point(class_scope:EntityEnvironmentInfo)
    private static final emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo();
    }

    public static emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EntityEnvironmentInfo>
        PARSER = new com.google.protobuf.AbstractParser<EntityEnvironmentInfo>() {
      @java.lang.Override
      public EntityEnvironmentInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<EntityEnvironmentInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EntityEnvironmentInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityEnvironmentInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityEnvironmentInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033EntityEnvironmentInfo.proto\"K\n\025EntityE" +
      "nvironmentInfo\022\031\n\021json_climate_type\030\001 \001(" +
      "\r\022\027\n\017climate_area_id\030\002 \001(\rB\036\n\034emu.grassc" +
      "utter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EntityEnvironmentInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EntityEnvironmentInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityEnvironmentInfo_descriptor,
        new java.lang.String[] { "JsonClimateType", "ClimateAreaId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
