package com.solvd.hospital.models;

import java.util.Date;

public class Vaccination {

    private long id;

    private String name;

    private Date date;

    private long medicalCardId;

    private String negativeManifestation;

    public Vaccination() {

    }

    public Vaccination (long id, String name, Date date, long medicalCardId, String negativeManifestation) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.medicalCardId = medicalCardId;
        this.negativeManifestation = negativeManifestation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getMedicalCardId() {
        return medicalCardId;
    }

    public void setMedicalCardId(long medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

    public String getNegativeManifestation() {
        return negativeManifestation;
    }

    public void setNegativeManifestation(String negativeManifestation) {
        this.negativeManifestation = negativeManifestation;
    }
}
