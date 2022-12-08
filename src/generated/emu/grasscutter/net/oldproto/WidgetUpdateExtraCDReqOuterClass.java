// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetUpdateExtraCDReq.proto

package emu.grasscutter.net.oldproto;

public final class WidgetUpdateExtraCDReqOuterClass {
  private WidgetUpdateExtraCDReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetUpdateExtraCDReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetUpdateExtraCDReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 material_id = 14;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>.WidgetExtraCdType extra_cd_type = 10;</code>
     * @return The enum numeric value on the wire for extraCdType.
     */
    int getExtraCdTypeValue();
    /**
     * <code>.WidgetExtraCdType extra_cd_type = 10;</code>
     * @return The extraCdType.
     */
    emu.grasscutter.net.oldproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType getExtraCdType();

    /**
     * <code>uint32 cd_group = 7;</code>
     * @return The cdGroup.
     */
    int getCdGroup();
  }
  /**
   * <pre>
   * CmdId: 5960
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code WidgetUpdateExtraCDReq}
   */
  public static final class WidgetUpdateExtraCDReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetUpdateExtraCDReq)
      WidgetUpdateExtraCDReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetUpdateExtraCDReq.newBuilder() to construct.
    private WidgetUpdateExtraCDReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetUpdateExtraCDReq() {
      extraCdType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetUpdateExtraCDReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.internal_static_WidgetUpdateExtraCDReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.internal_static_WidgetUpdateExtraCDReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq.class, emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq.Builder.class);
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 14;
    private int materialId_;
    /**
     * <code>uint32 material_id = 14;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int EXTRA_CD_TYPE_FIELD_NUMBER = 10;
    private int extraCdType_;
    /**
     * <code>.WidgetExtraCdType extra_cd_type = 10;</code>
     * @return The enum numeric value on the wire for extraCdType.
     */
    @java.lang.Override public int getExtraCdTypeValue() {
      return extraCdType_;
    }
    /**
     * <code>.WidgetExtraCdType extra_cd_type = 10;</code>
     * @return The extraCdType.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType getExtraCdType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType result = emu.grasscutter.net.oldproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType.valueOf(extraCdType_);
      return result == null ? emu.grasscutter.net.oldproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType.UNRECOGNIZED : result;
    }

    public static final int CD_GROUP_FIELD_NUMBER = 7;
    private int cdGroup_;
    /**
     * <code>uint32 cd_group = 7;</code>
     * @return The cdGroup.
     */
    @java.lang.Override
    public int getCdGroup() {
      return cdGroup_;
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
      if (cdGroup_ != 0) {
        output.writeUInt32(7, cdGroup_);
      }
      if (extraCdType_ != emu.grasscutter.net.oldproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType.WIDGET_EXTRA_CD_TYPE_NONE.getNumber()) {
        output.writeEnum(10, extraCdType_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(14, materialId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cdGroup_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, cdGroup_);
      }
      if (extraCdType_ != emu.grasscutter.net.oldproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType.WIDGET_EXTRA_CD_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(10, extraCdType_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, materialId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq other = (emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq) obj;

      if (getMaterialId()
          != other.getMaterialId()) return false;
      if (extraCdType_ != other.extraCdType_) return false;
      if (getCdGroup()
          != other.getCdGroup()) return false;
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
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (37 * hash) + EXTRA_CD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + extraCdType_;
      hash = (37 * hash) + CD_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getCdGroup();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq prototype) {
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
     * CmdId: 5960
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code WidgetUpdateExtraCDReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetUpdateExtraCDReq)
        emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.internal_static_WidgetUpdateExtraCDReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.internal_static_WidgetUpdateExtraCDReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq.class, emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        materialId_ = 0;

        extraCdType_ = 0;

        cdGroup_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.internal_static_WidgetUpdateExtraCDReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq build() {
        emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq buildPartial() {
        emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq result = new emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq(this);
        result.materialId_ = materialId_;
        result.extraCdType_ = extraCdType_;
        result.cdGroup_ = cdGroup_;
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
        if (other instanceof emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq other) {
        if (other == emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq.getDefaultInstance()) return this;
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
        }
        if (other.extraCdType_ != 0) {
          setExtraCdTypeValue(other.getExtraCdTypeValue());
        }
        if (other.getCdGroup() != 0) {
          setCdGroup(other.getCdGroup());
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
              case 56: {
                cdGroup_ = input.readUInt32();

                break;
              } // case 56
              case 80: {
                extraCdType_ = input.readEnum();

                break;
              } // case 80
              case 112: {
                materialId_ = input.readUInt32();

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

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 14;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 14;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
        onChanged();
        return this;
      }

      private int extraCdType_ = 0;
      /**
       * <code>.WidgetExtraCdType extra_cd_type = 10;</code>
       * @return The enum numeric value on the wire for extraCdType.
       */
      @java.lang.Override public int getExtraCdTypeValue() {
        return extraCdType_;
      }
      /**
       * <code>.WidgetExtraCdType extra_cd_type = 10;</code>
       * @param value The enum numeric value on the wire for extraCdType to set.
       * @return This builder for chaining.
       */
      public Builder setExtraCdTypeValue(int value) {
        
        extraCdType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetExtraCdType extra_cd_type = 10;</code>
       * @return The extraCdType.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType getExtraCdType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType result = emu.grasscutter.net.oldproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType.valueOf(extraCdType_);
        return result == null ? emu.grasscutter.net.oldproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType.UNRECOGNIZED : result;
      }
      /**
       * <code>.WidgetExtraCdType extra_cd_type = 10;</code>
       * @param value The extraCdType to set.
       * @return This builder for chaining.
       */
      public Builder setExtraCdType(emu.grasscutter.net.oldproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        extraCdType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetExtraCdType extra_cd_type = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearExtraCdType() {
        
        extraCdType_ = 0;
        onChanged();
        return this;
      }

      private int cdGroup_ ;
      /**
       * <code>uint32 cd_group = 7;</code>
       * @return The cdGroup.
       */
      @java.lang.Override
      public int getCdGroup() {
        return cdGroup_;
      }
      /**
       * <code>uint32 cd_group = 7;</code>
       * @param value The cdGroup to set.
       * @return This builder for chaining.
       */
      public Builder setCdGroup(int value) {
        
        cdGroup_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cd_group = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCdGroup() {
        
        cdGroup_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WidgetUpdateExtraCDReq)
    }

    // @@protoc_insertion_point(class_scope:WidgetUpdateExtraCDReq)
    private static final emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq();
    }

    public static emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetUpdateExtraCDReq>
        PARSER = new com.google.protobuf.AbstractParser<WidgetUpdateExtraCDReq>() {
      @java.lang.Override
      public WidgetUpdateExtraCDReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<WidgetUpdateExtraCDReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetUpdateExtraCDReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.WidgetUpdateExtraCDReqOuterClass.WidgetUpdateExtraCDReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetUpdateExtraCDReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetUpdateExtraCDReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034WidgetUpdateExtraCDReq.proto\032\027WidgetEx" +
      "traCdType.proto\"j\n\026WidgetUpdateExtraCDRe" +
      "q\022\023\n\013material_id\030\016 \001(\r\022)\n\rextra_cd_type\030" +
      "\n \001(\0162\022.WidgetExtraCdType\022\020\n\010cd_group\030\007 " +
      "\001(\rB\036\n\034emu.grasscutter.net.oldprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.WidgetExtraCdTypeOuterClass.getDescriptor(),
        });
    internal_static_WidgetUpdateExtraCDReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetUpdateExtraCDReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetUpdateExtraCDReq_descriptor,
        new java.lang.String[] { "MaterialId", "ExtraCdType", "CdGroup", });
    emu.grasscutter.net.oldproto.WidgetExtraCdTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
