// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FurnitureMakeSlot.proto

package emu.grasscutter.net.oldproto;

public final class FurnitureMakeSlotOuterClass {
  private FurnitureMakeSlotOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FurnitureMakeSlotOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FurnitureMakeSlot)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData> 
        getFurnitureMakeDataListList();
    /**
     * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
     */
    emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData getFurnitureMakeDataList(int index);
    /**
     * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
     */
    int getFurnitureMakeDataListCount();
    /**
     * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder> 
        getFurnitureMakeDataListOrBuilderList();
    /**
     * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
     */
    emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder getFurnitureMakeDataListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code FurnitureMakeSlot}
   */
  public static final class FurnitureMakeSlot extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FurnitureMakeSlot)
      FurnitureMakeSlotOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FurnitureMakeSlot.newBuilder() to construct.
    private FurnitureMakeSlot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FurnitureMakeSlot() {
      furnitureMakeDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FurnitureMakeSlot();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.internal_static_FurnitureMakeSlot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.internal_static_FurnitureMakeSlot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.class, emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder.class);
    }

    public static final int FURNITURE_MAKE_DATA_LIST_FIELD_NUMBER = 14;
    private java.util.List<emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData> furnitureMakeDataList_;
    /**
     * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData> getFurnitureMakeDataListList() {
      return furnitureMakeDataList_;
    }
    /**
     * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder> 
        getFurnitureMakeDataListOrBuilderList() {
      return furnitureMakeDataList_;
    }
    /**
     * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
     */
    @java.lang.Override
    public int getFurnitureMakeDataListCount() {
      return furnitureMakeDataList_.size();
    }
    /**
     * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData getFurnitureMakeDataList(int index) {
      return furnitureMakeDataList_.get(index);
    }
    /**
     * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder getFurnitureMakeDataListOrBuilder(
        int index) {
      return furnitureMakeDataList_.get(index);
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
      for (int i = 0; i < furnitureMakeDataList_.size(); i++) {
        output.writeMessage(14, furnitureMakeDataList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < furnitureMakeDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, furnitureMakeDataList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot other = (emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot) obj;

      if (!getFurnitureMakeDataListList()
          .equals(other.getFurnitureMakeDataListList())) return false;
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
      if (getFurnitureMakeDataListCount() > 0) {
        hash = (37 * hash) + FURNITURE_MAKE_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFurnitureMakeDataListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot prototype) {
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
     * Protobuf type {@code FurnitureMakeSlot}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FurnitureMakeSlot)
        emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.internal_static_FurnitureMakeSlot_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.internal_static_FurnitureMakeSlot_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.class, emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (furnitureMakeDataListBuilder_ == null) {
          furnitureMakeDataList_ = java.util.Collections.emptyList();
        } else {
          furnitureMakeDataList_ = null;
          furnitureMakeDataListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.internal_static_FurnitureMakeSlot_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot build() {
        emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot buildPartial() {
        emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot result = new emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot(this);
        int from_bitField0_ = bitField0_;
        if (furnitureMakeDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            furnitureMakeDataList_ = java.util.Collections.unmodifiableList(furnitureMakeDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.furnitureMakeDataList_ = furnitureMakeDataList_;
        } else {
          result.furnitureMakeDataList_ = furnitureMakeDataListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot) {
          return mergeFrom((emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot other) {
        if (other == emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance()) return this;
        if (furnitureMakeDataListBuilder_ == null) {
          if (!other.furnitureMakeDataList_.isEmpty()) {
            if (furnitureMakeDataList_.isEmpty()) {
              furnitureMakeDataList_ = other.furnitureMakeDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFurnitureMakeDataListIsMutable();
              furnitureMakeDataList_.addAll(other.furnitureMakeDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.furnitureMakeDataList_.isEmpty()) {
            if (furnitureMakeDataListBuilder_.isEmpty()) {
              furnitureMakeDataListBuilder_.dispose();
              furnitureMakeDataListBuilder_ = null;
              furnitureMakeDataList_ = other.furnitureMakeDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              furnitureMakeDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getFurnitureMakeDataListFieldBuilder() : null;
            } else {
              furnitureMakeDataListBuilder_.addAllMessages(other.furnitureMakeDataList_);
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
                emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData.parser(),
                        extensionRegistry);
                if (furnitureMakeDataListBuilder_ == null) {
                  ensureFurnitureMakeDataListIsMutable();
                  furnitureMakeDataList_.add(m);
                } else {
                  furnitureMakeDataListBuilder_.addMessage(m);
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

      private java.util.List<emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData> furnitureMakeDataList_ =
        java.util.Collections.emptyList();
      private void ensureFurnitureMakeDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          furnitureMakeDataList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData>(furnitureMakeDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData, emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData.Builder, emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder> furnitureMakeDataListBuilder_;

      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData> getFurnitureMakeDataListList() {
        if (furnitureMakeDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(furnitureMakeDataList_);
        } else {
          return furnitureMakeDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public int getFurnitureMakeDataListCount() {
        if (furnitureMakeDataListBuilder_ == null) {
          return furnitureMakeDataList_.size();
        } else {
          return furnitureMakeDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData getFurnitureMakeDataList(int index) {
        if (furnitureMakeDataListBuilder_ == null) {
          return furnitureMakeDataList_.get(index);
        } else {
          return furnitureMakeDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public Builder setFurnitureMakeDataList(
          int index, emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData value) {
        if (furnitureMakeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFurnitureMakeDataListIsMutable();
          furnitureMakeDataList_.set(index, value);
          onChanged();
        } else {
          furnitureMakeDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public Builder setFurnitureMakeDataList(
          int index, emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData.Builder builderForValue) {
        if (furnitureMakeDataListBuilder_ == null) {
          ensureFurnitureMakeDataListIsMutable();
          furnitureMakeDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          furnitureMakeDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public Builder addFurnitureMakeDataList(emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData value) {
        if (furnitureMakeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFurnitureMakeDataListIsMutable();
          furnitureMakeDataList_.add(value);
          onChanged();
        } else {
          furnitureMakeDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public Builder addFurnitureMakeDataList(
          int index, emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData value) {
        if (furnitureMakeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFurnitureMakeDataListIsMutable();
          furnitureMakeDataList_.add(index, value);
          onChanged();
        } else {
          furnitureMakeDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public Builder addFurnitureMakeDataList(
          emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData.Builder builderForValue) {
        if (furnitureMakeDataListBuilder_ == null) {
          ensureFurnitureMakeDataListIsMutable();
          furnitureMakeDataList_.add(builderForValue.build());
          onChanged();
        } else {
          furnitureMakeDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public Builder addFurnitureMakeDataList(
          int index, emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData.Builder builderForValue) {
        if (furnitureMakeDataListBuilder_ == null) {
          ensureFurnitureMakeDataListIsMutable();
          furnitureMakeDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          furnitureMakeDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public Builder addAllFurnitureMakeDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData> values) {
        if (furnitureMakeDataListBuilder_ == null) {
          ensureFurnitureMakeDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, furnitureMakeDataList_);
          onChanged();
        } else {
          furnitureMakeDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public Builder clearFurnitureMakeDataList() {
        if (furnitureMakeDataListBuilder_ == null) {
          furnitureMakeDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          furnitureMakeDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public Builder removeFurnitureMakeDataList(int index) {
        if (furnitureMakeDataListBuilder_ == null) {
          ensureFurnitureMakeDataListIsMutable();
          furnitureMakeDataList_.remove(index);
          onChanged();
        } else {
          furnitureMakeDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData.Builder getFurnitureMakeDataListBuilder(
          int index) {
        return getFurnitureMakeDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder getFurnitureMakeDataListOrBuilder(
          int index) {
        if (furnitureMakeDataListBuilder_ == null) {
          return furnitureMakeDataList_.get(index);  } else {
          return furnitureMakeDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder> 
           getFurnitureMakeDataListOrBuilderList() {
        if (furnitureMakeDataListBuilder_ != null) {
          return furnitureMakeDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(furnitureMakeDataList_);
        }
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData.Builder addFurnitureMakeDataListBuilder() {
        return getFurnitureMakeDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData.getDefaultInstance());
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData.Builder addFurnitureMakeDataListBuilder(
          int index) {
        return getFurnitureMakeDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData.getDefaultInstance());
      }
      /**
       * <code>repeated .FurnitureMakeData furniture_make_data_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData.Builder> 
           getFurnitureMakeDataListBuilderList() {
        return getFurnitureMakeDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData, emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData.Builder, emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder> 
          getFurnitureMakeDataListFieldBuilder() {
        if (furnitureMakeDataListBuilder_ == null) {
          furnitureMakeDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData, emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeData.Builder, emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.FurnitureMakeDataOrBuilder>(
                  furnitureMakeDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          furnitureMakeDataList_ = null;
        }
        return furnitureMakeDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FurnitureMakeSlot)
    }

    // @@protoc_insertion_point(class_scope:FurnitureMakeSlot)
    private static final emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot();
    }

    public static emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FurnitureMakeSlot>
        PARSER = new com.google.protobuf.AbstractParser<FurnitureMakeSlot>() {
      @java.lang.Override
      public FurnitureMakeSlot parsePartialFrom(
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

    public static com.google.protobuf.Parser<FurnitureMakeSlot> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FurnitureMakeSlot> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FurnitureMakeSlot_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FurnitureMakeSlot_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027FurnitureMakeSlot.proto\032\027FurnitureMake" +
      "Data.proto\"I\n\021FurnitureMakeSlot\0224\n\030furni" +
      "ture_make_data_list\030\016 \003(\0132\022.FurnitureMak" +
      "eDataB\036\n\034emu.grasscutter.net.oldprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.getDescriptor(),
        });
    internal_static_FurnitureMakeSlot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FurnitureMakeSlot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FurnitureMakeSlot_descriptor,
        new java.lang.String[] { "FurnitureMakeDataList", });
    emu.grasscutter.net.oldproto.FurnitureMakeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
