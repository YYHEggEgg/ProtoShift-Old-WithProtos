// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2800_CHEDEMEDPPM.proto

package emu.grasscutter.net.newproto;

public final class Unk2800CHEDEMEDPPM {
  private Unk2800CHEDEMEDPPM() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2800_CHEDEMEDPPMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2800_CHEDEMEDPPM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 coin = 13;</code>
     * @return The coin.
     */
    int getCoin();

    /**
     * <code>uint32 Unk3250_HNECEGNMKNK = 2;</code>
     * @return The unk3250HNECEGNMKNK.
     */
    int getUnk3250HNECEGNMKNK();

    /**
     * <code>uint32 Unk3250_FBACMOFGPGJ = 15;</code>
     * @return The unk3250FBACMOFGPGJ.
     */
    int getUnk3250FBACMOFGPGJ();

    /**
     * <code>uint32 point_id = 10;</code>
     * @return The pointId.
     */
    int getPointId();
  }
  /**
   * <pre>
   * CmdId: 5524
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2800_CHEDEMEDPPM}
   */
  public static final class Unk2800_CHEDEMEDPPM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2800_CHEDEMEDPPM)
      Unk2800_CHEDEMEDPPMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2800_CHEDEMEDPPM.newBuilder() to construct.
    private Unk2800_CHEDEMEDPPM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2800_CHEDEMEDPPM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2800_CHEDEMEDPPM();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.internal_static_Unk2800_CHEDEMEDPPM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.internal_static_Unk2800_CHEDEMEDPPM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM.class, emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM.Builder.class);
    }

    public static final int COIN_FIELD_NUMBER = 13;
    private int coin_;
    /**
     * <code>uint32 coin = 13;</code>
     * @return The coin.
     */
    @java.lang.Override
    public int getCoin() {
      return coin_;
    }

    public static final int UNK3250_HNECEGNMKNK_FIELD_NUMBER = 2;
    private int unk3250HNECEGNMKNK_;
    /**
     * <code>uint32 Unk3250_HNECEGNMKNK = 2;</code>
     * @return The unk3250HNECEGNMKNK.
     */
    @java.lang.Override
    public int getUnk3250HNECEGNMKNK() {
      return unk3250HNECEGNMKNK_;
    }

    public static final int UNK3250_FBACMOFGPGJ_FIELD_NUMBER = 15;
    private int unk3250FBACMOFGPGJ_;
    /**
     * <code>uint32 Unk3250_FBACMOFGPGJ = 15;</code>
     * @return The unk3250FBACMOFGPGJ.
     */
    @java.lang.Override
    public int getUnk3250FBACMOFGPGJ() {
      return unk3250FBACMOFGPGJ_;
    }

    public static final int POINT_ID_FIELD_NUMBER = 10;
    private int pointId_;
    /**
     * <code>uint32 point_id = 10;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
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
      if (unk3250HNECEGNMKNK_ != 0) {
        output.writeUInt32(2, unk3250HNECEGNMKNK_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(10, pointId_);
      }
      if (coin_ != 0) {
        output.writeUInt32(13, coin_);
      }
      if (unk3250FBACMOFGPGJ_ != 0) {
        output.writeUInt32(15, unk3250FBACMOFGPGJ_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250HNECEGNMKNK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk3250HNECEGNMKNK_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, pointId_);
      }
      if (coin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, coin_);
      }
      if (unk3250FBACMOFGPGJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, unk3250FBACMOFGPGJ_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM other = (emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM) obj;

      if (getCoin()
          != other.getCoin()) return false;
      if (getUnk3250HNECEGNMKNK()
          != other.getUnk3250HNECEGNMKNK()) return false;
      if (getUnk3250FBACMOFGPGJ()
          != other.getUnk3250FBACMOFGPGJ()) return false;
      if (getPointId()
          != other.getPointId()) return false;
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
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin();
      hash = (37 * hash) + UNK3250_HNECEGNMKNK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250HNECEGNMKNK();
      hash = (37 * hash) + UNK3250_FBACMOFGPGJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250FBACMOFGPGJ();
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM prototype) {
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
     * CmdId: 5524
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2800_CHEDEMEDPPM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2800_CHEDEMEDPPM)
        emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.internal_static_Unk2800_CHEDEMEDPPM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.internal_static_Unk2800_CHEDEMEDPPM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM.class, emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        coin_ = 0;

        unk3250HNECEGNMKNK_ = 0;

        unk3250FBACMOFGPGJ_ = 0;

        pointId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.internal_static_Unk2800_CHEDEMEDPPM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM build() {
        emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM buildPartial() {
        emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM result = new emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM(this);
        result.coin_ = coin_;
        result.unk3250HNECEGNMKNK_ = unk3250HNECEGNMKNK_;
        result.unk3250FBACMOFGPGJ_ = unk3250FBACMOFGPGJ_;
        result.pointId_ = pointId_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM other) {
        if (other == emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM.getDefaultInstance()) return this;
        if (other.getCoin() != 0) {
          setCoin(other.getCoin());
        }
        if (other.getUnk3250HNECEGNMKNK() != 0) {
          setUnk3250HNECEGNMKNK(other.getUnk3250HNECEGNMKNK());
        }
        if (other.getUnk3250FBACMOFGPGJ() != 0) {
          setUnk3250FBACMOFGPGJ(other.getUnk3250FBACMOFGPGJ());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
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
              case 16: {
                unk3250HNECEGNMKNK_ = input.readUInt32();

                break;
              } // case 16
              case 80: {
                pointId_ = input.readUInt32();

                break;
              } // case 80
              case 104: {
                coin_ = input.readUInt32();

                break;
              } // case 104
              case 120: {
                unk3250FBACMOFGPGJ_ = input.readUInt32();

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

      private int coin_ ;
      /**
       * <code>uint32 coin = 13;</code>
       * @return The coin.
       */
      @java.lang.Override
      public int getCoin() {
        return coin_;
      }
      /**
       * <code>uint32 coin = 13;</code>
       * @param value The coin to set.
       * @return This builder for chaining.
       */
      public Builder setCoin(int value) {
        
        coin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoin() {
        
        coin_ = 0;
        onChanged();
        return this;
      }

      private int unk3250HNECEGNMKNK_ ;
      /**
       * <code>uint32 Unk3250_HNECEGNMKNK = 2;</code>
       * @return The unk3250HNECEGNMKNK.
       */
      @java.lang.Override
      public int getUnk3250HNECEGNMKNK() {
        return unk3250HNECEGNMKNK_;
      }
      /**
       * <code>uint32 Unk3250_HNECEGNMKNK = 2;</code>
       * @param value The unk3250HNECEGNMKNK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250HNECEGNMKNK(int value) {
        
        unk3250HNECEGNMKNK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_HNECEGNMKNK = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250HNECEGNMKNK() {
        
        unk3250HNECEGNMKNK_ = 0;
        onChanged();
        return this;
      }

      private int unk3250FBACMOFGPGJ_ ;
      /**
       * <code>uint32 Unk3250_FBACMOFGPGJ = 15;</code>
       * @return The unk3250FBACMOFGPGJ.
       */
      @java.lang.Override
      public int getUnk3250FBACMOFGPGJ() {
        return unk3250FBACMOFGPGJ_;
      }
      /**
       * <code>uint32 Unk3250_FBACMOFGPGJ = 15;</code>
       * @param value The unk3250FBACMOFGPGJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250FBACMOFGPGJ(int value) {
        
        unk3250FBACMOFGPGJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_FBACMOFGPGJ = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250FBACMOFGPGJ() {
        
        unk3250FBACMOFGPGJ_ = 0;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 10;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 10;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2800_CHEDEMEDPPM)
    }

    // @@protoc_insertion_point(class_scope:Unk2800_CHEDEMEDPPM)
    private static final emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM();
    }

    public static emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2800_CHEDEMEDPPM>
        PARSER = new com.google.protobuf.AbstractParser<Unk2800_CHEDEMEDPPM>() {
      @java.lang.Override
      public Unk2800_CHEDEMEDPPM parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2800_CHEDEMEDPPM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2800_CHEDEMEDPPM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2800CHEDEMEDPPM.Unk2800_CHEDEMEDPPM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2800_CHEDEMEDPPM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2800_CHEDEMEDPPM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2800_CHEDEMEDPPM.proto\"o\n\023Unk2800_C" +
      "HEDEMEDPPM\022\014\n\004coin\030\r \001(\r\022\033\n\023Unk3250_HNEC" +
      "EGNMKNK\030\002 \001(\r\022\033\n\023Unk3250_FBACMOFGPGJ\030\017 \001" +
      "(\r\022\020\n\010point_id\030\n \001(\rB\036\n\034emu.grasscutter." +
      "net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2800_CHEDEMEDPPM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2800_CHEDEMEDPPM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2800_CHEDEMEDPPM_descriptor,
        new java.lang.String[] { "Coin", "Unk3250HNECEGNMKNK", "Unk3250FBACMOFGPGJ", "PointId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
