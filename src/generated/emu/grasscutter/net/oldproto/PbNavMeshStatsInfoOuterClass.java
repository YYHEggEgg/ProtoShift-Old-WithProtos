// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PbNavMeshStatsInfo.proto

package emu.grasscutter.net.oldproto;

public final class PbNavMeshStatsInfoOuterClass {
  private PbNavMeshStatsInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PbNavMeshStatsInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PbNavMeshStatsInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 authority_ai_in_combat = 10;</code>
     * @return The authorityAiInCombat.
     */
    int getAuthorityAiInCombat();

    /**
     * <code>int32 no_authority_ai_in_combat = 11;</code>
     * @return The noAuthorityAiInCombat.
     */
    int getNoAuthorityAiInCombat();

    /**
     * <code>int32 total_authority_ai = 8;</code>
     * @return The totalAuthorityAi.
     */
    int getTotalAuthorityAi();

    /**
     * <code>int32 total_no_authority_ai = 13;</code>
     * @return The totalNoAuthorityAi.
     */
    int getTotalNoAuthorityAi();
  }
  /**
   * Protobuf type {@code PbNavMeshStatsInfo}
   */
  public static final class PbNavMeshStatsInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PbNavMeshStatsInfo)
      PbNavMeshStatsInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PbNavMeshStatsInfo.newBuilder() to construct.
    private PbNavMeshStatsInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PbNavMeshStatsInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PbNavMeshStatsInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.class, emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder.class);
    }

    public static final int AUTHORITY_AI_IN_COMBAT_FIELD_NUMBER = 10;
    private int authorityAiInCombat_;
    /**
     * <code>int32 authority_ai_in_combat = 10;</code>
     * @return The authorityAiInCombat.
     */
    @java.lang.Override
    public int getAuthorityAiInCombat() {
      return authorityAiInCombat_;
    }

    public static final int NO_AUTHORITY_AI_IN_COMBAT_FIELD_NUMBER = 11;
    private int noAuthorityAiInCombat_;
    /**
     * <code>int32 no_authority_ai_in_combat = 11;</code>
     * @return The noAuthorityAiInCombat.
     */
    @java.lang.Override
    public int getNoAuthorityAiInCombat() {
      return noAuthorityAiInCombat_;
    }

    public static final int TOTAL_AUTHORITY_AI_FIELD_NUMBER = 8;
    private int totalAuthorityAi_;
    /**
     * <code>int32 total_authority_ai = 8;</code>
     * @return The totalAuthorityAi.
     */
    @java.lang.Override
    public int getTotalAuthorityAi() {
      return totalAuthorityAi_;
    }

    public static final int TOTAL_NO_AUTHORITY_AI_FIELD_NUMBER = 13;
    private int totalNoAuthorityAi_;
    /**
     * <code>int32 total_no_authority_ai = 13;</code>
     * @return The totalNoAuthorityAi.
     */
    @java.lang.Override
    public int getTotalNoAuthorityAi() {
      return totalNoAuthorityAi_;
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
      if (totalAuthorityAi_ != 0) {
        output.writeInt32(8, totalAuthorityAi_);
      }
      if (authorityAiInCombat_ != 0) {
        output.writeInt32(10, authorityAiInCombat_);
      }
      if (noAuthorityAiInCombat_ != 0) {
        output.writeInt32(11, noAuthorityAiInCombat_);
      }
      if (totalNoAuthorityAi_ != 0) {
        output.writeInt32(13, totalNoAuthorityAi_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (totalAuthorityAi_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, totalAuthorityAi_);
      }
      if (authorityAiInCombat_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, authorityAiInCombat_);
      }
      if (noAuthorityAiInCombat_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, noAuthorityAiInCombat_);
      }
      if (totalNoAuthorityAi_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, totalNoAuthorityAi_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo other = (emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo) obj;

      if (getAuthorityAiInCombat()
          != other.getAuthorityAiInCombat()) return false;
      if (getNoAuthorityAiInCombat()
          != other.getNoAuthorityAiInCombat()) return false;
      if (getTotalAuthorityAi()
          != other.getTotalAuthorityAi()) return false;
      if (getTotalNoAuthorityAi()
          != other.getTotalNoAuthorityAi()) return false;
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
      hash = (37 * hash) + AUTHORITY_AI_IN_COMBAT_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorityAiInCombat();
      hash = (37 * hash) + NO_AUTHORITY_AI_IN_COMBAT_FIELD_NUMBER;
      hash = (53 * hash) + getNoAuthorityAiInCombat();
      hash = (37 * hash) + TOTAL_AUTHORITY_AI_FIELD_NUMBER;
      hash = (53 * hash) + getTotalAuthorityAi();
      hash = (37 * hash) + TOTAL_NO_AUTHORITY_AI_FIELD_NUMBER;
      hash = (53 * hash) + getTotalNoAuthorityAi();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo prototype) {
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
     * Protobuf type {@code PbNavMeshStatsInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PbNavMeshStatsInfo)
        emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.class, emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        authorityAiInCombat_ = 0;

        noAuthorityAiInCombat_ = 0;

        totalAuthorityAi_ = 0;

        totalNoAuthorityAi_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo build() {
        emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo buildPartial() {
        emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo result = new emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo(this);
        result.authorityAiInCombat_ = authorityAiInCombat_;
        result.noAuthorityAiInCombat_ = noAuthorityAiInCombat_;
        result.totalAuthorityAi_ = totalAuthorityAi_;
        result.totalNoAuthorityAi_ = totalNoAuthorityAi_;
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
        if (other instanceof emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo other) {
        if (other == emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.getDefaultInstance()) return this;
        if (other.getAuthorityAiInCombat() != 0) {
          setAuthorityAiInCombat(other.getAuthorityAiInCombat());
        }
        if (other.getNoAuthorityAiInCombat() != 0) {
          setNoAuthorityAiInCombat(other.getNoAuthorityAiInCombat());
        }
        if (other.getTotalAuthorityAi() != 0) {
          setTotalAuthorityAi(other.getTotalAuthorityAi());
        }
        if (other.getTotalNoAuthorityAi() != 0) {
          setTotalNoAuthorityAi(other.getTotalNoAuthorityAi());
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
              case 64: {
                totalAuthorityAi_ = input.readInt32();

                break;
              } // case 64
              case 80: {
                authorityAiInCombat_ = input.readInt32();

                break;
              } // case 80
              case 88: {
                noAuthorityAiInCombat_ = input.readInt32();

                break;
              } // case 88
              case 104: {
                totalNoAuthorityAi_ = input.readInt32();

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

      private int authorityAiInCombat_ ;
      /**
       * <code>int32 authority_ai_in_combat = 10;</code>
       * @return The authorityAiInCombat.
       */
      @java.lang.Override
      public int getAuthorityAiInCombat() {
        return authorityAiInCombat_;
      }
      /**
       * <code>int32 authority_ai_in_combat = 10;</code>
       * @param value The authorityAiInCombat to set.
       * @return This builder for chaining.
       */
      public Builder setAuthorityAiInCombat(int value) {
        
        authorityAiInCombat_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 authority_ai_in_combat = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthorityAiInCombat() {
        
        authorityAiInCombat_ = 0;
        onChanged();
        return this;
      }

      private int noAuthorityAiInCombat_ ;
      /**
       * <code>int32 no_authority_ai_in_combat = 11;</code>
       * @return The noAuthorityAiInCombat.
       */
      @java.lang.Override
      public int getNoAuthorityAiInCombat() {
        return noAuthorityAiInCombat_;
      }
      /**
       * <code>int32 no_authority_ai_in_combat = 11;</code>
       * @param value The noAuthorityAiInCombat to set.
       * @return This builder for chaining.
       */
      public Builder setNoAuthorityAiInCombat(int value) {
        
        noAuthorityAiInCombat_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 no_authority_ai_in_combat = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearNoAuthorityAiInCombat() {
        
        noAuthorityAiInCombat_ = 0;
        onChanged();
        return this;
      }

      private int totalAuthorityAi_ ;
      /**
       * <code>int32 total_authority_ai = 8;</code>
       * @return The totalAuthorityAi.
       */
      @java.lang.Override
      public int getTotalAuthorityAi() {
        return totalAuthorityAi_;
      }
      /**
       * <code>int32 total_authority_ai = 8;</code>
       * @param value The totalAuthorityAi to set.
       * @return This builder for chaining.
       */
      public Builder setTotalAuthorityAi(int value) {
        
        totalAuthorityAi_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 total_authority_ai = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalAuthorityAi() {
        
        totalAuthorityAi_ = 0;
        onChanged();
        return this;
      }

      private int totalNoAuthorityAi_ ;
      /**
       * <code>int32 total_no_authority_ai = 13;</code>
       * @return The totalNoAuthorityAi.
       */
      @java.lang.Override
      public int getTotalNoAuthorityAi() {
        return totalNoAuthorityAi_;
      }
      /**
       * <code>int32 total_no_authority_ai = 13;</code>
       * @param value The totalNoAuthorityAi to set.
       * @return This builder for chaining.
       */
      public Builder setTotalNoAuthorityAi(int value) {
        
        totalNoAuthorityAi_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 total_no_authority_ai = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalNoAuthorityAi() {
        
        totalNoAuthorityAi_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PbNavMeshStatsInfo)
    }

    // @@protoc_insertion_point(class_scope:PbNavMeshStatsInfo)
    private static final emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo();
    }

    public static emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PbNavMeshStatsInfo>
        PARSER = new com.google.protobuf.AbstractParser<PbNavMeshStatsInfo>() {
      @java.lang.Override
      public PbNavMeshStatsInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<PbNavMeshStatsInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PbNavMeshStatsInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PbNavMeshStatsInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PbNavMeshStatsInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030PbNavMeshStatsInfo.proto\"\222\001\n\022PbNavMesh" +
      "StatsInfo\022\036\n\026authority_ai_in_combat\030\n \001(" +
      "\005\022!\n\031no_authority_ai_in_combat\030\013 \001(\005\022\032\n\022" +
      "total_authority_ai\030\010 \001(\005\022\035\n\025total_no_aut" +
      "hority_ai\030\r \001(\005B\036\n\034emu.grasscutter.net.o" +
      "ldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PbNavMeshStatsInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PbNavMeshStatsInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PbNavMeshStatsInfo_descriptor,
        new java.lang.String[] { "AuthorityAiInCombat", "NoAuthorityAiInCombat", "TotalAuthorityAi", "TotalNoAuthorityAi", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
