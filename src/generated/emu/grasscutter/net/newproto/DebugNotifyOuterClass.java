// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DebugNotify.proto

package emu.grasscutter.net.newproto;

public final class DebugNotifyOuterClass {
  private DebugNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DebugNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DebugNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>.DebugNotify.Retcode retcode = 3;</code>
     * @return The enum numeric value on the wire for retcode.
     */
    int getRetcodeValue();
    /**
     * <code>.DebugNotify.Retcode retcode = 3;</code>
     * @return The retcode.
     */
    emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.Retcode getRetcode();
  }
  /**
   * <pre>
   * enum Enum {
   *   option allow_alias = true;
   *   ZREO = 0;
   *   CMD_ID = 101;
   *   TARGET_SERVICE = 101;
   *   ENET_CHANNEL_ID = 2;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code DebugNotify}
   */
  public static final class DebugNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DebugNotify)
      DebugNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DebugNotify.newBuilder() to construct.
    private DebugNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DebugNotify() {
      name_ = "";
      retcode_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DebugNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.DebugNotifyOuterClass.internal_static_DebugNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.DebugNotifyOuterClass.internal_static_DebugNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.class, emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code DebugNotify.Retcode}
     */
    public enum Retcode
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>RETCODE_SUCC = 0;</code>
       */
      RETCODE_SUCC(0),
      /**
       * <code>RETCODE_FAIL = 1;</code>
       */
      RETCODE_FAIL(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>RETCODE_SUCC = 0;</code>
       */
      public static final int RETCODE_SUCC_VALUE = 0;
      /**
       * <code>RETCODE_FAIL = 1;</code>
       */
      public static final int RETCODE_FAIL_VALUE = 1;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Retcode valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Retcode forNumber(int value) {
        switch (value) {
          case 0: return RETCODE_SUCC;
          case 1: return RETCODE_FAIL;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Retcode>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Retcode> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Retcode>() {
              public Retcode findValueByNumber(int number) {
                return Retcode.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final Retcode[] VALUES = values();

      public static Retcode valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Retcode(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:DebugNotify.Retcode)
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>.DebugNotify.Retcode retcode = 3;</code>
     * @return The enum numeric value on the wire for retcode.
     */
    @java.lang.Override public int getRetcodeValue() {
      return retcode_;
    }
    /**
     * <code>.DebugNotify.Retcode retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.Retcode getRetcode() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.Retcode result = emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.Retcode.valueOf(retcode_);
      return result == null ? emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.Retcode.UNRECOGNIZED : result;
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
      if (id_ != 0) {
        output.writeUInt32(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (retcode_ != emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.Retcode.RETCODE_SUCC.getNumber()) {
        output.writeEnum(3, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (retcode_ != emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.Retcode.RETCODE_SUCC.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify other = (emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify) obj;

      if (getId()
          != other.getId()) return false;
      if (!getName()
          .equals(other.getName())) return false;
      if (retcode_ != other.retcode_) return false;
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + retcode_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify prototype) {
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
     * enum Enum {
     *   option allow_alias = true;
     *   ZREO = 0;
     *   CMD_ID = 101;
     *   TARGET_SERVICE = 101;
     *   ENET_CHANNEL_ID = 2;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code DebugNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DebugNotify)
        emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.DebugNotifyOuterClass.internal_static_DebugNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.DebugNotifyOuterClass.internal_static_DebugNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.class, emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.newBuilder()
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

        name_ = "";

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.DebugNotifyOuterClass.internal_static_DebugNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify build() {
        emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify buildPartial() {
        emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify result = new emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify(this);
        result.id_ = id_;
        result.name_ = name_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify other) {
        if (other == emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.retcode_ != 0) {
          setRetcodeValue(other.getRetcodeValue());
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
                id_ = input.readUInt32();

                break;
              } // case 8
              case 18: {
                name_ = input.readStringRequireUtf8();

                break;
              } // case 18
              case 24: {
                retcode_ = input.readEnum();

                break;
              } // case 24
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

      private int id_ ;
      /**
       * <code>uint32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 2;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int retcode_ = 0;
      /**
       * <code>.DebugNotify.Retcode retcode = 3;</code>
       * @return The enum numeric value on the wire for retcode.
       */
      @java.lang.Override public int getRetcodeValue() {
        return retcode_;
      }
      /**
       * <code>.DebugNotify.Retcode retcode = 3;</code>
       * @param value The enum numeric value on the wire for retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcodeValue(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.DebugNotify.Retcode retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.Retcode getRetcode() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.Retcode result = emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.Retcode.valueOf(retcode_);
        return result == null ? emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.Retcode.UNRECOGNIZED : result;
      }
      /**
       * <code>.DebugNotify.Retcode retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify.Retcode value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        retcode_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.DebugNotify.Retcode retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DebugNotify)
    }

    // @@protoc_insertion_point(class_scope:DebugNotify)
    private static final emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify();
    }

    public static emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DebugNotify>
        PARSER = new com.google.protobuf.AbstractParser<DebugNotify>() {
      @java.lang.Override
      public DebugNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<DebugNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DebugNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.DebugNotifyOuterClass.DebugNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DebugNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DebugNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DebugNotify.proto\"}\n\013DebugNotify\022\n\n\002id" +
      "\030\001 \001(\r\022\014\n\004name\030\002 \001(\t\022%\n\007retcode\030\003 \001(\0162\024." +
      "DebugNotify.Retcode\"-\n\007Retcode\022\020\n\014RETCOD" +
      "E_SUCC\020\000\022\020\n\014RETCODE_FAIL\020\001B\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DebugNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DebugNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DebugNotify_descriptor,
        new java.lang.String[] { "Id", "Name", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
