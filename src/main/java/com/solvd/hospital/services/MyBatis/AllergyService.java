package com.solvd.hospital.services.MyBatis;

import com.solvd.hospital.dao.IAllergyDao;
import com.solvd.hospital.dao.mysql.AllergyDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.Reader;

import com.solvd.hospital.models.Allergy;


public class AllergyService {

    private static final Logger LOGGER = LogManager.getLogger(AllergyService.class);
    private static final String resource = "mybatis-config.xml";

    public void create(Allergy object) {
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlSessionFactory.openSession();
            IAllergyDao allergyDao = session.getMapper(IAllergyDao.class);
            allergyDao.create(object);
            session.commit();
            session.close();
            reader.close();
        }
        catch (IOException e) {
            LOGGER.error(e);
        }
    }
    public void getById (int id) {

    }
}
