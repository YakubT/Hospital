package com.solvd.hospital.models;

import java.util.List;

public class Doctor extends Specialist {

    private List<MedicalCard> listOfMedicalCards;

    private List<MedicalField> listOfMedicalField;

    public Doctor() {
        super();
    }

    public Doctor (List<MedicalCard> listOfMedicalCards, List<MedicalField> listOfMedicalField) {
        super();
        this.listOfMedicalCards = listOfMedicalCards;
        this.listOfMedicalField = listOfMedicalField;
    }

    public List<MedicalCard> getListOfMedicalCards() {
        return listOfMedicalCards;
    }

    public void setListOfMedicalCards(List<MedicalCard> listOfMedicalCards) {
        this.listOfMedicalCards = listOfMedicalCards;
    }

    public List<MedicalField> getListOfMedicalField() {
        return listOfMedicalField;
    }

    public void setListOfMedicalField(List<MedicalField> listOfMedicalField) {
        this.listOfMedicalField = listOfMedicalField;
    }
}
