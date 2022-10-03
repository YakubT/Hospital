package com.solvd.hospital.contollers;



import com.solvd.hospital.dao.IAllergyDao;
import com.solvd.hospital.dao.IMedicalCardDao;
import com.solvd.hospital.dao.IUserDao;
import com.solvd.hospital.dao.mysql.AllergyDao;
import com.solvd.hospital.dao.mysql.DoctorDao;
import com.solvd.hospital.dao.mysql.MedicalCardDao;
import com.solvd.hospital.dao.mysql.UserDao;
import com.solvd.hospital.models.Doctor;
import com.solvd.hospital.models.MedicalCard;
import com.solvd.hospital.сonnectionpool.ConnectionPool;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.print.Doc;
import java.sql.SQLException;
import java.util.List;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {
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
    }
}
