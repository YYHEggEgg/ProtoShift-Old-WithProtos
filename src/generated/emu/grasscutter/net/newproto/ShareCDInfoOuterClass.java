// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShareCDInfo.proto

package emu.grasscutter.net.newproto;

public final class ShareCDInfoOuterClass {
  private ShareCDInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ShareCDInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ShareCDInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 cd_start_time = 1;</code>
     * @return The cdStartTime.
     */
    long getCdStartTime();

    /**
     * <code>uint32 share_cd_id = 12;</code>
     * @return The shareCdId.
     */
    int getShareCdId();

    /**
     * <code>uint32 index = 13;</code>
     * @return The index.
     */
    int getIndex();
  }
  /**
   * Protobuf type {@code ShareCDInfo}
   */
  public static final class ShareCDInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ShareCDInfo)
      ShareCDInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ShareCDInfo.newBuilder() to construct.
    private ShareCDInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ShareCDInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ShareCDInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ShareCDInfoOuterClass.internal_static_ShareCDInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ShareCDInfoOuterClass.internal_static_ShareCDInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo.class, emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo.Builder.class);
    }

    public static final int CD_START_TIME_FIELD_NUMBER = 1;
    private long cdStartTime_;
    /**
     * <code>uint64 cd_start_time = 1;</code>
     * @return The cdStartTime.
     */
    @java.lang.Override
    public long getCdStartTime() {
      return cdStartTime_;
    }

    public static final int SHARE_CD_ID_FIELD_NUMBER = 12;
    private int shareCdId_;
    /**
     * <code>uint32 share_cd_id = 12;</code>
     * @return The shareCdId.
     */
    @java.lang.Override
    public int getShareCdId() {
      return shareCdId_;
    }

    public static final int INDEX_FIELD_NUMBER = 13;
    private int index_;
    /**
     * <code>uint32 index = 13;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
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
      if (cdStartTime_ != 0L) {
        output.writeUInt64(1, cdStartTime_);
      }
      if (shareCdId_ != 0) {
        output.writeUInt32(12, shareCdId_);
      }
      if (index_ != 0) {
        output.writeUInt32(13, index_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cdStartTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, cdStartTime_);
      }
      if (shareCdId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, shareCdId_);
      }
      if (index_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, index_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo other = (emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo) obj;

      if (getCdStartTime()
          != other.getCdStartTime()) return false;
      if (getShareCdId()
          != other.getShareCdId()) return false;
      if (getIndex()
          != other.getIndex()) return false;
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
      hash = (37 * hash) + CD_START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCdStartTime());
      hash = (37 * hash) + SHARE_CD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getShareCdId();
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo prototype) {
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
     * Protobuf type {@code ShareCDInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ShareCDInfo)
        emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ShareCDInfoOuterClass.internal_static_ShareCDInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ShareCDInfoOuterClass.internal_static_ShareCDInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo.class, emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        cdStartTime_ = 0L;

        shareCdId_ = 0;

        index_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ShareCDInfoOuterClass.internal_static_ShareCDInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo build() {
        emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo buildPartial() {
        emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo result = new emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo(this);
        result.cdStartTime_ = cdStartTime_;
        result.shareCdId_ = shareCdId_;
        result.index_ = index_;
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
        if (other instanceof emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo other) {
        if (other == emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo.getDefaultInstance()) return this;
        if (other.getCdStartTime() != 0L) {
          setCdStartTime(other.getCdStartTime());
        }
        if (other.getShareCdId() != 0) {
          setShareCdId(other.getShareCdId());
        }
        if (other.getIndex() != 0) {
          setIndex(other.getIndex());
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
                cdStartTime_ = input.readUInt64();

                break;
              } // case 8
              case 96: {
                shareCdId_ = input.readUInt32();

                break;
              } // case 96
              case 104: {
                index_ = input.readUInt32();

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

      private long cdStartTime_ ;
      /**
       * <code>uint64 cd_start_time = 1;</code>
       * @return The cdStartTime.
       */
      @java.lang.Override
      public long getCdStartTime() {
        return cdStartTime_;
      }
      /**
       * <code>uint64 cd_start_time = 1;</code>
       * @param value The cdStartTime to set.
       * @return This builder for chaining.
       */
      public Builder setCdStartTime(long value) {
        
        cdStartTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 cd_start_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCdStartTime() {
        
        cdStartTime_ = 0L;
        onChanged();
        return this;
      }

      private int shareCdId_ ;
      /**
       * <code>uint32 share_cd_id = 12;</code>
       * @return The shareCdId.
       */
      @java.lang.Override
      public int getShareCdId() {
        return shareCdId_;
      }
      /**
       * <code>uint32 share_cd_id = 12;</code>
       * @param value The shareCdId to set.
       * @return This builder for chaining.
       */
      public Builder setShareCdId(int value) {
        
        shareCdId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 share_cd_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearShareCdId() {
        
        shareCdId_ = 0;
        onChanged();
        return this;
      }

      private int index_ ;
      /**
       * <code>uint32 index = 13;</code>
       * @return The index.
       */
      @java.lang.Override
      public int getIndex() {
        return index_;
      }
      /**
       * <code>uint32 index = 13;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(int value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 index = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        
        index_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ShareCDInfo)
    }

    // @@protoc_insertion_point(class_scope:ShareCDInfo)
    private static final emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo();
    }

    public static emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShareCDInfo>
        PARSER = new com.google.protobuf.AbstractParser<ShareCDInfo>() {
      @java.lang.Override
      public ShareCDInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ShareCDInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ShareCDInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ShareCDInfoOuterClass.ShareCDInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShareCDInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ShareCDInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ShareCDInfo.proto\"H\n\013ShareCDInfo\022\025\n\rcd" +
      "_start_time\030\001 \001(\004\022\023\n\013share_cd_id\030\014 \001(\r\022\r" +
      "\n\005index\030\r \001(\rB\036\n\034emu.grasscutter.net.new" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ShareCDInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ShareCDInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ShareCDInfo_descriptor,
        new java.lang.String[] { "CdStartTime", "ShareCdId", "Index", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
