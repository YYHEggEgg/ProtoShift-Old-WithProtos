// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriPoetryData.proto

package emu.grasscutter.net.newproto;

public final class IrodoriPoetryDataOuterClass {
  private IrodoriPoetryDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriPoetryDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriPoetryData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData> 
        getThemeDataListList();
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
     */
    emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData getThemeDataList(int index);
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
     */
    int getThemeDataListCount();
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder> 
        getThemeDataListOrBuilderList();
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
     */
    emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder getThemeDataListOrBuilder(
        int index);

    /**
     * <code>uint32 cur_theme_id = 12;</code>
     * @return The curThemeId.
     */
    int getCurThemeId();
  }
  /**
   * Protobuf type {@code IrodoriPoetryData}
   */
  public static final class IrodoriPoetryData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriPoetryData)
      IrodoriPoetryDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriPoetryData.newBuilder() to construct.
    private IrodoriPoetryData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriPoetryData() {
      themeDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriPoetryData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.internal_static_IrodoriPoetryData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.internal_static_IrodoriPoetryData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData.class, emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData.Builder.class);
    }

    public static final int THEME_DATA_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData> themeDataList_;
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData> getThemeDataListList() {
      return themeDataList_;
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder> 
        getThemeDataListOrBuilderList() {
      return themeDataList_;
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
     */
    @java.lang.Override
    public int getThemeDataListCount() {
      return themeDataList_.size();
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData getThemeDataList(int index) {
      return themeDataList_.get(index);
    }
    /**
     * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder getThemeDataListOrBuilder(
        int index) {
      return themeDataList_.get(index);
    }

    public static final int CUR_THEME_ID_FIELD_NUMBER = 12;
    private int curThemeId_;
    /**
     * <code>uint32 cur_theme_id = 12;</code>
     * @return The curThemeId.
     */
    @java.lang.Override
    public int getCurThemeId() {
      return curThemeId_;
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
      for (int i = 0; i < themeDataList_.size(); i++) {
        output.writeMessage(2, themeDataList_.get(i));
      }
      if (curThemeId_ != 0) {
        output.writeUInt32(12, curThemeId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < themeDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, themeDataList_.get(i));
      }
      if (curThemeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, curThemeId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData other = (emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData) obj;

      if (!getThemeDataListList()
          .equals(other.getThemeDataListList())) return false;
      if (getCurThemeId()
          != other.getCurThemeId()) return false;
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
      if (getThemeDataListCount() > 0) {
        hash = (37 * hash) + THEME_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getThemeDataListList().hashCode();
      }
      hash = (37 * hash) + CUR_THEME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCurThemeId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData prototype) {
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
     * Protobuf type {@code IrodoriPoetryData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriPoetryData)
        emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.internal_static_IrodoriPoetryData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.internal_static_IrodoriPoetryData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData.class, emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (themeDataListBuilder_ == null) {
          themeDataList_ = java.util.Collections.emptyList();
        } else {
          themeDataList_ = null;
          themeDataListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        curThemeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.internal_static_IrodoriPoetryData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData build() {
        emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData buildPartial() {
        emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData result = new emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData(this);
        int from_bitField0_ = bitField0_;
        if (themeDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            themeDataList_ = java.util.Collections.unmodifiableList(themeDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.themeDataList_ = themeDataList_;
        } else {
          result.themeDataList_ = themeDataListBuilder_.build();
        }
        result.curThemeId_ = curThemeId_;
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
        if (other instanceof emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData) {
          return mergeFrom((emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData other) {
        if (other == emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData.getDefaultInstance()) return this;
        if (themeDataListBuilder_ == null) {
          if (!other.themeDataList_.isEmpty()) {
            if (themeDataList_.isEmpty()) {
              themeDataList_ = other.themeDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureThemeDataListIsMutable();
              themeDataList_.addAll(other.themeDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.themeDataList_.isEmpty()) {
            if (themeDataListBuilder_.isEmpty()) {
              themeDataListBuilder_.dispose();
              themeDataListBuilder_ = null;
              themeDataList_ = other.themeDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              themeDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getThemeDataListFieldBuilder() : null;
            } else {
              themeDataListBuilder_.addAllMessages(other.themeDataList_);
            }
          }
        }
        if (other.getCurThemeId() != 0) {
          setCurThemeId(other.getCurThemeId());
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
              case 18: {
                emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.parser(),
                        extensionRegistry);
                if (themeDataListBuilder_ == null) {
                  ensureThemeDataListIsMutable();
                  themeDataList_.add(m);
                } else {
                  themeDataListBuilder_.addMessage(m);
                }
                break;
              } // case 18
              case 96: {
                curThemeId_ = input.readUInt32();

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
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData> themeDataList_ =
        java.util.Collections.emptyList();
      private void ensureThemeDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          themeDataList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData>(themeDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData, emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder, emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder> themeDataListBuilder_;

      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData> getThemeDataListList() {
        if (themeDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(themeDataList_);
        } else {
          return themeDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public int getThemeDataListCount() {
        if (themeDataListBuilder_ == null) {
          return themeDataList_.size();
        } else {
          return themeDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData getThemeDataList(int index) {
        if (themeDataListBuilder_ == null) {
          return themeDataList_.get(index);
        } else {
          return themeDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public Builder setThemeDataList(
          int index, emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData value) {
        if (themeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureThemeDataListIsMutable();
          themeDataList_.set(index, value);
          onChanged();
        } else {
          themeDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public Builder setThemeDataList(
          int index, emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder builderForValue) {
        if (themeDataListBuilder_ == null) {
          ensureThemeDataListIsMutable();
          themeDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          themeDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public Builder addThemeDataList(emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData value) {
        if (themeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureThemeDataListIsMutable();
          themeDataList_.add(value);
          onChanged();
        } else {
          themeDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public Builder addThemeDataList(
          int index, emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData value) {
        if (themeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureThemeDataListIsMutable();
          themeDataList_.add(index, value);
          onChanged();
        } else {
          themeDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public Builder addThemeDataList(
          emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder builderForValue) {
        if (themeDataListBuilder_ == null) {
          ensureThemeDataListIsMutable();
          themeDataList_.add(builderForValue.build());
          onChanged();
        } else {
          themeDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public Builder addThemeDataList(
          int index, emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder builderForValue) {
        if (themeDataListBuilder_ == null) {
          ensureThemeDataListIsMutable();
          themeDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          themeDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public Builder addAllThemeDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData> values) {
        if (themeDataListBuilder_ == null) {
          ensureThemeDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, themeDataList_);
          onChanged();
        } else {
          themeDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public Builder clearThemeDataList() {
        if (themeDataListBuilder_ == null) {
          themeDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          themeDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public Builder removeThemeDataList(int index) {
        if (themeDataListBuilder_ == null) {
          ensureThemeDataListIsMutable();
          themeDataList_.remove(index);
          onChanged();
        } else {
          themeDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder getThemeDataListBuilder(
          int index) {
        return getThemeDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder getThemeDataListOrBuilder(
          int index) {
        if (themeDataListBuilder_ == null) {
          return themeDataList_.get(index);  } else {
          return themeDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder> 
           getThemeDataListOrBuilderList() {
        if (themeDataListBuilder_ != null) {
          return themeDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(themeDataList_);
        }
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder addThemeDataListBuilder() {
        return getThemeDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.getDefaultInstance());
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder addThemeDataListBuilder(
          int index) {
        return getThemeDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.getDefaultInstance());
      }
      /**
       * <code>repeated .IrodoriPoetryThemeData theme_data_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder> 
           getThemeDataListBuilderList() {
        return getThemeDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData, emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder, emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder> 
          getThemeDataListFieldBuilder() {
        if (themeDataListBuilder_ == null) {
          themeDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData, emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder, emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder>(
                  themeDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          themeDataList_ = null;
        }
        return themeDataListBuilder_;
      }

      private int curThemeId_ ;
      /**
       * <code>uint32 cur_theme_id = 12;</code>
       * @return The curThemeId.
       */
      @java.lang.Override
      public int getCurThemeId() {
        return curThemeId_;
      }
      /**
       * <code>uint32 cur_theme_id = 12;</code>
       * @param value The curThemeId to set.
       * @return This builder for chaining.
       */
      public Builder setCurThemeId(int value) {
        
        curThemeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_theme_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurThemeId() {
        
        curThemeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IrodoriPoetryData)
    }

    // @@protoc_insertion_point(class_scope:IrodoriPoetryData)
    private static final emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData();
    }

    public static emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriPoetryData>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriPoetryData>() {
      @java.lang.Override
      public IrodoriPoetryData parsePartialFrom(
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

    public static com.google.protobuf.Parser<IrodoriPoetryData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriPoetryData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.IrodoriPoetryDataOuterClass.IrodoriPoetryData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriPoetryData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriPoetryData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027IrodoriPoetryData.proto\032\034IrodoriPoetry" +
      "ThemeData.proto\"[\n\021IrodoriPoetryData\0220\n\017" +
      "theme_data_list\030\002 \003(\0132\027.IrodoriPoetryThe" +
      "meData\022\024\n\014cur_theme_id\030\014 \001(\rB\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.getDescriptor(),
        });
    internal_static_IrodoriPoetryData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriPoetryData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriPoetryData_descriptor,
        new java.lang.String[] { "ThemeDataList", "CurThemeId", });
    emu.grasscutter.net.newproto.IrodoriPoetryThemeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
