// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetQuickHitTreeReq.proto

package emu.grasscutter.net.newproto;

public final class WidgetQuickHitTreeReqOuterClass {
  private WidgetQuickHitTreeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetQuickHitTreeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetQuickHitTreeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo> 
        getHitTreeInfoListList();
    /**
     * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
     */
    emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo getHitTreeInfoList(int index);
    /**
     * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
     */
    int getHitTreeInfoListCount();
    /**
     * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfoOrBuilder> 
        getHitTreeInfoListOrBuilderList();
    /**
     * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
     */
    emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfoOrBuilder getHitTreeInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3068;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code WidgetQuickHitTreeReq}
   */
  public static final class WidgetQuickHitTreeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetQuickHitTreeReq)
      WidgetQuickHitTreeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetQuickHitTreeReq.newBuilder() to construct.
    private WidgetQuickHitTreeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetQuickHitTreeReq() {
      hitTreeInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetQuickHitTreeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.internal_static_WidgetQuickHitTreeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.internal_static_WidgetQuickHitTreeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq.class, emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq.Builder.class);
    }

    public static final int HIT_TREE_INFO_LIST_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo> hitTreeInfoList_;
    /**
     * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo> getHitTreeInfoListList() {
      return hitTreeInfoList_;
    }
    /**
     * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfoOrBuilder> 
        getHitTreeInfoListOrBuilderList() {
      return hitTreeInfoList_;
    }
    /**
     * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
     */
    @java.lang.Override
    public int getHitTreeInfoListCount() {
      return hitTreeInfoList_.size();
    }
    /**
     * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo getHitTreeInfoList(int index) {
      return hitTreeInfoList_.get(index);
    }
    /**
     * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfoOrBuilder getHitTreeInfoListOrBuilder(
        int index) {
      return hitTreeInfoList_.get(index);
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
      for (int i = 0; i < hitTreeInfoList_.size(); i++) {
        output.writeMessage(4, hitTreeInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < hitTreeInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, hitTreeInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq other = (emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq) obj;

      if (!getHitTreeInfoListList()
          .equals(other.getHitTreeInfoListList())) return false;
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
      if (getHitTreeInfoListCount() > 0) {
        hash = (37 * hash) + HIT_TREE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getHitTreeInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq prototype) {
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
     *   CMD_ID = 3068;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code WidgetQuickHitTreeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetQuickHitTreeReq)
        emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.internal_static_WidgetQuickHitTreeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.internal_static_WidgetQuickHitTreeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq.class, emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (hitTreeInfoListBuilder_ == null) {
          hitTreeInfoList_ = java.util.Collections.emptyList();
        } else {
          hitTreeInfoList_ = null;
          hitTreeInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.internal_static_WidgetQuickHitTreeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq build() {
        emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq buildPartial() {
        emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq result = new emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq(this);
        int from_bitField0_ = bitField0_;
        if (hitTreeInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            hitTreeInfoList_ = java.util.Collections.unmodifiableList(hitTreeInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.hitTreeInfoList_ = hitTreeInfoList_;
        } else {
          result.hitTreeInfoList_ = hitTreeInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq) {
          return mergeFrom((emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq other) {
        if (other == emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq.getDefaultInstance()) return this;
        if (hitTreeInfoListBuilder_ == null) {
          if (!other.hitTreeInfoList_.isEmpty()) {
            if (hitTreeInfoList_.isEmpty()) {
              hitTreeInfoList_ = other.hitTreeInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureHitTreeInfoListIsMutable();
              hitTreeInfoList_.addAll(other.hitTreeInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.hitTreeInfoList_.isEmpty()) {
            if (hitTreeInfoListBuilder_.isEmpty()) {
              hitTreeInfoListBuilder_.dispose();
              hitTreeInfoListBuilder_ = null;
              hitTreeInfoList_ = other.hitTreeInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              hitTreeInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getHitTreeInfoListFieldBuilder() : null;
            } else {
              hitTreeInfoListBuilder_.addAllMessages(other.hitTreeInfoList_);
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
                emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo.parser(),
                        extensionRegistry);
                if (hitTreeInfoListBuilder_ == null) {
                  ensureHitTreeInfoListIsMutable();
                  hitTreeInfoList_.add(m);
                } else {
                  hitTreeInfoListBuilder_.addMessage(m);
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

      private java.util.List<emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo> hitTreeInfoList_ =
        java.util.Collections.emptyList();
      private void ensureHitTreeInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          hitTreeInfoList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo>(hitTreeInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo, emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo.Builder, emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfoOrBuilder> hitTreeInfoListBuilder_;

      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo> getHitTreeInfoListList() {
        if (hitTreeInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(hitTreeInfoList_);
        } else {
          return hitTreeInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public int getHitTreeInfoListCount() {
        if (hitTreeInfoListBuilder_ == null) {
          return hitTreeInfoList_.size();
        } else {
          return hitTreeInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo getHitTreeInfoList(int index) {
        if (hitTreeInfoListBuilder_ == null) {
          return hitTreeInfoList_.get(index);
        } else {
          return hitTreeInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public Builder setHitTreeInfoList(
          int index, emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo value) {
        if (hitTreeInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHitTreeInfoListIsMutable();
          hitTreeInfoList_.set(index, value);
          onChanged();
        } else {
          hitTreeInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public Builder setHitTreeInfoList(
          int index, emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo.Builder builderForValue) {
        if (hitTreeInfoListBuilder_ == null) {
          ensureHitTreeInfoListIsMutable();
          hitTreeInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          hitTreeInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public Builder addHitTreeInfoList(emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo value) {
        if (hitTreeInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHitTreeInfoListIsMutable();
          hitTreeInfoList_.add(value);
          onChanged();
        } else {
          hitTreeInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public Builder addHitTreeInfoList(
          int index, emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo value) {
        if (hitTreeInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHitTreeInfoListIsMutable();
          hitTreeInfoList_.add(index, value);
          onChanged();
        } else {
          hitTreeInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public Builder addHitTreeInfoList(
          emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo.Builder builderForValue) {
        if (hitTreeInfoListBuilder_ == null) {
          ensureHitTreeInfoListIsMutable();
          hitTreeInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          hitTreeInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public Builder addHitTreeInfoList(
          int index, emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo.Builder builderForValue) {
        if (hitTreeInfoListBuilder_ == null) {
          ensureHitTreeInfoListIsMutable();
          hitTreeInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          hitTreeInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public Builder addAllHitTreeInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo> values) {
        if (hitTreeInfoListBuilder_ == null) {
          ensureHitTreeInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, hitTreeInfoList_);
          onChanged();
        } else {
          hitTreeInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public Builder clearHitTreeInfoList() {
        if (hitTreeInfoListBuilder_ == null) {
          hitTreeInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          hitTreeInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public Builder removeHitTreeInfoList(int index) {
        if (hitTreeInfoListBuilder_ == null) {
          ensureHitTreeInfoListIsMutable();
          hitTreeInfoList_.remove(index);
          onChanged();
        } else {
          hitTreeInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo.Builder getHitTreeInfoListBuilder(
          int index) {
        return getHitTreeInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfoOrBuilder getHitTreeInfoListOrBuilder(
          int index) {
        if (hitTreeInfoListBuilder_ == null) {
          return hitTreeInfoList_.get(index);  } else {
          return hitTreeInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfoOrBuilder> 
           getHitTreeInfoListOrBuilderList() {
        if (hitTreeInfoListBuilder_ != null) {
          return hitTreeInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(hitTreeInfoList_);
        }
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo.Builder addHitTreeInfoListBuilder() {
        return getHitTreeInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo.Builder addHitTreeInfoListBuilder(
          int index) {
        return getHitTreeInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HitTreeInfo hit_tree_info_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo.Builder> 
           getHitTreeInfoListBuilderList() {
        return getHitTreeInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo, emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo.Builder, emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfoOrBuilder> 
          getHitTreeInfoListFieldBuilder() {
        if (hitTreeInfoListBuilder_ == null) {
          hitTreeInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo, emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfo.Builder, emu.grasscutter.net.newproto.HitTreeInfoOuterClass.HitTreeInfoOrBuilder>(
                  hitTreeInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          hitTreeInfoList_ = null;
        }
        return hitTreeInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:WidgetQuickHitTreeReq)
    }

    // @@protoc_insertion_point(class_scope:WidgetQuickHitTreeReq)
    private static final emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq();
    }

    public static emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetQuickHitTreeReq>
        PARSER = new com.google.protobuf.AbstractParser<WidgetQuickHitTreeReq>() {
      @java.lang.Override
      public WidgetQuickHitTreeReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<WidgetQuickHitTreeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetQuickHitTreeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.WidgetQuickHitTreeReqOuterClass.WidgetQuickHitTreeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetQuickHitTreeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetQuickHitTreeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033WidgetQuickHitTreeReq.proto\032\021HitTreeIn" +
      "fo.proto\"A\n\025WidgetQuickHitTreeReq\022(\n\022hit" +
      "_tree_info_list\030\004 \003(\0132\014.HitTreeInfoB\036\n\034e" +
      "mu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.HitTreeInfoOuterClass.getDescriptor(),
        });
    internal_static_WidgetQuickHitTreeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetQuickHitTreeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetQuickHitTreeReq_descriptor,
        new java.lang.String[] { "HitTreeInfoList", });
    emu.grasscutter.net.newproto.HitTreeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
