package com.solvd.hospital.contollers;

import com.solvd.hospital.dao.mysql.AllergyDao;
import com.solvd.hospital.models.Allergy;
import com.solvd.hospital.сonnectionpool.ConnectionPool;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.sql.SQLException;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {
        AllergyDao allergyDao = new AllergyDao();
        try {
            ConnectionPool.getInstance().create();
            Allergy allergy = allergyDao.getById(1);
            LOGGER.info(allergy.getId());
            LOGGER.info(allergy.getMedicalCardId());
            LOGGER.info(allergy.getNameOfDrug());
            ConnectionPool.getInstance().shutdown();
        }
        catch (SQLException e) {
            LOGGER.error(e);
        }
    }
}
