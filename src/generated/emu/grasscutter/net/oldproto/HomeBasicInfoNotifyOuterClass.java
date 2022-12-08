// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeBasicInfoNotify.proto

package emu.grasscutter.net.oldproto;

public final class HomeBasicInfoNotifyOuterClass {
  private HomeBasicInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeBasicInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeBasicInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HomeBasicInfo basic_info = 15;</code>
     * @return Whether the basicInfo field is set.
     */
    boolean hasBasicInfo();
    /**
     * <code>.HomeBasicInfo basic_info = 15;</code>
     * @return The basicInfo.
     */
    emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo getBasicInfo();
    /**
     * <code>.HomeBasicInfo basic_info = 15;</code>
     */
    emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfoOrBuilder getBasicInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 4885
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code HomeBasicInfoNotify}
   */
  public static final class HomeBasicInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeBasicInfoNotify)
      HomeBasicInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeBasicInfoNotify.newBuilder() to construct.
    private HomeBasicInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeBasicInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeBasicInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.internal_static_HomeBasicInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.internal_static_HomeBasicInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify.class, emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify.Builder.class);
    }

    public static final int BASIC_INFO_FIELD_NUMBER = 15;
    private emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo basicInfo_;
    /**
     * <code>.HomeBasicInfo basic_info = 15;</code>
     * @return Whether the basicInfo field is set.
     */
    @java.lang.Override
    public boolean hasBasicInfo() {
      return basicInfo_ != null;
    }
    /**
     * <code>.HomeBasicInfo basic_info = 15;</code>
     * @return The basicInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo getBasicInfo() {
      return basicInfo_ == null ? emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo.getDefaultInstance() : basicInfo_;
    }
    /**
     * <code>.HomeBasicInfo basic_info = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfoOrBuilder getBasicInfoOrBuilder() {
      return getBasicInfo();
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
      if (basicInfo_ != null) {
        output.writeMessage(15, getBasicInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (basicInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getBasicInfo());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify other = (emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify) obj;

      if (hasBasicInfo() != other.hasBasicInfo()) return false;
      if (hasBasicInfo()) {
        if (!getBasicInfo()
            .equals(other.getBasicInfo())) return false;
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
      if (hasBasicInfo()) {
        hash = (37 * hash) + BASIC_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getBasicInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify prototype) {
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
     * CmdId: 4885
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code HomeBasicInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeBasicInfoNotify)
        emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.internal_static_HomeBasicInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.internal_static_HomeBasicInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify.class, emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (basicInfoBuilder_ == null) {
          basicInfo_ = null;
        } else {
          basicInfo_ = null;
          basicInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.internal_static_HomeBasicInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify build() {
        emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify buildPartial() {
        emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify result = new emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify(this);
        if (basicInfoBuilder_ == null) {
          result.basicInfo_ = basicInfo_;
        } else {
          result.basicInfo_ = basicInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify other) {
        if (other == emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify.getDefaultInstance()) return this;
        if (other.hasBasicInfo()) {
          mergeBasicInfo(other.getBasicInfo());
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
              case 122: {
                input.readMessage(
                    getBasicInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 122
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

      private emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo basicInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo, emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo.Builder, emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfoOrBuilder> basicInfoBuilder_;
      /**
       * <code>.HomeBasicInfo basic_info = 15;</code>
       * @return Whether the basicInfo field is set.
       */
      public boolean hasBasicInfo() {
        return basicInfoBuilder_ != null || basicInfo_ != null;
      }
      /**
       * <code>.HomeBasicInfo basic_info = 15;</code>
       * @return The basicInfo.
       */
      public emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo getBasicInfo() {
        if (basicInfoBuilder_ == null) {
          return basicInfo_ == null ? emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo.getDefaultInstance() : basicInfo_;
        } else {
          return basicInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeBasicInfo basic_info = 15;</code>
       */
      public Builder setBasicInfo(emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo value) {
        if (basicInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          basicInfo_ = value;
          onChanged();
        } else {
          basicInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomeBasicInfo basic_info = 15;</code>
       */
      public Builder setBasicInfo(
          emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo.Builder builderForValue) {
        if (basicInfoBuilder_ == null) {
          basicInfo_ = builderForValue.build();
          onChanged();
        } else {
          basicInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomeBasicInfo basic_info = 15;</code>
       */
      public Builder mergeBasicInfo(emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo value) {
        if (basicInfoBuilder_ == null) {
          if (basicInfo_ != null) {
            basicInfo_ =
              emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo.newBuilder(basicInfo_).mergeFrom(value).buildPartial();
          } else {
            basicInfo_ = value;
          }
          onChanged();
        } else {
          basicInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomeBasicInfo basic_info = 15;</code>
       */
      public Builder clearBasicInfo() {
        if (basicInfoBuilder_ == null) {
          basicInfo_ = null;
          onChanged();
        } else {
          basicInfo_ = null;
          basicInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomeBasicInfo basic_info = 15;</code>
       */
      public emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo.Builder getBasicInfoBuilder() {
        
        onChanged();
        return getBasicInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeBasicInfo basic_info = 15;</code>
       */
      public emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfoOrBuilder getBasicInfoOrBuilder() {
        if (basicInfoBuilder_ != null) {
          return basicInfoBuilder_.getMessageOrBuilder();
        } else {
          return basicInfo_ == null ?
              emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo.getDefaultInstance() : basicInfo_;
        }
      }
      /**
       * <code>.HomeBasicInfo basic_info = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo, emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo.Builder, emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfoOrBuilder> 
          getBasicInfoFieldBuilder() {
        if (basicInfoBuilder_ == null) {
          basicInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo, emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfo.Builder, emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.HomeBasicInfoOrBuilder>(
                  getBasicInfo(),
                  getParentForChildren(),
                  isClean());
          basicInfo_ = null;
        }
        return basicInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeBasicInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeBasicInfoNotify)
    private static final emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify();
    }

    public static emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeBasicInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeBasicInfoNotify>() {
      @java.lang.Override
      public HomeBasicInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeBasicInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeBasicInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeBasicInfoNotifyOuterClass.HomeBasicInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeBasicInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeBasicInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031HomeBasicInfoNotify.proto\032\023HomeBasicIn" +
      "fo.proto\"9\n\023HomeBasicInfoNotify\022\"\n\nbasic" +
      "_info\030\017 \001(\0132\016.HomeBasicInfoB\036\n\034emu.grass" +
      "cutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeBasicInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeBasicInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeBasicInfoNotify_descriptor,
        new java.lang.String[] { "BasicInfo", });
    emu.grasscutter.net.oldproto.HomeBasicInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
