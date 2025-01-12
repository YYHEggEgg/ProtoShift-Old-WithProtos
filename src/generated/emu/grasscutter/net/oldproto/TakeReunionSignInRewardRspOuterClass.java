// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeReunionSignInRewardRsp.proto

package emu.grasscutter.net.oldproto;

public final class TakeReunionSignInRewardRspOuterClass {
  private TakeReunionSignInRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeReunionSignInRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeReunionSignInRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ReunionSignInInfo sign_in_info = 10;</code>
     * @return Whether the signInInfo field is set.
     */
    boolean hasSignInInfo();
    /**
     * <code>.ReunionSignInInfo sign_in_info = 10;</code>
     * @return The signInInfo.
     */
    emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo getSignInInfo();
    /**
     * <code>.ReunionSignInInfo sign_in_info = 10;</code>
     */
    emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfoOrBuilder getSignInInfoOrBuilder();

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 5072
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code TakeReunionSignInRewardRsp}
   */
  public static final class TakeReunionSignInRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeReunionSignInRewardRsp)
      TakeReunionSignInRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeReunionSignInRewardRsp.newBuilder() to construct.
    private TakeReunionSignInRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeReunionSignInRewardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeReunionSignInRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.internal_static_TakeReunionSignInRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.internal_static_TakeReunionSignInRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp.class, emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp.Builder.class);
    }

    public static final int SIGN_IN_INFO_FIELD_NUMBER = 10;
    private emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo signInInfo_;
    /**
     * <code>.ReunionSignInInfo sign_in_info = 10;</code>
     * @return Whether the signInInfo field is set.
     */
    @java.lang.Override
    public boolean hasSignInInfo() {
      return signInInfo_ != null;
    }
    /**
     * <code>.ReunionSignInInfo sign_in_info = 10;</code>
     * @return The signInInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo getSignInInfo() {
      return signInInfo_ == null ? emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo.getDefaultInstance() : signInInfo_;
    }
    /**
     * <code>.ReunionSignInInfo sign_in_info = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfoOrBuilder getSignInInfoOrBuilder() {
      return getSignInInfo();
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
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
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (signInInfo_ != null) {
        output.writeMessage(10, getSignInInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      if (signInInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getSignInInfo());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp other = (emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp) obj;

      if (hasSignInInfo() != other.hasSignInInfo()) return false;
      if (hasSignInInfo()) {
        if (!getSignInInfo()
            .equals(other.getSignInInfo())) return false;
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
      if (hasSignInInfo()) {
        hash = (37 * hash) + SIGN_IN_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSignInInfo().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp prototype) {
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
     * CmdId: 5072
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code TakeReunionSignInRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeReunionSignInRewardRsp)
        emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.internal_static_TakeReunionSignInRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.internal_static_TakeReunionSignInRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp.class, emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (signInInfoBuilder_ == null) {
          signInInfo_ = null;
        } else {
          signInInfo_ = null;
          signInInfoBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.internal_static_TakeReunionSignInRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp build() {
        emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp buildPartial() {
        emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp result = new emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp(this);
        if (signInInfoBuilder_ == null) {
          result.signInInfo_ = signInInfo_;
        } else {
          result.signInInfo_ = signInInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp other) {
        if (other == emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp.getDefaultInstance()) return this;
        if (other.hasSignInInfo()) {
          mergeSignInInfo(other.getSignInInfo());
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
              case 40: {
                retcode_ = input.readInt32();

                break;
              } // case 40
              case 82: {
                input.readMessage(
                    getSignInInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 82
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

      private emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo signInInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo, emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo.Builder, emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfoOrBuilder> signInInfoBuilder_;
      /**
       * <code>.ReunionSignInInfo sign_in_info = 10;</code>
       * @return Whether the signInInfo field is set.
       */
      public boolean hasSignInInfo() {
        return signInInfoBuilder_ != null || signInInfo_ != null;
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 10;</code>
       * @return The signInInfo.
       */
      public emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo getSignInInfo() {
        if (signInInfoBuilder_ == null) {
          return signInInfo_ == null ? emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo.getDefaultInstance() : signInInfo_;
        } else {
          return signInInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 10;</code>
       */
      public Builder setSignInInfo(emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo value) {
        if (signInInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          signInInfo_ = value;
          onChanged();
        } else {
          signInInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 10;</code>
       */
      public Builder setSignInInfo(
          emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo.Builder builderForValue) {
        if (signInInfoBuilder_ == null) {
          signInInfo_ = builderForValue.build();
          onChanged();
        } else {
          signInInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 10;</code>
       */
      public Builder mergeSignInInfo(emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo value) {
        if (signInInfoBuilder_ == null) {
          if (signInInfo_ != null) {
            signInInfo_ =
              emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo.newBuilder(signInInfo_).mergeFrom(value).buildPartial();
          } else {
            signInInfo_ = value;
          }
          onChanged();
        } else {
          signInInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 10;</code>
       */
      public Builder clearSignInInfo() {
        if (signInInfoBuilder_ == null) {
          signInInfo_ = null;
          onChanged();
        } else {
          signInInfo_ = null;
          signInInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 10;</code>
       */
      public emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo.Builder getSignInInfoBuilder() {
        
        onChanged();
        return getSignInInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 10;</code>
       */
      public emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfoOrBuilder getSignInInfoOrBuilder() {
        if (signInInfoBuilder_ != null) {
          return signInInfoBuilder_.getMessageOrBuilder();
        } else {
          return signInInfo_ == null ?
              emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo.getDefaultInstance() : signInInfo_;
        }
      }
      /**
       * <code>.ReunionSignInInfo sign_in_info = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo, emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo.Builder, emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfoOrBuilder> 
          getSignInInfoFieldBuilder() {
        if (signInInfoBuilder_ == null) {
          signInInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo, emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfo.Builder, emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.ReunionSignInInfoOrBuilder>(
                  getSignInInfo(),
                  getParentForChildren(),
                  isClean());
          signInInfo_ = null;
        }
        return signInInfoBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
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


      // @@protoc_insertion_point(builder_scope:TakeReunionSignInRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:TakeReunionSignInRewardRsp)
    private static final emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp();
    }

    public static emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeReunionSignInRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<TakeReunionSignInRewardRsp>() {
      @java.lang.Override
      public TakeReunionSignInRewardRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<TakeReunionSignInRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeReunionSignInRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.TakeReunionSignInRewardRspOuterClass.TakeReunionSignInRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeReunionSignInRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeReunionSignInRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n TakeReunionSignInRewardRsp.proto\032\027Reun" +
      "ionSignInInfo.proto\"W\n\032TakeReunionSignIn" +
      "RewardRsp\022(\n\014sign_in_info\030\n \001(\0132\022.Reunio" +
      "nSignInInfo\022\017\n\007retcode\030\005 \001(\005B\036\n\034emu.gras" +
      "scutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.getDescriptor(),
        });
    internal_static_TakeReunionSignInRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeReunionSignInRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeReunionSignInRewardRsp_descriptor,
        new java.lang.String[] { "SignInInfo", "Retcode", });
    emu.grasscutter.net.oldproto.ReunionSignInInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
