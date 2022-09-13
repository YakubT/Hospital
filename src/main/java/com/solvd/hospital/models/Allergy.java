package com.solvd.hospital.models;

public class Allergy {

    private long id;

    private long medicalCardId;

    private long infectionDiseasesID;

    public Allergy(){

    }

    public Allergy(long id, long medicalCardId, long infectionDiseasesID) {
        this.id = id;
        this.medicalCardId = medicalCardId;
        this.infectionDiseasesID = infectionDiseasesID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMedicalCardId() {
        return medicalCardId;
    }

    public void setMedicalCardId(long medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

    public long getInfectionDiseasesID() {
        return infectionDiseasesID;
    }

    public void setInfectionDiseasesID(long infectionDiseasesID) {
        this.infectionDiseasesID = infectionDiseasesID;
    }
}
