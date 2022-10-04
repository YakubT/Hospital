package com.solvd.hospital.models.classes;

import java.util.Date;

public class Record {

    private int id;

    private int patientId;

    private int serviceId;

    private Date date;

    private int specialistId;

    public Record(int id, int patientId, int serviceId, Date date, int specialistId) {
        this.id = id;
        this.patientId = patientId;
        this.serviceId = serviceId;
        this.date = date;
        this.specialistId = specialistId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSpecialistId() {
        return specialistId;
    }

    public void setSpecialistId(int specialistId) {
        this.specialistId = specialistId;
    }
}
