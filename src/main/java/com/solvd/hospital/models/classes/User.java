package com.solvd.hospital.models.classes;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "user")
@XmlType(propOrder = {"id","login","password","name","middleName","surname","role"})
@XmlAccessorType(XmlAccessType.FIELD)
public  class User {
    @XmlAttribute
    @JsonProperty
    private int id;

    @XmlElement (name = "login")
    @JsonProperty
    private String login;

    @XmlElement (name = "password")
    @JsonProperty
    private String password;

    @XmlElement (name = "name")
    @JsonProperty
    private String name;

    @XmlElement (name = "middleName")
    private String middleName;

    @XmlElement (name = "surname")
    @JsonProperty
    private String surname;

    @XmlTransient
    @JsonProperty
    private List<Integer> listOfRecordsId;

    @XmlElement
    @JsonProperty
    private int role;

    public User() {

    }

    public User(int id, String login, String password, String name, String middleName, String surname, int role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return  login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return  surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Integer> getListOfRecordsId() {
        return listOfRecordsId;
    }

    public void setListOfRecords(List<Integer> listOfRecordsId) {
        this.listOfRecordsId = listOfRecordsId;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
