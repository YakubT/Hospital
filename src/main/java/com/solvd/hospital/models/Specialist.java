package com.solvd.hospital.models;

public class Specialist extends User {

    private Experience experience;
    
    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }
}
