// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MistTrialActivityDetailInfo.proto

package emu.grasscutter.net.oldproto;

public final class MistTrialActivityDetailInfoOuterClass {
  private MistTrialActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MistTrialActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MistTrialActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData> 
        getTrialLevelDataListList();
    /**
     * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
     */
    emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData getTrialLevelDataList(int index);
    /**
     * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
     */
    int getTrialLevelDataListCount();
    /**
     * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelDataOrBuilder> 
        getTrialLevelDataListOrBuilderList();
    /**
     * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
     */
    emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelDataOrBuilder getTrialLevelDataListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code MistTrialActivityDetailInfo}
   */
  public static final class MistTrialActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MistTrialActivityDetailInfo)
      MistTrialActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MistTrialActivityDetailInfo.newBuilder() to construct.
    private MistTrialActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MistTrialActivityDetailInfo() {
      trialLevelDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MistTrialActivityDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.internal_static_MistTrialActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.internal_static_MistTrialActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo.class, emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo.Builder.class);
    }

    public static final int TRIAL_LEVEL_DATA_LIST_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData> trialLevelDataList_;
    /**
     * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData> getTrialLevelDataListList() {
      return trialLevelDataList_;
    }
    /**
     * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelDataOrBuilder> 
        getTrialLevelDataListOrBuilderList() {
      return trialLevelDataList_;
    }
    /**
     * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
     */
    @java.lang.Override
    public int getTrialLevelDataListCount() {
      return trialLevelDataList_.size();
    }
    /**
     * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData getTrialLevelDataList(int index) {
      return trialLevelDataList_.get(index);
    }
    /**
     * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelDataOrBuilder getTrialLevelDataListOrBuilder(
        int index) {
      return trialLevelDataList_.get(index);
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
      for (int i = 0; i < trialLevelDataList_.size(); i++) {
        output.writeMessage(5, trialLevelDataList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < trialLevelDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, trialLevelDataList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo other = (emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo) obj;

      if (!getTrialLevelDataListList()
          .equals(other.getTrialLevelDataListList())) return false;
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
      if (getTrialLevelDataListCount() > 0) {
        hash = (37 * hash) + TRIAL_LEVEL_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTrialLevelDataListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo prototype) {
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
     * Protobuf type {@code MistTrialActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MistTrialActivityDetailInfo)
        emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.internal_static_MistTrialActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.internal_static_MistTrialActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo.class, emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (trialLevelDataListBuilder_ == null) {
          trialLevelDataList_ = java.util.Collections.emptyList();
        } else {
          trialLevelDataList_ = null;
          trialLevelDataListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.internal_static_MistTrialActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo build() {
        emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo buildPartial() {
        emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo result = new emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo(this);
        int from_bitField0_ = bitField0_;
        if (trialLevelDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            trialLevelDataList_ = java.util.Collections.unmodifiableList(trialLevelDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.trialLevelDataList_ = trialLevelDataList_;
        } else {
          result.trialLevelDataList_ = trialLevelDataListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo other) {
        if (other == emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo.getDefaultInstance()) return this;
        if (trialLevelDataListBuilder_ == null) {
          if (!other.trialLevelDataList_.isEmpty()) {
            if (trialLevelDataList_.isEmpty()) {
              trialLevelDataList_ = other.trialLevelDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTrialLevelDataListIsMutable();
              trialLevelDataList_.addAll(other.trialLevelDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.trialLevelDataList_.isEmpty()) {
            if (trialLevelDataListBuilder_.isEmpty()) {
              trialLevelDataListBuilder_.dispose();
              trialLevelDataListBuilder_ = null;
              trialLevelDataList_ = other.trialLevelDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              trialLevelDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTrialLevelDataListFieldBuilder() : null;
            } else {
              trialLevelDataListBuilder_.addAllMessages(other.trialLevelDataList_);
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
              case 42: {
                emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData.parser(),
                        extensionRegistry);
                if (trialLevelDataListBuilder_ == null) {
                  ensureTrialLevelDataListIsMutable();
                  trialLevelDataList_.add(m);
                } else {
                  trialLevelDataListBuilder_.addMessage(m);
                }
                break;
              } // case 42
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

      private java.util.List<emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData> trialLevelDataList_ =
        java.util.Collections.emptyList();
      private void ensureTrialLevelDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          trialLevelDataList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData>(trialLevelDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData, emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData.Builder, emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelDataOrBuilder> trialLevelDataListBuilder_;

      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData> getTrialLevelDataListList() {
        if (trialLevelDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(trialLevelDataList_);
        } else {
          return trialLevelDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public int getTrialLevelDataListCount() {
        if (trialLevelDataListBuilder_ == null) {
          return trialLevelDataList_.size();
        } else {
          return trialLevelDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData getTrialLevelDataList(int index) {
        if (trialLevelDataListBuilder_ == null) {
          return trialLevelDataList_.get(index);
        } else {
          return trialLevelDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public Builder setTrialLevelDataList(
          int index, emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData value) {
        if (trialLevelDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTrialLevelDataListIsMutable();
          trialLevelDataList_.set(index, value);
          onChanged();
        } else {
          trialLevelDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public Builder setTrialLevelDataList(
          int index, emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData.Builder builderForValue) {
        if (trialLevelDataListBuilder_ == null) {
          ensureTrialLevelDataListIsMutable();
          trialLevelDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          trialLevelDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public Builder addTrialLevelDataList(emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData value) {
        if (trialLevelDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTrialLevelDataListIsMutable();
          trialLevelDataList_.add(value);
          onChanged();
        } else {
          trialLevelDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public Builder addTrialLevelDataList(
          int index, emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData value) {
        if (trialLevelDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTrialLevelDataListIsMutable();
          trialLevelDataList_.add(index, value);
          onChanged();
        } else {
          trialLevelDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public Builder addTrialLevelDataList(
          emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData.Builder builderForValue) {
        if (trialLevelDataListBuilder_ == null) {
          ensureTrialLevelDataListIsMutable();
          trialLevelDataList_.add(builderForValue.build());
          onChanged();
        } else {
          trialLevelDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public Builder addTrialLevelDataList(
          int index, emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData.Builder builderForValue) {
        if (trialLevelDataListBuilder_ == null) {
          ensureTrialLevelDataListIsMutable();
          trialLevelDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          trialLevelDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public Builder addAllTrialLevelDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData> values) {
        if (trialLevelDataListBuilder_ == null) {
          ensureTrialLevelDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, trialLevelDataList_);
          onChanged();
        } else {
          trialLevelDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public Builder clearTrialLevelDataList() {
        if (trialLevelDataListBuilder_ == null) {
          trialLevelDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          trialLevelDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public Builder removeTrialLevelDataList(int index) {
        if (trialLevelDataListBuilder_ == null) {
          ensureTrialLevelDataListIsMutable();
          trialLevelDataList_.remove(index);
          onChanged();
        } else {
          trialLevelDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData.Builder getTrialLevelDataListBuilder(
          int index) {
        return getTrialLevelDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelDataOrBuilder getTrialLevelDataListOrBuilder(
          int index) {
        if (trialLevelDataListBuilder_ == null) {
          return trialLevelDataList_.get(index);  } else {
          return trialLevelDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelDataOrBuilder> 
           getTrialLevelDataListOrBuilderList() {
        if (trialLevelDataListBuilder_ != null) {
          return trialLevelDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(trialLevelDataList_);
        }
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData.Builder addTrialLevelDataListBuilder() {
        return getTrialLevelDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData.getDefaultInstance());
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData.Builder addTrialLevelDataListBuilder(
          int index) {
        return getTrialLevelDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData.getDefaultInstance());
      }
      /**
       * <code>repeated .MistTrialLevelData trial_level_data_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData.Builder> 
           getTrialLevelDataListBuilderList() {
        return getTrialLevelDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData, emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData.Builder, emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelDataOrBuilder> 
          getTrialLevelDataListFieldBuilder() {
        if (trialLevelDataListBuilder_ == null) {
          trialLevelDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData, emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelData.Builder, emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.MistTrialLevelDataOrBuilder>(
                  trialLevelDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          trialLevelDataList_ = null;
        }
        return trialLevelDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MistTrialActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:MistTrialActivityDetailInfo)
    private static final emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo();
    }

    public static emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MistTrialActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<MistTrialActivityDetailInfo>() {
      @java.lang.Override
      public MistTrialActivityDetailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<MistTrialActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MistTrialActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.MistTrialActivityDetailInfoOuterClass.MistTrialActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MistTrialActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MistTrialActivityDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!MistTrialActivityDetailInfo.proto\032\030Mis" +
      "tTrialLevelData.proto\"Q\n\033MistTrialActivi" +
      "tyDetailInfo\0222\n\025trial_level_data_list\030\005 " +
      "\003(\0132\023.MistTrialLevelDataB\036\n\034emu.grasscut" +
      "ter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.getDescriptor(),
        });
    internal_static_MistTrialActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MistTrialActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MistTrialActivityDetailInfo_descriptor,
        new java.lang.String[] { "TrialLevelDataList", });
    emu.grasscutter.net.oldproto.MistTrialLevelDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
