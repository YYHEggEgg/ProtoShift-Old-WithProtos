// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LunaRiteGroupBundleRegisterNotify.proto

package emu.grasscutter.net.newproto;

public final class LunaRiteGroupBundleRegisterNotifyOuterClass {
  private LunaRiteGroupBundleRegisterNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LunaRiteGroupBundleRegisterNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LunaRiteGroupBundleRegisterNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 group_link_bundle_id = 7;</code>
     * @return The groupLinkBundleId.
     */
    int getGroupLinkBundleId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8455;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code LunaRiteGroupBundleRegisterNotify}
   */
  public static final class LunaRiteGroupBundleRegisterNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LunaRiteGroupBundleRegisterNotify)
      LunaRiteGroupBundleRegisterNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LunaRiteGroupBundleRegisterNotify.newBuilder() to construct.
    private LunaRiteGroupBundleRegisterNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LunaRiteGroupBundleRegisterNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LunaRiteGroupBundleRegisterNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.internal_static_LunaRiteGroupBundleRegisterNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.internal_static_LunaRiteGroupBundleRegisterNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify.class, emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify.Builder.class);
    }

    public static final int GROUP_LINK_BUNDLE_ID_FIELD_NUMBER = 7;
    private int groupLinkBundleId_;
    /**
     * <code>uint32 group_link_bundle_id = 7;</code>
     * @return The groupLinkBundleId.
     */
    @java.lang.Override
    public int getGroupLinkBundleId() {
      return groupLinkBundleId_;
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
      if (groupLinkBundleId_ != 0) {
        output.writeUInt32(7, groupLinkBundleId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (groupLinkBundleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, groupLinkBundleId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify other = (emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify) obj;

      if (getGroupLinkBundleId()
          != other.getGroupLinkBundleId()) return false;
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
      hash = (37 * hash) + GROUP_LINK_BUNDLE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupLinkBundleId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify prototype) {
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
     *   CMD_ID = 8455;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code LunaRiteGroupBundleRegisterNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LunaRiteGroupBundleRegisterNotify)
        emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.internal_static_LunaRiteGroupBundleRegisterNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.internal_static_LunaRiteGroupBundleRegisterNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify.class, emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        groupLinkBundleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.internal_static_LunaRiteGroupBundleRegisterNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify build() {
        emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify buildPartial() {
        emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify result = new emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify(this);
        result.groupLinkBundleId_ = groupLinkBundleId_;
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
        if (other instanceof emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify other) {
        if (other == emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify.getDefaultInstance()) return this;
        if (other.getGroupLinkBundleId() != 0) {
          setGroupLinkBundleId(other.getGroupLinkBundleId());
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
              case 56: {
                groupLinkBundleId_ = input.readUInt32();

                break;
              } // case 56
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

      private int groupLinkBundleId_ ;
      /**
       * <code>uint32 group_link_bundle_id = 7;</code>
       * @return The groupLinkBundleId.
       */
      @java.lang.Override
      public int getGroupLinkBundleId() {
        return groupLinkBundleId_;
      }
      /**
       * <code>uint32 group_link_bundle_id = 7;</code>
       * @param value The groupLinkBundleId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupLinkBundleId(int value) {
        
        groupLinkBundleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_link_bundle_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupLinkBundleId() {
        
        groupLinkBundleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LunaRiteGroupBundleRegisterNotify)
    }

    // @@protoc_insertion_point(class_scope:LunaRiteGroupBundleRegisterNotify)
    private static final emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify();
    }

    public static emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LunaRiteGroupBundleRegisterNotify>
        PARSER = new com.google.protobuf.AbstractParser<LunaRiteGroupBundleRegisterNotify>() {
      @java.lang.Override
      public LunaRiteGroupBundleRegisterNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<LunaRiteGroupBundleRegisterNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LunaRiteGroupBundleRegisterNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.LunaRiteGroupBundleRegisterNotifyOuterClass.LunaRiteGroupBundleRegisterNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LunaRiteGroupBundleRegisterNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LunaRiteGroupBundleRegisterNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'LunaRiteGroupBundleRegisterNotify.prot" +
      "o\"A\n!LunaRiteGroupBundleRegisterNotify\022\034" +
      "\n\024group_link_bundle_id\030\007 \001(\rB\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LunaRiteGroupBundleRegisterNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LunaRiteGroupBundleRegisterNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LunaRiteGroupBundleRegisterNotify_descriptor,
        new java.lang.String[] { "GroupLinkBundleId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
