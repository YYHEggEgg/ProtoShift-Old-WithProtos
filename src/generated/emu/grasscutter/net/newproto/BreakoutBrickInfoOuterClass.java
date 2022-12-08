// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BreakoutBrickInfo.proto

package emu.grasscutter.net.newproto;

public final class BreakoutBrickInfoOuterClass {
  private BreakoutBrickInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BreakoutBrickInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BreakoutBrickInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 hp = 1;</code>
     * @return The hp.
     */
    int getHp();

    /**
     * <code>uint32 element_type = 2;</code>
     * @return The elementType.
     */
    int getElementType();
  }
  /**
   * Protobuf type {@code BreakoutBrickInfo}
   */
  public static final class BreakoutBrickInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BreakoutBrickInfo)
      BreakoutBrickInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BreakoutBrickInfo.newBuilder() to construct.
    private BreakoutBrickInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BreakoutBrickInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BreakoutBrickInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.internal_static_BreakoutBrickInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.internal_static_BreakoutBrickInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo.class, emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo.Builder.class);
    }

    public static final int HP_FIELD_NUMBER = 1;
    private int hp_;
    /**
     * <code>uint32 hp = 1;</code>
     * @return The hp.
     */
    @java.lang.Override
    public int getHp() {
      return hp_;
    }

    public static final int ELEMENT_TYPE_FIELD_NUMBER = 2;
    private int elementType_;
    /**
     * <code>uint32 element_type = 2;</code>
     * @return The elementType.
     */
    @java.lang.Override
    public int getElementType() {
      return elementType_;
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
      if (hp_ != 0) {
        output.writeUInt32(1, hp_);
      }
      if (elementType_ != 0) {
        output.writeUInt32(2, elementType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, hp_);
      }
      if (elementType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, elementType_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo other = (emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo) obj;

      if (getHp()
          != other.getHp()) return false;
      if (getElementType()
          != other.getElementType()) return false;
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
      hash = (37 * hash) + HP_FIELD_NUMBER;
      hash = (53 * hash) + getHp();
      hash = (37 * hash) + ELEMENT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getElementType();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo prototype) {
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
     * Protobuf type {@code BreakoutBrickInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BreakoutBrickInfo)
        emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.internal_static_BreakoutBrickInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.internal_static_BreakoutBrickInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo.class, emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        hp_ = 0;

        elementType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.internal_static_BreakoutBrickInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo build() {
        emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo buildPartial() {
        emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo result = new emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo(this);
        result.hp_ = hp_;
        result.elementType_ = elementType_;
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
        if (other instanceof emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo other) {
        if (other == emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo.getDefaultInstance()) return this;
        if (other.getHp() != 0) {
          setHp(other.getHp());
        }
        if (other.getElementType() != 0) {
          setElementType(other.getElementType());
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
                hp_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                elementType_ = input.readUInt32();

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

      private int hp_ ;
      /**
       * <code>uint32 hp = 1;</code>
       * @return The hp.
       */
      @java.lang.Override
      public int getHp() {
        return hp_;
      }
      /**
       * <code>uint32 hp = 1;</code>
       * @param value The hp to set.
       * @return This builder for chaining.
       */
      public Builder setHp(int value) {
        
        hp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hp = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearHp() {
        
        hp_ = 0;
        onChanged();
        return this;
      }

      private int elementType_ ;
      /**
       * <code>uint32 element_type = 2;</code>
       * @return The elementType.
       */
      @java.lang.Override
      public int getElementType() {
        return elementType_;
      }
      /**
       * <code>uint32 element_type = 2;</code>
       * @param value The elementType to set.
       * @return This builder for chaining.
       */
      public Builder setElementType(int value) {
        
        elementType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 element_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementType() {
        
        elementType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BreakoutBrickInfo)
    }

    // @@protoc_insertion_point(class_scope:BreakoutBrickInfo)
    private static final emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo();
    }

    public static emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BreakoutBrickInfo>
        PARSER = new com.google.protobuf.AbstractParser<BreakoutBrickInfo>() {
      @java.lang.Override
      public BreakoutBrickInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<BreakoutBrickInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BreakoutBrickInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.BreakoutBrickInfoOuterClass.BreakoutBrickInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BreakoutBrickInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BreakoutBrickInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027BreakoutBrickInfo.proto\"5\n\021BreakoutBri" +
      "ckInfo\022\n\n\002hp\030\001 \001(\r\022\024\n\014element_type\030\002 \001(\r" +
      "B\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BreakoutBrickInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BreakoutBrickInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BreakoutBrickInfo_descriptor,
        new java.lang.String[] { "Hp", "ElementType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
