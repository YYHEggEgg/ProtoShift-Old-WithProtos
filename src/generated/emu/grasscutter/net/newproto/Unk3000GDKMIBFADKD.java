// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_GDKMIBFADKD.proto

package emu.grasscutter.net.newproto;

public final class Unk3000GDKMIBFADKD {
  private Unk3000GDKMIBFADKD() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_GDKMIBFADKDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_GDKMIBFADKD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 area = 10;</code>
     * @return The area.
     */
    int getArea();

    /**
     * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
     * @return Whether the unk3000AOEGLPPFIFD field is set.
     */
    boolean hasUnk3000AOEGLPPFIFD();
    /**
     * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
     * @return The unk3000AOEGLPPFIFD.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getUnk3000AOEGLPPFIFD();
    /**
     * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getUnk3000AOEGLPPFIFDOrBuilder();

    /**
     * <code>int64 index = 5;</code>
     * @return The index.
     */
    long getIndex();
  }
  /**
   * Protobuf type {@code Unk3000_GDKMIBFADKD}
   */
  public static final class Unk3000_GDKMIBFADKD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_GDKMIBFADKD)
      Unk3000_GDKMIBFADKDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_GDKMIBFADKD.newBuilder() to construct.
    private Unk3000_GDKMIBFADKD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_GDKMIBFADKD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_GDKMIBFADKD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.internal_static_Unk3000_GDKMIBFADKD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.internal_static_Unk3000_GDKMIBFADKD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD.class, emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD.Builder.class);
    }

    public static final int AREA_FIELD_NUMBER = 10;
    private int area_;
    /**
     * <code>int32 area = 10;</code>
     * @return The area.
     */
    @java.lang.Override
    public int getArea() {
      return area_;
    }

    public static final int UNK3000_AOEGLPPFIFD_FIELD_NUMBER = 14;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector unk3000AOEGLPPFIFD_;
    /**
     * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
     * @return Whether the unk3000AOEGLPPFIFD field is set.
     */
    @java.lang.Override
    public boolean hasUnk3000AOEGLPPFIFD() {
      return unk3000AOEGLPPFIFD_ != null;
    }
    /**
     * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
     * @return The unk3000AOEGLPPFIFD.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getUnk3000AOEGLPPFIFD() {
      return unk3000AOEGLPPFIFD_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : unk3000AOEGLPPFIFD_;
    }
    /**
     * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getUnk3000AOEGLPPFIFDOrBuilder() {
      return getUnk3000AOEGLPPFIFD();
    }

    public static final int INDEX_FIELD_NUMBER = 5;
    private long index_;
    /**
     * <code>int64 index = 5;</code>
     * @return The index.
     */
    @java.lang.Override
    public long getIndex() {
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
      if (index_ != 0L) {
        output.writeInt64(5, index_);
      }
      if (area_ != 0) {
        output.writeInt32(10, area_);
      }
      if (unk3000AOEGLPPFIFD_ != null) {
        output.writeMessage(14, getUnk3000AOEGLPPFIFD());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (index_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, index_);
      }
      if (area_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, area_);
      }
      if (unk3000AOEGLPPFIFD_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getUnk3000AOEGLPPFIFD());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD other = (emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD) obj;

      if (getArea()
          != other.getArea()) return false;
      if (hasUnk3000AOEGLPPFIFD() != other.hasUnk3000AOEGLPPFIFD()) return false;
      if (hasUnk3000AOEGLPPFIFD()) {
        if (!getUnk3000AOEGLPPFIFD()
            .equals(other.getUnk3000AOEGLPPFIFD())) return false;
      }
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
      hash = (37 * hash) + AREA_FIELD_NUMBER;
      hash = (53 * hash) + getArea();
      if (hasUnk3000AOEGLPPFIFD()) {
        hash = (37 * hash) + UNK3000_AOEGLPPFIFD_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3000AOEGLPPFIFD().hashCode();
      }
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getIndex());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD prototype) {
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
     * Protobuf type {@code Unk3000_GDKMIBFADKD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_GDKMIBFADKD)
        emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.internal_static_Unk3000_GDKMIBFADKD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.internal_static_Unk3000_GDKMIBFADKD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD.class, emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        area_ = 0;

        if (unk3000AOEGLPPFIFDBuilder_ == null) {
          unk3000AOEGLPPFIFD_ = null;
        } else {
          unk3000AOEGLPPFIFD_ = null;
          unk3000AOEGLPPFIFDBuilder_ = null;
        }
        index_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.internal_static_Unk3000_GDKMIBFADKD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD build() {
        emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD buildPartial() {
        emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD result = new emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD(this);
        result.area_ = area_;
        if (unk3000AOEGLPPFIFDBuilder_ == null) {
          result.unk3000AOEGLPPFIFD_ = unk3000AOEGLPPFIFD_;
        } else {
          result.unk3000AOEGLPPFIFD_ = unk3000AOEGLPPFIFDBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD other) {
        if (other == emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD.getDefaultInstance()) return this;
        if (other.getArea() != 0) {
          setArea(other.getArea());
        }
        if (other.hasUnk3000AOEGLPPFIFD()) {
          mergeUnk3000AOEGLPPFIFD(other.getUnk3000AOEGLPPFIFD());
        }
        if (other.getIndex() != 0L) {
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
              case 40: {
                index_ = input.readInt64();

                break;
              } // case 40
              case 80: {
                area_ = input.readInt32();

                break;
              } // case 80
              case 114: {
                input.readMessage(
                    getUnk3000AOEGLPPFIFDFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 114
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

      private int area_ ;
      /**
       * <code>int32 area = 10;</code>
       * @return The area.
       */
      @java.lang.Override
      public int getArea() {
        return area_;
      }
      /**
       * <code>int32 area = 10;</code>
       * @param value The area to set.
       * @return This builder for chaining.
       */
      public Builder setArea(int value) {
        
        area_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 area = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearArea() {
        
        area_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector unk3000AOEGLPPFIFD_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> unk3000AOEGLPPFIFDBuilder_;
      /**
       * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
       * @return Whether the unk3000AOEGLPPFIFD field is set.
       */
      public boolean hasUnk3000AOEGLPPFIFD() {
        return unk3000AOEGLPPFIFDBuilder_ != null || unk3000AOEGLPPFIFD_ != null;
      }
      /**
       * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
       * @return The unk3000AOEGLPPFIFD.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getUnk3000AOEGLPPFIFD() {
        if (unk3000AOEGLPPFIFDBuilder_ == null) {
          return unk3000AOEGLPPFIFD_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : unk3000AOEGLPPFIFD_;
        } else {
          return unk3000AOEGLPPFIFDBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
       */
      public Builder setUnk3000AOEGLPPFIFD(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (unk3000AOEGLPPFIFDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          unk3000AOEGLPPFIFD_ = value;
          onChanged();
        } else {
          unk3000AOEGLPPFIFDBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
       */
      public Builder setUnk3000AOEGLPPFIFD(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (unk3000AOEGLPPFIFDBuilder_ == null) {
          unk3000AOEGLPPFIFD_ = builderForValue.build();
          onChanged();
        } else {
          unk3000AOEGLPPFIFDBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
       */
      public Builder mergeUnk3000AOEGLPPFIFD(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (unk3000AOEGLPPFIFDBuilder_ == null) {
          if (unk3000AOEGLPPFIFD_ != null) {
            unk3000AOEGLPPFIFD_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(unk3000AOEGLPPFIFD_).mergeFrom(value).buildPartial();
          } else {
            unk3000AOEGLPPFIFD_ = value;
          }
          onChanged();
        } else {
          unk3000AOEGLPPFIFDBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
       */
      public Builder clearUnk3000AOEGLPPFIFD() {
        if (unk3000AOEGLPPFIFDBuilder_ == null) {
          unk3000AOEGLPPFIFD_ = null;
          onChanged();
        } else {
          unk3000AOEGLPPFIFD_ = null;
          unk3000AOEGLPPFIFDBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getUnk3000AOEGLPPFIFDBuilder() {
        
        onChanged();
        return getUnk3000AOEGLPPFIFDFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getUnk3000AOEGLPPFIFDOrBuilder() {
        if (unk3000AOEGLPPFIFDBuilder_ != null) {
          return unk3000AOEGLPPFIFDBuilder_.getMessageOrBuilder();
        } else {
          return unk3000AOEGLPPFIFD_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : unk3000AOEGLPPFIFD_;
        }
      }
      /**
       * <code>.Vector Unk3000_AOEGLPPFIFD = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getUnk3000AOEGLPPFIFDFieldBuilder() {
        if (unk3000AOEGLPPFIFDBuilder_ == null) {
          unk3000AOEGLPPFIFDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getUnk3000AOEGLPPFIFD(),
                  getParentForChildren(),
                  isClean());
          unk3000AOEGLPPFIFD_ = null;
        }
        return unk3000AOEGLPPFIFDBuilder_;
      }

      private long index_ ;
      /**
       * <code>int64 index = 5;</code>
       * @return The index.
       */
      @java.lang.Override
      public long getIndex() {
        return index_;
      }
      /**
       * <code>int64 index = 5;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(long value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 index = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        
        index_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_GDKMIBFADKD)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_GDKMIBFADKD)
    private static final emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD();
    }

    public static emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_GDKMIBFADKD>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_GDKMIBFADKD>() {
      @java.lang.Override
      public Unk3000_GDKMIBFADKD parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3000_GDKMIBFADKD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_GDKMIBFADKD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3000GDKMIBFADKD.Unk3000_GDKMIBFADKD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_GDKMIBFADKD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_GDKMIBFADKD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_GDKMIBFADKD.proto\032\014Vector.prot" +
      "o\"X\n\023Unk3000_GDKMIBFADKD\022\014\n\004area\030\n \001(\005\022$" +
      "\n\023Unk3000_AOEGLPPFIFD\030\016 \001(\0132\007.Vector\022\r\n\005" +
      "index\030\005 \001(\003B\036\n\034emu.grasscutter.net.newpr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_Unk3000_GDKMIBFADKD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_GDKMIBFADKD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_GDKMIBFADKD_descriptor,
        new java.lang.String[] { "Area", "Unk3000AOEGLPPFIFD", "Index", });
    emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
