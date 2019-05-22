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

package com.google.api.services.androidenterprise.model;

/**
 * The presence of an Entitlements resource indicates that a user has the right to use a particular
 * app. Entitlements are user specific, not device specific. This allows a user with an entitlement
 * to an app to install the app on all their devices. It's also possible for a user to hold an
 * entitlement to an app without installing the app on any device.
 *
 * The API can be used to create an entitlement. As an option, you can also use the API to trigger
 * the installation of an app on all a user's managed devices at the same time the entitlement is
 * created.
 *
 * If the app is free, creating the entitlement also creates a group license for that app. For paid
 * apps, creating the entitlement consumes one license, and that license remains consumed until the
 * entitlement is removed. If the enterprise hasn't purchased enough licenses, then no entitlement
 * is created and the installation fails. An entitlement is also not created for an app if the app
 * requires permissions that the enterprise hasn't accepted.
 *
 * If an entitlement is deleted, the app may be uninstalled from a user's device. As a best
 * practice, uninstall the app by calling  Installs.delete() before deleting the entitlement.
 *
 * Entitlements for apps that a user pays for on an unmanaged profile have "userPurchase" as the
 * entitlement reason. These entitlements cannot be removed via the API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Entitlement extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#entitlement".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The ID of the product that the entitlement is for. For example, "app:com.google.android.gm".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The reason for the entitlement. For example, "free" for free apps. This property is temporary:
   * it will be replaced by the acquisition kind field of group licenses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#entitlement".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#entitlement".
   * @param kind kind or {@code null} for none
   */
  public Entitlement setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The ID of the product that the entitlement is for. For example, "app:com.google.android.gm".
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The ID of the product that the entitlement is for. For example, "app:com.google.android.gm".
   * @param productId productId or {@code null} for none
   */
  public Entitlement setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The reason for the entitlement. For example, "free" for free apps. This property is temporary:
   * it will be replaced by the acquisition kind field of group licenses.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * The reason for the entitlement. For example, "free" for free apps. This property is temporary:
   * it will be replaced by the acquisition kind field of group licenses.
   * @param reason reason or {@code null} for none
   */
  public Entitlement setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public Entitlement set(String fieldName, Object value) {
    return (Entitlement) super.set(fieldName, value);
  }

  @Override
  public Entitlement clone() {
    return (Entitlement) super.clone();
  }

}