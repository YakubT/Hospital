package com.solvd.hospital.models;

public class Experience {

    private long id;

    private String description;

    private int countYears;

    private int specialistId;

    public Experience() {

    }

    public Experience(long id, String description, int countYears, int specialistId) {
        this.id = id;
        this.description = description;
        this.countYears = countYears;
        this.specialistId = specialistId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
