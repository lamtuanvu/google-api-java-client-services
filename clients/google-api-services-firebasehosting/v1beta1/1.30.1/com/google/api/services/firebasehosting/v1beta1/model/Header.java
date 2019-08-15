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

package com.google.api.services.firebasehosting.v1beta1.model;

/**
 * A [`header`](/docs/hosting/full-config#headers) defines custom headers to add to a response
 * should the request URL path match the pattern.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Hosting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Header extends com.google.api.client.json.GenericJson {

  /**
   * The user-supplied [glob pattern](/docs/hosting/full-config#glob_pattern_matching) to match
   * against the request URL path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String glob;

  /**
   * Required. The additional headers to add to the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> headers;

  /**
   * The user-supplied RE2 regular expression to match against the request URL path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regex;

  /**
   * The user-supplied [glob pattern](/docs/hosting/full-config#glob_pattern_matching) to match
   * against the request URL path.
   * @return value or {@code null} for none
   */
  public java.lang.String getGlob() {
    return glob;
  }

  /**
   * The user-supplied [glob pattern](/docs/hosting/full-config#glob_pattern_matching) to match
   * against the request URL path.
   * @param glob glob or {@code null} for none
   */
  public Header setGlob(java.lang.String glob) {
    this.glob = glob;
    return this;
  }

  /**
   * Required. The additional headers to add to the response.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getHeaders() {
    return headers;
  }

  /**
   * Required. The additional headers to add to the response.
   * @param headers headers or {@code null} for none
   */
  public Header setHeaders(java.util.Map<String, java.lang.String> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * The user-supplied RE2 regular expression to match against the request URL path.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegex() {
    return regex;
  }

  /**
   * The user-supplied RE2 regular expression to match against the request URL path.
   * @param regex regex or {@code null} for none
   */
  public Header setRegex(java.lang.String regex) {
    this.regex = regex;
    return this;
  }

  @Override
  public Header set(String fieldName, Object value) {
    return (Header) super.set(fieldName, value);
  }

  @Override
  public Header clone() {
    return (Header) super.clone();
  }

}
