// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FurnitureMakeMakeInfo.proto

package emu.grasscutter.net.newproto;

public final class FurnitureMakeMakeInfoOuterClass {
  private FurnitureMakeMakeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FurnitureMakeMakeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FurnitureMakeMakeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 furniture_id = 14;</code>
     * @return The furnitureId.
     */
    int getFurnitureId();

    /**
     * <code>uint32 make_count = 13;</code>
     * @return The makeCount.
     */
    int getMakeCount();
  }
  /**
   * Protobuf type {@code FurnitureMakeMakeInfo}
   */
  public static final class FurnitureMakeMakeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FurnitureMakeMakeInfo)
      FurnitureMakeMakeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FurnitureMakeMakeInfo.newBuilder() to construct.
    private FurnitureMakeMakeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FurnitureMakeMakeInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FurnitureMakeMakeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.class, emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.Builder.class);
    }

    public static final int FURNITURE_ID_FIELD_NUMBER = 14;
    private int furnitureId_;
    /**
     * <code>uint32 furniture_id = 14;</code>
     * @return The furnitureId.
     */
    @java.lang.Override
    public int getFurnitureId() {
      return furnitureId_;
    }

    public static final int MAKE_COUNT_FIELD_NUMBER = 13;
    private int makeCount_;
    /**
     * <code>uint32 make_count = 13;</code>
     * @return The makeCount.
     */
    @java.lang.Override
    public int getMakeCount() {
      return makeCount_;
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
      if (makeCount_ != 0) {
        output.writeUInt32(13, makeCount_);
      }
      if (furnitureId_ != 0) {
        output.writeUInt32(14, furnitureId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (makeCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, makeCount_);
      }
      if (furnitureId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, furnitureId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo other = (emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo) obj;

      if (getFurnitureId()
          != other.getFurnitureId()) return false;
      if (getMakeCount()
          != other.getMakeCount()) return false;
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
      hash = (37 * hash) + FURNITURE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFurnitureId();
      hash = (37 * hash) + MAKE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMakeCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo prototype) {
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
     * Protobuf type {@code FurnitureMakeMakeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FurnitureMakeMakeInfo)
        emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.class, emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        furnitureId_ = 0;

        makeCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo build() {
        emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo buildPartial() {
        emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo result = new emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo(this);
        result.furnitureId_ = furnitureId_;
        result.makeCount_ = makeCount_;
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
        if (other instanceof emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo other) {
        if (other == emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo.getDefaultInstance()) return this;
        if (other.getFurnitureId() != 0) {
          setFurnitureId(other.getFurnitureId());
        }
        if (other.getMakeCount() != 0) {
          setMakeCount(other.getMakeCount());
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
              case 104: {
                makeCount_ = input.readUInt32();

                break;
              } // case 104
              case 112: {
                furnitureId_ = input.readUInt32();

                break;
              } // case 112
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

      private int furnitureId_ ;
      /**
       * <code>uint32 furniture_id = 14;</code>
       * @return The furnitureId.
       */
      @java.lang.Override
      public int getFurnitureId() {
        return furnitureId_;
      }
      /**
       * <code>uint32 furniture_id = 14;</code>
       * @param value The furnitureId to set.
       * @return This builder for chaining.
       */
      public Builder setFurnitureId(int value) {
        
        furnitureId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 furniture_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearFurnitureId() {
        
        furnitureId_ = 0;
        onChanged();
        return this;
      }

      private int makeCount_ ;
      /**
       * <code>uint32 make_count = 13;</code>
       * @return The makeCount.
       */
      @java.lang.Override
      public int getMakeCount() {
        return makeCount_;
      }
      /**
       * <code>uint32 make_count = 13;</code>
       * @param value The makeCount to set.
       * @return This builder for chaining.
       */
      public Builder setMakeCount(int value) {
        
        makeCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 make_count = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMakeCount() {
        
        makeCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FurnitureMakeMakeInfo)
    }

    // @@protoc_insertion_point(class_scope:FurnitureMakeMakeInfo)
    private static final emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo();
    }

    public static emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FurnitureMakeMakeInfo>
        PARSER = new com.google.protobuf.AbstractParser<FurnitureMakeMakeInfo>() {
      @java.lang.Override
      public FurnitureMakeMakeInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<FurnitureMakeMakeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FurnitureMakeMakeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.FurnitureMakeMakeInfoOuterClass.FurnitureMakeMakeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FurnitureMakeMakeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FurnitureMakeMakeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033FurnitureMakeMakeInfo.proto\"A\n\025Furnitu" +
      "reMakeMakeInfo\022\024\n\014furniture_id\030\016 \001(\r\022\022\n\n" +
      "make_count\030\r \001(\rB\036\n\034emu.grasscutter.net." +
      "newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FurnitureMakeMakeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FurnitureMakeMakeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FurnitureMakeMakeInfo_descriptor,
        new java.lang.String[] { "FurnitureId", "MakeCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
