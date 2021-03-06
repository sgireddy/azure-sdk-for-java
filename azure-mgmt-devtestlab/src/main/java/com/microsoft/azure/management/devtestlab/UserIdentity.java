/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identity attributes of a lab user.
 */
public class UserIdentity {
    /**
     * Set to the principal name / UPN of the client JWT making the request.
     */
    @JsonProperty(value = "principalName")
    private String principalName;

    /**
     * Set to the principal Id of the client JWT making the request. Service
     * principal will not have the principal Id.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /**
     * Set to the tenant ID of the client JWT making the request.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * Set to the object Id of the client JWT making the request. Not all users
     * have object Id. For CSP (reseller) scenarios for example, object Id is
     * not available.
     */
    @JsonProperty(value = "objectId")
    private String objectId;

    /**
     * Set to the app Id of the client JWT making the request.
     */
    @JsonProperty(value = "appId")
    private String appId;

    /**
     * Get the principalName value.
     *
     * @return the principalName value
     */
    public String principalName() {
        return this.principalName;
    }

    /**
     * Set the principalName value.
     *
     * @param principalName the principalName value to set
     * @return the UserIdentity object itself.
     */
    public UserIdentity withPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }

    /**
     * Get the principalId value.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId value.
     *
     * @param principalId the principalId value to set
     * @return the UserIdentity object itself.
     */
    public UserIdentity withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId value.
     *
     * @param tenantId the tenantId value to set
     * @return the UserIdentity object itself.
     */
    public UserIdentity withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the objectId value.
     *
     * @return the objectId value
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId value.
     *
     * @param objectId the objectId value to set
     * @return the UserIdentity object itself.
     */
    public UserIdentity withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the appId value.
     *
     * @return the appId value
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the appId value.
     *
     * @param appId the appId value to set
     * @return the UserIdentity object itself.
     */
    public UserIdentity withAppId(String appId) {
        this.appId = appId;
        return this;
    }

}
