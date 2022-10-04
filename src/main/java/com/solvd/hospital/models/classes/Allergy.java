package com.solvd.hospital.models.classes;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement (name = "allergy")
@XmlType (propOrder = {"id","nameOfDrug","medicalCardId"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Allergy {

    @XmlAttribute
    private int id;

    @XmlElement (name = "nameOfDrug")
    private String nameOfDrug;

    @XmlElement (name = "medicalCardId")
    private int medicalCardId;

    public Allergy(){

    }

    public Allergy(int id, String nameOfDrug, int medicalCardId) {
        this.id = id;
        this.medicalCardId = medicalCardId;
        this.nameOfDrug = nameOfDrug;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfDrug() {
        return nameOfDrug;
    }

    public void setNameOfDrug(String nameOfDrug) {
        this.nameOfDrug = nameOfDrug;
    }

    public int getMedicalCardId() {
        return medicalCardId;
    }

    public void setMedicalCardId(int medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

}
