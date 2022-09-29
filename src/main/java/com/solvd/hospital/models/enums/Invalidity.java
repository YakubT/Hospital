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

    public static Invalidity findByValue (String value) {
        for (Invalidity invalidity:Invalidity.values()){
            if (invalidity.getValue().equals(value))
                return invalidity;
        }
        return null;
    }
}
