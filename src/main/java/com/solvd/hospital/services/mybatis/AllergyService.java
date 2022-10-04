package com.solvd.hospital.services.mybatis;



import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.solvd.hospital.dao.interfaces.IAllergyDao;
import com.solvd.hospital.services.IAllergyService;
import com.solvd.hospital.services.mybatis.utility.MyBatisFactory;
import com.solvd.hospital.models.classes.Allergy;

public class AllergyService implements IAllergyService {

    private static final Logger LOGGER = LogManager.getLogger(AllergyService.class);

    private static final SqlSessionFactory sessionFactory = MyBatisFactory.getSqlSessionFactory();

    public void create(Allergy object) {
        SqlSession session = sessionFactory.openSession();
        IAllergyDao allergyDao = session.getMapper(IAllergyDao.class);
        allergyDao.create(object);
        session.commit();
        session.close();
    }
    public Allergy getById (int id) {
        SqlSession session = sessionFactory.openSession();
        IAllergyDao allergyDao = session.getMapper(IAllergyDao.class);
        Allergy allergy = allergyDao.getById(id);
        session.close();
        return allergy;
    }

    public void update (Allergy object) {
        SqlSession session = sessionFactory.openSession();
        IAllergyDao allergyDao = session.getMapper(IAllergyDao.class);
        allergyDao.update(object);
        session.commit();
        session.close();
    }

    public void remove (int id) {
        SqlSession session = sessionFactory.openSession();
        IAllergyDao allergyDao = session.getMapper(IAllergyDao.class);
        allergyDao.remove(id);
        session.commit();
        session.close();
    }

}
