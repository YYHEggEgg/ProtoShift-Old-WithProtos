// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GlobalBuildingInfoNotify.proto

package emu.grasscutter.net.oldproto;

public final class GlobalBuildingInfoNotifyOuterClass {
  private GlobalBuildingInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GlobalBuildingInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GlobalBuildingInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 current_num = 5;</code>
     * @return The currentNum.
     */
    int getCurrentNum();

    /**
     * <code>repeated .BuildingInfo building_list = 3;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo> 
        getBuildingListList();
    /**
     * <code>repeated .BuildingInfo building_list = 3;</code>
     */
    emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo getBuildingList(int index);
    /**
     * <code>repeated .BuildingInfo building_list = 3;</code>
     */
    int getBuildingListCount();
    /**
     * <code>repeated .BuildingInfo building_list = 3;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfoOrBuilder> 
        getBuildingListOrBuilderList();
    /**
     * <code>repeated .BuildingInfo building_list = 3;</code>
     */
    emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfoOrBuilder getBuildingListOrBuilder(
        int index);

    /**
     * <code>uint32 max_num = 13;</code>
     * @return The maxNum.
     */
    int getMaxNum();
  }
  /**
   * <pre>
   * CmdId: 5320
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GlobalBuildingInfoNotify}
   */
  public static final class GlobalBuildingInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GlobalBuildingInfoNotify)
      GlobalBuildingInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GlobalBuildingInfoNotify.newBuilder() to construct.
    private GlobalBuildingInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GlobalBuildingInfoNotify() {
      buildingList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GlobalBuildingInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.internal_static_GlobalBuildingInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.internal_static_GlobalBuildingInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify.class, emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify.Builder.class);
    }

    public static final int CURRENT_NUM_FIELD_NUMBER = 5;
    private int currentNum_;
    /**
     * <code>uint32 current_num = 5;</code>
     * @return The currentNum.
     */
    @java.lang.Override
    public int getCurrentNum() {
      return currentNum_;
    }

    public static final int BUILDING_LIST_FIELD_NUMBER = 3;
    private java.util.List<emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo> buildingList_;
    /**
     * <code>repeated .BuildingInfo building_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo> getBuildingListList() {
      return buildingList_;
    }
    /**
     * <code>repeated .BuildingInfo building_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfoOrBuilder> 
        getBuildingListOrBuilderList() {
      return buildingList_;
    }
    /**
     * <code>repeated .BuildingInfo building_list = 3;</code>
     */
    @java.lang.Override
    public int getBuildingListCount() {
      return buildingList_.size();
    }
    /**
     * <code>repeated .BuildingInfo building_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo getBuildingList(int index) {
      return buildingList_.get(index);
    }
    /**
     * <code>repeated .BuildingInfo building_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfoOrBuilder getBuildingListOrBuilder(
        int index) {
      return buildingList_.get(index);
    }

    public static final int MAX_NUM_FIELD_NUMBER = 13;
    private int maxNum_;
    /**
     * <code>uint32 max_num = 13;</code>
     * @return The maxNum.
     */
    @java.lang.Override
    public int getMaxNum() {
      return maxNum_;
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
      for (int i = 0; i < buildingList_.size(); i++) {
        output.writeMessage(3, buildingList_.get(i));
      }
      if (currentNum_ != 0) {
        output.writeUInt32(5, currentNum_);
      }
      if (maxNum_ != 0) {
        output.writeUInt32(13, maxNum_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < buildingList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, buildingList_.get(i));
      }
      if (currentNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, currentNum_);
      }
      if (maxNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, maxNum_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify other = (emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify) obj;

      if (getCurrentNum()
          != other.getCurrentNum()) return false;
      if (!getBuildingListList()
          .equals(other.getBuildingListList())) return false;
      if (getMaxNum()
          != other.getMaxNum()) return false;
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
      hash = (37 * hash) + CURRENT_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getCurrentNum();
      if (getBuildingListCount() > 0) {
        hash = (37 * hash) + BUILDING_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBuildingListList().hashCode();
      }
      hash = (37 * hash) + MAX_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getMaxNum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify prototype) {
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
     * CmdId: 5320
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GlobalBuildingInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GlobalBuildingInfoNotify)
        emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.internal_static_GlobalBuildingInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.internal_static_GlobalBuildingInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify.class, emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        currentNum_ = 0;

        if (buildingListBuilder_ == null) {
          buildingList_ = java.util.Collections.emptyList();
        } else {
          buildingList_ = null;
          buildingListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        maxNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.internal_static_GlobalBuildingInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify build() {
        emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify buildPartial() {
        emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify result = new emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify(this);
        int from_bitField0_ = bitField0_;
        result.currentNum_ = currentNum_;
        if (buildingListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            buildingList_ = java.util.Collections.unmodifiableList(buildingList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.buildingList_ = buildingList_;
        } else {
          result.buildingList_ = buildingListBuilder_.build();
        }
        result.maxNum_ = maxNum_;
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
        if (other instanceof emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify other) {
        if (other == emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify.getDefaultInstance()) return this;
        if (other.getCurrentNum() != 0) {
          setCurrentNum(other.getCurrentNum());
        }
        if (buildingListBuilder_ == null) {
          if (!other.buildingList_.isEmpty()) {
            if (buildingList_.isEmpty()) {
              buildingList_ = other.buildingList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBuildingListIsMutable();
              buildingList_.addAll(other.buildingList_);
            }
            onChanged();
          }
        } else {
          if (!other.buildingList_.isEmpty()) {
            if (buildingListBuilder_.isEmpty()) {
              buildingListBuilder_.dispose();
              buildingListBuilder_ = null;
              buildingList_ = other.buildingList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              buildingListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBuildingListFieldBuilder() : null;
            } else {
              buildingListBuilder_.addAllMessages(other.buildingList_);
            }
          }
        }
        if (other.getMaxNum() != 0) {
          setMaxNum(other.getMaxNum());
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
              case 26: {
                emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo.parser(),
                        extensionRegistry);
                if (buildingListBuilder_ == null) {
                  ensureBuildingListIsMutable();
                  buildingList_.add(m);
                } else {
                  buildingListBuilder_.addMessage(m);
                }
                break;
              } // case 26
              case 40: {
                currentNum_ = input.readUInt32();

                break;
              } // case 40
              case 104: {
                maxNum_ = input.readUInt32();

                break;
              } // case 104
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

      private int currentNum_ ;
      /**
       * <code>uint32 current_num = 5;</code>
       * @return The currentNum.
       */
      @java.lang.Override
      public int getCurrentNum() {
        return currentNum_;
      }
      /**
       * <code>uint32 current_num = 5;</code>
       * @param value The currentNum to set.
       * @return This builder for chaining.
       */
      public Builder setCurrentNum(int value) {
        
        currentNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 current_num = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurrentNum() {
        
        currentNum_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo> buildingList_ =
        java.util.Collections.emptyList();
      private void ensureBuildingListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          buildingList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo>(buildingList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo, emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo.Builder, emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfoOrBuilder> buildingListBuilder_;

      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo> getBuildingListList() {
        if (buildingListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(buildingList_);
        } else {
          return buildingListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public int getBuildingListCount() {
        if (buildingListBuilder_ == null) {
          return buildingList_.size();
        } else {
          return buildingListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo getBuildingList(int index) {
        if (buildingListBuilder_ == null) {
          return buildingList_.get(index);
        } else {
          return buildingListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public Builder setBuildingList(
          int index, emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo value) {
        if (buildingListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBuildingListIsMutable();
          buildingList_.set(index, value);
          onChanged();
        } else {
          buildingListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public Builder setBuildingList(
          int index, emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo.Builder builderForValue) {
        if (buildingListBuilder_ == null) {
          ensureBuildingListIsMutable();
          buildingList_.set(index, builderForValue.build());
          onChanged();
        } else {
          buildingListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public Builder addBuildingList(emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo value) {
        if (buildingListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBuildingListIsMutable();
          buildingList_.add(value);
          onChanged();
        } else {
          buildingListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public Builder addBuildingList(
          int index, emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo value) {
        if (buildingListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBuildingListIsMutable();
          buildingList_.add(index, value);
          onChanged();
        } else {
          buildingListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public Builder addBuildingList(
          emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo.Builder builderForValue) {
        if (buildingListBuilder_ == null) {
          ensureBuildingListIsMutable();
          buildingList_.add(builderForValue.build());
          onChanged();
        } else {
          buildingListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public Builder addBuildingList(
          int index, emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo.Builder builderForValue) {
        if (buildingListBuilder_ == null) {
          ensureBuildingListIsMutable();
          buildingList_.add(index, builderForValue.build());
          onChanged();
        } else {
          buildingListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public Builder addAllBuildingList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo> values) {
        if (buildingListBuilder_ == null) {
          ensureBuildingListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, buildingList_);
          onChanged();
        } else {
          buildingListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public Builder clearBuildingList() {
        if (buildingListBuilder_ == null) {
          buildingList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          buildingListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public Builder removeBuildingList(int index) {
        if (buildingListBuilder_ == null) {
          ensureBuildingListIsMutable();
          buildingList_.remove(index);
          onChanged();
        } else {
          buildingListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo.Builder getBuildingListBuilder(
          int index) {
        return getBuildingListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfoOrBuilder getBuildingListOrBuilder(
          int index) {
        if (buildingListBuilder_ == null) {
          return buildingList_.get(index);  } else {
          return buildingListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfoOrBuilder> 
           getBuildingListOrBuilderList() {
        if (buildingListBuilder_ != null) {
          return buildingListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(buildingList_);
        }
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo.Builder addBuildingListBuilder() {
        return getBuildingListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo.Builder addBuildingListBuilder(
          int index) {
        return getBuildingListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .BuildingInfo building_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo.Builder> 
           getBuildingListBuilderList() {
        return getBuildingListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo, emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo.Builder, emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfoOrBuilder> 
          getBuildingListFieldBuilder() {
        if (buildingListBuilder_ == null) {
          buildingListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo, emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfo.Builder, emu.grasscutter.net.oldproto.BuildingInfoOuterClass.BuildingInfoOrBuilder>(
                  buildingList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          buildingList_ = null;
        }
        return buildingListBuilder_;
      }

      private int maxNum_ ;
      /**
       * <code>uint32 max_num = 13;</code>
       * @return The maxNum.
       */
      @java.lang.Override
      public int getMaxNum() {
        return maxNum_;
      }
      /**
       * <code>uint32 max_num = 13;</code>
       * @param value The maxNum to set.
       * @return This builder for chaining.
       */
      public Builder setMaxNum(int value) {
        
        maxNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_num = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxNum() {
        
        maxNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GlobalBuildingInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:GlobalBuildingInfoNotify)
    private static final emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify();
    }

    public static emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GlobalBuildingInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<GlobalBuildingInfoNotify>() {
      @java.lang.Override
      public GlobalBuildingInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GlobalBuildingInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GlobalBuildingInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.GlobalBuildingInfoNotifyOuterClass.GlobalBuildingInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GlobalBuildingInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GlobalBuildingInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GlobalBuildingInfoNotify.proto\032\022Buildi" +
      "ngInfo.proto\"f\n\030GlobalBuildingInfoNotify" +
      "\022\023\n\013current_num\030\005 \001(\r\022$\n\rbuilding_list\030\003" +
      " \003(\0132\r.BuildingInfo\022\017\n\007max_num\030\r \001(\rB\036\n\034" +
      "emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.BuildingInfoOuterClass.getDescriptor(),
        });
    internal_static_GlobalBuildingInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GlobalBuildingInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GlobalBuildingInfoNotify_descriptor,
        new java.lang.String[] { "CurrentNum", "BuildingList", "MaxNum", });
    emu.grasscutter.net.oldproto.BuildingInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
