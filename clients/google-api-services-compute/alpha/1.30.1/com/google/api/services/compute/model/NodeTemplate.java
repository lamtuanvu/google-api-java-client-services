/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.compute.model;

/**
 * Represent a sole-tenant Node Template resource.
 *
 * You can use a template to define properties for nodes in a node group. For more information, read
 * Creating node groups and instances. (== resource_for {$api_version}.nodeTemplates ==) (== NextID:
 * 19 ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NodeTemplate extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AcceleratorConfig> accelerators;

  static {
    // hack to force ProGuard to consider AcceleratorConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AcceleratorConfig.class);
  }

  /**
   * CPU overcommit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cpuOvercommitType;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LocalDisk> disks;

  static {
    // hack to force ProGuard to consider LocalDisk used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LocalDisk.class);
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] The type of the resource. Always compute#nodeTemplate for node templates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Labels to use for node affinity, which will be used in instance scheduling.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> nodeAffinityLabels;

  /**
   * The node type to use for nodes group that are created from this template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodeType;

  /**
   * The flexible properties of the desired node type. Node groups that use this node template will
   * create nodes of a type that matches these properties.
   *
   * This field is mutually exclusive with the node_type property; you can only define one or the
   * other, but not both.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NodeTemplateNodeTypeFlexibility nodeTypeFlexibility;

  /**
   * [Output Only] The name of the region where the node template resides, such as us-central1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * Sets the binding properties for the physical server. Valid values include: - [Default]
   * RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server  -
   * RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible
   *
   * See Sole-tenant node options for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServerBinding serverBinding;

  /**
   * [Output Only] The status of the node template. One of the following values: CREATING, READY,
   * and DELETING.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] An optional, human-readable explanation of the status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<AcceleratorConfig> getAccelerators() {
    return accelerators;
  }

  /**
   * @param accelerators accelerators or {@code null} for none
   */
  public NodeTemplate setAccelerators(java.util.List<AcceleratorConfig> accelerators) {
    this.accelerators = accelerators;
    return this;
  }

  /**
   * CPU overcommit.
   * @return value or {@code null} for none
   */
  public java.lang.String getCpuOvercommitType() {
    return cpuOvercommitType;
  }

  /**
   * CPU overcommit.
   * @param cpuOvercommitType cpuOvercommitType or {@code null} for none
   */
  public NodeTemplate setCpuOvercommitType(java.lang.String cpuOvercommitType) {
    this.cpuOvercommitType = cpuOvercommitType;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public NodeTemplate setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public NodeTemplate setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<LocalDisk> getDisks() {
    return disks;
  }

  /**
   * @param disks disks or {@code null} for none
   */
  public NodeTemplate setDisks(java.util.List<LocalDisk> disks) {
    this.disks = disks;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public NodeTemplate setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] The type of the resource. Always compute#nodeTemplate for node templates.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] The type of the resource. Always compute#nodeTemplate for node templates.
   * @param kind kind or {@code null} for none
   */
  public NodeTemplate setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public NodeTemplate setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Labels to use for node affinity, which will be used in instance scheduling.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getNodeAffinityLabels() {
    return nodeAffinityLabels;
  }

  /**
   * Labels to use for node affinity, which will be used in instance scheduling.
   * @param nodeAffinityLabels nodeAffinityLabels or {@code null} for none
   */
  public NodeTemplate setNodeAffinityLabels(java.util.Map<String, java.lang.String> nodeAffinityLabels) {
    this.nodeAffinityLabels = nodeAffinityLabels;
    return this;
  }

  /**
   * The node type to use for nodes group that are created from this template.
   * @return value or {@code null} for none
   */
  public java.lang.String getNodeType() {
    return nodeType;
  }

  /**
   * The node type to use for nodes group that are created from this template.
   * @param nodeType nodeType or {@code null} for none
   */
  public NodeTemplate setNodeType(java.lang.String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

  /**
   * The flexible properties of the desired node type. Node groups that use this node template will
   * create nodes of a type that matches these properties.
   *
   * This field is mutually exclusive with the node_type property; you can only define one or the
   * other, but not both.
   * @return value or {@code null} for none
   */
  public NodeTemplateNodeTypeFlexibility getNodeTypeFlexibility() {
    return nodeTypeFlexibility;
  }

  /**
   * The flexible properties of the desired node type. Node groups that use this node template will
   * create nodes of a type that matches these properties.
   *
   * This field is mutually exclusive with the node_type property; you can only define one or the
   * other, but not both.
   * @param nodeTypeFlexibility nodeTypeFlexibility or {@code null} for none
   */
  public NodeTemplate setNodeTypeFlexibility(NodeTemplateNodeTypeFlexibility nodeTypeFlexibility) {
    this.nodeTypeFlexibility = nodeTypeFlexibility;
    return this;
  }

  /**
   * [Output Only] The name of the region where the node template resides, such as us-central1.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] The name of the region where the node template resides, such as us-central1.
   * @param region region or {@code null} for none
   */
  public NodeTemplate setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public NodeTemplate setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public NodeTemplate setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * Sets the binding properties for the physical server. Valid values include: - [Default]
   * RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server  -
   * RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible
   *
   * See Sole-tenant node options for more information.
   * @return value or {@code null} for none
   */
  public ServerBinding getServerBinding() {
    return serverBinding;
  }

  /**
   * Sets the binding properties for the physical server. Valid values include: - [Default]
   * RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server  -
   * RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible
   *
   * See Sole-tenant node options for more information.
   * @param serverBinding serverBinding or {@code null} for none
   */
  public NodeTemplate setServerBinding(ServerBinding serverBinding) {
    this.serverBinding = serverBinding;
    return this;
  }

  /**
   * [Output Only] The status of the node template. One of the following values: CREATING, READY,
   * and DELETING.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of the node template. One of the following values: CREATING, READY,
   * and DELETING.
   * @param status status or {@code null} for none
   */
  public NodeTemplate setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] An optional, human-readable explanation of the status.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * [Output Only] An optional, human-readable explanation of the status.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public NodeTemplate setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  @Override
  public NodeTemplate set(String fieldName, Object value) {
    return (NodeTemplate) super.set(fieldName, value);
  }

  @Override
  public NodeTemplate clone() {
    return (NodeTemplate) super.clone();
  }

}
