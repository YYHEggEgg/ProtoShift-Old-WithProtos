// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_ECGHJKANPJK.proto

package emu.grasscutter.net.newproto;

public final class Unk3000ECGHJKANPJK {
  private Unk3000ECGHJKANPJK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_ECGHJKANPJKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_ECGHJKANPJK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_AMEEFGKPPFA = 12;</code>
     * @return The unk3250AMEEFGKPPFA.
     */
    int getUnk3250AMEEFGKPPFA();

    /**
     * <code>bool is_open = 4;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * Protobuf type {@code Unk3000_ECGHJKANPJK}
   */
  public static final class Unk3000_ECGHJKANPJK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_ECGHJKANPJK)
      Unk3000_ECGHJKANPJKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_ECGHJKANPJK.newBuilder() to construct.
    private Unk3000_ECGHJKANPJK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_ECGHJKANPJK() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_ECGHJKANPJK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.internal_static_Unk3000_ECGHJKANPJK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.internal_static_Unk3000_ECGHJKANPJK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK.class, emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK.Builder.class);
    }

    public static final int UNK3250_AMEEFGKPPFA_FIELD_NUMBER = 12;
    private int unk3250AMEEFGKPPFA_;
    /**
     * <code>uint32 Unk3250_AMEEFGKPPFA = 12;</code>
     * @return The unk3250AMEEFGKPPFA.
     */
    @java.lang.Override
    public int getUnk3250AMEEFGKPPFA() {
      return unk3250AMEEFGKPPFA_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 4;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 4;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
        output.writeBool(4, isOpen_);
      }
      if (unk3250AMEEFGKPPFA_ != 0) {
        output.writeUInt32(12, unk3250AMEEFGKPPFA_);
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
          .computeBoolSize(4, isOpen_);
      }
      if (unk3250AMEEFGKPPFA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk3250AMEEFGKPPFA_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK other = (emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK) obj;

      if (getUnk3250AMEEFGKPPFA()
          != other.getUnk3250AMEEFGKPPFA()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + UNK3250_AMEEFGKPPFA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250AMEEFGKPPFA();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK prototype) {
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
     * Protobuf type {@code Unk3000_ECGHJKANPJK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_ECGHJKANPJK)
        emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.internal_static_Unk3000_ECGHJKANPJK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.internal_static_Unk3000_ECGHJKANPJK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK.class, emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250AMEEFGKPPFA_ = 0;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.internal_static_Unk3000_ECGHJKANPJK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK build() {
        emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK buildPartial() {
        emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK result = new emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK(this);
        result.unk3250AMEEFGKPPFA_ = unk3250AMEEFGKPPFA_;
        result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK other) {
        if (other == emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK.getDefaultInstance()) return this;
        if (other.getUnk3250AMEEFGKPPFA() != 0) {
          setUnk3250AMEEFGKPPFA(other.getUnk3250AMEEFGKPPFA());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
                isOpen_ = input.readBool();

                break;
              } // case 32
              case 96: {
                unk3250AMEEFGKPPFA_ = input.readUInt32();

                break;
              } // case 96
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

      private int unk3250AMEEFGKPPFA_ ;
      /**
       * <code>uint32 Unk3250_AMEEFGKPPFA = 12;</code>
       * @return The unk3250AMEEFGKPPFA.
       */
      @java.lang.Override
      public int getUnk3250AMEEFGKPPFA() {
        return unk3250AMEEFGKPPFA_;
      }
      /**
       * <code>uint32 Unk3250_AMEEFGKPPFA = 12;</code>
       * @param value The unk3250AMEEFGKPPFA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250AMEEFGKPPFA(int value) {
        
        unk3250AMEEFGKPPFA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_AMEEFGKPPFA = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250AMEEFGKPPFA() {
        
        unk3250AMEEFGKPPFA_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 4;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 4;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_ECGHJKANPJK)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_ECGHJKANPJK)
    private static final emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK();
    }

    public static emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_ECGHJKANPJK>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_ECGHJKANPJK>() {
      @java.lang.Override
      public Unk3000_ECGHJKANPJK parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3000_ECGHJKANPJK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_ECGHJKANPJK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3000ECGHJKANPJK.Unk3000_ECGHJKANPJK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_ECGHJKANPJK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_ECGHJKANPJK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_ECGHJKANPJK.proto\"C\n\023Unk3000_E" +
      "CGHJKANPJK\022\033\n\023Unk3250_AMEEFGKPPFA\030\014 \001(\r\022" +
      "\017\n\007is_open\030\004 \001(\010B\036\n\034emu.grasscutter.net." +
      "newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_ECGHJKANPJK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_ECGHJKANPJK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_ECGHJKANPJK_descriptor,
        new java.lang.String[] { "Unk3250AMEEFGKPPFA", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}