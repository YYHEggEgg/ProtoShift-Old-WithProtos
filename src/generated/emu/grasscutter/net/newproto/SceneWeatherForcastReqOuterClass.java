// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneWeatherForcastReq.proto

package emu.grasscutter.net.newproto;

public final class SceneWeatherForcastReqOuterClass {
  private SceneWeatherForcastReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneWeatherForcastReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneWeatherForcastReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 weather_area_id = 3;</code>
     * @return The weatherAreaId.
     */
    int getWeatherAreaId();
  }
  /**
   * <pre>
   * CmdId: 3064
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code SceneWeatherForcastReq}
   */
  public static final class SceneWeatherForcastReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneWeatherForcastReq)
      SceneWeatherForcastReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneWeatherForcastReq.newBuilder() to construct.
    private SceneWeatherForcastReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneWeatherForcastReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneWeatherForcastReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.internal_static_SceneWeatherForcastReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.internal_static_SceneWeatherForcastReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq.class, emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq.Builder.class);
    }

    public static final int WEATHER_AREA_ID_FIELD_NUMBER = 3;
    private int weatherAreaId_;
    /**
     * <code>uint32 weather_area_id = 3;</code>
     * @return The weatherAreaId.
     */
    @java.lang.Override
    public int getWeatherAreaId() {
      return weatherAreaId_;
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
      if (weatherAreaId_ != 0) {
        output.writeUInt32(3, weatherAreaId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (weatherAreaId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, weatherAreaId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq other = (emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq) obj;

      if (getWeatherAreaId()
          != other.getWeatherAreaId()) return false;
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
      hash = (37 * hash) + WEATHER_AREA_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWeatherAreaId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq prototype) {
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
     * CmdId: 3064
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code SceneWeatherForcastReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneWeatherForcastReq)
        emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.internal_static_SceneWeatherForcastReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.internal_static_SceneWeatherForcastReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq.class, emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        weatherAreaId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.internal_static_SceneWeatherForcastReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq build() {
        emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq buildPartial() {
        emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq result = new emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq(this);
        result.weatherAreaId_ = weatherAreaId_;
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
        if (other instanceof emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq) {
          return mergeFrom((emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq other) {
        if (other == emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq.getDefaultInstance()) return this;
        if (other.getWeatherAreaId() != 0) {
          setWeatherAreaId(other.getWeatherAreaId());
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
              case 24: {
                weatherAreaId_ = input.readUInt32();

                break;
              } // case 24
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

      private int weatherAreaId_ ;
      /**
       * <code>uint32 weather_area_id = 3;</code>
       * @return The weatherAreaId.
       */
      @java.lang.Override
      public int getWeatherAreaId() {
        return weatherAreaId_;
      }
      /**
       * <code>uint32 weather_area_id = 3;</code>
       * @param value The weatherAreaId to set.
       * @return This builder for chaining.
       */
      public Builder setWeatherAreaId(int value) {
        
        weatherAreaId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weather_area_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeatherAreaId() {
        
        weatherAreaId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneWeatherForcastReq)
    }

    // @@protoc_insertion_point(class_scope:SceneWeatherForcastReq)
    private static final emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq();
    }

    public static emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneWeatherForcastReq>
        PARSER = new com.google.protobuf.AbstractParser<SceneWeatherForcastReq>() {
      @java.lang.Override
      public SceneWeatherForcastReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneWeatherForcastReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneWeatherForcastReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SceneWeatherForcastReqOuterClass.SceneWeatherForcastReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneWeatherForcastReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneWeatherForcastReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SceneWeatherForcastReq.proto\"1\n\026SceneW" +
      "eatherForcastReq\022\027\n\017weather_area_id\030\003 \001(" +
      "\rB\036\n\034emu.grasscutter.net.newprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneWeatherForcastReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneWeatherForcastReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneWeatherForcastReq_descriptor,
        new java.lang.String[] { "WeatherAreaId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
