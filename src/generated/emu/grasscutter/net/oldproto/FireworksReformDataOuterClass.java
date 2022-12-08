// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FireworksReformData.proto

package emu.grasscutter.net.oldproto;

public final class FireworksReformDataOuterClass {
  private FireworksReformDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FireworksReformDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FireworksReformData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 13;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam> 
        getReformParamListList();
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
     */
    emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam getReformParamList(int index);
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
     */
    int getReformParamListCount();
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder> 
        getReformParamListOrBuilderList();
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
     */
    emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder getReformParamListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code FireworksReformData}
   */
  public static final class FireworksReformData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FireworksReformData)
      FireworksReformDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FireworksReformData.newBuilder() to construct.
    private FireworksReformData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FireworksReformData() {
      reformParamList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FireworksReformData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.internal_static_FireworksReformData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.internal_static_FireworksReformData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData.class, emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 13;
    private int id_;
    /**
     * <code>uint32 id = 13;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int REFORM_PARAM_LIST_FIELD_NUMBER = 10;
    private java.util.List<emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam> reformParamList_;
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam> getReformParamListList() {
      return reformParamList_;
    }
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder> 
        getReformParamListOrBuilderList() {
      return reformParamList_;
    }
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
     */
    @java.lang.Override
    public int getReformParamListCount() {
      return reformParamList_.size();
    }
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam getReformParamList(int index) {
      return reformParamList_.get(index);
    }
    /**
     * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder getReformParamListOrBuilder(
        int index) {
      return reformParamList_.get(index);
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
      for (int i = 0; i < reformParamList_.size(); i++) {
        output.writeMessage(10, reformParamList_.get(i));
      }
      if (id_ != 0) {
        output.writeUInt32(13, id_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < reformParamList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, reformParamList_.get(i));
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, id_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData other = (emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData) obj;

      if (getId()
          != other.getId()) return false;
      if (!getReformParamListList()
          .equals(other.getReformParamListList())) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      if (getReformParamListCount() > 0) {
        hash = (37 * hash) + REFORM_PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getReformParamListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData prototype) {
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
     * Protobuf type {@code FireworksReformData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FireworksReformData)
        emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.internal_static_FireworksReformData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.internal_static_FireworksReformData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData.class, emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        id_ = 0;

        if (reformParamListBuilder_ == null) {
          reformParamList_ = java.util.Collections.emptyList();
        } else {
          reformParamList_ = null;
          reformParamListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.internal_static_FireworksReformData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData build() {
        emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData buildPartial() {
        emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData result = new emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData(this);
        int from_bitField0_ = bitField0_;
        result.id_ = id_;
        if (reformParamListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            reformParamList_ = java.util.Collections.unmodifiableList(reformParamList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.reformParamList_ = reformParamList_;
        } else {
          result.reformParamList_ = reformParamListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData) {
          return mergeFrom((emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData other) {
        if (other == emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (reformParamListBuilder_ == null) {
          if (!other.reformParamList_.isEmpty()) {
            if (reformParamList_.isEmpty()) {
              reformParamList_ = other.reformParamList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureReformParamListIsMutable();
              reformParamList_.addAll(other.reformParamList_);
            }
            onChanged();
          }
        } else {
          if (!other.reformParamList_.isEmpty()) {
            if (reformParamListBuilder_.isEmpty()) {
              reformParamListBuilder_.dispose();
              reformParamListBuilder_ = null;
              reformParamList_ = other.reformParamList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              reformParamListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getReformParamListFieldBuilder() : null;
            } else {
              reformParamListBuilder_.addAllMessages(other.reformParamList_);
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
              case 82: {
                emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam.parser(),
                        extensionRegistry);
                if (reformParamListBuilder_ == null) {
                  ensureReformParamListIsMutable();
                  reformParamList_.add(m);
                } else {
                  reformParamListBuilder_.addMessage(m);
                }
                break;
              } // case 82
              case 104: {
                id_ = input.readUInt32();

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

      private int id_ ;
      /**
       * <code>uint32 id = 13;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 13;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam> reformParamList_ =
        java.util.Collections.emptyList();
      private void ensureReformParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          reformParamList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam>(reformParamList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam, emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam.Builder, emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder> reformParamListBuilder_;

      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam> getReformParamListList() {
        if (reformParamListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(reformParamList_);
        } else {
          return reformParamListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public int getReformParamListCount() {
        if (reformParamListBuilder_ == null) {
          return reformParamList_.size();
        } else {
          return reformParamListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam getReformParamList(int index) {
        if (reformParamListBuilder_ == null) {
          return reformParamList_.get(index);
        } else {
          return reformParamListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public Builder setReformParamList(
          int index, emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam value) {
        if (reformParamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReformParamListIsMutable();
          reformParamList_.set(index, value);
          onChanged();
        } else {
          reformParamListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public Builder setReformParamList(
          int index, emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam.Builder builderForValue) {
        if (reformParamListBuilder_ == null) {
          ensureReformParamListIsMutable();
          reformParamList_.set(index, builderForValue.build());
          onChanged();
        } else {
          reformParamListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public Builder addReformParamList(emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam value) {
        if (reformParamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReformParamListIsMutable();
          reformParamList_.add(value);
          onChanged();
        } else {
          reformParamListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public Builder addReformParamList(
          int index, emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam value) {
        if (reformParamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReformParamListIsMutable();
          reformParamList_.add(index, value);
          onChanged();
        } else {
          reformParamListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public Builder addReformParamList(
          emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam.Builder builderForValue) {
        if (reformParamListBuilder_ == null) {
          ensureReformParamListIsMutable();
          reformParamList_.add(builderForValue.build());
          onChanged();
        } else {
          reformParamListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public Builder addReformParamList(
          int index, emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam.Builder builderForValue) {
        if (reformParamListBuilder_ == null) {
          ensureReformParamListIsMutable();
          reformParamList_.add(index, builderForValue.build());
          onChanged();
        } else {
          reformParamListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public Builder addAllReformParamList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam> values) {
        if (reformParamListBuilder_ == null) {
          ensureReformParamListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, reformParamList_);
          onChanged();
        } else {
          reformParamListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public Builder clearReformParamList() {
        if (reformParamListBuilder_ == null) {
          reformParamList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          reformParamListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public Builder removeReformParamList(int index) {
        if (reformParamListBuilder_ == null) {
          ensureReformParamListIsMutable();
          reformParamList_.remove(index);
          onChanged();
        } else {
          reformParamListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam.Builder getReformParamListBuilder(
          int index) {
        return getReformParamListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder getReformParamListOrBuilder(
          int index) {
        if (reformParamListBuilder_ == null) {
          return reformParamList_.get(index);  } else {
          return reformParamListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder> 
           getReformParamListOrBuilderList() {
        if (reformParamListBuilder_ != null) {
          return reformParamListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(reformParamList_);
        }
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam.Builder addReformParamListBuilder() {
        return getReformParamListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam.getDefaultInstance());
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam.Builder addReformParamListBuilder(
          int index) {
        return getReformParamListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam.getDefaultInstance());
      }
      /**
       * <code>repeated .FireworksReformParam reform_param_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam.Builder> 
           getReformParamListBuilderList() {
        return getReformParamListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam, emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam.Builder, emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder> 
          getReformParamListFieldBuilder() {
        if (reformParamListBuilder_ == null) {
          reformParamListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam, emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParam.Builder, emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.FireworksReformParamOrBuilder>(
                  reformParamList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          reformParamList_ = null;
        }
        return reformParamListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FireworksReformData)
    }

    // @@protoc_insertion_point(class_scope:FireworksReformData)
    private static final emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData();
    }

    public static emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FireworksReformData>
        PARSER = new com.google.protobuf.AbstractParser<FireworksReformData>() {
      @java.lang.Override
      public FireworksReformData parsePartialFrom(
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

    public static com.google.protobuf.Parser<FireworksReformData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FireworksReformData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.FireworksReformDataOuterClass.FireworksReformData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FireworksReformData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FireworksReformData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031FireworksReformData.proto\032\032FireworksRe" +
      "formParam.proto\"S\n\023FireworksReformData\022\n" +
      "\n\002id\030\r \001(\r\0220\n\021reform_param_list\030\n \003(\0132\025." +
      "FireworksReformParamB\036\n\034emu.grasscutter." +
      "net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.getDescriptor(),
        });
    internal_static_FireworksReformData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FireworksReformData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FireworksReformData_descriptor,
        new java.lang.String[] { "Id", "ReformParamList", });
    emu.grasscutter.net.oldproto.FireworksReformParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
