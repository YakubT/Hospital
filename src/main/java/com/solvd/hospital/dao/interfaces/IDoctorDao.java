package com.solvd.hospital.dao.interfaces;

import com.solvd.hospital.models.classes.Doctor;

import java.util.List;

public interface IDoctorDao extends IBaseDao<Doctor> {

    public List<Doctor> getDoctors();
}
