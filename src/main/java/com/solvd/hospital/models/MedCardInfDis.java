package com.solvd.hospital.models;

import java.util.Date;

public class MedCardInfDis {

    private long id;

    private long medicalCardsId;

    private long infectionDiseaseID;

    private Date date;

    public MedCardInfDis() {

    }

    public MedCardInfDis(long id, long medicalCardsId, long infectionDiseaseID, Date date) {
        this.id = id;
        this.medicalCardsId = medicalCardsId;
        this.infectionDiseaseID = infectionDiseaseID;
        this.date = date;
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

    public Date getDate(){
        return  date;
    }

    public void setDate(Date date){
        this.date =date;
    }

}
