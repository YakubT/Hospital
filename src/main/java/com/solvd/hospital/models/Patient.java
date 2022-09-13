package com.solvd.hospital.models;

public class Patient extends User {

    private MedicalCard medicalCard;

    public Patient() {

    }

    public Patient (MedicalCard medicalCard) {
        this.medicalCard = medicalCard;
    }

    public MedicalCard getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(MedicalCard medicalCard) {
        this.medicalCard = medicalCard;
    }
}
