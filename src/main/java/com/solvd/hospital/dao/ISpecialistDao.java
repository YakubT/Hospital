package com.solvd.hospital.dao;

import com.solvd.hospital.models.Specialist;

import java.util.List;

public interface ISpecialistDao extends IBaseDao<Specialist> {
    public List<Specialist> getSpecialists();
}
