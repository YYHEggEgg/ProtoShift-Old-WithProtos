// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlossomChestCreateNotify.proto

package emu.grasscutter.net.oldproto;

public final class BlossomChestCreateNotifyOuterClass {
  private BlossomChestCreateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlossomChestCreateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlossomChestCreateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 refresh_id = 1;</code>
     * @return The refreshId.
     */
    int getRefreshId();

    /**
     * <code>uint32 circle_camp_id = 10;</code>
     * @return The circleCampId.
     */
    int getCircleCampId();
  }
  /**
   * <pre>
   * CmdId: 2721
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code BlossomChestCreateNotify}
   */
  public static final class BlossomChestCreateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlossomChestCreateNotify)
      BlossomChestCreateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlossomChestCreateNotify.newBuilder() to construct.
    private BlossomChestCreateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlossomChestCreateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlossomChestCreateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.internal_static_BlossomChestCreateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.internal_static_BlossomChestCreateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify.class, emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify.Builder.class);
    }

    public static final int REFRESH_ID_FIELD_NUMBER = 1;
    private int refreshId_;
    /**
     * <code>uint32 refresh_id = 1;</code>
     * @return The refreshId.
     */
    @java.lang.Override
    public int getRefreshId() {
      return refreshId_;
    }

    public static final int CIRCLE_CAMP_ID_FIELD_NUMBER = 10;
    private int circleCampId_;
    /**
     * <code>uint32 circle_camp_id = 10;</code>
     * @return The circleCampId.
     */
    @java.lang.Override
    public int getCircleCampId() {
      return circleCampId_;
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
      if (refreshId_ != 0) {
        output.writeUInt32(1, refreshId_);
      }
      if (circleCampId_ != 0) {
        output.writeUInt32(10, circleCampId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (refreshId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, refreshId_);
      }
      if (circleCampId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, circleCampId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify other = (emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify) obj;

      if (getRefreshId()
          != other.getRefreshId()) return false;
      if (getCircleCampId()
          != other.getCircleCampId()) return false;
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
      hash = (37 * hash) + REFRESH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRefreshId();
      hash = (37 * hash) + CIRCLE_CAMP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCircleCampId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify prototype) {
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
     * CmdId: 2721
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code BlossomChestCreateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlossomChestCreateNotify)
        emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.internal_static_BlossomChestCreateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.internal_static_BlossomChestCreateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify.class, emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        refreshId_ = 0;

        circleCampId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.internal_static_BlossomChestCreateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify build() {
        emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify buildPartial() {
        emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify result = new emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify(this);
        result.refreshId_ = refreshId_;
        result.circleCampId_ = circleCampId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify other) {
        if (other == emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify.getDefaultInstance()) return this;
        if (other.getRefreshId() != 0) {
          setRefreshId(other.getRefreshId());
        }
        if (other.getCircleCampId() != 0) {
          setCircleCampId(other.getCircleCampId());
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
                refreshId_ = input.readUInt32();

                break;
              } // case 8
              case 80: {
                circleCampId_ = input.readUInt32();

                break;
              } // case 80
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

      private int refreshId_ ;
      /**
       * <code>uint32 refresh_id = 1;</code>
       * @return The refreshId.
       */
      @java.lang.Override
      public int getRefreshId() {
        return refreshId_;
      }
      /**
       * <code>uint32 refresh_id = 1;</code>
       * @param value The refreshId to set.
       * @return This builder for chaining.
       */
      public Builder setRefreshId(int value) {
        
        refreshId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 refresh_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRefreshId() {
        
        refreshId_ = 0;
        onChanged();
        return this;
      }

      private int circleCampId_ ;
      /**
       * <code>uint32 circle_camp_id = 10;</code>
       * @return The circleCampId.
       */
      @java.lang.Override
      public int getCircleCampId() {
        return circleCampId_;
      }
      /**
       * <code>uint32 circle_camp_id = 10;</code>
       * @param value The circleCampId to set.
       * @return This builder for chaining.
       */
      public Builder setCircleCampId(int value) {
        
        circleCampId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 circle_camp_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCircleCampId() {
        
        circleCampId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BlossomChestCreateNotify)
    }

    // @@protoc_insertion_point(class_scope:BlossomChestCreateNotify)
    private static final emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify();
    }

    public static emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlossomChestCreateNotify>
        PARSER = new com.google.protobuf.AbstractParser<BlossomChestCreateNotify>() {
      @java.lang.Override
      public BlossomChestCreateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<BlossomChestCreateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlossomChestCreateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.BlossomChestCreateNotifyOuterClass.BlossomChestCreateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlossomChestCreateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlossomChestCreateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036BlossomChestCreateNotify.proto\"F\n\030Blos" +
      "somChestCreateNotify\022\022\n\nrefresh_id\030\001 \001(\r" +
      "\022\026\n\016circle_camp_id\030\n \001(\rB\036\n\034emu.grasscut" +
      "ter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BlossomChestCreateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlossomChestCreateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlossomChestCreateNotify_descriptor,
        new java.lang.String[] { "RefreshId", "CircleCampId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
