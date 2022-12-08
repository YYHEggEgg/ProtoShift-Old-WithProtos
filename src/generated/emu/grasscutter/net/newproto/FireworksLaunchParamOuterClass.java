// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FireworksLaunchParam.proto

package emu.grasscutter.net.newproto;

public final class FireworksLaunchParamOuterClass {
  private FireworksLaunchParamOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FireworksLaunchParamOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FireworksLaunchParam)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.FireworksLaunchParamType type = 4;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.FireworksLaunchParamType type = 4;</code>
     * @return The type.
     */
    emu.grasscutter.net.newproto.FireworksLaunchParamTypeOuterClass.FireworksLaunchParamType getType();

    /**
     * <code>int32 value = 2;</code>
     * @return The value.
     */
    int getValue();
  }
  /**
   * Protobuf type {@code FireworksLaunchParam}
   */
  public static final class FireworksLaunchParam extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FireworksLaunchParam)
      FireworksLaunchParamOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FireworksLaunchParam.newBuilder() to construct.
    private FireworksLaunchParam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FireworksLaunchParam() {
      type_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FireworksLaunchParam();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.internal_static_FireworksLaunchParam_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.internal_static_FireworksLaunchParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam.class, emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 4;
    private int type_;
    /**
     * <code>.FireworksLaunchParamType type = 4;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.FireworksLaunchParamType type = 4;</code>
     * @return The type.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.FireworksLaunchParamTypeOuterClass.FireworksLaunchParamType getType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.FireworksLaunchParamTypeOuterClass.FireworksLaunchParamType result = emu.grasscutter.net.newproto.FireworksLaunchParamTypeOuterClass.FireworksLaunchParamType.valueOf(type_);
      return result == null ? emu.grasscutter.net.newproto.FireworksLaunchParamTypeOuterClass.FireworksLaunchParamType.UNRECOGNIZED : result;
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private int value_;
    /**
     * <code>int32 value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public int getValue() {
      return value_;
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
      if (value_ != 0) {
        output.writeInt32(2, value_);
      }
      if (type_ != emu.grasscutter.net.newproto.FireworksLaunchParamTypeOuterClass.FireworksLaunchParamType.FIREWORKS_LAUNCH_PARAM_TYPE_NONE.getNumber()) {
        output.writeEnum(4, type_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, value_);
      }
      if (type_ != emu.grasscutter.net.newproto.FireworksLaunchParamTypeOuterClass.FireworksLaunchParamType.FIREWORKS_LAUNCH_PARAM_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, type_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam other = (emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam) obj;

      if (type_ != other.type_) return false;
      if (getValue()
          != other.getValue()) return false;
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam prototype) {
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
     * Protobuf type {@code FireworksLaunchParam}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FireworksLaunchParam)
        emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.internal_static_FireworksLaunchParam_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.internal_static_FireworksLaunchParam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam.class, emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = 0;

        value_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.internal_static_FireworksLaunchParam_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam build() {
        emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam buildPartial() {
        emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam result = new emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam(this);
        result.type_ = type_;
        result.value_ = value_;
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
        if (other instanceof emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam) {
          return mergeFrom((emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam other) {
        if (other == emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.getValue() != 0) {
          setValue(other.getValue());
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
                value_ = input.readInt32();

                break;
              } // case 16
              case 32: {
                type_ = input.readEnum();

                break;
              } // case 32
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

      private int type_ = 0;
      /**
       * <code>.FireworksLaunchParamType type = 4;</code>
       * @return The enum numeric value on the wire for type.
       */
      @java.lang.Override public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.FireworksLaunchParamType type = 4;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.FireworksLaunchParamType type = 4;</code>
       * @return The type.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.FireworksLaunchParamTypeOuterClass.FireworksLaunchParamType getType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.FireworksLaunchParamTypeOuterClass.FireworksLaunchParamType result = emu.grasscutter.net.newproto.FireworksLaunchParamTypeOuterClass.FireworksLaunchParamType.valueOf(type_);
        return result == null ? emu.grasscutter.net.newproto.FireworksLaunchParamTypeOuterClass.FireworksLaunchParamType.UNRECOGNIZED : result;
      }
      /**
       * <code>.FireworksLaunchParamType type = 4;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(emu.grasscutter.net.newproto.FireworksLaunchParamTypeOuterClass.FireworksLaunchParamType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.FireworksLaunchParamType type = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private int value_ ;
      /**
       * <code>int32 value = 2;</code>
       * @return The value.
       */
      @java.lang.Override
      public int getValue() {
        return value_;
      }
      /**
       * <code>int32 value = 2;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(int value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 value = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        
        value_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FireworksLaunchParam)
    }

    // @@protoc_insertion_point(class_scope:FireworksLaunchParam)
    private static final emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam();
    }

    public static emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FireworksLaunchParam>
        PARSER = new com.google.protobuf.AbstractParser<FireworksLaunchParam>() {
      @java.lang.Override
      public FireworksLaunchParam parsePartialFrom(
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

    public static com.google.protobuf.Parser<FireworksLaunchParam> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FireworksLaunchParam> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.FireworksLaunchParamOuterClass.FireworksLaunchParam getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FireworksLaunchParam_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FireworksLaunchParam_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032FireworksLaunchParam.proto\032\036FireworksL" +
      "aunchParamType.proto\"N\n\024FireworksLaunchP" +
      "aram\022\'\n\004type\030\004 \001(\0162\031.FireworksLaunchPara" +
      "mType\022\r\n\005value\030\002 \001(\005B\036\n\034emu.grasscutter." +
      "net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.FireworksLaunchParamTypeOuterClass.getDescriptor(),
        });
    internal_static_FireworksLaunchParam_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FireworksLaunchParam_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FireworksLaunchParam_descriptor,
        new java.lang.String[] { "Type", "Value", });
    emu.grasscutter.net.newproto.FireworksLaunchParamTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
