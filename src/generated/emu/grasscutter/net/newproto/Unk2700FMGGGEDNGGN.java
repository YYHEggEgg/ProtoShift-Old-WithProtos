// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_FMGGGEDNGGN.proto

package emu.grasscutter.net.newproto;

public final class Unk2700FMGGGEDNGGN {
  private Unk2700FMGGGEDNGGN() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_FMGGGEDNGGNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_FMGGGEDNGGN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 avatar_id = 1;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>bool is_trial = 2;</code>
     * @return The isTrial.
     */
    boolean getIsTrial();

    /**
     * <code>uint32 costume_id = 3;</code>
     * @return The costumeId.
     */
    int getCostumeId();
  }
  /**
   * Protobuf type {@code Unk2700_FMGGGEDNGGN}
   */
  public static final class Unk2700_FMGGGEDNGGN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_FMGGGEDNGGN)
      Unk2700_FMGGGEDNGGNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_FMGGGEDNGGN.newBuilder() to construct.
    private Unk2700_FMGGGEDNGGN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_FMGGGEDNGGN() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_FMGGGEDNGGN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.internal_static_Unk2700_FMGGGEDNGGN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.internal_static_Unk2700_FMGGGEDNGGN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN.class, emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN.Builder.class);
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 1;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 1;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int IS_TRIAL_FIELD_NUMBER = 2;
    private boolean isTrial_;
    /**
     * <code>bool is_trial = 2;</code>
     * @return The isTrial.
     */
    @java.lang.Override
    public boolean getIsTrial() {
      return isTrial_;
    }

    public static final int COSTUME_ID_FIELD_NUMBER = 3;
    private int costumeId_;
    /**
     * <code>uint32 costume_id = 3;</code>
     * @return The costumeId.
     */
    @java.lang.Override
    public int getCostumeId() {
      return costumeId_;
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
      if (avatarId_ != 0) {
        output.writeUInt32(1, avatarId_);
      }
      if (isTrial_ != false) {
        output.writeBool(2, isTrial_);
      }
      if (costumeId_ != 0) {
        output.writeUInt32(3, costumeId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, avatarId_);
      }
      if (isTrial_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isTrial_);
      }
      if (costumeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, costumeId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN other = (emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN) obj;

      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getIsTrial()
          != other.getIsTrial()) return false;
      if (getCostumeId()
          != other.getCostumeId()) return false;
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
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + IS_TRIAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTrial());
      hash = (37 * hash) + COSTUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCostumeId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN prototype) {
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
     * Protobuf type {@code Unk2700_FMGGGEDNGGN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_FMGGGEDNGGN)
        emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.internal_static_Unk2700_FMGGGEDNGGN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.internal_static_Unk2700_FMGGGEDNGGN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN.class, emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        avatarId_ = 0;

        isTrial_ = false;

        costumeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.internal_static_Unk2700_FMGGGEDNGGN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN build() {
        emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN buildPartial() {
        emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN result = new emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN(this);
        result.avatarId_ = avatarId_;
        result.isTrial_ = isTrial_;
        result.costumeId_ = costumeId_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN other) {
        if (other == emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN.getDefaultInstance()) return this;
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getIsTrial() != false) {
          setIsTrial(other.getIsTrial());
        }
        if (other.getCostumeId() != 0) {
          setCostumeId(other.getCostumeId());
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
                avatarId_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                isTrial_ = input.readBool();

                break;
              } // case 16
              case 24: {
                costumeId_ = input.readUInt32();

                break;
              } // case 24
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

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 1;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 1;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private boolean isTrial_ ;
      /**
       * <code>bool is_trial = 2;</code>
       * @return The isTrial.
       */
      @java.lang.Override
      public boolean getIsTrial() {
        return isTrial_;
      }
      /**
       * <code>bool is_trial = 2;</code>
       * @param value The isTrial to set.
       * @return This builder for chaining.
       */
      public Builder setIsTrial(boolean value) {
        
        isTrial_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_trial = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTrial() {
        
        isTrial_ = false;
        onChanged();
        return this;
      }

      private int costumeId_ ;
      /**
       * <code>uint32 costume_id = 3;</code>
       * @return The costumeId.
       */
      @java.lang.Override
      public int getCostumeId() {
        return costumeId_;
      }
      /**
       * <code>uint32 costume_id = 3;</code>
       * @param value The costumeId to set.
       * @return This builder for chaining.
       */
      public Builder setCostumeId(int value) {
        
        costumeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 costume_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostumeId() {
        
        costumeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_FMGGGEDNGGN)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_FMGGGEDNGGN)
    private static final emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN();
    }

    public static emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_FMGGGEDNGGN>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_FMGGGEDNGGN>() {
      @java.lang.Override
      public Unk2700_FMGGGEDNGGN parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_FMGGGEDNGGN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_FMGGGEDNGGN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700FMGGGEDNGGN.Unk2700_FMGGGEDNGGN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_FMGGGEDNGGN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_FMGGGEDNGGN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_FMGGGEDNGGN.proto\"N\n\023Unk2700_F" +
      "MGGGEDNGGN\022\021\n\tavatar_id\030\001 \001(\r\022\020\n\010is_tria" +
      "l\030\002 \001(\010\022\022\n\ncostume_id\030\003 \001(\rB\036\n\034emu.grass" +
      "cutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_FMGGGEDNGGN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_FMGGGEDNGGN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_FMGGGEDNGGN_descriptor,
        new java.lang.String[] { "AvatarId", "IsTrial", "CostumeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
