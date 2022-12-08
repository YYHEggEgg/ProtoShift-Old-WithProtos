// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WorldOwnerDailyTaskNotify.proto

package emu.grasscutter.net.oldproto;

public final class WorldOwnerDailyTaskNotifyOuterClass {
  private WorldOwnerDailyTaskNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorldOwnerDailyTaskNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorldOwnerDailyTaskNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 filter_city_id = 2;</code>
     * @return The filterCityId.
     */
    int getFilterCityId();

    /**
     * <code>repeated .DailyTaskInfo task_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo> 
        getTaskListList();
    /**
     * <code>repeated .DailyTaskInfo task_list = 1;</code>
     */
    emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo getTaskList(int index);
    /**
     * <code>repeated .DailyTaskInfo task_list = 1;</code>
     */
    int getTaskListCount();
    /**
     * <code>repeated .DailyTaskInfo task_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder> 
        getTaskListOrBuilderList();
    /**
     * <code>repeated .DailyTaskInfo task_list = 1;</code>
     */
    emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder getTaskListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 102
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code WorldOwnerDailyTaskNotify}
   */
  public static final class WorldOwnerDailyTaskNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WorldOwnerDailyTaskNotify)
      WorldOwnerDailyTaskNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WorldOwnerDailyTaskNotify.newBuilder() to construct.
    private WorldOwnerDailyTaskNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WorldOwnerDailyTaskNotify() {
      taskList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WorldOwnerDailyTaskNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.internal_static_WorldOwnerDailyTaskNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.internal_static_WorldOwnerDailyTaskNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify.class, emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify.Builder.class);
    }

    public static final int FILTER_CITY_ID_FIELD_NUMBER = 2;
    private int filterCityId_;
    /**
     * <code>uint32 filter_city_id = 2;</code>
     * @return The filterCityId.
     */
    @java.lang.Override
    public int getFilterCityId() {
      return filterCityId_;
    }

    public static final int TASK_LIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo> taskList_;
    /**
     * <code>repeated .DailyTaskInfo task_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo> getTaskListList() {
      return taskList_;
    }
    /**
     * <code>repeated .DailyTaskInfo task_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder> 
        getTaskListOrBuilderList() {
      return taskList_;
    }
    /**
     * <code>repeated .DailyTaskInfo task_list = 1;</code>
     */
    @java.lang.Override
    public int getTaskListCount() {
      return taskList_.size();
    }
    /**
     * <code>repeated .DailyTaskInfo task_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo getTaskList(int index) {
      return taskList_.get(index);
    }
    /**
     * <code>repeated .DailyTaskInfo task_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder getTaskListOrBuilder(
        int index) {
      return taskList_.get(index);
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
      for (int i = 0; i < taskList_.size(); i++) {
        output.writeMessage(1, taskList_.get(i));
      }
      if (filterCityId_ != 0) {
        output.writeUInt32(2, filterCityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < taskList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, taskList_.get(i));
      }
      if (filterCityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, filterCityId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify other = (emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify) obj;

      if (getFilterCityId()
          != other.getFilterCityId()) return false;
      if (!getTaskListList()
          .equals(other.getTaskListList())) return false;
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
      hash = (37 * hash) + FILTER_CITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFilterCityId();
      if (getTaskListCount() > 0) {
        hash = (37 * hash) + TASK_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTaskListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify prototype) {
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
     * CmdId: 102
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code WorldOwnerDailyTaskNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorldOwnerDailyTaskNotify)
        emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.internal_static_WorldOwnerDailyTaskNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.internal_static_WorldOwnerDailyTaskNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify.class, emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        filterCityId_ = 0;

        if (taskListBuilder_ == null) {
          taskList_ = java.util.Collections.emptyList();
        } else {
          taskList_ = null;
          taskListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.internal_static_WorldOwnerDailyTaskNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify build() {
        emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify buildPartial() {
        emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify result = new emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify(this);
        int from_bitField0_ = bitField0_;
        result.filterCityId_ = filterCityId_;
        if (taskListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            taskList_ = java.util.Collections.unmodifiableList(taskList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.taskList_ = taskList_;
        } else {
          result.taskList_ = taskListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify other) {
        if (other == emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify.getDefaultInstance()) return this;
        if (other.getFilterCityId() != 0) {
          setFilterCityId(other.getFilterCityId());
        }
        if (taskListBuilder_ == null) {
          if (!other.taskList_.isEmpty()) {
            if (taskList_.isEmpty()) {
              taskList_ = other.taskList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTaskListIsMutable();
              taskList_.addAll(other.taskList_);
            }
            onChanged();
          }
        } else {
          if (!other.taskList_.isEmpty()) {
            if (taskListBuilder_.isEmpty()) {
              taskListBuilder_.dispose();
              taskListBuilder_ = null;
              taskList_ = other.taskList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              taskListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTaskListFieldBuilder() : null;
            } else {
              taskListBuilder_.addAllMessages(other.taskList_);
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
              case 10: {
                emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo.parser(),
                        extensionRegistry);
                if (taskListBuilder_ == null) {
                  ensureTaskListIsMutable();
                  taskList_.add(m);
                } else {
                  taskListBuilder_.addMessage(m);
                }
                break;
              } // case 10
              case 16: {
                filterCityId_ = input.readUInt32();

                break;
              } // case 16
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

      private int filterCityId_ ;
      /**
       * <code>uint32 filter_city_id = 2;</code>
       * @return The filterCityId.
       */
      @java.lang.Override
      public int getFilterCityId() {
        return filterCityId_;
      }
      /**
       * <code>uint32 filter_city_id = 2;</code>
       * @param value The filterCityId to set.
       * @return This builder for chaining.
       */
      public Builder setFilterCityId(int value) {
        
        filterCityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 filter_city_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFilterCityId() {
        
        filterCityId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo> taskList_ =
        java.util.Collections.emptyList();
      private void ensureTaskListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          taskList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo>(taskList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo, emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder, emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder> taskListBuilder_;

      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo> getTaskListList() {
        if (taskListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(taskList_);
        } else {
          return taskListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public int getTaskListCount() {
        if (taskListBuilder_ == null) {
          return taskList_.size();
        } else {
          return taskListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo getTaskList(int index) {
        if (taskListBuilder_ == null) {
          return taskList_.get(index);
        } else {
          return taskListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public Builder setTaskList(
          int index, emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo value) {
        if (taskListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTaskListIsMutable();
          taskList_.set(index, value);
          onChanged();
        } else {
          taskListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public Builder setTaskList(
          int index, emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder builderForValue) {
        if (taskListBuilder_ == null) {
          ensureTaskListIsMutable();
          taskList_.set(index, builderForValue.build());
          onChanged();
        } else {
          taskListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public Builder addTaskList(emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo value) {
        if (taskListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTaskListIsMutable();
          taskList_.add(value);
          onChanged();
        } else {
          taskListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public Builder addTaskList(
          int index, emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo value) {
        if (taskListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTaskListIsMutable();
          taskList_.add(index, value);
          onChanged();
        } else {
          taskListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public Builder addTaskList(
          emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder builderForValue) {
        if (taskListBuilder_ == null) {
          ensureTaskListIsMutable();
          taskList_.add(builderForValue.build());
          onChanged();
        } else {
          taskListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public Builder addTaskList(
          int index, emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder builderForValue) {
        if (taskListBuilder_ == null) {
          ensureTaskListIsMutable();
          taskList_.add(index, builderForValue.build());
          onChanged();
        } else {
          taskListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public Builder addAllTaskList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo> values) {
        if (taskListBuilder_ == null) {
          ensureTaskListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, taskList_);
          onChanged();
        } else {
          taskListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public Builder clearTaskList() {
        if (taskListBuilder_ == null) {
          taskList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          taskListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public Builder removeTaskList(int index) {
        if (taskListBuilder_ == null) {
          ensureTaskListIsMutable();
          taskList_.remove(index);
          onChanged();
        } else {
          taskListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder getTaskListBuilder(
          int index) {
        return getTaskListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder getTaskListOrBuilder(
          int index) {
        if (taskListBuilder_ == null) {
          return taskList_.get(index);  } else {
          return taskListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder> 
           getTaskListOrBuilderList() {
        if (taskListBuilder_ != null) {
          return taskListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(taskList_);
        }
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder addTaskListBuilder() {
        return getTaskListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder addTaskListBuilder(
          int index) {
        return getTaskListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder> 
           getTaskListBuilderList() {
        return getTaskListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo, emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder, emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder> 
          getTaskListFieldBuilder() {
        if (taskListBuilder_ == null) {
          taskListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo, emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder, emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder>(
                  taskList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          taskList_ = null;
        }
        return taskListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:WorldOwnerDailyTaskNotify)
    }

    // @@protoc_insertion_point(class_scope:WorldOwnerDailyTaskNotify)
    private static final emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify();
    }

    public static emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorldOwnerDailyTaskNotify>
        PARSER = new com.google.protobuf.AbstractParser<WorldOwnerDailyTaskNotify>() {
      @java.lang.Override
      public WorldOwnerDailyTaskNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<WorldOwnerDailyTaskNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WorldOwnerDailyTaskNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldOwnerDailyTaskNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldOwnerDailyTaskNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037WorldOwnerDailyTaskNotify.proto\032\023Daily" +
      "TaskInfo.proto\"V\n\031WorldOwnerDailyTaskNot" +
      "ify\022\026\n\016filter_city_id\030\002 \001(\r\022!\n\ttask_list" +
      "\030\001 \003(\0132\016.DailyTaskInfoB\036\n\034emu.grasscutte" +
      "r.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.getDescriptor(),
        });
    internal_static_WorldOwnerDailyTaskNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorldOwnerDailyTaskNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldOwnerDailyTaskNotify_descriptor,
        new java.lang.String[] { "FilterCityId", "TaskList", });
    emu.grasscutter.net.oldproto.DailyTaskInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
