// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2800_PHPHMILPOLC.proto

package emu.grasscutter.net.newproto;

public final class Unk2800PHPHMILPOLC {
  private Unk2800PHPHMILPOLC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2800_PHPHMILPOLCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2800_PHPHMILPOLC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk2800_CLOCMPFBGMD = 9;</code>
     * @return The unk2800CLOCMPFBGMD.
     */
    int getUnk2800CLOCMPFBGMD();

    /**
     * <code>.Unk2800_FDLKPKFOIIK state = 7;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.Unk2800_FDLKPKFOIIK state = 7;</code>
     * @return The state.
     */
    emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK getState();
  }
  /**
   * Protobuf type {@code Unk2800_PHPHMILPOLC}
   */
  public static final class Unk2800_PHPHMILPOLC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2800_PHPHMILPOLC)
      Unk2800_PHPHMILPOLCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2800_PHPHMILPOLC.newBuilder() to construct.
    private Unk2800_PHPHMILPOLC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2800_PHPHMILPOLC() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2800_PHPHMILPOLC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.internal_static_Unk2800_PHPHMILPOLC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.internal_static_Unk2800_PHPHMILPOLC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.class, emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.Builder.class);
    }

    public static final int UNK2800_CLOCMPFBGMD_FIELD_NUMBER = 9;
    private int unk2800CLOCMPFBGMD_;
    /**
     * <code>uint32 Unk2800_CLOCMPFBGMD = 9;</code>
     * @return The unk2800CLOCMPFBGMD.
     */
    @java.lang.Override
    public int getUnk2800CLOCMPFBGMD() {
      return unk2800CLOCMPFBGMD_;
    }

    public static final int STATE_FIELD_NUMBER = 7;
    private int state_;
    /**
     * <code>.Unk2800_FDLKPKFOIIK state = 7;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.Unk2800_FDLKPKFOIIK state = 7;</code>
     * @return The state.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK getState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK result = emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK.valueOf(state_);
      return result == null ? emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK.UNRECOGNIZED : result;
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
      if (state_ != emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK.Unk2800_FDLKPKFOIIK_NONE.getNumber()) {
        output.writeEnum(7, state_);
      }
      if (unk2800CLOCMPFBGMD_ != 0) {
        output.writeUInt32(9, unk2800CLOCMPFBGMD_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (state_ != emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK.Unk2800_FDLKPKFOIIK_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, state_);
      }
      if (unk2800CLOCMPFBGMD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, unk2800CLOCMPFBGMD_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC other = (emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC) obj;

      if (getUnk2800CLOCMPFBGMD()
          != other.getUnk2800CLOCMPFBGMD()) return false;
      if (state_ != other.state_) return false;
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
      hash = (37 * hash) + UNK2800_CLOCMPFBGMD_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2800CLOCMPFBGMD();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC prototype) {
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
     * Protobuf type {@code Unk2800_PHPHMILPOLC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2800_PHPHMILPOLC)
        emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.internal_static_Unk2800_PHPHMILPOLC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.internal_static_Unk2800_PHPHMILPOLC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.class, emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk2800CLOCMPFBGMD_ = 0;

        state_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.internal_static_Unk2800_PHPHMILPOLC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC build() {
        emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC buildPartial() {
        emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC result = new emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC(this);
        result.unk2800CLOCMPFBGMD_ = unk2800CLOCMPFBGMD_;
        result.state_ = state_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC other) {
        if (other == emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC.getDefaultInstance()) return this;
        if (other.getUnk2800CLOCMPFBGMD() != 0) {
          setUnk2800CLOCMPFBGMD(other.getUnk2800CLOCMPFBGMD());
        }
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
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
                state_ = input.readEnum();

                break;
              } // case 56
              case 72: {
                unk2800CLOCMPFBGMD_ = input.readUInt32();

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

      private int unk2800CLOCMPFBGMD_ ;
      /**
       * <code>uint32 Unk2800_CLOCMPFBGMD = 9;</code>
       * @return The unk2800CLOCMPFBGMD.
       */
      @java.lang.Override
      public int getUnk2800CLOCMPFBGMD() {
        return unk2800CLOCMPFBGMD_;
      }
      /**
       * <code>uint32 Unk2800_CLOCMPFBGMD = 9;</code>
       * @param value The unk2800CLOCMPFBGMD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800CLOCMPFBGMD(int value) {
        
        unk2800CLOCMPFBGMD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2800_CLOCMPFBGMD = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2800CLOCMPFBGMD() {
        
        unk2800CLOCMPFBGMD_ = 0;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.Unk2800_FDLKPKFOIIK state = 7;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.Unk2800_FDLKPKFOIIK state = 7;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2800_FDLKPKFOIIK state = 7;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK getState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK result = emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK.valueOf(state_);
        return result == null ? emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk2800_FDLKPKFOIIK state = 7;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.Unk2800_FDLKPKFOIIK value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2800_FDLKPKFOIIK state = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2800_PHPHMILPOLC)
    }

    // @@protoc_insertion_point(class_scope:Unk2800_PHPHMILPOLC)
    private static final emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC();
    }

    public static emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2800_PHPHMILPOLC>
        PARSER = new com.google.protobuf.AbstractParser<Unk2800_PHPHMILPOLC>() {
      @java.lang.Override
      public Unk2800_PHPHMILPOLC parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2800_PHPHMILPOLC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2800_PHPHMILPOLC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2800PHPHMILPOLC.Unk2800_PHPHMILPOLC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2800_PHPHMILPOLC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2800_PHPHMILPOLC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2800_PHPHMILPOLC.proto\032\031Unk2800_FDL" +
      "KPKFOIIK.proto\"W\n\023Unk2800_PHPHMILPOLC\022\033\n" +
      "\023Unk2800_CLOCMPFBGMD\030\t \001(\r\022#\n\005state\030\007 \001(" +
      "\0162\024.Unk2800_FDLKPKFOIIKB\036\n\034emu.grasscutt" +
      "er.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.getDescriptor(),
        });
    internal_static_Unk2800_PHPHMILPOLC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2800_PHPHMILPOLC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2800_PHPHMILPOLC_descriptor,
        new java.lang.String[] { "Unk2800CLOCMPFBGMD", "State", });
    emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
