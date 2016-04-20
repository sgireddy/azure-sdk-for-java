/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for StatusLevelTypes.
 */
public enum StatusLevelTypes {
    /** Enum value Info. */
    INFO("Info"),

    /** Enum value Warning. */
    WARNING("Warning"),

    /** Enum value Error. */
    ERROR("Error");

    /** The actual serialized value for a StatusLevelTypes instance. */
    private String value;

    StatusLevelTypes(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a StatusLevelTypes instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a StatusLevelTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed StatusLevelTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static StatusLevelTypes fromValue(String value) {
        StatusLevelTypes[] items = StatusLevelTypes.values();
        for (StatusLevelTypes item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return toValue();
    }
}