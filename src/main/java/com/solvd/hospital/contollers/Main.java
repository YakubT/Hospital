package com.solvd.hospital.contollers;

import com.solvd.hospital.jackson.AllergyJackson;
import com.solvd.hospital.jackson.ExperiencesJackson;
import com.solvd.hospital.jackson.UserJackson;
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
        /*

        User user = userService.getById(10);
        UserJaxB.createXml(user,"./src/main/resources/jaxb/user.xml");
         */
        /*
        MedicalCard medicalCard = MedicalCardJaxB.getFromXml("./src/main/resources/jaxb/MedicalCard.xml");
        LOGGER.info(medicalCard.getAddress());
        User user = UserJaxB.getFromXml("./src/main/resources/jaxb/user.xml");
        LOGGER.info(user.getSurname());
        AllergyService allergyService = new AllergyService();
        List<Allergy> list = new ArrayList<>();
        list.add(allergy);
        LOGGER.info(AllergyJackson.getFromJson("./src/main/resources/jackson/allergy.json").get(0).getNameOfDrug());
        UserService userService = new UserService();
        user = userService.getById(14);
        List<User> listUsers = new ArrayList<>();
        listUsers.add(user);
        UserJackson.createJson(listUsers,"./src/main/resources/jackson/users.json");
         */
        /*
        ExperienceService experienceService = new ExperienceService();
        Experience experience = experienceService.getById(2);
        List<Experience> experiences = new ArrayList<Experience>();
        experiences.add(experience);
        */
       Experience experience =  ExperiencesJackson.getFromJson("./src/main/resources/jackson/experience.json").get(0);
       LOGGER.info(experience.getDescription());

    }
}
