package com.solvd.hospital.models;

public class SpecializationOfDoctor {

    private int id;

    private int medicalFieldId;

    private int doctorId;

    public SpecializationOfDoctor() {

    }

    public SpecializationOfDoctor(int id, int medicalFieldId, int doctorId) {
        this.id = id;
        this.medicalFieldId = medicalFieldId;
        this.doctorId = doctorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMedicalFieldId() {
        return medicalFieldId;
    }

    public void setMedicalFieldId(int medicalFieldId) {
        this.medicalFieldId = medicalFieldId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
}
