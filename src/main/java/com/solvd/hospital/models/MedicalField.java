package com.solvd.hospital.models;

import java.util.List;

public class MedicalField {

    private int id;

    private String name;

    private List<Doctor> listOfDoctors;

    public MedicalField() {

    }

    public MedicalField(int id, String name, List<Doctor> listOfDoctors) {
        this.id = id;
        this.name = name;
        this.listOfDoctors = listOfDoctors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Doctor> getListOfDoctors() {
        return listOfDoctors;
    }

    public void setListOfDoctors(List<Doctor> listOfDoctors) {
        this.listOfDoctors = listOfDoctors;
    }
}
