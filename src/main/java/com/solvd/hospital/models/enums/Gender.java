package com.solvd.hospital.models.enums;

public enum Gender {

    MALE("Male"),

    FEMALE("Female");

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Gender findByValue (String value) {
        for (Gender gender:Gender.values()){
            if (gender.getValue().equals(value))
                return gender;
        }
        return null;
    }
}
