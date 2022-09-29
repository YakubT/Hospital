package com.solvd.hospital.contollers;



import com.solvd.hospital.dao.IAllergyDao;
import com.solvd.hospital.dao.IMedicalCardDao;
import com.solvd.hospital.dao.IUserDao;
import com.solvd.hospital.dao.mysql.AllergyDao;
import com.solvd.hospital.dao.mysql.MedicalCardDao;
import com.solvd.hospital.dao.mysql.UserDao;
import com.solvd.hospital.models.MedicalCard;
import com.solvd.hospital.сonnectionpool.ConnectionPool;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.sql.SQLException;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try {
            connectionPool.create();
            IMedicalCardDao medicalCardDao = new MedicalCardDao();
            MedicalCard medicalCard = medicalCardDao.getById(1);
            LOGGER.info(medicalCard.getId());
            IUserDao userDao = new UserDao();
            LOGGER.info(userDao.getById(medicalCard.getPatientId()).getSurname());

        }
        catch (SQLException e) {
            LOGGER.error(e);
        }
        connectionPool.shutdown();
    }
}
