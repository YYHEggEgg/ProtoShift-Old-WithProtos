// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_CALNMMBNKFD.proto

package emu.grasscutter.net.newproto;

public final class Unk2700CALNMMBNKFD {
  private Unk2700CALNMMBNKFD() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_CALNMMBNKFDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_CALNMMBNKFD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
     * @return Whether the unk2700GHDHIBDLFPN field is set.
     */
    boolean hasUnk2700GHDHIBDLFPN();
    /**
     * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
     * @return The unk2700GHDHIBDLFPN.
     */
    emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB getUnk2700GHDHIBDLFPN();
    /**
     * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
     */
    emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKBOrBuilder getUnk2700GHDHIBDLFPNOrBuilder();

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 schedule_id = 11;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * <pre>
   * CmdId: 8641
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_CALNMMBNKFD}
   */
  public static final class Unk2700_CALNMMBNKFD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_CALNMMBNKFD)
      Unk2700_CALNMMBNKFDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_CALNMMBNKFD.newBuilder() to construct.
    private Unk2700_CALNMMBNKFD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_CALNMMBNKFD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_CALNMMBNKFD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.internal_static_Unk2700_CALNMMBNKFD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.internal_static_Unk2700_CALNMMBNKFD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD.class, emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD.Builder.class);
    }

    public static final int UNK2700_GHDHIBDLFPN_FIELD_NUMBER = 5;
    private emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB unk2700GHDHIBDLFPN_;
    /**
     * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
     * @return Whether the unk2700GHDHIBDLFPN field is set.
     */
    @java.lang.Override
    public boolean hasUnk2700GHDHIBDLFPN() {
      return unk2700GHDHIBDLFPN_ != null;
    }
    /**
     * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
     * @return The unk2700GHDHIBDLFPN.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB getUnk2700GHDHIBDLFPN() {
      return unk2700GHDHIBDLFPN_ == null ? emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB.getDefaultInstance() : unk2700GHDHIBDLFPN_;
    }
    /**
     * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKBOrBuilder getUnk2700GHDHIBDLFPNOrBuilder() {
      return getUnk2700GHDHIBDLFPN();
    }

    public static final int RETCODE_FIELD_NUMBER = 13;
    private int retcode_;
    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 11;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 11;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
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
      if (unk2700GHDHIBDLFPN_ != null) {
        output.writeMessage(5, getUnk2700GHDHIBDLFPN());
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(11, scheduleId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(13, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700GHDHIBDLFPN_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getUnk2700GHDHIBDLFPN());
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, scheduleId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD other = (emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD) obj;

      if (hasUnk2700GHDHIBDLFPN() != other.hasUnk2700GHDHIBDLFPN()) return false;
      if (hasUnk2700GHDHIBDLFPN()) {
        if (!getUnk2700GHDHIBDLFPN()
            .equals(other.getUnk2700GHDHIBDLFPN())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
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
      if (hasUnk2700GHDHIBDLFPN()) {
        hash = (37 * hash) + UNK2700_GHDHIBDLFPN_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700GHDHIBDLFPN().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD prototype) {
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
     * CmdId: 8641
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_CALNMMBNKFD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_CALNMMBNKFD)
        emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.internal_static_Unk2700_CALNMMBNKFD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.internal_static_Unk2700_CALNMMBNKFD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD.class, emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (unk2700GHDHIBDLFPNBuilder_ == null) {
          unk2700GHDHIBDLFPN_ = null;
        } else {
          unk2700GHDHIBDLFPN_ = null;
          unk2700GHDHIBDLFPNBuilder_ = null;
        }
        retcode_ = 0;

        scheduleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.internal_static_Unk2700_CALNMMBNKFD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD build() {
        emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD buildPartial() {
        emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD result = new emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD(this);
        if (unk2700GHDHIBDLFPNBuilder_ == null) {
          result.unk2700GHDHIBDLFPN_ = unk2700GHDHIBDLFPN_;
        } else {
          result.unk2700GHDHIBDLFPN_ = unk2700GHDHIBDLFPNBuilder_.build();
        }
        result.retcode_ = retcode_;
        result.scheduleId_ = scheduleId_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD other) {
        if (other == emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD.getDefaultInstance()) return this;
        if (other.hasUnk2700GHDHIBDLFPN()) {
          mergeUnk2700GHDHIBDLFPN(other.getUnk2700GHDHIBDLFPN());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
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
              case 42: {
                input.readMessage(
                    getUnk2700GHDHIBDLFPNFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 42
              case 88: {
                scheduleId_ = input.readUInt32();

                break;
              } // case 88
              case 104: {
                retcode_ = input.readInt32();

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

      private emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB unk2700GHDHIBDLFPN_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB, emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB.Builder, emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKBOrBuilder> unk2700GHDHIBDLFPNBuilder_;
      /**
       * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
       * @return Whether the unk2700GHDHIBDLFPN field is set.
       */
      public boolean hasUnk2700GHDHIBDLFPN() {
        return unk2700GHDHIBDLFPNBuilder_ != null || unk2700GHDHIBDLFPN_ != null;
      }
      /**
       * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
       * @return The unk2700GHDHIBDLFPN.
       */
      public emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB getUnk2700GHDHIBDLFPN() {
        if (unk2700GHDHIBDLFPNBuilder_ == null) {
          return unk2700GHDHIBDLFPN_ == null ? emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB.getDefaultInstance() : unk2700GHDHIBDLFPN_;
        } else {
          return unk2700GHDHIBDLFPNBuilder_.getMessage();
        }
      }
      /**
       * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
       */
      public Builder setUnk2700GHDHIBDLFPN(emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB value) {
        if (unk2700GHDHIBDLFPNBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          unk2700GHDHIBDLFPN_ = value;
          onChanged();
        } else {
          unk2700GHDHIBDLFPNBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
       */
      public Builder setUnk2700GHDHIBDLFPN(
          emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB.Builder builderForValue) {
        if (unk2700GHDHIBDLFPNBuilder_ == null) {
          unk2700GHDHIBDLFPN_ = builderForValue.build();
          onChanged();
        } else {
          unk2700GHDHIBDLFPNBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
       */
      public Builder mergeUnk2700GHDHIBDLFPN(emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB value) {
        if (unk2700GHDHIBDLFPNBuilder_ == null) {
          if (unk2700GHDHIBDLFPN_ != null) {
            unk2700GHDHIBDLFPN_ =
              emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB.newBuilder(unk2700GHDHIBDLFPN_).mergeFrom(value).buildPartial();
          } else {
            unk2700GHDHIBDLFPN_ = value;
          }
          onChanged();
        } else {
          unk2700GHDHIBDLFPNBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
       */
      public Builder clearUnk2700GHDHIBDLFPN() {
        if (unk2700GHDHIBDLFPNBuilder_ == null) {
          unk2700GHDHIBDLFPN_ = null;
          onChanged();
        } else {
          unk2700GHDHIBDLFPN_ = null;
          unk2700GHDHIBDLFPNBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB.Builder getUnk2700GHDHIBDLFPNBuilder() {
        
        onChanged();
        return getUnk2700GHDHIBDLFPNFieldBuilder().getBuilder();
      }
      /**
       * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKBOrBuilder getUnk2700GHDHIBDLFPNOrBuilder() {
        if (unk2700GHDHIBDLFPNBuilder_ != null) {
          return unk2700GHDHIBDLFPNBuilder_.getMessageOrBuilder();
        } else {
          return unk2700GHDHIBDLFPN_ == null ?
              emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB.getDefaultInstance() : unk2700GHDHIBDLFPN_;
        }
      }
      /**
       * <code>.Unk2700_AIMMLILLOKB Unk2700_GHDHIBDLFPN = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB, emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB.Builder, emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKBOrBuilder> 
          getUnk2700GHDHIBDLFPNFieldBuilder() {
        if (unk2700GHDHIBDLFPNBuilder_ == null) {
          unk2700GHDHIBDLFPNBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB, emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKB.Builder, emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.Unk2700_AIMMLILLOKBOrBuilder>(
                  getUnk2700GHDHIBDLFPN(),
                  getParentForChildren(),
                  isClean());
          unk2700GHDHIBDLFPN_ = null;
        }
        return unk2700GHDHIBDLFPNBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 13;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 11;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 11;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_CALNMMBNKFD)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_CALNMMBNKFD)
    private static final emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD();
    }

    public static emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_CALNMMBNKFD>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_CALNMMBNKFD>() {
      @java.lang.Override
      public Unk2700_CALNMMBNKFD parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_CALNMMBNKFD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_CALNMMBNKFD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700CALNMMBNKFD.Unk2700_CALNMMBNKFD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_CALNMMBNKFD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_CALNMMBNKFD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_CALNMMBNKFD.proto\032\031Unk2700_AIM" +
      "MLILLOKB.proto\"n\n\023Unk2700_CALNMMBNKFD\0221\n" +
      "\023Unk2700_GHDHIBDLFPN\030\005 \001(\0132\024.Unk2700_AIM" +
      "MLILLOKB\022\017\n\007retcode\030\r \001(\005\022\023\n\013schedule_id" +
      "\030\013 \001(\rB\036\n\034emu.grasscutter.net.newprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.getDescriptor(),
        });
    internal_static_Unk2700_CALNMMBNKFD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_CALNMMBNKFD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_CALNMMBNKFD_descriptor,
        new java.lang.String[] { "Unk2700GHDHIBDLFPN", "Retcode", "ScheduleId", });
    emu.grasscutter.net.newproto.Unk2700AIMMLILLOKB.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}