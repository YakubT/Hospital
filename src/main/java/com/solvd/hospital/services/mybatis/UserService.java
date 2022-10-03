package com.solvd.hospital.services.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.hospital.dao.IUserDao;
import com.solvd.hospital.models.User;
import com.solvd.hospital.services.IUserService;
import com.solvd.hospital.services.mybatis.utility.MyBatisFactory;


public class UserService implements IUserService {

    private static final Logger LOGGER = LogManager.getLogger(AllergyService.class);

    private static final SqlSessionFactory sessionFactory = MyBatisFactory.getSqlSessionFactory();

    @Override
    public void create(User object) {
        SqlSession session = sessionFactory.openSession();
        IUserDao userDaoDao = session.getMapper(IUserDao.class);
        userDaoDao.create(object);
        session.commit();
        session.close();
    }

    @Override
    public User getById(int id) {
        SqlSession session = sessionFactory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        User user = userDao.getById(id);
        session.close();
        return user;
    }

    @Override
    public void remove(int id) {
        SqlSession session = sessionFactory.openSession();
        IUserDao userDao= session.getMapper(IUserDao.class);
        userDao.remove(id);
        session.commit();
        session.close();
    }

    @Override
    public void update(User object) {
        SqlSession session = sessionFactory.openSession();
        IUserDao userDao= session.getMapper(IUserDao.class);
        userDao.update(object);
        session.commit();
        session.close();
    }
}
