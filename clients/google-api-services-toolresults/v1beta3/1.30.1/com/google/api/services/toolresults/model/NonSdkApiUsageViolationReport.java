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

package com.google.api.services.toolresults.model;

/**
 * Contains a summary and examples of non-sdk API usage violations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NonSdkApiUsageViolationReport extends com.google.api.client.json.GenericJson {

  /**
   * Examples of the detected API usages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NonSdkApi> exampleApis;

  static {
    // hack to force ProGuard to consider NonSdkApi used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(NonSdkApi.class);
  }

  /**
   * Minimum API level required for the application to run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minSdkVersion;

  /**
   * Specifies the API Level on which the application is designed to run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetSdkVersion;

  /**
   * Total number of unique Non-SDK API's accessed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer uniqueApis;

  /**
   * Examples of the detected API usages.
   * @return value or {@code null} for none
   */
  public java.util.List<NonSdkApi> getExampleApis() {
    return exampleApis;
  }

  /**
   * Examples of the detected API usages.
   * @param exampleApis exampleApis or {@code null} for none
   */
  public NonSdkApiUsageViolationReport setExampleApis(java.util.List<NonSdkApi> exampleApis) {
    this.exampleApis = exampleApis;
    return this;
  }

  /**
   * Minimum API level required for the application to run.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinSdkVersion() {
    return minSdkVersion;
  }

  /**
   * Minimum API level required for the application to run.
   * @param minSdkVersion minSdkVersion or {@code null} for none
   */
  public NonSdkApiUsageViolationReport setMinSdkVersion(java.lang.Integer minSdkVersion) {
    this.minSdkVersion = minSdkVersion;
    return this;
  }

  /**
   * Specifies the API Level on which the application is designed to run.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetSdkVersion() {
    return targetSdkVersion;
  }

  /**
   * Specifies the API Level on which the application is designed to run.
   * @param targetSdkVersion targetSdkVersion or {@code null} for none
   */
  public NonSdkApiUsageViolationReport setTargetSdkVersion(java.lang.Integer targetSdkVersion) {
    this.targetSdkVersion = targetSdkVersion;
    return this;
  }

  /**
   * Total number of unique Non-SDK API's accessed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUniqueApis() {
    return uniqueApis;
  }

  /**
   * Total number of unique Non-SDK API's accessed.
   * @param uniqueApis uniqueApis or {@code null} for none
   */
  public NonSdkApiUsageViolationReport setUniqueApis(java.lang.Integer uniqueApis) {
    this.uniqueApis = uniqueApis;
    return this;
  }

  @Override
  public NonSdkApiUsageViolationReport set(String fieldName, Object value) {
    return (NonSdkApiUsageViolationReport) super.set(fieldName, value);
  }

  @Override
  public NonSdkApiUsageViolationReport clone() {
    return (NonSdkApiUsageViolationReport) super.clone();
  }

}
