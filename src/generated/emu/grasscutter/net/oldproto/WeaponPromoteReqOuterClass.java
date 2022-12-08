// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WeaponPromoteReq.proto

package emu.grasscutter.net.oldproto;

public final class WeaponPromoteReqOuterClass {
  private WeaponPromoteReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WeaponPromoteReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WeaponPromoteReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 target_weapon_guid = 5;</code>
     * @return The targetWeaponGuid.
     */
    long getTargetWeaponGuid();
  }
  /**
   * <pre>
   * CmdId: 622
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code WeaponPromoteReq}
   */
  public static final class WeaponPromoteReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WeaponPromoteReq)
      WeaponPromoteReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WeaponPromoteReq.newBuilder() to construct.
    private WeaponPromoteReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WeaponPromoteReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WeaponPromoteReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.internal_static_WeaponPromoteReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.internal_static_WeaponPromoteReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq.class, emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq.Builder.class);
    }

    public static final int TARGET_WEAPON_GUID_FIELD_NUMBER = 5;
    private long targetWeaponGuid_;
    /**
     * <code>uint64 target_weapon_guid = 5;</code>
     * @return The targetWeaponGuid.
     */
    @java.lang.Override
    public long getTargetWeaponGuid() {
      return targetWeaponGuid_;
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
      if (targetWeaponGuid_ != 0L) {
        output.writeUInt64(5, targetWeaponGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetWeaponGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, targetWeaponGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq other = (emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq) obj;

      if (getTargetWeaponGuid()
          != other.getTargetWeaponGuid()) return false;
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
      hash = (37 * hash) + TARGET_WEAPON_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetWeaponGuid());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq prototype) {
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
     * CmdId: 622
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code WeaponPromoteReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WeaponPromoteReq)
        emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.internal_static_WeaponPromoteReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.internal_static_WeaponPromoteReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq.class, emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        targetWeaponGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.internal_static_WeaponPromoteReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq build() {
        emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq buildPartial() {
        emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq result = new emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq(this);
        result.targetWeaponGuid_ = targetWeaponGuid_;
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
        if (other instanceof emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq other) {
        if (other == emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq.getDefaultInstance()) return this;
        if (other.getTargetWeaponGuid() != 0L) {
          setTargetWeaponGuid(other.getTargetWeaponGuid());
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
              case 40: {
                targetWeaponGuid_ = input.readUInt64();

                break;
              } // case 40
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

      private long targetWeaponGuid_ ;
      /**
       * <code>uint64 target_weapon_guid = 5;</code>
       * @return The targetWeaponGuid.
       */
      @java.lang.Override
      public long getTargetWeaponGuid() {
        return targetWeaponGuid_;
      }
      /**
       * <code>uint64 target_weapon_guid = 5;</code>
       * @param value The targetWeaponGuid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetWeaponGuid(long value) {
        
        targetWeaponGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 target_weapon_guid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetWeaponGuid() {
        
        targetWeaponGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:WeaponPromoteReq)
    }

    // @@protoc_insertion_point(class_scope:WeaponPromoteReq)
    private static final emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq();
    }

    public static emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WeaponPromoteReq>
        PARSER = new com.google.protobuf.AbstractParser<WeaponPromoteReq>() {
      @java.lang.Override
      public WeaponPromoteReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<WeaponPromoteReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WeaponPromoteReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.WeaponPromoteReqOuterClass.WeaponPromoteReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeaponPromoteReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeaponPromoteReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026WeaponPromoteReq.proto\".\n\020WeaponPromot" +
      "eReq\022\032\n\022target_weapon_guid\030\005 \001(\004B\036\n\034emu." +
      "grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WeaponPromoteReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WeaponPromoteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeaponPromoteReq_descriptor,
        new java.lang.String[] { "TargetWeaponGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
