package com.solvd.hospital.contollers;

import com.solvd.hospital.jaxb.AllergyJaxB;
import com.solvd.hospital.models.classes.Allergy;
import com.solvd.hospital.models.classes.Experience;
import com.solvd.hospital.services.mybatis.AllergyService;
import com.solvd.hospital.services.mybatis.ExperienceService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.solvd.hospital.services.mybatis.UserService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {
        /*
        AllergyService allergyService = new AllergyService();
        Allergy allergy = allergyService.getById(1);
        LOGGER.info(allergy.getId());
        AllergyJaxB.createXml(allergy,"./src/main/resources/jaxb/allergy.xml");
         */
        Allergy allergy = AllergyJaxB.getAllergyFromXml("./src/main/resources/jaxb/allergy.xml");
        LOGGER.info(allergy.getNameOfDrug());
    }
}
