// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_CBGOFDNILKA.proto

package emu.grasscutter.net.newproto;

public final class Unk2700CBGOFDNILKA {
  private Unk2700CBGOFDNILKA() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_CBGOFDNILKAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_CBGOFDNILKA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk2700_APJPPLAAFEM = 11;</code>
     * @return The unk2700APJPPLAAFEM.
     */
    int getUnk2700APJPPLAAFEM();

    /**
     * <code>bool Unk2700_JGAMIHLFFOI = 9;</code>
     * @return The unk2700JGAMIHLFFOI.
     */
    boolean getUnk2700JGAMIHLFFOI();
  }
  /**
   * <pre>
   * CmdId: 8304
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_CBGOFDNILKA}
   */
  public static final class Unk2700_CBGOFDNILKA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_CBGOFDNILKA)
      Unk2700_CBGOFDNILKAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_CBGOFDNILKA.newBuilder() to construct.
    private Unk2700_CBGOFDNILKA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_CBGOFDNILKA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_CBGOFDNILKA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.internal_static_Unk2700_CBGOFDNILKA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.internal_static_Unk2700_CBGOFDNILKA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA.class, emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA.Builder.class);
    }

    public static final int UNK2700_APJPPLAAFEM_FIELD_NUMBER = 11;
    private int unk2700APJPPLAAFEM_;
    /**
     * <code>uint32 Unk2700_APJPPLAAFEM = 11;</code>
     * @return The unk2700APJPPLAAFEM.
     */
    @java.lang.Override
    public int getUnk2700APJPPLAAFEM() {
      return unk2700APJPPLAAFEM_;
    }

    public static final int UNK2700_JGAMIHLFFOI_FIELD_NUMBER = 9;
    private boolean unk2700JGAMIHLFFOI_;
    /**
     * <code>bool Unk2700_JGAMIHLFFOI = 9;</code>
     * @return The unk2700JGAMIHLFFOI.
     */
    @java.lang.Override
    public boolean getUnk2700JGAMIHLFFOI() {
      return unk2700JGAMIHLFFOI_;
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
      if (unk2700JGAMIHLFFOI_ != false) {
        output.writeBool(9, unk2700JGAMIHLFFOI_);
      }
      if (unk2700APJPPLAAFEM_ != 0) {
        output.writeUInt32(11, unk2700APJPPLAAFEM_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700JGAMIHLFFOI_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, unk2700JGAMIHLFFOI_);
      }
      if (unk2700APJPPLAAFEM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk2700APJPPLAAFEM_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA other = (emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA) obj;

      if (getUnk2700APJPPLAAFEM()
          != other.getUnk2700APJPPLAAFEM()) return false;
      if (getUnk2700JGAMIHLFFOI()
          != other.getUnk2700JGAMIHLFFOI()) return false;
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
      hash = (37 * hash) + UNK2700_APJPPLAAFEM_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700APJPPLAAFEM();
      hash = (37 * hash) + UNK2700_JGAMIHLFFOI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk2700JGAMIHLFFOI());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA prototype) {
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
     * CmdId: 8304
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_CBGOFDNILKA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_CBGOFDNILKA)
        emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.internal_static_Unk2700_CBGOFDNILKA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.internal_static_Unk2700_CBGOFDNILKA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA.class, emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk2700APJPPLAAFEM_ = 0;

        unk2700JGAMIHLFFOI_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.internal_static_Unk2700_CBGOFDNILKA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA build() {
        emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA buildPartial() {
        emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA result = new emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA(this);
        result.unk2700APJPPLAAFEM_ = unk2700APJPPLAAFEM_;
        result.unk2700JGAMIHLFFOI_ = unk2700JGAMIHLFFOI_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA other) {
        if (other == emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA.getDefaultInstance()) return this;
        if (other.getUnk2700APJPPLAAFEM() != 0) {
          setUnk2700APJPPLAAFEM(other.getUnk2700APJPPLAAFEM());
        }
        if (other.getUnk2700JGAMIHLFFOI() != false) {
          setUnk2700JGAMIHLFFOI(other.getUnk2700JGAMIHLFFOI());
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
              case 72: {
                unk2700JGAMIHLFFOI_ = input.readBool();

                break;
              } // case 72
              case 88: {
                unk2700APJPPLAAFEM_ = input.readUInt32();

                break;
              } // case 88
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

      private int unk2700APJPPLAAFEM_ ;
      /**
       * <code>uint32 Unk2700_APJPPLAAFEM = 11;</code>
       * @return The unk2700APJPPLAAFEM.
       */
      @java.lang.Override
      public int getUnk2700APJPPLAAFEM() {
        return unk2700APJPPLAAFEM_;
      }
      /**
       * <code>uint32 Unk2700_APJPPLAAFEM = 11;</code>
       * @param value The unk2700APJPPLAAFEM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700APJPPLAAFEM(int value) {
        
        unk2700APJPPLAAFEM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_APJPPLAAFEM = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700APJPPLAAFEM() {
        
        unk2700APJPPLAAFEM_ = 0;
        onChanged();
        return this;
      }

      private boolean unk2700JGAMIHLFFOI_ ;
      /**
       * <code>bool Unk2700_JGAMIHLFFOI = 9;</code>
       * @return The unk2700JGAMIHLFFOI.
       */
      @java.lang.Override
      public boolean getUnk2700JGAMIHLFFOI() {
        return unk2700JGAMIHLFFOI_;
      }
      /**
       * <code>bool Unk2700_JGAMIHLFFOI = 9;</code>
       * @param value The unk2700JGAMIHLFFOI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700JGAMIHLFFOI(boolean value) {
        
        unk2700JGAMIHLFFOI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk2700_JGAMIHLFFOI = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700JGAMIHLFFOI() {
        
        unk2700JGAMIHLFFOI_ = false;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_CBGOFDNILKA)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_CBGOFDNILKA)
    private static final emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA();
    }

    public static emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_CBGOFDNILKA>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_CBGOFDNILKA>() {
      @java.lang.Override
      public Unk2700_CBGOFDNILKA parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_CBGOFDNILKA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_CBGOFDNILKA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700CBGOFDNILKA.Unk2700_CBGOFDNILKA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_CBGOFDNILKA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_CBGOFDNILKA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_CBGOFDNILKA.proto\"O\n\023Unk2700_C" +
      "BGOFDNILKA\022\033\n\023Unk2700_APJPPLAAFEM\030\013 \001(\r\022" +
      "\033\n\023Unk2700_JGAMIHLFFOI\030\t \001(\010B\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_CBGOFDNILKA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_CBGOFDNILKA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_CBGOFDNILKA_descriptor,
        new java.lang.String[] { "Unk2700APJPPLAAFEM", "Unk2700JGAMIHLFFOI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
