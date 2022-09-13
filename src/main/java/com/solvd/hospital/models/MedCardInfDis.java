package com.solvd.hospital.models;

import java.util.Date;

public class MedCardInfDis {

    private int id;

    private int medicalCardsId;

    private int infectionDiseaseID;

    private Date date;

    public MedCardInfDis() {

    }

    public MedCardInfDis(int id, int medicalCardsId, int infectionDiseaseID, Date date) {
        this.id = id;
        this.medicalCardsId = medicalCardsId;
        this.infectionDiseaseID = infectionDiseaseID;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMedicalCardsId() {
        return medicalCardsId;
    }

    public void setMedicalCardsId(int medicalCardsId) {
        this.medicalCardsId = medicalCardsId;
    }

    public int getInfectionDiseaseID() {
        return infectionDiseaseID;
    }

    public void setInfectionDiseaseID(int infectionDiseaseID) {
        this.infectionDiseaseID = infectionDiseaseID;
    }

    public Date getDate(){
        return  date;
    }

    public void setDate(Date date){
        this.date =date;
    }

}
