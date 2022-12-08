// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SignInInfoRsp.proto

package emu.grasscutter.net.oldproto;

public final class SignInInfoRspOuterClass {
  private SignInInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SignInInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SignInInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo> 
        getSignInInfoListList();
    /**
     * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
     */
    emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo getSignInInfoList(int index);
    /**
     * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
     */
    int getSignInInfoListCount();
    /**
     * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfoOrBuilder> 
        getSignInInfoListOrBuilderList();
    /**
     * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
     */
    emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfoOrBuilder getSignInInfoListOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 2535
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code SignInInfoRsp}
   */
  public static final class SignInInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SignInInfoRsp)
      SignInInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SignInInfoRsp.newBuilder() to construct.
    private SignInInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SignInInfoRsp() {
      signInInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SignInInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.internal_static_SignInInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.internal_static_SignInInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp.class, emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp.Builder.class);
    }

    public static final int SIGN_IN_INFO_LIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo> signInInfoList_;
    /**
     * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo> getSignInInfoListList() {
      return signInInfoList_;
    }
    /**
     * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfoOrBuilder> 
        getSignInInfoListOrBuilderList() {
      return signInInfoList_;
    }
    /**
     * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
     */
    @java.lang.Override
    public int getSignInInfoListCount() {
      return signInInfoList_.size();
    }
    /**
     * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo getSignInInfoList(int index) {
      return signInInfoList_.get(index);
    }
    /**
     * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfoOrBuilder getSignInInfoListOrBuilder(
        int index) {
      return signInInfoList_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
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
      for (int i = 0; i < signInInfoList_.size(); i++) {
        output.writeMessage(1, signInInfoList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < signInInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, signInInfoList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp other = (emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp) obj;

      if (!getSignInInfoListList()
          .equals(other.getSignInInfoListList())) return false;
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
      if (getSignInInfoListCount() > 0) {
        hash = (37 * hash) + SIGN_IN_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSignInInfoListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp prototype) {
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
     * CmdId: 2535
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code SignInInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SignInInfoRsp)
        emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.internal_static_SignInInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.internal_static_SignInInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp.class, emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (signInInfoListBuilder_ == null) {
          signInInfoList_ = java.util.Collections.emptyList();
        } else {
          signInInfoList_ = null;
          signInInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.internal_static_SignInInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp build() {
        emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp buildPartial() {
        emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp result = new emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp(this);
        int from_bitField0_ = bitField0_;
        if (signInInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            signInInfoList_ = java.util.Collections.unmodifiableList(signInInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.signInInfoList_ = signInInfoList_;
        } else {
          result.signInInfoList_ = signInInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp other) {
        if (other == emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp.getDefaultInstance()) return this;
        if (signInInfoListBuilder_ == null) {
          if (!other.signInInfoList_.isEmpty()) {
            if (signInInfoList_.isEmpty()) {
              signInInfoList_ = other.signInInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSignInInfoListIsMutable();
              signInInfoList_.addAll(other.signInInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.signInInfoList_.isEmpty()) {
            if (signInInfoListBuilder_.isEmpty()) {
              signInInfoListBuilder_.dispose();
              signInInfoListBuilder_ = null;
              signInInfoList_ = other.signInInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              signInInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSignInInfoListFieldBuilder() : null;
            } else {
              signInInfoListBuilder_.addAllMessages(other.signInInfoList_);
            }
          }
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
              case 10: {
                emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo.parser(),
                        extensionRegistry);
                if (signInInfoListBuilder_ == null) {
                  ensureSignInInfoListIsMutable();
                  signInInfoList_.add(m);
                } else {
                  signInInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 10
              case 88: {
                retcode_ = input.readInt32();

                break;
              } // case 88
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
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo> signInInfoList_ =
        java.util.Collections.emptyList();
      private void ensureSignInInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          signInInfoList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo>(signInInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo, emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo.Builder, emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfoOrBuilder> signInInfoListBuilder_;

      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo> getSignInInfoListList() {
        if (signInInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(signInInfoList_);
        } else {
          return signInInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public int getSignInInfoListCount() {
        if (signInInfoListBuilder_ == null) {
          return signInInfoList_.size();
        } else {
          return signInInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo getSignInInfoList(int index) {
        if (signInInfoListBuilder_ == null) {
          return signInInfoList_.get(index);
        } else {
          return signInInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public Builder setSignInInfoList(
          int index, emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo value) {
        if (signInInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSignInInfoListIsMutable();
          signInInfoList_.set(index, value);
          onChanged();
        } else {
          signInInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public Builder setSignInInfoList(
          int index, emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo.Builder builderForValue) {
        if (signInInfoListBuilder_ == null) {
          ensureSignInInfoListIsMutable();
          signInInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          signInInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public Builder addSignInInfoList(emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo value) {
        if (signInInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSignInInfoListIsMutable();
          signInInfoList_.add(value);
          onChanged();
        } else {
          signInInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public Builder addSignInInfoList(
          int index, emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo value) {
        if (signInInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSignInInfoListIsMutable();
          signInInfoList_.add(index, value);
          onChanged();
        } else {
          signInInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public Builder addSignInInfoList(
          emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo.Builder builderForValue) {
        if (signInInfoListBuilder_ == null) {
          ensureSignInInfoListIsMutable();
          signInInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          signInInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public Builder addSignInInfoList(
          int index, emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo.Builder builderForValue) {
        if (signInInfoListBuilder_ == null) {
          ensureSignInInfoListIsMutable();
          signInInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          signInInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public Builder addAllSignInInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo> values) {
        if (signInInfoListBuilder_ == null) {
          ensureSignInInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, signInInfoList_);
          onChanged();
        } else {
          signInInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public Builder clearSignInInfoList() {
        if (signInInfoListBuilder_ == null) {
          signInInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          signInInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public Builder removeSignInInfoList(int index) {
        if (signInInfoListBuilder_ == null) {
          ensureSignInInfoListIsMutable();
          signInInfoList_.remove(index);
          onChanged();
        } else {
          signInInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo.Builder getSignInInfoListBuilder(
          int index) {
        return getSignInInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfoOrBuilder getSignInInfoListOrBuilder(
          int index) {
        if (signInInfoListBuilder_ == null) {
          return signInInfoList_.get(index);  } else {
          return signInInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfoOrBuilder> 
           getSignInInfoListOrBuilderList() {
        if (signInInfoListBuilder_ != null) {
          return signInInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(signInInfoList_);
        }
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo.Builder addSignInInfoListBuilder() {
        return getSignInInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo.Builder addSignInInfoListBuilder(
          int index) {
        return getSignInInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SignInInfo sign_in_info_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo.Builder> 
           getSignInInfoListBuilderList() {
        return getSignInInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo, emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo.Builder, emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfoOrBuilder> 
          getSignInInfoListFieldBuilder() {
        if (signInInfoListBuilder_ == null) {
          signInInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo, emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfo.Builder, emu.grasscutter.net.oldproto.SignInInfoOuterClass.SignInInfoOrBuilder>(
                  signInInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          signInInfoList_ = null;
        }
        return signInInfoListBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
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


      // @@protoc_insertion_point(builder_scope:SignInInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:SignInInfoRsp)
    private static final emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp();
    }

    public static emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SignInInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<SignInInfoRsp>() {
      @java.lang.Override
      public SignInInfoRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<SignInInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SignInInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SignInInfoRspOuterClass.SignInInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SignInInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SignInInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SignInInfoRsp.proto\032\020SignInInfo.proto\"" +
      "H\n\rSignInInfoRsp\022&\n\021sign_in_info_list\030\001 " +
      "\003(\0132\013.SignInInfo\022\017\n\007retcode\030\013 \001(\005B\036\n\034emu" +
      ".grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.SignInInfoOuterClass.getDescriptor(),
        });
    internal_static_SignInInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SignInInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SignInInfoRsp_descriptor,
        new java.lang.String[] { "SignInInfoList", "Retcode", });
    emu.grasscutter.net.oldproto.SignInInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
