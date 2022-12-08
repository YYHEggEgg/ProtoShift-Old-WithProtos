// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WeaponPromoteRsp.proto

package emu.grasscutter.net.oldproto;

public final class WeaponPromoteRspOuterClass {
  private WeaponPromoteRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WeaponPromoteRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WeaponPromoteRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 target_weapon_guid = 3;</code>
     * @return The targetWeaponGuid.
     */
    long getTargetWeaponGuid();

    /**
     * <code>uint32 old_promote_level = 7;</code>
     * @return The oldPromoteLevel.
     */
    int getOldPromoteLevel();

    /**
     * <code>uint32 cur_promote_level = 12;</code>
     * @return The curPromoteLevel.
     */
    int getCurPromoteLevel();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 665
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code WeaponPromoteRsp}
   */
  public static final class WeaponPromoteRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WeaponPromoteRsp)
      WeaponPromoteRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WeaponPromoteRsp.newBuilder() to construct.
    private WeaponPromoteRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WeaponPromoteRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WeaponPromoteRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.class, emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.Builder.class);
    }

    public static final int TARGET_WEAPON_GUID_FIELD_NUMBER = 3;
    private long targetWeaponGuid_;
    /**
     * <code>uint64 target_weapon_guid = 3;</code>
     * @return The targetWeaponGuid.
     */
    @java.lang.Override
    public long getTargetWeaponGuid() {
      return targetWeaponGuid_;
    }

    public static final int OLD_PROMOTE_LEVEL_FIELD_NUMBER = 7;
    private int oldPromoteLevel_;
    /**
     * <code>uint32 old_promote_level = 7;</code>
     * @return The oldPromoteLevel.
     */
    @java.lang.Override
    public int getOldPromoteLevel() {
      return oldPromoteLevel_;
    }

    public static final int CUR_PROMOTE_LEVEL_FIELD_NUMBER = 12;
    private int curPromoteLevel_;
    /**
     * <code>uint32 cur_promote_level = 12;</code>
     * @return The curPromoteLevel.
     */
    @java.lang.Override
    public int getCurPromoteLevel() {
      return curPromoteLevel_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
        output.writeUInt64(3, targetWeaponGuid_);
      }
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      if (oldPromoteLevel_ != 0) {
        output.writeUInt32(7, oldPromoteLevel_);
      }
      if (curPromoteLevel_ != 0) {
        output.writeUInt32(12, curPromoteLevel_);
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
          .computeUInt64Size(3, targetWeaponGuid_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, retcode_);
      }
      if (oldPromoteLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, oldPromoteLevel_);
      }
      if (curPromoteLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, curPromoteLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp other = (emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp) obj;

      if (getTargetWeaponGuid()
          != other.getTargetWeaponGuid()) return false;
      if (getOldPromoteLevel()
          != other.getOldPromoteLevel()) return false;
      if (getCurPromoteLevel()
          != other.getCurPromoteLevel()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + OLD_PROMOTE_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getOldPromoteLevel();
      hash = (37 * hash) + CUR_PROMOTE_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getCurPromoteLevel();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp prototype) {
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
     * CmdId: 665
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code WeaponPromoteRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WeaponPromoteRsp)
        emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.class, emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.newBuilder()
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

        oldPromoteLevel_ = 0;

        curPromoteLevel_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp build() {
        emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp buildPartial() {
        emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp result = new emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp(this);
        result.targetWeaponGuid_ = targetWeaponGuid_;
        result.oldPromoteLevel_ = oldPromoteLevel_;
        result.curPromoteLevel_ = curPromoteLevel_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp other) {
        if (other == emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.getDefaultInstance()) return this;
        if (other.getTargetWeaponGuid() != 0L) {
          setTargetWeaponGuid(other.getTargetWeaponGuid());
        }
        if (other.getOldPromoteLevel() != 0) {
          setOldPromoteLevel(other.getOldPromoteLevel());
        }
        if (other.getCurPromoteLevel() != 0) {
          setCurPromoteLevel(other.getCurPromoteLevel());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 24: {
                targetWeaponGuid_ = input.readUInt64();

                break;
              } // case 24
              case 32: {
                retcode_ = input.readInt32();

                break;
              } // case 32
              case 56: {
                oldPromoteLevel_ = input.readUInt32();

                break;
              } // case 56
              case 96: {
                curPromoteLevel_ = input.readUInt32();

                break;
              } // case 96
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
       * <code>uint64 target_weapon_guid = 3;</code>
       * @return The targetWeaponGuid.
       */
      @java.lang.Override
      public long getTargetWeaponGuid() {
        return targetWeaponGuid_;
      }
      /**
       * <code>uint64 target_weapon_guid = 3;</code>
       * @param value The targetWeaponGuid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetWeaponGuid(long value) {
        
        targetWeaponGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 target_weapon_guid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetWeaponGuid() {
        
        targetWeaponGuid_ = 0L;
        onChanged();
        return this;
      }

      private int oldPromoteLevel_ ;
      /**
       * <code>uint32 old_promote_level = 7;</code>
       * @return The oldPromoteLevel.
       */
      @java.lang.Override
      public int getOldPromoteLevel() {
        return oldPromoteLevel_;
      }
      /**
       * <code>uint32 old_promote_level = 7;</code>
       * @param value The oldPromoteLevel to set.
       * @return This builder for chaining.
       */
      public Builder setOldPromoteLevel(int value) {
        
        oldPromoteLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 old_promote_level = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearOldPromoteLevel() {
        
        oldPromoteLevel_ = 0;
        onChanged();
        return this;
      }

      private int curPromoteLevel_ ;
      /**
       * <code>uint32 cur_promote_level = 12;</code>
       * @return The curPromoteLevel.
       */
      @java.lang.Override
      public int getCurPromoteLevel() {
        return curPromoteLevel_;
      }
      /**
       * <code>uint32 cur_promote_level = 12;</code>
       * @param value The curPromoteLevel to set.
       * @return This builder for chaining.
       */
      public Builder setCurPromoteLevel(int value) {
        
        curPromoteLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_promote_level = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurPromoteLevel() {
        
        curPromoteLevel_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WeaponPromoteRsp)
    }

    // @@protoc_insertion_point(class_scope:WeaponPromoteRsp)
    private static final emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp();
    }

    public static emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WeaponPromoteRsp>
        PARSER = new com.google.protobuf.AbstractParser<WeaponPromoteRsp>() {
      @java.lang.Override
      public WeaponPromoteRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<WeaponPromoteRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WeaponPromoteRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.WeaponPromoteRspOuterClass.WeaponPromoteRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeaponPromoteRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeaponPromoteRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026WeaponPromoteRsp.proto\"u\n\020WeaponPromot" +
      "eRsp\022\032\n\022target_weapon_guid\030\003 \001(\004\022\031\n\021old_" +
      "promote_level\030\007 \001(\r\022\031\n\021cur_promote_level" +
      "\030\014 \001(\r\022\017\n\007retcode\030\004 \001(\005B\036\n\034emu.grasscutt" +
      "er.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WeaponPromoteRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WeaponPromoteRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeaponPromoteRsp_descriptor,
        new java.lang.String[] { "TargetWeaponGuid", "OldPromoteLevel", "CurPromoteLevel", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
