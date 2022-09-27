package com.solvd.hospital.dao;

import com.solvd.hospital.models.Doctor;

import java.util.List;

public interface IDoctorDao extends IBaseDao<Doctor> {

    public List<Doctor> getDoctors();
}
