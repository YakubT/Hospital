package com.solvd.hospital.contollers;



import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


import com.solvd.hospital.services.mybatis.AllergyService;
public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {
        AllergyService allergyService = new AllergyService();
        LOGGER.info(allergyService.getById(1).getNameOfDrug());
    }
}
