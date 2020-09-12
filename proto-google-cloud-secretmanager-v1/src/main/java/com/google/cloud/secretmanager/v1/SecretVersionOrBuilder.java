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
// source: google/cloud/secretmanager/v1/resources.proto

package com.google.cloud.secretmanager.v1;

public interface SecretVersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.secretmanager.v1.SecretVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] in the
   * format `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
   * [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] IDs in a [Secret][google.cloud.secretmanager.v1.Secret] start at 1 and
   * are incremented for each subsequent version of the secret.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] in the
   * format `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
   * [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] IDs in a [Secret][google.cloud.secretmanager.v1.Secret] start at 1 and
   * are incremented for each subsequent version of the secret.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time at which the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time this [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] was destroyed.
   * Only present if [state][google.cloud.secretmanager.v1.SecretVersion.state] is
   * [DESTROYED][google.cloud.secretmanager.v1.SecretVersion.State.DESTROYED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp destroy_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the destroyTime field is set.
   */
  boolean hasDestroyTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] was destroyed.
   * Only present if [state][google.cloud.secretmanager.v1.SecretVersion.state] is
   * [DESTROYED][google.cloud.secretmanager.v1.SecretVersion.State.DESTROYED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp destroy_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The destroyTime.
   */
  com.google.protobuf.Timestamp getDestroyTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this [SecretVersion][google.cloud.secretmanager.v1.SecretVersion] was destroyed.
   * Only present if [state][google.cloud.secretmanager.v1.SecretVersion.state] is
   * [DESTROYED][google.cloud.secretmanager.v1.SecretVersion.State.DESTROYED].
   * </pre>
   *
   * <code>.google.protobuf.Timestamp destroy_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDestroyTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion].
   * </pre>
   *
   * <code>
   * .google.cloud.secretmanager.v1.SecretVersion.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion].
   * </pre>
   *
   * <code>
   * .google.cloud.secretmanager.v1.SecretVersion.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.secretmanager.v1.SecretVersion.State getState();

  /**
   *
   *
   * <pre>
   * The replication status of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion].
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.ReplicationStatus replication_status = 5;</code>
   *
   * @return Whether the replicationStatus field is set.
   */
  boolean hasReplicationStatus();
  /**
   *
   *
   * <pre>
   * The replication status of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion].
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.ReplicationStatus replication_status = 5;</code>
   *
   * @return The replicationStatus.
   */
  com.google.cloud.secretmanager.v1.ReplicationStatus getReplicationStatus();
  /**
   *
   *
   * <pre>
   * The replication status of the [SecretVersion][google.cloud.secretmanager.v1.SecretVersion].
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.ReplicationStatus replication_status = 5;</code>
   */
  com.google.cloud.secretmanager.v1.ReplicationStatusOrBuilder getReplicationStatusOrBuilder();
}
