// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MuqadasPotionActivityDetailInfo.proto

package emu.grasscutter.net.newproto;

public final class MuqadasPotionActivityDetailInfoOuterClass {
  private MuqadasPotionActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MuqadasPotionActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MuqadasPotionActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData> 
        getMuqadasPotionLevelDataListList();
    /**
     * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
     */
    emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData getMuqadasPotionLevelDataList(int index);
    /**
     * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
     */
    int getMuqadasPotionLevelDataListCount();
    /**
     * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelDataOrBuilder> 
        getMuqadasPotionLevelDataListOrBuilderList();
    /**
     * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
     */
    emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelDataOrBuilder getMuqadasPotionLevelDataListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code MuqadasPotionActivityDetailInfo}
   */
  public static final class MuqadasPotionActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MuqadasPotionActivityDetailInfo)
      MuqadasPotionActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MuqadasPotionActivityDetailInfo.newBuilder() to construct.
    private MuqadasPotionActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MuqadasPotionActivityDetailInfo() {
      muqadasPotionLevelDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MuqadasPotionActivityDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.internal_static_MuqadasPotionActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.internal_static_MuqadasPotionActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo.class, emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo.Builder.class);
    }

    public static final int MUQADAS_POTION_LEVEL_DATA_LIST_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData> muqadasPotionLevelDataList_;
    /**
     * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData> getMuqadasPotionLevelDataListList() {
      return muqadasPotionLevelDataList_;
    }
    /**
     * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelDataOrBuilder> 
        getMuqadasPotionLevelDataListOrBuilderList() {
      return muqadasPotionLevelDataList_;
    }
    /**
     * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
     */
    @java.lang.Override
    public int getMuqadasPotionLevelDataListCount() {
      return muqadasPotionLevelDataList_.size();
    }
    /**
     * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData getMuqadasPotionLevelDataList(int index) {
      return muqadasPotionLevelDataList_.get(index);
    }
    /**
     * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelDataOrBuilder getMuqadasPotionLevelDataListOrBuilder(
        int index) {
      return muqadasPotionLevelDataList_.get(index);
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
      for (int i = 0; i < muqadasPotionLevelDataList_.size(); i++) {
        output.writeMessage(5, muqadasPotionLevelDataList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < muqadasPotionLevelDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, muqadasPotionLevelDataList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo other = (emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo) obj;

      if (!getMuqadasPotionLevelDataListList()
          .equals(other.getMuqadasPotionLevelDataListList())) return false;
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
      if (getMuqadasPotionLevelDataListCount() > 0) {
        hash = (37 * hash) + MUQADAS_POTION_LEVEL_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMuqadasPotionLevelDataListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo prototype) {
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
     * Protobuf type {@code MuqadasPotionActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MuqadasPotionActivityDetailInfo)
        emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.internal_static_MuqadasPotionActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.internal_static_MuqadasPotionActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo.class, emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (muqadasPotionLevelDataListBuilder_ == null) {
          muqadasPotionLevelDataList_ = java.util.Collections.emptyList();
        } else {
          muqadasPotionLevelDataList_ = null;
          muqadasPotionLevelDataListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.internal_static_MuqadasPotionActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo build() {
        emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo buildPartial() {
        emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo result = new emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo(this);
        int from_bitField0_ = bitField0_;
        if (muqadasPotionLevelDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            muqadasPotionLevelDataList_ = java.util.Collections.unmodifiableList(muqadasPotionLevelDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.muqadasPotionLevelDataList_ = muqadasPotionLevelDataList_;
        } else {
          result.muqadasPotionLevelDataList_ = muqadasPotionLevelDataListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo other) {
        if (other == emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo.getDefaultInstance()) return this;
        if (muqadasPotionLevelDataListBuilder_ == null) {
          if (!other.muqadasPotionLevelDataList_.isEmpty()) {
            if (muqadasPotionLevelDataList_.isEmpty()) {
              muqadasPotionLevelDataList_ = other.muqadasPotionLevelDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMuqadasPotionLevelDataListIsMutable();
              muqadasPotionLevelDataList_.addAll(other.muqadasPotionLevelDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.muqadasPotionLevelDataList_.isEmpty()) {
            if (muqadasPotionLevelDataListBuilder_.isEmpty()) {
              muqadasPotionLevelDataListBuilder_.dispose();
              muqadasPotionLevelDataListBuilder_ = null;
              muqadasPotionLevelDataList_ = other.muqadasPotionLevelDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              muqadasPotionLevelDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMuqadasPotionLevelDataListFieldBuilder() : null;
            } else {
              muqadasPotionLevelDataListBuilder_.addAllMessages(other.muqadasPotionLevelDataList_);
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
                emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData.parser(),
                        extensionRegistry);
                if (muqadasPotionLevelDataListBuilder_ == null) {
                  ensureMuqadasPotionLevelDataListIsMutable();
                  muqadasPotionLevelDataList_.add(m);
                } else {
                  muqadasPotionLevelDataListBuilder_.addMessage(m);
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

      private java.util.List<emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData> muqadasPotionLevelDataList_ =
        java.util.Collections.emptyList();
      private void ensureMuqadasPotionLevelDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          muqadasPotionLevelDataList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData>(muqadasPotionLevelDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData, emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData.Builder, emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelDataOrBuilder> muqadasPotionLevelDataListBuilder_;

      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData> getMuqadasPotionLevelDataListList() {
        if (muqadasPotionLevelDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(muqadasPotionLevelDataList_);
        } else {
          return muqadasPotionLevelDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public int getMuqadasPotionLevelDataListCount() {
        if (muqadasPotionLevelDataListBuilder_ == null) {
          return muqadasPotionLevelDataList_.size();
        } else {
          return muqadasPotionLevelDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData getMuqadasPotionLevelDataList(int index) {
        if (muqadasPotionLevelDataListBuilder_ == null) {
          return muqadasPotionLevelDataList_.get(index);
        } else {
          return muqadasPotionLevelDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public Builder setMuqadasPotionLevelDataList(
          int index, emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData value) {
        if (muqadasPotionLevelDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMuqadasPotionLevelDataListIsMutable();
          muqadasPotionLevelDataList_.set(index, value);
          onChanged();
        } else {
          muqadasPotionLevelDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public Builder setMuqadasPotionLevelDataList(
          int index, emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData.Builder builderForValue) {
        if (muqadasPotionLevelDataListBuilder_ == null) {
          ensureMuqadasPotionLevelDataListIsMutable();
          muqadasPotionLevelDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          muqadasPotionLevelDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public Builder addMuqadasPotionLevelDataList(emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData value) {
        if (muqadasPotionLevelDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMuqadasPotionLevelDataListIsMutable();
          muqadasPotionLevelDataList_.add(value);
          onChanged();
        } else {
          muqadasPotionLevelDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public Builder addMuqadasPotionLevelDataList(
          int index, emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData value) {
        if (muqadasPotionLevelDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMuqadasPotionLevelDataListIsMutable();
          muqadasPotionLevelDataList_.add(index, value);
          onChanged();
        } else {
          muqadasPotionLevelDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public Builder addMuqadasPotionLevelDataList(
          emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData.Builder builderForValue) {
        if (muqadasPotionLevelDataListBuilder_ == null) {
          ensureMuqadasPotionLevelDataListIsMutable();
          muqadasPotionLevelDataList_.add(builderForValue.build());
          onChanged();
        } else {
          muqadasPotionLevelDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public Builder addMuqadasPotionLevelDataList(
          int index, emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData.Builder builderForValue) {
        if (muqadasPotionLevelDataListBuilder_ == null) {
          ensureMuqadasPotionLevelDataListIsMutable();
          muqadasPotionLevelDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          muqadasPotionLevelDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public Builder addAllMuqadasPotionLevelDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData> values) {
        if (muqadasPotionLevelDataListBuilder_ == null) {
          ensureMuqadasPotionLevelDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, muqadasPotionLevelDataList_);
          onChanged();
        } else {
          muqadasPotionLevelDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public Builder clearMuqadasPotionLevelDataList() {
        if (muqadasPotionLevelDataListBuilder_ == null) {
          muqadasPotionLevelDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          muqadasPotionLevelDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public Builder removeMuqadasPotionLevelDataList(int index) {
        if (muqadasPotionLevelDataListBuilder_ == null) {
          ensureMuqadasPotionLevelDataListIsMutable();
          muqadasPotionLevelDataList_.remove(index);
          onChanged();
        } else {
          muqadasPotionLevelDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData.Builder getMuqadasPotionLevelDataListBuilder(
          int index) {
        return getMuqadasPotionLevelDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelDataOrBuilder getMuqadasPotionLevelDataListOrBuilder(
          int index) {
        if (muqadasPotionLevelDataListBuilder_ == null) {
          return muqadasPotionLevelDataList_.get(index);  } else {
          return muqadasPotionLevelDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelDataOrBuilder> 
           getMuqadasPotionLevelDataListOrBuilderList() {
        if (muqadasPotionLevelDataListBuilder_ != null) {
          return muqadasPotionLevelDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(muqadasPotionLevelDataList_);
        }
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData.Builder addMuqadasPotionLevelDataListBuilder() {
        return getMuqadasPotionLevelDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData.getDefaultInstance());
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData.Builder addMuqadasPotionLevelDataListBuilder(
          int index) {
        return getMuqadasPotionLevelDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData.getDefaultInstance());
      }
      /**
       * <code>repeated .MuqadasPotionLevelData muqadas_potion_level_data_list = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData.Builder> 
           getMuqadasPotionLevelDataListBuilderList() {
        return getMuqadasPotionLevelDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData, emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData.Builder, emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelDataOrBuilder> 
          getMuqadasPotionLevelDataListFieldBuilder() {
        if (muqadasPotionLevelDataListBuilder_ == null) {
          muqadasPotionLevelDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData, emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelData.Builder, emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.MuqadasPotionLevelDataOrBuilder>(
                  muqadasPotionLevelDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          muqadasPotionLevelDataList_ = null;
        }
        return muqadasPotionLevelDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MuqadasPotionActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:MuqadasPotionActivityDetailInfo)
    private static final emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo();
    }

    public static emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MuqadasPotionActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<MuqadasPotionActivityDetailInfo>() {
      @java.lang.Override
      public MuqadasPotionActivityDetailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<MuqadasPotionActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MuqadasPotionActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.MuqadasPotionActivityDetailInfoOuterClass.MuqadasPotionActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MuqadasPotionActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MuqadasPotionActivityDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%MuqadasPotionActivityDetailInfo.proto\032" +
      "\034MuqadasPotionLevelData.proto\"b\n\037Muqadas" +
      "PotionActivityDetailInfo\022?\n\036muqadas_poti" +
      "on_level_data_list\030\005 \003(\0132\027.MuqadasPotion" +
      "LevelDataB\036\n\034emu.grasscutter.net.newprot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.getDescriptor(),
        });
    internal_static_MuqadasPotionActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MuqadasPotionActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MuqadasPotionActivityDetailInfo_descriptor,
        new java.lang.String[] { "MuqadasPotionLevelDataList", });
    emu.grasscutter.net.newproto.MuqadasPotionLevelDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}