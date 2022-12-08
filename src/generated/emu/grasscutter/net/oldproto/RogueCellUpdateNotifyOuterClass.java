// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueCellUpdateNotify.proto

package emu.grasscutter.net.oldproto;

public final class RogueCellUpdateNotifyOuterClass {
  private RogueCellUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueCellUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueCellUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.RogueCellInfo cell_info = 7;</code>
     * @return Whether the cellInfo field is set.
     */
    boolean hasCellInfo();
    /**
     * <code>.RogueCellInfo cell_info = 7;</code>
     * @return The cellInfo.
     */
    emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo getCellInfo();
    /**
     * <code>.RogueCellInfo cell_info = 7;</code>
     */
    emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfoOrBuilder getCellInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 8642
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code RogueCellUpdateNotify}
   */
  public static final class RogueCellUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueCellUpdateNotify)
      RogueCellUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueCellUpdateNotify.newBuilder() to construct.
    private RogueCellUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueCellUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueCellUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.internal_static_RogueCellUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.internal_static_RogueCellUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify.class, emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify.Builder.class);
    }

    public static final int CELL_INFO_FIELD_NUMBER = 7;
    private emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo cellInfo_;
    /**
     * <code>.RogueCellInfo cell_info = 7;</code>
     * @return Whether the cellInfo field is set.
     */
    @java.lang.Override
    public boolean hasCellInfo() {
      return cellInfo_ != null;
    }
    /**
     * <code>.RogueCellInfo cell_info = 7;</code>
     * @return The cellInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo getCellInfo() {
      return cellInfo_ == null ? emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.getDefaultInstance() : cellInfo_;
    }
    /**
     * <code>.RogueCellInfo cell_info = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfoOrBuilder getCellInfoOrBuilder() {
      return getCellInfo();
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
      if (cellInfo_ != null) {
        output.writeMessage(7, getCellInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cellInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getCellInfo());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify other = (emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify) obj;

      if (hasCellInfo() != other.hasCellInfo()) return false;
      if (hasCellInfo()) {
        if (!getCellInfo()
            .equals(other.getCellInfo())) return false;
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
      if (hasCellInfo()) {
        hash = (37 * hash) + CELL_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getCellInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify prototype) {
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
     * CmdId: 8642
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code RogueCellUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueCellUpdateNotify)
        emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.internal_static_RogueCellUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.internal_static_RogueCellUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify.class, emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (cellInfoBuilder_ == null) {
          cellInfo_ = null;
        } else {
          cellInfo_ = null;
          cellInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.internal_static_RogueCellUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify build() {
        emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify buildPartial() {
        emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify result = new emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify(this);
        if (cellInfoBuilder_ == null) {
          result.cellInfo_ = cellInfo_;
        } else {
          result.cellInfo_ = cellInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify other) {
        if (other == emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify.getDefaultInstance()) return this;
        if (other.hasCellInfo()) {
          mergeCellInfo(other.getCellInfo());
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
              case 58: {
                input.readMessage(
                    getCellInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 58
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

      private emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo cellInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo, emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.Builder, emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfoOrBuilder> cellInfoBuilder_;
      /**
       * <code>.RogueCellInfo cell_info = 7;</code>
       * @return Whether the cellInfo field is set.
       */
      public boolean hasCellInfo() {
        return cellInfoBuilder_ != null || cellInfo_ != null;
      }
      /**
       * <code>.RogueCellInfo cell_info = 7;</code>
       * @return The cellInfo.
       */
      public emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo getCellInfo() {
        if (cellInfoBuilder_ == null) {
          return cellInfo_ == null ? emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.getDefaultInstance() : cellInfo_;
        } else {
          return cellInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.RogueCellInfo cell_info = 7;</code>
       */
      public Builder setCellInfo(emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo value) {
        if (cellInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          cellInfo_ = value;
          onChanged();
        } else {
          cellInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.RogueCellInfo cell_info = 7;</code>
       */
      public Builder setCellInfo(
          emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.Builder builderForValue) {
        if (cellInfoBuilder_ == null) {
          cellInfo_ = builderForValue.build();
          onChanged();
        } else {
          cellInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.RogueCellInfo cell_info = 7;</code>
       */
      public Builder mergeCellInfo(emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo value) {
        if (cellInfoBuilder_ == null) {
          if (cellInfo_ != null) {
            cellInfo_ =
              emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.newBuilder(cellInfo_).mergeFrom(value).buildPartial();
          } else {
            cellInfo_ = value;
          }
          onChanged();
        } else {
          cellInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.RogueCellInfo cell_info = 7;</code>
       */
      public Builder clearCellInfo() {
        if (cellInfoBuilder_ == null) {
          cellInfo_ = null;
          onChanged();
        } else {
          cellInfo_ = null;
          cellInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.RogueCellInfo cell_info = 7;</code>
       */
      public emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.Builder getCellInfoBuilder() {
        
        onChanged();
        return getCellInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.RogueCellInfo cell_info = 7;</code>
       */
      public emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfoOrBuilder getCellInfoOrBuilder() {
        if (cellInfoBuilder_ != null) {
          return cellInfoBuilder_.getMessageOrBuilder();
        } else {
          return cellInfo_ == null ?
              emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.getDefaultInstance() : cellInfo_;
        }
      }
      /**
       * <code>.RogueCellInfo cell_info = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo, emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.Builder, emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfoOrBuilder> 
          getCellInfoFieldBuilder() {
        if (cellInfoBuilder_ == null) {
          cellInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo, emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfo.Builder, emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.RogueCellInfoOrBuilder>(
                  getCellInfo(),
                  getParentForChildren(),
                  isClean());
          cellInfo_ = null;
        }
        return cellInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:RogueCellUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:RogueCellUpdateNotify)
    private static final emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify();
    }

    public static emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueCellUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<RogueCellUpdateNotify>() {
      @java.lang.Override
      public RogueCellUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<RogueCellUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueCellUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.RogueCellUpdateNotifyOuterClass.RogueCellUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueCellUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueCellUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033RogueCellUpdateNotify.proto\032\023RogueCell" +
      "Info.proto\":\n\025RogueCellUpdateNotify\022!\n\tc" +
      "ell_info\030\007 \001(\0132\016.RogueCellInfoB\036\n\034emu.gr" +
      "asscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.getDescriptor(),
        });
    internal_static_RogueCellUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueCellUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueCellUpdateNotify_descriptor,
        new java.lang.String[] { "CellInfo", });
    emu.grasscutter.net.oldproto.RogueCellInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
