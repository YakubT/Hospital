package com.solvd.hospital.contollers;

import com.solvd.hospital.dao.mysql.UserDao;
import com.solvd.hospital.models.classes.MedicalCard;
import com.solvd.hospital.models.classes.User;
import com.solvd.hospital.services.mybatis.MedicalCardService;
import com.solvd.hospital.services.mybatis.UserService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

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
        
    }
}
