package com.solvd.hospital.models;

public class MedCardInfDis {

    private long id;

    private long medicalCardsId;

    private long infectionDiseaseID;

    MedCardInfDis() {

    }

    MedCardInfDis(long id, long medicalCardsId, long infectionDiseaseID) {
        this.id = id;
        this.medicalCardsId = medicalCardsId;
        this.infectionDiseaseID = infectionDiseaseID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMedicalCardsId() {
        return medicalCardsId;
    }

    public void setMedicalCardsId(long medicalCardsId) {
        this.medicalCardsId = medicalCardsId;
    }

    public long getInfectionDiseaseID() {
        return infectionDiseaseID;
    }

    public void setInfectionDiseaseID(long infectionDiseaseID) {
        this.infectionDiseaseID = infectionDiseaseID;
    }
}
