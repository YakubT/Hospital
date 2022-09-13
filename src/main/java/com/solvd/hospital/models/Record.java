package com.solvd.hospital.models;

import java.util.Date;

public class Record {

    private long id;

    private long patientId;

    private long serviceId;

    private Date date;

    private long specialistId;

    public Record(long id, long patientId, long serviceId, Date date, long specialistId) {
        this.id = id;
        this.patientId = patientId;
        this.serviceId = serviceId;
        this.date = date;
        this.specialistId = specialistId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getSpecialistId() {
        return specialistId;
    }

    public void setSpecialistId(long specialistId) {
        this.specialistId = specialistId;
    }
}
