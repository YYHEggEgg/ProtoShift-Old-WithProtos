// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SummerTimeStageInfo.proto

package emu.grasscutter.net.oldproto;

public final class SummerTimeStageInfoOuterClass {
  private SummerTimeStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SummerTimeStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SummerTimeStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 13;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 open_time = 10;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>uint32 stage_id = 1;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * Protobuf type {@code SummerTimeStageInfo}
   */
  public static final class SummerTimeStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SummerTimeStageInfo)
      SummerTimeStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SummerTimeStageInfo.newBuilder() to construct.
    private SummerTimeStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SummerTimeStageInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SummerTimeStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.internal_static_SummerTimeStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.internal_static_SummerTimeStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo.class, emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo.Builder.class);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 13;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 13;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 10;
    private int openTime_;
    /**
     * <code>uint32 open_time = 10;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 1;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 1;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (stageId_ != 0) {
        output.writeUInt32(1, stageId_);
      }
      if (openTime_ != 0) {
        output.writeUInt32(10, openTime_);
      }
      if (isOpen_ != false) {
        output.writeBool(13, isOpen_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, stageId_);
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, openTime_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo other = (emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo prototype) {
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
     * Protobuf type {@code SummerTimeStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SummerTimeStageInfo)
        emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.internal_static_SummerTimeStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.internal_static_SummerTimeStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo.class, emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isOpen_ = false;

        openTime_ = 0;

        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.internal_static_SummerTimeStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo build() {
        emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo buildPartial() {
        emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo result = new emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo(this);
        result.isOpen_ = isOpen_;
        result.openTime_ = openTime_;
        result.stageId_ = stageId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo other) {
        if (other == emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
              case 8: {
                stageId_ = input.readUInt32();

                break;
              } // case 8
              case 80: {
                openTime_ = input.readUInt32();

                break;
              } // case 80
              case 104: {
                isOpen_ = input.readBool();

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

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 13;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 13;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 10;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 10;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 1;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 1;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SummerTimeStageInfo)
    }

    // @@protoc_insertion_point(class_scope:SummerTimeStageInfo)
    private static final emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo();
    }

    public static emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SummerTimeStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<SummerTimeStageInfo>() {
      @java.lang.Override
      public SummerTimeStageInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SummerTimeStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SummerTimeStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SummerTimeStageInfoOuterClass.SummerTimeStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SummerTimeStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SummerTimeStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031SummerTimeStageInfo.proto\"K\n\023SummerTim" +
      "eStageInfo\022\017\n\007is_open\030\r \001(\010\022\021\n\topen_time" +
      "\030\n \001(\r\022\020\n\010stage_id\030\001 \001(\rB\036\n\034emu.grasscut" +
      "ter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SummerTimeStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SummerTimeStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SummerTimeStageInfo_descriptor,
        new java.lang.String[] { "IsOpen", "OpenTime", "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
