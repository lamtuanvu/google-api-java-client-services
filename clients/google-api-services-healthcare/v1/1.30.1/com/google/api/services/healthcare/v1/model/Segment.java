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

package com.google.api.services.healthcare.v1.model;

/**
 * A segment in a structured format.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Segment extends com.google.api.client.json.GenericJson {

  /**
   * A mapping from the positional location to the value. The key string uses zero-based indexes
   * separated by dots to identify Fields, components and sub-components. A bracket notation is also
   * used to identify different instances of a repeated field. Regex for key:
   * (\d+)(\[\d+\])?(.\d+)?(.\d+)?
   *
   * Examples of (key, value) pairs:
   *
   * * (0.1, "hemoglobin") denotes that the first component of Field 0 has the   value "hemoglobin".
   *
   * * (1.1.2, "CBC") denotes that the second sub-component of the first   component of Field 1 has
   * the value "CBC".
   *
   * * (1[0].1, "HbA1c") denotes that the first component of the   first Instance of Field 1, which
   * is repeated, has the value "HbA1c".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> fields;

  /**
   * A string that indicates the type of segment. For example, EVN or PID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String segmentId;

  /**
   * Set ID for segments that can be in a set. This can be empty if it's missing or isn't
   * applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String setId;

  /**
   * A mapping from the positional location to the value. The key string uses zero-based indexes
   * separated by dots to identify Fields, components and sub-components. A bracket notation is also
   * used to identify different instances of a repeated field. Regex for key:
   * (\d+)(\[\d+\])?(.\d+)?(.\d+)?
   *
   * Examples of (key, value) pairs:
   *
   * * (0.1, "hemoglobin") denotes that the first component of Field 0 has the   value "hemoglobin".
   *
   * * (1.1.2, "CBC") denotes that the second sub-component of the first   component of Field 1 has
   * the value "CBC".
   *
   * * (1[0].1, "HbA1c") denotes that the first component of the   first Instance of Field 1, which
   * is repeated, has the value "HbA1c".
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getFields() {
    return fields;
  }

  /**
   * A mapping from the positional location to the value. The key string uses zero-based indexes
   * separated by dots to identify Fields, components and sub-components. A bracket notation is also
   * used to identify different instances of a repeated field. Regex for key:
   * (\d+)(\[\d+\])?(.\d+)?(.\d+)?
   *
   * Examples of (key, value) pairs:
   *
   * * (0.1, "hemoglobin") denotes that the first component of Field 0 has the   value "hemoglobin".
   *
   * * (1.1.2, "CBC") denotes that the second sub-component of the first   component of Field 1 has
   * the value "CBC".
   *
   * * (1[0].1, "HbA1c") denotes that the first component of the   first Instance of Field 1, which
   * is repeated, has the value "HbA1c".
   * @param fields fields or {@code null} for none
   */
  public Segment setFields(java.util.Map<String, java.lang.String> fields) {
    this.fields = fields;
    return this;
  }

  /**
   * A string that indicates the type of segment. For example, EVN or PID.
   * @return value or {@code null} for none
   */
  public java.lang.String getSegmentId() {
    return segmentId;
  }

  /**
   * A string that indicates the type of segment. For example, EVN or PID.
   * @param segmentId segmentId or {@code null} for none
   */
  public Segment setSegmentId(java.lang.String segmentId) {
    this.segmentId = segmentId;
    return this;
  }

  /**
   * Set ID for segments that can be in a set. This can be empty if it's missing or isn't
   * applicable.
   * @return value or {@code null} for none
   */
  public java.lang.String getSetId() {
    return setId;
  }

  /**
   * Set ID for segments that can be in a set. This can be empty if it's missing or isn't
   * applicable.
   * @param setId setId or {@code null} for none
   */
  public Segment setSetId(java.lang.String setId) {
    this.setId = setId;
    return this;
  }

  @Override
  public Segment set(String fieldName, Object value) {
    return (Segment) super.set(fieldName, value);
  }

  @Override
  public Segment clone() {
    return (Segment) super.clone();
  }

}
