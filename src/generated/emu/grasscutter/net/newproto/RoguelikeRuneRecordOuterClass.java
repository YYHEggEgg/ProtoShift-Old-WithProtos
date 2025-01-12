// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeRuneRecord.proto

package emu.grasscutter.net.newproto;

public final class RoguelikeRuneRecordOuterClass {
  private RoguelikeRuneRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeRuneRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeRuneRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 rune_id = 10;</code>
     * @return The runeId.
     */
    int getRuneId();

    /**
     * <code>uint32 Unk3300_JLOLMLFAPHH = 1;</code>
     * @return The unk3300JLOLMLFAPHH.
     */
    int getUnk3300JLOLMLFAPHH();

    /**
     * <code>uint32 Unk3300_IGBOJLPPKON = 11;</code>
     * @return The unk3300IGBOJLPPKON.
     */
    int getUnk3300IGBOJLPPKON();
  }
  /**
   * Protobuf type {@code RoguelikeRuneRecord}
   */
  public static final class RoguelikeRuneRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeRuneRecord)
      RoguelikeRuneRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeRuneRecord.newBuilder() to construct.
    private RoguelikeRuneRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeRuneRecord() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeRuneRecord();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.internal_static_RoguelikeRuneRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.internal_static_RoguelikeRuneRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.class, emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.Builder.class);
    }

    public static final int RUNE_ID_FIELD_NUMBER = 10;
    private int runeId_;
    /**
     * <code>uint32 rune_id = 10;</code>
     * @return The runeId.
     */
    @java.lang.Override
    public int getRuneId() {
      return runeId_;
    }

    public static final int UNK3300_JLOLMLFAPHH_FIELD_NUMBER = 1;
    private int unk3300JLOLMLFAPHH_;
    /**
     * <code>uint32 Unk3300_JLOLMLFAPHH = 1;</code>
     * @return The unk3300JLOLMLFAPHH.
     */
    @java.lang.Override
    public int getUnk3300JLOLMLFAPHH() {
      return unk3300JLOLMLFAPHH_;
    }

    public static final int UNK3300_IGBOJLPPKON_FIELD_NUMBER = 11;
    private int unk3300IGBOJLPPKON_;
    /**
     * <code>uint32 Unk3300_IGBOJLPPKON = 11;</code>
     * @return The unk3300IGBOJLPPKON.
     */
    @java.lang.Override
    public int getUnk3300IGBOJLPPKON() {
      return unk3300IGBOJLPPKON_;
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
      if (unk3300JLOLMLFAPHH_ != 0) {
        output.writeUInt32(1, unk3300JLOLMLFAPHH_);
      }
      if (runeId_ != 0) {
        output.writeUInt32(10, runeId_);
      }
      if (unk3300IGBOJLPPKON_ != 0) {
        output.writeUInt32(11, unk3300IGBOJLPPKON_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300JLOLMLFAPHH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3300JLOLMLFAPHH_);
      }
      if (runeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, runeId_);
      }
      if (unk3300IGBOJLPPKON_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk3300IGBOJLPPKON_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord other = (emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord) obj;

      if (getRuneId()
          != other.getRuneId()) return false;
      if (getUnk3300JLOLMLFAPHH()
          != other.getUnk3300JLOLMLFAPHH()) return false;
      if (getUnk3300IGBOJLPPKON()
          != other.getUnk3300IGBOJLPPKON()) return false;
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
      hash = (37 * hash) + RUNE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRuneId();
      hash = (37 * hash) + UNK3300_JLOLMLFAPHH_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300JLOLMLFAPHH();
      hash = (37 * hash) + UNK3300_IGBOJLPPKON_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300IGBOJLPPKON();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord prototype) {
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
     * Protobuf type {@code RoguelikeRuneRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeRuneRecord)
        emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.internal_static_RoguelikeRuneRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.internal_static_RoguelikeRuneRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.class, emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        runeId_ = 0;

        unk3300JLOLMLFAPHH_ = 0;

        unk3300IGBOJLPPKON_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.internal_static_RoguelikeRuneRecord_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord build() {
        emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord buildPartial() {
        emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord result = new emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord(this);
        result.runeId_ = runeId_;
        result.unk3300JLOLMLFAPHH_ = unk3300JLOLMLFAPHH_;
        result.unk3300IGBOJLPPKON_ = unk3300IGBOJLPPKON_;
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
        if (other instanceof emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord) {
          return mergeFrom((emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord other) {
        if (other == emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.getDefaultInstance()) return this;
        if (other.getRuneId() != 0) {
          setRuneId(other.getRuneId());
        }
        if (other.getUnk3300JLOLMLFAPHH() != 0) {
          setUnk3300JLOLMLFAPHH(other.getUnk3300JLOLMLFAPHH());
        }
        if (other.getUnk3300IGBOJLPPKON() != 0) {
          setUnk3300IGBOJLPPKON(other.getUnk3300IGBOJLPPKON());
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
                unk3300JLOLMLFAPHH_ = input.readUInt32();

                break;
              } // case 8
              case 80: {
                runeId_ = input.readUInt32();

                break;
              } // case 80
              case 88: {
                unk3300IGBOJLPPKON_ = input.readUInt32();

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

      private int runeId_ ;
      /**
       * <code>uint32 rune_id = 10;</code>
       * @return The runeId.
       */
      @java.lang.Override
      public int getRuneId() {
        return runeId_;
      }
      /**
       * <code>uint32 rune_id = 10;</code>
       * @param value The runeId to set.
       * @return This builder for chaining.
       */
      public Builder setRuneId(int value) {
        
        runeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rune_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRuneId() {
        
        runeId_ = 0;
        onChanged();
        return this;
      }

      private int unk3300JLOLMLFAPHH_ ;
      /**
       * <code>uint32 Unk3300_JLOLMLFAPHH = 1;</code>
       * @return The unk3300JLOLMLFAPHH.
       */
      @java.lang.Override
      public int getUnk3300JLOLMLFAPHH() {
        return unk3300JLOLMLFAPHH_;
      }
      /**
       * <code>uint32 Unk3300_JLOLMLFAPHH = 1;</code>
       * @param value The unk3300JLOLMLFAPHH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300JLOLMLFAPHH(int value) {
        
        unk3300JLOLMLFAPHH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_JLOLMLFAPHH = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300JLOLMLFAPHH() {
        
        unk3300JLOLMLFAPHH_ = 0;
        onChanged();
        return this;
      }

      private int unk3300IGBOJLPPKON_ ;
      /**
       * <code>uint32 Unk3300_IGBOJLPPKON = 11;</code>
       * @return The unk3300IGBOJLPPKON.
       */
      @java.lang.Override
      public int getUnk3300IGBOJLPPKON() {
        return unk3300IGBOJLPPKON_;
      }
      /**
       * <code>uint32 Unk3300_IGBOJLPPKON = 11;</code>
       * @param value The unk3300IGBOJLPPKON to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300IGBOJLPPKON(int value) {
        
        unk3300IGBOJLPPKON_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_IGBOJLPPKON = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300IGBOJLPPKON() {
        
        unk3300IGBOJLPPKON_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RoguelikeRuneRecord)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeRuneRecord)
    private static final emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord();
    }

    public static emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeRuneRecord>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeRuneRecord>() {
      @java.lang.Override
      public RoguelikeRuneRecord parsePartialFrom(
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

    public static com.google.protobuf.Parser<RoguelikeRuneRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeRuneRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeRuneRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeRuneRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031RoguelikeRuneRecord.proto\"`\n\023Roguelike" +
      "RuneRecord\022\017\n\007rune_id\030\n \001(\r\022\033\n\023Unk3300_J" +
      "LOLMLFAPHH\030\001 \001(\r\022\033\n\023Unk3300_IGBOJLPPKON\030" +
      "\013 \001(\rB\036\n\034emu.grasscutter.net.newprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoguelikeRuneRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeRuneRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeRuneRecord_descriptor,
        new java.lang.String[] { "RuneId", "Unk3300JLOLMLFAPHH", "Unk3300IGBOJLPPKON", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
