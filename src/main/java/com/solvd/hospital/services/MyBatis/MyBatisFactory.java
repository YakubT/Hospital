package com.solvd.hospital.services.MyBatis;

import com.solvd.hospital.dao.IAllergyDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.IOException;
import java.io.Reader;

public class MyBatisFactory {

    private static final Logger LOGGER = LogManager.getLogger(MyBatisFactory.class);

    private static final MyBatisFactory daoFactory = new MyBatisFactory();

    private static final String resource = "mybatis/mybatis-config.xml";

    private static SqlSessionFactory sqlSessionFactory;

    private MyBatisFactory() {
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }
        catch (IOException e) {
            LOGGER.error(e);
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
