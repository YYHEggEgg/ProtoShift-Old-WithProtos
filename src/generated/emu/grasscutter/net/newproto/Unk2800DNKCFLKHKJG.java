// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2800_DNKCFLKHKJG.proto

package emu.grasscutter.net.newproto;

public final class Unk2800DNKCFLKHKJG {
  private Unk2800DNKCFLKHKJG() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2800_DNKCFLKHKJGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2800_DNKCFLKHKJG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gadget_entity_id = 13;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>uint32 Unk2800_LEHIJIPEONO = 14;</code>
     * @return The unk2800LEHIJIPEONO.
     */
    int getUnk2800LEHIJIPEONO();
  }
  /**
   * <pre>
   * CmdId: 831
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2800_DNKCFLKHKJG}
   */
  public static final class Unk2800_DNKCFLKHKJG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2800_DNKCFLKHKJG)
      Unk2800_DNKCFLKHKJGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2800_DNKCFLKHKJG.newBuilder() to construct.
    private Unk2800_DNKCFLKHKJG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2800_DNKCFLKHKJG() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2800_DNKCFLKHKJG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.internal_static_Unk2800_DNKCFLKHKJG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.internal_static_Unk2800_DNKCFLKHKJG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG.class, emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG.Builder.class);
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 13;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 13;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int UNK2800_LEHIJIPEONO_FIELD_NUMBER = 14;
    private int unk2800LEHIJIPEONO_;
    /**
     * <code>uint32 Unk2800_LEHIJIPEONO = 14;</code>
     * @return The unk2800LEHIJIPEONO.
     */
    @java.lang.Override
    public int getUnk2800LEHIJIPEONO() {
      return unk2800LEHIJIPEONO_;
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
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(13, gadgetEntityId_);
      }
      if (unk2800LEHIJIPEONO_ != 0) {
        output.writeUInt32(14, unk2800LEHIJIPEONO_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, gadgetEntityId_);
      }
      if (unk2800LEHIJIPEONO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk2800LEHIJIPEONO_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG other = (emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG) obj;

      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (getUnk2800LEHIJIPEONO()
          != other.getUnk2800LEHIJIPEONO()) return false;
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
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + UNK2800_LEHIJIPEONO_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2800LEHIJIPEONO();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG prototype) {
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
     * CmdId: 831
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2800_DNKCFLKHKJG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2800_DNKCFLKHKJG)
        emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.internal_static_Unk2800_DNKCFLKHKJG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.internal_static_Unk2800_DNKCFLKHKJG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG.class, emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        gadgetEntityId_ = 0;

        unk2800LEHIJIPEONO_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.internal_static_Unk2800_DNKCFLKHKJG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG build() {
        emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG buildPartial() {
        emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG result = new emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG(this);
        result.gadgetEntityId_ = gadgetEntityId_;
        result.unk2800LEHIJIPEONO_ = unk2800LEHIJIPEONO_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG other) {
        if (other == emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG.getDefaultInstance()) return this;
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.getUnk2800LEHIJIPEONO() != 0) {
          setUnk2800LEHIJIPEONO(other.getUnk2800LEHIJIPEONO());
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
                gadgetEntityId_ = input.readUInt32();

                break;
              } // case 104
              case 112: {
                unk2800LEHIJIPEONO_ = input.readUInt32();

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

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 13;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 13;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int unk2800LEHIJIPEONO_ ;
      /**
       * <code>uint32 Unk2800_LEHIJIPEONO = 14;</code>
       * @return The unk2800LEHIJIPEONO.
       */
      @java.lang.Override
      public int getUnk2800LEHIJIPEONO() {
        return unk2800LEHIJIPEONO_;
      }
      /**
       * <code>uint32 Unk2800_LEHIJIPEONO = 14;</code>
       * @param value The unk2800LEHIJIPEONO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800LEHIJIPEONO(int value) {
        
        unk2800LEHIJIPEONO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2800_LEHIJIPEONO = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2800LEHIJIPEONO() {
        
        unk2800LEHIJIPEONO_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2800_DNKCFLKHKJG)
    }

    // @@protoc_insertion_point(class_scope:Unk2800_DNKCFLKHKJG)
    private static final emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG();
    }

    public static emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2800_DNKCFLKHKJG>
        PARSER = new com.google.protobuf.AbstractParser<Unk2800_DNKCFLKHKJG>() {
      @java.lang.Override
      public Unk2800_DNKCFLKHKJG parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2800_DNKCFLKHKJG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2800_DNKCFLKHKJG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2800DNKCFLKHKJG.Unk2800_DNKCFLKHKJG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2800_DNKCFLKHKJG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2800_DNKCFLKHKJG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2800_DNKCFLKHKJG.proto\"L\n\023Unk2800_D" +
      "NKCFLKHKJG\022\030\n\020gadget_entity_id\030\r \001(\r\022\033\n\023" +
      "Unk2800_LEHIJIPEONO\030\016 \001(\rB\036\n\034emu.grasscu" +
      "tter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2800_DNKCFLKHKJG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2800_DNKCFLKHKJG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2800_DNKCFLKHKJG_descriptor,
        new java.lang.String[] { "GadgetEntityId", "Unk2800LEHIJIPEONO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
