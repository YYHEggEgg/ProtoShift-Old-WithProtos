// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabSaveAssistInfoReq.proto

package emu.grasscutter.net.newproto;

public final class ChannelerSlabSaveAssistInfoReqOuterClass {
  private ChannelerSlabSaveAssistInfoReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelerSlabSaveAssistInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelerSlabSaveAssistInfoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo> 
        getAssistInfoListList();
    /**
     * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
     */
    emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo getAssistInfoList(int index);
    /**
     * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
     */
    int getAssistInfoListCount();
    /**
     * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfoOrBuilder> 
        getAssistInfoListOrBuilderList();
    /**
     * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
     */
    emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfoOrBuilder getAssistInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8039;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ChannelerSlabSaveAssistInfoReq}
   */
  public static final class ChannelerSlabSaveAssistInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelerSlabSaveAssistInfoReq)
      ChannelerSlabSaveAssistInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelerSlabSaveAssistInfoReq.newBuilder() to construct.
    private ChannelerSlabSaveAssistInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelerSlabSaveAssistInfoReq() {
      assistInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelerSlabSaveAssistInfoReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.internal_static_ChannelerSlabSaveAssistInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.internal_static_ChannelerSlabSaveAssistInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq.class, emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq.Builder.class);
    }

    public static final int ASSIST_INFO_LIST_FIELD_NUMBER = 14;
    private java.util.List<emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo> assistInfoList_;
    /**
     * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo> getAssistInfoListList() {
      return assistInfoList_;
    }
    /**
     * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfoOrBuilder> 
        getAssistInfoListOrBuilderList() {
      return assistInfoList_;
    }
    /**
     * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
     */
    @java.lang.Override
    public int getAssistInfoListCount() {
      return assistInfoList_.size();
    }
    /**
     * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo getAssistInfoList(int index) {
      return assistInfoList_.get(index);
    }
    /**
     * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfoOrBuilder getAssistInfoListOrBuilder(
        int index) {
      return assistInfoList_.get(index);
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
      for (int i = 0; i < assistInfoList_.size(); i++) {
        output.writeMessage(14, assistInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < assistInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, assistInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq other = (emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq) obj;

      if (!getAssistInfoListList()
          .equals(other.getAssistInfoListList())) return false;
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
      if (getAssistInfoListCount() > 0) {
        hash = (37 * hash) + ASSIST_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAssistInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq prototype) {
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
     *   CMD_ID = 8039;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ChannelerSlabSaveAssistInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelerSlabSaveAssistInfoReq)
        emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.internal_static_ChannelerSlabSaveAssistInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.internal_static_ChannelerSlabSaveAssistInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq.class, emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (assistInfoListBuilder_ == null) {
          assistInfoList_ = java.util.Collections.emptyList();
        } else {
          assistInfoList_ = null;
          assistInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.internal_static_ChannelerSlabSaveAssistInfoReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq build() {
        emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq buildPartial() {
        emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq result = new emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq(this);
        int from_bitField0_ = bitField0_;
        if (assistInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            assistInfoList_ = java.util.Collections.unmodifiableList(assistInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.assistInfoList_ = assistInfoList_;
        } else {
          result.assistInfoList_ = assistInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq) {
          return mergeFrom((emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq other) {
        if (other == emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq.getDefaultInstance()) return this;
        if (assistInfoListBuilder_ == null) {
          if (!other.assistInfoList_.isEmpty()) {
            if (assistInfoList_.isEmpty()) {
              assistInfoList_ = other.assistInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAssistInfoListIsMutable();
              assistInfoList_.addAll(other.assistInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.assistInfoList_.isEmpty()) {
            if (assistInfoListBuilder_.isEmpty()) {
              assistInfoListBuilder_.dispose();
              assistInfoListBuilder_ = null;
              assistInfoList_ = other.assistInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              assistInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAssistInfoListFieldBuilder() : null;
            } else {
              assistInfoListBuilder_.addAllMessages(other.assistInfoList_);
            }
          }
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
              case 114: {
                emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.parser(),
                        extensionRegistry);
                if (assistInfoListBuilder_ == null) {
                  ensureAssistInfoListIsMutable();
                  assistInfoList_.add(m);
                } else {
                  assistInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 114
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

      private java.util.List<emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo> assistInfoList_ =
        java.util.Collections.emptyList();
      private void ensureAssistInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          assistInfoList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo>(assistInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo, emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.Builder, emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfoOrBuilder> assistInfoListBuilder_;

      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo> getAssistInfoListList() {
        if (assistInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(assistInfoList_);
        } else {
          return assistInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public int getAssistInfoListCount() {
        if (assistInfoListBuilder_ == null) {
          return assistInfoList_.size();
        } else {
          return assistInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo getAssistInfoList(int index) {
        if (assistInfoListBuilder_ == null) {
          return assistInfoList_.get(index);
        } else {
          return assistInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public Builder setAssistInfoList(
          int index, emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo value) {
        if (assistInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAssistInfoListIsMutable();
          assistInfoList_.set(index, value);
          onChanged();
        } else {
          assistInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public Builder setAssistInfoList(
          int index, emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.Builder builderForValue) {
        if (assistInfoListBuilder_ == null) {
          ensureAssistInfoListIsMutable();
          assistInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          assistInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public Builder addAssistInfoList(emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo value) {
        if (assistInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAssistInfoListIsMutable();
          assistInfoList_.add(value);
          onChanged();
        } else {
          assistInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public Builder addAssistInfoList(
          int index, emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo value) {
        if (assistInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAssistInfoListIsMutable();
          assistInfoList_.add(index, value);
          onChanged();
        } else {
          assistInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public Builder addAssistInfoList(
          emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.Builder builderForValue) {
        if (assistInfoListBuilder_ == null) {
          ensureAssistInfoListIsMutable();
          assistInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          assistInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public Builder addAssistInfoList(
          int index, emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.Builder builderForValue) {
        if (assistInfoListBuilder_ == null) {
          ensureAssistInfoListIsMutable();
          assistInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          assistInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public Builder addAllAssistInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo> values) {
        if (assistInfoListBuilder_ == null) {
          ensureAssistInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, assistInfoList_);
          onChanged();
        } else {
          assistInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public Builder clearAssistInfoList() {
        if (assistInfoListBuilder_ == null) {
          assistInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          assistInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public Builder removeAssistInfoList(int index) {
        if (assistInfoListBuilder_ == null) {
          ensureAssistInfoListIsMutable();
          assistInfoList_.remove(index);
          onChanged();
        } else {
          assistInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.Builder getAssistInfoListBuilder(
          int index) {
        return getAssistInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfoOrBuilder getAssistInfoListOrBuilder(
          int index) {
        if (assistInfoListBuilder_ == null) {
          return assistInfoList_.get(index);  } else {
          return assistInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfoOrBuilder> 
           getAssistInfoListOrBuilderList() {
        if (assistInfoListBuilder_ != null) {
          return assistInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(assistInfoList_);
        }
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.Builder addAssistInfoListBuilder() {
        return getAssistInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.Builder addAssistInfoListBuilder(
          int index) {
        return getAssistInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ChannelerSlabAssistInfo assist_info_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.Builder> 
           getAssistInfoListBuilderList() {
        return getAssistInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo, emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.Builder, emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfoOrBuilder> 
          getAssistInfoListFieldBuilder() {
        if (assistInfoListBuilder_ == null) {
          assistInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo, emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.Builder, emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfoOrBuilder>(
                  assistInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          assistInfoList_ = null;
        }
        return assistInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ChannelerSlabSaveAssistInfoReq)
    }

    // @@protoc_insertion_point(class_scope:ChannelerSlabSaveAssistInfoReq)
    private static final emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq();
    }

    public static emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelerSlabSaveAssistInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabSaveAssistInfoReq>() {
      @java.lang.Override
      public ChannelerSlabSaveAssistInfoReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChannelerSlabSaveAssistInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelerSlabSaveAssistInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ChannelerSlabSaveAssistInfoReqOuterClass.ChannelerSlabSaveAssistInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabSaveAssistInfoReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabSaveAssistInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$ChannelerSlabSaveAssistInfoReq.proto\032\035" +
      "ChannelerSlabAssistInfo.proto\"T\n\036Channel" +
      "erSlabSaveAssistInfoReq\0222\n\020assist_info_l" +
      "ist\030\016 \003(\0132\030.ChannelerSlabAssistInfoB\036\n\034e" +
      "mu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.getDescriptor(),
        });
    internal_static_ChannelerSlabSaveAssistInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelerSlabSaveAssistInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabSaveAssistInfoReq_descriptor,
        new java.lang.String[] { "AssistInfoList", });
    emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
