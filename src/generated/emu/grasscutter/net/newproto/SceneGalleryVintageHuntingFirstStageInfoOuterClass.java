// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryVintageHuntingFirstStageInfo.proto

package emu.grasscutter.net.newproto;

public final class SceneGalleryVintageHuntingFirstStageInfoOuterClass {
  private SceneGalleryVintageHuntingFirstStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryVintageHuntingFirstStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryVintageHuntingFirstStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_IPAJLKOBDKC = 12;</code>
     * @return The unk3250IPAJLKOBDKC.
     */
    int getUnk3250IPAJLKOBDKC();

    /**
     * <code>uint32 Unk3250_HIKADHBLPEB = 15;</code>
     * @return The unk3250HIKADHBLPEB.
     */
    int getUnk3250HIKADHBLPEB();

    /**
     * <code>uint32 Unk3250_NILGNHOPGLD = 8;</code>
     * @return The unk3250NILGNHOPGLD.
     */
    int getUnk3250NILGNHOPGLD();

    /**
     * <code>uint32 score = 9;</code>
     * @return The score.
     */
    int getScore();
  }
  /**
   * Protobuf type {@code SceneGalleryVintageHuntingFirstStageInfo}
   */
  public static final class SceneGalleryVintageHuntingFirstStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryVintageHuntingFirstStageInfo)
      SceneGalleryVintageHuntingFirstStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryVintageHuntingFirstStageInfo.newBuilder() to construct.
    private SceneGalleryVintageHuntingFirstStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryVintageHuntingFirstStageInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryVintageHuntingFirstStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.internal_static_SceneGalleryVintageHuntingFirstStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.internal_static_SceneGalleryVintageHuntingFirstStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo.class, emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo.Builder.class);
    }

    public static final int UNK3250_IPAJLKOBDKC_FIELD_NUMBER = 12;
    private int unk3250IPAJLKOBDKC_;
    /**
     * <code>uint32 Unk3250_IPAJLKOBDKC = 12;</code>
     * @return The unk3250IPAJLKOBDKC.
     */
    @java.lang.Override
    public int getUnk3250IPAJLKOBDKC() {
      return unk3250IPAJLKOBDKC_;
    }

    public static final int UNK3250_HIKADHBLPEB_FIELD_NUMBER = 15;
    private int unk3250HIKADHBLPEB_;
    /**
     * <code>uint32 Unk3250_HIKADHBLPEB = 15;</code>
     * @return The unk3250HIKADHBLPEB.
     */
    @java.lang.Override
    public int getUnk3250HIKADHBLPEB() {
      return unk3250HIKADHBLPEB_;
    }

    public static final int UNK3250_NILGNHOPGLD_FIELD_NUMBER = 8;
    private int unk3250NILGNHOPGLD_;
    /**
     * <code>uint32 Unk3250_NILGNHOPGLD = 8;</code>
     * @return The unk3250NILGNHOPGLD.
     */
    @java.lang.Override
    public int getUnk3250NILGNHOPGLD() {
      return unk3250NILGNHOPGLD_;
    }

    public static final int SCORE_FIELD_NUMBER = 9;
    private int score_;
    /**
     * <code>uint32 score = 9;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
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
      if (unk3250NILGNHOPGLD_ != 0) {
        output.writeUInt32(8, unk3250NILGNHOPGLD_);
      }
      if (score_ != 0) {
        output.writeUInt32(9, score_);
      }
      if (unk3250IPAJLKOBDKC_ != 0) {
        output.writeUInt32(12, unk3250IPAJLKOBDKC_);
      }
      if (unk3250HIKADHBLPEB_ != 0) {
        output.writeUInt32(15, unk3250HIKADHBLPEB_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250NILGNHOPGLD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3250NILGNHOPGLD_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, score_);
      }
      if (unk3250IPAJLKOBDKC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk3250IPAJLKOBDKC_);
      }
      if (unk3250HIKADHBLPEB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, unk3250HIKADHBLPEB_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo other = (emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo) obj;

      if (getUnk3250IPAJLKOBDKC()
          != other.getUnk3250IPAJLKOBDKC()) return false;
      if (getUnk3250HIKADHBLPEB()
          != other.getUnk3250HIKADHBLPEB()) return false;
      if (getUnk3250NILGNHOPGLD()
          != other.getUnk3250NILGNHOPGLD()) return false;
      if (getScore()
          != other.getScore()) return false;
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
      hash = (37 * hash) + UNK3250_IPAJLKOBDKC_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250IPAJLKOBDKC();
      hash = (37 * hash) + UNK3250_HIKADHBLPEB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250HIKADHBLPEB();
      hash = (37 * hash) + UNK3250_NILGNHOPGLD_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250NILGNHOPGLD();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo prototype) {
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
     * Protobuf type {@code SceneGalleryVintageHuntingFirstStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryVintageHuntingFirstStageInfo)
        emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.internal_static_SceneGalleryVintageHuntingFirstStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.internal_static_SceneGalleryVintageHuntingFirstStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo.class, emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250IPAJLKOBDKC_ = 0;

        unk3250HIKADHBLPEB_ = 0;

        unk3250NILGNHOPGLD_ = 0;

        score_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.internal_static_SceneGalleryVintageHuntingFirstStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo build() {
        emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo buildPartial() {
        emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo result = new emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo(this);
        result.unk3250IPAJLKOBDKC_ = unk3250IPAJLKOBDKC_;
        result.unk3250HIKADHBLPEB_ = unk3250HIKADHBLPEB_;
        result.unk3250NILGNHOPGLD_ = unk3250NILGNHOPGLD_;
        result.score_ = score_;
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
        if (other instanceof emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo other) {
        if (other == emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo.getDefaultInstance()) return this;
        if (other.getUnk3250IPAJLKOBDKC() != 0) {
          setUnk3250IPAJLKOBDKC(other.getUnk3250IPAJLKOBDKC());
        }
        if (other.getUnk3250HIKADHBLPEB() != 0) {
          setUnk3250HIKADHBLPEB(other.getUnk3250HIKADHBLPEB());
        }
        if (other.getUnk3250NILGNHOPGLD() != 0) {
          setUnk3250NILGNHOPGLD(other.getUnk3250NILGNHOPGLD());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
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
                unk3250NILGNHOPGLD_ = input.readUInt32();

                break;
              } // case 64
              case 72: {
                score_ = input.readUInt32();

                break;
              } // case 72
              case 96: {
                unk3250IPAJLKOBDKC_ = input.readUInt32();

                break;
              } // case 96
              case 120: {
                unk3250HIKADHBLPEB_ = input.readUInt32();

                break;
              } // case 120
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

      private int unk3250IPAJLKOBDKC_ ;
      /**
       * <code>uint32 Unk3250_IPAJLKOBDKC = 12;</code>
       * @return The unk3250IPAJLKOBDKC.
       */
      @java.lang.Override
      public int getUnk3250IPAJLKOBDKC() {
        return unk3250IPAJLKOBDKC_;
      }
      /**
       * <code>uint32 Unk3250_IPAJLKOBDKC = 12;</code>
       * @param value The unk3250IPAJLKOBDKC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250IPAJLKOBDKC(int value) {
        
        unk3250IPAJLKOBDKC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_IPAJLKOBDKC = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250IPAJLKOBDKC() {
        
        unk3250IPAJLKOBDKC_ = 0;
        onChanged();
        return this;
      }

      private int unk3250HIKADHBLPEB_ ;
      /**
       * <code>uint32 Unk3250_HIKADHBLPEB = 15;</code>
       * @return The unk3250HIKADHBLPEB.
       */
      @java.lang.Override
      public int getUnk3250HIKADHBLPEB() {
        return unk3250HIKADHBLPEB_;
      }
      /**
       * <code>uint32 Unk3250_HIKADHBLPEB = 15;</code>
       * @param value The unk3250HIKADHBLPEB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250HIKADHBLPEB(int value) {
        
        unk3250HIKADHBLPEB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_HIKADHBLPEB = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250HIKADHBLPEB() {
        
        unk3250HIKADHBLPEB_ = 0;
        onChanged();
        return this;
      }

      private int unk3250NILGNHOPGLD_ ;
      /**
       * <code>uint32 Unk3250_NILGNHOPGLD = 8;</code>
       * @return The unk3250NILGNHOPGLD.
       */
      @java.lang.Override
      public int getUnk3250NILGNHOPGLD() {
        return unk3250NILGNHOPGLD_;
      }
      /**
       * <code>uint32 Unk3250_NILGNHOPGLD = 8;</code>
       * @param value The unk3250NILGNHOPGLD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250NILGNHOPGLD(int value) {
        
        unk3250NILGNHOPGLD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_NILGNHOPGLD = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250NILGNHOPGLD() {
        
        unk3250NILGNHOPGLD_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 9;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 9;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryVintageHuntingFirstStageInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryVintageHuntingFirstStageInfo)
    private static final emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo();
    }

    public static emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryVintageHuntingFirstStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryVintageHuntingFirstStageInfo>() {
      @java.lang.Override
      public SceneGalleryVintageHuntingFirstStageInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGalleryVintageHuntingFirstStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryVintageHuntingFirstStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SceneGalleryVintageHuntingFirstStageInfoOuterClass.SceneGalleryVintageHuntingFirstStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryVintageHuntingFirstStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryVintageHuntingFirstStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.SceneGalleryVintageHuntingFirstStageIn" +
      "fo.proto\"\220\001\n(SceneGalleryVintageHuntingF" +
      "irstStageInfo\022\033\n\023Unk3250_IPAJLKOBDKC\030\014 \001" +
      "(\r\022\033\n\023Unk3250_HIKADHBLPEB\030\017 \001(\r\022\033\n\023Unk32" +
      "50_NILGNHOPGLD\030\010 \001(\r\022\r\n\005score\030\t \001(\rB\036\n\034e" +
      "mu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryVintageHuntingFirstStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryVintageHuntingFirstStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryVintageHuntingFirstStageInfo_descriptor,
        new java.lang.String[] { "Unk3250IPAJLKOBDKC", "Unk3250HIKADHBLPEB", "Unk3250NILGNHOPGLD", "Score", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
