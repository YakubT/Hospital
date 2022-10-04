package com.solvd.hospital.contollers;

import com.solvd.hospital.jaxb.AllergyJaxB;
import com.solvd.hospital.jaxb.MedicalCardJaxB;
import com.solvd.hospital.jaxb.UserJaxB;
import com.solvd.hospital.models.classes.Allergy;
import com.solvd.hospital.models.classes.Experience;
import com.solvd.hospital.models.classes.MedicalCard;
import com.solvd.hospital.models.classes.User;
import com.solvd.hospital.services.mybatis.AllergyService;
import com.solvd.hospital.services.mybatis.ExperienceService;
import com.solvd.hospital.services.mybatis.MedicalCardService;
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
        Allergy allergy = AllergyJaxB.getFromXml("./src/main/resources/jaxb/allergy.xml");
        LOGGER.info(allergy.getNameOfDrug());
        UserService userService = new UserService();
        User user = userService.getById(10);
        UserJaxB.createXml(user,"./src/main/resources/jaxb/user.xml");
    }
}
