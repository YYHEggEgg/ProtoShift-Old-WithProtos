// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDungeonSettingMuipData.proto

package emu.grasscutter.net.newproto;

public final class CustomDungeonSettingMuipDataOuterClass {
  private CustomDungeonSettingMuipDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomDungeonSettingMuipDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomDungeonSettingMuipData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_arrive_finish = 1;</code>
     * @return The isArriveFinish.
     */
    boolean getIsArriveFinish();

    /**
     * <code>uint32 coin_limit = 2;</code>
     * @return The coinLimit.
     */
    int getCoinLimit();

    /**
     * <code>uint32 time_limit = 3;</code>
     * @return The timeLimit.
     */
    int getTimeLimit();

    /**
     * <code>bool is_forbid_skill = 4;</code>
     * @return The isForbidSkill.
     */
    boolean getIsForbidSkill();

    /**
     * <code>uint32 life_num = 5;</code>
     * @return The lifeNum.
     */
    int getLifeNum();
  }
  /**
   * Protobuf type {@code CustomDungeonSettingMuipData}
   */
  public static final class CustomDungeonSettingMuipData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CustomDungeonSettingMuipData)
      CustomDungeonSettingMuipDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CustomDungeonSettingMuipData.newBuilder() to construct.
    private CustomDungeonSettingMuipData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CustomDungeonSettingMuipData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CustomDungeonSettingMuipData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.internal_static_CustomDungeonSettingMuipData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.internal_static_CustomDungeonSettingMuipData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData.class, emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData.Builder.class);
    }

    public static final int IS_ARRIVE_FINISH_FIELD_NUMBER = 1;
    private boolean isArriveFinish_;
    /**
     * <code>bool is_arrive_finish = 1;</code>
     * @return The isArriveFinish.
     */
    @java.lang.Override
    public boolean getIsArriveFinish() {
      return isArriveFinish_;
    }

    public static final int COIN_LIMIT_FIELD_NUMBER = 2;
    private int coinLimit_;
    /**
     * <code>uint32 coin_limit = 2;</code>
     * @return The coinLimit.
     */
    @java.lang.Override
    public int getCoinLimit() {
      return coinLimit_;
    }

    public static final int TIME_LIMIT_FIELD_NUMBER = 3;
    private int timeLimit_;
    /**
     * <code>uint32 time_limit = 3;</code>
     * @return The timeLimit.
     */
    @java.lang.Override
    public int getTimeLimit() {
      return timeLimit_;
    }

    public static final int IS_FORBID_SKILL_FIELD_NUMBER = 4;
    private boolean isForbidSkill_;
    /**
     * <code>bool is_forbid_skill = 4;</code>
     * @return The isForbidSkill.
     */
    @java.lang.Override
    public boolean getIsForbidSkill() {
      return isForbidSkill_;
    }

    public static final int LIFE_NUM_FIELD_NUMBER = 5;
    private int lifeNum_;
    /**
     * <code>uint32 life_num = 5;</code>
     * @return The lifeNum.
     */
    @java.lang.Override
    public int getLifeNum() {
      return lifeNum_;
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
      if (isArriveFinish_ != false) {
        output.writeBool(1, isArriveFinish_);
      }
      if (coinLimit_ != 0) {
        output.writeUInt32(2, coinLimit_);
      }
      if (timeLimit_ != 0) {
        output.writeUInt32(3, timeLimit_);
      }
      if (isForbidSkill_ != false) {
        output.writeBool(4, isForbidSkill_);
      }
      if (lifeNum_ != 0) {
        output.writeUInt32(5, lifeNum_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isArriveFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isArriveFinish_);
      }
      if (coinLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, coinLimit_);
      }
      if (timeLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, timeLimit_);
      }
      if (isForbidSkill_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isForbidSkill_);
      }
      if (lifeNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, lifeNum_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData other = (emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData) obj;

      if (getIsArriveFinish()
          != other.getIsArriveFinish()) return false;
      if (getCoinLimit()
          != other.getCoinLimit()) return false;
      if (getTimeLimit()
          != other.getTimeLimit()) return false;
      if (getIsForbidSkill()
          != other.getIsForbidSkill()) return false;
      if (getLifeNum()
          != other.getLifeNum()) return false;
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
      hash = (37 * hash) + IS_ARRIVE_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsArriveFinish());
      hash = (37 * hash) + COIN_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getCoinLimit();
      hash = (37 * hash) + TIME_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getTimeLimit();
      hash = (37 * hash) + IS_FORBID_SKILL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsForbidSkill());
      hash = (37 * hash) + LIFE_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getLifeNum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData prototype) {
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
     * Protobuf type {@code CustomDungeonSettingMuipData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomDungeonSettingMuipData)
        emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.internal_static_CustomDungeonSettingMuipData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.internal_static_CustomDungeonSettingMuipData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData.class, emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isArriveFinish_ = false;

        coinLimit_ = 0;

        timeLimit_ = 0;

        isForbidSkill_ = false;

        lifeNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.internal_static_CustomDungeonSettingMuipData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData build() {
        emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData buildPartial() {
        emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData result = new emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData(this);
        result.isArriveFinish_ = isArriveFinish_;
        result.coinLimit_ = coinLimit_;
        result.timeLimit_ = timeLimit_;
        result.isForbidSkill_ = isForbidSkill_;
        result.lifeNum_ = lifeNum_;
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
        if (other instanceof emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData) {
          return mergeFrom((emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData other) {
        if (other == emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData.getDefaultInstance()) return this;
        if (other.getIsArriveFinish() != false) {
          setIsArriveFinish(other.getIsArriveFinish());
        }
        if (other.getCoinLimit() != 0) {
          setCoinLimit(other.getCoinLimit());
        }
        if (other.getTimeLimit() != 0) {
          setTimeLimit(other.getTimeLimit());
        }
        if (other.getIsForbidSkill() != false) {
          setIsForbidSkill(other.getIsForbidSkill());
        }
        if (other.getLifeNum() != 0) {
          setLifeNum(other.getLifeNum());
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
                isArriveFinish_ = input.readBool();

                break;
              } // case 8
              case 16: {
                coinLimit_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                timeLimit_ = input.readUInt32();

                break;
              } // case 24
              case 32: {
                isForbidSkill_ = input.readBool();

                break;
              } // case 32
              case 40: {
                lifeNum_ = input.readUInt32();

                break;
              } // case 40
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

      private boolean isArriveFinish_ ;
      /**
       * <code>bool is_arrive_finish = 1;</code>
       * @return The isArriveFinish.
       */
      @java.lang.Override
      public boolean getIsArriveFinish() {
        return isArriveFinish_;
      }
      /**
       * <code>bool is_arrive_finish = 1;</code>
       * @param value The isArriveFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsArriveFinish(boolean value) {
        
        isArriveFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_arrive_finish = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsArriveFinish() {
        
        isArriveFinish_ = false;
        onChanged();
        return this;
      }

      private int coinLimit_ ;
      /**
       * <code>uint32 coin_limit = 2;</code>
       * @return The coinLimit.
       */
      @java.lang.Override
      public int getCoinLimit() {
        return coinLimit_;
      }
      /**
       * <code>uint32 coin_limit = 2;</code>
       * @param value The coinLimit to set.
       * @return This builder for chaining.
       */
      public Builder setCoinLimit(int value) {
        
        coinLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin_limit = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoinLimit() {
        
        coinLimit_ = 0;
        onChanged();
        return this;
      }

      private int timeLimit_ ;
      /**
       * <code>uint32 time_limit = 3;</code>
       * @return The timeLimit.
       */
      @java.lang.Override
      public int getTimeLimit() {
        return timeLimit_;
      }
      /**
       * <code>uint32 time_limit = 3;</code>
       * @param value The timeLimit to set.
       * @return This builder for chaining.
       */
      public Builder setTimeLimit(int value) {
        
        timeLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 time_limit = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimeLimit() {
        
        timeLimit_ = 0;
        onChanged();
        return this;
      }

      private boolean isForbidSkill_ ;
      /**
       * <code>bool is_forbid_skill = 4;</code>
       * @return The isForbidSkill.
       */
      @java.lang.Override
      public boolean getIsForbidSkill() {
        return isForbidSkill_;
      }
      /**
       * <code>bool is_forbid_skill = 4;</code>
       * @param value The isForbidSkill to set.
       * @return This builder for chaining.
       */
      public Builder setIsForbidSkill(boolean value) {
        
        isForbidSkill_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_forbid_skill = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsForbidSkill() {
        
        isForbidSkill_ = false;
        onChanged();
        return this;
      }

      private int lifeNum_ ;
      /**
       * <code>uint32 life_num = 5;</code>
       * @return The lifeNum.
       */
      @java.lang.Override
      public int getLifeNum() {
        return lifeNum_;
      }
      /**
       * <code>uint32 life_num = 5;</code>
       * @param value The lifeNum to set.
       * @return This builder for chaining.
       */
      public Builder setLifeNum(int value) {
        
        lifeNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 life_num = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLifeNum() {
        
        lifeNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CustomDungeonSettingMuipData)
    }

    // @@protoc_insertion_point(class_scope:CustomDungeonSettingMuipData)
    private static final emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData();
    }

    public static emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomDungeonSettingMuipData>
        PARSER = new com.google.protobuf.AbstractParser<CustomDungeonSettingMuipData>() {
      @java.lang.Override
      public CustomDungeonSettingMuipData parsePartialFrom(
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

    public static com.google.protobuf.Parser<CustomDungeonSettingMuipData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CustomDungeonSettingMuipData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.CustomDungeonSettingMuipDataOuterClass.CustomDungeonSettingMuipData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomDungeonSettingMuipData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomDungeonSettingMuipData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"CustomDungeonSettingMuipData.proto\"\213\001\n" +
      "\034CustomDungeonSettingMuipData\022\030\n\020is_arri" +
      "ve_finish\030\001 \001(\010\022\022\n\ncoin_limit\030\002 \001(\r\022\022\n\nt" +
      "ime_limit\030\003 \001(\r\022\027\n\017is_forbid_skill\030\004 \001(\010" +
      "\022\020\n\010life_num\030\005 \001(\rB\036\n\034emu.grasscutter.ne" +
      "t.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CustomDungeonSettingMuipData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomDungeonSettingMuipData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomDungeonSettingMuipData_descriptor,
        new java.lang.String[] { "IsArriveFinish", "CoinLimit", "TimeLimit", "IsForbidSkill", "LifeNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
