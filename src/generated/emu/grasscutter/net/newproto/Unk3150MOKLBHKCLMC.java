// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_MOKLBHKCLMC.proto

package emu.grasscutter.net.newproto;

public final class Unk3150MOKLBHKCLMC {
  private Unk3150MOKLBHKCLMC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_MOKLBHKCLMCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_MOKLBHKCLMC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
     * @return Whether the fishFarmingInfo field is set.
     */
    boolean hasFishFarmingInfo();
    /**
     * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
     * @return The fishFarmingInfo.
     */
    emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB getFishFarmingInfo();
    /**
     * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
     */
    emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBBOrBuilder getFishFarmingInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 4537
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_MOKLBHKCLMC}
   */
  public static final class Unk3150_MOKLBHKCLMC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_MOKLBHKCLMC)
      Unk3150_MOKLBHKCLMCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_MOKLBHKCLMC.newBuilder() to construct.
    private Unk3150_MOKLBHKCLMC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_MOKLBHKCLMC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_MOKLBHKCLMC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.internal_static_Unk3150_MOKLBHKCLMC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.internal_static_Unk3150_MOKLBHKCLMC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC.class, emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC.Builder.class);
    }

    public static final int FISH_FARMING_INFO_FIELD_NUMBER = 7;
    private emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB fishFarmingInfo_;
    /**
     * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
     * @return Whether the fishFarmingInfo field is set.
     */
    @java.lang.Override
    public boolean hasFishFarmingInfo() {
      return fishFarmingInfo_ != null;
    }
    /**
     * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
     * @return The fishFarmingInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB getFishFarmingInfo() {
      return fishFarmingInfo_ == null ? emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB.getDefaultInstance() : fishFarmingInfo_;
    }
    /**
     * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBBOrBuilder getFishFarmingInfoOrBuilder() {
      return getFishFarmingInfo();
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
      if (fishFarmingInfo_ != null) {
        output.writeMessage(7, getFishFarmingInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fishFarmingInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getFishFarmingInfo());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC other = (emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC) obj;

      if (hasFishFarmingInfo() != other.hasFishFarmingInfo()) return false;
      if (hasFishFarmingInfo()) {
        if (!getFishFarmingInfo()
            .equals(other.getFishFarmingInfo())) return false;
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
      if (hasFishFarmingInfo()) {
        hash = (37 * hash) + FISH_FARMING_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getFishFarmingInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC prototype) {
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
     * CmdId: 4537
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_MOKLBHKCLMC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_MOKLBHKCLMC)
        emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.internal_static_Unk3150_MOKLBHKCLMC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.internal_static_Unk3150_MOKLBHKCLMC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC.class, emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (fishFarmingInfoBuilder_ == null) {
          fishFarmingInfo_ = null;
        } else {
          fishFarmingInfo_ = null;
          fishFarmingInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.internal_static_Unk3150_MOKLBHKCLMC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC build() {
        emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC buildPartial() {
        emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC result = new emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC(this);
        if (fishFarmingInfoBuilder_ == null) {
          result.fishFarmingInfo_ = fishFarmingInfo_;
        } else {
          result.fishFarmingInfo_ = fishFarmingInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC other) {
        if (other == emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC.getDefaultInstance()) return this;
        if (other.hasFishFarmingInfo()) {
          mergeFishFarmingInfo(other.getFishFarmingInfo());
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
                    getFishFarmingInfoFieldBuilder().getBuilder(),
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

      private emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB fishFarmingInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB, emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB.Builder, emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBBOrBuilder> fishFarmingInfoBuilder_;
      /**
       * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
       * @return Whether the fishFarmingInfo field is set.
       */
      public boolean hasFishFarmingInfo() {
        return fishFarmingInfoBuilder_ != null || fishFarmingInfo_ != null;
      }
      /**
       * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
       * @return The fishFarmingInfo.
       */
      public emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB getFishFarmingInfo() {
        if (fishFarmingInfoBuilder_ == null) {
          return fishFarmingInfo_ == null ? emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB.getDefaultInstance() : fishFarmingInfo_;
        } else {
          return fishFarmingInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
       */
      public Builder setFishFarmingInfo(emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB value) {
        if (fishFarmingInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fishFarmingInfo_ = value;
          onChanged();
        } else {
          fishFarmingInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
       */
      public Builder setFishFarmingInfo(
          emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB.Builder builderForValue) {
        if (fishFarmingInfoBuilder_ == null) {
          fishFarmingInfo_ = builderForValue.build();
          onChanged();
        } else {
          fishFarmingInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
       */
      public Builder mergeFishFarmingInfo(emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB value) {
        if (fishFarmingInfoBuilder_ == null) {
          if (fishFarmingInfo_ != null) {
            fishFarmingInfo_ =
              emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB.newBuilder(fishFarmingInfo_).mergeFrom(value).buildPartial();
          } else {
            fishFarmingInfo_ = value;
          }
          onChanged();
        } else {
          fishFarmingInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
       */
      public Builder clearFishFarmingInfo() {
        if (fishFarmingInfoBuilder_ == null) {
          fishFarmingInfo_ = null;
          onChanged();
        } else {
          fishFarmingInfo_ = null;
          fishFarmingInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
       */
      public emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB.Builder getFishFarmingInfoBuilder() {
        
        onChanged();
        return getFishFarmingInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
       */
      public emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBBOrBuilder getFishFarmingInfoOrBuilder() {
        if (fishFarmingInfoBuilder_ != null) {
          return fishFarmingInfoBuilder_.getMessageOrBuilder();
        } else {
          return fishFarmingInfo_ == null ?
              emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB.getDefaultInstance() : fishFarmingInfo_;
        }
      }
      /**
       * <code>.Unk3150_CCAADPANNBB fish_farming_info = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB, emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB.Builder, emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBBOrBuilder> 
          getFishFarmingInfoFieldBuilder() {
        if (fishFarmingInfoBuilder_ == null) {
          fishFarmingInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB, emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBB.Builder, emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.Unk3150_CCAADPANNBBOrBuilder>(
                  getFishFarmingInfo(),
                  getParentForChildren(),
                  isClean());
          fishFarmingInfo_ = null;
        }
        return fishFarmingInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_MOKLBHKCLMC)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_MOKLBHKCLMC)
    private static final emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC();
    }

    public static emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_MOKLBHKCLMC>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_MOKLBHKCLMC>() {
      @java.lang.Override
      public Unk3150_MOKLBHKCLMC parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_MOKLBHKCLMC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_MOKLBHKCLMC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150MOKLBHKCLMC.Unk3150_MOKLBHKCLMC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_MOKLBHKCLMC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_MOKLBHKCLMC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_MOKLBHKCLMC.proto\032\031Unk3150_CCA" +
      "ADPANNBB.proto\"F\n\023Unk3150_MOKLBHKCLMC\022/\n" +
      "\021fish_farming_info\030\007 \001(\0132\024.Unk3150_CCAAD" +
      "PANNBBB\036\n\034emu.grasscutter.net.newprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.getDescriptor(),
        });
    internal_static_Unk3150_MOKLBHKCLMC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_MOKLBHKCLMC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_MOKLBHKCLMC_descriptor,
        new java.lang.String[] { "FishFarmingInfo", });
    emu.grasscutter.net.newproto.Unk3150CCAADPANNBB.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
