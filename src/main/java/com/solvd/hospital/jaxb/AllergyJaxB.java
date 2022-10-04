package com.solvd.hospital.jaxb;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.solvd.hospital.models.classes.Allergy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AllergyJaxB {

    private static final Logger LOGGER = LogManager.getLogger(AllergyJaxB.class);

    public static Allergy getAllergyFromXml(String path) {
        try {
            JAXBContext context = JAXBContext.newInstance(Allergy.class);
            Allergy allergy;
            try {
                allergy =(Allergy)context.createUnmarshaller().unmarshal(new FileReader(path));
                return  allergy;
            }
            catch (FileNotFoundException e) {
                LOGGER.error(e);
            }
        }
        catch (JAXBException e) {
            LOGGER.error(e);
        }
        return null;
    }

    public static void createXml (Allergy allergy, String path) {
        try {
            JAXBContext context = JAXBContext.newInstance(Allergy.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(allergy, new File(path));
        }
        catch (JAXBException e) {
            LOGGER.error(e);
        }
    }

}
