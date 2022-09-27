package com.solvd.hospital.contollers;

import com.solvd.hospital.dao.mysql.PatientDao;
import com.solvd.hospital.dao.mysql.UserDao;
import com.solvd.hospital.models.User;
import com.solvd.hospital.services.MyBatis.AllergyService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.IOException;
import java.sql.SQLException;

import com.solvd.hospital.dao.mysql.AllergyDao;
import com.solvd.hospital.models.Allergy;
import com.solvd.hospital.сonnectionpool.ConnectionPool;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {
        AllergyService allergyService = new AllergyService();
        Allergy allergy = new Allergy();
        allergy.setNameOfDrug("bo");
        allergy.setMedicalCardId(3);
        allergyService.create(allergy);
    }
}
