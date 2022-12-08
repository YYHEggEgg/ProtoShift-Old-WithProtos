// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoopPointUpdateNotify.proto

package emu.grasscutter.net.newproto;

public final class CoopPointUpdateNotifyOuterClass {
  private CoopPointUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoopPointUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoopPointUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.CoopPoint coop_point = 8;</code>
     * @return Whether the coopPoint field is set.
     */
    boolean hasCoopPoint();
    /**
     * <code>.CoopPoint coop_point = 8;</code>
     * @return The coopPoint.
     */
    emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint getCoopPoint();
    /**
     * <code>.CoopPoint coop_point = 8;</code>
     */
    emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPointOrBuilder getCoopPointOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1958;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code CoopPointUpdateNotify}
   */
  public static final class CoopPointUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoopPointUpdateNotify)
      CoopPointUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoopPointUpdateNotify.newBuilder() to construct.
    private CoopPointUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoopPointUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoopPointUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.internal_static_CoopPointUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.internal_static_CoopPointUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify.class, emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify.Builder.class);
    }

    public static final int COOP_POINT_FIELD_NUMBER = 8;
    private emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint coopPoint_;
    /**
     * <code>.CoopPoint coop_point = 8;</code>
     * @return Whether the coopPoint field is set.
     */
    @java.lang.Override
    public boolean hasCoopPoint() {
      return coopPoint_ != null;
    }
    /**
     * <code>.CoopPoint coop_point = 8;</code>
     * @return The coopPoint.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint getCoopPoint() {
      return coopPoint_ == null ? emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint.getDefaultInstance() : coopPoint_;
    }
    /**
     * <code>.CoopPoint coop_point = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPointOrBuilder getCoopPointOrBuilder() {
      return getCoopPoint();
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
      if (coopPoint_ != null) {
        output.writeMessage(8, getCoopPoint());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (coopPoint_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getCoopPoint());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify other = (emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify) obj;

      if (hasCoopPoint() != other.hasCoopPoint()) return false;
      if (hasCoopPoint()) {
        if (!getCoopPoint()
            .equals(other.getCoopPoint())) return false;
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
      if (hasCoopPoint()) {
        hash = (37 * hash) + COOP_POINT_FIELD_NUMBER;
        hash = (53 * hash) + getCoopPoint().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify prototype) {
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
     *   CMD_ID = 1958;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code CoopPointUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoopPointUpdateNotify)
        emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.internal_static_CoopPointUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.internal_static_CoopPointUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify.class, emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (coopPointBuilder_ == null) {
          coopPoint_ = null;
        } else {
          coopPoint_ = null;
          coopPointBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.internal_static_CoopPointUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify build() {
        emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify buildPartial() {
        emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify result = new emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify(this);
        if (coopPointBuilder_ == null) {
          result.coopPoint_ = coopPoint_;
        } else {
          result.coopPoint_ = coopPointBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify other) {
        if (other == emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify.getDefaultInstance()) return this;
        if (other.hasCoopPoint()) {
          mergeCoopPoint(other.getCoopPoint());
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
                    getCoopPointFieldBuilder().getBuilder(),
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

      private emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint coopPoint_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint, emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint.Builder, emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPointOrBuilder> coopPointBuilder_;
      /**
       * <code>.CoopPoint coop_point = 8;</code>
       * @return Whether the coopPoint field is set.
       */
      public boolean hasCoopPoint() {
        return coopPointBuilder_ != null || coopPoint_ != null;
      }
      /**
       * <code>.CoopPoint coop_point = 8;</code>
       * @return The coopPoint.
       */
      public emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint getCoopPoint() {
        if (coopPointBuilder_ == null) {
          return coopPoint_ == null ? emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint.getDefaultInstance() : coopPoint_;
        } else {
          return coopPointBuilder_.getMessage();
        }
      }
      /**
       * <code>.CoopPoint coop_point = 8;</code>
       */
      public Builder setCoopPoint(emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint value) {
        if (coopPointBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          coopPoint_ = value;
          onChanged();
        } else {
          coopPointBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CoopPoint coop_point = 8;</code>
       */
      public Builder setCoopPoint(
          emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint.Builder builderForValue) {
        if (coopPointBuilder_ == null) {
          coopPoint_ = builderForValue.build();
          onChanged();
        } else {
          coopPointBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CoopPoint coop_point = 8;</code>
       */
      public Builder mergeCoopPoint(emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint value) {
        if (coopPointBuilder_ == null) {
          if (coopPoint_ != null) {
            coopPoint_ =
              emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint.newBuilder(coopPoint_).mergeFrom(value).buildPartial();
          } else {
            coopPoint_ = value;
          }
          onChanged();
        } else {
          coopPointBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CoopPoint coop_point = 8;</code>
       */
      public Builder clearCoopPoint() {
        if (coopPointBuilder_ == null) {
          coopPoint_ = null;
          onChanged();
        } else {
          coopPoint_ = null;
          coopPointBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CoopPoint coop_point = 8;</code>
       */
      public emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint.Builder getCoopPointBuilder() {
        
        onChanged();
        return getCoopPointFieldBuilder().getBuilder();
      }
      /**
       * <code>.CoopPoint coop_point = 8;</code>
       */
      public emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPointOrBuilder getCoopPointOrBuilder() {
        if (coopPointBuilder_ != null) {
          return coopPointBuilder_.getMessageOrBuilder();
        } else {
          return coopPoint_ == null ?
              emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint.getDefaultInstance() : coopPoint_;
        }
      }
      /**
       * <code>.CoopPoint coop_point = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint, emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint.Builder, emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPointOrBuilder> 
          getCoopPointFieldBuilder() {
        if (coopPointBuilder_ == null) {
          coopPointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint, emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPoint.Builder, emu.grasscutter.net.newproto.CoopPointOuterClass.CoopPointOrBuilder>(
                  getCoopPoint(),
                  getParentForChildren(),
                  isClean());
          coopPoint_ = null;
        }
        return coopPointBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CoopPointUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:CoopPointUpdateNotify)
    private static final emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify();
    }

    public static emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoopPointUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<CoopPointUpdateNotify>() {
      @java.lang.Override
      public CoopPointUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<CoopPointUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoopPointUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.CoopPointUpdateNotifyOuterClass.CoopPointUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoopPointUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoopPointUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033CoopPointUpdateNotify.proto\032\017CoopPoint" +
      ".proto\"7\n\025CoopPointUpdateNotify\022\036\n\ncoop_" +
      "point\030\010 \001(\0132\n.CoopPointB\036\n\034emu.grasscutt" +
      "er.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.CoopPointOuterClass.getDescriptor(),
        });
    internal_static_CoopPointUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoopPointUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoopPointUpdateNotify_descriptor,
        new java.lang.String[] { "CoopPoint", });
    emu.grasscutter.net.newproto.CoopPointOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}