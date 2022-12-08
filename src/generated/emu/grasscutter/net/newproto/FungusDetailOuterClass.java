// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusDetail.proto

package emu.grasscutter.net.newproto;

public final class FungusDetailOuterClass {
  private FungusDetailOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusDetailOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusDetail)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 name_id = 8;</code>
     * @return The nameId.
     */
    int getNameId();

    /**
     * <code>uint32 Unk3300_EHNBDJPANKL = 2;</code>
     * @return The unk3300EHNBDJPANKL.
     */
    int getUnk3300EHNBDJPANKL();

    /**
     * <code>uint32 fungus_id = 3;</code>
     * @return The fungusId.
     */
    int getFungusId();

    /**
     * <code>bool is_cultivate = 7;</code>
     * @return The isCultivate.
     */
    boolean getIsCultivate();

    /**
     * <code>uint32 Unk3300_GCLBPDJDEDN = 13;</code>
     * @return The unk3300GCLBPDJDEDN.
     */
    int getUnk3300GCLBPDJDEDN();
  }
  /**
   * Protobuf type {@code FungusDetail}
   */
  public static final class FungusDetail extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusDetail)
      FungusDetailOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusDetail.newBuilder() to construct.
    private FungusDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusDetail() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusDetail();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.FungusDetailOuterClass.internal_static_FungusDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.FungusDetailOuterClass.internal_static_FungusDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail.class, emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail.Builder.class);
    }

    public static final int NAME_ID_FIELD_NUMBER = 8;
    private int nameId_;
    /**
     * <code>uint32 name_id = 8;</code>
     * @return The nameId.
     */
    @java.lang.Override
    public int getNameId() {
      return nameId_;
    }

    public static final int UNK3300_EHNBDJPANKL_FIELD_NUMBER = 2;
    private int unk3300EHNBDJPANKL_;
    /**
     * <code>uint32 Unk3300_EHNBDJPANKL = 2;</code>
     * @return The unk3300EHNBDJPANKL.
     */
    @java.lang.Override
    public int getUnk3300EHNBDJPANKL() {
      return unk3300EHNBDJPANKL_;
    }

    public static final int FUNGUS_ID_FIELD_NUMBER = 3;
    private int fungusId_;
    /**
     * <code>uint32 fungus_id = 3;</code>
     * @return The fungusId.
     */
    @java.lang.Override
    public int getFungusId() {
      return fungusId_;
    }

    public static final int IS_CULTIVATE_FIELD_NUMBER = 7;
    private boolean isCultivate_;
    /**
     * <code>bool is_cultivate = 7;</code>
     * @return The isCultivate.
     */
    @java.lang.Override
    public boolean getIsCultivate() {
      return isCultivate_;
    }

    public static final int UNK3300_GCLBPDJDEDN_FIELD_NUMBER = 13;
    private int unk3300GCLBPDJDEDN_;
    /**
     * <code>uint32 Unk3300_GCLBPDJDEDN = 13;</code>
     * @return The unk3300GCLBPDJDEDN.
     */
    @java.lang.Override
    public int getUnk3300GCLBPDJDEDN() {
      return unk3300GCLBPDJDEDN_;
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
      if (unk3300EHNBDJPANKL_ != 0) {
        output.writeUInt32(2, unk3300EHNBDJPANKL_);
      }
      if (fungusId_ != 0) {
        output.writeUInt32(3, fungusId_);
      }
      if (isCultivate_ != false) {
        output.writeBool(7, isCultivate_);
      }
      if (nameId_ != 0) {
        output.writeUInt32(8, nameId_);
      }
      if (unk3300GCLBPDJDEDN_ != 0) {
        output.writeUInt32(13, unk3300GCLBPDJDEDN_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300EHNBDJPANKL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk3300EHNBDJPANKL_);
      }
      if (fungusId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, fungusId_);
      }
      if (isCultivate_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isCultivate_);
      }
      if (nameId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, nameId_);
      }
      if (unk3300GCLBPDJDEDN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3300GCLBPDJDEDN_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail other = (emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail) obj;

      if (getNameId()
          != other.getNameId()) return false;
      if (getUnk3300EHNBDJPANKL()
          != other.getUnk3300EHNBDJPANKL()) return false;
      if (getFungusId()
          != other.getFungusId()) return false;
      if (getIsCultivate()
          != other.getIsCultivate()) return false;
      if (getUnk3300GCLBPDJDEDN()
          != other.getUnk3300GCLBPDJDEDN()) return false;
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
      hash = (37 * hash) + NAME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNameId();
      hash = (37 * hash) + UNK3300_EHNBDJPANKL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300EHNBDJPANKL();
      hash = (37 * hash) + FUNGUS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFungusId();
      hash = (37 * hash) + IS_CULTIVATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsCultivate());
      hash = (37 * hash) + UNK3300_GCLBPDJDEDN_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300GCLBPDJDEDN();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail prototype) {
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
     * Protobuf type {@code FungusDetail}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusDetail)
        emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetailOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.FungusDetailOuterClass.internal_static_FungusDetail_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.FungusDetailOuterClass.internal_static_FungusDetail_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail.class, emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        nameId_ = 0;

        unk3300EHNBDJPANKL_ = 0;

        fungusId_ = 0;

        isCultivate_ = false;

        unk3300GCLBPDJDEDN_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.FungusDetailOuterClass.internal_static_FungusDetail_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail build() {
        emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail buildPartial() {
        emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail result = new emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail(this);
        result.nameId_ = nameId_;
        result.unk3300EHNBDJPANKL_ = unk3300EHNBDJPANKL_;
        result.fungusId_ = fungusId_;
        result.isCultivate_ = isCultivate_;
        result.unk3300GCLBPDJDEDN_ = unk3300GCLBPDJDEDN_;
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
        if (other instanceof emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail) {
          return mergeFrom((emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail other) {
        if (other == emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail.getDefaultInstance()) return this;
        if (other.getNameId() != 0) {
          setNameId(other.getNameId());
        }
        if (other.getUnk3300EHNBDJPANKL() != 0) {
          setUnk3300EHNBDJPANKL(other.getUnk3300EHNBDJPANKL());
        }
        if (other.getFungusId() != 0) {
          setFungusId(other.getFungusId());
        }
        if (other.getIsCultivate() != false) {
          setIsCultivate(other.getIsCultivate());
        }
        if (other.getUnk3300GCLBPDJDEDN() != 0) {
          setUnk3300GCLBPDJDEDN(other.getUnk3300GCLBPDJDEDN());
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
                unk3300EHNBDJPANKL_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                fungusId_ = input.readUInt32();

                break;
              } // case 24
              case 56: {
                isCultivate_ = input.readBool();

                break;
              } // case 56
              case 64: {
                nameId_ = input.readUInt32();

                break;
              } // case 64
              case 104: {
                unk3300GCLBPDJDEDN_ = input.readUInt32();

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

      private int nameId_ ;
      /**
       * <code>uint32 name_id = 8;</code>
       * @return The nameId.
       */
      @java.lang.Override
      public int getNameId() {
        return nameId_;
      }
      /**
       * <code>uint32 name_id = 8;</code>
       * @param value The nameId to set.
       * @return This builder for chaining.
       */
      public Builder setNameId(int value) {
        
        nameId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 name_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearNameId() {
        
        nameId_ = 0;
        onChanged();
        return this;
      }

      private int unk3300EHNBDJPANKL_ ;
      /**
       * <code>uint32 Unk3300_EHNBDJPANKL = 2;</code>
       * @return The unk3300EHNBDJPANKL.
       */
      @java.lang.Override
      public int getUnk3300EHNBDJPANKL() {
        return unk3300EHNBDJPANKL_;
      }
      /**
       * <code>uint32 Unk3300_EHNBDJPANKL = 2;</code>
       * @param value The unk3300EHNBDJPANKL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EHNBDJPANKL(int value) {
        
        unk3300EHNBDJPANKL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_EHNBDJPANKL = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EHNBDJPANKL() {
        
        unk3300EHNBDJPANKL_ = 0;
        onChanged();
        return this;
      }

      private int fungusId_ ;
      /**
       * <code>uint32 fungus_id = 3;</code>
       * @return The fungusId.
       */
      @java.lang.Override
      public int getFungusId() {
        return fungusId_;
      }
      /**
       * <code>uint32 fungus_id = 3;</code>
       * @param value The fungusId to set.
       * @return This builder for chaining.
       */
      public Builder setFungusId(int value) {
        
        fungusId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fungus_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFungusId() {
        
        fungusId_ = 0;
        onChanged();
        return this;
      }

      private boolean isCultivate_ ;
      /**
       * <code>bool is_cultivate = 7;</code>
       * @return The isCultivate.
       */
      @java.lang.Override
      public boolean getIsCultivate() {
        return isCultivate_;
      }
      /**
       * <code>bool is_cultivate = 7;</code>
       * @param value The isCultivate to set.
       * @return This builder for chaining.
       */
      public Builder setIsCultivate(boolean value) {
        
        isCultivate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_cultivate = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCultivate() {
        
        isCultivate_ = false;
        onChanged();
        return this;
      }

      private int unk3300GCLBPDJDEDN_ ;
      /**
       * <code>uint32 Unk3300_GCLBPDJDEDN = 13;</code>
       * @return The unk3300GCLBPDJDEDN.
       */
      @java.lang.Override
      public int getUnk3300GCLBPDJDEDN() {
        return unk3300GCLBPDJDEDN_;
      }
      /**
       * <code>uint32 Unk3300_GCLBPDJDEDN = 13;</code>
       * @param value The unk3300GCLBPDJDEDN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300GCLBPDJDEDN(int value) {
        
        unk3300GCLBPDJDEDN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_GCLBPDJDEDN = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300GCLBPDJDEDN() {
        
        unk3300GCLBPDJDEDN_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FungusDetail)
    }

    // @@protoc_insertion_point(class_scope:FungusDetail)
    private static final emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail();
    }

    public static emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusDetail>
        PARSER = new com.google.protobuf.AbstractParser<FungusDetail>() {
      @java.lang.Override
      public FungusDetail parsePartialFrom(
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

    public static com.google.protobuf.Parser<FungusDetail> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusDetail> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.FungusDetailOuterClass.FungusDetail getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusDetail_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022FungusDetail.proto\"\202\001\n\014FungusDetail\022\017\n" +
      "\007name_id\030\010 \001(\r\022\033\n\023Unk3300_EHNBDJPANKL\030\002 " +
      "\001(\r\022\021\n\tfungus_id\030\003 \001(\r\022\024\n\014is_cultivate\030\007" +
      " \001(\010\022\033\n\023Unk3300_GCLBPDJDEDN\030\r \001(\rB\036\n\034emu" +
      ".grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusDetail_descriptor,
        new java.lang.String[] { "NameId", "Unk3300EHNBDJPANKL", "FungusId", "IsCultivate", "Unk3300GCLBPDJDEDN", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
