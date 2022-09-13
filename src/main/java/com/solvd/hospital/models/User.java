package com.solvd.hospital.models;

public  class User {

    private long id;

    private String login;

    private String password;

    private String name;

    private String middleName;

    private String surname;



    public User() {

    }

    public User(long id, String login, String password, String name, String middleName, String surname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
}
