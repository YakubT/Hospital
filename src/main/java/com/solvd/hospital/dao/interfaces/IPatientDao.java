package com.solvd.hospital.dao.interfaces;

import com.solvd.hospital.dao.interfaces.IBaseDao;
import com.solvd.hospital.models.Patient;

import java.util.List;

public interface IPatientDao extends IBaseDao<Patient> {

    public List<Patient> getPatients();
}
