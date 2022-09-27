package com.solvd.hospital.models;

import java.util.List;

public  class User {

    private int id;

    private String login;

    private String password;

    private String name;

    private String middleName;

    private String surname;

    private List<Record> listOfRecords;

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

    public List<Record> getListOfRecords() {
        return listOfRecords;
    }

    public void setListOfRecords(List<Record> listOfRecords) {
        this.listOfRecords = listOfRecords;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
