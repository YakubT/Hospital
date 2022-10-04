package com.solvd.hospital.models.classes;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.solvd.hospital.jaxb.adapters.BloodGroupAdapter;
import com.solvd.hospital.jaxb.adapters.DateAdapter;
import com.solvd.hospital.jaxb.adapters.GenderAdapter;
import com.solvd.hospital.models.enums.BloodGroup;
import com.solvd.hospital.models.enums.Gender;
import com.solvd.hospital.models.enums.Invalidity;



@XmlRootElement (name = "medical_card")
@XmlType (propOrder = {"id","patientId","dateOfBirth","gender","address","phoneNumber","invalidity","bloodGroup","diabetes",
        "hepatitis","doctorId"})
@XmlAccessorType(XmlAccessType.FIELD)

public class MedicalCard {
    @XmlAttribute
    private int id;

    @XmlElement
    private int patientId;

    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date dateOfBirth;

    @XmlJavaTypeAdapter(GenderAdapter.class)
    private Gender gender;

    @XmlElement
    private String address;

    @XmlElement
    private String phoneNumber;

    @XmlElement
    private Invalidity invalidity;

    @XmlJavaTypeAdapter(BloodGroupAdapter.class)
    private BloodGroup bloodGroup;

    @XmlElement
    private boolean diabetes;

    @XmlElement
    private boolean hepatitis;

    @XmlElement
    private int doctorId;

    @XmlTransient
    private List<MedCardInfDis> listOfTransferredInfections;

    @XmlTransient
    private  List<Allergy> listOfAllergies;

    @XmlTransient
    private List<Vaccination> listOfVaccinations;

    @XmlTransient
    private List<SickLeave> listOfSickLeaves;

    @XmlTransient
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