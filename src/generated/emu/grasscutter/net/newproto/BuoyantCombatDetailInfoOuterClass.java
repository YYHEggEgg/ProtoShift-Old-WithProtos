// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BuoyantCombatDetailInfo.proto

package emu.grasscutter.net.newproto;

public final class BuoyantCombatDetailInfoOuterClass {
  private BuoyantCombatDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BuoyantCombatDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BuoyantCombatDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo> 
        getDailyInfoListList();
    /**
     * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
     */
    emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo getDailyInfoList(int index);
    /**
     * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
     */
    int getDailyInfoListCount();
    /**
     * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfoOrBuilder> 
        getDailyInfoListOrBuilderList();
    /**
     * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
     */
    emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfoOrBuilder getDailyInfoListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code BuoyantCombatDetailInfo}
   */
  public static final class BuoyantCombatDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BuoyantCombatDetailInfo)
      BuoyantCombatDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BuoyantCombatDetailInfo.newBuilder() to construct.
    private BuoyantCombatDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BuoyantCombatDetailInfo() {
      dailyInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BuoyantCombatDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.internal_static_BuoyantCombatDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.internal_static_BuoyantCombatDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo.class, emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo.Builder.class);
    }

    public static final int DAILY_INFO_LIST_FIELD_NUMBER = 11;
    private java.util.List<emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo> dailyInfoList_;
    /**
     * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo> getDailyInfoListList() {
      return dailyInfoList_;
    }
    /**
     * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfoOrBuilder> 
        getDailyInfoListOrBuilderList() {
      return dailyInfoList_;
    }
    /**
     * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
     */
    @java.lang.Override
    public int getDailyInfoListCount() {
      return dailyInfoList_.size();
    }
    /**
     * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo getDailyInfoList(int index) {
      return dailyInfoList_.get(index);
    }
    /**
     * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfoOrBuilder getDailyInfoListOrBuilder(
        int index) {
      return dailyInfoList_.get(index);
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
      for (int i = 0; i < dailyInfoList_.size(); i++) {
        output.writeMessage(11, dailyInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < dailyInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, dailyInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo other = (emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo) obj;

      if (!getDailyInfoListList()
          .equals(other.getDailyInfoListList())) return false;
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
      if (getDailyInfoListCount() > 0) {
        hash = (37 * hash) + DAILY_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDailyInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo prototype) {
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
     * Protobuf type {@code BuoyantCombatDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BuoyantCombatDetailInfo)
        emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.internal_static_BuoyantCombatDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.internal_static_BuoyantCombatDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo.class, emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (dailyInfoListBuilder_ == null) {
          dailyInfoList_ = java.util.Collections.emptyList();
        } else {
          dailyInfoList_ = null;
          dailyInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.internal_static_BuoyantCombatDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo build() {
        emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo buildPartial() {
        emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo result = new emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo(this);
        int from_bitField0_ = bitField0_;
        if (dailyInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            dailyInfoList_ = java.util.Collections.unmodifiableList(dailyInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.dailyInfoList_ = dailyInfoList_;
        } else {
          result.dailyInfoList_ = dailyInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo other) {
        if (other == emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo.getDefaultInstance()) return this;
        if (dailyInfoListBuilder_ == null) {
          if (!other.dailyInfoList_.isEmpty()) {
            if (dailyInfoList_.isEmpty()) {
              dailyInfoList_ = other.dailyInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureDailyInfoListIsMutable();
              dailyInfoList_.addAll(other.dailyInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.dailyInfoList_.isEmpty()) {
            if (dailyInfoListBuilder_.isEmpty()) {
              dailyInfoListBuilder_.dispose();
              dailyInfoListBuilder_ = null;
              dailyInfoList_ = other.dailyInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              dailyInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDailyInfoListFieldBuilder() : null;
            } else {
              dailyInfoListBuilder_.addAllMessages(other.dailyInfoList_);
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
              case 90: {
                emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo.parser(),
                        extensionRegistry);
                if (dailyInfoListBuilder_ == null) {
                  ensureDailyInfoListIsMutable();
                  dailyInfoList_.add(m);
                } else {
                  dailyInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 90
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

      private java.util.List<emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo> dailyInfoList_ =
        java.util.Collections.emptyList();
      private void ensureDailyInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          dailyInfoList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo>(dailyInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo, emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo.Builder, emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfoOrBuilder> dailyInfoListBuilder_;

      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo> getDailyInfoListList() {
        if (dailyInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(dailyInfoList_);
        } else {
          return dailyInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public int getDailyInfoListCount() {
        if (dailyInfoListBuilder_ == null) {
          return dailyInfoList_.size();
        } else {
          return dailyInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo getDailyInfoList(int index) {
        if (dailyInfoListBuilder_ == null) {
          return dailyInfoList_.get(index);
        } else {
          return dailyInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public Builder setDailyInfoList(
          int index, emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo value) {
        if (dailyInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDailyInfoListIsMutable();
          dailyInfoList_.set(index, value);
          onChanged();
        } else {
          dailyInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public Builder setDailyInfoList(
          int index, emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo.Builder builderForValue) {
        if (dailyInfoListBuilder_ == null) {
          ensureDailyInfoListIsMutable();
          dailyInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          dailyInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public Builder addDailyInfoList(emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo value) {
        if (dailyInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDailyInfoListIsMutable();
          dailyInfoList_.add(value);
          onChanged();
        } else {
          dailyInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public Builder addDailyInfoList(
          int index, emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo value) {
        if (dailyInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDailyInfoListIsMutable();
          dailyInfoList_.add(index, value);
          onChanged();
        } else {
          dailyInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public Builder addDailyInfoList(
          emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo.Builder builderForValue) {
        if (dailyInfoListBuilder_ == null) {
          ensureDailyInfoListIsMutable();
          dailyInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          dailyInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public Builder addDailyInfoList(
          int index, emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo.Builder builderForValue) {
        if (dailyInfoListBuilder_ == null) {
          ensureDailyInfoListIsMutable();
          dailyInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          dailyInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public Builder addAllDailyInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo> values) {
        if (dailyInfoListBuilder_ == null) {
          ensureDailyInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, dailyInfoList_);
          onChanged();
        } else {
          dailyInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public Builder clearDailyInfoList() {
        if (dailyInfoListBuilder_ == null) {
          dailyInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          dailyInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public Builder removeDailyInfoList(int index) {
        if (dailyInfoListBuilder_ == null) {
          ensureDailyInfoListIsMutable();
          dailyInfoList_.remove(index);
          onChanged();
        } else {
          dailyInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo.Builder getDailyInfoListBuilder(
          int index) {
        return getDailyInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfoOrBuilder getDailyInfoListOrBuilder(
          int index) {
        if (dailyInfoListBuilder_ == null) {
          return dailyInfoList_.get(index);  } else {
          return dailyInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfoOrBuilder> 
           getDailyInfoListOrBuilderList() {
        if (dailyInfoListBuilder_ != null) {
          return dailyInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(dailyInfoList_);
        }
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo.Builder addDailyInfoListBuilder() {
        return getDailyInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo.Builder addDailyInfoListBuilder(
          int index) {
        return getDailyInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .BuoyantCombatDailyInfo daily_info_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo.Builder> 
           getDailyInfoListBuilderList() {
        return getDailyInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo, emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo.Builder, emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfoOrBuilder> 
          getDailyInfoListFieldBuilder() {
        if (dailyInfoListBuilder_ == null) {
          dailyInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo, emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfo.Builder, emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.BuoyantCombatDailyInfoOrBuilder>(
                  dailyInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          dailyInfoList_ = null;
        }
        return dailyInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BuoyantCombatDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:BuoyantCombatDetailInfo)
    private static final emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo();
    }

    public static emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BuoyantCombatDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<BuoyantCombatDetailInfo>() {
      @java.lang.Override
      public BuoyantCombatDetailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<BuoyantCombatDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BuoyantCombatDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.BuoyantCombatDetailInfoOuterClass.BuoyantCombatDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BuoyantCombatDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BuoyantCombatDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035BuoyantCombatDetailInfo.proto\032\034Buoyant" +
      "CombatDailyInfo.proto\"K\n\027BuoyantCombatDe" +
      "tailInfo\0220\n\017daily_info_list\030\013 \003(\0132\027.Buoy" +
      "antCombatDailyInfoB\036\n\034emu.grasscutter.ne" +
      "t.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.getDescriptor(),
        });
    internal_static_BuoyantCombatDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BuoyantCombatDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BuoyantCombatDetailInfo_descriptor,
        new java.lang.String[] { "DailyInfoList", });
    emu.grasscutter.net.newproto.BuoyantCombatDailyInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
