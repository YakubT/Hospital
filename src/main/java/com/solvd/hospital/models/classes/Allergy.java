package com.solvd.hospital.models.classes;

import org.apache.ibatis.annotations.ResultType;

public class Allergy {

    private int id;

    private String nameOfDrug;
    
    private int medicalCardId;

    public Allergy(){

    }

    public Allergy(int id, String nameOfDrug, int medicalCardId) {
        this.id = id;
        this.medicalCardId = medicalCardId;
        this.nameOfDrug = nameOfDrug;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfDrug() {
        return nameOfDrug;
    }

    public void setNameOfDrug(String nameOfDrug) {
        this.nameOfDrug = nameOfDrug;
    }

    public int getMedicalCardId() {
        return medicalCardId;
    }

    public void setMedicalCardId(int medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

}
