package com.solvd.hospital.models;

import java.util.Date;

public class Prescribing {

    private int id;

    private int medicalCardId;

    private int doctorId;

    private Date date;

    private String complaints;

    private String diagnosis;

    private String treatment;

    private String additional_observation;

    public Prescribing() {

    }

    public Prescribing(int id, int medicalCardId, int doctorId, Date date, String complaints, String treatment, String
                       additional_observation) {
        this.id = id;
        this.medicalCardId = medicalCardId;
        this.doctorId = doctorId;
        this.date = date;
        this.complaints = complaints;
        this.treatment = treatment;
        this.additional_observation = additional_observation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMedicalCardId() {
        return medicalCardId;
    }

    public void setMedicalCardId(int medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getAdditional_observation() {
        return additional_observation;
    }

    public void setAdditional_observation(String additional_observation) {
        this.additional_observation = additional_observation;
    }
}
