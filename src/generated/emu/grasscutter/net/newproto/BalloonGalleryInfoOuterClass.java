// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BalloonGalleryInfo.proto

package emu.grasscutter.net.newproto;

public final class BalloonGalleryInfoOuterClass {
  private BalloonGalleryInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BalloonGalleryInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BalloonGalleryInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN> 
        getRecordListList();
    /**
     * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
     */
    emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN getRecordList(int index);
    /**
     * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
     */
    int getRecordListCount();
    /**
     * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBNOrBuilder> 
        getRecordListOrBuilderList();
    /**
     * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
     */
    emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBNOrBuilder getRecordListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code BalloonGalleryInfo}
   */
  public static final class BalloonGalleryInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BalloonGalleryInfo)
      BalloonGalleryInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BalloonGalleryInfo.newBuilder() to construct.
    private BalloonGalleryInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BalloonGalleryInfo() {
      recordList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BalloonGalleryInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.internal_static_BalloonGalleryInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.internal_static_BalloonGalleryInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo.class, emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo.Builder.class);
    }

    public static final int RECORD_LIST_FIELD_NUMBER = 12;
    private java.util.List<emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN> recordList_;
    /**
     * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN> getRecordListList() {
      return recordList_;
    }
    /**
     * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBNOrBuilder> 
        getRecordListOrBuilderList() {
      return recordList_;
    }
    /**
     * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
     */
    @java.lang.Override
    public int getRecordListCount() {
      return recordList_.size();
    }
    /**
     * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN getRecordList(int index) {
      return recordList_.get(index);
    }
    /**
     * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBNOrBuilder getRecordListOrBuilder(
        int index) {
      return recordList_.get(index);
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
      for (int i = 0; i < recordList_.size(); i++) {
        output.writeMessage(12, recordList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < recordList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, recordList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo other = (emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo) obj;

      if (!getRecordListList()
          .equals(other.getRecordListList())) return false;
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
      if (getRecordListCount() > 0) {
        hash = (37 * hash) + RECORD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRecordListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo prototype) {
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
     * Protobuf type {@code BalloonGalleryInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BalloonGalleryInfo)
        emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.internal_static_BalloonGalleryInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.internal_static_BalloonGalleryInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo.class, emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (recordListBuilder_ == null) {
          recordList_ = java.util.Collections.emptyList();
        } else {
          recordList_ = null;
          recordListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.internal_static_BalloonGalleryInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo build() {
        emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo buildPartial() {
        emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo result = new emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo(this);
        int from_bitField0_ = bitField0_;
        if (recordListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            recordList_ = java.util.Collections.unmodifiableList(recordList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.recordList_ = recordList_;
        } else {
          result.recordList_ = recordListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo other) {
        if (other == emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo.getDefaultInstance()) return this;
        if (recordListBuilder_ == null) {
          if (!other.recordList_.isEmpty()) {
            if (recordList_.isEmpty()) {
              recordList_ = other.recordList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRecordListIsMutable();
              recordList_.addAll(other.recordList_);
            }
            onChanged();
          }
        } else {
          if (!other.recordList_.isEmpty()) {
            if (recordListBuilder_.isEmpty()) {
              recordListBuilder_.dispose();
              recordListBuilder_ = null;
              recordList_ = other.recordList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              recordListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRecordListFieldBuilder() : null;
            } else {
              recordListBuilder_.addAllMessages(other.recordList_);
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
              case 98: {
                emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.parser(),
                        extensionRegistry);
                if (recordListBuilder_ == null) {
                  ensureRecordListIsMutable();
                  recordList_.add(m);
                } else {
                  recordListBuilder_.addMessage(m);
                }
                break;
              } // case 98
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

      private java.util.List<emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN> recordList_ =
        java.util.Collections.emptyList();
      private void ensureRecordListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          recordList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN>(recordList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN, emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.Builder, emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBNOrBuilder> recordListBuilder_;

      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN> getRecordListList() {
        if (recordListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(recordList_);
        } else {
          return recordListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public int getRecordListCount() {
        if (recordListBuilder_ == null) {
          return recordList_.size();
        } else {
          return recordListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN getRecordList(int index) {
        if (recordListBuilder_ == null) {
          return recordList_.get(index);
        } else {
          return recordListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public Builder setRecordList(
          int index, emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN value) {
        if (recordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordListIsMutable();
          recordList_.set(index, value);
          onChanged();
        } else {
          recordListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public Builder setRecordList(
          int index, emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.Builder builderForValue) {
        if (recordListBuilder_ == null) {
          ensureRecordListIsMutable();
          recordList_.set(index, builderForValue.build());
          onChanged();
        } else {
          recordListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public Builder addRecordList(emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN value) {
        if (recordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordListIsMutable();
          recordList_.add(value);
          onChanged();
        } else {
          recordListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public Builder addRecordList(
          int index, emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN value) {
        if (recordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordListIsMutable();
          recordList_.add(index, value);
          onChanged();
        } else {
          recordListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public Builder addRecordList(
          emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.Builder builderForValue) {
        if (recordListBuilder_ == null) {
          ensureRecordListIsMutable();
          recordList_.add(builderForValue.build());
          onChanged();
        } else {
          recordListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public Builder addRecordList(
          int index, emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.Builder builderForValue) {
        if (recordListBuilder_ == null) {
          ensureRecordListIsMutable();
          recordList_.add(index, builderForValue.build());
          onChanged();
        } else {
          recordListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public Builder addAllRecordList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN> values) {
        if (recordListBuilder_ == null) {
          ensureRecordListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, recordList_);
          onChanged();
        } else {
          recordListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public Builder clearRecordList() {
        if (recordListBuilder_ == null) {
          recordList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          recordListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public Builder removeRecordList(int index) {
        if (recordListBuilder_ == null) {
          ensureRecordListIsMutable();
          recordList_.remove(index);
          onChanged();
        } else {
          recordListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.Builder getRecordListBuilder(
          int index) {
        return getRecordListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBNOrBuilder getRecordListOrBuilder(
          int index) {
        if (recordListBuilder_ == null) {
          return recordList_.get(index);  } else {
          return recordListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBNOrBuilder> 
           getRecordListOrBuilderList() {
        if (recordListBuilder_ != null) {
          return recordListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(recordList_);
        }
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.Builder addRecordListBuilder() {
        return getRecordListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.Builder addRecordListBuilder(
          int index) {
        return getRecordListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_ONCHFHBBCBN record_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.Builder> 
           getRecordListBuilderList() {
        return getRecordListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN, emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.Builder, emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBNOrBuilder> 
          getRecordListFieldBuilder() {
        if (recordListBuilder_ == null) {
          recordListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN, emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBN.Builder, emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.Unk2700_ONCHFHBBCBNOrBuilder>(
                  recordList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          recordList_ = null;
        }
        return recordListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BalloonGalleryInfo)
    }

    // @@protoc_insertion_point(class_scope:BalloonGalleryInfo)
    private static final emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo();
    }

    public static emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BalloonGalleryInfo>
        PARSER = new com.google.protobuf.AbstractParser<BalloonGalleryInfo>() {
      @java.lang.Override
      public BalloonGalleryInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<BalloonGalleryInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BalloonGalleryInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.BalloonGalleryInfoOuterClass.BalloonGalleryInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BalloonGalleryInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BalloonGalleryInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030BalloonGalleryInfo.proto\032\031Unk2700_ONCH" +
      "FHBBCBN.proto\"?\n\022BalloonGalleryInfo\022)\n\013r" +
      "ecord_list\030\014 \003(\0132\024.Unk2700_ONCHFHBBCBNB\036" +
      "\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.getDescriptor(),
        });
    internal_static_BalloonGalleryInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BalloonGalleryInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BalloonGalleryInfo_descriptor,
        new java.lang.String[] { "RecordList", });
    emu.grasscutter.net.newproto.Unk2700ONCHFHBBCBN.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}