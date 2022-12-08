// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReunionDailyRefreshNotify.proto

package emu.grasscutter.net.newproto;

public final class ReunionDailyRefreshNotifyOuterClass {
  private ReunionDailyRefreshNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReunionDailyRefreshNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReunionDailyRefreshNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
     * @return Whether the reunionBriefInfo field is set.
     */
    boolean hasReunionBriefInfo();
    /**
     * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
     * @return The reunionBriefInfo.
     */
    emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo getReunionBriefInfo();
    /**
     * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
     */
    emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfoOrBuilder getReunionBriefInfoOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5054;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ReunionDailyRefreshNotify}
   */
  public static final class ReunionDailyRefreshNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReunionDailyRefreshNotify)
      ReunionDailyRefreshNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReunionDailyRefreshNotify.newBuilder() to construct.
    private ReunionDailyRefreshNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReunionDailyRefreshNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReunionDailyRefreshNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.internal_static_ReunionDailyRefreshNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.internal_static_ReunionDailyRefreshNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify.class, emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify.Builder.class);
    }

    public static final int REUNION_BRIEF_INFO_FIELD_NUMBER = 6;
    private emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo reunionBriefInfo_;
    /**
     * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
     * @return Whether the reunionBriefInfo field is set.
     */
    @java.lang.Override
    public boolean hasReunionBriefInfo() {
      return reunionBriefInfo_ != null;
    }
    /**
     * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
     * @return The reunionBriefInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo getReunionBriefInfo() {
      return reunionBriefInfo_ == null ? emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.getDefaultInstance() : reunionBriefInfo_;
    }
    /**
     * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfoOrBuilder getReunionBriefInfoOrBuilder() {
      return getReunionBriefInfo();
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
      if (reunionBriefInfo_ != null) {
        output.writeMessage(6, getReunionBriefInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reunionBriefInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getReunionBriefInfo());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify other = (emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify) obj;

      if (hasReunionBriefInfo() != other.hasReunionBriefInfo()) return false;
      if (hasReunionBriefInfo()) {
        if (!getReunionBriefInfo()
            .equals(other.getReunionBriefInfo())) return false;
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
      if (hasReunionBriefInfo()) {
        hash = (37 * hash) + REUNION_BRIEF_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getReunionBriefInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify prototype) {
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
     *   CMD_ID = 5054;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ReunionDailyRefreshNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReunionDailyRefreshNotify)
        emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.internal_static_ReunionDailyRefreshNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.internal_static_ReunionDailyRefreshNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify.class, emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (reunionBriefInfoBuilder_ == null) {
          reunionBriefInfo_ = null;
        } else {
          reunionBriefInfo_ = null;
          reunionBriefInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.internal_static_ReunionDailyRefreshNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify build() {
        emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify buildPartial() {
        emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify result = new emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify(this);
        if (reunionBriefInfoBuilder_ == null) {
          result.reunionBriefInfo_ = reunionBriefInfo_;
        } else {
          result.reunionBriefInfo_ = reunionBriefInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify other) {
        if (other == emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify.getDefaultInstance()) return this;
        if (other.hasReunionBriefInfo()) {
          mergeReunionBriefInfo(other.getReunionBriefInfo());
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
              case 50: {
                input.readMessage(
                    getReunionBriefInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 50
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

      private emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo reunionBriefInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo, emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.Builder, emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfoOrBuilder> reunionBriefInfoBuilder_;
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
       * @return Whether the reunionBriefInfo field is set.
       */
      public boolean hasReunionBriefInfo() {
        return reunionBriefInfoBuilder_ != null || reunionBriefInfo_ != null;
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
       * @return The reunionBriefInfo.
       */
      public emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo getReunionBriefInfo() {
        if (reunionBriefInfoBuilder_ == null) {
          return reunionBriefInfo_ == null ? emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.getDefaultInstance() : reunionBriefInfo_;
        } else {
          return reunionBriefInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
       */
      public Builder setReunionBriefInfo(emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo value) {
        if (reunionBriefInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          reunionBriefInfo_ = value;
          onChanged();
        } else {
          reunionBriefInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
       */
      public Builder setReunionBriefInfo(
          emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.Builder builderForValue) {
        if (reunionBriefInfoBuilder_ == null) {
          reunionBriefInfo_ = builderForValue.build();
          onChanged();
        } else {
          reunionBriefInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
       */
      public Builder mergeReunionBriefInfo(emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo value) {
        if (reunionBriefInfoBuilder_ == null) {
          if (reunionBriefInfo_ != null) {
            reunionBriefInfo_ =
              emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.newBuilder(reunionBriefInfo_).mergeFrom(value).buildPartial();
          } else {
            reunionBriefInfo_ = value;
          }
          onChanged();
        } else {
          reunionBriefInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
       */
      public Builder clearReunionBriefInfo() {
        if (reunionBriefInfoBuilder_ == null) {
          reunionBriefInfo_ = null;
          onChanged();
        } else {
          reunionBriefInfo_ = null;
          reunionBriefInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
       */
      public emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.Builder getReunionBriefInfoBuilder() {
        
        onChanged();
        return getReunionBriefInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
       */
      public emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfoOrBuilder getReunionBriefInfoOrBuilder() {
        if (reunionBriefInfoBuilder_ != null) {
          return reunionBriefInfoBuilder_.getMessageOrBuilder();
        } else {
          return reunionBriefInfo_ == null ?
              emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.getDefaultInstance() : reunionBriefInfo_;
        }
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo, emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.Builder, emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfoOrBuilder> 
          getReunionBriefInfoFieldBuilder() {
        if (reunionBriefInfoBuilder_ == null) {
          reunionBriefInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo, emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.Builder, emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.ReunionBriefInfoOrBuilder>(
                  getReunionBriefInfo(),
                  getParentForChildren(),
                  isClean());
          reunionBriefInfo_ = null;
        }
        return reunionBriefInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ReunionDailyRefreshNotify)
    }

    // @@protoc_insertion_point(class_scope:ReunionDailyRefreshNotify)
    private static final emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify();
    }

    public static emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReunionDailyRefreshNotify>
        PARSER = new com.google.protobuf.AbstractParser<ReunionDailyRefreshNotify>() {
      @java.lang.Override
      public ReunionDailyRefreshNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ReunionDailyRefreshNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReunionDailyRefreshNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ReunionDailyRefreshNotifyOuterClass.ReunionDailyRefreshNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReunionDailyRefreshNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReunionDailyRefreshNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ReunionDailyRefreshNotify.proto\032\026Reuni" +
      "onBriefInfo.proto\"J\n\031ReunionDailyRefresh" +
      "Notify\022-\n\022reunion_brief_info\030\006 \001(\0132\021.Reu" +
      "nionBriefInfoB\036\n\034emu.grasscutter.net.new" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.getDescriptor(),
        });
    internal_static_ReunionDailyRefreshNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReunionDailyRefreshNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReunionDailyRefreshNotify_descriptor,
        new java.lang.String[] { "ReunionBriefInfo", });
    emu.grasscutter.net.newproto.ReunionBriefInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
