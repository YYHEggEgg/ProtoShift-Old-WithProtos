// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_PAFNLEHGDKN.proto

package emu.grasscutter.net.newproto;

public final class Unk3150PAFNLEHGDKN {
  private Unk3150PAFNLEHGDKN() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_PAFNLEHGDKNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_PAFNLEHGDKN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 finish_time = 4;</code>
     * @return The finishTime.
     */
    int getFinishTime();

    /**
     * <code>bool is_succ = 1;</code>
     * @return The isSucc.
     */
    boolean getIsSucc();

    /**
     * <code>bool Unk3250_PNLJLLCACHA = 2;</code>
     * @return The unk3250PNLJLLCACHA.
     */
    boolean getUnk3250PNLJLLCACHA();
  }
  /**
   * <pre>
   * CmdId: 23534
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_PAFNLEHGDKN}
   */
  public static final class Unk3150_PAFNLEHGDKN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_PAFNLEHGDKN)
      Unk3150_PAFNLEHGDKNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_PAFNLEHGDKN.newBuilder() to construct.
    private Unk3150_PAFNLEHGDKN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_PAFNLEHGDKN() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_PAFNLEHGDKN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.internal_static_Unk3150_PAFNLEHGDKN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.internal_static_Unk3150_PAFNLEHGDKN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN.class, emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN.Builder.class);
    }

    public static final int FINISH_TIME_FIELD_NUMBER = 4;
    private int finishTime_;
    /**
     * <code>uint32 finish_time = 4;</code>
     * @return The finishTime.
     */
    @java.lang.Override
    public int getFinishTime() {
      return finishTime_;
    }

    public static final int IS_SUCC_FIELD_NUMBER = 1;
    private boolean isSucc_;
    /**
     * <code>bool is_succ = 1;</code>
     * @return The isSucc.
     */
    @java.lang.Override
    public boolean getIsSucc() {
      return isSucc_;
    }

    public static final int UNK3250_PNLJLLCACHA_FIELD_NUMBER = 2;
    private boolean unk3250PNLJLLCACHA_;
    /**
     * <code>bool Unk3250_PNLJLLCACHA = 2;</code>
     * @return The unk3250PNLJLLCACHA.
     */
    @java.lang.Override
    public boolean getUnk3250PNLJLLCACHA() {
      return unk3250PNLJLLCACHA_;
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
      if (isSucc_ != false) {
        output.writeBool(1, isSucc_);
      }
      if (unk3250PNLJLLCACHA_ != false) {
        output.writeBool(2, unk3250PNLJLLCACHA_);
      }
      if (finishTime_ != 0) {
        output.writeUInt32(4, finishTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSucc_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isSucc_);
      }
      if (unk3250PNLJLLCACHA_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, unk3250PNLJLLCACHA_);
      }
      if (finishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, finishTime_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN other = (emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN) obj;

      if (getFinishTime()
          != other.getFinishTime()) return false;
      if (getIsSucc()
          != other.getIsSucc()) return false;
      if (getUnk3250PNLJLLCACHA()
          != other.getUnk3250PNLJLLCACHA()) return false;
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
      hash = (37 * hash) + FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getFinishTime();
      hash = (37 * hash) + IS_SUCC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSucc());
      hash = (37 * hash) + UNK3250_PNLJLLCACHA_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3250PNLJLLCACHA());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN prototype) {
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
     * CmdId: 23534
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_PAFNLEHGDKN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_PAFNLEHGDKN)
        emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.internal_static_Unk3150_PAFNLEHGDKN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.internal_static_Unk3150_PAFNLEHGDKN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN.class, emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        finishTime_ = 0;

        isSucc_ = false;

        unk3250PNLJLLCACHA_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.internal_static_Unk3150_PAFNLEHGDKN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN build() {
        emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN buildPartial() {
        emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN result = new emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN(this);
        result.finishTime_ = finishTime_;
        result.isSucc_ = isSucc_;
        result.unk3250PNLJLLCACHA_ = unk3250PNLJLLCACHA_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN other) {
        if (other == emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN.getDefaultInstance()) return this;
        if (other.getFinishTime() != 0) {
          setFinishTime(other.getFinishTime());
        }
        if (other.getIsSucc() != false) {
          setIsSucc(other.getIsSucc());
        }
        if (other.getUnk3250PNLJLLCACHA() != false) {
          setUnk3250PNLJLLCACHA(other.getUnk3250PNLJLLCACHA());
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
                isSucc_ = input.readBool();

                break;
              } // case 8
              case 16: {
                unk3250PNLJLLCACHA_ = input.readBool();

                break;
              } // case 16
              case 32: {
                finishTime_ = input.readUInt32();

                break;
              } // case 32
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

      private int finishTime_ ;
      /**
       * <code>uint32 finish_time = 4;</code>
       * @return The finishTime.
       */
      @java.lang.Override
      public int getFinishTime() {
        return finishTime_;
      }
      /**
       * <code>uint32 finish_time = 4;</code>
       * @param value The finishTime to set.
       * @return This builder for chaining.
       */
      public Builder setFinishTime(int value) {
        
        finishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishTime() {
        
        finishTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isSucc_ ;
      /**
       * <code>bool is_succ = 1;</code>
       * @return The isSucc.
       */
      @java.lang.Override
      public boolean getIsSucc() {
        return isSucc_;
      }
      /**
       * <code>bool is_succ = 1;</code>
       * @param value The isSucc to set.
       * @return This builder for chaining.
       */
      public Builder setIsSucc(boolean value) {
        
        isSucc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_succ = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSucc() {
        
        isSucc_ = false;
        onChanged();
        return this;
      }

      private boolean unk3250PNLJLLCACHA_ ;
      /**
       * <code>bool Unk3250_PNLJLLCACHA = 2;</code>
       * @return The unk3250PNLJLLCACHA.
       */
      @java.lang.Override
      public boolean getUnk3250PNLJLLCACHA() {
        return unk3250PNLJLLCACHA_;
      }
      /**
       * <code>bool Unk3250_PNLJLLCACHA = 2;</code>
       * @param value The unk3250PNLJLLCACHA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250PNLJLLCACHA(boolean value) {
        
        unk3250PNLJLLCACHA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3250_PNLJLLCACHA = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250PNLJLLCACHA() {
        
        unk3250PNLJLLCACHA_ = false;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_PAFNLEHGDKN)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_PAFNLEHGDKN)
    private static final emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN();
    }

    public static emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_PAFNLEHGDKN>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_PAFNLEHGDKN>() {
      @java.lang.Override
      public Unk3150_PAFNLEHGDKN parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_PAFNLEHGDKN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_PAFNLEHGDKN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150PAFNLEHGDKN.Unk3150_PAFNLEHGDKN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_PAFNLEHGDKN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_PAFNLEHGDKN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_PAFNLEHGDKN.proto\"X\n\023Unk3150_P" +
      "AFNLEHGDKN\022\023\n\013finish_time\030\004 \001(\r\022\017\n\007is_su" +
      "cc\030\001 \001(\010\022\033\n\023Unk3250_PNLJLLCACHA\030\002 \001(\010B\036\n" +
      "\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_PAFNLEHGDKN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_PAFNLEHGDKN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_PAFNLEHGDKN_descriptor,
        new java.lang.String[] { "FinishTime", "IsSucc", "Unk3250PNLJLLCACHA", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
