// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_OMCBMAHOLHB.proto

package emu.grasscutter.net.newproto;

public final class Unk3000OMCBMAHOLHB {
  private Unk3000OMCBMAHOLHB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_OMCBMAHOLHBOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_OMCBMAHOLHB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 Unk3250_KKDFLBMKGEF = 12;</code>
     * @return The unk3250KKDFLBMKGEF.
     */
    long getUnk3250KKDFLBMKGEF();

    /**
     * <code>uint64 Unk3250_EPHAABKNLHC = 15;</code>
     * @return The unk3250EPHAABKNLHC.
     */
    long getUnk3250EPHAABKNLHC();

    /**
     * <code>uint32 buff_id = 13;</code>
     * @return The buffId.
     */
    int getBuffId();
  }
  /**
   * Protobuf type {@code Unk3000_OMCBMAHOLHB}
   */
  public static final class Unk3000_OMCBMAHOLHB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_OMCBMAHOLHB)
      Unk3000_OMCBMAHOLHBOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_OMCBMAHOLHB.newBuilder() to construct.
    private Unk3000_OMCBMAHOLHB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_OMCBMAHOLHB() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_OMCBMAHOLHB();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.internal_static_Unk3000_OMCBMAHOLHB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.internal_static_Unk3000_OMCBMAHOLHB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.class, emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.Builder.class);
    }

    public static final int UNK3250_KKDFLBMKGEF_FIELD_NUMBER = 12;
    private long unk3250KKDFLBMKGEF_;
    /**
     * <code>uint64 Unk3250_KKDFLBMKGEF = 12;</code>
     * @return The unk3250KKDFLBMKGEF.
     */
    @java.lang.Override
    public long getUnk3250KKDFLBMKGEF() {
      return unk3250KKDFLBMKGEF_;
    }

    public static final int UNK3250_EPHAABKNLHC_FIELD_NUMBER = 15;
    private long unk3250EPHAABKNLHC_;
    /**
     * <code>uint64 Unk3250_EPHAABKNLHC = 15;</code>
     * @return The unk3250EPHAABKNLHC.
     */
    @java.lang.Override
    public long getUnk3250EPHAABKNLHC() {
      return unk3250EPHAABKNLHC_;
    }

    public static final int BUFF_ID_FIELD_NUMBER = 13;
    private int buffId_;
    /**
     * <code>uint32 buff_id = 13;</code>
     * @return The buffId.
     */
    @java.lang.Override
    public int getBuffId() {
      return buffId_;
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
      if (unk3250KKDFLBMKGEF_ != 0L) {
        output.writeUInt64(12, unk3250KKDFLBMKGEF_);
      }
      if (buffId_ != 0) {
        output.writeUInt32(13, buffId_);
      }
      if (unk3250EPHAABKNLHC_ != 0L) {
        output.writeUInt64(15, unk3250EPHAABKNLHC_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250KKDFLBMKGEF_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(12, unk3250KKDFLBMKGEF_);
      }
      if (buffId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, buffId_);
      }
      if (unk3250EPHAABKNLHC_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(15, unk3250EPHAABKNLHC_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB other = (emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB) obj;

      if (getUnk3250KKDFLBMKGEF()
          != other.getUnk3250KKDFLBMKGEF()) return false;
      if (getUnk3250EPHAABKNLHC()
          != other.getUnk3250EPHAABKNLHC()) return false;
      if (getBuffId()
          != other.getBuffId()) return false;
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
      hash = (37 * hash) + UNK3250_KKDFLBMKGEF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUnk3250KKDFLBMKGEF());
      hash = (37 * hash) + UNK3250_EPHAABKNLHC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUnk3250EPHAABKNLHC());
      hash = (37 * hash) + BUFF_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuffId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB prototype) {
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
     * Protobuf type {@code Unk3000_OMCBMAHOLHB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_OMCBMAHOLHB)
        emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.internal_static_Unk3000_OMCBMAHOLHB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.internal_static_Unk3000_OMCBMAHOLHB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.class, emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250KKDFLBMKGEF_ = 0L;

        unk3250EPHAABKNLHC_ = 0L;

        buffId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.internal_static_Unk3000_OMCBMAHOLHB_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB build() {
        emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB buildPartial() {
        emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB result = new emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB(this);
        result.unk3250KKDFLBMKGEF_ = unk3250KKDFLBMKGEF_;
        result.unk3250EPHAABKNLHC_ = unk3250EPHAABKNLHC_;
        result.buffId_ = buffId_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB other) {
        if (other == emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB.getDefaultInstance()) return this;
        if (other.getUnk3250KKDFLBMKGEF() != 0L) {
          setUnk3250KKDFLBMKGEF(other.getUnk3250KKDFLBMKGEF());
        }
        if (other.getUnk3250EPHAABKNLHC() != 0L) {
          setUnk3250EPHAABKNLHC(other.getUnk3250EPHAABKNLHC());
        }
        if (other.getBuffId() != 0) {
          setBuffId(other.getBuffId());
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
              case 96: {
                unk3250KKDFLBMKGEF_ = input.readUInt64();

                break;
              } // case 96
              case 104: {
                buffId_ = input.readUInt32();

                break;
              } // case 104
              case 120: {
                unk3250EPHAABKNLHC_ = input.readUInt64();

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

      private long unk3250KKDFLBMKGEF_ ;
      /**
       * <code>uint64 Unk3250_KKDFLBMKGEF = 12;</code>
       * @return The unk3250KKDFLBMKGEF.
       */
      @java.lang.Override
      public long getUnk3250KKDFLBMKGEF() {
        return unk3250KKDFLBMKGEF_;
      }
      /**
       * <code>uint64 Unk3250_KKDFLBMKGEF = 12;</code>
       * @param value The unk3250KKDFLBMKGEF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250KKDFLBMKGEF(long value) {
        
        unk3250KKDFLBMKGEF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 Unk3250_KKDFLBMKGEF = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250KKDFLBMKGEF() {
        
        unk3250KKDFLBMKGEF_ = 0L;
        onChanged();
        return this;
      }

      private long unk3250EPHAABKNLHC_ ;
      /**
       * <code>uint64 Unk3250_EPHAABKNLHC = 15;</code>
       * @return The unk3250EPHAABKNLHC.
       */
      @java.lang.Override
      public long getUnk3250EPHAABKNLHC() {
        return unk3250EPHAABKNLHC_;
      }
      /**
       * <code>uint64 Unk3250_EPHAABKNLHC = 15;</code>
       * @param value The unk3250EPHAABKNLHC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250EPHAABKNLHC(long value) {
        
        unk3250EPHAABKNLHC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 Unk3250_EPHAABKNLHC = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250EPHAABKNLHC() {
        
        unk3250EPHAABKNLHC_ = 0L;
        onChanged();
        return this;
      }

      private int buffId_ ;
      /**
       * <code>uint32 buff_id = 13;</code>
       * @return The buffId.
       */
      @java.lang.Override
      public int getBuffId() {
        return buffId_;
      }
      /**
       * <code>uint32 buff_id = 13;</code>
       * @param value The buffId to set.
       * @return This builder for chaining.
       */
      public Builder setBuffId(int value) {
        
        buffId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buff_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuffId() {
        
        buffId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_OMCBMAHOLHB)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_OMCBMAHOLHB)
    private static final emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB();
    }

    public static emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_OMCBMAHOLHB>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_OMCBMAHOLHB>() {
      @java.lang.Override
      public Unk3000_OMCBMAHOLHB parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3000_OMCBMAHOLHB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_OMCBMAHOLHB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3000OMCBMAHOLHB.Unk3000_OMCBMAHOLHB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_OMCBMAHOLHB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_OMCBMAHOLHB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_OMCBMAHOLHB.proto\"`\n\023Unk3000_O" +
      "MCBMAHOLHB\022\033\n\023Unk3250_KKDFLBMKGEF\030\014 \001(\004\022" +
      "\033\n\023Unk3250_EPHAABKNLHC\030\017 \001(\004\022\017\n\007buff_id\030" +
      "\r \001(\rB\036\n\034emu.grasscutter.net.newprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_OMCBMAHOLHB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_OMCBMAHOLHB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_OMCBMAHOLHB_descriptor,
        new java.lang.String[] { "Unk3250KKDFLBMKGEF", "Unk3250EPHAABKNLHC", "BuffId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
