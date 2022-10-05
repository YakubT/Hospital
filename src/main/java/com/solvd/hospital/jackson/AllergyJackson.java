package com.solvd.hospital.jackson;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;

import com.solvd.hospital.models.classes.Allergy;
public class AllergyJackson {
    private static final Logger LOGGER = LogManager.getLogger(AllergyJackson.class);

    public static List<Allergy> getFromJson(String path){
        try {
            ObjectMapper om = new ObjectMapper();
            JavaType javaType = om.getTypeFactory().constructCollectionType(List.class, Allergy.class);
            return om.readValue(new FileReader(path), javaType);
        }
        catch (JsonProcessingException e) {
            LOGGER.error(e);
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return null;
    }
    public static void createJson(List<Allergy> allergies,String path){
        try {
            ObjectMapper om = new ObjectMapper();
            om.writerWithDefaultPrettyPrinter().writeValue(new File(path), allergies);
        }
        catch (JsonProcessingException e) {
            LOGGER.error(e);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
}
