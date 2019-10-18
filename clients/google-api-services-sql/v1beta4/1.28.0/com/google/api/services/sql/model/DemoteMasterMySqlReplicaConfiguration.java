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

package com.google.api.services.sql.model;

/**
 * Read-replica configuration specific to MySQL databases.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DemoteMasterMySqlReplicaConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * PEM representation of the trusted CA's x509 certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String caCertificate;

  /**
   * PEM representation of the slave's x509 certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientCertificate;

  /**
   * PEM representation of the slave's private key. The corresponsing public key is encoded in the
   * client's certificate. The format of the slave's private key can be either PKCS #1 or PKCS #8.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientKey;

  /**
   * This is always sql#demoteMasterMysqlReplicaConfiguration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The password for the replication connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * The username for the replication connection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * PEM representation of the trusted CA's x509 certificate.
   * @return value or {@code null} for none
   */
  public java.lang.String getCaCertificate() {
    return caCertificate;
  }

  /**
   * PEM representation of the trusted CA's x509 certificate.
   * @param caCertificate caCertificate or {@code null} for none
   */
  public DemoteMasterMySqlReplicaConfiguration setCaCertificate(java.lang.String caCertificate) {
    this.caCertificate = caCertificate;
    return this;
  }

  /**
   * PEM representation of the slave's x509 certificate.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientCertificate() {
    return clientCertificate;
  }

  /**
   * PEM representation of the slave's x509 certificate.
   * @param clientCertificate clientCertificate or {@code null} for none
   */
  public DemoteMasterMySqlReplicaConfiguration setClientCertificate(java.lang.String clientCertificate) {
    this.clientCertificate = clientCertificate;
    return this;
  }

  /**
   * PEM representation of the slave's private key. The corresponsing public key is encoded in the
   * client's certificate. The format of the slave's private key can be either PKCS #1 or PKCS #8.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientKey() {
    return clientKey;
  }

  /**
   * PEM representation of the slave's private key. The corresponsing public key is encoded in the
   * client's certificate. The format of the slave's private key can be either PKCS #1 or PKCS #8.
   * @param clientKey clientKey or {@code null} for none
   */
  public DemoteMasterMySqlReplicaConfiguration setClientKey(java.lang.String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

  /**
   * This is always sql#demoteMasterMysqlReplicaConfiguration.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#demoteMasterMysqlReplicaConfiguration.
   * @param kind kind or {@code null} for none
   */
  public DemoteMasterMySqlReplicaConfiguration setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The password for the replication connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * The password for the replication connection.
   * @param password password or {@code null} for none
   */
  public DemoteMasterMySqlReplicaConfiguration setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * The username for the replication connection.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * The username for the replication connection.
   * @param username username or {@code null} for none
   */
  public DemoteMasterMySqlReplicaConfiguration setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public DemoteMasterMySqlReplicaConfiguration set(String fieldName, Object value) {
    return (DemoteMasterMySqlReplicaConfiguration) super.set(fieldName, value);
  }

  @Override
  public DemoteMasterMySqlReplicaConfiguration clone() {
    return (DemoteMasterMySqlReplicaConfiguration) super.clone();
  }

}
