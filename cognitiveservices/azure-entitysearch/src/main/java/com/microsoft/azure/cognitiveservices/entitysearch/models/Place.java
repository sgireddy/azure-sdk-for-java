/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.cognitiveservices.entitysearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines information about a local entity, such as a restaurant or hotel.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("Place")
public class Place extends Thing {
    /**
     * The postal address of where the entity is located.
     */
    @JsonProperty(value = "address", access = JsonProperty.Access.WRITE_ONLY)
    private PostalAddress address;

    /**
     * The entity's telephone number.
     */
    @JsonProperty(value = "telephone", access = JsonProperty.Access.WRITE_ONLY)
    private String telephone;

    /**
     * Get the address value.
     *
     * @return the address value
     */
    public PostalAddress address() {
        return this.address;
    }

    /**
     * Get the telephone value.
     *
     * @return the telephone value
     */
    public String telephone() {
        return this.telephone;
    }

}
