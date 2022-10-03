package com.solvd.hospital.contollers;

import com.solvd.hospital.dao.mysql.MedicalCardDao;
import com.solvd.hospital.services.mybatis.MedicalCardService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.sql.SQLException;
import java.util.List;

import com.solvd.hospital.dao.mysql.DoctorDao;
import com.solvd.hospital.models.Doctor;
import com.solvd.hospital.services.mybatis.UserService;
import com.solvd.hospital.сonnectionpool.ConnectionPool;
public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {
        /*
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        try {
            connectionPool.create();
            DoctorDao doctorDao = new DoctorDao();
            List<Doctor> doctors = doctorDao.getDoctors();
            for (Doctor doctor:doctors) {
                LOGGER.info(doctor.getSurname());
            }
        }
        catch (SQLException e) {
            LOGGER.error(e);
        }
        connectionPool.shutdown();
        UserService userService = new UserService();
        LOGGER.info(userService.getById(1).getName());
         */

        MedicalCardService medicalCardService = new MedicalCardService();
        LOGGER.info(medicalCardService.getById(1).getGender().getValue());
    }
}
