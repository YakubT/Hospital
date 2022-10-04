package com.solvd.hospital.dao.interfaces;

import com.solvd.hospital.models.classes.Patient;

import java.util.List;

public interface IPatientDao extends IBaseDao<Patient> {

    public List<Patient> getPatients();
}
