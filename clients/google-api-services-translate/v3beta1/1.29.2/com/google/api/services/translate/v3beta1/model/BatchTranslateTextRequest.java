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

package com.google.api.services.translate.v3beta1.model;

/**
 * The batch translation request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Translation API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchTranslateTextRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Glossaries to be applied for translation. It's keyed by target language code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, TranslateTextGlossaryConfig> glossaries;

  /**
   * Required. Input configurations. The total number of files matched should be <= 1000. The total
   * content size should be <= 100M Unicode codepoints. The files must use UTF-8 encoding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InputConfig> inputConfigs;

  /**
   * Optional. The models to use for translation. Map's key is target language code. Map's value is
   * model name. Value can be a built-in general model, or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:   `projects/{project-id}/locations/{location-id}/models/{model-
   * id}`
   *
   * - General (built-in) models:   `projects/{project-id}/locations/{location-
   * id}/models/general/nmt`,   `projects/{project-id}/locations/{location-id}/models/general/base`
   *
   * If the map is empty or a specific model is not requested for a language pair, then default
   * google model (nmt) is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> models;

  /**
   * Required. Output configuration. If 2 input configs match to the same file (that is, same input
   * path), we don't generate output for duplicate inputs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OutputConfig outputConfig;

  /**
   * Required. Source language code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceLanguageCode;

  /**
   * Required. Specify up to 10 language codes here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetLanguageCodes;

  /**
   * Optional. Glossaries to be applied for translation. It's keyed by target language code.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, TranslateTextGlossaryConfig> getGlossaries() {
    return glossaries;
  }

  /**
   * Optional. Glossaries to be applied for translation. It's keyed by target language code.
   * @param glossaries glossaries or {@code null} for none
   */
  public BatchTranslateTextRequest setGlossaries(java.util.Map<String, TranslateTextGlossaryConfig> glossaries) {
    this.glossaries = glossaries;
    return this;
  }

  /**
   * Required. Input configurations. The total number of files matched should be <= 1000. The total
   * content size should be <= 100M Unicode codepoints. The files must use UTF-8 encoding.
   * @return value or {@code null} for none
   */
  public java.util.List<InputConfig> getInputConfigs() {
    return inputConfigs;
  }

  /**
   * Required. Input configurations. The total number of files matched should be <= 1000. The total
   * content size should be <= 100M Unicode codepoints. The files must use UTF-8 encoding.
   * @param inputConfigs inputConfigs or {@code null} for none
   */
  public BatchTranslateTextRequest setInputConfigs(java.util.List<InputConfig> inputConfigs) {
    this.inputConfigs = inputConfigs;
    return this;
  }

  /**
   * Optional. The models to use for translation. Map's key is target language code. Map's value is
   * model name. Value can be a built-in general model, or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:   `projects/{project-id}/locations/{location-id}/models/{model-
   * id}`
   *
   * - General (built-in) models:   `projects/{project-id}/locations/{location-
   * id}/models/general/nmt`,   `projects/{project-id}/locations/{location-id}/models/general/base`
   *
   * If the map is empty or a specific model is not requested for a language pair, then default
   * google model (nmt) is used.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getModels() {
    return models;
  }

  /**
   * Optional. The models to use for translation. Map's key is target language code. Map's value is
   * model name. Value can be a built-in general model, or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:   `projects/{project-id}/locations/{location-id}/models/{model-
   * id}`
   *
   * - General (built-in) models:   `projects/{project-id}/locations/{location-
   * id}/models/general/nmt`,   `projects/{project-id}/locations/{location-id}/models/general/base`
   *
   * If the map is empty or a specific model is not requested for a language pair, then default
   * google model (nmt) is used.
   * @param models models or {@code null} for none
   */
  public BatchTranslateTextRequest setModels(java.util.Map<String, java.lang.String> models) {
    this.models = models;
    return this;
  }

  /**
   * Required. Output configuration. If 2 input configs match to the same file (that is, same input
   * path), we don't generate output for duplicate inputs.
   * @return value or {@code null} for none
   */
  public OutputConfig getOutputConfig() {
    return outputConfig;
  }

  /**
   * Required. Output configuration. If 2 input configs match to the same file (that is, same input
   * path), we don't generate output for duplicate inputs.
   * @param outputConfig outputConfig or {@code null} for none
   */
  public BatchTranslateTextRequest setOutputConfig(OutputConfig outputConfig) {
    this.outputConfig = outputConfig;
    return this;
  }

  /**
   * Required. Source language code.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceLanguageCode() {
    return sourceLanguageCode;
  }

  /**
   * Required. Source language code.
   * @param sourceLanguageCode sourceLanguageCode or {@code null} for none
   */
  public BatchTranslateTextRequest setSourceLanguageCode(java.lang.String sourceLanguageCode) {
    this.sourceLanguageCode = sourceLanguageCode;
    return this;
  }

  /**
   * Required. Specify up to 10 language codes here.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetLanguageCodes() {
    return targetLanguageCodes;
  }

  /**
   * Required. Specify up to 10 language codes here.
   * @param targetLanguageCodes targetLanguageCodes or {@code null} for none
   */
  public BatchTranslateTextRequest setTargetLanguageCodes(java.util.List<java.lang.String> targetLanguageCodes) {
    this.targetLanguageCodes = targetLanguageCodes;
    return this;
  }

  @Override
  public BatchTranslateTextRequest set(String fieldName, Object value) {
    return (BatchTranslateTextRequest) super.set(fieldName, value);
  }

  @Override
  public BatchTranslateTextRequest clone() {
    return (BatchTranslateTextRequest) super.clone();
  }

}