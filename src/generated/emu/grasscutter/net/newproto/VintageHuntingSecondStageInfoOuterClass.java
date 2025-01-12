// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageHuntingSecondStageInfo.proto

package emu.grasscutter.net.newproto;

public final class VintageHuntingSecondStageInfoOuterClass {
  private VintageHuntingSecondStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageHuntingSecondStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageHuntingSecondStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 left_num = 15;</code>
     * @return The leftNum.
     */
    int getLeftNum();

    /**
     * <code>uint32 total_num = 13;</code>
     * @return The totalNum.
     */
    int getTotalNum();

    /**
     * <code>uint32 capture_animal_num = 10;</code>
     * @return The captureAnimalNum.
     */
    int getCaptureAnimalNum();
  }
  /**
   * Protobuf type {@code VintageHuntingSecondStageInfo}
   */
  public static final class VintageHuntingSecondStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageHuntingSecondStageInfo)
      VintageHuntingSecondStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageHuntingSecondStageInfo.newBuilder() to construct.
    private VintageHuntingSecondStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageHuntingSecondStageInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageHuntingSecondStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.internal_static_VintageHuntingSecondStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.internal_static_VintageHuntingSecondStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo.class, emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo.Builder.class);
    }

    public static final int LEFT_NUM_FIELD_NUMBER = 15;
    private int leftNum_;
    /**
     * <code>uint32 left_num = 15;</code>
     * @return The leftNum.
     */
    @java.lang.Override
    public int getLeftNum() {
      return leftNum_;
    }

    public static final int TOTAL_NUM_FIELD_NUMBER = 13;
    private int totalNum_;
    /**
     * <code>uint32 total_num = 13;</code>
     * @return The totalNum.
     */
    @java.lang.Override
    public int getTotalNum() {
      return totalNum_;
    }

    public static final int CAPTURE_ANIMAL_NUM_FIELD_NUMBER = 10;
    private int captureAnimalNum_;
    /**
     * <code>uint32 capture_animal_num = 10;</code>
     * @return The captureAnimalNum.
     */
    @java.lang.Override
    public int getCaptureAnimalNum() {
      return captureAnimalNum_;
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
      if (captureAnimalNum_ != 0) {
        output.writeUInt32(10, captureAnimalNum_);
      }
      if (totalNum_ != 0) {
        output.writeUInt32(13, totalNum_);
      }
      if (leftNum_ != 0) {
        output.writeUInt32(15, leftNum_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (captureAnimalNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, captureAnimalNum_);
      }
      if (totalNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, totalNum_);
      }
      if (leftNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, leftNum_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo other = (emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo) obj;

      if (getLeftNum()
          != other.getLeftNum()) return false;
      if (getTotalNum()
          != other.getTotalNum()) return false;
      if (getCaptureAnimalNum()
          != other.getCaptureAnimalNum()) return false;
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
      hash = (37 * hash) + LEFT_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getLeftNum();
      hash = (37 * hash) + TOTAL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getTotalNum();
      hash = (37 * hash) + CAPTURE_ANIMAL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getCaptureAnimalNum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo prototype) {
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
     * Protobuf type {@code VintageHuntingSecondStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageHuntingSecondStageInfo)
        emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.internal_static_VintageHuntingSecondStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.internal_static_VintageHuntingSecondStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo.class, emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        leftNum_ = 0;

        totalNum_ = 0;

        captureAnimalNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.internal_static_VintageHuntingSecondStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo build() {
        emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo buildPartial() {
        emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo result = new emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo(this);
        result.leftNum_ = leftNum_;
        result.totalNum_ = totalNum_;
        result.captureAnimalNum_ = captureAnimalNum_;
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
        if (other instanceof emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo other) {
        if (other == emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo.getDefaultInstance()) return this;
        if (other.getLeftNum() != 0) {
          setLeftNum(other.getLeftNum());
        }
        if (other.getTotalNum() != 0) {
          setTotalNum(other.getTotalNum());
        }
        if (other.getCaptureAnimalNum() != 0) {
          setCaptureAnimalNum(other.getCaptureAnimalNum());
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
              case 80: {
                captureAnimalNum_ = input.readUInt32();

                break;
              } // case 80
              case 104: {
                totalNum_ = input.readUInt32();

                break;
              } // case 104
              case 120: {
                leftNum_ = input.readUInt32();

                break;
              } // case 120
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

      private int leftNum_ ;
      /**
       * <code>uint32 left_num = 15;</code>
       * @return The leftNum.
       */
      @java.lang.Override
      public int getLeftNum() {
        return leftNum_;
      }
      /**
       * <code>uint32 left_num = 15;</code>
       * @param value The leftNum to set.
       * @return This builder for chaining.
       */
      public Builder setLeftNum(int value) {
        
        leftNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 left_num = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearLeftNum() {
        
        leftNum_ = 0;
        onChanged();
        return this;
      }

      private int totalNum_ ;
      /**
       * <code>uint32 total_num = 13;</code>
       * @return The totalNum.
       */
      @java.lang.Override
      public int getTotalNum() {
        return totalNum_;
      }
      /**
       * <code>uint32 total_num = 13;</code>
       * @param value The totalNum to set.
       * @return This builder for chaining.
       */
      public Builder setTotalNum(int value) {
        
        totalNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_num = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalNum() {
        
        totalNum_ = 0;
        onChanged();
        return this;
      }

      private int captureAnimalNum_ ;
      /**
       * <code>uint32 capture_animal_num = 10;</code>
       * @return The captureAnimalNum.
       */
      @java.lang.Override
      public int getCaptureAnimalNum() {
        return captureAnimalNum_;
      }
      /**
       * <code>uint32 capture_animal_num = 10;</code>
       * @param value The captureAnimalNum to set.
       * @return This builder for chaining.
       */
      public Builder setCaptureAnimalNum(int value) {
        
        captureAnimalNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 capture_animal_num = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCaptureAnimalNum() {
        
        captureAnimalNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:VintageHuntingSecondStageInfo)
    }

    // @@protoc_insertion_point(class_scope:VintageHuntingSecondStageInfo)
    private static final emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo();
    }

    public static emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageHuntingSecondStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<VintageHuntingSecondStageInfo>() {
      @java.lang.Override
      public VintageHuntingSecondStageInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<VintageHuntingSecondStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageHuntingSecondStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.VintageHuntingSecondStageInfoOuterClass.VintageHuntingSecondStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageHuntingSecondStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageHuntingSecondStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#VintageHuntingSecondStageInfo.proto\"`\n" +
      "\035VintageHuntingSecondStageInfo\022\020\n\010left_n" +
      "um\030\017 \001(\r\022\021\n\ttotal_num\030\r \001(\r\022\032\n\022capture_a" +
      "nimal_num\030\n \001(\rB\036\n\034emu.grasscutter.net.n" +
      "ewprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageHuntingSecondStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageHuntingSecondStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageHuntingSecondStageInfo_descriptor,
        new java.lang.String[] { "LeftNum", "TotalNum", "CaptureAnimalNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
