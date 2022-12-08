// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestGlobalVar.proto

package emu.grasscutter.net.oldproto;

public final class QuestGlobalVarOuterClass {
  private QuestGlobalVarOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestGlobalVarOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestGlobalVar)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 value = 8;</code>
     * @return The value.
     */
    int getValue();

    /**
     * <code>uint32 key = 4;</code>
     * @return The key.
     */
    int getKey();
  }
  /**
   * Protobuf type {@code QuestGlobalVar}
   */
  public static final class QuestGlobalVar extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestGlobalVar)
      QuestGlobalVarOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestGlobalVar.newBuilder() to construct.
    private QuestGlobalVar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestGlobalVar() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestGlobalVar();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.internal_static_QuestGlobalVar_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.internal_static_QuestGlobalVar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar.class, emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 8;
    private int value_;
    /**
     * <code>int32 value = 8;</code>
     * @return The value.
     */
    @java.lang.Override
    public int getValue() {
      return value_;
    }

    public static final int KEY_FIELD_NUMBER = 4;
    private int key_;
    /**
     * <code>uint32 key = 4;</code>
     * @return The key.
     */
    @java.lang.Override
    public int getKey() {
      return key_;
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
      if (key_ != 0) {
        output.writeUInt32(4, key_);
      }
      if (value_ != 0) {
        output.writeInt32(8, value_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (key_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, key_);
      }
      if (value_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, value_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar other = (emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar) obj;

      if (getValue()
          != other.getValue()) return false;
      if (getKey()
          != other.getKey()) return false;
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
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue();
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar prototype) {
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
     * Protobuf type {@code QuestGlobalVar}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestGlobalVar)
        emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVarOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.internal_static_QuestGlobalVar_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.internal_static_QuestGlobalVar_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar.class, emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        value_ = 0;

        key_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.internal_static_QuestGlobalVar_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar build() {
        emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar buildPartial() {
        emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar result = new emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar(this);
        result.value_ = value_;
        result.key_ = key_;
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
        if (other instanceof emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar) {
          return mergeFrom((emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar other) {
        if (other == emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar.getDefaultInstance()) return this;
        if (other.getValue() != 0) {
          setValue(other.getValue());
        }
        if (other.getKey() != 0) {
          setKey(other.getKey());
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
              case 32: {
                key_ = input.readUInt32();

                break;
              } // case 32
              case 64: {
                value_ = input.readInt32();

                break;
              } // case 64
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

      private int value_ ;
      /**
       * <code>int32 value = 8;</code>
       * @return The value.
       */
      @java.lang.Override
      public int getValue() {
        return value_;
      }
      /**
       * <code>int32 value = 8;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(int value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 value = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        
        value_ = 0;
        onChanged();
        return this;
      }

      private int key_ ;
      /**
       * <code>uint32 key = 4;</code>
       * @return The key.
       */
      @java.lang.Override
      public int getKey() {
        return key_;
      }
      /**
       * <code>uint32 key = 4;</code>
       * @param value The key to set.
       * @return This builder for chaining.
       */
      public Builder setKey(int value) {
        
        key_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 key = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearKey() {
        
        key_ = 0;
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


      // @@protoc_insertion_point(builder_scope:QuestGlobalVar)
    }

    // @@protoc_insertion_point(class_scope:QuestGlobalVar)
    private static final emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar();
    }

    public static emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestGlobalVar>
        PARSER = new com.google.protobuf.AbstractParser<QuestGlobalVar>() {
      @java.lang.Override
      public QuestGlobalVar parsePartialFrom(
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

    public static com.google.protobuf.Parser<QuestGlobalVar> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestGlobalVar> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.QuestGlobalVarOuterClass.QuestGlobalVar getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestGlobalVar_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestGlobalVar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024QuestGlobalVar.proto\",\n\016QuestGlobalVar" +
      "\022\r\n\005value\030\010 \001(\005\022\013\n\003key\030\004 \001(\rB\036\n\034emu.gras" +
      "scutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QuestGlobalVar_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestGlobalVar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestGlobalVar_descriptor,
        new java.lang.String[] { "Value", "Key", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
