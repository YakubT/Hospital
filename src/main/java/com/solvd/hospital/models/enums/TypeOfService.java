package com.solvd.hospital.models.enums;

public enum TypeOfService {

    PROCEDURE("Procedure"),

    APPOINTMENT("Appointment"),

    DIAGNOSTIC("Diagnostic");

    private final String value;

    TypeOfService(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
