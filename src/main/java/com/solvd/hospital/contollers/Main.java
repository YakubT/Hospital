package com.solvd.hospital.contollers;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.sql.SQLException;

import com.solvd.hospital.dao.mysql.AllergyDao;
import com.solvd.hospital.models.Allergy;
import com.solvd.hospital.сonnectionpool.ConnectionPool;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {
        AllergyDao allergyDao = new AllergyDao();
        try {
            ConnectionPool.getInstance().create();
            Allergy allergy = new Allergy(2,"Decatelen",3);
            allergyDao.update(allergy);
            Allergy allergy2 = allergyDao.getById(2);
            LOGGER.info(allergy2.getId());
            LOGGER.info(allergy2.getMedicalCardId());
            LOGGER.info(allergy2.getNameOfDrug());
        }
        catch (SQLException e) {
            LOGGER.error(e);
        }
        ConnectionPool.getInstance().shutdown();
    }
}
