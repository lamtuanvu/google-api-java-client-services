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
 * Represents a FHIR store.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FhirStore extends com.google.api.client.json.GenericJson {

  /**
   * Whether to disable referential integrity in this FHIR store. This field is immutable after FHIR
   * store creation. The default value is false, meaning that the API enforces referential integrity
   * and fails the requests that result in inconsistent state in the FHIR store. When this field is
   * set to true, the API skips referential integrity checks. Consequently, operations that rely on
   * references, such as GetPatientEverything, do not return all the results if broken references
   * exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableReferentialIntegrity;

  /**
   * Whether to disable resource versioning for this FHIR store. This field can not be changed after
   * the creation of FHIR store. If set to false, which is the default behavior, all write
   * operations cause historical versions to be recorded automatically. The historical versions can
   * be fetched through the history APIs, but cannot be updated. If set to true, no historical
   * versions are kept. The server sends errors for attempts to read the historical versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableResourceVersioning;

  /**
   * Whether this FHIR store has the [updateCreate capability](https://www.hl7.org/fhir
   * /capabilitystatement-definitions.html#CapabilityStatement.rest.resource.updateCreate). This
   * determines if the client can use an Update operation to create a new resource with a client-
   * specified ID. If false, all IDs are server-assigned through the Create operation and attempts
   * to update a non-existent resource return errors. Please treat the audit logs with appropriate
   * levels of care if client-specified resource IDs contain sensitive data such as patient
   * identifiers, those IDs are part of the FHIR resource path recorded in Cloud audit logs and
   * Cloud Pub/Sub notifications.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableUpdateCreate;

  /**
   * User-supplied key-value pairs used to organize FHIR stores.
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
   * Output only. Resource name of the FHIR store, of the form
   * `projects/{project_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * If non-empty, publish all resource modifications of this FHIR store to this destination. The
   * Cloud Pub/Sub message attributes contain a map with a string describing the action that has
   * triggered the notification. For example, "action":"CreateResource".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NotificationConfig notificationConfig;

  /**
   * A list of streaming configs that configure the destinations of streaming export for every
   * resource mutation in this FHIR store. Each store is allowed to have up to 10 streaming configs.
   * After a new config is added, the next resource mutation is streamed to the new location in
   * addition to the existing ones. When a location is removed from the list, the server stops
   * streaming to that location. Before adding a new config, you must add the required
   * [`bigquery.dataEditor`](https://cloud.google.com/bigquery/docs/access-
   * control#bigquery.dataEditor) role to your project's **Cloud Healthcare Service Agent** [service
   * account](https://cloud.google.com/iam/docs/service-accounts). Some lag (typically on the order
   * of dozens of seconds) is expected before the results show up in the streaming destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StreamConfig> streamConfigs;

  /**
   * The FHIR specification version that this FHIR store supports natively. This field is immutable
   * after store creation. Requests are rejected if they contain FHIR resources of a different
   * version. An empty value is treated as STU3.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Whether to disable referential integrity in this FHIR store. This field is immutable after FHIR
   * store creation. The default value is false, meaning that the API enforces referential integrity
   * and fails the requests that result in inconsistent state in the FHIR store. When this field is
   * set to true, the API skips referential integrity checks. Consequently, operations that rely on
   * references, such as GetPatientEverything, do not return all the results if broken references
   * exist.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableReferentialIntegrity() {
    return disableReferentialIntegrity;
  }

  /**
   * Whether to disable referential integrity in this FHIR store. This field is immutable after FHIR
   * store creation. The default value is false, meaning that the API enforces referential integrity
   * and fails the requests that result in inconsistent state in the FHIR store. When this field is
   * set to true, the API skips referential integrity checks. Consequently, operations that rely on
   * references, such as GetPatientEverything, do not return all the results if broken references
   * exist.
   * @param disableReferentialIntegrity disableReferentialIntegrity or {@code null} for none
   */
  public FhirStore setDisableReferentialIntegrity(java.lang.Boolean disableReferentialIntegrity) {
    this.disableReferentialIntegrity = disableReferentialIntegrity;
    return this;
  }

  /**
   * Whether to disable resource versioning for this FHIR store. This field can not be changed after
   * the creation of FHIR store. If set to false, which is the default behavior, all write
   * operations cause historical versions to be recorded automatically. The historical versions can
   * be fetched through the history APIs, but cannot be updated. If set to true, no historical
   * versions are kept. The server sends errors for attempts to read the historical versions.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableResourceVersioning() {
    return disableResourceVersioning;
  }

  /**
   * Whether to disable resource versioning for this FHIR store. This field can not be changed after
   * the creation of FHIR store. If set to false, which is the default behavior, all write
   * operations cause historical versions to be recorded automatically. The historical versions can
   * be fetched through the history APIs, but cannot be updated. If set to true, no historical
   * versions are kept. The server sends errors for attempts to read the historical versions.
   * @param disableResourceVersioning disableResourceVersioning or {@code null} for none
   */
  public FhirStore setDisableResourceVersioning(java.lang.Boolean disableResourceVersioning) {
    this.disableResourceVersioning = disableResourceVersioning;
    return this;
  }

  /**
   * Whether this FHIR store has the [updateCreate capability](https://www.hl7.org/fhir
   * /capabilitystatement-definitions.html#CapabilityStatement.rest.resource.updateCreate). This
   * determines if the client can use an Update operation to create a new resource with a client-
   * specified ID. If false, all IDs are server-assigned through the Create operation and attempts
   * to update a non-existent resource return errors. Please treat the audit logs with appropriate
   * levels of care if client-specified resource IDs contain sensitive data such as patient
   * identifiers, those IDs are part of the FHIR resource path recorded in Cloud audit logs and
   * Cloud Pub/Sub notifications.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableUpdateCreate() {
    return enableUpdateCreate;
  }

  /**
   * Whether this FHIR store has the [updateCreate capability](https://www.hl7.org/fhir
   * /capabilitystatement-definitions.html#CapabilityStatement.rest.resource.updateCreate). This
   * determines if the client can use an Update operation to create a new resource with a client-
   * specified ID. If false, all IDs are server-assigned through the Create operation and attempts
   * to update a non-existent resource return errors. Please treat the audit logs with appropriate
   * levels of care if client-specified resource IDs contain sensitive data such as patient
   * identifiers, those IDs are part of the FHIR resource path recorded in Cloud audit logs and
   * Cloud Pub/Sub notifications.
   * @param enableUpdateCreate enableUpdateCreate or {@code null} for none
   */
  public FhirStore setEnableUpdateCreate(java.lang.Boolean enableUpdateCreate) {
    this.enableUpdateCreate = enableUpdateCreate;
    return this;
  }

  /**
   * User-supplied key-value pairs used to organize FHIR stores.
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
   * User-supplied key-value pairs used to organize FHIR stores.
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
  public FhirStore setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Resource name of the FHIR store, of the form
   * `projects/{project_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the FHIR store, of the form
   * `projects/{project_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
   * @param name name or {@code null} for none
   */
  public FhirStore setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * If non-empty, publish all resource modifications of this FHIR store to this destination. The
   * Cloud Pub/Sub message attributes contain a map with a string describing the action that has
   * triggered the notification. For example, "action":"CreateResource".
   * @return value or {@code null} for none
   */
  public NotificationConfig getNotificationConfig() {
    return notificationConfig;
  }

  /**
   * If non-empty, publish all resource modifications of this FHIR store to this destination. The
   * Cloud Pub/Sub message attributes contain a map with a string describing the action that has
   * triggered the notification. For example, "action":"CreateResource".
   * @param notificationConfig notificationConfig or {@code null} for none
   */
  public FhirStore setNotificationConfig(NotificationConfig notificationConfig) {
    this.notificationConfig = notificationConfig;
    return this;
  }

  /**
   * A list of streaming configs that configure the destinations of streaming export for every
   * resource mutation in this FHIR store. Each store is allowed to have up to 10 streaming configs.
   * After a new config is added, the next resource mutation is streamed to the new location in
   * addition to the existing ones. When a location is removed from the list, the server stops
   * streaming to that location. Before adding a new config, you must add the required
   * [`bigquery.dataEditor`](https://cloud.google.com/bigquery/docs/access-
   * control#bigquery.dataEditor) role to your project's **Cloud Healthcare Service Agent** [service
   * account](https://cloud.google.com/iam/docs/service-accounts). Some lag (typically on the order
   * of dozens of seconds) is expected before the results show up in the streaming destination.
   * @return value or {@code null} for none
   */
  public java.util.List<StreamConfig> getStreamConfigs() {
    return streamConfigs;
  }

  /**
   * A list of streaming configs that configure the destinations of streaming export for every
   * resource mutation in this FHIR store. Each store is allowed to have up to 10 streaming configs.
   * After a new config is added, the next resource mutation is streamed to the new location in
   * addition to the existing ones. When a location is removed from the list, the server stops
   * streaming to that location. Before adding a new config, you must add the required
   * [`bigquery.dataEditor`](https://cloud.google.com/bigquery/docs/access-
   * control#bigquery.dataEditor) role to your project's **Cloud Healthcare Service Agent** [service
   * account](https://cloud.google.com/iam/docs/service-accounts). Some lag (typically on the order
   * of dozens of seconds) is expected before the results show up in the streaming destination.
   * @param streamConfigs streamConfigs or {@code null} for none
   */
  public FhirStore setStreamConfigs(java.util.List<StreamConfig> streamConfigs) {
    this.streamConfigs = streamConfigs;
    return this;
  }

  /**
   * The FHIR specification version that this FHIR store supports natively. This field is immutable
   * after store creation. Requests are rejected if they contain FHIR resources of a different
   * version. An empty value is treated as STU3.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The FHIR specification version that this FHIR store supports natively. This field is immutable
   * after store creation. Requests are rejected if they contain FHIR resources of a different
   * version. An empty value is treated as STU3.
   * @param version version or {@code null} for none
   */
  public FhirStore setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public FhirStore set(String fieldName, Object value) {
    return (FhirStore) super.set(fieldName, value);
  }

  @Override
  public FhirStore clone() {
    return (FhirStore) super.clone();
  }

}
