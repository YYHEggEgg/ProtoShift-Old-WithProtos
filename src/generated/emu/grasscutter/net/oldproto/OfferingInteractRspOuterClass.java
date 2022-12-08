// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OfferingInteractRsp.proto

package emu.grasscutter.net.oldproto;

public final class OfferingInteractRspOuterClass {
  private OfferingInteractRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OfferingInteractRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OfferingInteractRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PlayerOfferingData offering_data = 11;</code>
     * @return Whether the offeringData field is set.
     */
    boolean hasOfferingData();
    /**
     * <code>.PlayerOfferingData offering_data = 11;</code>
     * @return The offeringData.
     */
    emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData getOfferingData();
    /**
     * <code>.PlayerOfferingData offering_data = 11;</code>
     */
    emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder getOfferingDataOrBuilder();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 2908
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code OfferingInteractRsp}
   */
  public static final class OfferingInteractRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OfferingInteractRsp)
      OfferingInteractRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OfferingInteractRsp.newBuilder() to construct.
    private OfferingInteractRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OfferingInteractRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OfferingInteractRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.internal_static_OfferingInteractRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.internal_static_OfferingInteractRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp.class, emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp.Builder.class);
    }

    public static final int OFFERING_DATA_FIELD_NUMBER = 11;
    private emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData offeringData_;
    /**
     * <code>.PlayerOfferingData offering_data = 11;</code>
     * @return Whether the offeringData field is set.
     */
    @java.lang.Override
    public boolean hasOfferingData() {
      return offeringData_ != null;
    }
    /**
     * <code>.PlayerOfferingData offering_data = 11;</code>
     * @return The offeringData.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData getOfferingData() {
      return offeringData_ == null ? emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.getDefaultInstance() : offeringData_;
    }
    /**
     * <code>.PlayerOfferingData offering_data = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder getOfferingDataOrBuilder() {
      return getOfferingData();
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (offeringData_ != null) {
        output.writeMessage(11, getOfferingData());
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (offeringData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getOfferingData());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp other = (emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp) obj;

      if (hasOfferingData() != other.hasOfferingData()) return false;
      if (hasOfferingData()) {
        if (!getOfferingData()
            .equals(other.getOfferingData())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (hasOfferingData()) {
        hash = (37 * hash) + OFFERING_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getOfferingData().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp prototype) {
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
     * CmdId: 2908
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code OfferingInteractRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OfferingInteractRsp)
        emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.internal_static_OfferingInteractRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.internal_static_OfferingInteractRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp.class, emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (offeringDataBuilder_ == null) {
          offeringData_ = null;
        } else {
          offeringData_ = null;
          offeringDataBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.internal_static_OfferingInteractRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp build() {
        emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp buildPartial() {
        emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp result = new emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp(this);
        if (offeringDataBuilder_ == null) {
          result.offeringData_ = offeringData_;
        } else {
          result.offeringData_ = offeringDataBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp other) {
        if (other == emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp.getDefaultInstance()) return this;
        if (other.hasOfferingData()) {
          mergeOfferingData(other.getOfferingData());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 90: {
                input.readMessage(
                    getOfferingDataFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 90
              case 96: {
                retcode_ = input.readInt32();

                break;
              } // case 96
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

      private emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData offeringData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> offeringDataBuilder_;
      /**
       * <code>.PlayerOfferingData offering_data = 11;</code>
       * @return Whether the offeringData field is set.
       */
      public boolean hasOfferingData() {
        return offeringDataBuilder_ != null || offeringData_ != null;
      }
      /**
       * <code>.PlayerOfferingData offering_data = 11;</code>
       * @return The offeringData.
       */
      public emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData getOfferingData() {
        if (offeringDataBuilder_ == null) {
          return offeringData_ == null ? emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.getDefaultInstance() : offeringData_;
        } else {
          return offeringDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.PlayerOfferingData offering_data = 11;</code>
       */
      public Builder setOfferingData(emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData value) {
        if (offeringDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          offeringData_ = value;
          onChanged();
        } else {
          offeringDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.PlayerOfferingData offering_data = 11;</code>
       */
      public Builder setOfferingData(
          emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder builderForValue) {
        if (offeringDataBuilder_ == null) {
          offeringData_ = builderForValue.build();
          onChanged();
        } else {
          offeringDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.PlayerOfferingData offering_data = 11;</code>
       */
      public Builder mergeOfferingData(emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData value) {
        if (offeringDataBuilder_ == null) {
          if (offeringData_ != null) {
            offeringData_ =
              emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.newBuilder(offeringData_).mergeFrom(value).buildPartial();
          } else {
            offeringData_ = value;
          }
          onChanged();
        } else {
          offeringDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.PlayerOfferingData offering_data = 11;</code>
       */
      public Builder clearOfferingData() {
        if (offeringDataBuilder_ == null) {
          offeringData_ = null;
          onChanged();
        } else {
          offeringData_ = null;
          offeringDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.PlayerOfferingData offering_data = 11;</code>
       */
      public emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder getOfferingDataBuilder() {
        
        onChanged();
        return getOfferingDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.PlayerOfferingData offering_data = 11;</code>
       */
      public emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder getOfferingDataOrBuilder() {
        if (offeringDataBuilder_ != null) {
          return offeringDataBuilder_.getMessageOrBuilder();
        } else {
          return offeringData_ == null ?
              emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.getDefaultInstance() : offeringData_;
        }
      }
      /**
       * <code>.PlayerOfferingData offering_data = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> 
          getOfferingDataFieldBuilder() {
        if (offeringDataBuilder_ == null) {
          offeringDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder>(
                  getOfferingData(),
                  getParentForChildren(),
                  isClean());
          offeringData_ = null;
        }
        return offeringDataBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OfferingInteractRsp)
    }

    // @@protoc_insertion_point(class_scope:OfferingInteractRsp)
    private static final emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp();
    }

    public static emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OfferingInteractRsp>
        PARSER = new com.google.protobuf.AbstractParser<OfferingInteractRsp>() {
      @java.lang.Override
      public OfferingInteractRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<OfferingInteractRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OfferingInteractRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.OfferingInteractRspOuterClass.OfferingInteractRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OfferingInteractRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OfferingInteractRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031OfferingInteractRsp.proto\032\030PlayerOffer" +
      "ingData.proto\"R\n\023OfferingInteractRsp\022*\n\r" +
      "offering_data\030\013 \001(\0132\023.PlayerOfferingData" +
      "\022\017\n\007retcode\030\014 \001(\005B\036\n\034emu.grasscutter.net" +
      ".oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.getDescriptor(),
        });
    internal_static_OfferingInteractRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OfferingInteractRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OfferingInteractRsp_descriptor,
        new java.lang.String[] { "OfferingData", "Retcode", });
    emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
