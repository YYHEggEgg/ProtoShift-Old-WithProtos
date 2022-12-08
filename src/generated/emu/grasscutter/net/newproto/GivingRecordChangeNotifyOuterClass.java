// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GivingRecordChangeNotify.proto

package emu.grasscutter.net.newproto;

public final class GivingRecordChangeNotifyOuterClass {
  private GivingRecordChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GivingRecordChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GivingRecordChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_deactive = 14;</code>
     * @return The isDeactive.
     */
    boolean getIsDeactive();

    /**
     * <code>.GivingRecord giving_record = 15;</code>
     * @return Whether the givingRecord field is set.
     */
    boolean hasGivingRecord();
    /**
     * <code>.GivingRecord giving_record = 15;</code>
     * @return The givingRecord.
     */
    emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord getGivingRecord();
    /**
     * <code>.GivingRecord giving_record = 15;</code>
     */
    emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecordOrBuilder getGivingRecordOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 187;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GivingRecordChangeNotify}
   */
  public static final class GivingRecordChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GivingRecordChangeNotify)
      GivingRecordChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GivingRecordChangeNotify.newBuilder() to construct.
    private GivingRecordChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GivingRecordChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GivingRecordChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.class, emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.Builder.class);
    }

    public static final int IS_DEACTIVE_FIELD_NUMBER = 14;
    private boolean isDeactive_;
    /**
     * <code>bool is_deactive = 14;</code>
     * @return The isDeactive.
     */
    @java.lang.Override
    public boolean getIsDeactive() {
      return isDeactive_;
    }

    public static final int GIVING_RECORD_FIELD_NUMBER = 15;
    private emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord givingRecord_;
    /**
     * <code>.GivingRecord giving_record = 15;</code>
     * @return Whether the givingRecord field is set.
     */
    @java.lang.Override
    public boolean hasGivingRecord() {
      return givingRecord_ != null;
    }
    /**
     * <code>.GivingRecord giving_record = 15;</code>
     * @return The givingRecord.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord getGivingRecord() {
      return givingRecord_ == null ? emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord.getDefaultInstance() : givingRecord_;
    }
    /**
     * <code>.GivingRecord giving_record = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecordOrBuilder getGivingRecordOrBuilder() {
      return getGivingRecord();
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
      if (isDeactive_ != false) {
        output.writeBool(14, isDeactive_);
      }
      if (givingRecord_ != null) {
        output.writeMessage(15, getGivingRecord());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isDeactive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isDeactive_);
      }
      if (givingRecord_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getGivingRecord());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify other = (emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify) obj;

      if (getIsDeactive()
          != other.getIsDeactive()) return false;
      if (hasGivingRecord() != other.hasGivingRecord()) return false;
      if (hasGivingRecord()) {
        if (!getGivingRecord()
            .equals(other.getGivingRecord())) return false;
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
      hash = (37 * hash) + IS_DEACTIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsDeactive());
      if (hasGivingRecord()) {
        hash = (37 * hash) + GIVING_RECORD_FIELD_NUMBER;
        hash = (53 * hash) + getGivingRecord().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify prototype) {
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
     *   CMD_ID = 187;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GivingRecordChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GivingRecordChangeNotify)
        emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.class, emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isDeactive_ = false;

        if (givingRecordBuilder_ == null) {
          givingRecord_ = null;
        } else {
          givingRecord_ = null;
          givingRecordBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.internal_static_GivingRecordChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify build() {
        emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify buildPartial() {
        emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify result = new emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify(this);
        result.isDeactive_ = isDeactive_;
        if (givingRecordBuilder_ == null) {
          result.givingRecord_ = givingRecord_;
        } else {
          result.givingRecord_ = givingRecordBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify other) {
        if (other == emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify.getDefaultInstance()) return this;
        if (other.getIsDeactive() != false) {
          setIsDeactive(other.getIsDeactive());
        }
        if (other.hasGivingRecord()) {
          mergeGivingRecord(other.getGivingRecord());
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
              case 112: {
                isDeactive_ = input.readBool();

                break;
              } // case 112
              case 122: {
                input.readMessage(
                    getGivingRecordFieldBuilder().getBuilder(),
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

      private boolean isDeactive_ ;
      /**
       * <code>bool is_deactive = 14;</code>
       * @return The isDeactive.
       */
      @java.lang.Override
      public boolean getIsDeactive() {
        return isDeactive_;
      }
      /**
       * <code>bool is_deactive = 14;</code>
       * @param value The isDeactive to set.
       * @return This builder for chaining.
       */
      public Builder setIsDeactive(boolean value) {
        
        isDeactive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_deactive = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsDeactive() {
        
        isDeactive_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord givingRecord_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord, emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord.Builder, emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecordOrBuilder> givingRecordBuilder_;
      /**
       * <code>.GivingRecord giving_record = 15;</code>
       * @return Whether the givingRecord field is set.
       */
      public boolean hasGivingRecord() {
        return givingRecordBuilder_ != null || givingRecord_ != null;
      }
      /**
       * <code>.GivingRecord giving_record = 15;</code>
       * @return The givingRecord.
       */
      public emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord getGivingRecord() {
        if (givingRecordBuilder_ == null) {
          return givingRecord_ == null ? emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord.getDefaultInstance() : givingRecord_;
        } else {
          return givingRecordBuilder_.getMessage();
        }
      }
      /**
       * <code>.GivingRecord giving_record = 15;</code>
       */
      public Builder setGivingRecord(emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord value) {
        if (givingRecordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          givingRecord_ = value;
          onChanged();
        } else {
          givingRecordBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GivingRecord giving_record = 15;</code>
       */
      public Builder setGivingRecord(
          emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord.Builder builderForValue) {
        if (givingRecordBuilder_ == null) {
          givingRecord_ = builderForValue.build();
          onChanged();
        } else {
          givingRecordBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GivingRecord giving_record = 15;</code>
       */
      public Builder mergeGivingRecord(emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord value) {
        if (givingRecordBuilder_ == null) {
          if (givingRecord_ != null) {
            givingRecord_ =
              emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord.newBuilder(givingRecord_).mergeFrom(value).buildPartial();
          } else {
            givingRecord_ = value;
          }
          onChanged();
        } else {
          givingRecordBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GivingRecord giving_record = 15;</code>
       */
      public Builder clearGivingRecord() {
        if (givingRecordBuilder_ == null) {
          givingRecord_ = null;
          onChanged();
        } else {
          givingRecord_ = null;
          givingRecordBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GivingRecord giving_record = 15;</code>
       */
      public emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord.Builder getGivingRecordBuilder() {
        
        onChanged();
        return getGivingRecordFieldBuilder().getBuilder();
      }
      /**
       * <code>.GivingRecord giving_record = 15;</code>
       */
      public emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecordOrBuilder getGivingRecordOrBuilder() {
        if (givingRecordBuilder_ != null) {
          return givingRecordBuilder_.getMessageOrBuilder();
        } else {
          return givingRecord_ == null ?
              emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord.getDefaultInstance() : givingRecord_;
        }
      }
      /**
       * <code>.GivingRecord giving_record = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord, emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord.Builder, emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecordOrBuilder> 
          getGivingRecordFieldBuilder() {
        if (givingRecordBuilder_ == null) {
          givingRecordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord, emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecord.Builder, emu.grasscutter.net.newproto.GivingRecordOuterClass.GivingRecordOrBuilder>(
                  getGivingRecord(),
                  getParentForChildren(),
                  isClean());
          givingRecord_ = null;
        }
        return givingRecordBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GivingRecordChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:GivingRecordChangeNotify)
    private static final emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify();
    }

    public static emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GivingRecordChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<GivingRecordChangeNotify>() {
      @java.lang.Override
      public GivingRecordChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GivingRecordChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GivingRecordChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GivingRecordChangeNotifyOuterClass.GivingRecordChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GivingRecordChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GivingRecordChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GivingRecordChangeNotify.proto\032\022Giving" +
      "Record.proto\"U\n\030GivingRecordChangeNotify" +
      "\022\023\n\013is_deactive\030\016 \001(\010\022$\n\rgiving_record\030\017" +
      " \001(\0132\r.GivingRecordB\036\n\034emu.grasscutter.n" +
      "et.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.GivingRecordOuterClass.getDescriptor(),
        });
    internal_static_GivingRecordChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GivingRecordChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GivingRecordChangeNotify_descriptor,
        new java.lang.String[] { "IsDeactive", "GivingRecord", });
    emu.grasscutter.net.newproto.GivingRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
