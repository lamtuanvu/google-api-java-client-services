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
 * Represents a DICOM store.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DicomStore extends com.google.api.client.json.GenericJson {

  /**
   * User-supplied key-value pairs used to organize DICOM stores.
   *
   * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
   * bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}
   *
   * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of
   * maximum 128 bytes, and must conform to the following PCRE regular expression:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63}
   *
   * No more than 64 labels can be associated with a given store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. Resource name of the DICOM store, of the form `projects/{project_id}/locations/{lo
   * cation_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Notification destination for new DICOM instances. Supplied by the client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NotificationConfig notificationConfig;

  /**
   * User-supplied key-value pairs used to organize DICOM stores.
   *
   * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
   * bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}
   *
   * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of
   * maximum 128 bytes, and must conform to the following PCRE regular expression:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63}
   *
   * No more than 64 labels can be associated with a given store.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * User-supplied key-value pairs used to organize DICOM stores.
   *
   * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
   * bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}
   *
   * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of
   * maximum 128 bytes, and must conform to the following PCRE regular expression:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63}
   *
   * No more than 64 labels can be associated with a given store.
   * @param labels labels or {@code null} for none
   */
  public DicomStore setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Resource name of the DICOM store, of the form `projects/{project_id}/locations/{lo
   * cation_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the DICOM store, of the form `projects/{project_id}/locations/{lo
   * cation_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`.
   * @param name name or {@code null} for none
   */
  public DicomStore setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Notification destination for new DICOM instances. Supplied by the client.
   * @return value or {@code null} for none
   */
  public NotificationConfig getNotificationConfig() {
    return notificationConfig;
  }

  /**
   * Notification destination for new DICOM instances. Supplied by the client.
   * @param notificationConfig notificationConfig or {@code null} for none
   */
  public DicomStore setNotificationConfig(NotificationConfig notificationConfig) {
    this.notificationConfig = notificationConfig;
    return this;
  }

  @Override
  public DicomStore set(String fieldName, Object value) {
    return (DicomStore) super.set(fieldName, value);
  }

  @Override
  public DicomStore clone() {
    return (DicomStore) super.clone();
  }

}
