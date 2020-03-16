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
 * Sets the scheduling options for an Instance. NextID: 10
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Scheduling extends com.google.api.client.json.GenericJson {

  /**
   * Specifies whether the instance should be automatically restarted if it is terminated by Compute
   * Engine (not terminated by a user). You can only set the automatic restart option for standard
   * instances. Preemptible instances cannot be automatically restarted.
   *
   * By default, this is set to true so an instance is automatically restarted if it is terminated
   * by Compute Engine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean automaticRestart;

  /**
   * Defines whether the instance is tolerant of higher cpu latency. This can only be set during
   * instance creation, or when the instance is not currently running. It must not be set if the
   * preemptible option is also set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean latencyTolerant;

  /**
   * An opaque location hint used to place the instance close to other resources. This field is for
   * use by internal tools that use the public API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationHint;

  /**
   * Compute Engine Long Term Release. When specified, VMs that have this policy become long term
   * release (internal: stable fleet) VMs.
   *
   * For all VM shapes, this should result in fewer disruptions due to software updates and greater
   * predictability via 1 week extended notifications.
   *
   * For GPU VMs, this should also result in an 2 week uptime guarantee. See go/stable-fleet-gpus-
   * design for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean longTermRelease;

  /**
   * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant
   * node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minNodeCpus;

  /**
   * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for
   * more information. Overrides reservationAffinity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SchedulingNodeAffinity> nodeAffinities;

  /**
   * Defines the maintenance behavior for this instance. For standard instances, the default
   * behavior is MIGRATE. For preemptible instances, the default and only possible behavior is
   * TERMINATE. For more information, see Setting Instance Scheduling Options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String onHostMaintenance;

  /**
   * Defines whether the instance is preemptible. This can only be set during instance creation, it
   * cannot be set or changed after the instance has been created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean preemptible;

  /**
   * Specifies whether the instance should be automatically restarted if it is terminated by Compute
   * Engine (not terminated by a user). You can only set the automatic restart option for standard
   * instances. Preemptible instances cannot be automatically restarted.
   *
   * By default, this is set to true so an instance is automatically restarted if it is terminated
   * by Compute Engine.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutomaticRestart() {
    return automaticRestart;
  }

  /**
   * Specifies whether the instance should be automatically restarted if it is terminated by Compute
   * Engine (not terminated by a user). You can only set the automatic restart option for standard
   * instances. Preemptible instances cannot be automatically restarted.
   *
   * By default, this is set to true so an instance is automatically restarted if it is terminated
   * by Compute Engine.
   * @param automaticRestart automaticRestart or {@code null} for none
   */
  public Scheduling setAutomaticRestart(java.lang.Boolean automaticRestart) {
    this.automaticRestart = automaticRestart;
    return this;
  }

  /**
   * Defines whether the instance is tolerant of higher cpu latency. This can only be set during
   * instance creation, or when the instance is not currently running. It must not be set if the
   * preemptible option is also set.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLatencyTolerant() {
    return latencyTolerant;
  }

  /**
   * Defines whether the instance is tolerant of higher cpu latency. This can only be set during
   * instance creation, or when the instance is not currently running. It must not be set if the
   * preemptible option is also set.
   * @param latencyTolerant latencyTolerant or {@code null} for none
   */
  public Scheduling setLatencyTolerant(java.lang.Boolean latencyTolerant) {
    this.latencyTolerant = latencyTolerant;
    return this;
  }

  /**
   * An opaque location hint used to place the instance close to other resources. This field is for
   * use by internal tools that use the public API.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationHint() {
    return locationHint;
  }

  /**
   * An opaque location hint used to place the instance close to other resources. This field is for
   * use by internal tools that use the public API.
   * @param locationHint locationHint or {@code null} for none
   */
  public Scheduling setLocationHint(java.lang.String locationHint) {
    this.locationHint = locationHint;
    return this;
  }

  /**
   * Compute Engine Long Term Release. When specified, VMs that have this policy become long term
   * release (internal: stable fleet) VMs.
   *
   * For all VM shapes, this should result in fewer disruptions due to software updates and greater
   * predictability via 1 week extended notifications.
   *
   * For GPU VMs, this should also result in an 2 week uptime guarantee. See go/stable-fleet-gpus-
   * design for more details.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLongTermRelease() {
    return longTermRelease;
  }

  /**
   * Compute Engine Long Term Release. When specified, VMs that have this policy become long term
   * release (internal: stable fleet) VMs.
   *
   * For all VM shapes, this should result in fewer disruptions due to software updates and greater
   * predictability via 1 week extended notifications.
   *
   * For GPU VMs, this should also result in an 2 week uptime guarantee. See go/stable-fleet-gpus-
   * design for more details.
   * @param longTermRelease longTermRelease or {@code null} for none
   */
  public Scheduling setLongTermRelease(java.lang.Boolean longTermRelease) {
    this.longTermRelease = longTermRelease;
    return this;
  }

  /**
   * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant
   * node.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinNodeCpus() {
    return minNodeCpus;
  }

  /**
   * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant
   * node.
   * @param minNodeCpus minNodeCpus or {@code null} for none
   */
  public Scheduling setMinNodeCpus(java.lang.Integer minNodeCpus) {
    this.minNodeCpus = minNodeCpus;
    return this;
  }

  /**
   * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for
   * more information. Overrides reservationAffinity.
   * @return value or {@code null} for none
   */
  public java.util.List<SchedulingNodeAffinity> getNodeAffinities() {
    return nodeAffinities;
  }

  /**
   * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for
   * more information. Overrides reservationAffinity.
   * @param nodeAffinities nodeAffinities or {@code null} for none
   */
  public Scheduling setNodeAffinities(java.util.List<SchedulingNodeAffinity> nodeAffinities) {
    this.nodeAffinities = nodeAffinities;
    return this;
  }

  /**
   * Defines the maintenance behavior for this instance. For standard instances, the default
   * behavior is MIGRATE. For preemptible instances, the default and only possible behavior is
   * TERMINATE. For more information, see Setting Instance Scheduling Options.
   * @return value or {@code null} for none
   */
  public java.lang.String getOnHostMaintenance() {
    return onHostMaintenance;
  }

  /**
   * Defines the maintenance behavior for this instance. For standard instances, the default
   * behavior is MIGRATE. For preemptible instances, the default and only possible behavior is
   * TERMINATE. For more information, see Setting Instance Scheduling Options.
   * @param onHostMaintenance onHostMaintenance or {@code null} for none
   */
  public Scheduling setOnHostMaintenance(java.lang.String onHostMaintenance) {
    this.onHostMaintenance = onHostMaintenance;
    return this;
  }

  /**
   * Defines whether the instance is preemptible. This can only be set during instance creation, it
   * cannot be set or changed after the instance has been created.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPreemptible() {
    return preemptible;
  }

  /**
   * Defines whether the instance is preemptible. This can only be set during instance creation, it
   * cannot be set or changed after the instance has been created.
   * @param preemptible preemptible or {@code null} for none
   */
  public Scheduling setPreemptible(java.lang.Boolean preemptible) {
    this.preemptible = preemptible;
    return this;
  }

  @Override
  public Scheduling set(String fieldName, Object value) {
    return (Scheduling) super.set(fieldName, value);
  }

  @Override
  public Scheduling clone() {
    return (Scheduling) super.clone();
  }

}
