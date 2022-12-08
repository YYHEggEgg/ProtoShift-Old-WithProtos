// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SummerTimeFloatSignalUpdateNotify.proto

package emu.grasscutter.net.newproto;

public final class SummerTimeFloatSignalUpdateNotifyOuterClass {
  private SummerTimeFloatSignalUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SummerTimeFloatSignalUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SummerTimeFloatSignalUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_transfer_anchor = 1;</code>
     * @return The isTransferAnchor.
     */
    boolean getIsTransferAnchor();

    /**
     * <code>.Vector position = 7;</code>
     * @return Whether the position field is set.
     */
    boolean hasPosition();
    /**
     * <code>.Vector position = 7;</code>
     * @return The position.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getPosition();
    /**
     * <code>.Vector position = 7;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder();

    /**
     * <code>uint32 float_signal_id = 12;</code>
     * @return The floatSignalId.
     */
    int getFloatSignalId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8508;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SummerTimeFloatSignalUpdateNotify}
   */
  public static final class SummerTimeFloatSignalUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SummerTimeFloatSignalUpdateNotify)
      SummerTimeFloatSignalUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SummerTimeFloatSignalUpdateNotify.newBuilder() to construct.
    private SummerTimeFloatSignalUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SummerTimeFloatSignalUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SummerTimeFloatSignalUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.internal_static_SummerTimeFloatSignalUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.internal_static_SummerTimeFloatSignalUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify.class, emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify.Builder.class);
    }

    public static final int IS_TRANSFER_ANCHOR_FIELD_NUMBER = 1;
    private boolean isTransferAnchor_;
    /**
     * <code>bool is_transfer_anchor = 1;</code>
     * @return The isTransferAnchor.
     */
    @java.lang.Override
    public boolean getIsTransferAnchor() {
      return isTransferAnchor_;
    }

    public static final int POSITION_FIELD_NUMBER = 7;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector position_;
    /**
     * <code>.Vector position = 7;</code>
     * @return Whether the position field is set.
     */
    @java.lang.Override
    public boolean hasPosition() {
      return position_ != null;
    }
    /**
     * <code>.Vector position = 7;</code>
     * @return The position.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getPosition() {
      return position_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : position_;
    }
    /**
     * <code>.Vector position = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
      return getPosition();
    }

    public static final int FLOAT_SIGNAL_ID_FIELD_NUMBER = 12;
    private int floatSignalId_;
    /**
     * <code>uint32 float_signal_id = 12;</code>
     * @return The floatSignalId.
     */
    @java.lang.Override
    public int getFloatSignalId() {
      return floatSignalId_;
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
      if (isTransferAnchor_ != false) {
        output.writeBool(1, isTransferAnchor_);
      }
      if (position_ != null) {
        output.writeMessage(7, getPosition());
      }
      if (floatSignalId_ != 0) {
        output.writeUInt32(12, floatSignalId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isTransferAnchor_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isTransferAnchor_);
      }
      if (position_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getPosition());
      }
      if (floatSignalId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, floatSignalId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify other = (emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify) obj;

      if (getIsTransferAnchor()
          != other.getIsTransferAnchor()) return false;
      if (hasPosition() != other.hasPosition()) return false;
      if (hasPosition()) {
        if (!getPosition()
            .equals(other.getPosition())) return false;
      }
      if (getFloatSignalId()
          != other.getFloatSignalId()) return false;
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
      hash = (37 * hash) + IS_TRANSFER_ANCHOR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTransferAnchor());
      if (hasPosition()) {
        hash = (37 * hash) + POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getPosition().hashCode();
      }
      hash = (37 * hash) + FLOAT_SIGNAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFloatSignalId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 8508;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SummerTimeFloatSignalUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SummerTimeFloatSignalUpdateNotify)
        emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.internal_static_SummerTimeFloatSignalUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.internal_static_SummerTimeFloatSignalUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify.class, emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isTransferAnchor_ = false;

        if (positionBuilder_ == null) {
          position_ = null;
        } else {
          position_ = null;
          positionBuilder_ = null;
        }
        floatSignalId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.internal_static_SummerTimeFloatSignalUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify build() {
        emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify buildPartial() {
        emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify result = new emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify(this);
        result.isTransferAnchor_ = isTransferAnchor_;
        if (positionBuilder_ == null) {
          result.position_ = position_;
        } else {
          result.position_ = positionBuilder_.build();
        }
        result.floatSignalId_ = floatSignalId_;
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
        if (other instanceof emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify other) {
        if (other == emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify.getDefaultInstance()) return this;
        if (other.getIsTransferAnchor() != false) {
          setIsTransferAnchor(other.getIsTransferAnchor());
        }
        if (other.hasPosition()) {
          mergePosition(other.getPosition());
        }
        if (other.getFloatSignalId() != 0) {
          setFloatSignalId(other.getFloatSignalId());
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
                isTransferAnchor_ = input.readBool();

                break;
              } // case 8
              case 58: {
                input.readMessage(
                    getPositionFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 58
              case 96: {
                floatSignalId_ = input.readUInt32();

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

      private boolean isTransferAnchor_ ;
      /**
       * <code>bool is_transfer_anchor = 1;</code>
       * @return The isTransferAnchor.
       */
      @java.lang.Override
      public boolean getIsTransferAnchor() {
        return isTransferAnchor_;
      }
      /**
       * <code>bool is_transfer_anchor = 1;</code>
       * @param value The isTransferAnchor to set.
       * @return This builder for chaining.
       */
      public Builder setIsTransferAnchor(boolean value) {
        
        isTransferAnchor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_transfer_anchor = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTransferAnchor() {
        
        isTransferAnchor_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector position_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> positionBuilder_;
      /**
       * <code>.Vector position = 7;</code>
       * @return Whether the position field is set.
       */
      public boolean hasPosition() {
        return positionBuilder_ != null || position_ != null;
      }
      /**
       * <code>.Vector position = 7;</code>
       * @return The position.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getPosition() {
        if (positionBuilder_ == null) {
          return position_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : position_;
        } else {
          return positionBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector position = 7;</code>
       */
      public Builder setPosition(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (positionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          position_ = value;
          onChanged();
        } else {
          positionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector position = 7;</code>
       */
      public Builder setPosition(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (positionBuilder_ == null) {
          position_ = builderForValue.build();
          onChanged();
        } else {
          positionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector position = 7;</code>
       */
      public Builder mergePosition(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (positionBuilder_ == null) {
          if (position_ != null) {
            position_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(position_).mergeFrom(value).buildPartial();
          } else {
            position_ = value;
          }
          onChanged();
        } else {
          positionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector position = 7;</code>
       */
      public Builder clearPosition() {
        if (positionBuilder_ == null) {
          position_ = null;
          onChanged();
        } else {
          position_ = null;
          positionBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector position = 7;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getPositionBuilder() {
        
        onChanged();
        return getPositionFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector position = 7;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
        if (positionBuilder_ != null) {
          return positionBuilder_.getMessageOrBuilder();
        } else {
          return position_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : position_;
        }
      }
      /**
       * <code>.Vector position = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getPositionFieldBuilder() {
        if (positionBuilder_ == null) {
          positionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getPosition(),
                  getParentForChildren(),
                  isClean());
          position_ = null;
        }
        return positionBuilder_;
      }

      private int floatSignalId_ ;
      /**
       * <code>uint32 float_signal_id = 12;</code>
       * @return The floatSignalId.
       */
      @java.lang.Override
      public int getFloatSignalId() {
        return floatSignalId_;
      }
      /**
       * <code>uint32 float_signal_id = 12;</code>
       * @param value The floatSignalId to set.
       * @return This builder for chaining.
       */
      public Builder setFloatSignalId(int value) {
        
        floatSignalId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 float_signal_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearFloatSignalId() {
        
        floatSignalId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SummerTimeFloatSignalUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:SummerTimeFloatSignalUpdateNotify)
    private static final emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify();
    }

    public static emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SummerTimeFloatSignalUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<SummerTimeFloatSignalUpdateNotify>() {
      @java.lang.Override
      public SummerTimeFloatSignalUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SummerTimeFloatSignalUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SummerTimeFloatSignalUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SummerTimeFloatSignalUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SummerTimeFloatSignalUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'SummerTimeFloatSignalUpdateNotify.prot" +
      "o\032\014Vector.proto\"s\n!SummerTimeFloatSignal" +
      "UpdateNotify\022\032\n\022is_transfer_anchor\030\001 \001(\010" +
      "\022\031\n\010position\030\007 \001(\0132\007.Vector\022\027\n\017float_sig" +
      "nal_id\030\014 \001(\rB\036\n\034emu.grasscutter.net.newp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_SummerTimeFloatSignalUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SummerTimeFloatSignalUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SummerTimeFloatSignalUpdateNotify_descriptor,
        new java.lang.String[] { "IsTransferAnchor", "Position", "FloatSignalId", });
    emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}