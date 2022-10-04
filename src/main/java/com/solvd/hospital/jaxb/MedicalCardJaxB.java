package com.solvd.hospital.jaxb;

import com.solvd.hospital.models.classes.Allergy;
import com.solvd.hospital.models.classes.MedicalCard;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MedicalCardJaxB {
    private static final Logger LOGGER = LogManager.getLogger(MedicalCardJaxB.class);

    public static MedicalCard getAllergyFromXml(String path) {
        try {
            JAXBContext context = JAXBContext.newInstance(MedicalCardJaxB.class);
            MedicalCard medicalCard;
            try {
                medicalCard =(MedicalCard) context.createUnmarshaller().unmarshal(new FileReader(path));
                return medicalCard;
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

    public static void createXml (MedicalCard medicalCard, String path) {
        try {
            JAXBContext context = JAXBContext.newInstance(MedicalCard.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(medicalCard, new File(path));
        }
        catch (JAXBException e) {
            LOGGER.error(e);
        }
    }
}
