// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Material.proto

package emu.grasscutter.net.oldproto;

public final class MaterialOuterClass {
  private MaterialOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MaterialOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Material)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 count = 1;</code>
     * @return The count.
     */
    int getCount();

    /**
     * <code>.MaterialDeleteInfo delete_info = 2;</code>
     * @return Whether the deleteInfo field is set.
     */
    boolean hasDeleteInfo();
    /**
     * <code>.MaterialDeleteInfo delete_info = 2;</code>
     * @return The deleteInfo.
     */
    emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo getDeleteInfo();
    /**
     * <code>.MaterialDeleteInfo delete_info = 2;</code>
     */
    emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder getDeleteInfoOrBuilder();
  }
  /**
   * Protobuf type {@code Material}
   */
  public static final class Material extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Material)
      MaterialOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Material.newBuilder() to construct.
    private Material(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Material() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Material();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.MaterialOuterClass.internal_static_Material_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.MaterialOuterClass.internal_static_Material_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.MaterialOuterClass.Material.class, emu.grasscutter.net.oldproto.MaterialOuterClass.Material.Builder.class);
    }

    public static final int COUNT_FIELD_NUMBER = 1;
    private int count_;
    /**
     * <code>uint32 count = 1;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }

    public static final int DELETE_INFO_FIELD_NUMBER = 2;
    private emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo deleteInfo_;
    /**
     * <code>.MaterialDeleteInfo delete_info = 2;</code>
     * @return Whether the deleteInfo field is set.
     */
    @java.lang.Override
    public boolean hasDeleteInfo() {
      return deleteInfo_ != null;
    }
    /**
     * <code>.MaterialDeleteInfo delete_info = 2;</code>
     * @return The deleteInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo getDeleteInfo() {
      return deleteInfo_ == null ? emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.getDefaultInstance() : deleteInfo_;
    }
    /**
     * <code>.MaterialDeleteInfo delete_info = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder getDeleteInfoOrBuilder() {
      return getDeleteInfo();
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
      if (count_ != 0) {
        output.writeUInt32(1, count_);
      }
      if (deleteInfo_ != null) {
        output.writeMessage(2, getDeleteInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, count_);
      }
      if (deleteInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getDeleteInfo());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.MaterialOuterClass.Material)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.MaterialOuterClass.Material other = (emu.grasscutter.net.oldproto.MaterialOuterClass.Material) obj;

      if (getCount()
          != other.getCount()) return false;
      if (hasDeleteInfo() != other.hasDeleteInfo()) return false;
      if (hasDeleteInfo()) {
        if (!getDeleteInfo()
            .equals(other.getDeleteInfo())) return false;
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
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      if (hasDeleteInfo()) {
        hash = (37 * hash) + DELETE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getDeleteInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.MaterialOuterClass.Material parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MaterialOuterClass.Material parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MaterialOuterClass.Material parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MaterialOuterClass.Material parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MaterialOuterClass.Material parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MaterialOuterClass.Material parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MaterialOuterClass.Material parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MaterialOuterClass.Material parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MaterialOuterClass.Material parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MaterialOuterClass.Material parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MaterialOuterClass.Material parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MaterialOuterClass.Material parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.MaterialOuterClass.Material prototype) {
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
     * Protobuf type {@code Material}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Material)
        emu.grasscutter.net.oldproto.MaterialOuterClass.MaterialOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.MaterialOuterClass.internal_static_Material_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.MaterialOuterClass.internal_static_Material_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.MaterialOuterClass.Material.class, emu.grasscutter.net.oldproto.MaterialOuterClass.Material.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.MaterialOuterClass.Material.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        count_ = 0;

        if (deleteInfoBuilder_ == null) {
          deleteInfo_ = null;
        } else {
          deleteInfo_ = null;
          deleteInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.MaterialOuterClass.internal_static_Material_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MaterialOuterClass.Material getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.MaterialOuterClass.Material.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MaterialOuterClass.Material build() {
        emu.grasscutter.net.oldproto.MaterialOuterClass.Material result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MaterialOuterClass.Material buildPartial() {
        emu.grasscutter.net.oldproto.MaterialOuterClass.Material result = new emu.grasscutter.net.oldproto.MaterialOuterClass.Material(this);
        result.count_ = count_;
        if (deleteInfoBuilder_ == null) {
          result.deleteInfo_ = deleteInfo_;
        } else {
          result.deleteInfo_ = deleteInfoBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.oldproto.MaterialOuterClass.Material) {
          return mergeFrom((emu.grasscutter.net.oldproto.MaterialOuterClass.Material)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.MaterialOuterClass.Material other) {
        if (other == emu.grasscutter.net.oldproto.MaterialOuterClass.Material.getDefaultInstance()) return this;
        if (other.getCount() != 0) {
          setCount(other.getCount());
        }
        if (other.hasDeleteInfo()) {
          mergeDeleteInfo(other.getDeleteInfo());
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
                count_ = input.readUInt32();

                break;
              } // case 8
              case 18: {
                input.readMessage(
                    getDeleteInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 18
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

      private int count_ ;
      /**
       * <code>uint32 count = 1;</code>
       * @return The count.
       */
      @java.lang.Override
      public int getCount() {
        return count_;
      }
      /**
       * <code>uint32 count = 1;</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(int value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 count = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        
        count_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo deleteInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo, emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder, emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder> deleteInfoBuilder_;
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       * @return Whether the deleteInfo field is set.
       */
      public boolean hasDeleteInfo() {
        return deleteInfoBuilder_ != null || deleteInfo_ != null;
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       * @return The deleteInfo.
       */
      public emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo getDeleteInfo() {
        if (deleteInfoBuilder_ == null) {
          return deleteInfo_ == null ? emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.getDefaultInstance() : deleteInfo_;
        } else {
          return deleteInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       */
      public Builder setDeleteInfo(emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo value) {
        if (deleteInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          deleteInfo_ = value;
          onChanged();
        } else {
          deleteInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       */
      public Builder setDeleteInfo(
          emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder builderForValue) {
        if (deleteInfoBuilder_ == null) {
          deleteInfo_ = builderForValue.build();
          onChanged();
        } else {
          deleteInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       */
      public Builder mergeDeleteInfo(emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo value) {
        if (deleteInfoBuilder_ == null) {
          if (deleteInfo_ != null) {
            deleteInfo_ =
              emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.newBuilder(deleteInfo_).mergeFrom(value).buildPartial();
          } else {
            deleteInfo_ = value;
          }
          onChanged();
        } else {
          deleteInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       */
      public Builder clearDeleteInfo() {
        if (deleteInfoBuilder_ == null) {
          deleteInfo_ = null;
          onChanged();
        } else {
          deleteInfo_ = null;
          deleteInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       */
      public emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder getDeleteInfoBuilder() {
        
        onChanged();
        return getDeleteInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       */
      public emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder getDeleteInfoOrBuilder() {
        if (deleteInfoBuilder_ != null) {
          return deleteInfoBuilder_.getMessageOrBuilder();
        } else {
          return deleteInfo_ == null ?
              emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.getDefaultInstance() : deleteInfo_;
        }
      }
      /**
       * <code>.MaterialDeleteInfo delete_info = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo, emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder, emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder> 
          getDeleteInfoFieldBuilder() {
        if (deleteInfoBuilder_ == null) {
          deleteInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo, emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfo.Builder, emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.MaterialDeleteInfoOrBuilder>(
                  getDeleteInfo(),
                  getParentForChildren(),
                  isClean());
          deleteInfo_ = null;
        }
        return deleteInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Material)
    }

    // @@protoc_insertion_point(class_scope:Material)
    private static final emu.grasscutter.net.oldproto.MaterialOuterClass.Material DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.MaterialOuterClass.Material();
    }

    public static emu.grasscutter.net.oldproto.MaterialOuterClass.Material getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Material>
        PARSER = new com.google.protobuf.AbstractParser<Material>() {
      @java.lang.Override
      public Material parsePartialFrom(
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

    public static com.google.protobuf.Parser<Material> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Material> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.MaterialOuterClass.Material getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Material_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Material_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Material.proto\032\030MaterialDeleteInfo.pro" +
      "to\"C\n\010Material\022\r\n\005count\030\001 \001(\r\022(\n\013delete_" +
      "info\030\002 \001(\0132\023.MaterialDeleteInfoB\036\n\034emu.g" +
      "rasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.getDescriptor(),
        });
    internal_static_Material_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Material_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Material_descriptor,
        new java.lang.String[] { "Count", "DeleteInfo", });
    emu.grasscutter.net.oldproto.MaterialDeleteInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
