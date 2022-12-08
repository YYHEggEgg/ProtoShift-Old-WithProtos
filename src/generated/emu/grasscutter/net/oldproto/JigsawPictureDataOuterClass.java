// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JigsawPictureData.proto

package emu.grasscutter.net.oldproto;

public final class JigsawPictureDataOuterClass {
  private JigsawPictureDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JigsawPictureDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JigsawPictureData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finished = 7;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 shortest_time = 10;</code>
     * @return The shortestTime.
     */
    int getShortestTime();

    /**
     * <code>bool is_open = 5;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 last_duration = 6;</code>
     * @return The lastDuration.
     */
    int getLastDuration();
  }
  /**
   * Protobuf type {@code JigsawPictureData}
   */
  public static final class JigsawPictureData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JigsawPictureData)
      JigsawPictureDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JigsawPictureData.newBuilder() to construct.
    private JigsawPictureData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JigsawPictureData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JigsawPictureData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData.class, emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData.Builder.class);
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 7;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 7;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int SHORTEST_TIME_FIELD_NUMBER = 10;
    private int shortestTime_;
    /**
     * <code>uint32 shortest_time = 10;</code>
     * @return The shortestTime.
     */
    @java.lang.Override
    public int getShortestTime() {
      return shortestTime_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 5;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 5;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int LAST_DURATION_FIELD_NUMBER = 6;
    private int lastDuration_;
    /**
     * <code>uint32 last_duration = 6;</code>
     * @return The lastDuration.
     */
    @java.lang.Override
    public int getLastDuration() {
      return lastDuration_;
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
      if (isOpen_ != false) {
        output.writeBool(5, isOpen_);
      }
      if (lastDuration_ != 0) {
        output.writeUInt32(6, lastDuration_);
      }
      if (isFinished_ != false) {
        output.writeBool(7, isFinished_);
      }
      if (shortestTime_ != 0) {
        output.writeUInt32(10, shortestTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isOpen_);
      }
      if (lastDuration_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, lastDuration_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isFinished_);
      }
      if (shortestTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, shortestTime_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData other = (emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData) obj;

      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getShortestTime()
          != other.getShortestTime()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getLastDuration()
          != other.getLastDuration()) return false;
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
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + SHORTEST_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getShortestTime();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + LAST_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getLastDuration();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData prototype) {
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
     * Protobuf type {@code JigsawPictureData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JigsawPictureData)
        emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData.class, emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isFinished_ = false;

        shortestTime_ = 0;

        isOpen_ = false;

        lastDuration_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.internal_static_JigsawPictureData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData build() {
        emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData buildPartial() {
        emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData result = new emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData(this);
        result.isFinished_ = isFinished_;
        result.shortestTime_ = shortestTime_;
        result.isOpen_ = isOpen_;
        result.lastDuration_ = lastDuration_;
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
        if (other instanceof emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData) {
          return mergeFrom((emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData other) {
        if (other == emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData.getDefaultInstance()) return this;
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getShortestTime() != 0) {
          setShortestTime(other.getShortestTime());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getLastDuration() != 0) {
          setLastDuration(other.getLastDuration());
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
              case 40: {
                isOpen_ = input.readBool();

                break;
              } // case 40
              case 48: {
                lastDuration_ = input.readUInt32();

                break;
              } // case 48
              case 56: {
                isFinished_ = input.readBool();

                break;
              } // case 56
              case 80: {
                shortestTime_ = input.readUInt32();

                break;
              } // case 80
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

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 7;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 7;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int shortestTime_ ;
      /**
       * <code>uint32 shortest_time = 10;</code>
       * @return The shortestTime.
       */
      @java.lang.Override
      public int getShortestTime() {
        return shortestTime_;
      }
      /**
       * <code>uint32 shortest_time = 10;</code>
       * @param value The shortestTime to set.
       * @return This builder for chaining.
       */
      public Builder setShortestTime(int value) {
        
        shortestTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 shortest_time = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearShortestTime() {
        
        shortestTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 5;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 5;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int lastDuration_ ;
      /**
       * <code>uint32 last_duration = 6;</code>
       * @return The lastDuration.
       */
      @java.lang.Override
      public int getLastDuration() {
        return lastDuration_;
      }
      /**
       * <code>uint32 last_duration = 6;</code>
       * @param value The lastDuration to set.
       * @return This builder for chaining.
       */
      public Builder setLastDuration(int value) {
        
        lastDuration_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 last_duration = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastDuration() {
        
        lastDuration_ = 0;
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


      // @@protoc_insertion_point(builder_scope:JigsawPictureData)
    }

    // @@protoc_insertion_point(class_scope:JigsawPictureData)
    private static final emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData();
    }

    public static emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JigsawPictureData>
        PARSER = new com.google.protobuf.AbstractParser<JigsawPictureData>() {
      @java.lang.Override
      public JigsawPictureData parsePartialFrom(
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

    public static com.google.protobuf.Parser<JigsawPictureData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JigsawPictureData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.JigsawPictureDataOuterClass.JigsawPictureData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JigsawPictureData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JigsawPictureData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027JigsawPictureData.proto\"g\n\021JigsawPictu" +
      "reData\022\023\n\013is_finished\030\007 \001(\010\022\025\n\rshortest_" +
      "time\030\n \001(\r\022\017\n\007is_open\030\005 \001(\010\022\025\n\rlast_dura" +
      "tion\030\006 \001(\rB\036\n\034emu.grasscutter.net.oldpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JigsawPictureData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JigsawPictureData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JigsawPictureData_descriptor,
        new java.lang.String[] { "IsFinished", "ShortestTime", "IsOpen", "LastDuration", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
