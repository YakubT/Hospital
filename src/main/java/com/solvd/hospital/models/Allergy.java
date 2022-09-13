package com.solvd.hospital.models;

public class Allergy {

    private long id;

    private String nameOfDrug;
    private long medicalCardId;

    public Allergy(){

    }

    public Allergy(long id, String nameOfDrug, long medicalCardId) {
        this.id = id;
        this.medicalCardId = medicalCardId;
        this.nameOfDrug = nameOfDrug;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameOfDrug() {
        return nameOfDrug;
    }

    public void setNameOfDrug(String nameOfDrug) {
        this.nameOfDrug = nameOfDrug;
    }

    public long getMedicalCardId() {
        return medicalCardId;
    }

    public void setMedicalCardId(long medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

}
