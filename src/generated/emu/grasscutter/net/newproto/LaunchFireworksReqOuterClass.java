// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LaunchFireworksReq.proto

package emu.grasscutter.net.newproto;

public final class LaunchFireworksReqOuterClass {
  private LaunchFireworksReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LaunchFireworksReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LaunchFireworksReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
     * @return Whether the schemeData field is set.
     */
    boolean hasSchemeData();
    /**
     * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
     * @return The schemeData.
     */
    emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData getSchemeData();
    /**
     * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
     */
    emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder getSchemeDataOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5977;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code LaunchFireworksReq}
   */
  public static final class LaunchFireworksReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LaunchFireworksReq)
      LaunchFireworksReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LaunchFireworksReq.newBuilder() to construct.
    private LaunchFireworksReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LaunchFireworksReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LaunchFireworksReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.internal_static_LaunchFireworksReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.internal_static_LaunchFireworksReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq.class, emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq.Builder.class);
    }

    public static final int SCHEME_DATA_FIELD_NUMBER = 8;
    private emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData schemeData_;
    /**
     * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
     * @return Whether the schemeData field is set.
     */
    @java.lang.Override
    public boolean hasSchemeData() {
      return schemeData_ != null;
    }
    /**
     * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
     * @return The schemeData.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData getSchemeData() {
      return schemeData_ == null ? emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.getDefaultInstance() : schemeData_;
    }
    /**
     * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder getSchemeDataOrBuilder() {
      return getSchemeData();
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
      if (schemeData_ != null) {
        output.writeMessage(8, getSchemeData());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (schemeData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getSchemeData());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq other = (emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq) obj;

      if (hasSchemeData() != other.hasSchemeData()) return false;
      if (hasSchemeData()) {
        if (!getSchemeData()
            .equals(other.getSchemeData())) return false;
      }
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
      if (hasSchemeData()) {
        hash = (37 * hash) + SCHEME_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getSchemeData().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq prototype) {
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
     *   CMD_ID = 5977;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code LaunchFireworksReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LaunchFireworksReq)
        emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.internal_static_LaunchFireworksReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.internal_static_LaunchFireworksReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq.class, emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (schemeDataBuilder_ == null) {
          schemeData_ = null;
        } else {
          schemeData_ = null;
          schemeDataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.internal_static_LaunchFireworksReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq build() {
        emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq buildPartial() {
        emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq result = new emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq(this);
        if (schemeDataBuilder_ == null) {
          result.schemeData_ = schemeData_;
        } else {
          result.schemeData_ = schemeDataBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq) {
          return mergeFrom((emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq other) {
        if (other == emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq.getDefaultInstance()) return this;
        if (other.hasSchemeData()) {
          mergeSchemeData(other.getSchemeData());
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
              case 66: {
                input.readMessage(
                    getSchemeDataFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 66
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

      private emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData schemeData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData, emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder, emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder> schemeDataBuilder_;
      /**
       * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
       * @return Whether the schemeData field is set.
       */
      public boolean hasSchemeData() {
        return schemeDataBuilder_ != null || schemeData_ != null;
      }
      /**
       * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
       * @return The schemeData.
       */
      public emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData getSchemeData() {
        if (schemeDataBuilder_ == null) {
          return schemeData_ == null ? emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.getDefaultInstance() : schemeData_;
        } else {
          return schemeDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
       */
      public Builder setSchemeData(emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData value) {
        if (schemeDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          schemeData_ = value;
          onChanged();
        } else {
          schemeDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
       */
      public Builder setSchemeData(
          emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder builderForValue) {
        if (schemeDataBuilder_ == null) {
          schemeData_ = builderForValue.build();
          onChanged();
        } else {
          schemeDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
       */
      public Builder mergeSchemeData(emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData value) {
        if (schemeDataBuilder_ == null) {
          if (schemeData_ != null) {
            schemeData_ =
              emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.newBuilder(schemeData_).mergeFrom(value).buildPartial();
          } else {
            schemeData_ = value;
          }
          onChanged();
        } else {
          schemeDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
       */
      public Builder clearSchemeData() {
        if (schemeDataBuilder_ == null) {
          schemeData_ = null;
          onChanged();
        } else {
          schemeData_ = null;
          schemeDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
       */
      public emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder getSchemeDataBuilder() {
        
        onChanged();
        return getSchemeDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
       */
      public emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder getSchemeDataOrBuilder() {
        if (schemeDataBuilder_ != null) {
          return schemeDataBuilder_.getMessageOrBuilder();
        } else {
          return schemeData_ == null ?
              emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.getDefaultInstance() : schemeData_;
        }
      }
      /**
       * <code>.FireworksLaunchSchemeData scheme_data = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData, emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder, emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder> 
          getSchemeDataFieldBuilder() {
        if (schemeDataBuilder_ == null) {
          schemeDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData, emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData.Builder, emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeDataOrBuilder>(
                  getSchemeData(),
                  getParentForChildren(),
                  isClean());
          schemeData_ = null;
        }
        return schemeDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:LaunchFireworksReq)
    }

    // @@protoc_insertion_point(class_scope:LaunchFireworksReq)
    private static final emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq();
    }

    public static emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LaunchFireworksReq>
        PARSER = new com.google.protobuf.AbstractParser<LaunchFireworksReq>() {
      @java.lang.Override
      public LaunchFireworksReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<LaunchFireworksReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LaunchFireworksReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.LaunchFireworksReqOuterClass.LaunchFireworksReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LaunchFireworksReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LaunchFireworksReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030LaunchFireworksReq.proto\032\037FireworksLau" +
      "nchSchemeData.proto\"E\n\022LaunchFireworksRe" +
      "q\022/\n\013scheme_data\030\010 \001(\0132\032.FireworksLaunch" +
      "SchemeDataB\036\n\034emu.grasscutter.net.newpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.getDescriptor(),
        });
    internal_static_LaunchFireworksReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LaunchFireworksReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LaunchFireworksReq_descriptor,
        new java.lang.String[] { "SchemeData", });
    emu.grasscutter.net.newproto.FireworksLaunchSchemeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
