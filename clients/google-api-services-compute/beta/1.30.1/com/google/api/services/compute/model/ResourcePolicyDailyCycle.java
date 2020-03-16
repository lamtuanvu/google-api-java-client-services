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
 * Time window specified for daily operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourcePolicyDailyCycle extends com.google.api.client.json.GenericJson {

  /**
   * Defines a schedule with units measured in months. The value determines how many months pass
   * between the start of each cycle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer daysInCycle;

  /**
   * [Output only] A predetermined duration for the window, automatically chosen to be the smallest
   * possible in the given scenario.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String duration;

  /**
   * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00,
   * 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startTime;

  /**
   * Defines a schedule with units measured in months. The value determines how many months pass
   * between the start of each cycle.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDaysInCycle() {
    return daysInCycle;
  }

  /**
   * Defines a schedule with units measured in months. The value determines how many months pass
   * between the start of each cycle.
   * @param daysInCycle daysInCycle or {@code null} for none
   */
  public ResourcePolicyDailyCycle setDaysInCycle(java.lang.Integer daysInCycle) {
    this.daysInCycle = daysInCycle;
    return this;
  }

  /**
   * [Output only] A predetermined duration for the window, automatically chosen to be the smallest
   * possible in the given scenario.
   * @return value or {@code null} for none
   */
  public java.lang.String getDuration() {
    return duration;
  }

  /**
   * [Output only] A predetermined duration for the window, automatically chosen to be the smallest
   * possible in the given scenario.
   * @param duration duration or {@code null} for none
   */
  public ResourcePolicyDailyCycle setDuration(java.lang.String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00,
   * 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartTime() {
    return startTime;
  }

  /**
   * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00,
   * 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
   * @param startTime startTime or {@code null} for none
   */
  public ResourcePolicyDailyCycle setStartTime(java.lang.String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public ResourcePolicyDailyCycle set(String fieldName, Object value) {
    return (ResourcePolicyDailyCycle) super.set(fieldName, value);
  }

  @Override
  public ResourcePolicyDailyCycle clone() {
    return (ResourcePolicyDailyCycle) super.clone();
  }

}
