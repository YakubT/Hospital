package com.solvd.hospital.models;

import java.util.Date;
import java.util.List;


import com.solvd.hospital.models.enums.BloodGroup;
import com.solvd.hospital.models.enums.Gender;
import com.solvd.hospital.models.enums.Invalidity;

public class MedicalCard {

    private int id;

    private int patientId;

    private Date dateOfBirth;

    private Gender gender;

    private String address;

    private String phoneNumber;

    private Invalidity invalidity;

    private BloodGroup bloodGroup;

    private boolean diabetes;

    private boolean hepatitis;

    private int doctorId;

    private List<MedCardInfDis> listOfTransferredInfections;

    private  List<Allergy> listOfAllergies;

    private List<Vaccination> listOfVaccinations;

    private List<SickLeave> listOfSickLeaves;

    private List<Prescribing> listOfPrescribings;

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

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public List<MedCardInfDis> getListOfTransferredInfections() {
        return listOfTransferredInfections;
    }

    public void setListOfTransferredInfections(List<MedCardInfDis> listOfTransferredInfections) {
        this.listOfTransferredInfections = listOfTransferredInfections;
    }

    public List<Allergy> getListOfAllergies() {
        return listOfAllergies;
    }

    public void setListOfAllergies(List<Allergy> listOfAllergies) {
        this.listOfAllergies = listOfAllergies;
    }

    public List<Vaccination> getListOfVaccinations() {
        return listOfVaccinations;
    }

    public void setListOfVaccinations(List<Vaccination> listOfVaccinations) {
        this.listOfVaccinations = listOfVaccinations;
    }

    public List<SickLeave> getListOfSickLeaves() {
        return listOfSickLeaves;
    }

    public void setListOfSickLeaves(List<SickLeave> listOfSickLeaves) {
        this.listOfSickLeaves = listOfSickLeaves;
    }

    public List<Prescribing> getListOfPrescribings() {
        return listOfPrescribings;
    }

    public void setListOfPrescribings(List<Prescribing> listOfPrescribings) {
        this.listOfPrescribings = listOfPrescribings;
    }

}