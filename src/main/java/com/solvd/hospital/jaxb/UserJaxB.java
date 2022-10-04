package com.solvd.hospital.jaxb;

import com.solvd.hospital.models.classes.MedicalCard;
import com.solvd.hospital.models.classes.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UserJaxB {
    private static final Logger LOGGER = LogManager.getLogger(UserJaxB.class);

    public static User getFromXml(String path) {
        try {
            JAXBContext context = JAXBContext.newInstance(User.class);
            User user;
            try {
                user =(User) context.createUnmarshaller().unmarshal(new FileReader(path));
                return user;
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

    public static void createXml (User user, String path) {
        try {
            JAXBContext context = JAXBContext.newInstance(User.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(user, new File(path));
        }
        catch (JAXBException e) {
            LOGGER.error(e);
        }
    }
}
