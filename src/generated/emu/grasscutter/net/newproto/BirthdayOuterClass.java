// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Birthday.proto

package emu.grasscutter.net.newproto;

public final class BirthdayOuterClass {
  private BirthdayOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BirthdayOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Birthday)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 month = 1;</code>
     * @return The month.
     */
    int getMonth();

    /**
     * <code>uint32 day = 2;</code>
     * @return The day.
     */
    int getDay();
  }
  /**
   * Protobuf type {@code Birthday}
   */
  public static final class Birthday extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Birthday)
      BirthdayOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Birthday.newBuilder() to construct.
    private Birthday(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Birthday() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Birthday();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.BirthdayOuterClass.internal_static_Birthday_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.BirthdayOuterClass.internal_static_Birthday_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday.class, emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday.Builder.class);
    }

    public static final int MONTH_FIELD_NUMBER = 1;
    private int month_;
    /**
     * <code>uint32 month = 1;</code>
     * @return The month.
     */
    @java.lang.Override
    public int getMonth() {
      return month_;
    }

    public static final int DAY_FIELD_NUMBER = 2;
    private int day_;
    /**
     * <code>uint32 day = 2;</code>
     * @return The day.
     */
    @java.lang.Override
    public int getDay() {
      return day_;
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
      if (month_ != 0) {
        output.writeUInt32(1, month_);
      }
      if (day_ != 0) {
        output.writeUInt32(2, day_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (month_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, month_);
      }
      if (day_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, day_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday other = (emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday) obj;

      if (getMonth()
          != other.getMonth()) return false;
      if (getDay()
          != other.getDay()) return false;
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
      hash = (37 * hash) + MONTH_FIELD_NUMBER;
      hash = (53 * hash) + getMonth();
      hash = (37 * hash) + DAY_FIELD_NUMBER;
      hash = (53 * hash) + getDay();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday prototype) {
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
     * Protobuf type {@code Birthday}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Birthday)
        emu.grasscutter.net.newproto.BirthdayOuterClass.BirthdayOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.BirthdayOuterClass.internal_static_Birthday_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.BirthdayOuterClass.internal_static_Birthday_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday.class, emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        month_ = 0;

        day_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.BirthdayOuterClass.internal_static_Birthday_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday build() {
        emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday buildPartial() {
        emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday result = new emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday(this);
        result.month_ = month_;
        result.day_ = day_;
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
        if (other instanceof emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday) {
          return mergeFrom((emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday other) {
        if (other == emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday.getDefaultInstance()) return this;
        if (other.getMonth() != 0) {
          setMonth(other.getMonth());
        }
        if (other.getDay() != 0) {
          setDay(other.getDay());
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
                month_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                day_ = input.readUInt32();

                break;
              } // case 16
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

      private int month_ ;
      /**
       * <code>uint32 month = 1;</code>
       * @return The month.
       */
      @java.lang.Override
      public int getMonth() {
        return month_;
      }
      /**
       * <code>uint32 month = 1;</code>
       * @param value The month to set.
       * @return This builder for chaining.
       */
      public Builder setMonth(int value) {
        
        month_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 month = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonth() {
        
        month_ = 0;
        onChanged();
        return this;
      }

      private int day_ ;
      /**
       * <code>uint32 day = 2;</code>
       * @return The day.
       */
      @java.lang.Override
      public int getDay() {
        return day_;
      }
      /**
       * <code>uint32 day = 2;</code>
       * @param value The day to set.
       * @return This builder for chaining.
       */
      public Builder setDay(int value) {
        
        day_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 day = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDay() {
        
        day_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Birthday)
    }

    // @@protoc_insertion_point(class_scope:Birthday)
    private static final emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday();
    }

    public static emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Birthday>
        PARSER = new com.google.protobuf.AbstractParser<Birthday>() {
      @java.lang.Override
      public Birthday parsePartialFrom(
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

    public static com.google.protobuf.Parser<Birthday> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Birthday> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.BirthdayOuterClass.Birthday getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Birthday_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Birthday_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Birthday.proto\"&\n\010Birthday\022\r\n\005month\030\001 " +
      "\001(\r\022\013\n\003day\030\002 \001(\rB\036\n\034emu.grasscutter.net." +
      "newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Birthday_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Birthday_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Birthday_descriptor,
        new java.lang.String[] { "Month", "Day", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
