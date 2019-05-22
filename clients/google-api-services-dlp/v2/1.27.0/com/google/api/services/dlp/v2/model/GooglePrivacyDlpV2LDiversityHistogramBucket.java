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

package com.google.api.services.dlp.v2.model;

/**
 * Model definition for GooglePrivacyDlpV2LDiversityHistogramBucket.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2LDiversityHistogramBucket extends com.google.api.client.json.GenericJson {

  /**
   * Total number of equivalence classes in this bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bucketSize;

  /**
   * Total number of distinct equivalence classes in this bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bucketValueCount;

  /**
   * Sample of equivalence classes in this bucket. The total number of classes returned per bucket
   * is capped at 20.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2LDiversityEquivalenceClass> bucketValues;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2LDiversityEquivalenceClass used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2LDiversityEquivalenceClass.class);
  }

  /**
   * Lower bound on the sensitive value frequencies of the equivalence classes in this bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sensitiveValueFrequencyLowerBound;

  /**
   * Upper bound on the sensitive value frequencies of the equivalence classes in this bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sensitiveValueFrequencyUpperBound;

  /**
   * Total number of equivalence classes in this bucket.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBucketSize() {
    return bucketSize;
  }

  /**
   * Total number of equivalence classes in this bucket.
   * @param bucketSize bucketSize or {@code null} for none
   */
  public GooglePrivacyDlpV2LDiversityHistogramBucket setBucketSize(java.lang.Long bucketSize) {
    this.bucketSize = bucketSize;
    return this;
  }

  /**
   * Total number of distinct equivalence classes in this bucket.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBucketValueCount() {
    return bucketValueCount;
  }

  /**
   * Total number of distinct equivalence classes in this bucket.
   * @param bucketValueCount bucketValueCount or {@code null} for none
   */
  public GooglePrivacyDlpV2LDiversityHistogramBucket setBucketValueCount(java.lang.Long bucketValueCount) {
    this.bucketValueCount = bucketValueCount;
    return this;
  }

  /**
   * Sample of equivalence classes in this bucket. The total number of classes returned per bucket
   * is capped at 20.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2LDiversityEquivalenceClass> getBucketValues() {
    return bucketValues;
  }

  /**
   * Sample of equivalence classes in this bucket. The total number of classes returned per bucket
   * is capped at 20.
   * @param bucketValues bucketValues or {@code null} for none
   */
  public GooglePrivacyDlpV2LDiversityHistogramBucket setBucketValues(java.util.List<GooglePrivacyDlpV2LDiversityEquivalenceClass> bucketValues) {
    this.bucketValues = bucketValues;
    return this;
  }

  /**
   * Lower bound on the sensitive value frequencies of the equivalence classes in this bucket.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSensitiveValueFrequencyLowerBound() {
    return sensitiveValueFrequencyLowerBound;
  }

  /**
   * Lower bound on the sensitive value frequencies of the equivalence classes in this bucket.
   * @param sensitiveValueFrequencyLowerBound sensitiveValueFrequencyLowerBound or {@code null} for none
   */
  public GooglePrivacyDlpV2LDiversityHistogramBucket setSensitiveValueFrequencyLowerBound(java.lang.Long sensitiveValueFrequencyLowerBound) {
    this.sensitiveValueFrequencyLowerBound = sensitiveValueFrequencyLowerBound;
    return this;
  }

  /**
   * Upper bound on the sensitive value frequencies of the equivalence classes in this bucket.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSensitiveValueFrequencyUpperBound() {
    return sensitiveValueFrequencyUpperBound;
  }

  /**
   * Upper bound on the sensitive value frequencies of the equivalence classes in this bucket.
   * @param sensitiveValueFrequencyUpperBound sensitiveValueFrequencyUpperBound or {@code null} for none
   */
  public GooglePrivacyDlpV2LDiversityHistogramBucket setSensitiveValueFrequencyUpperBound(java.lang.Long sensitiveValueFrequencyUpperBound) {
    this.sensitiveValueFrequencyUpperBound = sensitiveValueFrequencyUpperBound;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2LDiversityHistogramBucket set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2LDiversityHistogramBucket) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2LDiversityHistogramBucket clone() {
    return (GooglePrivacyDlpV2LDiversityHistogramBucket) super.clone();
  }

}