// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_PHLEDBIFIFL.proto

package emu.grasscutter.net.newproto;

public final class Unk2700PHLEDBIFIFL {
  private Unk2700PHLEDBIFIFL() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_PHLEDBIFIFLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_PHLEDBIFIFL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 difficulty = 1;</code>
     * @return The difficulty.
     */
    int getDifficulty();

    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 13;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    int getUnk3250PPIHJFNMEFB();
  }
  /**
   * <pre>
   * CmdId: 8856
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_PHLEDBIFIFL}
   */
  public static final class Unk2700_PHLEDBIFIFL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_PHLEDBIFIFL)
      Unk2700_PHLEDBIFIFLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_PHLEDBIFIFL.newBuilder() to construct.
    private Unk2700_PHLEDBIFIFL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_PHLEDBIFIFL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_PHLEDBIFIFL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.internal_static_Unk2700_PHLEDBIFIFL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.internal_static_Unk2700_PHLEDBIFIFL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL.class, emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL.Builder.class);
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 1;
    private int difficulty_;
    /**
     * <code>uint32 difficulty = 1;</code>
     * @return The difficulty.
     */
    @java.lang.Override
    public int getDifficulty() {
      return difficulty_;
    }

    public static final int UNK3250_PPIHJFNMEFB_FIELD_NUMBER = 13;
    private int unk3250PPIHJFNMEFB_;
    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 13;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    @java.lang.Override
    public int getUnk3250PPIHJFNMEFB() {
      return unk3250PPIHJFNMEFB_;
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
      if (difficulty_ != 0) {
        output.writeUInt32(1, difficulty_);
      }
      if (unk3250PPIHJFNMEFB_ != 0) {
        output.writeUInt32(13, unk3250PPIHJFNMEFB_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, difficulty_);
      }
      if (unk3250PPIHJFNMEFB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3250PPIHJFNMEFB_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL other = (emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL) obj;

      if (getDifficulty()
          != other.getDifficulty()) return false;
      if (getUnk3250PPIHJFNMEFB()
          != other.getUnk3250PPIHJFNMEFB()) return false;
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
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
      hash = (37 * hash) + UNK3250_PPIHJFNMEFB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250PPIHJFNMEFB();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL prototype) {
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
     * CmdId: 8856
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_PHLEDBIFIFL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_PHLEDBIFIFL)
        emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.internal_static_Unk2700_PHLEDBIFIFL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.internal_static_Unk2700_PHLEDBIFIFL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL.class, emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        difficulty_ = 0;

        unk3250PPIHJFNMEFB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.internal_static_Unk2700_PHLEDBIFIFL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL build() {
        emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL buildPartial() {
        emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL result = new emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL(this);
        result.difficulty_ = difficulty_;
        result.unk3250PPIHJFNMEFB_ = unk3250PPIHJFNMEFB_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL other) {
        if (other == emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL.getDefaultInstance()) return this;
        if (other.getDifficulty() != 0) {
          setDifficulty(other.getDifficulty());
        }
        if (other.getUnk3250PPIHJFNMEFB() != 0) {
          setUnk3250PPIHJFNMEFB(other.getUnk3250PPIHJFNMEFB());
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
                difficulty_ = input.readUInt32();

                break;
              } // case 8
              case 104: {
                unk3250PPIHJFNMEFB_ = input.readUInt32();

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

      private int difficulty_ ;
      /**
       * <code>uint32 difficulty = 1;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public int getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>uint32 difficulty = 1;</code>
       * @param value The difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficulty(int value) {
        
        difficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        
        difficulty_ = 0;
        onChanged();
        return this;
      }

      private int unk3250PPIHJFNMEFB_ ;
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 13;</code>
       * @return The unk3250PPIHJFNMEFB.
       */
      @java.lang.Override
      public int getUnk3250PPIHJFNMEFB() {
        return unk3250PPIHJFNMEFB_;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 13;</code>
       * @param value The unk3250PPIHJFNMEFB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250PPIHJFNMEFB(int value) {
        
        unk3250PPIHJFNMEFB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250PPIHJFNMEFB() {
        
        unk3250PPIHJFNMEFB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_PHLEDBIFIFL)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_PHLEDBIFIFL)
    private static final emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL();
    }

    public static emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_PHLEDBIFIFL>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_PHLEDBIFIFL>() {
      @java.lang.Override
      public Unk2700_PHLEDBIFIFL parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_PHLEDBIFIFL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_PHLEDBIFIFL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700PHLEDBIFIFL.Unk2700_PHLEDBIFIFL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_PHLEDBIFIFL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_PHLEDBIFIFL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_PHLEDBIFIFL.proto\"F\n\023Unk2700_P" +
      "HLEDBIFIFL\022\022\n\ndifficulty\030\001 \001(\r\022\033\n\023Unk325" +
      "0_PPIHJFNMEFB\030\r \001(\rB\036\n\034emu.grasscutter.n" +
      "et.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_PHLEDBIFIFL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_PHLEDBIFIFL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_PHLEDBIFIFL_descriptor,
        new java.lang.String[] { "Difficulty", "Unk3250PPIHJFNMEFB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
