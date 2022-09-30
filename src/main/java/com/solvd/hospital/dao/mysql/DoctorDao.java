package com.solvd.hospital.dao.mysql;

import com.solvd.hospital.dao.IDoctorDao;
import com.solvd.hospital.dao.IUserDao;
import com.solvd.hospital.models.Doctor;
import com.solvd.hospital.models.Experience;
import com.solvd.hospital.сonnectionpool.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DoctorDao extends AbstractMySqlDao implements IDoctorDao {

    @Override
    public void create(Doctor object) {
        IUserDao userDao = new UserDao();
        userDao.create(object);
    }

    @Override
    public Doctor getById(int id) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "Select users.id, login, password, name, surname, middle_name, role, experiences.id As " +
                "expId, medical_cards.id as MedId From Users Left join experiences on " +
                "specialist_id = users.id  Left join medical_cards on " +
                "medical_cards.doctor_id = users.id  where users.id = ? and role = 1";
        try (PreparedStatement ps = connection.prepareStatement("query")) {
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            Experience experience = new Experience();
            
            while (rs.next()) {
                experience.setId(rs.getInt("id"));
                experience.setDescription(rs.getString("description"));
                experience.setCountYears(rs.getInt("count_years"));
                experience.setSpecialistId(rs.getInt("specialist_id"));
            }
            rs.close();
            return experience;
        }
        catch (SQLException e){
            LOGGER.error(e);
        }
        finally {
            ConnectionPool.getInstance().releaseConnection(connection);
        }
        return null;
    }

    @Override
    public void remove(int id) {
        IUserDao userDao = new UserDao();
        userDao.remove(id);
    }

    @Override
    public void update(Doctor object) {
        IUserDao userDao = new UserDao();
        userDao.update(object);
    }

    @Override
    public List<Doctor> getDoctors() {
        return null;
    }
}
