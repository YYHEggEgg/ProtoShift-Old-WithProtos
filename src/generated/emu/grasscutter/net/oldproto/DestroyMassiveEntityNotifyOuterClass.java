// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DestroyMassiveEntityNotify.proto

package emu.grasscutter.net.oldproto;

public final class DestroyMassiveEntityNotifyOuterClass {
  private DestroyMassiveEntityNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DestroyMassiveEntityNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DestroyMassiveEntityNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity> 
        getMassiveEntityListList();
    /**
     * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
     */
    emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity getMassiveEntityList(int index);
    /**
     * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
     */
    int getMassiveEntityListCount();
    /**
     * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntityOrBuilder> 
        getMassiveEntityListOrBuilderList();
    /**
     * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
     */
    emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntityOrBuilder getMassiveEntityListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 358
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code DestroyMassiveEntityNotify}
   */
  public static final class DestroyMassiveEntityNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DestroyMassiveEntityNotify)
      DestroyMassiveEntityNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DestroyMassiveEntityNotify.newBuilder() to construct.
    private DestroyMassiveEntityNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DestroyMassiveEntityNotify() {
      massiveEntityList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DestroyMassiveEntityNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.internal_static_DestroyMassiveEntityNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.internal_static_DestroyMassiveEntityNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify.class, emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify.Builder.class);
    }

    public static final int MASSIVE_ENTITY_LIST_FIELD_NUMBER = 7;
    private java.util.List<emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity> massiveEntityList_;
    /**
     * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity> getMassiveEntityListList() {
      return massiveEntityList_;
    }
    /**
     * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntityOrBuilder> 
        getMassiveEntityListOrBuilderList() {
      return massiveEntityList_;
    }
    /**
     * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
     */
    @java.lang.Override
    public int getMassiveEntityListCount() {
      return massiveEntityList_.size();
    }
    /**
     * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity getMassiveEntityList(int index) {
      return massiveEntityList_.get(index);
    }
    /**
     * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntityOrBuilder getMassiveEntityListOrBuilder(
        int index) {
      return massiveEntityList_.get(index);
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
      for (int i = 0; i < massiveEntityList_.size(); i++) {
        output.writeMessage(7, massiveEntityList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < massiveEntityList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, massiveEntityList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify other = (emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify) obj;

      if (!getMassiveEntityListList()
          .equals(other.getMassiveEntityListList())) return false;
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
      if (getMassiveEntityListCount() > 0) {
        hash = (37 * hash) + MASSIVE_ENTITY_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMassiveEntityListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify prototype) {
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
     * CmdId: 358
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code DestroyMassiveEntityNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DestroyMassiveEntityNotify)
        emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.internal_static_DestroyMassiveEntityNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.internal_static_DestroyMassiveEntityNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify.class, emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (massiveEntityListBuilder_ == null) {
          massiveEntityList_ = java.util.Collections.emptyList();
        } else {
          massiveEntityList_ = null;
          massiveEntityListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.internal_static_DestroyMassiveEntityNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify build() {
        emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify buildPartial() {
        emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify result = new emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify(this);
        int from_bitField0_ = bitField0_;
        if (massiveEntityListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            massiveEntityList_ = java.util.Collections.unmodifiableList(massiveEntityList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.massiveEntityList_ = massiveEntityList_;
        } else {
          result.massiveEntityList_ = massiveEntityListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify other) {
        if (other == emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify.getDefaultInstance()) return this;
        if (massiveEntityListBuilder_ == null) {
          if (!other.massiveEntityList_.isEmpty()) {
            if (massiveEntityList_.isEmpty()) {
              massiveEntityList_ = other.massiveEntityList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMassiveEntityListIsMutable();
              massiveEntityList_.addAll(other.massiveEntityList_);
            }
            onChanged();
          }
        } else {
          if (!other.massiveEntityList_.isEmpty()) {
            if (massiveEntityListBuilder_.isEmpty()) {
              massiveEntityListBuilder_.dispose();
              massiveEntityListBuilder_ = null;
              massiveEntityList_ = other.massiveEntityList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              massiveEntityListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMassiveEntityListFieldBuilder() : null;
            } else {
              massiveEntityListBuilder_.addAllMessages(other.massiveEntityList_);
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
              case 58: {
                emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity.parser(),
                        extensionRegistry);
                if (massiveEntityListBuilder_ == null) {
                  ensureMassiveEntityListIsMutable();
                  massiveEntityList_.add(m);
                } else {
                  massiveEntityListBuilder_.addMessage(m);
                }
                break;
              } // case 58
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

      private java.util.List<emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity> massiveEntityList_ =
        java.util.Collections.emptyList();
      private void ensureMassiveEntityListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          massiveEntityList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity>(massiveEntityList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity, emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity.Builder, emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntityOrBuilder> massiveEntityListBuilder_;

      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity> getMassiveEntityListList() {
        if (massiveEntityListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(massiveEntityList_);
        } else {
          return massiveEntityListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public int getMassiveEntityListCount() {
        if (massiveEntityListBuilder_ == null) {
          return massiveEntityList_.size();
        } else {
          return massiveEntityListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity getMassiveEntityList(int index) {
        if (massiveEntityListBuilder_ == null) {
          return massiveEntityList_.get(index);
        } else {
          return massiveEntityListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public Builder setMassiveEntityList(
          int index, emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity value) {
        if (massiveEntityListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMassiveEntityListIsMutable();
          massiveEntityList_.set(index, value);
          onChanged();
        } else {
          massiveEntityListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public Builder setMassiveEntityList(
          int index, emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity.Builder builderForValue) {
        if (massiveEntityListBuilder_ == null) {
          ensureMassiveEntityListIsMutable();
          massiveEntityList_.set(index, builderForValue.build());
          onChanged();
        } else {
          massiveEntityListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public Builder addMassiveEntityList(emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity value) {
        if (massiveEntityListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMassiveEntityListIsMutable();
          massiveEntityList_.add(value);
          onChanged();
        } else {
          massiveEntityListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public Builder addMassiveEntityList(
          int index, emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity value) {
        if (massiveEntityListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMassiveEntityListIsMutable();
          massiveEntityList_.add(index, value);
          onChanged();
        } else {
          massiveEntityListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public Builder addMassiveEntityList(
          emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity.Builder builderForValue) {
        if (massiveEntityListBuilder_ == null) {
          ensureMassiveEntityListIsMutable();
          massiveEntityList_.add(builderForValue.build());
          onChanged();
        } else {
          massiveEntityListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public Builder addMassiveEntityList(
          int index, emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity.Builder builderForValue) {
        if (massiveEntityListBuilder_ == null) {
          ensureMassiveEntityListIsMutable();
          massiveEntityList_.add(index, builderForValue.build());
          onChanged();
        } else {
          massiveEntityListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public Builder addAllMassiveEntityList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity> values) {
        if (massiveEntityListBuilder_ == null) {
          ensureMassiveEntityListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, massiveEntityList_);
          onChanged();
        } else {
          massiveEntityListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public Builder clearMassiveEntityList() {
        if (massiveEntityListBuilder_ == null) {
          massiveEntityList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          massiveEntityListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public Builder removeMassiveEntityList(int index) {
        if (massiveEntityListBuilder_ == null) {
          ensureMassiveEntityListIsMutable();
          massiveEntityList_.remove(index);
          onChanged();
        } else {
          massiveEntityListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity.Builder getMassiveEntityListBuilder(
          int index) {
        return getMassiveEntityListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntityOrBuilder getMassiveEntityListOrBuilder(
          int index) {
        if (massiveEntityListBuilder_ == null) {
          return massiveEntityList_.get(index);  } else {
          return massiveEntityListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntityOrBuilder> 
           getMassiveEntityListOrBuilderList() {
        if (massiveEntityListBuilder_ != null) {
          return massiveEntityListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(massiveEntityList_);
        }
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity.Builder addMassiveEntityListBuilder() {
        return getMassiveEntityListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity.getDefaultInstance());
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity.Builder addMassiveEntityListBuilder(
          int index) {
        return getMassiveEntityListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity.getDefaultInstance());
      }
      /**
       * <code>repeated .ClientMassiveEntity massive_entity_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity.Builder> 
           getMassiveEntityListBuilderList() {
        return getMassiveEntityListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity, emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity.Builder, emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntityOrBuilder> 
          getMassiveEntityListFieldBuilder() {
        if (massiveEntityListBuilder_ == null) {
          massiveEntityListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity, emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntity.Builder, emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.ClientMassiveEntityOrBuilder>(
                  massiveEntityList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          massiveEntityList_ = null;
        }
        return massiveEntityListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DestroyMassiveEntityNotify)
    }

    // @@protoc_insertion_point(class_scope:DestroyMassiveEntityNotify)
    private static final emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify();
    }

    public static emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DestroyMassiveEntityNotify>
        PARSER = new com.google.protobuf.AbstractParser<DestroyMassiveEntityNotify>() {
      @java.lang.Override
      public DestroyMassiveEntityNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<DestroyMassiveEntityNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DestroyMassiveEntityNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.DestroyMassiveEntityNotifyOuterClass.DestroyMassiveEntityNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DestroyMassiveEntityNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DestroyMassiveEntityNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n DestroyMassiveEntityNotify.proto\032\031Clie" +
      "ntMassiveEntity.proto\"O\n\032DestroyMassiveE" +
      "ntityNotify\0221\n\023massive_entity_list\030\007 \003(\013" +
      "2\024.ClientMassiveEntityB\036\n\034emu.grasscutte" +
      "r.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.getDescriptor(),
        });
    internal_static_DestroyMassiveEntityNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DestroyMassiveEntityNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DestroyMassiveEntityNotify_descriptor,
        new java.lang.String[] { "MassiveEntityList", });
    emu.grasscutter.net.oldproto.ClientMassiveEntityOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
