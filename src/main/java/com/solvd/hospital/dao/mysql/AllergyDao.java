package com.solvd.hospital.dao.mysql;

import java.sql.Connection;

import com.solvd.hospital.dao.IAllergyDao;
import com.solvd.hospital.сonnectionpool.ConnectionPool;
import com.solvd.hospital.models.Allergy;


public class AllergyDao extends AbstractMySqlDao implements IAllergyDao {

    @Override
    public void create(Allergy object) {
        Connection connection = ConnectionPool.getInstance().getConnection();

    }

    @Override
    public Allergy getById(int id) {
        return  null;
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void update(Allergy object) {

    }
}
