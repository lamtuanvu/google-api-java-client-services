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
 * Publish findings of a DlpJob to Cloud Data Catalog. Labels summarizing the results of the DlpJob
 * will be applied to the entry for the resource scanned in Cloud Data Catalog. Any labels
 * previously written by another DlpJob will be deleted. InfoType naming patterns are strictly
 * enforced when using this feature. Note that the findings will be persisted in Cloud Data Catalog
 * storage and are governed by Data Catalog service-specific policy, see
 * https://cloud.google.com/terms/service-terms Only a single instance of this action can be
 * specified and only allowed if all resources being scanned are BigQuery tables. Compatible with:
 * Inspect
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
public final class GooglePrivacyDlpV2PublishFindingsToCloudDataCatalog extends com.google.api.client.json.GenericJson {

  @Override
  public GooglePrivacyDlpV2PublishFindingsToCloudDataCatalog set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2PublishFindingsToCloudDataCatalog) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2PublishFindingsToCloudDataCatalog clone() {
    return (GooglePrivacyDlpV2PublishFindingsToCloudDataCatalog) super.clone();
  }

}