package com.solvd.hospital.contollers;

import com.solvd.hospital.models.classes.Experience;
import com.solvd.hospital.services.mybatis.ExperienceService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.solvd.hospital.services.mybatis.UserService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {
        UserService userService = new UserService();
        LOGGER.info(userService.getUsers().size());
        ExperienceService experienceService = new ExperienceService();
        LOGGER.info(experienceService.getById(1).getDescription());
    }
}
