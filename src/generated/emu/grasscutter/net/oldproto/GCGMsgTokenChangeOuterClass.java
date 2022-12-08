// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgTokenChange.proto

package emu.grasscutter.net.oldproto;

public final class GCGMsgTokenChangeOuterClass {
  private GCGMsgTokenChangeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgTokenChangeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgTokenChange)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 before = 13;</code>
     * @return The before.
     */
    int getBefore();

    /**
     * <code>uint32 token_type = 4;</code>
     * @return The tokenType.
     */
    int getTokenType();

    /**
     * <code>uint32 card_guid = 2;</code>
     * @return The cardGuid.
     */
    int getCardGuid();

    /**
     * <code>uint32 after = 11;</code>
     * @return The after.
     */
    int getAfter();

    /**
     * <code>.GCGReason reason = 7;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GCGReason reason = 7;</code>
     * @return The reason.
     */
    emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason getReason();
  }
  /**
   * Protobuf type {@code GCGMsgTokenChange}
   */
  public static final class GCGMsgTokenChange extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgTokenChange)
      GCGMsgTokenChangeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgTokenChange.newBuilder() to construct.
    private GCGMsgTokenChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgTokenChange() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgTokenChange();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.internal_static_GCGMsgTokenChange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.internal_static_GCGMsgTokenChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange.class, emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange.Builder.class);
    }

    public static final int BEFORE_FIELD_NUMBER = 13;
    private int before_;
    /**
     * <code>uint32 before = 13;</code>
     * @return The before.
     */
    @java.lang.Override
    public int getBefore() {
      return before_;
    }

    public static final int TOKEN_TYPE_FIELD_NUMBER = 4;
    private int tokenType_;
    /**
     * <code>uint32 token_type = 4;</code>
     * @return The tokenType.
     */
    @java.lang.Override
    public int getTokenType() {
      return tokenType_;
    }

    public static final int CARD_GUID_FIELD_NUMBER = 2;
    private int cardGuid_;
    /**
     * <code>uint32 card_guid = 2;</code>
     * @return The cardGuid.
     */
    @java.lang.Override
    public int getCardGuid() {
      return cardGuid_;
    }

    public static final int AFTER_FIELD_NUMBER = 11;
    private int after_;
    /**
     * <code>uint32 after = 11;</code>
     * @return The after.
     */
    @java.lang.Override
    public int getAfter() {
      return after_;
    }

    public static final int REASON_FIELD_NUMBER = 7;
    private int reason_;
    /**
     * <code>.GCGReason reason = 7;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GCGReason reason = 7;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason result = emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
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
      if (cardGuid_ != 0) {
        output.writeUInt32(2, cardGuid_);
      }
      if (tokenType_ != 0) {
        output.writeUInt32(4, tokenType_);
      }
      if (reason_ != emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        output.writeEnum(7, reason_);
      }
      if (after_ != 0) {
        output.writeUInt32(11, after_);
      }
      if (before_ != 0) {
        output.writeUInt32(13, before_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, cardGuid_);
      }
      if (tokenType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, tokenType_);
      }
      if (reason_ != emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, reason_);
      }
      if (after_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, after_);
      }
      if (before_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, before_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange other = (emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange) obj;

      if (getBefore()
          != other.getBefore()) return false;
      if (getTokenType()
          != other.getTokenType()) return false;
      if (getCardGuid()
          != other.getCardGuid()) return false;
      if (getAfter()
          != other.getAfter()) return false;
      if (reason_ != other.reason_) return false;
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
      hash = (37 * hash) + BEFORE_FIELD_NUMBER;
      hash = (53 * hash) + getBefore();
      hash = (37 * hash) + TOKEN_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getTokenType();
      hash = (37 * hash) + CARD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getCardGuid();
      hash = (37 * hash) + AFTER_FIELD_NUMBER;
      hash = (53 * hash) + getAfter();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange prototype) {
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
     * Protobuf type {@code GCGMsgTokenChange}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgTokenChange)
        emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.internal_static_GCGMsgTokenChange_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.internal_static_GCGMsgTokenChange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange.class, emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        before_ = 0;

        tokenType_ = 0;

        cardGuid_ = 0;

        after_ = 0;

        reason_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.internal_static_GCGMsgTokenChange_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange build() {
        emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange buildPartial() {
        emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange result = new emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange(this);
        result.before_ = before_;
        result.tokenType_ = tokenType_;
        result.cardGuid_ = cardGuid_;
        result.after_ = after_;
        result.reason_ = reason_;
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
        if (other instanceof emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange) {
          return mergeFrom((emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange other) {
        if (other == emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange.getDefaultInstance()) return this;
        if (other.getBefore() != 0) {
          setBefore(other.getBefore());
        }
        if (other.getTokenType() != 0) {
          setTokenType(other.getTokenType());
        }
        if (other.getCardGuid() != 0) {
          setCardGuid(other.getCardGuid());
        }
        if (other.getAfter() != 0) {
          setAfter(other.getAfter());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
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
                cardGuid_ = input.readUInt32();

                break;
              } // case 16
              case 32: {
                tokenType_ = input.readUInt32();

                break;
              } // case 32
              case 56: {
                reason_ = input.readEnum();

                break;
              } // case 56
              case 88: {
                after_ = input.readUInt32();

                break;
              } // case 88
              case 104: {
                before_ = input.readUInt32();

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

      private int before_ ;
      /**
       * <code>uint32 before = 13;</code>
       * @return The before.
       */
      @java.lang.Override
      public int getBefore() {
        return before_;
      }
      /**
       * <code>uint32 before = 13;</code>
       * @param value The before to set.
       * @return This builder for chaining.
       */
      public Builder setBefore(int value) {
        
        before_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 before = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearBefore() {
        
        before_ = 0;
        onChanged();
        return this;
      }

      private int tokenType_ ;
      /**
       * <code>uint32 token_type = 4;</code>
       * @return The tokenType.
       */
      @java.lang.Override
      public int getTokenType() {
        return tokenType_;
      }
      /**
       * <code>uint32 token_type = 4;</code>
       * @param value The tokenType to set.
       * @return This builder for chaining.
       */
      public Builder setTokenType(int value) {
        
        tokenType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 token_type = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTokenType() {
        
        tokenType_ = 0;
        onChanged();
        return this;
      }

      private int cardGuid_ ;
      /**
       * <code>uint32 card_guid = 2;</code>
       * @return The cardGuid.
       */
      @java.lang.Override
      public int getCardGuid() {
        return cardGuid_;
      }
      /**
       * <code>uint32 card_guid = 2;</code>
       * @param value The cardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuid(int value) {
        
        cardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_guid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuid() {
        
        cardGuid_ = 0;
        onChanged();
        return this;
      }

      private int after_ ;
      /**
       * <code>uint32 after = 11;</code>
       * @return The after.
       */
      @java.lang.Override
      public int getAfter() {
        return after_;
      }
      /**
       * <code>uint32 after = 11;</code>
       * @param value The after to set.
       * @return This builder for chaining.
       */
      public Builder setAfter(int value) {
        
        after_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 after = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAfter() {
        
        after_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.GCGReason reason = 7;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GCGReason reason = 7;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 7;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason result = emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGReason reason = 7;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGMsgTokenChange)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgTokenChange)
    private static final emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange();
    }

    public static emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgTokenChange>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgTokenChange>() {
      @java.lang.Override
      public GCGMsgTokenChange parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGMsgTokenChange> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgTokenChange> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.GCGMsgTokenChangeOuterClass.GCGMsgTokenChange getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgTokenChange_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgTokenChange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GCGMsgTokenChange.proto\032\017GCGReason.pro" +
      "to\"u\n\021GCGMsgTokenChange\022\016\n\006before\030\r \001(\r\022" +
      "\022\n\ntoken_type\030\004 \001(\r\022\021\n\tcard_guid\030\002 \001(\r\022\r" +
      "\n\005after\030\013 \001(\r\022\032\n\006reason\030\007 \001(\0162\n.GCGReaso" +
      "nB\036\n\034emu.grasscutter.net.oldprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.GCGReasonOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgTokenChange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgTokenChange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgTokenChange_descriptor,
        new java.lang.String[] { "Before", "TokenType", "CardGuid", "After", "Reason", });
    emu.grasscutter.net.oldproto.GCGReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
