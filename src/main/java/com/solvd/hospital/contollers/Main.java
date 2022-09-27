package com.solvd.hospital.contollers;

import com.solvd.hospital.dao.mysql.PatientDao;
import com.solvd.hospital.dao.mysql.UserDao;
import com.solvd.hospital.models.User;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.sql.SQLException;

import com.solvd.hospital.dao.mysql.AllergyDao;
import com.solvd.hospital.models.Allergy;
import com.solvd.hospital.сonnectionpool.ConnectionPool;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {
        UserDao userDao = new UserDao();
        try {
            ConnectionPool connectionPool = ConnectionPool.getInstance();
            connectionPool.create();
            PatientDao patientDao = new PatientDao();
            LOGGER.info(patientDao.getPatients().get(0).getName());
        }
        catch (SQLException e) {
            LOGGER.error(e);
        }
        ConnectionPool.getInstance().shutdown();
    }
}
