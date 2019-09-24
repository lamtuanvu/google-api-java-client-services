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

package com.google.api.services.run.v1.model;

/**
 * ResourceRequirements describes the compute resource requirements.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceRequirements extends com.google.api.client.json.GenericJson {

  /**
   * (Optional)
   *
   * Cloud Run fully managed: Only memory is supported
   *
   * Cloud Run for Anthos: supported
   *
   * Limits describes the maximum amount of compute resources allowed. The values of the map is
   * string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/st
   * aging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> limits;

  /**
   * (Optional)
   *
   * Cloud Run fully managed: not supported
   *
   * Cloud Run for Anthos: supported
   *
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for
   * a container, it defaults to Limits if that is explicitly specified, otherwise to an
   * implementation-defined value. The values of the map is string form of the 'quantity' k8s type: 
   * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/re
   * source/quantity.go
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> requests;

  /**
   * (Optional)
   *
   * Cloud Run fully managed: Only memory is supported
   *
   * Cloud Run for Anthos: supported
   *
   * Limits describes the maximum amount of compute resources allowed. The values of the map is
   * string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/st
   * aging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLimits() {
    return limits;
  }

  /**
   * (Optional)
   *
   * Cloud Run fully managed: Only memory is supported
   *
   * Cloud Run for Anthos: supported
   *
   * Limits describes the maximum amount of compute resources allowed. The values of the map is
   * string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/st
   * aging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
   * @param limits limits or {@code null} for none
   */
  public ResourceRequirements setLimits(java.util.Map<String, java.lang.String> limits) {
    this.limits = limits;
    return this;
  }

  /**
   * (Optional)
   *
   * Cloud Run fully managed: not supported
   *
   * Cloud Run for Anthos: supported
   *
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for
   * a container, it defaults to Limits if that is explicitly specified, otherwise to an
   * implementation-defined value. The values of the map is string form of the 'quantity' k8s type: 
   * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/re
   * source/quantity.go
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getRequests() {
    return requests;
  }

  /**
   * (Optional)
   *
   * Cloud Run fully managed: not supported
   *
   * Cloud Run for Anthos: supported
   *
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for
   * a container, it defaults to Limits if that is explicitly specified, otherwise to an
   * implementation-defined value. The values of the map is string form of the 'quantity' k8s type: 
   * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/re
   * source/quantity.go
   * @param requests requests or {@code null} for none
   */
  public ResourceRequirements setRequests(java.util.Map<String, java.lang.String> requests) {
    this.requests = requests;
    return this;
  }

  @Override
  public ResourceRequirements set(String fieldName, Object value) {
    return (ResourceRequirements) super.set(fieldName, value);
  }

  @Override
  public ResourceRequirements clone() {
    return (ResourceRequirements) super.clone();
  }

}