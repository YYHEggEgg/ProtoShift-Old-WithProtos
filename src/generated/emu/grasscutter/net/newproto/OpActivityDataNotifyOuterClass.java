// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpActivityDataNotify.proto

package emu.grasscutter.net.newproto;

public final class OpActivityDataNotifyOuterClass {
  private OpActivityDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OpActivityDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpActivityDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo> 
        getOpActivityInfoListList();
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
     */
    emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo getOpActivityInfoList(int index);
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
     */
    int getOpActivityInfoListCount();
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder> 
        getOpActivityInfoListOrBuilderList();
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
     */
    emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder getOpActivityInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5156;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code OpActivityDataNotify}
   */
  public static final class OpActivityDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OpActivityDataNotify)
      OpActivityDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpActivityDataNotify.newBuilder() to construct.
    private OpActivityDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpActivityDataNotify() {
      opActivityInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpActivityDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.internal_static_OpActivityDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.internal_static_OpActivityDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify.class, emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify.Builder.class);
    }

    public static final int OP_ACTIVITY_INFO_LIST_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo> opActivityInfoList_;
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo> getOpActivityInfoListList() {
      return opActivityInfoList_;
    }
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder> 
        getOpActivityInfoListOrBuilderList() {
      return opActivityInfoList_;
    }
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
     */
    @java.lang.Override
    public int getOpActivityInfoListCount() {
      return opActivityInfoList_.size();
    }
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo getOpActivityInfoList(int index) {
      return opActivityInfoList_.get(index);
    }
    /**
     * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder getOpActivityInfoListOrBuilder(
        int index) {
      return opActivityInfoList_.get(index);
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
      for (int i = 0; i < opActivityInfoList_.size(); i++) {
        output.writeMessage(4, opActivityInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < opActivityInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, opActivityInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify other = (emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify) obj;

      if (!getOpActivityInfoListList()
          .equals(other.getOpActivityInfoListList())) return false;
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
      if (getOpActivityInfoListCount() > 0) {
        hash = (37 * hash) + OP_ACTIVITY_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOpActivityInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify prototype) {
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
     *   CMD_ID = 5156;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code OpActivityDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpActivityDataNotify)
        emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.internal_static_OpActivityDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.internal_static_OpActivityDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify.class, emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (opActivityInfoListBuilder_ == null) {
          opActivityInfoList_ = java.util.Collections.emptyList();
        } else {
          opActivityInfoList_ = null;
          opActivityInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.internal_static_OpActivityDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify build() {
        emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify buildPartial() {
        emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify result = new emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (opActivityInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            opActivityInfoList_ = java.util.Collections.unmodifiableList(opActivityInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.opActivityInfoList_ = opActivityInfoList_;
        } else {
          result.opActivityInfoList_ = opActivityInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify other) {
        if (other == emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify.getDefaultInstance()) return this;
        if (opActivityInfoListBuilder_ == null) {
          if (!other.opActivityInfoList_.isEmpty()) {
            if (opActivityInfoList_.isEmpty()) {
              opActivityInfoList_ = other.opActivityInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureOpActivityInfoListIsMutable();
              opActivityInfoList_.addAll(other.opActivityInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.opActivityInfoList_.isEmpty()) {
            if (opActivityInfoListBuilder_.isEmpty()) {
              opActivityInfoListBuilder_.dispose();
              opActivityInfoListBuilder_ = null;
              opActivityInfoList_ = other.opActivityInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              opActivityInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getOpActivityInfoListFieldBuilder() : null;
            } else {
              opActivityInfoListBuilder_.addAllMessages(other.opActivityInfoList_);
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
              case 34: {
                emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo.parser(),
                        extensionRegistry);
                if (opActivityInfoListBuilder_ == null) {
                  ensureOpActivityInfoListIsMutable();
                  opActivityInfoList_.add(m);
                } else {
                  opActivityInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 34
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

      private java.util.List<emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo> opActivityInfoList_ =
        java.util.Collections.emptyList();
      private void ensureOpActivityInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          opActivityInfoList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo>(opActivityInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo, emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo.Builder, emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder> opActivityInfoListBuilder_;

      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo> getOpActivityInfoListList() {
        if (opActivityInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(opActivityInfoList_);
        } else {
          return opActivityInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public int getOpActivityInfoListCount() {
        if (opActivityInfoListBuilder_ == null) {
          return opActivityInfoList_.size();
        } else {
          return opActivityInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo getOpActivityInfoList(int index) {
        if (opActivityInfoListBuilder_ == null) {
          return opActivityInfoList_.get(index);
        } else {
          return opActivityInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public Builder setOpActivityInfoList(
          int index, emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo value) {
        if (opActivityInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOpActivityInfoListIsMutable();
          opActivityInfoList_.set(index, value);
          onChanged();
        } else {
          opActivityInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public Builder setOpActivityInfoList(
          int index, emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo.Builder builderForValue) {
        if (opActivityInfoListBuilder_ == null) {
          ensureOpActivityInfoListIsMutable();
          opActivityInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          opActivityInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public Builder addOpActivityInfoList(emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo value) {
        if (opActivityInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOpActivityInfoListIsMutable();
          opActivityInfoList_.add(value);
          onChanged();
        } else {
          opActivityInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public Builder addOpActivityInfoList(
          int index, emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo value) {
        if (opActivityInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOpActivityInfoListIsMutable();
          opActivityInfoList_.add(index, value);
          onChanged();
        } else {
          opActivityInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public Builder addOpActivityInfoList(
          emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo.Builder builderForValue) {
        if (opActivityInfoListBuilder_ == null) {
          ensureOpActivityInfoListIsMutable();
          opActivityInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          opActivityInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public Builder addOpActivityInfoList(
          int index, emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo.Builder builderForValue) {
        if (opActivityInfoListBuilder_ == null) {
          ensureOpActivityInfoListIsMutable();
          opActivityInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          opActivityInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public Builder addAllOpActivityInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo> values) {
        if (opActivityInfoListBuilder_ == null) {
          ensureOpActivityInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, opActivityInfoList_);
          onChanged();
        } else {
          opActivityInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public Builder clearOpActivityInfoList() {
        if (opActivityInfoListBuilder_ == null) {
          opActivityInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          opActivityInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public Builder removeOpActivityInfoList(int index) {
        if (opActivityInfoListBuilder_ == null) {
          ensureOpActivityInfoListIsMutable();
          opActivityInfoList_.remove(index);
          onChanged();
        } else {
          opActivityInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo.Builder getOpActivityInfoListBuilder(
          int index) {
        return getOpActivityInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder getOpActivityInfoListOrBuilder(
          int index) {
        if (opActivityInfoListBuilder_ == null) {
          return opActivityInfoList_.get(index);  } else {
          return opActivityInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder> 
           getOpActivityInfoListOrBuilderList() {
        if (opActivityInfoListBuilder_ != null) {
          return opActivityInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(opActivityInfoList_);
        }
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo.Builder addOpActivityInfoListBuilder() {
        return getOpActivityInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo.Builder addOpActivityInfoListBuilder(
          int index) {
        return getOpActivityInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .OpActivityInfo op_activity_info_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo.Builder> 
           getOpActivityInfoListBuilderList() {
        return getOpActivityInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo, emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo.Builder, emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder> 
          getOpActivityInfoListFieldBuilder() {
        if (opActivityInfoListBuilder_ == null) {
          opActivityInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo, emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfo.Builder, emu.grasscutter.net.newproto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder>(
                  opActivityInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          opActivityInfoList_ = null;
        }
        return opActivityInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:OpActivityDataNotify)
    }

    // @@protoc_insertion_point(class_scope:OpActivityDataNotify)
    private static final emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify();
    }

    public static emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpActivityDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<OpActivityDataNotify>() {
      @java.lang.Override
      public OpActivityDataNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<OpActivityDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpActivityDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.OpActivityDataNotifyOuterClass.OpActivityDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpActivityDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpActivityDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032OpActivityDataNotify.proto\032\024OpActivity" +
      "Info.proto\"F\n\024OpActivityDataNotify\022.\n\025op" +
      "_activity_info_list\030\004 \003(\0132\017.OpActivityIn" +
      "foB\036\n\034emu.grasscutter.net.newprotob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.OpActivityInfoOuterClass.getDescriptor(),
        });
    internal_static_OpActivityDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpActivityDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpActivityDataNotify_descriptor,
        new java.lang.String[] { "OpActivityInfoList", });
    emu.grasscutter.net.newproto.OpActivityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
