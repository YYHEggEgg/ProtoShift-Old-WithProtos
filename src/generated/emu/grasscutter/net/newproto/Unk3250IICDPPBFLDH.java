// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3250_IICDPPBFLDH.proto

package emu.grasscutter.net.newproto;

public final class Unk3250IICDPPBFLDH {
  private Unk3250IICDPPBFLDH() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3250_IICDPPBFLDHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3250_IICDPPBFLDH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool Unk3250_HFFDCICAANJ = 2;</code>
     * @return The unk3250HFFDCICAANJ.
     */
    boolean getUnk3250HFFDCICAANJ();

    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 1;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    int getUnk3250PPIHJFNMEFB();
  }
  /**
   * <pre>
   * CmdId: 21843
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3250_IICDPPBFLDH}
   */
  public static final class Unk3250_IICDPPBFLDH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3250_IICDPPBFLDH)
      Unk3250_IICDPPBFLDHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3250_IICDPPBFLDH.newBuilder() to construct.
    private Unk3250_IICDPPBFLDH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3250_IICDPPBFLDH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3250_IICDPPBFLDH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.internal_static_Unk3250_IICDPPBFLDH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.internal_static_Unk3250_IICDPPBFLDH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH.class, emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UNK3250_HFFDCICAANJ_FIELD_NUMBER = 2;
    private boolean unk3250HFFDCICAANJ_;
    /**
     * <code>bool Unk3250_HFFDCICAANJ = 2;</code>
     * @return The unk3250HFFDCICAANJ.
     */
    @java.lang.Override
    public boolean getUnk3250HFFDCICAANJ() {
      return unk3250HFFDCICAANJ_;
    }

    public static final int UNK3250_PPIHJFNMEFB_FIELD_NUMBER = 1;
    private int unk3250PPIHJFNMEFB_;
    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 1;</code>
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
      if (unk3250PPIHJFNMEFB_ != 0) {
        output.writeUInt32(1, unk3250PPIHJFNMEFB_);
      }
      if (unk3250HFFDCICAANJ_ != false) {
        output.writeBool(2, unk3250HFFDCICAANJ_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250PPIHJFNMEFB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3250PPIHJFNMEFB_);
      }
      if (unk3250HFFDCICAANJ_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, unk3250HFFDCICAANJ_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH other = (emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getUnk3250HFFDCICAANJ()
          != other.getUnk3250HFFDCICAANJ()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + UNK3250_HFFDCICAANJ_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3250HFFDCICAANJ());
      hash = (37 * hash) + UNK3250_PPIHJFNMEFB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250PPIHJFNMEFB();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH prototype) {
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
     * CmdId: 21843
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3250_IICDPPBFLDH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3250_IICDPPBFLDH)
        emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.internal_static_Unk3250_IICDPPBFLDH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.internal_static_Unk3250_IICDPPBFLDH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH.class, emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        unk3250HFFDCICAANJ_ = false;

        unk3250PPIHJFNMEFB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.internal_static_Unk3250_IICDPPBFLDH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH build() {
        emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH buildPartial() {
        emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH result = new emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH(this);
        result.retcode_ = retcode_;
        result.unk3250HFFDCICAANJ_ = unk3250HFFDCICAANJ_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH other) {
        if (other == emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getUnk3250HFFDCICAANJ() != false) {
          setUnk3250HFFDCICAANJ(other.getUnk3250HFFDCICAANJ());
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
                unk3250PPIHJFNMEFB_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                unk3250HFFDCICAANJ_ = input.readBool();

                break;
              } // case 16
              case 112: {
                retcode_ = input.readInt32();

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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3250HFFDCICAANJ_ ;
      /**
       * <code>bool Unk3250_HFFDCICAANJ = 2;</code>
       * @return The unk3250HFFDCICAANJ.
       */
      @java.lang.Override
      public boolean getUnk3250HFFDCICAANJ() {
        return unk3250HFFDCICAANJ_;
      }
      /**
       * <code>bool Unk3250_HFFDCICAANJ = 2;</code>
       * @param value The unk3250HFFDCICAANJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250HFFDCICAANJ(boolean value) {
        
        unk3250HFFDCICAANJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3250_HFFDCICAANJ = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250HFFDCICAANJ() {
        
        unk3250HFFDCICAANJ_ = false;
        onChanged();
        return this;
      }

      private int unk3250PPIHJFNMEFB_ ;
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 1;</code>
       * @return The unk3250PPIHJFNMEFB.
       */
      @java.lang.Override
      public int getUnk3250PPIHJFNMEFB() {
        return unk3250PPIHJFNMEFB_;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 1;</code>
       * @param value The unk3250PPIHJFNMEFB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250PPIHJFNMEFB(int value) {
        
        unk3250PPIHJFNMEFB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 1;</code>
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


      // @@protoc_insertion_point(builder_scope:Unk3250_IICDPPBFLDH)
    }

    // @@protoc_insertion_point(class_scope:Unk3250_IICDPPBFLDH)
    private static final emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH();
    }

    public static emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3250_IICDPPBFLDH>
        PARSER = new com.google.protobuf.AbstractParser<Unk3250_IICDPPBFLDH>() {
      @java.lang.Override
      public Unk3250_IICDPPBFLDH parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3250_IICDPPBFLDH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3250_IICDPPBFLDH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3250IICDPPBFLDH.Unk3250_IICDPPBFLDH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3250_IICDPPBFLDH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3250_IICDPPBFLDH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3250_IICDPPBFLDH.proto\"`\n\023Unk3250_I" +
      "ICDPPBFLDH\022\017\n\007retcode\030\016 \001(\005\022\033\n\023Unk3250_H" +
      "FFDCICAANJ\030\002 \001(\010\022\033\n\023Unk3250_PPIHJFNMEFB\030" +
      "\001 \001(\rB\036\n\034emu.grasscutter.net.newprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3250_IICDPPBFLDH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3250_IICDPPBFLDH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3250_IICDPPBFLDH_descriptor,
        new java.lang.String[] { "Retcode", "Unk3250HFFDCICAANJ", "Unk3250PPIHJFNMEFB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
