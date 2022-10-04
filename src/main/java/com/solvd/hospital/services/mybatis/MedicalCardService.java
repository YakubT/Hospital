package com.solvd.hospital.services.mybatis;

import com.solvd.hospital.dao.interfaces.IMedicalCardDao;
import com.solvd.hospital.dao.mysql.MedicalCardDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.solvd.hospital.models.classes.MedicalCard;
import com.solvd.hospital.services.IMedicalCardService;
import com.solvd.hospital.services.mybatis.utility.MyBatisFactory;

public class MedicalCardService implements IMedicalCardService {

    private static final Logger LOGGER = LogManager.getLogger(UserService.class);

    private static final SqlSessionFactory sessionFactory = MyBatisFactory.getSqlSessionFactory();
    @Override
    public void create(MedicalCard object) {
        SqlSession session = sessionFactory.openSession();
        IMedicalCardDao medicalCardDao = session.getMapper(IMedicalCardDao.class);
        medicalCardDao.create(object);
        session.commit();
        session.close();
    }

    @Override
    public MedicalCard getById(int id) {
        SqlSession session = sessionFactory.openSession();
        IMedicalCardDao medicalCardDao = session.getMapper(IMedicalCardDao.class);
        MedicalCard medicalCard = medicalCardDao.getById(id);
        session.close();
        return medicalCard;
    }

    @Override
    public void remove(int id) {
        SqlSession session = sessionFactory.openSession();
        IMedicalCardDao medicalCardDao = session.getMapper(IMedicalCardDao.class);
        medicalCardDao.remove(id);
        session.commit();
        session.close();
    }

    @Override
    public void update(MedicalCard object) {
        SqlSession session = sessionFactory.openSession();
        IMedicalCardDao medicalCardDao = session.getMapper(IMedicalCardDao.class);
        medicalCardDao.update(object);
        session.commit();
        session.close();
    }
}
