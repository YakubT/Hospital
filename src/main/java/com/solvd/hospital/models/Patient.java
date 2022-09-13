package com.solvd.hospital.models;

import java.util.List;

public class Patient extends User {

    private MedicalCard medicalCard;

    public MedicalCard getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(MedicalCard medicalCard) {
        this.medicalCard = medicalCard;
    }

}
