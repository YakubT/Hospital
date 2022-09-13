package com.solvd.hospital.models;

public class SpecializationOfDoctor {

    private long id;

    private long medicalFieldId;

    private long doctorId;

    public SpecializationOfDoctor() {

    }

    public SpecializationOfDoctor(long id, long medicalFieldId, long doctorId) {
        this.id = id;
        this.medicalFieldId = medicalFieldId;
        this.doctorId = doctorId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMedicalFieldId() {
        return medicalFieldId;
    }

    public void setMedicalFieldId(long medicalFieldId) {
        this.medicalFieldId = medicalFieldId;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }
}
