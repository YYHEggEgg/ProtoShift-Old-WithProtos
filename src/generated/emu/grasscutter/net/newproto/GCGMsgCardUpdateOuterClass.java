// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgCardUpdate.proto

package emu.grasscutter.net.newproto;

public final class GCGMsgCardUpdateOuterClass {
  private GCGMsgCardUpdateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgCardUpdateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgCardUpdate)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGCard card = 14;</code>
     * @return Whether the card field is set.
     */
    boolean hasCard();
    /**
     * <code>.GCGCard card = 14;</code>
     * @return The card.
     */
    emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard getCard();
    /**
     * <code>.GCGCard card = 14;</code>
     */
    emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCardOrBuilder getCardOrBuilder();
  }
  /**
   * Protobuf type {@code GCGMsgCardUpdate}
   */
  public static final class GCGMsgCardUpdate extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgCardUpdate)
      GCGMsgCardUpdateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgCardUpdate.newBuilder() to construct.
    private GCGMsgCardUpdate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgCardUpdate() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgCardUpdate();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.internal_static_GCGMsgCardUpdate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.internal_static_GCGMsgCardUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate.class, emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate.Builder.class);
    }

    public static final int CARD_FIELD_NUMBER = 14;
    private emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard card_;
    /**
     * <code>.GCGCard card = 14;</code>
     * @return Whether the card field is set.
     */
    @java.lang.Override
    public boolean hasCard() {
      return card_ != null;
    }
    /**
     * <code>.GCGCard card = 14;</code>
     * @return The card.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard getCard() {
      return card_ == null ? emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard.getDefaultInstance() : card_;
    }
    /**
     * <code>.GCGCard card = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCardOrBuilder getCardOrBuilder() {
      return getCard();
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
      if (card_ != null) {
        output.writeMessage(14, getCard());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (card_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getCard());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate other = (emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate) obj;

      if (hasCard() != other.hasCard()) return false;
      if (hasCard()) {
        if (!getCard()
            .equals(other.getCard())) return false;
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
      if (hasCard()) {
        hash = (37 * hash) + CARD_FIELD_NUMBER;
        hash = (53 * hash) + getCard().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate prototype) {
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
     * Protobuf type {@code GCGMsgCardUpdate}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgCardUpdate)
        emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.internal_static_GCGMsgCardUpdate_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.internal_static_GCGMsgCardUpdate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate.class, emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (cardBuilder_ == null) {
          card_ = null;
        } else {
          card_ = null;
          cardBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.internal_static_GCGMsgCardUpdate_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate build() {
        emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate buildPartial() {
        emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate result = new emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate(this);
        if (cardBuilder_ == null) {
          result.card_ = card_;
        } else {
          result.card_ = cardBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate) {
          return mergeFrom((emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate other) {
        if (other == emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate.getDefaultInstance()) return this;
        if (other.hasCard()) {
          mergeCard(other.getCard());
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
              case 114: {
                input.readMessage(
                    getCardFieldBuilder().getBuilder(),
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

      private emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard card_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard, emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard.Builder, emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCardOrBuilder> cardBuilder_;
      /**
       * <code>.GCGCard card = 14;</code>
       * @return Whether the card field is set.
       */
      public boolean hasCard() {
        return cardBuilder_ != null || card_ != null;
      }
      /**
       * <code>.GCGCard card = 14;</code>
       * @return The card.
       */
      public emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard getCard() {
        if (cardBuilder_ == null) {
          return card_ == null ? emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard.getDefaultInstance() : card_;
        } else {
          return cardBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGCard card = 14;</code>
       */
      public Builder setCard(emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard value) {
        if (cardBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          card_ = value;
          onChanged();
        } else {
          cardBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGCard card = 14;</code>
       */
      public Builder setCard(
          emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard.Builder builderForValue) {
        if (cardBuilder_ == null) {
          card_ = builderForValue.build();
          onChanged();
        } else {
          cardBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGCard card = 14;</code>
       */
      public Builder mergeCard(emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard value) {
        if (cardBuilder_ == null) {
          if (card_ != null) {
            card_ =
              emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard.newBuilder(card_).mergeFrom(value).buildPartial();
          } else {
            card_ = value;
          }
          onChanged();
        } else {
          cardBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGCard card = 14;</code>
       */
      public Builder clearCard() {
        if (cardBuilder_ == null) {
          card_ = null;
          onChanged();
        } else {
          card_ = null;
          cardBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGCard card = 14;</code>
       */
      public emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard.Builder getCardBuilder() {
        
        onChanged();
        return getCardFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGCard card = 14;</code>
       */
      public emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCardOrBuilder getCardOrBuilder() {
        if (cardBuilder_ != null) {
          return cardBuilder_.getMessageOrBuilder();
        } else {
          return card_ == null ?
              emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard.getDefaultInstance() : card_;
        }
      }
      /**
       * <code>.GCGCard card = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard, emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard.Builder, emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCardOrBuilder> 
          getCardFieldBuilder() {
        if (cardBuilder_ == null) {
          cardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard, emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCard.Builder, emu.grasscutter.net.newproto.GCGCardOuterClass.GCGCardOrBuilder>(
                  getCard(),
                  getParentForChildren(),
                  isClean());
          card_ = null;
        }
        return cardBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGMsgCardUpdate)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgCardUpdate)
    private static final emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate();
    }

    public static emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgCardUpdate>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgCardUpdate>() {
      @java.lang.Override
      public GCGMsgCardUpdate parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGMsgCardUpdate> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgCardUpdate> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGMsgCardUpdateOuterClass.GCGMsgCardUpdate getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgCardUpdate_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgCardUpdate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GCGMsgCardUpdate.proto\032\rGCGCard.proto\"" +
      "*\n\020GCGMsgCardUpdate\022\026\n\004card\030\016 \001(\0132\010.GCGC" +
      "ardB\036\n\034emu.grasscutter.net.newprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.GCGCardOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgCardUpdate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgCardUpdate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgCardUpdate_descriptor,
        new java.lang.String[] { "Card", });
    emu.grasscutter.net.newproto.GCGCardOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
