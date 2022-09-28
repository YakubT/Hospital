package com.solvd.hospital.contollers;



import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


import com.solvd.hospital.services.mybatis.AllergyService;
public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {
        AllergyService allergyService = new AllergyService();
        allergyService.remove(5);
        allergyService.remove(7);
        allergyService.remove(8);
        allergyService.remove(9);
        allergyService.remove(10);
    }
}
