package com.solvd.hospital.services.mybatis;

import com.solvd.hospital.dao.interfaces.IAllergyDao;
import com.solvd.hospital.dao.interfaces.IExperienceDao;
import com.solvd.hospital.models.classes.Experience;
import com.solvd.hospital.services.IExperienceServer;
import com.solvd.hospital.services.mybatis.utility.MyBatisFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExperienceService implements IExperienceServer {

    private static final Logger LOGGER = LogManager.getLogger(ExperienceService.class);

    private static final SqlSessionFactory sessionFactory = MyBatisFactory.getSqlSessionFactory();

    @Override
    public void create(Experience object) {
        SqlSession session = sessionFactory.openSession();
        IExperienceDao experienceDao = session.getMapper(IExperienceDao.class);
        experienceDao.create(object);
        session.commit();
        session.close();
    }

    @Override
    public Experience getById(int id) {
        SqlSession session = sessionFactory.openSession();
        IExperienceDao experienceDao = session.getMapper(IExperienceDao.class);
        Experience experience = experienceDao.getById(id);
        session.close();
        return experience;
    }

    @Override
    public void remove(int id) {
        SqlSession session = sessionFactory.openSession();
        IExperienceDao experienceDao = session.getMapper(IExperienceDao.class);
        experienceDao.remove(id);
        session.commit();
        session.close();
    }

    @Override
    public void update(Experience object) {
        SqlSession session = sessionFactory.openSession();
        IExperienceDao experienceDao = session.getMapper(IExperienceDao.class);
        experienceDao.update(object);
        session.commit();
        session.close();
    }
}
