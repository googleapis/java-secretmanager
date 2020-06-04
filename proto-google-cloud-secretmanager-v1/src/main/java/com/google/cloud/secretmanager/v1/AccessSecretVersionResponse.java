/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/secretmanager/v1/service.proto

package com.google.cloud.secretmanager.v1;

/**
 *
 *
 * <pre>
 * Response message for [SecretManagerService.AccessSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AccessSecretVersion].
 * </pre>
 *
 * Protobuf type {@code google.cloud.secretmanager.v1.AccessSecretVersionResponse}
 */
public final class AccessSecretVersionResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.secretmanager.v1.AccessSecretVersionResponse)
    AccessSecretVersionResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AccessSecretVersionResponse.newBuilder() to construct.
  private AccessSecretVersionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AccessSecretVersionResponse() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AccessSecretVersionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AccessSecretVersionResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.secretmanager.v1.SecretPayload.Builder subBuilder = null;
              if (payload_ != null) {
                subBuilder = payload_.toBuilder();
              }
              payload_ =
                  input.readMessage(
                      com.google.cloud.secretmanager.v1.SecretPayload.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(payload_);
                payload_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.secretmanager.v1.ServiceProto
        .internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.secretmanager.v1.ServiceProto
        .internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.secretmanager.v1.AccessSecretVersionResponse.class,
            com.google.cloud.secretmanager.v1.AccessSecretVersionResponse.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The resource name of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] in the format
   * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The resource name of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] in the format
   * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_FIELD_NUMBER = 2;
  private com.google.cloud.secretmanager.v1.SecretPayload payload_;
  /**
   *
   *
   * <pre>
   * Secret payload
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2;</code>
   *
   * @return Whether the payload field is set.
   */
  @java.lang.Override
  public boolean hasPayload() {
    return payload_ != null;
  }
  /**
   *
   *
   * <pre>
   * Secret payload
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2;</code>
   *
   * @return The payload.
   */
  @java.lang.Override
  public com.google.cloud.secretmanager.v1.SecretPayload getPayload() {
    return payload_ == null
        ? com.google.cloud.secretmanager.v1.SecretPayload.getDefaultInstance()
        : payload_;
  }
  /**
   *
   *
   * <pre>
   * Secret payload
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.secretmanager.v1.SecretPayloadOrBuilder getPayloadOrBuilder() {
    return getPayload();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (payload_ != null) {
      output.writeMessage(2, getPayload());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (payload_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPayload());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.secretmanager.v1.AccessSecretVersionResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.secretmanager.v1.AccessSecretVersionResponse other =
        (com.google.cloud.secretmanager.v1.AccessSecretVersionResponse) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasPayload() != other.hasPayload()) return false;
    if (hasPayload()) {
      if (!getPayload().equals(other.getPayload())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasPayload()) {
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.secretmanager.v1.AccessSecretVersionResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.secretmanager.v1.AccessSecretVersionResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1.AccessSecretVersionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.secretmanager.v1.AccessSecretVersionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1.AccessSecretVersionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.secretmanager.v1.AccessSecretVersionResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1.AccessSecretVersionResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.secretmanager.v1.AccessSecretVersionResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1.AccessSecretVersionResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.secretmanager.v1.AccessSecretVersionResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1.AccessSecretVersionResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.secretmanager.v1.AccessSecretVersionResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.secretmanager.v1.AccessSecretVersionResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response message for [SecretManagerService.AccessSecretVersion][google.cloud.secretmanager.v1.SecretManagerService.AccessSecretVersion].
   * </pre>
   *
   * Protobuf type {@code google.cloud.secretmanager.v1.AccessSecretVersionResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.secretmanager.v1.AccessSecretVersionResponse)
      com.google.cloud.secretmanager.v1.AccessSecretVersionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.secretmanager.v1.ServiceProto
          .internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.secretmanager.v1.ServiceProto
          .internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.secretmanager.v1.AccessSecretVersionResponse.class,
              com.google.cloud.secretmanager.v1.AccessSecretVersionResponse.Builder.class);
    }

    // Construct using com.google.cloud.secretmanager.v1.AccessSecretVersionResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (payloadBuilder_ == null) {
        payload_ = null;
      } else {
        payload_ = null;
        payloadBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.secretmanager.v1.ServiceProto
          .internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1.AccessSecretVersionResponse
        getDefaultInstanceForType() {
      return com.google.cloud.secretmanager.v1.AccessSecretVersionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1.AccessSecretVersionResponse build() {
      com.google.cloud.secretmanager.v1.AccessSecretVersionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1.AccessSecretVersionResponse buildPartial() {
      com.google.cloud.secretmanager.v1.AccessSecretVersionResponse result =
          new com.google.cloud.secretmanager.v1.AccessSecretVersionResponse(this);
      result.name_ = name_;
      if (payloadBuilder_ == null) {
        result.payload_ = payload_;
      } else {
        result.payload_ = payloadBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.secretmanager.v1.AccessSecretVersionResponse) {
        return mergeFrom((com.google.cloud.secretmanager.v1.AccessSecretVersionResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.secretmanager.v1.AccessSecretVersionResponse other) {
      if (other
          == com.google.cloud.secretmanager.v1.AccessSecretVersionResponse.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasPayload()) {
        mergePayload(other.getPayload());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.secretmanager.v1.AccessSecretVersionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.secretmanager.v1.AccessSecretVersionResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The resource name of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] in the format
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] in the format
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] in the format
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] in the format
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] in the format
     * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.secretmanager.v1.SecretPayload payload_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.secretmanager.v1.SecretPayload,
            com.google.cloud.secretmanager.v1.SecretPayload.Builder,
            com.google.cloud.secretmanager.v1.SecretPayloadOrBuilder>
        payloadBuilder_;
    /**
     *
     *
     * <pre>
     * Secret payload
     * </pre>
     *
     * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2;</code>
     *
     * @return Whether the payload field is set.
     */
    public boolean hasPayload() {
      return payloadBuilder_ != null || payload_ != null;
    }
    /**
     *
     *
     * <pre>
     * Secret payload
     * </pre>
     *
     * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2;</code>
     *
     * @return The payload.
     */
    public com.google.cloud.secretmanager.v1.SecretPayload getPayload() {
      if (payloadBuilder_ == null) {
        return payload_ == null
            ? com.google.cloud.secretmanager.v1.SecretPayload.getDefaultInstance()
            : payload_;
      } else {
        return payloadBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Secret payload
     * </pre>
     *
     * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2;</code>
     */
    public Builder setPayload(com.google.cloud.secretmanager.v1.SecretPayload value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
        onChanged();
      } else {
        payloadBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Secret payload
     * </pre>
     *
     * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2;</code>
     */
    public Builder setPayload(
        com.google.cloud.secretmanager.v1.SecretPayload.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        payload_ = builderForValue.build();
        onChanged();
      } else {
        payloadBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Secret payload
     * </pre>
     *
     * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2;</code>
     */
    public Builder mergePayload(com.google.cloud.secretmanager.v1.SecretPayload value) {
      if (payloadBuilder_ == null) {
        if (payload_ != null) {
          payload_ =
              com.google.cloud.secretmanager.v1.SecretPayload.newBuilder(payload_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          payload_ = value;
        }
        onChanged();
      } else {
        payloadBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Secret payload
     * </pre>
     *
     * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2;</code>
     */
    public Builder clearPayload() {
      if (payloadBuilder_ == null) {
        payload_ = null;
        onChanged();
      } else {
        payload_ = null;
        payloadBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Secret payload
     * </pre>
     *
     * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2;</code>
     */
    public com.google.cloud.secretmanager.v1.SecretPayload.Builder getPayloadBuilder() {

      onChanged();
      return getPayloadFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Secret payload
     * </pre>
     *
     * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2;</code>
     */
    public com.google.cloud.secretmanager.v1.SecretPayloadOrBuilder getPayloadOrBuilder() {
      if (payloadBuilder_ != null) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        return payload_ == null
            ? com.google.cloud.secretmanager.v1.SecretPayload.getDefaultInstance()
            : payload_;
      }
    }
    /**
     *
     *
     * <pre>
     * Secret payload
     * </pre>
     *
     * <code>.google.cloud.secretmanager.v1.SecretPayload payload = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.secretmanager.v1.SecretPayload,
            com.google.cloud.secretmanager.v1.SecretPayload.Builder,
            com.google.cloud.secretmanager.v1.SecretPayloadOrBuilder>
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        payloadBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.secretmanager.v1.SecretPayload,
                com.google.cloud.secretmanager.v1.SecretPayload.Builder,
                com.google.cloud.secretmanager.v1.SecretPayloadOrBuilder>(
                getPayload(), getParentForChildren(), isClean());
        payload_ = null;
      }
      return payloadBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.secretmanager.v1.AccessSecretVersionResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.AccessSecretVersionResponse)
  private static final com.google.cloud.secretmanager.v1.AccessSecretVersionResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.secretmanager.v1.AccessSecretVersionResponse();
  }

  public static com.google.cloud.secretmanager.v1.AccessSecretVersionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessSecretVersionResponse> PARSER =
      new com.google.protobuf.AbstractParser<AccessSecretVersionResponse>() {
        @java.lang.Override
        public AccessSecretVersionResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AccessSecretVersionResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AccessSecretVersionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccessSecretVersionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.secretmanager.v1.AccessSecretVersionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
