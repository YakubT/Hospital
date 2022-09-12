package com.solvd.hospital.models.enums;

public enum Invalidity {

    NONE("NONE"),

    FIRST_GROUP("|"),

    SECOND_GROUP("||"),

    THIRD_GROUP("|||");

    private final String value;

    Invalidity(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
