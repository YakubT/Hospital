package com.solvd.hospital.jackson;

import com.solvd.hospital.models.classes.Allergy;
import com.solvd.hospital.models.classes.Experience;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ExperiencesJackson {

    private static final Logger LOGGER = LogManager.getLogger(ExperiencesJackson.class);

    public static List<Experience> getFromJson(String path){
        try {
            ObjectMapper om = new ObjectMapper();
            JavaType javaType = om.getTypeFactory().constructCollectionType(List.class, Experience.class);
            return om.readValue(new FileReader(path), javaType);
        }
        catch (JsonProcessingException e) {
            LOGGER.error(e);
        } catch (IOException e) {
            LOGGER.error(e);
        }
        return null;
    }
    public static void createJson(List<Experience> experiences,String path){
        try {
            ObjectMapper om = new ObjectMapper();
            om.writerWithDefaultPrettyPrinter().writeValue(new File(path), experiences);
        }
        catch (JsonProcessingException e) {
            LOGGER.error(e);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }

}
