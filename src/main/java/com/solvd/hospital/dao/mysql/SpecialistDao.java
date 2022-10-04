package com.solvd.hospital.dao.mysql;

import com.solvd.hospital.dao.interfaces.ISpecialistDao;
import com.solvd.hospital.dao.interfaces.IUserDao;
import com.solvd.hospital.models.classes.Specialist;
import com.solvd.hospital.сonnectionpool.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SpecialistDao extends AbstractMySqlDao implements ISpecialistDao {

    private static final Logger LOGGER = LogManager.getLogger(SpecialistDao.class);

    @Override
    public void create(Specialist object) {
        IUserDao userDao = new UserDao();
        userDao.create(object);
    }

    @Override
    public Specialist getById(int id) {
        String query = "Select users.id, login, password, name, surname, middle_name, experiences.id As expId role From Users" +
                " Left join experiences on specialist_id = users.id where users.id = ? and role = 4";
        Connection connection = ConnectionPool.getInstance().getConnection();
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            Specialist specialist = new Specialist();
            while (resultSet.next()) {
                specialist.setId(resultSet.getInt("id"));
                specialist.setId(resultSet.getInt("id"));
                specialist.setLogin(resultSet.getString("login"));
                specialist.setPassword(resultSet.getString("password"));
                specialist.setName(resultSet.getString("name"));
                specialist.setSurname(resultSet.getString("surname"));
                specialist.setMiddleName(resultSet.getString("middle_name"));
                specialist.setRole(resultSet.getInt("role"));
                specialist.setExperienceId(resultSet.getInt("expId"));
            }
        }
        catch (SQLException e){
            LOGGER.error(e);
        }
        return null;
    }

    @Override
    public void remove(int id) {
        IUserDao userDao = new UserDao();
        userDao.remove(id);
    }

    @Override
    public void update(Specialist object) {
        IUserDao userDao = new UserDao();
        userDao.update(object);
    }

   @Override
    public List<Specialist> getSpecialists() {
        List<Specialist> list = new ArrayList<>();
       String query = "Select users.id, login, password, name, surname, middle_name, experiences.id As expId role From Users" +
               " Left join experiences on specialist_id = users.id where role = 4";
       Connection connection = ConnectionPool.getInstance().getConnection();
       try (PreparedStatement ps = connection.prepareStatement(query)) {
           ResultSet resultSet = ps.executeQuery();

           while (resultSet.next()) {
               Specialist specialist = new Specialist();
               specialist.setId(resultSet.getInt("id"));
               specialist.setId(resultSet.getInt("id"));
               specialist.setLogin(resultSet.getString("login"));
               specialist.setPassword(resultSet.getString("password"));
               specialist.setName(resultSet.getString("name"));
               specialist.setSurname(resultSet.getString("surname"));
               specialist.setMiddleName(resultSet.getString("middle_name"));
               specialist.setRole(resultSet.getInt("role"));
               specialist.setExperienceId(resultSet.getInt("expId"));
               list.add(specialist);
           }
           return list;
       }
       catch (SQLException e){
           LOGGER.error(e);
       }
       return null;
   }
}
