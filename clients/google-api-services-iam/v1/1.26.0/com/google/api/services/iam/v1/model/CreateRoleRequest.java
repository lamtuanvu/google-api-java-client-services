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

package com.google.api.services.iam.v1.model;

/**
 * The request to create a new role.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateRoleRequest extends com.google.api.client.json.GenericJson {

  /**
   * The Role resource to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Role role;

  /**
   * The role id to use for this role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String roleId;

  /**
   * The Role resource to create.
   * @return value or {@code null} for none
   */
  public Role getRole() {
    return role;
  }

  /**
   * The Role resource to create.
   * @param role role or {@code null} for none
   */
  public CreateRoleRequest setRole(Role role) {
    this.role = role;
    return this;
  }

  /**
   * The role id to use for this role.
   * @return value or {@code null} for none
   */
  public java.lang.String getRoleId() {
    return roleId;
  }

  /**
   * The role id to use for this role.
   * @param roleId roleId or {@code null} for none
   */
  public CreateRoleRequest setRoleId(java.lang.String roleId) {
    this.roleId = roleId;
    return this;
  }

  @Override
  public CreateRoleRequest set(String fieldName, Object value) {
    return (CreateRoleRequest) super.set(fieldName, value);
  }

  @Override
  public CreateRoleRequest clone() {
    return (CreateRoleRequest) super.clone();
  }

}