// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeRacingRecord.proto

package emu.grasscutter.net.newproto;

public final class HomeRacingRecordOuterClass {
  private HomeRacingRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeRacingRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeRacingRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord> 
        getRecordListList();
    /**
     * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
     */
    emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord getRecordList(int index);
    /**
     * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
     */
    int getRecordListCount();
    /**
     * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecordOrBuilder> 
        getRecordListOrBuilderList();
    /**
     * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
     */
    emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecordOrBuilder getRecordListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code HomeRacingRecord}
   */
  public static final class HomeRacingRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeRacingRecord)
      HomeRacingRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeRacingRecord.newBuilder() to construct.
    private HomeRacingRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeRacingRecord() {
      recordList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeRacingRecord();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.internal_static_HomeRacingRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.internal_static_HomeRacingRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord.class, emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord.Builder.class);
    }

    public static final int RECORD_LIST_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord> recordList_;
    /**
     * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord> getRecordListList() {
      return recordList_;
    }
    /**
     * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecordOrBuilder> 
        getRecordListOrBuilderList() {
      return recordList_;
    }
    /**
     * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
     */
    @java.lang.Override
    public int getRecordListCount() {
      return recordList_.size();
    }
    /**
     * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord getRecordList(int index) {
      return recordList_.get(index);
    }
    /**
     * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecordOrBuilder getRecordListOrBuilder(
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
        output.writeMessage(9, recordList_.get(i));
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
          .computeMessageSize(9, recordList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord other = (emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord) obj;

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

    public static emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord prototype) {
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
     * Protobuf type {@code HomeRacingRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeRacingRecord)
        emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.internal_static_HomeRacingRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.internal_static_HomeRacingRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord.class, emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord.newBuilder()
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
        return emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.internal_static_HomeRacingRecord_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord build() {
        emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord buildPartial() {
        emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord result = new emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord(this);
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
        if (other instanceof emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord) {
          return mergeFrom((emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord other) {
        if (other == emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord.getDefaultInstance()) return this;
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
              case 74: {
                emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord.parser(),
                        extensionRegistry);
                if (recordListBuilder_ == null) {
                  ensureRecordListIsMutable();
                  recordList_.add(m);
                } else {
                  recordListBuilder_.addMessage(m);
                }
                break;
              } // case 74
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

      private java.util.List<emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord> recordList_ =
        java.util.Collections.emptyList();
      private void ensureRecordListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          recordList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord>(recordList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord, emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord.Builder, emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecordOrBuilder> recordListBuilder_;

      /**
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord> getRecordListList() {
        if (recordListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(recordList_);
        } else {
          return recordListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public int getRecordListCount() {
        if (recordListBuilder_ == null) {
          return recordList_.size();
        } else {
          return recordListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord getRecordList(int index) {
        if (recordListBuilder_ == null) {
          return recordList_.get(index);
        } else {
          return recordListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public Builder setRecordList(
          int index, emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord value) {
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
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public Builder setRecordList(
          int index, emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord.Builder builderForValue) {
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
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public Builder addRecordList(emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord value) {
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
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public Builder addRecordList(
          int index, emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord value) {
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
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public Builder addRecordList(
          emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord.Builder builderForValue) {
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
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public Builder addRecordList(
          int index, emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord.Builder builderForValue) {
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
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public Builder addAllRecordList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord> values) {
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
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
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
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
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
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord.Builder getRecordListBuilder(
          int index) {
        return getRecordListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecordOrBuilder getRecordListOrBuilder(
          int index) {
        if (recordListBuilder_ == null) {
          return recordList_.get(index);  } else {
          return recordListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecordOrBuilder> 
           getRecordListOrBuilderList() {
        if (recordListBuilder_ != null) {
          return recordListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(recordList_);
        }
      }
      /**
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord.Builder addRecordListBuilder() {
        return getRecordListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord.Builder addRecordListBuilder(
          int index) {
        return getRecordListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeRacingGalleryRecord record_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord.Builder> 
           getRecordListBuilderList() {
        return getRecordListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord, emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord.Builder, emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecordOrBuilder> 
          getRecordListFieldBuilder() {
        if (recordListBuilder_ == null) {
          recordListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord, emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecord.Builder, emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.HomeRacingGalleryRecordOrBuilder>(
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


      // @@protoc_insertion_point(builder_scope:HomeRacingRecord)
    }

    // @@protoc_insertion_point(class_scope:HomeRacingRecord)
    private static final emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord();
    }

    public static emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeRacingRecord>
        PARSER = new com.google.protobuf.AbstractParser<HomeRacingRecord>() {
      @java.lang.Override
      public HomeRacingRecord parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeRacingRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeRacingRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.HomeRacingRecordOuterClass.HomeRacingRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeRacingRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeRacingRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026HomeRacingRecord.proto\032\035HomeRacingGall" +
      "eryRecord.proto\"A\n\020HomeRacingRecord\022-\n\013r" +
      "ecord_list\030\t \003(\0132\030.HomeRacingGalleryReco" +
      "rdB\036\n\034emu.grasscutter.net.newprotob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.getDescriptor(),
        });
    internal_static_HomeRacingRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeRacingRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeRacingRecord_descriptor,
        new java.lang.String[] { "RecordList", });
    emu.grasscutter.net.newproto.HomeRacingGalleryRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
