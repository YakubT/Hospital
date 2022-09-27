package com.solvd.hospital.dao;

import com.solvd.hospital.models.Patient;

import java.util.List;

public interface IPatientDao extends IBaseDao<Patient> {

    public List<Patient> getPatients();
}
