// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2800_CEAECGGBOKL.proto

package emu.grasscutter.net.newproto;

public final class Unk2800CEAECGGBOKL {
  private Unk2800CEAECGGBOKL() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2800_CEAECGGBOKLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2800_CEAECGGBOKL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 9;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 Unk3250_HJHODMOIMKG = 11;</code>
     * @return The unk3250HJHODMOIMKG.
     */
    int getUnk3250HJHODMOIMKG();

    /**
     * <code>uint32 Unk3250_GMKMNHIBPEP = 1;</code>
     * @return The unk3250GMKMNHIBPEP.
     */
    int getUnk3250GMKMNHIBPEP();

    /**
     * <code>uint32 Unk3250_GALEDJLAIPM = 6;</code>
     * @return The unk3250GALEDJLAIPM.
     */
    int getUnk3250GALEDJLAIPM();

    /**
     * <code>uint32 Unk3250_EGGFJCICOBD = 5;</code>
     * @return The unk3250EGGFJCICOBD.
     */
    int getUnk3250EGGFJCICOBD();
  }
  /**
   * Protobuf type {@code Unk2800_CEAECGGBOKL}
   */
  public static final class Unk2800_CEAECGGBOKL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2800_CEAECGGBOKL)
      Unk2800_CEAECGGBOKLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2800_CEAECGGBOKL.newBuilder() to construct.
    private Unk2800_CEAECGGBOKL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2800_CEAECGGBOKL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2800_CEAECGGBOKL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.internal_static_Unk2800_CEAECGGBOKL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.internal_static_Unk2800_CEAECGGBOKL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL.class, emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 9;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 9;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int UNK3250_HJHODMOIMKG_FIELD_NUMBER = 11;
    private int unk3250HJHODMOIMKG_;
    /**
     * <code>uint32 Unk3250_HJHODMOIMKG = 11;</code>
     * @return The unk3250HJHODMOIMKG.
     */
    @java.lang.Override
    public int getUnk3250HJHODMOIMKG() {
      return unk3250HJHODMOIMKG_;
    }

    public static final int UNK3250_GMKMNHIBPEP_FIELD_NUMBER = 1;
    private int unk3250GMKMNHIBPEP_;
    /**
     * <code>uint32 Unk3250_GMKMNHIBPEP = 1;</code>
     * @return The unk3250GMKMNHIBPEP.
     */
    @java.lang.Override
    public int getUnk3250GMKMNHIBPEP() {
      return unk3250GMKMNHIBPEP_;
    }

    public static final int UNK3250_GALEDJLAIPM_FIELD_NUMBER = 6;
    private int unk3250GALEDJLAIPM_;
    /**
     * <code>uint32 Unk3250_GALEDJLAIPM = 6;</code>
     * @return The unk3250GALEDJLAIPM.
     */
    @java.lang.Override
    public int getUnk3250GALEDJLAIPM() {
      return unk3250GALEDJLAIPM_;
    }

    public static final int UNK3250_EGGFJCICOBD_FIELD_NUMBER = 5;
    private int unk3250EGGFJCICOBD_;
    /**
     * <code>uint32 Unk3250_EGGFJCICOBD = 5;</code>
     * @return The unk3250EGGFJCICOBD.
     */
    @java.lang.Override
    public int getUnk3250EGGFJCICOBD() {
      return unk3250EGGFJCICOBD_;
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
      if (unk3250GMKMNHIBPEP_ != 0) {
        output.writeUInt32(1, unk3250GMKMNHIBPEP_);
      }
      if (unk3250EGGFJCICOBD_ != 0) {
        output.writeUInt32(5, unk3250EGGFJCICOBD_);
      }
      if (unk3250GALEDJLAIPM_ != 0) {
        output.writeUInt32(6, unk3250GALEDJLAIPM_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(9, dungeonId_);
      }
      if (unk3250HJHODMOIMKG_ != 0) {
        output.writeUInt32(11, unk3250HJHODMOIMKG_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250GMKMNHIBPEP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3250GMKMNHIBPEP_);
      }
      if (unk3250EGGFJCICOBD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk3250EGGFJCICOBD_);
      }
      if (unk3250GALEDJLAIPM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk3250GALEDJLAIPM_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, dungeonId_);
      }
      if (unk3250HJHODMOIMKG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk3250HJHODMOIMKG_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL other = (emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getUnk3250HJHODMOIMKG()
          != other.getUnk3250HJHODMOIMKG()) return false;
      if (getUnk3250GMKMNHIBPEP()
          != other.getUnk3250GMKMNHIBPEP()) return false;
      if (getUnk3250GALEDJLAIPM()
          != other.getUnk3250GALEDJLAIPM()) return false;
      if (getUnk3250EGGFJCICOBD()
          != other.getUnk3250EGGFJCICOBD()) return false;
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
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + UNK3250_HJHODMOIMKG_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250HJHODMOIMKG();
      hash = (37 * hash) + UNK3250_GMKMNHIBPEP_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250GMKMNHIBPEP();
      hash = (37 * hash) + UNK3250_GALEDJLAIPM_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250GALEDJLAIPM();
      hash = (37 * hash) + UNK3250_EGGFJCICOBD_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250EGGFJCICOBD();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL prototype) {
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
     * Protobuf type {@code Unk2800_CEAECGGBOKL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2800_CEAECGGBOKL)
        emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.internal_static_Unk2800_CEAECGGBOKL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.internal_static_Unk2800_CEAECGGBOKL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL.class, emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dungeonId_ = 0;

        unk3250HJHODMOIMKG_ = 0;

        unk3250GMKMNHIBPEP_ = 0;

        unk3250GALEDJLAIPM_ = 0;

        unk3250EGGFJCICOBD_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.internal_static_Unk2800_CEAECGGBOKL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL build() {
        emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL buildPartial() {
        emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL result = new emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL(this);
        result.dungeonId_ = dungeonId_;
        result.unk3250HJHODMOIMKG_ = unk3250HJHODMOIMKG_;
        result.unk3250GMKMNHIBPEP_ = unk3250GMKMNHIBPEP_;
        result.unk3250GALEDJLAIPM_ = unk3250GALEDJLAIPM_;
        result.unk3250EGGFJCICOBD_ = unk3250EGGFJCICOBD_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL other) {
        if (other == emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getUnk3250HJHODMOIMKG() != 0) {
          setUnk3250HJHODMOIMKG(other.getUnk3250HJHODMOIMKG());
        }
        if (other.getUnk3250GMKMNHIBPEP() != 0) {
          setUnk3250GMKMNHIBPEP(other.getUnk3250GMKMNHIBPEP());
        }
        if (other.getUnk3250GALEDJLAIPM() != 0) {
          setUnk3250GALEDJLAIPM(other.getUnk3250GALEDJLAIPM());
        }
        if (other.getUnk3250EGGFJCICOBD() != 0) {
          setUnk3250EGGFJCICOBD(other.getUnk3250EGGFJCICOBD());
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
                unk3250GMKMNHIBPEP_ = input.readUInt32();

                break;
              } // case 8
              case 40: {
                unk3250EGGFJCICOBD_ = input.readUInt32();

                break;
              } // case 40
              case 48: {
                unk3250GALEDJLAIPM_ = input.readUInt32();

                break;
              } // case 48
              case 72: {
                dungeonId_ = input.readUInt32();

                break;
              } // case 72
              case 88: {
                unk3250HJHODMOIMKG_ = input.readUInt32();

                break;
              } // case 88
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

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 9;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 9;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int unk3250HJHODMOIMKG_ ;
      /**
       * <code>uint32 Unk3250_HJHODMOIMKG = 11;</code>
       * @return The unk3250HJHODMOIMKG.
       */
      @java.lang.Override
      public int getUnk3250HJHODMOIMKG() {
        return unk3250HJHODMOIMKG_;
      }
      /**
       * <code>uint32 Unk3250_HJHODMOIMKG = 11;</code>
       * @param value The unk3250HJHODMOIMKG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250HJHODMOIMKG(int value) {
        
        unk3250HJHODMOIMKG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_HJHODMOIMKG = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250HJHODMOIMKG() {
        
        unk3250HJHODMOIMKG_ = 0;
        onChanged();
        return this;
      }

      private int unk3250GMKMNHIBPEP_ ;
      /**
       * <code>uint32 Unk3250_GMKMNHIBPEP = 1;</code>
       * @return The unk3250GMKMNHIBPEP.
       */
      @java.lang.Override
      public int getUnk3250GMKMNHIBPEP() {
        return unk3250GMKMNHIBPEP_;
      }
      /**
       * <code>uint32 Unk3250_GMKMNHIBPEP = 1;</code>
       * @param value The unk3250GMKMNHIBPEP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250GMKMNHIBPEP(int value) {
        
        unk3250GMKMNHIBPEP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_GMKMNHIBPEP = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250GMKMNHIBPEP() {
        
        unk3250GMKMNHIBPEP_ = 0;
        onChanged();
        return this;
      }

      private int unk3250GALEDJLAIPM_ ;
      /**
       * <code>uint32 Unk3250_GALEDJLAIPM = 6;</code>
       * @return The unk3250GALEDJLAIPM.
       */
      @java.lang.Override
      public int getUnk3250GALEDJLAIPM() {
        return unk3250GALEDJLAIPM_;
      }
      /**
       * <code>uint32 Unk3250_GALEDJLAIPM = 6;</code>
       * @param value The unk3250GALEDJLAIPM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250GALEDJLAIPM(int value) {
        
        unk3250GALEDJLAIPM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_GALEDJLAIPM = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250GALEDJLAIPM() {
        
        unk3250GALEDJLAIPM_ = 0;
        onChanged();
        return this;
      }

      private int unk3250EGGFJCICOBD_ ;
      /**
       * <code>uint32 Unk3250_EGGFJCICOBD = 5;</code>
       * @return The unk3250EGGFJCICOBD.
       */
      @java.lang.Override
      public int getUnk3250EGGFJCICOBD() {
        return unk3250EGGFJCICOBD_;
      }
      /**
       * <code>uint32 Unk3250_EGGFJCICOBD = 5;</code>
       * @param value The unk3250EGGFJCICOBD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250EGGFJCICOBD(int value) {
        
        unk3250EGGFJCICOBD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_EGGFJCICOBD = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250EGGFJCICOBD() {
        
        unk3250EGGFJCICOBD_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2800_CEAECGGBOKL)
    }

    // @@protoc_insertion_point(class_scope:Unk2800_CEAECGGBOKL)
    private static final emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL();
    }

    public static emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2800_CEAECGGBOKL>
        PARSER = new com.google.protobuf.AbstractParser<Unk2800_CEAECGGBOKL>() {
      @java.lang.Override
      public Unk2800_CEAECGGBOKL parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2800_CEAECGGBOKL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2800_CEAECGGBOKL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2800CEAECGGBOKL.Unk2800_CEAECGGBOKL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2800_CEAECGGBOKL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2800_CEAECGGBOKL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2800_CEAECGGBOKL.proto\"\235\001\n\023Unk2800_" +
      "CEAECGGBOKL\022\022\n\ndungeon_id\030\t \001(\r\022\033\n\023Unk32" +
      "50_HJHODMOIMKG\030\013 \001(\r\022\033\n\023Unk3250_GMKMNHIB" +
      "PEP\030\001 \001(\r\022\033\n\023Unk3250_GALEDJLAIPM\030\006 \001(\r\022\033" +
      "\n\023Unk3250_EGGFJCICOBD\030\005 \001(\rB\036\n\034emu.grass" +
      "cutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2800_CEAECGGBOKL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2800_CEAECGGBOKL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2800_CEAECGGBOKL_descriptor,
        new java.lang.String[] { "DungeonId", "Unk3250HJHODMOIMKG", "Unk3250GMKMNHIBPEP", "Unk3250GALEDJLAIPM", "Unk3250EGGFJCICOBD", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
