package com.solvd.hospital.models.classes;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Specialist {

    private List<Integer> listOfMedicalCardsId = new ArrayList<>();

    private List<Integer> listOfMedicalFieldId = new ArrayList<>();

    public List<Integer> getListOfMedicalCards() {
        return listOfMedicalCardsId;
    }

    public void setListOfMedicalCards(List<Integer> listOfMedicalCardsId) {
        this.listOfMedicalCardsId = listOfMedicalCardsId;
    }

    public List<Integer> getListOfMedicalField() {
        return listOfMedicalFieldId;
    }

    public void setListOfMedicalField(List<Integer> listOfMedicalFieldId) {
        this.listOfMedicalFieldId = listOfMedicalFieldId;
    }
}
