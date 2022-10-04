package com.solvd.hospital.models.classes;

public class Patient extends User {

    private int medicalCardId;

    public int getMedicalCardId() {
        return medicalCardId;
    }

    public void setMedicalCardId(int medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

}
