package com.solvd.hospital.models;

import java.util.List;

public class Doctor extends User {

    List<MedicalCard> listOfMedicalCards;

    public Doctor() {

    }

    public Doctor (List<MedicalCard> listOfMedicalCards) {
        this.listOfMedicalCards = listOfMedicalCards;
    }

    public List<MedicalCard> getListOfMedicalCards() {
        return listOfMedicalCards;
    }

    public void setListOfMedicalCards(List<MedicalCard> listOfMedicalCards) {
        this.listOfMedicalCards = listOfMedicalCards;
    }
}
