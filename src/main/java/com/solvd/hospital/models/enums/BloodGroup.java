package com.solvd.hospital.models.enums;

public enum BloodGroup {

    FIRST_PLUS("1+"),

    FIRST_MINUS("1-"),

    SECOND_PLUS("2+"),

    SECOND_MINUS("2-"),

    THIRD_PLUS("3+"),

    THIRD_MINUS("3-"),

    FOURTH_PLUS("4+"),

    FOURTH_MINUS("4-");

    private final String value;

    BloodGroup(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static BloodGroup findByValue (String value) {
        for (BloodGroup el:BloodGroup.values()){
            if (el.getValue().equals(value))
                return el;
        }
        return null;
    }
}
