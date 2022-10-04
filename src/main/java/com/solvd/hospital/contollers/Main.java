package com.solvd.hospital.contollers;

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
    }
}
