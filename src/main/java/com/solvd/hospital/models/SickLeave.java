package com.solvd.hospital.models;

import java.util.Date;

public class SickLeave {

    private long id;

    private long medicalCardId;

    private long doctorId;

    private Date from;

    private Date to;

    private String diagnosisCode;

    private String placeOfDepartment;

    public SickLeave() {

    }

    public SickLeave (long id, long medicalCardId, long doctorId, Date from, Date to, String diagnosisCode,
                      String placeOfDepartment) {
        this.id = id;
        this.medicalCardId = medicalCardId;
        this.doctorId = doctorId;
        this.from  = from;
        this.to = to;
        this.diagnosisCode = diagnosisCode;
        this.placeOfDepartment = placeOfDepartment;
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

    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public String getPlaceOfDepartment() {
        return placeOfDepartment;
    }

    public void setPlaceOfDepartment(String placeOfDepartment) {
        this.placeOfDepartment = placeOfDepartment;
    }
}
