package com.solvd.hospital.models;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.solvd.hospital.models.enums.BloodGroup;
import com.solvd.hospital.models.enums.Gender;
import com.solvd.hospital.models.enums.Invalidity;

public class MedicalCard {

    private long id;

    private long patientId;

    private Date dateOfBirth;

    private Gender gender;

    private String address;

    private String phoneNumber;

    private Invalidity invalidity;

    private BloodGroup bloodGroup;

    private boolean diabetes;

    private boolean hepatitis;

    private long doctorId;

    private List<Map.Entry <InfectionDisease,Date> > listOfTransferredInfections;

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Invalidity getInvalidity() {
        return invalidity;
    }

    public void setInvalidity(Invalidity invalidity) {
        this.invalidity = invalidity;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isHepatitis() {
        return hepatitis;
    }

    public void setHepatitis(boolean hepatitis) {
        this.hepatitis = hepatitis;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }

    public List<Map.Entry<InfectionDisease, Date>> getListOfTransferredInfections() {
        return listOfTransferredInfections;
    }

    public void setListOfTransferredInfections(List<Map.Entry<InfectionDisease, Date>> listOfTransferredInfections) {
        this.listOfTransferredInfections = listOfTransferredInfections;
    }
}
