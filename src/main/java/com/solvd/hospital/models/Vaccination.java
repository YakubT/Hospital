package com.solvd.hospital.models;

import java.util.Date;

public class Vaccination {

    private int id;

    private String name;

    private Date date;

    private int medicalCardId;

    private String negativeManifestation;

    public Vaccination() {

    }

    public Vaccination (int id, String name, Date date, int medicalCardId, String negativeManifestation) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.medicalCardId = medicalCardId;
        this.negativeManifestation = negativeManifestation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getMedicalCardId() {
        return medicalCardId;
    }

    public void setMedicalCardId(int medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

    public String getNegativeManifestation() {
        return negativeManifestation;
    }

    public void setNegativeManifestation(String negativeManifestation) {
        this.negativeManifestation = negativeManifestation;
    }
}
