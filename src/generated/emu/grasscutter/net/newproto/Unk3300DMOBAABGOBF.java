// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3300_DMOBAABGOBF.proto

package emu.grasscutter.net.newproto;

public final class Unk3300DMOBAABGOBF {
  private Unk3300DMOBAABGOBF() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3300_DMOBAABGOBFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3300_DMOBAABGOBF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_success = 6;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>string Unk3300_NKHMMPMEILJ = 7;</code>
     * @return The unk3300NKHMMPMEILJ.
     */
    java.lang.String getUnk3300NKHMMPMEILJ();
    /**
     * <code>string Unk3300_NKHMMPMEILJ = 7;</code>
     * @return The bytes for unk3300NKHMMPMEILJ.
     */
    com.google.protobuf.ByteString
        getUnk3300NKHMMPMEILJBytes();

    /**
     * <code>string Unk3300_JOCKIGCENGI = 13;</code>
     * @return The unk3300JOCKIGCENGI.
     */
    java.lang.String getUnk3300JOCKIGCENGI();
    /**
     * <code>string Unk3300_JOCKIGCENGI = 13;</code>
     * @return The bytes for unk3300JOCKIGCENGI.
     */
    com.google.protobuf.ByteString
        getUnk3300JOCKIGCENGIBytes();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7193;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code Unk3300_DMOBAABGOBF}
   */
  public static final class Unk3300_DMOBAABGOBF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3300_DMOBAABGOBF)
      Unk3300_DMOBAABGOBFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3300_DMOBAABGOBF.newBuilder() to construct.
    private Unk3300_DMOBAABGOBF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3300_DMOBAABGOBF() {
      unk3300NKHMMPMEILJ_ = "";
      unk3300JOCKIGCENGI_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3300_DMOBAABGOBF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.internal_static_Unk3300_DMOBAABGOBF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.internal_static_Unk3300_DMOBAABGOBF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF.class, emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF.Builder.class);
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 6;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 6;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int UNK3300_NKHMMPMEILJ_FIELD_NUMBER = 7;
    private volatile java.lang.Object unk3300NKHMMPMEILJ_;
    /**
     * <code>string Unk3300_NKHMMPMEILJ = 7;</code>
     * @return The unk3300NKHMMPMEILJ.
     */
    @java.lang.Override
    public java.lang.String getUnk3300NKHMMPMEILJ() {
      java.lang.Object ref = unk3300NKHMMPMEILJ_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unk3300NKHMMPMEILJ_ = s;
        return s;
      }
    }
    /**
     * <code>string Unk3300_NKHMMPMEILJ = 7;</code>
     * @return The bytes for unk3300NKHMMPMEILJ.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUnk3300NKHMMPMEILJBytes() {
      java.lang.Object ref = unk3300NKHMMPMEILJ_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unk3300NKHMMPMEILJ_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UNK3300_JOCKIGCENGI_FIELD_NUMBER = 13;
    private volatile java.lang.Object unk3300JOCKIGCENGI_;
    /**
     * <code>string Unk3300_JOCKIGCENGI = 13;</code>
     * @return The unk3300JOCKIGCENGI.
     */
    @java.lang.Override
    public java.lang.String getUnk3300JOCKIGCENGI() {
      java.lang.Object ref = unk3300JOCKIGCENGI_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unk3300JOCKIGCENGI_ = s;
        return s;
      }
    }
    /**
     * <code>string Unk3300_JOCKIGCENGI = 13;</code>
     * @return The bytes for unk3300JOCKIGCENGI.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUnk3300JOCKIGCENGIBytes() {
      java.lang.Object ref = unk3300JOCKIGCENGI_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unk3300JOCKIGCENGI_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (isSuccess_ != false) {
        output.writeBool(6, isSuccess_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3300NKHMMPMEILJ_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, unk3300NKHMMPMEILJ_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3300JOCKIGCENGI_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, unk3300JOCKIGCENGI_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isSuccess_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3300NKHMMPMEILJ_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, unk3300NKHMMPMEILJ_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3300JOCKIGCENGI_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, unk3300JOCKIGCENGI_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF other = (emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF) obj;

      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (!getUnk3300NKHMMPMEILJ()
          .equals(other.getUnk3300NKHMMPMEILJ())) return false;
      if (!getUnk3300JOCKIGCENGI()
          .equals(other.getUnk3300JOCKIGCENGI())) return false;
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
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + UNK3300_NKHMMPMEILJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300NKHMMPMEILJ().hashCode();
      hash = (37 * hash) + UNK3300_JOCKIGCENGI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300JOCKIGCENGI().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 7193;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code Unk3300_DMOBAABGOBF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3300_DMOBAABGOBF)
        emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.internal_static_Unk3300_DMOBAABGOBF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.internal_static_Unk3300_DMOBAABGOBF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF.class, emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isSuccess_ = false;

        unk3300NKHMMPMEILJ_ = "";

        unk3300JOCKIGCENGI_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.internal_static_Unk3300_DMOBAABGOBF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF build() {
        emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF buildPartial() {
        emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF result = new emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF(this);
        result.isSuccess_ = isSuccess_;
        result.unk3300NKHMMPMEILJ_ = unk3300NKHMMPMEILJ_;
        result.unk3300JOCKIGCENGI_ = unk3300JOCKIGCENGI_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF other) {
        if (other == emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF.getDefaultInstance()) return this;
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (!other.getUnk3300NKHMMPMEILJ().isEmpty()) {
          unk3300NKHMMPMEILJ_ = other.unk3300NKHMMPMEILJ_;
          onChanged();
        }
        if (!other.getUnk3300JOCKIGCENGI().isEmpty()) {
          unk3300JOCKIGCENGI_ = other.unk3300JOCKIGCENGI_;
          onChanged();
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
              case 48: {
                isSuccess_ = input.readBool();

                break;
              } // case 48
              case 58: {
                unk3300NKHMMPMEILJ_ = input.readStringRequireUtf8();

                break;
              } // case 58
              case 106: {
                unk3300JOCKIGCENGI_ = input.readStringRequireUtf8();

                break;
              } // case 106
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

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 6;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 6;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object unk3300NKHMMPMEILJ_ = "";
      /**
       * <code>string Unk3300_NKHMMPMEILJ = 7;</code>
       * @return The unk3300NKHMMPMEILJ.
       */
      public java.lang.String getUnk3300NKHMMPMEILJ() {
        java.lang.Object ref = unk3300NKHMMPMEILJ_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          unk3300NKHMMPMEILJ_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string Unk3300_NKHMMPMEILJ = 7;</code>
       * @return The bytes for unk3300NKHMMPMEILJ.
       */
      public com.google.protobuf.ByteString
          getUnk3300NKHMMPMEILJBytes() {
        java.lang.Object ref = unk3300NKHMMPMEILJ_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          unk3300NKHMMPMEILJ_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Unk3300_NKHMMPMEILJ = 7;</code>
       * @param value The unk3300NKHMMPMEILJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NKHMMPMEILJ(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        unk3300NKHMMPMEILJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3300_NKHMMPMEILJ = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300NKHMMPMEILJ() {
        
        unk3300NKHMMPMEILJ_ = getDefaultInstance().getUnk3300NKHMMPMEILJ();
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3300_NKHMMPMEILJ = 7;</code>
       * @param value The bytes for unk3300NKHMMPMEILJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NKHMMPMEILJBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        unk3300NKHMMPMEILJ_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object unk3300JOCKIGCENGI_ = "";
      /**
       * <code>string Unk3300_JOCKIGCENGI = 13;</code>
       * @return The unk3300JOCKIGCENGI.
       */
      public java.lang.String getUnk3300JOCKIGCENGI() {
        java.lang.Object ref = unk3300JOCKIGCENGI_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          unk3300JOCKIGCENGI_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string Unk3300_JOCKIGCENGI = 13;</code>
       * @return The bytes for unk3300JOCKIGCENGI.
       */
      public com.google.protobuf.ByteString
          getUnk3300JOCKIGCENGIBytes() {
        java.lang.Object ref = unk3300JOCKIGCENGI_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          unk3300JOCKIGCENGI_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Unk3300_JOCKIGCENGI = 13;</code>
       * @param value The unk3300JOCKIGCENGI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300JOCKIGCENGI(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        unk3300JOCKIGCENGI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3300_JOCKIGCENGI = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300JOCKIGCENGI() {
        
        unk3300JOCKIGCENGI_ = getDefaultInstance().getUnk3300JOCKIGCENGI();
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3300_JOCKIGCENGI = 13;</code>
       * @param value The bytes for unk3300JOCKIGCENGI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300JOCKIGCENGIBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        unk3300JOCKIGCENGI_ = value;
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


      // @@protoc_insertion_point(builder_scope:Unk3300_DMOBAABGOBF)
    }

    // @@protoc_insertion_point(class_scope:Unk3300_DMOBAABGOBF)
    private static final emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF();
    }

    public static emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3300_DMOBAABGOBF>
        PARSER = new com.google.protobuf.AbstractParser<Unk3300_DMOBAABGOBF>() {
      @java.lang.Override
      public Unk3300_DMOBAABGOBF parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3300_DMOBAABGOBF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3300_DMOBAABGOBF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3300DMOBAABGOBF.Unk3300_DMOBAABGOBF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3300_DMOBAABGOBF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3300_DMOBAABGOBF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3300_DMOBAABGOBF.proto\"c\n\023Unk3300_D" +
      "MOBAABGOBF\022\022\n\nis_success\030\006 \001(\010\022\033\n\023Unk330" +
      "0_NKHMMPMEILJ\030\007 \001(\t\022\033\n\023Unk3300_JOCKIGCEN" +
      "GI\030\r \001(\tB\036\n\034emu.grasscutter.net.newproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3300_DMOBAABGOBF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3300_DMOBAABGOBF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3300_DMOBAABGOBF_descriptor,
        new java.lang.String[] { "IsSuccess", "Unk3300NKHMMPMEILJ", "Unk3300JOCKIGCENGI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
