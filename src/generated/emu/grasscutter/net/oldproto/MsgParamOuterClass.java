// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MsgParam.proto

package emu.grasscutter.net.oldproto;

public final class MsgParamOuterClass {
  private MsgParamOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MsgParamOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MsgParam)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 int_param = 9;</code>
     * @return Whether the intParam field is set.
     */
    boolean hasIntParam();
    /**
     * <code>uint32 int_param = 9;</code>
     * @return The intParam.
     */
    int getIntParam();

    /**
     * <code>float flt_param = 7;</code>
     * @return Whether the fltParam field is set.
     */
    boolean hasFltParam();
    /**
     * <code>float flt_param = 7;</code>
     * @return The fltParam.
     */
    float getFltParam();

    /**
     * <code>string str_param = 4;</code>
     * @return Whether the strParam field is set.
     */
    boolean hasStrParam();
    /**
     * <code>string str_param = 4;</code>
     * @return The strParam.
     */
    java.lang.String getStrParam();
    /**
     * <code>string str_param = 4;</code>
     * @return The bytes for strParam.
     */
    com.google.protobuf.ByteString
        getStrParamBytes();

    public emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam.ParamCase getParamCase();
  }
  /**
   * Protobuf type {@code MsgParam}
   */
  public static final class MsgParam extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MsgParam)
      MsgParamOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgParam.newBuilder() to construct.
    private MsgParam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgParam() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MsgParam();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.MsgParamOuterClass.internal_static_MsgParam_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.MsgParamOuterClass.internal_static_MsgParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam.class, emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam.Builder.class);
    }

    private int paramCase_ = 0;
    private java.lang.Object param_;
    public enum ParamCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      INT_PARAM(9),
      FLT_PARAM(7),
      STR_PARAM(4),
      PARAM_NOT_SET(0);
      private final int value;
      private ParamCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ParamCase valueOf(int value) {
        return forNumber(value);
      }

      public static ParamCase forNumber(int value) {
        switch (value) {
          case 9: return INT_PARAM;
          case 7: return FLT_PARAM;
          case 4: return STR_PARAM;
          case 0: return PARAM_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ParamCase
    getParamCase() {
      return ParamCase.forNumber(
          paramCase_);
    }

    public static final int INT_PARAM_FIELD_NUMBER = 9;
    /**
     * <code>uint32 int_param = 9;</code>
     * @return Whether the intParam field is set.
     */
    @java.lang.Override
    public boolean hasIntParam() {
      return paramCase_ == 9;
    }
    /**
     * <code>uint32 int_param = 9;</code>
     * @return The intParam.
     */
    @java.lang.Override
    public int getIntParam() {
      if (paramCase_ == 9) {
        return (java.lang.Integer) param_;
      }
      return 0;
    }

    public static final int FLT_PARAM_FIELD_NUMBER = 7;
    /**
     * <code>float flt_param = 7;</code>
     * @return Whether the fltParam field is set.
     */
    @java.lang.Override
    public boolean hasFltParam() {
      return paramCase_ == 7;
    }
    /**
     * <code>float flt_param = 7;</code>
     * @return The fltParam.
     */
    @java.lang.Override
    public float getFltParam() {
      if (paramCase_ == 7) {
        return (java.lang.Float) param_;
      }
      return 0F;
    }

    public static final int STR_PARAM_FIELD_NUMBER = 4;
    /**
     * <code>string str_param = 4;</code>
     * @return Whether the strParam field is set.
     */
    public boolean hasStrParam() {
      return paramCase_ == 4;
    }
    /**
     * <code>string str_param = 4;</code>
     * @return The strParam.
     */
    public java.lang.String getStrParam() {
      java.lang.Object ref = "";
      if (paramCase_ == 4) {
        ref = param_;
      }
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (paramCase_ == 4) {
          param_ = s;
        }
        return s;
      }
    }
    /**
     * <code>string str_param = 4;</code>
     * @return The bytes for strParam.
     */
    public com.google.protobuf.ByteString
        getStrParamBytes() {
      java.lang.Object ref = "";
      if (paramCase_ == 4) {
        ref = param_;
      }
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (paramCase_ == 4) {
          param_ = b;
        }
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
      if (paramCase_ == 4) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, param_);
      }
      if (paramCase_ == 7) {
        output.writeFloat(
            7, (float)((java.lang.Float) param_));
      }
      if (paramCase_ == 9) {
        output.writeUInt32(
            9, (int)((java.lang.Integer) param_));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (paramCase_ == 4) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, param_);
      }
      if (paramCase_ == 7) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(
              7, (float)((java.lang.Float) param_));
      }
      if (paramCase_ == 9) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              9, (int)((java.lang.Integer) param_));
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam other = (emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam) obj;

      if (!getParamCase().equals(other.getParamCase())) return false;
      switch (paramCase_) {
        case 9:
          if (getIntParam()
              != other.getIntParam()) return false;
          break;
        case 7:
          if (java.lang.Float.floatToIntBits(getFltParam())
              != java.lang.Float.floatToIntBits(
                  other.getFltParam())) return false;
          break;
        case 4:
          if (!getStrParam()
              .equals(other.getStrParam())) return false;
          break;
        case 0:
        default:
      }
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
      switch (paramCase_) {
        case 9:
          hash = (37 * hash) + INT_PARAM_FIELD_NUMBER;
          hash = (53 * hash) + getIntParam();
          break;
        case 7:
          hash = (37 * hash) + FLT_PARAM_FIELD_NUMBER;
          hash = (53 * hash) + java.lang.Float.floatToIntBits(
              getFltParam());
          break;
        case 4:
          hash = (37 * hash) + STR_PARAM_FIELD_NUMBER;
          hash = (53 * hash) + getStrParam().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam prototype) {
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
     * Protobuf type {@code MsgParam}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MsgParam)
        emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.MsgParamOuterClass.internal_static_MsgParam_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.MsgParamOuterClass.internal_static_MsgParam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam.class, emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        paramCase_ = 0;
        param_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.MsgParamOuterClass.internal_static_MsgParam_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam build() {
        emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam buildPartial() {
        emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam result = new emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam(this);
        if (paramCase_ == 9) {
          result.param_ = param_;
        }
        if (paramCase_ == 7) {
          result.param_ = param_;
        }
        if (paramCase_ == 4) {
          result.param_ = param_;
        }
        result.paramCase_ = paramCase_;
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
        if (other instanceof emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam) {
          return mergeFrom((emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam other) {
        if (other == emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam.getDefaultInstance()) return this;
        switch (other.getParamCase()) {
          case INT_PARAM: {
            setIntParam(other.getIntParam());
            break;
          }
          case FLT_PARAM: {
            setFltParam(other.getFltParam());
            break;
          }
          case STR_PARAM: {
            paramCase_ = 4;
            param_ = other.param_;
            onChanged();
            break;
          }
          case PARAM_NOT_SET: {
            break;
          }
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
              case 34: {
                java.lang.String s = input.readStringRequireUtf8();
                paramCase_ = 4;
                param_ = s;
                break;
              } // case 34
              case 61: {
                param_ = input.readFloat();
                paramCase_ = 7;
                break;
              } // case 61
              case 72: {
                param_ = input.readUInt32();
                paramCase_ = 9;
                break;
              } // case 72
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
      private int paramCase_ = 0;
      private java.lang.Object param_;
      public ParamCase
          getParamCase() {
        return ParamCase.forNumber(
            paramCase_);
      }

      public Builder clearParam() {
        paramCase_ = 0;
        param_ = null;
        onChanged();
        return this;
      }


      /**
       * <code>uint32 int_param = 9;</code>
       * @return Whether the intParam field is set.
       */
      public boolean hasIntParam() {
        return paramCase_ == 9;
      }
      /**
       * <code>uint32 int_param = 9;</code>
       * @return The intParam.
       */
      public int getIntParam() {
        if (paramCase_ == 9) {
          return (java.lang.Integer) param_;
        }
        return 0;
      }
      /**
       * <code>uint32 int_param = 9;</code>
       * @param value The intParam to set.
       * @return This builder for chaining.
       */
      public Builder setIntParam(int value) {
        paramCase_ = 9;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 int_param = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIntParam() {
        if (paramCase_ == 9) {
          paramCase_ = 0;
          param_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>float flt_param = 7;</code>
       * @return Whether the fltParam field is set.
       */
      public boolean hasFltParam() {
        return paramCase_ == 7;
      }
      /**
       * <code>float flt_param = 7;</code>
       * @return The fltParam.
       */
      public float getFltParam() {
        if (paramCase_ == 7) {
          return (java.lang.Float) param_;
        }
        return 0F;
      }
      /**
       * <code>float flt_param = 7;</code>
       * @param value The fltParam to set.
       * @return This builder for chaining.
       */
      public Builder setFltParam(float value) {
        paramCase_ = 7;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float flt_param = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearFltParam() {
        if (paramCase_ == 7) {
          paramCase_ = 0;
          param_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>string str_param = 4;</code>
       * @return Whether the strParam field is set.
       */
      @java.lang.Override
      public boolean hasStrParam() {
        return paramCase_ == 4;
      }
      /**
       * <code>string str_param = 4;</code>
       * @return The strParam.
       */
      @java.lang.Override
      public java.lang.String getStrParam() {
        java.lang.Object ref = "";
        if (paramCase_ == 4) {
          ref = param_;
        }
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (paramCase_ == 4) {
            param_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string str_param = 4;</code>
       * @return The bytes for strParam.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getStrParamBytes() {
        java.lang.Object ref = "";
        if (paramCase_ == 4) {
          ref = param_;
        }
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          if (paramCase_ == 4) {
            param_ = b;
          }
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string str_param = 4;</code>
       * @param value The strParam to set.
       * @return This builder for chaining.
       */
      public Builder setStrParam(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  paramCase_ = 4;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string str_param = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearStrParam() {
        if (paramCase_ == 4) {
          paramCase_ = 0;
          param_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <code>string str_param = 4;</code>
       * @param value The bytes for strParam to set.
       * @return This builder for chaining.
       */
      public Builder setStrParamBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        paramCase_ = 4;
        param_ = value;
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


      // @@protoc_insertion_point(builder_scope:MsgParam)
    }

    // @@protoc_insertion_point(class_scope:MsgParam)
    private static final emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam();
    }

    public static emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgParam>
        PARSER = new com.google.protobuf.AbstractParser<MsgParam>() {
      @java.lang.Override
      public MsgParam parsePartialFrom(
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

    public static com.google.protobuf.Parser<MsgParam> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgParam> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.MsgParamOuterClass.MsgParam getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MsgParam_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MsgParam_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016MsgParam.proto\"R\n\010MsgParam\022\023\n\tint_para" +
      "m\030\t \001(\rH\000\022\023\n\tflt_param\030\007 \001(\002H\000\022\023\n\tstr_pa" +
      "ram\030\004 \001(\tH\000B\007\n\005paramB\036\n\034emu.grasscutter." +
      "net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MsgParam_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MsgParam_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MsgParam_descriptor,
        new java.lang.String[] { "IntParam", "FltParam", "StrParam", "Param", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
