// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGLimitsInfo.proto

package emu.grasscutter.net.newproto;

public final class GCGLimitsInfoOuterClass {
  private GCGLimitsInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGLimitsInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGLimitsInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_MNCNOLHHGPA = 7;</code>
     * @return The unk3300MNCNOLHHGPA.
     */
    int getUnk3300MNCNOLHHGPA();

    /**
     * <code>uint32 Unk3300_PHKPKFBDGJF = 13;</code>
     * @return The unk3300PHKPKFBDGJF.
     */
    int getUnk3300PHKPKFBDGJF();
  }
  /**
   * Protobuf type {@code GCGLimitsInfo}
   */
  public static final class GCGLimitsInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGLimitsInfo)
      GCGLimitsInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGLimitsInfo.newBuilder() to construct.
    private GCGLimitsInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGLimitsInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGLimitsInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.internal_static_GCGLimitsInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.internal_static_GCGLimitsInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo.class, emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder.class);
    }

    public static final int UNK3300_MNCNOLHHGPA_FIELD_NUMBER = 7;
    private int unk3300MNCNOLHHGPA_;
    /**
     * <code>uint32 Unk3300_MNCNOLHHGPA = 7;</code>
     * @return The unk3300MNCNOLHHGPA.
     */
    @java.lang.Override
    public int getUnk3300MNCNOLHHGPA() {
      return unk3300MNCNOLHHGPA_;
    }

    public static final int UNK3300_PHKPKFBDGJF_FIELD_NUMBER = 13;
    private int unk3300PHKPKFBDGJF_;
    /**
     * <code>uint32 Unk3300_PHKPKFBDGJF = 13;</code>
     * @return The unk3300PHKPKFBDGJF.
     */
    @java.lang.Override
    public int getUnk3300PHKPKFBDGJF() {
      return unk3300PHKPKFBDGJF_;
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
      if (unk3300MNCNOLHHGPA_ != 0) {
        output.writeUInt32(7, unk3300MNCNOLHHGPA_);
      }
      if (unk3300PHKPKFBDGJF_ != 0) {
        output.writeUInt32(13, unk3300PHKPKFBDGJF_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300MNCNOLHHGPA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk3300MNCNOLHHGPA_);
      }
      if (unk3300PHKPKFBDGJF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3300PHKPKFBDGJF_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo other = (emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo) obj;

      if (getUnk3300MNCNOLHHGPA()
          != other.getUnk3300MNCNOLHHGPA()) return false;
      if (getUnk3300PHKPKFBDGJF()
          != other.getUnk3300PHKPKFBDGJF()) return false;
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
      hash = (37 * hash) + UNK3300_MNCNOLHHGPA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300MNCNOLHHGPA();
      hash = (37 * hash) + UNK3300_PHKPKFBDGJF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300PHKPKFBDGJF();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo prototype) {
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
     * Protobuf type {@code GCGLimitsInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGLimitsInfo)
        emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.internal_static_GCGLimitsInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.internal_static_GCGLimitsInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo.class, emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3300MNCNOLHHGPA_ = 0;

        unk3300PHKPKFBDGJF_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.internal_static_GCGLimitsInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo build() {
        emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo buildPartial() {
        emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo result = new emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo(this);
        result.unk3300MNCNOLHHGPA_ = unk3300MNCNOLHHGPA_;
        result.unk3300PHKPKFBDGJF_ = unk3300PHKPKFBDGJF_;
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
        if (other instanceof emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo other) {
        if (other == emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo.getDefaultInstance()) return this;
        if (other.getUnk3300MNCNOLHHGPA() != 0) {
          setUnk3300MNCNOLHHGPA(other.getUnk3300MNCNOLHHGPA());
        }
        if (other.getUnk3300PHKPKFBDGJF() != 0) {
          setUnk3300PHKPKFBDGJF(other.getUnk3300PHKPKFBDGJF());
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
                unk3300MNCNOLHHGPA_ = input.readUInt32();

                break;
              } // case 56
              case 104: {
                unk3300PHKPKFBDGJF_ = input.readUInt32();

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

      private int unk3300MNCNOLHHGPA_ ;
      /**
       * <code>uint32 Unk3300_MNCNOLHHGPA = 7;</code>
       * @return The unk3300MNCNOLHHGPA.
       */
      @java.lang.Override
      public int getUnk3300MNCNOLHHGPA() {
        return unk3300MNCNOLHHGPA_;
      }
      /**
       * <code>uint32 Unk3300_MNCNOLHHGPA = 7;</code>
       * @param value The unk3300MNCNOLHHGPA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MNCNOLHHGPA(int value) {
        
        unk3300MNCNOLHHGPA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_MNCNOLHHGPA = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MNCNOLHHGPA() {
        
        unk3300MNCNOLHHGPA_ = 0;
        onChanged();
        return this;
      }

      private int unk3300PHKPKFBDGJF_ ;
      /**
       * <code>uint32 Unk3300_PHKPKFBDGJF = 13;</code>
       * @return The unk3300PHKPKFBDGJF.
       */
      @java.lang.Override
      public int getUnk3300PHKPKFBDGJF() {
        return unk3300PHKPKFBDGJF_;
      }
      /**
       * <code>uint32 Unk3300_PHKPKFBDGJF = 13;</code>
       * @param value The unk3300PHKPKFBDGJF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300PHKPKFBDGJF(int value) {
        
        unk3300PHKPKFBDGJF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_PHKPKFBDGJF = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300PHKPKFBDGJF() {
        
        unk3300PHKPKFBDGJF_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGLimitsInfo)
    }

    // @@protoc_insertion_point(class_scope:GCGLimitsInfo)
    private static final emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo();
    }

    public static emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGLimitsInfo>
        PARSER = new com.google.protobuf.AbstractParser<GCGLimitsInfo>() {
      @java.lang.Override
      public GCGLimitsInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGLimitsInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGLimitsInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGLimitsInfoOuterClass.GCGLimitsInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGLimitsInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGLimitsInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023GCGLimitsInfo.proto\"I\n\rGCGLimitsInfo\022\033" +
      "\n\023Unk3300_MNCNOLHHGPA\030\007 \001(\r\022\033\n\023Unk3300_P" +
      "HKPKFBDGJF\030\r \001(\rB\036\n\034emu.grasscutter.net." +
      "newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGLimitsInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGLimitsInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGLimitsInfo_descriptor,
        new java.lang.String[] { "Unk3300MNCNOLHHGPA", "Unk3300PHKPKFBDGJF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
