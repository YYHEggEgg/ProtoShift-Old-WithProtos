// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PotionDungeonAvatar.proto

package emu.grasscutter.net.oldproto;

public final class PotionDungeonAvatarOuterClass {
  private PotionDungeonAvatarOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PotionDungeonAvatarOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PotionDungeonAvatar)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 avatar_guid = 8;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>bool is_trial = 2;</code>
     * @return The isTrial.
     */
    boolean getIsTrial();
  }
  /**
   * Protobuf type {@code PotionDungeonAvatar}
   */
  public static final class PotionDungeonAvatar extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PotionDungeonAvatar)
      PotionDungeonAvatarOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PotionDungeonAvatar.newBuilder() to construct.
    private PotionDungeonAvatar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PotionDungeonAvatar() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PotionDungeonAvatar();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.internal_static_PotionDungeonAvatar_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.internal_static_PotionDungeonAvatar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar.class, emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar.Builder.class);
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 8;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 8;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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
      if (isTrial_ != false) {
        output.writeBool(2, isTrial_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(8, avatarGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isTrial_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isTrial_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, avatarGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar other = (emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar) obj;

      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getIsTrial()
          != other.getIsTrial()) return false;
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
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + IS_TRIAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTrial());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar prototype) {
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
     * Protobuf type {@code PotionDungeonAvatar}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PotionDungeonAvatar)
        emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatarOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.internal_static_PotionDungeonAvatar_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.internal_static_PotionDungeonAvatar_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar.class, emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        avatarGuid_ = 0L;

        isTrial_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.internal_static_PotionDungeonAvatar_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar build() {
        emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar buildPartial() {
        emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar result = new emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar(this);
        result.avatarGuid_ = avatarGuid_;
        result.isTrial_ = isTrial_;
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
        if (other instanceof emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar) {
          return mergeFrom((emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar other) {
        if (other == emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar.getDefaultInstance()) return this;
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getIsTrial() != false) {
          setIsTrial(other.getIsTrial());
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
                isTrial_ = input.readBool();

                break;
              } // case 16
              case 64: {
                avatarGuid_ = input.readUInt64();

                break;
              } // case 64
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

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 8;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 8;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:PotionDungeonAvatar)
    }

    // @@protoc_insertion_point(class_scope:PotionDungeonAvatar)
    private static final emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar();
    }

    public static emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PotionDungeonAvatar>
        PARSER = new com.google.protobuf.AbstractParser<PotionDungeonAvatar>() {
      @java.lang.Override
      public PotionDungeonAvatar parsePartialFrom(
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

    public static com.google.protobuf.Parser<PotionDungeonAvatar> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PotionDungeonAvatar> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.PotionDungeonAvatarOuterClass.PotionDungeonAvatar getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PotionDungeonAvatar_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PotionDungeonAvatar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031PotionDungeonAvatar.proto\"<\n\023PotionDun" +
      "geonAvatar\022\023\n\013avatar_guid\030\010 \001(\004\022\020\n\010is_tr" +
      "ial\030\002 \001(\010B\036\n\034emu.grasscutter.net.oldprot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PotionDungeonAvatar_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PotionDungeonAvatar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PotionDungeonAvatar_descriptor,
        new java.lang.String[] { "AvatarGuid", "IsTrial", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
