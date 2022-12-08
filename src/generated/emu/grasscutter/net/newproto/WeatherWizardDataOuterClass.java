// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WeatherWizardData.proto

package emu.grasscutter.net.newproto;

public final class WeatherWizardDataOuterClass {
  private WeatherWizardDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WeatherWizardDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WeatherWizardData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 shield_value = 6;</code>
     * @return The shieldValue.
     */
    int getShieldValue();
  }
  /**
   * Protobuf type {@code WeatherWizardData}
   */
  public static final class WeatherWizardData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WeatherWizardData)
      WeatherWizardDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WeatherWizardData.newBuilder() to construct.
    private WeatherWizardData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WeatherWizardData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WeatherWizardData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.internal_static_WeatherWizardData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.internal_static_WeatherWizardData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData.class, emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData.Builder.class);
    }

    public static final int SHIELD_VALUE_FIELD_NUMBER = 6;
    private int shieldValue_;
    /**
     * <code>uint32 shield_value = 6;</code>
     * @return The shieldValue.
     */
    @java.lang.Override
    public int getShieldValue() {
      return shieldValue_;
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
      if (shieldValue_ != 0) {
        output.writeUInt32(6, shieldValue_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (shieldValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, shieldValue_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData other = (emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData) obj;

      if (getShieldValue()
          != other.getShieldValue()) return false;
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
      hash = (37 * hash) + SHIELD_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getShieldValue();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData prototype) {
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
     * Protobuf type {@code WeatherWizardData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WeatherWizardData)
        emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.internal_static_WeatherWizardData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.internal_static_WeatherWizardData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData.class, emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        shieldValue_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.internal_static_WeatherWizardData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData build() {
        emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData buildPartial() {
        emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData result = new emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData(this);
        result.shieldValue_ = shieldValue_;
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
        if (other instanceof emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData) {
          return mergeFrom((emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData other) {
        if (other == emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData.getDefaultInstance()) return this;
        if (other.getShieldValue() != 0) {
          setShieldValue(other.getShieldValue());
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
              case 48: {
                shieldValue_ = input.readUInt32();

                break;
              } // case 48
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

      private int shieldValue_ ;
      /**
       * <code>uint32 shield_value = 6;</code>
       * @return The shieldValue.
       */
      @java.lang.Override
      public int getShieldValue() {
        return shieldValue_;
      }
      /**
       * <code>uint32 shield_value = 6;</code>
       * @param value The shieldValue to set.
       * @return This builder for chaining.
       */
      public Builder setShieldValue(int value) {
        
        shieldValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 shield_value = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearShieldValue() {
        
        shieldValue_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WeatherWizardData)
    }

    // @@protoc_insertion_point(class_scope:WeatherWizardData)
    private static final emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData();
    }

    public static emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WeatherWizardData>
        PARSER = new com.google.protobuf.AbstractParser<WeatherWizardData>() {
      @java.lang.Override
      public WeatherWizardData parsePartialFrom(
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

    public static com.google.protobuf.Parser<WeatherWizardData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WeatherWizardData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.WeatherWizardDataOuterClass.WeatherWizardData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeatherWizardData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeatherWizardData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027WeatherWizardData.proto\")\n\021WeatherWiza" +
      "rdData\022\024\n\014shield_value\030\006 \001(\rB\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WeatherWizardData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WeatherWizardData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeatherWizardData_descriptor,
        new java.lang.String[] { "ShieldValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
