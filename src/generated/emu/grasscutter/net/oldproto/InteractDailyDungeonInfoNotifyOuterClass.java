// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InteractDailyDungeonInfoNotify.proto

package emu.grasscutter.net.oldproto;

public final class InteractDailyDungeonInfoNotifyOuterClass {
  private InteractDailyDungeonInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InteractDailyDungeonInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InteractDailyDungeonInfoNotify)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * CmdId: 919
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code InteractDailyDungeonInfoNotify}
   */
  public static final class InteractDailyDungeonInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InteractDailyDungeonInfoNotify)
      InteractDailyDungeonInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InteractDailyDungeonInfoNotify.newBuilder() to construct.
    private InteractDailyDungeonInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InteractDailyDungeonInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InteractDailyDungeonInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.internal_static_InteractDailyDungeonInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.internal_static_InteractDailyDungeonInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify.class, emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify.Builder.class);
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
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify other = (emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify) obj;

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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify prototype) {
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
     * CmdId: 919
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code InteractDailyDungeonInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InteractDailyDungeonInfoNotify)
        emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.internal_static_InteractDailyDungeonInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.internal_static_InteractDailyDungeonInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify.class, emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.internal_static_InteractDailyDungeonInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify build() {
        emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify buildPartial() {
        emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify result = new emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify(this);
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
        if (other instanceof emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify other) {
        if (other == emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify.getDefaultInstance()) return this;
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


      // @@protoc_insertion_point(builder_scope:InteractDailyDungeonInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:InteractDailyDungeonInfoNotify)
    private static final emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify();
    }

    public static emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InteractDailyDungeonInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<InteractDailyDungeonInfoNotify>() {
      @java.lang.Override
      public InteractDailyDungeonInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<InteractDailyDungeonInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InteractDailyDungeonInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.InteractDailyDungeonInfoNotifyOuterClass.InteractDailyDungeonInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InteractDailyDungeonInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InteractDailyDungeonInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$InteractDailyDungeonInfoNotify.proto\" " +
      "\n\036InteractDailyDungeonInfoNotifyB\036\n\034emu." +
      "grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InteractDailyDungeonInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InteractDailyDungeonInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InteractDailyDungeonInfoNotify_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
