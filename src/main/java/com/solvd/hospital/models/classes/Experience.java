package com.solvd.hospital.models.classes;

import org.codehaus.jackson.annotate.JsonProperty;

public class Experience {
    @JsonProperty
    private int id;
    @JsonProperty
    private String description;
    @JsonProperty
    private int countYears;

    @JsonProperty
    private int specialistId;

    public Experience() {

    }

    public Experience(int id, String description, int countYears, int specialistId) {
        this.id = id;
        this.description = description;
        this.countYears = countYears;
        this.specialistId = specialistId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCountYears() {
        return countYears;
    }

    public void setCountYears(int countYears) {
        this.countYears = countYears;
    }

    public int getSpecialistId() {
        return specialistId;
    }

    public void setSpecialistId(int specialistId) {
        this.specialistId = specialistId;
    }
}
